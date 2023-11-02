package com.discord.chat.bridge.reaction;

import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000f¨\u0006."}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "seen1", "", "reactionBackgroundColor", "reactionBorderColor", "reactionTextColor", "activeReactionBackgroundColor", "activeReactionBorderColor", "activeReactionTextColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getActiveReactionBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActiveReactionBorderColor", "getActiveReactionTextColor", "getReactionBackgroundColor", "getReactionBorderColor", "getReactionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ReactionsTheme implements ReactionView.ReactionsTheme {
    public static final Companion Companion = new Companion(null);
    private final Integer activeReactionBackgroundColor;
    private final Integer activeReactionBorderColor;
    private final Integer activeReactionTextColor;
    private final Integer reactionBackgroundColor;
    private final Integer reactionBorderColor;
    private final Integer reactionTextColor;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/ReactionsTheme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReactionsTheme> serializer() {
            return ReactionsTheme$$serializer.INSTANCE;
        }
    }

    public ReactionsTheme() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ReactionsTheme(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, ReactionsTheme$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.reactionBackgroundColor = null;
        } else {
            this.reactionBackgroundColor = num;
        }
        if ((i & 2) == 0) {
            this.reactionBorderColor = null;
        } else {
            this.reactionBorderColor = num2;
        }
        if ((i & 4) == 0) {
            this.reactionTextColor = null;
        } else {
            this.reactionTextColor = num3;
        }
        if ((i & 8) == 0) {
            this.activeReactionBackgroundColor = null;
        } else {
            this.activeReactionBackgroundColor = num4;
        }
        if ((i & 16) == 0) {
            this.activeReactionBorderColor = null;
        } else {
            this.activeReactionBorderColor = num5;
        }
        if ((i & 32) == 0) {
            this.activeReactionTextColor = null;
        } else {
            this.activeReactionTextColor = num6;
        }
    }

    public static /* synthetic */ ReactionsTheme copy$default(ReactionsTheme reactionsTheme, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = reactionsTheme.getReactionBackgroundColor();
        }
        if ((i & 2) != 0) {
            num2 = reactionsTheme.getReactionBorderColor();
        }
        Integer num7 = num2;
        if ((i & 4) != 0) {
            num3 = reactionsTheme.getReactionTextColor();
        }
        Integer num8 = num3;
        if ((i & 8) != 0) {
            num4 = reactionsTheme.getActiveReactionBackgroundColor();
        }
        Integer num9 = num4;
        if ((i & 16) != 0) {
            num5 = reactionsTheme.getActiveReactionBorderColor();
        }
        Integer num10 = num5;
        if ((i & 32) != 0) {
            num6 = reactionsTheme.getActiveReactionTextColor();
        }
        return reactionsTheme.copy(num, num7, num8, num9, num10, num6);
    }

    public static final void write$Self(ReactionsTheme self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z6 = false;
        if (output.mo12879z(serialDesc, 0) || self.getReactionBackgroundColor() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2615m0.f7088a, self.getReactionBackgroundColor());
        }
        if (output.mo12879z(serialDesc, 1) || self.getReactionBorderColor() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2615m0.f7088a, self.getReactionBorderColor());
        }
        if (output.mo12879z(serialDesc, 2) || self.getReactionTextColor() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, C2615m0.f7088a, self.getReactionTextColor());
        }
        if (output.mo12879z(serialDesc, 3) || self.getActiveReactionBackgroundColor() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12904E(serialDesc, 3, C2615m0.f7088a, self.getActiveReactionBackgroundColor());
        }
        if (output.mo12879z(serialDesc, 4) || self.getActiveReactionBorderColor() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo12904E(serialDesc, 4, C2615m0.f7088a, self.getActiveReactionBorderColor());
        }
        if (output.mo12879z(serialDesc, 5) || self.getActiveReactionTextColor() != null) {
            z6 = true;
        }
        if (z6) {
            output.mo12904E(serialDesc, 5, C2615m0.f7088a, self.getActiveReactionTextColor());
        }
    }

    public final Integer component1() {
        return getReactionBackgroundColor();
    }

    public final Integer component2() {
        return getReactionBorderColor();
    }

    public final Integer component3() {
        return getReactionTextColor();
    }

    public final Integer component4() {
        return getActiveReactionBackgroundColor();
    }

    public final Integer component5() {
        return getActiveReactionBorderColor();
    }

    public final Integer component6() {
        return getActiveReactionTextColor();
    }

    public final ReactionsTheme copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        return new ReactionsTheme(num, num2, num3, num4, num5, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReactionsTheme) {
            ReactionsTheme reactionsTheme = (ReactionsTheme) obj;
            return C9612q.m13922c(getReactionBackgroundColor(), reactionsTheme.getReactionBackgroundColor()) && C9612q.m13922c(getReactionBorderColor(), reactionsTheme.getReactionBorderColor()) && C9612q.m13922c(getReactionTextColor(), reactionsTheme.getReactionTextColor()) && C9612q.m13922c(getActiveReactionBackgroundColor(), reactionsTheme.getActiveReactionBackgroundColor()) && C9612q.m13922c(getActiveReactionBorderColor(), reactionsTheme.getActiveReactionBorderColor()) && C9612q.m13922c(getActiveReactionTextColor(), reactionsTheme.getActiveReactionTextColor());
        }
        return false;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionBackgroundColor() {
        return this.activeReactionBackgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionBorderColor() {
        return this.activeReactionBorderColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getActiveReactionTextColor() {
        return this.activeReactionTextColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionBackgroundColor() {
        return this.reactionBackgroundColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionBorderColor() {
        return this.reactionBorderColor;
    }

    @Override // com.discord.reactions.ReactionView.ReactionsTheme
    public Integer getReactionTextColor() {
        return this.reactionTextColor;
    }

    public int hashCode() {
        return ((((((((((getReactionBackgroundColor() == null ? 0 : getReactionBackgroundColor().hashCode()) * 31) + (getReactionBorderColor() == null ? 0 : getReactionBorderColor().hashCode())) * 31) + (getReactionTextColor() == null ? 0 : getReactionTextColor().hashCode())) * 31) + (getActiveReactionBackgroundColor() == null ? 0 : getActiveReactionBackgroundColor().hashCode())) * 31) + (getActiveReactionBorderColor() == null ? 0 : getActiveReactionBorderColor().hashCode())) * 31) + (getActiveReactionTextColor() != null ? getActiveReactionTextColor().hashCode() : 0);
    }

    public String toString() {
        Integer reactionBackgroundColor = getReactionBackgroundColor();
        Integer reactionBorderColor = getReactionBorderColor();
        Integer reactionTextColor = getReactionTextColor();
        Integer activeReactionBackgroundColor = getActiveReactionBackgroundColor();
        Integer activeReactionBorderColor = getActiveReactionBorderColor();
        Integer activeReactionTextColor = getActiveReactionTextColor();
        return "ReactionsTheme(reactionBackgroundColor=" + reactionBackgroundColor + ", reactionBorderColor=" + reactionBorderColor + ", reactionTextColor=" + reactionTextColor + ", activeReactionBackgroundColor=" + activeReactionBackgroundColor + ", activeReactionBorderColor=" + activeReactionBorderColor + ", activeReactionTextColor=" + activeReactionTextColor + ")";
    }

    public ReactionsTheme(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.reactionBackgroundColor = num;
        this.reactionBorderColor = num2;
        this.reactionTextColor = num3;
        this.activeReactionBackgroundColor = num4;
        this.activeReactionBorderColor = num5;
        this.activeReactionTextColor = num6;
    }

    public /* synthetic */ ReactionsTheme(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6);
    }
}
