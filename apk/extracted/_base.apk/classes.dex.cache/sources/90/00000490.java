package androidx.core.p018os;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: androidx.core.os.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1053d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1054a {
        /* renamed from: a */
        static <T> T m37982a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        /* renamed from: b */
        static <T> T[] m37981b(Bundle bundle, String str, Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        /* renamed from: c */
        static <T> ArrayList<T> m37980c(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        /* renamed from: d */
        static <T> SparseArray<T> m37979d(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    /* renamed from: a */
    public static <T> T m37983a(Bundle bundle, String str, Class<T> cls) {
        if (C1049a.m37987d()) {
            return (T) C1054a.m37982a(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (!cls.isInstance(t)) {
            return null;
        }
        return t;
    }
}