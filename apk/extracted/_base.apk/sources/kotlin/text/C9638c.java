package kotlin.text;

import kotlin.Metadata;
import p355ti.C12798k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, m14357d2 = {"", "", "g", "other", "", "ignoreCase", "f", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/CharsKt")
/* renamed from: kotlin.text.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9638c extends C9637b {
    /* renamed from: f */
    public static final boolean m13849f(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static String m13848g(char c) {
        return C12798k.m3899a(c);
    }
}
