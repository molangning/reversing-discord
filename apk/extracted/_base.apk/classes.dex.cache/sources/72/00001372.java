package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.GuildViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ-\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/GuildView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildViewBinding;", "boundIconUrl", "", "boundShortGuildName", "configure", "", "iconUrl", "shortGuildName", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildView extends FrameLayout {
    private final GuildViewBinding binding;
    private String boundIconUrl;
    private String boundShortGuildName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ GuildView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void configure$default(GuildView guildView, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        guildView.configure(str, str2, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void configure(java.lang.String r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            r5 = this;
            java.lang.String r0 = r5.boundIconUrl
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r6)
            if (r0 == 0) goto L11
            java.lang.String r0 = r5.boundShortGuildName
            boolean r0 = kotlin.jvm.internal.C9612q.m13922c(r0, r7)
            if (r0 == 0) goto L11
            return
        L11:
            r5.boundIconUrl = r6
            r5.boundShortGuildName = r7
            r0 = 0
            if (r6 == 0) goto L21
            boolean r1 = kotlin.text.C9642f.m13789w(r6)
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = r0
            goto L22
        L21:
            r1 = 1
        L22:
            r2 = 8
            java.lang.String r3 = "binding.guildText"
            java.lang.String r4 = "binding.guildAvatar"
            if (r1 == 0) goto L5f
            com.discord.chat.databinding.GuildViewBinding r6 = r5.binding
            com.facebook.drawee.view.SimpleDraweeView r6 = r6.guildAvatar
            kotlin.jvm.internal.C9612q.m13918g(r6, r4)
            r6.setVisibility(r2)
            com.discord.chat.databinding.GuildViewBinding r6 = r5.binding
            android.widget.TextView r6 = r6.guildText
            kotlin.jvm.internal.C9612q.m13918g(r6, r3)
            r6.setVisibility(r0)
            com.discord.chat.databinding.GuildViewBinding r6 = r5.binding
            android.widget.TextView r6 = r6.guildText
            r6.setText(r7)
            if (r8 == 0) goto L4c
            int r6 = r8.intValue()
            goto L5b
        L4c:
            android.content.Context r6 = r5.getContext()
            java.lang.String r7 = "context"
            kotlin.jvm.internal.C9612q.m13918g(r6, r7)
            int r7 = com.discord.chat.C2912R.color.brand
            int r6 = com.discord.theme.utils.ColorUtilsKt.getColorCompat(r6, r7)
        L5b:
            r5.setBackgroundColor(r6)
            goto L83
        L5f:
            com.discord.chat.databinding.GuildViewBinding r7 = r5.binding
            com.facebook.drawee.view.SimpleDraweeView r7 = r7.guildAvatar
            kotlin.jvm.internal.C9612q.m13918g(r7, r4)
            r7.setVisibility(r0)
            com.discord.chat.databinding.GuildViewBinding r7 = r5.binding
            android.widget.TextView r7 = r7.guildText
            kotlin.jvm.internal.C9612q.m13918g(r7, r3)
            r7.setVisibility(r2)
            com.discord.chat.databinding.GuildViewBinding r7 = r5.binding
            com.facebook.drawee.view.SimpleDraweeView r7 = r7.guildAvatar
            r7.setImageURI(r6)
            if (r8 == 0) goto L80
            int r0 = r8.intValue()
        L80:
            r5.setBackgroundColor(r0)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildView.configure(java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        GuildViewBinding inflate = GuildViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        View root = inflate.getRoot();
        C9612q.m13918g(root, "binding.root");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(16));
        TextView _init_$lambda$0 = inflate.guildText;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryNormal);
    }
}