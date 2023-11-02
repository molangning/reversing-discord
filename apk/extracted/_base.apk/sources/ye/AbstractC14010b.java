package ye;

import bf.InterfaceC2276b;
import cf.C2528b;
import gf.InterfaceCallableC6743d;
import lk.InterfaceC10219a;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import nf.C10859a;
import p067df.InterfaceC5830a;
import p067df.InterfaceC5832c;
import p067df.InterfaceC5833d;
import p106ff.C6408a;
import p106ff.C6421b;
import p139hf.C7096b;
import p139hf.C7105c;
import p139hf.C7108d;
import p139hf.C7109e;
import p139hf.C7112f;
import p139hf.C7116g;
import p139hf.C7118i;
import p139hf.C7119j;
import p139hf.C7123k;
import p139hf.C7125l;
import p139hf.EnumC7117h;
import p201kf.C9219a;
import p201kf.C9220b;

/* renamed from: ye.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC14010b<T> implements InterfaceC10219a<T> {

    /* renamed from: j */
    static final int f36011j = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: b */
    public static int m927b() {
        return f36011j;
    }

    /* renamed from: d */
    public static <T> AbstractC14010b<T> m925d(InterfaceC14012d<T> interfaceC14012d, EnumC14009a enumC14009a) {
        C6421b.m22784c(interfaceC14012d, "source is null");
        C6421b.m22784c(enumC14009a, "mode is null");
        return C10859a.m9888i(new C7096b(interfaceC14012d, enumC14009a));
    }

    /* renamed from: f */
    public static <T> AbstractC14010b<T> m923f() {
        return C10859a.m9888i(C7108d.f19416k);
    }

    /* renamed from: j */
    public static <T> AbstractC14010b<T> m919j(T... tArr) {
        C6421b.m22784c(tArr, "items is null");
        if (tArr.length == 0) {
            return m923f();
        }
        if (tArr.length == 1) {
            return m917l(tArr[0]);
        }
        return C10859a.m9888i(new C7112f(tArr));
    }

    /* renamed from: k */
    public static <T> AbstractC14010b<T> m918k(InterfaceC10219a<? extends T> interfaceC10219a) {
        if (interfaceC10219a instanceof AbstractC14010b) {
            return C10859a.m9888i((AbstractC14010b) interfaceC10219a);
        }
        C6421b.m22784c(interfaceC10219a, "source is null");
        return C10859a.m9888i(new C7116g(interfaceC10219a));
    }

    /* renamed from: l */
    public static <T> AbstractC14010b<T> m917l(T t) {
        C6421b.m22784c(t, "item is null");
        return C10859a.m9888i(new C7118i(t));
    }

    /* renamed from: m */
    public static <T> AbstractC14010b<T> m916m(InterfaceC10219a<? extends T> interfaceC10219a, InterfaceC10219a<? extends T> interfaceC10219a2) {
        C6421b.m22784c(interfaceC10219a, "source1 is null");
        C6421b.m22784c(interfaceC10219a2, "source2 is null");
        return m919j(interfaceC10219a, interfaceC10219a2).m921h(C6408a.m22790a(), false, 2);
    }

    @Override // lk.InterfaceC10219a
    /* renamed from: a */
    public final void mo928a(InterfaceC10220b<? super T> interfaceC10220b) {
        if (interfaceC10220b instanceof InterfaceC14013e) {
            m910s((InterfaceC14013e) interfaceC10220b);
            return;
        }
        C6421b.m22784c(interfaceC10220b, "s is null");
        m910s(new C9220b(interfaceC10220b));
    }

    /* renamed from: c */
    public final <R> AbstractC14010b<R> m926c(InterfaceC14014f<? super T, ? extends R> interfaceC14014f) {
        return m918k(((InterfaceC14014f) C6421b.m22784c(interfaceC14014f, "composer is null")).mo904a(this));
    }

    /* renamed from: e */
    public final AbstractC14010b<T> m924e(InterfaceC5830a interfaceC5830a) {
        C6421b.m22784c(interfaceC5830a, "onFinally is null");
        return C10859a.m9888i(new C7105c(this, interfaceC5830a));
    }

    /* renamed from: g */
    public final <R> AbstractC14010b<R> m922g(InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends R>> interfaceC5833d) {
        return m920i(interfaceC5833d, false, m927b(), m927b());
    }

    /* renamed from: h */
    public final <R> AbstractC14010b<R> m921h(InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends R>> interfaceC5833d, boolean z, int i) {
        return m920i(interfaceC5833d, z, i, m927b());
    }

    /* renamed from: i */
    public final <R> AbstractC14010b<R> m920i(InterfaceC5833d<? super T, ? extends InterfaceC10219a<? extends R>> interfaceC5833d, boolean z, int i, int i2) {
        C6421b.m22784c(interfaceC5833d, "mapper is null");
        C6421b.m22783d(i, "maxConcurrency");
        C6421b.m22783d(i2, "bufferSize");
        if (this instanceof InterfaceCallableC6743d) {
            Object call = ((InterfaceCallableC6743d) this).call();
            if (call == null) {
                return m923f();
            }
            return C7123k.m21389a(call, interfaceC5833d);
        }
        return C10859a.m9888i(new C7109e(this, interfaceC5833d, z, i, i2));
    }

    /* renamed from: n */
    public final AbstractC14010b<T> m915n(InterfaceC10219a<? extends T> interfaceC10219a) {
        C6421b.m22784c(interfaceC10219a, "other is null");
        return m916m(this, interfaceC10219a);
    }

    /* renamed from: o */
    public final AbstractC14010b<T> m914o(AbstractC14015g abstractC14015g) {
        return m913p(abstractC14015g, false, m927b());
    }

    /* renamed from: p */
    public final AbstractC14010b<T> m913p(AbstractC14015g abstractC14015g, boolean z, int i) {
        C6421b.m22784c(abstractC14015g, "scheduler is null");
        C6421b.m22783d(i, "bufferSize");
        return C10859a.m9888i(new C7119j(this, abstractC14015g, z, i));
    }

    /* renamed from: q */
    public final InterfaceC2276b m912q(InterfaceC5832c<? super T> interfaceC5832c, InterfaceC5832c<? super Throwable> interfaceC5832c2) {
        return m911r(interfaceC5832c, interfaceC5832c2, C6408a.f18047c, EnumC7117h.INSTANCE);
    }

    /* renamed from: r */
    public final InterfaceC2276b m911r(InterfaceC5832c<? super T> interfaceC5832c, InterfaceC5832c<? super Throwable> interfaceC5832c2, InterfaceC5830a interfaceC5830a, InterfaceC5832c<? super InterfaceC10221c> interfaceC5832c3) {
        C6421b.m22784c(interfaceC5832c, "onNext is null");
        C6421b.m22784c(interfaceC5832c2, "onError is null");
        C6421b.m22784c(interfaceC5830a, "onComplete is null");
        C6421b.m22784c(interfaceC5832c3, "onSubscribe is null");
        C9219a c9219a = new C9219a(interfaceC5832c, interfaceC5832c2, interfaceC5830a, interfaceC5832c3);
        m910s(c9219a);
        return c9219a;
    }

    /* renamed from: s */
    public final void m910s(InterfaceC14013e<? super T> interfaceC14013e) {
        C6421b.m22784c(interfaceC14013e, "s is null");
        try {
            InterfaceC10220b<? super T> m9884m = C10859a.m9884m(this, interfaceC14013e);
            C6421b.m22784c(m9884m, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo909t(m9884m);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            C2528b.m33061b(th2);
            C10859a.m9887j(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    /* renamed from: t */
    protected abstract void mo909t(InterfaceC10220b<? super T> interfaceC10220b);

    /* renamed from: u */
    public final AbstractC14010b<T> m908u(AbstractC14015g abstractC14015g) {
        C6421b.m22784c(abstractC14015g, "scheduler is null");
        return m907v(abstractC14015g, !(this instanceof C7096b));
    }

    /* renamed from: v */
    public final AbstractC14010b<T> m907v(AbstractC14015g abstractC14015g, boolean z) {
        C6421b.m22784c(abstractC14015g, "scheduler is null");
        return C10859a.m9888i(new C7125l(this, abstractC14015g, z));
    }
}
