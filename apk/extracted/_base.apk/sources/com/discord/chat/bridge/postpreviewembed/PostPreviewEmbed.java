package com.discord.chat.bridge.postpreviewembed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0002abBÖ\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0002\u0010\u001fB²\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010=\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010,J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00102J\t\u0010F\u001a\u00020\u0019HÆ\u0003J\u0019\u0010G\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010,J\u0019\u0010I\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010\"J\u0019\u0010K\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010,J\t\u0010M\u001a\u00020\fHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0010HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003JÐ\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020\u00192\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020\u0003HÖ\u0001J\t\u0010Y\u001a\u00020\fHÖ\u0001J!\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u00002\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`HÇ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010/\u001a\u0004\b.\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010-\u001a\u0004\b5\u0010,R\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010-\u001a\u0004\b;\u0010,R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, m14357d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "parentChannelId", "Lcom/discord/primitives/ChannelId;", "threadId", "messageId", "Lcom/discord/primitives/MessageId;", "guildId", "Lcom/discord/primitives/GuildId;", "title", "", "ctaText", "ctaButtonColor", "footer", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitle", "coverImage", "blurredCoverImage", "coverImageOverlayText", "backgroundImage", "spoiler", "obscure", "obscureAwaitingScan", "", "shouldSpoiler", "spoilerOrNull", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundImage", "()Ljava/lang/String;", "getBlurredCoverImage", "getCoverImage", "getCoverImageOverlayText", "getCtaButtonColor", "()I", "getCtaText", "getFooter", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getGuildId-fYKD8eg", "()J", "J", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "getObscure", "getObscureAwaitingScan", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObscureOrNull", "getParentChannelId-o4g7jtM", "getShouldSpoiler", "()Z", "getSpoiler", "getSpoilerOrNull", "getSubtitle", "getThreadId-o4g7jtM", "getTitle", "component1", "component1-o4g7jtM", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component2-o4g7jtM", "component3", "component3-3Eiw7ao", "component4", "component4-fYKD8eg", "component5", "component6", "component7", "component8", "component9", "copy", "copy-k19TMOE", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PostPreviewEmbed implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String backgroundImage;
    private final String blurredCoverImage;
    private final String coverImage;
    private final String coverImageOverlayText;
    private final int ctaButtonColor;
    private final String ctaText;
    private final StructurableText footer;
    private final long guildId;
    private final String messageId;
    private final String obscure;
    private final Boolean obscureAwaitingScan;
    private final String obscureOrNull;
    private final long parentChannelId;
    private final boolean shouldSpoiler;
    private final String spoiler;
    private final String spoilerOrNull;
    private final String subtitle;
    private final long threadId;
    private final String title;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostPreviewEmbed> serializer() {
            return PostPreviewEmbed$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
        if ((!r4) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private PostPreviewEmbed(int r6, com.discord.primitives.ChannelId r7, com.discord.primitives.ChannelId r8, java.lang.String r9, com.discord.primitives.GuildId r10, java.lang.String r11, java.lang.String r12, int r13, com.discord.chat.bridge.structurabletext.StructurableText r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Boolean r22, boolean r23, java.lang.String r24, java.lang.String r25, kotlinx.serialization.internal.SerializationConstructorMarker r26) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.<init>(int, com.discord.primitives.ChannelId, com.discord.primitives.ChannelId, java.lang.String, com.discord.primitives.GuildId, java.lang.String, java.lang.String, int, com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    public /* synthetic */ PostPreviewEmbed(int i, ChannelId channelId, ChannelId channelId2, String str, GuildId guildId, String str2, String str3, int i2, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, channelId, channelId2, str, guildId, str2, str3, i2, structurableText, str4, str5, str6, str7, str8, str9, str10, bool, z, str11, str12, serializationConstructorMarker);
    }

    public /* synthetic */ PostPreviewEmbed(long j, long j2, String str, long j3, String str2, String str3, int i, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, j3, str2, str3, i, structurableText, str4, str5, str6, str7, str8, str9, str10, bool, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0183, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r1, r4) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014e, code lost:
        if ((!r6) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed r7, kotlinx.serialization.encoding.CompositeEncoder r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.write$Self(com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* renamed from: component1-o4g7jtM  reason: not valid java name */
    public final long m41531component1o4g7jtM() {
        return this.parentChannelId;
    }

    public final String component10() {
        return this.coverImage;
    }

    public final String component11() {
        return this.blurredCoverImage;
    }

    public final String component12() {
        return this.coverImageOverlayText;
    }

    public final String component13() {
        return this.backgroundImage;
    }

    public final String component14() {
        return this.spoiler;
    }

    public final String component15() {
        return this.obscure;
    }

    public final Boolean component16() {
        return this.obscureAwaitingScan;
    }

    public final boolean component17() {
        return this.shouldSpoiler;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m41532component2o4g7jtM() {
        return this.threadId;
    }

    /* renamed from: component3-3Eiw7ao  reason: not valid java name */
    public final String m41533component33Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: component4-fYKD8eg  reason: not valid java name */
    public final long m41534component4fYKD8eg() {
        return this.guildId;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.ctaText;
    }

    public final int component7() {
        return this.ctaButtonColor;
    }

    public final StructurableText component8() {
        return this.footer;
    }

    public final String component9() {
        return this.subtitle;
    }

    /* renamed from: copy-k19TMOE  reason: not valid java name */
    public final PostPreviewEmbed m41535copyk19TMOE(long j, long j2, String messageId, long j3, String title, String ctaText, int i, StructurableText footer, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, boolean z) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(title, "title");
        C9612q.m13917h(ctaText, "ctaText");
        C9612q.m13917h(footer, "footer");
        return new PostPreviewEmbed(j, j2, messageId, j3, title, ctaText, i, footer, str, str2, str3, str4, str5, str6, str7, bool, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostPreviewEmbed) {
            PostPreviewEmbed postPreviewEmbed = (PostPreviewEmbed) obj;
            return ChannelId.m42051equalsimpl0(this.parentChannelId, postPreviewEmbed.parentChannelId) && ChannelId.m42051equalsimpl0(this.threadId, postPreviewEmbed.threadId) && MessageId.m42077equalsimpl0(this.messageId, postPreviewEmbed.messageId) && GuildId.m42064equalsimpl0(this.guildId, postPreviewEmbed.guildId) && C9612q.m13922c(this.title, postPreviewEmbed.title) && C9612q.m13922c(this.ctaText, postPreviewEmbed.ctaText) && this.ctaButtonColor == postPreviewEmbed.ctaButtonColor && C9612q.m13922c(this.footer, postPreviewEmbed.footer) && C9612q.m13922c(this.subtitle, postPreviewEmbed.subtitle) && C9612q.m13922c(this.coverImage, postPreviewEmbed.coverImage) && C9612q.m13922c(this.blurredCoverImage, postPreviewEmbed.blurredCoverImage) && C9612q.m13922c(this.coverImageOverlayText, postPreviewEmbed.coverImageOverlayText) && C9612q.m13922c(this.backgroundImage, postPreviewEmbed.backgroundImage) && C9612q.m13922c(this.spoiler, postPreviewEmbed.spoiler) && C9612q.m13922c(this.obscure, postPreviewEmbed.obscure) && C9612q.m13922c(this.obscureAwaitingScan, postPreviewEmbed.obscureAwaitingScan) && this.shouldSpoiler == postPreviewEmbed.shouldSpoiler;
        }
        return false;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBlurredCoverImage() {
        return this.blurredCoverImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final String getCoverImageOverlayText() {
        return this.coverImageOverlayText;
    }

    public final int getCtaButtonColor() {
        return this.ctaButtonColor;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final StructurableText getFooter() {
        return this.footer;
    }

    /* renamed from: getGuildId-fYKD8eg  reason: not valid java name */
    public final long m41536getGuildIdfYKD8eg() {
        return this.guildId;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41537getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getObscure() {
        return this.obscure;
    }

    public final Boolean getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    /* renamed from: getParentChannelId-o4g7jtM  reason: not valid java name */
    public final long m41538getParentChannelIdo4g7jtM() {
        return this.parentChannelId;
    }

    public final boolean getShouldSpoiler() {
        return this.shouldSpoiler;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: getThreadId-o4g7jtM  reason: not valid java name */
    public final long m41539getThreadIdo4g7jtM() {
        return this.threadId;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m42052hashCodeimpl = ((((((((((((((ChannelId.m42052hashCodeimpl(this.parentChannelId) * 31) + ChannelId.m42052hashCodeimpl(this.threadId)) * 31) + MessageId.m42078hashCodeimpl(this.messageId)) * 31) + GuildId.m42065hashCodeimpl(this.guildId)) * 31) + this.title.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.ctaButtonColor) * 31) + this.footer.hashCode()) * 31;
        String str = this.subtitle;
        int hashCode = (m42052hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blurredCoverImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverImageOverlayText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundImage;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spoiler;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.obscure;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.obscureAwaitingScan;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.shouldSpoiler;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode8 + i;
    }

    public String toString() {
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.parentChannelId);
        String m42054toStringimpl2 = ChannelId.m42054toStringimpl(this.threadId);
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        String m42067toStringimpl = GuildId.m42067toStringimpl(this.guildId);
        String str = this.title;
        String str2 = this.ctaText;
        int i = this.ctaButtonColor;
        StructurableText structurableText = this.footer;
        String str3 = this.subtitle;
        String str4 = this.coverImage;
        String str5 = this.blurredCoverImage;
        String str6 = this.coverImageOverlayText;
        String str7 = this.backgroundImage;
        String str8 = this.spoiler;
        String str9 = this.obscure;
        Boolean bool = this.obscureAwaitingScan;
        boolean z = this.shouldSpoiler;
        return "PostPreviewEmbed(parentChannelId=" + m42054toStringimpl + ", threadId=" + m42054toStringimpl2 + ", messageId=" + m42079toStringimpl + ", guildId=" + m42067toStringimpl + ", title=" + str + ", ctaText=" + str2 + ", ctaButtonColor=" + i + ", footer=" + structurableText + ", subtitle=" + str3 + ", coverImage=" + str4 + ", blurredCoverImage=" + str5 + ", coverImageOverlayText=" + str6 + ", backgroundImage=" + str7 + ", spoiler=" + str8 + ", obscure=" + str9 + ", obscureAwaitingScan=" + bool + ", shouldSpoiler=" + z + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x004a, code lost:
        if ((!r4) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private PostPreviewEmbed(long r6, long r8, java.lang.String r10, long r11, java.lang.String r13, java.lang.String r14, int r15, com.discord.chat.bridge.structurabletext.StructurableText r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, boolean r25) {
        /*
            r5 = this;
            r0 = r5
            r1 = r22
            r2 = r23
            r5.<init>()
            r3 = r6
            r0.parentChannelId = r3
            r3 = r8
            r0.threadId = r3
            r3 = r10
            r0.messageId = r3
            r3 = r11
            r0.guildId = r3
            r3 = r13
            r0.title = r3
            r3 = r14
            r0.ctaText = r3
            r3 = r15
            r0.ctaButtonColor = r3
            r3 = r16
            r0.footer = r3
            r3 = r17
            r0.subtitle = r3
            r3 = r18
            r0.coverImage = r3
            r3 = r19
            r0.blurredCoverImage = r3
            r3 = r20
            r0.coverImageOverlayText = r3
            r3 = r21
            r0.backgroundImage = r3
            r0.spoiler = r1
            r0.obscure = r2
            r3 = r24
            r0.obscureAwaitingScan = r3
            r3 = r25
            r0.shouldSpoiler = r3
            r3 = 0
            if (r1 == 0) goto L4d
            boolean r4 = kotlin.text.C9642f.m13789w(r22)
            r4 = r4 ^ 1
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r3
        L4e:
            r0.spoilerOrNull = r1
            if (r2 == 0) goto L5b
            boolean r1 = kotlin.text.C9642f.m13789w(r23)
            r1 = r1 ^ 1
            if (r1 == 0) goto L5b
            r3 = r2
        L5b:
            r0.obscureOrNull = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed.<init>(long, long, java.lang.String, long, java.lang.String, java.lang.String, int, com.discord.chat.bridge.structurabletext.StructurableText, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean):void");
    }

    public /* synthetic */ PostPreviewEmbed(long j, long j2, String str, long j3, String str2, String str3, int i, StructurableText structurableText, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, j3, str2, str3, i, structurableText, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str7, (i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i2 & 8192) != 0 ? null : str9, (i2 & 16384) != 0 ? null : str10, (32768 & i2) != 0 ? null : bool, (i2 & 65536) != 0 ? false : z, null);
    }
}
