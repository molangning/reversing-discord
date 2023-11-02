package gb;

import p102fb.C6378h;

/* renamed from: gb.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6653i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22246a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m22245b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m22244c(boolean z) {
        C6378h.m22828p(z, "no calls to next() since the last call to remove()");
    }
}
