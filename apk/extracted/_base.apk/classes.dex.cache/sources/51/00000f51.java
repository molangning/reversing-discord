package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGB\u0082\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017Bp\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0014HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0019\u0010/\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0088\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\nHÖ\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÇ\u0001R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "seen1", "", "type", "indices", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "customId", "", "label", "style", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "disabled", "", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "url", "state", "Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationId-VavddsQ", "()J", "J", "getCustomId", "()Ljava/lang/String;", "getDisabled", "()Z", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getIndices", "()Ljava/util/List;", "getLabel", "getState", "()Lcom/discord/chat/bridge/botuikit/ActionComponentState;", "getStyle", "()Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "getType", "()I", "getUrl", "component1", "component10", "component2", "component3", "component3-VavddsQ", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-onMGE3A", "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ButtonStyle;ZLcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ActionComponentState;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ButtonComponent extends Component {
    public static final Companion Companion = new Companion(null);
    private final long applicationId;
    private final String customId;
    private final boolean disabled;
    private final ComponentEmoji emoji;
    private final List<Integer> indices;
    private final String label;
    private final ActionComponentState state;
    private final ButtonStyle style;
    private final int type;
    private final String url;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ButtonComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ButtonComponent> serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ButtonComponent(int i, int i2, List<Integer> list, ApplicationId applicationId, String str, String str2, ButtonStyle buttonStyle, boolean z, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (551 != (i & 551)) {
            C2620n1.m32836b(i, 551, ButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.indices = list;
        this.applicationId = applicationId.m42043unboximpl();
        if ((i & 8) == 0) {
            this.customId = null;
        } else {
            this.customId = str;
        }
        if ((i & 16) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        this.style = buttonStyle;
        if ((i & 64) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z;
        }
        if ((i & 128) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        if ((i & 256) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        this.state = actionComponentState;
    }

    public /* synthetic */ ButtonComponent(int i, int i2, List list, ApplicationId applicationId, String str, String str2, ButtonStyle buttonStyle, boolean z, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, applicationId, str, str2, buttonStyle, z, componentEmoji, str3, actionComponentState, serializationConstructorMarker);
    }

    public /* synthetic */ ButtonComponent(int i, List list, long j, String str, String str2, ButtonStyle buttonStyle, boolean z, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, j, str, str2, buttonStyle, z, componentEmoji, str3, actionComponentState);
    }

    public static final void write$Self(ButtonComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z5 = false;
        output.mo12882w(serialDesc, 0, self.getType());
        output.mo12894i(serialDesc, 1, new C2581f(C2615m0.f7088a), self.getIndices());
        output.mo12894i(serialDesc, 2, ApplicationId$$serializer.INSTANCE, ApplicationId.m42034boximpl(self.applicationId));
        if (output.mo12879z(serialDesc, 3) || self.customId != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.customId);
        }
        if (output.mo12879z(serialDesc, 4) || self.label != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 4, C2560a2.f7013a, self.label);
        }
        output.mo12894i(serialDesc, 5, ButtonStyle.Serializer.INSTANCE, self.style);
        if (output.mo12879z(serialDesc, 6) || self.disabled) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12881x(serialDesc, 6, self.disabled);
        }
        if (output.mo12879z(serialDesc, 7) || self.emoji != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12904E(serialDesc, 7, ComponentEmoji$$serializer.INSTANCE, self.emoji);
        }
        if (output.mo12879z(serialDesc, 8) || self.url != null) {
            z5 = true;
        }
        if (z5) {
            output.mo12904E(serialDesc, 8, C2560a2.f7013a, self.url);
        }
        output.mo12894i(serialDesc, 9, ActionComponentState.Serializer.INSTANCE, self.state);
    }

    public final int component1() {
        return getType();
    }

    public final ActionComponentState component10() {
        return this.state;
    }

    public final List<Integer> component2() {
        return getIndices();
    }

    /* renamed from: component3-VavddsQ */
    public final long m41449component3VavddsQ() {
        return this.applicationId;
    }

    public final String component4() {
        return this.customId;
    }

    public final String component5() {
        return this.label;
    }

    public final ButtonStyle component6() {
        return this.style;
    }

    public final boolean component7() {
        return this.disabled;
    }

    public final ComponentEmoji component8() {
        return this.emoji;
    }

    public final String component9() {
        return this.url;
    }

    /* renamed from: copy-onMGE3A */
    public final ButtonComponent m41450copyonMGE3A(int i, List<Integer> indices, long j, String str, String str2, ButtonStyle style, boolean z, ComponentEmoji componentEmoji, String str3, ActionComponentState state) {
        C9612q.m13917h(indices, "indices");
        C9612q.m13917h(style, "style");
        C9612q.m13917h(state, "state");
        return new ButtonComponent(i, indices, j, str, str2, style, z, componentEmoji, str3, state, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ButtonComponent) {
            ButtonComponent buttonComponent = (ButtonComponent) obj;
            return getType() == buttonComponent.getType() && C9612q.m13922c(getIndices(), buttonComponent.getIndices()) && ApplicationId.m42038equalsimpl0(this.applicationId, buttonComponent.applicationId) && C9612q.m13922c(this.customId, buttonComponent.customId) && C9612q.m13922c(this.label, buttonComponent.label) && this.style == buttonComponent.style && this.disabled == buttonComponent.disabled && C9612q.m13922c(this.emoji, buttonComponent.emoji) && C9612q.m13922c(this.url, buttonComponent.url) && this.state == buttonComponent.state;
        }
        return false;
    }

    /* renamed from: getApplicationId-VavddsQ */
    public final long m41451getApplicationIdVavddsQ() {
        return this.applicationId;
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final ComponentEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public List<Integer> getIndices() {
        return this.indices;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ActionComponentState getState() {
        return this.state;
    }

    public final ButtonStyle getStyle() {
        return this.style;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int type = ((((getType() * 31) + getIndices().hashCode()) * 31) + ApplicationId.m42039hashCodeimpl(this.applicationId)) * 31;
        String str = this.customId;
        int hashCode = (type + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.style.hashCode()) * 31;
        boolean z = this.disabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        ComponentEmoji componentEmoji = this.emoji;
        int hashCode3 = (i2 + (componentEmoji == null ? 0 : componentEmoji.hashCode())) * 31;
        String str3 = this.url;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.state.hashCode();
    }

    public String toString() {
        int type = getType();
        List<Integer> indices = getIndices();
        String m42041toStringimpl = ApplicationId.m42041toStringimpl(this.applicationId);
        String str = this.customId;
        String str2 = this.label;
        ButtonStyle buttonStyle = this.style;
        boolean z = this.disabled;
        ComponentEmoji componentEmoji = this.emoji;
        String str3 = this.url;
        ActionComponentState actionComponentState = this.state;
        return "ButtonComponent(type=" + type + ", indices=" + indices + ", applicationId=" + m42041toStringimpl + ", customId=" + str + ", label=" + str2 + ", style=" + buttonStyle + ", disabled=" + z + ", emoji=" + componentEmoji + ", url=" + str3 + ", state=" + actionComponentState + ")";
    }

    public /* synthetic */ ButtonComponent(int i, List list, long j, String str, String str2, ButtonStyle buttonStyle, boolean z, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, j, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, buttonStyle, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : componentEmoji, (i2 & 256) != 0 ? null : str3, actionComponentState, null);
    }

    private ButtonComponent(int i, List<Integer> list, long j, String str, String str2, ButtonStyle buttonStyle, boolean z, ComponentEmoji componentEmoji, String str3, ActionComponentState actionComponentState) {
        super(null);
        this.type = i;
        this.indices = list;
        this.applicationId = j;
        this.customId = str;
        this.label = str2;
        this.style = buttonStyle;
        this.disabled = z;
        this.emoji = componentEmoji;
        this.url = str3;
        this.state = actionComponentState;
    }
}