package p278p4;

import java.util.LinkedHashSet;

/* renamed from: p4.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11385d<E> {

    /* renamed from: a */
    private int f29662a;

    /* renamed from: b */
    private LinkedHashSet<E> f29663b;

    public C11385d(int i) {
        this.f29663b = new LinkedHashSet<>(i);
        this.f29662a = i;
    }

    /* renamed from: a */
    public synchronized boolean m8190a(E e) {
        if (this.f29663b.size() == this.f29662a) {
            LinkedHashSet<E> linkedHashSet = this.f29663b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.f29663b.remove(e);
        return this.f29663b.add(e);
    }

    /* renamed from: b */
    public synchronized boolean m8189b(E e) {
        return this.f29663b.contains(e);
    }
}
