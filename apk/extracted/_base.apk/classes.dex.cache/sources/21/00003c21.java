package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8494s0;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8420B0;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8452V;
import p164j$.util.function.InterfaceC8474i0;
import p164j$.util.function.InterfaceC8500v0;
import p164j$.util.function.InterfaceC8506y0;
import p164j$.util.function.InterfaceC8507z;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8638b implements IntFunction, InterfaceC8506y0, BiConsumer, InterfaceC8507z, InterfaceC8438K0, ToDoubleFunction, ToIntFunction, InterfaceC8452V, InterfaceC8420B0, InterfaceC8500v0, ToLongFunction, InterfaceC8426E0, InterfaceC8474i0 {

    /* renamed from: a */
    public final /* synthetic */ int f22819a;

    public /* synthetic */ C8638b(int i) {
        this.f22819a = i;
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    /* renamed from: a */
    public final InterfaceC8500v0 mo17507a(InterfaceC8500v0 interfaceC8500v0) {
        interfaceC8500v0.getClass();
        return new C8494s0(this, interfaceC8500v0, 1);
    }

    @Override // p164j$.util.function.InterfaceC8506y0
    public final void accept(Object obj, double d) {
        switch (this.f22819a) {
            case 2:
                double[] dArr = (double[]) obj;
                AbstractC8698n.m17425a(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                AbstractC8698n.m17425a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                return;
        }
    }

    @Override // p164j$.util.function.InterfaceC8420B0
    public final void accept(Object obj, int i) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i;
    }

    @Override // p164j$.util.function.InterfaceC8426E0
    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // p164j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f22819a) {
            case 3:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC8698n.m17425a(dArr, dArr2[0]);
                AbstractC8698n.m17425a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 7:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC8698n.m17425a(dArr3, dArr4[0]);
                AbstractC8698n.m17425a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // p164j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f22819a) {
            case 0:
                return new Object[i];
            case 1:
                return new Double[i];
            case 14:
                int i2 = C8609U.f22760h;
                return new Object[i];
            case 20:
                return new Integer[i];
            default:
                return new Long[i];
        }
    }

    @Override // p164j$.util.function.InterfaceC8474i0
    public final Object apply(long j) {
        switch (this.f22819a) {
            case 27:
                return AbstractC8744w0.m17354X0(j);
            case 28:
                return AbstractC8744w0.m17344h1(j);
            default:
                return AbstractC8744w0.m17342j1(j);
        }
    }

    @Override // p164j$.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // p164j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p164j$.util.function.InterfaceC8507z
    public final long applyAsLong(double d) {
        return 1L;
    }

    @Override // p164j$.util.function.InterfaceC8452V
    public final long applyAsLong(int i) {
        return 1L;
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    public final long applyAsLong(long j) {
        return 1L;
    }

    @Override // p164j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // p164j$.util.function.InterfaceC8500v0
    /* renamed from: b */
    public final InterfaceC8500v0 mo17506b(InterfaceC8500v0 interfaceC8500v0) {
        interfaceC8500v0.getClass();
        return new C8494s0(this, interfaceC8500v0, 0);
    }

    @Override // p164j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo17469c(BiConsumer biConsumer) {
        switch (this.f22819a) {
            case 3:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            case 7:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            case 19:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
        }
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        switch (this.f22819a) {
            case 5:
                return new double[4];
            case 6:
            case 7:
            case 8:
            case 14:
            case 15:
            case 16:
            default:
                return new long[2];
            case 9:
                return new double[3];
            case 10:
                return new C8562I();
            case 11:
                return new C8570K();
            case 12:
                return new C8574L();
            case 13:
                return new C8566J();
            case 17:
                return new long[2];
        }
    }
}