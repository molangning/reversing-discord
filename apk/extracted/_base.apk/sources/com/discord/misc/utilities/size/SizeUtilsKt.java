package com.discord.misc.utilities.size;

import android.content.res.Resources;
import kotlin.Metadata;
import p068dg.C5838c;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005¨\u0006\u000b"}, m14357d2 = {"dpToPx", "", "", "getDpToPx", "(F)I", "(I)I", "pxToDp", "getPxToDp", "(I)F", "spToPx", "getSpToPx", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class SizeUtilsKt {
    public static final int getDpToPx(int i) {
        return getDpToPx(i);
    }

    public static final float getPxToDp(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int getSpToPx(int i) {
        int m24388b;
        m24388b = C5838c.m24388b(i * Resources.getSystem().getDisplayMetrics().scaledDensity);
        return m24388b;
    }

    public static final int getDpToPx(float f) {
        int m24388b;
        m24388b = C5838c.m24388b(f * Resources.getSystem().getDisplayMetrics().density);
        return m24388b;
    }
}
