package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1429h extends AbstractView$OnTouchListenerC1413a {

    /* renamed from: B */
    private final ListView f3785B;

    public C1429h(ListView listView) {
        super(listView);
        this.f3785B = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1413a
    /* renamed from: a */
    public boolean mo36895a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1413a
    /* renamed from: b */
    public boolean mo36894b(int i) {
        ListView listView = this.f3785B;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC1413a
    /* renamed from: j */
    public void mo36893j(int i, int i2) {
        C1430i.m36891b(this.f3785B, i2);
    }
}
