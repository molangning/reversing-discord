package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p195k8.C9149a;

/* renamed from: com.google.android.exoplayer2.upstream.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4515a {

    /* renamed from: a */
    public final Uri f12257a;

    /* renamed from: b */
    public final long f12258b;

    /* renamed from: c */
    public final int f12259c;

    /* renamed from: d */
    public final byte[] f12260d;

    /* renamed from: e */
    public final Map<String, String> f12261e;
    @Deprecated

    /* renamed from: f */
    public final long f12262f;

    /* renamed from: g */
    public final long f12263g;

    /* renamed from: h */
    public final long f12264h;

    /* renamed from: i */
    public final String f12265i;

    /* renamed from: j */
    public final int f12266j;

    /* renamed from: k */
    public final Object f12267k;

    /* renamed from: com.google.android.exoplayer2.upstream.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4517b {

        /* renamed from: a */
        private Uri f12268a;

        /* renamed from: b */
        private long f12269b;

        /* renamed from: c */
        private int f12270c;

        /* renamed from: d */
        private byte[] f12271d;

        /* renamed from: e */
        private Map<String, String> f12272e;

        /* renamed from: f */
        private long f12273f;

        /* renamed from: g */
        private long f12274g;

        /* renamed from: h */
        private String f12275h;

        /* renamed from: i */
        private int f12276i;

        /* renamed from: j */
        private Object f12277j;

        /* renamed from: a */
        public C4515a m28765a() {
            C9149a.m16444i(this.f12268a, "The uri must be set.");
            return new C4515a(this.f12268a, this.f12269b, this.f12270c, this.f12271d, this.f12272e, this.f12273f, this.f12274g, this.f12275h, this.f12276i, this.f12277j);
        }

        /* renamed from: b */
        public C4517b m28764b(int i) {
            this.f12276i = i;
            return this;
        }

        /* renamed from: c */
        public C4517b m28763c(byte[] bArr) {
            this.f12271d = bArr;
            return this;
        }

        /* renamed from: d */
        public C4517b m28762d(int i) {
            this.f12270c = i;
            return this;
        }

        /* renamed from: e */
        public C4517b m28761e(Map<String, String> map) {
            this.f12272e = map;
            return this;
        }

        /* renamed from: f */
        public C4517b m28760f(String str) {
            this.f12275h = str;
            return this;
        }

        /* renamed from: g */
        public C4517b m28759g(long j) {
            this.f12274g = j;
            return this;
        }

        /* renamed from: h */
        public C4517b m28758h(long j) {
            this.f12273f = j;
            return this;
        }

        /* renamed from: i */
        public C4517b m28757i(Uri uri) {
            this.f12268a = uri;
            return this;
        }

        /* renamed from: j */
        public C4517b m28756j(String str) {
            this.f12268a = Uri.parse(str);
            return this;
        }

        /* renamed from: k */
        public C4517b m28755k(long j) {
            this.f12269b = j;
            return this;
        }

        public C4517b() {
            this.f12270c = 1;
            this.f12272e = Collections.emptyMap();
            this.f12274g = -1L;
        }

        private C4517b(C4515a c4515a) {
            this.f12268a = c4515a.f12257a;
            this.f12269b = c4515a.f12258b;
            this.f12270c = c4515a.f12259c;
            this.f12271d = c4515a.f12260d;
            this.f12272e = c4515a.f12261e;
            this.f12273f = c4515a.f12263g;
            this.f12274g = c4515a.f12264h;
            this.f12275h = c4515a.f12265i;
            this.f12276i = c4515a.f12266j;
            this.f12277j = c4515a.f12267k;
        }
    }

    /* renamed from: c */
    public static String m28769c(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    /* renamed from: a */
    public C4517b m28771a() {
        return new C4517b();
    }

    /* renamed from: b */
    public final String m28770b() {
        return m28769c(this.f12259c);
    }

    /* renamed from: d */
    public boolean m28768d(int i) {
        return (this.f12266j & i) == i;
    }

    /* renamed from: e */
    public C4515a m28767e(long j) {
        long j2 = this.f12264h;
        return m28766f(j, j2 != -1 ? j2 - j : -1L);
    }

    /* renamed from: f */
    public C4515a m28766f(long j, long j2) {
        if (j == 0 && this.f12264h == j2) {
            return this;
        }
        return new C4515a(this.f12257a, this.f12258b, this.f12259c, this.f12260d, this.f12261e, this.f12263g + j, j2, this.f12265i, this.f12266j, this.f12267k);
    }

    public String toString() {
        return "DataSpec[" + m28770b() + " " + this.f12257a + ", " + this.f12263g + ", " + this.f12264h + ", " + this.f12265i + ", " + this.f12266j + "]";
    }

    public C4515a(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C4515a(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    private C4515a(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        C9149a.m16452a(j4 >= 0);
        C9149a.m16452a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C9149a.m16452a(z);
        this.f12257a = uri;
        this.f12258b = j;
        this.f12259c = i;
        this.f12260d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f12261e = Collections.unmodifiableMap(new HashMap(map));
        this.f12263g = j2;
        this.f12262f = j4;
        this.f12264h = j3;
        this.f12265i = str;
        this.f12266j = i2;
        this.f12267k = obj;
    }
}