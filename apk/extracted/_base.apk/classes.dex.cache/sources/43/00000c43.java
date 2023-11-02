package com.budiyev.android.codescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Objects;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class CodeScannerView extends ViewGroup {

    /* renamed from: D */
    private static final EnumC2799b f7574D = EnumC2799b.TOP_START;

    /* renamed from: E */
    private static final EnumC2799b f7575E = EnumC2799b.TOP_END;

    /* renamed from: A */
    private InterfaceC2797e f7576A;

    /* renamed from: B */
    private CodeScanner f7577B;

    /* renamed from: C */
    private int f7578C;

    /* renamed from: j */
    private SurfaceView f7579j;

    /* renamed from: k */
    private C2818o f7580k;

    /* renamed from: l */
    private ImageView f7581l;

    /* renamed from: m */
    private EnumC2799b f7582m;

    /* renamed from: n */
    private int f7583n;

    /* renamed from: o */
    private int f7584o;

    /* renamed from: p */
    private int f7585p;

    /* renamed from: q */
    private Drawable f7586q;

    /* renamed from: r */
    private Drawable f7587r;

    /* renamed from: s */
    private ImageView f7588s;

    /* renamed from: t */
    private EnumC2799b f7589t;

    /* renamed from: u */
    private int f7590u;

    /* renamed from: v */
    private int f7591v;

    /* renamed from: w */
    private int f7592w;

    /* renamed from: x */
    private Drawable f7593x;

    /* renamed from: y */
    private Drawable f7594y;

    /* renamed from: z */
    private C2809i f7595z;

    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C2793a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7596a;

        static {
            int[] iArr = new int[EnumC2799b.values().length];
            f7596a = iArr;
            try {
                iArr[EnumC2799b.TOP_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7596a[EnumC2799b.TOP_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7596a[EnumC2799b.BOTTOM_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7596a[EnumC2799b.BOTTOM_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class View$OnClickListenerC2794b implements View.OnClickListener {
        private View$OnClickListenerC2794b() {
            CodeScannerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CodeScanner codeScanner = CodeScannerView.this.f7577B;
            if (codeScanner != null && codeScanner.m32272P()) {
                boolean z = !codeScanner.m32273O();
                codeScanner.m32263Y(z);
                CodeScannerView.this.setAutoFocusEnabled(z);
            }
        }

        /* synthetic */ View$OnClickListenerC2794b(CodeScannerView codeScannerView, C2793a c2793a) {
            this();
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class View$OnClickListenerC2795c implements View.OnClickListener {
        private View$OnClickListenerC2795c() {
            CodeScannerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CodeScanner codeScanner = CodeScannerView.this.f7577B;
            if (codeScanner != null && codeScanner.m32270R()) {
                boolean z = !codeScanner.m32271Q();
                codeScanner.m32254d0(z);
                CodeScannerView.this.setFlashEnabled(z);
            }
        }

        /* synthetic */ View$OnClickListenerC2795c(CodeScannerView codeScannerView, C2793a c2793a) {
            this();
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2796d extends ViewGroup.MarginLayoutParams {
        public C2796d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2796d(int i, int i2) {
            super(i, i2);
        }

        public C2796d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2796d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.budiyev.android.codescanner.CodeScannerView$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC2797e {
        /* renamed from: a */
        void mo32214a(int i, int i2);
    }

    public CodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32219d(context, attributeSet, 0, 0);
    }

    /* renamed from: b */
    private static EnumC2799b m32221b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC2799b.TOP_START;
                }
                return EnumC2799b.BOTTOM_END;
            }
            return EnumC2799b.BOTTOM_START;
        }
        return EnumC2799b.TOP_END;
    }

    /* renamed from: c */
    private static int m32220c(EnumC2799b enumC2799b) {
        int i = C2793a.f7596a[enumC2799b.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return i != 4 ? 0 : 3;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: d */
    private void m32219d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArray;
        this.f7579j = new SurfaceView(context);
        this.f7580k = new C2818o(context);
        float f = context.getResources().getDisplayMetrics().density;
        int round = Math.round(16.0f * f);
        this.f7578C = Math.round(20.0f * f);
        ImageView imageView = new ImageView(context);
        this.f7581l = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f7581l.setOnClickListener(new View$OnClickListenerC2794b(this, null));
        ImageView imageView2 = new ImageView(context);
        this.f7588s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.f7588s.setOnClickListener(new View$OnClickListenerC2795c(this, null));
        if (attributeSet == null) {
            m32215h(1.0f, 1.0f);
            setMaskColor(1996488704);
            setMaskVisible(true);
            setFrameColor(-1);
            setFrameVisible(true);
            setFrameThickness(Math.round(2.0f * f));
            setFrameCornersSize(Math.round(50.0f * f));
            setFrameCornersRadius(Math.round(f * 0.0f));
            setFrameCornersCapRounded(false);
            setFrameSize(0.75f);
            setFrameVerticalBias(0.5f);
            setAutoFocusButtonColor(-1);
            setFlashButtonColor(-1);
            setAutoFocusButtonVisible(true);
            setAutoFocusButtonPosition(f7574D);
            setFlashButtonVisible(true);
            setFlashButtonPosition(f7575E);
            setAutoFocusButtonPaddingHorizontal(round);
            setAutoFocusButtonPaddingVertical(round);
            setFlashButtonPaddingHorizontal(round);
            setFlashButtonPaddingVertical(round);
            setAutoFocusButtonOnIcon(C2814n.m32165l(context, C2810j.f7642b));
            setAutoFocusButtonOffIcon(C2814n.m32165l(context, C2810j.f7641a));
            setFlashButtonOnIcon(C2814n.m32165l(context, C2810j.f7644d));
            setFlashButtonOffIcon(C2814n.m32165l(context, C2810j.f7643c));
        } else {
            try {
                typedArray = context.getTheme().obtainStyledAttributes(attributeSet, C2811k.f7646a, i, i2);
            } catch (Throwable th2) {
                th = th2;
                typedArray = null;
            }
            try {
                setMaskColor(typedArray.getColor(C2811k.f7671z, 1996488704));
                setMaskVisible(typedArray.getBoolean(C2811k.f7645A, true));
                setFrameColor(typedArray.getColor(C2811k.f7663r, -1));
                setFrameVisible(typedArray.getBoolean(C2811k.f7670y, true));
                setFrameThickness(typedArray.getDimensionPixelOffset(C2811k.f7668w, Math.round(2.0f * f)));
                setFrameCornersSize(typedArray.getDimensionPixelOffset(C2811k.f7666u, Math.round(50.0f * f)));
                setFrameCornersRadius(typedArray.getDimensionPixelOffset(C2811k.f7665t, Math.round(f * 0.0f)));
                setFrameCornersCapRounded(typedArray.getBoolean(C2811k.f7664s, false));
                m32215h(typedArray.getFloat(C2811k.f7662q, 1.0f), typedArray.getFloat(C2811k.f7661p, 1.0f));
                setFrameSize(typedArray.getFloat(C2811k.f7667v, 0.75f));
                setFrameVerticalBias(typedArray.getFloat(C2811k.f7669x, 0.5f));
                setAutoFocusButtonVisible(typedArray.getBoolean(C2811k.f7653h, true));
                setAutoFocusButtonColor(typedArray.getColor(C2811k.f7647b, -1));
                setAutoFocusButtonPosition(m32221b(typedArray.getInt(C2811k.f7652g, m32220c(f7574D))));
                setAutoFocusButtonPaddingHorizontal(typedArray.getDimensionPixelOffset(C2811k.f7650e, round));
                setAutoFocusButtonPaddingVertical(typedArray.getDimensionPixelOffset(C2811k.f7651f, round));
                Drawable drawable = typedArray.getDrawable(C2811k.f7649d);
                if (drawable == null) {
                    drawable = C2814n.m32165l(context, C2810j.f7642b);
                }
                setAutoFocusButtonOnIcon(drawable);
                Drawable drawable2 = typedArray.getDrawable(C2811k.f7648c);
                if (drawable2 == null) {
                    drawable2 = C2814n.m32165l(context, C2810j.f7641a);
                }
                setAutoFocusButtonOffIcon(drawable2);
                setFlashButtonVisible(typedArray.getBoolean(C2811k.f7660o, true));
                setFlashButtonColor(typedArray.getColor(C2811k.f7654i, -1));
                setFlashButtonPosition(m32221b(typedArray.getInt(C2811k.f7659n, m32220c(f7575E))));
                setFlashButtonPaddingHorizontal(typedArray.getDimensionPixelOffset(C2811k.f7657l, round));
                setFlashButtonPaddingVertical(typedArray.getDimensionPixelOffset(C2811k.f7658m, round));
                Drawable drawable3 = typedArray.getDrawable(C2811k.f7656k);
                if (drawable3 == null) {
                    drawable3 = C2814n.m32165l(context, C2810j.f7644d);
                }
                setFlashButtonOnIcon(drawable3);
                Drawable drawable4 = typedArray.getDrawable(C2811k.f7655j);
                if (drawable4 == null) {
                    drawable4 = C2814n.m32165l(context, C2810j.f7643c);
                }
                setFlashButtonOffIcon(drawable4);
                typedArray.recycle();
            } catch (Throwable th3) {
                th = th3;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        }
        if (isInEditMode()) {
            setAutoFocusEnabled(true);
            setFlashEnabled(true);
        }
        addView(this.f7579j, new C2796d(-1, -1));
        addView(this.f7580k, new C2796d(-1, -1));
        addView(this.f7581l, new C2796d(-2, -2));
        addView(this.f7588s, new C2796d(-2, -2));
    }

    /* renamed from: e */
    private void m32218e() {
        int i = this.f7583n;
        int i2 = this.f7584o;
        this.f7581l.setPadding(i, i2, i, i2);
    }

    /* renamed from: f */
    private void m32217f() {
        int i = this.f7590u;
        int i2 = this.f7591v;
        this.f7588s.setPadding(i, i2, i, i2);
    }

    /* renamed from: g */
    private void m32216g(View view, EnumC2799b enumC2799b, int i, int i2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int layoutDirection = getLayoutDirection();
        int i3 = C2793a.f7596a[enumC2799b.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (layoutDirection == 1) {
                            view.layout(0, i2 - measuredHeight, measuredWidth, i2);
                        } else {
                            view.layout(i - measuredWidth, i2 - measuredHeight, i, i2);
                        }
                    }
                } else if (layoutDirection == 1) {
                    view.layout(i - measuredWidth, i2 - measuredHeight, i, i2);
                } else {
                    view.layout(0, i2 - measuredHeight, measuredWidth, i2);
                }
            } else if (layoutDirection == 1) {
                view.layout(0, 0, measuredWidth, measuredHeight);
            } else {
                view.layout(i - measuredWidth, 0, i, measuredHeight);
            }
        } else if (layoutDirection == 1) {
            view.layout(i - measuredWidth, 0, i, measuredHeight);
        } else {
            view.layout(0, 0, measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2796d;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2796d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2796d(getContext(), attributeSet);
    }

    public int getAutoFocusButtonColor() {
        return this.f7585p;
    }

    public Drawable getAutoFocusButtonOffIcon() {
        return this.f7587r;
    }

    public Drawable getAutoFocusButtonOnIcon() {
        return this.f7586q;
    }

    public int getAutoFocusButtonPaddingHorizontal() {
        return this.f7583n;
    }

    public int getAutoFocusButtonPaddingVertical() {
        return this.f7584o;
    }

    public EnumC2799b getAutoFocusButtonPosition() {
        return this.f7582m;
    }

    public int getFlashButtonColor() {
        return this.f7592w;
    }

    public Drawable getFlashButtonOffIcon() {
        return this.f7594y;
    }

    public Drawable getFlashButtonOnIcon() {
        return this.f7593x;
    }

    public int getFlashButtonPaddingHorizontal() {
        return this.f7590u;
    }

    public int getFlashButtonPaddingVertical() {
        return this.f7591v;
    }

    public EnumC2799b getFlashButtonPosition() {
        return this.f7589t;
    }

    public float getFrameAspectRatioHeight() {
        return this.f7580k.m32154a();
    }

    public float getFrameAspectRatioWidth() {
        return this.f7580k.m32153b();
    }

    public int getFrameColor() {
        return this.f7580k.m32152c();
    }

    public int getFrameCornersRadius() {
        return this.f7580k.m32151d();
    }

    public int getFrameCornersSize() {
        return this.f7580k.m32150e();
    }

    public C2812l getFrameRect() {
        return this.f7580k.m32149f();
    }

    public float getFrameSize() {
        return this.f7580k.m32148g();
    }

    public int getFrameThickness() {
        return this.f7580k.m32147h();
    }

    public float getFrameVerticalBias() {
        return this.f7580k.m32146i();
    }

    public int getMaskColor() {
        return this.f7580k.m32145j();
    }

    public SurfaceView getPreviewView() {
        return this.f7579j;
    }

    C2818o getViewFinderView() {
        return this.f7580k;
    }

    /* renamed from: h */
    public void m32215h(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.f7580k.m32142m(f, f2);
            return;
        }
        throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        if (childCount <= 5) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            C2809i c2809i = this.f7595z;
            int i11 = 0;
            if (c2809i == null) {
                this.f7579j.layout(0, 0, i9, i10);
            } else {
                int m32188a = c2809i.m32188a();
                if (m32188a > i9) {
                    int i12 = (m32188a - i9) / 2;
                    i5 = 0 - i12;
                    i6 = i12 + i9;
                } else {
                    i5 = 0;
                    i6 = i9;
                }
                int m32187b = c2809i.m32187b();
                if (m32187b > i10) {
                    int i13 = (m32187b - i10) / 2;
                    i7 = 0 - i13;
                    i8 = i13 + i10;
                } else {
                    i7 = 0;
                    i8 = i10;
                }
                this.f7579j.layout(i5, i7, i6, i8);
            }
            this.f7580k.layout(0, 0, i9, i10);
            m32216g(this.f7581l, this.f7582m, i9, i10);
            m32216g(this.f7588s, this.f7589t, i9, i10);
            if (childCount == 5) {
                C2812l m32149f = this.f7580k.m32149f();
                if (m32149f != null) {
                    i11 = m32149f.m32184c();
                }
                View childAt = getChildAt(4);
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                if (childAt.getVisibility() != 8) {
                    C2796d c2796d = (C2796d) childAt.getLayoutParams();
                    int i14 = paddingLeft + ((ViewGroup.MarginLayoutParams) c2796d).leftMargin;
                    int i15 = paddingTop + ((ViewGroup.MarginLayoutParams) c2796d).topMargin + i11;
                    childAt.layout(i14, i15, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + i15);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("CodeScannerView can have zero or one child");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        if (childCount <= 5) {
            measureChildWithMargins(this.f7579j, i, 0, i2, 0);
            measureChildWithMargins(this.f7580k, i, 0, i2, 0);
            measureChildWithMargins(this.f7581l, i, 0, i2, 0);
            measureChildWithMargins(this.f7588s, i, 0, i2, 0);
            if (childCount == 5) {
                C2812l m32149f = this.f7580k.m32149f();
                View childAt = getChildAt(4);
                if (m32149f != null) {
                    i3 = m32149f.m32184c();
                } else {
                    i3 = 0;
                }
                measureChildWithMargins(childAt, i, 0, i2, i3);
            }
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            return;
        }
        throw new IllegalStateException("CodeScannerView can have zero or one child");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC2797e interfaceC2797e = this.f7576A;
        if (interfaceC2797e != null) {
            interfaceC2797e.mo32214a(i, i2);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CodeScanner codeScanner = this.f7577B;
        C2812l frameRect = getFrameRect();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (codeScanner != null && frameRect != null && codeScanner.m32272P() && codeScanner.m32269S() && motionEvent.getAction() == 0 && frameRect.m32178i(x, y)) {
            int i = this.f7578C;
            codeScanner.m32268T(new C2812l(x - i, y - i, x + i, y + i).m32185b(frameRect));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAutoFocusButtonColor(int i) {
        this.f7585p = i;
        this.f7581l.setColorFilter(i);
    }

    public void setAutoFocusButtonOffIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7587r) {
            z = true;
        } else {
            z = false;
        }
        this.f7587r = drawable;
        CodeScanner codeScanner = this.f7577B;
        if (z && codeScanner != null) {
            setAutoFocusEnabled(codeScanner.m32273O());
        }
    }

    public void setAutoFocusButtonOnIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7586q) {
            z = true;
        } else {
            z = false;
        }
        this.f7586q = drawable;
        CodeScanner codeScanner = this.f7577B;
        if (z && codeScanner != null) {
            setAutoFocusEnabled(codeScanner.m32273O());
        }
    }

    public void setAutoFocusButtonPaddingHorizontal(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7583n) {
                z = true;
            } else {
                z = false;
            }
            this.f7583n = i;
            if (z) {
                m32218e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setAutoFocusButtonPaddingVertical(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7584o) {
                z = true;
            } else {
                z = false;
            }
            this.f7584o = i;
            if (z) {
                m32218e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setAutoFocusButtonPosition(EnumC2799b enumC2799b) {
        boolean z;
        Objects.requireNonNull(enumC2799b);
        if (enumC2799b != this.f7582m) {
            z = true;
        } else {
            z = false;
        }
        this.f7582m = enumC2799b;
        if (z && isLaidOut()) {
            requestLayout();
        }
    }

    public void setAutoFocusButtonVisible(boolean z) {
        this.f7581l.setVisibility(z ? 0 : 4);
    }

    public void setAutoFocusEnabled(boolean z) {
        Drawable drawable;
        ImageView imageView = this.f7581l;
        if (z) {
            drawable = this.f7586q;
        } else {
            drawable = this.f7587r;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setCodeScanner(CodeScanner codeScanner) {
        if (this.f7577B == null) {
            this.f7577B = codeScanner;
            setAutoFocusEnabled(codeScanner.m32273O());
            setFlashEnabled(codeScanner.m32271Q());
            return;
        }
        throw new IllegalStateException("Code scanner has already been set");
    }

    public void setFlashButtonColor(int i) {
        this.f7592w = i;
        this.f7588s.setColorFilter(i);
    }

    public void setFlashButtonOffIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7594y) {
            z = true;
        } else {
            z = false;
        }
        this.f7594y = drawable;
        CodeScanner codeScanner = this.f7577B;
        if (z && codeScanner != null) {
            setFlashEnabled(codeScanner.m32271Q());
        }
    }

    public void setFlashButtonOnIcon(Drawable drawable) {
        boolean z;
        Objects.requireNonNull(drawable);
        if (drawable != this.f7593x) {
            z = true;
        } else {
            z = false;
        }
        this.f7593x = drawable;
        CodeScanner codeScanner = this.f7577B;
        if (z && codeScanner != null) {
            setFlashEnabled(codeScanner.m32271Q());
        }
    }

    public void setFlashButtonPaddingHorizontal(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7590u) {
                z = true;
            } else {
                z = false;
            }
            this.f7590u = i;
            if (z) {
                m32217f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setFlashButtonPaddingVertical(int i) {
        boolean z;
        if (i >= 0) {
            if (i != this.f7591v) {
                z = true;
            } else {
                z = false;
            }
            this.f7591v = i;
            if (z) {
                m32217f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Padding should be equal to or grater then zero");
    }

    public void setFlashButtonPosition(EnumC2799b enumC2799b) {
        boolean z;
        Objects.requireNonNull(enumC2799b);
        if (enumC2799b != this.f7589t) {
            z = true;
        } else {
            z = false;
        }
        this.f7589t = enumC2799b;
        if (z) {
            requestLayout();
        }
    }

    public void setFlashButtonVisible(boolean z) {
        this.f7588s.setVisibility(z ? 0 : 4);
    }

    public void setFlashEnabled(boolean z) {
        this.f7588s.setImageDrawable(z ? this.f7593x : this.f7594y);
    }

    public void setFrameAspectRatioHeight(float f) {
        if (f > 0.0f) {
            this.f7580k.m32141n(f);
            return;
        }
        throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
    }

    public void setFrameAspectRatioWidth(float f) {
        if (f > 0.0f) {
            this.f7580k.m32140o(f);
            return;
        }
        throw new IllegalArgumentException("Frame aspect ratio values should be greater than zero");
    }

    public void setFrameColor(int i) {
        this.f7580k.m32139p(i);
    }

    public void setFrameCornersCapRounded(boolean z) {
        this.f7580k.m32138q(z);
    }

    public void setFrameCornersRadius(int i) {
        if (i >= 0) {
            this.f7580k.m32137r(i);
            return;
        }
        throw new IllegalArgumentException("Frame corners radius can't be negative");
    }

    public void setFrameCornersSize(int i) {
        if (i >= 0) {
            this.f7580k.m32136s(i);
            return;
        }
        throw new IllegalArgumentException("Frame corners size can't be negative");
    }

    public void setFrameSize(float f) {
        if (f >= 0.1d && f <= 1.0f) {
            this.f7580k.m32135t(f);
            return;
        }
        throw new IllegalArgumentException("Max frame size value should be between 0.1 and 1, inclusive");
    }

    public void setFrameThickness(int i) {
        if (i >= 0) {
            this.f7580k.m32134u(i);
            return;
        }
        throw new IllegalArgumentException("Frame thickness can't be negative");
    }

    public void setFrameVerticalBias(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.f7580k.m32133v(f);
            return;
        }
        throw new IllegalArgumentException("Max frame size value should be between 0 and 1, inclusive");
    }

    public void setFrameVisible(boolean z) {
        this.f7580k.m32132w(z);
    }

    public void setMaskColor(int i) {
        this.f7580k.m32131x(i);
    }

    public void setMaskVisible(boolean z) {
        this.f7580k.m32130y(z);
    }

    public void setPreviewSize(C2809i c2809i) {
        this.f7595z = c2809i;
        requestLayout();
    }

    public void setSizeListener(InterfaceC2797e interfaceC2797e) {
        this.f7576A = interfaceC2797e;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2796d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2796d(layoutParams);
    }
}