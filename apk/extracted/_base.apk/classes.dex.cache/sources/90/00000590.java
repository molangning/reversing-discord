package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.l2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1292l2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.l2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1293a {
        /* renamed from: a */
        static boolean m37405a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        /* renamed from: b */
        static boolean m37404b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        /* renamed from: c */
        static void m37403c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        /* renamed from: d */
        static void m37402d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        /* renamed from: e */
        static void m37401e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        /* renamed from: f */
        static boolean m37400f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        /* renamed from: g */
        static void m37399g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m37412a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return C1293a.m37405a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m37411b(ViewParent viewParent, View view, float f, float f2) {
        try {
            return C1293a.m37404b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: c */
    public static void m37410c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC1314p0) {
            ((InterfaceC1314p0) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                C1293a.m37403c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: d */
    public static void m37409d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof InterfaceC1319q0) {
            ((InterfaceC1319q0) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC1314p0) {
            ((InterfaceC1314p0) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                C1293a.m37402d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* renamed from: e */
    public static void m37408e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC1314p0) {
            ((InterfaceC1314p0) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                C1293a.m37401e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: f */
    public static boolean m37407f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC1314p0) {
            return ((InterfaceC1314p0) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return C1293a.m37400f(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m37406g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC1314p0) {
            ((InterfaceC1314p0) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                C1293a.m37399g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }
}