package com.discord.chat.presentation.textutils;

import android.graphics.drawable.ColorDrawable;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmojiRendererKt$renderEmoji$1$1 extends AbstractC9614s implements Function1<GenericDraweeHierarchyBuilder, Unit> {
    final /* synthetic */ RenderContext $rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiRendererKt$renderEmoji$1$1(RenderContext renderContext) {
        super(1);
        this.$rc = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        invoke2(genericDraweeHierarchyBuilder);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(GenericDraweeHierarchyBuilder renderEmojiInto) {
        C9612q.m13917h(renderEmojiInto, "$this$renderEmojiInto");
        renderEmojiInto.m31456D(new ColorDrawable(0));
        renderEmojiInto.m31422z(0);
        if (this.$rc.spoilerExists()) {
            boolean spoilerIsRevealed = this.$rc.spoilerIsRevealed();
            DiscordTheme theme = ThemeManagerKt.getTheme();
            int spoilerRevealedBackground = spoilerIsRevealed ? theme.getSpoilerRevealedBackground() : theme.getSpoilerHiddenBackground();
            int spoilerHiddenBackground = spoilerIsRevealed ? 0 : ThemeManagerKt.getTheme().getSpoilerHiddenBackground();
            renderEmojiInto.m31424x(new ColorDrawable(spoilerRevealedBackground));
            renderEmojiInto.m31457C(new ColorDrawable(spoilerHiddenBackground));
        }
    }
}