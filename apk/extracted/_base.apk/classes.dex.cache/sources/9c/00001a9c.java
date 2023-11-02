package com.discord.misc.utilities.view;

import android.graphics.Point;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"getLocationInWindow", "Landroid/graphics/Point;", "Landroid/view/View;", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ViewLocationUtilsKt {
    public static final Point getLocationInWindow(View view) {
        C9612q.m13917h(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }
}