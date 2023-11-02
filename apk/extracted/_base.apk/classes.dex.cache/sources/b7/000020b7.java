package com.discord.theme.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.C1427g;
import com.discord.theme.DiscordTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p068dg.C5838c;

@Metadata(m14358d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a8\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0003*\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u0003*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0003H\u0007\u001a \u0010\u0015\u001a\u00020\u0003*\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0003H\u0007\u001a(\u0010\u0015\u001a\u00020\u0003*\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u001b\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001e\u001a\u001b\u0010\u001a\u001a\u00020\u001b*\u00020\u001f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 \"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m14357d2 = {"rgbaPattern", "Lkotlin/text/Regex;", "argbWithAdjustedAlpha", "", ViewProps.COLOR, "alpha", "", "interpolateColors", "colorA", "colorB", "t", "minT", "maxT", "rgbaToArgb", "rgbaString", "", "getColorCompat", "Landroid/content/Context;", "id", "Landroid/view/View;", "colorRes", "getThemeColor", "lightColorRes", "darkColorRes", "theme", "Lcom/discord/theme/DiscordTheme;", "setTintColor", "", "Landroid/widget/ImageView;", "colorInt", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V", "theme_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ColorUtilsKt {
    private static final Regex rgbaPattern = new Regex("rgba\\((\\d+),\\s*(\\d+),\\s*(\\d+),\\s*(\\d+(?:\\.\\d*)?|\\.\\d+)\\)");

    public static final int argbWithAdjustedAlpha(int i, float f) {
        int m24388b;
        m24388b = C5838c.m24388b(Color.alpha(i) * f);
        return Color.argb(m24388b, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final int getColorCompat(Context context, int i) {
        C9612q.m13917h(context, "<this>");
        return context.getColor(i);
    }

    public static final int getThemeColor(Context context, int i, int i2) {
        C9612q.m13917h(context, "<this>");
        return getThemeColor(context, i, i2, ThemeManagerKt.getTheme());
    }

    public static final int interpolateColors(int i, int i2, float f, float f2, float f3) {
        int m21923j;
        int m21923j2;
        int m21923j3;
        int m21923j4;
        if (f <= f2) {
            return i;
        }
        if (f >= f3) {
            return i2;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        int red2 = Color.red(i2);
        int green2 = Color.green(i2);
        int blue2 = Color.blue(i2);
        int alpha2 = Color.alpha(i2);
        float f4 = (f - f2) / (f3 - f2);
        m21923j = C6759j.m21923j((int) (red + ((red2 - red) * f4)), 0, 255);
        m21923j2 = C6759j.m21923j((int) (green + ((green2 - green) * f4)), 0, 255);
        m21923j3 = C6759j.m21923j((int) (blue + ((blue2 - blue) * f4)), 0, 255);
        m21923j4 = C6759j.m21923j((int) (alpha + ((alpha2 - alpha) * f4)), 0, 255);
        return Color.argb(m21923j4, m21923j, m21923j2, m21923j3);
    }

    public static /* synthetic */ int interpolateColors$default(int i, int i2, float f, float f2, float f3, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            f2 = 0.0f;
        }
        if ((i3 & 16) != 0) {
            f3 = 1.0f;
        }
        return interpolateColors(i, i2, f, f2, f3);
    }

    public static final int rgbaToArgb(String str) {
        if (str != null) {
            MatchResult m13869f = rgbaPattern.m13869f(str);
            if (m13869f != null) {
                MatchResult.C9632b mo3926a = m13869f.mo3926a();
                return Color.argb((int) (Double.parseDouble(mo3926a.m13875a().mo3925b().get(4)) * 255), Integer.parseInt(mo3926a.m13875a().mo3925b().get(1)), Integer.parseInt(mo3926a.m13875a().mo3925b().get(2)), Integer.parseInt(mo3926a.m13875a().mo3925b().get(3)));
            }
            return -16777216;
        }
        return 0;
    }

    public static final void setTintColor(ImageView imageView, Integer num) {
        C9612q.m13917h(imageView, "<this>");
        C1427g.m36901c(imageView, num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public static final int getColorCompat(View view, int i) {
        C9612q.m13917h(view, "<this>");
        Context context = view.getContext();
        C9612q.m13918g(context, "context");
        return getColorCompat(context, i);
    }

    public static final int getThemeColor(Context context, int i, int i2, DiscordTheme theme) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(theme, "theme");
        return getColorCompat(context, theme.getColorRes(i, i2));
    }

    public static final void setTintColor(SimpleDraweeView simpleDraweeView, Integer num) {
        C9612q.m13917h(simpleDraweeView, "<this>");
        if (num == null) {
            simpleDraweeView.clearColorFilter();
        } else {
            simpleDraweeView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}