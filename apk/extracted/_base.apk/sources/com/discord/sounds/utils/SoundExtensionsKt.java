package com.discord.sounds.utils;

import android.content.Context;
import android.net.Uri;
import com.discord.sounds.SoundManager;
import java.io.File;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.C9824m0;
import p340sf.C12466c;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a@\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\rH\u0000¨\u0006\u0010"}, m14357d2 = {"Landroid/content/Context;", "Ljava/io/File;", "getSoundsCacheDirectory", "", "tryPruneSoundsCache", "", "url", "getRemoteSoundFilename", "Lcom/discord/sounds/SoundManager;", "soundManager", "", "key", "usage", "Lkotlin/Function1;", "soundResIdPrepared", "fetchSound", "sounds_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SoundExtensionsKt {
    public static final void fetchSound(Context context, String url, SoundManager soundManager, int i, int i2, Function1<? super Integer, Unit> soundResIdPrepared) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(url, "url");
        C9612q.m13917h(soundManager, "soundManager");
        C9612q.m13917h(soundResIdPrepared, "soundResIdPrepared");
        tryPruneSoundsCache(context);
        C9810j.m13193d(C9824m0.m13173b(), C9677b1.m13569b(), null, new SoundExtensionsKt$fetchSound$1(context, url, getRemoteSoundFilename(url), getSoundsCacheDirectory(context), soundManager, i, i2, soundResIdPrepared, null), 2, null);
    }

    public static final String getRemoteSoundFilename(String url) {
        C9612q.m13917h(url, "url");
        String lastPathSegment = Uri.parse(url).getLastPathSegment();
        return lastPathSegment + ".mp3";
    }

    public static final File getSoundsCacheDirectory(Context context) {
        C9612q.m13917h(context, "<this>");
        return new File(context.getCacheDir(), "sounds");
    }

    public static final void tryPruneSoundsCache(Context context) {
        Object m14216d0;
        C9612q.m13917h(context, "<this>");
        File[] listFiles = getSoundsCacheDirectory(context).listFiles();
        if (listFiles != null && listFiles.length >= 20) {
            C9536e.m14260r(listFiles, new Comparator() { // from class: com.discord.sounds.utils.SoundExtensionsKt$tryPruneSoundsCache$$inlined$compareByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int m5209d;
                    m5209d = C12466c.m5209d(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t).lastModified()));
                    return m5209d;
                }
            });
            m14216d0 = C9538f.m14216d0(listFiles);
            File file = (File) m14216d0;
            if (file != null) {
                file.delete();
            }
        }
    }
}
