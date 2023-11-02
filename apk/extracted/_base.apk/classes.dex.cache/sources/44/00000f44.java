package com.discord.chat.bridge.automod;

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

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, m14357d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "", "seen1", "", "header", "", "severity", "startTime", "body", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeader", "getSeverity", "getStartTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AutoModerationNotification {
    public static final Companion Companion = new Companion(null);
    private final String body;
    private final String header;
    private final String severity;
    private final String startTime;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/automod/AutoModerationNotification$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoModerationNotification> serializer() {
            return AutoModerationNotification$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoModerationNotification(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, AutoModerationNotification$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        if ((i & 2) == 0) {
            this.severity = null;
        } else {
            this.severity = str2;
        }
        if ((i & 4) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str3;
        }
        if ((i & 8) == 0) {
            this.body = null;
        } else {
            this.body = str4;
        }
    }

    public static /* synthetic */ AutoModerationNotification copy$default(AutoModerationNotification autoModerationNotification, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoModerationNotification.header;
        }
        if ((i & 2) != 0) {
            str2 = autoModerationNotification.severity;
        }
        if ((i & 4) != 0) {
            str3 = autoModerationNotification.startTime;
        }
        if ((i & 8) != 0) {
            str4 = autoModerationNotification.body;
        }
        return autoModerationNotification.copy(str, str2, str3, str4);
    }

    public static final void write$Self(AutoModerationNotification self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo12880y(serialDesc, 0, self.header);
        if (output.mo12879z(serialDesc, 1) || self.severity != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.severity);
        }
        if (output.mo12879z(serialDesc, 2) || self.startTime != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.startTime);
        }
        if (output.mo12879z(serialDesc, 3) || self.body != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.body);
        }
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.severity;
    }

    public final String component3() {
        return this.startTime;
    }

    public final String component4() {
        return this.body;
    }

    public final AutoModerationNotification copy(String header, String str, String str2, String str3) {
        C9612q.m13917h(header, "header");
        return new AutoModerationNotification(header, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoModerationNotification) {
            AutoModerationNotification autoModerationNotification = (AutoModerationNotification) obj;
            return C9612q.m13922c(this.header, autoModerationNotification.header) && C9612q.m13922c(this.severity, autoModerationNotification.severity) && C9612q.m13922c(this.startTime, autoModerationNotification.startTime) && C9612q.m13922c(this.body, autoModerationNotification.body);
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSeverity() {
        return this.severity;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.severity;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.body;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.severity;
        String str3 = this.startTime;
        String str4 = this.body;
        return "AutoModerationNotification(header=" + str + ", severity=" + str2 + ", startTime=" + str3 + ", body=" + str4 + ")";
    }

    public AutoModerationNotification(String header, String str, String str2, String str3) {
        C9612q.m13917h(header, "header");
        this.header = header;
        this.severity = str;
        this.startTime = str2;
        this.body = str3;
    }

    public /* synthetic */ AutoModerationNotification(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}