package p326rh;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: rh.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12205n extends AbstractList<String> implements RandomAccess, InterfaceC12206o {

    /* renamed from: k */
    public static final InterfaceC12206o f31758k = new C12205n().mo5696n();

    /* renamed from: j */
    private final List<Object> f31759j;

    public C12205n() {
        this.f31759j = new ArrayList();
    }

    /* renamed from: d */
    private static AbstractC12177d m5778d(Object obj) {
        if (obj instanceof AbstractC12177d) {
            return (AbstractC12177d) obj;
        }
        if (obj instanceof String) {
            return AbstractC12177d.m5999k((String) obj);
        }
        return AbstractC12177d.m6001h((byte[]) obj);
    }

    /* renamed from: e */
    private static String m5777e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC12177d) {
            return ((AbstractC12177d) obj).m6006C();
        }
        return C12196j.m5798b((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, String str) {
        this.f31759j.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f31759j.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: f */
    public List<?> mo5699f() {
        return Collections.unmodifiableList(this.f31759j);
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: g */
    public void mo5698g(AbstractC12177d abstractC12177d) {
        this.f31759j.add(abstractC12177d);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public String get(int i) {
        Object obj = this.f31759j.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC12177d) {
            AbstractC12177d abstractC12177d = (AbstractC12177d) obj;
            String m6006C = abstractC12177d.m6006C();
            if (abstractC12177d.mo5745t()) {
                this.f31759j.set(i, m6006C);
            }
            return m6006C;
        }
        byte[] bArr = (byte[]) obj;
        String m5798b = C12196j.m5798b(bArr);
        if (C12196j.m5799a(bArr)) {
            this.f31759j.set(i, m5798b);
        }
        return m5798b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public String remove(int i) {
        Object remove = this.f31759j.remove(i);
        ((AbstractList) this).modCount++;
        return m5777e(remove);
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: j */
    public AbstractC12177d mo5697j(int i) {
        Object obj = this.f31759j.get(i);
        AbstractC12177d m5778d = m5778d(obj);
        if (m5778d != obj) {
            this.f31759j.set(i, m5778d);
        }
        return m5778d;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public String set(int i, String str) {
        return m5777e(this.f31759j.set(i, str));
    }

    @Override // p326rh.InterfaceC12206o
    /* renamed from: n */
    public InterfaceC12206o mo5696n() {
        return new C12230x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f31759j.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof InterfaceC12206o) {
            collection = ((InterfaceC12206o) collection).mo5699f();
        }
        boolean addAll = this.f31759j.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C12205n(InterfaceC12206o interfaceC12206o) {
        this.f31759j = new ArrayList(interfaceC12206o.size());
        addAll(interfaceC12206o);
    }
}