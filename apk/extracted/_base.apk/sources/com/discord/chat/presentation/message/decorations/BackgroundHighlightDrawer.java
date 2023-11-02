package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.presentation.list.item.ChatListItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/chat/presentation/message/decorations/BackgroundHighlightDrawer;", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BackgroundHighlightDrawer extends HighlightedMessageDrawer {

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C29751 extends AbstractC9614s implements Function1<ChatListItem, Integer> {
        public static final C29751 INSTANCE = new C29751();

        C29751() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            C9612q.m13917h(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            if (backgroundHighlight != null) {
                return backgroundHighlight.getBackgroundColor();
            }
            return null;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C29762 extends AbstractC9614s implements Function1<ChatListItem, Integer> {
        public static final C29762 INSTANCE = new C29762();

        C29762() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            C9612q.m13917h(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            if (backgroundHighlight != null) {
                return backgroundHighlight.getGutterColor();
            }
            return null;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "invoke", "(Lcom/discord/chat/presentation/list/item/ChatListItem;)Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer$3 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C29773 extends AbstractC9614s implements Function1<ChatListItem, Boolean> {
        public static final C29773 INSTANCE = new C29773();

        C29773() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ChatListItem it) {
            BackgroundHighlight backgroundHighlight;
            C9612q.m13917h(it, "it");
            backgroundHighlight = BackgroundHighlightDecorationKt.getBackgroundHighlight(it);
            return Boolean.valueOf(backgroundHighlight != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundHighlightDrawer(Context context) {
        super(context, C29751.INSTANCE, C29762.INSTANCE, C29773.INSTANCE);
        C9612q.m13917h(context, "context");
    }
}
