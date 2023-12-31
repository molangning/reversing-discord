package com.discord.chat.presentation.message.decorations;

import android.graphics.drawable.PaintDrawable;
import com.discord.chat.C2912R;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Landroid/graphics/drawable/PaintDrawable;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class SpineDrawer$lineDrawable$2 extends AbstractC9614s implements Function0<PaintDrawable> {
    final /* synthetic */ SpineDrawer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpineDrawer$lineDrawable$2(SpineDrawer spineDrawer) {
        super(0);
        this.this$0 = spineDrawer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaintDrawable invoke() {
        PaintDrawable paintDrawable = new PaintDrawable(ThemeManagerKt.getTheme().getBackgroundAccent());
        paintDrawable.setIntrinsicWidth(this.this$0.getContext().getResources().getDimensionPixelSize(C2912R.dimen.spine_width));
        return paintDrawable;
    }
}
