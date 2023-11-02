package gb;

import java.util.Comparator;
import java.util.Map;
import p102fb.InterfaceC6376f;

/* renamed from: gb.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6656j0<T> implements Comparator<T> {
    /* renamed from: b */
    public static <T> AbstractC6656j0<T> m22237b(Comparator<T> comparator) {
        return comparator instanceof AbstractC6656j0 ? (AbstractC6656j0) comparator : new C6669m(comparator);
    }

    /* renamed from: f */
    public static <C extends Comparable> AbstractC6656j0<C> m22235f() {
        return C6652h0.f18829j;
    }

    /* renamed from: c */
    public <E extends T> AbstractC6693s<E> m22236c(Iterable<E> iterable) {
        return AbstractC6693s.m22140B(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public <T2 extends T> AbstractC6656j0<Map.Entry<T2, ?>> m22234g() {
        return (AbstractC6656j0<Map.Entry<T2, ?>>) m22233i(C6607c0.m22325d());
    }

    /* renamed from: i */
    public <F> AbstractC6656j0<F> m22233i(InterfaceC6376f<F, ? extends T> interfaceC6376f) {
        return new C6651h(interfaceC6376f, this);
    }

    /* renamed from: j */
    public <S extends T> AbstractC6656j0<S> mo22155j() {
        return new C6682p0(this);
    }
}
