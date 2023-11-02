package net.time4j.p249tz;

import net.time4j.base.InterfaceC10620f;

/* renamed from: net.time4j.tz.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C10806i implements InterfaceC10620f {

    /* renamed from: j */
    private final long f28221j;

    /* renamed from: k */
    private final int f28222k;

    private C10806i(long j, int i) {
        this.f28221j = j;
        this.f28222k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC10620f m10165b(long j, int i) {
        if (i == 0) {
            j--;
        }
        return new C10806i(j, i == 0 ? 999999999 : i - 1);
    }

    @Override // net.time4j.base.InterfaceC10620f
    /* renamed from: a */
    public int mo10166a() {
        return this.f28222k;
    }

    @Override // net.time4j.base.InterfaceC10620f
    /* renamed from: k */
    public long mo10164k() {
        return this.f28221j;
    }
}
