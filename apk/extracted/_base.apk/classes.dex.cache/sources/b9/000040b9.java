package kotlinx.coroutines.internal;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, m14357d2 = {"", "propertyName", "b", "", "a", "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kotlinx.coroutines.internal.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9772f0 {

    /* renamed from: a */
    private static final int f25576a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m13320a() {
        return f25576a;
    }

    /* renamed from: b */
    public static final String m13319b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}