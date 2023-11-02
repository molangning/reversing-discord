package com.discord.cache;

import android.content.Context;
import com.discord.tti_manager.TTIMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CacheModule$Companion$quickInitCache$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ Context $applicationContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheModule$Companion$quickInitCache$1(Context context) {
        super(0);
        this.$applicationContext = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
        TTIMetrics.record$default(tTIMetrics, "CacheStorage Init Start", 0L, null, false, 14, null);
        this.$applicationContext.getSharedPreferences("CacheStore", 0).getString("hydrate", null);
        TTIMetrics.record$default(tTIMetrics, "CacheStorage Init End", 0L, null, false, 14, null);
        CacheModule.cacheLoaded = true;
    }
}
