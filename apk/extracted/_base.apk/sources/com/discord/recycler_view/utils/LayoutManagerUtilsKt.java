package com.discord.recycler_view.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"isPositionVisible", "", "Landroidx/recyclerview/widget/LinearLayoutManager;", ViewProps.POSITION, "", "(Landroidx/recyclerview/widget/LinearLayoutManager;I)Ljava/lang/Boolean;", "recycler_view_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class LayoutManagerUtilsKt {
    public static final Boolean isPositionVisible(LinearLayoutManager linearLayoutManager, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(linearLayoutManager, "<this>");
        Integer valueOf = Integer.valueOf(linearLayoutManager.m35824e2());
        boolean z4 = true;
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = Integer.valueOf(linearLayoutManager.m35820i2());
            if (valueOf.intValue() != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                valueOf = null;
            }
        }
        Integer valueOf2 = Integer.valueOf(linearLayoutManager.m35819j2());
        if (valueOf2.intValue() != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            valueOf2 = null;
        }
        if (valueOf2 == null) {
            valueOf2 = Integer.valueOf(linearLayoutManager.m35817l2());
            if (valueOf2.intValue() == -1) {
                z4 = false;
            }
            if (!z4) {
                valueOf2 = null;
            }
        }
        if (valueOf == null || valueOf2 == null) {
            return null;
        }
        return Boolean.valueOf(new IntRange(valueOf.intValue(), valueOf2.intValue()).contains(i));
    }
}
