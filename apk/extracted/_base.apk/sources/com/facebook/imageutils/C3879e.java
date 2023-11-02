package com.facebook.imageutils;

import java.io.InputStream;
import p414x2.C13677a;

/* renamed from: com.facebook.imageutils.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C3879e {

    /* renamed from: a */
    private static final Class<?> f10898a = C3879e.class;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imageutils.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3881b {

        /* renamed from: a */
        boolean f10899a;

        /* renamed from: b */
        int f10900b;

        /* renamed from: c */
        int f10901c;

        private C3881b() {
        }
    }

    C3879e() {
    }

    /* renamed from: a */
    public static int m30543a(int i) {
        if (i != 3) {
            if (i != 6) {
                return i != 8 ? 0 : 270;
            }
            return 90;
        }
        return 180;
    }

    /* renamed from: b */
    private static int m30542b(InputStream inputStream, int i, boolean z) {
        if (i < 10 || C3878d.m30544a(inputStream, 2, z) != 3 || C3878d.m30544a(inputStream, 4, z) != 1) {
            return 0;
        }
        return C3878d.m30544a(inputStream, 2, z);
    }

    /* renamed from: c */
    private static int m30541c(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int m30544a = C3878d.m30544a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = m30544a - 1;
            if (m30544a <= 0 || i3 < 12) {
                break;
            }
            int i5 = i3 - 2;
            if (C3878d.m30544a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10L);
            i3 = i5 - 10;
            m30544a = i4;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m30540d(InputStream inputStream, int i) {
        C3881b c3881b = new C3881b();
        int m30539e = m30539e(inputStream, i, c3881b);
        int i2 = c3881b.f10901c - 8;
        if (m30539e != 0 && i2 <= m30539e) {
            inputStream.skip(i2);
            return m30542b(inputStream, m30541c(inputStream, m30539e - i2, c3881b.f10899a, 274), c3881b.f10899a);
        }
        return 0;
    }

    /* renamed from: e */
    private static int m30539e(InputStream inputStream, int i, C3881b c3881b) {
        boolean z;
        if (i <= 8) {
            return 0;
        }
        int m30544a = C3878d.m30544a(inputStream, 4, false);
        c3881b.f10900b = m30544a;
        int i2 = i - 4;
        if (m30544a != 1229531648 && m30544a != 1296891946) {
            C13677a.m1858f(f10898a, "Invalid TIFF header");
            return 0;
        }
        if (m30544a == 1229531648) {
            z = true;
        } else {
            z = false;
        }
        c3881b.f10899a = z;
        int m30544a2 = C3878d.m30544a(inputStream, 4, z);
        c3881b.f10901c = m30544a2;
        int i3 = i2 - 4;
        if (m30544a2 >= 8 && m30544a2 - 8 <= i3) {
            return i3;
        }
        C13677a.m1858f(f10898a, "Invalid offset");
        return 0;
    }
}
