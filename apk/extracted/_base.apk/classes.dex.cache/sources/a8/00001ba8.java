package com.discord.notifications.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\rJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J5\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0014¨\u0006-"}, m14357d2 = {"Lcom/discord/notifications/api/NotificationMessage;", "", "seen1", "", "stickerItems", "", "Lcom/discord/notifications/api/Sticker;", "author", "Lkotlinx/serialization/json/JsonObject;", "mentions", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Ljava/util/List;)V", "getAuthor$annotations", "()V", "getAuthor", "()Lkotlinx/serialization/json/JsonObject;", "getMentions$annotations", "getMentions", "()Ljava/util/List;", "sticker", "getSticker", "()Lcom/discord/notifications/api/Sticker;", "getStickerItems$annotations", "getStickerItems", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationMessage {
    public static final Companion Companion = new Companion(null);
    private final JsonObject author;
    private final List<JsonObject> mentions;
    private final List<Sticker> stickerItems;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/notifications/api/NotificationMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/NotificationMessage;", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationMessage> serializer() {
            return NotificationMessage$$serializer.INSTANCE;
        }
    }

    public NotificationMessage() {
        this((List) null, (JsonObject) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ NotificationMessage(int i, List list, JsonObject jsonObject, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        List<JsonObject> m14104i;
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, NotificationMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.stickerItems = (i & 1) == 0 ? C9545j.m14104i() : list;
        if ((i & 2) == 0) {
            this.author = null;
        } else {
            this.author = jsonObject;
        }
        if ((i & 4) != 0) {
            this.mentions = list2;
            return;
        }
        m14104i = C9545j.m14104i();
        this.mentions = m14104i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationMessage copy$default(NotificationMessage notificationMessage, List list, JsonObject jsonObject, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notificationMessage.stickerItems;
        }
        if ((i & 2) != 0) {
            jsonObject = notificationMessage.author;
        }
        if ((i & 4) != 0) {
            list2 = notificationMessage.mentions;
        }
        return notificationMessage.copy(list, jsonObject, list2);
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getMentions$annotations() {
    }

    public static /* synthetic */ void getStickerItems$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005f, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r3, r4) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.notifications.api.NotificationMessage r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            r0 = 0
            boolean r1 = r6.mo12879z(r7, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L27
        L19:
            java.util.List<com.discord.notifications.api.Sticker> r1 = r5.stickerItems
            java.util.List r3 = kotlin.collections.C9543h.m14145i()
            boolean r1 = kotlin.jvm.internal.C9612q.m13922c(r1, r3)
            if (r1 != 0) goto L26
            goto L17
        L26:
            r1 = r0
        L27:
            if (r1 == 0) goto L35
            cj.f r1 = new cj.f
            com.discord.notifications.api.Sticker$$serializer r3 = com.discord.notifications.api.Sticker$$serializer.INSTANCE
            r1.<init>(r3)
            java.util.List<com.discord.notifications.api.Sticker> r3 = r5.stickerItems
            r6.mo12894i(r7, r0, r1, r3)
        L35:
            boolean r1 = r6.mo12879z(r7, r2)
            if (r1 == 0) goto L3d
        L3b:
            r1 = r2
            goto L43
        L3d:
            kotlinx.serialization.json.JsonObject r1 = r5.author
            if (r1 == 0) goto L42
            goto L3b
        L42:
            r1 = r0
        L43:
            if (r1 == 0) goto L4c
            kotlinx.serialization.json.t r1 = kotlinx.serialization.json.C9984t.f25888a
            kotlinx.serialization.json.JsonObject r3 = r5.author
            r6.mo12904E(r7, r2, r1, r3)
        L4c:
            r1 = 2
            boolean r3 = r6.mo12879z(r7, r1)
            if (r3 == 0) goto L55
        L53:
            r0 = r2
            goto L62
        L55:
            java.util.List<kotlinx.serialization.json.JsonObject> r3 = r5.mentions
            java.util.List r4 = kotlin.collections.C9543h.m14145i()
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r4)
            if (r3 != 0) goto L62
            goto L53
        L62:
            if (r0 == 0) goto L70
            cj.f r0 = new cj.f
            kotlinx.serialization.json.t r2 = kotlinx.serialization.json.C9984t.f25888a
            r0.<init>(r2)
            java.util.List<kotlinx.serialization.json.JsonObject> r5 = r5.mentions
            r6.mo12894i(r7, r1, r0, r5)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.api.NotificationMessage.write$Self(com.discord.notifications.api.NotificationMessage, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final List<Sticker> component1() {
        return this.stickerItems;
    }

    public final JsonObject component2() {
        return this.author;
    }

    public final List<JsonObject> component3() {
        return this.mentions;
    }

    public final NotificationMessage copy(List<Sticker> stickerItems, JsonObject jsonObject, List<JsonObject> mentions) {
        C9612q.m13917h(stickerItems, "stickerItems");
        C9612q.m13917h(mentions, "mentions");
        return new NotificationMessage(stickerItems, jsonObject, mentions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NotificationMessage) {
            NotificationMessage notificationMessage = (NotificationMessage) obj;
            return C9612q.m13922c(this.stickerItems, notificationMessage.stickerItems) && C9612q.m13922c(this.author, notificationMessage.author) && C9612q.m13922c(this.mentions, notificationMessage.mentions);
        }
        return false;
    }

    public final JsonObject getAuthor() {
        return this.author;
    }

    public final List<JsonObject> getMentions() {
        return this.mentions;
    }

    public final Sticker getSticker() {
        Object m14054V;
        m14054V = C9553r.m14054V(this.stickerItems);
        return (Sticker) m14054V;
    }

    public final List<Sticker> getStickerItems() {
        return this.stickerItems;
    }

    public int hashCode() {
        int hashCode = this.stickerItems.hashCode() * 31;
        JsonObject jsonObject = this.author;
        return ((hashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31) + this.mentions.hashCode();
    }

    public String toString() {
        List<Sticker> list = this.stickerItems;
        JsonObject jsonObject = this.author;
        List<JsonObject> list2 = this.mentions;
        return "NotificationMessage(stickerItems=" + list + ", author=" + jsonObject + ", mentions=" + list2 + ")";
    }

    public NotificationMessage(List<Sticker> stickerItems, JsonObject jsonObject, List<JsonObject> mentions) {
        C9612q.m13917h(stickerItems, "stickerItems");
        C9612q.m13917h(mentions, "mentions");
        this.stickerItems = stickerItems;
        this.author = jsonObject;
        this.mentions = mentions;
    }

    public /* synthetic */ NotificationMessage(List list, JsonObject jsonObject, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C9545j.m14104i() : list, (i & 2) != 0 ? null : jsonObject, (i & 4) != 0 ? C9545j.m14104i() : list2);
    }
}