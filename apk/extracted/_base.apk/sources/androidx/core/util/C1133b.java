package androidx.core.util;

/* renamed from: androidx.core.util.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1133b {
    /* renamed from: a */
    public static void m37836a(Object obj, StringBuilder sb2) {
        int lastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
