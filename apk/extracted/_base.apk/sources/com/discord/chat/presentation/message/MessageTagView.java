package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.C2912R;
import com.discord.chat.databinding.MessageTagViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react.utilities.ReactColorToAndroidColorKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p071e.C6029a;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Jg\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/chat/presentation/message/MessageTagView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageTagViewBinding;", "configureTagView", "", "tagText", "", "isVerifiedBot", "", "tagTextColor", "", "tagBackgroundColor", "opTagText", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "tagType", "configureTagView-e-CJZyo", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;JLjava/lang/String;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageTagView extends FrameLayout {
    private final MessageTagViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageTagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(attrs, "attrs");
        MessageTagViewBinding inflate = MessageTagViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView textView = inflate.tag;
        C9612q.m13918g(textView, "binding.tag");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        SimpleDraweeView simpleDraweeView = inflate.verifiedBotIcon;
        C9612q.m13918g(simpleDraweeView, "binding.verifiedBotIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Check);
        SimpleDraweeView simpleDraweeView2 = inflate.verifiedBotIcon;
        C9612q.m13918g(simpleDraweeView2, "binding.verifiedBotIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, (Integer) (-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureTagView_e_CJZyo$lambda$0(ChatEventHandler eventHandler, String messageId, long j, String str, View view) {
        C9612q.m13917h(eventHandler, "$eventHandler");
        C9612q.m13917h(messageId, "$messageId");
        eventHandler.mo41610onTapTagEqy5D80(messageId, j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureTagView_e_CJZyo$lambda$1(ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(eventHandler, "$eventHandler");
        eventHandler.onTapOpTag();
    }

    /* renamed from: configureTagView-e-CJZyo  reason: not valid java name */
    public final void m41654configureTagVieweCJZyo(String str, Boolean bool, Integer num, Integer num2, String str2, final ChatEventHandler eventHandler, final String messageId, final long j, final String str3) {
        int colorCompat;
        C9612q.m13917h(eventHandler, "eventHandler");
        C9612q.m13917h(messageId, "messageId");
        int i = 0;
        if (str != null) {
            this.binding.tag.setText(str);
            TextView textView = this.binding.tag;
            if (num != null) {
                colorCompat = num.intValue();
            } else {
                Context context = getContext();
                C9612q.m13918g(context, "context");
                colorCompat = ColorUtilsKt.getColorCompat(context, C2912R.color.white);
            }
            textView.setTextColor(colorCompat);
            ConstraintLayout constraintLayout = this.binding.layout;
            C9612q.m13918g(constraintLayout, "binding.layout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageTagView.configureTagView_e_CJZyo$lambda$0(ChatEventHandler.this, messageId, j, str3, view);
                }
            }, 1, null);
            SimpleDraweeView simpleDraweeView = this.binding.verifiedBotIcon;
            C9612q.m13918g(simpleDraweeView, "binding.verifiedBotIcon");
            if (!C9612q.m13922c(bool, Boolean.TRUE)) {
                i = 8;
            }
            simpleDraweeView.setVisibility(i);
            if (num2 != null) {
                ConstraintLayout constraintLayout2 = this.binding.layout;
                C9612q.m13918g(constraintLayout2, "binding.layout");
                ViewBackgroundUtilsKt.setBackgroundRectangle$default(constraintLayout2, ReactColorToAndroidColorKt.reactColorToAndroidColor(num2.intValue()), SizeUtilsKt.getDpToPx(3), null, 0, 12, null);
                return;
            }
            this.binding.layout.setBackground(C6029a.m23853b(getContext(), C2912R.C2913drawable.drawable_message_author_tag_bg));
        } else if (str2 != null) {
            this.binding.tag.setText(str2);
            TextView textView2 = this.binding.tag;
            Context context2 = getContext();
            C9612q.m13918g(context2, "context");
            textView2.setTextColor(ColorUtilsKt.getColorCompat(context2, C2912R.color.brand_560));
            ConstraintLayout constraintLayout3 = this.binding.layout;
            C9612q.m13918g(constraintLayout3, "binding.layout");
            Context context3 = getContext();
            C9612q.m13918g(context3, "context");
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(constraintLayout3, ColorUtilsKt.getThemeColor(context3, C2912R.color.brand_200, C2912R.color.brand_260), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
            ConstraintLayout constraintLayout4 = this.binding.layout;
            C9612q.m13918g(constraintLayout4, "binding.layout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout4, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageTagView.configureTagView_e_CJZyo$lambda$1(ChatEventHandler.this, view);
                }
            }, 1, null);
            SimpleDraweeView simpleDraweeView2 = this.binding.verifiedBotIcon;
            C9612q.m13918g(simpleDraweeView2, "binding.verifiedBotIcon");
            simpleDraweeView2.setVisibility(8);
        }
    }
}
