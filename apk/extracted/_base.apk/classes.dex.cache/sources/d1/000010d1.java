package com.discord.chat.bridge.row;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.BackgroundHighlight$$serializer;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameSerializer;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.reaction.ReactionsTheme$$serializer;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.bridge.truncation.Truncation$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2590h;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0002ghBÓ\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010#J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010P\u001a\u00020\u001fHÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010W\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010X\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jæ\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fHÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020\u0003HÖ\u0001J\t\u0010_\u001a\u00020\u0010HÖ\u0001J!\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fHÇ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b-\u0010)R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b0\u0010)R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00103R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b4\u0010)R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\bA\u0010)R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006i"}, m14357d2 = {"Lcom/discord/chat/bridge/row/MessageRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "index", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "jumped", "", "highlightJumpedOnceOnly", "message", "Lcom/discord/chat/bridge/MessageBase;", "scrollTo", "animated", "canAddNewReactions", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "isHighlight", "renderContentOnly", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "reactTag", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "swipeActions", "Lcom/discord/chat/bridge/SwipeActionsType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Lcom/discord/chat/bridge/SwipeActionsType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Lcom/discord/chat/bridge/SwipeActionsType;)V", "getAddNewBurstReactionAccessibilityLabel", "()Ljava/lang/String;", "getAddNewReactionAccessibilityLabel", "getAddReactionLabel", "getAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundHighlight", "()Lcom/discord/chat/bridge/BackgroundHighlight;", "getCanAddNewReactions", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getHighlightJumpedOnceOnly", "getIndex", "()I", "()Z", "getJumped", "getMessage$annotations", "()V", "getMessage", "()Lcom/discord/chat/bridge/MessageBase;", "getMessageFrame", "()Lcom/discord/chat/bridge/messageframe/MessageFrame;", "getReactTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getRenderContentOnly", "getScrollTo", "getSwipeActions", "()Lcom/discord/chat/bridge/SwipeActionsType;", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Lcom/discord/chat/bridge/SwipeActionsType;)Lcom/discord/chat/bridge/row/MessageRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final String addNewBurstReactionAccessibilityLabel;
    private final String addNewReactionAccessibilityLabel;
    private final String addReactionLabel;
    private final Boolean animated;
    private final BackgroundHighlight backgroundHighlight;
    private final Boolean canAddNewReactions;
    private final ChangeType changeType;
    private final Boolean highlightJumpedOnceOnly;
    private final int index;
    private final boolean isHighlight;
    private final Boolean jumped;
    private final MessageBase message;
    private final MessageFrame messageFrame;
    private final Integer reactTag;
    private final ReactionsTheme reactionsTheme;
    private final boolean renderContentOnly;
    private final Boolean scrollTo;
    private final SwipeActionsType swipeActions;
    private final Truncation truncation;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/row/MessageRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageRow> serializer() {
            return MessageRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageRow(int i, int i2, ChangeType changeType, Boolean bool, Boolean bool2, @InterfaceC14277f(with = MessageSerializer.class) MessageBase messageBase, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, ReactionsTheme reactionsTheme, boolean z, boolean z2, MessageFrame messageFrame, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, SwipeActionsType swipeActionsType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (19 != (i & 19)) {
            C2620n1.m32836b(i, 19, MessageRow$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i2;
        this.changeType = changeType;
        if ((i & 4) == 0) {
            this.jumped = null;
        } else {
            this.jumped = bool;
        }
        if ((i & 8) == 0) {
            this.highlightJumpedOnceOnly = null;
        } else {
            this.highlightJumpedOnceOnly = bool2;
        }
        this.message = messageBase;
        if ((i & 32) == 0) {
            this.scrollTo = null;
        } else {
            this.scrollTo = bool3;
        }
        if ((i & 64) == 0) {
            this.animated = null;
        } else {
            this.animated = bool4;
        }
        if ((i & 128) == 0) {
            this.canAddNewReactions = null;
        } else {
            this.canAddNewReactions = bool5;
        }
        if ((i & 256) == 0) {
            this.addReactionLabel = null;
        } else {
            this.addReactionLabel = str;
        }
        if ((i & 512) == 0) {
            this.addNewReactionAccessibilityLabel = null;
        } else {
            this.addNewReactionAccessibilityLabel = str2;
        }
        if ((i & 1024) == 0) {
            this.addNewBurstReactionAccessibilityLabel = null;
        } else {
            this.addNewBurstReactionAccessibilityLabel = str3;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.reactionsTheme = null;
        } else {
            this.reactionsTheme = reactionsTheme;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.isHighlight = false;
        } else {
            this.isHighlight = z;
        }
        if ((i & 8192) == 0) {
            this.renderContentOnly = false;
        } else {
            this.renderContentOnly = z2;
        }
        if ((i & 16384) == 0) {
            this.messageFrame = null;
        } else {
            this.messageFrame = messageFrame;
        }
        if ((32768 & i) == 0) {
            this.reactTag = null;
        } else {
            this.reactTag = num;
        }
        if ((65536 & i) == 0) {
            this.truncation = null;
        } else {
            this.truncation = truncation;
        }
        this.backgroundHighlight = (131072 & i) != 0 ? backgroundHighlight : null;
        this.swipeActions = (i & 262144) == 0 ? SwipeActionsType.NONE : swipeActionsType;
    }

    @InterfaceC14277f(with = MessageSerializer.class)
    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final void write$Self(MessageRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12882w(serialDesc, 0, self.getIndex());
        output.mo12894i(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        if (output.mo12879z(serialDesc, 2) || self.jumped != null) {
            output.mo12904E(serialDesc, 2, C2590h.f7055a, self.jumped);
        }
        if (output.mo12879z(serialDesc, 3) || self.highlightJumpedOnceOnly != null) {
            output.mo12904E(serialDesc, 3, C2590h.f7055a, self.highlightJumpedOnceOnly);
        }
        output.mo12894i(serialDesc, 4, MessageSerializer.INSTANCE, self.message);
        if (output.mo12879z(serialDesc, 5) || self.scrollTo != null) {
            output.mo12904E(serialDesc, 5, C2590h.f7055a, self.scrollTo);
        }
        if (output.mo12879z(serialDesc, 6) || self.animated != null) {
            output.mo12904E(serialDesc, 6, C2590h.f7055a, self.animated);
        }
        if (output.mo12879z(serialDesc, 7) || self.canAddNewReactions != null) {
            output.mo12904E(serialDesc, 7, C2590h.f7055a, self.canAddNewReactions);
        }
        if (output.mo12879z(serialDesc, 8) || self.addReactionLabel != null) {
            output.mo12904E(serialDesc, 8, C2560a2.f7013a, self.addReactionLabel);
        }
        if (output.mo12879z(serialDesc, 9) || self.addNewReactionAccessibilityLabel != null) {
            output.mo12904E(serialDesc, 9, C2560a2.f7013a, self.addNewReactionAccessibilityLabel);
        }
        if (output.mo12879z(serialDesc, 10) || self.addNewBurstReactionAccessibilityLabel != null) {
            output.mo12904E(serialDesc, 10, C2560a2.f7013a, self.addNewBurstReactionAccessibilityLabel);
        }
        if (output.mo12879z(serialDesc, 11) || self.reactionsTheme != null) {
            output.mo12904E(serialDesc, 11, ReactionsTheme$$serializer.INSTANCE, self.reactionsTheme);
        }
        if (output.mo12879z(serialDesc, 12) || self.isHighlight) {
            output.mo12881x(serialDesc, 12, self.isHighlight);
        }
        if (output.mo12879z(serialDesc, 13) || self.renderContentOnly) {
            output.mo12881x(serialDesc, 13, self.renderContentOnly);
        }
        if (output.mo12879z(serialDesc, 14) || self.messageFrame != null) {
            output.mo12904E(serialDesc, 14, MessageFrameSerializer.INSTANCE, self.messageFrame);
        }
        if (output.mo12879z(serialDesc, 15) || self.reactTag != null) {
            output.mo12904E(serialDesc, 15, C2615m0.f7088a, self.reactTag);
        }
        if (output.mo12879z(serialDesc, 16) || self.truncation != null) {
            output.mo12904E(serialDesc, 16, Truncation$$serializer.INSTANCE, self.truncation);
        }
        if (output.mo12879z(serialDesc, 17) || self.backgroundHighlight != null) {
            output.mo12904E(serialDesc, 17, BackgroundHighlight$$serializer.INSTANCE, self.backgroundHighlight);
        }
        if (output.mo12879z(serialDesc, 18) || self.swipeActions != SwipeActionsType.NONE) {
            output.mo12894i(serialDesc, 18, SwipeActionsType.Serializer.INSTANCE, self.swipeActions);
        }
    }

    public final int component1() {
        return getIndex();
    }

    public final String component10() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String component11() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final ReactionsTheme component12() {
        return this.reactionsTheme;
    }

    public final boolean component13() {
        return this.isHighlight;
    }

    public final boolean component14() {
        return this.renderContentOnly;
    }

    public final MessageFrame component15() {
        return this.messageFrame;
    }

    public final Integer component16() {
        return this.reactTag;
    }

    public final Truncation component17() {
        return this.truncation;
    }

    public final BackgroundHighlight component18() {
        return this.backgroundHighlight;
    }

    public final SwipeActionsType component19() {
        return this.swipeActions;
    }

    public final ChangeType component2() {
        return getChangeType();
    }

    public final Boolean component3() {
        return this.jumped;
    }

    public final Boolean component4() {
        return this.highlightJumpedOnceOnly;
    }

    public final MessageBase component5() {
        return this.message;
    }

    public final Boolean component6() {
        return this.scrollTo;
    }

    public final Boolean component7() {
        return this.animated;
    }

    public final Boolean component8() {
        return this.canAddNewReactions;
    }

    public final String component9() {
        return this.addReactionLabel;
    }

    public final MessageRow copy(int i, ChangeType changeType, Boolean bool, Boolean bool2, MessageBase message, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, ReactionsTheme reactionsTheme, boolean z, boolean z2, MessageFrame messageFrame, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, SwipeActionsType swipeActions) {
        C9612q.m13917h(changeType, "changeType");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(swipeActions, "swipeActions");
        return new MessageRow(i, changeType, bool, bool2, message, bool3, bool4, bool5, str, str2, str3, reactionsTheme, z, z2, messageFrame, num, truncation, backgroundHighlight, swipeActions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageRow) {
            MessageRow messageRow = (MessageRow) obj;
            return getIndex() == messageRow.getIndex() && getChangeType() == messageRow.getChangeType() && C9612q.m13922c(this.jumped, messageRow.jumped) && C9612q.m13922c(this.highlightJumpedOnceOnly, messageRow.highlightJumpedOnceOnly) && C9612q.m13922c(this.message, messageRow.message) && C9612q.m13922c(this.scrollTo, messageRow.scrollTo) && C9612q.m13922c(this.animated, messageRow.animated) && C9612q.m13922c(this.canAddNewReactions, messageRow.canAddNewReactions) && C9612q.m13922c(this.addReactionLabel, messageRow.addReactionLabel) && C9612q.m13922c(this.addNewReactionAccessibilityLabel, messageRow.addNewReactionAccessibilityLabel) && C9612q.m13922c(this.addNewBurstReactionAccessibilityLabel, messageRow.addNewBurstReactionAccessibilityLabel) && C9612q.m13922c(this.reactionsTheme, messageRow.reactionsTheme) && this.isHighlight == messageRow.isHighlight && this.renderContentOnly == messageRow.renderContentOnly && C9612q.m13922c(this.messageFrame, messageRow.messageFrame) && C9612q.m13922c(this.reactTag, messageRow.reactTag) && C9612q.m13922c(this.truncation, messageRow.truncation) && C9612q.m13922c(this.backgroundHighlight, messageRow.backgroundHighlight) && this.swipeActions == messageRow.swipeActions;
        }
        return false;
    }

    public final String getAddNewBurstReactionAccessibilityLabel() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String getAddReactionLabel() {
        return this.addReactionLabel;
    }

    public final Boolean getAnimated() {
        return this.animated;
    }

    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
    }

    public final Boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    @Override // com.discord.chat.bridge.row.Row
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final Boolean getHighlightJumpedOnceOnly() {
        return this.highlightJumpedOnceOnly;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final Boolean getJumped() {
        return this.jumped;
    }

    public final MessageBase getMessage() {
        return this.message;
    }

    public final MessageFrame getMessageFrame() {
        return this.messageFrame;
    }

    public final Integer getReactTag() {
        return this.reactTag;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getRenderContentOnly() {
        return this.renderContentOnly;
    }

    public final Boolean getScrollTo() {
        return this.scrollTo;
    }

    public final SwipeActionsType getSwipeActions() {
        return this.swipeActions;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int index = ((getIndex() * 31) + getChangeType().hashCode()) * 31;
        Boolean bool = this.jumped;
        int hashCode = (index + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.highlightJumpedOnceOnly;
        int hashCode2 = (((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.message.hashCode()) * 31;
        Boolean bool3 = this.scrollTo;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.animated;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAddNewReactions;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.addReactionLabel;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addNewReactionAccessibilityLabel;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addNewBurstReactionAccessibilityLabel;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int hashCode9 = (hashCode8 + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        boolean z = this.isHighlight;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode9 + i) * 31;
        boolean z2 = this.renderContentOnly;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        MessageFrame messageFrame = this.messageFrame;
        int hashCode10 = (i3 + (messageFrame == null ? 0 : messageFrame.hashCode())) * 31;
        Integer num = this.reactTag;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Truncation truncation = this.truncation;
        int hashCode12 = (hashCode11 + (truncation == null ? 0 : truncation.hashCode())) * 31;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        return ((hashCode12 + (backgroundHighlight != null ? backgroundHighlight.hashCode() : 0)) * 31) + this.swipeActions.hashCode();
    }

    public final boolean isHighlight() {
        return this.isHighlight;
    }

    public String toString() {
        int index = getIndex();
        ChangeType changeType = getChangeType();
        Boolean bool = this.jumped;
        Boolean bool2 = this.highlightJumpedOnceOnly;
        MessageBase messageBase = this.message;
        Boolean bool3 = this.scrollTo;
        Boolean bool4 = this.animated;
        Boolean bool5 = this.canAddNewReactions;
        String str = this.addReactionLabel;
        String str2 = this.addNewReactionAccessibilityLabel;
        String str3 = this.addNewBurstReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        boolean z = this.isHighlight;
        boolean z2 = this.renderContentOnly;
        MessageFrame messageFrame = this.messageFrame;
        Integer num = this.reactTag;
        Truncation truncation = this.truncation;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        SwipeActionsType swipeActionsType = this.swipeActions;
        return "MessageRow(index=" + index + ", changeType=" + changeType + ", jumped=" + bool + ", highlightJumpedOnceOnly=" + bool2 + ", message=" + messageBase + ", scrollTo=" + bool3 + ", animated=" + bool4 + ", canAddNewReactions=" + bool5 + ", addReactionLabel=" + str + ", addNewReactionAccessibilityLabel=" + str2 + ", addNewBurstReactionAccessibilityLabel=" + str3 + ", reactionsTheme=" + reactionsTheme + ", isHighlight=" + z + ", renderContentOnly=" + z2 + ", messageFrame=" + messageFrame + ", reactTag=" + num + ", truncation=" + truncation + ", backgroundHighlight=" + backgroundHighlight + ", swipeActions=" + swipeActionsType + ")";
    }

    public /* synthetic */ MessageRow(int i, ChangeType changeType, Boolean bool, Boolean bool2, MessageBase messageBase, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, ReactionsTheme reactionsTheme, boolean z, boolean z2, MessageFrame messageFrame, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, SwipeActionsType swipeActionsType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, changeType, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, messageBase, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : bool4, (i2 & 128) != 0 ? null : bool5, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : reactionsTheme, (i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z, (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? null : messageFrame, (32768 & i2) != 0 ? null : num, (65536 & i2) != 0 ? null : truncation, (131072 & i2) != 0 ? null : backgroundHighlight, (i2 & 262144) != 0 ? SwipeActionsType.NONE : swipeActionsType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRow(int i, ChangeType changeType, Boolean bool, Boolean bool2, MessageBase message, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, ReactionsTheme reactionsTheme, boolean z, boolean z2, MessageFrame messageFrame, Integer num, Truncation truncation, BackgroundHighlight backgroundHighlight, SwipeActionsType swipeActions) {
        super(null);
        C9612q.m13917h(changeType, "changeType");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(swipeActions, "swipeActions");
        this.index = i;
        this.changeType = changeType;
        this.jumped = bool;
        this.highlightJumpedOnceOnly = bool2;
        this.message = message;
        this.scrollTo = bool3;
        this.animated = bool4;
        this.canAddNewReactions = bool5;
        this.addReactionLabel = str;
        this.addNewReactionAccessibilityLabel = str2;
        this.addNewBurstReactionAccessibilityLabel = str3;
        this.reactionsTheme = reactionsTheme;
        this.isHighlight = z;
        this.renderContentOnly = z2;
        this.messageFrame = messageFrame;
        this.reactTag = num;
        this.truncation = truncation;
        this.backgroundHighlight = backgroundHighlight;
        this.swipeActions = swipeActions;
    }
}