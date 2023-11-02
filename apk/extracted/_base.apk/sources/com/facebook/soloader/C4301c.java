package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4301c extends AbstractC4325q {

    /* renamed from: a */
    private final Map<String, Set<String>> f10952a = new HashMap();

    /* renamed from: b */
    private final Set<String> f10953b;

    /* renamed from: c */
    private final File f10954c;

    public C4301c(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        this.f10953b = m30130f("", str);
        this.f10954c = new File(str);
    }

    /* renamed from: d */
    private synchronized void m30132d(String str, String str2) {
        if (!this.f10952a.containsKey(str)) {
            this.f10952a.put(str, new HashSet());
        }
        this.f10952a.get(str).add(str2);
    }

    /* renamed from: e */
    private static String[] m30131e(String str, InterfaceC4304f interfaceC4304f) {
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
    static Set<String> m30130f(String str, String str2) {
        String m30129g;
        String[] split;
        HashSet hashSet = new HashSet();
        String m30140a = SysUtil.Api14Utils.m30140a();
        if (m30140a != null) {
            for (String str3 : m30140a.split(":")) {
                if (str3.contains(str + ".apk!/")) {
                    hashSet.add(str3);
                }
            }
        }
        if (hashSet.isEmpty() && (m30129g = m30129g(str2)) != null) {
            hashSet.add(m30129g);
        }
        return hashSet;
    }

    /* renamed from: g */
    private static String m30129g(String str) {
        String[] m30144k = SysUtil.m30144k();
        if (!TextUtils.isEmpty(str) && m30144k.length > 0) {
            return str + "!/lib/" + m30144k[0];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        r2 = new com.facebook.soloader.C4306h(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        r8 = m30131e(r8, r2);
        r3 = r8.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4 >= r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        r5 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r5.startsWith("/") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        com.facebook.soloader.SoLoader.m30162t(r5, r9 | 1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        r2.close();
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m30127i(java.lang.String r8, int r9, android.os.StrictMode.ThreadPolicy r10) {
        /*
            r7 = this;
            java.lang.String r0 = "/"
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            java.io.File r2 = r7.f10954c
            r1.<init>(r2)
            java.util.Enumeration r2 = r1.entries()     // Catch: java.lang.Throwable -> L64
        Ld:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L60
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> L64
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto Ld
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            r5.append(r0)     // Catch: java.lang.Throwable -> L64
            r5.append(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L64
            boolean r4 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto Ld
            com.facebook.soloader.h r2 = new com.facebook.soloader.h     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String[] r8 = m30131e(r8, r2)     // Catch: java.lang.Throwable -> L56
            int r3 = r8.length     // Catch: java.lang.Throwable -> L56
            r4 = 0
        L3f:
            if (r4 >= r3) goto L52
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L56
            boolean r6 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L4a
            goto L4f
        L4a:
            r6 = r9 | 1
            com.facebook.soloader.SoLoader.m30162t(r5, r6, r10)     // Catch: java.lang.Throwable -> L56
        L4f:
            int r4 = r4 + 1
            goto L3f
        L52:
            r2.close()     // Catch: java.lang.Throwable -> L64
            goto L60
        L56:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L64
        L5f:
            throw r8     // Catch: java.lang.Throwable -> L64
        L60:
            r1.close()
            return
        L64:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r9 = move-exception
            r8.addSuppressed(r9)
        L6d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C4301c.m30127i(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: a */
    public int mo30087a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f10927b != null) {
            for (String str2 : this.f10953b) {
                Set<String> set = this.f10952a.get(str2);
                if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                    m30127i(str, i, threadPolicy);
                    try {
                        i |= 4;
                        SoLoader.f10927b.mo30090a(str2 + File.separator + str, i);
                        Log.d("SoLoader", str + " found on " + str2);
                        return 1;
                    } catch (UnsatisfiedLinkError e) {
                        Log.w("SoLoader", str + " not found on " + str2 + " flag: " + i, e);
                    }
                } else {
                    Log.v("SoLoader", str + " not found on " + str2);
                }
            }
            return 0;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: b */
    public void mo30086b(int i) {
        int indexOf;
        int i2;
        String str = null;
        for (String str2 : this.f10953b) {
            if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i2 = indexOf + 2) < str2.length()) {
                str = str2.substring(i2);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(this.f10954c);
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null && nextElement.getName().startsWith(str) && nextElement.getName().endsWith(".so") && nextElement.getMethod() == 0) {
                            m30132d(str2, nextElement.getName().substring(str.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: c */
    public File mo30088c(String str) {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }

    /* renamed from: h */
    public boolean m30128h() {
        return !this.f10953b.isEmpty();
    }

    @Override // com.facebook.soloader.AbstractC4325q
    public String toString() {
        return getClass().getName() + "[root = " + this.f10953b.toString() + ']';
    }

    public C4301c(File file) {
        this.f10953b = m30130f(SysUtil.m30147h(file.getName()), file.getAbsolutePath());
        this.f10954c = file;
    }
}
