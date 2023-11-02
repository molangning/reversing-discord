package p382v6;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p151i6.C7390b;
import p151i6.C7402m;
import p193k6.C9066b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9198s;
import p195k8.C9204w;
import p195k8.C9208y;
import p259o6.C11028l;
import p296q6.C11736d;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: v6.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13119e implements InterfaceC11746i {

    /* renamed from: b0 */
    public static final InterfaceC11753o f33970b0 = new InterfaceC11753o() { // from class: v6.d
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m3225A;
            m3225A = C13119e.m3225A();
            return m3225A;
        }
    };

    /* renamed from: c0 */
    private static final byte[] f33971c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0 */
    private static final byte[] f33972d0 = C9191p0.m16238l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f33973e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0 */
    private static final UUID f33974f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0 */
    private static final Map<String, Integer> f33975g0;

    /* renamed from: A */
    private long f33976A;

    /* renamed from: B */
    private long f33977B;

    /* renamed from: C */
    private C9198s f33978C;

    /* renamed from: D */
    private C9198s f33979D;

    /* renamed from: E */
    private boolean f33980E;

    /* renamed from: F */
    private boolean f33981F;

    /* renamed from: G */
    private int f33982G;

    /* renamed from: H */
    private long f33983H;

    /* renamed from: I */
    private long f33984I;

    /* renamed from: J */
    private int f33985J;

    /* renamed from: K */
    private int f33986K;

    /* renamed from: L */
    private int[] f33987L;

    /* renamed from: M */
    private int f33988M;

    /* renamed from: N */
    private int f33989N;

    /* renamed from: O */
    private int f33990O;

    /* renamed from: P */
    private int f33991P;

    /* renamed from: Q */
    private boolean f33992Q;

    /* renamed from: R */
    private int f33993R;

    /* renamed from: S */
    private int f33994S;

    /* renamed from: T */
    private int f33995T;

    /* renamed from: U */
    private boolean f33996U;

    /* renamed from: V */
    private boolean f33997V;

    /* renamed from: W */
    private boolean f33998W;

    /* renamed from: X */
    private int f33999X;

    /* renamed from: Y */
    private byte f34000Y;

    /* renamed from: Z */
    private boolean f34001Z;

    /* renamed from: a */
    private final InterfaceC13117c f34002a;

    /* renamed from: a0 */
    private InterfaceC11748k f34003a0;

    /* renamed from: b */
    private final C13125g f34004b;

    /* renamed from: c */
    private final SparseArray<C13122c> f34005c;

    /* renamed from: d */
    private final boolean f34006d;

    /* renamed from: e */
    private final C9208y f34007e;

    /* renamed from: f */
    private final C9208y f34008f;

    /* renamed from: g */
    private final C9208y f34009g;

    /* renamed from: h */
    private final C9208y f34010h;

    /* renamed from: i */
    private final C9208y f34011i;

    /* renamed from: j */
    private final C9208y f34012j;

    /* renamed from: k */
    private final C9208y f34013k;

    /* renamed from: l */
    private final C9208y f34014l;

    /* renamed from: m */
    private final C9208y f34015m;

    /* renamed from: n */
    private final C9208y f34016n;

    /* renamed from: o */
    private ByteBuffer f34017o;

    /* renamed from: p */
    private long f34018p;

    /* renamed from: q */
    private long f34019q;

    /* renamed from: r */
    private long f34020r;

    /* renamed from: s */
    private long f34021s;

    /* renamed from: t */
    private long f34022t;

    /* renamed from: u */
    private C13122c f34023u;

    /* renamed from: v */
    private boolean f34024v;

    /* renamed from: w */
    private int f34025w;

    /* renamed from: x */
    private long f34026x;

    /* renamed from: y */
    private boolean f34027y;

    /* renamed from: z */
    private long f34028z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C13121b implements InterfaceC13116b {
        private C13121b() {
            C13119e.this = r1;
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: a */
        public void mo3191a(int i) {
            C13119e.this.m3203o(i);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: b */
        public void mo3190b(int i, double d) {
            C13119e.this.m3200r(i, d);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: c */
        public void mo3189c(int i, long j) {
            C13119e.this.m3194x(i, j);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: d */
        public int mo3188d(int i) {
            return C13119e.this.m3197u(i);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: e */
        public boolean mo3187e(int i) {
            return C13119e.this.m3192z(i);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: f */
        public void mo3186f(int i, int i2, InterfaceC11747j interfaceC11747j) {
            C13119e.this.m3206l(i, i2, interfaceC11747j);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: g */
        public void mo3185g(int i, String str) {
            C13119e.this.m3218H(i, str);
        }

        @Override // p382v6.InterfaceC13116b
        /* renamed from: h */
        public void mo3184h(int i, long j, long j2) {
            C13119e.this.m3219G(i, j, j2);
        }
    }

    /* renamed from: v6.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13122c {

        /* renamed from: A */
        public int f34030A;

        /* renamed from: B */
        public int f34031B;

        /* renamed from: C */
        public int f34032C;

        /* renamed from: D */
        public float f34033D;

        /* renamed from: E */
        public float f34034E;

        /* renamed from: F */
        public float f34035F;

        /* renamed from: G */
        public float f34036G;

        /* renamed from: H */
        public float f34037H;

        /* renamed from: I */
        public float f34038I;

        /* renamed from: J */
        public float f34039J;

        /* renamed from: K */
        public float f34040K;

        /* renamed from: L */
        public float f34041L;

        /* renamed from: M */
        public float f34042M;

        /* renamed from: N */
        public byte[] f34043N;

        /* renamed from: O */
        public int f34044O;

        /* renamed from: P */
        public int f34045P;

        /* renamed from: Q */
        public int f34046Q;

        /* renamed from: R */
        public long f34047R;

        /* renamed from: S */
        public long f34048S;

        /* renamed from: T */
        public C13123d f34049T;

        /* renamed from: U */
        public boolean f34050U;

        /* renamed from: V */
        public boolean f34051V;

        /* renamed from: W */
        private String f34052W;

        /* renamed from: X */
        public InterfaceC11732b0 f34053X;

        /* renamed from: Y */
        public int f34054Y;

        /* renamed from: a */
        public String f34055a;

        /* renamed from: b */
        public String f34056b;

        /* renamed from: c */
        public int f34057c;

        /* renamed from: d */
        public int f34058d;

        /* renamed from: e */
        public int f34059e;

        /* renamed from: f */
        public int f34060f;

        /* renamed from: g */
        private int f34061g;

        /* renamed from: h */
        public boolean f34062h;

        /* renamed from: i */
        public byte[] f34063i;

        /* renamed from: j */
        public InterfaceC11732b0.C11733a f34064j;

        /* renamed from: k */
        public byte[] f34065k;

        /* renamed from: l */
        public C11028l f34066l;

        /* renamed from: m */
        public int f34067m;

        /* renamed from: n */
        public int f34068n;

        /* renamed from: o */
        public int f34069o;

        /* renamed from: p */
        public int f34070p;

        /* renamed from: q */
        public int f34071q;

        /* renamed from: r */
        public int f34072r;

        /* renamed from: s */
        public float f34073s;

        /* renamed from: t */
        public float f34074t;

        /* renamed from: u */
        public float f34075u;

        /* renamed from: v */
        public byte[] f34076v;

        /* renamed from: w */
        public int f34077w;

        /* renamed from: x */
        public boolean f34078x;

        /* renamed from: y */
        public int f34079y;

        /* renamed from: z */
        public int f34080z;

        private C13122c() {
            this.f34067m = -1;
            this.f34068n = -1;
            this.f34069o = -1;
            this.f34070p = -1;
            this.f34071q = 0;
            this.f34072r = -1;
            this.f34073s = 0.0f;
            this.f34074t = 0.0f;
            this.f34075u = 0.0f;
            this.f34076v = null;
            this.f34077w = -1;
            this.f34078x = false;
            this.f34079y = -1;
            this.f34080z = -1;
            this.f34030A = -1;
            this.f34031B = RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            this.f34032C = ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION;
            this.f34033D = -1.0f;
            this.f34034E = -1.0f;
            this.f34035F = -1.0f;
            this.f34036G = -1.0f;
            this.f34037H = -1.0f;
            this.f34038I = -1.0f;
            this.f34039J = -1.0f;
            this.f34040K = -1.0f;
            this.f34041L = -1.0f;
            this.f34042M = -1.0f;
            this.f34044O = 1;
            this.f34045P = -1;
            this.f34046Q = 8000;
            this.f34047R = 0L;
            this.f34048S = 0L;
            this.f34051V = true;
            this.f34052W = "eng";
        }

        @EnsuresNonNull({"output"})
        /* renamed from: e */
        public void m3179e() {
            C9149a.m16448e(this.f34053X);
        }

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: f */
        private byte[] m3178f(String str) {
            byte[] bArr = this.f34065k;
            if (bArr != null) {
                return bArr;
            }
            throw new C7402m("Missing CodecPrivate for codec " + str);
        }

        /* renamed from: g */
        private byte[] m3177g() {
            if (this.f34033D != -1.0f && this.f34034E != -1.0f && this.f34035F != -1.0f && this.f34036G != -1.0f && this.f34037H != -1.0f && this.f34038I != -1.0f && this.f34039J != -1.0f && this.f34040K != -1.0f && this.f34041L != -1.0f && this.f34042M != -1.0f) {
                byte[] bArr = new byte[25];
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                order.put((byte) 0);
                order.putShort((short) ((this.f34033D * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34034E * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34035F * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34036G * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34037H * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34038I * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34039J * 50000.0f) + 0.5f));
                order.putShort((short) ((this.f34040K * 50000.0f) + 0.5f));
                order.putShort((short) (this.f34041L + 0.5f));
                order.putShort((short) (this.f34042M + 0.5f));
                order.putShort((short) this.f34031B);
                order.putShort((short) this.f34032C);
                return bArr;
            }
            return null;
        }

        /* renamed from: j */
        private static Pair<String, List<byte[]>> m3174j(C9208y c9208y) {
            try {
                c9208y.m16098Q(16);
                long m16078t = c9208y.m16078t();
                if (m16078t == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (m16078t == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (m16078t == 826496599) {
                    byte[] m16094d = c9208y.m16094d();
                    for (int m16093e = c9208y.m16093e() + 20; m16093e < m16094d.length - 4; m16093e++) {
                        if (m16094d[m16093e] == 0 && m16094d[m16093e + 1] == 0 && m16094d[m16093e + 2] == 1 && m16094d[m16093e + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m16094d, m16093e, m16094d.length)));
                        }
                    }
                    throw new C7402m("Failed to find FourCC VC1 initialization data");
                }
                C9197r.m16178h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C7402m("Error parsing FourCC private data");
            }
        }

        /* renamed from: k */
        private static boolean m3173k(C9208y c9208y) {
            try {
                int m16076v = c9208y.m16076v();
                if (m16076v == 1) {
                    return true;
                }
                if (m16076v != 65534) {
                    return false;
                }
                c9208y.m16099P(24);
                if (c9208y.m16075w() == C13119e.f33974f0.getMostSignificantBits()) {
                    if (c9208y.m16075w() == C13119e.f33974f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C7402m("Error parsing MS/ACM codec private");
            }
        }

        /* renamed from: l */
        private static List<byte[]> m3172l(byte[] bArr) {
            int i;
            int i2;
            try {
                if (bArr[0] == 2) {
                    int i3 = 0;
                    int i4 = 1;
                    while (true) {
                        i = bArr[i4];
                        if ((i & 255) != 255) {
                            break;
                        }
                        i3 += 255;
                        i4++;
                    }
                    int i5 = i4 + 1;
                    int i6 = i3 + (i & 255);
                    int i7 = 0;
                    while (true) {
                        i2 = bArr[i5];
                        if ((i2 & 255) != 255) {
                            break;
                        }
                        i7 += 255;
                        i5++;
                    }
                    int i8 = i5 + 1;
                    int i9 = i7 + (i2 & 255);
                    if (bArr[i8] == 1) {
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(bArr, i8, bArr2, 0, i6);
                        int i10 = i8 + i6;
                        if (bArr[i10] == 3) {
                            int i11 = i10 + i9;
                            if (bArr[i11] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i11];
                                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new C7402m("Error parsing vorbis codec private");
                        }
                        throw new C7402m("Error parsing vorbis codec private");
                    }
                    throw new C7402m("Error parsing vorbis codec private");
                }
                throw new C7402m("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C7402m("Error parsing vorbis codec private");
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:472:0x043d  */
        /* JADX WARN: Removed duplicated region for block: B:477:0x0455  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x0464  */
        /* JADX WARN: Removed duplicated region for block: B:482:0x0476  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x0580  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m3176h(p296q6.InterfaceC11748k r21, int r22) {
            /*
                Method dump skipped, instructions count: 1680
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p382v6.C13119e.C13122c.m3176h(q6.k, int):void");
        }

        @RequiresNonNull({"output"})
        /* renamed from: i */
        public void m3175i() {
            C13123d c13123d = this.f34049T;
            if (c13123d != null) {
                c13123d.m3170a(this);
            }
        }

        /* renamed from: m */
        public void m3171m() {
            C13123d c13123d = this.f34049T;
            if (c13123d != null) {
                c13123d.m3169b();
            }
        }
    }

    /* renamed from: v6.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13123d {

        /* renamed from: a */
        private final byte[] f34081a = new byte[10];

        /* renamed from: b */
        private boolean f34082b;

        /* renamed from: c */
        private int f34083c;

        /* renamed from: d */
        private long f34084d;

        /* renamed from: e */
        private int f34085e;

        /* renamed from: f */
        private int f34086f;

        /* renamed from: g */
        private int f34087g;

        @RequiresNonNull({"#1.output"})
        /* renamed from: a */
        public void m3170a(C13122c c13122c) {
            if (this.f34083c > 0) {
                c13122c.f34053X.mo6162f(this.f34084d, this.f34085e, this.f34086f, this.f34087g, c13122c.f34064j);
                this.f34083c = 0;
            }
        }

        /* renamed from: b */
        public void m3169b() {
            this.f34082b = false;
            this.f34083c = 0;
        }

        @RequiresNonNull({"#1.output"})
        /* renamed from: c */
        public void m3168c(C13122c c13122c, long j, int i, int i2, int i3) {
            if (!this.f34082b) {
                return;
            }
            int i4 = this.f34083c;
            int i5 = i4 + 1;
            this.f34083c = i5;
            if (i4 == 0) {
                this.f34084d = j;
                this.f34085e = i;
                this.f34086f = 0;
            }
            this.f34086f += i2;
            this.f34087g = i3;
            if (i5 >= 16) {
                m3170a(c13122c);
            }
        }

        /* renamed from: d */
        public void m3167d(InterfaceC11747j interfaceC11747j) {
            if (this.f34082b) {
                return;
            }
            interfaceC11747j.mo6963n(this.f34081a, 0, 10);
            interfaceC11747j.mo6969e();
            if (C9066b.m16771i(this.f34081a) == 0) {
                return;
            }
            this.f34082b = true;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f33975g0 = Collections.unmodifiableMap(hashMap);
    }

    public C13119e() {
        this(0);
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC11746i[] m3225A() {
        return new InterfaceC11746i[]{new C13119e()};
    }

    /* renamed from: B */
    private boolean m3224B(C11765x c11765x, long j) {
        if (this.f34027y) {
            this.f33976A = j;
            c11765x.f30668a = this.f34028z;
            this.f34027y = false;
            return true;
        }
        if (this.f34024v) {
            long j2 = this.f33976A;
            if (j2 != -1) {
                c11765x.f30668a = j2;
                this.f33976A = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m3223C(InterfaceC11747j interfaceC11747j, int i) {
        if (this.f34009g.m16092f() >= i) {
            return;
        }
        if (this.f34009g.m16096b() < i) {
            C9208y c9208y = this.f34009g;
            c9208y.m16095c(Math.max(c9208y.m16096b() * 2, i));
        }
        interfaceC11747j.readFully(this.f34009g.m16094d(), this.f34009g.m16092f(), i - this.f34009g.m16092f());
        this.f34009g.m16100O(i);
    }

    /* renamed from: D */
    private void m3222D() {
        this.f33993R = 0;
        this.f33994S = 0;
        this.f33995T = 0;
        this.f33996U = false;
        this.f33997V = false;
        this.f33998W = false;
        this.f33999X = 0;
        this.f34000Y = (byte) 0;
        this.f34001Z = false;
        this.f34012j.m16103L(0);
    }

    /* renamed from: E */
    private long m3221E(long j) {
        long j2 = this.f34020r;
        if (j2 != -9223372036854775807L) {
            return C9191p0.m16296I0(j, j2, 1000L);
        }
        throw new C7402m("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: F */
    private static void m3220F(String str, long j, byte[] bArr) {
        byte[] m3199s;
        int i;
        str.hashCode();
        if (!str.equals("S_TEXT/ASS")) {
            if (str.equals("S_TEXT/UTF8")) {
                m3199s = m3199s(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            m3199s = m3199s(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        }
        System.arraycopy(m3199s, 0, bArr, i, m3199s.length);
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: I */
    private int m3217I(InterfaceC11747j interfaceC11747j, C13122c c13122c, int i) {
        boolean z;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c13122c.f34056b)) {
            m3216J(interfaceC11747j, f33971c0, i);
            return m3201q();
        } else if ("S_TEXT/ASS".equals(c13122c.f34056b)) {
            m3216J(interfaceC11747j, f33973e0, i);
            return m3201q();
        } else {
            InterfaceC11732b0 interfaceC11732b0 = c13122c.f34053X;
            boolean z3 = true;
            if (!this.f33996U) {
                if (c13122c.f34062h) {
                    this.f33990O &= -1073741825;
                    int i3 = 128;
                    if (!this.f33997V) {
                        interfaceC11747j.readFully(this.f34009g.m16094d(), 0, 1);
                        this.f33993R++;
                        if ((this.f34009g.m16094d()[0] & 128) != 128) {
                            this.f34000Y = this.f34009g.m16094d()[0];
                            this.f33997V = true;
                        } else {
                            throw new C7402m("Extension bit is set in signal byte");
                        }
                    }
                    byte b = this.f34000Y;
                    if ((b & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if ((b & 2) == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f33990O |= 1073741824;
                        if (!this.f34001Z) {
                            interfaceC11747j.readFully(this.f34014l.m16094d(), 0, 8);
                            this.f33993R += 8;
                            this.f34001Z = true;
                            byte[] m16094d = this.f34009g.m16094d();
                            if (!z2) {
                                i3 = 0;
                            }
                            m16094d[0] = (byte) (i3 | 8);
                            this.f34009g.m16099P(0);
                            interfaceC11732b0.mo6169b(this.f34009g, 1, 1);
                            this.f33994S++;
                            this.f34014l.m16099P(0);
                            interfaceC11732b0.mo6169b(this.f34014l, 8, 1);
                            this.f33994S += 8;
                        }
                        if (z2) {
                            if (!this.f33998W) {
                                interfaceC11747j.readFully(this.f34009g.m16094d(), 0, 1);
                                this.f33993R++;
                                this.f34009g.m16099P(0);
                                this.f33999X = this.f34009g.m16111D();
                                this.f33998W = true;
                            }
                            int i4 = this.f33999X * 4;
                            this.f34009g.m16103L(i4);
                            interfaceC11747j.readFully(this.f34009g.m16094d(), 0, i4);
                            this.f33993R += i4;
                            short s = (short) ((this.f33999X / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f34017o;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f34017o = ByteBuffer.allocate(i5);
                            }
                            this.f34017o.position(0);
                            this.f34017o.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f33999X;
                                if (i6 >= i2) {
                                    break;
                                }
                                int m16107H = this.f34009g.m16107H();
                                if (i6 % 2 == 0) {
                                    this.f34017o.putShort((short) (m16107H - i7));
                                } else {
                                    this.f34017o.putInt(m16107H - i7);
                                }
                                i6++;
                                i7 = m16107H;
                            }
                            int i8 = (i - this.f33993R) - i7;
                            if (i2 % 2 == 1) {
                                this.f34017o.putInt(i8);
                            } else {
                                this.f34017o.putShort((short) i8);
                                this.f34017o.putInt(0);
                            }
                            this.f34015m.m16101N(this.f34017o.array(), i5);
                            interfaceC11732b0.mo6169b(this.f34015m, i5, 1);
                            this.f33994S += i5;
                        }
                    }
                } else {
                    byte[] bArr = c13122c.f34063i;
                    if (bArr != null) {
                        this.f34012j.m16101N(bArr, bArr.length);
                    }
                }
                if (c13122c.f34060f > 0) {
                    this.f33990O |= 268435456;
                    this.f34016n.m16103L(0);
                    this.f34009g.m16103L(4);
                    this.f34009g.m16094d()[0] = (byte) ((i >> 24) & 255);
                    this.f34009g.m16094d()[1] = (byte) ((i >> 16) & 255);
                    this.f34009g.m16094d()[2] = (byte) ((i >> 8) & 255);
                    this.f34009g.m16094d()[3] = (byte) (i & 255);
                    interfaceC11732b0.mo6169b(this.f34009g, 4, 2);
                    this.f33994S += 4;
                }
                this.f33996U = true;
            }
            int m16092f = i + this.f34012j.m16092f();
            if (!"V_MPEG4/ISO/AVC".equals(c13122c.f34056b) && !"V_MPEGH/ISO/HEVC".equals(c13122c.f34056b)) {
                if (c13122c.f34049T != null) {
                    if (this.f34012j.m16092f() != 0) {
                        z3 = false;
                    }
                    C9149a.m16447f(z3);
                    c13122c.f34049T.m3167d(interfaceC11747j);
                }
                while (true) {
                    int i9 = this.f33993R;
                    if (i9 >= m16092f) {
                        break;
                    }
                    int m3215K = m3215K(interfaceC11747j, interfaceC11732b0, m16092f - i9);
                    this.f33993R += m3215K;
                    this.f33994S += m3215K;
                }
            } else {
                byte[] m16094d2 = this.f34008f.m16094d();
                m16094d2[0] = 0;
                m16094d2[1] = 0;
                m16094d2[2] = 0;
                int i10 = c13122c.f34054Y;
                int i11 = 4 - i10;
                while (this.f33993R < m16092f) {
                    int i12 = this.f33995T;
                    if (i12 == 0) {
                        m3214L(interfaceC11747j, m16094d2, i11, i10);
                        this.f33993R += i10;
                        this.f34008f.m16099P(0);
                        this.f33995T = this.f34008f.m16107H();
                        this.f34007e.m16099P(0);
                        interfaceC11732b0.mo6170a(this.f34007e, 4);
                        this.f33994S += 4;
                    } else {
                        int m3215K2 = m3215K(interfaceC11747j, interfaceC11732b0, i12);
                        this.f33993R += m3215K2;
                        this.f33994S += m3215K2;
                        this.f33995T -= m3215K2;
                    }
                }
            }
            if ("A_VORBIS".equals(c13122c.f34056b)) {
                this.f34010h.m16099P(0);
                interfaceC11732b0.mo6170a(this.f34010h, 4);
                this.f33994S += 4;
            }
            return m3201q();
        }
    }

    /* renamed from: J */
    private void m3216J(InterfaceC11747j interfaceC11747j, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f34013k.m16096b() < length) {
            this.f34013k.m16102M(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f34013k.m16094d(), 0, bArr.length);
        }
        interfaceC11747j.readFully(this.f34013k.m16094d(), bArr.length, i);
        this.f34013k.m16099P(0);
        this.f34013k.m16100O(length);
    }

    /* renamed from: K */
    private int m3215K(InterfaceC11747j interfaceC11747j, InterfaceC11732b0 interfaceC11732b0, int i) {
        int m16097a = this.f34012j.m16097a();
        if (m16097a > 0) {
            int min = Math.min(i, m16097a);
            interfaceC11732b0.mo6170a(this.f34012j, min);
            return min;
        }
        return interfaceC11732b0.mo6167d(interfaceC11747j, i, false);
    }

    /* renamed from: L */
    private void m3214L(InterfaceC11747j interfaceC11747j, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f34012j.m16097a());
        interfaceC11747j.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f34012j.m16088j(bArr, i, min);
        }
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: i */
    private void m3209i(int i) {
        if (this.f33978C != null && this.f33979D != null) {
            return;
        }
        throw new C7402m("Element " + i + " must be in a Cues");
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: j */
    private void m3208j(int i) {
        if (this.f34023u != null) {
            return;
        }
        throw new C7402m("Element " + i + " must be in a TrackEntry");
    }

    @EnsuresNonNull({"extractorOutput"})
    /* renamed from: k */
    private void m3207k() {
        C9149a.m16445h(this.f34003a0);
    }

    /* renamed from: m */
    private InterfaceC11766y m3205m(C9198s c9198s, C9198s c9198s2) {
        int i;
        if (this.f34019q != -1 && this.f34022t != -9223372036854775807L && c9198s != null && c9198s.m16174c() != 0 && c9198s2 != null && c9198s2.m16174c() == c9198s.m16174c()) {
            int m16174c = c9198s.m16174c();
            int[] iArr = new int[m16174c];
            long[] jArr = new long[m16174c];
            long[] jArr2 = new long[m16174c];
            long[] jArr3 = new long[m16174c];
            int i2 = 0;
            for (int i3 = 0; i3 < m16174c; i3++) {
                jArr3[i3] = c9198s.m16175b(i3);
                jArr[i3] = this.f34019q + c9198s2.m16175b(i3);
            }
            while (true) {
                i = m16174c - 1;
                if (i2 >= i) {
                    break;
                }
                int i4 = i2 + 1;
                iArr[i2] = (int) (jArr[i4] - jArr[i2]);
                jArr2[i2] = jArr3[i4] - jArr3[i2];
                i2 = i4;
            }
            iArr[i] = (int) ((this.f34019q + this.f34018p) - jArr[i]);
            long j = this.f34022t - jArr3[i];
            jArr2[i] = j;
            if (j <= 0) {
                C9197r.m16178h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
                iArr = Arrays.copyOf(iArr, i);
                jArr = Arrays.copyOf(jArr, i);
                jArr2 = Arrays.copyOf(jArr2, i);
                jArr3 = Arrays.copyOf(jArr3, i);
            }
            return new C11736d(iArr, jArr, jArr2, jArr3);
        }
        return new InterfaceC11766y.C11768b(this.f34022t);
    }

    @RequiresNonNull({"#1.output"})
    /* renamed from: n */
    private void m3204n(C13122c c13122c, long j, int i, int i2, int i3) {
        C13123d c13123d = c13122c.f34049T;
        if (c13123d != null) {
            c13123d.m3168c(c13122c, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(c13122c.f34056b) || "S_TEXT/ASS".equals(c13122c.f34056b)) {
                if (this.f33986K > 1) {
                    C9197r.m16178h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f33984I;
                    if (j2 == -9223372036854775807L) {
                        C9197r.m16178h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m3220F(c13122c.f34056b, j2, this.f34013k.m16094d());
                        int m16093e = this.f34013k.m16093e();
                        while (true) {
                            if (m16093e >= this.f34013k.m16092f()) {
                                break;
                            } else if (this.f34013k.m16094d()[m16093e] == 0) {
                                this.f34013k.m16100O(m16093e);
                                break;
                            } else {
                                m16093e++;
                            }
                        }
                        InterfaceC11732b0 interfaceC11732b0 = c13122c.f34053X;
                        C9208y c9208y = this.f34013k;
                        interfaceC11732b0.mo6170a(c9208y, c9208y.m16092f());
                        i2 += this.f34013k.m16092f();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f33986K > 1) {
                    i &= -268435457;
                } else {
                    int m16092f = this.f34016n.m16092f();
                    c13122c.f34053X.mo6169b(this.f34016n, m16092f, 2);
                    i2 += m16092f;
                }
            }
            c13122c.f34053X.mo6162f(j, i, i2, i3, c13122c.f34064j);
        }
        this.f33981F = true;
    }

    /* renamed from: p */
    private static int[] m3202p(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: q */
    private int m3201q() {
        int i = this.f33994S;
        m3222D();
        return i;
    }

    /* renamed from: s */
    private static byte[] m3199s(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C9191p0.m16238l0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    /* renamed from: t */
    private C13122c m3198t(int i) {
        m3208j(i);
        return this.f34023u;
    }

    /* renamed from: y */
    private static boolean m3193y(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 31;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: G */
    protected void m3219G(int i, long j, long j2) {
        m3207k();
        if (i != 160) {
            if (i != 174) {
                if (i != 187) {
                    if (i != 19899) {
                        if (i != 20533) {
                            if (i != 21968) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i == 524531317 && !this.f34024v) {
                                            if (this.f34006d && this.f34028z != -1) {
                                                this.f34027y = true;
                                                return;
                                            }
                                            this.f34003a0.mo3739i(new InterfaceC11766y.C11768b(this.f34022t));
                                            this.f34024v = true;
                                            return;
                                        }
                                        return;
                                    }
                                    this.f33978C = new C9198s();
                                    this.f33979D = new C9198s();
                                    return;
                                }
                                long j3 = this.f34019q;
                                if (j3 != -1 && j3 != j) {
                                    throw new C7402m("Multiple Segment elements not supported");
                                }
                                this.f34019q = j;
                                this.f34018p = j2;
                                return;
                            }
                            m3198t(i).f34078x = true;
                            return;
                        }
                        m3198t(i).f34062h = true;
                        return;
                    }
                    this.f34025w = -1;
                    this.f34026x = -1L;
                    return;
                }
                this.f33980E = false;
                return;
            }
            this.f34023u = new C13122c();
            return;
        }
        this.f33992Q = false;
    }

    /* renamed from: H */
    protected void m3218H(int i, String str) {
        if (i != 134) {
            if (i != 17026) {
                if (i != 21358) {
                    if (i == 2274716) {
                        m3198t(i).f34052W = str;
                        return;
                    }
                    return;
                }
                m3198t(i).f34055a = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new C7402m("DocType " + str + " not supported");
            } else {
                return;
            }
        }
        m3198t(i).f34056b = str;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f33977B = -9223372036854775807L;
        this.f33982G = 0;
        this.f34002a.reset();
        this.f34004b.m3160e();
        m3222D();
        for (int i = 0; i < this.f34005c.size(); i++) {
            this.f34005c.valueAt(i).m3171m();
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public final void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f34003a0 = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public final int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        this.f33981F = false;
        boolean z = true;
        while (z && !this.f33981F) {
            z = this.f34002a.mo3227a(interfaceC11747j);
            if (z && m3224B(c11765x, interfaceC11747j.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f34005c.size(); i++) {
            C13122c valueAt = this.f34005c.valueAt(i);
            valueAt.m3179e();
            valueAt.m3175i();
        }
        return -1;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public final boolean mo659e(InterfaceC11747j interfaceC11747j) {
        return new C13124f().m3165b(interfaceC11747j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0236, code lost:
        throw new p151i6.C7402m("EBML lacing sample size out of range.");
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m3206l(int r21, int r22, p296q6.InterfaceC11747j r23) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p382v6.C13119e.m3206l(int, int, q6.j):void");
    }

    /* renamed from: o */
    protected void m3203o(int i) {
        m3207k();
        if (i != 160) {
            if (i != 174) {
                if (i != 19899) {
                    if (i != 25152) {
                        if (i != 28032) {
                            if (i != 357149030) {
                                if (i != 374648427) {
                                    if (i == 475249515) {
                                        if (!this.f34024v) {
                                            this.f34003a0.mo3739i(m3205m(this.f33978C, this.f33979D));
                                            this.f34024v = true;
                                        }
                                        this.f33978C = null;
                                        this.f33979D = null;
                                        return;
                                    }
                                    return;
                                } else if (this.f34005c.size() != 0) {
                                    this.f34003a0.mo3738s();
                                    return;
                                } else {
                                    throw new C7402m("No valid tracks were found");
                                }
                            }
                            if (this.f34020r == -9223372036854775807L) {
                                this.f34020r = 1000000L;
                            }
                            long j = this.f34021s;
                            if (j != -9223372036854775807L) {
                                this.f34022t = m3221E(j);
                                return;
                            }
                            return;
                        }
                        m3208j(i);
                        C13122c c13122c = this.f34023u;
                        if (c13122c.f34062h && c13122c.f34063i != null) {
                            throw new C7402m("Combining encryption and compression is not supported");
                        }
                        return;
                    }
                    m3208j(i);
                    C13122c c13122c2 = this.f34023u;
                    if (c13122c2.f34062h) {
                        if (c13122c2.f34064j != null) {
                            c13122c2.f34066l = new C11028l(new C11028l.C11030b(C7390b.f19878a, "video/webm", this.f34023u.f34064j.f30577b));
                            return;
                        }
                        throw new C7402m("Encrypted Track found but ContentEncKeyID was not found");
                    }
                    return;
                }
                int i2 = this.f34025w;
                if (i2 != -1) {
                    long j2 = this.f34026x;
                    if (j2 != -1) {
                        if (i2 == 475249515) {
                            this.f34028z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new C7402m("Mandatory element SeekID or SeekPosition not found");
            }
            C13122c c13122c3 = (C13122c) C9149a.m16445h(this.f34023u);
            String str = c13122c3.f34056b;
            if (str != null) {
                if (m3193y(str)) {
                    c13122c3.m3176h(this.f34003a0, c13122c3.f34057c);
                    this.f34005c.put(c13122c3.f34057c, c13122c3);
                }
                this.f34023u = null;
                return;
            }
            throw new C7402m("CodecId is missing in TrackEntry element");
        } else if (this.f33982G == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f33986K; i4++) {
                i3 += this.f33987L[i4];
            }
            C13122c c13122c4 = this.f34005c.get(this.f33988M);
            c13122c4.m3179e();
            for (int i5 = 0; i5 < this.f33986K; i5++) {
                long j3 = ((c13122c4.f34059e * i5) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + this.f33983H;
                int i6 = this.f33990O;
                if (i5 == 0 && !this.f33992Q) {
                    i6 |= 1;
                }
                int i7 = this.f33987L[i5];
                i3 -= i7;
                m3204n(c13122c4, j3, i6, i7, i3);
            }
            this.f33982G = 0;
        }
    }

    /* renamed from: r */
    protected void m3200r(int i, double d) {
        if (i != 181) {
            if (i != 17545) {
                switch (i) {
                    case 21969:
                        m3198t(i).f34033D = (float) d;
                        return;
                    case 21970:
                        m3198t(i).f34034E = (float) d;
                        return;
                    case 21971:
                        m3198t(i).f34035F = (float) d;
                        return;
                    case 21972:
                        m3198t(i).f34036G = (float) d;
                        return;
                    case 21973:
                        m3198t(i).f34037H = (float) d;
                        return;
                    case 21974:
                        m3198t(i).f34038I = (float) d;
                        return;
                    case 21975:
                        m3198t(i).f34039J = (float) d;
                        return;
                    case 21976:
                        m3198t(i).f34040K = (float) d;
                        return;
                    case 21977:
                        m3198t(i).f34041L = (float) d;
                        return;
                    case 21978:
                        m3198t(i).f34042M = (float) d;
                        return;
                    default:
                        switch (i) {
                            case 30323:
                                m3198t(i).f34073s = (float) d;
                                return;
                            case 30324:
                                m3198t(i).f34074t = (float) d;
                                return;
                            case 30325:
                                m3198t(i).f34075u = (float) d;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f34021s = (long) d;
            return;
        }
        m3198t(i).f34046Q = (int) d;
    }

    @Override // p296q6.InterfaceC11746i
    public final void release() {
    }

    /* renamed from: u */
    protected int m3197u(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    protected void m3196v(C13122c c13122c, InterfaceC11747j interfaceC11747j, int i) {
        if (c13122c.f34061g != 1685485123 && c13122c.f34061g != 1685480259) {
            interfaceC11747j.mo6965k(i);
            return;
        }
        byte[] bArr = new byte[i];
        c13122c.f34043N = bArr;
        interfaceC11747j.readFully(bArr, 0, i);
    }

    /* renamed from: w */
    protected void m3195w(C13122c c13122c, int i, InterfaceC11747j interfaceC11747j, int i2) {
        if (i == 4 && "V_VP9".equals(c13122c.f34056b)) {
            this.f34016n.m16103L(i2);
            interfaceC11747j.readFully(this.f34016n.m16094d(), 0, i2);
            return;
        }
        interfaceC11747j.mo6965k(i2);
    }

    /* renamed from: x */
    protected void m3194x(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m3198t(i).f34058d = (int) j;
                        return;
                    case 136:
                        C13122c m3198t = m3198t(i);
                        if (j == 1) {
                            z = true;
                        }
                        m3198t.f34051V = z;
                        return;
                    case 155:
                        this.f33984I = m3221E(j);
                        return;
                    case 159:
                        m3198t(i).f34044O = (int) j;
                        return;
                    case 176:
                        m3198t(i).f34067m = (int) j;
                        return;
                    case 179:
                        m3209i(i);
                        this.f33978C.m16176a(m3221E(j));
                        return;
                    case 186:
                        m3198t(i).f34068n = (int) j;
                        return;
                    case 215:
                        m3198t(i).f34057c = (int) j;
                        return;
                    case 231:
                        this.f33977B = m3221E(j);
                        return;
                    case 238:
                        this.f33991P = (int) j;
                        return;
                    case 241:
                        if (!this.f33980E) {
                            m3209i(i);
                            this.f33979D.m16176a(j);
                            this.f33980E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f33992Q = true;
                        return;
                    case 16871:
                        m3198t(i).f34061g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new C7402m("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new C7402m("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new C7402m("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new C7402m("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new C7402m("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.f34026x = j + this.f34019q;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        m3208j(i);
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 3) {
                                    if (i2 == 15) {
                                        this.f34023u.f34077w = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.f34023u.f34077w = 1;
                                return;
                            }
                            this.f34023u.f34077w = 2;
                            return;
                        }
                        this.f34023u.f34077w = 0;
                        return;
                    case 21680:
                        m3198t(i).f34069o = (int) j;
                        return;
                    case 21682:
                        m3198t(i).f34071q = (int) j;
                        return;
                    case 21690:
                        m3198t(i).f34070p = (int) j;
                        return;
                    case 21930:
                        C13122c m3198t2 = m3198t(i);
                        if (j == 1) {
                            z = true;
                        }
                        m3198t2.f34050U = z;
                        return;
                    case 21998:
                        m3198t(i).f34060f = (int) j;
                        return;
                    case 22186:
                        m3198t(i).f34047R = j;
                        return;
                    case 22203:
                        m3198t(i).f34048S = j;
                        return;
                    case 25188:
                        m3198t(i).f34045P = (int) j;
                        return;
                    case 30321:
                        m3208j(i);
                        int i3 = (int) j;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        this.f34023u.f34072r = 3;
                                        return;
                                    }
                                    return;
                                }
                                this.f34023u.f34072r = 2;
                                return;
                            }
                            this.f34023u.f34072r = 1;
                            return;
                        }
                        this.f34023u.f34072r = 0;
                        return;
                    case 2352003:
                        m3198t(i).f34059e = (int) j;
                        return;
                    case 2807729:
                        this.f34020r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m3208j(i);
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        this.f34023u.f34030A = 1;
                                        return;
                                    }
                                    return;
                                }
                                this.f34023u.f34030A = 2;
                                return;
                            case 21946:
                                m3208j(i);
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 != 16) {
                                        if (i5 != 18) {
                                            if (i5 != 6 && i5 != 7) {
                                                return;
                                            }
                                        } else {
                                            this.f34023u.f34080z = 7;
                                            return;
                                        }
                                    } else {
                                        this.f34023u.f34080z = 6;
                                        return;
                                    }
                                }
                                this.f34023u.f34080z = 3;
                                return;
                            case 21947:
                                m3208j(i);
                                C13122c c13122c = this.f34023u;
                                c13122c.f34078x = true;
                                int i6 = (int) j;
                                if (i6 != 1) {
                                    if (i6 != 9) {
                                        if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                            c13122c.f34079y = 2;
                                            return;
                                        }
                                        return;
                                    }
                                    c13122c.f34079y = 6;
                                    return;
                                }
                                c13122c.f34079y = 1;
                                return;
                            case 21948:
                                m3198t(i).f34031B = (int) j;
                                return;
                            case 21949:
                                m3198t(i).f34032C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new C7402m("ContentEncodingScope " + j + " not supported");
            }
        } else if (j == 0) {
        } else {
            throw new C7402m("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* renamed from: z */
    protected boolean m3192z(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public C13119e(int i) {
        this(new C13113a(), i);
    }

    C13119e(InterfaceC13117c interfaceC13117c, int i) {
        this.f34019q = -1L;
        this.f34020r = -9223372036854775807L;
        this.f34021s = -9223372036854775807L;
        this.f34022t = -9223372036854775807L;
        this.f34028z = -1L;
        this.f33976A = -1L;
        this.f33977B = -9223372036854775807L;
        this.f34002a = interfaceC13117c;
        interfaceC13117c.mo3226b(new C13121b());
        this.f34006d = (i & 1) == 0;
        this.f34004b = new C13125g();
        this.f34005c = new SparseArray<>();
        this.f34009g = new C9208y(4);
        this.f34010h = new C9208y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f34011i = new C9208y(4);
        this.f34007e = new C9208y(C9204w.f24210a);
        this.f34008f = new C9208y(4);
        this.f34012j = new C9208y();
        this.f34013k = new C9208y();
        this.f34014l = new C9208y(8);
        this.f34015m = new C9208y();
        this.f34016n = new C9208y();
        this.f33987L = new int[1];
    }
}