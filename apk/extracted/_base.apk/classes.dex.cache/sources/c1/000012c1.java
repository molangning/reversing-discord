package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.UnknownMessageFrame;
import com.discord.chat.databinding.MessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.list.SwipeReplyInitiator;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001cB\u001d\b\u0007\u0012\u0006\u0010^\u001a\u00020]\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J]\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001120\u0010\u0019\u001a,\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013j\u0004\u0018\u0001`\u0018H\u0002ø\u0001\u0000J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0016\u0010!\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J \u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0005H\u0016Jf\u00104\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0/2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005J\u000e\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u000205J\u000f\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010DR\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010ER(\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010D\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010D\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\"\u0010N\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010E\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010S\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010E\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR&\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u001b0Vj\b\u0012\u0004\u0012\u00020\u001b`W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, m14357d2 = {"Lcom/discord/chat/presentation/message/MessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "", "showDivider", "", "configureDivider", "Landroid/view/View;", "Lcom/discord/chat/bridge/Message;", "message", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "configureAuthorClickListeners", "Lcom/discord/chat/presentation/root/MessageContext;", "messageContext", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "messageFrame", "Lkotlin/Function4;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onLongClick", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "generateMessageAccessories", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "chainPart", "configureAuthor", "items", "configureAccessoriesMargin", "isCommunicationDisabled", "configureCommunicationDisabled", "isSuppressNotifications", "configureSuppressNotifications", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "onSwipeStart", "onSwipeEnd", "pressed", "setPressed", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentProvider", "Lkotlin/Function0;", "onChainPart", "allowChildGestures", "isHighlight", "renderContentOnly", "setMessage", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "recycledViewPool", "setAccessoriesRecycledViewPool", "spacingPxOverride", "()Ljava/lang/Integer;", "Lcom/discord/chat/databinding/MessageViewBinding;", "binding", "Lcom/discord/chat/databinding/MessageViewBinding;", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "shadowView", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "getShadowView", "()Lcom/discord/chat/presentation/list/MaskedShadowView;", "setShadowView", "(Lcom/discord/chat/presentation/list/MaskedShadowView;)V", "Lkotlin/jvm/functions/Function0;", "Z", "onInitiateReply", "getOnInitiateReply", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateReply", "(Lkotlin/jvm/functions/Function0;)V", "onInitiateEdit", "getOnInitiateEdit", "setOnInitiateEdit", "enableSwipeToReply", "getEnableSwipeToReply", "()Z", "setEnableSwipeToReply", "(Z)V", "enableSwipeToEdit", "getEnableSwipeToEdit", "setEnableSwipeToEdit", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "accessories", "Ljava/util/ArrayList;", "getSpineOriginView", "()Landroid/view/View;", "spineOriginView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ChainPart", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView, SpineParentMessage, SwipeReplyInitiator {
    private ArrayList<MessageAccessory> accessories;
    private boolean allowChildGestures;
    private final MessageViewBinding binding;
    private boolean enableSwipeToEdit;
    private boolean enableSwipeToReply;
    private Function0<? extends ChainPart> onChainPart;
    private Function0<Unit> onInitiateEdit;
    private Function0<Unit> onInitiateReply;
    public MaskedShadowView shadowView;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "", "(Ljava/lang/String;I)V", "ONLY", "START", "MIDDLE", "END", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum ChainPart {
        ONLY,
        START,
        MIDDLE,
        END
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessageState.values().length];
            try {
                iArr[MessageState.SendFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageState.Sending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChainPart.values().length];
            try {
                iArr2[ChainPart.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChainPart.ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChainPart.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChainPart.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ MessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void configureAccessoriesMargin(List<? extends MessageAccessory> list) {
        Object m14054V;
        boolean z;
        boolean z2;
        int dpToPx;
        m14054V = C9553r.m14054V(list);
        boolean z3 = m14054V instanceof MessageContentAccessory;
        int i = 0;
        boolean z4 = true;
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        ChainPart invoke = this.onChainPart.invoke();
        if (invoke != ChainPart.MIDDLE && invoke != ChainPart.START) {
            z4 = false;
        }
        if (z3) {
            dpToPx = 0;
        } else {
            dpToPx = SizeUtilsKt.getDpToPx(8);
        }
        if (z2 && z4) {
            i = SizeUtilsKt.getDpToPx(4);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.accessoriesView.getLayoutParams();
        C9612q.m13919f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.topMargin;
        int i3 = marginLayoutParams.bottomMargin;
        if (i2 != dpToPx || i3 != i) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dpToPx, marginLayoutParams.rightMargin, i);
            this.binding.accessoriesView.setLayoutParams(marginLayoutParams);
        }
    }

    private final void configureAuthor(final Message message, final ChatEventHandler chatEventHandler, ChainPart chainPart) {
        int i;
        if (chainPart != ChainPart.START && chainPart != ChainPart.ONLY) {
            TextView textView = this.binding.timestamp;
            C9612q.m13918g(textView, "binding.timestamp");
            textView.setVisibility(8);
            TextView textView2 = this.binding.authorName;
            C9612q.m13918g(textView2, "binding.authorName");
            textView2.setVisibility(8);
            SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
            C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
            simpleDraweeView.setVisibility(8);
            SimpleDraweeView simpleDraweeView2 = this.binding.authorAvatarDecoration;
            C9612q.m13918g(simpleDraweeView2, "binding.authorAvatarDecoration");
            simpleDraweeView2.setVisibility(8);
            RoleDotView roleDotView = this.binding.roleDot;
            C9612q.m13918g(roleDotView, "binding.roleDot");
            roleDotView.setVisibility(8);
            RoleIconView roleIconView = this.binding.roleIcon;
            C9612q.m13918g(roleIconView, "binding.roleIcon");
            roleIconView.setVisibility(8);
            ConnectionsRoleTagView connectionsRoleTagView = this.binding.connectionsRoleTag;
            C9612q.m13918g(connectionsRoleTagView, "binding.connectionsRoleTag");
            connectionsRoleTagView.setVisibility(8);
            MessageTagView messageTagView = this.binding.messageTagView;
            C9612q.m13918g(messageTagView, "binding.messageTagView");
            messageTagView.setVisibility(8);
            MessageAltRemixTagView messageAltRemixTagView = this.binding.messageAltRemixTagView;
            C9612q.m13918g(messageAltRemixTagView, "binding.messageAltRemixTagView");
            messageAltRemixTagView.setVisibility(8);
            return;
        }
        TextView configureAuthor$lambda$27 = this.binding.authorName;
        configureAuthor$lambda$27.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
        configureAuthor$lambda$27.setText(message.getUsername());
        C9612q.m13918g(configureAuthor$lambda$27, "configureAuthor$lambda$27");
        configureAuthorClickListeners(configureAuthor$lambda$27, message, chatEventHandler);
        View view = this.binding.roleDot;
        C9612q.m13918g(view, "binding.roleDot");
        configureAuthorClickListeners(view, message, chatEventHandler);
        this.binding.timestamp.setText(message.getTimestamp());
        SimpleDraweeView configureAuthor$lambda$30 = this.binding.authorAvatar;
        Context context = configureAuthor$lambda$30.getContext();
        C9612q.m13918g(context, "context");
        configureAuthor$lambda$30.setImageURI(MessageKt.avatarUrl(message, context));
        C9612q.m13918g(configureAuthor$lambda$30, "configureAuthor$lambda$30");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureAuthor$lambda$30, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MessageView.configureAuthor$lambda$30$lambda$28(Message.this, chatEventHandler, view2);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(configureAuthor$lambda$30, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean configureAuthor$lambda$30$lambda$29;
                configureAuthor$lambda$30$lambda$29 = MessageView.configureAuthor$lambda$30$lambda$29(Message.this, chatEventHandler, view2);
                return configureAuthor$lambda$30$lambda$29;
            }
        }, 1, null);
        if (message.getAvatarDecorationURL() != null) {
            SimpleDraweeView simpleDraweeView3 = this.binding.authorAvatarDecoration;
            C9612q.m13918g(simpleDraweeView3, "binding.authorAvatarDecoration");
            simpleDraweeView3.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(message.getAvatarDecorationURL());
        } else {
            SimpleDraweeView simpleDraweeView4 = this.binding.authorAvatarDecoration;
            C9612q.m13918g(simpleDraweeView4, "binding.authorAvatarDecoration");
            simpleDraweeView4.setVisibility(8);
        }
        TextView textView3 = this.binding.timestamp;
        C9612q.m13918g(textView3, "binding.timestamp");
        textView3.setVisibility(0);
        TextView textView4 = this.binding.authorName;
        C9612q.m13918g(textView4, "binding.authorName");
        textView4.setVisibility(0);
        SimpleDraweeView simpleDraweeView5 = this.binding.authorAvatar;
        C9612q.m13918g(simpleDraweeView5, "binding.authorAvatar");
        simpleDraweeView5.setVisibility(0);
        if (message.getShouldShowRoleDot()) {
            RoleDotView roleDotView2 = this.binding.roleDot;
            C9612q.m13918g(roleDotView2, "binding.roleDot");
            roleDotView2.setVisibility(0);
            RoleDotView roleDotView3 = this.binding.roleDot;
            C9612q.m13918g(roleDotView3, "binding.roleDot");
            RoleDotView.configure$default(roleDotView3, MessageKt.roleDotColor$default(message, 0, 1, null), 0, 2, null);
        } else {
            RoleDotView roleDotView4 = this.binding.roleDot;
            C9612q.m13918g(roleDotView4, "binding.roleDot");
            roleDotView4.setVisibility(8);
        }
        if (message.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(message.getRoleIcon(), chatEventHandler);
            RoleIconView roleIconView2 = this.binding.roleIcon;
            C9612q.m13918g(roleIconView2, "binding.roleIcon");
            roleIconView2.setVisibility(0);
        } else {
            RoleIconView roleIconView3 = this.binding.roleIcon;
            C9612q.m13918g(roleIconView3, "binding.roleIcon");
            roleIconView3.setVisibility(8);
        }
        if (message.getConnectionsRoleTag() != null) {
            this.binding.connectionsRoleTag.m41632configureConnectionsRoleTaguESh2Cg(message.m41433getAuthorIdwUX8bhU(), message.m41435getGuildIdqOKuAAo(), ChannelId.m42047boximpl(message.m41434getChannelIdo4g7jtM()), message.getConnectionsRoleTag(), chatEventHandler);
            ConnectionsRoleTagView connectionsRoleTagView2 = this.binding.connectionsRoleTag;
            C9612q.m13918g(connectionsRoleTagView2, "binding.connectionsRoleTag");
            connectionsRoleTagView2.setVisibility(0);
            i = 8;
        } else {
            ConnectionsRoleTagView connectionsRoleTagView3 = this.binding.connectionsRoleTag;
            C9612q.m13918g(connectionsRoleTagView3, "binding.connectionsRoleTag");
            i = 8;
            connectionsRoleTagView3.setVisibility(8);
        }
        if (message.getTagText() == null && message.getOpTagText() == null) {
            MessageTagView messageTagView2 = this.binding.messageTagView;
            C9612q.m13918g(messageTagView2, "binding.messageTagView");
            messageTagView2.setVisibility(i);
            MessageAltRemixTagView messageAltRemixTagView2 = this.binding.messageAltRemixTagView;
            C9612q.m13918g(messageAltRemixTagView2, "binding.messageAltRemixTagView");
            messageAltRemixTagView2.setVisibility(i);
        } else if (message.getTagType() != null && C9612q.m13922c(message.getTagType(), "f")) {
            MessageAltRemixTagView messageAltRemixTagView3 = this.binding.messageAltRemixTagView;
            C9612q.m13918g(messageAltRemixTagView3, "binding.messageAltRemixTagView");
            messageAltRemixTagView3.setVisibility(0);
            this.binding.messageAltRemixTagView.m41653configureTagViewe2j04IU(message.getTagText(), message.getTagTextColor(), message.getTagBackgroundColor(), chatEventHandler, message.m41436getId3Eiw7ao(), message.m41434getChannelIdo4g7jtM(), message.getTagType());
            MessageTagView messageTagView3 = this.binding.messageTagView;
            C9612q.m13918g(messageTagView3, "binding.messageTagView");
            messageTagView3.setVisibility(8);
        } else {
            MessageTagView messageTagView4 = this.binding.messageTagView;
            C9612q.m13918g(messageTagView4, "binding.messageTagView");
            messageTagView4.setVisibility(0);
            this.binding.messageTagView.m41654configureTagVieweCJZyo(message.getTagText(), message.getTagVerified(), message.getTagTextColor(), message.getTagBackgroundColor(), message.getOpTagText(), chatEventHandler, message.m41436getId3Eiw7ao(), message.m41434getChannelIdo4g7jtM(), message.getTagType());
            MessageAltRemixTagView messageAltRemixTagView4 = this.binding.messageAltRemixTagView;
            C9612q.m13918g(messageAltRemixTagView4, "binding.messageAltRemixTagView");
            messageAltRemixTagView4.setVisibility(8);
        }
    }

    public static final void configureAuthor$lambda$30$lambda$28(Message message, ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(eventHandler, "$eventHandler");
        if (message.m41433getAuthorIdwUX8bhU() != null) {
            eventHandler.mo41586onTapAvatarx5gers8(message.m41436getId3Eiw7ao(), message.m41433getAuthorIdwUX8bhU().m42120unboximpl());
        }
    }

    public static final boolean configureAuthor$lambda$30$lambda$29(Message message, ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(eventHandler, "$eventHandler");
        if (message.m41433getAuthorIdwUX8bhU() != null) {
            eventHandler.mo41578onLongPressAvatarx5gers8(message.m41436getId3Eiw7ao(), message.m41433getAuthorIdwUX8bhU().m42120unboximpl());
            return true;
        }
        return true;
    }

    private final void configureAuthorClickListeners(View view, final Message message, final ChatEventHandler chatEventHandler) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(view, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MessageView.configureAuthorClickListeners$lambda$4(Message.this, chatEventHandler, view2);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(view, false, new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.s
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean configureAuthorClickListeners$lambda$5;
                configureAuthorClickListeners$lambda$5 = MessageView.configureAuthorClickListeners$lambda$5(Message.this, chatEventHandler, view2);
                return configureAuthorClickListeners$lambda$5;
            }
        }, 1, null);
    }

    public static final void configureAuthorClickListeners$lambda$4(Message message, ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(eventHandler, "$eventHandler");
        if (message.m41433getAuthorIdwUX8bhU() != null) {
            eventHandler.mo41613onTapUsernamex5gers8(message.m41436getId3Eiw7ao(), message.m41433getAuthorIdwUX8bhU().m42120unboximpl());
        }
    }

    public static final boolean configureAuthorClickListeners$lambda$5(Message message, ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(eventHandler, "$eventHandler");
        if (message.m41433getAuthorIdwUX8bhU() != null) {
            eventHandler.mo41580onLongPressUsernamex5gers8(message.m41436getId3Eiw7ao(), message.m41433getAuthorIdwUX8bhU().m42120unboximpl());
            return true;
        }
        return true;
    }

    private final void configureCommunicationDisabled(boolean z, ChainPart chainPart) {
        boolean z2;
        float f;
        float f2;
        float f3;
        int i = 0;
        if (z && (chainPart == ChainPart.START || chainPart == ChainPart.ONLY)) {
            z2 = true;
        } else {
            z2 = false;
        }
        SimpleDraweeView simpleDraweeView = this.binding.guildCommunicationDisabledIcon;
        C9612q.m13918g(simpleDraweeView, "binding.guildCommunicationDisabledIcon");
        if (!z2) {
            i = 8;
        }
        simpleDraweeView.setVisibility(i);
        SimpleDraweeView simpleDraweeView2 = this.binding.guildCommunicationDisabledIcon;
        C9612q.m13918g(simpleDraweeView2, "binding.guildCommunicationDisabledIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.ClockTimeout);
        SimpleDraweeView simpleDraweeView3 = this.binding.authorAvatar;
        float f4 = 0.5f;
        if (z2) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        simpleDraweeView3.setAlpha(f);
        RoleIconView roleIconView = this.binding.roleIcon;
        if (z2) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        roleIconView.setAlpha(f2);
        SimpleDraweeView simpleDraweeView4 = this.binding.authorAvatarDecoration;
        if (z2) {
            f3 = 0.5f;
        } else {
            f3 = 1.0f;
        }
        simpleDraweeView4.setAlpha(f3);
        SimpleDraweeView simpleDraweeView5 = this.binding.suppressNotificationsIcon;
        if (!z2) {
            f4 = 1.0f;
        }
        simpleDraweeView5.setAlpha(f4);
    }

    private final void configureDivider(boolean z) {
        int i;
        View view = this.binding.messageHeaderDivider;
        C9612q.m13918g(view, "binding.messageHeaderDivider");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void configureSuppressNotifications(boolean z, final ChatEventHandler chatEventHandler, ChainPart chainPart) {
        boolean z2;
        int i;
        if (z && (chainPart == ChainPart.START || chainPart == ChainPart.ONLY)) {
            z2 = true;
        } else {
            z2 = false;
        }
        SimpleDraweeView simpleDraweeView = this.binding.suppressNotificationsIcon;
        C9612q.m13918g(simpleDraweeView, "binding.suppressNotificationsIcon");
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        simpleDraweeView.setVisibility(i);
        if (z2) {
            SimpleDraweeView simpleDraweeView2 = this.binding.suppressNotificationsIcon;
            C9612q.m13918g(simpleDraweeView2, "binding.suppressNotificationsIcon");
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.BellSnooze);
            SimpleDraweeView simpleDraweeView3 = this.binding.suppressNotificationsIcon;
            C9612q.m13918g(simpleDraweeView3, "binding.suppressNotificationsIcon");
            ColorUtilsKt.setTintColor(simpleDraweeView3, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        }
        SimpleDraweeView simpleDraweeView4 = this.binding.suppressNotificationsIcon;
        C9612q.m13918g(simpleDraweeView4, "binding.suppressNotificationsIcon");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView4, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageView.configureSuppressNotifications$lambda$31(ChatEventHandler.this, view);
            }
        }, 1, null);
    }

    public static final void configureSuppressNotifications$lambda$31(ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(eventHandler, "$eventHandler");
        eventHandler.onTapSuppressNotificationsIcon();
    }

    /* JADX WARN: Code restructure failed: missing block: B:724:0x04e9, code lost:
        if ((r2 instanceof com.discord.chat.bridge.messageframe.MessageFrameMediaViewer) != false) goto L209;
     */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<com.discord.chat.presentation.message.messagepart.MessageAccessory> generateMessageAccessories(com.discord.chat.bridge.Message r38, com.discord.chat.presentation.root.MessageContext r39, com.discord.chat.bridge.messageframe.MessageFrame r40, kotlin.jvm.functions.Function4<? super com.discord.primitives.MessageId, ? super com.discord.primitives.ChannelId, ? super java.lang.Integer, ? super com.discord.chat.bridge.MediaType, kotlin.Unit> r41) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.MessageView.generateMessageAccessories(com.discord.chat.bridge.Message, com.discord.chat.presentation.root.MessageContext, com.discord.chat.bridge.messageframe.MessageFrame, kotlin.jvm.functions.Function4):java.util.List");
    }

    private static final View.OnLongClickListener generateMessageAccessories$getLongClickListener(final Function4<? super MessageId, ? super ChannelId, ? super Integer, ? super MediaType, Unit> function4, final Message message, final int i, final MediaType mediaType) {
        if (function4 != null) {
            return new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.t
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m32041xca729c2f;
                    m32041xca729c2f = MessageView.m32041xca729c2f(Function4.this, message, i, mediaType, view);
                    return m32041xca729c2f;
                }
            };
        }
        return null;
    }

    /* renamed from: generateMessageAccessories$getLongClickListener$lambda$7$lambda$6 */
    public static final boolean m32041xca729c2f(Function4 function4, Message message, int i, MediaType mediaType, View view) {
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(mediaType, "$mediaType");
        function4.invoke(MessageId.m42073boximpl(message.m41436getId3Eiw7ao()), ChannelId.m42047boximpl(message.m41434getChannelIdo4g7jtM()), Integer.valueOf(i), mediaType);
        return true;
    }

    public static /* synthetic */ void setMessage$default(MessageView messageView, Message message, MessageContext messageContext, MessageFrame messageFrame, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, Function0 function0, boolean z, boolean z2, boolean z3, int i, Object obj) {
        MessageFrame messageFrame2;
        ChatEventHandler.Empty empty;
        ComponentProvider componentProvider2;
        MessageView$setMessage$1 messageView$setMessage$1;
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 4) != 0) {
            messageFrame2 = null;
        } else {
            messageFrame2 = messageFrame;
        }
        if ((i & 8) != 0) {
            empty = ChatEventHandler.Empty.INSTANCE;
        } else {
            empty = chatEventHandler;
        }
        if ((i & 16) != 0) {
            componentProvider2 = null;
        } else {
            componentProvider2 = componentProvider;
        }
        if ((i & 32) != 0) {
            messageView$setMessage$1 = MessageView$setMessage$1.INSTANCE;
        } else {
            messageView$setMessage$1 = function0;
        }
        if ((i & 64) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 128) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 256) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        messageView.setMessage(message, messageContext, messageFrame2, empty, componentProvider2, messageView$setMessage$1, z4, z5, z6);
    }

    public static final void setMessage$lambda$1$lambda$0(Function2 onMessageTapped, Message message, View view) {
        C9612q.m13917h(onMessageTapped, "$onMessageTapped");
        C9612q.m13917h(message, "$message");
        onMessageTapped.invoke(MessageId.m42073boximpl(message.m41436getId3Eiw7ao()), ChannelId.m42047boximpl(message.m41434getChannelIdo4g7jtM()));
    }

    public static final boolean setMessage$lambda$3$lambda$2(Function4 it, Message message, View view) {
        C9612q.m13917h(it, "$it");
        C9612q.m13917h(message, "$message");
        it.invoke(MessageId.m42073boximpl(message.m41436getId3Eiw7ao()), ChannelId.m42047boximpl(message.m41434getChannelIdo4g7jtM()), null, null);
        return true;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public boolean getEnableSwipeToEdit() {
        return this.enableSwipeToEdit;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public Function0<Unit> getOnInitiateEdit() {
        return this.onInitiateEdit;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public Function0<Unit> getOnInitiateReply() {
        return this.onInitiateReply;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public MaskedShadowView getShadowView() {
        MaskedShadowView maskedShadowView = this.shadowView;
        if (maskedShadowView != null) {
            return maskedShadowView;
        }
        C9612q.m13900y("shadowView");
        return null;
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
        return simpleDraweeView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        return !this.allowChildGestures;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void onSwipeEnd() {
        setClipChildren(true);
        setClipToPadding(true);
        getShadowView().setVisibility(4);
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void onSwipeStart() {
        setClipChildren(false);
        setClipToPadding(false);
        getShadowView().setVisibility(0);
    }

    public final void setAccessoriesRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        C9612q.m13917h(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setEnableSwipeToEdit(boolean z) {
        this.enableSwipeToEdit = z;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setEnableSwipeToReply(boolean z) {
        this.enableSwipeToReply = z;
    }

    public final void setMessage(final Message message, MessageContext messageContext, MessageFrame messageFrame, ChatEventHandler eventHandler, ComponentProvider componentProvider, Function0<? extends ChainPart> onChainPart, boolean z, boolean z2, boolean z3) {
        boolean z4;
        View.OnClickListener onClickListener;
        C9612q.m13917h(message, "message");
        C9612q.m13917h(messageContext, "messageContext");
        C9612q.m13917h(eventHandler, "eventHandler");
        C9612q.m13917h(onChainPart, "onChainPart");
        this.onChainPart = onChainPart;
        setOnInitiateReply(new MessageView$setMessage$2(eventHandler, message));
        setOnInitiateEdit(new MessageView$setMessage$3(eventHandler, message));
        setEnableSwipeToReply(messageContext.getEnableSwipeToReply());
        setEnableSwipeToEdit(messageContext.getEnableSwipeToEdit());
        this.allowChildGestures = z;
        ChainPart invoke = onChainPart.invoke();
        if (z3) {
            this.binding.accessoriesView.updateLeftMargin(getResources().getDimensionPixelSize(C2912R.dimen.message_horizontal_spacing));
        } else {
            this.binding.accessoriesView.updateLeftMargin(getResources().getDimensionPixelSize(C2912R.dimen.message_start_guideline));
        }
        int i = 8;
        if (messageFrame != null && !(messageFrame instanceof UnknownMessageFrame)) {
            MessageFrameHeaderView messageFrameHeaderView = this.binding.messageFrameHeader;
            C9612q.m13918g(messageFrameHeaderView, "binding.messageFrameHeader");
            messageFrameHeaderView.setVisibility(0);
            this.binding.messageFrameHeader.configure(messageFrame);
        } else {
            MessageFrameHeaderView messageFrameHeaderView2 = this.binding.messageFrameHeader;
            C9612q.m13918g(messageFrameHeaderView2, "binding.messageFrameHeader");
            messageFrameHeaderView2.setVisibility(8);
        }
        configureAuthor(message, eventHandler, invoke);
        configureDivider(messageContext.getShowDivider());
        String threadStarterMessageHeader = message.getThreadStarterMessageHeader();
        ThreadStarterMessageHeaderView threadStarterMessageHeaderView = this.binding.threadStarterHeader;
        if (message.getReferencedMessage() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        threadStarterMessageHeaderView.configure(threadStarterMessageHeader, z4);
        MessageHighlightHeader messageHighlightHeader = this.binding.highlightHeader;
        C9612q.m13918g(messageHighlightHeader, "binding.highlightHeader");
        if (z2) {
            i = 0;
        }
        messageHighlightHeader.setVisibility(i);
        if (message.getReferencedMessage() != null) {
            MessageViewReplyPreview messageViewReplyPreview = this.binding.replyPreview;
            C9612q.m13918g(messageViewReplyPreview, "binding.replyPreview");
            MessageViewReplyPreview.configureReply$default(messageViewReplyPreview, message.getReferencedMessage(), false, new MessageView$setMessage$4(eventHandler, message), 2, null);
        } else if (message.getExecutedCommand() != null) {
            this.binding.replyPreview.m41655configureExecutedCommandLdU2QRA(message.m41436getId3Eiw7ao(), message.getExecutedCommand(), MessageKt.shouldAnimateEmoji(message), message.getShouldShowRoleDot(), message.getShouldShowRoleOnName(), eventHandler);
        } else {
            this.binding.replyPreview.clear();
        }
        final Function2<MessageId, ChannelId, Unit> mo41623getOnMessageTapped = eventHandler.mo41623getOnMessageTapped();
        View.OnLongClickListener onLongClickListener = null;
        if (mo41623getOnMessageTapped != null) {
            onClickListener = new View.OnClickListener() { // from class: com.discord.chat.presentation.message.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageView.setMessage$lambda$1$lambda$0(Function2.this, message, view);
                }
            };
        } else {
            onClickListener = null;
        }
        final Function4<MessageId, ChannelId, Integer, MediaType, Unit> mo41622getOnMessageLongPressed = eventHandler.mo41622getOnMessageLongPressed();
        if (mo41622getOnMessageLongPressed != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.n
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean message$lambda$3$lambda$2;
                    message$lambda$3$lambda$2 = MessageView.setMessage$lambda$3$lambda$2(Function4.this, message, view);
                    return message$lambda$3$lambda$2;
                }
            };
        }
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, onClickListener);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, onLongClickListener2);
        List<MessageAccessory> generateMessageAccessories = generateMessageAccessories(message, messageContext, messageFrame, eventHandler.mo41622getOnMessageLongPressed());
        this.binding.accessoriesView.m41652setAccessoriesRC8ZMxU(message.m41436getId3Eiw7ao(), message.m41434getChannelIdo4g7jtM(), message.m41435getGuildIdqOKuAAo(), generateMessageAccessories, eventHandler, componentProvider);
        configureAccessoriesMargin(generateMessageAccessories);
        configureCommunicationDisabled(C9612q.m13922c(message.getCommunicationDisabled(), Boolean.TRUE), invoke);
        configureSuppressNotifications(MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.SUPPRESS_NOTIFICATIONS), eventHandler, invoke);
        this.binding.accessoriesView.setOnCurrentContentViewChanged(new MessageView$setMessage$5(this, message, onClickListener, onLongClickListener2));
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setOnInitiateEdit(Function0<Unit> function0) {
        C9612q.m13917h(function0, "<set-?>");
        this.onInitiateEdit = function0;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setOnInitiateReply(Function0<Unit> function0) {
        C9612q.m13917h(function0, "<set-?>");
        this.onInitiateReply = function0;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z && (isClickable() || isFocusable()));
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setShadowView(MaskedShadowView maskedShadowView) {
        C9612q.m13917h(maskedShadowView, "<set-?>");
        this.shadowView = maskedShadowView;
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    public Integer spacingPxOverride() {
        int dpToPx;
        int i = WhenMappings.$EnumSwitchMapping$1[this.onChainPart.invoke().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C11581q();
            }
            dpToPx = 0;
        } else {
            dpToPx = SizeUtilsKt.getDpToPx(16);
        }
        return Integer.valueOf(dpToPx);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        MessageViewBinding inflate = MessageViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        TextView textView = inflate.timestamp;
        C9612q.m13918g(textView, "binding.timestamp");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        inflate.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView textView2 = inflate.timestamp;
        C9612q.m13918g(textView2, "binding.timestamp");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f, 15.0f);
        TextView textView3 = inflate.authorName;
        C9612q.m13918g(textView3, "binding.authorName");
        DiscordFontUtilsKt.setDiscordFont(textView3, DiscordFont.PrimarySemibold);
        TextView textView4 = inflate.authorName;
        C9612q.m13918g(textView4, "binding.authorName");
        SetTextSizeSpKt.setTextSizeSp(textView4, 16.0f, 20.0f);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        inflate.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(context, C2912R.color.message_divider_light, C2912R.color.message_divider_dark));
        MaskedShadowView maskedShadowView = inflate.shadowView;
        C9612q.m13918g(maskedShadowView, "binding.shadowView");
        setShadowView(maskedShadowView);
        getShadowView().setVisibility(4);
        this.onChainPart = MessageView$onChainPart$1.INSTANCE;
        this.allowChildGestures = true;
        this.onInitiateReply = MessageView$onInitiateReply$1.INSTANCE;
        this.onInitiateEdit = MessageView$onInitiateEdit$1.INSTANCE;
        this.accessories = new ArrayList<>(2);
    }
}