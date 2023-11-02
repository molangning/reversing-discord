package p378v2;

import java.io.File;

/* renamed from: v2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13052a {
    /* renamed from: a */
    public static boolean m3387a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= m3386b(file2);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m3386b(File file) {
        if (file.isDirectory()) {
            m3387a(file);
        }
        return file.delete();
    }

    /* renamed from: c */
    public static void m3385c(File file, InterfaceC13053b interfaceC13053b) {
        interfaceC13053b.mo3382c(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m3385c(file2, interfaceC13053b);
                } else {
                    interfaceC13053b.mo3383b(file2);
                }
            }
        }
        interfaceC13053b.mo3384a(file);
    }
}