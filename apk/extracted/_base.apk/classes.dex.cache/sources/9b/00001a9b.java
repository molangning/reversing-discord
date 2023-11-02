package com.discord.misc.utilities.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, m14357d2 = {"setUpLayoutForList", "", "Landroid/view/ViewGroup;", "listSize", "", "inflater", "Lkotlin/Function0;", "Landroid/view/View;", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ViewGroupUtilsKt {
    public static final void setUpLayoutForList(ViewGroup viewGroup, int i, Function0<? extends View> inflater) {
        C9612q.m13917h(viewGroup, "<this>");
        C9612q.m13917h(inflater, "inflater");
        if (i == viewGroup.getChildCount()) {
            return;
        }
        if (viewGroup.getChildCount() > i) {
            viewGroup.removeViews(0, viewGroup.getChildCount() - i);
        } else if (viewGroup.getChildCount() < i) {
            int childCount = i - viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                viewGroup.addView(inflater.invoke());
            }
        }
    }
}