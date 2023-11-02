package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m14357d2 = {"", "", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9788m {
    /* renamed from: a */
    public static final void m13266a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
