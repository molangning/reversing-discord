package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC9961d;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchData;", "", "()V", "Companion", "Serializer", "Lcom/discord/user_search_worker/UserSearchQueryClearData;", "Lcom/discord/user_search_worker/UserSearchQuerySetData;", "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = Serializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class UserSearchData {
    public static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchData;", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchData> serializer() {
            return Serializer.INSTANCE;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchData$Serializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/user_search_worker/UserSearchData;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "<init>", "()V", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Serializer extends AbstractC9961d<UserSearchData> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(C9591f0.m13969b(UserSearchData.class));
        }

        @Override // kotlinx.serialization.json.AbstractC9961d
        protected DeserializationStrategy<UserSearchData> selectDeserializer(JsonElement element) {
            String str;
            JsonPrimitive m12726n;
            C9612q.m13917h(element, "element");
            JsonElement jsonElement = (JsonElement) C9964g.m12727m(element).get("type");
            if (jsonElement != null && (m12726n = C9964g.m12726n(jsonElement)) != null) {
                str = m12726n.mo12700a();
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1657296142) {
                    if (hashCode != 981007403) {
                        if (hashCode == 2135696342 && str.equals("QUERY_CLEAR")) {
                            return UserSearchQueryClearData.Companion.serializer();
                        }
                    } else if (str.equals("QUERY_SET")) {
                        return UserSearchQuerySetData.Companion.serializer();
                    }
                } else if (str.equals("UPDATE_USERS")) {
                    return UserSearchUpdateUsersData.Companion.serializer();
                }
            }
            throw new IllegalArgumentException("unable to find deserializer for json: " + element);
        }
    }

    private UserSearchData() {
    }

    public /* synthetic */ UserSearchData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}