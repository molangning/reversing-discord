package com.discord.push_notification_monitor;

import co.discord.media_engine.C2689b;
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

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006+"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMeta;", "", "seen1", "", "receivedTimestamp", "", "silent", "", "type", "", "title", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getReceivedTimestamp", "()J", "getSilent", "()Z", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PushNotificationMeta {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final long receivedTimestamp;
    private final boolean silent;
    private final String title;
    private final String type;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMeta$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/push_notification_monitor/PushNotificationMeta;", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PushNotificationMeta> serializer() {
            return PushNotificationMeta$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PushNotificationMeta(int i, long j, boolean z, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, PushNotificationMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.receivedTimestamp = j;
        this.silent = z;
        this.type = str;
        this.title = str2;
        this.content = str3;
    }

    public static /* synthetic */ PushNotificationMeta copy$default(PushNotificationMeta pushNotificationMeta, long j, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pushNotificationMeta.receivedTimestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = pushNotificationMeta.silent;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = pushNotificationMeta.type;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = pushNotificationMeta.title;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = pushNotificationMeta.content;
        }
        return pushNotificationMeta.copy(j2, z2, str4, str5, str3);
    }

    public static final void write$Self(PushNotificationMeta self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12905D(serialDesc, 0, self.receivedTimestamp);
        output.mo12881x(serialDesc, 1, self.silent);
        output.mo12880y(serialDesc, 2, self.type);
        output.mo12880y(serialDesc, 3, self.title);
        output.mo12904E(serialDesc, 4, C2560a2.f7013a, self.content);
    }

    public final long component1() {
        return this.receivedTimestamp;
    }

    public final boolean component2() {
        return this.silent;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.content;
    }

    public final PushNotificationMeta copy(long j, boolean z, String type, String title, String str) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(title, "title");
        return new PushNotificationMeta(j, z, type, title, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PushNotificationMeta) {
            PushNotificationMeta pushNotificationMeta = (PushNotificationMeta) obj;
            return this.receivedTimestamp == pushNotificationMeta.receivedTimestamp && this.silent == pushNotificationMeta.silent && C9612q.m13922c(this.type, pushNotificationMeta.type) && C9612q.m13922c(this.title, pushNotificationMeta.title) && C9612q.m13922c(this.content, pushNotificationMeta.content);
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m32716a = C2689b.m32716a(this.receivedTimestamp) * 31;
        boolean z = this.silent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode = (((((m32716a + i) * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.content;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.receivedTimestamp;
        boolean z = this.silent;
        String str = this.type;
        String str2 = this.title;
        String str3 = this.content;
        return "PushNotificationMeta(receivedTimestamp=" + j + ", silent=" + z + ", type=" + str + ", title=" + str2 + ", content=" + str3 + ")";
    }

    public PushNotificationMeta(long j, boolean z, String type, String title, String str) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(title, "title");
        this.receivedTimestamp = j;
        this.silent = z;
        this.type = type;
        this.title = title;
        this.content = str;
    }
}
