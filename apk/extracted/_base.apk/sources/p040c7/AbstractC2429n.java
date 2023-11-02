package p040c7;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.AbstractC4399f;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p040c7.C2412c;
import p040c7.C2440x;
import p040c7.InterfaceC2424k;
import p151i6.C7390b;
import p151i6.C7399j;
import p195k8.C9149a;
import p195k8.C9181k0;
import p195k8.C9185m0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9204w;
import p228m6.C10271g;
import p259o6.C11000d0;
import p259o6.C11033m;
import p259o6.InterfaceC10991b0;
import p259o6.InterfaceC11035n;

/* renamed from: c7.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2429n extends AbstractC4399f {

    /* renamed from: Q0 */
    private static final byte[] f6645Q0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final C10271g f6646A;

    /* renamed from: A0 */
    private boolean f6647A0;

    /* renamed from: B */
    private final C10271g f6648B;

    /* renamed from: B0 */
    private boolean f6649B0;

    /* renamed from: C */
    private final C2422i f6650C;

    /* renamed from: C0 */
    private long f6651C0;

    /* renamed from: D */
    private final C9181k0<Format> f6652D;

    /* renamed from: D0 */
    private long f6653D0;

    /* renamed from: E */
    private final ArrayList<Long> f6654E;

    /* renamed from: E0 */
    private boolean f6655E0;

    /* renamed from: F */
    private final MediaCodec.BufferInfo f6656F;

    /* renamed from: F0 */
    private boolean f6657F0;

    /* renamed from: G */
    private final long[] f6658G;

    /* renamed from: G0 */
    private boolean f6659G0;

    /* renamed from: H */
    private final long[] f6660H;

    /* renamed from: H0 */
    private boolean f6661H0;

    /* renamed from: I */
    private final long[] f6662I;

    /* renamed from: I0 */
    private boolean f6663I0;

    /* renamed from: J */
    private Format f6664J;

    /* renamed from: J0 */
    private boolean f6665J0;

    /* renamed from: K */
    private Format f6666K;

    /* renamed from: K0 */
    private boolean f6667K0;

    /* renamed from: L */
    private InterfaceC11035n f6668L;

    /* renamed from: L0 */
    private ExoPlaybackException f6669L0;

    /* renamed from: M */
    private InterfaceC11035n f6670M;

    /* renamed from: M0 */
    protected DecoderCounters f6671M0;

    /* renamed from: N */
    private MediaCrypto f6672N;

    /* renamed from: N0 */
    private long f6673N0;

    /* renamed from: O */
    private boolean f6674O;

    /* renamed from: O0 */
    private long f6675O0;

    /* renamed from: P */
    private long f6676P;

    /* renamed from: P0 */
    private int f6677P0;

    /* renamed from: Q */
    private float f6678Q;

    /* renamed from: R */
    private float f6679R;

    /* renamed from: S */
    private InterfaceC2424k f6680S;

    /* renamed from: T */
    private Format f6681T;

    /* renamed from: U */
    private MediaFormat f6682U;

    /* renamed from: V */
    private boolean f6683V;

    /* renamed from: W */
    private float f6684W;

    /* renamed from: X */
    private ArrayDeque<C2428m> f6685X;

    /* renamed from: Y */
    private C2430a f6686Y;

    /* renamed from: Z */
    private C2428m f6687Z;

    /* renamed from: a0 */
    private int f6688a0;

    /* renamed from: b0 */
    private boolean f6689b0;

    /* renamed from: c0 */
    private boolean f6690c0;

    /* renamed from: d0 */
    private boolean f6691d0;

    /* renamed from: e0 */
    private boolean f6692e0;

    /* renamed from: f0 */
    private boolean f6693f0;

    /* renamed from: g0 */
    private boolean f6694g0;

    /* renamed from: h0 */
    private boolean f6695h0;

    /* renamed from: i0 */
    private boolean f6696i0;

    /* renamed from: j0 */
    private boolean f6697j0;

    /* renamed from: k0 */
    private boolean f6698k0;

    /* renamed from: l0 */
    private C2423j f6699l0;

    /* renamed from: m0 */
    private long f6700m0;

    /* renamed from: n0 */
    private int f6701n0;

    /* renamed from: o0 */
    private int f6702o0;

    /* renamed from: p0 */
    private ByteBuffer f6703p0;

    /* renamed from: q0 */
    private boolean f6704q0;

    /* renamed from: r0 */
    private boolean f6705r0;

    /* renamed from: s0 */
    private boolean f6706s0;

    /* renamed from: t0 */
    private boolean f6707t0;

    /* renamed from: u0 */
    private boolean f6708u0;

    /* renamed from: v */
    private final InterfaceC2424k.InterfaceC2425a f6709v;

    /* renamed from: v0 */
    private boolean f6710v0;

    /* renamed from: w */
    private final InterfaceC2432p f6711w;

    /* renamed from: w0 */
    private int f6712w0;

    /* renamed from: x */
    private final boolean f6713x;

    /* renamed from: x0 */
    private int f6714x0;

    /* renamed from: y */
    private final float f6715y;

    /* renamed from: y0 */
    private int f6716y0;

    /* renamed from: z */
    private final C10271g f6717z;

    /* renamed from: z0 */
    private boolean f6718z0;

    public AbstractC2429n(int i, InterfaceC2424k.InterfaceC2425a interfaceC2425a, InterfaceC2432p interfaceC2432p, boolean z, float f) {
        super(i);
        this.f6709v = interfaceC2425a;
        this.f6711w = (InterfaceC2432p) C9149a.m16448e(interfaceC2432p);
        this.f6713x = z;
        this.f6715y = f;
        this.f6717z = C10271g.m11973t();
        this.f6646A = new C10271g(0);
        this.f6648B = new C10271g(2);
        C2422i c2422i = new C2422i();
        this.f6650C = c2422i;
        this.f6652D = new C9181k0<>();
        this.f6654E = new ArrayList<>();
        this.f6656F = new MediaCodec.BufferInfo();
        this.f6678Q = 1.0f;
        this.f6679R = 1.0f;
        this.f6676P = -9223372036854775807L;
        this.f6658G = new long[10];
        this.f6660H = new long[10];
        this.f6662I = new long[10];
        this.f6673N0 = -9223372036854775807L;
        this.f6675O0 = -9223372036854775807L;
        c2422i.m11977p(0);
        c2422i.f26743l.order(ByteOrder.nativeOrder());
        m33379X0();
    }

    /* renamed from: A0 */
    private void m33403A0(C2428m c2428m, MediaCrypto mediaCrypto) {
        float mo12356r0;
        float f;
        InterfaceC2424k mo33432a;
        boolean z;
        String str = c2428m.f6634a;
        int i = C9191p0.f24171a;
        if (i < 23) {
            mo12356r0 = -1.0f;
        } else {
            mo12356r0 = mo12356r0(this.f6679R, this.f6664J, m29429B());
        }
        if (mo12356r0 <= this.f6715y) {
            f = -1.0f;
        } else {
            f = mo12356r0;
        }
        InterfaceC2424k interfaceC2424k = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C9185m0.m16326a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            if (this.f6663I0 && i >= 23) {
                mo33432a = new C2412c.C2414b(mo20720d(), this.f6665J0, this.f6667K0).mo33432a(createByCodecName);
            } else {
                mo33432a = this.f6709v.mo33432a(createByCodecName);
            }
            InterfaceC2424k interfaceC2424k2 = mo33432a;
            try {
                C9185m0.m16324c();
                C9185m0.m16326a("configureCodec");
                mo12369Y(c2428m, interfaceC2424k2, this.f6664J, mediaCrypto, f);
                C9185m0.m16324c();
                C9185m0.m16326a("startCodec");
                interfaceC2424k2.start();
                C9185m0.m16324c();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.f6680S = interfaceC2424k2;
                this.f6687Z = c2428m;
                this.f6684W = f;
                this.f6681T = this.f6664J;
                this.f6688a0 = m33393P(str);
                this.f6689b0 = m33391Q(str, this.f6681T);
                this.f6690c0 = m33382V(str);
                this.f6691d0 = m33380X(str);
                this.f6692e0 = m33388S(str);
                this.f6693f0 = m33386T(str);
                this.f6694g0 = m33390R(str);
                this.f6695h0 = m33381W(str, this.f6681T);
                if (!m33384U(c2428m) && !mo12358q0()) {
                    z = false;
                } else {
                    z = true;
                }
                this.f6698k0 = z;
                if ("c2.android.mp3.decoder".equals(c2428m.f6634a)) {
                    this.f6699l0 = new C2423j();
                }
                if (getState() == 2) {
                    this.f6700m0 = SystemClock.elapsedRealtime() + 1000;
                }
                this.f6671M0.f11457a++;
                mo12395I0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            } catch (Exception e) {
                e = e;
                interfaceC2424k = interfaceC2424k2;
                if (interfaceC2424k != null) {
                    interfaceC2424k.release();
                }
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: B0 */
    private boolean m33402B0(long j) {
        int size = this.f6654E.size();
        for (int i = 0; i < size; i++) {
            if (this.f6654E.get(i).longValue() == j) {
                this.f6654E.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    private static boolean m33401C0(IllegalStateException illegalStateException) {
        if (C9191p0.f24171a >= 21 && m33400D0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    private static boolean m33400D0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: G0 */
    private void m33397G0(MediaCrypto mediaCrypto, boolean z) {
        if (this.f6685X == null) {
            try {
                List<C2428m> m33354n0 = m33354n0(z);
                ArrayDeque<C2428m> arrayDeque = new ArrayDeque<>();
                this.f6685X = arrayDeque;
                if (this.f6713x) {
                    arrayDeque.addAll(m33354n0);
                } else if (!m33354n0.isEmpty()) {
                    this.f6685X.add(m33354n0.get(0));
                }
                this.f6686Y = null;
            } catch (C2440x.C2443c e) {
                throw new C2430a(this.f6664J, e, z, -49998);
            }
        }
        if (!this.f6685X.isEmpty()) {
            while (this.f6680S == null) {
                C2428m peekFirst = this.f6685X.peekFirst();
                if (!mo12365f1(peekFirst)) {
                    return;
                }
                try {
                    m33403A0(peekFirst, mediaCrypto);
                } catch (Exception e2) {
                    C9197r.m16177i("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e2);
                    this.f6685X.removeFirst();
                    C2430a c2430a = new C2430a(this.f6664J, e2, z, peekFirst);
                    if (this.f6686Y == null) {
                        this.f6686Y = c2430a;
                    } else {
                        this.f6686Y = this.f6686Y.m33343c(c2430a);
                    }
                    if (this.f6685X.isEmpty()) {
                        throw this.f6686Y;
                    }
                }
            }
            this.f6685X = null;
            return;
        }
        throw new C2430a(this.f6664J, (Throwable) null, z, -49999);
    }

    /* renamed from: H0 */
    private boolean m33396H0(C11000d0 c11000d0, Format format) {
        if (c11000d0.f28798c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(c11000d0.f28796a, c11000d0.f28797b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.f11197u);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: M */
    private void m33395M() {
        C9149a.m16447f(!this.f6655E0);
        C7399j m29422z = m29422z();
        this.f6648B.mo3126f();
        do {
            this.f6648B.mo3126f();
            int m29427K = m29427K(m29422z, this.f6648B, false);
            if (m29427K != -5) {
                if (m29427K != -4) {
                    if (m29427K == -3) {
                        return;
                    }
                    throw new IllegalStateException();
                } else if (this.f6648B.m11988l()) {
                    this.f6655E0 = true;
                    return;
                } else {
                    if (this.f6659G0) {
                        Format format = (Format) C9149a.m16448e(this.f6664J);
                        this.f6666K = format;
                        mo12389L0(format, null);
                        this.f6659G0 = false;
                    }
                    this.f6648B.m11976q();
                }
            } else {
                mo12391K0(m29422z);
                return;
            }
        } while (this.f6650C.m33444w(this.f6648B));
        this.f6707t0 = true;
    }

    /* renamed from: N */
    private boolean m33394N(long j, long j2) {
        boolean z;
        C9149a.m16447f(!this.f6657F0);
        if (this.f6650C.m33446D()) {
            C2422i c2422i = this.f6650C;
            if (mo12379Q0(j, j2, null, c2422i.f26743l, this.f6702o0, 0, c2422i.m33447C(), this.f6650C.m33449A(), this.f6650C.m11989k(), this.f6650C.m11988l(), this.f6666K)) {
                mo12387M0(this.f6650C.m33448B());
                this.f6650C.mo3126f();
                z = false;
            } else {
                return false;
            }
        } else {
            z = false;
        }
        if (this.f6655E0) {
            this.f6657F0 = true;
            return z;
        }
        if (this.f6707t0) {
            C9149a.m16447f(this.f6650C.m33444w(this.f6648B));
            this.f6707t0 = z;
        }
        if (this.f6708u0) {
            if (this.f6650C.m33446D()) {
                return true;
            }
            m33376a0();
            this.f6708u0 = z;
            m33398F0();
            if (!this.f6706s0) {
                return z;
            }
        }
        m33395M();
        if (this.f6650C.m33446D()) {
            this.f6650C.m11976q();
        }
        if (this.f6650C.m33446D() || this.f6655E0 || this.f6708u0) {
            return true;
        }
        return z;
    }

    /* renamed from: P */
    private int m33393P(String str) {
        int i = C9191p0.f24171a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C9191p0.f24174d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = C9191p0.f24172b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @TargetApi(23)
    /* renamed from: P0 */
    private void m33392P0() {
        int i = this.f6716y0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.f6657F0 = true;
                    mo16671V0();
                    return;
                }
                m33385T0();
                return;
            }
            m33359k0();
            m33358k1();
            return;
        }
        m33359k0();
    }

    /* renamed from: Q */
    private static boolean m33391Q(String str, Format format) {
        if (C9191p0.f24171a < 21 && format.f11199w.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private static boolean m33390R(String str) {
        if (C9191p0.f24171a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C9191p0.f24173c)) {
            String str2 = C9191p0.f24172b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R0 */
    private void m33389R0() {
        this.f6649B0 = true;
        MediaFormat outputFormat = this.f6680S.getOutputFormat();
        if (this.f6688a0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f6697j0 = true;
            return;
        }
        if (this.f6695h0) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.f6682U = outputFormat;
        this.f6683V = true;
    }

    /* renamed from: S */
    private static boolean m33388S(String str) {
        int i = C9191p0.f24171a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = C9191p0.f24172b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: S0 */
    private boolean m33387S0(boolean z) {
        C7399j m29422z = m29422z();
        this.f6717z.mo3126f();
        int m29427K = m29427K(m29422z, this.f6717z, z);
        if (m29427K == -5) {
            mo12391K0(m29422z);
            return true;
        } else if (m29427K == -4 && this.f6717z.m11988l()) {
            this.f6655E0 = true;
            m33392P0();
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: T */
    private static boolean m33386T(String str) {
        return C9191p0.f24171a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: T0 */
    private void m33385T0() {
        m33383U0();
        m33398F0();
    }

    /* renamed from: U */
    private static boolean m33384U(C2428m c2428m) {
        String str = c2428m.f6634a;
        int i = C9191p0.f24171a;
        if ((i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || ((i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(C9191p0.f24173c) && "AFTS".equals(C9191p0.f24174d) && c2428m.f6640g)))) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private static boolean m33382V(String str) {
        int i = C9191p0.f24171a;
        if (i >= 18 && ((i != 18 || (!"OMX.SEC.avc.dec".equals(str) && !"OMX.SEC.avc.dec.secure".equals(str))) && (i != 19 || !C9191p0.f24174d.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str) && !"OMX.Exynos.avc.dec.secure".equals(str))))) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    private static boolean m33381W(String str, Format format) {
        if (C9191p0.f24171a <= 18 && format.f11178H == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private static boolean m33380X(String str) {
        return C9191p0.f24171a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: Y0 */
    private void m33378Y0() {
        this.f6701n0 = -1;
        this.f6646A.f26743l = null;
    }

    /* renamed from: Z0 */
    private void m33377Z0() {
        this.f6702o0 = -1;
        this.f6703p0 = null;
    }

    /* renamed from: a0 */
    private void m33376a0() {
        this.f6708u0 = false;
        this.f6650C.mo3126f();
        this.f6648B.mo3126f();
        this.f6707t0 = false;
        this.f6706s0 = false;
    }

    /* renamed from: a1 */
    private void m33375a1(InterfaceC11035n interfaceC11035n) {
        C11033m.m9307a(this.f6668L, interfaceC11035n);
        this.f6668L = interfaceC11035n;
    }

    /* renamed from: b0 */
    private boolean m33374b0() {
        if (this.f6718z0) {
            this.f6714x0 = 1;
            if (!this.f6690c0 && !this.f6692e0) {
                this.f6716y0 = 1;
            } else {
                this.f6716y0 = 3;
                return false;
            }
        }
        return true;
    }

    /* renamed from: c0 */
    private void m33372c0() {
        if (this.f6718z0) {
            this.f6714x0 = 1;
            this.f6716y0 = 3;
            return;
        }
        m33385T0();
    }

    @TargetApi(23)
    /* renamed from: d0 */
    private boolean m33370d0() {
        if (this.f6718z0) {
            this.f6714x0 = 1;
            if (!this.f6690c0 && !this.f6692e0) {
                this.f6716y0 = 2;
            } else {
                this.f6716y0 = 3;
                return false;
            }
        } else {
            m33358k1();
        }
        return true;
    }

    /* renamed from: d1 */
    private void m33369d1(InterfaceC11035n interfaceC11035n) {
        C11033m.m9307a(this.f6670M, interfaceC11035n);
        this.f6670M = interfaceC11035n;
    }

    /* renamed from: e0 */
    private boolean m33368e0(long j, long j2) {
        boolean z;
        boolean mo12379Q0;
        boolean z2;
        int mo33434f;
        boolean z3;
        if (!m33347y0()) {
            if (this.f6693f0 && this.f6647A0) {
                try {
                    mo33434f = this.f6680S.mo33434f(this.f6656F);
                } catch (IllegalStateException unused) {
                    m33392P0();
                    if (this.f6657F0) {
                        m33383U0();
                    }
                    return false;
                }
            } else {
                mo33434f = this.f6680S.mo33434f(this.f6656F);
            }
            if (mo33434f < 0) {
                if (mo33434f == -2) {
                    m33389R0();
                    return true;
                }
                if (this.f6698k0 && (this.f6655E0 || this.f6714x0 == 2)) {
                    m33392P0();
                }
                return false;
            } else if (this.f6697j0) {
                this.f6697j0 = false;
                this.f6680S.releaseOutputBuffer(mo33434f, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f6656F;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    m33392P0();
                    return false;
                }
                this.f6702o0 = mo33434f;
                ByteBuffer outputBuffer = this.f6680S.getOutputBuffer(mo33434f);
                this.f6703p0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(this.f6656F.offset);
                    ByteBuffer byteBuffer = this.f6703p0;
                    MediaCodec.BufferInfo bufferInfo2 = this.f6656F;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f6694g0) {
                    MediaCodec.BufferInfo bufferInfo3 = this.f6656F;
                    if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                        long j3 = this.f6651C0;
                        if (j3 != -9223372036854775807L) {
                            bufferInfo3.presentationTimeUs = j3;
                        }
                    }
                }
                this.f6704q0 = m33402B0(this.f6656F.presentationTimeUs);
                long j4 = this.f6653D0;
                long j5 = this.f6656F.presentationTimeUs;
                if (j4 == j5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f6705r0 = z3;
                m33356l1(j5);
            }
        }
        if (this.f6693f0 && this.f6647A0) {
            try {
                InterfaceC2424k interfaceC2424k = this.f6680S;
                ByteBuffer byteBuffer2 = this.f6703p0;
                int i = this.f6702o0;
                MediaCodec.BufferInfo bufferInfo4 = this.f6656F;
                z = false;
                try {
                    mo12379Q0 = mo12379Q0(j, j2, interfaceC2424k, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f6704q0, this.f6705r0, this.f6666K);
                } catch (IllegalStateException unused2) {
                    m33392P0();
                    if (this.f6657F0) {
                        m33383U0();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            InterfaceC2424k interfaceC2424k2 = this.f6680S;
            ByteBuffer byteBuffer3 = this.f6703p0;
            int i2 = this.f6702o0;
            MediaCodec.BufferInfo bufferInfo5 = this.f6656F;
            mo12379Q0 = mo12379Q0(j, j2, interfaceC2424k2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f6704q0, this.f6705r0, this.f6666K);
        }
        if (mo12379Q0) {
            mo12387M0(this.f6656F.presentationTimeUs);
            if ((this.f6656F.flags & 4) != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            m33377Z0();
            if (!z2) {
                return true;
            }
            m33392P0();
        }
        return z;
    }

    /* renamed from: e1 */
    private boolean m33367e1(long j) {
        if (this.f6676P != -9223372036854775807L && SystemClock.elapsedRealtime() - j >= this.f6676P) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    private boolean m33366f0(C2428m c2428m, Format format, InterfaceC11035n interfaceC11035n, InterfaceC11035n interfaceC11035n2) {
        C11000d0 m33350u0;
        if (interfaceC11035n == interfaceC11035n2) {
            return false;
        }
        if (interfaceC11035n2 == null || interfaceC11035n == null || C9191p0.f24171a < 23) {
            return true;
        }
        UUID uuid = C7390b.f19882e;
        if (uuid.equals(interfaceC11035n.mo9306a()) || uuid.equals(interfaceC11035n2.mo9306a()) || (m33350u0 = m33350u0(interfaceC11035n2)) == null) {
            return true;
        }
        if (c2428m.f6640g || !m33396H0(m33350u0, format)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public static boolean m33362i1(Format format) {
        Class<? extends InterfaceC10991b0> cls = format.f11184N;
        if (cls != null && !C11000d0.class.equals(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: j0 */
    private boolean m33361j0() {
        InterfaceC2424k interfaceC2424k = this.f6680S;
        if (interfaceC2424k == null || this.f6714x0 == 2 || this.f6655E0) {
            return false;
        }
        if (this.f6701n0 < 0) {
            int mo33435e = interfaceC2424k.mo33435e();
            this.f6701n0 = mo33435e;
            if (mo33435e < 0) {
                return false;
            }
            this.f6646A.f26743l = this.f6680S.getInputBuffer(mo33435e);
            this.f6646A.mo3126f();
        }
        if (this.f6714x0 == 1) {
            if (!this.f6698k0) {
                this.f6647A0 = true;
                this.f6680S.queueInputBuffer(this.f6701n0, 0, 0, 0L, 4);
                m33378Y0();
            }
            this.f6714x0 = 2;
            return false;
        } else if (this.f6696i0) {
            this.f6696i0 = false;
            ByteBuffer byteBuffer = this.f6646A.f26743l;
            byte[] bArr = f6645Q0;
            byteBuffer.put(bArr);
            this.f6680S.queueInputBuffer(this.f6701n0, 0, bArr.length, 0L, 0);
            m33378Y0();
            this.f6718z0 = true;
            return true;
        } else {
            if (this.f6712w0 == 1) {
                for (int i = 0; i < this.f6681T.f11199w.size(); i++) {
                    this.f6646A.f26743l.put(this.f6681T.f11199w.get(i));
                }
                this.f6712w0 = 2;
            }
            int position = this.f6646A.f26743l.position();
            C7399j m29422z = m29422z();
            int m29427K = m29427K(m29422z, this.f6646A, false);
            if (mo28968g()) {
                this.f6653D0 = this.f6651C0;
            }
            if (m29427K == -3) {
                return false;
            }
            if (m29427K == -5) {
                if (this.f6712w0 == 2) {
                    this.f6646A.mo3126f();
                    this.f6712w0 = 1;
                }
                mo12391K0(m29422z);
                return true;
            } else if (this.f6646A.m11988l()) {
                if (this.f6712w0 == 2) {
                    this.f6646A.mo3126f();
                    this.f6712w0 = 1;
                }
                this.f6655E0 = true;
                if (!this.f6718z0) {
                    m33392P0();
                    return false;
                }
                try {
                    if (!this.f6698k0) {
                        this.f6647A0 = true;
                        this.f6680S.queueInputBuffer(this.f6701n0, 0, 0, 0L, 4);
                        m33378Y0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m29425w(e, this.f6664J);
                }
            } else if (!this.f6718z0 && !this.f6646A.m11987m()) {
                this.f6646A.mo3126f();
                if (this.f6712w0 == 2) {
                    this.f6712w0 = 1;
                }
                return true;
            } else {
                boolean m11975r = this.f6646A.m11975r();
                if (m11975r) {
                    this.f6646A.f26742k.m11984b(position);
                }
                if (this.f6689b0 && !m11975r) {
                    C9204w.m16143b(this.f6646A.f26743l);
                    if (this.f6646A.f26743l.position() == 0) {
                        return true;
                    }
                    this.f6689b0 = false;
                }
                C10271g c10271g = this.f6646A;
                long j = c10271g.f26745n;
                C2423j c2423j = this.f6699l0;
                if (c2423j != null) {
                    j = c2423j.m33440c(this.f6664J, c10271g);
                }
                long j2 = j;
                if (this.f6646A.m11989k()) {
                    this.f6654E.add(Long.valueOf(j2));
                }
                if (this.f6659G0) {
                    this.f6652D.m16368a(j2, this.f6664J);
                    this.f6659G0 = false;
                }
                if (this.f6699l0 != null) {
                    this.f6651C0 = Math.max(this.f6651C0, this.f6646A.f26745n);
                } else {
                    this.f6651C0 = Math.max(this.f6651C0, j2);
                }
                this.f6646A.m11976q();
                if (this.f6646A.m11990i()) {
                    mo12348x0(this.f6646A);
                }
                mo12382O0(this.f6646A);
                try {
                    if (m11975r) {
                        this.f6680S.mo33439a(this.f6701n0, 0, this.f6646A.f26742k, j2, 0);
                    } else {
                        this.f6680S.queueInputBuffer(this.f6701n0, 0, this.f6646A.f26743l.limit(), j2, 0);
                    }
                    m33378Y0();
                    this.f6718z0 = true;
                    this.f6712w0 = 0;
                    this.f6671M0.f11459c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw m29425w(e2, this.f6664J);
                }
            }
        }
    }

    /* renamed from: j1 */
    private boolean m33360j1(Format format) {
        if (C9191p0.f24171a < 23) {
            return true;
        }
        float mo12356r0 = mo12356r0(this.f6679R, format, m29429B());
        float f = this.f6684W;
        if (f == mo12356r0) {
            return true;
        }
        if (mo12356r0 == -1.0f) {
            m33372c0();
            return false;
        } else if (f == -1.0f && mo12356r0 <= this.f6715y) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo12356r0);
            this.f6680S.setParameters(bundle);
            this.f6684W = mo12356r0;
            return true;
        }
    }

    /* renamed from: k0 */
    private void m33359k0() {
        try {
            this.f6680S.flush();
        } finally {
            mo12372W0();
        }
    }

    /* renamed from: k1 */
    private void m33358k1() {
        try {
            this.f6672N.setMediaDrmSession(m33350u0(this.f6670M).f28797b);
            m33375a1(this.f6670M);
            this.f6714x0 = 0;
            this.f6716y0 = 0;
        } catch (MediaCryptoException e) {
            throw m29425w(e, this.f6664J);
        }
    }

    /* renamed from: n0 */
    private List<C2428m> m33354n0(boolean z) {
        List<C2428m> mo12353t0 = mo12353t0(this.f6711w, this.f6664J, z);
        if (mo12353t0.isEmpty() && z) {
            mo12353t0 = mo12353t0(this.f6711w, this.f6664J, false);
            if (!mo12353t0.isEmpty()) {
                C9197r.m16178h("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f6664J.f11197u + ", but no secure decoder available. Trying to proceed with " + mo12353t0 + ".");
            }
        }
        return mo12353t0;
    }

    /* renamed from: u0 */
    private C11000d0 m33350u0(InterfaceC11035n interfaceC11035n) {
        InterfaceC10991b0 mo9302e = interfaceC11035n.mo9302e();
        if (mo9302e != null && !(mo9302e instanceof C11000d0)) {
            throw m29425w(new IllegalArgumentException("Expecting FrameworkMediaCrypto but found: " + mo9302e), this.f6664J);
        }
        return (C11000d0) mo9302e;
    }

    /* renamed from: y0 */
    private boolean m33347y0() {
        return this.f6702o0 >= 0;
    }

    /* renamed from: z0 */
    private void m33346z0(Format format) {
        m33376a0();
        String str = format.f11197u;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f6650C.m33445E(1);
        } else {
            this.f6650C.m33445E(32);
        }
        this.f6706s0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: D */
    public void mo3123D() {
        this.f6664J = null;
        this.f6673N0 = -9223372036854775807L;
        this.f6675O0 = -9223372036854775807L;
        this.f6677P0 = 0;
        if (this.f6670M == null && this.f6668L == null) {
            m33355m0();
        } else {
            mo12400G();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: E */
    public void mo12403E(boolean z, boolean z2) {
        this.f6671M0 = new DecoderCounters();
    }

    /* renamed from: E0 */
    protected boolean m33399E0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: F */
    public void mo3122F(long j, boolean z) {
        this.f6655E0 = false;
        this.f6657F0 = false;
        this.f6661H0 = false;
        if (this.f6706s0) {
            this.f6650C.mo3126f();
            this.f6648B.mo3126f();
            this.f6707t0 = false;
        } else {
            m33357l0();
        }
        if (this.f6652D.m16357l() > 0) {
            this.f6659G0 = true;
        }
        this.f6652D.m16366c();
        int i = this.f6677P0;
        if (i != 0) {
            this.f6675O0 = this.f6660H[i - 1];
            this.f6673N0 = this.f6658G[i - 1];
            this.f6677P0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F0 */
    public final void m33398F0() {
        Format format;
        boolean z;
        if (this.f6680S == null && !this.f6706s0 && (format = this.f6664J) != null) {
            if (this.f6670M == null && mo16670g1(format)) {
                m33346z0(this.f6664J);
                return;
            }
            m33375a1(this.f6670M);
            String str = this.f6664J.f11197u;
            InterfaceC11035n interfaceC11035n = this.f6668L;
            if (interfaceC11035n != null) {
                if (this.f6672N == null) {
                    C11000d0 m33350u0 = m33350u0(interfaceC11035n);
                    if (m33350u0 == null) {
                        if (this.f6668L.mo9301f() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(m33350u0.f28796a, m33350u0.f28797b);
                            this.f6672N = mediaCrypto;
                            if (!m33350u0.f28798c && mediaCrypto.requiresSecureDecoderComponent(str)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f6674O = z;
                        } catch (MediaCryptoException e) {
                            throw m29425w(e, this.f6664J);
                        }
                    }
                }
                if (C11000d0.f28795d) {
                    int state = this.f6668L.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        throw m29425w(this.f6668L.mo9301f(), this.f6664J);
                    }
                }
            }
            try {
                m33397G0(this.f6672N, this.f6674O);
            } catch (C2430a e2) {
                throw m29425w(e2, this.f6664J);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: G */
    public void mo12400G() {
        try {
            m33376a0();
            m33383U0();
        } finally {
            m33369d1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: H */
    public void mo12398H() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: I */
    public void mo12396I() {
    }

    /* renamed from: I0 */
    protected abstract void mo12395I0(String str, long j, long j2);

    @Override // com.google.android.exoplayer2.AbstractC4399f
    /* renamed from: J */
    protected void mo3121J(Format[] formatArr, long j, long j2) {
        boolean z = true;
        if (this.f6675O0 == -9223372036854775807L) {
            if (this.f6673N0 != -9223372036854775807L) {
                z = false;
            }
            C9149a.m16447f(z);
            this.f6673N0 = j;
            this.f6675O0 = j2;
            return;
        }
        int i = this.f6677P0;
        if (i == this.f6660H.length) {
            C9197r.m16178h("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f6660H[this.f6677P0 - 1]);
        } else {
            this.f6677P0 = i + 1;
        }
        long[] jArr = this.f6658G;
        int i2 = this.f6677P0;
        jArr[i2 - 1] = j;
        this.f6660H[i2 - 1] = j2;
        this.f6662I[i2 - 1] = this.f6651C0;
    }

    /* renamed from: J0 */
    protected abstract void mo12393J0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        if (m33370d0() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
        if (m33370d0() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d4, code lost:
        r7 = 2;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation mo12391K0(p151i6.C7399j r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c7.AbstractC2429n.mo12391K0(i6.j):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    /* renamed from: L0 */
    protected abstract void mo12389L0(Format format, MediaFormat mediaFormat);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo12387M0(long j) {
        while (true) {
            int i = this.f6677P0;
            if (i != 0 && j >= this.f6662I[0]) {
                long[] jArr = this.f6658G;
                this.f6673N0 = jArr[0];
                this.f6675O0 = this.f6660H[0];
                int i2 = i - 1;
                this.f6677P0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f6660H;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f6677P0);
                long[] jArr3 = this.f6662I;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f6677P0);
                mo12385N0();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo12385N0() {
    }

    /* renamed from: O */
    protected abstract DecoderReuseEvaluation mo12383O(C2428m c2428m, Format format, Format format2);

    /* renamed from: O0 */
    protected abstract void mo12382O0(C10271g c10271g);

    /* renamed from: Q0 */
    protected abstract boolean mo12379Q0(long j, long j2, InterfaceC2424k interfaceC2424k, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o6.n, android.media.MediaCrypto] */
    /* renamed from: U0 */
    public void m33383U0() {
        try {
            InterfaceC2424k interfaceC2424k = this.f6680S;
            if (interfaceC2424k != null) {
                interfaceC2424k.release();
                this.f6671M0.f11458b++;
                mo12393J0(this.f6687Z.f6634a);
            }
            this.f6680S = null;
            try {
                MediaCrypto mediaCrypto = this.f6672N;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f6680S = null;
            try {
                MediaCrypto mediaCrypto2 = this.f6672N;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: V0 */
    protected void mo16671V0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo12372W0() {
        m33378Y0();
        m33377Z0();
        this.f6700m0 = -9223372036854775807L;
        this.f6647A0 = false;
        this.f6718z0 = false;
        this.f6696i0 = false;
        this.f6697j0 = false;
        this.f6704q0 = false;
        this.f6705r0 = false;
        this.f6654E.clear();
        this.f6651C0 = -9223372036854775807L;
        this.f6653D0 = -9223372036854775807L;
        C2423j c2423j = this.f6699l0;
        if (c2423j != null) {
            c2423j.m33441b();
        }
        this.f6714x0 = 0;
        this.f6716y0 = 0;
        this.f6712w0 = this.f6710v0 ? 1 : 0;
    }

    /* renamed from: X0 */
    protected void m33379X0() {
        mo12372W0();
        this.f6669L0 = null;
        this.f6699l0 = null;
        this.f6685X = null;
        this.f6687Z = null;
        this.f6681T = null;
        this.f6682U = null;
        this.f6683V = false;
        this.f6649B0 = false;
        this.f6684W = -1.0f;
        this.f6688a0 = 0;
        this.f6689b0 = false;
        this.f6690c0 = false;
        this.f6691d0 = false;
        this.f6692e0 = false;
        this.f6693f0 = false;
        this.f6694g0 = false;
        this.f6695h0 = false;
        this.f6698k0 = false;
        this.f6710v0 = false;
        this.f6712w0 = 0;
        this.f6674O = false;
    }

    /* renamed from: Y */
    protected abstract void mo12369Y(C2428m c2428m, InterfaceC2424k interfaceC2424k, Format format, MediaCrypto mediaCrypto, float f);

    /* renamed from: Z */
    protected C2427l mo12367Z(Throwable th2, C2428m c2428m) {
        return new C2427l(th2, c2428m);
    }

    @Override // p151i6.InterfaceC7407r
    /* renamed from: a */
    public final int mo3110a(Format format) {
        try {
            return mo12364h1(this.f6711w, format);
        } catch (C2440x.C2443c e) {
            throw m29425w(e, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b1 */
    public final void m33373b1() {
        this.f6661H0 = true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: c */
    public boolean mo3109c() {
        return this.f6657F0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void m33371c1(ExoPlaybackException exoPlaybackException) {
        this.f6669L0 = exoPlaybackException;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: e */
    public boolean mo3108e() {
        if (this.f6664J != null && (m29428C() || m33347y0() || (this.f6700m0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f6700m0))) {
            return true;
        }
        return false;
    }

    /* renamed from: f1 */
    protected boolean mo12365f1(C2428m c2428m) {
        return true;
    }

    /* renamed from: g0 */
    public void m33365g0(boolean z) {
        this.f6663I0 = z;
    }

    /* renamed from: g1 */
    protected boolean mo16670g1(Format format) {
        return false;
    }

    /* renamed from: h0 */
    public void m33364h0(boolean z) {
        this.f6665J0 = z;
    }

    /* renamed from: h1 */
    protected abstract int mo12364h1(InterfaceC2432p interfaceC2432p, Format format);

    /* renamed from: i0 */
    public void m33363i0(boolean z) {
        this.f6667K0 = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l0 */
    public final boolean m33357l0() {
        boolean m33355m0 = m33355m0();
        if (m33355m0) {
            m33398F0();
        }
        return m33355m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public final void m33356l1(long j) {
        boolean z;
        Format m16359j = this.f6652D.m16359j(j);
        if (m16359j == null && this.f6683V) {
            m16359j = this.f6652D.m16360i();
        }
        if (m16359j != null) {
            this.f6666K = m16359j;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f6683V && this.f6666K != null)) {
            mo12389L0(this.f6666K, this.f6682U);
            this.f6683V = false;
        }
    }

    /* renamed from: m0 */
    protected boolean m33355m0() {
        if (this.f6680S == null) {
            return false;
        }
        if (this.f6716y0 != 3 && !this.f6690c0 && ((!this.f6691d0 || this.f6649B0) && (!this.f6692e0 || !this.f6647A0))) {
            m33359k0();
            return false;
        }
        m33383U0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public final InterfaceC2424k m33353o0() {
        return this.f6680S;
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f, com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: p */
    public void mo12360p(float f, float f2) {
        this.f6678Q = f;
        this.f6679R = f2;
        if (this.f6680S != null && this.f6716y0 != 3 && getState() != 0) {
            m33360j1(this.f6681T);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public final C2428m m33352p0() {
        return this.f6687Z;
    }

    @Override // com.google.android.exoplayer2.AbstractC4399f, p151i6.InterfaceC7407r
    /* renamed from: q */
    public final int mo20719q() {
        return 8;
    }

    /* renamed from: q0 */
    protected boolean mo12358q0() {
        return false;
    }

    @Override // com.google.android.exoplayer2.InterfaceC4483u0
    /* renamed from: r */
    public void mo3107r(long j, long j2) {
        if (this.f6661H0) {
            this.f6661H0 = false;
            m33392P0();
        }
        ExoPlaybackException exoPlaybackException = this.f6669L0;
        if (exoPlaybackException == null) {
            try {
                if (this.f6657F0) {
                    mo16671V0();
                    return;
                } else if (this.f6664J == null && !m33387S0(true)) {
                    return;
                } else {
                    m33398F0();
                    if (this.f6706s0) {
                        C9185m0.m16326a("bypassRender");
                        while (m33394N(j, j2)) {
                        }
                        C9185m0.m16324c();
                    } else if (this.f6680S != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C9185m0.m16326a("drainAndFeed");
                        while (m33368e0(j, j2) && m33367e1(elapsedRealtime)) {
                        }
                        while (m33361j0() && m33367e1(elapsedRealtime)) {
                        }
                        C9185m0.m16324c();
                    } else {
                        this.f6671M0.f11460d += m29426L(j);
                        m33387S0(false);
                    }
                    this.f6671M0.m29540c();
                    return;
                }
            } catch (IllegalStateException e) {
                if (m33401C0(e)) {
                    throw m29425w(mo12367Z(e, m33352p0()), this.f6664J);
                }
                throw e;
            }
        }
        this.f6669L0 = null;
        throw exoPlaybackException;
    }

    /* renamed from: r0 */
    protected abstract float mo12356r0(float f, Format format, Format[] formatArr);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s0 */
    public final MediaFormat m33351s0() {
        return this.f6682U;
    }

    /* renamed from: t0 */
    protected abstract List<C2428m> mo12353t0(InterfaceC2432p interfaceC2432p, Format format, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v0 */
    public final long m33349v0() {
        return this.f6675O0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w0 */
    public float m33348w0() {
        return this.f6678Q;
    }

    /* renamed from: x0 */
    protected void mo12348x0(C10271g c10271g) {
    }

    /* renamed from: c7.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2430a extends Exception {

        /* renamed from: j */
        public final String f6719j;

        /* renamed from: k */
        public final boolean f6720k;

        /* renamed from: l */
        public final C2428m f6721l;

        /* renamed from: m */
        public final String f6722m;

        /* renamed from: n */
        public final C2430a f6723n;

        public C2430a(Format format, Throwable th2, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th2, format.f11197u, z, null, m33344b(i), null);
        }

        /* renamed from: b */
        private static String m33344b(int i) {
            String str;
            if (i < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public C2430a m33343c(C2430a c2430a) {
            return new C2430a(getMessage(), getCause(), this.f6719j, this.f6720k, this.f6721l, this.f6722m, c2430a);
        }

        /* renamed from: d */
        private static String m33342d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public C2430a(Format format, Throwable th2, boolean z, C2428m c2428m) {
            this("Decoder init failed: " + c2428m.f6634a + ", " + format, th2, format.f11197u, z, c2428m, C9191p0.f24171a >= 21 ? m33342d(th2) : null, null);
        }

        private C2430a(String str, Throwable th2, String str2, boolean z, C2428m c2428m, String str3, C2430a c2430a) {
            super(str, th2);
            this.f6719j = str2;
            this.f6720k = z;
            this.f6721l = c2428m;
            this.f6722m = str3;
            this.f6723n = c2430a;
        }
    }
}
