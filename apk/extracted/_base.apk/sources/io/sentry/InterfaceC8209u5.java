package io.sentry;

import java.lang.Thread;

/* renamed from: io.sentry.u5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
interface InterfaceC8209u5 {

    /* renamed from: io.sentry.u5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8210a implements InterfaceC8209u5 {

        /* renamed from: a */
        private static final C8210a f22141a = new C8210a();

        private C8210a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static InterfaceC8209u5 m18241c() {
            return f22141a;
        }

        @Override // io.sentry.InterfaceC8209u5
        /* renamed from: a */
        public void mo18243a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.InterfaceC8209u5
        /* renamed from: b */
        public Thread.UncaughtExceptionHandler mo18242b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    /* renamed from: a */
    void mo18243a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    /* renamed from: b */
    Thread.UncaughtExceptionHandler mo18242b();
}
