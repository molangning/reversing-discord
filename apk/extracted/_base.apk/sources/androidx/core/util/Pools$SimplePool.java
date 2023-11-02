package androidx.core.util;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Pools$SimplePool<T> implements InterfaceC1137e<T> {

    /* renamed from: a */
    private final Object[] f3502a;

    /* renamed from: b */
    private int f3503b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.f3502a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    private boolean m37843a(T t) {
        for (int i = 0; i < this.f3503b; i++) {
            if (this.f3502a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.InterfaceC1137e
    public T acquire() {
        int i = this.f3503b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f3502a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f3503b = i - 1;
        return t;
    }

    @Override // androidx.core.util.InterfaceC1137e
    public boolean release(T t) {
        if (!m37843a(t)) {
            int i = this.f3503b;
            Object[] objArr = this.f3502a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.f3503b = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
