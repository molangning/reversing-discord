package com.henninghall.date_picker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Dynamic;
import gd.C6728a;
import gd.C6732d;
import java.util.ArrayList;

/* renamed from: com.henninghall.date_picker.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5147g extends RelativeLayout {

    /* renamed from: j */
    private final ViewGroup.LayoutParams f14474j;

    /* renamed from: k */
    private C6732d f14475k;

    /* renamed from: l */
    private C5151j f14476l;

    /* renamed from: m */
    private ArrayList<String> f14477m;

    /* renamed from: n */
    private final Runnable f14478n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5148a implements Runnable {
        RunnableC5148a() {
            C5147g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5147g c5147g = C5147g.this;
            c5147g.measure(View.MeasureSpec.makeMeasureSpec(c5147g.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5147g.this.getHeight(), 1073741824));
            C5147g c5147g2 = C5147g.this;
            c5147g2.layout(c5147g2.getLeft(), C5147g.this.getTop(), C5147g.this.getRight(), C5147g.this.getBottom());
        }
    }

    public C5147g(ViewGroup.LayoutParams layoutParams) {
        super(C5136a.f14460a);
        this.f14476l = new C5151j();
        this.f14477m = new ArrayList<>();
        this.f14478n = new RunnableC5148a();
        this.f14474j = layoutParams;
    }

    /* renamed from: a */
    private boolean m26068a(String... strArr) {
        for (String str : strArr) {
            if (this.f14477m.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m26067b(int i, int i2) {
        this.f14475k.m22008e(i, i2);
    }

    /* renamed from: c */
    public void m26066c() {
        if (m26068a("androidVariant")) {
            removeAllViewsInLayout();
            LinearLayout linearLayout = new LinearLayout(getContext());
            LayoutInflater.from(getContext()).inflate(this.f14476l.f14509p.m26091d(), linearLayout);
            addView(linearLayout, this.f14474j);
            this.f14475k = new C6732d(this.f14476l, this);
        }
        if (m26068a("fadeToColor")) {
            this.f14475k.m22004i();
        }
        if (m26068a("textColor")) {
            this.f14475k.m22001l();
        }
        if (m26068a("mode", "androidVariant", "is24hourSource")) {
            this.f14475k.m21998o();
        }
        if (m26068a("height")) {
            this.f14475k.m22003j();
        }
        if (m26068a("dividerHeight")) {
            this.f14475k.m22005h();
        }
        if (m26068a("mode", "locale", "androidVariant", "is24hourSource")) {
            this.f14475k.m22000m();
        }
        if (m26068a("mode")) {
            this.f14475k.m21999n();
        }
        if (m26068a("date", "height", "locale", "maximumDate", "minimumDate", "minuteInterval", "mode", "timezoneOffsetInMinutes", "androidVariant")) {
            this.f14475k.m22006g();
        }
        if (m26068a("locale")) {
            C6728a.m22020h(this.f14476l.m26037u());
        }
        this.f14475k.m22007f();
        this.f14477m = new ArrayList<>();
    }

    /* renamed from: d */
    public void m26065d(String str, Dynamic dynamic) {
        this.f14476l.m26058G(str, dynamic);
        this.f14477m.add(str);
    }

    public String getDate() {
        return this.f14476l.f14509p.m26094a();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f14478n);
    }
}