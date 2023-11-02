package com.discord.chat.presentation.message.messagepart;

import android.view.View;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.media.PortalUiModel;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bd\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010'\u001a\u00020\u0004HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u0088\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/presentation/media/PortalUiModel;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "", "constrainedWidth", "radiusPx", "embed", "Lcom/discord/chat/bridge/embed/Embed;", "shouldAutoPlayGifs", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstrainedWidth", "()I", "getEmbed", "()Lcom/discord/chat/bridge/embed/Embed;", "getIndex", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getOnLongClick", "()Landroid/view/View$OnLongClickListener;", "getRadiusPx", "getShouldAnimateEmoji", "()Z", "getShouldAutoPlayGifs", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component1", "component1-3Eiw7ao", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-5odn8qk", "(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedMessageAccessory extends MessageAccessory implements PortalUiModel {
    private final int constrainedWidth;
    private final Embed embed;
    private final int index;
    private final String messageId;
    private final View.OnLongClickListener onLongClick;
    private final int radiusPx;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldAutoPlayGifs;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final SpoilerAttributes spoilerAttributes;

    private EmbedMessageAccessory(String str, int i, int i2, int i3, Embed embed, boolean z, boolean z2, boolean z3, boolean z4, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener) {
        super(str, "embed " + i, null);
        this.messageId = str;
        this.index = i;
        this.constrainedWidth = i2;
        this.radiusPx = i3;
        this.embed = embed;
        this.shouldAutoPlayGifs = z;
        this.shouldAnimateEmoji = z2;
        this.shouldShowRoleDot = z3;
        this.shouldShowRoleOnName = z4;
        this.spoilerAttributes = spoilerAttributes;
        this.onLongClick = onLongClickListener;
    }

    public /* synthetic */ EmbedMessageAccessory(String str, int i, int i2, int i3, Embed embed, boolean z, boolean z2, boolean z3, boolean z4, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, embed, z, z2, z3, z4, spoilerAttributes, onLongClickListener);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41672component13Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final SpoilerAttributes component10() {
        return this.spoilerAttributes;
    }

    public final View.OnLongClickListener component11() {
        return this.onLongClick;
    }

    public final int component2() {
        return getIndex();
    }

    public final int component3() {
        return this.constrainedWidth;
    }

    public final int component4() {
        return this.radiusPx;
    }

    public final Embed component5() {
        return this.embed;
    }

    public final boolean component6() {
        return this.shouldAutoPlayGifs;
    }

    public final boolean component7() {
        return this.shouldAnimateEmoji;
    }

    public final boolean component8() {
        return this.shouldShowRoleDot;
    }

    public final boolean component9() {
        return this.shouldShowRoleOnName;
    }

    /* renamed from: copy-5odn8qk  reason: not valid java name */
    public final EmbedMessageAccessory m41673copy5odn8qk(String messageId, int i, int i2, int i3, Embed embed, boolean z, boolean z2, boolean z3, boolean z4, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(embed, "embed");
        return new EmbedMessageAccessory(messageId, i, i2, i3, embed, z, z2, z3, z4, spoilerAttributes, onLongClickListener, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmbedMessageAccessory) {
            EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) obj;
            return MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), embedMessageAccessory.mo41659getMessageId3Eiw7ao()) && getIndex() == embedMessageAccessory.getIndex() && this.constrainedWidth == embedMessageAccessory.constrainedWidth && this.radiusPx == embedMessageAccessory.radiusPx && C9612q.m13922c(this.embed, embedMessageAccessory.embed) && this.shouldAutoPlayGifs == embedMessageAccessory.shouldAutoPlayGifs && this.shouldAnimateEmoji == embedMessageAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == embedMessageAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == embedMessageAccessory.shouldShowRoleOnName && C9612q.m13922c(this.spoilerAttributes, embedMessageAccessory.spoilerAttributes) && C9612q.m13922c(this.onLongClick, embedMessageAccessory.onLongClick);
        }
        return false;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final Embed getEmbed() {
        return this.embed;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    @Override // com.discord.chat.presentation.media.PortalUiModel
    public double getPortal() {
        return PortalUiModel.DefaultImpls.getPortal(this);
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldAutoPlayGifs() {
        return this.shouldAutoPlayGifs;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42078hashCodeimpl = ((((((((MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao()) * 31) + getIndex()) * 31) + this.constrainedWidth) * 31) + this.radiusPx) * 31) + this.embed.hashCode()) * 31;
        boolean z = this.shouldAutoPlayGifs;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (m42078hashCodeimpl + i) * 31;
        boolean z2 = this.shouldAnimateEmoji;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.shouldShowRoleDot;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.shouldShowRoleOnName;
        int i7 = (i6 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int hashCode = (i7 + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        return hashCode + (onLongClickListener != null ? onLongClickListener.hashCode() : 0);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        int index = getIndex();
        int i = this.constrainedWidth;
        int i2 = this.radiusPx;
        Embed embed = this.embed;
        boolean z = this.shouldAutoPlayGifs;
        boolean z2 = this.shouldAnimateEmoji;
        boolean z3 = this.shouldShowRoleDot;
        boolean z4 = this.shouldShowRoleOnName;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        return "EmbedMessageAccessory(messageId=" + m42079toStringimpl + ", index=" + index + ", constrainedWidth=" + i + ", radiusPx=" + i2 + ", embed=" + embed + ", shouldAutoPlayGifs=" + z + ", shouldAnimateEmoji=" + z2 + ", shouldShowRoleDot=" + z3 + ", shouldShowRoleOnName=" + z4 + ", spoilerAttributes=" + spoilerAttributes + ", onLongClick=" + onLongClickListener + ")";
    }
}
