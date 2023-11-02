package com.discord.push_notification_monitor;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2581f;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationLog;", "", "seen1", "", "pushNotifications", "", "Lcom/discord/push_notification_monitor/PushNotificationMeta;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getPushNotifications", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PushNotificationLog {
    public static final Companion Companion = new Companion(null);
    private final List<PushNotificationMeta> pushNotifications;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationLog$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/push_notification_monitor/PushNotificationLog;", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PushNotificationLog> serializer() {
            return PushNotificationLog$$serializer.INSTANCE;
        }
    }

    public PushNotificationLog() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PushNotificationLog(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        List<PushNotificationMeta> m14104i;
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, PushNotificationLog$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) != 0) {
            this.pushNotifications = list;
            return;
        }
        m14104i = C9545j.m14104i();
        this.pushNotifications = m14104i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushNotificationLog copy$default(PushNotificationLog pushNotificationLog, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pushNotificationLog.pushNotifications;
        }
        return pushNotificationLog.copy(list);
    }

    public static final void write$Self(PushNotificationLog self, CompositeEncoder output, SerialDescriptor serialDesc) {
        List m14104i;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = true;
        if (!output.mo12879z(serialDesc, 0)) {
            List<PushNotificationMeta> list = self.pushNotifications;
            m14104i = C9545j.m14104i();
            if (C9612q.m13922c(list, m14104i)) {
                z = false;
            }
        }
        if (z) {
            output.mo12894i(serialDesc, 0, new C2581f(PushNotificationMeta$$serializer.INSTANCE), self.pushNotifications);
        }
    }

    public final List<PushNotificationMeta> component1() {
        return this.pushNotifications;
    }

    public final PushNotificationLog copy(List<PushNotificationMeta> pushNotifications) {
        C9612q.m13917h(pushNotifications, "pushNotifications");
        return new PushNotificationLog(pushNotifications);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushNotificationLog) && C9612q.m13922c(this.pushNotifications, ((PushNotificationLog) obj).pushNotifications);
    }

    public final List<PushNotificationMeta> getPushNotifications() {
        return this.pushNotifications;
    }

    public int hashCode() {
        return this.pushNotifications.hashCode();
    }

    public String toString() {
        List<PushNotificationMeta> list = this.pushNotifications;
        return "PushNotificationLog(pushNotifications=" + list + ")";
    }

    public PushNotificationLog(List<PushNotificationMeta> pushNotifications) {
        C9612q.m13917h(pushNotifications, "pushNotifications");
        this.pushNotifications = pushNotifications;
    }

    public /* synthetic */ PushNotificationLog(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C9545j.m14104i() : list);
    }
}
