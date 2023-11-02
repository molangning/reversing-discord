package io.sentry;

import io.sentry.hints.InterfaceC7951i;
import io.sentry.hints.InterfaceC7953k;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: io.sentry.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8258w extends AbstractC8047p implements InterfaceC8007l0 {

    /* renamed from: c */
    private final InterfaceC8025n0 f22210c;

    /* renamed from: d */
    private final InterfaceC8243v0 f22211d;

    /* renamed from: e */
    private final InterfaceC8040o0 f22212e;

    public C8258w(InterfaceC8025n0 interfaceC8025n0, InterfaceC8243v0 interfaceC8243v0, InterfaceC8040o0 interfaceC8040o0, long j) {
        super(interfaceC8040o0, j);
        this.f22210c = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required.");
        this.f22211d = (InterfaceC8243v0) C8229o.m18169c(interfaceC8243v0, "Serializer is required.");
        this.f22212e = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m18056j(InterfaceC7951i interfaceC7951i) {
        if (!interfaceC7951i.mo18899e()) {
            this.f22212e.mo18135c(EnumC8021m4.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m18055k(Throwable th2, File file, InterfaceC7953k interfaceC7953k) {
        interfaceC7953k.mo18901c(false);
        this.f22212e.mo18137a(EnumC8021m4.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m18054l(File file, InterfaceC7953k interfaceC7953k) {
        if (!interfaceC7953k.mo18903a()) {
            m18053m(file, "after trying to capture it");
            this.f22212e.mo18135c(EnumC8021m4.DEBUG, "Deleted file %s.", file.getAbsolutePath());
            return;
        }
        this.f22212e.mo18135c(EnumC8021m4.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
    }

    /* renamed from: m */
    private void m18053m(File file, String str) {
        try {
            if (!file.delete()) {
                this.f22212e.mo18135c(EnumC8021m4.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
            }
        } catch (Throwable th2) {
            this.f22212e.mo18137a(EnumC8021m4.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.InterfaceC8007l0
    /* renamed from: a */
    public void mo18063a(String str, C7831b0 c7831b0) {
        C8229o.m18169c(str, "Path is required.");
        mo18060f(new File(str), c7831b0);
    }

    @Override // io.sentry.AbstractC8047p
    /* renamed from: c */
    protected boolean mo18062c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC8047p
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo18061e(File file) {
        super.mo18061e(file);
    }

    @Override // io.sentry.AbstractC8047p
    /* renamed from: f */
    protected void mo18060f(final File file, C7831b0 c7831b0) {
        InterfaceC8040o0 interfaceC8040o0;
        C8220j.InterfaceC8221a interfaceC8221a;
        if (!file.isFile()) {
            this.f22212e.mo18135c(EnumC8021m4.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
        } else if (!mo18062c(file.getName())) {
            this.f22212e.mo18135c(EnumC8021m4.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
        } else {
            try {
                if (!file.getParentFile().canWrite()) {
                    this.f22212e.mo18135c(EnumC8021m4.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                    return;
                }
                try {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            C8020m3 mo17981d = this.f22211d.mo17981d(bufferedInputStream);
                            if (mo17981d == null) {
                                this.f22212e.mo18135c(EnumC8021m4.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                            } else {
                                this.f22210c.mo18268d(mo17981d, c7831b0);
                            }
                            C8220j.m18213q(c7831b0, InterfaceC7951i.class, this.f22212e, new C8220j.InterfaceC8221a() { // from class: io.sentry.t
                                @Override // io.sentry.util.C8220j.InterfaceC8221a
                                public final void accept(Object obj) {
                                    C8258w.this.m18056j((InterfaceC7951i) obj);
                                }
                            });
                            bufferedInputStream.close();
                            interfaceC8040o0 = this.f22212e;
                            interfaceC8221a = new C8220j.InterfaceC8221a() { // from class: io.sentry.u
                                @Override // io.sentry.util.C8220j.InterfaceC8221a
                                public final void accept(Object obj) {
                                    C8258w.this.m18054l(file, (InterfaceC7953k) obj);
                                }
                            };
                        } catch (Throwable th2) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException e) {
                        this.f22212e.mo18137a(EnumC8021m4.ERROR, e, "File '%s' cannot be found.", file.getAbsolutePath());
                        interfaceC8040o0 = this.f22212e;
                        interfaceC8221a = new C8220j.InterfaceC8221a() { // from class: io.sentry.u
                            @Override // io.sentry.util.C8220j.InterfaceC8221a
                            public final void accept(Object obj) {
                                C8258w.this.m18054l(file, (InterfaceC7953k) obj);
                            }
                        };
                    }
                } catch (IOException e2) {
                    this.f22212e.mo18137a(EnumC8021m4.ERROR, e2, "I/O on file '%s' failed.", file.getAbsolutePath());
                    interfaceC8040o0 = this.f22212e;
                    interfaceC8221a = new C8220j.InterfaceC8221a() { // from class: io.sentry.u
                        @Override // io.sentry.util.C8220j.InterfaceC8221a
                        public final void accept(Object obj) {
                            C8258w.this.m18054l(file, (InterfaceC7953k) obj);
                        }
                    };
                }
                C8220j.m18213q(c7831b0, InterfaceC7953k.class, interfaceC8040o0, interfaceC8221a);
            }
        }
    }
}
