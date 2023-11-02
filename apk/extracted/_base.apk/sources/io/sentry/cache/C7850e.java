package io.sentry.cache;

import io.sentry.C7831b0;
import io.sentry.C7836b5;
import io.sentry.C7898d4;
import io.sentry.C7991j;
import io.sentry.C7995j3;
import io.sentry.C8020m3;
import io.sentry.C8132r4;
import io.sentry.EnumC8011l4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.InterfaceC7944b;
import io.sentry.hints.InterfaceC7954l;
import io.sentry.hints.InterfaceC7956n;
import io.sentry.transport.C8192r;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.cache.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7850e extends AbstractC7847b implements InterfaceC7851f {

    /* renamed from: o */
    private final CountDownLatch f21445o;

    /* renamed from: p */
    private final Map<C8020m3, String> f21446p;

    public C7850e(C8132r4 c8132r4, String str, int i) {
        super(c8132r4, str, i);
        this.f21446p = new WeakHashMap();
        this.f21445o = new CountDownLatch(1);
    }

    /* renamed from: B */
    public static File m19547B(String str) {
        return new File(str, "session.json");
    }

    /* renamed from: C */
    private synchronized File m19546C(C8020m3 c8020m3) {
        String uuid;
        String str;
        if (this.f21446p.containsKey(c8020m3)) {
            str = this.f21446p.get(c8020m3);
        } else {
            if (c8020m3.m18987b().m18948a() != null) {
                uuid = c8020m3.m18987b().m18948a().toString();
            } else {
                uuid = UUID.randomUUID().toString();
            }
            String str2 = uuid + ".envelope";
            this.f21446p.put(c8020m3, str2);
            str = str2;
        }
        return new File(this.f21442l.getAbsolutePath(), str);
    }

    /* renamed from: D */
    public static File m19545D(String str) {
        return new File(str, "previous_session.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ boolean m19544E(File file, String str) {
        return str.endsWith(".envelope");
    }

    /* renamed from: F */
    private void m19543F(C7831b0 c7831b0) {
        Date date;
        Object m18223g = C8220j.m18223g(c7831b0);
        if (m18223g instanceof InterfaceC7944b) {
            File m19545D = m19545D(this.f21442l.getAbsolutePath());
            if (m19545D.exists()) {
                InterfaceC8040o0 logger = this.f21440j.getLogger();
                EnumC8021m4 enumC8021m4 = EnumC8021m4.WARNING;
                logger.mo18135c(enumC8021m4, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m19545D), AbstractC7847b.f21439n));
                    C7836b5 c7836b5 = (C7836b5) this.f21441k.mo17982c(bufferedReader, C7836b5.class);
                    if (c7836b5 != null) {
                        InterfaceC7944b interfaceC7944b = (InterfaceC7944b) m18223g;
                        Long mo19154c = interfaceC7944b.mo19154c();
                        if (mo19154c != null) {
                            date = C7991j.m19087d(mo19154c.longValue());
                            Date m19576k = c7836b5.m19576k();
                            if (m19576k == null || date.before(m19576k)) {
                                this.f21440j.getLogger().mo18135c(enumC8021m4, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            date = null;
                        }
                        c7836b5.m19570q(C7836b5.EnumC7838b.Abnormal, null, true, interfaceC7944b.mo19152f());
                        c7836b5.m19583d(date);
                        m19538K(m19545D, c7836b5);
                    }
                    bufferedReader.close();
                    return;
                } catch (Throwable th2) {
                    this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error processing previous session.", th2);
                    return;
                }
            }
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "No previous session file to end.", new Object[0]);
        }
    }

    /* renamed from: G */
    private void m19542G(File file, C8020m3 c8020m3) {
        Iterable<C7898d4> m18986c = c8020m3.m18986c();
        if (m18986c.iterator().hasNext()) {
            C7898d4 next = m18986c.iterator().next();
            if (EnumC8011l4.Session.equals(next.m19359y().m19309b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.m19361w()), AbstractC7847b.f21439n));
                    C7836b5 c7836b5 = (C7836b5) this.f21441k.mo17982c(bufferedReader, C7836b5.class);
                    if (c7836b5 == null) {
                        this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "Item of type %s returned null by the parser.", next.m19359y().m19309b());
                    } else {
                        m19538K(file, c7836b5);
                    }
                    bufferedReader.close();
                    return;
                } catch (Throwable th2) {
                    this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Item failed to process.", th2);
                    return;
                }
            }
            this.f21440j.getLogger().mo18135c(EnumC8021m4.INFO, "Current envelope has a different envelope type %s", next.m19359y().m19309b());
            return;
        }
        this.f21440j.getLogger().mo18135c(EnumC8021m4.INFO, "Current envelope %s is empty", file.getAbsolutePath());
    }

    /* renamed from: I */
    private void m19540I() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f21440j.getCacheDirPath(), "last_crash"));
            fileOutputStream.write(C7991j.m19084g(C7991j.m19088c()).getBytes(AbstractC7847b.f21439n));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    /* renamed from: J */
    private void m19539J(File file, C8020m3 c8020m3) {
        if (file.exists()) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f21441k.mo17983b(c8020m3, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f21440j.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    /* renamed from: K */
    private void m19538K(File file, C7836b5 c7836b5) {
        if (file.exists()) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Overwriting session to offline storage: %s", c7836b5.m19577j());
            if (!file.delete()) {
                this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC7847b.f21439n));
            try {
                this.f21441k.mo17984a(c7836b5, bufferedWriter);
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f21440j.getLogger().mo18137a(EnumC8021m4.ERROR, th4, "Error writing Session to offline storage: %s", c7836b5.m19577j());
        }
    }

    /* renamed from: y */
    private File[] m19536y() {
        File[] listFiles;
        if (m19563h() && (listFiles = this.f21442l.listFiles(new FilenameFilter() { // from class: io.sentry.cache.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m19544E;
                m19544E = C7850e.m19544E(file, str);
                return m19544E;
            }
        })) != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: z */
    public static InterfaceC7851f m19535z(C8132r4 c8132r4) {
        String cacheDirPath = c8132r4.getCacheDirPath();
        int maxCacheItems = c8132r4.getMaxCacheItems();
        if (cacheDirPath == null) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
            return C8192r.m18302a();
        }
        return new C7850e(c8132r4, cacheDirPath, maxCacheItems);
    }

    /* renamed from: A */
    public void m19548A() {
        this.f21445o.countDown();
    }

    /* renamed from: H */
    public boolean m19541H() {
        try {
            return this.f21445o.await(this.f21440j.getFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.InterfaceC7851f
    /* renamed from: c */
    public void mo18301c(C8020m3 c8020m3) {
        C8229o.m18169c(c8020m3, "Envelope is required.");
        File m19546C = m19546C(c8020m3);
        if (m19546C.exists()) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Discarding envelope from cache: %s", m19546C.getAbsolutePath());
            if (!m19546C.delete()) {
                this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete envelope: %s", m19546C.getAbsolutePath());
                return;
            }
            return;
        }
        this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Envelope was not cached: %s", m19546C.getAbsolutePath());
    }

    @Override // java.lang.Iterable
    public Iterator<C8020m3> iterator() {
        BufferedInputStream bufferedInputStream;
        File[] m19536y = m19536y();
        ArrayList arrayList = new ArrayList(m19536y.length);
        for (File file : m19536y) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e);
            }
            try {
                arrayList.add(this.f21441k.mo17981d(bufferedInputStream));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
                break;
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: m */
    public void mo18300m(C8020m3 c8020m3, C7831b0 c7831b0) {
        C8229o.m18169c(c8020m3, "Envelope is required.");
        m19555u(m19536y());
        File m19547B = m19547B(this.f21442l.getAbsolutePath());
        File m19545D = m19545D(this.f21442l.getAbsolutePath());
        if (C8220j.m18222h(c7831b0, InterfaceC7954l.class) && !m19547B.delete()) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (C8220j.m18222h(c7831b0, InterfaceC7944b.class)) {
            m19543F(c7831b0);
        }
        if (C8220j.m18222h(c7831b0, InterfaceC7956n.class)) {
            if (m19547B.exists()) {
                this.f21440j.getLogger().mo18135c(EnumC8021m4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m19547B), AbstractC7847b.f21439n));
                    C7836b5 c7836b5 = (C7836b5) this.f21441k.mo17982c(bufferedReader, C7836b5.class);
                    if (c7836b5 != null) {
                        m19538K(m19545D, c7836b5);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Error processing session.", th2);
                }
            }
            m19542G(m19547B, c8020m3);
            boolean exists = new File(this.f21440j.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!exists) {
                File file = new File(this.f21440j.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f21440j.getLogger().mo18135c(EnumC8021m4.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    exists = true;
                }
            }
            C7995j3.m19047a().m19045c(exists);
            m19548A();
        }
        File m19546C = m19546C(c8020m3);
        if (m19546C.exists()) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.WARNING, "Not adding Envelope to offline storage because it already exists: %s", m19546C.getAbsolutePath());
            return;
        }
        this.f21440j.getLogger().mo18135c(EnumC8021m4.DEBUG, "Adding Envelope to offline storage: %s", m19546C.getAbsolutePath());
        m19539J(m19546C, c8020m3);
        if (C8220j.m18222h(c7831b0, UncaughtExceptionHandlerIntegration.C7683a.class)) {
            m19540I();
        }
    }
}
