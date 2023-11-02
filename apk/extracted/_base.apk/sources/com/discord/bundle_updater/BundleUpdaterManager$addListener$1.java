package com.discord.bundle_updater;

import com.discord.bundle_updater.react.events.BundleDownloadedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "versionRequired", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class BundleUpdaterManager$addListener$1 extends AbstractC9614s implements Function1<Boolean, Unit> {
    final /* synthetic */ BundleUpdaterManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager$addListener$1(BundleUpdaterManager bundleUpdaterManager) {
        super(1);
        this.this$0 = bundleUpdaterManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f25302a;
    }

    public final void invoke(boolean z) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new BundleDownloadedEvent(z));
    }
}
