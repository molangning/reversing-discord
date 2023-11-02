package com.discord.chat.reactevents;

import android.content.Context;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "event", "Lcom/discord/reactevents/ReactEvent;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatViewEventHandler$emitReactEvent$1 extends AbstractC9614s implements Function1<ReactEvent, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReactEvents $reactEvents;
    final /* synthetic */ Function0<Integer> $reactTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewEventHandler$emitReactEvent$1(ReactEvents reactEvents, Context context, Function0<Integer> function0) {
        super(1);
        this.$reactEvents = reactEvents;
        this.$context = context;
        this.$reactTag = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReactEvent reactEvent) {
        invoke2(reactEvent);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(ReactEvent event) {
        C9612q.m13917h(event, "event");
        this.$reactEvents.emitEvent(this.$context, event, this.$reactTag.invoke().intValue());
    }
}