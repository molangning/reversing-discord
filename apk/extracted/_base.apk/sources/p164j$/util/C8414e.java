package p164j$.util;

import p164j$.util.function.C8477k;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8414e implements InterfaceC8483n {

    /* renamed from: a */
    private double f22536a;

    /* renamed from: b */
    private double f22537b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    /* renamed from: a */
    public final void m17721a(C8414e c8414e) {
        this.count += c8414e.count;
        this.f22537b += c8414e.f22537b;
        double d = c8414e.sum - this.f22536a;
        double d2 = this.sum;
        double d3 = d2 + d;
        double d4 = (d3 - d2) - d;
        this.f22536a = d4;
        double d5 = c8414e.f22536a - d4;
        double d6 = d3 + d5;
        this.f22536a = (d6 - d3) - d5;
        this.sum = d6;
        this.min = Math.min(this.min, c8414e.min);
        this.max = Math.max(this.max, c8414e.max);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final void accept(double d) {
        this.count++;
        this.f22537b += d;
        double d2 = d - this.f22536a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f22536a = (d4 - d3) - d2;
        this.sum = d4;
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        interfaceC8483n.getClass();
        return new C8477k(this, interfaceC8483n);
    }

    public final String toString() {
        double d;
        Object[] objArr = new Object[6];
        objArr[0] = C8414e.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d2 = this.sum + this.f22536a;
        if (Double.isNaN(d2) && Double.isInfinite(this.f22537b)) {
            d2 = this.f22537b;
        }
        objArr[2] = Double.valueOf(d2);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d3 = this.sum + this.f22536a;
            if (Double.isNaN(d3) && Double.isInfinite(this.f22537b)) {
                d3 = this.f22537b;
            }
            d = d3 / this.count;
        } else {
            d = 0.0d;
        }
        objArr[4] = Double.valueOf(d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
