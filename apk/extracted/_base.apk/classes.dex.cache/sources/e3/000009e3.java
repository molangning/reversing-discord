package bf;

import cf.C2523a;
import cf.C2528b;
import java.util.ArrayList;
import p085ef.InterfaceC6213a;
import p106ff.C6421b;
import p233mf.C10449c;
import p233mf.C10452e;

/* renamed from: bf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2275a implements InterfaceC2276b, InterfaceC6213a {

    /* renamed from: j */
    C10452e<InterfaceC2276b> f6394j;

    /* renamed from: k */
    volatile boolean f6395k;

    @Override // p085ef.InterfaceC6213a
    /* renamed from: a */
    public boolean mo23233a(InterfaceC2276b interfaceC2276b) {
        C6421b.m22784c(interfaceC2276b, "disposables is null");
        if (this.f6395k) {
            return false;
        }
        synchronized (this) {
            if (this.f6395k) {
                return false;
            }
            C10452e<InterfaceC2276b> c10452e = this.f6394j;
            if (c10452e != null && c10452e.m11515e(interfaceC2276b)) {
                return true;
            }
            return false;
        }
    }

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        return this.f6395k;
    }

    @Override // p085ef.InterfaceC6213a
    /* renamed from: c */
    public boolean mo23232c(InterfaceC2276b interfaceC2276b) {
        C6421b.m22784c(interfaceC2276b, "disposable is null");
        if (!this.f6395k) {
            synchronized (this) {
                if (!this.f6395k) {
                    C10452e<InterfaceC2276b> c10452e = this.f6394j;
                    if (c10452e == null) {
                        c10452e = new C10452e<>();
                        this.f6394j = c10452e;
                    }
                    c10452e.m11519a(interfaceC2276b);
                    return true;
                }
            }
        }
        interfaceC2276b.dispose();
        return false;
    }

    @Override // p085ef.InterfaceC6213a
    /* renamed from: d */
    public boolean mo23231d(InterfaceC2276b interfaceC2276b) {
        if (mo23233a(interfaceC2276b)) {
            interfaceC2276b.dispose();
            return true;
        }
        return false;
    }

    @Override // bf.InterfaceC2276b
    public void dispose() {
        if (this.f6395k) {
            return;
        }
        synchronized (this) {
            if (this.f6395k) {
                return;
            }
            this.f6395k = true;
            C10452e<InterfaceC2276b> c10452e = this.f6394j;
            this.f6394j = null;
            m33685e(c10452e);
        }
    }

    /* renamed from: e */
    void m33685e(C10452e<InterfaceC2276b> c10452e) {
        Object[] m11518b;
        if (c10452e == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c10452e.m11518b()) {
            if (obj instanceof InterfaceC2276b) {
                try {
                    ((InterfaceC2276b) obj).dispose();
                } catch (Throwable th2) {
                    C2528b.m33061b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C10449c.m11523c((Throwable) arrayList.get(0));
            }
            throw new C2523a(arrayList);
        }
    }
}