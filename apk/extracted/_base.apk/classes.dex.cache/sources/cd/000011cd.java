package com.discord.chat.presentation.deserializationerror;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0946a;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.DeserializationErrorViewBinding;
import com.discord.chat.presentation.deserializationerror.DeserializationErrorView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/presentation/deserializationerror/DeserializationErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/DeserializationErrorViewBinding;", "configure", "", "json", "", "causeMessage", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeserializationErrorView extends LinearLayout {
    private final DeserializationErrorViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ DeserializationErrorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void configure$lambda$0(DeserializationErrorView this$0, String json, View view) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(json, "$json");
        Object m38395i = C0946a.m38395i(this$0.getContext(), ClipboardManager.class);
        C9612q.m13920e(m38395i);
        ((ClipboardManager) m38395i).setPrimaryClip(ClipData.newPlainText("Error JSON", json));
        Toast.makeText(this$0.getContext(), "Copied error json to clipboard", 0).show();
    }

    public final void configure(final String json, String causeMessage) {
        C9612q.m13917h(json, "json");
        C9612q.m13917h(causeMessage, "causeMessage");
        this.binding.json.setText(json);
        this.binding.exception.setText(causeMessage);
        Button button = this.binding.copyButton;
        C9612q.m13918g(button, "binding.copyButton");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button, false, new View.OnClickListener() { // from class: c2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeserializationErrorView.configure$lambda$0(DeserializationErrorView.this, json, view);
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        DeserializationErrorViewBinding inflate = DeserializationErrorViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.json.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView = inflate.json;
        C9612q.m13918g(textView, "binding.json");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        inflate.exception.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        TextView textView2 = inflate.exception;
        C9612q.m13918g(textView2, "binding.exception");
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        inflate.causeHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
        TextView textView3 = inflate.causeHeader;
        C9612q.m13918g(textView3, "binding.causeHeader");
        SetTextSizeSpKt.setTextSizeSp(textView3, 24.0f);
        TextView textView4 = inflate.causeHeader;
        C9612q.m13918g(textView4, "binding.causeHeader");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
        inflate.jsonHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
        TextView textView5 = inflate.jsonHeader;
        C9612q.m13918g(textView5, "binding.jsonHeader");
        SetTextSizeSpKt.setTextSizeSp(textView5, 24.0f);
        TextView textView6 = inflate.jsonHeader;
        C9612q.m13918g(textView6, "binding.jsonHeader");
        DiscordFontUtilsKt.setDiscordFont(textView6, discordFont2);
        TextView textView7 = inflate.header;
        C9612q.m13918g(textView7, "binding.header");
        DiscordFontUtilsKt.setDiscordFont(textView7, discordFont);
        TextView textView8 = inflate.header;
        C9612q.m13918g(textView8, "binding.header");
        SetTextSizeSpKt.setTextSizeSp(textView8, 24.0f);
        Button button = inflate.copyButton;
        C9612q.m13918g(button, "binding.copyButton");
        DiscordFontUtilsKt.setDiscordFont(button, discordFont);
        setOrientation(1);
    }
}