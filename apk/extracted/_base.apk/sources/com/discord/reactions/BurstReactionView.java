package com.discord.reactions;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.core.graphics.C0995a;
import com.discord.SetTextSizeSpKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.reactions.ReactionView;
import com.discord.reactions.databinding.ReactionViewBinding;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p068dg.C5838c;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001f"}, m14357d2 = {"Lcom/discord/reactions/BurstReactionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/reactions/databinding/ReactionViewBinding;", "currentCount", "", "Ljava/lang/Integer;", "currentEmojiId", "", "currentShouldAnimate", "", "Ljava/lang/Boolean;", "configureBackground", "", "isMe", "palette", "Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "configureCount", "count", "animate", "configureTextColor", "setReaction", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "BurstColorPalette", "ThemedBurstColorPalette", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class BurstReactionView extends LinearLayout {
    private final ReactionViewBinding binding;
    private Integer currentCount;
    private String currentEmojiId;
    private Boolean currentShouldAnimate;

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "", "accentColor", "", "getAccentColor", "()Ljava/lang/String;", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "highlightColor", "getHighlightColor", ViewProps.OPACITY, "", "getOpacity", "()F", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public interface BurstColorPalette {
        String getAccentColor();

        String getBackgroundColor();

        String getHighlightColor();

        float getOpacity();
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, m14357d2 = {"Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "", "dark", "Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "getDark", "()Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "light", "getLight", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public interface ThemedBurstColorPalette {
        BurstColorPalette getDark();

        BurstColorPalette getLight();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BurstReactionView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ BurstReactionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void configureBackground(boolean z, BurstColorPalette burstColorPalette) {
        Integer num;
        Integer num2;
        int backgroundSecondary;
        int colorCompat;
        String accentColor;
        String backgroundColor;
        int i = 255;
        if (burstColorPalette != null) {
            i = C5838c.m24388b(burstColorPalette.getOpacity() * 255);
        }
        Integer num3 = null;
        if (burstColorPalette != null && (backgroundColor = burstColorPalette.getBackgroundColor()) != null) {
            num = Integer.valueOf(C0995a.m38177k(Color.parseColor(backgroundColor), i));
        } else {
            num = null;
        }
        if (burstColorPalette != null && (accentColor = burstColorPalette.getAccentColor()) != null) {
            num2 = Integer.valueOf(Color.parseColor(accentColor));
        } else {
            num2 = null;
        }
        if (num != null) {
            backgroundSecondary = num.intValue();
        } else if (z) {
            Context context = getContext();
            C9612q.m13918g(context, "context");
            backgroundSecondary = ColorUtilsKt.getColorCompat(context, C3428R.color.brand_new_500_alpha_20);
        } else {
            backgroundSecondary = ThemeManagerKt.getTheme().getBackgroundSecondary();
        }
        if (z) {
            if (num2 != null) {
                colorCompat = num2.intValue();
            } else {
                Context context2 = getContext();
                C9612q.m13918g(context2, "context");
                colorCompat = ColorUtilsKt.getColorCompat(context2, C3428R.color.brand_560);
            }
            num3 = Integer.valueOf(colorCompat);
        }
        ReactionView.Companion companion = ReactionView.Companion;
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, backgroundSecondary, companion.getCORNER_RADIUS(), num3, companion.getSTROKE_WIDTH());
    }

    private final void configureCount(int i, boolean z) {
        int i2;
        TextSwitcher textSwitcher = this.binding.reactionCountSwitcher;
        if (z) {
            Integer num = this.currentCount;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            if (i > i2) {
                textSwitcher.setInAnimation(textSwitcher.getContext(), C3428R.anim.anim_slide_in_up);
                textSwitcher.setOutAnimation(textSwitcher.getContext(), C3428R.anim.anim_slide_out_up);
            } else {
                textSwitcher.setInAnimation(textSwitcher.getContext(), C3428R.anim.anim_slide_in_down);
                textSwitcher.setOutAnimation(textSwitcher.getContext(), C3428R.anim.anim_slide_out_down);
            }
            textSwitcher.setText(String.valueOf(i));
        } else {
            textSwitcher.setCurrentText(String.valueOf(i));
        }
        this.currentCount = Integer.valueOf(i);
    }

    private final void configureTextColor(BurstColorPalette burstColorPalette) {
        int interactiveNormal;
        String accentColor;
        if (burstColorPalette != null && (accentColor = burstColorPalette.getAccentColor()) != null) {
            interactiveNormal = Color.parseColor(accentColor);
        } else {
            interactiveNormal = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        this.binding.reactionEmoji.setTextColor(interactiveNormal);
        this.binding.reactionCount1.setTextColor(interactiveNormal);
        this.binding.reactionCount2.setTextColor(interactiveNormal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r4 != r5.intValue()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setReaction(com.discord.reactions.ReactionView.Reaction r11) {
        /*
            r10 = this;
            java.lang.String r0 = "reaction"
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            com.discord.reactions.databinding.ReactionViewBinding r0 = r10.binding
            android.view.View r0 = r0.getRoot()
            com.discord.reactions.ReactionView$Emoji r1 = r11.getEmoji()
            java.lang.String r1 = r1.getDisplayName()
            r0.setContentDescription(r1)
            java.lang.String r0 = r10.currentEmojiId
            com.discord.reactions.ReactionView$Emoji r1 = r11.getEmoji()
            java.lang.String r1 = r1.getEmojiId()
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3e
            java.lang.Boolean r0 = r10.currentShouldAnimate
            com.discord.reactions.ReactionView$Emoji r3 = r11.getEmoji()
            boolean r3 = r3.getShouldAnimate()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r3)
            if (r0 == 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            int r3 = r11.getBurstCount()
            if (r0 == 0) goto L59
            java.lang.Integer r4 = r10.currentCount
            if (r4 == 0) goto L59
            int r4 = r11.getBurstCount()
            java.lang.Integer r5 = r10.currentCount
            if (r5 != 0) goto L52
            goto L5a
        L52:
            int r5 = r5.intValue()
            if (r4 == r5) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            r10.configureCount(r3, r1)
            com.discord.theme.DiscordTheme r1 = com.discord.theme.ThemeManagerKt.getTheme()
            boolean r1 = r1 instanceof com.discord.theme.DarkTheme
            r2 = 0
            if (r1 == 0) goto L71
            com.discord.reactions.BurstReactionView$ThemedBurstColorPalette r1 = r11.getThemedBurstColors()
            if (r1 == 0) goto L7b
            com.discord.reactions.BurstReactionView$BurstColorPalette r2 = r1.getDark()
            goto L7b
        L71:
            com.discord.reactions.BurstReactionView$ThemedBurstColorPalette r1 = r11.getThemedBurstColors()
            if (r1 == 0) goto L7b
            com.discord.reactions.BurstReactionView$BurstColorPalette r2 = r1.getLight()
        L7b:
            boolean r1 = r11.isMeBurst()
            r10.configureBackground(r1, r2)
            r10.configureTextColor(r2)
            com.discord.reactions.ReactionView$Emoji r1 = r11.getEmoji()
            boolean r1 = r1.getShouldAnimate()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10.currentShouldAnimate = r1
            if (r0 == 0) goto L96
            return
        L96:
            com.discord.reactions.databinding.ReactionViewBinding r0 = r10.binding
            com.facebook.drawee.span.SimpleDraweeSpanTextView r0 = r0.reactionEmoji
            com.discord.reactions.ReactionView$Emoji r1 = r11.getEmoji()
            com.discord.emoji.RenderableEmoji r2 = r1.renderable()
            android.content.Context r3 = r10.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C9612q.m13918g(r3, r1)
            com.discord.reactions.ReactionView$Companion r1 = com.discord.reactions.ReactionView.Companion
            int r4 = r1.getEMOJI_SIZE()
            com.discord.reactions.ReactionView$Emoji r1 = r11.getEmoji()
            boolean r5 = r1.getShouldAnimate()
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            com.facebook.drawee.span.DraweeSpanStringBuilder r1 = com.discord.emoji.RenderableEmojiKt.renderEmoji$default(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.setDraweeSpanStringBuilder(r1)
            com.discord.reactions.ReactionView$Emoji r11 = r11.getEmoji()
            java.lang.String r11 = r11.getEmojiId()
            r10.currentEmojiId = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.reactions.BurstReactionView.setReaction(com.discord.reactions.ReactionView$Reaction):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurstReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        ReactionViewBinding inflate = ReactionViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        setOrientation(0);
        setGravity(16);
        ReactionView.Companion companion = ReactionView.Companion;
        setMinimumWidth(companion.getMINIMUM_WIDTH());
        setPadding(companion.getHORIZ_PADDING(), 0, companion.getHORIZ_PADDING(), 0);
        TextView textView = inflate.reactionCount1;
        C9612q.m13918g(textView, "binding.reactionCount1");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = inflate.reactionCount1;
        C9612q.m13918g(textView2, "binding.reactionCount1");
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f, 14.0f);
        TextView textView3 = inflate.reactionCount2;
        C9612q.m13918g(textView3, "binding.reactionCount2");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        TextView textView4 = inflate.reactionCount2;
        C9612q.m13918g(textView4, "binding.reactionCount2");
        SetTextSizeSpKt.setTextSizeSp(textView4, 14.0f, 14.0f);
        inflate.reactionCountSwitcher.setMeasureAllChildren(false);
    }
}
