package com.discord.notifications.react.events;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p045cj.C2634r0;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\nJ\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m14357d2 = {"Lcom/discord/notifications/react/events/LocalNotificationEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "locationNotification", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Map;)V", "getLocationNotification", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_react_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class LocalNotificationEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> locationNotification;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/notifications/react/events/LocalNotificationEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/react/events/LocalNotificationEvent;", "notification_react_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LocalNotificationEvent> serializer() {
            return LocalNotificationEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalNotificationEvent(int i, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, LocalNotificationEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.locationNotification = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalNotificationEvent copy$default(LocalNotificationEvent localNotificationEvent, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = localNotificationEvent.locationNotification;
        }
        return localNotificationEvent.copy(map);
    }

    public static final void write$Self(LocalNotificationEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        C2560a2 c2560a2 = C2560a2.f7013a;
        output.mo12894i(serialDesc, 0, new C2634r0(c2560a2, C0213a.m40920u(c2560a2)), self.locationNotification);
    }

    public final Map<String, String> component1() {
        return this.locationNotification;
    }

    public final LocalNotificationEvent copy(Map<String, String> locationNotification) {
        C9612q.m13917h(locationNotification, "locationNotification");
        return new LocalNotificationEvent(locationNotification);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalNotificationEvent) && C9612q.m13922c(this.locationNotification, ((LocalNotificationEvent) obj).locationNotification);
    }

    public final Map<String, String> getLocationNotification() {
        return this.locationNotification;
    }

    public int hashCode() {
        return this.locationNotification.hashCode();
    }

    public String toString() {
        Map<String, String> map = this.locationNotification;
        return "LocalNotificationEvent(locationNotification=" + map + ")";
    }

    public LocalNotificationEvent(Map<String, String> locationNotification) {
        C9612q.m13917h(locationNotification, "locationNotification");
        this.locationNotification = locationNotification;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.toNativeMap(this.locationNotification);
    }
}
