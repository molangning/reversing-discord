package com.discord.hosts;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/hosts/Hosts;", "", "()V", "value", "", "API", "getAPI", "()Ljava/lang/String;", "setAPI", "(Ljava/lang/String;)V", "CDN", "getCDN", "setCDN", "prefs", "Landroid/content/SharedPreferences;", "init", "", "context", "Landroid/content/Context;", "api", "cdn", "requireHost", "key", "setHost", "hosts_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class Hosts {
    public static final Hosts INSTANCE = new Hosts();
    private static SharedPreferences prefs;

    private Hosts() {
    }

    public static /* synthetic */ void init$default(Hosts hosts, Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        hosts.init(context, str, str2);
    }

    private final String requireHost(String str) {
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences == null) {
            C9612q.m13900y("prefs");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("No value for '" + str + "'");
    }

    private final void setAPI(String str) {
        setHost("host_api", str);
    }

    private final void setCDN(String str) {
        setHost("host_cdn", str);
    }

    private final void setHost(String str, String str2) {
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences == null) {
            C9612q.m13900y("prefs");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        C9612q.m13918g(editor, "editor");
        editor.putString(str, str2);
        editor.apply();
    }

    public final String getAPI() {
        return requireHost("host_api");
    }

    public final String getCDN() {
        return requireHost("host_cdn");
    }

    public final void init(Context context, String str, String str2) {
        C9612q.m13917h(context, "context");
        if (prefs == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("discord_hosts", 0);
            C9612q.m13918g(sharedPreferences, "context.getSharedPrefere…s\", Context.MODE_PRIVATE)");
            prefs = sharedPreferences;
        }
        if (str != null) {
            setAPI(str);
        }
        if (str2 != null) {
            setCDN(str2);
        }
    }
}
