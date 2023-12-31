package com.discord.chat.presentation.media;

import com.discord.primitives.MessageId;
import com.discord.recycler_view.ids.IdUtilsKt;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/presentation/media/PortalUiModel;", "", "index", "", "getIndex", "()I", "messageId", "Lcom/discord/primitives/MessageId;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "portal", "", "getPortal", "()D", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface PortalUiModel {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class DefaultImpls {
        public static double getPortal(PortalUiModel portalUiModel) {
            String m42079toStringimpl = MessageId.m42079toStringimpl(portalUiModel.m41631getMessageId3Eiw7ao());
            String simpleName = portalUiModel.getClass().getSimpleName();
            int index = portalUiModel.getIndex();
            return IdUtilsKt.convertToId(m42079toStringimpl + "_" + simpleName + "_" + index);
        }
    }

    int getIndex();

    /* renamed from: getMessageId-3Eiw7ao */
    String m41631getMessageId3Eiw7ao();

    double getPortal();
}