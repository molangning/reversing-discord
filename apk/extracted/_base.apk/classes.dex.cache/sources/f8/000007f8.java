package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1801f {

    /* renamed from: b */
    int f4953b;

    /* renamed from: c */
    int f4954c;

    /* renamed from: d */
    int f4955d;

    /* renamed from: e */
    int f4956e;

    /* renamed from: h */
    boolean f4959h;

    /* renamed from: i */
    boolean f4960i;

    /* renamed from: a */
    boolean f4952a = true;

    /* renamed from: f */
    int f4957f = 0;

    /* renamed from: g */
    int f4958g = 0;

    /* renamed from: a */
    public boolean m35383a(RecyclerView.State state) {
        int i = this.f4954c;
        return i >= 0 && i < state.m35611b();
    }

    /* renamed from: b */
    public View m35382b(RecyclerView.Recycler recycler) {
        View m35636o = recycler.m35636o(this.f4954c);
        this.f4954c += this.f4955d;
        return m35636o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4953b + ", mCurrentPosition=" + this.f4954c + ", mItemDirection=" + this.f4955d + ", mLayoutDirection=" + this.f4956e + ", mStartLine=" + this.f4957f + ", mEndLine=" + this.f4958g + '}';
    }
}