package com.discord.chat.bridge.spoiler;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "spoilerId", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "invoke-V2PEE7g", "(Ljava/lang/String;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerAttributes$configure$3$2 extends AbstractC9614s implements Function1<SpoilerIdentifier, Unit> {
    final /* synthetic */ Function0<Unit> $onTapSpoiler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerAttributes$configure$3$2(Function0<Unit> function0) {
        super(1);
        this.$onTapSpoiler = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SpoilerIdentifier spoilerIdentifier) {
        m41546invokeV2PEE7g(spoilerIdentifier.m41553unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-V2PEE7g */
    public final void m41546invokeV2PEE7g(String spoilerId) {
        C9612q.m13917h(spoilerId, "spoilerId");
        SpoilerManager.INSTANCE.m41557markHiddenV2PEE7g(spoilerId);
        this.$onTapSpoiler.invoke();
    }
}