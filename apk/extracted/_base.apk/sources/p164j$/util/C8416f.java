package p164j$.util;

import com.facebook.react.uimanager.ViewDefaults;
import p164j$.util.function.C8431H;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8416f implements InterfaceC8437K {
    private long count;
    private long sum;
    private int min = ViewDefaults.NUMBER_OF_LINES;
    private int max = Integer.MIN_VALUE;

    /* renamed from: a */
    public final void m17719a(C8416f c8416f) {
        this.count += c8416f.count;
        this.sum += c8416f.sum;
        this.min = Math.min(this.min, c8416f.min);
        this.max = Math.max(this.max, c8416f.max);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    @Override // p164j$.util.function.InterfaceC8437K
    /* renamed from: o */
    public final InterfaceC8437K mo17379o(InterfaceC8437K interfaceC8437K) {
        interfaceC8437K.getClass();
        return new C8431H(this, interfaceC8437K);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C8416f.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
