package com.discord.notifications.renderer.utils;

import com.discord.notifications.api.NotificationData;
import com.discord.react_strings.RenderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationDataUtilsKt$getContent$1 extends AbstractC9614s implements Function1<RenderContext, Unit> {
    final /* synthetic */ NotificationData $this_getContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDataUtilsKt$getContent$1(NotificationData notificationData) {
        super(1);
        this.$this_getContent = notificationData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RenderContext i18nFormat) {
        C9612q.m13917h(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("user", this.$this_getContent.getUserUsername());
        i18nFormat.getArgs().put("game", this.$this_getContent.getMessageApplicationName());
    }
}
