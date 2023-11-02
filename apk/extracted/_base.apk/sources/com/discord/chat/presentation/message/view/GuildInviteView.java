package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.GuildInviteViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ+\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001e\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$J\u001a\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0012J\u0010\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0012J\u0017\u0010*\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0016J\u0019\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/GuildInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildInviteViewBinding;", "setBackgroundRectangleColor", "", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "setButtonBackgroundColor", "setButtonText", "text", "", "setButtonTextColor", "setGuildImage", "url", "", "thumbnailText", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setHeaderColor", "(Ljava/lang/Integer;)Lkotlin/Unit;", "setHeaderText", "headerText", "setInviteSplash", "setLoading", "loading", "", "setOnButtonClickListener", "listener", "Landroid/view/View$OnClickListener;", "setPresence", "onlineText", "memberText", "setSubtitle", "subtitle", "setSubtitleColor", "setSubtitleIcon", "subtitleIconUrl", "setTitleColor", "setTitleText", ZeroconfModule.KEY_SERVICE_NAME, "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildInviteView extends ConstraintLayout {
    private final GuildInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ GuildInviteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setBackgroundRectangleColor(Integer num) {
        int colorCompat;
        if (num != null) {
            colorCompat = num.intValue();
        } else {
            Context context = getContext();
            C9612q.m13918g(context, "context");
            colorCompat = ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(C2912R.color.primary_100, C2912R.color.primary_630));
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, colorCompat, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }

    public final void setButtonBackgroundColor(Integer num) {
        this.binding.itemInviteJoinedButton.setBackgroundColor(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setButtonText(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r4.binding
            com.discord.core.DCDButton r0 = r0.itemInviteJoinedButton
            java.lang.String r1 = "binding.itemInviteJoinedButton"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L16
            boolean r3 = kotlin.text.C9642f.m13789w(r5)
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            r2 = r2 ^ r3
            if (r2 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r0.setVisibility(r1)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r4.binding
            com.discord.core.DCDButton r0 = r0.itemInviteJoinedButton
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildInviteView.setButtonText(java.lang.CharSequence):void");
    }

    public final void setButtonTextColor(Integer num) {
        this.binding.itemInviteJoinedButton.setTextColor(num);
    }

    public final void setGuildImage(String str, String str2, Integer num) {
        this.binding.itemInviteImage.configure(str, str2, num);
    }

    public final Unit setHeaderColor(Integer num) {
        if (num != null) {
            this.binding.itemInviteHeader.setTextColor(num.intValue());
            return Unit.f25302a;
        }
        return null;
    }

    public final void setHeaderText(CharSequence charSequence) {
        boolean z;
        TextView textView = this.binding.itemInviteHeader;
        C9612q.m13918g(textView, "binding.itemInviteHeader");
        int i = 0;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(true ^ z)) {
            i = 8;
        }
        textView.setVisibility(i);
        this.binding.itemInviteHeader.setText(charSequence);
    }

    public final void setInviteSplash(String str) {
        boolean z;
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSplash;
        C9612q.m13918g(simpleDraweeView, "binding.itemInviteSplash");
        int i = 0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(true ^ z)) {
            i = 8;
        }
        simpleDraweeView.setVisibility(i);
        this.binding.itemInviteSplash.setImageURI(str);
    }

    public final void setLoading(boolean z) {
        this.binding.itemInviteJoinedButton.setLoading(z);
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        this.binding.itemInviteJoinedButton.setOnClickButtonListener(onClickListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPresence(java.lang.CharSequence r9, java.lang.CharSequence r10) {
        /*
            r8 = this;
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteOnlineDot
            java.lang.String r1 = "binding.itemInviteOnlineDot"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L16
            boolean r4 = kotlin.text.C9642f.m13789w(r9)
            if (r4 == 0) goto L14
            goto L16
        L14:
            r4 = r3
            goto L17
        L16:
            r4 = r2
        L17:
            r4 = r4 ^ r2
            r5 = 8
            if (r4 == 0) goto L1e
            r4 = r3
            goto L1f
        L1e:
            r4 = r5
        L1f:
            r0.setVisibility(r4)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteOnlineDot
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            int r1 = com.discord.chat.C2912R.color.green_360
            int r1 = com.discord.theme.utils.ColorUtilsKt.getColorCompat(r8, r1)
            r4 = 2
            r6 = 0
            com.discord.misc.utilities.view.ViewBackgroundUtilsKt.setBackgroundOval$default(r0, r1, r3, r4, r6)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.TextView r0 = r0.itemInviteOnlineText
            r0.setText(r9)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteTotalMemberDot
            java.lang.String r1 = "binding.itemInviteTotalMemberDot"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            if (r10 == 0) goto L4f
            boolean r7 = kotlin.text.C9642f.m13789w(r10)
            if (r7 == 0) goto L4d
            goto L4f
        L4d:
            r7 = r3
            goto L50
        L4f:
            r7 = r2
        L50:
            r7 = r7 ^ r2
            if (r7 == 0) goto L55
            r7 = r3
            goto L56
        L55:
            r7 = r5
        L56:
            r0.setVisibility(r7)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.ImageView r0 = r0.itemInviteTotalMemberDot
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            int r1 = com.discord.chat.C2912R.color.primary_500
            int r1 = com.discord.theme.utils.ColorUtilsKt.getColorCompat(r8, r1)
            com.discord.misc.utilities.view.ViewBackgroundUtilsKt.setBackgroundOval$default(r0, r1, r3, r4, r6)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.TextView r0 = r0.itemInviteTotalMemberText
            r0.setText(r10)
            com.discord.chat.databinding.GuildInviteViewBinding r0 = r8.binding
            android.widget.LinearLayout r0 = r0.itemInviteMemberContainer
            java.lang.String r1 = "binding.itemInviteMemberContainer"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            if (r9 == 0) goto L84
            boolean r9 = kotlin.text.C9642f.m13789w(r9)
            if (r9 == 0) goto L82
            goto L84
        L82:
            r9 = r3
            goto L85
        L84:
            r9 = r2
        L85:
            if (r9 == 0) goto L97
            if (r10 == 0) goto L92
            boolean r9 = kotlin.text.C9642f.m13789w(r10)
            if (r9 == 0) goto L90
            goto L92
        L90:
            r9 = r3
            goto L93
        L92:
            r9 = r2
        L93:
            if (r9 != 0) goto L96
            goto L97
        L96:
            r2 = r3
        L97:
            if (r2 == 0) goto L9a
            goto L9b
        L9a:
            r3 = r5
        L9b:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildInviteView.setPresence(java.lang.CharSequence, java.lang.CharSequence):void");
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.binding.itemInviteSubtitle;
        C9612q.m13918g(textView, "binding.itemInviteSubtitle");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    public final void setSubtitleColor(Integer num) {
        if (num != null) {
            this.binding.itemInviteSubtitle.setTextColor(num.intValue());
        }
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteSubtitleIcon;
        C9612q.m13918g(simpleDraweeView, "binding.itemInviteSubtitleIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView, num);
    }

    public final void setSubtitleIcon(String str) {
        SimpleDraweeView setSubtitleIcon$lambda$9 = this.binding.itemInviteSubtitleIcon;
        C9612q.m13918g(setSubtitleIcon$lambda$9, "setSubtitleIcon$lambda$9");
        ReactAssetUtilsKt.setOptionalReactImageUrl(setSubtitleIcon$lambda$9, str);
    }

    public final Unit setTitleColor(Integer num) {
        if (num != null) {
            this.binding.itemInviteTitle.setTextColor(num.intValue());
            return Unit.f25302a;
        }
        return null;
    }

    public final void setTitleText(CharSequence charSequence) {
        this.binding.itemInviteTitle.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        GuildInviteViewBinding inflate = GuildInviteViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$6$lambda$0 = inflate.itemInviteHeader;
        lambda$6$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9612q.m13918g(lambda$6$lambda$0, "lambda$6$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$0, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$0, DiscordFont.PrimaryBold);
        TextView lambda$6$lambda$1 = inflate.itemInviteTitle;
        lambda$6$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9612q.m13918g(lambda$6$lambda$1, "lambda$6$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$1, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$1, discordFont);
        TextView lambda$6$lambda$2 = inflate.itemInviteSubtitle;
        lambda$6$lambda$2.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9612q.m13918g(lambda$6$lambda$2, "lambda$6$lambda$2");
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$2, discordFont2);
        TextView lambda$6$lambda$3 = inflate.itemInviteOnlineText;
        lambda$6$lambda$3.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9612q.m13918g(lambda$6$lambda$3, "lambda$6$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$3, discordFont);
        TextView lambda$6$lambda$4 = inflate.itemInviteTotalMemberText;
        lambda$6$lambda$4.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9612q.m13918g(lambda$6$lambda$4, "lambda$6$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$4, discordFont);
        TextView lambda$6$lambda$5 = inflate.itemInviteHubLink;
        lambda$6$lambda$5.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9612q.m13918g(lambda$6$lambda$5, "lambda$6$lambda$5");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$5, discordFont2);
        inflate.itemInviteJoinedButton.setBackgroundColor(ColorUtilsKt.getColorCompat(context, C2912R.color.brand));
    }
}
