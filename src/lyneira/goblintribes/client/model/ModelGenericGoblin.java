package lyneira.goblintribes.client.model;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * The generic Goblin model.
 * 
 * @author max96at
 */

@SideOnly(Side.CLIENT)
public class ModelGenericGoblin extends ModelBase {

	// fields
	public ModelRenderer bipedHead;
	public ModelRenderer bipedBody;
	public ModelRenderer bipedNose;
	public ModelRenderer bipedLeftEar;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightEar;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedRightLeg;

	public ModelGenericGoblin() {
		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this, 16, 16);
		bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8);
		bipedHead.setRotationPoint(0F, 2F, 0F);
		bipedHead.setTextureSize(64, 64);
		bipedHead.mirror = true;
		setRotation(bipedHead, 0F, 0F, 0F);

		bipedBody = new ModelRenderer(this, 16, 0);
		bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
		bipedBody.setRotationPoint(0F, 2F, 0F);
		bipedBody.setTextureSize(64, 64);
		bipedBody.mirror = true;
		setRotation(bipedBody, 0F, 0F, 0F);

		bipedNose = new ModelRenderer(this, 40, 0);
		bipedNose.addBox(-2F, 0F, -2F, 4, 2, 2);
		bipedNose.setRotationPoint(0F, -4F, -4F);
		bipedNose.setTextureSize(64, 64);
		bipedNose.mirror = true;
		setRotation(bipedNose, 15 / (180F / (float) Math.PI), 0F, 0F);
		this.bipedHead.addChild(this.bipedNose);

		bipedLeftEar = new ModelRenderer(this, 40, 4);
		bipedLeftEar.addBox(0F, -2F, -1F, 4, 6, 2);
		bipedLeftEar.setRotationPoint(4F, -5F, 1F);
		bipedLeftEar.setTextureSize(64, 64);
		bipedLeftEar.mirror = true;
		setRotation(bipedLeftEar, 0F, 20 / (180F / (float) Math.PI), -6 / (180F / (float) Math.PI));
		bipedLeftEar.mirror = false;
		this.bipedHead.addChild(this.bipedLeftEar);

		bipedLeftArm = new ModelRenderer(this, 0, 14);
		bipedLeftArm.addBox(0F, 0F, -2F, 4, 16, 4);
		bipedLeftArm.setRotationPoint(4F, 2F, 0F);
		bipedLeftArm.setTextureSize(64, 64);
		bipedLeftArm.mirror = true;
		setRotation(bipedLeftArm, 0F, 0F, 0F);
		bipedLeftArm.mirror = false;

		bipedLeftLeg = new ModelRenderer(this, 0, 0);
		bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 10, 4);
		bipedLeftLeg.setRotationPoint(2F, 14F, 0F);
		bipedLeftLeg.setTextureSize(64, 64);
		bipedLeftLeg.mirror = true;
		setRotation(bipedLeftLeg, 0F, 0F, 0F);
		bipedLeftLeg.mirror = false;

		bipedRightEar = new ModelRenderer(this, 40, 4);
		bipedRightEar.addBox(-4F, -2F, -1F, 4, 6, 2);
		bipedRightEar.setRotationPoint(-4F, -5F, 1F);
		bipedRightEar.setTextureSize(64, 64);
		bipedRightEar.mirror = true;
		setRotation(bipedRightEar, 0F, -20 / (180F / (float) Math.PI), 6 / (180F / (float) Math.PI));
		this.bipedHead.addChild(this.bipedRightEar);

		bipedRightArm = new ModelRenderer(this, 0, 14);
		bipedRightArm.addBox(-4F, 0F, -2F, 4, 16, 4);
		bipedRightArm.setRotationPoint(-4F, 2F, 0F);
		bipedRightArm.setTextureSize(64, 64);
		bipedRightArm.mirror = true;
		setRotation(bipedRightArm, 0F, 0F, 0F);

		bipedRightLeg = new ModelRenderer(this, 0, 0);
		bipedRightLeg.addBox(-2F, 0F, -2F, 4, 10, 4);
		bipedRightLeg.setRotationPoint(-2F, 14F, 0F);
		bipedRightLeg.setTextureSize(64, 64);
		bipedRightLeg.mirror = true;
		setRotation(bipedRightLeg, 0F, 0F, 0F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(Entity par1Entity, float time, float speed, float angle, float rotationYaw, float rotationPitch, float scale) {
		this.setRotationAngles(time, speed, angle, rotationYaw, rotationPitch, scale, par1Entity);
		float var8 = 2.0F;
		if (this.isChild) {
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
			GL11.glTranslatef(0.0F, 33F * scale, 0.0F);
			this.bipedHead.render(scale);
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			GL11.glScalef(0.6F / var8, 0.6F / var8, 0.6F / var8);
			GL11.glTranslatef(0.0F, 56.0F * scale, 0.0F);
			this.bipedBody.render(scale);
			this.bipedRightArm.render(scale);
			this.bipedRightLeg.render(scale);
			this.bipedLeftArm.render(scale);
			this.bipedLeftLeg.render(scale);
			GL11.glPopMatrix();
		} else {
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
			GL11.glTranslatef(0.0F, 24.0F * scale, 0.0F);
			this.bipedHead.render(scale);
			this.bipedBody.render(scale);
			this.bipedRightArm.render(scale);
			this.bipedRightLeg.render(scale);
			this.bipedLeftArm.render(scale);
			this.bipedLeftLeg.render(scale);
			GL11.glPopMatrix();
		}
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are
	 * used for animating the movement of arms and legs, where par1 represents
	 * the time(so that arms and legs swing back and forth) and par2 represents
	 * how "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float time, float speed, float angle, float rotationYaw, float rotationPitch, float scale, Entity par7Entity) {
		this.bipedHead.rotateAngleY = 0 / (180F / (float) Math.PI);
		this.bipedHead.rotateAngleX = 0 / (180F / (float) Math.PI);
		this.bipedRightArm.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 2.0F * speed * 0.5F;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(time * 0.6662F) * 2.0F * speed * 0.5F;
		this.bipedRightArm.rotateAngleZ = 0.0F;
		this.bipedLeftArm.rotateAngleZ = 0.0F;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * speed;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.4F * speed;
		this.bipedRightLeg.rotateAngleY = 0.0F;
		this.bipedLeftLeg.rotateAngleY = 0.0F;
	}

}
