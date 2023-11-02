package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p174j8.C8868d;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.upstream.cache.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4537i extends C8868d {

    /* renamed from: p */
    private static final Pattern f12365p = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: q */
    private static final Pattern f12366q = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: r */
    private static final Pattern f12367r = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private C4537i(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* renamed from: e */
    public static C4537i m28641e(File file, long j, long j2, C4533h c4533h) {
        File file2;
        String m28672k;
        long j3;
        long j4;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            File m28636k = m28636k(file, c4533h);
            if (m28636k == null) {
                return null;
            }
            file2 = m28636k;
            name = m28636k.getName();
        } else {
            file2 = file;
        }
        Matcher matcher = f12367r.matcher(name);
        if (!matcher.matches() || (m28672k = c4533h.m28672k(Integer.parseInt((String) C9149a.m16448e(matcher.group(1))))) == null) {
            return null;
        }
        if (j == -1) {
            j3 = file2.length();
        } else {
            j3 = j;
        }
        if (j3 == 0) {
            return null;
        }
        long parseLong = Long.parseLong((String) C9149a.m16448e(matcher.group(2)));
        if (j2 == -9223372036854775807L) {
            j4 = Long.parseLong((String) C9149a.m16448e(matcher.group(3)));
        } else {
            j4 = j2;
        }
        return new C4537i(m28672k, parseLong, j3, j4, file2);
    }

    /* renamed from: f */
    public static C4537i m28640f(File file, long j, C4533h c4533h) {
        return m28641e(file, j, -9223372036854775807L, c4533h);
    }

    /* renamed from: g */
    public static C4537i m28639g(String str, long j, long j2) {
        return new C4537i(str, j, j2, -9223372036854775807L, null);
    }

    /* renamed from: h */
    public static C4537i m28638h(String str, long j) {
        return new C4537i(str, j, -1L, -9223372036854775807L, null);
    }

    /* renamed from: i */
    public static File m28637i(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    /* renamed from: k */
    private static File m28636k(File file, C4533h c4533h) {
        String str;
        String name = file.getName();
        Matcher matcher = f12366q.matcher(name);
        if (matcher.matches()) {
            str = C9191p0.m16264Y0((String) C9149a.m16448e(matcher.group(1)));
        } else {
            matcher = f12365p.matcher(name);
            if (matcher.matches()) {
                str = (String) C9149a.m16448e(matcher.group(1));
            } else {
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        File m28637i = m28637i((File) C9149a.m16445h(file.getParentFile()), c4533h.m28677f(str), Long.parseLong((String) C9149a.m16448e(matcher.group(2))), Long.parseLong((String) C9149a.m16448e(matcher.group(3))));
        if (!file.renameTo(m28637i)) {
            return null;
        }
        return m28637i;
    }

    /* renamed from: d */
    public C4537i m28642d(File file, long j) {
        C9149a.m16447f(this.f23248m);
        return new C4537i(this.f23245j, this.f23246k, this.f23247l, j, file);
    }
}