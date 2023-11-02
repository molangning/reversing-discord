package com.discord.scale;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.discord.react.FontManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001¨\u0006\u0007"}, m14357d2 = {"getFontScaledContext", "Landroid/content/Context;", "modifyFontScale", "Landroid/content/res/Configuration;", "context", "setFontScaleDeprecated", "", "fonts_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class FontScaleUtilsKt {
    public static final Context getFontScaledContext(Context context) {
        C9612q.m13917h(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        C9612q.m13918g(configuration, "resources.configuration");
        Context createConfigurationContext = context.createConfigurationContext(modifyFontScale(configuration, context));
        C9612q.m13918g(createConfigurationContext, "createConfigurationConte…ifyFontScale(this),\n    )");
        return createConfigurationContext;
    }

    private static final Configuration modifyFontScale(Configuration configuration, Context context) {
        configuration.fontScale = FontManager.INSTANCE.getScaledFontSize(context);
        return configuration;
    }

    public static final void setFontScaleDeprecated(Context context) {
        C9612q.m13917h(context, "<this>");
        Resources resources = context.getResources();
        Configuration configuration = context.getResources().getConfiguration();
        C9612q.m13918g(configuration, "resources.configuration");
        resources.updateConfiguration(modifyFontScale(configuration, context), context.getResources().getDisplayMetrics());
    }
}