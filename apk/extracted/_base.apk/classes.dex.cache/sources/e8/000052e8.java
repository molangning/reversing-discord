package p446yd;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m14357d2 = {"Landroid/view/ViewGroup;", "", "a", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14007r {

    @Metadata(m14358d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m14357d2 = {"yd/r$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "", "onChildViewRemoved", "onChildViewAdded", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: yd.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC14008a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: j */
        final /* synthetic */ ViewGroup f36004j;

        ViewGroup$OnHierarchyChangeListenerC14008a(ViewGroup viewGroup) {
            this.f36004j = viewGroup;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(this.f36004j.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f36004j.getMeasuredHeight(), 1073741824));
            }
            if (view != null) {
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* renamed from: a */
    public static final void m929a(ViewGroup viewGroup) {
        C9612q.m13917h(viewGroup, "<this>");
        viewGroup.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC14008a(viewGroup));
    }
}