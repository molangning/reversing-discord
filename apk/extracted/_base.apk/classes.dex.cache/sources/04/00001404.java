package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.react_strings.RenderContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Lcom/discord/react_strings/RenderContext;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AudioPlayerView$configureDuration$2 extends AbstractC9614s implements Function1<RenderContext, Unit> {
    final /* synthetic */ int $durationSecs;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$configureDuration$2(AudioPlayerView audioPlayerView, int i) {
        super(1);
        this.this$0 = audioPlayerView;
        this.$durationSecs = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RenderContext renderContext) {
        invoke2(renderContext);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(RenderContext i18nFormat) {
        String timeRemainingAccessibilityText;
        C9612q.m13917h(i18nFormat, "$this$i18nFormat");
        Map<String, String> args = i18nFormat.getArgs();
        timeRemainingAccessibilityText = this.this$0.timeRemainingAccessibilityText(this.$durationSecs);
        args.put("duration", timeRemainingAccessibilityText);
    }
}