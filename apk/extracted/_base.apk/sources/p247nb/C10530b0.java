package p247nb;

import p423xb.InterfaceC13775a;
import p423xb.InterfaceC13776b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nb.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10530b0<T> implements InterfaceC13776b<T> {

    /* renamed from: c */
    private static final InterfaceC13775a<Object> f27505c = new InterfaceC13775a() { // from class: nb.z
        @Override // p423xb.InterfaceC13775a
        /* renamed from: a */
        public final void mo1570a(InterfaceC13776b interfaceC13776b) {
            C10530b0.m11317d(interfaceC13776b);
        }
    };

    /* renamed from: d */
    private static final InterfaceC13776b<Object> f27506d = new InterfaceC13776b() { // from class: nb.a0
        @Override // p423xb.InterfaceC13776b
        public final Object get() {
            Object m11316e;
            m11316e = C10530b0.m11316e();
            return m11316e;
        }
    };

    /* renamed from: a */
    private InterfaceC13775a<T> f27507a;

    /* renamed from: b */
    private volatile InterfaceC13776b<T> f27508b;

    private C10530b0(InterfaceC13775a<T> interfaceC13775a, InterfaceC13776b<T> interfaceC13776b) {
        this.f27507a = interfaceC13775a;
        this.f27508b = interfaceC13776b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> C10530b0<T> m11318c() {
        return new C10530b0<>(f27505c, f27506d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m11317d(InterfaceC13776b interfaceC13776b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Object m11316e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m11315f(InterfaceC13776b<T> interfaceC13776b) {
        InterfaceC13775a<T> interfaceC13775a;
        if (this.f27508b == f27506d) {
            synchronized (this) {
                interfaceC13775a = this.f27507a;
                this.f27507a = null;
                this.f27508b = interfaceC13776b;
            }
            interfaceC13775a.mo1570a(interfaceC13776b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // p423xb.InterfaceC13776b
    public T get() {
        return this.f27508b.get();
    }
}
