package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.soloader.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4302d extends AbstractC4325q {

    /* renamed from: a */
    protected final File f10955a;

    /* renamed from: b */
    protected final int f10956b;

    /* renamed from: c */
    protected final List<String> f10957c;

    public C4302d(File file, int i) {
        this(file, i, new String[0]);
    }

    /* renamed from: g */
    private void m30123g(String str, InterfaceC4304f interfaceC4304f, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] m30125e = m30125e(str, interfaceC4304f);
        Log.d("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(m30125e));
        for (String str2 : m30125e) {
            if (!str2.startsWith("/")) {
                SoLoader.m30162t(str2, i | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: a */
    public int mo30087a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return m30122h(str, i, this.f10955a, threadPolicy);
    }

    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: c */
    public File mo30088c(String str) {
        return m30124f(str);
    }

    /* renamed from: d */
    protected InterfaceC4304f m30126d(File file) {
        return new C4305g(file);
    }

    /* renamed from: e */
    protected String[] m30125e(String str, InterfaceC4304f interfaceC4304f) {
        boolean z = SoLoader.f10926a;
        if (z) {
            Api18TraceUtils.m30184a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] m30097b = C4322n.m30097b(str, interfaceC4304f);
            if (z) {
                Api18TraceUtils.m30183b();
            }
            return m30097b;
        } catch (Throwable th2) {
            if (SoLoader.f10926a) {
                Api18TraceUtils.m30183b();
            }
            throw th2;
        }
    }

    /* renamed from: f */
    protected File m30124f(String str) {
        File file = new File(this.f10955a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* renamed from: h */
    public int m30122h(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f10927b != null) {
            boolean z = false;
            if (this.f10957c.contains(str)) {
                Log.d("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
                return 0;
            }
            File m30124f = m30124f(str);
            if (m30124f == null) {
                Log.v("SoLoader", str + " not found on " + file.getCanonicalPath());
                return 0;
            }
            Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
            if ((i & 1) != 0 && (this.f10956b & 2) != 0) {
                Log.d("SoLoader", str + " loaded implicitly");
                return 2;
            }
            if ((this.f10956b & 1) != 0) {
                z = true;
            }
            boolean equals = m30124f.getName().equals(str);
            InterfaceC4304f interfaceC4304f = null;
            if (z || !equals) {
                try {
                    interfaceC4304f = m30126d(m30124f);
                } catch (Throwable th2) {
                    if (interfaceC4304f != null) {
                        interfaceC4304f.close();
                    }
                    throw th2;
                }
            }
            if (z) {
                m30123g(str, interfaceC4304f, i, threadPolicy);
            } else {
                Log.d("SoLoader", "Not resolving dependencies for " + str);
            }
            try {
                if (equals) {
                    SoLoader.f10927b.mo30090a(m30124f.getAbsolutePath(), i);
                } else {
                    SoLoader.f10927b.mo30089b(m30124f.getAbsolutePath(), interfaceC4304f, i);
                }
                if (interfaceC4304f != null) {
                    interfaceC4304f.close();
                }
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    Log.d("SoLoader", "Corrupted lib file detected");
                    if (interfaceC4304f != null) {
                        interfaceC4304f.close();
                        return 3;
                    }
                    return 3;
                }
                throw e;
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    @Override // com.facebook.soloader.AbstractC4325q
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f10955a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f10955a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f10956b + ']';
    }

    public C4302d(File file, int i, String[] strArr) {
        this.f10955a = file;
        this.f10956b = i;
        this.f10957c = Arrays.asList(strArr);
    }
}