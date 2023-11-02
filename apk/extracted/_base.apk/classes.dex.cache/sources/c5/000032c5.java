package p099f8;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import gb.AbstractC6656j0;
import gb.AbstractC6675n;
import gb.AbstractC6693s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p099f8.AbstractC6341j;
import p099f8.C6318a;
import p099f8.C6344l;
import p099f8.InterfaceC6337h;
import p151i6.C7406q;
import p151i6.C7408s;
import p177jb.C8891c;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.C10344s0;
import p229m7.InterfaceC10341s;

/* renamed from: f8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6325f extends AbstractC6341j {

    /* renamed from: f */
    private static final int[] f17857f = new int[0];

    /* renamed from: g */
    private static final AbstractC6656j0<Integer> f17858g = AbstractC6656j0.m22237b(new Comparator() { // from class: f8.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m22976A;
            m22976A = C6325f.m22976A((Integer) obj, (Integer) obj2);
            return m22976A;
        }
    });

    /* renamed from: h */
    private static final AbstractC6656j0<Integer> f17859h = AbstractC6656j0.m22237b(new Comparator() { // from class: f8.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m22975B;
            m22975B = C6325f.m22975B((Integer) obj, (Integer) obj2);
            return m22975B;
        }
    });

    /* renamed from: d */
    private final InterfaceC6337h.InterfaceC6339b f17860d;

    /* renamed from: e */
    private final AtomicReference<C6329d> f17861e;

    /* renamed from: f8.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6327b implements Comparable<C6327b> {

        /* renamed from: j */
        public final boolean f17862j;

        /* renamed from: k */
        private final String f17863k;

        /* renamed from: l */
        private final C6329d f17864l;

        /* renamed from: m */
        private final boolean f17865m;

        /* renamed from: n */
        private final int f17866n;

        /* renamed from: o */
        private final int f17867o;

        /* renamed from: p */
        private final int f17868p;

        /* renamed from: q */
        private final int f17869q;

        /* renamed from: r */
        private final int f17870r;

        /* renamed from: s */
        private final boolean f17871s;

        /* renamed from: t */
        private final int f17872t;

        /* renamed from: u */
        private final int f17873u;

        /* renamed from: v */
        private final int f17874v;

        /* renamed from: w */
        private final int f17875w;

        public C6327b(Format format, C6329d c6329d, int i) {
            int i2;
            int i3;
            boolean z;
            int i4;
            this.f17864l = c6329d;
            this.f17863k = C6325f.m22973D(format.f11188l);
            int i5 = 0;
            this.f17865m = C6325f.m22949x(i, false);
            int i6 = 0;
            while (true) {
                int size = c6329d.f17974j.size();
                i2 = ViewDefaults.NUMBER_OF_LINES;
                if (i6 < size) {
                    i3 = C6325f.m22953t(format, c6329d.f17974j.get(i6), false);
                    if (i3 > 0) {
                        break;
                    }
                    i6++;
                } else {
                    i3 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f17867o = i6;
            this.f17866n = i3;
            this.f17868p = Integer.bitCount(format.f11190n & c6329d.f17975k);
            boolean z2 = true;
            if ((format.f11189m & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17871s = z;
            int i7 = format.f11178H;
            this.f17872t = i7;
            this.f17873u = format.f11179I;
            int i8 = format.f11193q;
            this.f17874v = i8;
            if ((i8 != -1 && i8 > c6329d.f17886H) || (i7 != -1 && i7 > c6329d.f17885G)) {
                z2 = false;
            }
            this.f17862j = z2;
            String[] m16248g0 = C9191p0.m16248g0();
            int i9 = 0;
            while (true) {
                if (i9 < m16248g0.length) {
                    i4 = C6325f.m22953t(format, m16248g0[i9], false);
                    if (i4 > 0) {
                        break;
                    }
                    i9++;
                } else {
                    i4 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f17869q = i9;
            this.f17870r = i4;
            while (true) {
                if (i5 < c6329d.f17891M.size()) {
                    String str = format.f11197u;
                    if (str != null && str.equals(c6329d.f17891M.get(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            this.f17875w = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C6327b c6327b) {
            AbstractC6656j0 mo22155j;
            AbstractC6656j0 abstractC6656j0;
            if (this.f17862j && this.f17865m) {
                mo22155j = C6325f.f17858g;
            } else {
                mo22155j = C6325f.f17858g.mo22155j();
            }
            AbstractC6675n mo22163f = AbstractC6675n.m22167j().mo22162g(this.f17865m, c6327b.f17865m).mo22163f(Integer.valueOf(this.f17867o), Integer.valueOf(c6327b.f17867o), AbstractC6656j0.m22235f().mo22155j()).mo22165d(this.f17866n, c6327b.f17866n).mo22165d(this.f17868p, c6327b.f17868p).mo22162g(this.f17862j, c6327b.f17862j).mo22163f(Integer.valueOf(this.f17875w), Integer.valueOf(c6327b.f17875w), AbstractC6656j0.m22235f().mo22155j());
            Integer valueOf = Integer.valueOf(this.f17874v);
            Integer valueOf2 = Integer.valueOf(c6327b.f17874v);
            if (this.f17864l.f17892N) {
                abstractC6656j0 = C6325f.f17858g.mo22155j();
            } else {
                abstractC6656j0 = C6325f.f17859h;
            }
            AbstractC6675n mo22163f2 = mo22163f.mo22163f(valueOf, valueOf2, abstractC6656j0).mo22162g(this.f17871s, c6327b.f17871s).mo22163f(Integer.valueOf(this.f17869q), Integer.valueOf(c6327b.f17869q), AbstractC6656j0.m22235f().mo22155j()).mo22165d(this.f17870r, c6327b.f17870r).mo22163f(Integer.valueOf(this.f17872t), Integer.valueOf(c6327b.f17872t), mo22155j).mo22163f(Integer.valueOf(this.f17873u), Integer.valueOf(c6327b.f17873u), mo22155j);
            Integer valueOf3 = Integer.valueOf(this.f17874v);
            Integer valueOf4 = Integer.valueOf(c6327b.f17874v);
            if (!C9191p0.m16257c(this.f17863k, c6327b.f17863k)) {
                mo22155j = C6325f.f17859h;
            }
            return mo22163f2.mo22163f(valueOf3, valueOf4, mo22155j).mo22160i();
        }
    }

    /* renamed from: f8.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6328c implements Comparable<C6328c> {

        /* renamed from: j */
        private final boolean f17876j;

        /* renamed from: k */
        private final boolean f17877k;

        public C6328c(Format format, int i) {
            this.f17876j = (format.f11189m & 1) != 0;
            this.f17877k = C6325f.m22949x(i, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C6328c c6328c) {
            return AbstractC6675n.m22167j().mo22162g(this.f17877k, c6328c.f17877k).mo22162g(this.f17876j, c6328c.f17876j).mo22160i();
        }
    }

    /* renamed from: f8.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6331e extends C6344l.C6346b {

        /* renamed from: A */
        private boolean f17908A;

        /* renamed from: B */
        private AbstractC6693s<String> f17909B;

        /* renamed from: C */
        private boolean f17910C;

        /* renamed from: D */
        private boolean f17911D;

        /* renamed from: E */
        private boolean f17912E;

        /* renamed from: F */
        private boolean f17913F;

        /* renamed from: G */
        private boolean f17914G;

        /* renamed from: H */
        private final SparseArray<Map<TrackGroupArray, C6332f>> f17915H;

        /* renamed from: I */
        private final SparseBooleanArray f17916I;

        /* renamed from: g */
        private int f17917g;

        /* renamed from: h */
        private int f17918h;

        /* renamed from: i */
        private int f17919i;

        /* renamed from: j */
        private int f17920j;

        /* renamed from: k */
        private int f17921k;

        /* renamed from: l */
        private int f17922l;

        /* renamed from: m */
        private int f17923m;

        /* renamed from: n */
        private int f17924n;

        /* renamed from: o */
        private boolean f17925o;

        /* renamed from: p */
        private boolean f17926p;

        /* renamed from: q */
        private boolean f17927q;

        /* renamed from: r */
        private int f17928r;

        /* renamed from: s */
        private int f17929s;

        /* renamed from: t */
        private boolean f17930t;

        /* renamed from: u */
        private AbstractC6693s<String> f17931u;

        /* renamed from: v */
        private int f17932v;

        /* renamed from: w */
        private int f17933w;

        /* renamed from: x */
        private boolean f17934x;

        /* renamed from: y */
        private boolean f17935y;

        /* renamed from: z */
        private boolean f17936z;

        /* renamed from: e */
        private static SparseArray<Map<TrackGroupArray, C6332f>> m22929e(SparseArray<Map<TrackGroupArray, C6332f>> sparseArray) {
            SparseArray<Map<TrackGroupArray, C6332f>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioMimeTypes"})
        /* renamed from: f */
        private void m22928f() {
            this.f17917g = ViewDefaults.NUMBER_OF_LINES;
            this.f17918h = ViewDefaults.NUMBER_OF_LINES;
            this.f17919i = ViewDefaults.NUMBER_OF_LINES;
            this.f17920j = ViewDefaults.NUMBER_OF_LINES;
            this.f17925o = true;
            this.f17926p = false;
            this.f17927q = true;
            this.f17928r = ViewDefaults.NUMBER_OF_LINES;
            this.f17929s = ViewDefaults.NUMBER_OF_LINES;
            this.f17930t = true;
            this.f17931u = AbstractC6693s.m22131x();
            this.f17932v = ViewDefaults.NUMBER_OF_LINES;
            this.f17933w = ViewDefaults.NUMBER_OF_LINES;
            this.f17934x = true;
            this.f17935y = false;
            this.f17936z = false;
            this.f17908A = false;
            this.f17909B = AbstractC6693s.m22131x();
            this.f17910C = false;
            this.f17911D = false;
            this.f17912E = true;
            this.f17913F = false;
            this.f17914G = true;
        }

        @Override // p099f8.C6344l.C6346b
        /* renamed from: d */
        public C6329d mo22884a() {
            return new C6329d(this.f17917g, this.f17918h, this.f17919i, this.f17920j, this.f17921k, this.f17922l, this.f17923m, this.f17924n, this.f17925o, this.f17926p, this.f17927q, this.f17928r, this.f17929s, this.f17930t, this.f17931u, this.f17980a, this.f17981b, this.f17932v, this.f17933w, this.f17934x, this.f17935y, this.f17936z, this.f17908A, this.f17909B, this.f17982c, this.f17983d, this.f17984e, this.f17985f, this.f17910C, this.f17911D, this.f17912E, this.f17913F, this.f17914G, this.f17915H, this.f17916I);
        }

        /* renamed from: g */
        public C6331e m22927g(int i) {
            this.f17920j = i;
            return this;
        }

        @Override // p099f8.C6344l.C6346b
        /* renamed from: h */
        public C6331e mo22883b(Context context) {
            super.mo22883b(context);
            return this;
        }

        /* renamed from: i */
        public final C6331e m22925i(int i, boolean z) {
            if (this.f17916I.get(i) == z) {
                return this;
            }
            if (z) {
                this.f17916I.put(i, true);
            } else {
                this.f17916I.delete(i);
            }
            return this;
        }

        /* renamed from: j */
        public final C6331e m22924j(int i, TrackGroupArray trackGroupArray, C6332f c6332f) {
            Map<TrackGroupArray, C6332f> map = this.f17915H.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f17915H.put(i, map);
            }
            if (map.containsKey(trackGroupArray) && C9191p0.m16257c(map.get(trackGroupArray), c6332f)) {
                return this;
            }
            map.put(trackGroupArray, c6332f);
            return this;
        }

        /* renamed from: k */
        public C6331e m22923k(int i, int i2, boolean z) {
            this.f17928r = i;
            this.f17929s = i2;
            this.f17930t = z;
            return this;
        }

        /* renamed from: l */
        public C6331e m22922l(Context context, boolean z) {
            Point m16287N = C9191p0.m16287N(context);
            return m22923k(m16287N.x, m16287N.y, z);
        }

        @Deprecated
        public C6331e() {
            m22928f();
            this.f17915H = new SparseArray<>();
            this.f17916I = new SparseBooleanArray();
        }

        public C6331e(Context context) {
            super(context);
            m22928f();
            this.f17915H = new SparseArray<>();
            this.f17916I = new SparseBooleanArray();
            m22922l(context, true);
        }

        private C6331e(C6329d c6329d) {
            super(c6329d);
            this.f17917g = c6329d.f17899r;
            this.f17918h = c6329d.f17900s;
            this.f17919i = c6329d.f17901t;
            this.f17920j = c6329d.f17902u;
            this.f17921k = c6329d.f17903v;
            this.f17922l = c6329d.f17904w;
            this.f17923m = c6329d.f17905x;
            this.f17924n = c6329d.f17906y;
            this.f17925o = c6329d.f17907z;
            this.f17926p = c6329d.f17879A;
            this.f17927q = c6329d.f17880B;
            this.f17928r = c6329d.f17881C;
            this.f17929s = c6329d.f17882D;
            this.f17930t = c6329d.f17883E;
            this.f17931u = c6329d.f17884F;
            this.f17932v = c6329d.f17885G;
            this.f17933w = c6329d.f17886H;
            this.f17934x = c6329d.f17887I;
            this.f17935y = c6329d.f17888J;
            this.f17936z = c6329d.f17889K;
            this.f17908A = c6329d.f17890L;
            this.f17909B = c6329d.f17891M;
            this.f17910C = c6329d.f17892N;
            this.f17911D = c6329d.f17893O;
            this.f17912E = c6329d.f17894P;
            this.f17913F = c6329d.f17895Q;
            this.f17914G = c6329d.f17896R;
            this.f17915H = m22929e(c6329d.f17897S);
            this.f17916I = c6329d.f17898T.clone();
        }
    }

    /* renamed from: f8.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6332f implements Parcelable {
        public static final Parcelable.Creator<C6332f> CREATOR = new C6333a();

        /* renamed from: j */
        public final int f17937j;

        /* renamed from: k */
        public final int[] f17938k;

        /* renamed from: l */
        public final int f17939l;

        /* renamed from: m */
        public final int f17940m;

        /* renamed from: n */
        public final int f17941n;

        /* renamed from: f8.f$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C6333a implements Parcelable.Creator<C6332f> {
            C6333a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6332f createFromParcel(Parcel parcel) {
                return new C6332f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C6332f[] newArray(int i) {
                return new C6332f[i];
            }
        }

        public C6332f(int i, int... iArr) {
            this(i, iArr, 2, 0);
        }

        /* renamed from: a */
        public boolean m22921a(int i) {
            for (int i2 : this.f17938k) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6332f.class != obj.getClass()) {
                return false;
            }
            C6332f c6332f = (C6332f) obj;
            if (this.f17937j == c6332f.f17937j && Arrays.equals(this.f17938k, c6332f.f17938k) && this.f17940m == c6332f.f17940m && this.f17941n == c6332f.f17941n) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f17937j * 31) + Arrays.hashCode(this.f17938k)) * 31) + this.f17940m) * 31) + this.f17941n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f17937j);
            parcel.writeInt(this.f17938k.length);
            parcel.writeIntArray(this.f17938k);
            parcel.writeInt(this.f17940m);
            parcel.writeInt(this.f17941n);
        }

        public C6332f(int i, int[] iArr, int i2, int i3) {
            this.f17937j = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f17938k = copyOf;
            this.f17939l = iArr.length;
            this.f17940m = i2;
            this.f17941n = i3;
            Arrays.sort(copyOf);
        }

        C6332f(Parcel parcel) {
            this.f17937j = parcel.readInt();
            int readByte = parcel.readByte();
            this.f17939l = readByte;
            int[] iArr = new int[readByte];
            this.f17938k = iArr;
            parcel.readIntArray(iArr);
            this.f17940m = parcel.readInt();
            this.f17941n = parcel.readInt();
        }
    }

    /* renamed from: f8.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6334g implements Comparable<C6334g> {

        /* renamed from: j */
        public final boolean f17942j;

        /* renamed from: k */
        private final boolean f17943k;

        /* renamed from: l */
        private final boolean f17944l;

        /* renamed from: m */
        private final boolean f17945m;

        /* renamed from: n */
        private final int f17946n;

        /* renamed from: o */
        private final int f17947o;

        /* renamed from: p */
        private final int f17948p;

        /* renamed from: q */
        private final int f17949q;

        /* renamed from: r */
        private final boolean f17950r;

        public C6334g(Format format, C6329d c6329d, int i, String str) {
            boolean z;
            boolean z2;
            AbstractC6693s<String> abstractC6693s;
            int i2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            this.f17943k = C6325f.m22949x(i, false);
            int i3 = format.f11189m & (~c6329d.f17979o);
            if ((i3 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17944l = z;
            if ((i3 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f17945m = z2;
            if (c6329d.f17976l.isEmpty()) {
                abstractC6693s = AbstractC6693s.m22130y("");
            } else {
                abstractC6693s = c6329d.f17976l;
            }
            int i4 = 0;
            while (true) {
                if (i4 < abstractC6693s.size()) {
                    i2 = C6325f.m22953t(format, abstractC6693s.get(i4), c6329d.f17978n);
                    if (i2 > 0) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = ViewDefaults.NUMBER_OF_LINES;
                    i2 = 0;
                    break;
                }
            }
            this.f17946n = i4;
            this.f17947o = i2;
            int bitCount = Integer.bitCount(format.f11190n & c6329d.f17977m);
            this.f17948p = bitCount;
            if ((format.f11190n & 1088) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f17950r = z3;
            if (C6325f.m22973D(str) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int m22953t = C6325f.m22953t(format, str, z4);
            this.f17949q = m22953t;
            if (i2 > 0 || ((c6329d.f17976l.isEmpty() && bitCount > 0) || this.f17944l || (this.f17945m && m22953t > 0))) {
                z5 = true;
            }
            this.f17942j = z5;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C6334g c6334g) {
            AbstractC6656j0 mo22155j;
            AbstractC6675n mo22162g = AbstractC6675n.m22167j().mo22162g(this.f17943k, c6334g.f17943k).mo22163f(Integer.valueOf(this.f17946n), Integer.valueOf(c6334g.f17946n), AbstractC6656j0.m22235f().mo22155j()).mo22165d(this.f17947o, c6334g.f17947o).mo22165d(this.f17948p, c6334g.f17948p).mo22162g(this.f17944l, c6334g.f17944l);
            Boolean valueOf = Boolean.valueOf(this.f17945m);
            Boolean valueOf2 = Boolean.valueOf(c6334g.f17945m);
            if (this.f17947o == 0) {
                mo22155j = AbstractC6656j0.m22235f();
            } else {
                mo22155j = AbstractC6656j0.m22235f().mo22155j();
            }
            AbstractC6675n mo22165d = mo22162g.mo22163f(valueOf, valueOf2, mo22155j).mo22165d(this.f17949q, c6334g.f17949q);
            if (this.f17948p == 0) {
                mo22165d = mo22165d.mo22161h(this.f17950r, c6334g.f17950r);
            }
            return mo22165d.mo22160i();
        }
    }

    /* renamed from: f8.f$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6335h implements Comparable<C6335h> {

        /* renamed from: j */
        public final boolean f17951j;

        /* renamed from: k */
        private final C6329d f17952k;

        /* renamed from: l */
        private final boolean f17953l;

        /* renamed from: m */
        private final boolean f17954m;

        /* renamed from: n */
        private final int f17955n;

        /* renamed from: o */
        private final int f17956o;

        /* renamed from: p */
        private final int f17957p;

        /* JADX WARN: Code restructure failed: missing block: B:93:0x0053, code lost:
            if (r10 < r8.f17905x) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x005b, code lost:
            if (r10 < r8.f17906y) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x008d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6335h(com.google.android.exoplayer2.Format r7, p099f8.C6325f.C6329d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f17952k = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f11202z
                if (r4 == r3) goto L14
                int r5 = r8.f17899r
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f11171A
                if (r4 == r3) goto L1c
                int r5 = r8.f17900s
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f11172B
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f17901t
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f11193q
                if (r4 == r3) goto L31
                int r5 = r8.f17902u
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f17951j = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f11202z
                if (r10 == r3) goto L40
                int r4 = r8.f17903v
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f11171A
                if (r10 == r3) goto L48
                int r4 = r8.f17904w
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f11172B
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f17905x
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f11193q
                if (r10 == r3) goto L5f
                int r0 = r8.f17906y
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f17953l = r1
                boolean r9 = p099f8.C6325f.m22949x(r9, r2)
                r6.f17954m = r9
                int r9 = r7.f11193q
                r6.f17955n = r9
                int r9 = r7.m29923e()
                r6.f17956o = r9
            L71:
                gb.s<java.lang.String> r9 = r8.f17884F
                int r9 = r9.size()
                if (r2 >= r9) goto L8d
                java.lang.String r9 = r7.f11197u
                if (r9 == 0) goto L8a
                gb.s<java.lang.String> r10 = r8.f17884F
                java.lang.Object r10 = r10.get(r2)
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L8a
                goto L90
            L8a:
                int r2 = r2 + 1
                goto L71
            L8d:
                r2 = 2147483647(0x7fffffff, float:NaN)
            L90:
                r6.f17957p = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p099f8.C6325f.C6335h.<init>(com.google.android.exoplayer2.Format, f8.f$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C6335h c6335h) {
            AbstractC6656j0 mo22155j;
            AbstractC6656j0 abstractC6656j0;
            if (this.f17951j && this.f17954m) {
                mo22155j = C6325f.f17858g;
            } else {
                mo22155j = C6325f.f17858g.mo22155j();
            }
            AbstractC6675n mo22163f = AbstractC6675n.m22167j().mo22162g(this.f17954m, c6335h.f17954m).mo22162g(this.f17951j, c6335h.f17951j).mo22162g(this.f17953l, c6335h.f17953l).mo22163f(Integer.valueOf(this.f17957p), Integer.valueOf(c6335h.f17957p), AbstractC6656j0.m22235f().mo22155j());
            Integer valueOf = Integer.valueOf(this.f17955n);
            Integer valueOf2 = Integer.valueOf(c6335h.f17955n);
            if (this.f17952k.f17892N) {
                abstractC6656j0 = C6325f.f17858g.mo22155j();
            } else {
                abstractC6656j0 = C6325f.f17859h;
            }
            return mo22163f.mo22163f(valueOf, valueOf2, abstractC6656j0).mo22163f(Integer.valueOf(this.f17956o), Integer.valueOf(c6335h.f17956o), mo22155j).mo22163f(Integer.valueOf(this.f17955n), Integer.valueOf(c6335h.f17955n), mo22155j).mo22160i();
        }
    }

    @Deprecated
    public C6325f(InterfaceC6337h.InterfaceC6339b interfaceC6339b) {
        this(C6329d.f17878U, interfaceC6339b);
    }

    /* renamed from: A */
    public static /* synthetic */ int m22976A(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() != -1) {
                return -1;
            }
            return 0;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* renamed from: B */
    public static /* synthetic */ int m22975B(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: C */
    private static void m22974C(AbstractC6341j.C6342a c6342a, int[][][] iArr, C7408s[] c7408sArr, InterfaceC6337h[] interfaceC6337hArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < c6342a.m22895c(); i3++) {
            int m22894d = c6342a.m22894d(i3);
            InterfaceC6337h interfaceC6337h = interfaceC6337hArr[i3];
            if ((m22894d == 1 || m22894d == 2) && interfaceC6337h != null && m22972E(iArr[i3], c6342a.m22893e(i3), interfaceC6337h)) {
                if (m22894d == 1) {
                    if (i2 == -1) {
                        i2 = i3;
                    } else {
                        z = false;
                        break;
                    }
                } else if (i != -1) {
                    z = false;
                    break;
                } else {
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z & z2) {
            C7408s c7408s = new C7408s(true);
            c7408sArr[i2] = c7408s;
            c7408sArr[i] = c7408s;
        }
    }

    /* renamed from: D */
    protected static String m22973D(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: E */
    private static boolean m22972E(int[][] iArr, TrackGroupArray trackGroupArray, InterfaceC6337h interfaceC6337h) {
        if (interfaceC6337h == null) {
            return false;
        }
        int m29143b = trackGroupArray.m29143b(interfaceC6337h.mo22888i());
        for (int i = 0; i < interfaceC6337h.length(); i++) {
            if (C7406q.m20721e(iArr[m29143b][interfaceC6337h.mo22890d(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private static InterfaceC6337h.C6338a m22971F(TrackGroupArray trackGroupArray, int[][] iArr, int i, C6329d c6329d) {
        int i2;
        boolean z;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C6329d c6329d2 = c6329d;
        if (c6329d2.f17880B) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        if (c6329d2.f17879A && (i & i2) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 0;
        while (i3 < trackGroupArray2.f11764j) {
            C10344s0 m29144a = trackGroupArray2.m29144a(i3);
            int i4 = i3;
            int[] m22954s = m22954s(m29144a, iArr[i3], z, i2, c6329d2.f17899r, c6329d2.f17900s, c6329d2.f17901t, c6329d2.f17902u, c6329d2.f17903v, c6329d2.f17904w, c6329d2.f17905x, c6329d2.f17906y, c6329d2.f17881C, c6329d2.f17882D, c6329d2.f17883E);
            if (m22954s.length > 0) {
                return new InterfaceC6337h.C6338a(m29144a, m22954s);
            }
            i3 = i4 + 1;
            trackGroupArray2 = trackGroupArray;
            c6329d2 = c6329d;
        }
        return null;
    }

    /* renamed from: I */
    private static InterfaceC6337h.C6338a m22968I(TrackGroupArray trackGroupArray, int[][] iArr, C6329d c6329d) {
        int i = -1;
        C10344s0 c10344s0 = null;
        C6335h c6335h = null;
        for (int i2 = 0; i2 < trackGroupArray.f11764j; i2++) {
            C10344s0 m29144a = trackGroupArray.m29144a(i2);
            List<Integer> m22950w = m22950w(m29144a, c6329d.f17881C, c6329d.f17882D, c6329d.f17883E);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < m29144a.f27056j; i3++) {
                Format m11721a = m29144a.m11721a(i3);
                if ((m11721a.f11190n & 16384) == 0 && m22949x(iArr2[i3], c6329d.f17894P)) {
                    C6335h c6335h2 = new C6335h(m11721a, c6329d, iArr2[i3], m22950w.contains(Integer.valueOf(i3)));
                    if ((c6335h2.f17951j || c6329d.f17907z) && (c6335h == null || c6335h2.compareTo(c6335h) > 0)) {
                        c10344s0 = m29144a;
                        i = i3;
                        c6335h = c6335h2;
                    }
                }
            }
        }
        if (c10344s0 == null) {
            return null;
        }
        return new InterfaceC6337h.C6338a(c10344s0, i);
    }

    /* renamed from: p */
    private static void m22957p(C10344s0 c10344s0, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!m22947z(c10344s0.m11721a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    /* renamed from: q */
    private static int[] m22956q(C10344s0 c10344s0, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        Format m11721a = c10344s0.m11721a(i);
        int[] iArr2 = new int[c10344s0.f27056j];
        int i3 = 0;
        for (int i4 = 0; i4 < c10344s0.f27056j; i4++) {
            if (i4 == i || m22948y(c10344s0.m11721a(i4), iArr[i4], m11721a, i2, z, z2, z3)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return Arrays.copyOf(iArr2, i3);
    }

    /* renamed from: r */
    private static int m22955r(C10344s0 c10344s0, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = list.get(i11).intValue();
            if (m22947z(c10344s0.m11721a(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: s */
    private static int[] m22954s(C10344s0 c10344s0, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        int i12;
        int i13;
        HashSet hashSet;
        if (c10344s0.f27056j < 2) {
            return f17857f;
        }
        List<Integer> m22950w = m22950w(c10344s0, i10, i11, z2);
        if (m22950w.size() < 2) {
            return f17857f;
        }
        if (!z) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < m22950w.size()) {
                String str3 = c10344s0.m11721a(m22950w.get(i15).intValue()).f11197u;
                if (hashSet2.add(str3)) {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                    int m22955r = m22955r(c10344s0, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, m22950w);
                    if (m22955r > i12) {
                        i14 = m22955r;
                        str2 = str3;
                        i15 = i13 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                }
                i14 = i12;
                i15 = i13 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        m22957p(c10344s0, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, m22950w);
        if (m22950w.size() < 2) {
            return f17857f;
        }
        return C8891c.m17070k(m22950w);
    }

    /* renamed from: t */
    protected static int m22953t(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f11188l)) {
            return 4;
        }
        String m22973D = m22973D(str);
        String m22973D2 = m22973D(format.f11188l);
        if (m22973D2 != null && m22973D != null) {
            if (!m22973D2.startsWith(m22973D) && !m22973D.startsWith(m22973D2)) {
                if (!C9191p0.m16284O0(m22973D2, "-")[0].equals(C9191p0.m16284O0(m22973D, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || m22973D2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x000d, code lost:
        if (r1 != r3) goto L8;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point m22952u(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p195k8.C9191p0.m16239l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p195k8.C9191p0.m16239l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p099f8.C6325f.m22952u(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: w */
    private static List<Integer> m22950w(C10344s0 c10344s0, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(c10344s0.f27056j);
        for (int i4 = 0; i4 < c10344s0.f27056j; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < c10344s0.f27056j; i6++) {
                Format m11721a = c10344s0.m11721a(i6);
                int i7 = m11721a.f11202z;
                if (i7 > 0 && (i3 = m11721a.f11171A) > 0) {
                    Point m22952u = m22952u(z, i, i2, i7, i3);
                    int i8 = m11721a.f11202z;
                    int i9 = m11721a.f11171A;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (m22952u.x * 0.98f)) && i9 >= ((int) (m22952u.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int m29923e = c10344s0.m11721a(((Integer) arrayList.get(size)).intValue()).m29923e();
                    if (m29923e == -1 || m29923e > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    protected static boolean m22949x(int i, boolean z) {
        int m20722d = C7406q.m20722d(i);
        return m20722d == 4 || (z && m20722d == 3);
    }

    /* renamed from: y */
    private static boolean m22948y(Format format, int i, Format format2, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        String str;
        int i5;
        if (!m22949x(i, false) || (i3 = format.f11193q) == -1 || i3 > i2) {
            return false;
        }
        if (!z3 && ((i5 = format.f11178H) == -1 || i5 != format2.f11178H)) {
            return false;
        }
        if (!z && ((str = format.f11197u) == null || !TextUtils.equals(str, format2.f11197u))) {
            return false;
        }
        if (!z2 && ((i4 = format.f11179I) == -1 || i4 != format2.f11179I)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private static boolean m22947z(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((format.f11190n & 16384) != 0 || !m22949x(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C9191p0.m16257c(format.f11197u, str)) {
            return false;
        }
        int i11 = format.f11202z;
        if (i11 != -1 && (i7 > i11 || i11 > i3)) {
            return false;
        }
        int i12 = format.f11171A;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        float f = format.f11172B;
        if (f != -1.0f && (i9 > f || f > i5)) {
            return false;
        }
        int i13 = format.f11193q;
        if (i13 != -1 && (i10 > i13 || i13 > i6)) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    protected InterfaceC6337h.C6338a[] m22970G(AbstractC6341j.C6342a c6342a, int[][][] iArr, int[] iArr2, C6329d c6329d) {
        int i;
        String str;
        int i2;
        C6327b c6327b;
        String str2;
        int i3;
        int i4;
        int m22895c = c6342a.m22895c();
        InterfaceC6337h.C6338a[] c6338aArr = new InterfaceC6337h.C6338a[m22895c];
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        boolean z2 = false;
        while (true) {
            i = true;
            if (i6 >= m22895c) {
                break;
            }
            if (2 == c6342a.m22894d(i6)) {
                if (!z) {
                    InterfaceC6337h.C6338a m22965L = m22965L(c6342a.m22893e(i6), iArr[i6], iArr2[i6], c6329d, true);
                    c6338aArr[i6] = m22965L;
                    if (m22965L != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (c6342a.m22893e(i6).f11764j <= 0) {
                    i = false;
                }
                z2 |= i;
            }
            i6++;
        }
        int i7 = 0;
        int i8 = -1;
        C6327b c6327b2 = null;
        String str3 = null;
        while (i7 < m22895c) {
            if (i == c6342a.m22894d(i7)) {
                if (!c6329d.f17896R && z2) {
                    i4 = false;
                } else {
                    i4 = i;
                }
                i2 = i8;
                c6327b = c6327b2;
                str2 = str3;
                i3 = i7;
                Pair<InterfaceC6337h.C6338a, C6327b> m22969H = m22969H(c6342a.m22893e(i7), iArr[i7], iArr2[i7], c6329d, i4);
                if (m22969H != null && (c6327b == null || ((C6327b) m22969H.second).compareTo(c6327b) > 0)) {
                    if (i2 != -1) {
                        c6338aArr[i2] = null;
                    }
                    InterfaceC6337h.C6338a c6338a = (InterfaceC6337h.C6338a) m22969H.first;
                    c6338aArr[i3] = c6338a;
                    str3 = c6338a.f17958a.m11721a(c6338a.f17959b[0]).f11188l;
                    c6327b2 = (C6327b) m22969H.second;
                    i8 = i3;
                    i7 = i3 + 1;
                    i = true;
                }
            } else {
                i2 = i8;
                c6327b = c6327b2;
                str2 = str3;
                i3 = i7;
            }
            i8 = i2;
            c6327b2 = c6327b;
            str3 = str2;
            i7 = i3 + 1;
            i = true;
        }
        String str4 = str3;
        int i9 = -1;
        C6334g c6334g = null;
        while (i5 < m22895c) {
            int m22894d = c6342a.m22894d(i5);
            if (m22894d != 1) {
                if (m22894d != 2) {
                    if (m22894d != 3) {
                        c6338aArr[i5] = m22967J(m22894d, c6342a.m22893e(i5), iArr[i5], c6329d);
                    } else {
                        str = str4;
                        Pair<InterfaceC6337h.C6338a, C6334g> m22966K = m22966K(c6342a.m22893e(i5), iArr[i5], c6329d, str);
                        if (m22966K != null && (c6334g == null || ((C6334g) m22966K.second).compareTo(c6334g) > 0)) {
                            if (i9 != -1) {
                                c6338aArr[i9] = null;
                            }
                            c6338aArr[i5] = (InterfaceC6337h.C6338a) m22966K.first;
                            c6334g = (C6334g) m22966K.second;
                            i9 = i5;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i5++;
            str4 = str;
        }
        return c6338aArr;
    }

    /* renamed from: H */
    protected Pair<InterfaceC6337h.C6338a, C6327b> m22969H(TrackGroupArray trackGroupArray, int[][] iArr, int i, C6329d c6329d, boolean z) {
        InterfaceC6337h.C6338a c6338a = null;
        int i2 = -1;
        int i3 = -1;
        C6327b c6327b = null;
        for (int i4 = 0; i4 < trackGroupArray.f11764j; i4++) {
            C10344s0 m29144a = trackGroupArray.m29144a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < m29144a.f27056j; i5++) {
                if (m22949x(iArr2[i5], c6329d.f17894P)) {
                    C6327b c6327b2 = new C6327b(m29144a.m11721a(i5), c6329d, iArr2[i5]);
                    if ((c6327b2.f17862j || c6329d.f17887I) && (c6327b == null || c6327b2.compareTo(c6327b) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        c6327b = c6327b2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        C10344s0 m29144a2 = trackGroupArray.m29144a(i2);
        if (!c6329d.f17893O && !c6329d.f17892N && z) {
            int[] m22956q = m22956q(m29144a2, iArr[i2], i3, c6329d.f17886H, c6329d.f17888J, c6329d.f17889K, c6329d.f17890L);
            if (m22956q.length > 1) {
                c6338a = new InterfaceC6337h.C6338a(m29144a2, m22956q);
            }
        }
        if (c6338a == null) {
            c6338a = new InterfaceC6337h.C6338a(m29144a2, i3);
        }
        return Pair.create(c6338a, (C6327b) C9149a.m16448e(c6327b));
    }

    /* renamed from: J */
    protected InterfaceC6337h.C6338a m22967J(int i, TrackGroupArray trackGroupArray, int[][] iArr, C6329d c6329d) {
        C10344s0 c10344s0 = null;
        C6328c c6328c = null;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.f11764j; i3++) {
            C10344s0 m29144a = trackGroupArray.m29144a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < m29144a.f27056j; i4++) {
                if (m22949x(iArr2[i4], c6329d.f17894P)) {
                    C6328c c6328c2 = new C6328c(m29144a.m11721a(i4), iArr2[i4]);
                    if (c6328c == null || c6328c2.compareTo(c6328c) > 0) {
                        c10344s0 = m29144a;
                        i2 = i4;
                        c6328c = c6328c2;
                    }
                }
            }
        }
        if (c10344s0 == null) {
            return null;
        }
        return new InterfaceC6337h.C6338a(c10344s0, i2);
    }

    /* renamed from: K */
    protected Pair<InterfaceC6337h.C6338a, C6334g> m22966K(TrackGroupArray trackGroupArray, int[][] iArr, C6329d c6329d, String str) {
        int i = -1;
        C10344s0 c10344s0 = null;
        C6334g c6334g = null;
        for (int i2 = 0; i2 < trackGroupArray.f11764j; i2++) {
            C10344s0 m29144a = trackGroupArray.m29144a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < m29144a.f27056j; i3++) {
                if (m22949x(iArr2[i3], c6329d.f17894P)) {
                    C6334g c6334g2 = new C6334g(m29144a.m11721a(i3), c6329d, iArr2[i3], str);
                    if (c6334g2.f17942j && (c6334g == null || c6334g2.compareTo(c6334g) > 0)) {
                        c10344s0 = m29144a;
                        i = i3;
                        c6334g = c6334g2;
                    }
                }
            }
        }
        if (c10344s0 == null) {
            return null;
        }
        return Pair.create(new InterfaceC6337h.C6338a(c10344s0, i), (C6334g) C9149a.m16448e(c6334g));
    }

    /* renamed from: L */
    protected InterfaceC6337h.C6338a m22965L(TrackGroupArray trackGroupArray, int[][] iArr, int i, C6329d c6329d, boolean z) {
        InterfaceC6337h.C6338a c6338a;
        if (!c6329d.f17893O && !c6329d.f17892N && z) {
            c6338a = m22971F(trackGroupArray, iArr, i, c6329d);
        } else {
            c6338a = null;
        }
        if (c6338a == null) {
            return m22968I(trackGroupArray, iArr, c6329d);
        }
        return c6338a;
    }

    /* renamed from: M */
    public void m22964M(C6329d c6329d) {
        C9149a.m16448e(c6329d);
        if (!this.f17861e.getAndSet(c6329d).equals(c6329d)) {
            m22879c();
        }
    }

    /* renamed from: N */
    public void m22963N(C6331e c6331e) {
        m22964M(c6331e.mo22884a());
    }

    @Override // p099f8.AbstractC6341j
    /* renamed from: j */
    protected final Pair<C7408s[], InterfaceC6337h[]> mo22898j(AbstractC6341j.C6342a c6342a, int[][][] iArr, int[] iArr2, InterfaceC10341s.C10342a c10342a, Timeline timeline) {
        boolean z;
        C7408s c7408s;
        C6329d c6329d = this.f17861e.get();
        int m22895c = c6342a.m22895c();
        InterfaceC6337h.C6338a[] m22970G = m22970G(c6342a, iArr, iArr2, c6329d);
        int i = 0;
        while (true) {
            InterfaceC6337h.C6338a c6338a = null;
            if (i >= m22895c) {
                break;
            }
            if (c6329d.m22937r(i)) {
                m22970G[i] = null;
            } else {
                TrackGroupArray m22893e = c6342a.m22893e(i);
                if (c6329d.m22935x(i, m22893e)) {
                    C6332f m22936u = c6329d.m22936u(i, m22893e);
                    if (m22936u != null) {
                        c6338a = new InterfaceC6337h.C6338a(m22893e.m29144a(m22936u.f17937j), m22936u.f17938k, m22936u.f17940m, Integer.valueOf(m22936u.f17941n));
                    }
                    m22970G[i] = c6338a;
                }
            }
            i++;
        }
        InterfaceC6337h[] mo22903a = this.f17860d.mo22903a(m22970G, m22881a(), c10342a, timeline);
        C7408s[] c7408sArr = new C7408s[m22895c];
        for (int i2 = 0; i2 < m22895c; i2++) {
            if (!c6329d.m22937r(i2) && (c6342a.m22894d(i2) == 7 || mo22903a[i2] != null)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c7408s = C7408s.f19924b;
            } else {
                c7408s = null;
            }
            c7408sArr[i2] = c7408s;
        }
        if (c6329d.f17895Q) {
            m22974C(c6342a, iArr, c7408sArr, mo22903a);
        }
        return Pair.create(c7408sArr, mo22903a);
    }

    /* renamed from: o */
    public C6331e m22958o() {
        return m22951v().m22939j();
    }

    /* renamed from: v */
    public C6329d m22951v() {
        return this.f17861e.get();
    }

    public C6325f(Context context) {
        this(context, new C6318a.C6320b());
    }

    public C6325f(Context context, InterfaceC6337h.InterfaceC6339b interfaceC6339b) {
        this(C6329d.m22938k(context), interfaceC6339b);
    }

    public C6325f(C6329d c6329d, InterfaceC6337h.InterfaceC6339b interfaceC6339b) {
        this.f17860d = interfaceC6339b;
        this.f17861e = new AtomicReference<>(c6329d);
    }

    /* renamed from: f8.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6329d extends C6344l {

        /* renamed from: A */
        public final boolean f17879A;

        /* renamed from: B */
        public final boolean f17880B;

        /* renamed from: C */
        public final int f17881C;

        /* renamed from: D */
        public final int f17882D;

        /* renamed from: E */
        public final boolean f17883E;

        /* renamed from: F */
        public final AbstractC6693s<String> f17884F;

        /* renamed from: G */
        public final int f17885G;

        /* renamed from: H */
        public final int f17886H;

        /* renamed from: I */
        public final boolean f17887I;

        /* renamed from: J */
        public final boolean f17888J;

        /* renamed from: K */
        public final boolean f17889K;

        /* renamed from: L */
        public final boolean f17890L;

        /* renamed from: M */
        public final AbstractC6693s<String> f17891M;

        /* renamed from: N */
        public final boolean f17892N;

        /* renamed from: O */
        public final boolean f17893O;

        /* renamed from: P */
        public final boolean f17894P;

        /* renamed from: Q */
        public final boolean f17895Q;

        /* renamed from: R */
        public final boolean f17896R;

        /* renamed from: S */
        private final SparseArray<Map<TrackGroupArray, C6332f>> f17897S;

        /* renamed from: T */
        private final SparseBooleanArray f17898T;

        /* renamed from: r */
        public final int f17899r;

        /* renamed from: s */
        public final int f17900s;

        /* renamed from: t */
        public final int f17901t;

        /* renamed from: u */
        public final int f17902u;

        /* renamed from: v */
        public final int f17903v;

        /* renamed from: w */
        public final int f17904w;

        /* renamed from: x */
        public final int f17905x;

        /* renamed from: y */
        public final int f17906y;

        /* renamed from: z */
        public final boolean f17907z;

        /* renamed from: U */
        public static final C6329d f17878U = new C6331e().mo22884a();
        public static final Parcelable.Creator<C6329d> CREATOR = new C6330a();

        /* renamed from: f8.f$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C6330a implements Parcelable.Creator<C6329d> {
            C6330a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6329d createFromParcel(Parcel parcel) {
                return new C6329d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C6329d[] newArray(int i) {
                return new C6329d[i];
            }
        }

        C6329d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, AbstractC6693s<String> abstractC6693s, AbstractC6693s<String> abstractC6693s2, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, AbstractC6693s<String> abstractC6693s3, AbstractC6693s<String> abstractC6693s4, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, C6332f>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(abstractC6693s2, i11, abstractC6693s4, i14, z9, i15);
            this.f17899r = i;
            this.f17900s = i2;
            this.f17901t = i3;
            this.f17902u = i4;
            this.f17903v = i5;
            this.f17904w = i6;
            this.f17905x = i7;
            this.f17906y = i8;
            this.f17907z = z;
            this.f17879A = z2;
            this.f17880B = z3;
            this.f17881C = i9;
            this.f17882D = i10;
            this.f17883E = z4;
            this.f17884F = abstractC6693s;
            this.f17885G = i12;
            this.f17886H = i13;
            this.f17887I = z5;
            this.f17888J = z6;
            this.f17889K = z7;
            this.f17890L = z8;
            this.f17891M = abstractC6693s3;
            this.f17892N = z10;
            this.f17893O = z11;
            this.f17894P = z12;
            this.f17895Q = z13;
            this.f17896R = z14;
            this.f17897S = sparseArray;
            this.f17898T = sparseBooleanArray;
        }

        /* renamed from: d */
        private static boolean m22942d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        private static boolean m22941e(SparseArray<Map<TrackGroupArray, C6332f>> sparseArray, SparseArray<Map<TrackGroupArray, C6332f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m22940h(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x001a  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m22940h(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, p099f8.C6325f.C6332f> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, p099f8.C6325f.C6332f> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p195k8.C9191p0.m16257c(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p099f8.C6325f.C6329d.m22940h(java.util.Map, java.util.Map):boolean");
        }

        /* renamed from: k */
        public static C6329d m22938k(Context context) {
            return new C6331e(context).mo22884a();
        }

        /* renamed from: y */
        private static SparseArray<Map<TrackGroupArray, C6332f>> m22934y(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, C6332f>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) C9149a.m16448e((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (C6332f) parcel.readParcelable(C6332f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: z */
        private static void m22933z(Parcel parcel, SparseArray<Map<TrackGroupArray, C6332f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map<TrackGroupArray, C6332f> valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, C6332f> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // p099f8.C6344l, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p099f8.C6344l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6329d.class != obj.getClass()) {
                return false;
            }
            C6329d c6329d = (C6329d) obj;
            if (super.equals(obj) && this.f17899r == c6329d.f17899r && this.f17900s == c6329d.f17900s && this.f17901t == c6329d.f17901t && this.f17902u == c6329d.f17902u && this.f17903v == c6329d.f17903v && this.f17904w == c6329d.f17904w && this.f17905x == c6329d.f17905x && this.f17906y == c6329d.f17906y && this.f17907z == c6329d.f17907z && this.f17879A == c6329d.f17879A && this.f17880B == c6329d.f17880B && this.f17883E == c6329d.f17883E && this.f17881C == c6329d.f17881C && this.f17882D == c6329d.f17882D && this.f17884F.equals(c6329d.f17884F) && this.f17885G == c6329d.f17885G && this.f17886H == c6329d.f17886H && this.f17887I == c6329d.f17887I && this.f17888J == c6329d.f17888J && this.f17889K == c6329d.f17889K && this.f17890L == c6329d.f17890L && this.f17891M.equals(c6329d.f17891M) && this.f17892N == c6329d.f17892N && this.f17893O == c6329d.f17893O && this.f17894P == c6329d.f17894P && this.f17895Q == c6329d.f17895Q && this.f17896R == c6329d.f17896R && m22942d(this.f17898T, c6329d.f17898T) && m22941e(this.f17897S, c6329d.f17897S)) {
                return true;
            }
            return false;
        }

        @Override // p099f8.C6344l
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f17899r) * 31) + this.f17900s) * 31) + this.f17901t) * 31) + this.f17902u) * 31) + this.f17903v) * 31) + this.f17904w) * 31) + this.f17905x) * 31) + this.f17906y) * 31) + (this.f17907z ? 1 : 0)) * 31) + (this.f17879A ? 1 : 0)) * 31) + (this.f17880B ? 1 : 0)) * 31) + (this.f17883E ? 1 : 0)) * 31) + this.f17881C) * 31) + this.f17882D) * 31) + this.f17884F.hashCode()) * 31) + this.f17885G) * 31) + this.f17886H) * 31) + (this.f17887I ? 1 : 0)) * 31) + (this.f17888J ? 1 : 0)) * 31) + (this.f17889K ? 1 : 0)) * 31) + (this.f17890L ? 1 : 0)) * 31) + this.f17891M.hashCode()) * 31) + (this.f17892N ? 1 : 0)) * 31) + (this.f17893O ? 1 : 0)) * 31) + (this.f17894P ? 1 : 0)) * 31) + (this.f17895Q ? 1 : 0)) * 31) + (this.f17896R ? 1 : 0);
        }

        /* renamed from: j */
        public C6331e m22939j() {
            return new C6331e(this);
        }

        /* renamed from: r */
        public final boolean m22937r(int i) {
            return this.f17898T.get(i);
        }

        /* renamed from: u */
        public final C6332f m22936u(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, C6332f> map = this.f17897S.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Override // p099f8.C6344l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f17899r);
            parcel.writeInt(this.f17900s);
            parcel.writeInt(this.f17901t);
            parcel.writeInt(this.f17902u);
            parcel.writeInt(this.f17903v);
            parcel.writeInt(this.f17904w);
            parcel.writeInt(this.f17905x);
            parcel.writeInt(this.f17906y);
            C9191p0.m16262Z0(parcel, this.f17907z);
            C9191p0.m16262Z0(parcel, this.f17879A);
            C9191p0.m16262Z0(parcel, this.f17880B);
            parcel.writeInt(this.f17881C);
            parcel.writeInt(this.f17882D);
            C9191p0.m16262Z0(parcel, this.f17883E);
            parcel.writeList(this.f17884F);
            parcel.writeInt(this.f17885G);
            parcel.writeInt(this.f17886H);
            C9191p0.m16262Z0(parcel, this.f17887I);
            C9191p0.m16262Z0(parcel, this.f17888J);
            C9191p0.m16262Z0(parcel, this.f17889K);
            C9191p0.m16262Z0(parcel, this.f17890L);
            parcel.writeList(this.f17891M);
            C9191p0.m16262Z0(parcel, this.f17892N);
            C9191p0.m16262Z0(parcel, this.f17893O);
            C9191p0.m16262Z0(parcel, this.f17894P);
            C9191p0.m16262Z0(parcel, this.f17895Q);
            C9191p0.m16262Z0(parcel, this.f17896R);
            m22933z(parcel, this.f17897S);
            parcel.writeSparseBooleanArray(this.f17898T);
        }

        /* renamed from: x */
        public final boolean m22935x(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, C6332f> map = this.f17897S.get(i);
            if (map != null && map.containsKey(trackGroupArray)) {
                return true;
            }
            return false;
        }

        C6329d(Parcel parcel) {
            super(parcel);
            this.f17899r = parcel.readInt();
            this.f17900s = parcel.readInt();
            this.f17901t = parcel.readInt();
            this.f17902u = parcel.readInt();
            this.f17903v = parcel.readInt();
            this.f17904w = parcel.readInt();
            this.f17905x = parcel.readInt();
            this.f17906y = parcel.readInt();
            this.f17907z = C9191p0.m16300G0(parcel);
            this.f17879A = C9191p0.m16300G0(parcel);
            this.f17880B = C9191p0.m16300G0(parcel);
            this.f17881C = parcel.readInt();
            this.f17882D = parcel.readInt();
            this.f17883E = C9191p0.m16300G0(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.f17884F = AbstractC6693s.m22134u(arrayList);
            this.f17885G = parcel.readInt();
            this.f17886H = parcel.readInt();
            this.f17887I = C9191p0.m16300G0(parcel);
            this.f17888J = C9191p0.m16300G0(parcel);
            this.f17889K = C9191p0.m16300G0(parcel);
            this.f17890L = C9191p0.m16300G0(parcel);
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.f17891M = AbstractC6693s.m22134u(arrayList2);
            this.f17892N = C9191p0.m16300G0(parcel);
            this.f17893O = C9191p0.m16300G0(parcel);
            this.f17894P = C9191p0.m16300G0(parcel);
            this.f17895Q = C9191p0.m16300G0(parcel);
            this.f17896R = C9191p0.m16300G0(parcel);
            this.f17897S = m22934y(parcel);
            this.f17898T = (SparseBooleanArray) C9191p0.m16243j(parcel.readSparseBooleanArray());
        }
    }
}