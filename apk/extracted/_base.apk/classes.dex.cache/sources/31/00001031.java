package com.discord.chat.bridge.embed;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
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

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006)"}, m14357d2 = {"Lcom/discord/chat/bridge/embed/EmbedAuthor;", "", "seen1", "", ZeroconfModule.KEY_SERVICE_NAME, "", "url", "iconURL", "iconProxyURL", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconProxyURL", "()Ljava/lang/String;", "getIconURL", "imageUrl", "getImageUrl", "imageUrl$delegate", "Lkotlin/Lazy;", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedAuthor {
    public static final Companion Companion = new Companion(null);
    private final String iconProxyURL;
    private final String iconURL;
    private final Lazy imageUrl$delegate;
    private final String name;
    private final String url;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.bridge.embed.EmbedAuthor$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C29161 extends AbstractC9614s implements Function0<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29161() {
            super(0);
            EmbedAuthor.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return EmbedAuthor.this.getIconProxyURL();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/embed/EmbedAuthor$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/EmbedAuthor;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmbedAuthor> serializer() {
            return EmbedAuthor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmbedAuthor(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        Lazy m7601a;
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, EmbedAuthor$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.iconURL = null;
        } else {
            this.iconURL = str3;
        }
        if ((i & 8) == 0) {
            this.iconProxyURL = null;
        } else {
            this.iconProxyURL = str4;
        }
        m7601a = C11577n.m7601a(new C29161());
        this.imageUrl$delegate = m7601a;
    }

    public static /* synthetic */ EmbedAuthor copy$default(EmbedAuthor embedAuthor, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embedAuthor.name;
        }
        if ((i & 2) != 0) {
            str2 = embedAuthor.url;
        }
        if ((i & 4) != 0) {
            str3 = embedAuthor.iconURL;
        }
        if ((i & 8) != 0) {
            str4 = embedAuthor.iconProxyURL;
        }
        return embedAuthor.copy(str, str2, str3, str4);
    }

    public static final void write$Self(EmbedAuthor self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo12880y(serialDesc, 0, self.name);
        if (output.mo12879z(serialDesc, 1) || self.url != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.url);
        }
        if (output.mo12879z(serialDesc, 2) || self.iconURL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.iconURL);
        }
        if (output.mo12879z(serialDesc, 3) || self.iconProxyURL != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.iconProxyURL);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.iconURL;
    }

    public final String component4() {
        return this.iconProxyURL;
    }

    public final EmbedAuthor copy(String name, String str, String str2, String str3) {
        C9612q.m13917h(name, "name");
        return new EmbedAuthor(name, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmbedAuthor) {
            EmbedAuthor embedAuthor = (EmbedAuthor) obj;
            return C9612q.m13922c(this.name, embedAuthor.name) && C9612q.m13922c(this.url, embedAuthor.url) && C9612q.m13922c(this.iconURL, embedAuthor.iconURL) && C9612q.m13922c(this.iconProxyURL, embedAuthor.iconProxyURL);
        }
        return false;
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

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconURL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconProxyURL;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.url;
        String str3 = this.iconURL;
        String str4 = this.iconProxyURL;
        return "EmbedAuthor(name=" + str + ", url=" + str2 + ", iconURL=" + str3 + ", iconProxyURL=" + str4 + ")";
    }

    public EmbedAuthor(String name, String str, String str2, String str3) {
        Lazy m7601a;
        C9612q.m13917h(name, "name");
        this.name = name;
        this.url = str;
        this.iconURL = str2;
        this.iconProxyURL = str3;
        m7601a = C11577n.m7601a(new EmbedAuthor$imageUrl$2(this));
        this.imageUrl$delegate = m7601a;
    }

    public /* synthetic */ EmbedAuthor(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}