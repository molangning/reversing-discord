package com.discord.client_info;

import android.content.Context;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u001b\u0010\n\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\"\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011¨\u0006+"}, m14357d2 = {"Lcom/discord/client_info/ClientInfo;", "", "()V", "buildType", "", "flavor", "isDebugBuild", "", "()Z", "isDeveloperBuild", "isProdBuild", "isProdBuild$delegate", "Lkotlin/Lazy;", "otaManifestETag", "getOtaManifestETag", "()Ljava/lang/String;", "setOtaManifestETag", "(Ljava/lang/String;)V", "otaVersion", "getOtaVersion", "setOtaVersion", "packageName", "getPackageName", "setPackageName", "proguardUUID", "releaseChannel", "getReleaseChannel", "sentryAlphaBetaDsn", "sentryDsn", "sentryRelease", "sentryStaffDsn", "versionCode", "getVersionCode", "setVersionCode", "versionName", "getVersionName", "setVersionName", "init", "", "context", "Landroid/content/Context;", "", "otaManifest", "client_info_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ClientInfo {
    public static final ClientInfo INSTANCE = new ClientInfo();
    private static String buildType = null;
    private static String flavor = null;
    private static final Lazy isProdBuild$delegate;
    public static String otaManifestETag = null;
    public static String otaVersion = null;
    public static String packageName = null;
    public static final String proguardUUID = "c6863af5-b24b-4dea-a080-578859cf4dd3";
    public static final String sentryAlphaBetaDsn = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375";
    public static final String sentryDsn = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";
    public static final String sentryRelease = "discord_android@201.13.0-0+201013";
    public static final String sentryStaffDsn = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375";
    public static String versionCode;
    public static String versionName;

    static {
        Lazy m7601a;
        m7601a = C11577n.m7601a(ClientInfo$isProdBuild$2.INSTANCE);
        isProdBuild$delegate = m7601a;
    }

    private ClientInfo() {
    }

    public final String getOtaManifestETag() {
        String str = otaManifestETag;
        if (str != null) {
            return str;
        }
        C9612q.m13900y("otaManifestETag");
        return null;
    }

    public final String getOtaVersion() {
        String str = otaVersion;
        if (str != null) {
            return str;
        }
        C9612q.m13900y("otaVersion");
        return null;
    }

    public final String getPackageName() {
        String str = packageName;
        if (str != null) {
            return str;
        }
        C9612q.m13900y("packageName");
        return null;
    }

    public final String getReleaseChannel() {
        String str = flavor;
        String str2 = null;
        if (str == null) {
            C9612q.m13900y("flavor");
            str = null;
        }
        String str3 = buildType;
        if (str3 == null) {
            C9612q.m13900y("buildType");
        } else {
            str2 = str3;
        }
        if (str2.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String valueOf = String.valueOf(str2.charAt(0));
            C9612q.m13919f(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            C9612q.m13918g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb2.append((Object) upperCase);
            String substring = str2.substring(1);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            str2 = sb2.toString();
        }
        return str + str2;
    }

    public final String getVersionCode() {
        String str = versionCode;
        if (str != null) {
            return str;
        }
        C9612q.m13900y("versionCode");
        return null;
    }

    public final String getVersionName() {
        String str = versionName;
        if (str != null) {
            return str;
        }
        C9612q.m13900y("versionName");
        return null;
    }

    public final void init(Context context, String versionName2, int i, String flavor2, String buildType2, String otaManifest, String otaVersion2) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(versionName2, "versionName");
        C9612q.m13917h(flavor2, "flavor");
        C9612q.m13917h(buildType2, "buildType");
        C9612q.m13917h(otaManifest, "otaManifest");
        C9612q.m13917h(otaVersion2, "otaVersion");
        setVersionName(versionName2);
        setVersionCode(String.valueOf(i));
        setOtaManifestETag(otaManifest);
        setOtaVersion(otaVersion2);
        flavor = flavor2;
        buildType = buildType2;
        String packageName2 = context.getPackageName();
        C9612q.m13918g(packageName2, "context.packageName");
        setPackageName(packageName2);
        ClientUserAgent clientUserAgent = ClientUserAgent.INSTANCE;
        clientUserAgent.init(context, "Discord-Android/" + i + ";RNA");
    }

    public final boolean isDebugBuild() {
        String str = buildType;
        if (str == null) {
            C9612q.m13900y("buildType");
            str = null;
        }
        return C9612q.m13922c(str, "debug");
    }

    public final boolean isDeveloperBuild() {
        String str = flavor;
        if (str == null) {
            C9612q.m13900y("flavor");
            str = null;
        }
        return C9612q.m13922c(str, "developer");
    }

    public final boolean isProdBuild() {
        return ((Boolean) isProdBuild$delegate.getValue()).booleanValue();
    }

    public final void setOtaManifestETag(String str) {
        C9612q.m13917h(str, "<set-?>");
        otaManifestETag = str;
    }

    public final void setOtaVersion(String str) {
        C9612q.m13917h(str, "<set-?>");
        otaVersion = str;
    }

    public final void setPackageName(String str) {
        C9612q.m13917h(str, "<set-?>");
        packageName = str;
    }

    public final void setVersionCode(String str) {
        C9612q.m13917h(str, "<set-?>");
        versionCode = str;
    }

    public final void setVersionName(String str) {
        C9612q.m13917h(str, "<set-?>");
        versionName = str;
    }
}
