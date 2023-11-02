package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C4957b {

    /* renamed from: e */
    private static C4957b f13917e;

    /* renamed from: a */
    private final Object f13918a = new Object();

    /* renamed from: b */
    private final Handler f13919b = new Handler(Looper.getMainLooper(), new C4958a());

    /* renamed from: c */
    private C4960c f13920c;

    /* renamed from: d */
    private C4960c f13921d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4958a implements Handler.Callback {
        C4958a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C4957b.this.m26777d((C4960c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4959b {
        /* renamed from: a */
        void m26767a(int i);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4960c {

        /* renamed from: a */
        final WeakReference<InterfaceC4959b> f13923a;

        /* renamed from: b */
        int f13924b;

        /* renamed from: c */
        boolean f13925c;

        /* renamed from: a */
        boolean m26766a(InterfaceC4959b interfaceC4959b) {
            return interfaceC4959b != null && this.f13923a.get() == interfaceC4959b;
        }
    }

    private C4957b() {
    }

    /* renamed from: a */
    private boolean m26780a(C4960c c4960c, int i) {
        InterfaceC4959b interfaceC4959b = c4960c.f13923a.get();
        if (interfaceC4959b != null) {
            this.f13919b.removeCallbacksAndMessages(c4960c);
            interfaceC4959b.m26767a(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C4957b m26778c() {
        if (f13917e == null) {
            f13917e = new C4957b();
        }
        return f13917e;
    }

    /* renamed from: f */
    private boolean m26775f(InterfaceC4959b interfaceC4959b) {
        C4960c c4960c = this.f13920c;
        return c4960c != null && c4960c.m26766a(interfaceC4959b);
    }

    /* renamed from: g */
    private boolean m26774g(InterfaceC4959b interfaceC4959b) {
        C4960c c4960c = this.f13921d;
        return c4960c != null && c4960c.m26766a(interfaceC4959b);
    }

    /* renamed from: l */
    private void m26769l(C4960c c4960c) {
        int i = c4960c.f13924b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = 1500;
            } else {
                i = 2750;
            }
        }
        this.f13919b.removeCallbacksAndMessages(c4960c);
        Handler handler = this.f13919b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c4960c), i);
    }

    /* renamed from: m */
    private void m26768m() {
        C4960c c4960c = this.f13921d;
        if (c4960c != null) {
            this.f13920c = c4960c;
            this.f13921d = null;
            InterfaceC4959b interfaceC4959b = c4960c.f13923a.get();
            if (interfaceC4959b != null) {
                interfaceC4959b.show();
            } else {
                this.f13920c = null;
            }
        }
    }

    /* renamed from: b */
    public void m26779b(InterfaceC4959b interfaceC4959b, int i) {
        synchronized (this.f13918a) {
            if (m26775f(interfaceC4959b)) {
                m26780a(this.f13920c, i);
            } else if (m26774g(interfaceC4959b)) {
                m26780a(this.f13921d, i);
            }
        }
    }

    /* renamed from: d */
    void m26777d(C4960c c4960c) {
        synchronized (this.f13918a) {
            if (this.f13920c == c4960c || this.f13921d == c4960c) {
                m26780a(c4960c, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m26776e(InterfaceC4959b interfaceC4959b) {
        boolean z;
        synchronized (this.f13918a) {
            if (!m26775f(interfaceC4959b) && !m26774g(interfaceC4959b)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public void m26773h(InterfaceC4959b interfaceC4959b) {
        synchronized (this.f13918a) {
            if (m26775f(interfaceC4959b)) {
                this.f13920c = null;
                if (this.f13921d != null) {
                    m26768m();
                }
            }
        }
    }

    /* renamed from: i */
    public void m26772i(InterfaceC4959b interfaceC4959b) {
        synchronized (this.f13918a) {
            if (m26775f(interfaceC4959b)) {
                m26769l(this.f13920c);
            }
        }
    }

    /* renamed from: j */
    public void m26771j(InterfaceC4959b interfaceC4959b) {
        synchronized (this.f13918a) {
            if (m26775f(interfaceC4959b)) {
                C4960c c4960c = this.f13920c;
                if (!c4960c.f13925c) {
                    c4960c.f13925c = true;
                    this.f13919b.removeCallbacksAndMessages(c4960c);
                }
            }
        }
    }

    /* renamed from: k */
    public void m26770k(InterfaceC4959b interfaceC4959b) {
        synchronized (this.f13918a) {
            if (m26775f(interfaceC4959b)) {
                C4960c c4960c = this.f13920c;
                if (c4960c.f13925c) {
                    c4960c.f13925c = false;
                    m26769l(c4960c);
                }
            }
        }
    }
}
