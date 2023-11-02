package p114g4;

import android.net.Uri;
import com.facebook.common.internal.InterfaceC3561Fn;

/* renamed from: g4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6549e {
    /* renamed from: a */
    public static <T> Uri m22416a(T t, T t2, T[] tArr, InterfaceC3561Fn<T, Uri> interfaceC3561Fn) {
        T t3;
        Uri apply;
        Uri apply2;
        if (t != null && (apply2 = interfaceC3561Fn.apply(t)) != null) {
            return apply2;
        }
        if (tArr != null && tArr.length > 0 && (t3 = tArr[0]) != null && (apply = interfaceC3561Fn.apply(t3)) != null) {
            return apply;
        }
        if (t2 != null) {
            return interfaceC3561Fn.apply(t2);
        }
        return null;
    }
}