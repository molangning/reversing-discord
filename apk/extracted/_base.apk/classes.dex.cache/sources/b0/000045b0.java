package p259o6;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import gb.AbstractC6693s;
import gb.AbstractC6703u0;
import gb.AbstractC6711w;
import gb.C6688r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9200u;
import p259o6.C11007h;
import p259o6.C11028l;
import p259o6.InterfaceC10993c0;
import p259o6.InterfaceC11035n;
import p259o6.InterfaceC11045v;

/* renamed from: o6.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11015i implements InterfaceC11049x {

    /* renamed from: c */
    private final UUID f28841c;

    /* renamed from: d */
    private final InterfaceC10993c0.InterfaceC10997d f28842d;

    /* renamed from: e */
    private final InterfaceC11025j0 f28843e;

    /* renamed from: f */
    private final HashMap<String, String> f28844f;

    /* renamed from: g */
    private final boolean f28845g;

    /* renamed from: h */
    private final int[] f28846h;

    /* renamed from: i */
    private final boolean f28847i;

    /* renamed from: j */
    private final C11021f f28848j;

    /* renamed from: k */
    private final InterfaceC4548g f28849k;

    /* renamed from: l */
    private final C11022g f28850l;

    /* renamed from: m */
    private final long f28851m;

    /* renamed from: n */
    private final List<C11007h> f28852n;

    /* renamed from: o */
    private final List<C11007h> f28853o;

    /* renamed from: p */
    private final Set<C11007h> f28854p;

    /* renamed from: q */
    private int f28855q;

    /* renamed from: r */
    private InterfaceC10993c0 f28856r;

    /* renamed from: s */
    private C11007h f28857s;

    /* renamed from: t */
    private C11007h f28858t;

    /* renamed from: u */
    private Looper f28859u;

    /* renamed from: v */
    private Handler f28860v;

    /* renamed from: w */
    private int f28861w;

    /* renamed from: x */
    private byte[] f28862x;

    /* renamed from: y */
    volatile HandlerC11019d f28863y;

    /* renamed from: o6.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11017b {

        /* renamed from: d */
        private boolean f28867d;

        /* renamed from: f */
        private boolean f28869f;

        /* renamed from: a */
        private final HashMap<String, String> f28864a = new HashMap<>();

        /* renamed from: b */
        private UUID f28865b = C7390b.f19881d;

        /* renamed from: c */
        private InterfaceC10993c0.InterfaceC10997d f28866c = C11006g0.f28802d;

        /* renamed from: g */
        private InterfaceC4548g f28870g = new C4538d();

        /* renamed from: e */
        private int[] f28868e = new int[0];

        /* renamed from: h */
        private long f28871h = 300000;

        /* renamed from: a */
        public C11015i m9337a(InterfaceC11025j0 interfaceC11025j0) {
            return new C11015i(this.f28865b, this.f28866c, interfaceC11025j0, this.f28864a, this.f28867d, this.f28868e, this.f28869f, this.f28870g, this.f28871h);
        }

        /* renamed from: b */
        public C11017b m9336b(boolean z) {
            this.f28867d = z;
            return this;
        }

        /* renamed from: c */
        public C11017b m9335c(boolean z) {
            this.f28869f = z;
            return this;
        }

        /* renamed from: d */
        public C11017b m9334d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                C9149a.m16452a(z);
            }
            this.f28868e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public C11017b m9333e(UUID uuid, InterfaceC10993c0.InterfaceC10997d interfaceC10997d) {
            this.f28865b = (UUID) C9149a.m16448e(uuid);
            this.f28866c = (InterfaceC10993c0.InterfaceC10997d) C9149a.m16448e(interfaceC10997d);
            return this;
        }
    }

    /* renamed from: o6.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C11018c implements InterfaceC10993c0.InterfaceC10996c {
        private C11018c() {
            C11015i.this = r1;
        }

        @Override // p259o6.InterfaceC10993c0.InterfaceC10996c
        /* renamed from: a */
        public void mo9332a(InterfaceC10993c0 interfaceC10993c0, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC11019d) C9149a.m16448e(C11015i.this.f28863y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: o6.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class HandlerC11019d extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC11019d(Looper looper) {
            super(looper);
            C11015i.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C11007h c11007h : C11015i.this.f28852n) {
                if (c11007h.m9372o(bArr)) {
                    c11007h.m9365v(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: o6.i$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11020e extends Exception {
        private C11020e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: o6.i$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11021f implements C11007h.InterfaceC11008a {
        private C11021f() {
            C11015i.this = r1;
        }

        @Override // p259o6.C11007h.InterfaceC11008a
        /* renamed from: a */
        public void mo9331a(C11007h c11007h) {
            if (C11015i.this.f28853o.contains(c11007h)) {
                return;
            }
            C11015i.this.f28853o.add(c11007h);
            if (C11015i.this.f28853o.size() == 1) {
                c11007h.m9381B();
            }
        }

        @Override // p259o6.C11007h.InterfaceC11008a
        /* renamed from: b */
        public void mo9330b() {
            for (C11007h c11007h : C11015i.this.f28853o) {
                c11007h.m9364w();
            }
            C11015i.this.f28853o.clear();
        }

        @Override // p259o6.C11007h.InterfaceC11008a
        /* renamed from: c */
        public void mo9329c(Exception exc) {
            for (C11007h c11007h : C11015i.this.f28853o) {
                c11007h.m9363x(exc);
            }
            C11015i.this.f28853o.clear();
        }
    }

    /* renamed from: o6.i$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11022g implements C11007h.InterfaceC11009b {
        private C11022g() {
            C11015i.this = r1;
        }

        @Override // p259o6.C11007h.InterfaceC11009b
        /* renamed from: a */
        public void mo9328a(C11007h c11007h, int i) {
            if (C11015i.this.f28851m != -9223372036854775807L) {
                C11015i.this.f28854p.remove(c11007h);
                ((Handler) C9149a.m16448e(C11015i.this.f28860v)).removeCallbacksAndMessages(c11007h);
            }
        }

        @Override // p259o6.C11007h.InterfaceC11009b
        /* renamed from: b */
        public void mo9327b(final C11007h c11007h, int i) {
            if (i == 1 && C11015i.this.f28851m != -9223372036854775807L) {
                C11015i.this.f28854p.add(c11007h);
                ((Handler) C9149a.m16448e(C11015i.this.f28860v)).postAtTime(new Runnable() { // from class: o6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11007h.this.mo9303d(null);
                    }
                }, c11007h, SystemClock.uptimeMillis() + C11015i.this.f28851m);
            } else if (i == 0) {
                C11015i.this.f28852n.remove(c11007h);
                if (C11015i.this.f28857s == c11007h) {
                    C11015i.this.f28857s = null;
                }
                if (C11015i.this.f28858t == c11007h) {
                    C11015i.this.f28858t = null;
                }
                if (C11015i.this.f28853o.size() > 1 && C11015i.this.f28853o.get(0) == c11007h) {
                    ((C11007h) C11015i.this.f28853o.get(1)).m9381B();
                }
                C11015i.this.f28853o.remove(c11007h);
                if (C11015i.this.f28851m != -9223372036854775807L) {
                    ((Handler) C9149a.m16448e(C11015i.this.f28860v)).removeCallbacksAndMessages(c11007h);
                    C11015i.this.f28854p.remove(c11007h);
                }
            }
        }
    }

    /* renamed from: m */
    private boolean m9345m(C11028l c11028l) {
        if (this.f28862x != null) {
            return true;
        }
        if (m9342p(c11028l, this.f28841c, true).isEmpty()) {
            if (c11028l.f28889m != 1 || !c11028l.m9316y(0).m9310e(C7390b.f19879b)) {
                return false;
            }
            C9197r.m16178h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f28841c);
        }
        String str = c11028l.f28888l;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (C9191p0.f24171a >= 25) {
                return true;
            }
            return false;
        } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private C11007h m9344n(List<C11028l.C11030b> list, boolean z, InterfaceC11045v.C11046a c11046a) {
        C9149a.m16448e(this.f28856r);
        C11007h c11007h = new C11007h(this.f28841c, this.f28856r, this.f28848j, this.f28850l, list, this.f28861w, this.f28847i | z, z, this.f28862x, this.f28844f, this.f28843e, (Looper) C9149a.m16448e(this.f28859u), this.f28849k);
        c11007h.mo9304c(c11046a);
        if (this.f28851m != -9223372036854775807L) {
            c11007h.mo9304c(null);
        }
        return c11007h;
    }

    /* renamed from: o */
    private C11007h m9343o(List<C11028l.C11030b> list, boolean z, InterfaceC11045v.C11046a c11046a) {
        C11007h m9344n = m9344n(list, z, c11046a);
        if (m9344n.getState() == 1) {
            if ((C9191p0.f24171a < 19 || (((InterfaceC11035n.C11036a) C9149a.m16448e(m9344n.mo9301f())).getCause() instanceof ResourceBusyException)) && !this.f28854p.isEmpty()) {
                AbstractC6703u0 it = AbstractC6711w.m22069s(this.f28854p).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11035n) it.next()).mo9303d(null);
                }
                m9344n.mo9303d(c11046a);
                if (this.f28851m != -9223372036854775807L) {
                    m9344n.mo9303d(null);
                }
                return m9344n(list, z, c11046a);
            }
            return m9344n;
        }
        return m9344n;
    }

    /* renamed from: p */
    private static List<C11028l.C11030b> m9342p(C11028l c11028l, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(c11028l.f28889m);
        for (int i = 0; i < c11028l.f28889m; i++) {
            C11028l.C11030b m9316y = c11028l.m9316y(i);
            if (!m9316y.m9310e(uuid) && (!C7390b.f19880c.equals(uuid) || !m9316y.m9310e(C7390b.f19879b))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (m9316y.f28894n != null || z)) {
                arrayList.add(m9316y);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private void m9341q(Looper looper) {
        boolean z;
        Looper looper2 = this.f28859u;
        if (looper2 == null) {
            this.f28859u = looper;
            this.f28860v = new Handler(looper);
            return;
        }
        if (looper2 == looper) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
    }

    /* renamed from: r */
    private InterfaceC11035n m9340r(int i) {
        boolean z;
        InterfaceC10993c0 interfaceC10993c0 = (InterfaceC10993c0) C9149a.m16448e(this.f28856r);
        if (C11000d0.class.equals(interfaceC10993c0.mo9264a()) && C11000d0.f28795d) {
            z = true;
        } else {
            z = false;
        }
        if (z || C9191p0.m16220u0(this.f28846h, i) == -1 || C11034m0.class.equals(interfaceC10993c0.mo9264a())) {
            return null;
        }
        C11007h c11007h = this.f28857s;
        if (c11007h == null) {
            C11007h m9343o = m9343o(AbstractC6693s.m22131x(), true, null);
            this.f28852n.add(m9343o);
            this.f28857s = m9343o;
        } else {
            c11007h.mo9304c(null);
        }
        return this.f28857s;
    }

    /* renamed from: s */
    private void m9339s(Looper looper) {
        if (this.f28863y == null) {
            this.f28863y = new HandlerC11019d(looper);
        }
    }

    @Override // p259o6.InterfaceC11049x
    /* renamed from: a */
    public InterfaceC11035n mo9267a(Looper looper, InterfaceC11045v.C11046a c11046a, Format format) {
        List<C11028l.C11030b> list;
        m9341q(looper);
        m9339s(looper);
        C11028l c11028l = format.f11200x;
        if (c11028l == null) {
            return m9340r(C9200u.m16158l(format.f11197u));
        }
        C11007h c11007h = null;
        if (this.f28862x == null) {
            list = m9342p((C11028l) C9149a.m16448e(c11028l), this.f28841c, false);
            if (list.isEmpty()) {
                C11020e c11020e = new C11020e(this.f28841c);
                if (c11046a != null) {
                    c11046a.m9278l(c11020e);
                }
                return new C10989a0(new InterfaceC11035n.C11036a(c11020e));
            }
        } else {
            list = null;
        }
        if (!this.f28845g) {
            c11007h = this.f28858t;
        } else {
            Iterator<C11007h> it = this.f28852n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11007h next = it.next();
                if (C9191p0.m16257c(next.f28806a, list)) {
                    c11007h = next;
                    break;
                }
            }
        }
        if (c11007h == null) {
            c11007h = m9343o(list, false, c11046a);
            if (!this.f28845g) {
                this.f28858t = c11007h;
            }
            this.f28852n.add(c11007h);
        } else {
            c11007h.mo9304c(c11046a);
        }
        return c11007h;
    }

    @Override // p259o6.InterfaceC11049x
    /* renamed from: b */
    public Class<? extends InterfaceC10991b0> mo9266b(Format format) {
        Class<? extends InterfaceC10991b0> mo9264a = ((InterfaceC10993c0) C9149a.m16448e(this.f28856r)).mo9264a();
        C11028l c11028l = format.f11200x;
        if (c11028l == null) {
            if (C9191p0.m16220u0(this.f28846h, C9200u.m16158l(format.f11197u)) == -1) {
                return null;
            }
            return mo9264a;
        } else if (!m9345m(c11028l)) {
            return C11034m0.class;
        } else {
            return mo9264a;
        }
    }

    @Override // p259o6.InterfaceC11049x
    /* renamed from: c */
    public final void mo9265c() {
        boolean z;
        int i = this.f28855q;
        this.f28855q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f28856r == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        InterfaceC10993c0 mo9398a = this.f28842d.mo9398a(this.f28841c);
        this.f28856r = mo9398a;
        mo9398a.mo9257h(new C11018c());
    }

    @Override // p259o6.InterfaceC11049x
    public final void release() {
        int i = this.f28855q - 1;
        this.f28855q = i;
        if (i != 0) {
            return;
        }
        if (this.f28851m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f28852n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C11007h) arrayList.get(i2)).mo9303d(null);
            }
        }
        ((InterfaceC10993c0) C9149a.m16448e(this.f28856r)).release();
        this.f28856r = null;
    }

    /* renamed from: t */
    public void m9338t(int i, byte[] bArr) {
        C9149a.m16447f(this.f28852n.isEmpty());
        if (i == 1 || i == 3) {
            C9149a.m16448e(bArr);
        }
        this.f28861w = i;
        this.f28862x = bArr;
    }

    @Deprecated
    public C11015i(UUID uuid, InterfaceC10993c0 interfaceC10993c0, InterfaceC11025j0 interfaceC11025j0, HashMap<String, String> hashMap, boolean z, int i) {
        this(uuid, new InterfaceC10993c0.C10994a(interfaceC10993c0), interfaceC11025j0, hashMap == null ? new HashMap<>() : hashMap, z, new int[0], false, new C4538d(i), 300000L);
    }

    private C11015i(UUID uuid, InterfaceC10993c0.InterfaceC10997d interfaceC10997d, InterfaceC11025j0 interfaceC11025j0, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, InterfaceC4548g interfaceC4548g, long j) {
        C9149a.m16448e(uuid);
        C9149a.m16451b(!C7390b.f19879b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f28841c = uuid;
        this.f28842d = interfaceC10997d;
        this.f28843e = interfaceC11025j0;
        this.f28844f = hashMap;
        this.f28845g = z;
        this.f28846h = iArr;
        this.f28847i = z2;
        this.f28849k = interfaceC4548g;
        this.f28848j = new C11021f();
        this.f28850l = new C11022g();
        this.f28861w = 0;
        this.f28852n = new ArrayList();
        this.f28853o = new ArrayList();
        this.f28854p = C6688r0.m22146f();
        this.f28851m = j;
    }
}