package com.discord.chat.bridge.forums;

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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006*"}, m14357d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt;", "", "seen1", "", "title", "", "subtitle", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "cta", "icon", "closeIcon", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCloseIcon", "()Ljava/lang/String;", "getCta", "getIcon", "getSubtitle", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostSharePrompt {
    public static final Companion Companion = new Companion(null);
    private final String closeIcon;
    private final String cta;
    private final String icon;
    private final StructurableText subtitle;
    private final String title;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/forums/PostSharePrompt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostSharePrompt> serializer() {
            return PostSharePrompt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PostSharePrompt(int i, String str, StructurableText structurableText, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, PostSharePrompt$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = structurableText;
        this.cta = str2;
        this.icon = str3;
        this.closeIcon = str4;
    }

    public static /* synthetic */ PostSharePrompt copy$default(PostSharePrompt postSharePrompt, String str, StructurableText structurableText, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postSharePrompt.title;
        }
        if ((i & 2) != 0) {
            structurableText = postSharePrompt.subtitle;
        }
        StructurableText structurableText2 = structurableText;
        if ((i & 4) != 0) {
            str2 = postSharePrompt.cta;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = postSharePrompt.icon;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = postSharePrompt.closeIcon;
        }
        return postSharePrompt.copy(str, structurableText2, str5, str6, str4);
    }

    public static final void write$Self(PostSharePrompt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.title);
        output.mo12894i(serialDesc, 1, StructurableTextSerializer.INSTANCE, self.subtitle);
        output.mo12880y(serialDesc, 2, self.cta);
        output.mo12880y(serialDesc, 3, self.icon);
        output.mo12880y(serialDesc, 4, self.closeIcon);
    }

    public final String component1() {
        return this.title;
    }

    public final StructurableText component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.cta;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.closeIcon;
    }

    public final PostSharePrompt copy(String title, StructurableText subtitle, String cta, String icon, String closeIcon) {
        C9612q.m13917h(title, "title");
        C9612q.m13917h(subtitle, "subtitle");
        C9612q.m13917h(cta, "cta");
        C9612q.m13917h(icon, "icon");
        C9612q.m13917h(closeIcon, "closeIcon");
        return new PostSharePrompt(title, subtitle, cta, icon, closeIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostSharePrompt) {
            PostSharePrompt postSharePrompt = (PostSharePrompt) obj;
            return C9612q.m13922c(this.title, postSharePrompt.title) && C9612q.m13922c(this.subtitle, postSharePrompt.subtitle) && C9612q.m13922c(this.cta, postSharePrompt.cta) && C9612q.m13922c(this.icon, postSharePrompt.icon) && C9612q.m13922c(this.closeIcon, postSharePrompt.closeIcon);
        }
        return false;
    }

    public final String getCloseIcon() {
        return this.closeIcon;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final StructurableText getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.closeIcon.hashCode();
    }

    public String toString() {
        String str = this.title;
        StructurableText structurableText = this.subtitle;
        String str2 = this.cta;
        String str3 = this.icon;
        String str4 = this.closeIcon;
        return "PostSharePrompt(title=" + str + ", subtitle=" + structurableText + ", cta=" + str2 + ", icon=" + str3 + ", closeIcon=" + str4 + ")";
    }

    public PostSharePrompt(String title, StructurableText subtitle, String cta, String icon, String closeIcon) {
        C9612q.m13917h(title, "title");
        C9612q.m13917h(subtitle, "subtitle");
        C9612q.m13917h(cta, "cta");
        C9612q.m13917h(icon, "icon");
        C9612q.m13917h(closeIcon, "closeIcon");
        this.title = title;
        this.subtitle = subtitle;
        this.cta = cta;
        this.icon = icon;
        this.closeIcon = closeIcon;
    }
}
