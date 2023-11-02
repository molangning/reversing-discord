package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.C7831b0;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8007l0;
import io.sentry.InterfaceC8040o0;
import io.sentry.hints.InterfaceC7945c;
import io.sentry.hints.InterfaceC7948f;
import io.sentry.hints.InterfaceC7951i;
import io.sentry.hints.InterfaceC7952j;
import io.sentry.hints.InterfaceC7953k;
import io.sentry.hints.InterfaceC7958p;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class FileObserverC7818w0 extends FileObserver {

    /* renamed from: a */
    private final String f21376a;

    /* renamed from: b */
    private final InterfaceC8007l0 f21377b;

    /* renamed from: c */
    private final InterfaceC8040o0 f21378c;

    /* renamed from: d */
    private final long f21379d;

    /* renamed from: io.sentry.android.core.w0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C7819a implements InterfaceC7948f, InterfaceC7953k, InterfaceC7958p, InterfaceC7951i, InterfaceC7945c, InterfaceC7952j {

        /* renamed from: a */
        boolean f21380a;

        /* renamed from: b */
        boolean f21381b;

        /* renamed from: c */
        private CountDownLatch f21382c;

        /* renamed from: d */
        private final long f21383d;

        /* renamed from: e */
        private final InterfaceC8040o0 f21384e;

        public C7819a(long j, InterfaceC8040o0 interfaceC8040o0) {
            reset();
            this.f21383d = j;
            this.f21384e = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "ILogger is required.");
        }

        @Override // io.sentry.hints.InterfaceC7953k
        /* renamed from: a */
        public boolean mo18903a() {
            return this.f21380a;
        }

        @Override // io.sentry.hints.InterfaceC7958p
        /* renamed from: b */
        public void mo18902b(boolean z) {
            this.f21381b = z;
            this.f21382c.countDown();
        }

        @Override // io.sentry.hints.InterfaceC7953k
        /* renamed from: c */
        public void mo18901c(boolean z) {
            this.f21380a = z;
        }

        @Override // io.sentry.hints.InterfaceC7958p
        /* renamed from: d */
        public boolean mo18900d() {
            return this.f21381b;
        }

        @Override // io.sentry.hints.InterfaceC7951i
        /* renamed from: e */
        public boolean mo18899e() {
            try {
                return this.f21382c.await(this.f21383d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.f21384e.mo18136b(EnumC8021m4.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }

        @Override // io.sentry.hints.InterfaceC7952j
        public void reset() {
            this.f21382c = new CountDownLatch(1);
            this.f21380a = false;
            this.f21381b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileObserverC7818w0(String str, InterfaceC8007l0 interfaceC8007l0, InterfaceC8040o0 interfaceC8040o0, long j) {
        super(str);
        this.f21376a = str;
        this.f21377b = (InterfaceC8007l0) C8229o.m18169c(interfaceC8007l0, "Envelope sender is required.");
        this.f21378c = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "Logger is required.");
        this.f21379d = j;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (str != null && i == 8) {
            this.f21378c.mo18135c(EnumC8021m4.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i), this.f21376a, str);
            C7831b0 m18225e = C8220j.m18225e(new C7819a(this.f21379d, this.f21378c));
            InterfaceC8007l0 interfaceC8007l0 = this.f21377b;
            interfaceC8007l0.mo18063a(this.f21376a + File.separator + str, m18225e);
        }
    }
}
