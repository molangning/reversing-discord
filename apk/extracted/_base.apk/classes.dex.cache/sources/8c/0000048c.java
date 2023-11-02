package androidx.core.p018os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1049a {
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: a */
    public static final int f3385a;
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: b */
    public static final int f3386b;
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: c */
    public static final int f3387c;
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: d */
    public static final int f3388d;

    /* renamed from: androidx.core.os.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C1050a {

        /* renamed from: a */
        static final int f3389a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b */
        static final int f3390b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c */
        static final int f3391c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d */
        static final int f3392d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i;
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 >= 30) {
            i = C1050a.f3389a;
        } else {
            i = 0;
        }
        f3385a = i;
        if (i4 >= 30) {
            i2 = C1050a.f3390b;
        } else {
            i2 = 0;
        }
        f3386b = i2;
        if (i4 >= 30) {
            i3 = C1050a.f3391c;
        } else {
            i3 = 0;
        }
        f3387c = i3;
        if (i4 >= 30) {
            i5 = C1050a.f3392d;
        }
        f3388d = i5;
    }

    /* renamed from: a */
    protected static boolean m37990a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m37989b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m37988c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 32 || !m37990a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m37987d() {
        if (Build.VERSION.SDK_INT >= 33 && m37990a("UpsideDownCake", Build.VERSION.CODENAME)) {
            return true;
        }
        return false;
    }
}