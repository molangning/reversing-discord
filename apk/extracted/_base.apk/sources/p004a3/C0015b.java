package p004a3;

import java.lang.ref.SoftReference;

/* renamed from: a3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0015b<T> {

    /* renamed from: a */
    SoftReference<T> f19a = null;

    /* renamed from: b */
    SoftReference<T> f20b = null;

    /* renamed from: c */
    SoftReference<T> f21c = null;

    /* renamed from: a */
    public void m41400a() {
        SoftReference<T> softReference = this.f19a;
        if (softReference != null) {
            softReference.clear();
            this.f19a = null;
        }
        SoftReference<T> softReference2 = this.f20b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f20b = null;
        }
        SoftReference<T> softReference3 = this.f21c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f21c = null;
        }
    }

    /* renamed from: b */
    public T m41399b() {
        SoftReference<T> softReference = this.f19a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* renamed from: c */
    public void m41398c(T t) {
        this.f19a = new SoftReference<>(t);
        this.f20b = new SoftReference<>(t);
        this.f21c = new SoftReference<>(t);
    }
}
