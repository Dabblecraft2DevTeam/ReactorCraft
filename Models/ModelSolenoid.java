/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 09/02/2014 12:42:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

public class ModelSolenoid extends RotaryModelBase
{
	//fields
	LODModelPart Shape3;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape1h;
	LODModelPart Shape1i;
	LODModelPart Shape1j;
	LODModelPart Shape1k;
	LODModelPart Shape1l;
	LODModelPart Shape4;
	LODModelPart Shape1n;
	LODModelPart Shape1o;

	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2d;
	LODModelPart Shape2g;
	LODModelPart Shape2h;
	LODModelPart Shape2i;
	LODModelPart Shape2j;
	LODModelPart Shape2k;
	LODModelPart Shape2l;
	LODModelPart Shape2m;
	LODModelPart Shape2n;
	LODModelPart Shape2o;
	LODModelPart Shape2p;
	LODModelPart Shape2q;
	LODModelPart Shape2r;
	LODModelPart Shape2s;
	LODModelPart Shape2t;
	LODModelPart Shape2u;
	LODModelPart Shape2v;
	LODModelPart Shape2w;
	LODModelPart Shape2x;
	LODModelPart Shape2y;
	LODModelPart Shape2z;
	LODModelPart Shape2aa;
	LODModelPart Shape2ab;
	LODModelPart Shape2ac;
	LODModelPart Shape2ad;
	LODModelPart Shape2ae;
	LODModelPart Shape2af;
	LODModelPart Shape2ag;
	LODModelPart Shape2ah;
	LODModelPart Shape2ai;
	LODModelPart Shape2aj;
	LODModelPart Shape2ak;
	LODModelPart Shape2al;
	LODModelPart Shape2am;
	LODModelPart Shape2an;
	LODModelPart Shape2ao;
	LODModelPart Shape2ap;
	LODModelPart Shape2aq;
	LODModelPart Shape2ar;
	LODModelPart Shape2as;
	LODModelPart Shape2at;
	LODModelPart Shape2au;
	LODModelPart Shape2av;
	LODModelPart Shape2aw;
	LODModelPart Shape2ax;

	LODModelPart Shape1z;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape3f;
	LODModelPart Shape3g;
	LODModelPart Shape1m;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape4d;
	LODModelPart Shape4e;
	LODModelPart Shape4f;
	LODModelPart Shape4g;
	LODModelPart Shape4h;
	LODModelPart Shape3h;
	LODModelPart Shape4i;
	LODModelPart Shape3i;
	LODModelPart Shape4j;
	LODModelPart Shape3j;
	LODModelPart Shape4k;
	LODModelPart Shape3k;
	LODModelPart Shape4l;
	LODModelPart Shape3l;
	LODModelPart Shape4m;
	LODModelPart Shape3m;
	LODModelPart Shape4n;
	LODModelPart Shape3n;
	LODModelPart Shape4o;
	LODModelPart Shape3o;
	LODModelPart Shape6g;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape6f;
	LODModelPart Shape6a;
	LODModelPart Shape6b;
	LODModelPart Shape6;
	LODModelPart Shape6c;
	LODModelPart Shape6d;
	LODModelPart Shape6e;
	LODModelPart Shape8;
	LODModelPart Shape8a;
	LODModelPart Shape8b;
	LODModelPart Shape8c;

