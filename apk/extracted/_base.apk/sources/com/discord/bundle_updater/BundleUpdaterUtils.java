package com.discord.bundle_updater;

import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;
import okio.BufferedSource;
import p122gk.C6836j;
import p122gk.C6840m;
import p467zf.C14180c;
import p467zf.C14196l;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/bundle_updater/BundleUpdaterUtils;", "", "()V", "compareJSONData", "", "Lkotlin/Pair;", "", "Lcom/discord/bundle_updater/AssetStatus;", "apkManifest", "Lcom/discord/bundle_updater/AppManifest;", "oldManifest", "newManifest", "getManifestFromFile", JSStackTrace.FILE_KEY, "Ljava/io/File;", "md5", "bundle_updater_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BundleUpdaterUtils {
    public static final BundleUpdaterUtils INSTANCE = new BundleUpdaterUtils();

    private BundleUpdaterUtils() {
    }

    public final List<Pair<String, AssetStatus>> compareJSONData(AppManifest apkManifest, AppManifest appManifest, AppManifest newManifest) {
        List<Pair<String, AssetStatus>> m14075C0;
        AssetStatus assetStatus;
        Pair m7577a;
        C9612q.m13917h(apkManifest, "apkManifest");
        C9612q.m13917h(newManifest, "newManifest");
        Set<String> keySet = newManifest.getHashes().keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : keySet) {
            String str2 = newManifest.getHashes().get(str);
            if (C9612q.m13922c(str2, apkManifest.getHashes().get(str))) {
                m7577a = null;
            } else {
                if (appManifest != null && C9612q.m13922c(str2, appManifest.getHashes().get(str))) {
                    assetStatus = AssetStatus.CopyFromPrevious;
                } else {
                    assetStatus = AssetStatus.Download;
                }
                m7577a = C11591x.m7577a(str, assetStatus);
            }
            if (m7577a != null) {
                arrayList.add(m7577a);
            }
        }
        m14075C0 = C9553r.m14075C0(arrayList);
        return m14075C0;
    }

    public final AppManifest getManifestFromFile(File file) {
        String m487d;
        C9612q.m13917h(file, "file");
        Json.C9954a c9954a = Json.f25830d;
        m487d = C14196l.m487d(file, null, 1, null);
        c9954a.mo265a();
        return (AppManifest) c9954a.mo232b(AppManifest.Companion.serializer(), m487d);
    }

    public final String md5(File file) {
        C9612q.m13917h(file, "file");
        BufferedSource m21829d = C6840m.m21829d(C6840m.m21822k(file));
        try {
            C6836j m21836a = C6836j.f19046m.m21836a(C6840m.m21831b());
            m21829d.mo8583u0(m21836a);
            String mo8562l = m21836a.m21837a().mo8562l();
            C14180c.m514a(m21829d, null);
            return mo8562l;
        } finally {
        }
    }
}
