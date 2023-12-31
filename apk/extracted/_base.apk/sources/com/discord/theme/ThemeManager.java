package com.discord.theme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.discord.theme.utils.ActivityThemeUtils;
import com.discord.theme.utils.UpdateSystemUiKt;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020 J\u0006\u0010%\u001a\u00020 J\r\u0010&\u001a\u00020\u001bH\u0000¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*J\u000e\u0010(\u001a\u00020 2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\r¨\u0006."}, m14357d2 = {"Lcom/discord/theme/ThemeManager;", "", "()V", "<set-?>", "Lcom/discord/theme/AmoledTheme;", "amoledTheme", "getAmoledTheme", "()Lcom/discord/theme/AmoledTheme;", "currentTheme", "Lcom/discord/theme/DiscordTheme;", "getCurrentTheme$theme_release", "()Lcom/discord/theme/DiscordTheme;", "setCurrentTheme$theme_release", "(Lcom/discord/theme/DiscordTheme;)V", "Lcom/discord/theme/DarkTheme;", "darkTheme", "getDarkTheme", "()Lcom/discord/theme/DarkTheme;", "Lcom/discord/theme/DarkerTheme;", "darkerTheme", "getDarkerTheme", "()Lcom/discord/theme/DarkerTheme;", "Lcom/discord/theme/LightTheme;", "lightTheme", "getLightTheme", "()Lcom/discord/theme/LightTheme;", "showSplashImage", "", "themeOverride", "getThemeOverride", "setThemeOverride", "init", "", "context", "Landroid/content/Context;", "isInitialized", "setDarkTheme", "setLightTheme", "shouldShowSplashImage", "shouldShowSplashImage$theme_release", "updateSystemUi", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "updateWindowBackground", "theme_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ThemeManager {
    private static AmoledTheme amoledTheme;
    public static DiscordTheme currentTheme;
    private static DarkTheme darkTheme;
    private static DarkerTheme darkerTheme;
    private static LightTheme lightTheme;
    private static DiscordTheme themeOverride;
    public static final ThemeManager INSTANCE = new ThemeManager();
    private static boolean showSplashImage = true;

    private ThemeManager() {
    }

    public final AmoledTheme getAmoledTheme() {
        AmoledTheme amoledTheme2 = amoledTheme;
        if (amoledTheme2 != null) {
            return amoledTheme2;
        }
        C9612q.m13900y("amoledTheme");
        return null;
    }

    public final DiscordTheme getCurrentTheme$theme_release() {
        DiscordTheme discordTheme = currentTheme;
        if (discordTheme != null) {
            return discordTheme;
        }
        C9612q.m13900y("currentTheme");
        return null;
    }

    public final DarkTheme getDarkTheme() {
        DarkTheme darkTheme2 = darkTheme;
        if (darkTheme2 != null) {
            return darkTheme2;
        }
        C9612q.m13900y("darkTheme");
        return null;
    }

    public final DarkerTheme getDarkerTheme() {
        DarkerTheme darkerTheme2 = darkerTheme;
        if (darkerTheme2 != null) {
            return darkerTheme2;
        }
        C9612q.m13900y("darkerTheme");
        return null;
    }

    public final LightTheme getLightTheme() {
        LightTheme lightTheme2 = lightTheme;
        if (lightTheme2 != null) {
            return lightTheme2;
        }
        C9612q.m13900y("lightTheme");
        return null;
    }

    public final DiscordTheme getThemeOverride() {
        return themeOverride;
    }

    public final void init(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C9612q.m13917h(context, "context");
        boolean z5 = true;
        if (lightTheme == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lightTheme = new LightTheme(context);
        }
        if (darkTheme == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            darkTheme = new DarkTheme(context);
        }
        if (darkerTheme == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            darkerTheme = new DarkerTheme(context);
        }
        if (amoledTheme == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            amoledTheme = new AmoledTheme(context);
        }
        if (currentTheme != null) {
            z5 = false;
        }
        if (z5) {
            setCurrentTheme$theme_release(getDarkTheme());
        }
    }

    public final boolean isInitialized() {
        return currentTheme != null;
    }

    public final void setCurrentTheme$theme_release(DiscordTheme discordTheme) {
        C9612q.m13917h(discordTheme, "<set-?>");
        currentTheme = discordTheme;
    }

    public final void setDarkTheme() {
        setCurrentTheme$theme_release(getDarkTheme());
    }

    public final void setLightTheme() {
        setCurrentTheme$theme_release(getLightTheme());
    }

    public final void setThemeOverride(DiscordTheme discordTheme) {
        themeOverride = discordTheme;
    }

    public final boolean shouldShowSplashImage$theme_release() {
        return showSplashImage;
    }

    public final void updateSystemUi(View view) {
        C9612q.m13917h(view, "view");
        UpdateSystemUiKt.updateSystemUi(view);
    }

    public final void updateWindowBackground(Context context, boolean z) {
        Activity activity;
        ReactContext reactContext;
        C9612q.m13917h(context, "context");
        showSplashImage = z;
        Activity activity2 = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
            } else {
                reactContext = null;
            }
            if (reactContext != null) {
                activity2 = reactContext.getCurrentActivity();
            }
        } else {
            activity2 = activity;
        }
        if (activity2 != null) {
            ActivityThemeUtils.INSTANCE.updateWindowBackground$theme_release(activity2);
        }
    }

    public final void updateSystemUi(Activity activity) {
        C9612q.m13917h(activity, "activity");
        UpdateSystemUiKt.updateSystemUi(activity);
    }
}
