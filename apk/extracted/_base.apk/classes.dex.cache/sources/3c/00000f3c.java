package com.discord.chat.bridge.attachment;

import android.net.UrlQuerySanitizer;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.react_asset_fetcher.ReactAsset;
import com.facebook.react.uimanager.ViewProps;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9652n;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u008b\u00012\u00020\u0001:\u0004\u008a\u0001\u008b\u0001Bß\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010+Bµ\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0002\u0010,J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u000eHÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010_\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010c\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010@J\u0010\u0010g\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010h\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\t\u0010i\u001a\u00020\u000eHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010.J\u0010\u0010n\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010.J\t\u0010o\u001a\u00020\u000eHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÆ\u0002\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\"\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\u000e2\b\u0010t\u001a\u0004\u0018\u00010uHÖ\u0003J\b\u0010v\u001a\u0004\u0018\u00010wJ\u0017\u0010x\u001a\u0004\u0018\u00010\u00032\u0006\u0010y\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010zJ\b\u0010{\u001a\u00020\u000eH\u0002J\t\u0010|\u001a\u00020\u0003HÖ\u0001J\b\u0010}\u001a\u00020\u000eH\u0002J\b\u0010~\u001a\u00020\u000eH\u0002J\b\u0010\u007f\u001a\u00020\u000eH\u0002J\n\u0010\u0080\u0001\u001a\u00020\u0006HÖ\u0001J\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J(\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00002\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001HÇ\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b2\u0010.R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b3\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u00109\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0011\u0010\"\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010>R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010>R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010A\u001a\u0004\bB\u0010@R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0016\u0010&\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bE\u0010.R\u0012\u0010(\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u0012\u0010'\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bG\u0010>R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010/\u0012\u0004\bI\u0010JR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010/\u0012\u0004\bK\u0010JR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0016\u0010%\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0010\u0010!\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bU\u0010;¨\u0006\u008c\u0001"}, m14357d2 = {"Lcom/discord/chat/bridge/attachment/Attachment;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "seen2", "id", "", "url", "videoUrl", "filename", "size", "sourceWidth", "sourceHeight", "isSpoiler", "", "spoiler", "description", "hint", "role", "showDescription", "progress", "uploaderId", "uploaderItemId", ViewProps.BACKGROUND_COLOR, "attachmentTagText", "attachmentTagBackgroundColor", "attachmentTagTextColor", "attachmentTagIconType", "obscure", "obscureDescription", "obscureAwaitingScan", "durationSecs", "", "waveform", "isAnimated", "waveformByteArray", "", "spoilerOrNull", "obscureOrNull", "proxyWidth", "proxyHeight", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Z[BLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Z)V", "getAttachmentTagBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAttachmentTagText", "()Ljava/lang/String;", "getAttachmentTagTextColor", "getBackgroundColor", "getDescription", "getDurationSecs", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFilename", "height", "getHeight", "()I", "getHint", "getId", "()Z", "getObscure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObscureAwaitingScan", "getObscureDescription", "getObscureOrNull", "getProgress", "getRole", "getShowDescription", "getSize", "getSourceHeight$annotations", "()V", "getSourceWidth$annotations", "getSpoiler", "getSpoilerOrNull", "getUploaderId", "getUploaderItemId", "getUrl", "getVideoUrl", "getWaveformByteArray", "()[B", "width", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Z)Lcom/discord/chat/bridge/attachment/Attachment;", "equals", "other", "", "getAttachmentTagIcon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "getProxyUrlQueryParam", "paramName", "(Ljava/lang/String;)Ljava/lang/Integer;", "hasDimensions", "hashCode", "isImage", "isVideo", "shouldShowImages", "toString", "type", "Lcom/discord/chat/bridge/attachment/AttachmentType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class Attachment implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final Integer attachmentTagBackgroundColor;
    private final String attachmentTagIconType;
    private final String attachmentTagText;
    private final Integer attachmentTagTextColor;
    private final Integer backgroundColor;
    private final String description;
    private final Float durationSecs;
    private final String filename;
    private final String hint;

    /* renamed from: id */
    private final String f8300id;
    private final boolean isAnimated;
    private final boolean isSpoiler;
    private final Boolean obscure;
    private final Boolean obscureAwaitingScan;
    private final String obscureDescription;
    private final String obscureOrNull;
    private final Integer progress;
    private final Integer proxyHeight;
    private final Integer proxyWidth;
    private final String role;
    private final boolean showDescription;
    private final String size;
    private final Integer sourceHeight;
    private final Integer sourceWidth;
    private final String spoiler;
    private final String spoilerOrNull;
    private final String uploaderId;
    private final String uploaderItemId;
    private final String url;
    private final String videoUrl;
    private final String waveform;
    private final byte[] waveformByteArray;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/attachment/Attachment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/attachment/Attachment;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Attachment> serializer() {
            return Attachment$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0184, code lost:
        if (r6 != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Attachment(int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.Integer r16, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.lang.Integer r26, java.lang.String r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.String r30, java.lang.Boolean r31, java.lang.String r32, java.lang.Boolean r33, java.lang.Float r34, java.lang.String r35, boolean r36, byte[] r37, java.lang.String r38, java.lang.String r39, java.lang.Integer r40, java.lang.Integer r41, kotlinx.serialization.internal.SerializationConstructorMarker r42) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.String, boolean, byte[], java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    private final String component21() {
        return this.attachmentTagIconType;
    }

    private final String component26() {
        return this.waveform;
    }

    private final Integer component6() {
        return this.sourceWidth;
    }

    private final Integer component7() {
        return this.sourceHeight;
    }

    private final Integer getProxyUrlQueryParam(String str) {
        Object m7596b;
        Integer num;
        Integer num2 = null;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            String value = new UrlQuerySanitizer(this.url).getValue(str);
            if (value != null) {
                C9612q.m13918g(value, "getValue(paramName)");
                num = C9652n.m13769m(value);
            } else {
                num = null;
            }
            m7596b = C11583s.m7596b(num);
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (!C11583s.m7591g(m7596b)) {
            num2 = m7596b;
        }
        return num2;
    }

    private static /* synthetic */ void getSourceHeight$annotations() {
    }

    private static /* synthetic */ void getSourceWidth$annotations() {
    }

    private final boolean hasDimensions() {
        return getWidth() > 0 && getHeight() > 0;
    }

    private final boolean isImage() {
        Pattern pattern;
        pattern = AttachmentKt.IMAGE_FILE_EXTENSIONS;
        return pattern.matcher(this.filename).find();
    }

    private final boolean isVideo() {
        Pattern pattern;
        pattern = AttachmentKt.VIDEO_FILE_EXTENSIONS;
        return pattern.matcher(this.filename).find();
    }

    private final boolean shouldShowImages() {
        Integer num = this.sourceWidth;
        if ((num != null ? num.intValue() : 0) > 0) {
            Integer num2 = this.sourceHeight;
            return (num2 != null ? num2.intValue() : 0) > 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:506:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:569:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.attachment.Attachment r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.write$Self(com.discord.chat.bridge.attachment.Attachment, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.f8300id;
    }

    public final String component10() {
        return this.description;
    }

    public final String component11() {
        return this.hint;
    }

    public final String component12() {
        return this.role;
    }

    public final boolean component13() {
        return this.showDescription;
    }

    public final Integer component14() {
        return this.progress;
    }

    public final String component15() {
        return this.uploaderId;
    }

    public final String component16() {
        return this.uploaderItemId;
    }

    public final Integer component17() {
        return this.backgroundColor;
    }

    public final String component18() {
        return this.attachmentTagText;
    }

    public final Integer component19() {
        return this.attachmentTagBackgroundColor;
    }

    public final String component2() {
        return this.url;
    }

    public final Integer component20() {
        return this.attachmentTagTextColor;
    }

    public final Boolean component22() {
        return this.obscure;
    }

    public final String component23() {
        return this.obscureDescription;
    }

    public final Boolean component24() {
        return this.obscureAwaitingScan;
    }

    public final Float component25() {
        return this.durationSecs;
    }

    public final boolean component27() {
        return this.isAnimated;
    }

    public final String component3() {
        return this.videoUrl;
    }

    public final String component4() {
        return this.filename;
    }

    public final String component5() {
        return this.size;
    }

    public final boolean component8() {
        return this.isSpoiler;
    }

    public final String component9() {
        return this.spoiler;
    }

    public final Attachment copy(String str, String url, String str2, String filename, String size, Integer num, Integer num2, boolean z, String str3, String str4, String str5, String str6, boolean z2, Integer num3, String str7, String str8, Integer num4, String str9, Integer num5, Integer num6, String str10, Boolean bool, String str11, Boolean bool2, Float f, String str12, boolean z3) {
        C9612q.m13917h(url, "url");
        C9612q.m13917h(filename, "filename");
        C9612q.m13917h(size, "size");
        return new Attachment(str, url, str2, filename, size, num, num2, z, str3, str4, str5, str6, z2, num3, str7, str8, num4, str9, num5, num6, str10, bool, str11, bool2, f, str12, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Attachment) {
            Attachment attachment = (Attachment) obj;
            return C9612q.m13922c(this.f8300id, attachment.f8300id) && C9612q.m13922c(this.url, attachment.url) && C9612q.m13922c(this.videoUrl, attachment.videoUrl) && C9612q.m13922c(this.filename, attachment.filename) && C9612q.m13922c(this.size, attachment.size) && C9612q.m13922c(this.sourceWidth, attachment.sourceWidth) && C9612q.m13922c(this.sourceHeight, attachment.sourceHeight) && this.isSpoiler == attachment.isSpoiler && C9612q.m13922c(this.spoiler, attachment.spoiler) && C9612q.m13922c(this.description, attachment.description) && C9612q.m13922c(this.hint, attachment.hint) && C9612q.m13922c(this.role, attachment.role) && this.showDescription == attachment.showDescription && C9612q.m13922c(this.progress, attachment.progress) && C9612q.m13922c(this.uploaderId, attachment.uploaderId) && C9612q.m13922c(this.uploaderItemId, attachment.uploaderItemId) && C9612q.m13922c(this.backgroundColor, attachment.backgroundColor) && C9612q.m13922c(this.attachmentTagText, attachment.attachmentTagText) && C9612q.m13922c(this.attachmentTagBackgroundColor, attachment.attachmentTagBackgroundColor) && C9612q.m13922c(this.attachmentTagTextColor, attachment.attachmentTagTextColor) && C9612q.m13922c(this.attachmentTagIconType, attachment.attachmentTagIconType) && C9612q.m13922c(this.obscure, attachment.obscure) && C9612q.m13922c(this.obscureDescription, attachment.obscureDescription) && C9612q.m13922c(this.obscureAwaitingScan, attachment.obscureAwaitingScan) && C9612q.m13922c(this.durationSecs, attachment.durationSecs) && C9612q.m13922c(this.waveform, attachment.waveform) && this.isAnimated == attachment.isAnimated;
        }
        return false;
    }

    public final Integer getAttachmentTagBackgroundColor() {
        return this.attachmentTagBackgroundColor;
    }

    public final ReactAsset getAttachmentTagIcon() {
        if (C9612q.m13922c(this.attachmentTagIconType, "clip")) {
            return ReactAsset.Clip;
        }
        return null;
    }

    public final String getAttachmentTagText() {
        return this.attachmentTagText;
    }

    public final Integer getAttachmentTagTextColor() {
        return this.attachmentTagTextColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Float getDurationSecs() {
        return this.durationSecs;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getHeight() {
        Integer num = this.proxyHeight;
        if (num == null && (num = this.sourceHeight) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getId() {
        return this.f8300id;
    }

    public final Boolean getObscure() {
        return this.obscure;
    }

    public final Boolean getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    public final String getObscureDescription() {
        return this.obscureDescription;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final String getRole() {
        return this.role;
    }

    public final boolean getShowDescription() {
        return this.showDescription;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final String getUploaderId() {
        return this.uploaderId;
    }

    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final byte[] getWaveformByteArray() {
        return this.waveformByteArray;
    }

    public final int getWidth() {
        Integer num = this.proxyWidth;
        if (num == null && (num = this.sourceWidth) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f8300id;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.url.hashCode()) * 31;
        String str2 = this.videoUrl;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.filename.hashCode()) * 31) + this.size.hashCode()) * 31;
        Integer num = this.sourceWidth;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sourceHeight;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.isSpoiler;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str3 = this.spoiler;
        int hashCode5 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hint;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.role;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z2 = this.showDescription;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode8 + i3) * 31;
        Integer num3 = this.progress;
        int hashCode9 = (i4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.uploaderId;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.uploaderItemId;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.backgroundColor;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.attachmentTagText;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num5 = this.attachmentTagBackgroundColor;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.attachmentTagTextColor;
        int hashCode15 = (hashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str10 = this.attachmentTagIconType;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.obscure;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.obscureDescription;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.obscureAwaitingScan;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.durationSecs;
        int hashCode20 = (hashCode19 + (f == null ? 0 : f.hashCode())) * 31;
        String str12 = this.waveform;
        int hashCode21 = (hashCode20 + (str12 != null ? str12.hashCode() : 0)) * 31;
        boolean z3 = this.isAnimated;
        return hashCode21 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final boolean isAnimated() {
        return this.isAnimated;
    }

    public final boolean isSpoiler() {
        return this.isSpoiler;
    }

    public String toString() {
        String str = this.f8300id;
        String str2 = this.url;
        String str3 = this.videoUrl;
        String str4 = this.filename;
        String str5 = this.size;
        Integer num = this.sourceWidth;
        Integer num2 = this.sourceHeight;
        boolean z = this.isSpoiler;
        String str6 = this.spoiler;
        String str7 = this.description;
        String str8 = this.hint;
        String str9 = this.role;
        boolean z2 = this.showDescription;
        Integer num3 = this.progress;
        String str10 = this.uploaderId;
        String str11 = this.uploaderItemId;
        Integer num4 = this.backgroundColor;
        String str12 = this.attachmentTagText;
        Integer num5 = this.attachmentTagBackgroundColor;
        Integer num6 = this.attachmentTagTextColor;
        String str13 = this.attachmentTagIconType;
        Boolean bool = this.obscure;
        String str14 = this.obscureDescription;
        Boolean bool2 = this.obscureAwaitingScan;
        Float f = this.durationSecs;
        String str15 = this.waveform;
        boolean z3 = this.isAnimated;
        return "Attachment(id=" + str + ", url=" + str2 + ", videoUrl=" + str3 + ", filename=" + str4 + ", size=" + str5 + ", sourceWidth=" + num + ", sourceHeight=" + num2 + ", isSpoiler=" + z + ", spoiler=" + str6 + ", description=" + str7 + ", hint=" + str8 + ", role=" + str9 + ", showDescription=" + z2 + ", progress=" + num3 + ", uploaderId=" + str10 + ", uploaderItemId=" + str11 + ", backgroundColor=" + num4 + ", attachmentTagText=" + str12 + ", attachmentTagBackgroundColor=" + num5 + ", attachmentTagTextColor=" + num6 + ", attachmentTagIconType=" + str13 + ", obscure=" + bool + ", obscureDescription=" + str14 + ", obscureAwaitingScan=" + bool2 + ", durationSecs=" + f + ", waveform=" + str15 + ", isAnimated=" + z3 + ")";
    }

    public final AttachmentType type() {
        if (this.durationSecs != null && this.waveform != null) {
            return AttachmentType.Audio;
        }
        if (!shouldShowImages()) {
            return AttachmentType.File;
        }
        if (isImage() && hasDimensions()) {
            return AttachmentType.Image;
        }
        if (isVideo() && hasDimensions()) {
            return AttachmentType.Video;
        }
        return AttachmentType.File;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a0, code lost:
        if (r5 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Attachment(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Integer r12, java.lang.Integer r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, java.lang.String r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.String r27, java.lang.Boolean r28, java.lang.String r29, java.lang.Boolean r30, java.lang.Float r31, java.lang.String r32, boolean r33) {
        /*
            r6 = this;
            r0 = r6
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r32
            java.lang.String r5 = "url"
            kotlin.jvm.internal.C9612q.m13917h(r8, r5)
            java.lang.String r5 = "filename"
            kotlin.jvm.internal.C9612q.m13917h(r10, r5)
            java.lang.String r5 = "size"
            kotlin.jvm.internal.C9612q.m13917h(r11, r5)
            r6.<init>()
            r5 = r7
            r0.f8300id = r5
            r0.url = r1
            r1 = r9
            r0.videoUrl = r1
            r0.filename = r2
            r0.size = r3
            r1 = r12
            r0.sourceWidth = r1
            r1 = r13
            r0.sourceHeight = r1
            r1 = r14
            r0.isSpoiler = r1
            r1 = r15
            r0.spoiler = r1
            r1 = r16
            r0.description = r1
            r1 = r17
            r0.hint = r1
            r1 = r18
            r0.role = r1
            r1 = r19
            r0.showDescription = r1
            r1 = r20
            r0.progress = r1
            r1 = r21
            r0.uploaderId = r1
            r1 = r22
            r0.uploaderItemId = r1
            r1 = r23
            r0.backgroundColor = r1
            r1 = r24
            r0.attachmentTagText = r1
            r1 = r25
            r0.attachmentTagBackgroundColor = r1
            r1 = r26
            r0.attachmentTagTextColor = r1
            r1 = r27
            r0.attachmentTagIconType = r1
            r1 = r28
            r0.obscure = r1
            r1 = r29
            r0.obscureDescription = r1
            r1 = r30
            r0.obscureAwaitingScan = r1
            r1 = r31
            r0.durationSecs = r1
            r0.waveform = r4
            r1 = r33
            r0.isAnimated = r1
            r1 = 0
            r2 = 0
            if (r4 == 0) goto L7f
            byte[] r3 = android.util.Base64.decode(r4, r1)     // Catch: java.lang.Exception -> L7f
            goto L80
        L7f:
            r3 = r2
        L80:
            r0.waveformByteArray = r3
            java.lang.String r3 = r0.spoiler
            r4 = 1
            if (r3 == 0) goto L90
            boolean r5 = kotlin.text.C9642f.m13789w(r3)
            if (r5 == 0) goto L8e
            goto L90
        L8e:
            r5 = r1
            goto L91
        L90:
            r5 = r4
        L91:
            r5 = r5 ^ r4
            if (r5 == 0) goto L95
            goto L96
        L95:
            r3 = r2
        L96:
            r0.spoilerOrNull = r3
            java.lang.String r3 = r0.obscureDescription
            if (r3 == 0) goto La2
            boolean r5 = kotlin.text.C9642f.m13789w(r3)
            if (r5 == 0) goto La3
        La2:
            r1 = r4
        La3:
            r1 = r1 ^ r4
            if (r1 == 0) goto La7
            r2 = r3
        La7:
            r0.obscureOrNull = r2
            java.lang.String r1 = "width"
            java.lang.Integer r1 = r6.getProxyUrlQueryParam(r1)
            r0.proxyWidth = r1
            java.lang.String r1 = "height"
            java.lang.Integer r1 = r6.getProxyUrlQueryParam(r1)
            r0.proxyHeight = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.String, boolean):void");
    }

    public /* synthetic */ Attachment(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z, String str6, String str7, String str8, String str9, boolean z2, Integer num3, String str10, String str11, Integer num4, String str12, Integer num5, Integer num6, String str13, Boolean bool, String str14, Boolean bool2, Float f, String str15, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, str4, str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, z, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str9, (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z2, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : num4, (131072 & i) != 0 ? null : str12, (262144 & i) != 0 ? null : num5, (524288 & i) != 0 ? null : num6, (1048576 & i) != 0 ? null : str13, (2097152 & i) != 0 ? null : bool, (4194304 & i) != 0 ? null : str14, (8388608 & i) != 0 ? null : bool2, (16777216 & i) != 0 ? null : f, (33554432 & i) != 0 ? null : str15, (i & 67108864) != 0 ? true : z3);
    }
}