package com.discord.chat.bridge.feedback;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/bridge/feedback/SurveyIndication;", "", "seen1", "", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "feedbackIconUrl", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getFeedbackIconUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SurveyIndication {
    public static final Companion Companion = new Companion(null);
    private final StructurableText content;
    private final String feedbackIconUrl;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/feedback/SurveyIndication$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SurveyIndication> serializer() {
            return SurveyIndication$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SurveyIndication(int i, StructurableText structurableText, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, SurveyIndication$$serializer.INSTANCE.getDescriptor());
        }
        this.content = structurableText;
        this.feedbackIconUrl = str;
    }

    public static /* synthetic */ SurveyIndication copy$default(SurveyIndication surveyIndication, StructurableText structurableText, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            structurableText = surveyIndication.content;
        }
        if ((i & 2) != 0) {
            str = surveyIndication.feedbackIconUrl;
        }
        return surveyIndication.copy(structurableText, str);
    }

    public static final void write$Self(SurveyIndication self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, StructurableTextSerializer.INSTANCE, self.content);
        output.mo12880y(serialDesc, 1, self.feedbackIconUrl);
    }

    public final StructurableText component1() {
        return this.content;
    }

    public final String component2() {
        return this.feedbackIconUrl;
    }

    public final SurveyIndication copy(StructurableText content, String feedbackIconUrl) {
        C9612q.m13917h(content, "content");
        C9612q.m13917h(feedbackIconUrl, "feedbackIconUrl");
        return new SurveyIndication(content, feedbackIconUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SurveyIndication) {
            SurveyIndication surveyIndication = (SurveyIndication) obj;
            return C9612q.m13922c(this.content, surveyIndication.content) && C9612q.m13922c(this.feedbackIconUrl, surveyIndication.feedbackIconUrl);
        }
        return false;
    }

    public final StructurableText getContent() {
        return this.content;
    }

    public final String getFeedbackIconUrl() {
        return this.feedbackIconUrl;
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + this.feedbackIconUrl.hashCode();
    }

    public String toString() {
        StructurableText structurableText = this.content;
        String str = this.feedbackIconUrl;
        return "SurveyIndication(content=" + structurableText + ", feedbackIconUrl=" + str + ")";
    }

    public SurveyIndication(StructurableText content, String feedbackIconUrl) {
        C9612q.m13917h(content, "content");
        C9612q.m13917h(feedbackIconUrl, "feedbackIconUrl");
        this.content = content;
        this.feedbackIconUrl = feedbackIconUrl;
    }
}
