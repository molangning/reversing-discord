package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.C4419j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p195k8.C9149a;
import p195k8.C9191p0;
import p212l7.C10059c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class MediaItem {

    /* renamed from: a */
    public final String f11233a;

    /* renamed from: b */
    public final C4369g f11234b;

    /* renamed from: c */
    public final C4368f f11235c;

    /* renamed from: d */
    public final C4419j0 f11236d;

    /* renamed from: e */
    public final C4366d f11237e;

    /* renamed from: com.google.android.exoplayer2.MediaItem$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4364b {

        /* renamed from: a */
        public final Uri f11238a;

        /* renamed from: b */
        public final Object f11239b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4364b)) {
                return false;
            }
            C4364b c4364b = (C4364b) obj;
            if (this.f11238a.equals(c4364b.f11238a) && C9191p0.m16257c(this.f11239b, c4364b.f11239b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f11238a.hashCode() * 31;
            Object obj = this.f11239b;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        private C4364b(Uri uri, Object obj) {
            this.f11238a = uri;
            this.f11239b = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4365c {

        /* renamed from: A */
        private float f11240A;

        /* renamed from: B */
        private float f11241B;

        /* renamed from: a */
        private String f11242a;

        /* renamed from: b */
        private Uri f11243b;

        /* renamed from: c */
        private String f11244c;

        /* renamed from: d */
        private long f11245d;

        /* renamed from: e */
        private long f11246e;

        /* renamed from: f */
        private boolean f11247f;

        /* renamed from: g */
        private boolean f11248g;

        /* renamed from: h */
        private boolean f11249h;

        /* renamed from: i */
        private Uri f11250i;

        /* renamed from: j */
        private Map<String, String> f11251j;

        /* renamed from: k */
        private UUID f11252k;

        /* renamed from: l */
        private boolean f11253l;

        /* renamed from: m */
        private boolean f11254m;

        /* renamed from: n */
        private boolean f11255n;

        /* renamed from: o */
        private List<Integer> f11256o;

        /* renamed from: p */
        private byte[] f11257p;

        /* renamed from: q */
        private List<C10059c> f11258q;

        /* renamed from: r */
        private String f11259r;

        /* renamed from: s */
        private List<C4370h> f11260s;

        /* renamed from: t */
        private Uri f11261t;

        /* renamed from: u */
        private Object f11262u;

        /* renamed from: v */
        private Object f11263v;

        /* renamed from: w */
        private C4419j0 f11264w;

        /* renamed from: x */
        private long f11265x;

        /* renamed from: y */
        private long f11266y;

        /* renamed from: z */
        private long f11267z;

        /* renamed from: a */
        public MediaItem m29854a() {
            boolean z;
            C4369g c4369g;
            C4367e c4367e;
            C4364b c4364b;
            if (this.f11250i != null && this.f11252k == null) {
                z = false;
            } else {
                z = true;
            }
            C9149a.m16447f(z);
            Uri uri = this.f11243b;
            if (uri != null) {
                String str = this.f11244c;
                UUID uuid = this.f11252k;
                if (uuid != null) {
                    c4367e = new C4367e(uuid, this.f11250i, this.f11251j, this.f11253l, this.f11255n, this.f11254m, this.f11256o, this.f11257p);
                } else {
                    c4367e = null;
                }
                Uri uri2 = this.f11261t;
                if (uri2 != null) {
                    c4364b = new C4364b(uri2, this.f11262u);
                } else {
                    c4364b = null;
                }
                C4369g c4369g2 = new C4369g(uri, str, c4367e, c4364b, this.f11258q, this.f11259r, this.f11260s, this.f11263v);
                String str2 = this.f11242a;
                if (str2 == null) {
                    str2 = uri.toString();
                }
                this.f11242a = str2;
                c4369g = c4369g2;
            } else {
                c4369g = null;
            }
            String str3 = (String) C9149a.m16448e(this.f11242a);
            C4366d c4366d = new C4366d(this.f11245d, this.f11246e, this.f11247f, this.f11248g, this.f11249h);
            C4368f c4368f = new C4368f(this.f11265x, this.f11266y, this.f11267z, this.f11240A, this.f11241B);
            C4419j0 c4419j0 = this.f11264w;
            if (c4419j0 == null) {
                c4419j0 = new C4419j0.C4421b().m29279a();
            }
            return new MediaItem(str3, c4366d, c4369g, c4368f, c4419j0);
        }

        /* renamed from: b */
        public C4365c m29853b(String str) {
            this.f11259r = str;
            return this;
        }

        /* renamed from: c */
        public C4365c m29852c(long j) {
            this.f11265x = j;
            return this;
        }

        /* renamed from: d */
        public C4365c m29851d(String str) {
            this.f11242a = str;
            return this;
        }

        /* renamed from: e */
        public C4365c m29850e(String str) {
            this.f11244c = str;
            return this;
        }

        /* renamed from: f */
        public C4365c m29849f(List<C10059c> list) {
            List<C10059c> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.f11258q = emptyList;
            return this;
        }

        /* renamed from: g */
        public C4365c m29848g(List<C4370h> list) {
            List<C4370h> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.f11260s = emptyList;
            return this;
        }

        /* renamed from: h */
        public C4365c m29847h(Object obj) {
            this.f11263v = obj;
            return this;
        }

        /* renamed from: i */
        public C4365c m29846i(Uri uri) {
            this.f11243b = uri;
            return this;
        }

        /* renamed from: j */
        public C4365c m29845j(String str) {
            return m29846i(str == null ? null : Uri.parse(str));
        }

        public C4365c() {
            this.f11246e = Long.MIN_VALUE;
            this.f11256o = Collections.emptyList();
            this.f11251j = Collections.emptyMap();
            this.f11258q = Collections.emptyList();
            this.f11260s = Collections.emptyList();
            this.f11265x = -9223372036854775807L;
            this.f11266y = -9223372036854775807L;
            this.f11267z = -9223372036854775807L;
            this.f11240A = -3.4028235E38f;
            this.f11241B = -3.4028235E38f;
        }

        private C4365c(MediaItem mediaItem) {
            this();
            C4366d c4366d = mediaItem.f11237e;
            this.f11246e = c4366d.f11269b;
            this.f11247f = c4366d.f11270c;
            this.f11248g = c4366d.f11271d;
            this.f11245d = c4366d.f11268a;
            this.f11249h = c4366d.f11272e;
            this.f11242a = mediaItem.f11233a;
            this.f11264w = mediaItem.f11236d;
            C4368f c4368f = mediaItem.f11235c;
            this.f11265x = c4368f.f11282a;
            this.f11266y = c4368f.f11283b;
            this.f11267z = c4368f.f11284c;
            this.f11240A = c4368f.f11285d;
            this.f11241B = c4368f.f11286e;
            C4369g c4369g = mediaItem.f11234b;
            if (c4369g != null) {
                this.f11259r = c4369g.f11292f;
                this.f11244c = c4369g.f11288b;
                this.f11243b = c4369g.f11287a;
                this.f11258q = c4369g.f11291e;
                this.f11260s = c4369g.f11293g;
                this.f11263v = c4369g.f11294h;
                C4367e c4367e = c4369g.f11289c;
                if (c4367e != null) {
                    this.f11250i = c4367e.f11274b;
                    this.f11251j = c4367e.f11275c;
                    this.f11253l = c4367e.f11276d;
                    this.f11255n = c4367e.f11278f;
                    this.f11254m = c4367e.f11277e;
                    this.f11256o = c4367e.f11279g;
                    this.f11252k = c4367e.f11273a;
                    this.f11257p = c4367e.m29844a();
                }
                C4364b c4364b = c4369g.f11290d;
                if (c4364b != null) {
                    this.f11261t = c4364b.f11238a;
                    this.f11262u = c4364b.f11239b;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4366d {

        /* renamed from: a */
        public final long f11268a;

        /* renamed from: b */
        public final long f11269b;

        /* renamed from: c */
        public final boolean f11270c;

        /* renamed from: d */
        public final boolean f11271d;

        /* renamed from: e */
        public final boolean f11272e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4366d)) {
                return false;
            }
            C4366d c4366d = (C4366d) obj;
            if (this.f11268a == c4366d.f11268a && this.f11269b == c4366d.f11269b && this.f11270c == c4366d.f11270c && this.f11271d == c4366d.f11271d && this.f11272e == c4366d.f11272e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f11268a;
            long j2 = this.f11269b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f11270c ? 1 : 0)) * 31) + (this.f11271d ? 1 : 0)) * 31) + (this.f11272e ? 1 : 0);
        }

        private C4366d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f11268a = j;
            this.f11269b = j2;
            this.f11270c = z;
            this.f11271d = z2;
            this.f11272e = z3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4367e {

        /* renamed from: a */
        public final UUID f11273a;

        /* renamed from: b */
        public final Uri f11274b;

        /* renamed from: c */
        public final Map<String, String> f11275c;

        /* renamed from: d */
        public final boolean f11276d;

        /* renamed from: e */
        public final boolean f11277e;

        /* renamed from: f */
        public final boolean f11278f;

        /* renamed from: g */
        public final List<Integer> f11279g;

        /* renamed from: h */
        private final byte[] f11280h;

        /* renamed from: a */
        public byte[] m29844a() {
            byte[] bArr = this.f11280h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4367e)) {
                return false;
            }
            C4367e c4367e = (C4367e) obj;
            if (this.f11273a.equals(c4367e.f11273a) && C9191p0.m16257c(this.f11274b, c4367e.f11274b) && C9191p0.m16257c(this.f11275c, c4367e.f11275c) && this.f11276d == c4367e.f11276d && this.f11278f == c4367e.f11278f && this.f11277e == c4367e.f11277e && this.f11279g.equals(c4367e.f11279g) && Arrays.equals(this.f11280h, c4367e.f11280h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f11273a.hashCode() * 31;
            Uri uri = this.f11274b;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((hashCode + i) * 31) + this.f11275c.hashCode()) * 31) + (this.f11276d ? 1 : 0)) * 31) + (this.f11278f ? 1 : 0)) * 31) + (this.f11277e ? 1 : 0)) * 31) + this.f11279g.hashCode()) * 31) + Arrays.hashCode(this.f11280h);
        }

        private C4367e(UUID uuid, Uri uri, Map<String, String> map, boolean z, boolean z2, boolean z3, List<Integer> list, byte[] bArr) {
            C9149a.m16452a((z2 && uri == null) ? false : true);
            this.f11273a = uuid;
            this.f11274b = uri;
            this.f11275c = map;
            this.f11276d = z;
            this.f11278f = z2;
            this.f11277e = z3;
            this.f11279g = list;
            this.f11280h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4368f {

        /* renamed from: f */
        public static final C4368f f11281f = new C4368f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: a */
        public final long f11282a;

        /* renamed from: b */
        public final long f11283b;

        /* renamed from: c */
        public final long f11284c;

        /* renamed from: d */
        public final float f11285d;

        /* renamed from: e */
        public final float f11286e;

        public C4368f(long j, long j2, long j3, float f, float f2) {
            this.f11282a = j;
            this.f11283b = j2;
            this.f11284c = j3;
            this.f11285d = f;
            this.f11286e = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4368f)) {
                return false;
            }
            C4368f c4368f = (C4368f) obj;
            if (this.f11282a == c4368f.f11282a && this.f11283b == c4368f.f11283b && this.f11284c == c4368f.f11284c && this.f11285d == c4368f.f11285d && this.f11286e == c4368f.f11286e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.f11282a;
            long j2 = this.f11283b;
            long j3 = this.f11284c;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f11285d;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f11286e;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4369g {

        /* renamed from: a */
        public final Uri f11287a;

        /* renamed from: b */
        public final String f11288b;

        /* renamed from: c */
        public final C4367e f11289c;

        /* renamed from: d */
        public final C4364b f11290d;

        /* renamed from: e */
        public final List<C10059c> f11291e;

        /* renamed from: f */
        public final String f11292f;

        /* renamed from: g */
        public final List<C4370h> f11293g;

        /* renamed from: h */
        public final Object f11294h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4369g)) {
                return false;
            }
            C4369g c4369g = (C4369g) obj;
            if (this.f11287a.equals(c4369g.f11287a) && C9191p0.m16257c(this.f11288b, c4369g.f11288b) && C9191p0.m16257c(this.f11289c, c4369g.f11289c) && C9191p0.m16257c(this.f11290d, c4369g.f11290d) && this.f11291e.equals(c4369g.f11291e) && C9191p0.m16257c(this.f11292f, c4369g.f11292f) && this.f11293g.equals(c4369g.f11293g) && C9191p0.m16257c(this.f11294h, c4369g.f11294h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.f11287a.hashCode() * 31;
            String str = this.f11288b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode5 + hashCode) * 31;
            C4367e c4367e = this.f11289c;
            if (c4367e == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c4367e.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            C4364b c4364b = this.f11290d;
            if (c4364b == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = c4364b.hashCode();
            }
            int hashCode6 = (((i3 + hashCode3) * 31) + this.f11291e.hashCode()) * 31;
            String str2 = this.f11292f;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode4) * 31) + this.f11293g.hashCode()) * 31;
            Object obj = this.f11294h;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode7 + i;
        }

        private C4369g(Uri uri, String str, C4367e c4367e, C4364b c4364b, List<C10059c> list, String str2, List<C4370h> list2, Object obj) {
            this.f11287a = uri;
            this.f11288b = str;
            this.f11289c = c4367e;
            this.f11290d = c4364b;
            this.f11291e = list;
            this.f11292f = str2;
            this.f11293g = list2;
            this.f11294h = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.MediaItem$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4370h {

        /* renamed from: a */
        public final Uri f11295a;

        /* renamed from: b */
        public final String f11296b;

        /* renamed from: c */
        public final String f11297c;

        /* renamed from: d */
        public final int f11298d;

        /* renamed from: e */
        public final int f11299e;

        /* renamed from: f */
        public final String f11300f;

        public C4370h(Uri uri, String str, String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4370h)) {
                return false;
            }
            C4370h c4370h = (C4370h) obj;
            if (this.f11295a.equals(c4370h.f11295a) && this.f11296b.equals(c4370h.f11296b) && C9191p0.m16257c(this.f11297c, c4370h.f11297c) && this.f11298d == c4370h.f11298d && this.f11299e == c4370h.f11299e && C9191p0.m16257c(this.f11300f, c4370h.f11300f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f11295a.hashCode() * 31) + this.f11296b.hashCode()) * 31;
            String str = this.f11297c;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (((((hashCode2 + hashCode) * 31) + this.f11298d) * 31) + this.f11299e) * 31;
            String str2 = this.f11300f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public C4370h(Uri uri, String str, String str2, int i, int i2, String str3) {
            this.f11295a = uri;
            this.f11296b = str;
            this.f11297c = str2;
            this.f11298d = i;
            this.f11299e = i2;
            this.f11300f = str3;
        }
    }

    /* renamed from: b */
    public static MediaItem m29855b(String str) {
        return new C4365c().m29845j(str).m29854a();
    }

    /* renamed from: a */
    public C4365c m29856a() {
        return new C4365c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        if (C9191p0.m16257c(this.f11233a, mediaItem.f11233a) && this.f11237e.equals(mediaItem.f11237e) && C9191p0.m16257c(this.f11234b, mediaItem.f11234b) && C9191p0.m16257c(this.f11235c, mediaItem.f11235c) && C9191p0.m16257c(this.f11236d, mediaItem.f11236d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f11233a.hashCode() * 31;
        C4369g c4369g = this.f11234b;
        if (c4369g != null) {
            i = c4369g.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + this.f11235c.hashCode()) * 31) + this.f11237e.hashCode()) * 31) + this.f11236d.hashCode();
    }

    private MediaItem(String str, C4366d c4366d, C4369g c4369g, C4368f c4368f, C4419j0 c4419j0) {
        this.f11233a = str;
        this.f11234b = c4369g;
        this.f11235c = c4368f;
        this.f11236d = c4419j0;
        this.f11237e = c4366d;
    }
}