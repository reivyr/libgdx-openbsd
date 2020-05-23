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

public class btDbvtAabbMm extends BulletBase {
	private long swigCPtr;
	
	protected btDbvtAabbMm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDbvtAabbMm, normally you should not need this constructor it's intended for low-level usage. */ 
	public btDbvtAabbMm(long cPtr, boolean cMemoryOwn) {
		this("btDbvtAabbMm", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btDbvtAabbMm obj) {
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
				CollisionJNI.delete_btDbvtAabbMm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	private final static btDbvtAabbMm temp = new btDbvtAabbMm(0, false);
	/** Obtains a temporary instance, used by native methods that return a btDbvtAabbMm instance */
	public static btDbvtAabbMm internalTemp(long cPtr, boolean own) {
		temp.reset(cPtr, own);
		return temp;
	}
	private static btDbvtAabbMm[] argumentInstances = new btDbvtAabbMm[] {new btDbvtAabbMm(0, false),
		new btDbvtAabbMm(0, false), new btDbvtAabbMm(0, false), new btDbvtAabbMm(0, false)};
	private static int argumentIndex = -1;
	/** Obtains a temporary instance, used for callback methods with one or more btDbvtAabbMm arguments */
	protected static btDbvtAabbMm obtainForArgument(final long swigCPtr, boolean owner) {
		btDbvtAabbMm instance = argumentInstances[argumentIndex = (argumentIndex + 1) & 3];
		instance.reset(swigCPtr, owner);
		return instance;
	}

  public Vector3 Center() {
	return CollisionJNI.btDbvtAabbMm_Center(swigCPtr, this);
}

  public Vector3 Lengths() {
	return CollisionJNI.btDbvtAabbMm_Lengths(swigCPtr, this);
}

  public Vector3 Extents() {
	return CollisionJNI.btDbvtAabbMm_Extents(swigCPtr, this);
}

  public Vector3 Mins() {
	return CollisionJNI.btDbvtAabbMm_Mins(swigCPtr, this);
}

  public Vector3 Maxs() {
	return CollisionJNI.btDbvtAabbMm_Maxs(swigCPtr, this);
}

  public static btDbvtAabbMm FromCE(Vector3 c, Vector3 e) {
    return new btDbvtAabbMm(CollisionJNI.btDbvtAabbMm_FromCE(c, e), true);
  }

  public static btDbvtAabbMm FromCR(Vector3 c, float r) {
    return new btDbvtAabbMm(CollisionJNI.btDbvtAabbMm_FromCR(c, r), true);
  }

  public static btDbvtAabbMm FromMM(Vector3 mi, Vector3 mx) {
    return new btDbvtAabbMm(CollisionJNI.btDbvtAabbMm_FromMM(mi, mx), true);
  }

  public static btDbvtAabbMm FromPoints(btVector3 pts, int n) {
    return new btDbvtAabbMm(CollisionJNI.btDbvtAabbMm_FromPoints__SWIG_0(btVector3.getCPtr(pts), pts, n), true);
  }

  public static btDbvtAabbMm FromPoints(SWIGTYPE_p_p_btVector3 ppts, int n) {
    return new btDbvtAabbMm(CollisionJNI.btDbvtAabbMm_FromPoints__SWIG_1(SWIGTYPE_p_p_btVector3.getCPtr(ppts), n), true);
  }

  public void Expand(Vector3 e) {
    CollisionJNI.btDbvtAabbMm_Expand(swigCPtr, this, e);
  }

  public void SignedExpand(Vector3 e) {
    CollisionJNI.btDbvtAabbMm_SignedExpand(swigCPtr, this, e);
  }

  public boolean Contain(btDbvtAabbMm a) {
    return CollisionJNI.btDbvtAabbMm_Contain(swigCPtr, this, btDbvtAabbMm.getCPtr(a), a);
  }

  public int Classify(Vector3 n, float o, int s) {
    return CollisionJNI.btDbvtAabbMm_Classify(swigCPtr, this, n, o, s);
  }

  public float ProjectMinimum(Vector3 v, long signs) {
    return CollisionJNI.btDbvtAabbMm_ProjectMinimum(swigCPtr, this, v, signs);
  }

  public Vector3 tMins() {
	return CollisionJNI.btDbvtAabbMm_tMins(swigCPtr, this);
}

  public Vector3 tMaxs() {
	return CollisionJNI.btDbvtAabbMm_tMaxs(swigCPtr, this);
}

  public btDbvtAabbMm() {
    this(CollisionJNI.new_btDbvtAabbMm(), true);
  }

}
