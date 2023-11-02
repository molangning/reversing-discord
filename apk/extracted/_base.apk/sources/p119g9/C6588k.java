package p119g9;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p029b9.C2198p;

/* renamed from: g9.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6588k {

    /* renamed from: a */
    private static String f18728a;

    /* renamed from: b */
    private static int f18729b;

    /* renamed from: a */
    public static String m22356a() {
        BufferedReader bufferedReader;
        String sb2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f18728a == null) {
            int i = f18729b;
            if (i == 0) {
                i = Process.myPid();
                f18729b = i;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("/proc/");
                    sb3.append(i);
                    sb3.append("/cmdline");
                    sb2 = sb3.toString();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                    try {
                        String readLine = bufferedReader.readLine();
                        C2198p.m33985j(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        C6586i.m22368b(bufferedReader2);
                        throw th;
                    }
                    C6586i.m22368b(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            f18728a = str;
        }
        return f18728a;
    }
}
