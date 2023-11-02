package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.discord.chat.C2912R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class AudioPlayerView$bounceAnimator$2 extends AbstractC9614s implements Function0<Animation> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$bounceAnimator$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Animation invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.$context, C2912R.anim.bounce);
        loadAnimation.setDuration(100L);
        loadAnimation.start();
        return loadAnimation;
    }
}