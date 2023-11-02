package gb;

import java.util.Collection;
import p102fb.C6378h;

/* renamed from: gb.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6655j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static StringBuilder m22239a(int i) {
        C6653i.m22245b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m22238b(Collection<?> collection, Object obj) {
        C6378h.m22834j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
