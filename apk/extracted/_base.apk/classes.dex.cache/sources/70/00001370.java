package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.GuildInviteDisabledViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J*\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u001dJ\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011J\u0017\u0010!\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000e\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildInviteDisabledViewBinding;", "setBackgroundRectangleColor", "", ViewProps.COLOR, "(Ljava/lang/Integer;)V", "setGuildImage", "url", "", "thumbnailText", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setHeaderColor", "setHeaderText", "headerText", "", "setHelpIcon", "label", "helpArticleLink", "onHelpArticleClicked", "Lkotlin/Function1;", "setSubtitle", "subtitle", "guildName", "setSubtitleColor", "setTitleColor", "setTitleText", ZeroconfModule.KEY_SERVICE_NAME, "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildInviteDisabledView extends ConstraintLayout {
    private final GuildInviteDisabledViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ GuildInviteDisabledView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final void setHelpIcon$lambda$5$lambda$4(Function1 onHelpArticleClicked, String helpArticleLink, View view) {
        C9612q.m13917h(onHelpArticleClicked, "$onHelpArticleClicked");
        C9612q.m13917h(helpArticleLink, "$helpArticleLink");
        onHelpArticleClicked.invoke(helpArticleLink);
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

    public final void setGuildImage(String str, String str2, Integer num) {
        this.binding.itemInviteImage.configure(str, str2, num);
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteDisabledIcon;
        C9612q.m13918g(simpleDraweeView, "binding.itemInviteDisabledIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.InvitesDisabled);
    }

    public final void setHeaderColor(Integer num) {
        this.binding.itemInviteHeader.setTextColor(num != null ? num.intValue() : ThemeManagerKt.getTheme().getInteractiveNormal());
    }

    public final void setHeaderText(CharSequence headerText) {
        C9612q.m13917h(headerText, "headerText");
        this.binding.itemInviteHeader.setText(headerText);
    }

    public final void setHelpIcon(String label, final String helpArticleLink, final Function1<? super String, Unit> onHelpArticleClicked) {
        C9612q.m13917h(label, "label");
        C9612q.m13917h(helpArticleLink, "helpArticleLink");
        C9612q.m13917h(onHelpArticleClicked, "onHelpArticleClicked");
        SimpleDraweeView simpleDraweeView = this.binding.itemInviteHelpIcon;
        simpleDraweeView.setContentDescription(label);
        simpleDraweeView.setOnClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuildInviteDisabledView.setHelpIcon$lambda$5$lambda$4(Function1.this, helpArticleLink, view);
            }
        });
    }

    public final void setSubtitle(String subtitle, String guildName) {
        C9612q.m13917h(subtitle, "subtitle");
        C9612q.m13917h(guildName, "guildName");
        DraweeSpanStringBuilder draweeSpanStringBuilder = new DraweeSpanStringBuilder(subtitle);
        draweeSpanStringBuilder.append((CharSequence) guildName);
        draweeSpanStringBuilder.setSpan(new StyleSpan(1), subtitle.length(), draweeSpanStringBuilder.length(), 33);
        this.binding.itemInviteSubtitle.setText(draweeSpanStringBuilder);
    }

    public final void setSubtitleColor(Integer num) {
        this.binding.itemInviteSubtitle.setTextColor(num != null ? num.intValue() : ThemeManagerKt.getTheme().getTextNormal());
    }

    public final void setTitleColor(Integer num) {
        this.binding.itemInviteTitle.setTextColor(num != null ? num.intValue() : ThemeManagerKt.getTheme().getHeaderPrimary());
    }

    public final void setTitleText(CharSequence name) {
        C9612q.m13917h(name, "name");
        this.binding.itemInviteTitle.setText(name);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        GuildInviteDisabledViewBinding inflate = GuildInviteDisabledViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.itemInviteHeader;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 11.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryBold);
        SimpleDraweeView _init_$lambda$1 = inflate.itemInviteHelpIcon;
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$1, ReactAsset.Help);
        ColorUtilsKt.setTintColor(_init_$lambda$1, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        TextView _init_$lambda$2 = inflate.itemInviteTitle;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9612q.m13918g(_init_$lambda$2, "_init_$lambda$2");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, DiscordFont.PrimaryMedium);
        SimpleDraweeSpanTextView _init_$lambda$3 = inflate.itemInviteSubtitle;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, DiscordFont.PrimaryNormal);
    }
}