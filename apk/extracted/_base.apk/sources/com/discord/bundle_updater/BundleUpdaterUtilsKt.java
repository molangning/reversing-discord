package com.discord.bundle_updater;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;
import p355ti.C12785a;
import p467zf.C14180c;
import p467zf.C14202q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m14357d2 = {"getManifestFromAsset", "Lcom/discord/bundle_updater/AppManifest;", "Landroid/content/res/AssetManager;", "asset", "", "bundle_updater_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BundleUpdaterUtilsKt {
    public static final AppManifest getManifestFromAsset(AssetManager assetManager, String asset) {
        BufferedReader bufferedReader;
        C9612q.m13917h(assetManager, "<this>");
        C9612q.m13917h(asset, "asset");
        InputStream open = assetManager.open(asset);
        C9612q.m13918g(open, "open(asset)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, C12785a.f33142b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            Json.C9954a c9954a = Json.f25830d;
            String m469e = C14202q.m469e(bufferedReader);
            c9954a.mo265a();
            AppManifest appManifest = (AppManifest) c9954a.mo232b(AppManifest.Companion.serializer(), m469e);
            C14180c.m514a(bufferedReader, null);
            return appManifest;
        } finally {
        }
    }
}
