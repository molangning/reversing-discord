package com.discord.chat.bridge.row;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.AbstractC9961d;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/bridge/row/RowSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/row/Row;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "CHANGE_TYPE_DELETE", "Ljava/lang/String;", "Lkotlinx/serialization/SealedClassSerializer;", "rowSealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getRowSealedClassSerializer$annotations", "()V", "<init>", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RowSerializer extends AbstractC9961d<Row> {
    private static final String CHANGE_TYPE_DELETE = "3";
    public static final RowSerializer INSTANCE = new RowSerializer();
    private static final SealedClassSerializer<Row> rowSealedClassSerializer = new SealedClassSerializer<>("Row", C9591f0.m13969b(Row.class), new KClass[]{C9591f0.m13969b(LoadingRow.class), C9591f0.m13969b(MessageRow.class), C9591f0.m13969b(SeparatorRow.class), C9591f0.m13969b(BlockedGroupRow.class), C9591f0.m13969b(UploadProgressRow.class), C9591f0.m13969b(EmbeddedActivityRow.class)}, new KSerializer[]{LoadingRow.Companion.serializer(), MessageRow.Companion.serializer(), SeparatorRow.Companion.serializer(), BlockedGroupRow.Companion.serializer(), UploadProgressRow.Companion.serializer(), EmbeddedActivityRow.Companion.serializer()});

    private RowSerializer() {
        super(C9591f0.m13969b(Row.class));
    }

    private static /* synthetic */ void getRowSealedClassSerializer$annotations() {
    }

    @Override // kotlinx.serialization.json.AbstractC9961d
    protected DeserializationStrategy<Row> selectDeserializer(JsonElement element) {
        String str;
        JsonPrimitive m12726n;
        C9612q.m13917h(element, "element");
        JsonObject m12727m = C9964g.m12727m(element);
        if (m12727m.containsKey("type")) {
            return rowSealedClassSerializer;
        }
        JsonElement jsonElement = (JsonElement) m12727m.get("changeType");
        if (jsonElement != null && (m12726n = C9964g.m12726n(jsonElement)) != null) {
            str = m12726n.mo12700a();
        } else {
            str = null;
        }
        if (C9612q.m13922c(str, CHANGE_TYPE_DELETE)) {
            return DeleteRow.Companion.serializer();
        }
        throw new IllegalArgumentException("unsupported row json: " + element);
    }
}