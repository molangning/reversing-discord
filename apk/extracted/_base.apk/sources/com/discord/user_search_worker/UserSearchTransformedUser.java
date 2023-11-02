package com.discord.user_search_worker;

import bj.AbstractC2325e;
import bj.C2340g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.InterfaceC9962e;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p304qf.C11889v;
import p470zi.InterfaceC14277f;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002$%B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bHÆ\u0003Jj\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchTransformedUser;", "", "id", "", "username", "isBot", "", "isFriend", "friendNickname", "globalName", "nicknames", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFriendNickname", "()Ljava/lang/String;", "getGlobalName", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNicknames", "()Ljava/util/Map;", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/discord/user_search_worker/UserSearchTransformedUser;", "equals", "other", "hashCode", "", "toString", "Companion", "Serializer", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = Serializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchTransformedUser {
    public static final Companion Companion = new Companion(null);
    private final String friendNickname;
    private final String globalName;

    /* renamed from: id */
    private final String f9571id;
    private final Boolean isBot;
    private final Boolean isFriend;
    private final Map<String, String> nicknames;
    private final String username;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchTransformedUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchTransformedUser> serializer() {
            return Serializer.INSTANCE;
        }
    }

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchTransformedUser$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "()V", "TRANSFORMED_USER_KEYS", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Serializer implements KSerializer<UserSearchTransformedUser> {
        public static final Serializer INSTANCE = new Serializer();
        private static final Set<String> TRANSFORMED_USER_KEYS;

        static {
            Set<String> m14002i;
            m14002i = C9560w.m14002i("id", "username", "isBot", "isFriend", "friendNickname", "globalName");
            TRANSFORMED_USER_KEYS = m14002i;
        }

        private Serializer() {
        }

        @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return C2340g.m33640a("UserSearchTransformedUser", AbstractC2325e.C2334i.f6445a);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public UserSearchTransformedUser deserialize(Decoder decoder) {
            String str;
            Map m6744r;
            String str2;
            JsonPrimitive m12726n;
            JsonPrimitive m12726n2;
            JsonPrimitive m12726n3;
            JsonPrimitive m12726n4;
            C9612q.m13917h(decoder, "decoder");
            JsonElement mo12743g = ((InterfaceC9962e) decoder).mo12743g();
            C9612q.m13919f(mo12743g, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            JsonObject jsonObject = (JsonObject) mo12743g;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                JsonElement value = entry.getValue();
                if (!TRANSFORMED_USER_KEYS.contains(entry.getKey()) && (C9964g.m12726n(value).mo12699e() || (C9964g.m12726n(value) instanceof JsonNull))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                String str3 = (String) entry2.getKey();
                JsonElement jsonElement = (JsonElement) entry2.getValue();
                if (C9964g.m12726n(jsonElement).mo12699e()) {
                    str = C9964g.m12726n(jsonElement).mo12700a();
                }
                arrayList.add(C11591x.m7577a(str3, str));
            }
            m6744r = C11889v.m6744r(arrayList);
            Object obj = jsonObject.get("id");
            C9612q.m13920e(obj);
            String mo12700a = C9964g.m12726n((JsonElement) obj).mo12700a();
            Object obj2 = jsonObject.get("username");
            C9612q.m13920e(obj2);
            String mo12700a2 = C9964g.m12726n((JsonElement) obj2).mo12700a();
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("isBot");
            Boolean valueOf = (jsonElement2 == null || (m12726n4 = C9964g.m12726n(jsonElement2)) == null) ? null : Boolean.valueOf(C9964g.m12734f(m12726n4));
            JsonElement jsonElement3 = (JsonElement) jsonObject.get("isFriend");
            Boolean valueOf2 = (jsonElement3 == null || (m12726n3 = C9964g.m12726n(jsonElement3)) == null) ? null : Boolean.valueOf(C9964g.m12734f(m12726n3));
            JsonElement jsonElement4 = (JsonElement) jsonObject.get("friendNickname");
            if (jsonElement4 == null || (m12726n2 = C9964g.m12726n(jsonElement4)) == null) {
                str2 = null;
            } else {
                str2 = m12726n2.mo12699e() ? m12726n2.mo12700a() : null;
            }
            JsonElement jsonElement5 = (JsonElement) jsonObject.get("globalName");
            if (jsonElement5 != null && (m12726n = C9964g.m12726n(jsonElement5)) != null && m12726n.mo12699e()) {
                str = m12726n.mo12700a();
            }
            return new UserSearchTransformedUser(mo12700a, mo12700a2, valueOf, valueOf2, str2, str, m6744r);
        }

        @Override // p470zi.InterfaceC14279h
        public void serialize(Encoder encoder, UserSearchTransformedUser value) {
            C9612q.m13917h(encoder, "encoder");
            C9612q.m13917h(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    public UserSearchTransformedUser(String id2, String username, Boolean bool, Boolean bool2, String str, String str2, Map<String, String> nicknames) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(username, "username");
        C9612q.m13917h(nicknames, "nicknames");
        this.f9571id = id2;
        this.username = username;
        this.isBot = bool;
        this.isFriend = bool2;
        this.friendNickname = str;
        this.globalName = str2;
        this.nicknames = nicknames;
    }

    public static /* synthetic */ UserSearchTransformedUser copy$default(UserSearchTransformedUser userSearchTransformedUser, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSearchTransformedUser.f9571id;
        }
        if ((i & 2) != 0) {
            str2 = userSearchTransformedUser.username;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            bool = userSearchTransformedUser.isBot;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            bool2 = userSearchTransformedUser.isFriend;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str3 = userSearchTransformedUser.friendNickname;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = userSearchTransformedUser.globalName;
        }
        String str7 = str4;
        Map<String, String> map2 = map;
        if ((i & 64) != 0) {
            map2 = userSearchTransformedUser.nicknames;
        }
        return userSearchTransformedUser.copy(str, str5, bool3, bool4, str6, str7, map2);
    }

    public final String component1() {
        return this.f9571id;
    }

    public final String component2() {
        return this.username;
    }

    public final Boolean component3() {
        return this.isBot;
    }

    public final Boolean component4() {
        return this.isFriend;
    }

    public final String component5() {
        return this.friendNickname;
    }

    public final String component6() {
        return this.globalName;
    }

    public final Map<String, String> component7() {
        return this.nicknames;
    }

    public final UserSearchTransformedUser copy(String id2, String username, Boolean bool, Boolean bool2, String str, String str2, Map<String, String> nicknames) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(username, "username");
        C9612q.m13917h(nicknames, "nicknames");
        return new UserSearchTransformedUser(id2, username, bool, bool2, str, str2, nicknames);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserSearchTransformedUser) {
            UserSearchTransformedUser userSearchTransformedUser = (UserSearchTransformedUser) obj;
            return C9612q.m13922c(this.f9571id, userSearchTransformedUser.f9571id) && C9612q.m13922c(this.username, userSearchTransformedUser.username) && C9612q.m13922c(this.isBot, userSearchTransformedUser.isBot) && C9612q.m13922c(this.isFriend, userSearchTransformedUser.isFriend) && C9612q.m13922c(this.friendNickname, userSearchTransformedUser.friendNickname) && C9612q.m13922c(this.globalName, userSearchTransformedUser.globalName) && C9612q.m13922c(this.nicknames, userSearchTransformedUser.nicknames);
        }
        return false;
    }

    public final String getFriendNickname() {
        return this.friendNickname;
    }

    public final String getGlobalName() {
        return this.globalName;
    }

    public final String getId() {
        return this.f9571id;
    }

    public final Map<String, String> getNicknames() {
        return this.nicknames;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = ((this.f9571id.hashCode() * 31) + this.username.hashCode()) * 31;
        Boolean bool = this.isBot;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFriend;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.friendNickname;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.globalName;
        return ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.nicknames.hashCode();
    }

    public final Boolean isBot() {
        return this.isBot;
    }

    public final Boolean isFriend() {
        return this.isFriend;
    }

    public String toString() {
        String str = this.f9571id;
        String str2 = this.username;
        Boolean bool = this.isBot;
        Boolean bool2 = this.isFriend;
        String str3 = this.friendNickname;
        String str4 = this.globalName;
        Map<String, String> map = this.nicknames;
        return "UserSearchTransformedUser(id=" + str + ", username=" + str2 + ", isBot=" + bool + ", isFriend=" + bool2 + ", friendNickname=" + str3 + ", globalName=" + str4 + ", nicknames=" + map + ")";
    }

    public /* synthetic */ UserSearchTransformedUser(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, map);
    }
}
