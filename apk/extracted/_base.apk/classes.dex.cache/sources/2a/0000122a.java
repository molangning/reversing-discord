package com.discord.chat.presentation.list.delegate;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9609n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class LoadingDelegate$bindView$2 extends C9609n implements Function0<Unit> {
    public LoadingDelegate$bindView$2(Object obj) {
        super(0, obj, ChatEventHandler.class, "onTapLoadMessagesAfter", "onTapLoadMessagesAfter()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        ((ChatEventHandler) this.receiver).onTapLoadMessagesAfter();
    }
}