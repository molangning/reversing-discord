package com.discord.chat.bridge.activityinviteembed;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p014aj.C0213a;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B\u007f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bm\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0013\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J}\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u0006:"}, m14357d2 = {"Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "", "seen1", "", "coverImage", "", "isListening", "", "headerText", "partyStatus", "avatarsToRender", "", "maxPartySize", ZeroconfModule.KEY_SERVICE_NAME, "subtext", "joinable", "ctaText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatarsToRender", "()Ljava/util/List;", "getCoverImage", "()Ljava/lang/String;", "getCtaText", "getHeaderText", "()Z", "getJoinable", "getMaxPartySize", "()I", "getName", "getPartyStatus", "getSubtext", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ActivityInviteEmbed {
    public static final Companion Companion = new Companion(null);
    private final List<String> avatarsToRender;
    private final String coverImage;
    private final String ctaText;
    private final String headerText;
    private final boolean isListening;
    private final boolean joinable;
    private final int maxPartySize;
    private final String name;
    private final String partyStatus;
    private final String subtext;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityInviteEmbed> serializer() {
            return ActivityInviteEmbed$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityInviteEmbed(int i, String str, boolean z, String str2, String str3, List list, int i2, String str4, String str5, boolean z2, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (814 != (i & 814)) {
            C2620n1.m32836b(i, 814, ActivityInviteEmbed$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.coverImage = null;
        } else {
            this.coverImage = str;
        }
        this.isListening = z;
        this.headerText = str2;
        this.partyStatus = str3;
        if ((i & 16) == 0) {
            this.avatarsToRender = null;
        } else {
            this.avatarsToRender = list;
        }
        this.maxPartySize = i2;
        if ((i & 64) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & 128) == 0) {
            this.subtext = null;
        } else {
            this.subtext = str5;
        }
        this.joinable = z2;
        this.ctaText = str6;
    }

    public static final void write$Self(ActivityInviteEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z4 = false;
        if (output.mo12879z(serialDesc, 0) || self.coverImage != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.coverImage);
        }
        output.mo12881x(serialDesc, 1, self.isListening);
        output.mo12880y(serialDesc, 2, self.headerText);
        output.mo12880y(serialDesc, 3, self.partyStatus);
        if (output.mo12879z(serialDesc, 4) || self.avatarsToRender != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 4, new C2581f(C0213a.m40920u(C2560a2.f7013a)), self.avatarsToRender);
        }
        output.mo12882w(serialDesc, 5, self.maxPartySize);
        if (output.mo12879z(serialDesc, 6) || self.name != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 6, C2560a2.f7013a, self.name);
        }
        if (output.mo12879z(serialDesc, 7) || self.subtext != null) {
            z4 = true;
        }
        if (z4) {
            output.mo12904E(serialDesc, 7, C2560a2.f7013a, self.subtext);
        }
        output.mo12881x(serialDesc, 8, self.joinable);
        output.mo12880y(serialDesc, 9, self.ctaText);
    }

    public final String component1() {
        return this.coverImage;
    }

    public final String component10() {
        return this.ctaText;
    }

    public final boolean component2() {
        return this.isListening;
    }

    public final String component3() {
        return this.headerText;
    }

    public final String component4() {
        return this.partyStatus;
    }

    public final List<String> component5() {
        return this.avatarsToRender;
    }

    public final int component6() {
        return this.maxPartySize;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.subtext;
    }

    public final boolean component9() {
        return this.joinable;
    }

    public final ActivityInviteEmbed copy(String str, boolean z, String headerText, String partyStatus, List<String> list, int i, String str2, String str3, boolean z2, String ctaText) {
        C9612q.m13917h(headerText, "headerText");
        C9612q.m13917h(partyStatus, "partyStatus");
        C9612q.m13917h(ctaText, "ctaText");
        return new ActivityInviteEmbed(str, z, headerText, partyStatus, list, i, str2, str3, z2, ctaText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityInviteEmbed) {
            ActivityInviteEmbed activityInviteEmbed = (ActivityInviteEmbed) obj;
            return C9612q.m13922c(this.coverImage, activityInviteEmbed.coverImage) && this.isListening == activityInviteEmbed.isListening && C9612q.m13922c(this.headerText, activityInviteEmbed.headerText) && C9612q.m13922c(this.partyStatus, activityInviteEmbed.partyStatus) && C9612q.m13922c(this.avatarsToRender, activityInviteEmbed.avatarsToRender) && this.maxPartySize == activityInviteEmbed.maxPartySize && C9612q.m13922c(this.name, activityInviteEmbed.name) && C9612q.m13922c(this.subtext, activityInviteEmbed.subtext) && this.joinable == activityInviteEmbed.joinable && C9612q.m13922c(this.ctaText, activityInviteEmbed.ctaText);
        }
        return false;
    }

    public final List<String> getAvatarsToRender() {
        return this.avatarsToRender;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final boolean getJoinable() {
        return this.joinable;
    }

    public final int getMaxPartySize() {
        return this.maxPartySize;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartyStatus() {
        return this.partyStatus;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.coverImage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isListening;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.headerText.hashCode()) * 31) + this.partyStatus.hashCode()) * 31;
        List<String> list = this.avatarsToRender;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.maxPartySize) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtext;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.joinable;
        return ((hashCode5 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.ctaText.hashCode();
    }

    public final boolean isListening() {
        return this.isListening;
    }

    public String toString() {
        String str = this.coverImage;
        boolean z = this.isListening;
        String str2 = this.headerText;
        String str3 = this.partyStatus;
        List<String> list = this.avatarsToRender;
        int i = this.maxPartySize;
        String str4 = this.name;
        String str5 = this.subtext;
        boolean z2 = this.joinable;
        String str6 = this.ctaText;
        return "ActivityInviteEmbed(coverImage=" + str + ", isListening=" + z + ", headerText=" + str2 + ", partyStatus=" + str3 + ", avatarsToRender=" + list + ", maxPartySize=" + i + ", name=" + str4 + ", subtext=" + str5 + ", joinable=" + z2 + ", ctaText=" + str6 + ")";
    }

    public ActivityInviteEmbed(String str, boolean z, String headerText, String partyStatus, List<String> list, int i, String str2, String str3, boolean z2, String ctaText) {
        C9612q.m13917h(headerText, "headerText");
        C9612q.m13917h(partyStatus, "partyStatus");
        C9612q.m13917h(ctaText, "ctaText");
        this.coverImage = str;
        this.isListening = z;
        this.headerText = headerText;
        this.partyStatus = partyStatus;
        this.avatarsToRender = list;
        this.maxPartySize = i;
        this.name = str2;
        this.subtext = str3;
        this.joinable = z2;
        this.ctaText = ctaText;
    }

    public /* synthetic */ ActivityInviteEmbed(String str, boolean z, String str2, String str3, List list, int i, String str4, String str5, boolean z2, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, z, str2, str3, (i2 & 16) != 0 ? null : list, i, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, z2, str6);
    }
}
