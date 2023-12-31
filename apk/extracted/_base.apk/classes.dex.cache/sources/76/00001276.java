package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.databinding.ConnectionsRoleTagViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J?\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ConnectionsRoleTagViewBinding;", "configureConnectionsRoleTag", "", "userId", "Lcom/discord/primitives/UserId;", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", "connectionsRoleTag", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureConnectionsRoleTag-uESh2Cg", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ConnectionsRoleTagView extends FrameLayout {
    private final ConnectionsRoleTagViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsRoleTagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(attrs, "attrs");
        ConnectionsRoleTagViewBinding inflate = ConnectionsRoleTagViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.connectionsRoleTagContainer.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
        inflate.roleName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView textView = inflate.roleName;
        C9612q.m13918g(textView, "binding.roleName");
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        TextView textView2 = inflate.roleName;
        C9612q.m13918g(textView2, "binding.roleName");
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryBold);
    }

    public static final void configureConnectionsRoleTag_uESh2Cg$lambda$0(ChatEventHandler eventHandler, UserId userId, GuildId guildId, ChannelId channelId, ConnectionsRoleTag connectionsRoleTag, View view) {
        C9612q.m13917h(eventHandler, "$eventHandler");
        C9612q.m13917h(connectionsRoleTag, "$connectionsRoleTag");
        eventHandler.onTapConnectionsRoleTag(UserId.m42118toStringimpl(userId.m42120unboximpl()), GuildId.m42067toStringimpl(guildId.m42069unboximpl()), ChannelId.m42054toStringimpl(channelId.m42056unboximpl()), connectionsRoleTag.getId());
    }

    /* renamed from: configureConnectionsRoleTag-uESh2Cg */
    public final void m41632configureConnectionsRoleTaguESh2Cg(final UserId userId, final GuildId guildId, final ChannelId channelId, final ConnectionsRoleTag connectionsRoleTag, final ChatEventHandler eventHandler) {
        C9612q.m13917h(connectionsRoleTag, "connectionsRoleTag");
        C9612q.m13917h(eventHandler, "eventHandler");
        ImageView imageView = this.binding.verifiedCheckIconBackground;
        C9612q.m13918g(imageView, "binding.verifiedCheckIconBackground");
        ColorUtilsKt.setTintColor(imageView, Integer.valueOf(connectionsRoleTag.getBackgroundColor()));
        ImageView imageView2 = this.binding.verifiedCheckIcon;
        C9612q.m13918g(imageView2, "binding.verifiedCheckIcon");
        ColorUtilsKt.setTintColor(imageView2, Integer.valueOf(connectionsRoleTag.getIconColor()));
        this.binding.roleName.setText(connectionsRoleTag.getName());
        if (userId != null && guildId != null && channelId != null) {
            CardView cardView = this.binding.connectionsRoleTagContainer;
            C9612q.m13918g(cardView, "binding.connectionsRoleTagContainer");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(cardView, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConnectionsRoleTagView.configureConnectionsRoleTag_uESh2Cg$lambda$0(ChatEventHandler.this, userId, guildId, channelId, connectionsRoleTag, view);
                }
            }, 1, null);
        }
    }
}