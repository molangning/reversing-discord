package p085ef;

import bf.InterfaceC2276b;
import cf.C2523a;
import cf.C2528b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p106ff.C6421b;
import p233mf.C10449c;

/* renamed from: ef.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6216d implements InterfaceC2276b, InterfaceC6213a {

    /* renamed from: j */
    List<InterfaceC2276b> f17627j;

    /* renamed from: k */
    volatile boolean f17628k;

    @Override // p085ef.InterfaceC6213a
    /* renamed from: a */
    public boolean mo23233a(InterfaceC2276b interfaceC2276b) {
        C6421b.m22784c(interfaceC2276b, "Disposable item is null");
        if (this.f17628k) {
            return false;
        }
        synchronized (this) {
            if (this.f17628k) {
                return false;
            }
            List<InterfaceC2276b> list = this.f17627j;
            if (list != null && list.remove(interfaceC2276b)) {
                return true;
            }
            return false;
        }
    }

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        return this.f17628k;
    }

    @Override // p085ef.InterfaceC6213a
    /* renamed from: c */
    public boolean mo23232c(InterfaceC2276b interfaceC2276b) {
        C6421b.m22784c(interfaceC2276b, "d is null");
        if (!this.f17628k) {
            synchronized (this) {
                if (!this.f17628k) {
                    List list = this.f17627j;
                    if (list == null) {
                        list = new LinkedList();
                        this.f17627j = list;
                    }
                    list.add(interfaceC2276b);
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
        if (this.f17628k) {
            return;
        }
        synchronized (this) {
            if (this.f17628k) {
                return;
            }
            this.f17628k = true;
            List<InterfaceC2276b> list = this.f17627j;
            this.f17627j = null;
            m23230e(list);
        }
    }

    /* renamed from: e */
    void m23230e(List<InterfaceC2276b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (InterfaceC2276b interfaceC2276b : list) {
            try {
                interfaceC2276b.dispose();
            } catch (Throwable th2) {
                C2528b.m33061b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
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
