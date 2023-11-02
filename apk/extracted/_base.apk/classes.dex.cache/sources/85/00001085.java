package com.discord.chat.bridge.policynotice;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, m14357d2 = {"Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "", "seen1", "", "classificationId", "", "titleText", "titleIcon", "subtitleText", "descriptionText", "ctaText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClassificationId", "()Ljava/lang/String;", "getCtaText", "getDescriptionText", "getSubtitleText", "getTitleIcon", "getTitleText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SafetyPolicyNoticeEmbed {
    public static final Companion Companion = new Companion(null);
    private final String classificationId;
    private final String ctaText;
    private final String descriptionText;
    private final String subtitleText;
    private final String titleIcon;
    private final String titleText;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SafetyPolicyNoticeEmbed> serializer() {
            return SafetyPolicyNoticeEmbed$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SafetyPolicyNoticeEmbed(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            C2620n1.m32836b(i, 63, SafetyPolicyNoticeEmbed$$serializer.INSTANCE.getDescriptor());
        }
        this.classificationId = str;
        this.titleText = str2;
        this.titleIcon = str3;
        this.subtitleText = str4;
        this.descriptionText = str5;
        this.ctaText = str6;
    }

    public static /* synthetic */ SafetyPolicyNoticeEmbed copy$default(SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safetyPolicyNoticeEmbed.classificationId;
        }
        if ((i & 2) != 0) {
            str2 = safetyPolicyNoticeEmbed.titleText;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = safetyPolicyNoticeEmbed.titleIcon;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = safetyPolicyNoticeEmbed.subtitleText;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = safetyPolicyNoticeEmbed.descriptionText;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = safetyPolicyNoticeEmbed.ctaText;
        }
        return safetyPolicyNoticeEmbed.copy(str, str7, str8, str9, str10, str6);
    }

    public static final void write$Self(SafetyPolicyNoticeEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.classificationId);
        output.mo12880y(serialDesc, 1, self.titleText);
        output.mo12880y(serialDesc, 2, self.titleIcon);
        output.mo12880y(serialDesc, 3, self.subtitleText);
        output.mo12880y(serialDesc, 4, self.descriptionText);
        output.mo12880y(serialDesc, 5, self.ctaText);
    }

    public final String component1() {
        return this.classificationId;
    }

    public final String component2() {
        return this.titleText;
    }

    public final String component3() {
        return this.titleIcon;
    }

    public final String component4() {
        return this.subtitleText;
    }

    public final String component5() {
        return this.descriptionText;
    }

    public final String component6() {
        return this.ctaText;
    }

    public final SafetyPolicyNoticeEmbed copy(String classificationId, String titleText, String titleIcon, String subtitleText, String descriptionText, String ctaText) {
        C9612q.m13917h(classificationId, "classificationId");
        C9612q.m13917h(titleText, "titleText");
        C9612q.m13917h(titleIcon, "titleIcon");
        C9612q.m13917h(subtitleText, "subtitleText");
        C9612q.m13917h(descriptionText, "descriptionText");
        C9612q.m13917h(ctaText, "ctaText");
        return new SafetyPolicyNoticeEmbed(classificationId, titleText, titleIcon, subtitleText, descriptionText, ctaText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SafetyPolicyNoticeEmbed) {
            SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = (SafetyPolicyNoticeEmbed) obj;
            return C9612q.m13922c(this.classificationId, safetyPolicyNoticeEmbed.classificationId) && C9612q.m13922c(this.titleText, safetyPolicyNoticeEmbed.titleText) && C9612q.m13922c(this.titleIcon, safetyPolicyNoticeEmbed.titleIcon) && C9612q.m13922c(this.subtitleText, safetyPolicyNoticeEmbed.subtitleText) && C9612q.m13922c(this.descriptionText, safetyPolicyNoticeEmbed.descriptionText) && C9612q.m13922c(this.ctaText, safetyPolicyNoticeEmbed.ctaText);
        }
        return false;
    }

    public final String getClassificationId() {
        return this.classificationId;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final String getSubtitleText() {
        return this.subtitleText;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return (((((((((this.classificationId.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.titleIcon.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.descriptionText.hashCode()) * 31) + this.ctaText.hashCode();
    }

    public String toString() {
        String str = this.classificationId;
        String str2 = this.titleText;
        String str3 = this.titleIcon;
        String str4 = this.subtitleText;
        String str5 = this.descriptionText;
        String str6 = this.ctaText;
        return "SafetyPolicyNoticeEmbed(classificationId=" + str + ", titleText=" + str2 + ", titleIcon=" + str3 + ", subtitleText=" + str4 + ", descriptionText=" + str5 + ", ctaText=" + str6 + ")";
    }

    public SafetyPolicyNoticeEmbed(String classificationId, String titleText, String titleIcon, String subtitleText, String descriptionText, String ctaText) {
        C9612q.m13917h(classificationId, "classificationId");
        C9612q.m13917h(titleText, "titleText");
        C9612q.m13917h(titleIcon, "titleIcon");
        C9612q.m13917h(subtitleText, "subtitleText");
        C9612q.m13917h(descriptionText, "descriptionText");
        C9612q.m13917h(ctaText, "ctaText");
        this.classificationId = classificationId;
        this.titleText = titleText;
        this.titleIcon = titleIcon;
        this.subtitleText = subtitleText;
        this.descriptionText = descriptionText;
        this.ctaText = ctaText;
    }
}