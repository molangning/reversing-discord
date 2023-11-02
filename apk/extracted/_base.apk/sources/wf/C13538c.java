package wf;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0002\u001a \u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002\u001a \u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0001\u001a \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, m14357d2 = {"", "a", "b", "e", "", "f", "c", ViewProps.START, ViewProps.END, "step", "d", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: wf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13538c {
    /* renamed from: a */
    private static final int m2279a(int i, int i2, int i3) {
        return m2275e(m2275e(i, i3) - m2275e(i2, i3), i3);
    }

    /* renamed from: b */
    private static final long m2278b(long j, long j2, long j3) {
        return m2274f(m2274f(j, j3) - m2274f(j2, j3), j3);
    }

    /* renamed from: c */
    public static final int m2277c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - m2279a(i2, i, i3);
            }
            return i2;
        } else if (i3 < 0) {
            if (i > i2) {
                return i2 + m2279a(i, i2, -i3);
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: d */
    public static final long m2276d(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            if (j < j2) {
                return j2 - m2278b(j2, j, j3);
            }
            return j2;
        } else if (i < 0) {
            if (j > j2) {
                return j2 + m2278b(j, j2, -j3);
            }
            return j2;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: e */
    private static final int m2275e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: f */
    private static final long m2274f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
