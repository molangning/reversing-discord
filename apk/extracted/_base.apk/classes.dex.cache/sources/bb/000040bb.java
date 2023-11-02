package kotlinx.coroutines.internal;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import kotlin.text.C9652n;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, m14357d2 = {"", "propertyName", "", "defaultValue", "c", "", "minValue", "maxValue", "a", "", "b", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kotlinx.coroutines.internal.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9774g0 {
    /* renamed from: a */
    public static final int m13310a(String str, int i, int i2, int i3) {
        return (int) C9770e0.m13325c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m13309b(String str, long j, long j2, long j3) {
        Long m13767o;
        String m13324d = C9770e0.m13324d(str);
        if (m13324d == null) {
            return j;
        }
        m13767o = C9652n.m13767o(m13324d);
        if (m13767o != null) {
            long longValue = m13767o.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m13324d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m13308c(String str, boolean z) {
        String m13324d = C9770e0.m13324d(str);
        return m13324d != null ? Boolean.parseBoolean(m13324d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m13307d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = ViewDefaults.NUMBER_OF_LINES;
        }
        return C9770e0.m13326b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m13306e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C9770e0.m13325c(str, j, j4, j3);
    }
}