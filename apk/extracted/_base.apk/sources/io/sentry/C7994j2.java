package io.sentry;

import io.sentry.hints.InterfaceC7951i;
import io.sentry.hints.InterfaceC7952j;
import io.sentry.hints.InterfaceC7953k;
import io.sentry.hints.InterfaceC7958p;
import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8212b;
import io.sentry.util.C8220j;
import io.sentry.util.C8227m;
import io.sentry.util.C8229o;
import io.sentry.util.C8232r;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: io.sentry.j2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7994j2 extends AbstractC8047p implements InterfaceC8007l0 {

    /* renamed from: g */
    private static final Charset f21667g = Charset.forName("UTF-8");

    /* renamed from: c */
    private final InterfaceC8025n0 f21668c;

    /* renamed from: d */
    private final InterfaceC8000k0 f21669d;

    /* renamed from: e */
    private final InterfaceC8243v0 f21670e;

    /* renamed from: f */
    private final InterfaceC8040o0 f21671f;

    public C7994j2(InterfaceC8025n0 interfaceC8025n0, InterfaceC8000k0 interfaceC8000k0, InterfaceC8243v0 interfaceC8243v0, InterfaceC8040o0 interfaceC8040o0, long j) {
        super(interfaceC8040o0, j);
        this.f21668c = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required.");
        this.f21669d = (InterfaceC8000k0) C8229o.m18169c(interfaceC8000k0, "Envelope reader is required.");
        this.f21670e = (InterfaceC8243v0) C8229o.m18169c(interfaceC8243v0, "Serializer is required.");
        this.f21671f = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "Logger is required.");
    }

    /* renamed from: i */
    private C8054p5 m19056i(C8034n5 c8034n5) {
        String m18928a;
        if (c8034n5 != null && (m18928a = c8034n5.m18928a()) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(m18928a));
                if (!C8232r.m18160e(valueOf, false)) {
                    this.f21671f.mo18135c(EnumC8021m4.ERROR, "Invalid sample rate parsed from TraceContext: %s", m18928a);
                } else {
                    return new C8054p5(Boolean.TRUE, valueOf);
                }
            } catch (Exception unused) {
                this.f21671f.mo18135c(EnumC8021m4.ERROR, "Unable to parse sample rate from TraceContext: %s", m18928a);
            }
        }
        return new C8054p5(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m19054k(File file, InterfaceC7953k interfaceC7953k) {
        if (!interfaceC7953k.mo18903a()) {
            try {
                if (!file.delete()) {
                    this.f21671f.mo18135c(EnumC8021m4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                }
            } catch (RuntimeException e) {
                this.f21671f.mo18137a(EnumC8021m4.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
    }

    /* renamed from: l */
    private void m19053l(C7898d4 c7898d4, int i) {
        this.f21671f.mo18135c(EnumC8021m4.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), c7898d4.m19359y().m19309b());
    }

    /* renamed from: m */
    private void m19052m(int i) {
        this.f21671f.mo18135c(EnumC8021m4.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
    }

    /* renamed from: n */
    private void m19051n(C8100q c8100q) {
        this.f21671f.mo18135c(EnumC8021m4.WARNING, "Timed out waiting for event id submission: %s", c8100q);
    }

    /* renamed from: o */
    private void m19050o(C8020m3 c8020m3, C8100q c8100q, int i) {
        this.f21671f.mo18135c(EnumC8021m4.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), c8020m3.m18987b().m18948a(), c8100q);
    }

    /* renamed from: p */
    private void m19049p(C8020m3 c8020m3, C7831b0 c7831b0) {
        Object m18223g;
        this.f21671f.mo18135c(EnumC8021m4.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(C8212b.m18236d(c8020m3.m18986c())));
        int i = 0;
        for (C7898d4 c7898d4 : c8020m3.m18986c()) {
            i++;
            if (c7898d4.m19359y() == null) {
                this.f21671f.mo18135c(EnumC8021m4.ERROR, "Item %d has no header", Integer.valueOf(i));
            } else if (EnumC8011l4.Event.equals(c7898d4.m19359y().m19309b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c7898d4.m19361w()), f21667g));
                    C7923f4 c7923f4 = (C7923f4) this.f21670e.mo17982c(bufferedReader, C7923f4.class);
                    if (c7923f4 == null) {
                        m19053l(c7898d4, i);
                    } else {
                        if (c7923f4.m19261L() != null) {
                            C8220j.m18211s(c7831b0, c7923f4.m19261L().m18603g());
                        }
                        if (c8020m3.m18987b().m18948a() != null && !c8020m3.m18987b().m18948a().equals(c7923f4.m19266G())) {
                            m19050o(c8020m3, c7923f4.m19266G(), i);
                            bufferedReader.close();
                        } else {
                            this.f21668c.mo18257o(c7923f4, c7831b0);
                            m19052m(i);
                            if (!m19048q(c7831b0)) {
                                m19051n(c7923f4.m19266G());
                                bufferedReader.close();
                                return;
                            }
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    this.f21671f.mo18136b(EnumC8021m4.ERROR, "Item failed to process.", th2);
                }
                m18223g = C8220j.m18223g(c7831b0);
                if (!(m18223g instanceof InterfaceC7958p) && !((InterfaceC7958p) m18223g).mo18900d()) {
                    this.f21671f.mo18135c(EnumC8021m4.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i));
                    return;
                }
                C8220j.m18215o(c7831b0, InterfaceC7952j.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.i2
                    @Override // io.sentry.util.C8220j.InterfaceC8221a
                    public final void accept(Object obj) {
                        ((InterfaceC7952j) obj).reset();
                    }
                });
            } else {
                if (EnumC8011l4.Transaction.equals(c7898d4.m19359y().m19309b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c7898d4.m19361w()), f21667g));
                        C8114x c8114x = (C8114x) this.f21670e.mo17982c(bufferedReader2, C8114x.class);
                        if (c8114x == null) {
                            m19053l(c7898d4, i);
                        } else if (c8020m3.m18987b().m18948a() != null && !c8020m3.m18987b().m18948a().equals(c8114x.m19266G())) {
                            m19050o(c8020m3, c8114x.m19266G(), i);
                            bufferedReader2.close();
                        } else {
                            C8034n5 m18946c = c8020m3.m18987b().m18946c();
                            if (c8114x.m19270C().m18798f() != null) {
                                c8114x.m19270C().m18798f().m19292n(m19056i(m18946c));
                            }
                            this.f21668c.mo18267e(c8114x, m18946c, c7831b0);
                            m19052m(i);
                            if (!m19048q(c7831b0)) {
                                m19051n(c8114x.m19266G());
                                bufferedReader2.close();
                                return;
                            }
                        }
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        this.f21671f.mo18136b(EnumC8021m4.ERROR, "Item failed to process.", th3);
                    }
                } else {
                    this.f21668c.mo18268d(new C8020m3(c8020m3.m18987b().m18948a(), c8020m3.m18987b().m18947b(), c7898d4), c7831b0);
                    this.f21671f.mo18135c(EnumC8021m4.DEBUG, "%s item %d is being captured.", c7898d4.m19359y().m19309b().getItemType(), Integer.valueOf(i));
                    if (!m19048q(c7831b0)) {
                        this.f21671f.mo18135c(EnumC8021m4.WARNING, "Timed out waiting for item type submission: %s", c7898d4.m19359y().m19309b().getItemType());
                        return;
                    }
                }
                m18223g = C8220j.m18223g(c7831b0);
                if (!(m18223g instanceof InterfaceC7958p)) {
                }
                C8220j.m18215o(c7831b0, InterfaceC7952j.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.i2
                    @Override // io.sentry.util.C8220j.InterfaceC8221a
                    public final void accept(Object obj) {
                        ((InterfaceC7952j) obj).reset();
                    }
                });
            }
        }
    }

    /* renamed from: q */
    private boolean m19048q(C7831b0 c7831b0) {
        Object m18223g = C8220j.m18223g(c7831b0);
        if (m18223g instanceof InterfaceC7951i) {
            return ((InterfaceC7951i) m18223g).mo18899e();
        }
        C8227m.m18202a(InterfaceC7951i.class, m18223g, this.f21671f);
        return true;
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
        if (str != null && !str.startsWith("session") && !str.startsWith("previous_session") && !str.startsWith("startup_crash")) {
            return true;
        }
        return false;
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
        C8229o.m18169c(file, "File is required.");
        try {
            if (!mo18062c(file.getName())) {
                this.f21671f.mo18135c(EnumC8021m4.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C8020m3 mo18354a = this.f21669d.mo18354a(bufferedInputStream);
                    if (mo18354a == null) {
                        this.f21671f.mo18135c(EnumC8021m4.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m19049p(mo18354a, c7831b0);
                        this.f21671f.mo18135c(EnumC8021m4.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    interfaceC8040o0 = this.f21671f;
                    interfaceC8221a = new C8220j.InterfaceC8221a() { // from class: io.sentry.h2
                        @Override // io.sentry.util.C8220j.InterfaceC8221a
                        public final void accept(Object obj) {
                            C7994j2.this.m19054k(file, (InterfaceC7953k) obj);
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
            } catch (IOException e) {
                this.f21671f.mo18136b(EnumC8021m4.ERROR, "Error processing envelope.", e);
                interfaceC8040o0 = this.f21671f;
                interfaceC8221a = new C8220j.InterfaceC8221a() { // from class: io.sentry.h2
                    @Override // io.sentry.util.C8220j.InterfaceC8221a
                    public final void accept(Object obj) {
                        C7994j2.this.m19054k(file, (InterfaceC7953k) obj);
                    }
                };
            }
            C8220j.m18213q(c7831b0, InterfaceC7953k.class, interfaceC8040o0, interfaceC8221a);
        } catch (Throwable th4) {
            C8220j.m18213q(c7831b0, InterfaceC7953k.class, this.f21671f, new C8220j.InterfaceC8221a() { // from class: io.sentry.h2
                @Override // io.sentry.util.C8220j.InterfaceC8221a
                public final void accept(Object obj) {
                    C7994j2.this.m19054k(file, (InterfaceC7953k) obj);
                }
            });
            throw th4;
        }
    }
}
