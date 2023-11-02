package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p052d.C5709d;
import p052d.C5711f;
import p052d.C5712g;
import p052d.C5714i;

/* renamed from: androidx.appcompat.widget.w1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0610w1 {

    /* renamed from: a */
    private final Context f2081a;

    /* renamed from: b */
    private final View f2082b;

    /* renamed from: c */
    private final TextView f2083c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f2084d;

    /* renamed from: e */
    private final Rect f2085e;

    /* renamed from: f */
    private final int[] f2086f;

    /* renamed from: g */
    private final int[] f2087g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0610w1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2084d = layoutParams;
        this.f2085e = new Rect();
        this.f2086f = new int[2];
        this.f2087g = new int[2];
        this.f2081a = context;
        View inflate = LayoutInflater.from(context).inflate(C5712g.f16203s, (ViewGroup) null);
        this.f2082b = inflate;
        this.f2083c = (TextView) inflate.findViewById(C5711f.f16178t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C5714i.f16219a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m39585a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2081a.getResources().getDimensionPixelOffset(C5709d.f16094m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2081a.getResources().getDimensionPixelOffset(C5709d.f16093l);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f2081a.getResources();
        if (z) {
            i4 = C5709d.f16096o;
        } else {
            i4 = C5709d.f16095n;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View m39584b = m39584b(view);
        if (m39584b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m39584b.getWindowVisibleDisplayFrame(this.f2085e);
        Rect rect = this.f2085e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f2081a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i5 = resources2.getDimensionPixelSize(identifier);
            } else {
                i5 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f2085e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m39584b.getLocationOnScreen(this.f2087g);
        view.getLocationOnScreen(this.f2086f);
        int[] iArr = this.f2086f;
        int i6 = iArr[0];
        int[] iArr2 = this.f2087g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i) - (m39584b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2082b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2082b.getMeasuredHeight();
        int i8 = this.f2086f[1];
        int i9 = ((i3 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z) {
            if (i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
        } else if (measuredHeight + i10 <= this.f2085e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    /* renamed from: b */
    private static View m39584b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m39583c() {
        if (!m39582d()) {
            return;
        }
        ((WindowManager) this.f2081a.getSystemService("window")).removeView(this.f2082b);
    }

    /* renamed from: d */
    boolean m39582d() {
        return this.f2082b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m39581e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m39582d()) {
            m39583c();
        }
        this.f2083c.setText(charSequence);
        m39585a(view, i, i2, z, this.f2084d);
        ((WindowManager) this.f2081a.getSystemService("window")).addView(this.f2082b, this.f2084d);
    }
}
