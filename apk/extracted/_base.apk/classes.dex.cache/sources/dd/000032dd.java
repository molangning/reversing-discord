package p099f8;

import p151i6.C7408s;
import p195k8.C9191p0;

/* renamed from: f8.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6349n {

    /* renamed from: a */
    public final int f17988a;

    /* renamed from: b */
    public final C7408s[] f17989b;

    /* renamed from: c */
    public final InterfaceC6337h[] f17990c;

    /* renamed from: d */
    public final Object f17991d;

    public C6349n(C7408s[] c7408sArr, InterfaceC6337h[] interfaceC6337hArr, Object obj) {
        this.f17989b = c7408sArr;
        this.f17990c = (InterfaceC6337h[]) interfaceC6337hArr.clone();
        this.f17991d = obj;
        this.f17988a = c7408sArr.length;
    }

    /* renamed from: a */
    public boolean m22875a(C6349n c6349n) {
        if (c6349n == null || c6349n.f17990c.length != this.f17990c.length) {
            return false;
        }
        for (int i = 0; i < this.f17990c.length; i++) {
            if (!m22874b(c6349n, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m22874b(C6349n c6349n, int i) {
        if (c6349n == null || !C9191p0.m16257c(this.f17989b[i], c6349n.f17989b[i]) || !C9191p0.m16257c(this.f17990c[i], c6349n.f17990c[i])) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m22873c(int i) {
        return this.f17989b[i] != null;
    }
}