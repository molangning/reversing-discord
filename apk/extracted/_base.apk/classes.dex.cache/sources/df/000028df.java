package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC4326r;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4312j extends AbstractC4326r {

    /* renamed from: i */
    protected final File f10972i;

    /* renamed from: j */
    protected final String f10973j;

    /* renamed from: com.facebook.soloader.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4314b extends AbstractC4326r.C4328b implements Comparable {

        /* renamed from: l */
        final ZipEntry f10974l;

        /* renamed from: m */
        final int f10975m;

        C4314b(String str, ZipEntry zipEntry, int i) {
            super(str, m30117a(zipEntry));
            this.f10974l = zipEntry;
            this.f10975m = i;
        }

        /* renamed from: a */
        private static String m30117a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f11013j.compareTo(((C4314b) obj).f11013j);
        }
    }

    /* renamed from: com.facebook.soloader.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4315c extends AbstractC4326r.AbstractC4333g {

        /* renamed from: j */
        private C4314b[] f10976j;

        /* renamed from: k */
        private final ZipFile f10977k;

        /* renamed from: l */
        private final AbstractC4326r f10978l;

        /* renamed from: com.facebook.soloader.j$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        private final class C4316a extends AbstractC4326r.AbstractC4331e {

            /* renamed from: j */
            private int f10980j;

            private C4316a() {
                C4315c.this = r1;
            }

            @Override // com.facebook.soloader.AbstractC4326r.AbstractC4331e
            /* renamed from: a */
            public boolean mo30066a() {
                C4315c.this.m30114m();
                if (this.f10980j < C4315c.this.f10976j.length) {
                    return true;
                }
                return false;
            }

            @Override // com.facebook.soloader.AbstractC4326r.AbstractC4331e
            /* renamed from: h */
            public AbstractC4326r.InterfaceC4330d mo30065h() {
                C4315c.this.m30114m();
                C4314b[] c4314bArr = C4315c.this.f10976j;
                int i = this.f10980j;
                this.f10980j = i + 1;
                C4314b c4314b = c4314bArr[i];
                InputStream inputStream = C4315c.this.f10977k.getInputStream(c4314b.f10974l);
                try {
                    return new AbstractC4326r.C4332f(c4314b, inputStream);
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
        }

        public C4315c(AbstractC4326r abstractC4326r) {
            C4312j.this = r2;
            this.f10977k = new ZipFile(r2.f10972i);
            this.f10978l = abstractC4326r;
        }

        @Override // com.facebook.soloader.AbstractC4326r.AbstractC4333g
        /* renamed from: a */
        public final AbstractC4326r.C4329c mo30062a() {
            return new AbstractC4326r.C4329c(m30114m());
        }

        @Override // com.facebook.soloader.AbstractC4326r.AbstractC4333g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f10977k.close();
        }

        @Override // com.facebook.soloader.AbstractC4326r.AbstractC4333g
        /* renamed from: h */
        public final AbstractC4326r.AbstractC4331e mo30061h() {
            return new C4316a();
        }

        /* renamed from: m */
        final C4314b[] m30114m() {
            if (this.f10976j == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C4312j.this.f10973j);
                String[] m30144k = SysUtil.m30144k();
                Enumeration<? extends ZipEntry> entries = this.f10977k.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int m30150e = SysUtil.m30150e(m30144k, group);
                        if (m30150e >= 0) {
                            linkedHashSet.add(group);
                            C4314b c4314b = (C4314b) hashMap.get(group2);
                            if (c4314b == null || m30150e < c4314b.f10975m) {
                                hashMap.put(group2, new C4314b(group2, nextElement, m30150e));
                            }
                        }
                    }
                }
                this.f10978l.m30070x((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                C4314b[] c4314bArr = (C4314b[]) hashMap.values().toArray(new C4314b[hashMap.size()]);
                Arrays.sort(c4314bArr);
                int i = 0;
                for (int i2 = 0; i2 < c4314bArr.length; i2++) {
                    C4314b c4314b2 = c4314bArr[i2];
                    if (mo30113o(c4314b2.f10974l, c4314b2.f11013j)) {
                        i++;
                    } else {
                        c4314bArr[i2] = null;
                    }
                }
                C4314b[] c4314bArr2 = new C4314b[i];
                int i3 = 0;
                for (C4314b c4314b3 : c4314bArr) {
                    if (c4314b3 != null) {
                        c4314bArr2[i3] = c4314b3;
                        i3++;
                    }
                }
                this.f10976j = c4314bArr2;
            }
            return this.f10976j;
        }

        /* renamed from: o */
        protected boolean mo30113o(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public C4312j(Context context, String str, File file, String str2) {
        super(context, str);
        this.f10972i = file;
        this.f10973j = str2;
    }
}