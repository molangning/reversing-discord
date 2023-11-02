package com.discord.image;

import android.graphics.Bitmap;
import androidx.core.graphics.C0995a;
import com.discord.image.color_quantizer.ColorCutQuantizer;
import com.discord.image.color_quantizer.Swatch;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m14357d2 = {"Lcom/discord/image/DominantColor;", "", "()V", "getPrimaryColorsForBitmap", "", "", "bitmap", "Landroid/graphics/Bitmap;", "getRepresentativeColors", "NoSwatchesFoundException", "color_quantizer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class DominantColor {
    public static final DominantColor INSTANCE = new DominantColor();

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lcom/discord/image/DominantColor$NoSwatchesFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "color_quantizer_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class NoSwatchesFoundException extends RuntimeException {
    }

    private DominantColor() {
    }

    private final List<Integer> getPrimaryColorsForBitmap(Bitmap bitmap) {
        int m14093t;
        List<Swatch> quantizedColors = ColorCutQuantizer.Companion.fromBitmap(bitmap, 5).getQuantizedColors();
        if (!quantizedColors.isEmpty()) {
            m14093t = C9546k.m14093t(quantizedColors, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (Swatch swatch : quantizedColors) {
                arrayList.add(Integer.valueOf(swatch.getRgb()));
            }
            return arrayList;
        }
        throw new NoSwatchesFoundException();
    }

    public final List<Integer> getRepresentativeColors(Bitmap bitmap) {
        int m14093t;
        C9612q.m13917h(bitmap, "bitmap");
        try {
            List<Integer> primaryColorsForBitmap = getPrimaryColorsForBitmap(bitmap);
            if (primaryColorsForBitmap.isEmpty()) {
                return null;
            }
            m14093t = C9546k.m14093t(primaryColorsForBitmap, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (Number number : primaryColorsForBitmap) {
                arrayList.add(Integer.valueOf(C0995a.m38177k(number.intValue(), 255)));
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }
}