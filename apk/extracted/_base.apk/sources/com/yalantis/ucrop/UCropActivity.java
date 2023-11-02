package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActivityC0294b;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0946a;
import androidx.transition.C1881j;
import androidx.transition.Transition;
import com.yalantis.ucrop.view.C5702b;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p330s0.C12338a;
import p354te.C12667a;
import re.C12124a;
import re.C12125b;
import re.C12126c;
import re.C12127d;
import re.C12128e;
import re.C12129f;
import re.C12130g;
import se.InterfaceC12460a;
import ve.C13269i;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class UCropActivity extends ActivityC0294b {

    /* renamed from: N */
    public static final Bitmap.CompressFormat f15866N = Bitmap.CompressFormat.JPEG;

    /* renamed from: A */
    private ViewGroup f15867A;

    /* renamed from: B */
    private ViewGroup f15868B;

    /* renamed from: C */
    private ViewGroup f15869C;

    /* renamed from: E */
    private TextView f15871E;

    /* renamed from: F */
    private TextView f15872F;

    /* renamed from: G */
    private View f15873G;

    /* renamed from: H */
    private Transition f15874H;

    /* renamed from: j */
    private String f15880j;

    /* renamed from: k */
    private int f15881k;

    /* renamed from: l */
    private int f15882l;

    /* renamed from: m */
    private int f15883m;

    /* renamed from: n */
    private int f15884n;

    /* renamed from: o */
    private int f15885o;

    /* renamed from: p */
    private int f15886p;

    /* renamed from: q */
    private int f15887q;

    /* renamed from: r */
    private int f15888r;

    /* renamed from: s */
    private boolean f15889s;

    /* renamed from: u */
    private UCropView f15891u;

    /* renamed from: v */
    private GestureCropImageView f15892v;

    /* renamed from: w */
    private OverlayView f15893w;

    /* renamed from: x */
    private ViewGroup f15894x;

    /* renamed from: y */
    private ViewGroup f15895y;

    /* renamed from: z */
    private ViewGroup f15896z;

    /* renamed from: t */
    private boolean f15890t = true;

    /* renamed from: D */
    private List<ViewGroup> f15870D = new ArrayList();

    /* renamed from: I */
    private Bitmap.CompressFormat f15875I = f15866N;

    /* renamed from: J */
    private int f15876J = 90;

    /* renamed from: K */
    private int[] f15877K = {1, 2, 3};

    /* renamed from: L */
    private C5702b.InterfaceC5704b f15878L = new C5683a();

    /* renamed from: M */
    private final View.OnClickListener f15879M = new View$OnClickListenerC5689g();

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5683a implements C5702b.InterfaceC5704b {
        C5683a() {
        }

        @Override // com.yalantis.ucrop.view.C5702b.InterfaceC5704b
        /* renamed from: a */
        public void mo24640a() {
            UCropActivity.this.f15891u.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f15873G.setClickable(false);
            UCropActivity.this.f15890t = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.C5702b.InterfaceC5704b
        /* renamed from: b */
        public void mo24639b(Exception exc) {
            UCropActivity.this.m24714y(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.C5702b.InterfaceC5704b
        /* renamed from: c */
        public void mo24638c(float f) {
            UCropActivity.this.m24746A(f);
        }

        @Override // com.yalantis.ucrop.view.C5702b.InterfaceC5704b
        /* renamed from: d */
        public void mo24637d(float f) {
            UCropActivity.this.m24718u(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC5684b implements View.OnClickListener {
        View$OnClickListenerC5684b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            UCropActivity.this.f15892v.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).m24635f(view.isSelected()));
            UCropActivity.this.f15892v.m24654z();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.f15870D) {
                    if (viewGroup == view) {
                        z = true;
                    } else {
                        z = false;
                    }
                    viewGroup.setSelected(z);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5685c implements HorizontalProgressWheelView.InterfaceC5705a {
        C5685c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC5705a
        /* renamed from: a */
        public void mo24629a() {
            UCropActivity.this.f15892v.m24654z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC5705a
        /* renamed from: b */
        public void mo24628b() {
            UCropActivity.this.f15892v.m24660t();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC5705a
        /* renamed from: c */
        public void mo24627c(float f, float f2) {
            UCropActivity.this.f15892v.m24656x(f / 42.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC5686d implements View.OnClickListener {
        View$OnClickListenerC5686d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.m24721r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC5687e implements View.OnClickListener {
        View$OnClickListenerC5687e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.m24720s(90);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5688f implements HorizontalProgressWheelView.InterfaceC5705a {
        C5688f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC5705a
        /* renamed from: a */
        public void mo24629a() {
            UCropActivity.this.f15892v.m24654z();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC5705a
        /* renamed from: b */
        public void mo24628b() {
            UCropActivity.this.f15892v.m24660t();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC5705a
        /* renamed from: c */
        public void mo24627c(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.f15892v.m24668C(UCropActivity.this.f15892v.getCurrentScale() + (f * ((UCropActivity.this.f15892v.getMaxScale() - UCropActivity.this.f15892v.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f15892v.m24666E(UCropActivity.this.f15892v.getCurrentScale() + (f * ((UCropActivity.this.f15892v.getMaxScale() - UCropActivity.this.f15892v.getMinScale()) / 15000.0f)));
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC5689g implements View.OnClickListener {
        View$OnClickListenerC5689g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.m24743D(view.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yalantis.ucrop.UCropActivity$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5690h implements InterfaceC12460a {
        C5690h() {
        }

        @Override // se.InterfaceC12460a
        /* renamed from: a */
        public void mo5220a(Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.m24713z(uri, uCropActivity.f15892v.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        @Override // se.InterfaceC12460a
        /* renamed from: b */
        public void mo5219b(Throwable th2) {
            UCropActivity.this.m24714y(th2);
            UCropActivity.this.finish();
        }
    }

    static {
        AppCompatDelegate.m40744K(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m24746A(float f) {
        TextView textView = this.f15872F;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
        }
    }

    /* renamed from: B */
    private void m24745B(int i) {
        TextView textView = this.f15872F;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @TargetApi(21)
    /* renamed from: C */
    private void m24744C(int i) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m24743D(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        if (!this.f15889s) {
            return;
        }
        ViewGroup viewGroup = this.f15894x;
        int i4 = C12127d.f31470n;
        if (i == i4) {
            z = true;
        } else {
            z = false;
        }
        viewGroup.setSelected(z);
        ViewGroup viewGroup2 = this.f15895y;
        int i5 = C12127d.f31471o;
        if (i == i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        viewGroup2.setSelected(z2);
        ViewGroup viewGroup3 = this.f15896z;
        int i6 = C12127d.f31472p;
        if (i == i6) {
            z3 = true;
        } else {
            z3 = false;
        }
        viewGroup3.setSelected(z3);
        ViewGroup viewGroup4 = this.f15867A;
        int i7 = 8;
        if (i == i4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewGroup4.setVisibility(i2);
        ViewGroup viewGroup5 = this.f15868B;
        if (i == i5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        viewGroup5.setVisibility(i3);
        ViewGroup viewGroup6 = this.f15869C;
        if (i == i6) {
            i7 = 0;
        }
        viewGroup6.setVisibility(i7);
        m24725n(i);
        if (i == i6) {
            m24719t(0);
        } else if (i == i5) {
            m24719t(1);
        } else {
            m24719t(2);
        }
    }

    /* renamed from: E */
    private void m24742E() {
        m24744C(this.f15882l);
        Toolbar toolbar = (Toolbar) findViewById(C12127d.f31476t);
        toolbar.setBackgroundColor(this.f15881k);
        toolbar.setTitleTextColor(this.f15884n);
        TextView textView = (TextView) toolbar.findViewById(C12127d.f31477u);
        textView.setTextColor(this.f15884n);
        textView.setText(this.f15880j);
        Drawable mutate = C0946a.m38399e(this, this.f15886p).mutate();
        mutate.setColorFilter(this.f15884n, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo40512t(false);
        }
    }

    /* renamed from: F */
    private void m24741F(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new C12667a(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new C12667a(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new C12667a(getString(C12130g.f31490c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new C12667a(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new C12667a(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C12127d.f31463g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(C12128e.f31484b, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f15883m);
            aspectRatioTextView.setAspectRatio((C12667a) it.next());
            linearLayout.addView(frameLayout);
            this.f15870D.add(frameLayout);
        }
        this.f15870D.get(intExtra).setSelected(true);
        for (ViewGroup viewGroup : this.f15870D) {
            viewGroup.setOnClickListener(new View$OnClickListenerC5684b());
        }
    }

    /* renamed from: G */
    private void m24740G() {
        this.f15871E = (TextView) findViewById(C12127d.f31474r);
        int i = C12127d.f31468l;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C5685c());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f15883m);
        findViewById(C12127d.f31482z).setOnClickListener(new View$OnClickListenerC5686d());
        findViewById(C12127d.f31456A).setOnClickListener(new View$OnClickListenerC5687e());
        m24717v(this.f15883m);
    }

    /* renamed from: H */
    private void m24739H() {
        this.f15872F = (TextView) findViewById(C12127d.f31475s);
        int i = C12127d.f31469m;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C5688f());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f15883m);
        m24745B(this.f15883m);
    }

    /* renamed from: I */
    private void m24738I() {
        ImageView imageView = (ImageView) findViewById(C12127d.f31462f);
        ImageView imageView2 = (ImageView) findViewById(C12127d.f31461e);
        ImageView imageView3 = (ImageView) findViewById(C12127d.f31460d);
        imageView.setImageDrawable(new C13269i(imageView.getDrawable(), this.f15883m));
        imageView2.setImageDrawable(new C13269i(imageView2.getDrawable(), this.f15883m));
        imageView3.setImageDrawable(new C13269i(imageView3.getDrawable(), this.f15883m));
    }

    /* renamed from: J */
    private void m24737J(Intent intent) {
        this.f15882l = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", C0946a.m38401c(this, C12124a.f31438h));
        this.f15881k = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", C0946a.m38401c(this, C12124a.f31439i));
        this.f15883m = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", C0946a.m38401c(this, C12124a.f31431a));
        this.f15884n = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", C0946a.m38401c(this, C12124a.f31440j));
        this.f15886p = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", C12126c.f31454a);
        this.f15887q = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", C12126c.f31455b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f15880j = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(C12130g.f31489b);
        }
        this.f15880j = stringExtra;
        this.f15888r = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", C0946a.m38401c(this, C12124a.f31436f));
        this.f15889s = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f15885o = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", C0946a.m38401c(this, C12124a.f31432b));
        m24742E();
        m24723p();
        if (this.f15889s) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(C12127d.f31480x)).findViewById(C12127d.f31457a);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(C12128e.f31485c, viewGroup, true);
            C12338a c12338a = new C12338a();
            this.f15874H = c12338a;
            c12338a.mo35138X(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(C12127d.f31470n);
            this.f15894x = viewGroup2;
            viewGroup2.setOnClickListener(this.f15879M);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(C12127d.f31471o);
            this.f15895y = viewGroup3;
            viewGroup3.setOnClickListener(this.f15879M);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(C12127d.f31472p);
            this.f15896z = viewGroup4;
            viewGroup4.setOnClickListener(this.f15879M);
            this.f15867A = (ViewGroup) findViewById(C12127d.f31463g);
            this.f15868B = (ViewGroup) findViewById(C12127d.f31464h);
            this.f15869C = (ViewGroup) findViewById(C12127d.f31465i);
            m24741F(intent);
            m24740G();
            m24739H();
            m24738I();
        }
    }

    /* renamed from: m */
    private void m24726m() {
        if (this.f15873G == null) {
            this.f15873G = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, C12127d.f31476t);
            this.f15873G.setLayoutParams(layoutParams);
            this.f15873G.setClickable(true);
        }
        ((RelativeLayout) findViewById(C12127d.f31480x)).addView(this.f15873G);
    }

    /* renamed from: n */
    private void m24725n(int i) {
        int i2;
        int i3;
        C1881j.m35148a((ViewGroup) findViewById(C12127d.f31480x), this.f15874H);
        View findViewById = this.f15896z.findViewById(C12127d.f31475s);
        int i4 = 0;
        if (i == C12127d.f31472p) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        View findViewById2 = this.f15894x.findViewById(C12127d.f31473q);
        if (i == C12127d.f31470n) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById2.setVisibility(i3);
        View findViewById3 = this.f15895y.findViewById(C12127d.f31474r);
        if (i != C12127d.f31471o) {
            i4 = 8;
        }
        findViewById3.setVisibility(i4);
    }

    /* renamed from: p */
    private void m24723p() {
        UCropView uCropView = (UCropView) findViewById(C12127d.f31478v);
        this.f15891u = uCropView;
        this.f15892v = uCropView.getCropImageView();
        this.f15893w = this.f15891u.getOverlayView();
        this.f15892v.setTransformImageListener(this.f15878L);
        ((ImageView) findViewById(C12127d.f31459c)).setColorFilter(this.f15888r, PorterDuff.Mode.SRC_ATOP);
        int i = C12127d.f31479w;
        findViewById(i).setBackgroundColor(this.f15885o);
        if (!this.f15889s) {
            ((RelativeLayout.LayoutParams) findViewById(i).getLayoutParams()).bottomMargin = 0;
            findViewById(i).requestLayout();
        }
    }

    /* renamed from: q */
    private void m24722q(Intent intent) {
        Bitmap.CompressFormat compressFormat;
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        if (!TextUtils.isEmpty(stringExtra)) {
            compressFormat = Bitmap.CompressFormat.valueOf(stringExtra);
        } else {
            compressFormat = null;
        }
        if (compressFormat == null) {
            compressFormat = f15866N;
        }
        this.f15875I = compressFormat;
        this.f15876J = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f15877K = intArrayExtra;
        }
        this.f15892v.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f15892v.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f15892v.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f15893w.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f15893w.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(C12124a.f31435e)));
        this.f15893w.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f15893w.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f15893w.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(C12124a.f31433c)));
        this.f15893w.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(C12125b.f31444a)));
        this.f15893w.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f15893w.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f15893w.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        OverlayView overlayView = this.f15893w;
        Resources resources = getResources();
        int i = C12124a.f31434d;
        overlayView.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", resources.getColor(i)));
        this.f15893w.setCropGridCornerColor(intent.getIntExtra("com.yalantis.ucrop.CropGridCornerColor", getResources().getColor(i)));
        this.f15893w.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(C12125b.f31445b)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup = this.f15894x;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f15892v.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra != null && intExtra < parcelableArrayListExtra.size()) {
            this.f15892v.setTargetAspectRatio(((C12667a) parcelableArrayListExtra.get(intExtra)).m4569b() / ((C12667a) parcelableArrayListExtra.get(intExtra)).m4568d());
        } else {
            this.f15892v.setTargetAspectRatio(0.0f);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.f15892v.setMaxResultImageSizeX(intExtra2);
            this.f15892v.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m24721r() {
        GestureCropImageView gestureCropImageView = this.f15892v;
        gestureCropImageView.m24656x(-gestureCropImageView.getCurrentAngle());
        this.f15892v.m24654z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m24720s(int i) {
        this.f15892v.m24656x(i);
        this.f15892v.m24654z();
    }

    /* renamed from: t */
    private void m24719t(int i) {
        boolean z;
        GestureCropImageView gestureCropImageView = this.f15892v;
        int i2 = this.f15877K[i];
        boolean z2 = false;
        if (i2 != 3 && i2 != 1) {
            z = false;
        } else {
            z = true;
        }
        gestureCropImageView.setScaleEnabled(z);
        GestureCropImageView gestureCropImageView2 = this.f15892v;
        int i3 = this.f15877K[i];
        if (i3 == 3 || i3 == 2) {
            z2 = true;
        }
        gestureCropImageView2.setRotateEnabled(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m24718u(float f) {
        TextView textView = this.f15871E;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f)));
        }
    }

    /* renamed from: v */
    private void m24717v(int i) {
        TextView textView = this.f15871E;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: w */
    private void m24716w(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        m24722q(intent);
        if (uri != null && uri2 != null) {
            try {
                this.f15892v.m24642n(uri, uri2);
                return;
            } catch (Exception e) {
                m24714y(e);
                finish();
                return;
            }
        }
        m24714y(new NullPointerException(getString(C12130g.f31488a)));
        finish();
    }

    /* renamed from: x */
    private void m24715x() {
        if (this.f15889s) {
            if (this.f15894x.getVisibility() == 0) {
                m24743D(C12127d.f31470n);
                return;
            } else {
                m24743D(C12127d.f31472p);
                return;
            }
        }
        m24719t(0);
    }

    /* renamed from: o */
    protected void m24724o() {
        this.f15873G.setClickable(true);
        this.f15890t = true;
        supportInvalidateOptionsMenu();
        this.f15892v.m24659u(this.f15875I, this.f15876J, new C5690h());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12128e.f31483a);
        Intent intent = getIntent();
        m24737J(intent);
        m24716w(intent);
        m24715x();
        m24726m();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C12129f.f31487a, menu);
        MenuItem findItem = menu.findItem(C12127d.f31467k);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f15884n, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                Log.i("UCropActivity", String.format("%s - %s", e.getMessage(), getString(C12130g.f31491d)));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(C12127d.f31466j);
        Drawable m38399e = C0946a.m38399e(this, this.f15887q);
        if (m38399e != null) {
            m38399e.mutate();
            m38399e.setColorFilter(this.f15884n, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(m38399e);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C12127d.f31466j) {
            m24724o();
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(C12127d.f31466j).setVisible(!this.f15890t);
        menu.findItem(C12127d.f31467k).setVisible(this.f15890t);
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0294b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f15892v;
        if (gestureCropImageView != null) {
            gestureCropImageView.m24660t();
        }
    }

    /* renamed from: y */
    protected void m24714y(Throwable th2) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th2));
    }

    /* renamed from: z */
    protected void m24713z(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }
}
