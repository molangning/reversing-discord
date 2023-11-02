package p259o6;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9171h;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.InterfaceC9165g;
import p259o6.C11028l;
import p259o6.InterfaceC10993c0;
import p259o6.InterfaceC11035n;
import p259o6.InterfaceC11045v;

/* renamed from: o6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11007h implements InterfaceC11035n {

    /* renamed from: a */
    public final List<C11028l.C11030b> f28806a;

    /* renamed from: b */
    private final InterfaceC10993c0 f28807b;

    /* renamed from: c */
    private final InterfaceC11008a f28808c;

    /* renamed from: d */
    private final InterfaceC11009b f28809d;

    /* renamed from: e */
    private final int f28810e;

    /* renamed from: f */
    private final boolean f28811f;

    /* renamed from: g */
    private final boolean f28812g;

    /* renamed from: h */
    private final HashMap<String, String> f28813h;

    /* renamed from: i */
    private final C9171h<InterfaceC11045v.C11046a> f28814i;

    /* renamed from: j */
    private final InterfaceC4548g f28815j;

    /* renamed from: k */
    final InterfaceC11025j0 f28816k;

    /* renamed from: l */
    final UUID f28817l;

    /* renamed from: m */
    final HandlerC11012e f28818m;

    /* renamed from: n */
    private int f28819n;

    /* renamed from: o */
    private int f28820o;

    /* renamed from: p */
    private HandlerThread f28821p;

    /* renamed from: q */
    private HandlerC11010c f28822q;

    /* renamed from: r */
    private InterfaceC10991b0 f28823r;

    /* renamed from: s */
    private InterfaceC11035n.C11036a f28824s;

    /* renamed from: t */
    private byte[] f28825t;

    /* renamed from: u */
    private byte[] f28826u;

    /* renamed from: v */
    private InterfaceC10993c0.C10995b f28827v;

    /* renamed from: w */
    private InterfaceC10993c0.C10998e f28828w;

    /* renamed from: o6.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11008a {
        /* renamed from: a */
        void mo9331a(C11007h c11007h);

        /* renamed from: b */
        void mo9330b();

        /* renamed from: c */
        void mo9329c(Exception exc);
    }

    /* renamed from: o6.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11009b {
        /* renamed from: a */
        void mo9328a(C11007h c11007h, int i);

        /* renamed from: b */
        void mo9327b(C11007h c11007h, int i);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: o6.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class HandlerC11010c extends Handler {

        /* renamed from: a */
        private boolean f28829a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC11010c(Looper looper) {
            super(looper);
            C11007h.this = r1;
        }

        /* renamed from: a */
        private boolean m9360a(Message message, C11027k0 c11027k0) {
            IOException c11013f;
            C11011d c11011d = (C11011d) message.obj;
            if (!c11011d.f28832b) {
                return false;
            }
            int i = c11011d.f28835e + 1;
            c11011d.f28835e = i;
            if (i > C11007h.this.f28815j.mo28629c(3)) {
                return false;
            }
            LoadEventInfo loadEventInfo = new LoadEventInfo(c11011d.f28831a, c11027k0.f28882j, c11027k0.f28883k, c11027k0.f28884l, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c11011d.f28833c, c11027k0.f28885m);
            MediaLoadData mediaLoadData = new MediaLoadData(3);
            if (c11027k0.getCause() instanceof IOException) {
                c11013f = (IOException) c11027k0.getCause();
            } else {
                c11013f = new C11013f(c11027k0.getCause());
            }
            long mo28631a = C11007h.this.f28815j.mo28631a(new InterfaceC4548g.C4549a(loadEventInfo, mediaLoadData, c11013f, c11011d.f28835e));
            if (mo28631a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f28829a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), mo28631a);
                return true;
            }
        }

        /* renamed from: b */
        void m9359b(int i, Object obj, boolean z) {
            obtainMessage(i, new C11011d(LoadEventInfo.m29145a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void m9358c() {
            removeCallbacksAndMessages(null);
            this.f28829a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            C11011d c11011d = (C11011d) message.obj;
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        C11007h c11007h = C11007h.this;
                        bArr = c11007h.f28816k.mo9323b(c11007h.f28817l, (InterfaceC10993c0.C10995b) c11011d.f28834d);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    C11007h c11007h2 = C11007h.this;
                    bArr = c11007h2.f28816k.mo9324a(c11007h2.f28817l, (InterfaceC10993c0.C10998e) c11011d.f28834d);
                }
            } catch (C11027k0 e) {
                boolean m9360a = m9360a(message, e);
                bArr = e;
                if (m9360a) {
                    return;
                }
            } catch (Exception e2) {
                C9197r.m16177i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                bArr = e2;
            }
            C11007h.this.f28815j.mo28628d(c11011d.f28831a);
            synchronized (this) {
                if (!this.f28829a) {
                    C11007h.this.f28818m.obtainMessage(message.what, Pair.create(c11011d.f28834d, bArr)).sendToTarget();
                }
            }
        }
    }

    /* renamed from: o6.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11011d {

        /* renamed from: a */
        public final long f28831a;

        /* renamed from: b */
        public final boolean f28832b;

        /* renamed from: c */
        public final long f28833c;

        /* renamed from: d */
        public final Object f28834d;

        /* renamed from: e */
        public int f28835e;

        public C11011d(long j, boolean z, long j2, Object obj) {
            this.f28831a = j;
            this.f28832b = z;
            this.f28833c = j2;
            this.f28834d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: o6.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class HandlerC11012e extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC11012e(Looper looper) {
            super(looper);
            C11007h.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    C11007h.this.m9368s(obj, obj2);
                    return;
                }
                return;
            }
            C11007h.this.m9362y(obj, obj2);
        }
    }

    /* renamed from: o6.h$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11013f extends IOException {
        public C11013f(Throwable th2) {
            super(th2);
        }
    }

    public C11007h(UUID uuid, InterfaceC10993c0 interfaceC10993c0, InterfaceC11008a interfaceC11008a, InterfaceC11009b interfaceC11009b, List<C11028l.C11030b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, InterfaceC11025j0 interfaceC11025j0, Looper looper, InterfaceC4548g interfaceC4548g) {
        if (i == 1 || i == 3) {
            C9149a.m16448e(bArr);
        }
        this.f28817l = uuid;
        this.f28808c = interfaceC11008a;
        this.f28809d = interfaceC11009b;
        this.f28807b = interfaceC10993c0;
        this.f28810e = i;
        this.f28811f = z;
        this.f28812g = z2;
        if (bArr != null) {
            this.f28826u = bArr;
            this.f28806a = null;
        } else {
            this.f28806a = Collections.unmodifiableList((List) C9149a.m16448e(list));
        }
        this.f28813h = hashMap;
        this.f28816k = interfaceC11025j0;
        this.f28814i = new C9171h<>();
        this.f28815j = interfaceC4548g;
        this.f28819n = 2;
        this.f28818m = new HandlerC11012e(looper);
    }

    /* renamed from: A */
    private void m9382A(byte[] bArr, int i, boolean z) {
        try {
            this.f28827v = this.f28807b.mo9254k(bArr, this.f28806a, i, this.f28813h);
            ((HandlerC11010c) C9191p0.m16243j(this.f28822q)).m9359b(1, C9149a.m16448e(this.f28827v), z);
        } catch (Exception e) {
            m9367t(e);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* renamed from: C */
    private boolean m9380C() {
        try {
            this.f28807b.mo9259f(this.f28825t, this.f28826u);
            return true;
        } catch (Exception e) {
            C9197r.m16182d("DefaultDrmSession", "Error trying to restore keys.", e);
            m9369r(e);
            return false;
        }
    }

    /* renamed from: l */
    private void m9375l(InterfaceC9165g<InterfaceC11045v.C11046a> interfaceC9165g) {
        for (InterfaceC11045v.C11046a c11046a : this.f28814i.m16387l()) {
            interfaceC9165g.accept(c11046a);
        }
    }

    @RequiresNonNull({"sessionId"})
    /* renamed from: m */
    private void m9374m(boolean z) {
        if (this.f28812g) {
            return;
        }
        byte[] bArr = (byte[]) C9191p0.m16243j(this.f28825t);
        int i = this.f28810e;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C9149a.m16448e(this.f28826u);
                    C9149a.m16448e(this.f28825t);
                    if (m9380C()) {
                        m9382A(this.f28826u, 3, z);
                    }
                }
            } else if (this.f28826u == null || m9380C()) {
                m9382A(bArr, 2, z);
            }
        } else if (this.f28826u == null) {
            m9382A(bArr, 1, z);
        } else if (this.f28819n == 4 || m9380C()) {
            long m9373n = m9373n();
            if (this.f28810e == 0 && m9373n <= 60) {
                C9197r.m16184b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + m9373n);
                m9382A(bArr, 2, z);
            } else if (m9373n <= 0) {
                m9369r(new C11023i0());
            } else {
                this.f28819n = 4;
                m9375l(new InterfaceC9165g() { // from class: o6.g
                    @Override // p195k8.InterfaceC9165g
                    public final void accept(Object obj) {
                        ((InterfaceC11045v.C11046a) obj).m9280j();
                    }
                });
            }
        }
    }

    /* renamed from: n */
    private long m9373n() {
        if (!C7390b.f19881d.equals(this.f28817l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C9149a.m16448e(C11037n0.m9298b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: p */
    private boolean m9371p() {
        int i = this.f28819n;
        return i == 3 || i == 4;
    }

    /* renamed from: r */
    private void m9369r(final Exception exc) {
        this.f28824s = new InterfaceC11035n.C11036a(exc);
        m9375l(new InterfaceC9165g() { // from class: o6.f
            @Override // p195k8.InterfaceC9165g
            public final void accept(Object obj) {
                ((InterfaceC11045v.C11046a) obj).m9278l(exc);
            }
        });
        if (this.f28819n != 4) {
            this.f28819n = 1;
        }
    }

    /* renamed from: s */
    public void m9368s(Object obj, Object obj2) {
        if (obj == this.f28827v && m9371p()) {
            this.f28827v = null;
            if (obj2 instanceof Exception) {
                m9367t((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f28810e == 3) {
                    this.f28807b.mo9255j((byte[]) C9191p0.m16243j(this.f28826u), bArr);
                    m9375l(new InterfaceC9165g() { // from class: o6.d
                        @Override // p195k8.InterfaceC9165g
                        public final void accept(Object obj3) {
                            ((InterfaceC11045v.C11046a) obj3).m9281i();
                        }
                    });
                    return;
                }
                byte[] mo9255j = this.f28807b.mo9255j(this.f28825t, bArr);
                int i = this.f28810e;
                if ((i == 2 || (i == 0 && this.f28826u != null)) && mo9255j != null && mo9255j.length != 0) {
                    this.f28826u = mo9255j;
                }
                this.f28819n = 4;
                m9375l(new InterfaceC9165g() { // from class: o6.e
                    @Override // p195k8.InterfaceC9165g
                    public final void accept(Object obj3) {
                        ((InterfaceC11045v.C11046a) obj3).m9282h();
                    }
                });
            } catch (Exception e) {
                m9367t(e);
            }
        }
    }

    /* renamed from: t */
    private void m9367t(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f28808c.mo9331a(this);
        } else {
            m9369r(exc);
        }
    }

    /* renamed from: u */
    private void m9366u() {
        if (this.f28810e == 0 && this.f28819n == 4) {
            C9191p0.m16243j(this.f28825t);
            m9374m(false);
        }
    }

    /* renamed from: y */
    public void m9362y(Object obj, Object obj2) {
        if (obj == this.f28828w) {
            if (this.f28819n == 2 || m9371p()) {
                this.f28828w = null;
                if (obj2 instanceof Exception) {
                    this.f28808c.mo9329c((Exception) obj2);
                    return;
                }
                try {
                    this.f28807b.mo9258g((byte[]) obj2);
                    this.f28808c.mo9330b();
                } catch (Exception e) {
                    this.f28808c.mo9329c(e);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: z */
    private boolean m9361z(boolean z) {
        if (m9371p()) {
            return true;
        }
        try {
            byte[] mo9260e = this.f28807b.mo9260e();
            this.f28825t = mo9260e;
            this.f28823r = this.f28807b.mo9262c(mo9260e);
            m9375l(new InterfaceC9165g() { // from class: o6.c
                @Override // p195k8.InterfaceC9165g
                public final void accept(Object obj) {
                    ((InterfaceC11045v.C11046a) obj).m9279k();
                }
            });
            this.f28819n = 3;
            C9149a.m16448e(this.f28825t);
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.f28808c.mo9331a(this);
                return false;
            }
            m9369r(e);
            return false;
        } catch (Exception e2) {
            m9369r(e2);
            return false;
        }
    }

    /* renamed from: B */
    public void m9381B() {
        this.f28828w = this.f28807b.mo9261d();
        ((HandlerC11010c) C9191p0.m16243j(this.f28822q)).m9359b(0, C9149a.m16448e(this.f28828w), true);
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: a */
    public final UUID mo9306a() {
        return this.f28817l;
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: b */
    public boolean mo9305b() {
        return this.f28811f;
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: c */
    public void mo9304c(InterfaceC11045v.C11046a c11046a) {
        boolean z;
        boolean z2 = false;
        if (this.f28820o >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (c11046a != null) {
            this.f28814i.m16389a(c11046a);
        }
        int i = this.f28820o + 1;
        this.f28820o = i;
        if (i == 1) {
            if (this.f28819n == 2) {
                z2 = true;
            }
            C9149a.m16447f(z2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f28821p = handlerThread;
            handlerThread.start();
            this.f28822q = new HandlerC11010c(this.f28821p.getLooper());
            if (m9361z(true)) {
                m9374m(true);
            }
        } else if (c11046a != null && m9371p()) {
            c11046a.m9279k();
        }
        this.f28809d.mo9328a(this, this.f28820o);
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: d */
    public void mo9303d(InterfaceC11045v.C11046a c11046a) {
        boolean z;
        if (this.f28820o > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        int i = this.f28820o - 1;
        this.f28820o = i;
        if (i == 0) {
            this.f28819n = 0;
            ((HandlerC11012e) C9191p0.m16243j(this.f28818m)).removeCallbacksAndMessages(null);
            ((HandlerC11010c) C9191p0.m16243j(this.f28822q)).m9358c();
            this.f28822q = null;
            ((HandlerThread) C9191p0.m16243j(this.f28821p)).quit();
            this.f28821p = null;
            this.f28823r = null;
            this.f28824s = null;
            this.f28827v = null;
            this.f28828w = null;
            byte[] bArr = this.f28825t;
            if (bArr != null) {
                this.f28807b.mo9256i(bArr);
                this.f28825t = null;
            }
            m9375l(new InterfaceC9165g() { // from class: o6.b
                @Override // p195k8.InterfaceC9165g
                public final void accept(Object obj) {
                    ((InterfaceC11045v.C11046a) obj).m9277m();
                }
            });
        }
        if (c11046a != null) {
            if (m9371p()) {
                c11046a.m9277m();
            }
            this.f28814i.m16388d(c11046a);
        }
        this.f28809d.mo9327b(this, this.f28820o);
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: e */
    public final InterfaceC10991b0 mo9302e() {
        return this.f28823r;
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: f */
    public final InterfaceC11035n.C11036a mo9301f() {
        if (this.f28819n == 1) {
            return this.f28824s;
        }
        return null;
    }

    @Override // p259o6.InterfaceC11035n
    /* renamed from: g */
    public Map<String, String> mo9300g() {
        byte[] bArr = this.f28825t;
        if (bArr == null) {
            return null;
        }
        return this.f28807b.mo9263b(bArr);
    }

    @Override // p259o6.InterfaceC11035n
    public final int getState() {
        return this.f28819n;
    }

    /* renamed from: o */
    public boolean m9372o(byte[] bArr) {
        return Arrays.equals(this.f28825t, bArr);
    }

    /* renamed from: v */
    public void m9365v(int i) {
        if (i != 2) {
            return;
        }
        m9366u();
    }

    /* renamed from: w */
    public void m9364w() {
        if (m9361z(false)) {
            m9374m(true);
        }
    }

    /* renamed from: x */
    public void m9363x(Exception exc) {
        m9369r(exc);
    }
}