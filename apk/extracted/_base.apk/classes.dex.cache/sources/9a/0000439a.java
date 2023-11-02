package p238n1;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p291q1.C11674f;

/* renamed from: n1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10488g {

    /* renamed from: a */
    private final InterfaceC10486e f27375a;

    public C10488g(InterfaceC10486e interfaceC10486e) {
        this.f27375a = interfaceC10486e;
    }

    /* renamed from: b */
    private static String m11411b(String str, EnumC10484c enumC10484c, boolean z) {
        String str2;
        if (z) {
            str2 = enumC10484c.m11419b();
        } else {
            str2 = enumC10484c.f27374j;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            replaceAll = m11409d(replaceAll, length);
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    /* renamed from: c */
    private File m11410c(String str) {
        File file = new File(m11408e(), m11411b(str, EnumC10484c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m11408e(), m11411b(str, EnumC10484c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private static String m11409d(String str, int i) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < digest.length; i2++) {
                sb2.append(String.format("%02x", Byte.valueOf(digest[i2])));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    /* renamed from: e */
    private File m11408e() {
        File mo11414a = this.f27375a.mo11414a();
        if (mo11414a.isFile()) {
            mo11414a.delete();
        }
        if (!mo11414a.exists()) {
            mo11414a.mkdirs();
        }
        return mo11414a;
    }

    /* renamed from: a */
    public Pair<EnumC10484c, InputStream> m11412a(String str) {
        EnumC10484c enumC10484c;
        try {
            File m11410c = m11410c(str);
            if (m11410c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m11410c);
            if (m11410c.getAbsolutePath().endsWith(".zip")) {
                enumC10484c = EnumC10484c.ZIP;
            } else {
                enumC10484c = EnumC10484c.JSON;
            }
            C11674f.m7235a("Cache hit for " + str + " at " + m11410c.getAbsolutePath());
            return new Pair<>(enumC10484c, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public void m11407f(String str, EnumC10484c enumC10484c) {
        File file = new File(m11408e(), m11411b(str, enumC10484c, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C11674f.m7235a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C11674f.m7233c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: g */
    public File m11406g(String str, InputStream inputStream, EnumC10484c enumC10484c) {
        File file = new File(m11408e(), m11411b(str, enumC10484c, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}