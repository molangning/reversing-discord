package p289q;

/* renamed from: q.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C11661f<T> implements InterfaceC11660e<T> {

    /* renamed from: a */
    private final Object[] f30381a;

    /* renamed from: b */
    private int f30382b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11661f(int i) {
        if (i > 0) {
            this.f30381a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p289q.InterfaceC11660e
    /* renamed from: a */
    public void mo7289a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f30382b;
            Object[] objArr = this.f30381a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f30382b = i3 + 1;
            }
        }
    }

    @Override // p289q.InterfaceC11660e
    public T acquire() {
        int i = this.f30382b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f30381a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f30382b = i - 1;
        return t;
    }

    @Override // p289q.InterfaceC11660e
    public boolean release(T t) {
        int i = this.f30382b;
        Object[] objArr = this.f30381a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f30382b = i + 1;
            return true;
        }
        return false;
    }
}
