package p099f8;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;
import p151i6.C7406q;
import p151i6.C7408s;
import p151i6.InterfaceC7407r;
import p195k8.C9191p0;
import p195k8.C9200u;
import p229m7.C10344s0;
import p229m7.InterfaceC10341s;

/* renamed from: f8.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6341j extends AbstractC6347m {

    /* renamed from: c */
    private C6342a f17964c;

    /* renamed from: f8.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6342a {

        /* renamed from: a */
        private final int f17965a;

        /* renamed from: b */
        private final String[] f17966b;

        /* renamed from: c */
        private final int[] f17967c;

        /* renamed from: d */
        private final TrackGroupArray[] f17968d;

        /* renamed from: e */
        private final int[] f17969e;

        /* renamed from: f */
        private final int[][][] f17970f;

        /* renamed from: g */
        private final TrackGroupArray f17971g;

        C6342a(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f17966b = strArr;
            this.f17967c = iArr;
            this.f17968d = trackGroupArrayArr;
            this.f17970f = iArr3;
            this.f17969e = iArr2;
            this.f17971g = trackGroupArray;
            this.f17965a = iArr.length;
        }

        /* renamed from: a */
        public int m22897a(int i, int i2, boolean z) {
            int i3 = this.f17968d[i].m29144a(i2).f27056j;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int m22892f = m22892f(i, i2, i5);
                if (m22892f == 4 || (z && m22892f == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m22896b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int m22896b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int i4 = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f17968d[i].m29144a(i2).m11721a(iArr[i3]).f11197u;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !C9191p0.m16257c(str, str2);
                }
                i4 = Math.min(i4, C7406q.m20723c(this.f17970f[i][i2][i3]));
                i3++;
                i5 = i6;
            }
            if (z) {
                return Math.min(i4, this.f17969e[i]);
            }
            return i4;
        }

        /* renamed from: c */
        public int m22895c() {
            return this.f17965a;
        }

        /* renamed from: d */
        public int m22894d(int i) {
            return this.f17967c[i];
        }

        /* renamed from: e */
        public TrackGroupArray m22893e(int i) {
            return this.f17968d[i];
        }

        /* renamed from: f */
        public int m22892f(int i, int i2, int i3) {
            return C7406q.m20722d(this.f17970f[i][i2][i3]);
        }
    }

    /* renamed from: f */
    private static int m22902f(InterfaceC7407r[] interfaceC7407rArr, C10344s0 c10344s0, int[] iArr, boolean z) {
        boolean z2;
        int length = interfaceC7407rArr.length;
        int i = 0;
        boolean z3 = true;
        for (int i2 = 0; i2 < interfaceC7407rArr.length; i2++) {
            InterfaceC7407r interfaceC7407r = interfaceC7407rArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < c10344s0.f27056j; i4++) {
                i3 = Math.max(i3, C7406q.m20722d(interfaceC7407r.mo3110a(c10344s0.m11721a(i4))));
            }
            if (iArr[i2] == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 > i || (i3 == i && z && !z3 && z2)) {
                length = i2;
                z3 = z2;
                i = i3;
            }
        }
        return length;
    }

    /* renamed from: h */
    private static int[] m22900h(InterfaceC7407r interfaceC7407r, C10344s0 c10344s0) {
        int[] iArr = new int[c10344s0.f27056j];
        for (int i = 0; i < c10344s0.f27056j; i++) {
            iArr[i] = interfaceC7407r.mo3110a(c10344s0.m11721a(i));
        }
        return iArr;
    }

    /* renamed from: i */
    private static int[] m22899i(InterfaceC7407r[] interfaceC7407rArr) {
        int length = interfaceC7407rArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC7407rArr[i].mo20719q();
        }
        return iArr;
    }

    @Override // p099f8.AbstractC6347m
    /* renamed from: d */
    public final void mo22878d(Object obj) {
        this.f17964c = (C6342a) obj;
    }

    @Override // p099f8.AbstractC6347m
    /* renamed from: e */
    public final C6349n mo22877e(InterfaceC7407r[] interfaceC7407rArr, TrackGroupArray trackGroupArray, InterfaceC10341s.C10342a c10342a, Timeline timeline) {
        boolean z;
        int[] m22900h;
        int[] iArr = new int[interfaceC7407rArr.length + 1];
        int length = interfaceC7407rArr.length + 1;
        C10344s0[][] c10344s0Arr = new C10344s0[length];
        int[][][] iArr2 = new int[interfaceC7407rArr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.f11764j;
            c10344s0Arr[i] = new C10344s0[i2];
            iArr2[i] = new int[i2];
        }
        int[] m22899i = m22899i(interfaceC7407rArr);
        for (int i3 = 0; i3 < trackGroupArray.f11764j; i3++) {
            C10344s0 m29144a = trackGroupArray.m29144a(i3);
            if (C9200u.m16158l(m29144a.m11721a(0).f11197u) == 5) {
                z = true;
            } else {
                z = false;
            }
            int m22902f = m22902f(interfaceC7407rArr, m29144a, iArr, z);
            if (m22902f == interfaceC7407rArr.length) {
                m22900h = new int[m29144a.f27056j];
            } else {
                m22900h = m22900h(interfaceC7407rArr[m22902f], m29144a);
            }
            int i4 = iArr[m22902f];
            c10344s0Arr[m22902f][i4] = m29144a;
            iArr2[m22902f][i4] = m22900h;
            iArr[m22902f] = i4 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC7407rArr.length];
        String[] strArr = new String[interfaceC7407rArr.length];
        int[] iArr3 = new int[interfaceC7407rArr.length];
        for (int i5 = 0; i5 < interfaceC7407rArr.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((C10344s0[]) C9191p0.m16310B0(c10344s0Arr[i5], i6));
            iArr2[i5] = (int[][]) C9191p0.m16310B0(iArr2[i5], i6);
            strArr[i5] = interfaceC7407rArr[i5].getName();
            iArr3[i5] = interfaceC7407rArr[i5].mo20720d();
        }
        C6342a c6342a = new C6342a(strArr, iArr3, trackGroupArrayArr, m22899i, iArr2, new TrackGroupArray((C10344s0[]) C9191p0.m16310B0(c10344s0Arr[interfaceC7407rArr.length], iArr[interfaceC7407rArr.length])));
        Pair<C7408s[], InterfaceC6337h[]> mo22898j = mo22898j(c6342a, iArr2, m22899i, c10342a, timeline);
        return new C6349n((C7408s[]) mo22898j.first, (InterfaceC6337h[]) mo22898j.second, c6342a);
    }

    /* renamed from: g */
    public final C6342a m22901g() {
        return this.f17964c;
    }

    /* renamed from: j */
    protected abstract Pair<C7408s[], InterfaceC6337h[]> mo22898j(C6342a c6342a, int[][][] iArr, int[] iArr2, InterfaceC10341s.C10342a c10342a, Timeline timeline);
}