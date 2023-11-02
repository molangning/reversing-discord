package com.discord.media.engine;

import com.discord.media.engine.video.events.NoInputCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "input", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaEngineModule$initializeEngine$1 extends AbstractC9614s implements Function1<Boolean, Unit> {
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$initializeEngine$1(MediaEngineModule mediaEngineModule) {
        super(1);
        this.this$0 = mediaEngineModule;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f25302a;
    }

    public final void invoke(boolean z) {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new NoInputCallbackEvent(z));
    }
}
