package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.view.InfoLinkView;
import com.discord.react_asset_fetcher.ReactAsset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/InfoLinkViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/InfoLinkView;", "(Lcom/discord/chat/presentation/message/view/InfoLinkView;)V", "bind", "", "text", "", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "onInfoLinkClicked", "Lkotlin/Function0;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class InfoLinkViewHolder extends MessagePartViewHolder {
    private final InfoLinkView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoLinkViewHolder(InfoLinkView view) {
        super(view, null);
        C9612q.m13917h(view, "view");
        this.view = view;
    }

    public final void bind(String text, ReactAsset icon, Function0<Unit> onInfoLinkClicked) {
        C9612q.m13917h(text, "text");
        C9612q.m13917h(icon, "icon");
        C9612q.m13917h(onInfoLinkClicked, "onInfoLinkClicked");
        this.view.configure(text, icon, onInfoLinkClicked);
    }
}