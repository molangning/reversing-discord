package p378v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p394w2.C13379j;

/* renamed from: v2.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13054c {

    /* renamed from: v2.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13055a extends IOException {
        public C13055a(String str) {
            super(str);
        }

        public C13055a(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    /* renamed from: v2.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13056b extends IOException {
        public C13056b(String str) {
            super(str);
        }
    }

    /* renamed from: v2.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13057c extends FileNotFoundException {
        public C13057c(String str) {
            super(str);
        }
    }

    /* renamed from: v2.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13058d extends IOException {
        public C13058d(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    /* renamed from: a */
    public static void m3381a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new C13055a(file.getAbsolutePath(), new C13056b(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C13055a(file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static void m3380b(File file, File file2) {
        Throwable c13056b;
        C13379j.m2677g(file);
        C13379j.m2677g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (!file2.exists()) {
            if (file.getParentFile().exists()) {
                if (!file.exists()) {
                    c13056b = new FileNotFoundException(file.getAbsolutePath());
                } else {
                    c13056b = null;
                }
            } else {
                c13056b = new C13057c(file.getAbsolutePath());
            }
        } else {
            c13056b = new C13056b(file2.getAbsolutePath());
        }
        throw new C13058d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), c13056b);
    }
}