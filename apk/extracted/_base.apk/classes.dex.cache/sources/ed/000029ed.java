package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.InterfaceC4521a;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p174j8.C8868d;
import p174j8.C8869e;
import p174j8.C8871g;
import p174j8.InterfaceC8870f;
import p195k8.C9149a;
import p195k8.C9197r;
import p211l6.InterfaceC10054b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SimpleCache implements InterfaceC4521a {

    /* renamed from: l */
    private static final HashSet<File> f12292l = new HashSet<>();

    /* renamed from: a */
    private final File f12293a;

    /* renamed from: b */
    private final InterfaceC4528d f12294b;

    /* renamed from: c */
    private final C4533h f12295c;

    /* renamed from: d */
    private final C4530f f12296d;

    /* renamed from: e */
    private final HashMap<String, ArrayList<InterfaceC4521a.InterfaceC4523b>> f12297e;

    /* renamed from: f */
    private final Random f12298f;

    /* renamed from: g */
    private final boolean f12299g;

    /* renamed from: h */
    private long f12300h;

    /* renamed from: i */
    private long f12301i;

    /* renamed from: j */
    private boolean f12302j;

    /* renamed from: k */
    private InterfaceC4521a.C4522a f12303k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.upstream.cache.SimpleCache$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4520a extends Thread {

        /* renamed from: j */
        final /* synthetic */ ConditionVariable f12304j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4520a(String str, ConditionVariable conditionVariable) {
            super(str);
            SimpleCache.this = r1;
            this.f12304j = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (SimpleCache.this) {
                this.f12304j.open();
                SimpleCache.this.m28737p();
                SimpleCache.this.f12294b.mo17119e();
            }
        }
    }

    public SimpleCache(File file, InterfaceC4528d interfaceC4528d, InterfaceC10054b interfaceC10054b) {
        this(file, interfaceC4528d, interfaceC10054b, null, false, false);
    }

    /* renamed from: k */
    private void m28742k(C4537i c4537i) {
        this.f12295c.m28670m(c4537i.f23245j).m28696a(c4537i);
        this.f12301i += c4537i.f23247l;
        m28733t(c4537i);
    }

    /* renamed from: m */
    private static void m28740m(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            C9197r.m16183c("SimpleCache", str);
            throw new InterfaceC4521a.C4522a(str);
        }
    }

    /* renamed from: n */
    private static long m28739n(File file) {
        long abs;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            abs = 0;
        } else {
            abs = Math.abs(nextLong);
        }
        String l = Long.toString(abs, 16);
        File file2 = new File(file, l + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* renamed from: o */
    private C4537i m28738o(String str, long j, long j2) {
        C4537i m28693d;
        C4531g m28676g = this.f12295c.m28676g(str);
        if (m28676g == null) {
            return C4537i.m28639g(str, j, j2);
        }
        while (true) {
            m28693d = m28676g.m28693d(j, j2);
            if (!m28693d.f23248m || m28693d.f23249n.length() == m28693d.f23247l) {
                break;
            }
            m28728y();
        }
        return m28693d;
    }

    /* renamed from: p */
    public void m28737p() {
        if (!this.f12293a.exists()) {
            try {
                m28740m(this.f12293a);
            } catch (InterfaceC4521a.C4522a e) {
                this.f12303k = e;
                return;
            }
        }
        File[] listFiles = this.f12293a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f12293a;
            C9197r.m16183c("SimpleCache", str);
            this.f12303k = new InterfaceC4521a.C4522a(str);
            return;
        }
        long m28735r = m28735r(listFiles);
        this.f12300h = m28735r;
        if (m28735r == -1) {
            try {
                this.f12300h = m28739n(this.f12293a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f12293a;
                C9197r.m16182d("SimpleCache", str2, e2);
                this.f12303k = new InterfaceC4521a.C4522a(str2, e2);
                return;
            }
        }
        try {
            this.f12295c.m28669n(this.f12300h);
            C4530f c4530f = this.f12296d;
            if (c4530f != null) {
                c4530f.m28700e(this.f12300h);
                Map<String, C4529e> m28703b = this.f12296d.m28703b();
                m28736q(this.f12293a, true, listFiles, m28703b);
                this.f12296d.m28698g(m28703b.keySet());
            } else {
                m28736q(this.f12293a, true, listFiles, null);
            }
            this.f12295c.m28665r();
            try {
                this.f12295c.m28664s();
            } catch (IOException e3) {
                C9197r.m16182d("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.f12293a;
            C9197r.m16182d("SimpleCache", str3, e4);
            this.f12303k = new InterfaceC4521a.C4522a(str3, e4);
        }
    }

    /* renamed from: q */
    private void m28736q(File file, boolean z, File[] fileArr, Map<String, C4529e> map) {
        C4529e c4529e;
        long j;
        long j2;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    m28736q(file2, false, file2.listFiles(), map);
                } else if (!z || (!C4533h.m28668o(name) && !name.endsWith(".uid"))) {
                    if (map != null) {
                        c4529e = map.remove(name);
                    } else {
                        c4529e = null;
                    }
                    if (c4529e != null) {
                        j2 = c4529e.f12335a;
                        j = c4529e.f12336b;
                    } else {
                        j = -9223372036854775807L;
                        j2 = -1;
                    }
                    C4537i m28641e = C4537i.m28641e(file2, j2, j, this.f12295c);
                    if (m28641e != null) {
                        m28742k(m28641e);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    /* renamed from: r */
    private static long m28735r(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return m28730w(name);
                } catch (NumberFormatException unused) {
                    C9197r.m16183c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    /* renamed from: s */
    private static synchronized boolean m28734s(File file) {
        boolean add;
        synchronized (SimpleCache.class) {
            add = f12292l.add(file.getAbsoluteFile());
        }
        return add;
    }

    /* renamed from: t */
    private void m28733t(C4537i c4537i) {
        ArrayList<InterfaceC4521a.InterfaceC4523b> arrayList = this.f12297e.get(c4537i.f23245j);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo17118f(this, c4537i);
            }
        }
        this.f12294b.mo17118f(this, c4537i);
    }

    /* renamed from: u */
    private void m28732u(C8868d c8868d) {
        ArrayList<InterfaceC4521a.InterfaceC4523b> arrayList = this.f12297e.get(c8868d.f23245j);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo17122b(this, c8868d);
            }
        }
        this.f12294b.mo17122b(this, c8868d);
    }

    /* renamed from: v */
    private void m28731v(C4537i c4537i, C8868d c8868d) {
        ArrayList<InterfaceC4521a.InterfaceC4523b> arrayList = this.f12297e.get(c4537i.f23245j);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo17121c(this, c4537i, c8868d);
            }
        }
        this.f12294b.mo17121c(this, c4537i, c8868d);
    }

    /* renamed from: w */
    private static long m28730w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    /* renamed from: x */
    private void m28729x(C8868d c8868d) {
        C4531g m28676g = this.f12295c.m28676g(c8868d.f23245j);
        if (m28676g != null && m28676g.m28687j(c8868d)) {
            this.f12301i -= c8868d.f23247l;
            if (this.f12296d != null) {
                String name = c8868d.f23249n.getName();
                try {
                    this.f12296d.m28699f(name);
                } catch (IOException unused) {
                    C9197r.m16178h("SimpleCache", "Failed to remove file index entry for: " + name);
                }
            }
            this.f12295c.m28667p(m28676g.f12341b);
            m28732u(c8868d);
        }
    }

    /* renamed from: y */
    private void m28728y() {
        ArrayList arrayList = new ArrayList();
        for (C4531g c4531g : this.f12295c.m28675h()) {
            Iterator<C4537i> it = c4531g.m28692e().iterator();
            while (it.hasNext()) {
                C4537i next = it.next();
                if (next.f23249n.length() != next.f23247l) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m28729x((C8868d) arrayList.get(i));
        }
    }

    /* renamed from: z */
    private C4537i m28727z(String str, C4537i c4537i) {
        boolean z;
        if (!this.f12299g) {
            return c4537i;
        }
        String name = ((File) C9149a.m16448e(c4537i.f23249n)).getName();
        long j = c4537i.f23247l;
        long currentTimeMillis = System.currentTimeMillis();
        C4530f c4530f = this.f12296d;
        if (c4530f != null) {
            try {
                c4530f.m28697h(name, j, currentTimeMillis);
            } catch (IOException unused) {
                C9197r.m16178h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C4537i m28686k = this.f12295c.m28676g(str).m28686k(c4537i, currentTimeMillis, z);
        m28731v(c4537i, m28686k);
        return m28686k;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: a */
    public synchronized File mo28726a(String str, long j, long j2) {
        boolean z;
        C4531g m28676g;
        File file;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        m28741l();
        m28676g = this.f12295c.m28676g(str);
        C9149a.m16448e(m28676g);
        C9149a.m16447f(m28676g.m28690g(j, j2));
        if (!this.f12293a.exists()) {
            m28740m(this.f12293a);
            m28728y();
        }
        this.f12294b.mo17120d(this, str, j, j2);
        file = new File(this.f12293a, Integer.toString(this.f12298f.nextInt(10)));
        if (!file.exists()) {
            m28740m(file);
        }
        return C4537i.m28637i(file, m28676g.f12340a, j, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: b */
    public synchronized void mo28725b(C8868d c8868d) {
        boolean z;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        m28729x(c8868d);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: c */
    public synchronized void mo28724c(String str, C8871g c8871g) {
        boolean z;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        m28741l();
        this.f12295c.m28678e(str, c8871g);
        try {
            this.f12295c.m28664s();
        } catch (IOException e) {
            throw new InterfaceC4521a.C4522a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: d */
    public synchronized InterfaceC8870f mo28723d(String str) {
        boolean z;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        return this.f12295c.m28673j(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: e */
    public synchronized C8868d mo28722e(String str, long j, long j2) {
        boolean z;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        m28741l();
        C4537i m28738o = m28738o(str, j, j2);
        if (m28738o.f23248m) {
            return m28727z(str, m28738o);
        } else if (this.f12295c.m28670m(str).m28688i(j, m28738o.f23247l)) {
            return m28738o;
        } else {
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: f */
    public synchronized void mo28721f(C8868d c8868d) {
        boolean z;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        C4531g c4531g = (C4531g) C9149a.m16448e(this.f12295c.m28676g(c8868d.f23245j));
        c4531g.m28685l(c8868d.f23246k);
        this.f12295c.m28667p(c4531g.f12341b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: g */
    public synchronized C8868d mo28720g(String str, long j, long j2) {
        boolean z;
        C8868d mo28722e;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        m28741l();
        while (true) {
            mo28722e = mo28722e(str, j, j2);
            if (mo28722e == null) {
                wait();
            }
        }
        return mo28722e;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a
    /* renamed from: h */
    public synchronized void mo28719h(File file, long j) {
        boolean z;
        boolean z2 = true;
        if (!this.f12302j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (!file.exists()) {
            return;
        }
        if (j == 0) {
            file.delete();
            return;
        }
        C4537i c4537i = (C4537i) C9149a.m16448e(C4537i.m28640f(file, j, this.f12295c));
        C4531g c4531g = (C4531g) C9149a.m16448e(this.f12295c.m28676g(c4537i.f23245j));
        C9149a.m16447f(c4531g.m28690g(c4537i.f23246k, c4537i.f23247l));
        long m17142a = C8869e.m17142a(c4531g.m28694c());
        if (m17142a != -1) {
            if (c4537i.f23246k + c4537i.f23247l > m17142a) {
                z2 = false;
            }
            C9149a.m16447f(z2);
        }
        if (this.f12296d != null) {
            try {
                this.f12296d.m28697h(file.getName(), c4537i.f23247l, c4537i.f23250o);
            } catch (IOException e) {
                throw new InterfaceC4521a.C4522a(e);
            }
        }
        m28742k(c4537i);
        try {
            this.f12295c.m28664s();
            notifyAll();
        } catch (IOException e2) {
            throw new InterfaceC4521a.C4522a(e2);
        }
    }

    /* renamed from: l */
    public synchronized void m28741l() {
        InterfaceC4521a.C4522a c4522a = this.f12303k;
        if (c4522a != null) {
            throw c4522a;
        }
    }

    public SimpleCache(File file, InterfaceC4528d interfaceC4528d, InterfaceC10054b interfaceC10054b, byte[] bArr, boolean z, boolean z2) {
        this(file, interfaceC4528d, new C4533h(interfaceC10054b, file, bArr, z, z2), (interfaceC10054b == null || z2) ? null : new C4530f(interfaceC10054b));
    }

    SimpleCache(File file, InterfaceC4528d interfaceC4528d, C4533h c4533h, C4530f c4530f) {
        if (m28734s(file)) {
            this.f12293a = file;
            this.f12294b = interfaceC4528d;
            this.f12295c = c4533h;
            this.f12296d = c4530f;
            this.f12297e = new HashMap<>();
            this.f12298f = new Random();
            this.f12299g = interfaceC4528d.mo17123a();
            this.f12300h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C4520a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}