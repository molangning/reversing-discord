package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.discord.chat.C2912R;
import com.discord.theme.LightTheme;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import p071e.C6029a;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2 extends AbstractC9614s implements Function0<Drawable> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerWipeAnimatorManager$buttonContainerDefaultDrawable$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        int i;
        Context context = this.$context;
        if (ThemeManagerKt.getTheme() instanceof LightTheme) {
            i = C2912R.C2913drawable.drawable_audio_play_button_gradient_light;
        } else {
            i = C2912R.C2913drawable.drawable_audio_play_button_gradient_dark;
        }
        return C6029a.m23853b(context, i);
    }
}