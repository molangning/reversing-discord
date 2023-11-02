package p278p4;

import android.app.ActivityManager;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;

/* renamed from: p4.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11399j implements Supplier<MemoryCacheParams> {
    private static final int MAX_CACHE_ENTRIES = 256;
    private static final int MAX_CACHE_ENTRY_SIZE = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_ENTRIES = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_SIZE = Integer.MAX_VALUE;
    private static final long PARAMS_CHECK_INTERVAL_MS = TimeUnit.MINUTES.toMillis(5);
    private final ActivityManager mActivityManager;

    public C11399j(ActivityManager activityManager) {
        this.mActivityManager = activityManager;
    }

    private int getMaxCacheSize() {
        int min = Math.min(this.mActivityManager.getMemoryClass() * 1048576, (int) ViewDefaults.NUMBER_OF_LINES);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        return min / 4;
    }

    @Override // com.facebook.common.internal.Supplier
    public MemoryCacheParams get() {
        return new MemoryCacheParams(getMaxCacheSize(), MAX_CACHE_ENTRIES, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, PARAMS_CHECK_INTERVAL_MS);
    }
}