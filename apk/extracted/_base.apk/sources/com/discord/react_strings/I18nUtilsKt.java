package com.discord.react_strings;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.discord.react_strings.RenderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a(\u0010\u0007\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u001a(\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\r"}, m14357d2 = {"Landroid/widget/TextView;", "Lcom/discord/react_strings/I18nMessage;", "i18nMessage", "Lkotlin/Function1;", "Lcom/discord/react_strings/RenderContext;", "", "initializer", "i18nContentDescription", "i18nSetText", "Landroid/widget/ImageView;", "Landroid/content/Context;", "", "i18nFormat", "react_strings_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class I18nUtilsKt {
    public static final void i18nContentDescription(TextView textView, I18nMessage i18nMessage, Function1<? super RenderContext, Unit> initializer) {
        C9612q.m13917h(textView, "<this>");
        C9612q.m13917h(i18nMessage, "i18nMessage");
        C9612q.m13917h(initializer, "initializer");
        Context context = textView.getContext();
        C9612q.m13918g(context, "context");
        textView.setContentDescription(i18nFormat(context, i18nMessage, initializer));
    }

    public static /* synthetic */ void i18nContentDescription$default(TextView textView, I18nMessage i18nMessage, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = I18nUtilsKt$i18nContentDescription$1.INSTANCE;
        }
        i18nContentDescription(textView, i18nMessage, function1);
    }

    public static final CharSequence i18nFormat(Context context, I18nMessage i18nMessage, Function1<? super RenderContext, Unit> initializer) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(i18nMessage, "i18nMessage");
        C9612q.m13917h(initializer, "initializer");
        RenderContext renderContext = new RenderContext();
        initializer.invoke(renderContext);
        return RenderContext.Argument.INSTANCE.replace(i18nMessage.format$react_strings_release(context), new I18nUtilsKt$i18nFormat$2(renderContext));
    }

    public static /* synthetic */ CharSequence i18nFormat$default(Context context, I18nMessage i18nMessage, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = I18nUtilsKt$i18nFormat$1.INSTANCE;
        }
        return i18nFormat(context, i18nMessage, function1);
    }

    public static final void i18nSetText(TextView textView, I18nMessage i18nMessage, Function1<? super RenderContext, Unit> initializer) {
        C9612q.m13917h(textView, "<this>");
        C9612q.m13917h(i18nMessage, "i18nMessage");
        C9612q.m13917h(initializer, "initializer");
        Context context = textView.getContext();
        C9612q.m13918g(context, "context");
        textView.setText(i18nFormat(context, i18nMessage, initializer));
    }

    public static /* synthetic */ void i18nSetText$default(TextView textView, I18nMessage i18nMessage, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = I18nUtilsKt$i18nSetText$1.INSTANCE;
        }
        i18nSetText(textView, i18nMessage, function1);
    }

    public static final void i18nContentDescription(ImageView imageView, I18nMessage i18nMessage, Function1<? super RenderContext, Unit> initializer) {
        C9612q.m13917h(imageView, "<this>");
        C9612q.m13917h(i18nMessage, "i18nMessage");
        C9612q.m13917h(initializer, "initializer");
        Context context = imageView.getContext();
        C9612q.m13918g(context, "context");
        imageView.setContentDescription(i18nFormat(context, i18nMessage, initializer));
    }

    public static /* synthetic */ void i18nContentDescription$default(ImageView imageView, I18nMessage i18nMessage, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = I18nUtilsKt$i18nContentDescription$2.INSTANCE;
        }
        i18nContentDescription(imageView, i18nMessage, function1);
    }
}
