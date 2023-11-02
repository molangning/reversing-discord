package com.discord.notifications.api;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.C9984t;
import kotlinx.serialization.json.JsonObject;
import p045cj.C2581f;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bd\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fB@\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0019\u0010%\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0018J\u0019\u0010'\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0014JT\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J!\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208HÇ\u0001R'\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m14357d2 = {"Lcom/discord/notifications/api/KvMessageEntry;", "", "seen1", "", "members", "", "Lkotlinx/serialization/json/JsonObject;", "users", "message", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getId-3Eiw7ao$annotations", "getId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMembers$annotations", "getMembers", "()Ljava/util/List;", "getMessage$annotations", "getMessage", "()Lkotlinx/serialization/json/JsonObject;", "getUsers$annotations", "getUsers", "component1", "component2", "component3", "component4", "component4-3Eiw7ao", "component5", "component5-o4g7jtM", "copy", "copy-kA7ecXY", "(Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;J)Lcom/discord/notifications/api/KvMessageEntry;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class KvMessageEntry {
    public static final Companion Companion = new Companion(null);
    private final long channelId;

    /* renamed from: id */
    private final String f8985id;
    private final List<JsonObject> members;
    private final JsonObject message;
    private final List<JsonObject> users;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/notifications/api/KvMessageEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/KvMessageEntry;", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KvMessageEntry> serializer() {
            return KvMessageEntry$$serializer.INSTANCE;
        }
    }

    private KvMessageEntry(int i, List<JsonObject> list, List<JsonObject> list2, JsonObject jsonObject, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker) {
        List<JsonObject> m14104i;
        if (28 != (i & 28)) {
            C2620n1.m32836b(i, 28, KvMessageEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.members = (i & 1) == 0 ? C9545j.m14104i() : list;
        if ((i & 2) == 0) {
            m14104i = C9545j.m14104i();
            this.users = m14104i;
        } else {
            this.users = list2;
        }
        this.message = jsonObject;
        this.f8985id = str;
        this.channelId = channelId.m42056unboximpl();
    }

    public /* synthetic */ KvMessageEntry(int i, List list, List list2, JsonObject jsonObject, String str, ChannelId channelId, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, jsonObject, str, channelId, serializationConstructorMarker);
    }

    public /* synthetic */ KvMessageEntry(List list, List list2, JsonObject jsonObject, String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, jsonObject, str, j);
    }

    /* renamed from: copy-kA7ecXY$default  reason: not valid java name */
    public static /* synthetic */ KvMessageEntry m41988copykA7ecXY$default(KvMessageEntry kvMessageEntry, List list, List list2, JsonObject jsonObject, String str, long j, int i, Object obj) {
        List<JsonObject> list3 = list;
        if ((i & 1) != 0) {
            list3 = kvMessageEntry.members;
        }
        List<JsonObject> list4 = list2;
        if ((i & 2) != 0) {
            list4 = kvMessageEntry.users;
        }
        List list5 = list4;
        if ((i & 4) != 0) {
            jsonObject = kvMessageEntry.message;
        }
        JsonObject jsonObject2 = jsonObject;
        if ((i & 8) != 0) {
            str = kvMessageEntry.f8985id;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            j = kvMessageEntry.channelId;
        }
        return kvMessageEntry.m41993copykA7ecXY(list3, list5, jsonObject2, str2, j);
    }

    /* renamed from: getChannelId-o4g7jtM$annotations  reason: not valid java name */
    public static /* synthetic */ void m41989getChannelIdo4g7jtM$annotations() {
    }

    /* renamed from: getId-3Eiw7ao$annotations  reason: not valid java name */
    public static /* synthetic */ void m41990getId3Eiw7ao$annotations() {
    }

    public static /* synthetic */ void getMembers$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getUsers$annotations() {
    }

    public static final void write$Self(KvMessageEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        C9984t c9984t = C9984t.f25888a;
        output.mo12894i(serialDesc, 0, new C2581f(c9984t), self.members);
        output.mo12894i(serialDesc, 1, new C2581f(c9984t), self.users);
        output.mo12894i(serialDesc, 2, c9984t, self.message);
        output.mo12894i(serialDesc, 3, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.f8985id));
        output.mo12894i(serialDesc, 4, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
    }

    public final List<JsonObject> component1() {
        return this.members;
    }

    public final List<JsonObject> component2() {
        return this.users;
    }

    public final JsonObject component3() {
        return this.message;
    }

    /* renamed from: component4-3Eiw7ao  reason: not valid java name */
    public final String m41991component43Eiw7ao() {
        return this.f8985id;
    }

    /* renamed from: component5-o4g7jtM  reason: not valid java name */
    public final long m41992component5o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: copy-kA7ecXY  reason: not valid java name */
    public final KvMessageEntry m41993copykA7ecXY(List<JsonObject> members, List<JsonObject> users, JsonObject message, String id2, long j) {
        C9612q.m13917h(members, "members");
        C9612q.m13917h(users, "users");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(id2, "id");
        return new KvMessageEntry(members, users, message, id2, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KvMessageEntry) {
            KvMessageEntry kvMessageEntry = (KvMessageEntry) obj;
            return C9612q.m13922c(this.members, kvMessageEntry.members) && C9612q.m13922c(this.users, kvMessageEntry.users) && C9612q.m13922c(this.message, kvMessageEntry.message) && MessageId.m42077equalsimpl0(this.f8985id, kvMessageEntry.f8985id) && ChannelId.m42051equalsimpl0(this.channelId, kvMessageEntry.channelId);
        }
        return false;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m41994getChannelIdo4g7jtM() {
        return this.channelId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m41995getId3Eiw7ao() {
        return this.f8985id;
    }

    public final List<JsonObject> getMembers() {
        return this.members;
    }

    public final JsonObject getMessage() {
        return this.message;
    }

    public final List<JsonObject> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((((((this.members.hashCode() * 31) + this.users.hashCode()) * 31) + this.message.hashCode()) * 31) + MessageId.m42078hashCodeimpl(this.f8985id)) * 31) + ChannelId.m42052hashCodeimpl(this.channelId);
    }

    public String toString() {
        List<JsonObject> list = this.members;
        List<JsonObject> list2 = this.users;
        JsonObject jsonObject = this.message;
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.f8985id);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        return "KvMessageEntry(members=" + list + ", users=" + list2 + ", message=" + jsonObject + ", id=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ")";
    }

    private KvMessageEntry(List<JsonObject> list, List<JsonObject> list2, JsonObject jsonObject, String str, long j) {
        this.members = list;
        this.users = list2;
        this.message = jsonObject;
        this.f8985id = str;
        this.channelId = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ KvMessageEntry(java.util.List r10, java.util.List r11, kotlinx.serialization.json.JsonObject r12, java.lang.String r13, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 1
            if (r0 == 0) goto La
            java.util.List r0 = kotlin.collections.C9543h.m14145i()
            r2 = r0
            goto Lb
        La:
            r2 = r10
        Lb:
            r0 = r16 & 2
            if (r0 == 0) goto L15
            java.util.List r0 = kotlin.collections.C9543h.m14145i()
            r3 = r0
            goto L16
        L15:
            r3 = r11
        L16:
            r8 = 0
            r1 = r9
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.api.KvMessageEntry.<init>(java.util.List, java.util.List, kotlinx.serialization.json.JsonObject, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
