package com.discord.media.engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.media.engine.video.events.SpeedTestPingTimeoutCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, m14357d2 = {"<anonymous>", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "", "seq", "timeout", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngineModule$addSpeedTestConnectionCallbacks$2 extends AbstractC9614s implements Function4<String, Integer, Integer, Integer, Unit> {
    final /* synthetic */ int $connectionId;
    final /* synthetic */ MediaEngineModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule$addSpeedTestConnectionCallbacks$2(MediaEngineModule mediaEngineModule, int i) {
        super(4);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Integer num2, Integer num3) {
        invoke(str, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f25302a;
    }

    public final void invoke(String server, int i, int i2, int i3) {
        ReactEvents reactEvents;
        C9612q.m13917h(server, "server");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new SpeedTestPingTimeoutCallbackEvent(this.$connectionId, server, i, i2, i3));
    }
}
