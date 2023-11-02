package p066dd;

import p136hc.C7069o;

/* renamed from: dd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5812a extends C7069o {

    /* renamed from: c */
    private final float f16634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5812a(float f, float f2, float f3) {
        super(f, f2);
        this.f16634c = f3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m24493f(float f, float f2, float f3) {
        if (Math.abs(f2 - m21454d()) > f || Math.abs(f3 - m21455c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f16634c);
        if (abs > 1.0f && abs > this.f16634c) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C5812a m24492g(float f, float f2, float f3) {
        return new C5812a((m21455c() + f2) / 2.0f, (m21454d() + f) / 2.0f, (this.f16634c + f3) / 2.0f);
    }
}
