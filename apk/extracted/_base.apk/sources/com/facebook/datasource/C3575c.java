package com.facebook.datasource;

import com.facebook.common.internal.Supplier;

/* renamed from: com.facebook.datasource.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3575c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.facebook.datasource.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C3576a<T> implements Supplier<DataSource<T>> {

        /* renamed from: a */
        final /* synthetic */ Throwable f9721a;

        C3576a(Throwable th2) {
            this.f9721a = th2;
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public DataSource<T> get() {
            return C3575c.m31692b(this.f9721a);
        }
    }

    /* renamed from: a */
    public static <T> Supplier<DataSource<T>> m31693a(Throwable th2) {
        return new C3576a(th2);
    }

    /* renamed from: b */
    public static <T> DataSource<T> m31692b(Throwable th2) {
        C3585g m31658x = C3585g.m31658x();
        m31658x.mo31659p(th2);
        return m31658x;
    }
}
