package p437y4;

import java.util.HashSet;
import java.util.Set;

/* renamed from: y4.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13895r<T> implements InterfaceC13900w<T> {

    /* renamed from: a */
    private final Set<T> f35736a = new HashSet();

    /* renamed from: b */
    private final C13885j<T> f35737b = new C13885j<>();

    /* renamed from: b */
    private T m1288b(T t) {
        if (t != null) {
            synchronized (this) {
                this.f35736a.remove(t);
            }
        }
        return t;
    }

    @Override // p437y4.InterfaceC13900w
    public T get(int i) {
        return m1288b(this.f35737b.m1310a(i));
    }

    @Override // p437y4.InterfaceC13900w
    public T pop() {
        return m1288b(this.f35737b.m1305f());
    }

    @Override // p437y4.InterfaceC13900w
    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.f35736a.add(t);
        }
        if (add) {
            this.f35737b.m1306e(mo1265a(t), t);
        }
    }
}