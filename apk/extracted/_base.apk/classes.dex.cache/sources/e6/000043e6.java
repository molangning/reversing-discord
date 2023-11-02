package p247nb;

import p423xb.InterfaceC13776b;

/* renamed from: nb.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10564w<T> implements InterfaceC13776b<T> {

    /* renamed from: c */
    private static final Object f27566c = new Object();

    /* renamed from: a */
    private volatile Object f27567a = f27566c;

    /* renamed from: b */
    private volatile InterfaceC13776b<T> f27568b;

    public C10564w(InterfaceC13776b<T> interfaceC13776b) {
        this.f27568b = interfaceC13776b;
    }

    @Override // p423xb.InterfaceC13776b
    public T get() {
        T t = (T) this.f27567a;
        Object obj = f27566c;
        if (t == obj) {
            synchronized (this) {
                t = this.f27567a;
                if (t == obj) {
                    t = this.f27568b.get();
                    this.f27567a = t;
                    this.f27568b = null;
                }
            }
        }
        return t;
    }
}