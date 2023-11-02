package com.discord.portals;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.discord.crash_reporting.CrashReporting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.C11888u;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"removeFromParent", "", "Landroid/view/View;", "portals_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PortalViewContextUtilsKt {
    public static final void removeFromParent(View view) {
        Map m6757e;
        C9612q.m13917h(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
        }
        if (view.getParent() != null) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            String simpleName = PortalViewContextManager.INSTANCE.getClass().getSimpleName();
            C9612q.m13918g(simpleName, "PortalViewContextManager.javaClass.simpleName");
            m6757e = C11888u.m6757e(C11591x.m7577a("parentView", view.getParent().getClass().getSimpleName()));
            CrashReporting.addBreadcrumb$default(crashReporting, simpleName, m6757e, null, 4, null);
        }
    }
}