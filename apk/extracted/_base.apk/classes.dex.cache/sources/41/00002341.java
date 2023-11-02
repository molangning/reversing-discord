package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.jni.annotations.DoNotStrip;
import p129h5.C7018a;

@DoNotStrip
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HybridData {
    @DoNotStrip
    private Destructor mDestructor = new Destructor(this);

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Destructor extends DestructorThread.Destructor {
        @DoNotStrip
        private volatile long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j);

        @Override // com.facebook.jni.DestructorThread.Destructor
        protected final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        C7018a.m21531d("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}