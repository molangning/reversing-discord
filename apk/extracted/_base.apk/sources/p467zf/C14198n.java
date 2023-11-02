package p467zf;

import com.facebook.react.uimanager.events.TouchesHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0000\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010*\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Ljava/io/File;", "base", "", "n", "o", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", TouchesHelper.TARGET_KEY, "", "overwrite", "", "bufferSize", "g", "i", "Lzf/f;", "m", "(Lzf/f;)Lzf/f;", "", "l", "(Ljava/util/List;)Ljava/util/List;", "j", "(Ljava/io/File;)Ljava/lang/String;", "extension", "k", "nameWithoutExtension", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/io/FilesKt")
/* renamed from: zf.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14198n extends C14197m {
    /* renamed from: g */
    public static final File m484g(File file, File target, boolean z, int i) {
        C9612q.m13917h(file, "<this>");
        C9612q.m13917h(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (z) {
                    if (!target.delete()) {
                        throw new C14182e(file, target, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new C14182e(file, target, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!target.mkdirs()) {
                    throw new C14184g(file, target, "Failed to create target directory.");
                }
            } else {
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(target);
                    C14179b.m517a(fileInputStream, fileOutputStream, i);
                    C14180c.m514a(fileOutputStream, null);
                    C14180c.m514a(fileInputStream, null);
                } finally {
                }
            }
            return target;
        }
        throw new C14201p(file, null, "The source file doesn't exist.", 2, null);
    }

    /* renamed from: h */
    public static /* synthetic */ File m483h(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m484g(file, file2, z, i);
    }

    /* renamed from: i */
    public static boolean m482i(File file) {
        C9612q.m13917h(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : C14197m.m485f(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    /* renamed from: j */
    public static String m481j(File file) {
        String m13732L0;
        C9612q.m13917h(file, "<this>");
        String name = file.getName();
        C9612q.m13918g(name, "name");
        m13732L0 = C9654p.m13732L0(name, '.', "");
        return m13732L0;
    }

    /* renamed from: k */
    public static String m480k(File file) {
        String m13714U0;
        C9612q.m13917h(file, "<this>");
        String name = file.getName();
        C9612q.m13918g(name, "name");
        m13714U0 = C9654p.m13714U0(name, ".", null, 2, null);
        return m13714U0;
    }

    /* renamed from: l */
    private static final List<File> m479l(List<? extends File> list) {
        Object m14044f0;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!C9612q.m13922c(name, ".")) {
                if (C9612q.m13922c(name, "..")) {
                    if (!arrayList.isEmpty()) {
                        m14044f0 = C9553r.m14044f0(arrayList);
                        if (!C9612q.m13922c(((File) m14044f0).getName(), "..")) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    arrayList.add(file);
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private static final C14183f m478m(C14183f c14183f) {
        return new C14183f(c14183f.m511a(), m479l(c14183f.m510b()));
    }

    /* renamed from: n */
    public static String m477n(File file, File base) {
        C9612q.m13917h(file, "<this>");
        C9612q.m13917h(base, "base");
        String m476o = m476o(file, base);
        if (m476o != null) {
            return m476o;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    /* renamed from: o */
    private static final String m476o(File file, File file2) {
        List m14062N;
        C14183f m478m = m478m(C14195k.m489b(file));
        C14183f m478m2 = m478m(C14195k.m489b(file2));
        if (!C9612q.m13922c(m478m.m511a(), m478m2.m511a())) {
            return null;
        }
        int m509c = m478m2.m509c();
        int m509c2 = m478m.m509c();
        int min = Math.min(m509c2, m509c);
        int i = 0;
        while (i < min && C9612q.m13922c(m478m.m510b().get(i), m478m2.m510b().get(i))) {
            i++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i2 = m509c - 1;
        if (i <= i2) {
            while (!C9612q.m13922c(m478m2.m510b().get(i2).getName(), "..")) {
                sb2.append("..");
                if (i2 != i) {
                    sb2.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < m509c2) {
            if (i < m509c) {
                sb2.append(File.separatorChar);
            }
            m14062N = C9553r.m14062N(m478m.m510b(), i);
            String separator = File.separator;
            C9612q.m13918g(separator, "separator");
            C9553r.m14048b0(m14062N, sb2, separator, null, null, 0, null, null, 124, null);
        }
        return sb2.toString();
    }
}
