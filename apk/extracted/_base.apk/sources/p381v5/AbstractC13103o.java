package p381v5;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import p347t5.EnumC12590d;
import p381v5.C13084d;

@AutoValue
/* renamed from: v5.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13103o {

    @AutoValue.Builder
    /* renamed from: v5.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC13104a {
        /* renamed from: a */
        public abstract AbstractC13103o mo3256a();

        /* renamed from: b */
        public abstract AbstractC13104a mo3255b(String str);

        /* renamed from: c */
        public abstract AbstractC13104a mo3254c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC13104a mo3253d(EnumC12590d enumC12590d);
    }

    /* renamed from: a */
    public static AbstractC13104a m3262a() {
        return new C13084d.C13086b().mo3253d(EnumC12590d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo3261b();

    /* renamed from: c */
    public abstract byte[] mo3260c();

    /* renamed from: d */
    public abstract EnumC12590d mo3259d();

    /* renamed from: e */
    public boolean m3258e() {
        return mo3260c() != null;
    }

    /* renamed from: f */
    public AbstractC13103o m3257f(EnumC12590d enumC12590d) {
        return m3262a().mo3255b(mo3261b()).mo3253d(enumC12590d).mo3254c(mo3260c()).mo3256a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = mo3261b();
        objArr[1] = mo3259d();
        if (mo3260c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(mo3260c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
