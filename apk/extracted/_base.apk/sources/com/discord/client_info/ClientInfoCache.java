package com.discord.client_info;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m14357d2 = {"Lcom/discord/client_info/ClientInfoCache;", "", "()V", "DEVICE_VENDOR_ID_KEY", "", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "getDeviceVendorId", "context", "client_info_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ClientInfoCache {
    private static final String DEVICE_VENDOR_ID_KEY = "DeviceVendorID";
    public static final ClientInfoCache INSTANCE = new ClientInfoCache();

    private ClientInfoCache() {
    }

    private final SharedPreferences getCache(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ClientInfoCache", 0);
        C9612q.m13918g(sharedPreferences, "getSharedPreferences(\"Cl…e\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final String getDeviceVendorId(Context context) {
        C9612q.m13917h(context, "context");
        String string = getCache(context).getString(DEVICE_VENDOR_ID_KEY, null);
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            C9612q.m13918g(uuid, "randomUUID().toString()");
            SharedPreferences.Editor editor = INSTANCE.getCache(context).edit();
            C9612q.m13918g(editor, "editor");
            editor.putString(DEVICE_VENDOR_ID_KEY, uuid);
            editor.apply();
            return uuid;
        }
        return string;
    }
}
