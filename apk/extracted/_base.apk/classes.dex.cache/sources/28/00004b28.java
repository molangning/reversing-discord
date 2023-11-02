package p312r2;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p056d3.C5741d;
import p056d3.InterfaceC5738a;
import p276p2.C11374b;
import p276p2.InterfaceC11373a;
import p292q2.InterfaceC11685a;
import p292q2.InterfaceC11695i;
import p312r2.InterfaceC12034c;
import p378v2.C13052a;
import p378v2.C13054c;
import p378v2.InterfaceC13053b;
import p394w2.C13369c;
import p394w2.C13379j;

/* renamed from: r2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12024a implements InterfaceC12034c {

    /* renamed from: f */
    private static final Class<?> f31043f = C12024a.class;

    /* renamed from: g */
    static final long f31044g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final File f31045a;

    /* renamed from: b */
    private final boolean f31046b;

    /* renamed from: c */
    private final File f31047c;

    /* renamed from: d */
    private final InterfaceC11685a f31048d;

    /* renamed from: e */
    private final InterfaceC5738a f31049e;

    /* renamed from: r2.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C12026b implements InterfaceC13053b {

        /* renamed from: a */
        private final List<InterfaceC12034c.InterfaceC12035a> f31050a;

        private C12026b() {
            C12024a.this = r1;
            this.f31050a = new ArrayList();
        }

        @Override // p378v2.InterfaceC13053b
        /* renamed from: a */
        public void mo3384a(File file) {
        }

        @Override // p378v2.InterfaceC13053b
        /* renamed from: b */
        public void mo3383b(File file) {
            C12028d m6547u = C12024a.this.m6547u(file);
            if (m6547u != null && m6547u.f31056a == ".cnt") {
                this.f31050a.add(new C12027c(m6547u.f31057b, file));
            }
        }

        @Override // p378v2.InterfaceC13053b
        /* renamed from: c */
        public void mo3382c(File file) {
        }

        /* renamed from: d */
        public List<InterfaceC12034c.InterfaceC12035a> m6541d() {
            return Collections.unmodifiableList(this.f31050a);
        }
    }

    /* renamed from: r2.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C12027c implements InterfaceC12034c.InterfaceC12035a {

        /* renamed from: a */
        private final String f31052a;

        /* renamed from: b */
        private final C11374b f31053b;

        /* renamed from: c */
        private long f31054c;

        /* renamed from: d */
        private long f31055d;

        @Override // p312r2.InterfaceC12034c.InterfaceC12035a
        /* renamed from: a */
        public long mo6532a() {
            if (this.f31055d < 0) {
                this.f31055d = this.f31053b.m8207d().lastModified();
            }
            return this.f31055d;
        }

        /* renamed from: b */
        public C11374b m6540b() {
            return this.f31053b;
        }

        @Override // p312r2.InterfaceC12034c.InterfaceC12035a
        public String getId() {
            return this.f31052a;
        }

        @Override // p312r2.InterfaceC12034c.InterfaceC12035a
        public long getSize() {
            if (this.f31054c < 0) {
                this.f31054c = this.f31053b.size();
            }
            return this.f31054c;
        }

        private C12027c(String str, File file) {
            C13379j.m2677g(file);
            this.f31052a = (String) C13379j.m2677g(str);
            this.f31053b = C11374b.m8209b(file);
            this.f31054c = -1L;
            this.f31055d = -1L;
        }
    }

    /* renamed from: r2.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12028d {

        /* renamed from: a */
        public final String f31056a;

        /* renamed from: b */
        public final String f31057b;

        /* renamed from: b */
        public static C12028d m6538b(File file) {
            String m6549s;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (m6549s = C12024a.m6549s(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (m6549s.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C12028d(m6549s, substring);
        }

        /* renamed from: a */
        public File m6539a(File file) {
            return File.createTempFile(this.f31057b + ".", ".tmp", file);
        }

        /* renamed from: c */
        public String m6537c(String str) {
            return str + File.separator + this.f31057b + this.f31056a;
        }

        public String toString() {
            return this.f31056a + "(" + this.f31057b + ")";
        }

        private C12028d(String str, String str2) {
            this.f31056a = str;
            this.f31057b = str2;
        }
    }

    /* renamed from: r2.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C12029e extends IOException {
        public C12029e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* renamed from: r2.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C12030f implements InterfaceC12034c.InterfaceC12036b {

        /* renamed from: a */
        private final String f31058a;

        /* renamed from: b */
        final File f31059b;

        public C12030f(String str, File file) {
            C12024a.this = r1;
            this.f31058a = str;
            this.f31059b = file;
        }

        @Override // p312r2.InterfaceC12034c.InterfaceC12036b
        /* renamed from: a */
        public InterfaceC11373a mo6531a(Object obj) {
            return m6536d(obj, C12024a.this.f31049e.now());
        }

        @Override // p312r2.InterfaceC12034c.InterfaceC12036b
        /* renamed from: b */
        public void mo6530b(InterfaceC11695i interfaceC11695i, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f31059b);
                try {
                    C13369c c13369c = new C13369c(fileOutputStream);
                    interfaceC11695i.mo7159a(c13369c);
                    c13369c.flush();
                    long m2698a = c13369c.m2698a();
                    fileOutputStream.close();
                    if (this.f31059b.length() == m2698a) {
                        return;
                    }
                    throw new C12029e(m2698a, this.f31059b.length());
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e) {
                C12024a.this.f31048d.mo7170a(InterfaceC11685a.EnumC11686a.WRITE_UPDATE_FILE_NOT_FOUND, C12024a.f31043f, "updateResource", e);
                throw e;
            }
        }

        @Override // p312r2.InterfaceC12034c.InterfaceC12036b
        /* renamed from: c */
        public boolean mo6529c() {
            return !this.f31059b.exists() || this.f31059b.delete();
        }

        /* renamed from: d */
        public InterfaceC11373a m6536d(Object obj, long j) {
            InterfaceC11685a.EnumC11686a enumC11686a;
            File m6551q = C12024a.this.m6551q(this.f31058a);
            try {
                C13054c.m3380b(this.f31059b, m6551q);
                if (m6551q.exists()) {
                    m6551q.setLastModified(j);
                }
                return C11374b.m8209b(m6551q);
            } catch (C13054c.C13058d e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    if (!(cause instanceof C13054c.C13057c)) {
                        if (cause instanceof FileNotFoundException) {
                            enumC11686a = InterfaceC11685a.EnumC11686a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                        } else {
                            enumC11686a = InterfaceC11685a.EnumC11686a.WRITE_RENAME_FILE_OTHER;
                        }
                    } else {
                        enumC11686a = InterfaceC11685a.EnumC11686a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    }
                } else {
                    enumC11686a = InterfaceC11685a.EnumC11686a.WRITE_RENAME_FILE_OTHER;
                }
                C12024a.this.f31048d.mo7170a(enumC11686a, C12024a.f31043f, "commit", e);
                throw e;
            }
        }
    }

    /* renamed from: r2.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C12031g implements InterfaceC13053b {

        /* renamed from: a */
        private boolean f31061a;

        private C12031g() {
            C12024a.this = r1;
        }

        /* renamed from: d */
        private boolean m6535d(File file) {
            C12028d m6547u = C12024a.this.m6547u(file);
            boolean z = false;
            if (m6547u == null) {
                return false;
            }
            String str = m6547u.f31056a;
            if (str == ".tmp") {
                return m6534e(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            C13379j.m2675i(z);
            return true;
        }

        /* renamed from: e */
        private boolean m6534e(File file) {
            return file.lastModified() > C12024a.this.f31049e.now() - C12024a.f31044g;
        }

        @Override // p378v2.InterfaceC13053b
        /* renamed from: a */
        public void mo3384a(File file) {
            if (!C12024a.this.f31045a.equals(file) && !this.f31061a) {
                file.delete();
            }
            if (this.f31061a && file.equals(C12024a.this.f31047c)) {
                this.f31061a = false;
            }
        }

        @Override // p378v2.InterfaceC13053b
        /* renamed from: b */
        public void mo3383b(File file) {
            if (!this.f31061a || !m6535d(file)) {
                file.delete();
            }
        }

        @Override // p378v2.InterfaceC13053b
        /* renamed from: c */
        public void mo3382c(File file) {
            if (!this.f31061a && file.equals(C12024a.this.f31047c)) {
                this.f31061a = true;
            }
        }
    }

    public C12024a(File file, int i, InterfaceC11685a interfaceC11685a) {
        C13379j.m2677g(file);
        this.f31045a = file;
        this.f31046b = m6543y(file, interfaceC11685a);
        this.f31047c = new File(file, m6544x(i));
        this.f31048d = interfaceC11685a;
        m6560B();
        this.f31049e = C5741d.m24592a();
    }

    /* renamed from: A */
    private boolean m6561A(String str, boolean z) {
        File m6551q = m6551q(str);
        boolean exists = m6551q.exists();
        if (z && exists) {
            m6551q.setLastModified(this.f31049e.now());
        }
        return exists;
    }

    /* renamed from: B */
    private void m6560B() {
        boolean z = true;
        if (this.f31045a.exists()) {
            if (!this.f31047c.exists()) {
                C13052a.m3386b(this.f31045a);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                C13054c.m3381a(this.f31047c);
            } catch (C13054c.C13055a unused) {
                InterfaceC11685a interfaceC11685a = this.f31048d;
                InterfaceC11685a.EnumC11686a enumC11686a = InterfaceC11685a.EnumC11686a.WRITE_CREATE_DIR;
                Class<?> cls = f31043f;
                interfaceC11685a.mo7170a(enumC11686a, cls, "version directory could not be created: " + this.f31047c, null);
            }
        }
    }

    /* renamed from: p */
    private long m6552p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* renamed from: s */
    public static String m6549s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    /* renamed from: t */
    private String m6548t(String str) {
        C12028d c12028d = new C12028d(".cnt", str);
        return c12028d.m6537c(m6545w(c12028d.f31057b));
    }

    /* renamed from: u */
    public C12028d m6547u(File file) {
        C12028d m6538b = C12028d.m6538b(file);
        if (m6538b == null || !m6546v(m6538b.f31057b).equals(file.getParentFile())) {
            return null;
        }
        return m6538b;
    }

    /* renamed from: v */
    private File m6546v(String str) {
        return new File(m6545w(str));
    }

    /* renamed from: w */
    private String m6545w(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f31047c + File.separator + valueOf;
    }

    /* renamed from: x */
    static String m6544x(int i) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i));
    }

    /* renamed from: y */
    private static boolean m6543y(File file, InterfaceC11685a interfaceC11685a) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
                try {
                    return file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e) {
                    e = e;
                    InterfaceC11685a.EnumC11686a enumC11686a = InterfaceC11685a.EnumC11686a.OTHER;
                    Class<?> cls = f31043f;
                    interfaceC11685a.mo7170a(enumC11686a, cls, "failed to read folder to check if external: " + ((String) null), e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Exception e3) {
            interfaceC11685a.mo7170a(InterfaceC11685a.EnumC11686a.OTHER, f31043f, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    /* renamed from: z */
    private void m6542z(File file, String str) {
        try {
            C13054c.m3381a(file);
        } catch (C13054c.C13055a e) {
            this.f31048d.mo7170a(InterfaceC11685a.EnumC11686a.WRITE_CREATE_DIR, f31043f, str, e);
            throw e;
        }
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: a */
    public void mo6510a() {
        C13052a.m3387a(this.f31045a);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: b */
    public void mo6509b() {
        C13052a.m3385c(this.f31045a, new C12031g());
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: c */
    public boolean mo6508c(String str, Object obj) {
        return m6561A(str, true);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: d */
    public InterfaceC12034c.InterfaceC12036b mo6507d(String str, Object obj) {
        C12028d c12028d = new C12028d(".tmp", str);
        File m6546v = m6546v(c12028d.f31057b);
        if (!m6546v.exists()) {
            m6542z(m6546v, "insert");
        }
        try {
            return new C12030f(str, c12028d.m6539a(m6546v));
        } catch (IOException e) {
            this.f31048d.mo7170a(InterfaceC11685a.EnumC11686a.WRITE_CREATE_TEMPFILE, f31043f, "insert", e);
            throw e;
        }
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: e */
    public boolean mo6506e(String str, Object obj) {
        return m6561A(str, false);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: f */
    public InterfaceC11373a mo6505f(String str, Object obj) {
        File m6551q = m6551q(str);
        if (m6551q.exists()) {
            m6551q.setLastModified(this.f31049e.now());
            return C11374b.m8208c(m6551q);
        }
        return null;
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: h */
    public long mo6503h(InterfaceC12034c.InterfaceC12035a interfaceC12035a) {
        return m6552p(((C12027c) interfaceC12035a).m6540b().m8207d());
    }

    @Override // p312r2.InterfaceC12034c
    public boolean isExternal() {
        return this.f31046b;
    }

    /* renamed from: q */
    File m6551q(String str) {
        return new File(m6548t(str));
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: r */
    public List<InterfaceC12034c.InterfaceC12035a> mo6504g() {
        C12026b c12026b = new C12026b();
        C13052a.m3385c(this.f31047c, c12026b);
        return c12026b.m6541d();
    }

    @Override // p312r2.InterfaceC12034c
    public long remove(String str) {
        return m6552p(m6551q(str));
    }
}