	public ModelSolenoid()
	{
		textureWidth = 256;
		textureHeight = 256;

		Shape3 = new LODModelPart(this, 0, 18);
		Shape3.addBox(-27F, 0F, -128.5F, 52, 16, 1);
		Shape3.setRotationPoint(0F, 24F, 0F);
		Shape3.setTextureSize(256, 256);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, -2.391101F, 0F);
		Shape1a = new LODModelPart(this, 0, 18);
		Shape1a.addBox(-27F, 0F, -128.5F, 52, 16, 1);
		Shape1a.setRotationPoint(0F, 8F, 0F);
		Shape1a.setTextureSize(256, 256);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, -2.391101F, 0F);
		Shape1b = new LODModelPart(this, 0, 18);
		Shape1b.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1b.setRotationPoint(0F, 8F, 0F);
		Shape1b.setTextureSize(256, 256);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, -2.7838F, 0F);
		Shape1c = new LODModelPart(this, 0, 0);
		Shape1c.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape1c.setRotationPoint(0F, 8F, 0F);
		Shape1c.setTextureSize(256, 256);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 1.570796F, 0F);
		Shape1d = new LODModelPart(this, 0, 0);
		Shape1d.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape1d.setRotationPoint(0F, 8F, 0F);
		Shape1d.setTextureSize(256, 256);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 2.356194F, 0F);
		Shape1e = new LODModelPart(this, 0, 0);
		Shape1e.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape1e.setRotationPoint(0F, 8F, 0F);
		Shape1e.setTextureSize(256, 256);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0F, 0F);
		Shape1f = new LODModelPart(this, 0, 18);
		Shape1f.addBox(-25F, 0F, -128.5F, 52, 16, 1);
		Shape1f.setRotationPoint(0F, 8F, 0F);
		Shape1f.setTextureSize(256, 256);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, -0.7853982F, 0F);
		Shape1g = new LODModelPart(this, 0, 0);
		Shape1g.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape1g.setRotationPoint(0F, 8F, 0F);
		Shape1g.setTextureSize(256, 256);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, -1.58825F, 0F);
		Shape1h = new LODModelPart(this, 0, 0);
		Shape1h.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape1h.setRotationPoint(0F, 8F, 0F);
		Shape1h.setTextureSize(256, 256);
		Shape1h.mirror = true;
		this.setRotation(Shape1h, 0F, 0.7853982F, 0F);
		Shape1i = new LODModelPart(this, 0, 18);
		Shape1i.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1i.setRotationPoint(0F, 8F, 0F);
		Shape1i.setTextureSize(256, 256);
		Shape1i.mirror = true;
		this.setRotation(Shape1i, 0F, 0.3926991F, 0F);
		Shape1j = new LODModelPart(this, 0, 18);
		Shape1j.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1j.setRotationPoint(0F, 8F, 0F);
		Shape1j.setTextureSize(256, 256);
		Shape1j.mirror = true;
		this.setRotation(Shape1j, 0F, 1.178097F, 0F);
		Shape1k = new LODModelPart(this, 0, 18);
		Shape1k.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1k.setRotationPoint(0F, 8F, 0F);
		Shape1k.setTextureSize(256, 256);
		Shape1k.mirror = true;
		this.setRotation(Shape1k, 0F, 1.963495F, 0F);
		Shape1l = new LODModelPart(this, 0, 18);
		Shape1l.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1l.setRotationPoint(0F, 8F, 0F);
		Shape1l.setTextureSize(256, 256);
		Shape1l.mirror = true;
		this.setRotation(Shape1l, 0F, 2.748893F, 0F);
		Shape4 = new LODModelPart(this, 0, 18);
		Shape4.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4.setRotationPoint(0F, 24F, 0F);
		Shape4.setTextureSize(256, 256);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, -1.980949F, 0F);
		Shape1n = new LODModelPart(this, 0, 18);
		Shape1n.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1n.setRotationPoint(0F, 8F, 0F);
		Shape1n.setTextureSize(256, 256);
		Shape1n.mirror = true;
		this.setRotation(Shape1n, 0F, -1.19555F, 0F);
		Shape1o = new LODModelPart(this, 0, 18);
		Shape1o.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1o.setRotationPoint(0F, 8F, 0F);
		Shape1o.setTextureSize(256, 256);
		Shape1o.mirror = true;
		this.setRotation(Shape1o, 0F, -1.980949F, 0F);
		Shape2 = new LODModelPart(this, 0, 44);
		Shape2.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2.setRotationPoint(0F, 19F, 0F);
		Shape2.setTextureSize(256, 256);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, -2.7838F, 0F);
		Shape2a = new LODModelPart(this, 0, 37);
		Shape2a.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2a.setRotationPoint(0F, 22F, 0F);
		Shape2a.setTextureSize(256, 256);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 40);
		Shape2b.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2b.setRotationPoint(0F, 11F, 0F);
		Shape2b.setTextureSize(256, 256);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, -2.7838F, 0F);
		Shape2d = new LODModelPart(this, 0, 37);
		Shape2d.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2d.setRotationPoint(0F, 22F, 0F);
		Shape2d.setTextureSize(256, 256);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 3.141593F, 0F);
		Shape2g = new LODModelPart(this, 0, 37);
		Shape2g.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2g.setRotationPoint(0F, 22F, 0F);
		Shape2g.setTextureSize(256, 256);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0.3926991F, 0F);
		Shape2h = new LODModelPart(this, 0, 37);
		Shape2h.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2h.setRotationPoint(0F, 22F, 0F);
		Shape2h.setTextureSize(256, 256);
		Shape2h.mirror = true;
		this.setRotation(Shape2h, 0F, 0.7853982F, 0F);
		Shape2i = new LODModelPart(this, 0, 37);
		Shape2i.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2i.setRotationPoint(0F, 22F, 0F);
		Shape2i.setTextureSize(256, 256);
		Shape2i.mirror = true;
		this.setRotation(Shape2i, 0F, 1.178097F, 0F);
		Shape2j = new LODModelPart(this, 0, 37);
		Shape2j.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2j.setRotationPoint(0F, 22F, 0F);
		Shape2j.setTextureSize(256, 256);
		Shape2j.mirror = true;
		this.setRotation(Shape2j, 0F, 1.570796F, 0F);
		Shape2k = new LODModelPart(this, 0, 37);
		Shape2k.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2k.setRotationPoint(0F, 22F, 0F);
		Shape2k.setTextureSize(256, 256);
		Shape2k.mirror = true;
		this.setRotation(Shape2k, 0F, 1.963495F, 0F);
		Shape2l = new LODModelPart(this, 0, 37);
		Shape2l.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2l.setRotationPoint(0F, 22F, 0F);
		Shape2l.setTextureSize(256, 256);
		Shape2l.mirror = true;
		this.setRotation(Shape2l, 0F, 2.356194F, 0F);
		Shape2m = new LODModelPart(this, 0, 37);
		Shape2m.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2m.setRotationPoint(0F, 22F, 0F);
		Shape2m.setTextureSize(256, 256);
		Shape2m.mirror = true;
		this.setRotation(Shape2m, 0F, 2.748893F, 0F);
		Shape2n = new LODModelPart(this, 0, 37);
		Shape2n.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2n.setRotationPoint(0F, 22F, 0F);
		Shape2n.setTextureSize(256, 256);
		Shape2n.mirror = true;
		this.setRotation(Shape2n, 0F, -0.3926991F, 0F);
		Shape2o = new LODModelPart(this, 0, 37);
		Shape2o.addBox(-25.5F, 0F, -129.5F, 53, 1, 1);
		Shape2o.setRotationPoint(0F, 22F, 0F);
		Shape2o.setTextureSize(256, 256);
		Shape2o.mirror = true;
		this.setRotation(Shape2o, 0F, -0.7853982F, 0F);
		Shape2p = new LODModelPart(this, 0, 37);
		Shape2p.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2p.setRotationPoint(0F, 22F, 0F);
		Shape2p.setTextureSize(256, 256);
		Shape2p.mirror = true;
		this.setRotation(Shape2p, 0F, -1.19555F, 0F);
		Shape2q = new LODModelPart(this, 0, 37);
		Shape2q.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2q.setRotationPoint(0F, 22F, 0F);
		Shape2q.setTextureSize(256, 256);
		Shape2q.mirror = true;
		this.setRotation(Shape2q, 0F, -1.58825F, 0F);
		Shape2r = new LODModelPart(this, 0, 37);
		Shape2r.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2r.setRotationPoint(0F, 22F, 0F);
		Shape2r.setTextureSize(256, 256);
		Shape2r.mirror = true;
		this.setRotation(Shape2r, 0F, -1.980949F, 0F);
		Shape2s = new LODModelPart(this, 0, 37);
		Shape2s.addBox(-27.5F, 0F, -129.5F, 53, 1, 1);
		Shape2s.setRotationPoint(0F, 22F, 0F);
		Shape2s.setTextureSize(256, 256);
		Shape2s.mirror = true;
		this.setRotation(Shape2s, 0F, -2.391101F, 0F);
		Shape2t = new LODModelPart(this, 0, 37);
		Shape2t.addBox(-26F, 0F, -129.5F, 52, 1, 1);
		Shape2t.setRotationPoint(0F, 22F, 0F);
		Shape2t.setTextureSize(256, 256);
		Shape2t.mirror = true;
		this.setRotation(Shape2t, 0F, -2.7838F, 0F);
		Shape2u = new LODModelPart(this, 0, 40);
		Shape2u.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2u.setRotationPoint(0F, 11F, 0F);
		Shape2u.setTextureSize(256, 256);
		Shape2u.mirror = true;
		this.setRotation(Shape2u, 0F, 0F, 0F);
		Shape2v = new LODModelPart(this, 0, 40);
		Shape2v.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2v.setRotationPoint(0F, 11F, 0F);
		Shape2v.setTextureSize(256, 256);
		Shape2v.mirror = true;
		this.setRotation(Shape2v, 0F, 0.3926991F, 0F);
		Shape2w = new LODModelPart(this, 0, 40);
		Shape2w.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2w.setRotationPoint(0F, 11F, 0F);
		Shape2w.setTextureSize(256, 256);
		Shape2w.mirror = true;
		this.setRotation(Shape2w, 0F, 0.7853982F, 0F);
		Shape2x = new LODModelPart(this, 0, 40);
		Shape2x.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2x.setRotationPoint(0F, 11F, 0F);
		Shape2x.setTextureSize(256, 256);
		Shape2x.mirror = true;
		this.setRotation(Shape2x, 0F, 1.178097F, 0F);
		Shape2y = new LODModelPart(this, 0, 40);
		Shape2y.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2y.setRotationPoint(0F, 11F, 0F);
		Shape2y.setTextureSize(256, 256);
		Shape2y.mirror = true;
		this.setRotation(Shape2y, 0F, 1.570796F, 0F);
		Shape2z = new LODModelPart(this, 0, 40);
		Shape2z.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2z.setRotationPoint(0F, 11F, 0F);
		Shape2z.setTextureSize(256, 256);
		Shape2z.mirror = true;
		this.setRotation(Shape2z, 0F, 1.963495F, 0F);
		Shape2aa = new LODModelPart(this, 0, 40);
		Shape2aa.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2aa.setRotationPoint(0F, 11F, 0F);
		Shape2aa.setTextureSize(256, 256);
		Shape2aa.mirror = true;
		this.setRotation(Shape2aa, 0F, 2.356194F, 0F);
		Shape2ab = new LODModelPart(this, 0, 40);
		Shape2ab.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ab.setRotationPoint(0F, 11F, 0F);
		Shape2ab.setTextureSize(256, 256);
		Shape2ab.mirror = true;
		this.setRotation(Shape2ab, 0F, 2.748893F, 0F);
		Shape2ac = new LODModelPart(this, 0, 40);
		Shape2ac.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ac.setRotationPoint(0F, 11F, 0F);
		Shape2ac.setTextureSize(256, 256);
		Shape2ac.mirror = true;
		this.setRotation(Shape2ac, 0F, 3.141593F, 0F);
		Shape2ad = new LODModelPart(this, 0, 40);
		Shape2ad.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ad.setRotationPoint(0F, 11F, 0F);
		Shape2ad.setTextureSize(256, 256);
		Shape2ad.mirror = true;
		this.setRotation(Shape2ad, 0F, -0.3926991F, 0F);
		Shape2ae = new LODModelPart(this, 0, 40);
		Shape2ae.addBox(-25.5F, 0F, -129.5F, 53, 2, 1);
		Shape2ae.setRotationPoint(0F, 11F, 0F);
		Shape2ae.setTextureSize(256, 256);
		Shape2ae.mirror = true;
		this.setRotation(Shape2ae, 0F, -0.7853982F, 0F);
		Shape2af = new LODModelPart(this, 0, 40);
		Shape2af.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2af.setRotationPoint(0F, 11F, 0F);
		Shape2af.setTextureSize(256, 256);
		Shape2af.mirror = true;
		this.setRotation(Shape2af, 0F, -1.19555F, 0F);
		Shape2ag = new LODModelPart(this, 0, 40);
		Shape2ag.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ag.setRotationPoint(0F, 11F, 0F);
		Shape2ag.setTextureSize(256, 256);
		Shape2ag.mirror = true;
		this.setRotation(Shape2ag, 0F, -1.58825F, 0F);
		Shape2ah = new LODModelPart(this, 0, 40);
		Shape2ah.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ah.setRotationPoint(0F, 11F, 0F);
		Shape2ah.setTextureSize(256, 256);
		Shape2ah.mirror = true;
		this.setRotation(Shape2ah, 0F, -1.980949F, 0F);
		Shape2ai = new LODModelPart(this, 0, 40);
		Shape2ai.addBox(-27.5F, 0F, -129.5F, 53, 2, 1);
		Shape2ai.setRotationPoint(0F, 11F, 0F);
		Shape2ai.setTextureSize(256, 256);
		Shape2ai.mirror = true;
		this.setRotation(Shape2ai, 0F, -2.391101F, 0F);
		Shape2aj = new LODModelPart(this, 0, 44);
		Shape2aj.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2aj.setRotationPoint(0F, 19F, 0F);
		Shape2aj.setTextureSize(256, 256);
		Shape2aj.mirror = true;
		this.setRotation(Shape2aj, 0F, 0F, 0F);
		Shape2ak = new LODModelPart(this, 0, 44);
		Shape2ak.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ak.setRotationPoint(0F, 19F, 0F);
		Shape2ak.setTextureSize(256, 256);
		Shape2ak.mirror = true;
		this.setRotation(Shape2ak, 0F, 0.3926991F, 0F);
		Shape2al = new LODModelPart(this, 0, 44);
		Shape2al.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2al.setRotationPoint(0F, 19F, 0F);
		Shape2al.setTextureSize(256, 256);
		Shape2al.mirror = true;
		this.setRotation(Shape2al, 0F, 0.7853982F, 0F);
		Shape2am = new LODModelPart(this, 0, 44);
		Shape2am.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2am.setRotationPoint(0F, 19F, 0F);
		Shape2am.setTextureSize(256, 256);
		Shape2am.mirror = true;
		this.setRotation(Shape2am, 0F, 1.178097F, 0F);
		Shape2an = new LODModelPart(this, 0, 44);
		Shape2an.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2an.setRotationPoint(0F, 19F, 0F);
		Shape2an.setTextureSize(256, 256);
		Shape2an.mirror = true;
		this.setRotation(Shape2an, 0F, 1.570796F, 0F);
		Shape2ao = new LODModelPart(this, 0, 44);
		Shape2ao.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ao.setRotationPoint(0F, 19F, 0F);
		Shape2ao.setTextureSize(256, 256);
		Shape2ao.mirror = true;
		this.setRotation(Shape2ao, 0F, 1.963495F, 0F);
		Shape2ap = new LODModelPart(this, 0, 44);
		Shape2ap.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ap.setRotationPoint(0F, 19F, 0F);
		Shape2ap.setTextureSize(256, 256);
		Shape2ap.mirror = true;
		this.setRotation(Shape2ap, 0F, 2.356194F, 0F);
		Shape2aq = new LODModelPart(this, 0, 44);
		Shape2aq.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2aq.setRotationPoint(0F, 19F, 0F);
		Shape2aq.setTextureSize(256, 256);
		Shape2aq.mirror = true;
		this.setRotation(Shape2aq, 0F, 2.748893F, 0F);
		Shape2ar = new LODModelPart(this, 0, 44);
		Shape2ar.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ar.setRotationPoint(0F, 19F, 0F);
		Shape2ar.setTextureSize(256, 256);
		Shape2ar.mirror = true;
		this.setRotation(Shape2ar, 0F, 3.141593F, 0F);
		Shape2as = new LODModelPart(this, 0, 44);
		Shape2as.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2as.setRotationPoint(0F, 19F, 0F);
		Shape2as.setTextureSize(256, 256);
		Shape2as.mirror = true;
		this.setRotation(Shape2as, 0F, -0.3926991F, 0F);
		Shape2at = new LODModelPart(this, 0, 44);
		Shape2at.addBox(-25.5F, 0F, -129.5F, 53, 2, 1);
		Shape2at.setRotationPoint(0F, 19F, 0F);
		Shape2at.setTextureSize(256, 256);
		Shape2at.mirror = true;
		this.setRotation(Shape2at, 0F, -0.7853982F, 0F);
		Shape2au = new LODModelPart(this, 0, 44);
		Shape2au.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2au.setRotationPoint(0F, 19F, 0F);
		Shape2au.setTextureSize(256, 256);
		Shape2au.mirror = true;
		this.setRotation(Shape2au, 0F, -1.19555F, 0F);
		Shape2av = new LODModelPart(this, 0, 44);
		Shape2av.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2av.setRotationPoint(0F, 19F, 0F);
		Shape2av.setTextureSize(256, 256);
		Shape2av.mirror = true;
		this.setRotation(Shape2av, 0F, -1.58825F, 0F);
		Shape2aw = new LODModelPart(this, 0, 44);
		Shape2aw.addBox(-27.5F, 0F, -129.5F, 53, 2, 1);
		Shape2aw.setRotationPoint(0F, 19F, 0F);
		Shape2aw.setTextureSize(256, 256);
		Shape2aw.mirror = true;
		this.setRotation(Shape2aw, 0F, -2.391101F, 0F);
		Shape2ax = new LODModelPart(this, 0, 44);
		Shape2ax.addBox(-26F, 0F, -129.5F, 52, 2, 1);
		Shape2ax.setRotationPoint(0F, 19F, 0F);
		Shape2ax.setTextureSize(256, 256);
		Shape2ax.mirror = true;
		this.setRotation(Shape2ax, 0F, -1.980949F, 0F);
		Shape1z = new LODModelPart(this, 0, 0);
		Shape1z.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape1z.setRotationPoint(0F, 8F, 0F);
		Shape1z.setTextureSize(256, 256);
		Shape1z.mirror = true;
		this.setRotation(Shape1z, 0F, 3.141593F, 0F);
		Shape3a = new LODModelPart(this, 0, 0);
		Shape3a.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3a.setRotationPoint(0F, 24F, 0F);
		Shape3a.setTextureSize(256, 256);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 3.141593F, 0F);
		Shape3b = new LODModelPart(this, 0, 0);
		Shape3b.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3b.setRotationPoint(0F, 24F, 0F);
		Shape3b.setTextureSize(256, 256);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 0, 0);
		Shape3c.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3c.setRotationPoint(0F, 24F, 0F);
		Shape3c.setTextureSize(256, 256);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0.7853982F, 0F);
		Shape3d = new LODModelPart(this, 0, 0);
		Shape3d.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3d.setRotationPoint(0F, 24F, 0F);
		Shape3d.setTextureSize(256, 256);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 1.570796F, 0F);
		Shape3e = new LODModelPart(this, 0, 0);
		Shape3e.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3e.setRotationPoint(0F, 24F, 0F);
		Shape3e.setTextureSize(256, 256);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 2.356194F, 0F);
		Shape3f = new LODModelPart(this, 0, 18);
		Shape3f.addBox(-25F, 0F, -128.5F, 52, 16, 1);
		Shape3f.setRotationPoint(0F, 24F, 0F);
		Shape3f.setTextureSize(256, 256);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, -0.7853982F, 0F);
		Shape3g = new LODModelPart(this, 0, 0);
		Shape3g.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3g.setRotationPoint(0F, 24F, 0F);
		Shape3g.setTextureSize(256, 256);
		Shape3g.mirror = true;
		this.setRotation(Shape3g, 0F, -1.58825F, 0F);
		Shape1m = new LODModelPart(this, 0, 18);
		Shape1m.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape1m.setRotationPoint(0F, 8F, 0F);
		Shape1m.setTextureSize(256, 256);
		Shape1m.mirror = true;
		this.setRotation(Shape1m, 0F, -0.3926991F, 0F);
		Shape4a = new LODModelPart(this, 0, 18);
		Shape4a.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4a.setRotationPoint(0F, 24F, 0F);
		Shape4a.setTextureSize(256, 256);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, -0.3926991F, 0F);
		Shape4b = new LODModelPart(this, 0, 18);
		Shape4b.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4b.setRotationPoint(0F, 24F, 0F);
		Shape4b.setTextureSize(256, 256);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, -1.19555F, 0F);
		Shape4c = new LODModelPart(this, 0, 18);
		Shape4c.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4c.setRotationPoint(0F, 24F, 0F);
		Shape4c.setTextureSize(256, 256);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0.3926991F, 0F);
		Shape4d = new LODModelPart(this, 0, 18);
		Shape4d.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4d.setRotationPoint(0F, 24F, 0F);
		Shape4d.setTextureSize(256, 256);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 1.178097F, 0F);
		Shape4e = new LODModelPart(this, 0, 18);
		Shape4e.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4e.setRotationPoint(0F, 24F, 0F);
		Shape4e.setTextureSize(256, 256);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 1.963495F, 0F);
		Shape4f = new LODModelPart(this, 0, 18);
		Shape4f.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4f.setRotationPoint(0F, 24F, 0F);
		Shape4f.setTextureSize(256, 256);
		Shape4f.mirror = true;
		this.setRotation(Shape4f, 0F, 2.748893F, 0F);
		Shape4g = new LODModelPart(this, 0, 18);
		Shape4g.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4g.setRotationPoint(0F, 24F, 0F);
		Shape4g.setTextureSize(256, 256);
		Shape4g.mirror = true;
		this.setRotation(Shape4g, 0F, -2.7838F, 0F);
		Shape4h = new LODModelPart(this, 0, 18);
		Shape4h.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4h.setRotationPoint(0F, -8F, 0F);
		Shape4h.setTextureSize(256, 256);
		Shape4h.mirror = true;
		this.setRotation(Shape4h, 0F, 0.3926991F, 0F);
		Shape3h = new LODModelPart(this, 0, 0);
		Shape3h.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3h.setRotationPoint(0F, -8F, 0F);
		Shape3h.setTextureSize(256, 256);
		Shape3h.mirror = true;
		this.setRotation(Shape3h, 0F, 0.7853982F, 0F);
		Shape4i = new LODModelPart(this, 0, 18);
		Shape4i.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4i.setRotationPoint(0F, -8F, 0F);
		Shape4i.setTextureSize(256, 256);
		Shape4i.mirror = true;
		this.setRotation(Shape4i, 0F, 1.178097F, 0F);
		Shape3i = new LODModelPart(this, 0, 0);
		Shape3i.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3i.setRotationPoint(0F, -8F, 0F);
		Shape3i.setTextureSize(256, 256);
		Shape3i.mirror = true;
		this.setRotation(Shape3i, 0F, 1.570796F, 0F);
		Shape4j = new LODModelPart(this, 0, 18);
		Shape4j.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4j.setRotationPoint(0F, -8F, 0F);
		Shape4j.setTextureSize(256, 256);
		Shape4j.mirror = true;
		this.setRotation(Shape4j, 0F, 1.963495F, 0F);
		Shape3j = new LODModelPart(this, 0, 0);
		Shape3j.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3j.setRotationPoint(0F, -8F, 0F);
		Shape3j.setTextureSize(256, 256);
		Shape3j.mirror = true;
		this.setRotation(Shape3j, 0F, 0F, 0F);
		Shape4k = new LODModelPart(this, 0, 18);
		Shape4k.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4k.setRotationPoint(0F, -8F, 0F);
		Shape4k.setTextureSize(256, 256);
		Shape4k.mirror = true;
		this.setRotation(Shape4k, 0F, -0.3926991F, 0F);
		Shape3k = new LODModelPart(this, 0, 18);
		Shape3k.addBox(-25F, 0F, -128.5F, 52, 16, 1);
		Shape3k.setRotationPoint(0F, -8F, 0F);
		Shape3k.setTextureSize(256, 256);
		Shape3k.mirror = true;
		this.setRotation(Shape3k, 0F, -0.7853982F, 0F);
		Shape4l = new LODModelPart(this, 0, 18);
		Shape4l.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4l.setRotationPoint(0F, -8F, 0F);
		Shape4l.setTextureSize(256, 256);
		Shape4l.mirror = true;
		this.setRotation(Shape4l, 0F, -1.19555F, 0F);
		Shape3l = new LODModelPart(this, 0, 0);
		Shape3l.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3l.setRotationPoint(0F, -8F, 0F);
		Shape3l.setTextureSize(256, 256);
		Shape3l.mirror = true;
		this.setRotation(Shape3l, 0F, -1.58825F, 0F);
		Shape4m = new LODModelPart(this, 0, 18);
		Shape4m.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4m.setRotationPoint(0F, -8F, 0F);
		Shape4m.setTextureSize(256, 256);
		Shape4m.mirror = true;
		this.setRotation(Shape4m, 0F, -1.980949F, 0F);
		Shape3m = new LODModelPart(this, 0, 18);
		Shape3m.addBox(-27F, 0F, -128.5F, 52, 16, 1);
		Shape3m.setRotationPoint(0F, -8F, 0F);
		Shape3m.setTextureSize(256, 256);
		Shape3m.mirror = true;
		this.setRotation(Shape3m, 0F, -2.391101F, 0F);
		Shape4n = new LODModelPart(this, 0, 18);
		Shape4n.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4n.setRotationPoint(0F, -8F, 0F);
		Shape4n.setTextureSize(256, 256);
		Shape4n.mirror = true;
		this.setRotation(Shape4n, 0F, -2.7838F, 0F);
		Shape3n = new LODModelPart(this, 0, 0);
		Shape3n.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3n.setRotationPoint(0F, -8F, 0F);
		Shape3n.setTextureSize(256, 256);
		Shape3n.mirror = true;
		this.setRotation(Shape3n, 0F, 3.141593F, 0F);
		Shape4o = new LODModelPart(this, 0, 18);
		Shape4o.addBox(-26F, 0F, -128.5F, 52, 16, 1);
		Shape4o.setRotationPoint(0F, -8F, 0F);
		Shape4o.setTextureSize(256, 256);
		Shape4o.mirror = true;
		this.setRotation(Shape4o, 0F, 2.748893F, 0F);
		Shape3o = new LODModelPart(this, 0, 0);
		Shape3o.addBox(-25F, 0F, -128.5F, 50, 16, 1);
		Shape3o.setRotationPoint(0F, -8F, 0F);
		Shape3o.setTextureSize(256, 256);
		Shape3o.mirror = true;
		this.setRotation(Shape3o, 0F, 2.356194F, 0F);
		Shape6g = new LODModelPart(this, 0, 125);
		Shape6g.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6g.setRotationPoint(0F, 16F, 0F);
		Shape6g.setTextureSize(256, 256);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, -2.356194F, 0F);
		Shape7 = new LODModelPart(this, 112, 0);
		Shape7.addBox(-16F, 0F, -16F, 32, 48, 32);
		Shape7.setRotationPoint(0F, -8F, 0F);
		Shape7.setTextureSize(256, 256);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 112, 0);
		Shape7a.addBox(-16F, 0F, -16F, 32, 48, 32);
		Shape7a.setRotationPoint(0F, -8F, 0F);
		Shape7a.setTextureSize(256, 256);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 1.178097F, 0F);
		Shape7b = new LODModelPart(this, 112, 0);
		Shape7b.addBox(-16F, 0F, -16F, 32, 32, 32);
		Shape7b.setRotationPoint(0F, -8F, 0F);
		Shape7b.setTextureSize(256, 256);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0.7853982F, 0F);
		Shape7c = new LODModelPart(this, 112, 0);
		Shape7c.addBox(-16F, 0F, -16F, 32, 48, 32);
		Shape7c.setRotationPoint(0F, -8F, 0F);
		Shape7c.setTextureSize(256, 256);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0.3926991F, 0F);
		Shape6f = new LODModelPart(this, 0, 125);
		Shape6f.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6f.setRotationPoint(0F, 16F, 0F);
		Shape6f.setTextureSize(256, 256);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 3.141593F, 0F);
		Shape6a = new LODModelPart(this, 0, 125);
		Shape6a.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6a.setRotationPoint(0F, 16F, 0F);
		Shape6a.setTextureSize(256, 256);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 0, 125);
		Shape6b.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6b.setRotationPoint(0F, 16F, 0F);
		Shape6b.setTextureSize(256, 256);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0.7853982F, 0F);
		Shape6 = new LODModelPart(this, 0, 125);
		Shape6.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6.setRotationPoint(0F, 16F, 0F);
		Shape6.setTextureSize(256, 256);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 1.570796F, 0F);
		Shape6c = new LODModelPart(this, 0, 125);
		Shape6c.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6c.setRotationPoint(0F, 16F, 0F);
		Shape6c.setTextureSize(256, 256);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 2.356194F, 0F);
		Shape6d = new LODModelPart(this, 0, 125);
		Shape6d.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6d.setRotationPoint(0F, 16F, 0F);
		Shape6d.setTextureSize(256, 256);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, -0.7853982F, 0F);
		Shape6e = new LODModelPart(this, 0, 125);
		Shape6e.addBox(-2F, -7F, 12.5F, 4, 14, 115);
		Shape6e.setRotationPoint(0F, 16F, 0F);
		Shape6e.setTextureSize(256, 256);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, -1.570796F, 0F);
		Shape8 = new LODModelPart(this, 0, 49);
		Shape8.addBox(-12F, 0F, -12F, 24, 4, 24);
		Shape8.setRotationPoint(0F, -10F, 0F);
		Shape8.setTextureSize(256, 256);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 1.178097F, 0F);
		Shape8a = new LODModelPart(this, 0, 49);
		Shape8a.addBox(-12F, 0F, -12F, 24, 4, 24);
		Shape8a.setRotationPoint(0F, -12F, 0F);
		Shape8a.setTextureSize(256, 256);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 0F);
		Shape8b = new LODModelPart(this, 0, 49);
		Shape8b.addBox(-12F, 0F, -12F, 24, 4, 24);
		Shape8b.setRotationPoint(0F, -11F, 0F);
		Shape8b.setTextureSize(256, 256);
		Shape8b.mirror = true;
		this.setRotation(Shape8b, 0F, 0.7853982F, 0F);
		Shape8c = new LODModelPart(this, 0, 49);
		Shape8c.addBox(-12F, 0F, -12F, 24, 4, 24);
		Shape8c.setRotationPoint(0F, -10F, 0F);
		Shape8c.setTextureSize(256, 256);
		Shape8c.mirror = true;
		this.setRotation(Shape8c, 0F, 0.3926991F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		GL11.glRotated(phi, 0, 1, 0);
		boolean ring = (Boolean)li.get(0);

		if (ring) {
			Shape3.render(te, f5);
			Shape1a.render(te, f5);
			Shape1b.render(te, f5);
			Shape1c.render(te, f5);
			Shape1d.render(te, f5);
			Shape1e.render(te, f5);
			Shape1f.render(te, f5);
			Shape1g.render(te, f5);
			Shape1h.render(te, f5);
			Shape1i.render(te, f5);
			Shape1j.render(te, f5);
			Shape1k.render(te, f5);
			Shape1l.render(te, f5);
			Shape4.render(te, f5);
			Shape1n.render(te, f5);
			Shape1o.render(te, f5);

			this.renderThickUpperWire(te, 0.5);
			this.renderThickLowerWire(te, -0.5);

			this.renderThinWire(te, 0);
			this.renderThinWire(te, 0.2);
			this.renderThinWire(te, -0.2);
			this.renderThinWire(te, 0.8);
			this.renderThinWire(te, -0.8);
			this.renderThickUpperWire(te, 1.2);
			this.renderThickLowerWire(te, -1.2);

			Shape1z.render(te, f5);
			Shape3a.render(te, f5);
			Shape3b.render(te, f5);
			Shape3c.render(te, f5);
			Shape3d.render(te, f5);
			Shape3e.render(te, f5);
			Shape3f.render(te, f5);
			Shape3g.render(te, f5);
			Shape1m.render(te, f5);
			Shape4a.render(te, f5);
			Shape4b.render(te, f5);
			Shape4c.render(te, f5);
			Shape4d.render(te, f5);
			Shape4e.render(te, f5);
			Shape4f.render(te, f5);
			Shape4g.render(te, f5);
			Shape4h.render(te, f5);
			Shape3h.render(te, f5);
			Shape4i.render(te, f5);
			Shape3i.render(te, f5);
			Shape4j.render(te, f5);
			Shape3j.render(te, f5);
			Shape4k.render(te, f5);
			Shape3k.render(te, f5);
			Shape4l.render(te, f5);
			Shape3l.render(te, f5);
			Shape4m.render(te, f5);
			Shape3m.render(te, f5);
			Shape4n.render(te, f5);
			Shape3n.render(te, f5);
			Shape4o.render(te, f5);
			Shape3o.render(te, f5);
			Shape6g.render(te, f5);
			Shape6f.render(te, f5);
			Shape6a.render(te, f5);
			Shape6b.render(te, f5);
			Shape6.render(te, f5);
			Shape6c.render(te, f5);
			Shape6d.render(te, f5);
			Shape6e.render(te, f5);
		}

		double s = 0.67;
		double d = -0.1875;
		GL11.glTranslated(0, d, 0);
		GL11.glScaled(1, s, 1);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);
		Shape8.render(te, f5);
		Shape8a.render(te, f5);
		Shape8b.render(te, f5);
		Shape8c.render(te, f5);
		GL11.glScaled(1, 1/s, 1);
		GL11.glTranslated(0, -d, 0);
		GL11.glRotated(-phi, 0, 1, 0);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

	private void renderThickUpperWire(TileEntity te, double y) {
		double d = 0.175-y;
		GL11.glTranslated(0, d, 0);
		Shape2b.render(te, f5);
		Shape2u.render(te, f5);
		Shape2v.render(te, f5);
		Shape2w.render(te, f5);
		Shape2x.render(te, f5);
		Shape2y.render(te, f5);
		Shape2z.render(te, f5);
		Shape2aa.render(te, f5);
		Shape2ab.render(te, f5);
		Shape2ac.render(te, f5);
		Shape2ad.render(te, f5);
		Shape2ae.render(te, f5);
		Shape2af.render(te, f5);
		Shape2ag.render(te, f5);
		Shape2ah.render(te, f5);
		Shape2ai.render(te, f5);
		GL11.glTranslated(0, -d, 0);
	}

	private void renderThickLowerWire(TileEntity te, double y) {
		double d = -0.3125-y;
		GL11.glTranslated(0, d, 0);
		Shape2.render(te, f5);
		Shape2aj.render(te, f5);
		Shape2ak.render(te, f5);
		Shape2al.render(te, f5);
		Shape2am.render(te, f5);
		Shape2an.render(te, f5);
		Shape2ao.render(te, f5);
		Shape2ap.render(te, f5);
		Shape2aq.render(te, f5);
		Shape2ar.render(te, f5);
		Shape2as.render(te, f5);
		Shape2at.render(te, f5);
		Shape2au.render(te, f5);
		Shape2av.render(te, f5);
		Shape2aw.render(te, f5);
		Shape2ax.render(te, f5);
		GL11.glTranslated(0, -d, 0);
	}

	private void renderThinWire(TileEntity te, double y) {
		double d = -0.475-y;
		GL11.glTranslated(0, d, 0);
		Shape2a.render(te, f5);
		Shape2d.render(te, f5);
		Shape2g.render(te, f5);
		Shape2h.render(te, f5);
		Shape2i.render(te, f5);
		Shape2j.render(te, f5);
		Shape2k.render(te, f5);
		Shape2l.render(te, f5);
		Shape2m.render(te, f5);
		Shape2n.render(te, f5);
		Shape2o.render(te, f5);
		Shape2p.render(te, f5);
		Shape2q.render(te, f5);
		Shape2r.render(te, f5);
		Shape2s.render(te, f5);
		Shape2t.render(te, f5);
		GL11.glTranslated(0, -d, 0);
	}

}