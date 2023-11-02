package li;

import java.util.ArrayList;

/* renamed from: li.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10192a extends ArrayList<InterfaceC10204m> implements InterfaceC10203l {
    public C10192a(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC10204m) {
            return m12132d((InterfaceC10204m) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean m12132d(InterfaceC10204m interfaceC10204m) {
        return super.contains(interfaceC10204m);
    }

    /* renamed from: e */
    public /* bridge */ int m12131e() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC10204m) {
            return m12130k((InterfaceC10204m) obj);
        }
        return -1;
    }

    /* renamed from: k */
    public /* bridge */ int m12130k(InterfaceC10204m interfaceC10204m) {
        return super.indexOf(interfaceC10204m);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC10204m) {
            return m12129p((InterfaceC10204m) obj);
        }
        return -1;
    }

    /* renamed from: p */
    public /* bridge */ int m12129p(InterfaceC10204m interfaceC10204m) {
        return super.lastIndexOf(interfaceC10204m);
    }

    /* renamed from: r */
    public /* bridge */ boolean m12128r(InterfaceC10204m interfaceC10204m) {
        return super.remove(interfaceC10204m);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC10204m) {
            return m12128r((InterfaceC10204m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m12131e();
    }
}