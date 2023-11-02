package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.EmbedAuthor;
import com.discord.chat.bridge.embed.EmbedFailureState;
import com.discord.chat.bridge.embed.EmbedField;
import com.discord.chat.bridge.embed.EmbedFooter;
import com.discord.chat.bridge.embed.EmbedProvider;
import com.discord.chat.bridge.embed.EmbedThumbnail;
import com.discord.chat.bridge.embed.EmbedType;
import com.discord.chat.bridge.embed.EmbedUtilsKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EmbedViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$1;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$10;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$11;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$2;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$3;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$4;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$5;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$6;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$7;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$8;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$9;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.media_player.MediaSource;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewGroupUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;

@Metadata(m14358d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010y\u001a\u00020x\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010z¢\u0006\u0004\b|\u0010}J9\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJK\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0017\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J8\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001f\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002Jå\u0001\u00107\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00062\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070*H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u00020\u00072\u0006\u00108\u001a\u00020&2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u00072\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010>J0\u0010G\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0002J0\u0010J\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010I\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J;\u0010O\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010L\u001a\u00020\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bO\u0010PJ\u001a\u0010T\u001a\u00020\u00072\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010S\u001a\u00020&H\u0002J\b\u0010U\u001a\u00020\u0007H\u0002J\b\u0010V\u001a\u00020\u0007H\u0002J\b\u0010W\u001a\u00020\u0007H\u0002J\b\u0010X\u001a\u00020\u0007H\u0002J\b\u0010Y\u001a\u00020\u0007H\u0002J\b\u0010Z\u001a\u00020\u0007H\u0002J\b\u0010[\u001a\u00020\u0007H\u0002J\b\u0010\\\u001a\u00020\u0007H\u0002J\b\u0010]\u001a\u00020\u0007H\u0002J\b\u0010^\u001a\u00020\u0007H\u0002J\b\u0010_\u001a\u00020\u0007H\u0002J\b\u0010`\u001a\u00020\u0007H\u0002J\u0097\u0003\u0010q\u001a\u00020\u00072\u0006\u0010B\u001a\u00020A2\u0006\u0010%\u001a\u00020$2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u00042\u0006\u0010c\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2 \u0010d\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022 \u0010e\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u001c\u0010g\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070*2\b\u0010i\u001a\u0004\u0018\u00010h2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070\u00062\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007022\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070*2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010m\u001a\u00020f2\u0006\u0010n\u001a\u00020&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010uR\u0016\u0010v\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010w\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006~"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/EmbedView;", "Landroid/widget/FrameLayout;", "", "provider", "", "providerColor", "Lkotlin/Function1;", "", "onTapCopyText", "setProvider", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "", "rawTitle", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "title", "titleColor", "Landroid/view/View$OnClickListener;", "onClickListener", "onLongClickListener", "setTitle", "(Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/lang/Integer;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;)V", "authorUrl", "authorName", "setAuthor", "listener", "setAuthorOnClickListener", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "thumbnail", "setThumbnail", "rawDescription", "description", "descriptionColor", "setDescription", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "fields", "Lcom/discord/primitives/MessageId;", "messageId", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "onLinkLongClicked", "Lkotlin/Function0;", "onTapSpoiler", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lkotlin/Function3;", "onTapChannel", "onTapMention", "setFields-thlxG-E", "(Ljava/util/List;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "setFields", "isBackgroundColorEnabled", ViewProps.BACKGROUND_COLOR, "setBackgroundColorEnabled", "(ZLjava/lang/Integer;)V", ViewProps.COLOR, "setBorder", "(Ljava/lang/Integer;)V", "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;", "mediaView", "Lcom/discord/chat/bridge/embed/Embed;", "embed", "Lcom/discord/media_player/MediaSource;", "mediaSource", "maxHeightPx", "maxWidthPx", "setMediaEmbed", "imageUrl", "text", "setFooter", "error", "textColor", "iconURL", "iconTint", "setError", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "isObscureAwaitingScan", "configureSpoiler", "reset", "clearInlineMedia", "clearBorder", "clearThumbnail", "clearProvider", "clearAuthor", "clearTitle", "clearDescription", "clearFields", "clearMedia", "clearFooter", "clearError", "constrainedWidth", "radiusPx", "shouldAutoPlayGifs", "onTitleLinkClicked", "onAuthorLinkClicked", "", "onMediaClicked", "Landroid/view/View$OnLongClickListener;", "onMediaLongClicked", "onLongTapLinkNode", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "portal", "isObscure", "setEmbed-3VMWXHQ", "(Lcom/discord/chat/bridge/embed/Embed;Ljava/lang/String;IIIZZZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZ)V", "setEmbed", "Lcom/discord/chat/databinding/EmbedViewBinding;", "binding", "Lcom/discord/chat/databinding/EmbedViewBinding;", "Lcom/discord/chat/bridge/embed/Embed;", "maxThumbnailSize", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedView extends FrameLayout {
    private final EmbedViewBinding binding;
    private Embed embed;
    private int maxThumbnailSize;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedType.values().length];
            try {
                iArr[EmbedType.Rich.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ EmbedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void clearAuthor() {
        TextView textView = this.binding.authorName;
        C9612q.m13918g(textView, "binding.authorName");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
        LinearLayout linearLayout = this.binding.authorContainer;
        C9612q.m13918g(linearLayout, "binding.authorContainer");
        linearLayout.setVisibility(8);
    }

    private final void clearBorder() {
        View view = this.binding.border;
        C9612q.m13918g(view, "binding.border");
        view.setVisibility(8);
    }

    private final void clearDescription() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.description;
        C9612q.m13918g(simpleDraweeSpanTextView, "binding.description");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
    }

    private final void clearError() {
        TextView textView = this.binding.error;
        C9612q.m13918g(textView, "binding.error");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.errorIcon;
        C9612q.m13918g(simpleDraweeView, "binding.errorIcon");
        simpleDraweeView.setVisibility(8);
    }

    private final void clearFields() {
        LinearLayout linearLayout = this.binding.fieldsContainer;
        C9612q.m13918g(linearLayout, "binding.fieldsContainer");
        linearLayout.setVisibility(8);
    }

    private final void clearFooter() {
        TextView textView = this.binding.footerText;
        C9612q.m13918g(textView, "binding.footerText");
        ViewUtilsKt.setOptionalText(textView, null);
        SimpleDraweeView simpleDraweeView = this.binding.footerAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.footerAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
        LinearLayout linearLayout = this.binding.footerContainer;
        C9612q.m13918g(linearLayout, "binding.footerContainer");
        linearLayout.setVisibility(8);
        Space space = this.binding.spacer;
        C9612q.m13918g(space, "binding.spacer");
        space.setVisibility(0);
    }

    private final void clearInlineMedia() {
        EmbedViewBinding embedViewBinding = this.binding;
        EmbedViewResizingMediaView[] embedViewResizingMediaViewArr = {embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4};
        for (int i = 0; i < 4; i++) {
            EmbedViewResizingMediaView it = embedViewResizingMediaViewArr[i];
            C9612q.m13918g(it, "it");
            MediaView.setMediaData$default(it, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, 131070, null);
            it.setOnMediaClickListeners(null, null);
            it.setVisibility(8);
        }
    }

    private final void clearMedia() {
        EmbedViewResizingMediaView clearMedia$lambda$29 = this.binding.mediaView;
        C9612q.m13918g(clearMedia$lambda$29, "clearMedia$lambda$29");
        MediaView.setMediaData$default(clearMedia$lambda$29, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, 131070, null);
        clearMedia$lambda$29.setVisibility(8);
    }

    private final void clearProvider() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.provider;
        C9612q.m13918g(simpleDraweeSpanTextView, "binding.provider");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
    }

    private final void clearThumbnail() {
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        C9612q.m13918g(simpleDraweeView, "binding.thumbnail");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, null, false, null, 6, null);
    }

    private final void clearTitle() {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.title;
        C9612q.m13918g(simpleDraweeSpanTextView, "binding.title");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, null);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = this.binding.title;
        C9612q.m13918g(simpleDraweeSpanTextView2, "binding.title");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeSpanTextView2, false, null, 1, null);
    }

    private final void configureSpoiler(SpoilerConfig spoilerConfig, boolean z) {
        int i;
        this.binding.spoiler.configure(spoilerConfig, this);
        this.binding.spoiler.handleObscureAwaitingScan(z);
        FrameLayout frameLayout = this.binding.imageBlurBg;
        C9612q.m13918g(frameLayout, "binding.imageBlurBg");
        if (this.binding.spoiler.isOverlayVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    private final void reset() {
        clearProvider();
        clearTitle();
        clearDescription();
        clearAuthor();
        clearFields();
        clearInlineMedia();
        clearThumbnail();
        clearBorder();
        clearMedia();
        clearFooter();
        clearError();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setAuthor(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.discord.chat.databinding.EmbedViewBinding r0 = r6.binding
            android.widget.LinearLayout r0 = r0.authorContainer
            java.lang.String r1 = "binding.authorContainer"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L16
            boolean r3 = kotlin.text.C9642f.m13789w(r7)
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 == 0) goto L29
            if (r8 == 0) goto L24
            boolean r3 = kotlin.text.C9642f.m13789w(r8)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = r2
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 != 0) goto L28
            goto L29
        L28:
            r1 = r2
        L29:
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r2 = 8
        L2e:
            r0.setVisibility(r2)
            com.discord.chat.databinding.EmbedViewBinding r0 = r6.binding
            android.widget.TextView r0 = r0.authorName
            java.lang.String r1 = "binding.authorName"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r8)
            com.discord.chat.databinding.EmbedViewBinding r8 = r6.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r8.authorAvatar
            java.lang.String r8 = "binding.authorAvatar"
            kotlin.jvm.internal.C9612q.m13918g(r0, r8)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r1 = r7
            com.discord.image.fresco.SetOptionalImageUrlKt.setOptionalImageUrl$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setAuthor(java.lang.String, java.lang.String):void");
    }

    private final void setAuthorOnClickListener(View.OnClickListener onClickListener, final Function1<? super CharSequence, Unit> function1) {
        TextView setAuthorOnClickListener$lambda$15 = this.binding.authorName;
        C9612q.m13918g(setAuthorOnClickListener$lambda$15, "setAuthorOnClickListener$lambda$15");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(setAuthorOnClickListener$lambda$15, false, onClickListener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setAuthorOnClickListener$lambda$15, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean authorOnClickListener$lambda$15$lambda$14;
                authorOnClickListener$lambda$15$lambda$14 = EmbedView.setAuthorOnClickListener$lambda$15$lambda$14(Function1.this, this, view);
                return authorOnClickListener$lambda$15$lambda$14;
            }
        }, 1, null);
    }

    public static final boolean setAuthorOnClickListener$lambda$15$lambda$14(Function1 onTapCopyText, EmbedView this$0, View view) {
        C9612q.m13917h(onTapCopyText, "$onTapCopyText");
        C9612q.m13917h(this$0, "this$0");
        CharSequence text = this$0.binding.authorName.getText();
        C9612q.m13918g(text, "binding.authorName.text");
        onTapCopyText.invoke(text);
        return true;
    }

    private final void setBackgroundColorEnabled(boolean z, Integer num) {
        int backgroundSecondary;
        if (z) {
            if (num != null) {
                backgroundSecondary = num.intValue();
            } else {
                backgroundSecondary = ThemeManagerKt.getTheme().getBackgroundSecondary();
            }
            setBackgroundColor(backgroundSecondary);
            return;
        }
        setBackgroundColor(0);
    }

    static /* synthetic */ void setBackgroundColorEnabled$default(EmbedView embedView, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        embedView.setBackgroundColorEnabled(z, num);
    }

    private final void setBorder(Integer num) {
        boolean z;
        if (num != null) {
            this.binding.border.setBackgroundColor(num.intValue());
        }
        View view = this.binding.border;
        C9612q.m13918g(view, "binding.border");
        int i = 0;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void setDescription(final String str, DraweeSpanStringBuilder draweeSpanStringBuilder, int i, final Function1<? super CharSequence, Unit> function1) {
        SimpleDraweeSpanTextView setDescription$lambda$19 = this.binding.description;
        C9612q.m13918g(setDescription$lambda$19, "setDescription$lambda$19");
        if (draweeSpanStringBuilder != null) {
            SpannableExtensionsKt.coverWithSpan(draweeSpanStringBuilder, new BackgroundSpanDrawer(setDescription$lambda$19));
        } else {
            draweeSpanStringBuilder = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setDescription$lambda$19, draweeSpanStringBuilder);
        setDescription$lambda$19.setTextColor(i);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setDescription$lambda$19, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean description$lambda$19$lambda$18;
                description$lambda$19$lambda$18 = EmbedView.setDescription$lambda$19$lambda$18(Function1.this, str, view);
                return description$lambda$19$lambda$18;
            }
        }, 1, null);
    }

    public static final boolean setDescription$lambda$19$lambda$18(Function1 onTapCopyText, String rawDescription, View view) {
        C9612q.m13917h(onTapCopyText, "$onTapCopyText");
        C9612q.m13917h(rawDescription, "$rawDescription");
        onTapCopyText.invoke(rawDescription);
        return true;
    }

    public static final void setEmbed_3VMWXHQ$lambda$3$lambda$2(Function3 onTitleLinkClicked, String messageId, String url, DraweeSpanStringBuilder draweeSpanStringBuilder, View view) {
        String str;
        C9612q.m13917h(onTitleLinkClicked, "$onTitleLinkClicked");
        C9612q.m13917h(messageId, "$messageId");
        C9612q.m13917h(url, "$url");
        MessageId m42073boximpl = MessageId.m42073boximpl(messageId);
        if (draweeSpanStringBuilder != null) {
            str = draweeSpanStringBuilder.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        onTitleLinkClicked.invoke(m42073boximpl, url, str);
    }

    public static final void setEmbed_3VMWXHQ$lambda$5$lambda$4(Function3 onAuthorLinkClicked, String messageId, Embed embed, View view) {
        C9612q.m13917h(onAuthorLinkClicked, "$onAuthorLinkClicked");
        C9612q.m13917h(messageId, "$messageId");
        C9612q.m13917h(embed, "$embed");
        onAuthorLinkClicked.invoke(MessageId.m42073boximpl(messageId), embed.getAuthor().getUrl(), embed.getAuthor().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setError(java.lang.String r3, int r4, java.lang.String r5, java.lang.Integer r6) {
        /*
            r2 = this;
            com.discord.chat.databinding.EmbedViewBinding r0 = r2.binding
            android.widget.TextView r0 = r0.error
            java.lang.String r1 = "setError$lambda$27"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r0, r3)
            com.discord.fonts.DiscordFont r1 = com.discord.fonts.DiscordFont.PrimaryMedium
            com.discord.fonts.DiscordFontUtilsKt.setDiscordFont(r0, r1)
            r0.setTextColor(r4)
            com.discord.chat.databinding.EmbedViewBinding r0 = r2.binding
            com.facebook.drawee.view.SimpleDraweeView r0 = r0.errorIcon
            java.lang.String r1 = "binding.errorIcon"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            if (r6 == 0) goto L23
            int r4 = r6.intValue()
        L23:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.discord.theme.utils.ColorUtilsKt.setTintColor(r0, r4)
            com.discord.chat.databinding.EmbedViewBinding r4 = r2.binding
            com.facebook.drawee.view.SimpleDraweeView r4 = r4.errorIcon
            kotlin.jvm.internal.C9612q.m13918g(r4, r1)
            com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(r4, r5)
            com.discord.chat.databinding.EmbedViewBinding r4 = r2.binding
            com.facebook.drawee.view.SimpleDraweeView r4 = r4.errorIcon
            kotlin.jvm.internal.C9612q.m13918g(r4, r1)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L48
            boolean r3 = kotlin.text.C9642f.m13789w(r3)
            if (r3 == 0) goto L46
            goto L48
        L46:
            r3 = r5
            goto L49
        L48:
            r3 = r6
        L49:
            r3 = r3 ^ r6
            if (r3 == 0) goto L4d
            goto L4f
        L4d:
            r5 = 8
        L4f:
            r4.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setError(java.lang.String, int, java.lang.String, java.lang.Integer):void");
    }

    static /* synthetic */ void setError$default(EmbedView embedView, String str, int i, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        embedView.setError(str, i, str2, num);
    }

    /* renamed from: setFields-thlxG-E */
    private final void m41760setFieldsthlxGE(List<EmbedField> list, String str, boolean z, boolean z2, boolean z3, Function2<? super MessageId, ? super LinkContentNode, Unit> function2, Function1<? super LinkContentNode, Unit> function1, Function1<? super CharSequence, Unit> function12, Function0<Unit> function0, Function1<? super EmojiContentNode, Unit> function13, Function3<? super String, ? super String, ? super String, Unit> function3, Function2<? super String, ? super String, Unit> function22) {
        String str2;
        String str3;
        LinearLayout linearLayout;
        EmbedView$setFields$onLinkClickedWithMessageId$1 embedView$setFields$onLinkClickedWithMessageId$1;
        String str4;
        EmbedFieldView embedFieldView;
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        String str5;
        EmbedFieldView embedFieldView2;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        DraweeSpanStringBuilder spannable;
        EmbedView$setFields$onLinkClickedWithMessageId$1 embedView$setFields$onLinkClickedWithMessageId$12 = new EmbedView$setFields$onLinkClickedWithMessageId$1(function2, str);
        LinearLayout setFields_thlxG_E$lambda$22 = this.binding.fieldsContainer;
        C9612q.m13918g(setFields_thlxG_E$lambda$22, "setFields_thlxG_E$lambda$22");
        int i = 0;
        setFields_thlxG_E$lambda$22.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ViewGroupUtilsKt.setUpLayoutForList(setFields_thlxG_E$lambda$22, list.size(), new EmbedView$setFields$1$1(setFields_thlxG_E$lambda$22));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            EmbedField embedField = (EmbedField) obj;
            View childAt = setFields_thlxG_E$lambda$22.getChildAt(i);
            C9612q.m13919f(childAt, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.EmbedFieldView");
            EmbedFieldView embedFieldView3 = (EmbedFieldView) childAt;
            String rawName = embedField.getRawName();
            String str6 = rawName == null ? "" : rawName;
            StructurableText name = embedField.getName();
            if (name != null) {
                Context context = embedFieldView3.getContext();
                TextPaint paint = embedFieldView3.getBinding().name.getPaint();
                C9612q.m13918g(context, "context");
                C9612q.m13918g(paint, "paint");
                str2 = "context";
                str3 = "paint";
                linearLayout = setFields_thlxG_E$lambda$22;
                embedView$setFields$onLinkClickedWithMessageId$1 = embedView$setFields$onLinkClickedWithMessageId$12;
                draweeSpanStringBuilder = TextUtilsKt.toSpannable(name, context, str, z, z2, z3, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : embedView$setFields$onLinkClickedWithMessageId$12, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : function1, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : function3, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : function22, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : function13, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : function0, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : 0.0f);
                str4 = str6;
                embedFieldView = embedFieldView3;
            } else {
                str2 = "context";
                str3 = "paint";
                linearLayout = setFields_thlxG_E$lambda$22;
                embedView$setFields$onLinkClickedWithMessageId$1 = embedView$setFields$onLinkClickedWithMessageId$12;
                str4 = str6;
                embedFieldView = embedFieldView3;
                draweeSpanStringBuilder = null;
            }
            embedFieldView.setName(str4, draweeSpanStringBuilder, function12);
            String rawValue = embedField.getRawValue();
            String str7 = rawValue == null ? "" : rawValue;
            StructurableText value = embedField.getValue();
            if (value != null) {
                Context context2 = embedFieldView.getContext();
                TextPaint paint2 = embedFieldView.getBinding().value.getPaint();
                Paint.FontMetrics fontMetrics = embedFieldView.getBinding().value.getPaint().getFontMetrics();
                C9612q.m13918g(fontMetrics, "binding.value.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                C9612q.m13918g(context2, str2);
                C9612q.m13918g(paint2, str3);
                spannable = TextUtilsKt.toSpannable(value, context2, str, z, z2, z3, paint2, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : embedView$setFields$onLinkClickedWithMessageId$1, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : function1, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : function3, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : function22, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : function13, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : function0, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
                draweeSpanStringBuilder2 = spannable;
                str5 = str7;
                embedFieldView2 = embedFieldView;
            } else {
                str5 = str7;
                embedFieldView2 = embedFieldView;
                draweeSpanStringBuilder2 = null;
            }
            embedFieldView2.setValue(str5, draweeSpanStringBuilder2, function12);
            i = i2;
            setFields_thlxG_E$lambda$22 = linearLayout;
            embedView$setFields$onLinkClickedWithMessageId$12 = embedView$setFields$onLinkClickedWithMessageId$1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setFooter(java.lang.String r10, final java.lang.String r11, final kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> r12) {
        /*
            r9 = this;
            com.discord.chat.databinding.EmbedViewBinding r0 = r9.binding
            android.widget.LinearLayout r0 = r0.footerContainer
            java.lang.String r1 = "binding.footerContainer"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L16
            boolean r3 = kotlin.text.C9642f.m13789w(r10)
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 == 0) goto L2a
            if (r11 == 0) goto L24
            boolean r3 = kotlin.text.C9642f.m13789w(r11)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = r2
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 != 0) goto L28
            goto L2a
        L28:
            r3 = r2
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 == 0) goto L2f
            r3 = r2
            goto L31
        L2f:
            r3 = 8
        L31:
            r0.setVisibility(r3)
            com.discord.chat.databinding.EmbedViewBinding r0 = r9.binding
            com.facebook.drawee.view.SimpleDraweeView r3 = r0.footerAvatar
            java.lang.String r0 = "binding.footerAvatar"
            kotlin.jvm.internal.C9612q.m13918g(r3, r0)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r4 = r10
            com.discord.image.fresco.SetOptionalImageUrlKt.setOptionalImageUrl$default(r3, r4, r5, r6, r7, r8)
            com.discord.chat.databinding.EmbedViewBinding r10 = r9.binding
            android.widget.TextView r10 = r10.footerText
            java.lang.String r0 = "setFooter$lambda$26"
            kotlin.jvm.internal.C9612q.m13918g(r10, r0)
            com.discord.misc.utilities.view.ViewUtilsKt.setOptionalText(r10, r11)
            r0 = 0
            if (r11 == 0) goto L5a
            com.discord.chat.presentation.message.view.m r3 = new com.discord.chat.presentation.message.view.m
            r3.<init>()
            goto L5b
        L5a:
            r3 = r0
        L5b:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(r10, r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.EmbedView.setFooter(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public static final boolean setFooter$lambda$26$lambda$25$lambda$24(Function1 onTapCopyText, String str, View view) {
        C9612q.m13917h(onTapCopyText, "$onTapCopyText");
        onTapCopyText.invoke(str);
        return true;
    }

    private final void setMediaEmbed(EmbedViewResizingMediaView embedViewResizingMediaView, Embed embed, MediaSource mediaSource, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (i > 0 && i2 > 0) {
            Pair<Integer, Integer> targetDimensions = EmbedUtilsKt.getTargetDimensions(embed);
            Integer m14351a = targetDimensions.m14351a();
            Integer m14350b = targetDimensions.m14350b();
            if (m14351a != null) {
                i3 = m14351a.intValue();
            } else {
                i3 = 0;
            }
            if (m14350b != null) {
                i4 = m14350b.intValue();
            } else {
                i4 = 0;
            }
            embedViewResizingMediaView.setTarget(i3, i4, i, i2);
        }
        embedViewResizingMediaView.setVisibility(0);
        EmbedThumbnail thumbnail = embed.getThumbnail();
        if (thumbnail != null) {
            z = C9612q.m13922c(thumbnail.getShowPlayButton(), Boolean.TRUE);
        } else {
            z = false;
        }
        MediaView.setMediaData$default(embedViewResizingMediaView, mediaSource, false, false, false, null, false, null, null, false, z, false, 0, new EmbedView$setMediaEmbed$1(this), null, null, null, null, 126462, null);
    }

    private final void setProvider(final CharSequence charSequence, Integer num, final Function1<? super CharSequence, Unit> function1) {
        int textNormal;
        View.OnLongClickListener onLongClickListener;
        SimpleDraweeSpanTextView setProvider$lambda$10 = this.binding.provider;
        C9612q.m13918g(setProvider$lambda$10, "setProvider$lambda$10");
        ViewUtilsKt.setOptionalText(setProvider$lambda$10, charSequence);
        if (num != null) {
            textNormal = num.intValue();
        } else {
            textNormal = ThemeManagerKt.getTheme().getTextNormal();
        }
        setProvider$lambda$10.setTextColor(textNormal);
        if (charSequence != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.r
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean provider$lambda$10$lambda$9$lambda$8;
                    provider$lambda$10$lambda$9$lambda$8 = EmbedView.setProvider$lambda$10$lambda$9$lambda$8(Function1.this, charSequence, view);
                    return provider$lambda$10$lambda$9$lambda$8;
                }
            };
        } else {
            onLongClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setProvider$lambda$10, false, onLongClickListener, 1, null);
    }

    public static final boolean setProvider$lambda$10$lambda$9$lambda$8(Function1 onTapCopyText, CharSequence charSequence, View view) {
        C9612q.m13917h(onTapCopyText, "$onTapCopyText");
        onTapCopyText.invoke(charSequence);
        return true;
    }

    private final void setThumbnail(EmbedThumbnail embedThumbnail) {
        int i;
        String str;
        SimpleDraweeView setThumbnail$lambda$16 = this.binding.thumbnail;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        C9612q.m13918g(setThumbnail$lambda$16, "setThumbnail$lambda$16");
        int i2 = 0;
        if (embedThumbnail != null) {
            i = embedThumbnail.getWidth();
        } else {
            i = 0;
        }
        if (embedThumbnail != null) {
            i2 = embedThumbnail.getHeight();
        }
        int i3 = this.maxThumbnailSize;
        MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, setThumbnail$lambda$16, i, i2, i3, i3, null, 16, null);
        if (embedThumbnail != null) {
            str = embedThumbnail.getProxyURL();
        } else {
            str = null;
        }
        SetOptionalImageUrlKt.setOptionalImageUrl$default(setThumbnail$lambda$16, str, false, null, 6, null);
    }

    private final void setTitle(final String str, DraweeSpanStringBuilder draweeSpanStringBuilder, Integer num, View.OnClickListener onClickListener, final Function1<? super String, Unit> function1) {
        int textNormal;
        View.OnLongClickListener onLongClickListener;
        SimpleDraweeSpanTextView setTitle$lambda$13 = this.binding.title;
        C9612q.m13918g(setTitle$lambda$13, "setTitle$lambda$13");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setTitle$lambda$13, draweeSpanStringBuilder);
        if (num != null) {
            textNormal = num.intValue();
        } else {
            textNormal = ThemeManagerKt.getTheme().getTextNormal();
        }
        setTitle$lambda$13.setTextColor(textNormal);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(setTitle$lambda$13, false, onClickListener, 1, null);
        if (draweeSpanStringBuilder != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.p
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean title$lambda$13$lambda$12$lambda$11;
                    title$lambda$13$lambda$12$lambda$11 = EmbedView.setTitle$lambda$13$lambda$12$lambda$11(Function1.this, str, view);
                    return title$lambda$13$lambda$12$lambda$11;
                }
            };
        } else {
            onLongClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setTitle$lambda$13, false, onLongClickListener, 1, null);
    }

    public static final boolean setTitle$lambda$13$lambda$12$lambda$11(Function1 onLongClickListener, String rawTitle, View view) {
        C9612q.m13917h(onLongClickListener, "$onLongClickListener");
        C9612q.m13917h(rawTitle, "$rawTitle");
        onLongClickListener.invoke(rawTitle);
        return true;
    }

    /* renamed from: setEmbed-3VMWXHQ */
    public final void m41761setEmbed3VMWXHQ(final Embed embed, final String messageId, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, final Function3<? super MessageId, ? super String, ? super String, Unit> onTitleLinkClicked, final Function3<? super MessageId, ? super String, ? super String, Unit> onAuthorLinkClicked, Function2<? super Double, ? super Integer, Unit> onMediaClicked, View.OnLongClickListener onLongClickListener, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLongTapLinkNode, Function1<? super CharSequence, Unit> onTapCopyText, Function0<Unit> onTapSpoiler, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, SpoilerConfig spoilerConfig, double d, boolean z5) {
        final DraweeSpanStringBuilder draweeSpanStringBuilder;
        Integer headerTextColor;
        boolean z6;
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        boolean z7;
        List m14065K0;
        DraweeSpanStringBuilder spannable;
        boolean z8;
        boolean m13751w;
        boolean z9;
        C9612q.m13917h(embed, "embed");
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(onTitleLinkClicked, "onTitleLinkClicked");
        C9612q.m13917h(onAuthorLinkClicked, "onAuthorLinkClicked");
        C9612q.m13917h(onMediaClicked, "onMediaClicked");
        C9612q.m13917h(onLinkClicked, "onLinkClicked");
        C9612q.m13917h(onLongTapLinkNode, "onLongTapLinkNode");
        C9612q.m13917h(onTapCopyText, "onTapCopyText");
        C9612q.m13917h(onTapSpoiler, "onTapSpoiler");
        C9612q.m13917h(onTapEmoji, "onTapEmoji");
        C9612q.m13917h(onTapChannel, "onTapChannel");
        C9612q.m13917h(onTapMention, "onTapMention");
        C9612q.m13917h(onTapCommand, "onTapCommand");
        if (!C9612q.m13922c(embed, this.embed)) {
            reset();
            this.embed = embed;
        }
        View root = this.binding.getRoot();
        C9612q.m13918g(root, "binding.root");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, i3);
        ConstraintLayout constraintLayout = this.binding.inlineMediaContainer;
        C9612q.m13918g(constraintLayout, "binding.inlineMediaContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(constraintLayout, i3);
        EmbedViewResizingMediaView embedViewResizingMediaView = this.binding.mediaView;
        C9612q.m13918g(embedViewResizingMediaView, "binding.mediaView");
        ViewClippingUtilsKt.clipToRoundedRectangle(embedViewResizingMediaView, i3);
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        C9612q.m13918g(simpleDraweeView, "binding.thumbnail");
        ViewClippingUtilsKt.clipToRoundedRectangle(simpleDraweeView, i3);
        if (!EmbedUtilsKt.isInlineMedia(embed)) {
            MediaSource mediaSource = EmbedUtilsKt.toMediaSource(embed, z, Double.valueOf(d));
            if (mediaSource != null) {
                Space space = this.binding.spacer;
                C9612q.m13918g(space, "binding.spacer");
                space.setVisibility(8);
                if (mediaSource.getPreviewUrl() != null) {
                    EmbedViewResizingMediaView embedViewResizingMediaView2 = this.binding.mediaView;
                    C9612q.m13918g(embedViewResizingMediaView2, "binding.mediaView");
                    setMediaEmbed(embedViewResizingMediaView2, embed, mediaSource, i2, MessageAccessoriesView.Companion.getWidth(i));
                    this.binding.mediaView.setOnMediaClickListeners(new EmbedView$setEmbed$1$1(onMediaClicked, z5, this), onLongClickListener);
                    z9 = false;
                    setBackgroundColorEnabled$default(this, false, null, 2, null);
                } else {
                    z9 = false;
                }
                z6 = z9;
                z7 = true;
            } else {
                z7 = true;
                z6 = false;
            }
        } else {
            StructurableText title = embed.getTitle();
            if (title != null) {
                Context context = getContext();
                TextPaint paint = this.binding.title.getPaint();
                C9612q.m13918g(context, "context");
                C9612q.m13918g(paint, "paint");
                spannable = TextUtilsKt.toSpannable(title, context, messageId, z2, z3, z4, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : onTapChannel, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : onTapMention, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : onTapCommand, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : onTapEmoji, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : onTapSpoiler, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : 0.0f);
                draweeSpanStringBuilder = spannable;
            } else {
                draweeSpanStringBuilder = null;
            }
            String rawTitle = embed.getRawTitle();
            String str = rawTitle == null ? "" : rawTitle;
            if (embed.getUrl() != null) {
                headerTextColor = Integer.valueOf(ThemeManagerKt.getTheme().getTextLink());
            } else {
                headerTextColor = embed.getHeaderTextColor();
            }
            Integer num = headerTextColor;
            final String url = embed.getUrl();
            z6 = false;
            setTitle(str, draweeSpanStringBuilder, num, url != null ? new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmbedView.setEmbed_3VMWXHQ$lambda$3$lambda$2(Function3.this, messageId, url, draweeSpanStringBuilder, view);
                }
            } : null, onTapCopyText);
            String rawDescription = embed.getRawDescription();
            if (rawDescription == null) {
                rawDescription = "";
            }
            StructurableText description = embed.getDescription();
            if (description != null) {
                Context context2 = getContext();
                TextPaint paint2 = this.binding.description.getPaint();
                Paint.FontMetrics fontMetrics = this.binding.description.getPaint().getFontMetrics();
                C9612q.m13918g(fontMetrics, "binding.description.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                C9612q.m13918g(context2, "context");
                C9612q.m13918g(paint2, "paint");
                draweeSpanStringBuilder2 = TextUtilsKt.toSpannable(description, context2, messageId, z2, z3, z4, paint2, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : new EmbedView$setEmbed$3(onLinkClicked, messageId), (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : onLongTapLinkNode, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : onTapChannel, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : onTapMention, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : onTapCommand, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : onTapEmoji, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : onTapSpoiler, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
            } else {
                draweeSpanStringBuilder2 = null;
            }
            setDescription(rawDescription, draweeSpanStringBuilder2, embed.getBodyTextColor(), onTapCopyText);
            EmbedProvider provider = embed.getProvider();
            setProvider(provider != null ? provider.getName() : null, embed.getProviderColor(), onTapCopyText);
            setBackgroundColorEnabled(!C9612q.m13922c(embed.getDisableBackgroundColor(), Boolean.TRUE), embed.getBackgroundColor());
            setBorder(embed.getBorderLeftColor());
            EmbedAuthor author = embed.getAuthor();
            String imageUrl = author != null ? author.getImageUrl() : null;
            EmbedAuthor author2 = embed.getAuthor();
            setAuthor(imageUrl, author2 != null ? author2.getName() : null);
            EmbedAuthor author3 = embed.getAuthor();
            setAuthorOnClickListener((author3 == null || author3.getUrl() == null) ? null : new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmbedView.setEmbed_3VMWXHQ$lambda$5$lambda$4(Function3.this, messageId, embed, view);
                }
            }, onTapCopyText);
            List<EmbedField> fields = embed.getFields();
            if (fields == null) {
                fields = C9545j.m14104i();
            }
            m41760setFieldsthlxGE(fields, messageId, z2, z3, z4, onLinkClicked, onLongTapLinkNode, onTapCopyText, onTapSpoiler, onTapEmoji, onTapChannel, onTapMention);
            EmbedFooter footer = embed.getFooter();
            String imageUrl2 = footer != null ? footer.getImageUrl() : null;
            EmbedFooter footer2 = embed.getFooter();
            setFooter(imageUrl2, footer2 != null ? footer2.getContent() : null, onTapCopyText);
            if (embed.getFailureState() == EmbedFailureState.AUTO_MODERATION_BLOCKED_MESSAGE) {
                setError(embed.getMessageSendError(), ThemeManagerKt.getTheme().getTextMuted(), embed.getIconURL(), Integer.valueOf(ColorUtilsKt.getColorCompat(this, C2912R.color.red_345)));
            } else {
                setError(embed.getMessageSendError(), embed.getBodyTextColor(), embed.getIconURL(), null);
            }
            List<MediaSource> imageMediaSources = EmbedUtilsKt.toImageMediaSources(embed);
            if (imageMediaSources != null) {
                int i4 = (int) (i2 * 0.75d);
                int widthForEmbedContent = MessageAccessoriesView.Companion.getWidthForEmbedContent(i);
                MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
                ConstraintLayout constraintLayout2 = this.binding.inlineMediaContainer;
                C9612q.m13918g(constraintLayout2, "binding.inlineMediaContainer");
                MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, constraintLayout2, widthForEmbedContent, i4, widthForEmbedContent, i4, null, 16, null);
                EmbedViewBinding embedViewBinding = this.binding;
                z7 = true;
                m14065K0 = C9553r.m14065K0(imageMediaSources, new EmbedViewResizingMediaView[]{embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4});
                int i5 = 0;
                for (Object obj : m14065K0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C9545j.m14094s();
                    }
                    Pair pair = (Pair) obj;
                    EmbedViewResizingMediaView mediaView = (EmbedViewResizingMediaView) pair.m14350b();
                    C9612q.m13918g(mediaView, "mediaView");
                    setMediaEmbed(mediaView, embed, (MediaSource) pair.m14351a(), 0, 0);
                    mediaView.setOnMediaClickListeners(new EmbedView$setEmbed$5$1(onMediaClicked, i5), onLongClickListener);
                    i5 = i6;
                }
            } else {
                z7 = true;
                MediaSource mediaSource2 = EmbedUtilsKt.toMediaSource(embed, z, Double.valueOf(d));
                if (mediaSource2 != null) {
                    EmbedViewResizingMediaView embedViewResizingMediaView3 = this.binding.inlineMediaView;
                    C9612q.m13918g(embedViewResizingMediaView3, "binding.inlineMediaView");
                    setMediaEmbed(embedViewResizingMediaView3, embed, mediaSource2, i2, MessageAccessoriesView.Companion.getWidthForEmbedContent(i));
                    this.binding.inlineMediaView.setOnMediaClickListeners(new EmbedView$setEmbed$6$1(onMediaClicked, z5, this), onLongClickListener);
                }
                if (WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()] != 1 ? mediaSource2 == null : embed.getVideo() == null) {
                    setThumbnail(embed.getThumbnail());
                }
            }
        }
        String obscureAwaitingScan = embed.getObscureAwaitingScan();
        if (obscureAwaitingScan != null) {
            m13751w = C9653o.m13751w(obscureAwaitingScan);
            if (!m13751w) {
                z8 = z6;
                configureSpoiler(spoilerConfig, !z8);
            }
        }
        z8 = z7;
        configureSpoiler(spoilerConfig, !z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        EmbedViewBinding inflate = EmbedViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.maxThumbnailSize = context.getResources().getDimensionPixelSize(C2912R.dimen.message_embed_max_thumbnail_size);
        inflate.getRoot().setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        SimpleDraweeSpanTextView _init_$lambda$0 = inflate.provider;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 10.0f);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        TextView textView = inflate.authorName;
        C9612q.m13918g(textView, "binding.authorName");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont2);
        inflate.authorName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView textView2 = inflate.authorName;
        C9612q.m13918g(textView2, "binding.authorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = inflate.title;
        C9612q.m13918g(simpleDraweeSpanTextView, "binding.title");
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont2);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = inflate.title;
        C9612q.m13918g(simpleDraweeSpanTextView2, "binding.title");
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView2, 16.0f);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = inflate.description;
        C9612q.m13918g(simpleDraweeSpanTextView3, "binding.description");
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView3, discordFont);
        TextView textView3 = inflate.footerText;
        C9612q.m13918g(textView3, "binding.footerText");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        inflate.footerText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView4 = inflate.footerText;
        C9612q.m13918g(textView4, "binding.footerText");
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        TextView textView5 = inflate.error;
        C9612q.m13918g(textView5, "binding.error");
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont);
        TextView textView6 = inflate.error;
        C9612q.m13918g(textView6, "binding.error");
        SetTextSizeSpKt.setTextSizeSp(textView6, 12.0f);
        SimpleDraweeView simpleDraweeView2 = inflate.errorIcon;
        C9612q.m13918g(simpleDraweeView2, "binding.errorIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.Alert);
        inflate.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
    }
}