package com.discord.media.engine;

import com.discord.media.engine.video.events.UserSpeakingEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m14357d2 = {"<anonymous>", "", "userId", "", "isSpeaking", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngineModule$addConnectionCallbacks$1 extends AbstractC9614s implements Function2<String, Integer, Unit> {
    final /* synthetic */ int $connectionId;
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$addConnectionCallbacks$1(MediaEngineModule mediaEngineModule, int i) {
        super(2);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke(str, num.intValue());
        return Unit.f25302a;
    }

    public final void invoke(String userId, int i) {
        ReactEvents reactEvents;
        C9612q.m13917h(userId, "userId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new UserSpeakingEvent(this.$connectionId, userId, i));
    }
}
