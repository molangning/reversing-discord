package com.budiyev.android.codescanner;

import java.lang.Thread;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import p136hc.C7063i;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.budiyev.android.codescanner.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2803f {

    /* renamed from: a */
    private final C7063i f7614a;

    /* renamed from: b */
    private final C2804a f7615b;

    /* renamed from: c */
    private final InterfaceC2806c f7616c;

    /* renamed from: d */
    private final Map<EnumC7059e, Object> f7617d;

    /* renamed from: e */
    private final Object f7618e = new Object();

    /* renamed from: f */
    private volatile InterfaceC2801d f7619f;

    /* renamed from: g */
    private volatile C2802e f7620g;

    /* renamed from: h */
    private volatile EnumC2805b f7621h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.budiyev.android.codescanner.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C2804a extends Thread {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2804a() {
            super("cs-decoder");
            C2803f.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0035 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0005 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                r0 = 10
                android.os.Process.setThreadPriority(r0)
            L5:
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C2803f.this
                com.budiyev.android.codescanner.f$b r1 = com.budiyev.android.codescanner.C2803f.EnumC2805b.IDLE
                com.budiyev.android.codescanner.C2803f.m32212a(r0, r1)
            Lc:
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C2803f.this     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                java.lang.Object r0 = com.budiyev.android.codescanner.C2803f.m32211b(r0)     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                monitor-enter(r0)     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C2803f.this     // Catch: java.lang.Throwable -> L64
                com.budiyev.android.codescanner.e r1 = com.budiyev.android.codescanner.C2803f.m32210c(r1)     // Catch: java.lang.Throwable -> L64
                if (r1 == 0) goto L50
                com.budiyev.android.codescanner.f r2 = com.budiyev.android.codescanner.C2803f.this     // Catch: java.lang.Throwable -> L64
                r3 = 0
                com.budiyev.android.codescanner.C2803f.m32209d(r2, r3)     // Catch: java.lang.Throwable -> L64
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C2803f.this     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                com.budiyev.android.codescanner.f$b r2 = com.budiyev.android.codescanner.C2803f.EnumC2805b.DECODING     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                com.budiyev.android.codescanner.C2803f.m32212a(r0, r2)     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                com.budiyev.android.codescanner.f r0 = com.budiyev.android.codescanner.C2803f.this     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                hc.i r0 = com.budiyev.android.codescanner.C2803f.m32208e(r0)     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                com.google.zxing.Result r0 = r1.m32213a(r0)     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
                if (r0 == 0) goto L5
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C2803f.this
                com.budiyev.android.codescanner.C2803f.m32209d(r1, r3)
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C2803f.this
                com.budiyev.android.codescanner.f$b r2 = com.budiyev.android.codescanner.C2803f.EnumC2805b.DECODED
                boolean r1 = com.budiyev.android.codescanner.C2803f.m32212a(r1, r2)
                if (r1 == 0) goto L5
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C2803f.this
                com.budiyev.android.codescanner.d r1 = com.budiyev.android.codescanner.C2803f.m32207f(r1)
                if (r1 == 0) goto L5
                r1.onDecoded(r0)
                goto L5
            L50:
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C2803f.this     // Catch: java.lang.InterruptedException -> L5b java.lang.Throwable -> L64
                java.lang.Object r1 = com.budiyev.android.codescanner.C2803f.m32211b(r1)     // Catch: java.lang.InterruptedException -> L5b java.lang.Throwable -> L64
                r1.wait()     // Catch: java.lang.InterruptedException -> L5b java.lang.Throwable -> L64
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
                goto Lc
            L5b:
                com.budiyev.android.codescanner.f r1 = com.budiyev.android.codescanner.C2803f.this     // Catch: java.lang.Throwable -> L64
                com.budiyev.android.codescanner.f$b r2 = com.budiyev.android.codescanner.C2803f.EnumC2805b.STOPPED     // Catch: java.lang.Throwable -> L64
                com.budiyev.android.codescanner.C2803f.m32212a(r1, r2)     // Catch: java.lang.Throwable -> L64
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
                return
            L64:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
                throw r1     // Catch: p136hc.AbstractC7067m -> L5 java.lang.Throwable -> L67
            L67:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.budiyev.android.codescanner.C2803f.C2804a.run():void");
        }
    }

    /* renamed from: com.budiyev.android.codescanner.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC2805b {
        INITIALIZED,
        IDLE,
        DECODING,
        DECODED,
        STOPPED
    }

    /* renamed from: com.budiyev.android.codescanner.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC2806c {
        /* renamed from: a */
        boolean mo32199a(EnumC2805b enumC2805b);
    }

    public C2803f(InterfaceC2806c interfaceC2806c, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<EnumC7055a> list, InterfaceC2801d interfaceC2801d) {
        C7063i c7063i = new C7063i();
        this.f7614a = c7063i;
        C2804a c2804a = new C2804a();
        this.f7615b = c2804a;
        c2804a.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        EnumMap enumMap = new EnumMap(EnumC7059e.class);
        this.f7617d = enumMap;
        enumMap.put((EnumMap) EnumC7059e.POSSIBLE_FORMATS, (EnumC7059e) list);
        c7063i.m21462d(enumMap);
        this.f7619f = interfaceC2801d;
        this.f7616c = interfaceC2806c;
        this.f7621h = EnumC2805b.INITIALIZED;
    }

    /* renamed from: k */
    public boolean m32202k(EnumC2805b enumC2805b) {
        this.f7621h = enumC2805b;
        return this.f7616c.mo32199a(enumC2805b);
    }

    /* renamed from: g */
    public void m32206g(C2802e c2802e) {
        synchronized (this.f7618e) {
            if (this.f7621h != EnumC2805b.STOPPED) {
                this.f7620g = c2802e;
                this.f7618e.notify();
            }
        }
    }

    /* renamed from: h */
    public EnumC2805b m32205h() {
        return this.f7621h;
    }

    /* renamed from: i */
    public void m32204i(InterfaceC2801d interfaceC2801d) {
        this.f7619f = interfaceC2801d;
    }

    /* renamed from: j */
    public void m32203j(List<EnumC7055a> list) {
        this.f7617d.put(EnumC7059e.POSSIBLE_FORMATS, list);
        this.f7614a.m21462d(this.f7617d);
    }

    /* renamed from: l */
    public void m32201l() {
        this.f7615b.interrupt();
        this.f7620g = null;
    }

    /* renamed from: m */
    public void m32200m() {
        if (this.f7621h == EnumC2805b.INITIALIZED) {
            this.f7615b.start();
            return;
        }
        throw new IllegalStateException("Illegal decoder state");
    }
}