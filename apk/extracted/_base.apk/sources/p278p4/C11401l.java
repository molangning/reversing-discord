package p278p4;

import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;

/* renamed from: p4.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11401l implements Supplier<MemoryCacheParams> {

    /* renamed from: a */
    private static final long f29698a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    private int m8145b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    @Override // com.facebook.common.internal.Supplier
    /* renamed from: a */
    public MemoryCacheParams get() {
        int m8145b = m8145b();
        return new MemoryCacheParams(m8145b, ViewDefaults.NUMBER_OF_LINES, m8145b, ViewDefaults.NUMBER_OF_LINES, m8145b / 8, f29698a);
    }
}
