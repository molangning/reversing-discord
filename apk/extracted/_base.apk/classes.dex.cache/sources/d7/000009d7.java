package p030bc;

import com.google.auto.value.AutoValue;
import p030bc.C2256a;

@AutoValue
/* renamed from: bc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2263d {

    @AutoValue.Builder
    /* renamed from: bc.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC2264a {
        /* renamed from: a */
        public abstract AbstractC2263d mo33726a();

        /* renamed from: b */
        public abstract AbstractC2264a mo33725b(AbstractC2267f abstractC2267f);

        /* renamed from: c */
        public abstract AbstractC2264a mo33724c(String str);

        /* renamed from: d */
        public abstract AbstractC2264a mo33723d(String str);

        /* renamed from: e */
        public abstract AbstractC2264a mo33722e(EnumC2265b enumC2265b);

        /* renamed from: f */
        public abstract AbstractC2264a mo33721f(String str);
    }

    /* renamed from: bc.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC2265b {
        OK,
        BAD_CONFIG
    }

    /* renamed from: a */
    public static AbstractC2264a m33732a() {
        return new C2256a.C2258b();
    }

    /* renamed from: b */
    public abstract AbstractC2267f mo33731b();

    /* renamed from: c */
    public abstract String mo33730c();

    /* renamed from: d */
    public abstract String mo33729d();

    /* renamed from: e */
    public abstract EnumC2265b mo33728e();

    /* renamed from: f */
    public abstract String mo33727f();
}