package com.discord.chat.bridge.reaction;

import com.discord.reactions.BurstReactionView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "Lcom/discord/reactions/BurstReactionView$BurstColorPalette;", "seen1", "", ViewProps.BACKGROUND_COLOR, "", "accentColor", "highlightColor", ViewProps.OPACITY, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getAccentColor", "()Ljava/lang/String;", "getBackgroundColor", "getHighlightColor", "getOpacity", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BurstReactionColorPalette implements BurstReactionView.BurstColorPalette {
    public static final Companion Companion = new Companion(null);
    private final String accentColor;
    private final String backgroundColor;
    private final String highlightColor;
    private final float opacity;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BurstReactionColorPalette> serializer() {
            return BurstReactionColorPalette$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BurstReactionColorPalette(int i, String str, String str2, String str3, float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, BurstReactionColorPalette$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = str;
        this.accentColor = str2;
        this.highlightColor = str3;
        this.opacity = f;
    }

    public static /* synthetic */ BurstReactionColorPalette copy$default(BurstReactionColorPalette burstReactionColorPalette, String str, String str2, String str3, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = burstReactionColorPalette.getBackgroundColor();
        }
        if ((i & 2) != 0) {
            str2 = burstReactionColorPalette.getAccentColor();
        }
        if ((i & 4) != 0) {
            str3 = burstReactionColorPalette.getHighlightColor();
        }
        if ((i & 8) != 0) {
            f = burstReactionColorPalette.getOpacity();
        }
        return burstReactionColorPalette.copy(str, str2, str3, f);
    }

    public static final void write$Self(BurstReactionColorPalette self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        C2560a2 c2560a2 = C2560a2.f7013a;
        output.mo12904E(serialDesc, 0, c2560a2, self.getBackgroundColor());
        output.mo12904E(serialDesc, 1, c2560a2, self.getAccentColor());
        output.mo12904E(serialDesc, 2, c2560a2, self.getHighlightColor());
        output.mo12886s(serialDesc, 3, self.getOpacity());
    }

    public final String component1() {
        return getBackgroundColor();
    }

    public final String component2() {
        return getAccentColor();
    }

    public final String component3() {
        return getHighlightColor();
    }

    public final float component4() {
        return getOpacity();
    }

    public final BurstReactionColorPalette copy(String str, String str2, String str3, float f) {
        return new BurstReactionColorPalette(str, str2, str3, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BurstReactionColorPalette) {
            BurstReactionColorPalette burstReactionColorPalette = (BurstReactionColorPalette) obj;
            return C9612q.m13922c(getBackgroundColor(), burstReactionColorPalette.getBackgroundColor()) && C9612q.m13922c(getAccentColor(), burstReactionColorPalette.getAccentColor()) && C9612q.m13922c(getHighlightColor(), burstReactionColorPalette.getHighlightColor()) && Float.compare(getOpacity(), burstReactionColorPalette.getOpacity()) == 0;
        }
        return false;
    }

    @Override // com.discord.reactions.BurstReactionView.BurstColorPalette
    public String getAccentColor() {
        return this.accentColor;
    }

    @Override // com.discord.reactions.BurstReactionView.BurstColorPalette
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.reactions.BurstReactionView.BurstColorPalette
    public String getHighlightColor() {
        return this.highlightColor;
    }

    @Override // com.discord.reactions.BurstReactionView.BurstColorPalette
    public float getOpacity() {
        return this.opacity;
    }

    public int hashCode() {
        return ((((((getBackgroundColor() == null ? 0 : getBackgroundColor().hashCode()) * 31) + (getAccentColor() == null ? 0 : getAccentColor().hashCode())) * 31) + (getHighlightColor() != null ? getHighlightColor().hashCode() : 0)) * 31) + Float.floatToIntBits(getOpacity());
    }

    public String toString() {
        String backgroundColor = getBackgroundColor();
        String accentColor = getAccentColor();
        String highlightColor = getHighlightColor();
        float opacity = getOpacity();
        return "BurstReactionColorPalette(backgroundColor=" + backgroundColor + ", accentColor=" + accentColor + ", highlightColor=" + highlightColor + ", opacity=" + opacity + ")";
    }

    public BurstReactionColorPalette(String str, String str2, String str3, float f) {
        this.backgroundColor = str;
        this.accentColor = str2;
        this.highlightColor = str3;
        this.opacity = f;
    }
}