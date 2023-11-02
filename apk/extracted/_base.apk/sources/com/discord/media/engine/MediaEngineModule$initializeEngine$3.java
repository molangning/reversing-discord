package com.discord.media.engine;

import com.discord.media.engine.video.events.ActiveSinksChangeEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "streamId", "", AppStateModule.APP_STATE_ACTIVE, "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaEngineModule$initializeEngine$3 extends AbstractC9614s implements Function2<String, Boolean, Unit> {
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$initializeEngine$3(MediaEngineModule mediaEngineModule) {
        super(2);
        this.this$0 = mediaEngineModule;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.f25302a;
    }

    public final void invoke(String streamId, boolean z) {
        ReactEvents reactEvents;
        C9612q.m13917h(streamId, "streamId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new ActiveSinksChangeEvent(streamId, z));
    }
}
