package p164j$.util.concurrent;

import java.security.PrivilegedAction;

/* renamed from: j$.util.concurrent.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8409x implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}