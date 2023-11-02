package com.facebook.react.modules.systeminfo;

import android.content.Context;
import android.os.Build;
import com.facebook.react.C3893R;
import java.util.Locale;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AndroidInfoHelpers {
    public static final String DEVICE_LOCALHOST = "localhost";
    public static final String EMULATOR_LOCALHOST = "10.0.2.2";
    public static final String GENYMOTION_LOCALHOST = "10.0.3.2";
    public static final String METRO_HOST_PROP_NAME = "metro.host";
    private static final String TAG = "AndroidInfoHelpers";
    private static String metroHostPropValue;

    public static String getAdbReverseTcpCommand(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    private static Integer getDevServerPort(Context context) {
        return Integer.valueOf(context.getResources().getInteger(C3893R.integer.react_native_dev_server_port));
    }

    public static String getFriendlyDeviceName() {
        if (isRunningOnGenymotion()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static String getInspectorProxyHost(Context context) {
        return getServerIpAddress(getInspectorProxyPort(context).intValue());
    }

    private static Integer getInspectorProxyPort(Context context) {
        return Integer.valueOf(context.getResources().getInteger(C3893R.integer.react_native_dev_server_port));
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0066, code lost:
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized java.lang.String getMetroHostPropValue() {
        /*
            java.lang.Class<com.facebook.react.modules.systeminfo.AndroidInfoHelpers> r0 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.class
            monitor-enter(r0)
            java.lang.String r1 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L52
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String r4 = "metro.host"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L52
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L52
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L48
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L48
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L48
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L48
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L48
            java.lang.String r1 = ""
        L30:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6d
            if (r4 == 0) goto L38
            r1 = r4
            goto L30
        L38:
            com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue = r1     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6d
            r3.close()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L79
        L3d:
            r2.destroy()     // Catch: java.lang.Throwable -> L79
            goto L69
        L41:
            r1 = move-exception
            goto L56
        L43:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L6e
        L48:
            r3 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L56
        L4d:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
            goto L6e
        L52:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L56:
            java.lang.String r4 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.TAG     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = "Failed to query for metro.host prop:"
            p414x2.C13677a.m1869I(r4, r5, r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = ""
            com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue = r1     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L66
            r3.close()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L79
        L66:
            if (r2 == 0) goto L69
            goto L3d
        L69:
            java.lang.String r1 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)
            return r1
        L6d:
            r1 = move-exception
        L6e:
            if (r3 == 0) goto L73
            r3.close()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L79
        L73:
            if (r2 == 0) goto L78
            r2.destroy()     // Catch: java.lang.Throwable -> L79
        L78:
            throw r1     // Catch: java.lang.Throwable -> L79
        L79:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.AndroidInfoHelpers.getMetroHostPropValue():java.lang.String");
    }

    public static String getServerHost(Integer num) {
        return getServerIpAddress(num.intValue());
    }

    private static String getServerIpAddress(int i) {
        String metroHostPropValue2 = getMetroHostPropValue();
        if (metroHostPropValue2.equals("")) {
            if (isRunningOnGenymotion()) {
                metroHostPropValue2 = GENYMOTION_LOCALHOST;
            } else if (isRunningOnStockEmulator()) {
                metroHostPropValue2 = EMULATOR_LOCALHOST;
            } else {
                metroHostPropValue2 = DEVICE_LOCALHOST;
            }
        }
        return String.format(Locale.US, "%s:%d", metroHostPropValue2, Integer.valueOf(i));
    }

    private static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean isRunningOnStockEmulator() {
        String str = Build.FINGERPRINT;
        if (!str.contains("generic") && !str.startsWith("google/sdk_gphone")) {
            return false;
        }
        return true;
    }

    public static String getAdbReverseTcpCommand(Context context) {
        return getAdbReverseTcpCommand(getDevServerPort(context));
    }

    public static String getServerHost(Context context) {
        return getServerIpAddress(getDevServerPort(context).intValue());
    }
}