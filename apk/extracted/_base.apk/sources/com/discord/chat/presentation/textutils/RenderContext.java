package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.theme.DiscordTheme;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b`\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0091\u0001\u0092\u0001B\u0099\u0003\u0012\u0006\u00107\u001a\u00020\n\u0012\u0006\u00108\u001a\u00020\f\u0012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0002\u0012\"\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0014\u0012*\u0010=\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0018\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d\u0012\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0006\u0010D\u001a\u00020\u0006\u0012\u0006\u0010E\u001a\u00020\u0006\u0012\u0006\u0010F\u001a\u00020\u0006\u0012\u0006\u0010G\u001a\u00020\u0006\u0012\u0006\u0010H\u001a\u00020&\u0012\b\b\u0002\u0010I\u001a\u00020(\u0012\b\b\u0002\u0010J\u001a\u00020*\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010M\u001a\u00020\u0003\u0012\u0006\u0010N\u001a\u000201\u0012\b\b\u0002\u0010O\u001a\u000203\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010*¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0002HÆ\u0003J%\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0014HÆ\u0003J-\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0016HÆ\u0003J\u001b\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0018HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dHÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020&HÆ\u0003J\t\u0010)\u001a\u00020(HÆ\u0003J\t\u0010+\u001a\u00020*HÆ\u0003J\u0012\u0010-\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\b/\u0010.J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u000201HÆ\u0003J\t\u00104\u001a\u000203HÆ\u0003J\u0012\u00105\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\b5\u00106JÆ\u0003\u0010Q\u001a\u00020\u00002\b\b\u0002\u00107\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\f2\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00022$\b\u0002\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00142,\b\u0002\u0010=\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00162\u001a\b\u0002\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00182\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00022\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\u0014\b\u0002\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0002\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020\u00062\b\b\u0002\u0010H\u001a\u00020&2\b\b\u0002\u0010I\u001a\u00020(2\b\b\u0002\u0010J\u001a\u00020*2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u0002012\b\b\u0002\u0010O\u001a\u0002032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010*HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\t\u0010S\u001a\u00020\fHÖ\u0001J\t\u0010T\u001a\u00020*HÖ\u0001J\u0013\u0010V\u001a\u00020\u00062\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u00107\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u0010W\u001a\u0004\bX\u0010YR\u0017\u00108\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u0010Z\u001a\u0004\b[\u0010\\R#\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b9\u0010]\u001a\u0004\b^\u0010_R#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b:\u0010]\u001a\u0004\b`\u0010_R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00028\u0006¢\u0006\f\n\u0004\b;\u0010]\u001a\u0004\ba\u0010_R3\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b<\u0010b\u001a\u0004\bc\u0010dR;\u0010=\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00168\u0006¢\u0006\f\n\u0004\b=\u0010e\u001a\u0004\bf\u0010gR)\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00188\u0006¢\u0006\f\n\u0004\b>\u0010h\u001a\u0004\bi\u0010jR#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b?\u0010]\u001a\u0004\bk\u0010_R#\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b@\u0010]\u001a\u0004\bl\u0010_R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0006¢\u0006\f\n\u0004\bA\u0010m\u001a\u0004\bn\u0010oR#\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\bB\u0010]\u001a\u0004\bp\u0010_R#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\bC\u0010]\u001a\u0004\bq\u0010_R\u0017\u0010D\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010E\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u0010r\u001a\u0004\bu\u0010tR\u0017\u0010F\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010r\u001a\u0004\bv\u0010tR\u0017\u0010G\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bG\u0010r\u001a\u0004\bw\u0010tR\u0017\u0010H\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bH\u0010x\u001a\u0004\by\u0010zR\u0017\u0010I\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bI\u0010{\u001a\u0004\b|\u0010}R\u0018\u0010J\u001a\u00020*8\u0006¢\u0006\r\n\u0004\bJ\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010K\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000e\n\u0005\bK\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010.R\u001b\u0010L\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000e\n\u0005\bL\u0010\u0081\u0001\u001a\u0005\b\u0083\u0001\u0010.R\u001a\u0010M\u001a\u00020\u00038\u0006¢\u0006\u000f\n\u0005\bM\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010N\u001a\u0002018\u0006¢\u0006\u000f\n\u0005\bN\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010O\u001a\u0002038\u0006¢\u0006\u000f\n\u0005\bO\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010P\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u000e\n\u0005\bP\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u00106¨\u0006\u0093\u0001"}, m14357d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext;", "", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "update", "updateInsets", "", "spoilerExists", "spoilerIsHidden", "spoilerIsRevealed", "Landroid/content/Context;", "component1", "", "component2", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "component3", "component4", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "component5", "Lkotlin/Function3;", "component6", "Lkotlin/Function4;", "component7", "Lkotlin/Function2;", "component8", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "component9", "component10", "Lkotlin/Function0;", "component11", "component12", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "component13", "component14", "component15", "component16", "component17", "Landroid/graphics/Paint;", "component18", "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "component19", "", "component20", "", "component21", "()Ljava/lang/Long;", "component22", "component23", "Lcom/discord/theme/DiscordTheme;", "component24", "", "component25", "component26", "()Ljava/lang/Integer;", "context", "containerId", "onTapLink", "onLongTapLink", "linkStyle", "onTapChannel", "onLongPressChannel", "onTapMention", "onTapCommand", "onLongPressCommand", "onTapSpoiler", "onTapTimestamp", "onTapEmoji", "animateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "singleLine", "paint", "spoilerState", "listNestedLevel", "listOrderedIndex", "listLargestOrderedIndex", "insets", "theme", "baselineHeight", "emojiSizeOverride", "copy", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLandroid/graphics/Paint;Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Long;Ljava/lang/Long;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)Lcom/discord/chat/presentation/textutils/RenderContext;", "toString", "hashCode", "other", "equals", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getContainerId", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnTapLink", "()Lkotlin/jvm/functions/Function1;", "getOnLongTapLink", "getLinkStyle", "Lkotlin/jvm/functions/Function3;", "getOnTapChannel", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function4;", "getOnLongPressChannel", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function2;", "getOnTapMention", "()Lkotlin/jvm/functions/Function2;", "getOnTapCommand", "getOnLongPressCommand", "Lkotlin/jvm/functions/Function0;", "getOnTapSpoiler", "()Lkotlin/jvm/functions/Function0;", "getOnTapTimestamp", "getOnTapEmoji", "Z", "getAnimateEmoji", "()Z", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getSingleLine", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "getSpoilerState", "()Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "I", "getListNestedLevel", "()I", "Ljava/lang/Long;", "getListOrderedIndex", "getListLargestOrderedIndex", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "getInsets", "()Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "Lcom/discord/theme/DiscordTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "F", "getBaselineHeight", "()F", "Ljava/lang/Integer;", "getEmojiSizeOverride", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLandroid/graphics/Paint;Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Long;Ljava/lang/Long;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)V", "Insets", "SpoilerState", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class RenderContext {
    private final boolean animateEmoji;
    private final float baselineHeight;
    private final String containerId;
    private final Context context;
    private final Integer emojiSizeOverride;
    private final Insets insets;
    private final Function1<LinkContentNode, LinkStyle> linkStyle;
    private final Long listLargestOrderedIndex;
    private final int listNestedLevel;
    private final Long listOrderedIndex;
    private final Function4<String, String, String, String, Unit> onLongPressChannel;
    private final Function1<CommandMentionContentNode, Unit> onLongPressCommand;
    private final Function1<LinkContentNode, Unit> onLongTapLink;
    private final Function3<String, String, String, Unit> onTapChannel;
    private final Function1<CommandMentionContentNode, Unit> onTapCommand;
    private final Function1<EmojiContentNode, Unit> onTapEmoji;
    private final Function1<LinkContentNode, Unit> onTapLink;
    private final Function2<String, String, Unit> onTapMention;
    private final Function0<Unit> onTapSpoiler;
    private final Function1<String, Unit> onTapTimestamp;
    private final Paint paint;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final boolean singleLine;
    private final SpoilerState spoilerState;
    private final DiscordTheme theme;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "", "(Ljava/lang/String;I)V", "None", "Hidden", "Revealed", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum SpoilerState {
        None,
        Hidden,
        Revealed
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderContext(Context context, String containerId, Function1<? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function1<? super LinkContentNode, LinkStyle> linkStyle, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, boolean z, boolean z2, boolean z3, boolean z4, Paint paint, SpoilerState spoilerState, int i, Long l, Long l2, Insets insets, DiscordTheme theme, float f, Integer num) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(containerId, "containerId");
        C9612q.m13917h(onTapLink, "onTapLink");
        C9612q.m13917h(onLongTapLink, "onLongTapLink");
        C9612q.m13917h(linkStyle, "linkStyle");
        C9612q.m13917h(onTapChannel, "onTapChannel");
        C9612q.m13917h(onLongPressChannel, "onLongPressChannel");
        C9612q.m13917h(onTapMention, "onTapMention");
        C9612q.m13917h(onTapCommand, "onTapCommand");
        C9612q.m13917h(onLongPressCommand, "onLongPressCommand");
        C9612q.m13917h(onTapSpoiler, "onTapSpoiler");
        C9612q.m13917h(onTapTimestamp, "onTapTimestamp");
        C9612q.m13917h(onTapEmoji, "onTapEmoji");
        C9612q.m13917h(paint, "paint");
        C9612q.m13917h(spoilerState, "spoilerState");
        C9612q.m13917h(insets, "insets");
        C9612q.m13917h(theme, "theme");
        this.context = context;
        this.containerId = containerId;
        this.onTapLink = onTapLink;
        this.onLongTapLink = onLongTapLink;
        this.linkStyle = linkStyle;
        this.onTapChannel = onTapChannel;
        this.onLongPressChannel = onLongPressChannel;
        this.onTapMention = onTapMention;
        this.onTapCommand = onTapCommand;
        this.onLongPressCommand = onLongPressCommand;
        this.onTapSpoiler = onTapSpoiler;
        this.onTapTimestamp = onTapTimestamp;
        this.onTapEmoji = onTapEmoji;
        this.animateEmoji = z;
        this.shouldShowRoleDot = z2;
        this.shouldShowRoleOnName = z3;
        this.singleLine = z4;
        this.paint = paint;
        this.spoilerState = spoilerState;
        this.listNestedLevel = i;
        this.listOrderedIndex = l;
        this.listLargestOrderedIndex = l2;
        this.insets = insets;
        this.theme = theme;
        this.baselineHeight = f;
        this.emojiSizeOverride = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderContext copy$default(RenderContext renderContext, Context context, String str, Function1 function1, Function1 function12, Function1 function13, Function3 function3, Function4 function4, Function2 function2, Function1 function14, Function1 function15, Function0 function0, Function1 function16, Function1 function17, boolean z, boolean z2, boolean z3, boolean z4, Paint paint, SpoilerState spoilerState, int i, Long l, Long l2, Insets insets, DiscordTheme discordTheme, float f, Integer num, int i2, Object obj) {
        return renderContext.copy((i2 & 1) != 0 ? renderContext.context : context, (i2 & 2) != 0 ? renderContext.containerId : str, (i2 & 4) != 0 ? renderContext.onTapLink : function1, (i2 & 8) != 0 ? renderContext.onLongTapLink : function12, (i2 & 16) != 0 ? renderContext.linkStyle : function13, (i2 & 32) != 0 ? renderContext.onTapChannel : function3, (i2 & 64) != 0 ? renderContext.onLongPressChannel : function4, (i2 & 128) != 0 ? renderContext.onTapMention : function2, (i2 & 256) != 0 ? renderContext.onTapCommand : function14, (i2 & 512) != 0 ? renderContext.onLongPressCommand : function15, (i2 & 1024) != 0 ? renderContext.onTapSpoiler : function0, (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? renderContext.onTapTimestamp : function16, (i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? renderContext.onTapEmoji : function17, (i2 & 8192) != 0 ? renderContext.animateEmoji : z, (i2 & 16384) != 0 ? renderContext.shouldShowRoleDot : z2, (i2 & 32768) != 0 ? renderContext.shouldShowRoleOnName : z3, (i2 & 65536) != 0 ? renderContext.singleLine : z4, (i2 & 131072) != 0 ? renderContext.paint : paint, (i2 & 262144) != 0 ? renderContext.spoilerState : spoilerState, (i2 & 524288) != 0 ? renderContext.listNestedLevel : i, (i2 & 1048576) != 0 ? renderContext.listOrderedIndex : l, (i2 & 2097152) != 0 ? renderContext.listLargestOrderedIndex : l2, (i2 & 4194304) != 0 ? renderContext.insets : insets, (i2 & 8388608) != 0 ? renderContext.theme : discordTheme, (i2 & 16777216) != 0 ? renderContext.baselineHeight : f, (i2 & 33554432) != 0 ? renderContext.emojiSizeOverride : num);
    }

    public final Context component1() {
        return this.context;
    }

    public final Function1<CommandMentionContentNode, Unit> component10() {
        return this.onLongPressCommand;
    }

    public final Function0<Unit> component11() {
        return this.onTapSpoiler;
    }

    public final Function1<String, Unit> component12() {
        return this.onTapTimestamp;
    }

    public final Function1<EmojiContentNode, Unit> component13() {
        return this.onTapEmoji;
    }

    public final boolean component14() {
        return this.animateEmoji;
    }

    public final boolean component15() {
        return this.shouldShowRoleDot;
    }

    public final boolean component16() {
        return this.shouldShowRoleOnName;
    }

    public final boolean component17() {
        return this.singleLine;
    }

    public final Paint component18() {
        return this.paint;
    }

    public final SpoilerState component19() {
        return this.spoilerState;
    }

    public final String component2() {
        return this.containerId;
    }

    public final int component20() {
        return this.listNestedLevel;
    }

    public final Long component21() {
        return this.listOrderedIndex;
    }

    public final Long component22() {
        return this.listLargestOrderedIndex;
    }

    public final Insets component23() {
        return this.insets;
    }

    public final DiscordTheme component24() {
        return this.theme;
    }

    public final float component25() {
        return this.baselineHeight;
    }

    public final Integer component26() {
        return this.emojiSizeOverride;
    }

    public final Function1<LinkContentNode, Unit> component3() {
        return this.onTapLink;
    }

    public final Function1<LinkContentNode, Unit> component4() {
        return this.onLongTapLink;
    }

    public final Function1<LinkContentNode, LinkStyle> component5() {
        return this.linkStyle;
    }

    public final Function3<String, String, String, Unit> component6() {
        return this.onTapChannel;
    }

    public final Function4<String, String, String, String, Unit> component7() {
        return this.onLongPressChannel;
    }

    public final Function2<String, String, Unit> component8() {
        return this.onTapMention;
    }

    public final Function1<CommandMentionContentNode, Unit> component9() {
        return this.onTapCommand;
    }

    public final RenderContext copy(Context context, String containerId, Function1<? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function1<? super LinkContentNode, LinkStyle> linkStyle, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, boolean z, boolean z2, boolean z3, boolean z4, Paint paint, SpoilerState spoilerState, int i, Long l, Long l2, Insets insets, DiscordTheme theme, float f, Integer num) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(containerId, "containerId");
        C9612q.m13917h(onTapLink, "onTapLink");
        C9612q.m13917h(onLongTapLink, "onLongTapLink");
        C9612q.m13917h(linkStyle, "linkStyle");
        C9612q.m13917h(onTapChannel, "onTapChannel");
        C9612q.m13917h(onLongPressChannel, "onLongPressChannel");
        C9612q.m13917h(onTapMention, "onTapMention");
        C9612q.m13917h(onTapCommand, "onTapCommand");
        C9612q.m13917h(onLongPressCommand, "onLongPressCommand");
        C9612q.m13917h(onTapSpoiler, "onTapSpoiler");
        C9612q.m13917h(onTapTimestamp, "onTapTimestamp");
        C9612q.m13917h(onTapEmoji, "onTapEmoji");
        C9612q.m13917h(paint, "paint");
        C9612q.m13917h(spoilerState, "spoilerState");
        C9612q.m13917h(insets, "insets");
        C9612q.m13917h(theme, "theme");
        return new RenderContext(context, containerId, onTapLink, onLongTapLink, linkStyle, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, z, z2, z3, z4, paint, spoilerState, i, l, l2, insets, theme, f, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenderContext) {
            RenderContext renderContext = (RenderContext) obj;
            return C9612q.m13922c(this.context, renderContext.context) && C9612q.m13922c(this.containerId, renderContext.containerId) && C9612q.m13922c(this.onTapLink, renderContext.onTapLink) && C9612q.m13922c(this.onLongTapLink, renderContext.onLongTapLink) && C9612q.m13922c(this.linkStyle, renderContext.linkStyle) && C9612q.m13922c(this.onTapChannel, renderContext.onTapChannel) && C9612q.m13922c(this.onLongPressChannel, renderContext.onLongPressChannel) && C9612q.m13922c(this.onTapMention, renderContext.onTapMention) && C9612q.m13922c(this.onTapCommand, renderContext.onTapCommand) && C9612q.m13922c(this.onLongPressCommand, renderContext.onLongPressCommand) && C9612q.m13922c(this.onTapSpoiler, renderContext.onTapSpoiler) && C9612q.m13922c(this.onTapTimestamp, renderContext.onTapTimestamp) && C9612q.m13922c(this.onTapEmoji, renderContext.onTapEmoji) && this.animateEmoji == renderContext.animateEmoji && this.shouldShowRoleDot == renderContext.shouldShowRoleDot && this.shouldShowRoleOnName == renderContext.shouldShowRoleOnName && this.singleLine == renderContext.singleLine && C9612q.m13922c(this.paint, renderContext.paint) && this.spoilerState == renderContext.spoilerState && this.listNestedLevel == renderContext.listNestedLevel && C9612q.m13922c(this.listOrderedIndex, renderContext.listOrderedIndex) && C9612q.m13922c(this.listLargestOrderedIndex, renderContext.listLargestOrderedIndex) && C9612q.m13922c(this.insets, renderContext.insets) && C9612q.m13922c(this.theme, renderContext.theme) && Float.compare(this.baselineHeight, renderContext.baselineHeight) == 0 && C9612q.m13922c(this.emojiSizeOverride, renderContext.emojiSizeOverride);
        }
        return false;
    }

    public final boolean getAnimateEmoji() {
        return this.animateEmoji;
    }

    public final float getBaselineHeight() {
        return this.baselineHeight;
    }

    public final String getContainerId() {
        return this.containerId;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Integer getEmojiSizeOverride() {
        return this.emojiSizeOverride;
    }

    public final Insets getInsets() {
        return this.insets;
    }

    public final Function1<LinkContentNode, LinkStyle> getLinkStyle() {
        return this.linkStyle;
    }

    public final Long getListLargestOrderedIndex() {
        return this.listLargestOrderedIndex;
    }

    public final int getListNestedLevel() {
        return this.listNestedLevel;
    }

    public final Long getListOrderedIndex() {
        return this.listOrderedIndex;
    }

    public final Function4<String, String, String, String, Unit> getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    public final Function1<CommandMentionContentNode, Unit> getOnLongPressCommand() {
        return this.onLongPressCommand;
    }

    public final Function1<LinkContentNode, Unit> getOnLongTapLink() {
        return this.onLongTapLink;
    }

    public final Function3<String, String, String, Unit> getOnTapChannel() {
        return this.onTapChannel;
    }

    public final Function1<CommandMentionContentNode, Unit> getOnTapCommand() {
        return this.onTapCommand;
    }

    public final Function1<EmojiContentNode, Unit> getOnTapEmoji() {
        return this.onTapEmoji;
    }

    public final Function1<LinkContentNode, Unit> getOnTapLink() {
        return this.onTapLink;
    }

    public final Function2<String, String, Unit> getOnTapMention() {
        return this.onTapMention;
    }

    public final Function0<Unit> getOnTapSpoiler() {
        return this.onTapSpoiler;
    }

    public final Function1<String, Unit> getOnTapTimestamp() {
        return this.onTapTimestamp;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final SpoilerState getSpoilerState() {
        return this.spoilerState;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.context.hashCode() * 31) + this.containerId.hashCode()) * 31) + this.onTapLink.hashCode()) * 31) + this.onLongTapLink.hashCode()) * 31) + this.linkStyle.hashCode()) * 31) + this.onTapChannel.hashCode()) * 31) + this.onLongPressChannel.hashCode()) * 31) + this.onTapMention.hashCode()) * 31) + this.onTapCommand.hashCode()) * 31) + this.onLongPressCommand.hashCode()) * 31) + this.onTapSpoiler.hashCode()) * 31) + this.onTapTimestamp.hashCode()) * 31) + this.onTapEmoji.hashCode()) * 31;
        boolean z = this.animateEmoji;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.shouldShowRoleDot;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.shouldShowRoleOnName;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.singleLine;
        int hashCode2 = (((((((i6 + (z4 ? 1 : z4 ? 1 : 0)) * 31) + this.paint.hashCode()) * 31) + this.spoilerState.hashCode()) * 31) + this.listNestedLevel) * 31;
        Long l = this.listOrderedIndex;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.listLargestOrderedIndex;
        int hashCode4 = (((((((hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.insets.hashCode()) * 31) + this.theme.hashCode()) * 31) + Float.floatToIntBits(this.baselineHeight)) * 31;
        Integer num = this.emojiSizeOverride;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final boolean spoilerExists() {
        return this.spoilerState != SpoilerState.None;
    }

    public final boolean spoilerIsHidden() {
        return this.spoilerState == SpoilerState.Hidden;
    }

    public final boolean spoilerIsRevealed() {
        return this.spoilerState == SpoilerState.Revealed;
    }

    public String toString() {
        Context context = this.context;
        String str = this.containerId;
        Function1<LinkContentNode, Unit> function1 = this.onTapLink;
        Function1<LinkContentNode, Unit> function12 = this.onLongTapLink;
        Function1<LinkContentNode, LinkStyle> function13 = this.linkStyle;
        Function3<String, String, String, Unit> function3 = this.onTapChannel;
        Function4<String, String, String, String, Unit> function4 = this.onLongPressChannel;
        Function2<String, String, Unit> function2 = this.onTapMention;
        Function1<CommandMentionContentNode, Unit> function14 = this.onTapCommand;
        Function1<CommandMentionContentNode, Unit> function15 = this.onLongPressCommand;
        Function0<Unit> function0 = this.onTapSpoiler;
        Function1<String, Unit> function16 = this.onTapTimestamp;
        Function1<EmojiContentNode, Unit> function17 = this.onTapEmoji;
        boolean z = this.animateEmoji;
        boolean z2 = this.shouldShowRoleDot;
        boolean z3 = this.shouldShowRoleOnName;
        boolean z4 = this.singleLine;
        Paint paint = this.paint;
        SpoilerState spoilerState = this.spoilerState;
        int i = this.listNestedLevel;
        Long l = this.listOrderedIndex;
        Long l2 = this.listLargestOrderedIndex;
        Insets insets = this.insets;
        DiscordTheme discordTheme = this.theme;
        float f = this.baselineHeight;
        Integer num = this.emojiSizeOverride;
        return "RenderContext(context=" + context + ", containerId=" + str + ", onTapLink=" + function1 + ", onLongTapLink=" + function12 + ", linkStyle=" + function13 + ", onTapChannel=" + function3 + ", onLongPressChannel=" + function4 + ", onTapMention=" + function2 + ", onTapCommand=" + function14 + ", onLongPressCommand=" + function15 + ", onTapSpoiler=" + function0 + ", onTapTimestamp=" + function16 + ", onTapEmoji=" + function17 + ", animateEmoji=" + z + ", shouldShowRoleDot=" + z2 + ", shouldShowRoleOnName=" + z3 + ", singleLine=" + z4 + ", paint=" + paint + ", spoilerState=" + spoilerState + ", listNestedLevel=" + i + ", listOrderedIndex=" + l + ", listLargestOrderedIndex=" + l2 + ", insets=" + insets + ", theme=" + discordTheme + ", baselineHeight=" + f + ", emojiSizeOverride=" + num + ")";
    }

    public final RenderContext updateInsets(Function1<? super Insets, Insets> update) {
        C9612q.m13917h(update, "update");
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, null, update.invoke(this.insets), null, 0.0f, null, 62914559, null);
    }

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "", ViewProps.TOP, "", ViewProps.BOTTOM, ViewProps.START, ViewProps.END, "(IIII)V", "getBottom", "()I", "getEnd", "getStart", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Insets {
        private final int bottom;
        private final int end;
        private final int start;
        private final int top;

        public Insets() {
            this(0, 0, 0, 0, 15, null);
        }

        public Insets(int i, int i2, int i3, int i4) {
            this.top = i;
            this.bottom = i2;
            this.start = i3;
            this.end = i4;
        }

        public static /* synthetic */ Insets copy$default(Insets insets, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = insets.top;
            }
            if ((i5 & 2) != 0) {
                i2 = insets.bottom;
            }
            if ((i5 & 4) != 0) {
                i3 = insets.start;
            }
            if ((i5 & 8) != 0) {
                i4 = insets.end;
            }
            return insets.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.top;
        }

        public final int component2() {
            return this.bottom;
        }

        public final int component3() {
            return this.start;
        }

        public final int component4() {
            return this.end;
        }

        public final Insets copy(int i, int i2, int i3, int i4) {
            return new Insets(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Insets) {
                Insets insets = (Insets) obj;
                return this.top == insets.top && this.bottom == insets.bottom && this.start == insets.start && this.end == insets.end;
            }
            return false;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return (((((this.top * 31) + this.bottom) * 31) + this.start) * 31) + this.end;
        }

        public String toString() {
            int i = this.top;
            int i2 = this.bottom;
            int i3 = this.start;
            int i4 = this.end;
            return "Insets(top=" + i + ", bottom=" + i2 + ", start=" + i3 + ", end=" + i4 + ")";
        }

        public /* synthetic */ Insets(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
        }
    }

    public /* synthetic */ RenderContext(Context context, String str, Function1 function1, Function1 function12, Function1 function13, Function3 function3, Function4 function4, Function2 function2, Function1 function14, Function1 function15, Function0 function0, Function1 function16, Function1 function17, boolean z, boolean z2, boolean z3, boolean z4, Paint paint, SpoilerState spoilerState, int i, Long l, Long l2, Insets insets, DiscordTheme discordTheme, float f, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function1, function12, function13, function3, function4, function2, function14, function15, function0, function16, function17, z, z2, z3, z4, paint, (i2 & 262144) != 0 ? SpoilerState.None : spoilerState, (i2 & 524288) != 0 ? 0 : i, (i2 & 1048576) != 0 ? null : l, (i2 & 2097152) != 0 ? null : l2, (i2 & 4194304) != 0 ? new Insets(0, 0, 0, 0, 15, null) : insets, discordTheme, (i2 & 16777216) != 0 ? -1.0f : f, (i2 & 33554432) != 0 ? null : num);
    }
}
