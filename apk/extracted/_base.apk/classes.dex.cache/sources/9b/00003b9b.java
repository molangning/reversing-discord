package p164j$.util;

import p164j$.util.function.C8431H;
import p164j$.util.function.C8462c0;
import p164j$.util.function.InterfaceC8437K;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8509g implements InterfaceC8468f0, InterfaceC8437K {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    /* renamed from: a */
    public final void m17634a(C8509g c8509g) {
        this.count += c8509g.count;
        this.sum += c8509g.sum;
        this.min = Math.min(this.min, c8509g.min);
        this.max = Math.max(this.max, c8509g.max);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        accept(i);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C8509g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}