package com.discord.image.fresco.config;

import com.facebook.imagepipeline.cache.MemoryCacheParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p278p4.C11399j;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m14357d2 = {"Lcom/discord/image/fresco/config/FrescoBitmapSupplier;", "Lp4/j;", "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;", "get", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FrescoBitmapSupplier extends C11399j {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BITMAP_MEM_CACHE_SIZE_RATIO = 3;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/image/fresco/config/FrescoBitmapSupplier$Companion;", "", "()V", "MAX_BITMAP_MEM_CACHE_SIZE_RATIO", "", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FrescoBitmapSupplier(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            kotlin.jvm.internal.C9612q.m13919f(r2, r0)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.image.fresco.config.FrescoBitmapSupplier.<init>(android.content.Context):void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p278p4.C11399j, com.facebook.common.internal.Supplier
    public MemoryCacheParams get() {
        MemoryCacheParams memoryCacheParams = super.get();
        int i = memoryCacheParams.f10275a;
        return new MemoryCacheParams(i, memoryCacheParams.f10276b, memoryCacheParams.f10277c, memoryCacheParams.f10278d, i / 3);
    }
}
