package p029b9;

import android.os.Bundle;
import p461z8.C14107a;

/* renamed from: b9.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2216w implements C14107a.InterfaceC14111d {

    /* renamed from: k */
    public static final C2216w f6219k = m33955a().m33953a();

    /* renamed from: j */
    private final String f6220j;

    /* renamed from: b9.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2217a {

        /* renamed from: a */
        private String f6221a;

        /* synthetic */ C2217a(C2221y c2221y) {
        }

        /* renamed from: a */
        public C2216w m33953a() {
            return new C2216w(this.f6221a, null);
        }
    }

    /* synthetic */ C2216w(String str, C2223z c2223z) {
        this.f6220j = str;
    }

    /* renamed from: a */
    public static C2217a m33955a() {
        return new C2217a(null);
    }

    /* renamed from: b */
    public final Bundle m33954b() {
        Bundle bundle = new Bundle();
        String str = this.f6220j;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2216w)) {
            return false;
        }
        return C2190n.m34004b(this.f6220j, ((C2216w) obj).f6220j);
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f6220j);
    }
}
