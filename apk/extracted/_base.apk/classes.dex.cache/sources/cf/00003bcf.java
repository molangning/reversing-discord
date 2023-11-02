package p164j$.util.stream;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.H3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8561H3 {

    /* renamed from: a */
    static final boolean f22693a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.stream.G3
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* renamed from: a */
    public static void m17571a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}