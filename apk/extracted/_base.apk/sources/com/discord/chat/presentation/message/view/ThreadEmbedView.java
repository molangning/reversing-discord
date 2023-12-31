package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.ThreadEmbedViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014J*\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012J\u0010\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/ThreadEmbedViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ThreadEmbedViewBinding;", "getLeadingMarginSpan", "Landroid/text/style/LeadingMarginSpan;", "setArchived", "", "archived", "", "iconUrl", "", "setLabel", "label", "setMessage", "imageUrl", "username", "message", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "italicizeMessage", "setTitle", "title", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ThreadEmbedView extends ConstraintLayout {
    private final ThreadEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ThreadEmbedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final LeadingMarginSpan getLeadingMarginSpan() {
        this.binding.threadEmbedMostRecentMessageHeader.measure(0, 0);
        return new LeadingMarginSpan.Standard(this.binding.threadEmbedMostRecentMessageHeader.getMeasuredWidth(), 0);
    }

    public static /* synthetic */ void setArchived$default(ThreadEmbedView threadEmbedView, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        threadEmbedView.setArchived(z, str);
    }

    public final ThreadEmbedViewBinding getBinding() {
        return this.binding;
    }

    public final void setArchived(boolean z, String str) {
        int i;
        SimpleDraweeView simpleDraweeView = this.binding.threadEmbedIcon;
        C9612q.m13918g(simpleDraweeView, "binding.threadEmbedIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, str);
        SimpleDraweeView simpleDraweeView2 = this.binding.threadEmbedIcon;
        C9612q.m13918g(simpleDraweeView2, "binding.threadEmbedIcon");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        simpleDraweeView2.setVisibility(i);
    }

    public final void setLabel(String label) {
        C9612q.m13917h(label, "label");
        TextView textView = this.binding.threadEmbedMessagesCount;
        C9612q.m13918g(textView, "binding.threadEmbedMessagesCount");
        ViewUtilsKt.setOptionalText(textView, label);
    }

    public final void setMessage(String str, String str2, DraweeSpanStringBuilder message, boolean z) {
        boolean z2;
        int i;
        DiscordFont discordFont;
        C9612q.m13917h(message, "message");
        TextView textView = this.binding.threadEmbedMostRecentMessageName;
        C9612q.m13918g(textView, "binding.threadEmbedMostRecentMessageName");
        ViewUtilsKt.setOptionalText(textView, str2);
        this.binding.threadEmbedMostRecentMessageAvatar.setImageURI(str);
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinearLayout linearLayout = this.binding.threadEmbedMostRecentMessageHeader;
        C9612q.m13918g(linearLayout, "binding.threadEmbedMostRecentMessageHeader");
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.threadEmbedMostRecentMessageContent;
        C9612q.m13918g(simpleDraweeSpanTextView, "binding.threadEmbedMostRecentMessageContent");
        if (z) {
            discordFont = DiscordFont.PrimaryNormalItalic;
        } else {
            discordFont = DiscordFont.PrimaryMedium;
        }
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont);
        if (z2) {
            message.setSpan(getLeadingMarginSpan(), 0, message.length(), 33);
        }
        SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = this.binding.threadEmbedMostRecentMessageContent;
        C9612q.m13918g(simpleDraweeSpanTextView2, "binding.threadEmbedMostRecentMessageContent");
        SpannableExtensionsKt.coverWithSpan(message, new BackgroundSpanDrawer(simpleDraweeSpanTextView2));
        this.binding.threadEmbedMostRecentMessageContent.setDraweeSpanStringBuilder(message);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.binding.threadEmbedName;
        C9612q.m13918g(textView, "binding.threadEmbedName");
        ViewUtilsKt.setOptionalText(textView, charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        ThreadEmbedViewBinding inflate = ThreadEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView _init_$lambda$0 = inflate.threadEmbedName;
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        DiscordFont discordFont = DiscordFont.PrimaryBold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 14.0f);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView _init_$lambda$1 = inflate.threadEmbedMessagesCount;
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        TextView _init_$lambda$2 = inflate.threadEmbedMostRecentMessageName;
        C9612q.m13918g(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 14.0f);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        SimpleDraweeSpanTextView _init_$lambda$3 = inflate.threadEmbedMostRecentMessageContent;
        C9612q.m13918g(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 14.0f);
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBgBaseSecondary()));
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, -1, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        RippleUtilsKt.addRipple(this, true, SizeUtilsKt.getDpToPx(4));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
    }
}
