package p362u5;

import com.google.auto.value.AutoValue;
import p362u5.C12844e;

@AutoValue
/* renamed from: u5.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12858k {

    @AutoValue.Builder
    /* renamed from: u5.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC12859a {
        /* renamed from: a */
        public abstract AbstractC12858k mo3805a();

        /* renamed from: b */
        public abstract AbstractC12859a mo3804b(AbstractC12831a abstractC12831a);

        /* renamed from: c */
        public abstract AbstractC12859a mo3803c(EnumC12860b enumC12860b);
    }

    /* renamed from: u5.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC12860b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: j */
        private final int f33440j;

        EnumC12860b(int i) {
            this.f33440j = i;
        }
    }

    /* renamed from: a */
    public static AbstractC12859a m3808a() {
        return new C12844e.C12846b();
    }

    /* renamed from: b */
    public abstract AbstractC12831a mo3807b();

    /* renamed from: c */
    public abstract EnumC12860b mo3806c();
}