package com.discord.chat.bridge.embed;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\r¨\u0006&"}, m14357d2 = {"Lcom/discord/chat/bridge/embed/EmbedFooter;", "", "seen1", "", "iconURL", "", "iconProxyURL", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getIconProxyURL", "getIconURL", "imageUrl", "getImageUrl", "imageUrl$delegate", "Lkotlin/Lazy;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedFooter {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String iconProxyURL;
    private final String iconURL;
    private final Lazy imageUrl$delegate;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.bridge.embed.EmbedFooter$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C29171 extends AbstractC9614s implements Function0<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29171() {
            super(0);
            EmbedFooter.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return EmbedFooter.this.getIconProxyURL();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/embed/EmbedFooter$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedFooter;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbedFooter> serializer() {
            return EmbedFooter$$serializer.INSTANCE;
        }
    }

    public EmbedFooter() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ EmbedFooter(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        Lazy m7601a;
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, EmbedFooter$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.iconURL = null;
        } else {
            this.iconURL = str;
        }
        if ((i & 2) == 0) {
            this.iconProxyURL = null;
        } else {
            this.iconProxyURL = str2;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        m7601a = C11577n.m7601a(new C29171());
        this.imageUrl$delegate = m7601a;
    }

    public static /* synthetic */ EmbedFooter copy$default(EmbedFooter embedFooter, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embedFooter.iconURL;
        }
        if ((i & 2) != 0) {
            str2 = embedFooter.iconProxyURL;
        }
        if ((i & 4) != 0) {
            str3 = embedFooter.content;
        }
        return embedFooter.copy(str, str2, str3);
    }

    public static final void write$Self(EmbedFooter self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z3 = false;
        if (output.mo12879z(serialDesc, 0) || self.iconURL != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.iconURL);
        }
        if (output.mo12879z(serialDesc, 1) || self.iconProxyURL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.iconProxyURL);
        }
        if (output.mo12879z(serialDesc, 2) || self.content != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.content);
        }
    }

    public final String component1() {
        return this.iconURL;
    }

    public final String component2() {
        return this.iconProxyURL;
    }

    public final String component3() {
        return this.content;
    }

    public final EmbedFooter copy(String str, String str2, String str3) {
        return new EmbedFooter(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmbedFooter) {
            EmbedFooter embedFooter = (EmbedFooter) obj;
            return C9612q.m13922c(this.iconURL, embedFooter.iconURL) && C9612q.m13922c(this.iconProxyURL, embedFooter.iconProxyURL) && C9612q.m13922c(this.content, embedFooter.content);
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getIconProxyURL() {
        return this.iconProxyURL;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final String getImageUrl() {
        return (String) this.imageUrl$delegate.getValue();
    }

    public int hashCode() {
        String str = this.iconURL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconProxyURL;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconURL;
        String str2 = this.iconProxyURL;
        String str3 = this.content;
        return "EmbedFooter(iconURL=" + str + ", iconProxyURL=" + str2 + ", content=" + str3 + ")";
    }

    public EmbedFooter(String str, String str2, String str3) {
        Lazy m7601a;
        this.iconURL = str;
        this.iconProxyURL = str2;
        this.content = str3;
        m7601a = C11577n.m7601a(new EmbedFooter$imageUrl$2(this));
        this.imageUrl$delegate = m7601a;
    }

    public /* synthetic */ EmbedFooter(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}