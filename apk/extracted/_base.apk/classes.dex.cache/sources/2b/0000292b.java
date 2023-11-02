package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9200u;
import p213l8.C10064b;
import p259o6.C11028l;
import p259o6.C11034m0;
import p259o6.InterfaceC10991b0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new C4361a();

    /* renamed from: A */
    public final int f11171A;

    /* renamed from: B */
    public final float f11172B;

    /* renamed from: C */
    public final int f11173C;

    /* renamed from: D */
    public final float f11174D;

    /* renamed from: E */
    public final byte[] f11175E;

    /* renamed from: F */
    public final int f11176F;

    /* renamed from: G */
    public final C10064b f11177G;

    /* renamed from: H */
    public final int f11178H;

    /* renamed from: I */
    public final int f11179I;

    /* renamed from: J */
    public final int f11180J;

    /* renamed from: K */
    public final int f11181K;

    /* renamed from: L */
    public final int f11182L;

    /* renamed from: M */
    public final int f11183M;

    /* renamed from: N */
    public final Class<? extends InterfaceC10991b0> f11184N;

    /* renamed from: O */
    private int f11185O;

    /* renamed from: j */
    public final String f11186j;

    /* renamed from: k */
    public final String f11187k;

    /* renamed from: l */
    public final String f11188l;

    /* renamed from: m */
    public final int f11189m;

    /* renamed from: n */
    public final int f11190n;

    /* renamed from: o */
    public final int f11191o;

    /* renamed from: p */
    public final int f11192p;

    /* renamed from: q */
    public final int f11193q;

    /* renamed from: r */
    public final String f11194r;

    /* renamed from: s */
    public final Metadata f11195s;

    /* renamed from: t */
    public final String f11196t;

    /* renamed from: u */
    public final String f11197u;

    /* renamed from: v */
    public final int f11198v;

    /* renamed from: w */
    public final List<byte[]> f11199w;

    /* renamed from: x */
    public final C11028l f11200x;

    /* renamed from: y */
    public final long f11201y;

    /* renamed from: z */
    public final int f11202z;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4361a implements Parcelable.Creator<Format> {
        C4361a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.Format$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4362b {

        /* renamed from: A */
        private int f11203A;

        /* renamed from: B */
        private int f11204B;

        /* renamed from: C */
        private int f11205C;

        /* renamed from: D */
        private Class<? extends InterfaceC10991b0> f11206D;

        /* renamed from: a */
        private String f11207a;

        /* renamed from: b */
        private String f11208b;

        /* renamed from: c */
        private String f11209c;

        /* renamed from: d */
        private int f11210d;

        /* renamed from: e */
        private int f11211e;

        /* renamed from: f */
        private int f11212f;

        /* renamed from: g */
        private int f11213g;

        /* renamed from: h */
        private String f11214h;

        /* renamed from: i */
        private Metadata f11215i;

        /* renamed from: j */
        private String f11216j;

        /* renamed from: k */
        private String f11217k;

        /* renamed from: l */
        private int f11218l;

        /* renamed from: m */
        private List<byte[]> f11219m;

        /* renamed from: n */
        private C11028l f11220n;

        /* renamed from: o */
        private long f11221o;

        /* renamed from: p */
        private int f11222p;

        /* renamed from: q */
        private int f11223q;

        /* renamed from: r */
        private float f11224r;

        /* renamed from: s */
        private int f11225s;

        /* renamed from: t */
        private float f11226t;

        /* renamed from: u */
        private byte[] f11227u;

        /* renamed from: v */
        private int f11228v;

        /* renamed from: w */
        private C10064b f11229w;

        /* renamed from: x */
        private int f11230x;

        /* renamed from: y */
        private int f11231y;

        /* renamed from: z */
        private int f11232z;

        /* synthetic */ C4362b(Format format, C4361a c4361a) {
            this(format);
        }

        /* renamed from: E */
        public Format m29914E() {
            return new Format(this, null);
        }

        /* renamed from: F */
        public C4362b m29913F(int i) {
            this.f11205C = i;
            return this;
        }

        /* renamed from: G */
        public C4362b m29912G(int i) {
            this.f11212f = i;
            return this;
        }

        /* renamed from: H */
        public C4362b m29911H(int i) {
            this.f11230x = i;
            return this;
        }

        /* renamed from: I */
        public C4362b m29910I(String str) {
            this.f11214h = str;
            return this;
        }

        /* renamed from: J */
        public C4362b m29909J(C10064b c10064b) {
            this.f11229w = c10064b;
            return this;
        }

        /* renamed from: K */
        public C4362b m29908K(String str) {
            this.f11216j = str;
            return this;
        }

        /* renamed from: L */
        public C4362b m29907L(C11028l c11028l) {
            this.f11220n = c11028l;
            return this;
        }

        /* renamed from: M */
        public C4362b m29906M(int i) {
            this.f11203A = i;
            return this;
        }

        /* renamed from: N */
        public C4362b m29905N(int i) {
            this.f11204B = i;
            return this;
        }

        /* renamed from: O */
        public C4362b m29904O(Class<? extends InterfaceC10991b0> cls) {
            this.f11206D = cls;
            return this;
        }

        /* renamed from: P */
        public C4362b m29903P(float f) {
            this.f11224r = f;
            return this;
        }

        /* renamed from: Q */
        public C4362b m29902Q(int i) {
            this.f11223q = i;
            return this;
        }

        /* renamed from: R */
        public C4362b m29901R(int i) {
            this.f11207a = Integer.toString(i);
            return this;
        }

        /* renamed from: S */
        public C4362b m29900S(String str) {
            this.f11207a = str;
            return this;
        }

        /* renamed from: T */
        public C4362b m29899T(List<byte[]> list) {
            this.f11219m = list;
            return this;
        }

        /* renamed from: U */
        public C4362b m29898U(String str) {
            this.f11208b = str;
            return this;
        }

        /* renamed from: V */
        public C4362b m29897V(String str) {
            this.f11209c = str;
            return this;
        }

        /* renamed from: W */
        public C4362b m29896W(int i) {
            this.f11218l = i;
            return this;
        }

        /* renamed from: X */
        public C4362b m29895X(Metadata metadata) {
            this.f11215i = metadata;
            return this;
        }

        /* renamed from: Y */
        public C4362b m29894Y(int i) {
            this.f11232z = i;
            return this;
        }

        /* renamed from: Z */
        public C4362b m29893Z(int i) {
            this.f11213g = i;
            return this;
        }

        /* renamed from: a0 */
        public C4362b m29891a0(float f) {
            this.f11226t = f;
            return this;
        }

        /* renamed from: b0 */
        public C4362b m29889b0(byte[] bArr) {
            this.f11227u = bArr;
            return this;
        }

        /* renamed from: c0 */
        public C4362b m29887c0(int i) {
            this.f11211e = i;
            return this;
        }

        /* renamed from: d0 */
        public C4362b m29885d0(int i) {
            this.f11225s = i;
            return this;
        }

        /* renamed from: e0 */
        public C4362b m29883e0(String str) {
            this.f11217k = str;
            return this;
        }

        /* renamed from: f0 */
        public C4362b m29881f0(int i) {
            this.f11231y = i;
            return this;
        }

        /* renamed from: g0 */
        public C4362b m29879g0(int i) {
            this.f11210d = i;
            return this;
        }

        /* renamed from: h0 */
        public C4362b m29877h0(int i) {
            this.f11228v = i;
            return this;
        }

        /* renamed from: i0 */
        public C4362b m29875i0(long j) {
            this.f11221o = j;
            return this;
        }

        /* renamed from: j0 */
        public C4362b m29873j0(int i) {
            this.f11222p = i;
            return this;
        }

        public C4362b() {
            this.f11212f = -1;
            this.f11213g = -1;
            this.f11218l = -1;
            this.f11221o = Long.MAX_VALUE;
            this.f11222p = -1;
            this.f11223q = -1;
            this.f11224r = -1.0f;
            this.f11226t = 1.0f;
            this.f11228v = -1;
            this.f11230x = -1;
            this.f11231y = -1;
            this.f11232z = -1;
            this.f11205C = -1;
        }

        private C4362b(Format format) {
            this.f11207a = format.f11186j;
            this.f11208b = format.f11187k;
            this.f11209c = format.f11188l;
            this.f11210d = format.f11189m;
            this.f11211e = format.f11190n;
            this.f11212f = format.f11191o;
            this.f11213g = format.f11192p;
            this.f11214h = format.f11194r;
            this.f11215i = format.f11195s;
            this.f11216j = format.f11196t;
            this.f11217k = format.f11197u;
            this.f11218l = format.f11198v;
            this.f11219m = format.f11199w;
            this.f11220n = format.f11200x;
            this.f11221o = format.f11201y;
            this.f11222p = format.f11202z;
            this.f11223q = format.f11171A;
            this.f11224r = format.f11172B;
            this.f11225s = format.f11173C;
            this.f11226t = format.f11174D;
            this.f11227u = format.f11175E;
            this.f11228v = format.f11176F;
            this.f11229w = format.f11177G;
            this.f11230x = format.f11178H;
            this.f11231y = format.f11179I;
            this.f11232z = format.f11180J;
            this.f11203A = format.f11181K;
            this.f11204B = format.f11182L;
            this.f11205C = format.f11183M;
            this.f11206D = format.f11184N;
        }
    }

    /* synthetic */ Format(C4362b c4362b, C4361a c4361a) {
        this(c4362b);
    }

    @Deprecated
    /* renamed from: d */
    public static Format m29924d(String str, String str2, int i, String str3) {
        return new C4362b().m29900S(str).m29897V(str3).m29879g0(i).m29883e0(str2).m29914E();
    }

    /* renamed from: a */
    public C4362b m29926a() {
        return new C4362b(this, null);
    }

    /* renamed from: b */
    public Format m29925b(Class<? extends InterfaceC10991b0> cls) {
        return m29926a().m29904O(cls).m29914E();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m29923e() {
        int i;
        int i2 = this.f11202z;
        if (i2 == -1 || (i = this.f11171A) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f11185O;
        if (i2 != 0 && (i = format.f11185O) != 0 && i2 != i) {
            return false;
        }
        if (this.f11189m == format.f11189m && this.f11190n == format.f11190n && this.f11191o == format.f11191o && this.f11192p == format.f11192p && this.f11198v == format.f11198v && this.f11201y == format.f11201y && this.f11202z == format.f11202z && this.f11171A == format.f11171A && this.f11173C == format.f11173C && this.f11176F == format.f11176F && this.f11178H == format.f11178H && this.f11179I == format.f11179I && this.f11180J == format.f11180J && this.f11181K == format.f11181K && this.f11182L == format.f11182L && this.f11183M == format.f11183M && Float.compare(this.f11172B, format.f11172B) == 0 && Float.compare(this.f11174D, format.f11174D) == 0 && C9191p0.m16257c(this.f11184N, format.f11184N) && C9191p0.m16257c(this.f11186j, format.f11186j) && C9191p0.m16257c(this.f11187k, format.f11187k) && C9191p0.m16257c(this.f11194r, format.f11194r) && C9191p0.m16257c(this.f11196t, format.f11196t) && C9191p0.m16257c(this.f11197u, format.f11197u) && C9191p0.m16257c(this.f11188l, format.f11188l) && Arrays.equals(this.f11175E, format.f11175E) && C9191p0.m16257c(this.f11195s, format.f11195s) && C9191p0.m16257c(this.f11177G, format.f11177G) && C9191p0.m16257c(this.f11200x, format.f11200x) && m29922h(format)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m29922h(Format format) {
        if (this.f11199w.size() != format.f11199w.size()) {
            return false;
        }
        for (int i = 0; i < this.f11199w.size(); i++) {
            if (!Arrays.equals(this.f11199w.get(i), format.f11199w.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.f11185O == 0) {
            String str = this.f11186j;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (527 + hashCode) * 31;
            String str2 = this.f11187k;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i4 = (i3 + i) * 31;
            String str3 = this.f11188l;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i5 = (((((((((i4 + hashCode2) * 31) + this.f11189m) * 31) + this.f11190n) * 31) + this.f11191o) * 31) + this.f11192p) * 31;
            String str4 = this.f11194r;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            Metadata metadata = this.f11195s;
            if (metadata == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = metadata.hashCode();
            }
            int i7 = (i6 + hashCode4) * 31;
            String str5 = this.f11196t;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i8 = (i7 + hashCode5) * 31;
            String str6 = this.f11197u;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int floatToIntBits = (((((((((((((((((((((((((((((i8 + hashCode6) * 31) + this.f11198v) * 31) + ((int) this.f11201y)) * 31) + this.f11202z) * 31) + this.f11171A) * 31) + Float.floatToIntBits(this.f11172B)) * 31) + this.f11173C) * 31) + Float.floatToIntBits(this.f11174D)) * 31) + this.f11176F) * 31) + this.f11178H) * 31) + this.f11179I) * 31) + this.f11180J) * 31) + this.f11181K) * 31) + this.f11182L) * 31) + this.f11183M) * 31;
            Class<? extends InterfaceC10991b0> cls = this.f11184N;
            if (cls != null) {
                i2 = cls.hashCode();
            }
            this.f11185O = floatToIntBits + i2;
        }
        return this.f11185O;
    }

    /* renamed from: j */
    public Format m29921j(Format format) {
        String str;
        Metadata m29249b;
        if (this == format) {
            return this;
        }
        int m16158l = C9200u.m16158l(this.f11197u);
        String str2 = format.f11186j;
        String str3 = format.f11187k;
        if (str3 == null) {
            str3 = this.f11187k;
        }
        String str4 = this.f11188l;
        if ((m16158l == 3 || m16158l == 1) && (str = format.f11188l) != null) {
            str4 = str;
        }
        int i = this.f11191o;
        if (i == -1) {
            i = format.f11191o;
        }
        int i2 = this.f11192p;
        if (i2 == -1) {
            i2 = format.f11192p;
        }
        String str5 = this.f11194r;
        if (str5 == null) {
            String m16293K = C9191p0.m16293K(format.f11194r, m16158l);
            if (C9191p0.m16282P0(m16293K).length == 1) {
                str5 = m16293K;
            }
        }
        Metadata metadata = this.f11195s;
        if (metadata == null) {
            m29249b = format.f11195s;
        } else {
            m29249b = metadata.m29249b(format.f11195s);
        }
        float f = this.f11172B;
        if (f == -1.0f && m16158l == 2) {
            f = format.f11172B;
        }
        int i3 = this.f11189m | format.f11189m;
        return m29926a().m29900S(str2).m29898U(str3).m29897V(str4).m29879g0(i3).m29887c0(this.f11190n | format.f11190n).m29912G(i).m29893Z(i2).m29910I(str5).m29895X(m29249b).m29907L(C11028l.m9317x(format.f11200x, this.f11200x)).m29903P(f).m29914E();
    }

    public String toString() {
        return "Format(" + this.f11186j + ", " + this.f11187k + ", " + this.f11196t + ", " + this.f11197u + ", " + this.f11194r + ", " + this.f11193q + ", " + this.f11188l + ", [" + this.f11202z + ", " + this.f11171A + ", " + this.f11172B + "], [" + this.f11178H + ", " + this.f11179I + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11186j);
        parcel.writeString(this.f11187k);
        parcel.writeString(this.f11188l);
        parcel.writeInt(this.f11189m);
        parcel.writeInt(this.f11190n);
        parcel.writeInt(this.f11191o);
        parcel.writeInt(this.f11192p);
        parcel.writeString(this.f11194r);
        boolean z = false;
        parcel.writeParcelable(this.f11195s, 0);
        parcel.writeString(this.f11196t);
        parcel.writeString(this.f11197u);
        parcel.writeInt(this.f11198v);
        int size = this.f11199w.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f11199w.get(i2));
        }
        parcel.writeParcelable(this.f11200x, 0);
        parcel.writeLong(this.f11201y);
        parcel.writeInt(this.f11202z);
        parcel.writeInt(this.f11171A);
        parcel.writeFloat(this.f11172B);
        parcel.writeInt(this.f11173C);
        parcel.writeFloat(this.f11174D);
        if (this.f11175E != null) {
            z = true;
        }
        C9191p0.m16262Z0(parcel, z);
        byte[] bArr = this.f11175E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f11176F);
        parcel.writeParcelable(this.f11177G, i);
        parcel.writeInt(this.f11178H);
        parcel.writeInt(this.f11179I);
        parcel.writeInt(this.f11180J);
        parcel.writeInt(this.f11181K);
        parcel.writeInt(this.f11182L);
        parcel.writeInt(this.f11183M);
    }

    private Format(C4362b c4362b) {
        this.f11186j = c4362b.f11207a;
        this.f11187k = c4362b.f11208b;
        this.f11188l = C9191p0.m16212y0(c4362b.f11209c);
        this.f11189m = c4362b.f11210d;
        this.f11190n = c4362b.f11211e;
        int i = c4362b.f11212f;
        this.f11191o = i;
        int i2 = c4362b.f11213g;
        this.f11192p = i2;
        this.f11193q = i2 != -1 ? i2 : i;
        this.f11194r = c4362b.f11214h;
        this.f11195s = c4362b.f11215i;
        this.f11196t = c4362b.f11216j;
        this.f11197u = c4362b.f11217k;
        this.f11198v = c4362b.f11218l;
        this.f11199w = c4362b.f11219m == null ? Collections.emptyList() : c4362b.f11219m;
        C11028l c11028l = c4362b.f11220n;
        this.f11200x = c11028l;
        this.f11201y = c4362b.f11221o;
        this.f11202z = c4362b.f11222p;
        this.f11171A = c4362b.f11223q;
        this.f11172B = c4362b.f11224r;
        this.f11173C = c4362b.f11225s == -1 ? 0 : c4362b.f11225s;
        this.f11174D = c4362b.f11226t == -1.0f ? 1.0f : c4362b.f11226t;
        this.f11175E = c4362b.f11227u;
        this.f11176F = c4362b.f11228v;
        this.f11177G = c4362b.f11229w;
        this.f11178H = c4362b.f11230x;
        this.f11179I = c4362b.f11231y;
        this.f11180J = c4362b.f11232z;
        this.f11181K = c4362b.f11203A == -1 ? 0 : c4362b.f11203A;
        this.f11182L = c4362b.f11204B != -1 ? c4362b.f11204B : 0;
        this.f11183M = c4362b.f11205C;
        if (c4362b.f11206D == null && c11028l != null) {
            this.f11184N = C11034m0.class;
        } else {
            this.f11184N = c4362b.f11206D;
        }
    }

    Format(Parcel parcel) {
        this.f11186j = parcel.readString();
        this.f11187k = parcel.readString();
        this.f11188l = parcel.readString();
        this.f11189m = parcel.readInt();
        this.f11190n = parcel.readInt();
        int readInt = parcel.readInt();
        this.f11191o = readInt;
        int readInt2 = parcel.readInt();
        this.f11192p = readInt2;
        this.f11193q = readInt2 != -1 ? readInt2 : readInt;
        this.f11194r = parcel.readString();
        this.f11195s = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f11196t = parcel.readString();
        this.f11197u = parcel.readString();
        this.f11198v = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f11199w = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            this.f11199w.add((byte[]) C9149a.m16448e(parcel.createByteArray()));
        }
        C11028l c11028l = (C11028l) parcel.readParcelable(C11028l.class.getClassLoader());
        this.f11200x = c11028l;
        this.f11201y = parcel.readLong();
        this.f11202z = parcel.readInt();
        this.f11171A = parcel.readInt();
        this.f11172B = parcel.readFloat();
        this.f11173C = parcel.readInt();
        this.f11174D = parcel.readFloat();
        this.f11175E = C9191p0.m16300G0(parcel) ? parcel.createByteArray() : null;
        this.f11176F = parcel.readInt();
        this.f11177G = (C10064b) parcel.readParcelable(C10064b.class.getClassLoader());
        this.f11178H = parcel.readInt();
        this.f11179I = parcel.readInt();
        this.f11180J = parcel.readInt();
        this.f11181K = parcel.readInt();
        this.f11182L = parcel.readInt();
        this.f11183M = parcel.readInt();
        this.f11184N = c11028l != null ? C11034m0.class : null;
    }
}