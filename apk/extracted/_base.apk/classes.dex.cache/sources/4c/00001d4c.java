package com.discord.react;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.C9618w;
import kotlin.properties.C9622a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0004J\u0014\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c*\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/react/FontManager;", "", "()V", "FONT_SCALE_CHAT_CLASSIC_DEFAULT", "", FontManager.FONT_SCALE_CHAT_CLASSIC_KEY, "", FontManager.FONT_SCALE_KEY, "<set-?>", "", "initialFontSize", "getInitialFontSize", "()F", "setInitialFontSize", "(F)V", "initialFontSize$delegate", "Lkotlin/properties/ReadWriteProperty;", "getFontScale", "context", "Landroid/content/Context;", "getIsClassicChatFontScaleEnabled", "getScaledFontSize", "init", "", "setFontSize", "fontScale", "isClassicChatFontScaleEnabled", "getCache", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "fonts_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class FontManager {
    private static final boolean FONT_SCALE_CHAT_CLASSIC_DEFAULT = false;
    private static final String FONT_SCALE_CHAT_CLASSIC_KEY = "FONT_SCALE_CHAT_CLASSIC_KEY";
    private static final String FONT_SCALE_KEY = "FONT_SCALE_KEY";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9591f0.m13966e(new C9618w(FontManager.class, "initialFontSize", "getInitialFontSize()F", 0))};
    public static final FontManager INSTANCE = new FontManager();
    private static final ReadWriteProperty initialFontSize$delegate = C9622a.f25358a.m13895a();

    private FontManager() {
    }

    private final SharedPreferences getCache(Context context) {
        return context.getSharedPreferences("FontScaleManager", 0);
    }

    private final float getInitialFontSize() {
        return ((Number) initialFontSize$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public static /* synthetic */ void setFontSize$default(FontManager fontManager, Context context, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f = fontManager.getFontScale(context);
        }
        if ((i & 4) != 0) {
            z = fontManager.getIsClassicChatFontScaleEnabled(context);
        }
        fontManager.setFontSize(context, f, z);
    }

    private final void setInitialFontSize(float f) {
        initialFontSize$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }

    public final synchronized float getFontScale(Context context) {
        C9612q.m13917h(context, "context");
        return getCache(context).getFloat(FONT_SCALE_KEY, 1.0f);
    }

    public final synchronized boolean getIsClassicChatFontScaleEnabled(Context context) {
        C9612q.m13917h(context, "context");
        if (!getCache(context).contains(FONT_SCALE_CHAT_CLASSIC_KEY)) {
            SharedPreferences cache = getCache(context);
            C9612q.m13918g(cache, "context.getCache()");
            SharedPreferences.Editor editor = cache.edit();
            C9612q.m13918g(editor, "editor");
            editor.putBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, false);
            editor.apply();
        }
        return getCache(context).getBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, false);
    }

    public final synchronized float getScaledFontSize(Context context) {
        C9612q.m13917h(context, "context");
        return getInitialFontSize() * getFontScale(context);
    }

    public final void init(Context context) {
        C9612q.m13917h(context, "context");
        setInitialFontSize(context.getResources().getConfiguration().fontScale);
    }

    public final synchronized void setFontSize(Context context, float f, boolean z) {
        C9612q.m13917h(context, "context");
        SharedPreferences cache = getCache(context);
        C9612q.m13918g(cache, "context.getCache()");
        SharedPreferences.Editor editor = cache.edit();
        C9612q.m13918g(editor, "editor");
        editor.putFloat(FONT_SCALE_KEY, f);
        editor.putBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, z);
        editor.commit();
    }
}