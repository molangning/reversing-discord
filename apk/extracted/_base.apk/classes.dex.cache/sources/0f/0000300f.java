package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActivityC0294b;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.C5651t;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p303qe.C11829a;
import p303qe.C11833c;

@Metadata(m14358d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0014J\u0006\u0010\f\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0004J\u0017\u0010%\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b%\u0010&J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0004J\u000e\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0004J\u0010\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0016R$\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u001103j\b\u0012\u0004\u0012\u00020\u0011`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0018\u0010I\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010AR\u0016\u0010L\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010DR\u0018\u0010O\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010>R\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010PR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010U\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010PR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010PR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010PR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010PR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010PR\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010DR\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010PR\u0014\u0010c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010DR\u0014\u0010e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010DR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u0004\u0018\u00010j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u0004\u0018\u00010n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010u\u001a\u0004\u0018\u00010r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0013\u0010y\u001a\u0004\u0018\u00010v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010|\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006\u0081\u0001"}, m14357d2 = {"Lcom/swmansion/rnscreens/s;", "Landroid/view/ViewGroup;", "", "f", "", "changed", "", "l", "t", "r", "b", ViewProps.ON_LAYOUT, "c", "onAttachedToWindow", "onDetachedFromWindow", "g", "index", "Lcom/swmansion/rnscreens/t;", "d", "i", "h", "child", "", "title", "setTitle", "titleFontFamily", "setTitleFontFamily", "fontWeightString", "setTitleFontWeight", "", "titleFontSize", "setTitleFontSize", ViewProps.COLOR, "setTitleColor", "setTintColor", "topInsetEnabled", "setTopInsetEnabled", "setBackgroundColor", "(Ljava/lang/Integer;)V", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "mConfigSubviews", "Lcom/swmansion/rnscreens/d;", "k", "Lcom/swmansion/rnscreens/d;", "getToolbar", "()Lcom/swmansion/rnscreens/d;", "toolbar", "Ljava/lang/Integer;", "headerTopInset", "m", "Ljava/lang/String;", "mTitle", "n", "I", "mTitleColor", "o", "mTitleFontFamily", "p", "mDirection", "q", "F", "mTitleFontSize", "mTitleFontWeight", "s", "mBackgroundColor", "Z", "mIsHidden", "u", "mIsBackButtonHidden", "v", "mIsShadowHidden", "w", "mDestroyed", "x", "mBackButtonInCustomView", "y", "mIsTopInsetEnabled", "z", "mIsTranslucent", "A", "mTintColor", "B", "mIsAttachedToWindow", "C", "mDefaultStartInset", "D", "mDefaultStartInsetWithNavigation", "Landroid/view/View$OnClickListener;", "E", "Landroid/view/View$OnClickListener;", "mBackClickListener", "Lcom/swmansion/rnscreens/j;", "getScreen", "()Lcom/swmansion/rnscreens/j;", "screen", "Lcom/swmansion/rnscreens/p;", "getScreenStack", "()Lcom/swmansion/rnscreens/p;", "screenStack", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "Lcom/swmansion/rnscreens/q;", "getScreenFragment", "()Lcom/swmansion/rnscreens/q;", "screenFragment", "getConfigSubviewsCount", "()I", "configSubviewsCount", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5649s extends ViewGroup {

    /* renamed from: A */
    private int f15772A;

    /* renamed from: B */
    private boolean f15773B;

    /* renamed from: C */
    private final int f15774C;

    /* renamed from: D */
    private final int f15775D;

    /* renamed from: E */
    private final View.OnClickListener f15776E;

    /* renamed from: j */
    private final ArrayList<C5651t> f15777j;

    /* renamed from: k */
    private final C5604d f15778k;

    /* renamed from: l */
    private Integer f15779l;

    /* renamed from: m */
    private String f15780m;

    /* renamed from: n */
    private int f15781n;

    /* renamed from: o */
    private String f15782o;

    /* renamed from: p */
    private String f15783p;

    /* renamed from: q */
    private float f15784q;

    /* renamed from: r */
    private int f15785r;

    /* renamed from: s */
    private Integer f15786s;

    /* renamed from: t */
    private boolean f15787t;

    /* renamed from: u */
    private boolean f15788u;

    /* renamed from: v */
    private boolean f15789v;

    /* renamed from: w */
    private boolean f15790w;

    /* renamed from: x */
    private boolean f15791x;

    /* renamed from: y */
    private boolean f15792y;

    /* renamed from: z */
    private boolean f15793z;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.swmansion.rnscreens.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C5650a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15794a;

        static {
            int[] iArr = new int[C5651t.EnumC5652a.values().length];
            try {
                iArr[C5651t.EnumC5652a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C5651t.EnumC5652a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C5651t.EnumC5652a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15794a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5649s(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.f15777j = new ArrayList<>(3);
        this.f15792y = true;
        this.f15776E = new View.OnClickListener() { // from class: com.swmansion.rnscreens.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5649s.m24826e(C5649s.this, view);
            }
        };
        setVisibility(8);
        C5604d c5604d = new C5604d(context, this);
        this.f15778k = c5604d;
        this.f15774C = c5604d.getContentInsetStart();
        this.f15775D = c5604d.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C5621h.f15669a, typedValue, true)) {
            c5604d.setBackgroundColor(typedValue.data);
        }
        c5604d.setClipChildren(false);
    }

    /* renamed from: e */
    public static final void m24826e(C5649s this$0, View view) {
        C9612q.m13917h(this$0, "this$0");
        C5644q screenFragment = this$0.getScreenFragment();
        if (screenFragment != null) {
            C5640p screenStack = this$0.getScreenStack();
            if (screenStack != null && C9612q.m13922c(screenStack.getRootScreen(), screenFragment.m24881q())) {
                Fragment parentFragment = screenFragment.getParentFragment();
                if (parentFragment instanceof C5644q) {
                    C5644q c5644q = (C5644q) parentFragment;
                    if (c5644q.m24881q().getNativeBackButtonDismissalEnabled()) {
                        c5644q.dismiss();
                    } else {
                        c5644q.m24890h();
                    }
                }
            } else if (screenFragment.m24881q().getNativeBackButtonDismissalEnabled()) {
                screenFragment.dismiss();
            } else {
                screenFragment.m24890h();
            }
        }
    }

    /* renamed from: f */
    private final void m24825f() {
        if (getParent() != null && !this.f15790w) {
            m24824g();
        }
    }

    private final C5623j getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C5623j) {
            return (C5623j) parent;
        }
        return null;
    }

    private final C5640p getScreenStack() {
        C5623j screen = getScreen();
        C5631l<?> container = screen != null ? screen.getContainer() : null;
        if (container instanceof C5640p) {
            return (C5640p) container;
        }
        return null;
    }

    private final TextView getTitleTextView() {
        int childCount = this.f15778k.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f15778k.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (C9612q.m13922c(textView.getText(), this.f15778k.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m24829b(C5651t child, int i) {
        C9612q.m13917h(child, "child");
        this.f15777j.add(i, child);
        m24825f();
    }

    /* renamed from: c */
    public final void m24828c() {
        this.f15790w = true;
    }

    /* renamed from: d */
    public final C5651t m24827d(int i) {
        C5651t c5651t = this.f15777j.get(i);
        C9612q.m13918g(c5651t, "mConfigSubviews[index]");
        return c5651t;
    }

    /* renamed from: g */
    public final void m24824g() {
        boolean z;
        FragmentActivity fragmentActivity;
        boolean z2;
        boolean z3;
        ImageView imageView;
        Drawable navigationIcon;
        int i;
        C5644q screenFragment;
        C5644q screenFragment2;
        ReactContext reactContext;
        C5640p screenStack = getScreenStack();
        if (screenStack != null && !C9612q.m13922c(screenStack.getTopScreen(), getParent())) {
            z = false;
        } else {
            z = true;
        }
        if (this.f15773B && z && !this.f15790w) {
            C5644q screenFragment3 = getScreenFragment();
            if (screenFragment3 != null) {
                fragmentActivity = screenFragment3.getActivity();
            } else {
                fragmentActivity = null;
            }
            ActivityC0294b activityC0294b = (ActivityC0294b) fragmentActivity;
            if (activityC0294b == null) {
                return;
            }
            String str = this.f15783p;
            if (str != null) {
                if (C9612q.m13922c(str, "rtl")) {
                    this.f15778k.setLayoutDirection(1);
                } else if (C9612q.m13922c(this.f15783p, "ltr")) {
                    this.f15778k.setLayoutDirection(0);
                }
            }
            C5623j screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContext = (ReactContext) context;
                } else {
                    C5634n fragment = screen.getFragment();
                    if (fragment != null) {
                        reactContext = fragment.m24874z();
                    } else {
                        reactContext = null;
                    }
                }
                C5656x.f15810a.m24799v(screen, activityC0294b, reactContext);
            }
            if (this.f15787t) {
                if (this.f15778k.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.m24840F();
                    return;
                }
                return;
            }
            if (this.f15778k.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.m24838H(this.f15778k);
            }
            if (this.f15792y) {
                Integer num = this.f15779l;
                C5604d c5604d = this.f15778k;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                c5604d.setPadding(0, i, 0, 0);
            } else if (this.f15778k.getPaddingTop() > 0) {
                this.f15778k.setPadding(0, 0, 0, 0);
            }
            activityC0294b.setSupportActionBar(this.f15778k);
            ActionBar supportActionBar = activityC0294b.getSupportActionBar();
            if (supportActionBar != null) {
                C9612q.m13918g(supportActionBar, "requireNotNull(activity.supportActionBar)");
                this.f15778k.setContentInsetStartWithNavigation(this.f15775D);
                C5604d c5604d2 = this.f15778k;
                int i2 = this.f15774C;
                c5604d2.m40070J(i2, i2);
                C5644q screenFragment4 = getScreenFragment();
                if (screenFragment4 != null && screenFragment4.m24843C()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !this.f15788u) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                supportActionBar.mo40513s(z3);
                this.f15778k.setNavigationOnClickListener(this.f15776E);
                C5644q screenFragment5 = getScreenFragment();
                if (screenFragment5 != null) {
                    screenFragment5.m24837I(this.f15789v);
                }
                C5644q screenFragment6 = getScreenFragment();
                if (screenFragment6 != null) {
                    screenFragment6.m24836J(this.f15793z);
                }
                supportActionBar.mo40509w(this.f15780m);
                if (TextUtils.isEmpty(this.f15780m)) {
                    this.f15778k.setContentInsetStartWithNavigation(0);
                }
                TextView titleTextView = getTitleTextView();
                int i3 = this.f15781n;
                if (i3 != 0) {
                    this.f15778k.setTitleTextColor(i3);
                }
                if (titleTextView != null) {
                    String str2 = this.f15782o;
                    if (str2 != null || this.f15785r > 0) {
                        Typeface applyStyles = ReactTypefaceUtils.applyStyles(null, 0, this.f15785r, str2, getContext().getAssets());
                        C9612q.m13918g(applyStyles, "applyStyles(\n           ….assets\n                )");
                        titleTextView.setTypeface(applyStyles);
                    }
                    float f = this.f15784q;
                    if (f > 0.0f) {
                        titleTextView.setTextSize(f);
                    }
                }
                Integer num2 = this.f15786s;
                if (num2 != null) {
                    this.f15778k.setBackgroundColor(num2.intValue());
                }
                if (this.f15772A != 0 && (navigationIcon = this.f15778k.getNavigationIcon()) != null) {
                    navigationIcon.setColorFilter(this.f15772A, PorterDuff.Mode.SRC_ATOP);
                }
                for (int childCount = this.f15778k.getChildCount() - 1; -1 < childCount; childCount--) {
                    if (this.f15778k.getChildAt(childCount) instanceof C5651t) {
                        this.f15778k.removeViewAt(childCount);
                    }
                }
                int size = this.f15777j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C5651t c5651t = this.f15777j.get(i4);
                    C9612q.m13918g(c5651t, "mConfigSubviews[i]");
                    C5651t c5651t2 = c5651t;
                    C5651t.EnumC5652a type = c5651t2.getType();
                    if (type == C5651t.EnumC5652a.BACK) {
                        View childAt = c5651t2.getChildAt(0);
                        if (childAt instanceof ImageView) {
                            imageView = (ImageView) childAt;
                        } else {
                            imageView = null;
                        }
                        if (imageView != null) {
                            supportActionBar.mo40511u(imageView.getDrawable());
                        } else {
                            throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                        }
                    } else {
                        Toolbar.C0466g c0466g = new Toolbar.C0466g(-2, -1);
                        int i5 = C5650a.f15794a[type.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    ((ViewGroup.MarginLayoutParams) c0466g).width = -1;
                                    c0466g.f822a = 1;
                                    this.f15778k.setTitle((CharSequence) null);
                                }
                            } else {
                                c0466g.f822a = 8388613;
                            }
                        } else {
                            if (!this.f15791x) {
                                this.f15778k.setNavigationIcon((Drawable) null);
                            }
                            this.f15778k.setTitle((CharSequence) null);
                            c0466g.f822a = 8388611;
                        }
                        c5651t2.setLayoutParams(c0466g);
                        this.f15778k.addView(c5651t2);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f15777j.size();
    }

    public final C5644q getScreenFragment() {
        ViewParent parent = getParent();
        if (parent instanceof C5623j) {
            C5634n fragment = ((C5623j) parent).getFragment();
            if (fragment instanceof C5644q) {
                return (C5644q) fragment;
            }
            return null;
        }
        return null;
    }

    public final C5604d getToolbar() {
        return this.f15778k;
    }

    /* renamed from: h */
    public final void m24823h() {
        this.f15777j.clear();
        m24825f();
    }

    /* renamed from: i */
    public final void m24822i(int i) {
        this.f15777j.remove(i);
        m24825f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15773B = true;
        Context context = getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C11829a(getId()));
        }
        if (this.f15779l == null) {
            this.f15779l = Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
        }
        m24824g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15773B = false;
        Context context = getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C11833c(getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.f15791x = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.f15786s = num;
    }

    public final void setDirection(String str) {
        this.f15783p = str;
    }

    public final void setHidden(boolean z) {
        this.f15787t = z;
    }

    public final void setHideBackButton(boolean z) {
        this.f15788u = z;
    }

    public final void setHideShadow(boolean z) {
        this.f15789v = z;
    }

    public final void setTintColor(int i) {
        this.f15772A = i;
    }

    public final void setTitle(String str) {
        this.f15780m = str;
    }

    public final void setTitleColor(int i) {
        this.f15781n = i;
    }

    public final void setTitleFontFamily(String str) {
        this.f15782o = str;
    }

    public final void setTitleFontSize(float f) {
        this.f15784q = f;
    }

    public final void setTitleFontWeight(String str) {
        this.f15785r = ReactTypefaceUtils.parseFontWeight(str);
    }

    public final void setTopInsetEnabled(boolean z) {
        this.f15792y = z;
    }

    public final void setTranslucent(boolean z) {
        this.f15793z = z;
    }
}