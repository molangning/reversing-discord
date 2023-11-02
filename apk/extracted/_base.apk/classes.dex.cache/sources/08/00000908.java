package p021b1;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* renamed from: b1.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2056l0 {
    /* renamed from: a */
    public static String m34405a(Context context) {
        String m34404b = m34404b(context);
        if (m34404b == null) {
            return null;
        }
        return m34402d(m34404b.toUpperCase(Locale.US));
    }

    /* renamed from: b */
    private static String m34404b(Context context) {
        String m34403c = m34403c("wlan0");
        if (m34403c != null) {
            return m34403c;
        }
        String m34403c2 = m34403c("eth0");
        if (m34403c2 != null) {
            return m34403c2;
        }
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                return macAddress;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static String m34403c(String str) {
        try {
            StringBuilder sb2 = new StringBuilder((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/class/net/" + str + "/address"), 1024);
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    sb2.append(String.valueOf(cArr, 0, read));
                } else {
                    bufferedReader.close();
                    return sb2.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m34402d(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.replaceAll("\\s", "");
        if (TextUtils.isEmpty(replaceAll)) {
            return null;
        }
        return replaceAll;
    }
}