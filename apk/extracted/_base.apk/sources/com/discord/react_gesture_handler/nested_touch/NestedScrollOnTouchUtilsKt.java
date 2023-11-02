package com.discord.react_gesture_handler.nested_touch;

import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0016\u0010\f\u001a\u00020\r*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a \u0010\u0011\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0007\u001a \u0010\u0013\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007\u001a\f\u0010\u0015\u001a\u00020\r*\u00020\u0002H\u0002\u001a\f\u0010\u0016\u001a\u00020\t*\u00020\tH\u0002\"&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007¨\u0006\u0017"}, m14357d2 = {"viewClickListeners", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "getViewClickListeners", "()Ljava/util/WeakHashMap;", "setViewClickListeners", "(Ljava/util/WeakHashMap;)V", "viewLongClickListeners", "Landroid/view/View$OnLongClickListener;", "getViewLongClickListeners", "setViewLongClickListeners", "enableNestedSpanClickListener", "", "Landroid/widget/TextView;", "viewManagesAccessibility", "", "setOnClickListenerNested", "onClickListener", "setOnLongClickListenerNested", "onLongPress", "updateClickablity", "updateWithOngoingGestureCancelling", "react_gesture_handler_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class NestedScrollOnTouchUtilsKt {
    private static WeakHashMap<View, View.OnClickListener> viewClickListeners = new WeakHashMap<>();
    private static WeakHashMap<View, View.OnLongClickListener> viewLongClickListeners = new WeakHashMap<>();

    public static final void enableNestedSpanClickListener(TextView textView, boolean z) {
        C9612q.m13917h(textView, "<this>");
        textView.setOnTouchListener(new NestedScrollOnTouchListener(textView, z));
    }

    public static /* synthetic */ void enableNestedSpanClickListener$default(TextView textView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        enableNestedSpanClickListener(textView, z);
    }

    public static final WeakHashMap<View, View.OnClickListener> getViewClickListeners() {
        return viewClickListeners;
    }

    public static final WeakHashMap<View, View.OnLongClickListener> getViewLongClickListeners() {
        return viewLongClickListeners;
    }

    public static final void setOnClickListenerNested(View view, boolean z, View.OnClickListener onClickListener) {
        C9612q.m13917h(view, "<this>");
        if (onClickListener == null) {
            viewClickListeners.remove(view);
        } else {
            viewClickListeners.put(view, onClickListener);
        }
        view.setOnTouchListener(new NestedScrollOnTouchListener(view, z));
        updateClickablity(view);
    }

    public static /* synthetic */ void setOnClickListenerNested$default(View view, boolean z, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        setOnClickListenerNested(view, z, onClickListener);
    }

    public static final void setOnLongClickListenerNested(View view, boolean z, View.OnLongClickListener onLongClickListener) {
        C9612q.m13917h(view, "<this>");
        if (onLongClickListener == null) {
            viewLongClickListeners.remove(view);
        } else {
            viewLongClickListeners.put(view, updateWithOngoingGestureCancelling(onLongClickListener));
        }
        view.setOnTouchListener(new NestedScrollOnTouchListener(view, z));
        updateClickablity(view);
    }

    public static /* synthetic */ void setOnLongClickListenerNested$default(View view, boolean z, View.OnLongClickListener onLongClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        setOnLongClickListenerNested(view, z, onLongClickListener);
    }

    public static final void setViewClickListeners(WeakHashMap<View, View.OnClickListener> weakHashMap) {
        C9612q.m13917h(weakHashMap, "<set-?>");
        viewClickListeners = weakHashMap;
    }

    public static final void setViewLongClickListeners(WeakHashMap<View, View.OnLongClickListener> weakHashMap) {
        C9612q.m13917h(weakHashMap, "<set-?>");
        viewLongClickListeners = weakHashMap;
    }

    private static final void updateClickablity(View view) {
        boolean z;
        if (!viewClickListeners.containsKey(view) && !viewLongClickListeners.containsKey(view)) {
            z = false;
        } else {
            z = true;
        }
        view.setClickable(z);
        view.setFocusable(z);
    }

    private static final View.OnLongClickListener updateWithOngoingGestureCancelling(final View.OnLongClickListener onLongClickListener) {
        return new View.OnLongClickListener() { // from class: com.discord.react_gesture_handler.nested_touch.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean updateWithOngoingGestureCancelling$lambda$1;
                updateWithOngoingGestureCancelling$lambda$1 = NestedScrollOnTouchUtilsKt.updateWithOngoingGestureCancelling$lambda$1(onLongClickListener, view);
                return updateWithOngoingGestureCancelling$lambda$1;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006a A[LOOP:3: B:86:0x0064->B:88:0x006a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x001b -> B:57:0x001c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0035 -> B:69:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0046 -> B:74:0x0047). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean updateWithOngoingGestureCancelling$lambda$1(android.view.View.OnLongClickListener r4, android.view.View r5) {
        /*
            java.lang.String r0 = "$this_updateWithOngoingGestureCancelling"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9612q.m13918g(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r1 = r5.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L1b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L1c
        L1b:
            r1 = r3
        L1c:
            if (r1 == 0) goto L35
            boolean r2 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 != 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = r1
        L25:
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L2a
            goto L36
        L2a:
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L1c
        L35:
            r2 = r3
        L36:
            if (r2 == 0) goto L60
            r0.add(r2)
            android.view.ViewParent r1 = r2.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L46
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L47
        L46:
            r1 = r3
        L47:
            if (r1 == 0) goto L35
            boolean r2 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 != 0) goto L4f
            r2 = r3
            goto L50
        L4f:
            r2 = r1
        L50:
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L55
            goto L36
        L55:
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L46
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L47
        L60:
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            com.discord.recycler_view.utils.RecyclerViewExtensionsKt.toggleSuppressLayout(r1)
            goto L64
        L74:
            boolean r4 = r4.onLongClick(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt.updateWithOngoingGestureCancelling$lambda$1(android.view.View$OnLongClickListener, android.view.View):boolean");
    }
}
