package io.sentry;

import io.sentry.C7898d4;
import io.sentry.clientreport.C7871b;
import io.sentry.exception.C7914b;
import io.sentry.util.C8224k;
import io.sentry.util.C8229o;
import io.sentry.vendor.C8250a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.d4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7898d4 {

    /* renamed from: d */
    private static final Charset f21513d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C7909e4 f21514a;

    /* renamed from: b */
    private final Callable<byte[]> f21515b;

    /* renamed from: c */
    private byte[] f21516c;

    /* renamed from: io.sentry.d4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7899a {

        /* renamed from: a */
        private byte[] f21517a;

        /* renamed from: b */
        private final Callable<byte[]> f21518b;

        public C7899a(Callable<byte[]> callable) {
            this.f21518b = callable;
        }

        /* renamed from: b */
        private static byte[] m19356b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        /* renamed from: a */
        public byte[] m19357a() {
            Callable<byte[]> callable;
            if (this.f21517a == null && (callable = this.f21518b) != null) {
                this.f21517a = callable.call();
            }
            return m19356b(this.f21517a);
        }
    }

    public C7898d4(C7909e4 c7909e4, byte[] bArr) {
        this.f21514a = (C7909e4) C8229o.m18169c(c7909e4, "SentryEnvelopeItemHeader is required.");
        this.f21516c = bArr;
        this.f21515b = null;
    }

    /* renamed from: B */
    public static /* synthetic */ byte[] m19397B(C7830b c7830b, long j, InterfaceC8243v0 interfaceC8243v0, InterfaceC8040o0 interfaceC8040o0) {
        if (c7830b.m19607e() != null) {
            byte[] m19607e = c7830b.m19607e();
            m19368p(m19607e.length, j, c7830b.m19605g());
            return m19607e;
        }
        if (c7830b.m19603i() != null) {
            byte[] m18206b = C8224k.m18206b(interfaceC8243v0, interfaceC8040o0, c7830b.m19603i());
            if (m18206b != null) {
                m19368p(m18206b.length, j, c7830b.m19605g());
                return m18206b;
            }
        } else if (c7830b.m19604h() != null) {
            return m19384O(c7830b.m19604h(), j);
        }
        throw new C7914b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable or a path is set.", c7830b.m19605g()));
    }

    /* renamed from: C */
    public static /* synthetic */ byte[] m19396C(InterfaceC8243v0 interfaceC8243v0, C7871b c7871b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f21513d));
            interfaceC8243v0.mo17984a(c7871b, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ Integer m19395D(C7899a c7899a) {
        return Integer.valueOf(c7899a.m19357a().length);
    }

    /* renamed from: F */
    public static /* synthetic */ byte[] m19393F(InterfaceC8243v0 interfaceC8243v0, AbstractC7920f3 abstractC7920f3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f21513d));
            interfaceC8243v0.mo17984a(abstractC7920f3, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: G */
    public static /* synthetic */ Integer m19392G(C7899a c7899a) {
        return Integer.valueOf(c7899a.m19357a().length);
    }

    /* renamed from: I */
    public static /* synthetic */ byte[] m19390I(File file, long j, C8027n2 c8027n2, InterfaceC8243v0 interfaceC8243v0) {
        if (file.exists()) {
            String m18126c = C8250a.m18126c(m19384O(file.getPath(), j), 3);
            if (!m18126c.isEmpty()) {
                c8027n2.m18977G(m18126c);
                c8027n2.m18978F();
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f21513d));
                            interfaceC8243v0.mo17984a(c8027n2, bufferedWriter);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        } catch (Throwable th2) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IOException e) {
                        throw new C7914b(String.format("Failed to serialize profiling trace data\n%s", e.getMessage()));
                    }
                } finally {
                    file.delete();
                }
            }
            throw new C7914b("Profiling trace file is empty");
        }
        throw new C7914b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
    }

    /* renamed from: J */
    public static /* synthetic */ Integer m19389J(C7899a c7899a) {
        return Integer.valueOf(c7899a.m19357a().length);
    }

    /* renamed from: L */
    public static /* synthetic */ byte[] m19387L(InterfaceC8243v0 interfaceC8243v0, C7836b5 c7836b5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f21513d));
            interfaceC8243v0.mo17984a(c7836b5, bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: M */
    public static /* synthetic */ Integer m19386M(C7899a c7899a) {
        return Integer.valueOf(c7899a.m19357a().length);
    }

    /* renamed from: O */
    private static byte[] m19384O(String str, long j) {
        try {
            File file = new File(str);
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.length() <= j) {
                        FileInputStream fileInputStream = new FileInputStream(str);
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read != -1) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bufferedInputStream.close();
                                    fileInputStream.close();
                                    return byteArray;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } else {
                        throw new C7914b(String.format("Dropping item, because its size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
                    }
                } else {
                    throw new C7914b(String.format("Reading the item %s failed, because can't read the file.", str));
                }
            } else {
                throw new C7914b(String.format("Reading the item %s failed, because the file located at the path is not a file.", str));
            }
        } catch (IOException | SecurityException e) {
            throw new C7914b(String.format("Reading the item %s failed.\n%s", str, e.getMessage()));
        }
    }

    /* renamed from: p */
    private static void m19368p(long j, long j2, String str) {
        if (j <= j2) {
            return;
        }
        throw new C7914b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
    }

    /* renamed from: q */
    public static C7898d4 m19367q(final InterfaceC8243v0 interfaceC8243v0, final InterfaceC8040o0 interfaceC8040o0, final C7830b c7830b, final long j) {
        final C7899a c7899a = new C7899a(new Callable() { // from class: io.sentry.c4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19397B;
                m19397B = C7898d4.m19397B(C7830b.this, j, interfaceC8243v0, interfaceC8040o0);
                return m19397B;
            }
        });
        return new C7898d4(new C7909e4(EnumC8011l4.Attachment, new Callable() { // from class: io.sentry.p3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m19358z;
                m19358z = C7898d4.m19358z(C7898d4.C7899a.this);
                return m19358z;
            }
        }, c7830b.m19606f(), c7830b.m19605g(), c7830b.m19608d()), new Callable() { // from class: io.sentry.q3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19357a;
                m19357a = C7898d4.C7899a.this.m19357a();
                return m19357a;
            }
        });
    }

    /* renamed from: r */
    public static C7898d4 m19366r(final InterfaceC8243v0 interfaceC8243v0, final C7871b c7871b) {
        C8229o.m18169c(interfaceC8243v0, "ISerializer is required.");
        C8229o.m18169c(c7871b, "ClientReport is required.");
        final C7899a c7899a = new C7899a(new Callable() { // from class: io.sentry.w3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19396C;
                m19396C = C7898d4.m19396C(InterfaceC8243v0.this, c7871b);
                return m19396C;
            }
        });
        return new C7898d4(new C7909e4(EnumC8011l4.resolve(c7871b), new Callable() { // from class: io.sentry.x3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m19395D;
                m19395D = C7898d4.m19395D(C7898d4.C7899a.this);
                return m19395D;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.y3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19357a;
                m19357a = C7898d4.C7899a.this.m19357a();
                return m19357a;
            }
        });
    }

    /* renamed from: s */
    public static C7898d4 m19365s(final InterfaceC8243v0 interfaceC8243v0, final AbstractC7920f3 abstractC7920f3) {
        C8229o.m18169c(interfaceC8243v0, "ISerializer is required.");
        C8229o.m18169c(abstractC7920f3, "SentryEvent is required.");
        final C7899a c7899a = new C7899a(new Callable() { // from class: io.sentry.z3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19393F;
                m19393F = C7898d4.m19393F(InterfaceC8243v0.this, abstractC7920f3);
                return m19393F;
            }
        });
        return new C7898d4(new C7909e4(EnumC8011l4.resolve(abstractC7920f3), new Callable() { // from class: io.sentry.a4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m19392G;
                m19392G = C7898d4.m19392G(C7898d4.C7899a.this);
                return m19392G;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.b4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19357a;
                m19357a = C7898d4.C7899a.this.m19357a();
                return m19357a;
            }
        });
    }

    /* renamed from: t */
    public static C7898d4 m19364t(final C8027n2 c8027n2, final long j, final InterfaceC8243v0 interfaceC8243v0) {
        final File m18982B = c8027n2.m18982B();
        final C7899a c7899a = new C7899a(new Callable() { // from class: io.sentry.r3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19390I;
                m19390I = C7898d4.m19390I(m18982B, j, c8027n2, interfaceC8243v0);
                return m19390I;
            }
        });
        return new C7898d4(new C7909e4(EnumC8011l4.Profile, new Callable() { // from class: io.sentry.s3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m19389J;
                m19389J = C7898d4.m19389J(C7898d4.C7899a.this);
                return m19389J;
            }
        }, "application-json", m18982B.getName()), new Callable() { // from class: io.sentry.t3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19357a;
                m19357a = C7898d4.C7899a.this.m19357a();
                return m19357a;
            }
        });
    }

    /* renamed from: u */
    public static C7898d4 m19363u(final InterfaceC8243v0 interfaceC8243v0, final C7836b5 c7836b5) {
        C8229o.m18169c(interfaceC8243v0, "ISerializer is required.");
        C8229o.m18169c(c7836b5, "Session is required.");
        final C7899a c7899a = new C7899a(new Callable() { // from class: io.sentry.o3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19387L;
                m19387L = C7898d4.m19387L(InterfaceC8243v0.this, c7836b5);
                return m19387L;
            }
        });
        return new C7898d4(new C7909e4(EnumC8011l4.Session, new Callable() { // from class: io.sentry.u3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m19386M;
                m19386M = C7898d4.m19386M(C7898d4.C7899a.this);
                return m19386M;
            }
        }, "application/json", null), new Callable() { // from class: io.sentry.v3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] m19357a;
                m19357a = C7898d4.C7899a.this.m19357a();
                return m19357a;
            }
        });
    }

    /* renamed from: z */
    public static /* synthetic */ Integer m19358z(C7899a c7899a) {
        return Integer.valueOf(c7899a.m19357a().length);
    }

    /* renamed from: v */
    public C7871b m19362v(InterfaceC8243v0 interfaceC8243v0) {
        C7909e4 c7909e4 = this.f21514a;
        if (c7909e4 != null && c7909e4.m19309b() == EnumC8011l4.ClientReport) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m19361w()), f21513d));
            try {
                C7871b c7871b = (C7871b) interfaceC8243v0.mo17982c(bufferedReader, C7871b.class);
                bufferedReader.close();
                return c7871b;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return null;
    }

    /* renamed from: w */
    public byte[] m19361w() {
        Callable<byte[]> callable;
        if (this.f21516c == null && (callable = this.f21515b) != null) {
            this.f21516c = callable.call();
        }
        return this.f21516c;
    }

    /* renamed from: x */
    public C7923f4 m19360x(InterfaceC8243v0 interfaceC8243v0) {
        C7909e4 c7909e4 = this.f21514a;
        if (c7909e4 != null && c7909e4.m19309b() == EnumC8011l4.Event) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m19361w()), f21513d));
            try {
                C7923f4 c7923f4 = (C7923f4) interfaceC8243v0.mo17982c(bufferedReader, C7923f4.class);
                bufferedReader.close();
                return c7923f4;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return null;
    }

    /* renamed from: y */
    public C7909e4 m19359y() {
        return this.f21514a;
    }

    C7898d4(C7909e4 c7909e4, Callable<byte[]> callable) {
        this.f21514a = (C7909e4) C8229o.m18169c(c7909e4, "SentryEnvelopeItemHeader is required.");
        this.f21515b = (Callable) C8229o.m18169c(callable, "DataFactory is required.");
        this.f21516c = null;
    }
}