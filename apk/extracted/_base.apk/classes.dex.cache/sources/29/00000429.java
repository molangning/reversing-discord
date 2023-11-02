package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.core.p018os.C1049a;
import java.util.ArrayList;

/* renamed from: androidx.core.content.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0955e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0956a {
        /* renamed from: a */
        static <T> T[] m38373a(Intent intent, String str, Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        /* renamed from: b */
        static <T> ArrayList<T> m38372b(Intent intent, String str, Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        /* renamed from: c */
        static <T> T m38371c(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* renamed from: a */
    public static <T> ArrayList<T> m38375a(Intent intent, String str, Class<? extends T> cls) {
        if (C1049a.m37987d()) {
            return C0956a.m38372b(intent, str, cls);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    /* renamed from: b */
    public static <T> T m38374b(Intent intent, String str, Class<T> cls) {
        if (C1049a.m37987d()) {
            return (T) C0956a.m38371c(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (!cls.isInstance(t)) {
            return null;
        }
        return t;
    }
}