package com.discord.notifications.api;

import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9652n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.C9976l;
import kotlinx.serialization.json.Json;
import p045cj.C2560a2;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bn\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012B\\\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010%\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001cJ\u0019\u0010'\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0019J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jp\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u000bHÖ\u0001J!\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=HÇ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m14357d2 = {"Lcom/discord/notifications/api/DirectReplyMessage;", "", "seen1", "", "id", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "author", "Lcom/discord/notifications/api/DirectReplyUser;", "content", "", "type", "channelType", "channelName", "guildName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAuthor", "()Lcom/discord/notifications/api/DirectReplyUser;", "getChannelId-o4g7jtM$annotations", "()V", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "()Ljava/lang/String;", "getChannelType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "getGuildName", "getId-3Eiw7ao", "Ljava/lang/String;", "getType", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy-_6Dih7Q", "(Ljava/lang/String;JLcom/discord/notifications/api/DirectReplyUser;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/notifications/api/DirectReplyMessage;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class DirectReplyMessage {
    public static final Companion Companion = new Companion(null);
    private static final Json json = C9976l.m12702b(null, DirectReplyMessage$Companion$json$1.INSTANCE, 1, null);
    private final DirectReplyUser author;
    private final long channelId;
    private final String channelName;
    private final Integer channelType;
    private final String content;
    private final String guildName;

    /* renamed from: id */
    private final String f8983id;
    private final Integer type;

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/notifications/api/DirectReplyMessage$Companion;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/DirectReplyMessage;", "toNotificationData", "Lcom/discord/notifications/api/NotificationData;", "data", "", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DirectReplyMessage> serializer() {
            return DirectReplyMessage$$serializer.INSTANCE;
        }

        public final NotificationData toNotificationData(String data) {
            List m14104i;
            Integer num;
            C9612q.m13917h(data, "data");
            Json json = DirectReplyMessage.json;
            json.mo265a();
            DirectReplyMessage directReplyMessage = (DirectReplyMessage) json.mo232b(DirectReplyMessage.Companion.serializer(), data);
            String m41983getId3Eiw7ao = directReplyMessage.m41983getId3Eiw7ao();
            Integer type = directReplyMessage.getType();
            String content = directReplyMessage.getContent();
            long m41982getChannelIdo4g7jtM = directReplyMessage.m41982getChannelIdo4g7jtM();
            Integer channelType = directReplyMessage.getChannelType();
            m14104i = C9545j.m14104i();
            long m41987getIdre6GcUE = directReplyMessage.getAuthor().m41987getIdre6GcUE();
            String username = directReplyMessage.getAuthor().getUsername();
            if (username == null) {
                username = "";
            }
            String str = username;
            String discriminator = directReplyMessage.getAuthor().getDiscriminator();
            if (discriminator != null) {
                num = C9652n.m13769m(discriminator);
            } else {
                num = null;
            }
            Integer num2 = num;
            String avatar = directReplyMessage.getAuthor().getAvatar();
            return new NotificationData(NotificationData.TYPE_MESSAGE_CREATE, m41983getId3Eiw7ao, (Integer) null, (String) null, type, content, (Long) null, channelType, directReplyMessage.getChannelName(), ChannelId.m42047boximpl(m41982getChannelIdo4g7jtM), (String) null, (String) null, (ChannelId) null, (String) null, m14104i, UserId.m42111boximpl(m41987getIdre6GcUE), str, (String) null, num2, avatar, (String) null, (Integer) null, (GuildId) null, directReplyMessage.getGuildName(), (String) null, (Integer) null, (String) null, (ApplicationId) null, (String) null, (String) null, (NotificationMessage) null, (String) null, (Integer) null, true, true, (UserId) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, -9290676, 4089, (DefaultConstructorMarker) null);
        }
    }

    private DirectReplyMessage(int i, String str, ChannelId channelId, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, DirectReplyMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.f8983id = str;
        this.channelId = channelId.m42056unboximpl();
        this.author = directReplyUser;
        if ((i & 8) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & 32) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num2;
        }
        if ((i & 64) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str3;
        }
        if ((i & 128) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str4;
        }
    }

    public /* synthetic */ DirectReplyMessage(int i, String str, ChannelId channelId, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, channelId, directReplyUser, str2, num, num2, str3, str4, serializationConstructorMarker);
    }

    public /* synthetic */ DirectReplyMessage(String str, long j, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, directReplyUser, str2, num, num2, str3, str4);
    }

    /* renamed from: getChannelId-o4g7jtM$annotations */
    public static /* synthetic */ void m41978getChannelIdo4g7jtM$annotations() {
    }

    public static final void write$Self(DirectReplyMessage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z5 = false;
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.f8983id));
        output.mo12894i(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
        output.mo12894i(serialDesc, 2, DirectReplyUser$$serializer.INSTANCE, self.author);
        if (output.mo12879z(serialDesc, 3) || self.content != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.content);
        }
        if (output.mo12879z(serialDesc, 4) || self.type != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 4, C2615m0.f7088a, self.type);
        }
        if (output.mo12879z(serialDesc, 5) || self.channelType != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 5, C2615m0.f7088a, self.channelType);
        }
        if (output.mo12879z(serialDesc, 6) || self.channelName != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12904E(serialDesc, 6, C2560a2.f7013a, self.channelName);
        }
        if (output.mo12879z(serialDesc, 7) || self.guildName != null) {
            z5 = true;
        }
        if (z5) {
            output.mo12904E(serialDesc, 7, C2560a2.f7013a, self.guildName);
        }
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41979component13Eiw7ao() {
        return this.f8983id;
    }

    /* renamed from: component2-o4g7jtM */
    public final long m41980component2o4g7jtM() {
        return this.channelId;
    }

    public final DirectReplyUser component3() {
        return this.author;
    }

    public final String component4() {
        return this.content;
    }

    public final Integer component5() {
        return this.type;
    }

    public final Integer component6() {
        return this.channelType;
    }

    public final String component7() {
        return this.channelName;
    }

    public final String component8() {
        return this.guildName;
    }

    /* renamed from: copy-_6Dih7Q */
    public final DirectReplyMessage m41981copy_6Dih7Q(String id2, long j, DirectReplyUser author, String str, Integer num, Integer num2, String str2, String str3) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(author, "author");
        return new DirectReplyMessage(id2, j, author, str, num, num2, str2, str3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DirectReplyMessage) {
            DirectReplyMessage directReplyMessage = (DirectReplyMessage) obj;
            return MessageId.m42077equalsimpl0(this.f8983id, directReplyMessage.f8983id) && ChannelId.m42051equalsimpl0(this.channelId, directReplyMessage.channelId) && C9612q.m13922c(this.author, directReplyMessage.author) && C9612q.m13922c(this.content, directReplyMessage.content) && C9612q.m13922c(this.type, directReplyMessage.type) && C9612q.m13922c(this.channelType, directReplyMessage.channelType) && C9612q.m13922c(this.channelName, directReplyMessage.channelName) && C9612q.m13922c(this.guildName, directReplyMessage.guildName);
        }
        return false;
    }

    public final DirectReplyUser getAuthor() {
        return this.author;
    }

    /* renamed from: getChannelId-o4g7jtM */
    public final long m41982getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final Integer getChannelType() {
        return this.channelType;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    /* renamed from: getId-3Eiw7ao */
    public final String m41983getId3Eiw7ao() {
        return this.f8983id;
    }

    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((((MessageId.m42078hashCodeimpl(this.f8983id) * 31) + ChannelId.m42052hashCodeimpl(this.channelId)) * 31) + this.author.hashCode()) * 31;
        String str = this.content;
        int hashCode = (m42078hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.channelType;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.channelName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guildName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.f8983id);
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        DirectReplyUser directReplyUser = this.author;
        String str = this.content;
        Integer num = this.type;
        Integer num2 = this.channelType;
        String str2 = this.channelName;
        String str3 = this.guildName;
        return "DirectReplyMessage(id=" + m42079toStringimpl + ", channelId=" + m42054toStringimpl + ", author=" + directReplyUser + ", content=" + str + ", type=" + num + ", channelType=" + num2 + ", channelName=" + str2 + ", guildName=" + str3 + ")";
    }

    private DirectReplyMessage(String str, long j, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4) {
        this.f8983id = str;
        this.channelId = j;
        this.author = directReplyUser;
        this.content = str2;
        this.type = num;
        this.channelType = num2;
        this.channelName = str3;
        this.guildName = str4;
    }

    public /* synthetic */ DirectReplyMessage(String str, long j, DirectReplyUser directReplyUser, String str2, Integer num, Integer num2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, directReplyUser, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, null);
    }
}