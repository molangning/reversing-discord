package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.C0578u;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* renamed from: com.reactnativecommunity.slider.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5396a extends C0578u {

    /* renamed from: w */
    private static int f15287w = 128;

    /* renamed from: k */
    private double f15288k;

    /* renamed from: l */
    private double f15289l;

    /* renamed from: m */
    private double f15290m;

    /* renamed from: n */
    private boolean f15291n;

    /* renamed from: o */
    private double f15292o;

    /* renamed from: p */
    private double f15293p;

    /* renamed from: q */
    private String f15294q;

    /* renamed from: r */
    private List<String> f15295r;

    /* renamed from: s */
    private double f15296s;

    /* renamed from: t */
    private int f15297t;

    /* renamed from: u */
    private double f15298u;

    /* renamed from: v */
    private int f15299v;

    /* renamed from: com.reactnativecommunity.slider.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5397a extends TimerTask {

        /* renamed from: j */
        final /* synthetic */ AccessibilityManager f15300j;

        /* renamed from: k */
        final /* synthetic */ AccessibilityEvent f15301k;

        C5397a(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            C5396a.this = r1;
            this.f15300j = accessibilityManager;
            this.f15301k = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f15300j.sendAccessibilityEvent(this.f15301k);
        }
    }

    /* renamed from: com.reactnativecommunity.slider.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class CallableC5398b implements Callable<BitmapDrawable> {

        /* renamed from: j */
        final /* synthetic */ String f15303j;

        CallableC5398b(String str) {
            C5396a.this = r1;
            this.f15303j = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BitmapDrawable call() {
            Bitmap decodeStream;
            try {
                if (!this.f15303j.startsWith("http://") && !this.f15303j.startsWith("https://") && !this.f15303j.startsWith("file://") && !this.f15303j.startsWith("asset://") && !this.f15303j.startsWith("data:")) {
                    decodeStream = BitmapFactory.decodeResource(C5396a.this.getResources(), C5396a.this.getResources().getIdentifier(this.f15303j, "drawable", C5396a.this.getContext().getPackageName()));
                    return new BitmapDrawable(C5396a.this.getResources(), decodeStream);
                }
                decodeStream = BitmapFactory.decodeStream(new URL(this.f15303j).openStream());
                return new BitmapDrawable(C5396a.this.getResources(), decodeStream);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public C5396a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15288k = 0.0d;
        this.f15289l = 0.0d;
        this.f15290m = 0.0d;
        this.f15291n = false;
        this.f15292o = 0.0d;
        this.f15293p = 0.0d;
        this.f15296s = -9.223372036854776E18d;
        this.f15298u = 9.223372036854776E18d;
        super.setLayoutDirection(I18nUtil.getInstance().isRTL(context) ? 1 : 0);
        m25292a();
    }

    /* renamed from: a */
    private void m25292a() {
        if (Build.VERSION.SDK_INT < 26) {
            super.setStateListAnimator(null);
        }
    }

    /* renamed from: b */
    private BitmapDrawable m25291b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new CallableC5398b(str)).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    private void m25287f() {
        if (this.f15292o == 0.0d) {
            this.f15293p = (this.f15289l - this.f15288k) / f15287w;
        }
        setMax(getTotalSteps());
        m25286g();
        m25285h();
        m25284i();
    }

    /* renamed from: g */
    private void m25286g() {
        double max = Math.max(this.f15296s, this.f15288k);
        double d = this.f15288k;
        this.f15297t = (int) Math.round(((max - d) / (this.f15289l - d)) * getTotalSteps());
    }

    private double getStepValue() {
        double d = this.f15292o;
        return d > 0.0d ? d : this.f15293p;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f15289l - this.f15288k) / getStepValue());
    }

    /* renamed from: h */
    private void m25285h() {
        double min = Math.min(this.f15298u, this.f15289l);
        double d = this.f15288k;
        this.f15299v = (int) Math.round(((min - d) / (this.f15289l - d)) * getTotalSteps());
    }

    /* renamed from: i */
    private void m25284i() {
        double d = this.f15290m;
        double d2 = this.f15288k;
        setProgress((int) Math.round(((d - d2) / (this.f15289l - d2)) * getTotalSteps()));
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new C5397a(accessibilityManager, obtain), 1000L);
        }
    }

    /* renamed from: c */
    public void m25290c(boolean z) {
        this.f15291n = z;
    }

    /* renamed from: d */
    public boolean m25289d() {
        return this.f15291n;
    }

    /* renamed from: e */
    public double m25288e(int i) {
        if (i == getMax()) {
            return this.f15289l;
        }
        return (i * getStepValue()) + this.f15288k;
    }

    public int getLowerLimit() {
        return this.f15297t;
    }

    public int getUpperLimit() {
        return this.f15299v;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f15290m);
        }
    }

    public void setAccessibilityIncrements(List<String> list) {
        this.f15295r = list;
    }

    public void setAccessibilityUnits(String str) {
        this.f15294q = str;
    }

    public void setLowerLimit(double d) {
        this.f15296s = d;
        m25286g();
    }

    public void setMaxValue(double d) {
        this.f15289l = d;
        m25287f();
    }

    public void setMinValue(double d) {
        this.f15288k = d;
        m25287f();
    }

    public void setStep(double d) {
        this.f15292o = d;
        m25287f();
    }

    public void setThumbImage(String str) {
        if (str != null) {
            setThumb(m25291b(str));
            setSplitTrack(false);
            return;
        }
        setThumb(getThumb());
    }

    public void setUpperLimit(double d) {
        this.f15298u = d;
        m25285h();
    }

    public void setValue(double d) {
        this.f15290m = d;
        m25284i();
    }

    public void setupAccessibility(int i) {
        List<String> list;
        if (this.f15294q != null && (list = this.f15295r) != null && list.size() - 1 == ((int) this.f15289l)) {
            String str = this.f15295r.get(i);
            int length = this.f15294q.length();
            String str2 = this.f15294q;
            if (str != null && Integer.parseInt(str) == 1) {
                str2 = str2.substring(0, length - 1);
            }
            announceForAccessibility(String.format("%s %s", str, str2));
        }
    }
}