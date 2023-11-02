package com.budiyev.android.codescanner;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Process;
import android.view.SurfaceHolder;
import com.budiyev.android.codescanner.C2803f;
import com.budiyev.android.codescanner.CodeScannerView;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p136hc.EnumC7055a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class CodeScanner {

    /* renamed from: K */
    public static final List<EnumC7055a> f7518K;

    /* renamed from: L */
    public static final List<EnumC7055a> f7519L;

    /* renamed from: M */
    public static final List<EnumC7055a> f7520M;

    /* renamed from: N */
    private static final List<EnumC7055a> f7521N;

    /* renamed from: O */
    private static final EnumC2813m f7522O;

    /* renamed from: P */
    private static final EnumC2798a f7523P;

    /* renamed from: b */
    private final Context f7535b;

    /* renamed from: d */
    private final CodeScannerView f7537d;

    /* renamed from: e */
    private final SurfaceHolder f7538e;

    /* renamed from: a */
    private final Object f7534a = new Object();

    /* renamed from: n */
    private volatile List<EnumC7055a> f7547n = f7521N;

    /* renamed from: o */
    private volatile EnumC2813m f7548o = f7522O;

    /* renamed from: p */
    private volatile EnumC2798a f7549p = f7523P;

    /* renamed from: q */
    private volatile InterfaceC2801d f7550q = null;

    /* renamed from: r */
    private volatile InterfaceC2808h f7551r = null;

    /* renamed from: s */
    private volatile C2807g f7552s = null;

    /* renamed from: t */
    private volatile boolean f7553t = false;

    /* renamed from: u */
    private volatile boolean f7554u = false;

    /* renamed from: v */
    private volatile boolean f7555v = false;

    /* renamed from: w */
    private volatile boolean f7556w = true;

    /* renamed from: x */
    private volatile boolean f7557x = false;

    /* renamed from: y */
    private volatile long f7558y = 2000;

    /* renamed from: z */
    private volatile int f7559z = -1;

    /* renamed from: A */
    private volatile int f7524A = 0;

    /* renamed from: B */
    private boolean f7525B = true;

    /* renamed from: C */
    private boolean f7526C = false;

    /* renamed from: D */
    private boolean f7527D = false;

    /* renamed from: E */
    private boolean f7528E = false;

    /* renamed from: F */
    private boolean f7529F = false;

    /* renamed from: G */
    private boolean f7530G = false;

    /* renamed from: H */
    private int f7531H = 0;

    /* renamed from: I */
    private int f7532I = 0;

    /* renamed from: J */
    private int f7533J = 0;

    /* renamed from: c */
    private final Handler f7536c = new Handler();

    /* renamed from: f */
    private final SurfaceHolder.Callback f7539f = new SurfaceHolder$CallbackC2791k();

    /* renamed from: g */
    private final Camera.PreviewCallback f7540g = new C2786f();

    /* renamed from: h */
    private final Camera.AutoFocusCallback f7541h = new C2792l();

    /* renamed from: i */
    private final Camera.AutoFocusCallback f7542i = new C2787g();

    /* renamed from: j */
    private final Runnable f7543j = new RunnableC2788h();

    /* renamed from: k */
    private final Runnable f7544k = new RunnableC2790j();

    /* renamed from: l */
    private final C2782b f7545l = new C2782b();

    /* renamed from: m */
    private final C2783c f7546m = new C2783c();

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2782b implements C2803f.InterfaceC2806c {
        private C2782b() {
            CodeScanner.this = r1;
        }

        @Override // com.budiyev.android.codescanner.C2803f.InterfaceC2806c
        /* renamed from: a */
        public boolean mo32199a(C2803f.EnumC2805b enumC2805b) {
            if (enumC2805b == C2803f.EnumC2805b.DECODED) {
                EnumC2813m enumC2813m = CodeScanner.this.f7548o;
                if (enumC2813m == EnumC2813m.PREVIEW) {
                    return false;
                }
                if (enumC2813m == EnumC2813m.SINGLE) {
                    CodeScanner.this.f7555v = true;
                    CodeScanner.this.f7536c.post(CodeScanner.this.f7544k);
                }
            }
            return true;
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2783c implements Thread.UncaughtExceptionHandler {
        private C2783c() {
            CodeScanner.this = r1;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            CodeScanner.this.m32266V();
            InterfaceC2808h interfaceC2808h = CodeScanner.this.f7551r;
            if (interfaceC2808h != null) {
                interfaceC2808h.onError(th2);
                return;
            }
            throw new C2800c(th2);
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class RunnableC2784d implements Runnable {

        /* renamed from: j */
        private final C2809i f7562j;

        @Override // java.lang.Runnable
        public void run() {
            if (!CodeScanner.this.f7554u) {
                return;
            }
            CodeScanner.this.f7537d.setPreviewSize(this.f7562j);
            CodeScanner.this.f7537d.setAutoFocusEnabled(CodeScanner.this.m32273O());
            CodeScanner.this.f7537d.setFlashEnabled(CodeScanner.this.m32271Q());
            CodeScanner.this.m32248g0();
        }

        private RunnableC2784d(C2809i c2809i) {
            CodeScanner.this = r1;
            this.f7562j = c2809i;
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScanner$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2785e extends Thread {

        /* renamed from: j */
        private final int f7564j;

        /* renamed from: k */
        private final int f7565k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2785e(int i, int i2) {
            super("cs-init");
            CodeScanner.this = r1;
            this.f7564j = i;
            this.f7565k = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:145:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m32223a() {
            /*
                Method dump skipped, instructions count: 389
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.budiyev.android.codescanner.CodeScanner.C2785e.m32223a():void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            m32223a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2786f implements Camera.PreviewCallback {
        private C2786f() {
            CodeScanner.this = r1;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C2807g c2807g;
            C2812l frameRect;
            if (!CodeScanner.this.f7554u || CodeScanner.this.f7555v || CodeScanner.this.f7548o == EnumC2813m.PREVIEW || bArr == null || (c2807g = CodeScanner.this.f7552s) == null) {
                return;
            }
            C2803f m32197b = c2807g.m32197b();
            if (m32197b.m32205h() == C2803f.EnumC2805b.IDLE && (frameRect = CodeScanner.this.f7537d.getFrameRect()) != null && frameRect.m32179h() >= 1 && frameRect.m32183d() >= 1) {
                m32197b.m32206g(new C2802e(bArr, c2807g.m32195d(), c2807g.m32194e(), c2807g.m32193f(), frameRect, c2807g.m32196c(), c2807g.m32189j()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2787g implements Camera.AutoFocusCallback {
        private C2787g() {
            CodeScanner.this = r1;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CodeScanner.this.f7528E = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class RunnableC2788h implements Runnable {
        private RunnableC2788h() {
            CodeScanner.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            CodeScanner.this.f7529F = false;
            if (CodeScanner.this.f7549p == EnumC2798a.SAFE) {
                CodeScanner.this.m32265W();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2789i implements CodeScannerView.InterfaceC2797e {
        private C2789i() {
            CodeScanner.this = r1;
        }

        @Override // com.budiyev.android.codescanner.CodeScannerView.InterfaceC2797e
        /* renamed from: a */
        public void mo32214a(int i, int i2) {
            synchronized (CodeScanner.this.f7534a) {
                if (i != CodeScanner.this.f7532I || i2 != CodeScanner.this.f7533J) {
                    boolean z = CodeScanner.this.f7527D;
                    if (CodeScanner.this.f7554u) {
                        CodeScanner.this.m32267U();
                    }
                    if (z || CodeScanner.this.f7530G) {
                        CodeScanner.this.m32274N(i, i2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class RunnableC2790j implements Runnable {
        private RunnableC2790j() {
            CodeScanner.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            CodeScanner.this.m32242j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class SurfaceHolder$CallbackC2791k implements SurfaceHolder.Callback {
        private SurfaceHolder$CallbackC2791k() {
            CodeScanner.this = r1;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder.getSurface() == null) {
                CodeScanner.this.f7527D = false;
                return;
            }
            CodeScanner.this.m32238l0();
            CodeScanner.this.m32244i0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CodeScanner.this.m32244i0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CodeScanner.this.m32238l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.CodeScanner$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2792l implements Camera.AutoFocusCallback {
        private C2792l() {
            CodeScanner.this = r1;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CodeScanner.this.f7526C = false;
        }
    }

    static {
        List<EnumC7055a> unmodifiableList = Collections.unmodifiableList(Arrays.asList(EnumC7055a.values()));
        f7518K = unmodifiableList;
        f7519L = Collections.unmodifiableList(Arrays.asList(EnumC7055a.CODABAR, EnumC7055a.CODE_39, EnumC7055a.CODE_93, EnumC7055a.CODE_128, EnumC7055a.EAN_8, EnumC7055a.EAN_13, EnumC7055a.ITF, EnumC7055a.RSS_14, EnumC7055a.RSS_EXPANDED, EnumC7055a.UPC_A, EnumC7055a.UPC_E, EnumC7055a.UPC_EAN_EXTENSION));
        f7520M = Collections.unmodifiableList(Arrays.asList(EnumC7055a.AZTEC, EnumC7055a.DATA_MATRIX, EnumC7055a.MAXICODE, EnumC7055a.PDF_417, EnumC7055a.QR_CODE));
        f7521N = unmodifiableList;
        f7522O = EnumC2813m.SINGLE;
        f7523P = EnumC2798a.SAFE;
    }

    public CodeScanner(Context context, CodeScannerView codeScannerView) {
        this.f7535b = context;
        this.f7537d = codeScannerView;
        this.f7538e = codeScannerView.getPreviewView().getHolder();
        codeScannerView.setCodeScanner(this);
        codeScannerView.setSizeListener(new C2789i());
    }

    /* renamed from: M */
    private void m32275M() {
        m32274N(this.f7537d.getWidth(), this.f7537d.getHeight());
    }

    /* renamed from: N */
    public void m32274N(int i, int i2) {
        this.f7532I = i;
        this.f7533J = i2;
        if (i > 0 && i2 > 0) {
            this.f7553t = true;
            this.f7530G = false;
            C2785e c2785e = new C2785e(i, i2);
            c2785e.setUncaughtExceptionHandler(this.f7546m);
            c2785e.start();
            return;
        }
        this.f7530G = true;
    }

    /* renamed from: V */
    public void m32266V() {
        this.f7554u = false;
        this.f7553t = false;
        this.f7555v = false;
        this.f7527D = false;
        this.f7528E = false;
        C2807g c2807g = this.f7552s;
        if (c2807g != null) {
            this.f7552s = null;
            c2807g.m32190i();
        }
    }

    /* renamed from: W */
    public void m32265W() {
        C2807g c2807g;
        int i;
        if (this.f7554u && this.f7527D && (c2807g = this.f7552s) != null && c2807g.m32192g() && this.f7556w) {
            if (this.f7528E && (i = this.f7531H) < 2) {
                this.f7531H = i + 1;
            } else {
                try {
                    Camera m32198a = c2807g.m32198a();
                    m32198a.cancelAutoFocus();
                    m32198a.autoFocus(this.f7542i);
                    this.f7531H = 0;
                    this.f7528E = true;
                } catch (Exception unused) {
                    this.f7528E = false;
                }
            }
            m32264X();
        }
    }

    /* renamed from: X */
    private void m32264X() {
        if (this.f7529F) {
            return;
        }
        this.f7529F = true;
        this.f7536c.postDelayed(this.f7543j, this.f7558y);
    }

    /* renamed from: Z */
    private void m32262Z(boolean z) {
        C2812l frameRect;
        try {
            C2807g c2807g = this.f7552s;
            if (c2807g != null) {
                Camera m32198a = c2807g.m32198a();
                m32198a.cancelAutoFocus();
                this.f7526C = false;
                Camera.Parameters parameters = m32198a.getParameters();
                EnumC2798a enumC2798a = this.f7549p;
                if (z) {
                    C2814n.m32159r(parameters, enumC2798a);
                } else {
                    C2814n.m32168i(parameters);
                }
                if (z && (frameRect = this.f7537d.getFrameRect()) != null) {
                    C2814n.m32176a(parameters, c2807g, frameRect);
                }
                m32198a.setParameters(parameters);
                if (z) {
                    this.f7531H = 0;
                    this.f7528E = false;
                    if (enumC2798a == EnumC2798a.SAFE) {
                        m32264X();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e0 */
    private void m32252e0(boolean z) {
        Camera m32198a;
        Camera.Parameters parameters;
        try {
            C2807g c2807g = this.f7552s;
            if (c2807g == null || (parameters = (m32198a = c2807g.m32198a()).getParameters()) == null) {
                return;
            }
            if (z) {
                C2814n.m32158s(parameters, "torch");
            } else {
                C2814n.m32158s(parameters, "off");
            }
            m32198a.setParameters(parameters);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h0 */
    private void m32246h0(boolean z) {
        try {
            C2807g c2807g = this.f7552s;
            if (c2807g != null) {
                Camera m32198a = c2807g.m32198a();
                m32198a.setPreviewCallback(this.f7540g);
                m32198a.setPreviewDisplay(this.f7538e);
                if (!z && c2807g.m32191h() && this.f7557x) {
                    m32252e0(true);
                }
                m32198a.startPreview();
                this.f7555v = false;
                this.f7527D = true;
                this.f7528E = false;
                this.f7531H = 0;
                if (c2807g.m32192g() && this.f7556w) {
                    C2812l frameRect = this.f7537d.getFrameRect();
                    if (frameRect != null) {
                        Camera.Parameters parameters = m32198a.getParameters();
                        C2814n.m32176a(parameters, c2807g, frameRect);
                        m32198a.setParameters(parameters);
                    }
                    if (this.f7549p == EnumC2798a.SAFE) {
                        m32264X();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i0 */
    public void m32244i0() {
        if (this.f7554u && !this.f7527D) {
            m32246h0(true);
        }
    }

    /* renamed from: k0 */
    private void m32240k0(boolean z) {
        try {
            C2807g c2807g = this.f7552s;
            if (c2807g != null) {
                Camera m32198a = c2807g.m32198a();
                m32198a.cancelAutoFocus();
                Camera.Parameters parameters = m32198a.getParameters();
                if (!z && c2807g.m32191h() && this.f7557x) {
                    C2814n.m32158s(parameters, "off");
                }
                m32198a.setParameters(parameters);
                m32198a.setPreviewCallback(null);
                m32198a.stopPreview();
            }
        } catch (Exception unused) {
        }
        this.f7555v = false;
        this.f7527D = false;
        this.f7528E = false;
        this.f7531H = 0;
    }

    /* renamed from: l0 */
    public void m32238l0() {
        if (this.f7554u && this.f7527D) {
            m32240k0(true);
        }
    }

    /* renamed from: O */
    public boolean m32273O() {
        return this.f7556w;
    }

    /* renamed from: P */
    public boolean m32272P() {
        C2807g c2807g = this.f7552s;
        if (c2807g != null && !c2807g.m32192g()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public boolean m32271Q() {
        return this.f7557x;
    }

    /* renamed from: R */
    public boolean m32270R() {
        C2807g c2807g = this.f7552s;
        if (c2807g != null && !c2807g.m32191h()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public boolean m32269S() {
        return this.f7525B;
    }

    /* renamed from: T */
    public void m32268T(C2812l c2812l) {
        synchronized (this.f7534a) {
            if (this.f7554u && this.f7527D && !this.f7526C) {
                try {
                    m32263Y(false);
                    C2807g c2807g = this.f7552s;
                    if (this.f7527D && c2807g != null && c2807g.m32192g()) {
                        C2809i m32195d = c2807g.m32195d();
                        int m32188a = m32195d.m32188a();
                        int m32187b = m32195d.m32187b();
                        int m32196c = c2807g.m32196c();
                        if (m32196c == 90 || m32196c == 270) {
                            m32188a = m32187b;
                            m32187b = m32188a;
                        }
                        C2812l m32164m = C2814n.m32164m(m32188a, m32187b, c2812l, c2807g.m32194e(), c2807g.m32193f());
                        Camera m32198a = c2807g.m32198a();
                        m32198a.cancelAutoFocus();
                        Camera.Parameters parameters = m32198a.getParameters();
                        C2814n.m32174c(parameters, m32164m, m32188a, m32187b, m32196c);
                        C2814n.m32173d(parameters);
                        m32198a.setParameters(parameters);
                        m32198a.autoFocus(this.f7541h);
                        this.f7526C = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: U */
    public void m32267U() {
        if (this.f7554u) {
            if (this.f7527D) {
                m32242j0();
            }
            m32266V();
        }
    }

    /* renamed from: Y */
    public void m32263Y(boolean z) {
        boolean z2;
        synchronized (this.f7534a) {
            if (this.f7556w != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f7556w = z;
            this.f7537d.setAutoFocusEnabled(z);
            C2807g c2807g = this.f7552s;
            if (this.f7554u && this.f7527D && z2 && c2807g != null && c2807g.m32192g()) {
                m32262Z(z);
            }
        }
    }

    /* renamed from: a0 */
    public void m32260a0(int i) {
        synchronized (this.f7534a) {
            if (this.f7559z != i) {
                this.f7559z = i;
                if (this.f7554u) {
                    boolean z = this.f7527D;
                    m32267U();
                    if (z) {
                        m32275M();
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    public void m32258b0(InterfaceC2801d interfaceC2801d) {
        C2807g c2807g;
        synchronized (this.f7534a) {
            this.f7550q = interfaceC2801d;
            if (this.f7554u && (c2807g = this.f7552s) != null) {
                c2807g.m32197b().m32204i(interfaceC2801d);
            }
        }
    }

    /* renamed from: c0 */
    public void m32256c0(InterfaceC2808h interfaceC2808h) {
        this.f7551r = interfaceC2808h;
    }

    /* renamed from: d0 */
    public void m32254d0(boolean z) {
        boolean z2;
        synchronized (this.f7534a) {
            if (this.f7557x != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f7557x = z;
            this.f7537d.setFlashEnabled(z);
            C2807g c2807g = this.f7552s;
            if (this.f7554u && this.f7527D && z2 && c2807g != null && c2807g.m32191h()) {
                m32252e0(z);
            }
        }
    }

    /* renamed from: f0 */
    public void m32250f0(List<EnumC7055a> list) {
        C2807g c2807g;
        synchronized (this.f7534a) {
            Objects.requireNonNull(list);
            this.f7547n = list;
            if (this.f7554u && (c2807g = this.f7552s) != null) {
                c2807g.m32197b().m32203j(list);
            }
        }
    }

    /* renamed from: g0 */
    public void m32248g0() {
        synchronized (this.f7534a) {
            if (!this.f7554u && !this.f7553t) {
                m32275M();
            } else if (!this.f7527D) {
                this.f7538e.addCallback(this.f7539f);
                m32246h0(false);
            }
        }
    }

    /* renamed from: j0 */
    public void m32242j0() {
        if (this.f7554u && this.f7527D) {
            this.f7538e.removeCallback(this.f7539f);
            m32240k0(false);
        }
    }
}