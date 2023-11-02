package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0000\u001a\u0018\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0000¨\u0006\u000b"}, m14357d2 = {"Landroid/view/View;", "rootView", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "d", "c", "b", "view", "e", "Landroid/view/ViewGroup;", "Lcom/th3rdwave/safeareacontext/Rect;", "a", "react-native-safe-area-context_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5671e {
    /* renamed from: a */
    public static final Rect m24779a(ViewGroup rootView, View view) {
        C9612q.m13917h(rootView, "rootView");
        C9612q.m13917h(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new Rect(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static final EdgeInsets m24778b(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m24776d(view);
        }
        return m24777c(view);
    }

    /* renamed from: c */
    private static final EdgeInsets m24777c(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new EdgeInsets(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
    }

    /* renamed from: d */
    private static final EdgeInsets m24776d(View view) {
        int statusBars;
        int displayCutout;
        int navigationBars;
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            statusBars = WindowInsets.Type.statusBars();
            displayCutout = WindowInsets.Type.displayCutout();
            int i5 = statusBars | displayCutout;
            navigationBars = WindowInsets.Type.navigationBars();
            insets = rootWindowInsets.getInsets(i5 | navigationBars);
            if (insets != null) {
                i = insets.top;
                i2 = insets.right;
                i3 = insets.bottom;
                i4 = insets.left;
                return new EdgeInsets(i, i2, i3, i4);
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public static final EdgeInsets m24775e(View view) {
        C9612q.m13917h(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        C9612q.m13918g(rootView, "rootView");
        EdgeInsets m24778b = m24778b(rootView);
        if (m24778b == null) {
            return null;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return new EdgeInsets(Math.max(m24778b.m24790d() - rect.top, 0.0f), Math.max(Math.min((rect.left + view.getWidth()) - rootView.getWidth(), 0.0f) + m24778b.m24791c(), 0.0f), Math.max(Math.min((rect.top + view.getHeight()) - rootView.getHeight(), 0.0f) + m24778b.m24793a(), 0.0f), Math.max(m24778b.m24792b() - rect.left, 0.0f));
    }
}
