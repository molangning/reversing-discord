package androidx.core.p018os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1056f {

    /* renamed from: a */
    private boolean f3395a;

    /* renamed from: b */
    private InterfaceC1058b f3396b;

    /* renamed from: c */
    private Object f3397c;

    /* renamed from: d */
    private boolean f3398d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1057a {
        /* renamed from: a */
        static void m37973a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m37972b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1058b {
        void onCancel();
    }

    /* renamed from: d */
    private void m37974d() {
        while (this.f3398d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m37977a() {
        synchronized (this) {
            if (this.f3395a) {
                return;
            }
            this.f3395a = true;
            this.f3398d = true;
            InterfaceC1058b interfaceC1058b = this.f3396b;
            Object obj = this.f3397c;
            if (interfaceC1058b != null) {
                try {
                    interfaceC1058b.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f3398d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null) {
                C1057a.m37973a(obj);
            }
            synchronized (this) {
                this.f3398d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m37976b() {
        boolean z;
        synchronized (this) {
            z = this.f3395a;
        }
        return z;
    }

    /* renamed from: c */
    public void m37975c(InterfaceC1058b interfaceC1058b) {
        synchronized (this) {
            m37974d();
            if (this.f3396b == interfaceC1058b) {
                return;
            }
            this.f3396b = interfaceC1058b;
            if (this.f3395a && interfaceC1058b != null) {
                interfaceC1058b.onCancel();
            }
        }
    }
}