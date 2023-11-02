package com.facebook.yoga;

/* renamed from: com.facebook.yoga.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4338b extends YogaConfig {

    /* renamed from: a */
    long f11101a;

    private AbstractC4338b(long j) {
        if (j != 0) {
            this.f11101a = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.facebook.yoga.YogaConfig
    /* renamed from: a */
    public void mo29974a(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f11101a, f);
    }

    @Override // com.facebook.yoga.YogaConfig
    /* renamed from: b */
    public void mo29973b(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.f11101a, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4338b() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
