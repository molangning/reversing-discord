package ph;

import kotlin.jvm.internal.C9612q;
import kotlin.text.Regex;

/* renamed from: ph.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11639g {

    /* renamed from: a */
    public static final C11639g f30215a = new C11639g();

    /* renamed from: b */
    private static final Regex f30216b = new Regex("[^\\p{L}\\p{Digit}]");

    private C11639g() {
    }

    /* renamed from: a */
    public static final String m7418a(String name) {
        C9612q.m13917h(name, "name");
        return f30216b.m13867h(name, "_");
    }
}