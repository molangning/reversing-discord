package p164j$.util.stream;

import java.util.LinkedHashSet;
import p164j$.util.C8414e;
import p164j$.util.C8416f;
import p164j$.util.C8509g;
import p164j$.util.C8510h;
import p164j$.util.C8512j;
import p164j$.util.C8513k;
import p164j$.util.C8514l;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8428F0;
import p164j$.util.function.C8430G0;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8420B0;
import p164j$.util.function.InterfaceC8429G;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8475j;
import p164j$.util.function.InterfaceC8489q;
import p164j$.util.function.InterfaceC8506y0;
import p164j$.util.function.Predicate;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.S1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8603S1 implements IntFunction, ToLongFunction, Consumer, InterfaceC8438K0, BiConsumer, InterfaceC8475j, InterfaceC8489q, InterfaceC8506y0, Predicate, InterfaceC8429G, InterfaceC8420B0, InterfaceC8460b0 {

    /* renamed from: a */
    public final /* synthetic */ int f22753a;

    public /* synthetic */ C8603S1(int i) {
        this.f22753a = i;
    }

    @Override // p164j$.util.function.Predicate
    /* renamed from: a */
    public final Predicate mo17547a(Predicate predicate) {
        switch (this.f22753a) {
            case 19:
                predicate.getClass();
                return new C8428F0(this, predicate, 0);
            case 20:
                predicate.getClass();
                return new C8428F0(this, predicate, 0);
            case 21:
                predicate.getClass();
                return new C8428F0(this, predicate, 0);
            default:
                predicate.getClass();
                return new C8428F0(this, predicate, 0);
        }
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // p164j$.util.function.InterfaceC8506y0
    public final void accept(Object obj, double d) {
        ((C8414e) obj).accept(d);
    }

    @Override // p164j$.util.function.InterfaceC8420B0
    public final void accept(Object obj, int i) {
        ((C8416f) obj).accept(i);
    }

    @Override // p164j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f22753a) {
            case 12:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 13:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 18:
                ((C8414e) obj).m17721a((C8414e) obj2);
                return;
            default:
                ((C8416f) obj).m17719a((C8416f) obj2);
                return;
        }
    }

    @Override // p164j$.util.function.InterfaceC8489q
    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // p164j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f22753a) {
            case 0:
                return new Object[i];
            case 1:
            default:
                return Integer.valueOf(i);
            case 2:
                return new Object[i];
            case 3:
                return new Integer[i];
            case 4:
                return new Long[i];
            case 5:
                return new Double[i];
        }
    }

    @Override // p164j$.util.function.InterfaceC8475j
    public final double applyAsDouble(double d, double d2) {
        switch (this.f22753a) {
            case 14:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // p164j$.util.function.InterfaceC8429G
    public final int applyAsInt(int i, int i2) {
        switch (this.f22753a) {
            case 23:
                return Math.min(i, i2);
            case 24:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // p164j$.util.function.InterfaceC8460b0
    public final long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // p164j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return 1L;
    }

    @Override // p164j$.util.function.Predicate
    /* renamed from: b */
    public final Predicate mo17546b(Predicate predicate) {
        switch (this.f22753a) {
            case 19:
                predicate.getClass();
                return new C8428F0(this, predicate, 1);
            case 20:
                predicate.getClass();
                return new C8428F0(this, predicate, 1);
            case 21:
                predicate.getClass();
                return new C8428F0(this, predicate, 1);
            default:
                predicate.getClass();
                return new C8428F0(this, predicate, 1);
        }
    }

    @Override // p164j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo17469c(BiConsumer biConsumer) {
        switch (this.f22753a) {
            case 12:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            case 13:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            case 18:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22753a) {
            case 6:
                consumer.getClass();
                return new C8406u(3, this, consumer);
            default:
                consumer.getClass();
                return new C8406u(3, this, consumer);
        }
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        switch (this.f22753a) {
            case 8:
                return new C8414e();
            case 9:
                return new C8416f();
            case 10:
                return new C8509g();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p164j$.util.function.Predicate
    public final Predicate negate() {
        switch (this.f22753a) {
            case 19:
                return new C8430G0(this);
            case 20:
                return new C8430G0(this);
            case 21:
                return new C8430G0(this);
            default:
                return new C8430G0(this);
        }
    }

    @Override // p164j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f22753a) {
            case 19:
                return ((C8512j) obj).m17619c();
            case 20:
                return ((C8514l) obj).m17611c();
            case 21:
                return ((C8510h) obj).m17631c();
            default:
                return ((C8513k) obj).m17615c();
        }
    }
}
