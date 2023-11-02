package p381v5;

import com.google.auto.value.AutoValue;
import p347t5.AbstractC12589c;
import p347t5.C12588b;
import p347t5.InterfaceC12591e;
import p381v5.C13081c;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* renamed from: v5.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13101n {

    @AutoValue.Builder
    /* renamed from: v5.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC13102a {
        /* renamed from: a */
        public abstract AbstractC13101n mo3268a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC13102a mo3267b(C12588b c12588b);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract AbstractC13102a mo3266c(AbstractC12589c<?> abstractC12589c);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract AbstractC13102a mo3265d(InterfaceC12591e<?, byte[]> interfaceC12591e);

        /* renamed from: e */
        public abstract AbstractC13102a mo3264e(AbstractC13103o abstractC13103o);

        /* renamed from: f */
        public abstract AbstractC13102a mo3263f(String str);
    }

    /* renamed from: a */
    public static AbstractC13102a m3275a() {
        return new C13081c.C13083b();
    }

    /* renamed from: b */
    public abstract C12588b mo3274b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC12589c<?> mo3273c();

    /* renamed from: d */
    public byte[] m3272d() {
        return mo3271e().apply(mo3273c().mo4752b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC12591e<?, byte[]> mo3271e();

    /* renamed from: f */
    public abstract AbstractC13103o mo3270f();

    /* renamed from: g */
    public abstract String mo3269g();
}
