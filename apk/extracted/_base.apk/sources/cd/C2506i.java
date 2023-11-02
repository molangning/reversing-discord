package cd;

import p136hc.C7069o;

/* renamed from: cd.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2506i {

    /* renamed from: a */
    private final boolean f6886a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2506i(boolean z) {
        this.f6886a = z;
    }

    /* renamed from: a */
    public void m33111a(C7069o[] c7069oArr) {
        if (this.f6886a && c7069oArr != null && c7069oArr.length >= 3) {
            C7069o c7069o = c7069oArr[0];
            c7069oArr[0] = c7069oArr[2];
            c7069oArr[2] = c7069o;
        }
    }
}
