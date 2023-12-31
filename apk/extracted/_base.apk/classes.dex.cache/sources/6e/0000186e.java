package com.discord.image.fresco.config;

import android.content.Context;
import com.facebook.cache.disk.DiskCacheConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\n\u0010\f\u001a\u00020\t*\u00020\nJ\n\u0010\r\u001a\u00020\t*\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/image/fresco/config/FrescoDiskCache;", "", "()V", "CACHE_DIR", "", "CACHE_DIR_SMALL", "MAX_DISK_CACHE_SIZE", "", "newDiskCacheConfig", "Lcom/facebook/cache/disk/DiskCacheConfig;", "Landroid/content/Context;", "directoryName", "newRegularDiskCache", "newSmallDiskCache", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FrescoDiskCache {
    private static final String CACHE_DIR = "app_images_cache";
    private static final String CACHE_DIR_SMALL = "app_images_cache_small";
    public static final FrescoDiskCache INSTANCE = new FrescoDiskCache();
    private static final long MAX_DISK_CACHE_SIZE = 62914560;

    private FrescoDiskCache() {
    }

    private final DiskCacheConfig newDiskCacheConfig(Context context, String str) {
        DiskCacheConfig m31735n = DiskCacheConfig.m31750m(context).m31733p(context.getCacheDir()).m31734o(str).m31732q(MAX_DISK_CACHE_SIZE).m31735n();
        C9612q.m13918g(m31735n, "newBuilder(this)\n       …IZE)\n            .build()");
        return m31735n;
    }

    public final DiskCacheConfig newRegularDiskCache(Context context) {
        C9612q.m13917h(context, "<this>");
        return newDiskCacheConfig(context, CACHE_DIR);
    }

    public final DiskCacheConfig newSmallDiskCache(Context context) {
        C9612q.m13917h(context, "<this>");
        return newDiskCacheConfig(context, CACHE_DIR_SMALL);
    }
}