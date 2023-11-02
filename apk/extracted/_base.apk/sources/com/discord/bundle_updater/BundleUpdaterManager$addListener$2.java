package com.discord.bundle_updater;

import com.discord.bundle_updater.BundleUpdater;
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "metrics", "", "Lcom/discord/bundle_updater/BundleUpdater$OtaMetric;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class BundleUpdaterManager$addListener$2 extends AbstractC9614s implements Function1<List<? extends BundleUpdater.OtaMetric>, Unit> {
    final /* synthetic */ BundleUpdaterManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager$addListener$2(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends BundleUpdater.OtaMetric> list) {
        invoke2(list);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends BundleUpdater.OtaMetric> metrics) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        C9612q.m13917h(metrics, "metrics");
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new OtaCheckAttemptEvent(metrics));
    }
}
