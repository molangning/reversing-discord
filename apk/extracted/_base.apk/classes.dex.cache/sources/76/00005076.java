package p394w2;

import com.facebook.common.internal.Supplier;

/* renamed from: w2.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13382m {

    /* renamed from: a */
    public static final Supplier<Boolean> f34464a = new C13384b();

    /* renamed from: b */
    public static final Supplier<Boolean> f34465b = new C13385c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w2.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13383a<T> implements Supplier<T> {

        /* renamed from: a */
        final /* synthetic */ Object f34466a;

        C13383a(Object obj) {
            this.f34466a = obj;
        }

        @Override // com.facebook.common.internal.Supplier
        public T get() {
            return (T) this.f34466a;
        }
    }

    /* renamed from: w2.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C13384b implements Supplier<Boolean> {
        C13384b() {
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: w2.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C13385c implements Supplier<Boolean> {
        C13385c() {
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static <T> Supplier<T> m2669a(T t) {
        return new C13383a(t);
    }
}