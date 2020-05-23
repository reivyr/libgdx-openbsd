/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConstraintRow extends BulletBase {
	private long swigCPtr;
	
	protected btConstraintRow(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConstraintRow, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConstraintRow(long cPtr, boolean cMemoryOwn) {
		this("btConstraintRow", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConstraintRow obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btConstraintRow(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setNormal(float[] value) {
    CollisionJNI.btConstraintRow_normal_set(swigCPtr, this, value);
  }

  public float[] getNormal() {
    return CollisionJNI.btConstraintRow_normal_get(swigCPtr, this);
  }

  public void setRhs(float value) {
    CollisionJNI.btConstraintRow_rhs_set(swigCPtr, this, value);
  }

  public float getRhs() {
    return CollisionJNI.btConstraintRow_rhs_get(swigCPtr, this);
  }

  public void setJacDiagInv(float value) {
    CollisionJNI.btConstraintRow_jacDiagInv_set(swigCPtr, this, value);
  }

  public float getJacDiagInv() {
    return CollisionJNI.btConstraintRow_jacDiagInv_get(swigCPtr, this);
  }

  public void setLowerLimit(float value) {
    CollisionJNI.btConstraintRow_lowerLimit_set(swigCPtr, this, value);
  }

  public float getLowerLimit() {
    return CollisionJNI.btConstraintRow_lowerLimit_get(swigCPtr, this);
  }

  public void setUpperLimit(float value) {
    CollisionJNI.btConstraintRow_upperLimit_set(swigCPtr, this, value);
  }

  public float getUpperLimit() {
    return CollisionJNI.btConstraintRow_upperLimit_get(swigCPtr, this);
  }

  public void setAccumImpulse(float value) {
    CollisionJNI.btConstraintRow_accumImpulse_set(swigCPtr, this, value);
  }

  public float getAccumImpulse() {
    return CollisionJNI.btConstraintRow_accumImpulse_get(swigCPtr, this);
  }

  public btConstraintRow() {
    this(CollisionJNI.new_btConstraintRow(), true);
  }

}
