package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.graphics.C0995a;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.contentnode.BlockQuoteContentNode;
import com.discord.chat.bridge.contentnode.BulletListContentNode;
import com.discord.chat.bridge.contentnode.ChannelMentionContentNode;
import com.discord.chat.bridge.contentnode.ChannelNameContentNode;
import com.discord.chat.bridge.contentnode.CodeBlockContentNode;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.EmphasisContentNode;
import com.discord.chat.bridge.contentnode.ErrorContentNode;
import com.discord.chat.bridge.contentnode.GuildNameContentNode;
import com.discord.chat.bridge.contentnode.HeadingContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LineBreakContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.LinkContext;
import com.discord.chat.bridge.contentnode.MentionContentNode;
import com.discord.chat.bridge.contentnode.NewLineContentNode;
import com.discord.chat.bridge.contentnode.ParagraphContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.contentnode.SpoilerContentNode;
import com.discord.chat.bridge.contentnode.StaticChannelMentionContentNode;
import com.discord.chat.bridge.contentnode.StaticChannelMentionType;
import com.discord.chat.bridge.contentnode.StrikethroughContentNode;
import com.discord.chat.bridge.contentnode.StrongContentNode;
import com.discord.chat.bridge.contentnode.TextContentNode;
import com.discord.chat.bridge.contentnode.TimestampContentNode;
import com.discord.chat.bridge.contentnode.UnderlineContentNode;
import com.discord.chat.bridge.contentnode.UserNameOnClick;
import com.discord.chat.bridge.contentnode.UserOrRoleMentionContentNode;
import com.discord.chat.bridge.spoiler.SpoilerIdentifier;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.PrimitiveStructurableText;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.presentation.message.RoleDotSpan;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.crash_reporting.CrashReporting;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan;
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt;
import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import com.discord.span.utilities.spannable.BulletSpan;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.OrderedListBulletSpan;
import com.discord.span.utilities.spannable.QuoteSpan;
import com.discord.span.utilities.spannable.SpoilerSpan;
import com.discord.span.utilities.spannable.VerticalPaddingSpan;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.controller.AbstractC3591a;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.C3628a;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import p208l3.C10035c;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001aò\u0002\u0010)\u001a\u00020(*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2$\b\u0002\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00110\u00142,\b\u0002\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00110\u00162\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u000f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u000f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0002\u001a\"\u0010/\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(H\u0002\u001a$\u0010)\u001a\u00020(*\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020(H\u0002\u001a]\u00108\u001a\u00020\u0011*\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u00101\u001a\u00020\u00072\b\b\u0001\u00103\u001a\u0002022\b\b\u0001\u00104\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u0001022\b\b\u0002\u00106\u001a\u00020\u00022\b\b\u0002\u00107\u001a\u00020\u0002¢\u0006\u0004\b8\u00109\u001a*\u0010<\u001a\u00020\u0011*\u00020(2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020,2\u0006\u0010;\u001a\u00020\tH\u0002\u001a\u0012\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u001a\u0010@\u001a\u0002022\b\u0010=\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\u0002H\u0002\u001a\u0010\u0010A\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0007H\u0002\u001a\u0018\u0010D\u001a\u00020C2\u0006\u0010-\u001a\u00020,2\u0006\u0010B\u001a\u000202H\u0002\u001a\f\u0010E\u001a\u00020\u0011*\u00020(H\u0002\"\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010G¨\u0006I"}, m14357d2 = {"Landroid/graphics/Paint$FontMetrics;", "fontMetrics", "", "getBaselineHeight", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "Landroid/content/Context;", "context", "", "containerId", "", "animateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Landroid/graphics/Paint;", "paint", "Lkotlin/Function1;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "Lkotlin/Function2;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "linkStyle", "Lkotlin/Function0;", "onTapSpoiler", "singleLine", "Lcom/discord/theme/DiscordTheme;", "theme", "baselineHeight", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "toSpannable", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "Lcom/discord/chat/presentation/textutils/RenderContext;", "rc", "existingBuilder", "appendToExistingBuilder", "builder", "imageUrl", "", "width", "height", ViewProps.FOREGROUND_COLOR, "cornerRadius", "iconPadding", "appendImage", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FF)V", "content", "isOrderedList", "appendBulletPoint", "iconType", "", "getIconSizeMultiplier", "getIconSize", "getIconPaddingMultiplier", ViewProps.BACKGROUND_COLOR, "Lcom/discord/span/utilities/spannable/BackgroundSpan;", "makeMentionBackgroundSpan", "simulateInlineNewline", "CHANNEL_PREFIX", "Ljava/lang/String;", "COMMAND_PREFIX", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TextUtilsKt {
    private static final String CHANNEL_PREFIX = "#";
    private static final String COMMAND_PREFIX = "/";

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticChannelMentionType.values().length];
            try {
                iArr[StaticChannelMentionType.Home.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticChannelMentionType.Browse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StaticChannelMentionType.Customize.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void appendBulletPoint(DraweeSpanStringBuilder draweeSpanStringBuilder, List<? extends ContentNode> list, RenderContext renderContext, boolean z) {
        Paint.Style style;
        String str;
        List m14109d;
        long j;
        long j2;
        List m14109d2;
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        int listNestedLevel = renderContext.getListNestedLevel();
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(SizeUtilsKt.getDpToPx(listNestedLevel * 16));
        int dpToPx2 = SizeUtilsKt.getDpToPx(2);
        VerticalPaddingSpan verticalPaddingSpan = new VerticalPaddingSpan(dpToPx2);
        if (z) {
            Long listOrderedIndex = renderContext.getListOrderedIndex();
            if (listOrderedIndex != null) {
                j = listOrderedIndex.longValue();
            } else {
                j = 1;
            }
            Long listLargestOrderedIndex = renderContext.getListLargestOrderedIndex();
            if (listLargestOrderedIndex != null) {
                j2 = listLargestOrderedIndex.longValue();
            } else {
                j2 = 1;
            }
            if (renderContext.getSingleLine()) {
                m14109d2 = C9544i.m14109d(new TextContentNode(j + ".  "));
                appendToExistingBuilder(m14109d2, renderContext, draweeSpanStringBuilder);
                appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
                return;
            }
            Object[] objArr = {standard, new OrderedListBulletSpan(j, dpToPx, j2, renderContext.getPaint()), verticalPaddingSpan};
            int length = draweeSpanStringBuilder.length();
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
            SpannableStringBuilderExtensionsKt.ensureNewline(draweeSpanStringBuilder, new AbsoluteSizeSpan(dpToPx2));
            for (int i = 0; i < 3; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    draweeSpanStringBuilder.setSpan(obj, length, draweeSpanStringBuilder.length(), 33);
                }
            }
        } else if (renderContext.getSingleLine()) {
            if (renderContext.getListNestedLevel() == 0) {
                str = "•  ";
            } else {
                str = "◦  ";
            }
            m14109d = C9544i.m14109d(new TextContentNode(str));
            appendToExistingBuilder(m14109d, renderContext, draweeSpanStringBuilder);
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
        } else {
            int dpToPx3 = SizeUtilsKt.getDpToPx(2);
            int themeColor = ColorUtilsKt.getThemeColor(renderContext.getContext(), C2912R.color.primary_360, C2912R.color.primary_400, renderContext.getTheme());
            if (listNestedLevel > 0) {
                style = Paint.Style.STROKE;
            } else {
                style = Paint.Style.FILL;
            }
            Object[] objArr2 = {standard, new BulletSpan(themeColor, dpToPx, false, dpToPx3, 0.0f, style, 20, null), verticalPaddingSpan};
            int length2 = draweeSpanStringBuilder.length();
            appendToExistingBuilder(list, renderContext, draweeSpanStringBuilder);
            SpannableStringBuilderExtensionsKt.ensureNewline(draweeSpanStringBuilder, new AbsoluteSizeSpan(dpToPx2));
            for (int i2 = 0; i2 < 3; i2++) {
                Object obj2 = objArr2[i2];
                if (obj2 != null) {
                    draweeSpanStringBuilder.setSpan(obj2, length2, draweeSpanStringBuilder.length(), 33);
                }
            }
        }
    }

    public static final void appendImage(DraweeSpanStringBuilder draweeSpanStringBuilder, Context context, RenderContext rc, String imageUrl, int i, int i2, Integer num, float f, float f2) {
        C9612q.m13917h(draweeSpanStringBuilder, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(rc, "rc");
        C9612q.m13917h(imageUrl, "imageUrl");
        int length = draweeSpanStringBuilder.length();
        draweeSpanStringBuilder.append((char) 8203);
        AbstractC3591a build = C10035c.m12506g().m31625D(ImageRequestBuilder.m30567s(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(context, imageUrl))).m30585a()).build();
        C9612q.m13918g(build, "newDraweeControllerBuild…build())\n        .build()");
        GenericDraweeHierarchyBuilder m31425w = GenericDraweeHierarchyBuilder.m31427u(context.getResources()).m31425w(ScalingUtils.ScaleType.f9840e);
        C3628a m31421a = C3628a.m31421a(f);
        m31421a.m31404r(f2);
        m31421a.m31401u(C3628a.EnumC3629a.BITMAP_ONLY);
        m31425w.m31449K(m31421a);
        if (rc.spoilerIsHidden()) {
            m31425w.m31426v(new PorterDuffColorFilter(rc.getTheme().getSpoilerHiddenBackground(), PorterDuff.Mode.SRC_IN));
        } else if (num != null) {
            m31425w.m31426v(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
        C9612q.m13918g(m31425w, "newInstance(context.reso…)\n            }\n        }");
        draweeSpanStringBuilder.m31374j(context, m31425w.m31447a(), build, length, i, i2, false, 2);
    }

    public static /* synthetic */ void appendImage$default(DraweeSpanStringBuilder draweeSpanStringBuilder, Context context, RenderContext renderContext, String str, int i, int i2, Integer num, float f, float f2, int i3, Object obj) {
        appendImage(draweeSpanStringBuilder, context, renderContext, str, i, i2, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? 0.0f : f, (i3 & 128) != 0 ? 0.0f : f2);
    }

    private static final void appendToExistingBuilder(List<? extends ContentNode> list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        toSpannable(list, renderContext, draweeSpanStringBuilder);
    }

    public static final float getBaselineHeight(Paint.FontMetrics fontMetrics) {
        C9612q.m13917h(fontMetrics, "fontMetrics");
        return fontMetrics.descent - fontMetrics.ascent;
    }

    private static final float getIconPaddingMultiplier(String str) {
        boolean m13922c;
        if (C9612q.m13922c(str, "post")) {
            m13922c = true;
        } else {
            m13922c = C9612q.m13922c(str, "forum");
        }
        if (m13922c) {
            return 0.2f;
        }
        return 0.0f;
    }

    private static final int getIconSize(String str, float f) {
        int dpToPx = SizeUtilsKt.getDpToPx(20);
        if (f >= 0.0f) {
            return (int) (f * getIconSizeMultiplier(str));
        }
        return dpToPx;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001c A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double getIconSizeMultiplier(java.lang.String r2) {
        /*
            if (r2 == 0) goto L40
            int r0 = r2.hashCode()
            switch(r0) {
                case -1480766844: goto L31;
                case -1476485388: goto L22;
                case 3446944: goto L13;
                case 97619233: goto La;
                default: goto L9;
            }
        L9:
            goto L40
        La:
            java.lang.String r0 = "forum"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L40
        L13:
            java.lang.String r0 = "post"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L40
        L1c:
            r0 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            goto L42
        L22:
            java.lang.String r0 = "_guild"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L40
        L2b:
            r0 = 4605831338911806259(0x3feb333333333333, double:0.85)
            goto L42
        L31:
            java.lang.String r0 = "_caret"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
            goto L40
        L3a:
            r0 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            goto L42
        L40:
            r0 = 4604930618986332160(0x3fe8000000000000, double:0.75)
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.textutils.TextUtilsKt.getIconSizeMultiplier(java.lang.String):double");
    }

    private static final BackgroundSpan makeMentionBackgroundSpan(RenderContext renderContext, int i) {
        int i2;
        if (renderContext.spoilerExists()) {
            i = renderContext.getTheme().getSpoilerHiddenBackground();
        }
        if (renderContext.spoilerExists()) {
            i2 = 0;
        } else {
            i2 = 3;
        }
        return new BackgroundSpan(new BackgroundStyle(i, i2));
    }

    private static final void simulateInlineNewline(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        draweeSpanStringBuilder.append("    ");
    }

    public static final DraweeSpanStringBuilder toSpannable(StructurableText structurableText, Context context, String containerId, boolean z, boolean z2, boolean z3, Paint paint, Function1<? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLongTapLink, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super LinkContentNode, LinkStyle> linkStyle, Function0<Unit> onTapSpoiler, boolean z4, DiscordTheme theme, float f) {
        C9612q.m13917h(structurableText, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(containerId, "containerId");
        C9612q.m13917h(paint, "paint");
        C9612q.m13917h(onLinkClicked, "onLinkClicked");
        C9612q.m13917h(onLongTapLink, "onLongTapLink");
        C9612q.m13917h(onTapChannel, "onTapChannel");
        C9612q.m13917h(onLongPressChannel, "onLongPressChannel");
        C9612q.m13917h(onTapMention, "onTapMention");
        C9612q.m13917h(onTapCommand, "onTapCommand");
        C9612q.m13917h(onLongPressCommand, "onLongPressCommand");
        C9612q.m13917h(onTapTimestamp, "onTapTimestamp");
        C9612q.m13917h(onTapEmoji, "onTapEmoji");
        C9612q.m13917h(linkStyle, "linkStyle");
        C9612q.m13917h(onTapSpoiler, "onTapSpoiler");
        C9612q.m13917h(theme, "theme");
        if (structurableText instanceof AnnotatedStructurableText) {
            return toSpannable$default(((AnnotatedStructurableText) structurableText).getContent(), new RenderContext(context, containerId, onLinkClicked, onLongTapLink, linkStyle, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, z, z2, z3, z4, paint, null, 0, null, null, null, theme, f, null, 41680896, null), null, 2, null);
        }
        if (structurableText instanceof PrimitiveStructurableText) {
            return new DraweeSpanStringBuilder(((PrimitiveStructurableText) structurableText).getContent());
        }
        throw new C11581q();
    }

    public static /* synthetic */ DraweeSpanStringBuilder toSpannable$default(StructurableText structurableText, Context context, String str, boolean z, boolean z2, boolean z3, Paint paint, Function1 function1, Function1 function12, Function3 function3, Function4 function4, Function2 function2, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function0 function0, boolean z4, DiscordTheme discordTheme, float f, int i, Object obj) {
        return toSpannable(structurableText, context, str, z, z2, z3, paint, (i & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : function1, (i & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : function12, (i & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : function3, (i & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : function4, (i & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : function2, (i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : function13, (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : function14, (i & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : function15, (i & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : function16, (32768 & i) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : function17, (65536 & i) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : function0, (131072 & i) != 0 ? false : z4, (262144 & i) != 0 ? ThemeManagerKt.getTheme() : discordTheme, (i & 524288) != 0 ? -1.0f : f);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.discord.chat.bridge.contentnode.ContentNode, java.lang.Object] */
    private static final DraweeSpanStringBuilder toSpannable(List<? extends ContentNode> list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        int m14102k;
        RenderContext renderContext2;
        int i;
        int i2;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        boolean z;
        long j;
        DraweeSpanStringBuilder draweeSpanStringBuilder3;
        RenderContext renderContext3;
        long j2;
        List m14109d;
        int spToPx;
        int dpToPx;
        int i3;
        int i4;
        int i5;
        int i6;
        MentionContentNode mentionContentNode;
        int i7;
        DraweeSpanStringBuilder draweeSpanStringBuilder4;
        int linkColor;
        LinkContext context;
        UserNameOnClick usernameOnClick;
        String m13763C;
        RenderContext renderContext4 = renderContext;
        DraweeSpanStringBuilder draweeSpanStringBuilder5 = draweeSpanStringBuilder;
        int i8 = 0;
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                C9545j.m14094s();
            }
            ?? r12 = (ContentNode) obj;
            m14102k = C9545j.m14102k(list);
            int i11 = i9 == m14102k ? 1 : i8;
            Context context2 = renderContext.getContext();
            BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(renderContext.getTheme().getBackgroundSecondary());
            RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.85f);
            DiscordFontSpan discordFontSpan = new DiscordFontSpan(renderContext.getContext(), DiscordFont.SourceCodePro);
            int themeColor = ColorUtilsKt.getThemeColor(context2, C2912R.color.chat_mentions_background_light, C2912R.color.chat_mentions_background_dark, renderContext.getTheme());
            int themeColor2 = ColorUtilsKt.getThemeColor(context2, C2912R.color.chat_mentions_foreground_light, C2912R.color.chat_mentions_foreground_dark, renderContext.getTheme());
            int i12 = C2912R.color.green_330;
            int m38177k = C0995a.m38177k(ColorUtilsKt.getThemeColor(context2, i12, i12, renderContext.getTheme()), 25);
            int themeColor3 = ColorUtilsKt.getThemeColor(context2, i12, i12, renderContext.getTheme());
            if (r12 instanceof BlockQuoteContentNode) {
                if (renderContext.getSingleLine()) {
                    draweeSpanStringBuilder5.append((CharSequence) "> ");
                    appendToExistingBuilder(((BlockQuoteContentNode) r12).getContent(), renderContext4, draweeSpanStringBuilder5);
                } else {
                    QuoteSpan quoteSpan = new QuoteSpan(renderContext.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
                    Object[] objArr = new Object[1];
                    objArr[i8] = quoteSpan;
                    int length = draweeSpanStringBuilder.length();
                    appendToExistingBuilder(((BlockQuoteContentNode) r12).getContent(), renderContext4.updateInsets(new TextUtilsKt$toSpannable$12$1$1(quoteSpan)), draweeSpanStringBuilder5);
                    Object obj2 = objArr[i8];
                    if (obj2 != null) {
                        draweeSpanStringBuilder5.setSpan(obj2, length, draweeSpanStringBuilder.length(), 13107233);
                    }
                }
            } else if (r12 instanceof CodeBlockContentNode) {
                if (renderContext.getSingleLine()) {
                    Object[] objArr2 = new Object[3];
                    objArr2[i8] = backgroundColorSpan;
                    objArr2[1] = relativeSizeSpan;
                    objArr2[2] = discordFontSpan;
                    int length2 = draweeSpanStringBuilder.length();
                    m13763C = C9653o.m13763C(((CodeBlockContentNode) r12).getContent(), '\n', ' ', false, 4, null);
                    draweeSpanStringBuilder5.append((CharSequence) m13763C);
                    for (int i13 = i8; i13 < 3; i13++) {
                        Object obj3 = objArr2[i13];
                        if (obj3 != null) {
                            draweeSpanStringBuilder5.setSpan(obj3, length2, draweeSpanStringBuilder.length(), 33);
                        }
                    }
                } else {
                    CodeStyle.INSTANCE.renderCodeBlock(draweeSpanStringBuilder5, (CodeBlockContentNode) r12, renderContext4);
                }
            } else if (r12 instanceof EmojiContentNode) {
                EmojiRendererKt.renderEmoji(draweeSpanStringBuilder5, (EmojiContentNode) r12, renderContext4);
            } else if (r12 instanceof EmphasisContentNode) {
                Object[] objArr3 = new Object[1];
                objArr3[i8] = new StyleSpan(2);
                int length3 = draweeSpanStringBuilder.length();
                appendToExistingBuilder(((EmphasisContentNode) r12).getContent(), renderContext4, draweeSpanStringBuilder5);
                Object obj4 = objArr3[i8];
                if (obj4 != null) {
                    draweeSpanStringBuilder5.setSpan(obj4, length3, draweeSpanStringBuilder.length(), 33);
                }
            } else if (r12 instanceof InlineCodeContentNode) {
                Object[] objArr4 = new Object[3];
                objArr4[i8] = backgroundColorSpan;
                objArr4[1] = relativeSizeSpan;
                objArr4[2] = discordFontSpan;
                int length4 = draweeSpanStringBuilder.length();
                draweeSpanStringBuilder5.append((CharSequence) ((InlineCodeContentNode) r12).getContent());
                for (int i14 = i8; i14 < 3; i14++) {
                    Object obj5 = objArr4[i14];
                    if (obj5 != null) {
                        draweeSpanStringBuilder5.setSpan(obj5, length4, draweeSpanStringBuilder.length(), 33);
                    }
                }
            } else if (r12 instanceof LineBreakContentNode ? true : r12 instanceof NewLineContentNode) {
                draweeSpanStringBuilder5.append((CharSequence) ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            } else {
                Integer num = null;
                if (r12 instanceof LinkContentNode) {
                    LinkStyle invoke = renderContext.getLinkStyle().invoke(r12);
                    LinkContentNode linkContentNode = (LinkContentNode) r12;
                    if (C9612q.m13922c(linkContentNode.getTarget(), "usernameOnClick") && (context = linkContentNode.getContext()) != null && (usernameOnClick = context.getUsernameOnClick()) != null) {
                        num = usernameOnClick.getLinkColor();
                    }
                    if (num != null) {
                        linkColor = num.intValue();
                    } else {
                        linkColor = invoke.getLinkColor();
                    }
                    ClickableSpan clickableSpan = new ClickableSpan(null, Integer.valueOf(linkColor), new TextUtilsKt$toSpannable$12$click$1(r12, renderContext4), new TextUtilsKt$toSpannable$12$click$2(renderContext4, r12), 1, null);
                    DiscordFontSpan discordFontSpan2 = new DiscordFontSpan(context2, invoke.getFont());
                    Object[] objArr5 = new Object[2];
                    objArr5[i8] = clickableSpan;
                    objArr5[1] = discordFontSpan2;
                    int length5 = draweeSpanStringBuilder.length();
                    appendToExistingBuilder(linkContentNode.getContent(), renderContext4, draweeSpanStringBuilder5);
                    for (int i15 = i8; i15 < 2; i15++) {
                        Object obj6 = objArr5[i15];
                        if (obj6 != null) {
                            draweeSpanStringBuilder5.setSpan(obj6, length5, draweeSpanStringBuilder.length(), 33);
                        }
                    }
                } else {
                    if (r12 instanceof MentionContentNode) {
                        DiscordFontSpan discordFontSpan3 = new DiscordFontSpan(context2, DiscordFont.PrimarySemibold);
                        MentionContentNode mentionContentNode2 = (MentionContentNode) r12;
                        if (mentionContentNode2 instanceof UserOrRoleMentionContentNode) {
                            UserOrRoleMentionContentNode userOrRoleMentionContentNode = (UserOrRoleMentionContentNode) r12;
                            ClickableSpan clickableSpan2 = userOrRoleMentionContentNode.m41525getUserIdwUX8bhU() != null ? new ClickableSpan(null, -1, null, new TextUtilsKt$toSpannable$12$click$3(renderContext4, r12), 5, null) : null;
                            int roleColor = userOrRoleMentionContentNode.getRoleColor();
                            int i16 = (!renderContext.getShouldShowRoleDot() || roleColor <= 0) ? i8 : 1;
                            int i17 = (!renderContext.getShouldShowRoleOnName() || roleColor <= 0) ? i8 : 1;
                            boolean m13922c = C9612q.m13922c(toSpannable$default(userOrRoleMentionContentNode.getContent(), renderContext4, null, 2, null).toString(), "@Clyde");
                            if (m13922c) {
                                themeColor = m38177k;
                            } else if (i17 != 0) {
                                themeColor = C0995a.m38177k(roleColor, 25);
                            }
                            BackgroundSpan makeMentionBackgroundSpan = makeMentionBackgroundSpan(renderContext4, themeColor);
                            if (m13922c) {
                                themeColor2 = themeColor3;
                            } else if (i17 != 0) {
                                themeColor2 = C0995a.m38177k(roleColor, 255);
                            }
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(themeColor2);
                            Object[] objArr6 = new Object[4];
                            objArr6[i8] = discordFontSpan3;
                            objArr6[1] = clickableSpan2;
                            objArr6[2] = makeMentionBackgroundSpan;
                            objArr6[3] = foregroundColorSpan;
                            int length6 = draweeSpanStringBuilder.length();
                            if (i16 != 0) {
                                draweeSpanStringBuilder4 = null;
                                RoleDotSpan roleDotSpan = new RoleDotSpan(context2, themeColor, 0, 4, null);
                                roleDotSpan.setColor(userOrRoleMentionContentNode.getRoleColor());
                                draweeSpanStringBuilder5.append((CharSequence) CHANNEL_PREFIX);
                                i7 = 33;
                                draweeSpanStringBuilder5.setSpan(roleDotSpan, draweeSpanStringBuilder.length() - 1, draweeSpanStringBuilder.length(), 33);
                            } else {
                                i7 = 33;
                                draweeSpanStringBuilder4 = null;
                            }
                            draweeSpanStringBuilder5.append((CharSequence) toSpannable$default(userOrRoleMentionContentNode.getContent(), renderContext4, draweeSpanStringBuilder4, 2, draweeSpanStringBuilder4));
                            for (int i18 = 0; i18 < 4; i18++) {
                                Object obj7 = objArr6[i18];
                                if (obj7 != null) {
                                    draweeSpanStringBuilder5.setSpan(obj7, length6, draweeSpanStringBuilder.length(), i7);
                                }
                            }
                        } else if (mentionContentNode2 instanceof ChannelMentionContentNode) {
                            ClickableSpan clickableSpan3 = new ClickableSpan(null, -1, new TextUtilsKt$toSpannable$12$click$4(renderContext4, r12), new TextUtilsKt$toSpannable$12$click$5(renderContext4, r12), 1, null);
                            BackgroundSpan makeMentionBackgroundSpan2 = makeMentionBackgroundSpan(renderContext4, themeColor);
                            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(themeColor2);
                            Object[] objArr7 = {discordFontSpan3, clickableSpan3, makeMentionBackgroundSpan2, foregroundColorSpan2};
                            int length7 = draweeSpanStringBuilder.length();
                            List<ContentNode> inContent = ((ChannelMentionContentNode) r12).getInContent();
                            if (inContent != null) {
                                appendToExistingBuilder(inContent, renderContext4, draweeSpanStringBuilder5);
                                int iconSize = getIconSize("_caret", renderContext.getBaselineHeight());
                                mentionContentNode = mentionContentNode2;
                                appendImage$default(draweeSpanStringBuilder, context2, renderContext, ReactAsset.Caret.getUri(context2), iconSize, iconSize, Integer.valueOf(foregroundColorSpan2.getForegroundColor()), 0.0f, 0.0f, 192, null);
                                Unit unit = Unit.f25302a;
                            } else {
                                mentionContentNode = mentionContentNode2;
                            }
                            List<ContentNode> content = mentionContentNode.getContent();
                            if (content != null) {
                                appendToExistingBuilder(content, renderContext4, draweeSpanStringBuilder5);
                                Unit unit2 = Unit.f25302a;
                            }
                            for (int i19 = 0; i19 < 4; i19++) {
                                Object obj8 = objArr7[i19];
                                if (obj8 != null) {
                                    draweeSpanStringBuilder5.setSpan(obj8, length7, draweeSpanStringBuilder.length(), 33);
                                }
                            }
                        } else if (mentionContentNode2 instanceof StaticChannelMentionContentNode) {
                            ClickableSpan clickableSpan4 = new ClickableSpan(null, -1, null, new TextUtilsKt$toSpannable$12$click$6(renderContext4, r12), 5, null);
                            BackgroundSpan makeMentionBackgroundSpan3 = makeMentionBackgroundSpan(renderContext4, themeColor);
                            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(themeColor2);
                            int iconSize2 = getIconSize(null, renderContext.getBaselineHeight());
                            Object[] objArr8 = {discordFontSpan3, clickableSpan4, makeMentionBackgroundSpan3, foregroundColorSpan3};
                            int length8 = draweeSpanStringBuilder.length();
                            StaticChannelMentionContentNode staticChannelMentionContentNode = (StaticChannelMentionContentNode) r12;
                            int i20 = WhenMappings.$EnumSwitchMapping$0[staticChannelMentionContentNode.getChannelId().ordinal()];
                            if (i20 == 1) {
                                i5 = length8;
                                appendImage$default(draweeSpanStringBuilder, context2, renderContext, ReactAsset.Home.getUri(context2), iconSize2, iconSize2, Integer.valueOf(foregroundColorSpan3.getForegroundColor()), 0.0f, 0.0f, 192, null);
                                Unit unit3 = Unit.f25302a;
                            } else if (i20 == 2) {
                                i5 = length8;
                                appendImage$default(draweeSpanStringBuilder, context2, renderContext, ReactAsset.ChannelBrowse.getUri(context2), iconSize2, iconSize2, Integer.valueOf(foregroundColorSpan3.getForegroundColor()), 0.0f, 0.0f, 192, null);
                                Unit unit4 = Unit.f25302a;
                            } else if (i20 != 3) {
                                draweeSpanStringBuilder5.append((CharSequence) CHANNEL_PREFIX);
                                Unit unit5 = Unit.f25302a;
                                i5 = length8;
                            } else {
                                i5 = length8;
                                appendImage$default(draweeSpanStringBuilder, context2, renderContext, ReactAsset.ChannelBrowse.getUri(context2), iconSize2, iconSize2, Integer.valueOf(foregroundColorSpan3.getForegroundColor()), 0.0f, 0.0f, 192, null);
                                Unit unit6 = Unit.f25302a;
                            }
                            draweeSpanStringBuilder5.append((CharSequence) toSpannable$default(staticChannelMentionContentNode.getContent(), renderContext4, null, 2, null));
                            int i21 = 0;
                            while (i21 < 4) {
                                Object obj9 = objArr8[i21];
                                if (obj9 != null) {
                                    i6 = i5;
                                    draweeSpanStringBuilder5.setSpan(obj9, i6, draweeSpanStringBuilder.length(), 33);
                                } else {
                                    i6 = i5;
                                }
                                i21++;
                                i5 = i6;
                            }
                        } else if (mentionContentNode2 instanceof CommandMentionContentNode) {
                            BackgroundSpan makeMentionBackgroundSpan4 = makeMentionBackgroundSpan(renderContext4, themeColor);
                            ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(themeColor2);
                            ClickableSpan clickableSpan5 = new ClickableSpan(null, -1, new TextUtilsKt$toSpannable$12$click$7(renderContext4, r12), new TextUtilsKt$toSpannable$12$click$8(renderContext4, r12), 1, null);
                            Object[] objArr9 = {new StyleSpan(1)};
                            int length9 = draweeSpanStringBuilder.length();
                            Object[] objArr10 = {clickableSpan5, makeMentionBackgroundSpan4, foregroundColorSpan4};
                            int length10 = draweeSpanStringBuilder.length();
                            draweeSpanStringBuilder5.append(COMMAND_PREFIX);
                            draweeSpanStringBuilder5.append((CharSequence) toSpannable$default(((CommandMentionContentNode) r12).getContent(), renderContext4, null, 2, null));
                            for (int i22 = 0; i22 < 3; i22++) {
                                Object obj10 = objArr10[i22];
                                if (obj10 != null) {
                                    draweeSpanStringBuilder5.setSpan(obj10, length10, draweeSpanStringBuilder.length(), 33);
                                }
                            }
                            Object obj11 = objArr9[0];
                            if (obj11 != null) {
                                draweeSpanStringBuilder5.setSpan(obj11, length9, draweeSpanStringBuilder.length(), 33);
                            }
                        } else {
                            throw new C11581q();
                        }
                        ForceExhaustiveKt.forceExhaustive(draweeSpanStringBuilder);
                    } else if (r12 instanceof ParagraphContentNode) {
                        appendToExistingBuilder(((ParagraphContentNode) r12).getContent(), renderContext4, draweeSpanStringBuilder5);
                    } else if (r12 instanceof SpoilerContentNode) {
                        SpoilerContentNode spoilerContentNode = (SpoilerContentNode) r12;
                        String m41554forNode2sfwrmE = SpoilerIdentifier.Companion.m41554forNode2sfwrmE(spoilerContentNode, renderContext.getContainerId(), i9);
                        boolean m41556isRevealedV2PEE7g = SpoilerManager.INSTANCE.m41556isRevealedV2PEE7g(m41554forNode2sfwrmE);
                        RenderContext.SpoilerState spoilerState = m41556isRevealedV2PEE7g ? RenderContext.SpoilerState.Revealed : RenderContext.SpoilerState.Hidden;
                        Object[] objArr11 = {!m41556isRevealedV2PEE7g ? new ClickableSpan(NestedClickableSpan.TouchPriority.HIGH, null, null, new TextUtilsKt$toSpannable$12$click$9(m41554forNode2sfwrmE, renderContext4), 6, null) : null, new SpoilerSpan(m41556isRevealedV2PEE7g, renderContext.getTheme().getSpoilerHiddenBackground(), renderContext.getTheme().getSpoilerRevealedBackground())};
                        int length11 = draweeSpanStringBuilder.length();
                        appendToExistingBuilder(spoilerContentNode.getContent(), RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, spoilerState, 0, null, null, null, null, 0.0f, null, 66846719, null), draweeSpanStringBuilder);
                        int i23 = 0;
                        while (i23 < 2) {
                            Object obj12 = objArr11[i23];
                            if (obj12 != null) {
                                i4 = length11;
                                draweeSpanStringBuilder.setSpan(obj12, i4, draweeSpanStringBuilder.length(), 33);
                            } else {
                                i4 = length11;
                            }
                            i23++;
                            length11 = i4;
                        }
                        renderContext2 = renderContext;
                        draweeSpanStringBuilder2 = draweeSpanStringBuilder;
                        i2 = 0;
                        renderContext4 = renderContext2;
                        draweeSpanStringBuilder5 = draweeSpanStringBuilder2;
                        i9 = i10;
                        i8 = i2;
                    } else {
                        DraweeSpanStringBuilder draweeSpanStringBuilder6 = draweeSpanStringBuilder5;
                        if (r12 instanceof StrikethroughContentNode) {
                            i = 0;
                            Object[] objArr12 = {new StrikethroughSpan()};
                            int length12 = draweeSpanStringBuilder.length();
                            renderContext2 = renderContext;
                            appendToExistingBuilder(((StrikethroughContentNode) r12).getContent(), renderContext2, draweeSpanStringBuilder6);
                            Object obj13 = objArr12[0];
                            if (obj13 != null) {
                                draweeSpanStringBuilder6.setSpan(obj13, length12, draweeSpanStringBuilder.length(), 33);
                            }
                        } else {
                            renderContext2 = renderContext;
                            i = 0;
                            if (r12 instanceof HeadingContentNode) {
                                DiscordFontSpan discordFontSpan4 = new DiscordFontSpan(context2, DiscordFont.PrimaryExtraBold);
                                if (renderContext.getSingleLine()) {
                                    Object[] objArr13 = {discordFontSpan4};
                                    int length13 = draweeSpanStringBuilder.length();
                                    appendToExistingBuilder(((HeadingContentNode) r12).getContent(), renderContext2, draweeSpanStringBuilder6);
                                    simulateInlineNewline(draweeSpanStringBuilder);
                                    Object obj14 = objArr13[0];
                                    if (obj14 != null) {
                                        draweeSpanStringBuilder6.setSpan(obj14, length13, draweeSpanStringBuilder.length(), 33);
                                    }
                                } else {
                                    HeadingContentNode headingContentNode = (HeadingContentNode) r12;
                                    int level = headingContentNode.getLevel();
                                    if (level == 1) {
                                        spToPx = SizeUtilsKt.getSpToPx(24);
                                    } else if (level != 2) {
                                        spToPx = SizeUtilsKt.getSpToPx(16);
                                    } else {
                                        spToPx = SizeUtilsKt.getSpToPx(20);
                                    }
                                    int spToPx2 = spToPx + SizeUtilsKt.getSpToPx(4);
                                    AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(spToPx);
                                    if (draweeSpanStringBuilder.length() > 0) {
                                        dpToPx = SizeUtilsKt.getDpToPx(8);
                                    } else {
                                        dpToPx = SizeUtilsKt.getDpToPx(4);
                                    }
                                    Object[] objArr14 = {discordFontSpan4};
                                    int length14 = draweeSpanStringBuilder.length();
                                    Object[] objArr15 = {new AbsoluteSizeSpan(dpToPx)};
                                    int length15 = draweeSpanStringBuilder.length();
                                    draweeSpanStringBuilder6.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                    Object obj15 = objArr15[0];
                                    if (obj15 != null) {
                                        draweeSpanStringBuilder6.setSpan(obj15, length15, draweeSpanStringBuilder.length(), 33);
                                    }
                                    int length16 = draweeSpanStringBuilder.length();
                                    draweeSpanStringBuilder6 = draweeSpanStringBuilder;
                                    appendToExistingBuilder(headingContentNode.getContent(), RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, null, null, null, 0.0f, Integer.valueOf(spToPx2), 33554431, null), draweeSpanStringBuilder6);
                                    Object obj16 = new Object[]{absoluteSizeSpan}[0];
                                    if (obj16 != null) {
                                        i3 = 33;
                                        draweeSpanStringBuilder6.setSpan(obj16, length16, draweeSpanStringBuilder.length(), 33);
                                    } else {
                                        i3 = 33;
                                    }
                                    if (i11 == 0) {
                                        Object[] objArr16 = {new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4))};
                                        int length17 = draweeSpanStringBuilder.length();
                                        draweeSpanStringBuilder6.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                        Object obj17 = objArr16[0];
                                        if (obj17 != null) {
                                            draweeSpanStringBuilder6.setSpan(obj17, length17, draweeSpanStringBuilder.length(), i3);
                                        }
                                    } else {
                                        Object[] objArr17 = {new AbsoluteSizeSpan(0)};
                                        int length18 = draweeSpanStringBuilder.length();
                                        draweeSpanStringBuilder6.append("\n\u200b");
                                        Object obj18 = objArr17[0];
                                        if (obj18 != null) {
                                            draweeSpanStringBuilder6.setSpan(obj18, length18, draweeSpanStringBuilder.length(), i3);
                                        }
                                    }
                                    Object obj19 = objArr14[0];
                                    if (obj19 != null) {
                                        draweeSpanStringBuilder6.setSpan(obj19, length14, draweeSpanStringBuilder.length(), i3);
                                    }
                                    renderContext2 = renderContext;
                                    i2 = 0;
                                    draweeSpanStringBuilder2 = draweeSpanStringBuilder6;
                                    renderContext4 = renderContext2;
                                    draweeSpanStringBuilder5 = draweeSpanStringBuilder2;
                                    i9 = i10;
                                    i8 = i2;
                                }
                            } else {
                                if (r12 instanceof BulletListContentNode) {
                                    i2 = 0;
                                    RenderContext copy$default = RenderContext.copy$default(renderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, 67108863, null);
                                    BulletListContentNode bulletListContentNode = (BulletListContentNode) r12;
                                    boolean ordered = bulletListContentNode.getOrdered();
                                    if (ordered) {
                                        Long start = bulletListContentNode.getStart();
                                        j = start != null ? start.longValue() : 1L;
                                        z = true;
                                        copy$default = RenderContext.copy$default(copy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, Long.valueOf((bulletListContentNode.getItems().size() - 1) + j), null, null, 0.0f, null, 65011711, null);
                                    } else {
                                        z = true;
                                        j = 0;
                                    }
                                    Iterator<T> it = bulletListContentNode.getItems().iterator();
                                    while (it.hasNext()) {
                                        List list2 = (List) it.next();
                                        ArrayList arrayList = new ArrayList();
                                        int size = list2.size();
                                        int i24 = 0;
                                        RenderContext renderContext5 = copy$default;
                                        for (Object obj20 : list2) {
                                            int i25 = i24 + 1;
                                            if (i24 < 0) {
                                                C9545j.m14094s();
                                            }
                                            ContentNode contentNode = (ContentNode) obj20;
                                            boolean z2 = contentNode instanceof BulletListContentNode;
                                            boolean z3 = i24 == size + (-1) ? z : false;
                                            if (!z2) {
                                                arrayList.add(contentNode);
                                            }
                                            if (z2 || z3) {
                                                if (ordered) {
                                                    if (renderContext5.getListOrderedIndex() != null) {
                                                        Long listOrderedIndex = renderContext5.getListOrderedIndex();
                                                        j2 = (listOrderedIndex != null ? listOrderedIndex.longValue() : 0L) + 1;
                                                    } else {
                                                        j2 = j;
                                                    }
                                                    renderContext3 = RenderContext.copy$default(renderContext5, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, 0, Long.valueOf(j2), null, null, null, 0.0f, null, 66060287, null);
                                                    draweeSpanStringBuilder3 = draweeSpanStringBuilder;
                                                } else {
                                                    draweeSpanStringBuilder3 = draweeSpanStringBuilder;
                                                    renderContext3 = renderContext5;
                                                }
                                                appendBulletPoint(draweeSpanStringBuilder3, arrayList, renderContext3, ordered);
                                                if (renderContext.getSingleLine()) {
                                                    simulateInlineNewline(draweeSpanStringBuilder);
                                                }
                                                arrayList.clear();
                                            } else {
                                                draweeSpanStringBuilder3 = draweeSpanStringBuilder;
                                                renderContext3 = renderContext5;
                                            }
                                            if (z2) {
                                                RenderContext copy$default2 = RenderContext.copy$default(renderContext3, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, renderContext3.getListNestedLevel() + 1, null, null, null, null, 0.0f, null, 63438847, null);
                                                m14109d = C9544i.m14109d(contentNode);
                                                appendToExistingBuilder(m14109d, copy$default2, draweeSpanStringBuilder3);
                                            }
                                            renderContext5 = renderContext3;
                                            i24 = i25;
                                        }
                                        copy$default = renderContext5;
                                    }
                                    draweeSpanStringBuilder2 = draweeSpanStringBuilder;
                                    renderContext2 = renderContext;
                                } else {
                                    i2 = 0;
                                    draweeSpanStringBuilder2 = draweeSpanStringBuilder6;
                                    if (r12 instanceof StrongContentNode) {
                                        Object[] objArr18 = {new StyleSpan(1)};
                                        int length19 = draweeSpanStringBuilder.length();
                                        renderContext2 = renderContext;
                                        appendToExistingBuilder(((StrongContentNode) r12).getContent(), renderContext2, draweeSpanStringBuilder2);
                                        Object obj21 = objArr18[0];
                                        if (obj21 != null) {
                                            draweeSpanStringBuilder2.setSpan(obj21, length19, draweeSpanStringBuilder.length(), 33);
                                        }
                                    } else {
                                        renderContext2 = renderContext;
                                        if (r12 instanceof TextContentNode) {
                                            String content2 = ((TextContentNode) r12).getContent();
                                            if (content2 != null) {
                                                draweeSpanStringBuilder2.append((CharSequence) content2);
                                            }
                                        } else if (r12 instanceof TimestampContentNode) {
                                            Object[] objArr19 = {new ClickableSpan(null, Integer.valueOf(ColorUtilsKt.getThemeColor(context2, C2912R.color.primary_600, C2912R.color.primary_200, renderContext.getTheme())), null, new TextUtilsKt$toSpannable$12$click$10(renderContext2, r12), 5, null), new BackgroundColorSpan(ColorUtilsKt.getThemeColor(context2, C2912R.color.background_modifier_accent_light, C2912R.color.background_modifier_accent_dark, renderContext.getTheme()))};
                                            int length20 = draweeSpanStringBuilder.length();
                                            draweeSpanStringBuilder2.append((CharSequence) ((TimestampContentNode) r12).getFormatted());
                                            for (int i26 = 0; i26 < 2; i26++) {
                                                Object obj22 = objArr19[i26];
                                                if (obj22 != null) {
                                                    draweeSpanStringBuilder2.setSpan(obj22, length20, draweeSpanStringBuilder.length(), 33);
                                                }
                                            }
                                        } else if (r12 instanceof UnderlineContentNode) {
                                            Object[] objArr20 = {new UnderlineSpan()};
                                            int length21 = draweeSpanStringBuilder.length();
                                            appendToExistingBuilder(((UnderlineContentNode) r12).getContent(), renderContext2, draweeSpanStringBuilder2);
                                            Object obj23 = objArr20[0];
                                            if (obj23 != null) {
                                                draweeSpanStringBuilder2.setSpan(obj23, length21, draweeSpanStringBuilder.length(), 33);
                                            }
                                        } else if (r12 instanceof ChannelNameContentNode) {
                                            ChannelNameContentNode channelNameContentNode = (ChannelNameContentNode) r12;
                                            if (channelNameContentNode.getIcon() != null) {
                                                int iconSize3 = getIconSize(channelNameContentNode.getIconType(), renderContext.getBaselineHeight());
                                                appendImage$default(draweeSpanStringBuilder, context2, renderContext, channelNameContentNode.getIcon(), iconSize3, iconSize3, Integer.valueOf(themeColor2), 0.0f, iconSize3 * getIconPaddingMultiplier(channelNameContentNode.getIconType()), 64, null);
                                            }
                                            appendToExistingBuilder(channelNameContentNode.getContent(), renderContext2, draweeSpanStringBuilder2);
                                        } else if (r12 instanceof GuildNameContentNode) {
                                            int iconSize4 = getIconSize("_guild", renderContext.getBaselineHeight());
                                            GuildNameContentNode guildNameContentNode = (GuildNameContentNode) r12;
                                            if (guildNameContentNode.getIcon() != null) {
                                                float f = iconSize4;
                                                appendImage$default(draweeSpanStringBuilder, context2, renderContext, guildNameContentNode.getIcon(), iconSize4, iconSize4, null, f * 0.2f, f * 0.1f, 32, null);
                                            }
                                            draweeSpanStringBuilder2.append((CharSequence) guildNameContentNode.getContent());
                                        } else if (r12 instanceof SoundmojiContentNode) {
                                            draweeSpanStringBuilder2.append((CharSequence) ((SoundmojiContentNode) r12).getSoundId());
                                        } else if (r12 instanceof ErrorContentNode) {
                                            CrashReporting.INSTANCE.captureException(((ErrorContentNode) r12).getThrowable());
                                            draweeSpanStringBuilder2.append("���");
                                        }
                                    }
                                }
                                renderContext4 = renderContext2;
                                draweeSpanStringBuilder5 = draweeSpanStringBuilder2;
                                i9 = i10;
                                i8 = i2;
                            }
                        }
                        i2 = i;
                        draweeSpanStringBuilder2 = draweeSpanStringBuilder6;
                        renderContext4 = renderContext2;
                        draweeSpanStringBuilder5 = draweeSpanStringBuilder2;
                        i9 = i10;
                        i8 = i2;
                    }
                    draweeSpanStringBuilder2 = draweeSpanStringBuilder5;
                    renderContext2 = renderContext4;
                    i2 = 0;
                    renderContext4 = renderContext2;
                    draweeSpanStringBuilder5 = draweeSpanStringBuilder2;
                    i9 = i10;
                    i8 = i2;
                }
            }
            i2 = i8;
            draweeSpanStringBuilder2 = draweeSpanStringBuilder5;
            renderContext2 = renderContext4;
            renderContext4 = renderContext2;
            draweeSpanStringBuilder5 = draweeSpanStringBuilder2;
            i9 = i10;
            i8 = i2;
        }
        return draweeSpanStringBuilder5;
    }

    static /* synthetic */ DraweeSpanStringBuilder toSpannable$default(List list, RenderContext renderContext, DraweeSpanStringBuilder draweeSpanStringBuilder, int i, Object obj) {
        if ((i & 2) != 0) {
            draweeSpanStringBuilder = new DraweeSpanStringBuilder();
        }
        return toSpannable(list, renderContext, draweeSpanStringBuilder);
    }
}
