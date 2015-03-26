/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.Entities;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import Reika.DragonAPI.Base.ParticleEntity;
import Reika.DragonAPI.Libraries.Java.ReikaRandomHelper;
import Reika.DragonAPI.Libraries.Registry.ReikaItemHelper;
import Reika.ReactorCraft.Auxiliary.NeutronBlock;
import Reika.ReactorCraft.Auxiliary.RadiationEffects;
import Reika.ReactorCraft.Auxiliary.ReactorCoreTE;
import Reika.ReactorCraft.Registry.FluoriteTypes;
import Reika.ReactorCraft.Registry.MatBlocks;
import Reika.ReactorCraft.Registry.ReactorBlocks;
import Reika.RotaryCraft.Auxiliary.ItemStacks;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityNeutron extends ParticleEntity implements IEntityAdditionalSpawnData {

	private NeutronType type;

	public EntityNeutron(World world, int x, int y, int z, ForgeDirection f, NeutronType type) {
		super(world);
		this.setLocationAndAngles(x+0.5, y+0.5, z+0.5, 0, 0);
		motionX = f.offsetX*this.getSpeed();
		motionY = f.offsetY*this.getSpeed();
		motionZ = f.offsetZ*this.getSpeed();
		oldBlockX = x;
		oldBlockY = y;
		oldBlockZ = z;
		height = 1;
		this.type = type;
	}

	public EntityNeutron(World par1World) {
		super(par1World);
	}

	@Override
	public void applyEntityCollision(Entity e)
	{
		if (ReikaRandomHelper.doWithChance(12.5)) {
			if (e instanceof EntityLivingBase) {
				RadiationEffects.instance.applyPulseEffects((EntityLivingBase)e);
				this.setDead();
			}
		}
	}

	@Override
	public boolean onEnterBlock(World world, int x, int y, int z) {
		oldBlockX = x;
		oldBlockY = y;
		oldBlockZ = z;

		Block id = world.getBlock(x, y, z);
		int meta = world.getBlockMetadata(x, y, z);

		if (id != Blocks.air) {
			if (id.hasTileEntity(meta)) {
				TileEntity te = world.getTileEntity(x, y, z);
				if (te instanceof ReactorCoreTE) {
					return ((ReactorCoreTE)te).onNeutron(this, world, x, y, z);
				}
			}
			else if (id instanceof NeutronBlock) {
				return ((NeutronBlock)id).onNeutron(this, world, x, y, z);
			}

			if (ReikaItemHelper.matchStacks(ItemStacks.steelblock, new ItemStack(id, 1, meta))) {
				return ReikaRandomHelper.doWithChance(90);
			}
			else if (ReikaItemHelper.matchStacks(ItemStacks.bedingotblock, new ItemStack(id, 1, meta))) {
				return ReikaRandomHelper.doWithChance(97.5);
			}
			else if (id == ReactorBlocks.MATS.getBlockInstance() && meta == MatBlocks.CONCRETE.ordinal()) {
				return ReikaRandomHelper.doWithChance(60);
			}
			else if ((id == ReactorBlocks.FLUORITE.getBlockInstance() || id == ReactorBlocks.FLUORITEORE.getBlockInstance()) && meta < FluoriteTypes.colorList.length) {
				world.setBlock(x, y, z, id, meta+8, 3);
				world.func_147479_m(x, y, z);
			}
			if (id == Blocks.flowing_water || id == Blocks.water)
				return ReikaRandomHelper.doWithChance(30);

			boolean flag = id.isOpaqueCube() ? id.getExplosionResistance(null, world, x, y, z, x, y, z) >= 12 || ReikaRandomHelper.getSafeRandomInt((int)(12 - id.getExplosionResistance(null, world, x, y, z, x, y, z))) == 0 : 256-id.getLightOpacity(world, x, y, z) == 0 ? ReikaRandomHelper.getSafeRandomInt(id.getLightOpacity(world, x, y, z)) > 0 : rand.nextInt(1000) == 0;
			if (flag) {
				if (ReikaRandomHelper.doWithChance(20)) {
					//AxisAlignedBB box = ReikaAABBHelper.getBlockAABB(x, y, z).expand(8, 8, 8);
					//List inbox = world.getEntitiesWithinAABB(EntityRadiation.class, box);
					//if (inbox.size() < 10)
					//	RadiationEffects.contaminateArea(world, x, y, z, 1);
				}
				if (ReikaRandomHelper.doWithChance(20))
					RadiationEffects.instance.transformBlock(world, x, y, z);
			}
			return flag;
		}

		return rand.nextInt(1000) == 0;
	}

	@Override
	public double getSpeed() {
		return 0.75;
	}

	@Override
	protected void onTick() {

	}

	@Override
	public double getHitboxSize() {
		return 0.1;
	}

	@Override
	public boolean despawnOverTime() {
		return true;
	}

	@Override
	public void writeSpawnData(ByteBuf data) {
		data.writeInt(type.ordinal());
	}

	@Override
	public void readSpawnData(ByteBuf data) {
		type = NeutronType.neutronList[data.readInt()];
	}

	public NeutronType getType() {
		return type != null ? type : NeutronType.NULL;
	}

	public static enum NeutronType {
		NULL(),
		DECAY(),
		FISSION(),
		BREEDER(),
		FUSION(),
		WASTE();

		public static final NeutronType[] neutronList = values();

		public int getBoilerAbsorptionChance() {
			return this == BREEDER ? 80 : 0;
		}

		public int getSodiumBoilerAbsorptionChance() {
			return this != BREEDER ? 90 : 0;
		}

		public boolean canTriggerFuelConversion() {
			return this == BREEDER;
		}

		public boolean dealsDamage() {
			return this != NULL;
		}

		public boolean stoppedByWater() {
			return this != FUSION;
		}

		public boolean canIrradiateLiquids() {
			return this == FISSION || this == FUSION || this == BREEDER;
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound NBT) {
		type = NeutronType.neutronList[NBT.getInteger("ntype")];
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound NBT) {
		NBT.setInteger("ntype", this.getType().ordinal());
	}

}
