package com.discord.chat.bridge.embed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.webrtc.MediaStreamTrack;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u008d\u00012\u00020\u0001:\u0004\u008c\u0001\u008d\u0001BÙ\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010/\u001a\u0004\u0018\u000100¢\u0006\u0002\u00101Bç\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010+\u001a\u00020\u0003\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u00102J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010k\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010'HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010w\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010{\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jò\u0002\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010+\u001a\u00020\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u007fJ\u0016\u0010\u0080\u0001\u001a\u00020\u001f2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001HÖ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0084\u0001\u001a\u00020\u0007HÖ\u0001J(\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001HÇ\u0001R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\b<\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\bH\u00108R\u0013\u0010%\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bM\u0010ER\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bO\u00104R\u0013\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u0013\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bQ\u00104R\u0016\u0010.\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00104R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0015\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00109\u001a\u0004\bU\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u00104R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u00104R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u00104R\u0016\u0010-\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010>R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b_\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b`\u0010L¨\u0006\u008e\u0001"}, m14357d2 = {"Lcom/discord/chat/bridge/embed/Embed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "type", "Lcom/discord/chat/bridge/embed/EmbedType;", "id", "", "author", "Lcom/discord/chat/bridge/embed/EmbedAuthor;", "provider", "Lcom/discord/chat/bridge/embed/EmbedProvider;", "rawTitle", "title", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "fields", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "url", "rawDescription", "description", "image", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "images", MediaStreamTrack.VIDEO_TRACK_KIND, "thumbnail", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "numAttachments", "attachmentsSize", "messageSendError", "disableBackgroundColor", "", "footer", "Lcom/discord/chat/bridge/embed/EmbedFooter;", "spoiler", "obscure", "obscureAwaitingScan", "iconURL", "failureState", "Lcom/discord/chat/bridge/embed/EmbedFailureState;", "providerColor", ViewProps.BORDER_LEFT_COLOR, "headerTextColor", "bodyTextColor", ViewProps.BACKGROUND_COLOR, "spoilerOrNull", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/embed/EmbedType;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/embed/EmbedType;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)V", "getAttachmentsSize", "()Ljava/lang/String;", "getAuthor", "()Lcom/discord/chat/bridge/embed/EmbedAuthor;", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBodyTextColor", "()I", "getBorderLeftColor", "getDescription", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getDisableBackgroundColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFailureState", "()Lcom/discord/chat/bridge/embed/EmbedFailureState;", "getFields", "()Ljava/util/List;", "getFooter", "()Lcom/discord/chat/bridge/embed/EmbedFooter;", "getHeaderTextColor", "getIconURL", "getId", "getImage", "()Lcom/discord/chat/bridge/embed/EmbedMedia;", "getImages", "getMessageSendError", "getNumAttachments", "getObscure", "getObscureAwaitingScan", "getObscureOrNull", "getProvider", "()Lcom/discord/chat/bridge/embed/EmbedProvider;", "getProviderColor", "getRawDescription", "getRawTitle", "getSpoiler", "getSpoilerOrNull", "getThumbnail", "()Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "getTitle", "getType", "()Lcom/discord/chat/bridge/embed/EmbedType;", "getUrl", "getVideo", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/discord/chat/bridge/embed/EmbedType;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)Lcom/discord/chat/bridge/embed/Embed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class Embed implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String attachmentsSize;
    private final EmbedAuthor author;
    private final Integer backgroundColor;
    private final int bodyTextColor;
    private final Integer borderLeftColor;
    private final StructurableText description;
    private final Boolean disableBackgroundColor;
    private final EmbedFailureState failureState;
    private final List<EmbedField> fields;
    private final EmbedFooter footer;
    private final Integer headerTextColor;
    private final String iconURL;

    /* renamed from: id */
    private final String f8308id;
    private final EmbedMedia image;
    private final List<EmbedMedia> images;
    private final String messageSendError;
    private final String numAttachments;
    private final String obscure;
    private final String obscureAwaitingScan;
    private final String obscureOrNull;
    private final EmbedProvider provider;
    private final Integer providerColor;
    private final String rawDescription;
    private final String rawTitle;
    private final String spoiler;
    private final String spoilerOrNull;
    private final EmbedThumbnail thumbnail;
    private final StructurableText title;
    private final EmbedType type;
    private final String url;
    private final EmbedMedia video;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/embed/Embed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/Embed;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Embed> serializer() {
            return Embed$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x015b, code lost:
        if ((!r4) != false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Embed(int r6, com.discord.chat.bridge.embed.EmbedType r7, java.lang.String r8, com.discord.chat.bridge.embed.EmbedAuthor r9, com.discord.chat.bridge.embed.EmbedProvider r10, java.lang.String r11, com.discord.chat.bridge.structurabletext.StructurableText r12, java.util.List r13, java.lang.String r14, java.lang.String r15, com.discord.chat.bridge.structurabletext.StructurableText r16, com.discord.chat.bridge.embed.EmbedMedia r17, java.util.List r18, com.discord.chat.bridge.embed.EmbedMedia r19, com.discord.chat.bridge.embed.EmbedThumbnail r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, com.discord.chat.bridge.embed.EmbedFooter r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.discord.chat.bridge.embed.EmbedFailureState r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, int r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, kotlinx.serialization.internal.SerializationConstructorMarker r38) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.<init>(int, com.discord.chat.bridge.embed.EmbedType, java.lang.String, com.discord.chat.bridge.embed.EmbedAuthor, com.discord.chat.bridge.embed.EmbedProvider, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, java.util.List, java.lang.String, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, com.discord.chat.bridge.embed.EmbedMedia, java.util.List, com.discord.chat.bridge.embed.EmbedMedia, com.discord.chat.bridge.embed.EmbedThumbnail, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.discord.chat.bridge.embed.EmbedFooter, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.discord.chat.bridge.embed.EmbedFailureState, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x02ee, code lost:
        if ((!r5) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0325, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r1, r3) == false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.embed.Embed r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.write$Self(com.discord.chat.bridge.embed.Embed, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final EmbedType component1() {
        return this.type;
    }

    public final StructurableText component10() {
        return this.description;
    }

    public final EmbedMedia component11() {
        return this.image;
    }

    public final List<EmbedMedia> component12() {
        return this.images;
    }

    public final EmbedMedia component13() {
        return this.video;
    }

    public final EmbedThumbnail component14() {
        return this.thumbnail;
    }

    public final String component15() {
        return this.numAttachments;
    }

    public final String component16() {
        return this.attachmentsSize;
    }

    public final String component17() {
        return this.messageSendError;
    }

    public final Boolean component18() {
        return this.disableBackgroundColor;
    }

    public final EmbedFooter component19() {
        return this.footer;
    }

    public final String component2() {
        return this.f8308id;
    }

    public final String component20() {
        return this.spoiler;
    }

    public final String component21() {
        return this.obscure;
    }

    public final String component22() {
        return this.obscureAwaitingScan;
    }

    public final String component23() {
        return this.iconURL;
    }

    public final EmbedFailureState component24() {
        return this.failureState;
    }

    public final Integer component25() {
        return this.providerColor;
    }

    public final Integer component26() {
        return this.borderLeftColor;
    }

    public final Integer component27() {
        return this.headerTextColor;
    }

    public final int component28() {
        return this.bodyTextColor;
    }

    public final Integer component29() {
        return this.backgroundColor;
    }

    public final EmbedAuthor component3() {
        return this.author;
    }

    public final EmbedProvider component4() {
        return this.provider;
    }

    public final String component5() {
        return this.rawTitle;
    }

    public final StructurableText component6() {
        return this.title;
    }

    public final List<EmbedField> component7() {
        return this.fields;
    }

    public final String component8() {
        return this.url;
    }

    public final String component9() {
        return this.rawDescription;
    }

    public final Embed copy(EmbedType type, String str, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List<EmbedField> list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List<EmbedMedia> list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, String str11, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i, Integer num4) {
        C9612q.m13917h(type, "type");
        return new Embed(type, str, embedAuthor, embedProvider, str2, structurableText, list, str3, str4, structurableText2, embedMedia, list2, embedMedia2, embedThumbnail, str5, str6, str7, bool, embedFooter, str8, str9, str10, str11, embedFailureState, num, num2, num3, i, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Embed) {
            Embed embed = (Embed) obj;
            return this.type == embed.type && C9612q.m13922c(this.f8308id, embed.f8308id) && C9612q.m13922c(this.author, embed.author) && C9612q.m13922c(this.provider, embed.provider) && C9612q.m13922c(this.rawTitle, embed.rawTitle) && C9612q.m13922c(this.title, embed.title) && C9612q.m13922c(this.fields, embed.fields) && C9612q.m13922c(this.url, embed.url) && C9612q.m13922c(this.rawDescription, embed.rawDescription) && C9612q.m13922c(this.description, embed.description) && C9612q.m13922c(this.image, embed.image) && C9612q.m13922c(this.images, embed.images) && C9612q.m13922c(this.video, embed.video) && C9612q.m13922c(this.thumbnail, embed.thumbnail) && C9612q.m13922c(this.numAttachments, embed.numAttachments) && C9612q.m13922c(this.attachmentsSize, embed.attachmentsSize) && C9612q.m13922c(this.messageSendError, embed.messageSendError) && C9612q.m13922c(this.disableBackgroundColor, embed.disableBackgroundColor) && C9612q.m13922c(this.footer, embed.footer) && C9612q.m13922c(this.spoiler, embed.spoiler) && C9612q.m13922c(this.obscure, embed.obscure) && C9612q.m13922c(this.obscureAwaitingScan, embed.obscureAwaitingScan) && C9612q.m13922c(this.iconURL, embed.iconURL) && this.failureState == embed.failureState && C9612q.m13922c(this.providerColor, embed.providerColor) && C9612q.m13922c(this.borderLeftColor, embed.borderLeftColor) && C9612q.m13922c(this.headerTextColor, embed.headerTextColor) && this.bodyTextColor == embed.bodyTextColor && C9612q.m13922c(this.backgroundColor, embed.backgroundColor);
        }
        return false;
    }

    public final String getAttachmentsSize() {
        return this.attachmentsSize;
    }

    public final EmbedAuthor getAuthor() {
        return this.author;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final Integer getBorderLeftColor() {
        return this.borderLeftColor;
    }

    public final StructurableText getDescription() {
        return this.description;
    }

    public final Boolean getDisableBackgroundColor() {
        return this.disableBackgroundColor;
    }

    public final EmbedFailureState getFailureState() {
        return this.failureState;
    }

    public final List<EmbedField> getFields() {
        return this.fields;
    }

    public final EmbedFooter getFooter() {
        return this.footer;
    }

    public final Integer getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final String getId() {
        return this.f8308id;
    }

    public final EmbedMedia getImage() {
        return this.image;
    }

    public final List<EmbedMedia> getImages() {
        return this.images;
    }

    public final String getMessageSendError() {
        return this.messageSendError;
    }

    public final String getNumAttachments() {
        return this.numAttachments;
    }

    public final String getObscure() {
        return this.obscure;
    }

    public final String getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    public final EmbedProvider getProvider() {
        return this.provider;
    }

    public final Integer getProviderColor() {
        return this.providerColor;
    }

    public final String getRawDescription() {
        return this.rawDescription;
    }

    public final String getRawTitle() {
        return this.rawTitle;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final EmbedThumbnail getThumbnail() {
        return this.thumbnail;
    }

    public final StructurableText getTitle() {
        return this.title;
    }

    public final EmbedType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final EmbedMedia getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.f8308id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EmbedAuthor embedAuthor = this.author;
        int hashCode3 = (hashCode2 + (embedAuthor == null ? 0 : embedAuthor.hashCode())) * 31;
        EmbedProvider embedProvider = this.provider;
        int hashCode4 = (hashCode3 + (embedProvider == null ? 0 : embedProvider.hashCode())) * 31;
        String str2 = this.rawTitle;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StructurableText structurableText = this.title;
        int hashCode6 = (hashCode5 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        List<EmbedField> list = this.fields;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.url;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rawDescription;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StructurableText structurableText2 = this.description;
        int hashCode10 = (hashCode9 + (structurableText2 == null ? 0 : structurableText2.hashCode())) * 31;
        EmbedMedia embedMedia = this.image;
        int hashCode11 = (hashCode10 + (embedMedia == null ? 0 : embedMedia.hashCode())) * 31;
        List<EmbedMedia> list2 = this.images;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EmbedMedia embedMedia2 = this.video;
        int hashCode13 = (hashCode12 + (embedMedia2 == null ? 0 : embedMedia2.hashCode())) * 31;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        int hashCode14 = (hashCode13 + (embedThumbnail == null ? 0 : embedThumbnail.hashCode())) * 31;
        String str5 = this.numAttachments;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.attachmentsSize;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageSendError;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.disableBackgroundColor;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        EmbedFooter embedFooter = this.footer;
        int hashCode19 = (hashCode18 + (embedFooter == null ? 0 : embedFooter.hashCode())) * 31;
        String str8 = this.spoiler;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.obscure;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.obscureAwaitingScan;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.iconURL;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        EmbedFailureState embedFailureState = this.failureState;
        int hashCode24 = (hashCode23 + (embedFailureState == null ? 0 : embedFailureState.hashCode())) * 31;
        Integer num = this.providerColor;
        int hashCode25 = (hashCode24 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.borderLeftColor;
        int hashCode26 = (hashCode25 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.headerTextColor;
        int hashCode27 = (((hashCode26 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.bodyTextColor) * 31;
        Integer num4 = this.backgroundColor;
        return hashCode27 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        EmbedType embedType = this.type;
        String str = this.f8308id;
        EmbedAuthor embedAuthor = this.author;
        EmbedProvider embedProvider = this.provider;
        String str2 = this.rawTitle;
        StructurableText structurableText = this.title;
        List<EmbedField> list = this.fields;
        String str3 = this.url;
        String str4 = this.rawDescription;
        StructurableText structurableText2 = this.description;
        EmbedMedia embedMedia = this.image;
        List<EmbedMedia> list2 = this.images;
        EmbedMedia embedMedia2 = this.video;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        String str5 = this.numAttachments;
        String str6 = this.attachmentsSize;
        String str7 = this.messageSendError;
        Boolean bool = this.disableBackgroundColor;
        EmbedFooter embedFooter = this.footer;
        String str8 = this.spoiler;
        String str9 = this.obscure;
        String str10 = this.obscureAwaitingScan;
        String str11 = this.iconURL;
        EmbedFailureState embedFailureState = this.failureState;
        Integer num = this.providerColor;
        Integer num2 = this.borderLeftColor;
        Integer num3 = this.headerTextColor;
        int i = this.bodyTextColor;
        Integer num4 = this.backgroundColor;
        return "Embed(type=" + embedType + ", id=" + str + ", author=" + embedAuthor + ", provider=" + embedProvider + ", rawTitle=" + str2 + ", title=" + structurableText + ", fields=" + list + ", url=" + str3 + ", rawDescription=" + str4 + ", description=" + structurableText2 + ", image=" + embedMedia + ", images=" + list2 + ", video=" + embedMedia2 + ", thumbnail=" + embedThumbnail + ", numAttachments=" + str5 + ", attachmentsSize=" + str6 + ", messageSendError=" + str7 + ", disableBackgroundColor=" + bool + ", footer=" + embedFooter + ", spoiler=" + str8 + ", obscure=" + str9 + ", obscureAwaitingScan=" + str10 + ", iconURL=" + str11 + ", failureState=" + embedFailureState + ", providerColor=" + num + ", borderLeftColor=" + num2 + ", headerTextColor=" + num3 + ", bodyTextColor=" + i + ", backgroundColor=" + num4 + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x007c, code lost:
        if ((!r4) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Embed(com.discord.chat.bridge.embed.EmbedType r6, java.lang.String r7, com.discord.chat.bridge.embed.EmbedAuthor r8, com.discord.chat.bridge.embed.EmbedProvider r9, java.lang.String r10, com.discord.chat.bridge.structurabletext.StructurableText r11, java.util.List<com.discord.chat.bridge.embed.EmbedField> r12, java.lang.String r13, java.lang.String r14, com.discord.chat.bridge.structurabletext.StructurableText r15, com.discord.chat.bridge.embed.EmbedMedia r16, java.util.List<com.discord.chat.bridge.embed.EmbedMedia> r17, com.discord.chat.bridge.embed.EmbedMedia r18, com.discord.chat.bridge.embed.EmbedThumbnail r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Boolean r23, com.discord.chat.bridge.embed.EmbedFooter r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.discord.chat.bridge.embed.EmbedFailureState r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, int r33, java.lang.Integer r34) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r25
            r3 = r26
            java.lang.String r4 = "type"
            kotlin.jvm.internal.C9612q.m13917h(r6, r4)
            r5.<init>()
            r0.type = r1
            r1 = r7
            r0.f8308id = r1
            r1 = r8
            r0.author = r1
            r1 = r9
            r0.provider = r1
            r1 = r10
            r0.rawTitle = r1
            r1 = r11
            r0.title = r1
            r1 = r12
            r0.fields = r1
            r1 = r13
            r0.url = r1
            r1 = r14
            r0.rawDescription = r1
            r1 = r15
            r0.description = r1
            r1 = r16
            r0.image = r1
            r1 = r17
            r0.images = r1
            r1 = r18
            r0.video = r1
            r1 = r19
            r0.thumbnail = r1
            r1 = r20
            r0.numAttachments = r1
            r1 = r21
            r0.attachmentsSize = r1
            r1 = r22
            r0.messageSendError = r1
            r1 = r23
            r0.disableBackgroundColor = r1
            r1 = r24
            r0.footer = r1
            r0.spoiler = r2
            r0.obscure = r3
            r1 = r27
            r0.obscureAwaitingScan = r1
            r1 = r28
            r0.iconURL = r1
            r1 = r29
            r0.failureState = r1
            r1 = r30
            r0.providerColor = r1
            r1 = r31
            r0.borderLeftColor = r1
            r1 = r32
            r0.headerTextColor = r1
            r1 = r33
            r0.bodyTextColor = r1
            r1 = r34
            r0.backgroundColor = r1
            r1 = 0
            if (r2 == 0) goto L7f
            boolean r4 = kotlin.text.C9642f.m13789w(r25)
            r4 = r4 ^ 1
            if (r4 == 0) goto L7f
            goto L80
        L7f:
            r2 = r1
        L80:
            r0.spoilerOrNull = r2
            if (r3 == 0) goto L8d
            boolean r2 = kotlin.text.C9642f.m13789w(r26)
            r2 = r2 ^ 1
            if (r2 == 0) goto L8d
            r1 = r3
        L8d:
            r0.obscureOrNull = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.embed.Embed.<init>(com.discord.chat.bridge.embed.EmbedType, java.lang.String, com.discord.chat.bridge.embed.EmbedAuthor, com.discord.chat.bridge.embed.EmbedProvider, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, java.util.List, java.lang.String, java.lang.String, com.discord.chat.bridge.structurabletext.StructurableText, com.discord.chat.bridge.embed.EmbedMedia, java.util.List, com.discord.chat.bridge.embed.EmbedMedia, com.discord.chat.bridge.embed.EmbedThumbnail, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.discord.chat.bridge.embed.EmbedFooter, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.discord.chat.bridge.embed.EmbedFailureState, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, java.lang.Integer):void");
    }

    public /* synthetic */ Embed(EmbedType embedType, String str, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, String str11, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i, Integer num4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(embedType, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : embedAuthor, (i2 & 8) != 0 ? null : embedProvider, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : structurableText, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : structurableText2, (i2 & 1024) != 0 ? null : embedMedia, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : list2, (i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : embedMedia2, (i2 & 8192) != 0 ? null : embedThumbnail, (i2 & 16384) != 0 ? null : str5, (32768 & i2) != 0 ? null : str6, (65536 & i2) != 0 ? null : str7, (131072 & i2) != 0 ? null : bool, (262144 & i2) != 0 ? null : embedFooter, (524288 & i2) != 0 ? null : str8, (1048576 & i2) != 0 ? null : str9, (2097152 & i2) != 0 ? null : str10, (4194304 & i2) != 0 ? null : str11, (8388608 & i2) != 0 ? null : embedFailureState, (16777216 & i2) != 0 ? null : num, (33554432 & i2) != 0 ? null : num2, (67108864 & i2) != 0 ? null : num3, i, (i2 & 268435456) != 0 ? null : num4);
    }
}
