package p030bc;

import com.google.auto.value.AutoValue;
import p030bc.C2259b;

@AutoValue
/* renamed from: bc.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2267f {

    @AutoValue.Builder
    /* renamed from: bc.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC2268a {
        /* renamed from: a */
        public abstract AbstractC2267f mo33710a();

        /* renamed from: b */
        public abstract AbstractC2268a mo33709b(EnumC2269b enumC2269b);

        /* renamed from: c */
        public abstract AbstractC2268a mo33708c(String str);

        /* renamed from: d */
        public abstract AbstractC2268a mo33707d(long j);
    }

    /* renamed from: bc.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC2269b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static AbstractC2268a m33714a() {
        return new C2259b.C2261b().mo33707d(0L);
    }

    /* renamed from: b */
    public abstract EnumC2269b mo33713b();

    /* renamed from: c */
    public abstract String mo33712c();

    /* renamed from: d */
    public abstract long mo33711d();
}
