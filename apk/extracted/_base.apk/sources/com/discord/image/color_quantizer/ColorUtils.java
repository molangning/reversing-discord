package com.discord.image.color_quantizer;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p068dg.C5838c;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, m14357d2 = {"Lcom/discord/image/color_quantizer/ColorUtils;", "", "()V", "HSLtoRGB", "", "hsl", "", "RGBtoHSL", "", "r", "g", "b", "color_quantizer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public static final int HSLtoRGB(float[] hsl) {
        int m24388b;
        int m24388b2;
        int m24388b3;
        int m24388b4;
        C9612q.m13917h(hsl, "hsl");
        float f = hsl[0];
        float f2 = hsl[1];
        float f3 = hsl[2];
        float abs = (1.0f - Math.abs((2 * f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                m24388b = C5838c.m24388b((abs + f4) * 255.0f);
                m24388b2 = C5838c.m24388b((abs2 + f4) * 255.0f);
                m24388b3 = C5838c.m24388b(f4 * 255.0f);
                break;
            case 1:
                m24388b = C5838c.m24388b((abs2 + f4) * 255.0f);
                m24388b2 = C5838c.m24388b((abs + f4) * 255.0f);
                m24388b3 = C5838c.m24388b(f4 * 255.0f);
                break;
            case 2:
                m24388b = C5838c.m24388b(f4 * 255.0f);
                m24388b2 = C5838c.m24388b((abs + f4) * 255.0f);
                m24388b3 = C5838c.m24388b((abs2 + f4) * 255.0f);
                break;
            case 3:
                m24388b = C5838c.m24388b(f4 * 255.0f);
                m24388b4 = C5838c.m24388b((abs2 + f4) * 255.0f);
                m24388b3 = C5838c.m24388b((abs + f4) * 255.0f);
                m24388b2 = m24388b4;
                break;
            case 4:
                m24388b = C5838c.m24388b((abs2 + f4) * 255.0f);
                m24388b4 = C5838c.m24388b(f4 * 255.0f);
                m24388b3 = C5838c.m24388b((abs + f4) * 255.0f);
                m24388b2 = m24388b4;
                break;
            case 5:
            case 6:
                m24388b = C5838c.m24388b((abs + f4) * 255.0f);
                m24388b2 = C5838c.m24388b(f4 * 255.0f);
                m24388b3 = C5838c.m24388b((abs2 + f4) * 255.0f);
                break;
            default:
                m24388b3 = 0;
                m24388b = 0;
                m24388b2 = 0;
                break;
        }
        return Color.rgb(Math.max(0, Math.min(255, m24388b)), Math.max(0, Math.min(255, m24388b2)), Math.max(0, Math.min(255, m24388b3)));
    }

    public static final void RGBtoHSL(int i, int i2, int i3, float[] hsl) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float abs;
        C9612q.m13917h(hsl, "hsl");
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                if (max == f3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f = ((f4 - f2) / f5) + 2.0f;
                } else {
                    f = ((f2 - f3) / f5) + 4.0f;
                }
            }
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        hsl[0] = (f * 60.0f) % 360.0f;
        hsl[1] = abs;
        hsl[2] = f6;
    }
}
