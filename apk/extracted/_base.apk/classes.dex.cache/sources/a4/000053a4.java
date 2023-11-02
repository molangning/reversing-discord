package p467zf;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¨\u0006\u0007"}, m14357d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lzf/f;", "b", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/io/FilesKt")
/* renamed from: zf.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14195k {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x001c, code lost:
        r0 = kotlin.text.C9654p.m13709Y(r8, r3, 2, false, 4, null);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int m490a(java.lang.String r8) {
        /*
            char r1 = java.io.File.separatorChar
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            int r0 = kotlin.text.C9642f.m13816Y(r0, r1, r2, r3, r4, r5)
            r1 = 1
            if (r0 != 0) goto L3d
            int r0 = r8.length()
            if (r0 <= r1) goto L3c
            char r0 = r8.charAt(r1)
            char r3 = java.io.File.separatorChar
            if (r0 != r3) goto L3c
            r4 = 2
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            int r0 = kotlin.text.C9642f.m13816Y(r2, r3, r4, r5, r6, r7)
            if (r0 < 0) goto L3c
            char r3 = java.io.File.separatorChar
            int r4 = r0 + 1
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            int r0 = kotlin.text.C9642f.m13816Y(r2, r3, r4, r5, r6, r7)
            if (r0 < 0) goto L37
            int r0 = r0 + r1
            return r0
        L37:
            int r8 = r8.length()
            return r8
        L3c:
            return r1
        L3d:
            r2 = 58
            if (r0 <= 0) goto L4b
            int r3 = r0 + (-1)
            char r3 = r8.charAt(r3)
            if (r3 != r2) goto L4b
            int r0 = r0 + r1
            return r0
        L4b:
            r1 = -1
            r3 = 0
            if (r0 != r1) goto L5c
            r0 = 2
            r1 = 0
            boolean r0 = kotlin.text.C9642f.m13827P(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L5c
            int r8 = r8.length()
            return r8
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p467zf.C14195k.m490a(java.lang.String):int");
    }

    /* renamed from: b */
    public static final C14183f m489b(File file) {
        boolean z;
        List<String> m13683y0;
        int m14093t;
        List list;
        C9612q.m13917h(file, "<this>");
        String path = file.getPath();
        C9612q.m13918g(path, "path");
        int m490a = m490a(path);
        String substring = path.substring(0, m490a);
        C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(m490a);
        C9612q.m13918g(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = C9545j.m14104i();
        } else {
            m13683y0 = C9654p.m13683y0(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            m14093t = C9546k.m14093t(m13683y0, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (String str : m13683y0) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new C14183f(new File(substring), list);
    }
}