package com.discord.chat.presentation.root;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.truncation.Truncation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u008f\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001J\u0013\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019¨\u00068"}, m14357d2 = {"Lcom/discord/chat/presentation/root/MessageContext;", "", "showDivider", "", "canAddNewReactions", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "useAttachmentGridLayout", "useAttachmentUploadPreview", "enableSwipeToReply", "enableSwipeToEdit", "useAddBurstReaction", "obscureLearnMoreLabel", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZZLjava/lang/String;)V", "getAddNewBurstReactionAccessibilityLabel", "()Ljava/lang/String;", "getAddNewReactionAccessibilityLabel", "getAddReactionLabel", "getCanAddNewReactions", "()Z", "getEnableSwipeToEdit", "getEnableSwipeToReply", "getObscureLearnMoreLabel", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getShowDivider", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "getUseAddBurstReaction", "getUseAttachmentGridLayout", "getUseAttachmentUploadPreview", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageContext {
    private final String addNewBurstReactionAccessibilityLabel;
    private final String addNewReactionAccessibilityLabel;
    private final String addReactionLabel;
    private final boolean canAddNewReactions;
    private final boolean enableSwipeToEdit;
    private final boolean enableSwipeToReply;
    private final String obscureLearnMoreLabel;
    private final ReactionsTheme reactionsTheme;
    private final boolean showDivider;
    private final Truncation truncation;
    private final boolean useAddBurstReaction;
    private final boolean useAttachmentGridLayout;
    private final boolean useAttachmentUploadPreview;

    public MessageContext() {
        this(false, false, null, null, null, null, null, false, false, false, false, false, null, 8191, null);
    }

    public MessageContext(boolean z, boolean z2, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, Truncation truncation, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String obscureLearnMoreLabel) {
        C9612q.m13917h(addReactionLabel, "addReactionLabel");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9612q.m13917h(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        C9612q.m13917h(obscureLearnMoreLabel, "obscureLearnMoreLabel");
        this.showDivider = z;
        this.canAddNewReactions = z2;
        this.addReactionLabel = addReactionLabel;
        this.addNewReactionAccessibilityLabel = addNewReactionAccessibilityLabel;
        this.addNewBurstReactionAccessibilityLabel = addNewBurstReactionAccessibilityLabel;
        this.reactionsTheme = reactionsTheme;
        this.truncation = truncation;
        this.useAttachmentGridLayout = z3;
        this.useAttachmentUploadPreview = z4;
        this.enableSwipeToReply = z5;
        this.enableSwipeToEdit = z6;
        this.useAddBurstReaction = z7;
        this.obscureLearnMoreLabel = obscureLearnMoreLabel;
    }

    public final boolean component1() {
        return this.showDivider;
    }

    public final boolean component10() {
        return this.enableSwipeToReply;
    }

    public final boolean component11() {
        return this.enableSwipeToEdit;
    }

    public final boolean component12() {
        return this.useAddBurstReaction;
    }

    public final String component13() {
        return this.obscureLearnMoreLabel;
    }

    public final boolean component2() {
        return this.canAddNewReactions;
    }

    public final String component3() {
        return this.addReactionLabel;
    }

    public final String component4() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String component5() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final ReactionsTheme component6() {
        return this.reactionsTheme;
    }

    public final Truncation component7() {
        return this.truncation;
    }

    public final boolean component8() {
        return this.useAttachmentGridLayout;
    }

    public final boolean component9() {
        return this.useAttachmentUploadPreview;
    }

    public final MessageContext copy(boolean z, boolean z2, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, Truncation truncation, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String obscureLearnMoreLabel) {
        C9612q.m13917h(addReactionLabel, "addReactionLabel");
        C9612q.m13917h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        C9612q.m13917h(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        C9612q.m13917h(obscureLearnMoreLabel, "obscureLearnMoreLabel");
        return new MessageContext(z, z2, addReactionLabel, addNewReactionAccessibilityLabel, addNewBurstReactionAccessibilityLabel, reactionsTheme, truncation, z3, z4, z5, z6, z7, obscureLearnMoreLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageContext) {
            MessageContext messageContext = (MessageContext) obj;
            return this.showDivider == messageContext.showDivider && this.canAddNewReactions == messageContext.canAddNewReactions && C9612q.m13922c(this.addReactionLabel, messageContext.addReactionLabel) && C9612q.m13922c(this.addNewReactionAccessibilityLabel, messageContext.addNewReactionAccessibilityLabel) && C9612q.m13922c(this.addNewBurstReactionAccessibilityLabel, messageContext.addNewBurstReactionAccessibilityLabel) && C9612q.m13922c(this.reactionsTheme, messageContext.reactionsTheme) && C9612q.m13922c(this.truncation, messageContext.truncation) && this.useAttachmentGridLayout == messageContext.useAttachmentGridLayout && this.useAttachmentUploadPreview == messageContext.useAttachmentUploadPreview && this.enableSwipeToReply == messageContext.enableSwipeToReply && this.enableSwipeToEdit == messageContext.enableSwipeToEdit && this.useAddBurstReaction == messageContext.useAddBurstReaction && C9612q.m13922c(this.obscureLearnMoreLabel, messageContext.obscureLearnMoreLabel);
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

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    public final boolean getEnableSwipeToEdit() {
        return this.enableSwipeToEdit;
    }

    public final boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    public final String getObscureLearnMoreLabel() {
        return this.obscureLearnMoreLabel;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    public final boolean getUseAddBurstReaction() {
        return this.useAddBurstReaction;
    }

    public final boolean getUseAttachmentGridLayout() {
        return this.useAttachmentGridLayout;
    }

    public final boolean getUseAttachmentUploadPreview() {
        return this.useAttachmentUploadPreview;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    public int hashCode() {
        boolean z = this.showDivider;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.canAddNewReactions;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode = (((((((i + i2) * 31) + this.addReactionLabel.hashCode()) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31) + this.addNewBurstReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int hashCode2 = (hashCode + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        Truncation truncation = this.truncation;
        int hashCode3 = (hashCode2 + (truncation != null ? truncation.hashCode() : 0)) * 31;
        ?? r22 = this.useAttachmentGridLayout;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode3 + i3) * 31;
        ?? r23 = this.useAttachmentUploadPreview;
        int i5 = r23;
        if (r23 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r24 = this.enableSwipeToReply;
        int i7 = r24;
        if (r24 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        ?? r25 = this.enableSwipeToEdit;
        int i9 = r25;
        if (r25 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z2 = this.useAddBurstReaction;
        return ((i10 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.obscureLearnMoreLabel.hashCode();
    }

    public String toString() {
        boolean z = this.showDivider;
        boolean z2 = this.canAddNewReactions;
        String str = this.addReactionLabel;
        String str2 = this.addNewReactionAccessibilityLabel;
        String str3 = this.addNewBurstReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        Truncation truncation = this.truncation;
        boolean z3 = this.useAttachmentGridLayout;
        boolean z4 = this.useAttachmentUploadPreview;
        boolean z5 = this.enableSwipeToReply;
        boolean z6 = this.enableSwipeToEdit;
        boolean z7 = this.useAddBurstReaction;
        String str4 = this.obscureLearnMoreLabel;
        return "MessageContext(showDivider=" + z + ", canAddNewReactions=" + z2 + ", addReactionLabel=" + str + ", addNewReactionAccessibilityLabel=" + str2 + ", addNewBurstReactionAccessibilityLabel=" + str3 + ", reactionsTheme=" + reactionsTheme + ", truncation=" + truncation + ", useAttachmentGridLayout=" + z3 + ", useAttachmentUploadPreview=" + z4 + ", enableSwipeToReply=" + z5 + ", enableSwipeToEdit=" + z6 + ", useAddBurstReaction=" + z7 + ", obscureLearnMoreLabel=" + str4 + ")";
    }

    public /* synthetic */ MessageContext(boolean z, boolean z2, String str, String str2, String str3, ReactionsTheme reactionsTheme, Truncation truncation, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : reactionsTheme, (i & 64) == 0 ? truncation : null, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0 ? z7 : false, (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? str4 : "");
    }
}