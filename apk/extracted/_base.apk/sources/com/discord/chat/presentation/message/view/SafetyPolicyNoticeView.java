package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.SafetyPolicyNoticeBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J,\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\fH\u0002JB\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "titleText", "", "setTitle", "subtitle", "setSubtitle", "description", "setDescription", "ctaText", "classificationId", "Lkotlin/Function1;", "callback", "setCta", "title", "onTapEmbed", "setContent", "Lcom/discord/chat/databinding/SafetyPolicyNoticeBinding;", "binding", "Lcom/discord/chat/databinding/SafetyPolicyNoticeBinding;", "getBinding", "()Lcom/discord/chat/databinding/SafetyPolicyNoticeBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SafetyPolicyNoticeView extends ConstraintLayout {
    private final SafetyPolicyNoticeBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafetyPolicyNoticeView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ SafetyPolicyNoticeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void setCta(String str, final String str2, final Function1<? super String, Unit> function1) {
        LinearLayout linearLayout = this.binding.footer;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SafetyPolicyNoticeView.setCta$lambda$6$lambda$5(Function1.this, str2, view);
            }
        });
        linearLayout.setBackgroundColor(ThemeManagerKt.getTheme().getStatusDanger());
        TextView setCta$lambda$7 = this.binding.learnMore;
        setCta$lambda$7.setText(str);
        setCta$lambda$7.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(setCta$lambda$7, "setCta$lambda$7");
        DiscordFontUtilsKt.setDiscordFont(setCta$lambda$7, DiscordFont.PrimaryMedium);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCta$lambda$6$lambda$5(Function1 callback, String classificationId, View view) {
        C9612q.m13917h(callback, "$callback");
        C9612q.m13917h(classificationId, "$classificationId");
        callback.invoke(classificationId);
    }

    private final void setDescription(String str) {
        TextView setDescription$lambda$4 = this.binding.description;
        setDescription$lambda$4.setText(str);
        setDescription$lambda$4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        C9612q.m13918g(setDescription$lambda$4, "setDescription$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(setDescription$lambda$4, DiscordFont.PrimaryMedium);
    }

    private final void setSubtitle(String str) {
        TextView setSubtitle$lambda$3 = this.binding.subtitleText;
        setSubtitle$lambda$3.setText(str);
        setSubtitle$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(setSubtitle$lambda$3, "setSubtitle$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(setSubtitle$lambda$3, DiscordFont.PrimaryMedium);
    }

    private final void setTitle(String str) {
        TextView setTitle$lambda$2 = this.binding.title;
        setTitle$lambda$2.setText(str);
        setTitle$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(setTitle$lambda$2, "setTitle$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(setTitle$lambda$2, DiscordFont.PrimaryMedium);
    }

    public final SafetyPolicyNoticeBinding getBinding() {
        return this.binding;
    }

    public final void setContent(String title, String subtitle, String description, String ctaText, String classificationId, Function1<? super String, Unit> onTapEmbed) {
        C9612q.m13917h(title, "title");
        C9612q.m13917h(subtitle, "subtitle");
        C9612q.m13917h(description, "description");
        C9612q.m13917h(ctaText, "ctaText");
        C9612q.m13917h(classificationId, "classificationId");
        C9612q.m13917h(onTapEmbed, "onTapEmbed");
        setTitle(title);
        setSubtitle(subtitle);
        setDescription(description);
        setCta(ctaText, classificationId, onTapEmbed);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPolicyNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        SafetyPolicyNoticeBinding inflate = SafetyPolicyNoticeBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        View _init_$lambda$0 = inflate.getRoot();
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(8));
        SimpleDraweeView _init_$lambda$1 = inflate.icon;
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        ReactAssetUtilsKt.setReactAsset(_init_$lambda$1, ReactAsset.WarningTriangle);
        ColorUtilsKt.setTintColor(_init_$lambda$1, Integer.valueOf(ThemeManagerKt.getTheme().getStatusDanger()));
    }
}
