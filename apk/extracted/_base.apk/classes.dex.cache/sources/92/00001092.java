package com.discord.chat.bridge.polls;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/bridge/polls/PollMedia;", "", "seen1", "", "text", "", "attachmentIds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "getAttachmentIds", "()Ljava/util/Set;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollMedia {
    public static final Companion Companion = new Companion(null);
    private final Set<String> attachmentIds;
    private final String text;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/polls/PollMedia$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollMedia;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PollMedia> serializer() {
            return PollMedia$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PollMedia(int i, String str, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        Set<String> m14007d;
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, PollMedia$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i & 2) != 0) {
            this.attachmentIds = set;
            return;
        }
        m14007d = C9560w.m14007d();
        this.attachmentIds = m14007d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollMedia copy$default(PollMedia pollMedia, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pollMedia.text;
        }
        if ((i & 2) != 0) {
            set = pollMedia.attachmentIds;
        }
        return pollMedia.copy(str, set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r3, r4) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.polls.PollMedia r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            cj.a2 r0 = p045cj.C2560a2.f7013a
            java.lang.String r1 = r5.text
            r2 = 0
            r6.mo12904E(r7, r2, r0, r1)
            r1 = 1
            boolean r3 = r6.mo12879z(r7, r1)
            if (r3 == 0) goto L20
        L1e:
            r2 = r1
            goto L2d
        L20:
            java.util.Set<java.lang.String> r3 = r5.attachmentIds
            java.util.Set r4 = kotlin.collections.C9558u.m14019d()
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r4)
            if (r3 != 0) goto L2d
            goto L1e
        L2d:
            if (r2 == 0) goto L39
            cj.t0 r2 = new cj.t0
            r2.<init>(r0)
            java.util.Set<java.lang.String> r5 = r5.attachmentIds
            r6.mo12894i(r7, r1, r2, r5)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.polls.PollMedia.write$Self(com.discord.chat.bridge.polls.PollMedia, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.text;
    }

    public final Set<String> component2() {
        return this.attachmentIds;
    }

    public final PollMedia copy(String str, Set<String> attachmentIds) {
        C9612q.m13917h(attachmentIds, "attachmentIds");
        return new PollMedia(str, attachmentIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollMedia) {
            PollMedia pollMedia = (PollMedia) obj;
            return C9612q.m13922c(this.text, pollMedia.text) && C9612q.m13922c(this.attachmentIds, pollMedia.attachmentIds);
        }
        return false;
    }

    public final Set<String> getAttachmentIds() {
        return this.attachmentIds;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.attachmentIds.hashCode();
    }

    public String toString() {
        String str = this.text;
        Set<String> set = this.attachmentIds;
        return "PollMedia(text=" + str + ", attachmentIds=" + set + ")";
    }

    public PollMedia(String str, Set<String> attachmentIds) {
        C9612q.m13917h(attachmentIds, "attachmentIds");
        this.text = str;
        this.attachmentIds = attachmentIds;
    }

    public /* synthetic */ PollMedia(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C9560w.m14007d() : set);
    }
}