package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p151i6.C7390b;
import p195k8.C9149a;
import p229m7.C10332q;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ExoPlaybackException extends Exception {

    /* renamed from: j */
    public final int f11162j;

    /* renamed from: k */
    public final String f11163k;

    /* renamed from: l */
    public final int f11164l;

    /* renamed from: m */
    public final Format f11165m;

    /* renamed from: n */
    public final int f11166n;

    /* renamed from: o */
    public final long f11167o;

    /* renamed from: p */
    public final C10332q f11168p;

    /* renamed from: q */
    final boolean f11169q;

    /* renamed from: r */
    private final Throwable f11170r;

    private ExoPlaybackException(int i, Throwable th2) {
        this(i, th2, null, null, -1, null, 4, false);
    }

    /* renamed from: b */
    public static ExoPlaybackException m29933b(Exception exc) {
        return new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
    }

    /* renamed from: c */
    public static ExoPlaybackException m29932c(Throwable th2, String str, int i, Format format, int i2, boolean z) {
        if (format == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th2, null, str, i, format, i2, z);
    }

    /* renamed from: d */
    public static ExoPlaybackException m29931d(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    /* renamed from: e */
    public static ExoPlaybackException m29930e(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    /* renamed from: f */
    private static String m29929f(int i, String str, String str2, int i2, Format format, int i3) {
        String str3;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    str3 = "Unexpected runtime error";
                } else {
                    str3 = "Remote error";
                }
            } else {
                str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + C7390b.m20793b(i3);
            }
        } else {
            str3 = "Source error";
        }
        if (!TextUtils.isEmpty(str)) {
            return str3 + ": " + str;
        }
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ExoPlaybackException m29934a(C10332q c10332q) {
        return new ExoPlaybackException(getMessage(), this.f11170r, this.f11162j, this.f11163k, this.f11164l, this.f11165m, this.f11166n, c10332q, this.f11167o, this.f11169q);
    }

    /* renamed from: g */
    public Exception m29928g() {
        boolean z = true;
        if (this.f11162j != 1) {
            z = false;
        }
        C9149a.m16447f(z);
        return (Exception) C9149a.m16448e(this.f11170r);
    }

    /* renamed from: h */
    public IOException m29927h() {
        boolean z;
        if (this.f11162j == 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        return (IOException) C9149a.m16448e(this.f11170r);
    }

    private ExoPlaybackException(int i, Throwable th2, String str, String str2, int i2, Format format, int i3, boolean z) {
        this(m29929f(i, str, str2, i2, format, i3), th2, i, str2, i2, format, i3, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(String str, Throwable th2, int i, String str2, int i2, Format format, int i3, C10332q c10332q, long j, boolean z) {
        super(str, th2);
        this.f11162j = i;
        this.f11170r = th2;
        this.f11163k = str2;
        this.f11164l = i2;
        this.f11165m = format;
        this.f11166n = i3;
        this.f11168p = c10332q;
        this.f11167o = j;
        this.f11169q = z;
    }
}
