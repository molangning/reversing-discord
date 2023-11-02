package p229m7;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p151i6.C7399j;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7451h;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9200u;
import p195k8.C9208y;
import p228m6.C10271g;
import p259o6.C11028l;
import p259o6.InterfaceC11035n;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p296q6.C11730a0;
import p296q6.InterfaceC11732b0;

/* renamed from: m7.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10315l0 implements InterfaceC11732b0 {

    /* renamed from: A */
    private boolean f26936A;

    /* renamed from: B */
    private Format f26937B;

    /* renamed from: C */
    private Format f26938C;

    /* renamed from: D */
    private Format f26939D;

    /* renamed from: E */
    private int f26940E;

    /* renamed from: F */
    private boolean f26941F;

    /* renamed from: G */
    private boolean f26942G;

    /* renamed from: H */
    private long f26943H;

    /* renamed from: I */
    private boolean f26944I;

    /* renamed from: a */
    private final C10312k0 f26945a;

    /* renamed from: c */
    private final InterfaceC11049x f26947c;

    /* renamed from: d */
    private final InterfaceC11045v.C11046a f26948d;

    /* renamed from: e */
    private final Looper f26949e;

    /* renamed from: f */
    private InterfaceC10317b f26950f;

    /* renamed from: g */
    private Format f26951g;

    /* renamed from: h */
    private InterfaceC11035n f26952h;

    /* renamed from: q */
    private int f26961q;

    /* renamed from: r */
    private int f26962r;

    /* renamed from: s */
    private int f26963s;

    /* renamed from: t */
    private int f26964t;

    /* renamed from: x */
    private boolean f26968x;

    /* renamed from: b */
    private final C10316a f26946b = new C10316a();

    /* renamed from: i */
    private int f26953i = RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;

    /* renamed from: j */
    private int[] f26954j = new int[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: k */
    private long[] f26955k = new long[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: n */
    private long[] f26958n = new long[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: m */
    private int[] f26957m = new int[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: l */
    private int[] f26956l = new int[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: o */
    private InterfaceC11732b0.C11733a[] f26959o = new InterfaceC11732b0.C11733a[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: p */
    private Format[] f26960p = new Format[RNCWebViewManager.COMMAND_CLEAR_FORM_DATA];

    /* renamed from: u */
    private long f26965u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f26966v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f26967w = Long.MIN_VALUE;

    /* renamed from: z */
    private boolean f26970z = true;

    /* renamed from: y */
    private boolean f26969y = true;

    /* renamed from: m7.l0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10316a {

        /* renamed from: a */
        public int f26971a;

        /* renamed from: b */
        public long f26972b;

        /* renamed from: c */
        public InterfaceC11732b0.C11733a f26973c;

        C10316a() {
        }
    }

    /* renamed from: m7.l0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10317b {
        /* renamed from: a */
        void mo6203a(Format format);
    }

    public C10315l0(InterfaceC7440b interfaceC7440b, Looper looper, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a) {
        this.f26949e = looper;
        this.f26947c = interfaceC11049x;
        this.f26948d = c11046a;
        this.f26945a = new C10312k0(interfaceC7440b);
    }

    /* renamed from: A */
    private long m11840A(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int m11838C = m11838C(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f26958n[m11838C]);
            if ((this.f26957m[m11838C] & 1) != 0) {
                break;
            }
            m11838C--;
            if (m11838C == -1) {
                m11838C = this.f26953i - 1;
            }
        }
        return j;
    }

    /* renamed from: C */
    private int m11838C(int i) {
        int i2 = this.f26963s + i;
        int i3 = this.f26953i;
        if (i2 >= i3) {
            return i2 - i3;
        }
        return i2;
    }

    /* renamed from: G */
    private boolean m11834G() {
        return this.f26964t != this.f26961q;
    }

    /* renamed from: K */
    private boolean m11830K(int i) {
        InterfaceC11035n interfaceC11035n = this.f26952h;
        if (interfaceC11035n != null && interfaceC11035n.getState() != 4 && ((this.f26957m[i] & 1073741824) != 0 || !this.f26952h.mo9305b())) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private void m11828M(Format format, C7399j c7399j) {
        boolean z;
        C11028l c11028l;
        Format format2;
        Format format3 = this.f26951g;
        if (format3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c11028l = null;
        } else {
            c11028l = format3.f11200x;
        }
        this.f26951g = format;
        C11028l c11028l2 = format.f11200x;
        InterfaceC11049x interfaceC11049x = this.f26947c;
        if (interfaceC11049x != null) {
            format2 = format.m29925b(interfaceC11049x.mo9266b(format));
        } else {
            format2 = format;
        }
        c7399j.f19920b = format2;
        c7399j.f19919a = this.f26952h;
        if (this.f26947c == null) {
            return;
        }
        if (!z && C9191p0.m16257c(c11028l, c11028l2)) {
            return;
        }
        InterfaceC11035n interfaceC11035n = this.f26952h;
        InterfaceC11035n mo9267a = this.f26947c.mo9267a((Looper) C9149a.m16448e(this.f26949e), this.f26948d, format);
        this.f26952h = mo9267a;
        c7399j.f19919a = mo9267a;
        if (interfaceC11035n != null) {
            interfaceC11035n.mo9303d(this.f26948d);
        }
    }

    /* renamed from: N */
    private synchronized int m11827N(C7399j c7399j, C10271g c10271g, boolean z, boolean z2, C10316a c10316a) {
        c10271g.f26744m = false;
        if (!m11834G()) {
            if (!z2 && !this.f26968x) {
                Format format = this.f26938C;
                if (format == null || (!z && format == this.f26951g)) {
                    return -3;
                }
                m11828M((Format) C9149a.m16448e(format), c7399j);
                return -5;
            }
            c10271g.m11986n(4);
            return -4;
        }
        int m11838C = m11838C(this.f26964t);
        if (!z && this.f26960p[m11838C] == this.f26951g) {
            if (!m11830K(m11838C)) {
                c10271g.f26744m = true;
                return -3;
            }
            c10271g.m11986n(this.f26957m[m11838C]);
            long j = this.f26958n[m11838C];
            c10271g.f26745n = j;
            if (j < this.f26965u) {
                c10271g.m11993e(Integer.MIN_VALUE);
            }
            c10316a.f26971a = this.f26956l[m11838C];
            c10316a.f26972b = this.f26955k[m11838C];
            c10316a.f26973c = this.f26959o[m11838C];
            return -4;
        }
        m11828M(this.f26960p[m11838C], c7399j);
        return -5;
    }

    /* renamed from: S */
    private void m11822S() {
        InterfaceC11035n interfaceC11035n = this.f26952h;
        if (interfaceC11035n != null) {
            interfaceC11035n.mo9303d(this.f26948d);
            this.f26952h = null;
            this.f26951g = null;
        }
    }

    /* renamed from: V */
    private synchronized void m11819V() {
        this.f26964t = 0;
        this.f26945a.m11850n();
    }

    /* renamed from: a0 */
    private synchronized boolean m11814a0(Format format) {
        this.f26970z = false;
        if (C9191p0.m16257c(format, this.f26938C)) {
            return false;
        }
        if (C9191p0.m16257c(format, this.f26939D)) {
            this.f26938C = this.f26939D;
        } else {
            this.f26938C = format;
        }
        Format format2 = this.f26938C;
        this.f26941F = C9200u.m16169a(format2.f11197u, format2.f11194r);
        this.f26942G = false;
        return true;
    }

    /* renamed from: g */
    private synchronized boolean m11809g(long j) {
        boolean z = true;
        if (this.f26961q == 0) {
            if (j <= this.f26966v) {
                z = false;
            }
            return z;
        } else if (m11791z() >= j) {
            return false;
        } else {
            m11797s(this.f26962r + m11807i(j));
            return true;
        }
    }

    /* renamed from: h */
    private synchronized void m11808h(long j, int i, long j2, int i2, InterfaceC11732b0.C11733a c11733a) {
        boolean z;
        int m11838C;
        boolean z2;
        int i3 = this.f26961q;
        if (i3 > 0) {
            if (this.f26955k[m11838C(i3 - 1)] + this.f26956l[m11838C] <= j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9149a.m16452a(z2);
        }
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f26968x = z;
        this.f26967w = Math.max(this.f26967w, j);
        int m11838C2 = m11838C(this.f26961q);
        this.f26958n[m11838C2] = j;
        long[] jArr = this.f26955k;
        jArr[m11838C2] = j2;
        this.f26956l[m11838C2] = i2;
        this.f26957m[m11838C2] = i;
        this.f26959o[m11838C2] = c11733a;
        Format[] formatArr = this.f26960p;
        Format format = this.f26938C;
        formatArr[m11838C2] = format;
        this.f26954j[m11838C2] = this.f26940E;
        this.f26939D = format;
        int i4 = this.f26961q + 1;
        this.f26961q = i4;
        int i5 = this.f26953i;
        if (i4 == i5) {
            int i6 = i5 + RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            int[] iArr = new int[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            InterfaceC11732b0.C11733a[] c11733aArr = new InterfaceC11732b0.C11733a[i6];
            Format[] formatArr2 = new Format[i6];
            int i7 = this.f26963s;
            int i8 = i5 - i7;
            System.arraycopy(jArr, i7, jArr2, 0, i8);
            System.arraycopy(this.f26958n, this.f26963s, jArr3, 0, i8);
            System.arraycopy(this.f26957m, this.f26963s, iArr2, 0, i8);
            System.arraycopy(this.f26956l, this.f26963s, iArr3, 0, i8);
            System.arraycopy(this.f26959o, this.f26963s, c11733aArr, 0, i8);
            System.arraycopy(this.f26960p, this.f26963s, formatArr2, 0, i8);
            System.arraycopy(this.f26954j, this.f26963s, iArr, 0, i8);
            int i9 = this.f26963s;
            System.arraycopy(this.f26955k, 0, jArr2, i8, i9);
            System.arraycopy(this.f26958n, 0, jArr3, i8, i9);
            System.arraycopy(this.f26957m, 0, iArr2, i8, i9);
            System.arraycopy(this.f26956l, 0, iArr3, i8, i9);
            System.arraycopy(this.f26959o, 0, c11733aArr, i8, i9);
            System.arraycopy(this.f26960p, 0, formatArr2, i8, i9);
            System.arraycopy(this.f26954j, 0, iArr, i8, i9);
            this.f26955k = jArr2;
            this.f26958n = jArr3;
            this.f26957m = iArr2;
            this.f26956l = iArr3;
            this.f26959o = c11733aArr;
            this.f26960p = formatArr2;
            this.f26954j = iArr;
            this.f26963s = 0;
            this.f26953i = i6;
        }
    }

    /* renamed from: i */
    private int m11807i(long j) {
        int i = this.f26961q;
        int m11838C = m11838C(i - 1);
        while (i > this.f26964t && this.f26958n[m11838C] >= j) {
            i--;
            m11838C--;
            if (m11838C == -1) {
                m11838C = this.f26953i - 1;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static C10315l0 m11806j(InterfaceC7440b interfaceC7440b, Looper looper, InterfaceC11049x interfaceC11049x, InterfaceC11045v.C11046a c11046a) {
        return new C10315l0(interfaceC7440b, (Looper) C9149a.m16448e(looper), (InterfaceC11049x) C9149a.m16448e(interfaceC11049x), (InterfaceC11045v.C11046a) C9149a.m16448e(c11046a));
    }

    /* renamed from: k */
    public static C10315l0 m11805k(InterfaceC7440b interfaceC7440b) {
        return new C10315l0(interfaceC7440b, null, null, null);
    }

    /* renamed from: l */
    private synchronized long m11804l(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f26961q;
        if (i2 != 0) {
            long[] jArr = this.f26958n;
            int i3 = this.f26963s;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f26964t) != i2) {
                    i2 = i + 1;
                }
                int m11795u = m11795u(i3, i2, j, z);
                if (m11795u == -1) {
                    return -1L;
                }
                return m11801o(m11795u);
            }
        }
        return -1L;
    }

    /* renamed from: m */
    private synchronized long m11803m() {
        int i = this.f26961q;
        if (i == 0) {
            return -1L;
        }
        return m11801o(i);
    }

    /* renamed from: o */
    private long m11801o(int i) {
        int i2;
        this.f26966v = Math.max(this.f26966v, m11840A(i));
        int i3 = this.f26961q - i;
        this.f26961q = i3;
        this.f26962r += i;
        int i4 = this.f26963s + i;
        this.f26963s = i4;
        int i5 = this.f26953i;
        if (i4 >= i5) {
            this.f26963s = i4 - i5;
        }
        int i6 = this.f26964t - i;
        this.f26964t = i6;
        if (i6 < 0) {
            this.f26964t = 0;
        }
        if (i3 == 0) {
            int i7 = this.f26963s;
            if (i7 != 0) {
                i5 = i7;
            }
            return this.f26955k[i5 - 1] + this.f26956l[i2];
        }
        return this.f26955k[this.f26963s];
    }

    /* renamed from: s */
    private long m11797s(int i) {
        boolean z;
        int m11838C;
        int m11835F = m11835F() - i;
        boolean z2 = false;
        if (m11835F >= 0 && m11835F <= this.f26961q - this.f26964t) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        int i2 = this.f26961q - m11835F;
        this.f26961q = i2;
        this.f26967w = Math.max(this.f26966v, m11840A(i2));
        if (m11835F == 0 && this.f26968x) {
            z2 = true;
        }
        this.f26968x = z2;
        int i3 = this.f26961q;
        if (i3 != 0) {
            return this.f26955k[m11838C(i3 - 1)] + this.f26956l[m11838C];
        }
        return 0L;
    }

    /* renamed from: u */
    private int m11795u(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f26958n[i];
            if (j2 <= j) {
                if (!z || (this.f26957m[i] & 1) != 0) {
                    if (j2 == j) {
                        return i4;
                    }
                    i3 = i4;
                }
                i++;
                if (i == this.f26953i) {
                    i = 0;
                }
            } else {
                return i3;
            }
        }
        return i3;
    }

    /* renamed from: B */
    public final int m11839B() {
        return this.f26962r + this.f26964t;
    }

    /* renamed from: D */
    public final synchronized int m11837D(long j, boolean z) {
        int m11838C = m11838C(this.f26964t);
        if (m11834G() && j >= this.f26958n[m11838C]) {
            if (j > this.f26967w && z) {
                return this.f26961q - this.f26964t;
            }
            int m11795u = m11795u(m11838C, this.f26961q - this.f26964t, j, true);
            if (m11795u == -1) {
                return 0;
            }
            return m11795u;
        }
        return 0;
    }

    /* renamed from: E */
    public final synchronized Format m11836E() {
        Format format;
        if (this.f26970z) {
            format = null;
        } else {
            format = this.f26938C;
        }
        return format;
    }

    /* renamed from: F */
    public final int m11835F() {
        return this.f26962r + this.f26961q;
    }

    /* renamed from: H */
    public final void m11833H() {
        this.f26936A = true;
    }

    /* renamed from: I */
    public final synchronized boolean m11832I() {
        return this.f26968x;
    }

    /* renamed from: J */
    public synchronized boolean m11831J(boolean z) {
        Format format;
        boolean z2 = true;
        if (!m11834G()) {
            if (!z && !this.f26968x && ((format = this.f26938C) == null || format == this.f26951g)) {
                z2 = false;
            }
            return z2;
        }
        int m11838C = m11838C(this.f26964t);
        if (this.f26960p[m11838C] != this.f26951g) {
            return true;
        }
        return m11830K(m11838C);
    }

    /* renamed from: L */
    public void m11829L() {
        InterfaceC11035n interfaceC11035n = this.f26952h;
        if (interfaceC11035n != null && interfaceC11035n.getState() == 1) {
            throw ((InterfaceC11035n.C11036a) C9149a.m16448e(this.f26952h.mo9301f()));
        }
    }

    /* renamed from: O */
    public final synchronized int m11826O() {
        int i;
        int m11838C = m11838C(this.f26964t);
        if (m11834G()) {
            i = this.f26954j[m11838C];
        } else {
            i = this.f26940E;
        }
        return i;
    }

    /* renamed from: P */
    public void m11825P() {
        m11799q();
        m11822S();
    }

    /* renamed from: Q */
    public int m11824Q(C7399j c7399j, C10271g c10271g, boolean z, boolean z2) {
        int m11827N = m11827N(c7399j, c10271g, z, z2, this.f26946b);
        if (m11827N == -4 && !c10271g.m11988l() && !c10271g.m11974s()) {
            this.f26945a.m11852l(c10271g, this.f26946b);
            this.f26964t++;
        }
        return m11827N;
    }

    /* renamed from: R */
    public void m11823R() {
        m11820U(true);
        m11822S();
    }

    /* renamed from: T */
    public final void m11821T() {
        m11820U(false);
    }

    /* renamed from: U */
    public void m11820U(boolean z) {
        this.f26945a.m11851m();
        this.f26961q = 0;
        this.f26962r = 0;
        this.f26963s = 0;
        this.f26964t = 0;
        this.f26969y = true;
        this.f26965u = Long.MIN_VALUE;
        this.f26966v = Long.MIN_VALUE;
        this.f26967w = Long.MIN_VALUE;
        this.f26968x = false;
        this.f26939D = null;
        if (z) {
            this.f26937B = null;
            this.f26938C = null;
            this.f26970z = true;
        }
    }

    /* renamed from: W */
    public final synchronized boolean m11818W(int i) {
        m11819V();
        int i2 = this.f26962r;
        if (i >= i2 && i <= this.f26961q + i2) {
            this.f26965u = Long.MIN_VALUE;
            this.f26964t = i - i2;
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final synchronized boolean m11817X(long j, boolean z) {
        m11819V();
        int m11838C = m11838C(this.f26964t);
        if (m11834G() && j >= this.f26958n[m11838C] && (j <= this.f26967w || z)) {
            int m11795u = m11795u(m11838C, this.f26961q - this.f26964t, j, true);
            if (m11795u == -1) {
                return false;
            }
            this.f26965u = j;
            this.f26964t += m11795u;
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final void m11816Y(long j) {
        if (this.f26943H != j) {
            this.f26943H = j;
            m11833H();
        }
    }

    /* renamed from: Z */
    public final void m11815Z(long j) {
        this.f26965u = j;
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: a */
    public /* synthetic */ void mo6170a(C9208y c9208y, int i) {
        C11730a0.m7041b(this, c9208y, i);
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: b */
    public final void mo6169b(C9208y c9208y, int i, int i2) {
        this.f26945a.m11848p(c9208y, i);
    }

    /* renamed from: b0 */
    public final void m11813b0(InterfaceC10317b interfaceC10317b) {
        this.f26950f = interfaceC10317b;
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: c */
    public final void mo6168c(Format format) {
        Format mo6158v = mo6158v(format);
        this.f26936A = false;
        this.f26937B = format;
        boolean m11814a0 = m11814a0(mo6158v);
        InterfaceC10317b interfaceC10317b = this.f26950f;
        if (interfaceC10317b != null && m11814a0) {
            interfaceC10317b.mo6203a(mo6158v);
        }
    }

    /* renamed from: c0 */
    public final synchronized void m11812c0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f26964t + i <= this.f26961q) {
                    z = true;
                    C9149a.m16452a(z);
                    this.f26964t += i;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z = false;
        C9149a.m16452a(z);
        this.f26964t += i;
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: d */
    public /* synthetic */ int mo6167d(InterfaceC7451h interfaceC7451h, int i, boolean z) {
        return C11730a0.m7042a(this, interfaceC7451h, i, z);
    }

    /* renamed from: d0 */
    public final void m11811d0(int i) {
        this.f26940E = i;
    }

    @Override // p296q6.InterfaceC11732b0
    /* renamed from: e */
    public final int mo6166e(InterfaceC7451h interfaceC7451h, int i, boolean z, int i2) {
        return this.f26945a.m11849o(interfaceC7451h, i, z);
    }

    /* renamed from: e0 */
    public final void m11810e0() {
        this.f26944I = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0059  */
    @Override // p296q6.InterfaceC11732b0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6162f(long r12, int r14, int r15, int r16, p296q6.InterfaceC11732b0.C11733a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f26936A
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.Format r0 = r8.f26937B
            java.lang.Object r0 = p195k8.C9149a.m16445h(r0)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            r11.mo6168c(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f26969y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f26969y = r1
        L22:
            long r4 = r8.f26943H
            long r4 = r4 + r12
            boolean r6 = r8.f26941F
            if (r6 == 0) goto L54
            long r6 = r8.f26965u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f26942G
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.google.android.exoplayer2.Format r6 = r8.f26938C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            android.util.Log.w(r6, r0)
            r8.f26942G = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f26944I
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.m11809g(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f26944I = r1
            goto L66
        L65:
            return
        L66:
            m7.k0 r0 = r8.f26945a
            long r0 = r0.m11859e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m11808h(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m7.C10315l0.mo6162f(long, int, int, int, q6.b0$a):void");
    }

    /* renamed from: n */
    public synchronized long m11802n() {
        int i = this.f26964t;
        if (i == 0) {
            return -1L;
        }
        return m11801o(i);
    }

    /* renamed from: p */
    public final void m11800p(long j, boolean z, boolean z2) {
        this.f26945a.m11862b(m11804l(j, z, z2));
    }

    /* renamed from: q */
    public final void m11799q() {
        this.f26945a.m11862b(m11803m());
    }

    /* renamed from: r */
    public final void m11798r() {
        this.f26945a.m11862b(m11802n());
    }

    /* renamed from: t */
    public final void m11796t(int i) {
        this.f26945a.m11861c(m11797s(i));
    }

    /* renamed from: v */
    public Format mo6158v(Format format) {
        if (this.f26943H != 0 && format.f11201y != Long.MAX_VALUE) {
            return format.m29926a().m29875i0(format.f11201y + this.f26943H).m29914E();
        }
        return format;
    }

    /* renamed from: w */
    public final int m11794w() {
        return this.f26962r;
    }

    /* renamed from: x */
    public final synchronized long m11793x() {
        long j;
        if (this.f26961q == 0) {
            j = Long.MIN_VALUE;
        } else {
            j = this.f26958n[this.f26963s];
        }
        return j;
    }

    /* renamed from: y */
    public final synchronized long m11792y() {
        return this.f26967w;
    }

    /* renamed from: z */
    public final synchronized long m11791z() {
        return Math.max(this.f26966v, m11840A(this.f26964t));
    }
}