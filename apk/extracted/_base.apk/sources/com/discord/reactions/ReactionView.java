package com.discord.reactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.SetTextSizeSpKt;
import com.discord.emoji.RenderableEmoji;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.reactions.BurstReactionView;
import com.discord.reactions.databinding.ReactionViewBinding;
import com.discord.recycler_view.ids.IdUtilsKt;
import com.discord.recycler_view.utils.ItemDiffableType;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001d\u001e\u001f B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006!"}, m14357d2 = {"Lcom/discord/reactions/ReactionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/reactions/databinding/ReactionViewBinding;", "currentCount", "", "Ljava/lang/Integer;", "currentEmojiId", "", "currentShouldAnimate", "", "Ljava/lang/Boolean;", "configureBackground", "", "isMe", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "configureCount", "count", "animate", "configureTextColor", "setReaction", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "Companion", "Emoji", "Reaction", "ReactionsTheme", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ReactionView extends LinearLayout {
    private final ReactionViewBinding binding;
    private Integer currentCount;
    private String currentEmojiId;
    private Boolean currentShouldAnimate;
    public static final Companion Companion = new Companion(null);
    private static final int STROKE_WIDTH = SizeUtilsKt.getDpToPx(1);
    private static final int MINIMUM_WIDTH = SizeUtilsKt.getDpToPx(40);
    private static final int HORIZ_PADDING = SizeUtilsKt.getDpToPx(6);
    private static final int EMOJI_SIZE = SizeUtilsKt.getDpToPx(16);
    private static final int CORNER_RADIUS = SizeUtilsKt.getDpToPx(6);

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/reactions/ReactionView$Companion;", "", "()V", "CORNER_RADIUS", "", "getCORNER_RADIUS", "()I", "EMOJI_SIZE", "getEMOJI_SIZE", "HORIZ_PADDING", "getHORIZ_PADDING", "MINIMUM_WIDTH", "getMINIMUM_WIDTH", "STROKE_WIDTH", "getSTROKE_WIDTH", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCORNER_RADIUS() {
            return ReactionView.CORNER_RADIUS;
        }

        public final int getEMOJI_SIZE() {
            return ReactionView.EMOJI_SIZE;
        }

        public final int getHORIZ_PADDING() {
            return ReactionView.HORIZ_PADDING;
        }

        public final int getMINIMUM_WIDTH() {
            return ReactionView.MINIMUM_WIDTH;
        }

        public final int getSTROKE_WIDTH() {
            return ReactionView.STROKE_WIDTH;
        }
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/reactions/ReactionView$Emoji;", "", "animated", "", "getAnimated", "()Ljava/lang/Boolean;", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "emojiId", "getEmojiId", "id", "getId", ZeroconfModule.KEY_SERVICE_NAME, "getName", "shouldAnimate", "getShouldAnimate", "()Z", "src", "getSrc", "renderable", "Lcom/discord/emoji/RenderableEmoji;", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public interface Emoji {

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class DefaultImpls {
            public static String getEmojiId(Emoji emoji) {
                String id2 = emoji.getId();
                return id2 == null ? emoji.getName() : id2;
            }

            public static boolean getShouldAnimate(Emoji emoji) {
                Boolean animated = emoji.getAnimated();
                if (animated != null) {
                    return animated.booleanValue();
                }
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
                r0 = kotlin.text.C9652n.m13767o(r0);
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static com.discord.emoji.RenderableEmoji renderable(com.discord.reactions.ReactionView.Emoji r5) {
                /*
                    java.lang.String r0 = r5.getId()
                    if (r0 == 0) goto L21
                    java.lang.Long r0 = kotlin.text.C9642f.m13800o(r0)
                    if (r0 == 0) goto L21
                    long r0 = r0.longValue()
                    com.discord.emoji.RenderableEmoji$Companion r2 = com.discord.emoji.RenderableEmoji.Companion
                    boolean r3 = r5.getShouldAnimate()
                    java.lang.String r4 = r5.getDisplayName()
                    com.discord.emoji.RenderableEmoji$CustomWithEmojiId r0 = r2.customWithEmojiId(r0, r3, r4)
                    if (r0 == 0) goto L21
                    goto L2f
                L21:
                    com.discord.emoji.RenderableEmoji$Companion r0 = com.discord.emoji.RenderableEmoji.Companion
                    java.lang.String r5 = r5.getName()
                    if (r5 != 0) goto L2b
                    java.lang.String r5 = ""
                L2b:
                    com.discord.emoji.RenderableEmoji$Unicode r0 = r0.unicode(r5)
                L2f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.reactions.ReactionView.Emoji.DefaultImpls.renderable(com.discord.reactions.ReactionView$Emoji):com.discord.emoji.RenderableEmoji");
            }
        }

        Boolean getAnimated();

        String getDisplayName();

        String getEmojiId();

        String getId();

        String getName();

        boolean getShouldAnimate();

        String getSrc();

        RenderableEmoji renderable();
    }

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/reactions/ReactionView$Reaction;", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "burstCount", "", "getBurstCount", "()I", "count", "getCount", "emoji", "Lcom/discord/reactions/ReactionView$Emoji;", "getEmoji", "()Lcom/discord/reactions/ReactionView$Emoji;", "isMe", "", "()Z", "isMeBurst", "itemId", "", "getItemId", "()Ljava/lang/Long;", "themedBurstColors", "Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "getThemedBurstColors", "()Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;", "isBurstReaction", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public interface Reaction extends ItemDiffableType {

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class DefaultImpls {
            public static Long getItemId(Reaction reaction) {
                String emojiId = reaction.getEmoji().getEmojiId();
                boolean isBurstReaction = reaction.isBurstReaction();
                return Long.valueOf(IdUtilsKt.convertToId(emojiId + "_" + isBurstReaction));
            }

            public static boolean isBurstReaction(Reaction reaction) {
                return reaction.getBurstCount() > 0;
            }
        }

        int getBurstCount();

        int getCount();

        Emoji getEmoji();

        @Override // com.discord.recycler_view.utils.ItemDiffableType
        Long getItemId();

        BurstReactionView.ThemedBurstColorPalette getThemedBurstColors();

        boolean isBurstReaction();

        boolean isMe();

        boolean isMeBurst();
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/reactions/ReactionView$ReactionsTheme;", "", "activeReactionBackgroundColor", "", "getActiveReactionBackgroundColor", "()Ljava/lang/Integer;", "activeReactionBorderColor", "getActiveReactionBorderColor", "activeReactionTextColor", "getActiveReactionTextColor", "reactionBackgroundColor", "getReactionBackgroundColor", "reactionBorderColor", "getReactionBorderColor", "reactionTextColor", "getReactionTextColor", "reactions_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public interface ReactionsTheme {
        Integer getActiveReactionBackgroundColor();

        Integer getActiveReactionBorderColor();

        Integer getActiveReactionTextColor();

        Integer getReactionBackgroundColor();

        Integer getReactionBorderColor();

        Integer getReactionTextColor();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ReactionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void configureBackground(boolean z, ReactionsTheme reactionsTheme) {
        int backgroundSecondary;
        Integer num;
        Integer reactionBackgroundColor;
        int colorCompat;
        int colorCompat2;
        Integer activeReactionBorderColor;
        Integer activeReactionBackgroundColor;
        if (z) {
            if (reactionsTheme != null && (activeReactionBackgroundColor = reactionsTheme.getActiveReactionBackgroundColor()) != null) {
                colorCompat = activeReactionBackgroundColor.intValue();
            } else {
                Context context = getContext();
                C9612q.m13918g(context, "context");
                colorCompat = ColorUtilsKt.getColorCompat(context, C3428R.color.brand_new_500_alpha_20);
            }
            int i = CORNER_RADIUS;
            if (reactionsTheme != null && (activeReactionBorderColor = reactionsTheme.getActiveReactionBorderColor()) != null) {
                colorCompat2 = activeReactionBorderColor.intValue();
            } else {
                Context context2 = getContext();
                C9612q.m13918g(context2, "context");
                colorCompat2 = ColorUtilsKt.getColorCompat(context2, C3428R.color.brand_560);
            }
            ViewBackgroundUtilsKt.setBackgroundRectangle(this, colorCompat, i, Integer.valueOf(colorCompat2), STROKE_WIDTH);
            return;
        }
        if (reactionsTheme != null && (reactionBackgroundColor = reactionsTheme.getReactionBackgroundColor()) != null) {
            backgroundSecondary = reactionBackgroundColor.intValue();
        } else {
            backgroundSecondary = ThemeManagerKt.getTheme().getBackgroundSecondary();
        }
        if (reactionsTheme != null) {
            num = reactionsTheme.getReactionBorderColor();
        } else {
            num = null;
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle(this, backgroundSecondary, CORNER_RADIUS, num, STROKE_WIDTH);
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

    private final void configureTextColor(boolean z, ReactionsTheme reactionsTheme) {
        int interactiveNormal;
        Integer reactionTextColor;
        Integer activeReactionTextColor;
        if (z) {
            if (reactionsTheme != null && (activeReactionTextColor = reactionsTheme.getActiveReactionTextColor()) != null) {
                interactiveNormal = activeReactionTextColor.intValue();
            } else {
                interactiveNormal = ThemeManagerKt.getTheme().getInteractiveActive();
            }
        } else if (reactionsTheme != null && (reactionTextColor = reactionsTheme.getReactionTextColor()) != null) {
            interactiveNormal = reactionTextColor.intValue();
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
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setReaction(com.discord.reactions.ReactionView.Reaction r10, com.discord.reactions.ReactionView.ReactionsTheme r11) {
        /*
            r9 = this;
            java.lang.String r0 = "reaction"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            com.discord.reactions.databinding.ReactionViewBinding r0 = r9.binding
            android.view.View r0 = r0.getRoot()
            com.discord.reactions.ReactionView$Emoji r1 = r10.getEmoji()
            java.lang.String r1 = r1.getDisplayName()
            r0.setContentDescription(r1)
            java.lang.String r0 = r9.currentEmojiId
            com.discord.reactions.ReactionView$Emoji r1 = r10.getEmoji()
            java.lang.String r1 = r1.getEmojiId()
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3e
            java.lang.Boolean r0 = r9.currentShouldAnimate
            com.discord.reactions.ReactionView$Emoji r3 = r10.getEmoji()
            boolean r3 = r3.getShouldAnimate()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r3)
            if (r0 == 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            int r3 = r10.getCount()
            if (r0 == 0) goto L59
            java.lang.Integer r4 = r9.currentCount
            if (r4 == 0) goto L59
            int r4 = r10.getCount()
            java.lang.Integer r5 = r9.currentCount
            if (r5 != 0) goto L52
            goto L5a
        L52:
            int r5 = r5.intValue()
            if (r4 == r5) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            r9.configureCount(r3, r1)
            boolean r1 = r10.isMe()
            r9.configureBackground(r1, r11)
            boolean r1 = r10.isMe()
            r9.configureTextColor(r1, r11)
            com.discord.reactions.ReactionView$Emoji r11 = r10.getEmoji()
            boolean r11 = r11.getShouldAnimate()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r9.currentShouldAnimate = r11
            if (r0 == 0) goto L7c
            return
        L7c:
            com.discord.reactions.databinding.ReactionViewBinding r11 = r9.binding
            com.facebook.drawee.span.SimpleDraweeSpanTextView r11 = r11.reactionEmoji
            com.discord.reactions.ReactionView$Emoji r0 = r10.getEmoji()
            com.discord.emoji.RenderableEmoji r1 = r0.renderable()
            android.content.Context r2 = r9.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9612q.m13918g(r2, r0)
            int r3 = com.discord.reactions.ReactionView.EMOJI_SIZE
            com.discord.reactions.ReactionView$Emoji r0 = r10.getEmoji()
            boolean r4 = r0.getShouldAnimate()
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            com.facebook.drawee.span.DraweeSpanStringBuilder r0 = com.discord.emoji.RenderableEmojiKt.renderEmoji$default(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.setDraweeSpanStringBuilder(r0)
            com.discord.reactions.ReactionView$Emoji r10 = r10.getEmoji()
            java.lang.String r10 = r10.getEmojiId()
            r9.currentEmojiId = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.reactions.ReactionView.setReaction(com.discord.reactions.ReactionView$Reaction, com.discord.reactions.ReactionView$ReactionsTheme):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        ReactionViewBinding inflate = ReactionViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        setOrientation(0);
        setGravity(16);
        setMinimumWidth(MINIMUM_WIDTH);
        int i = HORIZ_PADDING;
        setPadding(i, 0, i, 0);
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
