package com.discord.chat.bridge.botuikit;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.AbstractC9961d;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/botuikit/Component;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "", "knownTypes", "Ljava/util/List;", "Lkotlinx/serialization/SealedClassSerializer;", "componentClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getComponentClassSerializer$annotations", "()V", "<init>", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ComponentSerializer extends AbstractC9961d<Component> {
    public static final ComponentSerializer INSTANCE = new ComponentSerializer();
    private static final SealedClassSerializer<Component> componentClassSerializer;
    private static final List<Integer> knownTypes;

    static {
        ComponentType[] values = ComponentType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (ComponentType componentType : values) {
            arrayList.add(Integer.valueOf(componentType.getSerialNumber()));
        }
        knownTypes = arrayList;
        componentClassSerializer = new SealedClassSerializer<>("Component", C9591f0.m13969b(Component.class), new KClass[]{C9591f0.m13969b(UnknownComponent.class), C9591f0.m13969b(ActionRowComponent.class), C9591f0.m13969b(ButtonComponent.class), C9591f0.m13969b(StringSelectComponent.class), C9591f0.m13969b(UserSelectComponent.class), C9591f0.m13969b(RoleSelectComponent.class), C9591f0.m13969b(MentionableSelectComponent.class), C9591f0.m13969b(ChannelSelectComponent.class)}, new KSerializer[]{UnknownComponent.Companion.serializer(), ActionRowComponent.Companion.serializer(), ButtonComponent.Companion.serializer(), StringSelectComponent.Companion.serializer(), UserSelectComponent.Companion.serializer(), RoleSelectComponent.Companion.serializer(), MentionableSelectComponent.Companion.serializer(), ChannelSelectComponent.Companion.serializer()});
    }

    private ComponentSerializer() {
        super(C9591f0.m13969b(Component.class));
    }

    private static /* synthetic */ void getComponentClassSerializer$annotations() {
    }

    @Override // kotlinx.serialization.json.AbstractC9961d
    protected DeserializationStrategy<Component> selectDeserializer(JsonElement element) {
        Integer num;
        boolean m14064L;
        JsonPrimitive m12726n;
        C9612q.m13917h(element, "element");
        List<Integer> list = knownTypes;
        JsonElement jsonElement = (JsonElement) C9964g.m12727m(element).get("type");
        if (jsonElement != null && (m12726n = C9964g.m12726n(jsonElement)) != null) {
            num = Integer.valueOf(C9964g.m12728l(m12726n));
        } else {
            num = null;
        }
        m14064L = C9553r.m14064L(list, num);
        if (m14064L) {
            return componentClassSerializer;
        }
        return UnknownComponent.Companion.serializer();
    }
}
