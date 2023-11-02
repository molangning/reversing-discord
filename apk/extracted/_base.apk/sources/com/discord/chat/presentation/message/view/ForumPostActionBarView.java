package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.forums.PostSharePrompt;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.ForumPostActionBarViewBinding;
import com.discord.chat.presentation.root.ChatView;
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
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ReactionsView;
import com.discord.reactions.ReactionsView$setReactions$3;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u001c¢\u0006\u0004\b6\u00107JZ\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0002J[\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\t2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ÷\u0001\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020\u00022\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010*\u001a\u00020\t2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "messageId", "", "Lcom/discord/reactions/ReactionView$Reaction;", "reactionsToDisplay", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onAddReactionClick", "Lkotlin/Function1;", "", "onReactionClick", "onReactionLongPress", "setReactions", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "postSharePrompt", "onTapShareForumPost", "shareIcon", "onTapDismissSharePrompt", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "setSharePrompt-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/bridge/forums/PostSharePrompt;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function2;)V", "setSharePrompt", "", "numDisplayedReactions", "", "isFollowing", "followIcon", "followLabel", "shareLabel", "reactions", "defaultReaction", "canAddNewReactions", "addNewReactionAccessibilityLabel", "onTapFollowForumPost", "onTapReactionOverflow", "sharePrompt", "onDismissSharePromptClick", "configure-CgeVRR0", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$Reaction;ZLjava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/discord/chat/bridge/forums/PostSharePrompt;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function2;)V", "configure", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "binding", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ForumPostActionBarView extends ConstraintLayout {
    private final ForumPostActionBarViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ForumPostActionBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setReactions(String str, List<? extends ReactionView.Reaction> list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1<? super ReactionView.Reaction, Unit> function1, Function1<? super ReactionView.Reaction, Unit> function12) {
        ReactionsView reactionsView = this.binding.reactionsView;
        C9612q.m13918g(reactionsView, "binding.reactionsView");
        reactionsView.setVisibility(0);
        ReactionsView reactionsView2 = this.binding.reactionsView;
        C9612q.m13918g(reactionsView2, "binding.reactionsView");
        reactionsView2.setReactions(str, list, false, false, "", "", "", reactionsTheme, (r32 & 256) != 0 ? new View.OnClickListener() { // from class: com.discord.reactions.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$0(view);
            }
        } : onClickListener, (r32 & 512) != 0 ? new View.OnClickListener() { // from class: com.discord.reactions.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$1(view);
            }
        } : null, function1, (r32 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? ReactionsView$setReactions$3.INSTANCE : function12, (r32 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r32 & 8192) != 0 ? false : ChatView.Companion.getAreChatAnimationsEnabled());
    }

    static /* synthetic */ void setReactions$default(ForumPostActionBarView forumPostActionBarView, String str, List list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1 function1, Function1 function12, int i, Object obj) {
        ForumPostActionBarView$setReactions$1 forumPostActionBarView$setReactions$1 = function12;
        if ((i & 32) != 0) {
            forumPostActionBarView$setReactions$1 = ForumPostActionBarView$setReactions$1.INSTANCE;
        }
        forumPostActionBarView.setReactions(str, list, reactionsTheme, onClickListener, function1, forumPostActionBarView$setReactions$1);
    }

    /* renamed from: setSharePrompt-LdU2QRA  reason: not valid java name */
    private final void m41766setSharePromptLdU2QRA(String str, PostSharePrompt postSharePrompt, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2, Function2<? super MessageId, ? super LinkContentNode, Unit> function2) {
        boolean z;
        int i;
        DraweeSpanStringBuilder spannable;
        ConstraintLayout constraintLayout = this.binding.sharePromptContainer;
        C9612q.m13918g(constraintLayout, "binding.sharePromptContainer");
        if (postSharePrompt != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        constraintLayout.setVisibility(i);
        if (postSharePrompt != null) {
            this.binding.sharePromptTitle.setText(postSharePrompt.getTitle());
            DCDButton dCDButton = this.binding.sharePromptCopyLinkButton;
            if (str2 != null) {
                dCDButton.setIcon(str2, SizeUtilsKt.getDpToPx(16));
            }
            dCDButton.setText(postSharePrompt.getCta());
            dCDButton.setContentDescription(postSharePrompt.getCta());
            dCDButton.setOnClickButtonListener(onClickListener);
            DCDButton dCDButton2 = this.binding.sharePromptCloseButton;
            dCDButton2.setIcon(postSharePrompt.getCloseIcon(), SizeUtilsKt.getDpToPx(16));
            dCDButton2.setOnClickButtonListener(onClickListener2);
            SimpleDraweeView simpleDraweeView = this.binding.sharePromptIcon;
            C9612q.m13918g(simpleDraweeView, "binding.sharePromptIcon");
            ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, postSharePrompt.getIcon());
            SimpleDraweeSpanTextView setSharePrompt_LdU2QRA$lambda$13 = this.binding.sharePromptSubtitle;
            C9612q.m13918g(setSharePrompt_LdU2QRA$lambda$13, "setSharePrompt_LdU2QRA$lambda$13");
            StructurableText subtitle = postSharePrompt.getSubtitle();
            Context context = setSharePrompt_LdU2QRA$lambda$13.getContext();
            Paint.FontMetrics fontMetrics = setSharePrompt_LdU2QRA$lambda$13.getPaint().getFontMetrics();
            C9612q.m13918g(fontMetrics, "paint.fontMetrics");
            float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
            TextPaint paint = setSharePrompt_LdU2QRA$lambda$13.getPaint();
            C9612q.m13918g(context, "context");
            C9612q.m13918g(paint, "paint");
            spannable = TextUtilsKt.toSpannable(subtitle, context, str, false, false, false, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : new ForumPostActionBarView$setSharePrompt$3$1(function2, str), (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
            SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setSharePrompt_LdU2QRA$lambda$13, spannable);
            NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setSharePrompt_LdU2QRA$lambda$13, false, 1, null);
        }
    }

    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* renamed from: configure-CgeVRR0  reason: not valid java name */
    public final void m41767configureCgeVRR0(String messageId, int i, boolean z, String str, String followLabel, String str2, String shareLabel, List<? extends ReactionView.Reaction> list, ReactionView.Reaction reaction, boolean z2, String addNewReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onAddReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, View.OnClickListener onTapFollowForumPost, View.OnClickListener onTapShareForumPost, View.OnClickListener onTapReactionOverflow, PostSharePrompt postSharePrompt, View.OnClickListener onDismissSharePromptClick, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked) {
        ?? r8;
        List<? extends ReactionView.Reaction> m14027w0;
        int i2;
        Object obj;
        int interactiveNormal;
        List m14109d;
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(followLabel, "followLabel");
        C9612q.m13917h(shareLabel, "shareLabel");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9612q.m13917h(onAddReactionClick, "onAddReactionClick");
        C9612q.m13917h(onReactionClick, "onReactionClick");
        C9612q.m13917h(onReactionLongPress, "onReactionLongPress");
        C9612q.m13917h(onTapFollowForumPost, "onTapFollowForumPost");
        C9612q.m13917h(onTapShareForumPost, "onTapShareForumPost");
        C9612q.m13917h(onTapReactionOverflow, "onTapReactionOverflow");
        C9612q.m13917h(onDismissSharePromptClick, "onDismissSharePromptClick");
        C9612q.m13917h(onLinkClicked, "onLinkClicked");
        if (list == null || list.isEmpty()) {
            DCDButton dCDButton = this.binding.otherReactionsCount;
            C9612q.m13918g(dCDButton, "binding.otherReactionsCount");
            dCDButton.setVisibility(8);
            if (reaction != null && z2) {
                m14109d = C9544i.m14109d(reaction);
                setReactions$default(this, MessageId.m42079toStringimpl(messageId), m14109d, reactionsTheme, onAddReactionClick, onReactionClick, null, 32, null);
            } else {
                ReactionsView reactionsView = this.binding.reactionsView;
                C9612q.m13918g(reactionsView, "binding.reactionsView");
                reactionsView.setVisibility(8);
            }
            i2 = 2;
            obj = null;
            r8 = 1;
        } else {
            r8 = 1;
            r8 = 1;
            int i3 = i - 1;
            m14027w0 = C9553r.m14027w0(list, i3);
            ReactionsView reactionsView2 = this.binding.reactionsView;
            C9612q.m13918g(reactionsView2, "binding.reactionsView");
            reactionsView2.setVisibility(0);
            setReactions(MessageId.m42079toStringimpl(messageId), m14027w0, reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress);
            int max = Math.max(list.size() - i3, 0);
            DCDButton configure_CgeVRR0$lambda$7 = this.binding.otherReactionsCount;
            C9612q.m13918g(configure_CgeVRR0$lambda$7, "configure_CgeVRR0$lambda$7");
            configure_CgeVRR0$lambda$7.setVisibility(max != 0 ? 0 : 8);
            if (configure_CgeVRR0$lambda$7.getVisibility() == 0) {
                Context context = configure_CgeVRR0$lambda$7.getContext();
                C9612q.m13918g(context, "context");
                configure_CgeVRR0$lambda$7.setText(I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_REACTIONS_OVERFLOW, new ForumPostActionBarView$configure$1$1(max)));
                i2 = 2;
                obj = null;
                RippleUtilsKt.addRipple$default(configure_CgeVRR0$lambda$7, true, 0, 2, null);
                configure_CgeVRR0$lambda$7.setOnClickButtonListener(onTapReactionOverflow);
            } else {
                i2 = 2;
                obj = null;
            }
        }
        DCDButton dCDButton2 = this.binding.followButton;
        if (str != null) {
            dCDButton2.setIcon(str, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton2.setText(followLabel);
        dCDButton2.setContentDescription(followLabel);
        if (z) {
            interactiveNormal = ThemeManagerKt.getTheme().getTextBrand();
        } else {
            interactiveNormal = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        dCDButton2.setTextColor(Integer.valueOf(interactiveNormal));
        dCDButton2.setOnClickButtonListener(onTapFollowForumPost);
        DCDButton dCDButton3 = this.binding.shareButton;
        if (str2 != null) {
            dCDButton3.setIcon(str2, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton3.setOnClickButtonListener(onTapShareForumPost);
        dCDButton3.setContentDescription(shareLabel);
        AddReactionView configure_CgeVRR0$lambda$10 = this.binding.addReaction;
        C9612q.m13918g(configure_CgeVRR0$lambda$10, "configure_CgeVRR0$lambda$10");
        configure_CgeVRR0$lambda$10.setVisibility(z2 ? 0 : 8);
        if (configure_CgeVRR0$lambda$10.getVisibility() == 0 ? r8 : false) {
            RippleUtilsKt.addRipple$default(configure_CgeVRR0$lambda$10, r8, 0, i2, obj);
            configure_CgeVRR0$lambda$10.setContentDescription(addNewReactionAccessibilityLabel);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configure_CgeVRR0$lambda$10, false, onAddReactionClick, r8, obj);
        }
        m41766setSharePromptLdU2QRA(messageId, postSharePrompt, onTapShareForumPost, str2, onDismissSharePromptClick, onLinkClicked);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        ForumPostActionBarViewBinding inflate = ForumPostActionBarViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.footerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        inflate.headerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        DCDButton dCDButton = inflate.followButton;
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        DCDButton dCDButton2 = inflate.shareButton;
        dCDButton2.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton2.setTextSizeSp(14.0f);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        dCDButton2.setIconPadding(0);
        DCDButton dCDButton3 = inflate.otherReactionsCount;
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        dCDButton3.setDiscordFont(discordFont);
        dCDButton3.setTextSizeSp(14.0f);
        dCDButton3.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton3.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView _init_$lambda$3 = inflate.sharePromptTitle;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9612q.m13918g(_init_$lambda$3, "_init_$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        SimpleDraweeSpanTextView _init_$lambda$4 = inflate.sharePromptSubtitle;
        _init_$lambda$4.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(_init_$lambda$4, "_init_$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$4, 14.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont2);
        DCDButton dCDButton4 = inflate.sharePromptCopyLinkButton;
        dCDButton4.setCornerRadius(SizeUtilsKt.getDpToPx(20));
        dCDButton4.setTextSizeSp(14.0f);
        dCDButton4.setBackgroundColor(context.getColor(C2912R.color.brand_500));
        dCDButton4.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getWhite()));
        dCDButton4.setDiscordFont(discordFont2);
        dCDButton4.setIconPadding(8);
        DCDButton dCDButton5 = inflate.sharePromptCloseButton;
        dCDButton5.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        dCDButton5.setBackgroundColor(0);
        dCDButton5.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.DISMISS, null, 2, null));
    }
}
