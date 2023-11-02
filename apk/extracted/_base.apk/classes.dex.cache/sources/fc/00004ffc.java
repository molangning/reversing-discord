package ve;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: ve.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13260e {
    /* renamed from: a */
    public static void m2902a(String str, String str2) {
        FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(new File(str)).getChannel();
            try {
                fileChannel2 = new FileOutputStream(new File(str2)).getChannel();
                channel.transferTo(0L, channel.size(), fileChannel2);
                channel.close();
                channel.close();
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }
}