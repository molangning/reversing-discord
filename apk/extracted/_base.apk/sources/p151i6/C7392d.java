package p151i6;

import com.google.android.exoplayer2.InterfaceC4483u0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p099f8.InterfaceC6337h;
import p153i8.C7457n;
import p153i8.InterfaceC7440b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: i6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7392d implements InterfaceC7401l {

    /* renamed from: a */
    private final C7457n f19883a;

    /* renamed from: b */
    private final long f19884b;

    /* renamed from: c */
    private final long f19885c;

    /* renamed from: d */
    private final long f19886d;

    /* renamed from: e */
    private final long f19887e;

    /* renamed from: f */
    private final int f19888f;

    /* renamed from: g */
    private final boolean f19889g;

    /* renamed from: h */
    private final long f19890h;

    /* renamed from: i */
    private final boolean f19891i;

    /* renamed from: j */
    private int f19892j;

    /* renamed from: k */
    private boolean f19893k;

    /* renamed from: i6.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7393a {

        /* renamed from: a */
        private C7457n f19894a;

        /* renamed from: b */
        private int f19895b = 50000;

        /* renamed from: c */
        private int f19896c = 50000;

        /* renamed from: d */
        private int f19897d = 2500;

        /* renamed from: e */
        private int f19898e = 5000;

        /* renamed from: f */
        private int f19899f = -1;

        /* renamed from: g */
        private boolean f19900g = false;

        /* renamed from: h */
        private int f19901h = 0;

        /* renamed from: i */
        private boolean f19902i = false;

        /* renamed from: j */
        private boolean f19903j;

        /* renamed from: a */
        public C7392d m20774a() {
            C9149a.m16447f(!this.f19903j);
            this.f19903j = true;
            if (this.f19894a == null) {
                this.f19894a = new C7457n(true, 65536);
            }
            return new C7392d(this.f19894a, this.f19895b, this.f19896c, this.f19897d, this.f19898e, this.f19899f, this.f19900g, this.f19901h, this.f19902i);
        }

        @Deprecated
        /* renamed from: b */
        public C7392d m20773b() {
            return m20774a();
        }

        /* renamed from: c */
        public C7393a m20772c(C7457n c7457n) {
            C9149a.m16447f(!this.f19903j);
            this.f19894a = c7457n;
            return this;
        }

        /* renamed from: d */
        public C7393a m20771d(int i, int i2, int i3, int i4) {
            C9149a.m16447f(!this.f19903j);
            C7392d.m20778k(i3, 0, "bufferForPlaybackMs", "0");
            C7392d.m20778k(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            C7392d.m20778k(i, i3, "minBufferMs", "bufferForPlaybackMs");
            C7392d.m20778k(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            C7392d.m20778k(i2, i, "maxBufferMs", "minBufferMs");
            this.f19895b = i;
            this.f19896c = i2;
            this.f19897d = i3;
            this.f19898e = i4;
            return this;
        }

        /* renamed from: e */
        public C7393a m20770e(boolean z) {
            C9149a.m16447f(!this.f19903j);
            this.f19900g = z;
            return this;
        }

        /* renamed from: f */
        public C7393a m20769f(int i) {
            C9149a.m16447f(!this.f19903j);
            this.f19899f = i;
            return this;
        }
    }

    public C7392d() {
        this(new C7457n(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static void m20778k(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C9149a.m16451b(z, str + " cannot be less than " + str2);
    }

    /* renamed from: m */
    private static int m20776m(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 5 || i == 6) {
                        return 131072;
                    }
                    if (i == 7) {
                        return 0;
                    }
                    throw new IllegalArgumentException();
                }
                return 131072000;
            }
            return 13107200;
        }
        return 144310272;
    }

    /* renamed from: n */
    private void m20775n(boolean z) {
        int i = this.f19888f;
        if (i == -1) {
            i = 13107200;
        }
        this.f19892j = i;
        this.f19893k = false;
        if (z) {
            this.f19883a.m20639g();
        }
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: a */
    public void mo20756a() {
        m20775n(false);
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: b */
    public boolean mo20755b() {
        return this.f19891i;
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: c */
    public long mo20754c() {
        return this.f19890h;
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: d */
    public boolean mo20753d(long j, float f, boolean z, long j2) {
        long j3;
        long m16254d0 = C9191p0.m16254d0(j, f);
        if (z) {
            j3 = this.f19887e;
        } else {
            j3 = this.f19886d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 > 0 && m16254d0 < j3 && (this.f19889g || this.f19883a.m20640f() < this.f19892j)) {
            return false;
        }
        return true;
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: e */
    public InterfaceC7440b mo20752e() {
        return this.f19883a;
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: f */
    public void mo20751f() {
        m20775n(true);
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: g */
    public void mo20750g(InterfaceC4483u0[] interfaceC4483u0Arr, TrackGroupArray trackGroupArray, InterfaceC6337h[] interfaceC6337hArr) {
        int i = this.f19888f;
        if (i == -1) {
            i = m20777l(interfaceC4483u0Arr, interfaceC6337hArr);
        }
        this.f19892j = i;
        this.f19883a.m20638h(i);
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: h */
    public void mo20749h() {
        m20775n(true);
    }

    @Override // p151i6.InterfaceC7401l
    /* renamed from: i */
    public boolean mo20748i(long j, long j2, float f) {
        boolean z;
        boolean z2 = true;
        if (this.f19883a.m20640f() >= this.f19892j) {
            z = true;
        } else {
            z = false;
        }
        long j3 = this.f19884b;
        if (f > 1.0f) {
            j3 = Math.min(C9191p0.m16269W(j3, f), this.f19885c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (!this.f19889g && z) {
                z2 = false;
            }
            this.f19893k = z2;
            if (!z2 && j2 < 500000) {
                C9197r.m16178h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f19885c || z) {
            this.f19893k = false;
        }
        return this.f19893k;
    }

    /* renamed from: l */
    protected int m20777l(InterfaceC4483u0[] interfaceC4483u0Arr, InterfaceC6337h[] interfaceC6337hArr) {
        int i = 0;
        for (int i2 = 0; i2 < interfaceC4483u0Arr.length; i2++) {
            if (interfaceC6337hArr[i2] != null) {
                i += m20776m(interfaceC4483u0Arr[i2].mo20720d());
            }
        }
        return Math.max(13107200, i);
    }

    protected C7392d(C7457n c7457n, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m20778k(i3, 0, "bufferForPlaybackMs", "0");
        m20778k(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m20778k(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m20778k(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m20778k(i2, i, "maxBufferMs", "minBufferMs");
        m20778k(i6, 0, "backBufferDurationMs", "0");
        this.f19883a = c7457n;
        this.f19884b = C7390b.m20792c(i);
        this.f19885c = C7390b.m20792c(i2);
        this.f19886d = C7390b.m20792c(i3);
        this.f19887e = C7390b.m20792c(i4);
        this.f19888f = i5;
        this.f19892j = i5 == -1 ? 13107200 : i5;
        this.f19889g = z;
        this.f19890h = C7390b.m20792c(i6);
        this.f19891i = z2;
    }
}
