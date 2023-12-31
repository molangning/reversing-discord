package com.discord.chat.bridge.botuikit;

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

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "seen1", "", "type", "indices", "", "errorText", "", "components", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getComponents", "()Ljava/util/List;", "getErrorText", "()Ljava/lang/String;", "getIndices", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ActionRowComponent extends Component {
    public static final Companion Companion = new Companion(null);
    private final List<Component> components;
    private final String errorText;
    private final List<Integer> indices;
    private final int type;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ActionRowComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActionRowComponent> serializer() {
            return ActionRowComponent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionRowComponent(int i, int i2, List list, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (11 != (i & 11)) {
            C2620n1.m32836b(i, 11, ActionRowComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.indices = list;
        if ((i & 4) == 0) {
            this.errorText = null;
        } else {
            this.errorText = str;
        }
        this.components = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionRowComponent copy$default(ActionRowComponent actionRowComponent, int i, List list, String str, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = actionRowComponent.getType();
        }
        if ((i2 & 2) != 0) {
            list = actionRowComponent.getIndices();
        }
        if ((i2 & 4) != 0) {
            str = actionRowComponent.errorText;
        }
        if ((i2 & 8) != 0) {
            list2 = actionRowComponent.components;
        }
        return actionRowComponent.copy(i, list, str, list2);
    }

    public static final void write$Self(ActionRowComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = false;
        output.mo12882w(serialDesc, 0, self.getType());
        output.mo12894i(serialDesc, 1, new C2581f(C2615m0.f7088a), self.getIndices());
        if (output.mo12879z(serialDesc, 2) || self.errorText != null) {
            z = true;
        }
        if (z) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.errorText);
        }
        output.mo12894i(serialDesc, 3, new C2581f(ComponentSerializer.INSTANCE), self.components);
    }

    public final int component1() {
        return getType();
    }

    public final List<Integer> component2() {
        return getIndices();
    }

    public final String component3() {
        return this.errorText;
    }

    public final List<Component> component4() {
        return this.components;
    }

    public final ActionRowComponent copy(int i, List<Integer> indices, String str, List<? extends Component> components) {
        C9612q.m13917h(indices, "indices");
        C9612q.m13917h(components, "components");
        return new ActionRowComponent(i, indices, str, components);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionRowComponent) {
            ActionRowComponent actionRowComponent = (ActionRowComponent) obj;
            return getType() == actionRowComponent.getType() && C9612q.m13922c(getIndices(), actionRowComponent.getIndices()) && C9612q.m13922c(this.errorText, actionRowComponent.errorText) && C9612q.m13922c(this.components, actionRowComponent.components);
        }
        return false;
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public List<Integer> getIndices() {
        return this.indices;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int type = ((getType() * 31) + getIndices().hashCode()) * 31;
        String str = this.errorText;
        return ((type + (str == null ? 0 : str.hashCode())) * 31) + this.components.hashCode();
    }

    public String toString() {
        int type = getType();
        List<Integer> indices = getIndices();
        String str = this.errorText;
        List<Component> list = this.components;
        return "ActionRowComponent(type=" + type + ", indices=" + indices + ", errorText=" + str + ", components=" + list + ")";
    }

    public /* synthetic */ ActionRowComponent(int i, List list, String str, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : str, list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActionRowComponent(int i, List<Integer> indices, String str, List<? extends Component> components) {
        super(null);
        C9612q.m13917h(indices, "indices");
        C9612q.m13917h(components, "components");
        this.type = i;
        this.indices = indices;
        this.errorText = str;
        this.components = components;
    }
}
