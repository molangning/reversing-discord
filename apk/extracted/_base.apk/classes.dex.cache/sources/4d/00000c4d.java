package com.budiyev.android.codescanner;

import com.google.zxing.Result;
import p136hc.C7063i;
import p136hc.C7065k;

/* renamed from: com.budiyev.android.codescanner.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2802e {

    /* renamed from: a */
    private final byte[] f7607a;

    /* renamed from: b */
    private final C2809i f7608b;

    /* renamed from: c */
    private final C2809i f7609c;

    /* renamed from: d */
    private final C2809i f7610d;

    /* renamed from: e */
    private final C2812l f7611e;

    /* renamed from: f */
    private final int f7612f;

    /* renamed from: g */
    private final boolean f7613g;

    public C2802e(byte[] bArr, C2809i c2809i, C2809i c2809i2, C2809i c2809i3, C2812l c2812l, int i, boolean z) {
        this.f7607a = bArr;
        this.f7608b = c2809i;
        this.f7609c = c2809i2;
        this.f7610d = c2809i3;
        this.f7611e = c2812l;
        this.f7612f = i;
        this.f7613g = z;
    }

    /* renamed from: a */
    public Result m32213a(C7063i c7063i) {
        int i;
        int i2;
        int m32188a = this.f7608b.m32188a();
        int m32187b = this.f7608b.m32187b();
        int i3 = this.f7612f;
        byte[] m32160q = C2814n.m32160q(this.f7607a, m32188a, m32187b, i3);
        if (i3 != 90 && i3 != 270) {
            i2 = m32188a;
            i = m32187b;
        } else {
            i = m32188a;
            i2 = m32187b;
        }
        C2812l m32164m = C2814n.m32164m(i2, i, this.f7611e, this.f7609c, this.f7610d);
        int m32179h = m32164m.m32179h();
        int m32183d = m32164m.m32183d();
        if (m32179h >= 1 && m32183d >= 1) {
            return C2814n.m32169h(c7063i, new C7065k(m32160q, i2, i, m32164m.m32182e(), m32164m.m32180g(), m32179h, m32183d, this.f7613g));
        }
        return null;
    }
}