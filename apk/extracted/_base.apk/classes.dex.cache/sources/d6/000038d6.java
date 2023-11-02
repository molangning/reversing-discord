package io.sentry.cache;

import io.sentry.C7836b5;
import io.sentry.C7898d4;
import io.sentry.C8020m3;
import io.sentry.C8132r4;
import io.sentry.EnumC8011l4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8243v0;
import io.sentry.clientreport.EnumC7875e;
import io.sentry.util.C8229o;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: io.sentry.cache.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7847b {

    /* renamed from: n */
    protected static final Charset f21439n = Charset.forName("UTF-8");

    /* renamed from: j */
    protected final C8132r4 f21440j;

    /* renamed from: k */
    protected final InterfaceC8243v0 f21441k;

    /* renamed from: l */
    protected final File f21442l;

    /* renamed from: m */
    private final int f21443m;

    public AbstractC7847b(C8132r4 c8132r4, String str, int i) {
        C8229o.m18169c(str, "Directory is required.");
        this.f21440j = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required.");
        this.f21441k = c8132r4.getSerializer();
        this.f21442l = new File(str);
        this.f21443m = i;
    }

    /* renamed from: d */
    private C8020m3 m19565d(C8020m3 c8020m3, C7898d4 c7898d4) {
        ArrayList arrayList = new ArrayList();
        for (C7898d4 c7898d42 : c8020m3.m18986c()) {
            arrayList.add(c7898d42);
        }
        arrayList.add(c7898d4);
        return new C8020m3(c8020m3.m18987b(), arrayList);
    }

    /* renamed from: e */
    private C7836b5 m19564e(C8020m3 c8020m3) {
        for (C7898d4 c7898d4 : c8020m3.m18986c()) {
            if (m19562i(c7898d4)) {
                return m19556t(c7898d4);
            }
        }
        return null;
    }

    /* renamed from: i */
    private boolean m19562i(C7898d4 c7898d4) {
        if (c7898d4 == null) {
            return false;
        }
        return c7898d4.m19359y().m19309b().equals(EnumC8011l4.Session);
    }

    /* renamed from: k */
    private boolean m19561k(C8020m3 c8020m3) {
        return c8020m3.m18986c().iterator().hasNext();
    }

    /* renamed from: o */
    private boolean m19560o(C7836b5 c7836b5) {
        if (!c7836b5.m19575l().equals(C7836b5.EnumC7838b.Ok) || c7836b5.m19577j() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static /* synthetic */ int m19559p(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    /* renamed from: r */
    private void m19558r(File file, File[] fileArr) {
        Boolean m19580g;
        int i;
        File file2;
        C8020m3 m19557s;
        C7898d4 c7898d4;
        C7836b5 m19556t;
        C8020m3 m19557s2 = m19557s(file);
        if (m19557s2 != null && m19561k(m19557s2)) {
            this.f21440j.getClientReportRecorder().mo19473b(EnumC7875e.CACHE_OVERFLOW, m19557s2);
            C7836b5 m19564e = m19564e(m19557s2);
            if (m19564e != null && m19560o(m19564e) && (m19580g = m19564e.m19580g()) != null && m19580g.booleanValue()) {
                int length = fileArr.length;
                for (i = 0; i < length; i++) {
                    file2 = fileArr[i];
                    m19557s = m19557s(file2);
                    if (m19557s != null && m19561k(m19557s)) {
                        Iterator<C7898d4> it = m19557s.m18986c().iterator();
                        while (true) {
                            c7898d4 = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            C7898d4 next = it.next();
                            if (m19562i(next) && (m19556t = m19556t(next)) != null && m19560o(m19556t)) {
                                Boolean m19580g2 = m19556t.m19580g();
                                if (m19580g2 != null && m19580g2.booleanValue()) {
                                    this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "Session %s has 2 times the init flag.", m19564e.m19577j());
                                    return;
                                } else if (m19564e.m19577j() != null && m19564e.m19577j().equals(m19556t.m19577j())) {
                                    m19556t.m19573n();
                                    try {
                                        c7898d4 = C7898d4.m19363u(this.f21441k, m19556t);
                                        it.remove();
                                        break;
                                    } catch (IOException e) {
                                        this.f21440j.getLogger().mo18137a(EnumC8021m4.ERROR, e, "Failed to create new envelope item for the session %s", m19564e.m19577j());
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        return;
        if (c7898d4 != null) {
            C8020m3 m19565d = m19565d(m19557s, c7898d4);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f21440j.getLogger().mo18135c(EnumC8021m4.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            m19554v(m19565d, file2, lastModified);
            return;
        }
    }

    /* renamed from: s */
    private C8020m3 m19557s(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            C8020m3 mo17981d = this.f21441k.mo17981d(bufferedInputStream);
            bufferedInputStream.close();
            return mo17981d;
        } catch (IOException e) {
            this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    /* renamed from: t */
    private C7836b5 m19556t(C7898d4 c7898d4) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c7898d4.m19361w()), f21439n));
            C7836b5 c7836b5 = (C7836b5) this.f21441k.mo17982c(bufferedReader, C7836b5.class);
            bufferedReader.close();
            return c7836b5;
        } catch (Throwable th2) {
            this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    /* renamed from: v */
    private void m19554v(C8020m3 c8020m3, File file, long j) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f21441k.mo17983b(c8020m3, fileOutputStream);
            file.setLastModified(j);
            fileOutputStream.close();
        } catch (Throwable th2) {
            this.f21440j.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    /* renamed from: w */
    private void m19553w(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m19559p;
                    m19559p = AbstractC7847b.m19559p((File) obj, (File) obj2);
                    return m19559p;
                }
            });
        }
    }

    /* renamed from: h */
    public boolean m19563h() {
        if (this.f21442l.isDirectory() && this.f21442l.canWrite() && this.f21442l.canRead()) {
            return true;
        }
        this.f21440j.getLogger().mo18135c(EnumC8021m4.ERROR, "The directory for caching files is inaccessible.: %s", this.f21442l.getAbsolutePath());
        return false;
    }

    /* renamed from: u */
    public void m19555u(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f21443m) {
            this.f21440j.getLogger().mo18135c(EnumC8021m4.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i = (length - this.f21443m) + 1;
            m19553w(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i, length);
            for (int i2 = 0; i2 < i; i2++) {
                File file = fileArr[i2];
                m19558r(file, fileArr2);
                if (!file.delete()) {
                    this.f21440j.getLogger().mo18135c(EnumC8021m4.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}