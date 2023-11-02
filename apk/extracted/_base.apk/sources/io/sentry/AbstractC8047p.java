package io.sentry;

import io.sentry.hints.InterfaceC7948f;
import io.sentry.hints.InterfaceC7951i;
import io.sentry.hints.InterfaceC7953k;
import io.sentry.hints.InterfaceC7958p;
import io.sentry.util.C8220j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC8047p {

    /* renamed from: a */
    private final InterfaceC8040o0 f21781a;

    /* renamed from: b */
    private final long f21782b;

    /* renamed from: io.sentry.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C8048a implements InterfaceC7948f, InterfaceC7953k, InterfaceC7958p, InterfaceC7951i {

        /* renamed from: a */
        boolean f21783a = false;

        /* renamed from: b */
        boolean f21784b = false;

        /* renamed from: c */
        private final CountDownLatch f21785c = new CountDownLatch(1);

        /* renamed from: d */
        private final long f21786d;

        /* renamed from: e */
        private final InterfaceC8040o0 f21787e;

        public C8048a(long j, InterfaceC8040o0 interfaceC8040o0) {
            this.f21786d = j;
            this.f21787e = interfaceC8040o0;
        }

        @Override // io.sentry.hints.InterfaceC7953k
        /* renamed from: a */
        public boolean mo18903a() {
            return this.f21783a;
        }

        @Override // io.sentry.hints.InterfaceC7958p
        /* renamed from: b */
        public void mo18902b(boolean z) {
            this.f21784b = z;
            this.f21785c.countDown();
        }

        @Override // io.sentry.hints.InterfaceC7953k
        /* renamed from: c */
        public void mo18901c(boolean z) {
            this.f21783a = z;
        }

        @Override // io.sentry.hints.InterfaceC7958p
        /* renamed from: d */
        public boolean mo18900d() {
            return this.f21784b;
        }

        @Override // io.sentry.hints.InterfaceC7951i
        /* renamed from: e */
        public boolean mo18899e() {
            try {
                return this.f21785c.await(this.f21786d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.f21787e.mo18136b(EnumC8021m4.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8047p(InterfaceC8040o0 interfaceC8040o0, long j) {
        this.f21781a = interfaceC8040o0;
        this.f21782b = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m18904d(File file, String str) {
        return mo18062c(str);
    }

    /* renamed from: c */
    protected abstract boolean mo18062c(String str);

    /* renamed from: e */
    public void mo18061e(File file) {
        int i;
        try {
            InterfaceC8040o0 interfaceC8040o0 = this.f21781a;
            EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
            interfaceC8040o0.mo18135c(enumC8021m4, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f21781a.mo18135c(EnumC8021m4.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (!file.isDirectory()) {
                this.f21781a.mo18135c(EnumC8021m4.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    this.f21781a.mo18135c(EnumC8021m4.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                    return;
                }
                File[] listFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.o
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str) {
                        boolean m18904d;
                        m18904d = AbstractC8047p.this.m18904d(file2, str);
                        return m18904d;
                    }
                });
                InterfaceC8040o0 interfaceC8040o02 = this.f21781a;
                Object[] objArr = new Object[2];
                if (listFiles2 != null) {
                    i = listFiles2.length;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = file.getAbsolutePath();
                interfaceC8040o02.mo18135c(enumC8021m4, "Processing %d items from cache dir %s", objArr);
                for (File file2 : listFiles) {
                    if (!file2.isFile()) {
                        this.f21781a.mo18135c(EnumC8021m4.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    } else {
                        this.f21781a.mo18135c(EnumC8021m4.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                        mo18060f(file2, C8220j.m18225e(new C8048a(this.f21782b, this.f21781a)));
                    }
                }
            }
        } catch (Throwable th2) {
            this.f21781a.mo18137a(EnumC8021m4.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    /* renamed from: f */
    protected abstract void mo18060f(File file, C7831b0 c7831b0);
}
