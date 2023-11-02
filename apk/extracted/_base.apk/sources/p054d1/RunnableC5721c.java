package p054d1;

import p021b1.C2055l;

/* renamed from: d1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class RunnableC5721c implements Runnable {

    /* renamed from: j */
    private Runnable f16481j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5721c(Runnable runnable) {
        this.f16481j = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16481j.run();
        } catch (Throwable th2) {
            C2055l.m34422j().mo34444b("Runnable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
        }
    }
}
