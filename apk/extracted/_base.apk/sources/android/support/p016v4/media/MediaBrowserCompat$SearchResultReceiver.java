package android.support.p016v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p016v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p019b.C1960b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C1960b {
    @Override // p019b.C1960b
    /* renamed from: a */
    protected void mo34888a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m40884b(bundle);
        }
        if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
            throw null;
        }
        throw null;
    }
}
