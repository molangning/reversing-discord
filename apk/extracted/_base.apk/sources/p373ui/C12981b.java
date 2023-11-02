package p373ui;

import java.text.DecimalFormat;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\" \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m14357d2 = {"", "a", "Z", "()Z", "durationAssertionsEnabled", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "b", "[Ljava/lang/ThreadLocal;", "precisionFormats", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ui.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12981b {

    /* renamed from: a */
    private static final boolean f33736a = false;

    /* renamed from: b */
    private static final ThreadLocal<DecimalFormat>[] f33737b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f33737b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m3537a() {
        return f33736a;
    }
}
