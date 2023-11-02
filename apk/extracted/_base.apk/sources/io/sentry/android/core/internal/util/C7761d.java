package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.C7798o0;

/* renamed from: io.sentry.android.core.internal.util.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7761d {

    /* renamed from: io.sentry.android.core.internal.util.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC7762a {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    /* renamed from: a */
    private static EnumC7762a m19775a(Context context, ConnectivityManager connectivityManager, InterfaceC8040o0 interfaceC8040o0) {
        if (!C7770k.m19757a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC7762a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                return EnumC7762a.NOT_CONNECTED;
            } else if (activeNetworkInfo.isConnected()) {
                return EnumC7762a.CONNECTED;
            } else {
                return EnumC7762a.NOT_CONNECTED;
            }
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Could not retrieve Connection Status", th2);
            return EnumC7762a.UNKNOWN;
        }
    }

    /* renamed from: b */
    public static EnumC7762a m19774b(Context context, InterfaceC8040o0 interfaceC8040o0) {
        ConnectivityManager m19771e = m19771e(context, interfaceC8040o0);
        if (m19771e == null) {
            return EnumC7762a.UNKNOWN;
        }
        return m19775a(context, m19771e, interfaceC8040o0);
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    /* renamed from: c */
    public static String m19773c(Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0) {
        boolean z;
        boolean z2;
        ConnectivityManager m19771e = m19771e(context, interfaceC8040o0);
        if (m19771e == null) {
            return null;
        }
        boolean z3 = false;
        if (!C7770k.m19757a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            z = true;
            if (c7798o0.m19703d() >= 23) {
                Network activeNetwork = m19771e.getActiveNetwork();
                if (activeNetwork == null) {
                    interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = m19771e.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean hasTransport = networkCapabilities.hasTransport(3);
                z2 = networkCapabilities.hasTransport(1);
                z = networkCapabilities.hasTransport(0);
                z3 = hasTransport;
            } else {
                NetworkInfo activeNetworkInfo = m19771e.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 9) {
                            z2 = false;
                        } else {
                            z2 = false;
                            z3 = true;
                        }
                        z = z2;
                    } else {
                        z2 = true;
                        z = false;
                    }
                } else {
                    z2 = false;
                }
            }
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed to retrieve network info", th2);
        }
        if (z3) {
            return "ethernet";
        }
        if (z2) {
            return "wifi";
        }
        if (!z) {
            return null;
        }
        return "cellular";
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static String m19772d(NetworkCapabilities networkCapabilities, C7798o0 c7798o0) {
        if (c7798o0.m19703d() < 21) {
            return null;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (!networkCapabilities.hasTransport(0)) {
            return null;
        }
        return "cellular";
    }

    /* renamed from: e */
    private static ConnectivityManager m19771e(Context context, InterfaceC8040o0 interfaceC8040o0) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    /* renamed from: f */
    public static boolean m19770f(Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0, ConnectivityManager.NetworkCallback networkCallback) {
        if (c7798o0.m19703d() < 24) {
            interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager m19771e = m19771e(context, interfaceC8040o0);
        if (m19771e == null) {
            return false;
        }
        if (!C7770k.m19757a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            m19771e.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public static void m19769g(Context context, InterfaceC8040o0 interfaceC8040o0, C7798o0 c7798o0, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager m19771e;
        if (c7798o0.m19703d() < 21 || (m19771e = m19771e(context, interfaceC8040o0)) == null) {
            return;
        }
        try {
            m19771e.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "unregisterNetworkCallback failed", th2);
        }
    }
}
