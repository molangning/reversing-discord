package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0006\"\n\u0087\u0001gxB\u0015\u0012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014J0\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\tJ\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u00102\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010R\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0018\u0010c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0018\u0010e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\\R$\u0010k\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u00107R\u0013\u0010q\u001a\u0004\u0018\u00010n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR(\u0010r\u001a\u0004\u0018\u00010\u001e2\b\u0010r\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR(\u0010z\u001a\u0004\u0018\u00010\t2\b\u0010w\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010h\"\u0004\by\u0010jR(\u0010~\u001a\u0004\u0018\u00010\t2\b\u0010{\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010h\"\u0004\b}\u0010jR+\u0010\u007f\u001a\u0004\u0018\u00010\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0080\u0001\u0010X\"\u0006\b\u0081\u0001\u0010\u0082\u0001R-\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0084\u0001\u0010X\"\u0006\b\u0085\u0001\u0010\u0082\u0001R,\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010h\"\u0005\b\u0088\u0001\u0010jR(\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010S\"\u0005\b\u008c\u0001\u0010U¨\u0006\u0092\u0001"}, m14357d2 = {"Lcom/swmansion/rnscreens/j;", "Lcom/swmansion/rnscreens/e;", "", "width", "height", "", "g", "Landroid/view/ViewGroup;", "viewGroup", "", "b", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "container", "dispatchSaveInstanceState", "dispatchRestoreInstanceState", "changed", "l", "t", "r", ViewProps.ON_LAYOUT, "transitioning", "setTransitioning", "layerType", "Landroid/graphics/Paint;", "paint", "setLayerType", "Lcom/swmansion/rnscreens/j$a;", "activityState", "setActivityState", "", "screenOrientation", "setScreenOrientation", "mode", "a", "Lcom/swmansion/rnscreens/n;", "j", "Lcom/swmansion/rnscreens/n;", "getFragment", "()Lcom/swmansion/rnscreens/n;", "setFragment", "(Lcom/swmansion/rnscreens/n;)V", "fragment", "Lcom/swmansion/rnscreens/l;", "k", "Lcom/swmansion/rnscreens/l;", "getContainer", "()Lcom/swmansion/rnscreens/l;", "setContainer", "(Lcom/swmansion/rnscreens/l;)V", "<set-?>", "Lcom/swmansion/rnscreens/j$a;", "getActivityState", "()Lcom/swmansion/rnscreens/j$a;", "m", "Z", "mTransitioning", "Lcom/swmansion/rnscreens/j$d;", "n", "Lcom/swmansion/rnscreens/j$d;", "getStackPresentation", "()Lcom/swmansion/rnscreens/j$d;", "setStackPresentation", "(Lcom/swmansion/rnscreens/j$d;)V", "stackPresentation", "Lcom/swmansion/rnscreens/j$b;", "o", "Lcom/swmansion/rnscreens/j$b;", "getReplaceAnimation", "()Lcom/swmansion/rnscreens/j$b;", "setReplaceAnimation", "(Lcom/swmansion/rnscreens/j$b;)V", "replaceAnimation", "Lcom/swmansion/rnscreens/j$c;", "p", "Lcom/swmansion/rnscreens/j$c;", "getStackAnimation", "()Lcom/swmansion/rnscreens/j$c;", "setStackAnimation", "(Lcom/swmansion/rnscreens/j$c;)V", "stackAnimation", "q", "isGestureEnabled", "()Z", "setGestureEnabled", "(Z)V", "Ljava/lang/Integer;", "getScreenOrientation", "()Ljava/lang/Integer;", "s", "Ljava/lang/String;", "mStatusBarStyle", "Ljava/lang/Boolean;", "mStatusBarHidden", "u", "mStatusBarTranslucent", "v", "mStatusBarColor", "w", "mNavigationBarColor", "x", "mNavigationBarHidden", "y", "d", "()Ljava/lang/Boolean;", "setStatusBarAnimated", "(Ljava/lang/Boolean;)V", "isStatusBarAnimated", "z", "mNativeBackButtonDismissalEnabled", "Lcom/swmansion/rnscreens/s;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/s;", "headerConfig", "statusBarStyle", "getStatusBarStyle", "()Ljava/lang/String;", "setStatusBarStyle", "(Ljava/lang/String;)V", "statusBarHidden", "e", "setStatusBarHidden", "isStatusBarHidden", "statusBarTranslucent", "f", "setStatusBarTranslucent", "isStatusBarTranslucent", "statusBarColor", "getStatusBarColor", "setStatusBarColor", "(Ljava/lang/Integer;)V", "navigationBarColor", "getNavigationBarColor", "setNavigationBarColor", "navigationBarHidden", "c", "setNavigationBarHidden", "isNavigationBarHidden", "enableNativeBackButtonDismissal", "getNativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "nativeBackButtonDismissalEnabled", "Lcom/facebook/react/bridge/ReactContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5623j extends AbstractC5606e {

    /* renamed from: j */
    private C5634n f15670j;

    /* renamed from: k */
    private C5631l<?> f15671k;

    /* renamed from: l */
    private EnumC5624a f15672l;

    /* renamed from: m */
    private boolean f15673m;

    /* renamed from: n */
    private EnumC5627d f15674n;

    /* renamed from: o */
    private EnumC5625b f15675o;

    /* renamed from: p */
    private EnumC5626c f15676p;

    /* renamed from: q */
    private boolean f15677q;

    /* renamed from: r */
    private Integer f15678r;

    /* renamed from: s */
    private String f15679s;

    /* renamed from: t */
    private Boolean f15680t;

    /* renamed from: u */
    private Boolean f15681u;

    /* renamed from: v */
    private Integer f15682v;

    /* renamed from: w */
    private Integer f15683w;

    /* renamed from: x */
    private Boolean f15684x;

    /* renamed from: y */
    private Boolean f15685y;

    /* renamed from: z */
    private boolean f15686z;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/j$a;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5624a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/swmansion/rnscreens/j$b;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5625b {
        PUSH,
        POP
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m14357d2 = {"Lcom/swmansion/rnscreens/j$c;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "n", "o", "p", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5626c {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/j$d;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5627d {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m14357d2 = {"Lcom/swmansion/rnscreens/j$e;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "n", "o", "p", "q", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5628e {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_COLOR,
        NAVIGATION_BAR_HIDDEN
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"com/swmansion/rnscreens/j$f", "Lcom/facebook/react/bridge/GuardedRunnable;", "", "runGuarded", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.j$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5629f extends GuardedRunnable {

        /* renamed from: j */
        final /* synthetic */ ReactContext f15715j;

        /* renamed from: k */
        final /* synthetic */ C5623j f15716k;

        /* renamed from: l */
        final /* synthetic */ int f15717l;

        /* renamed from: m */
        final /* synthetic */ int f15718m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5629f(ReactContext reactContext, C5623j c5623j, int i, int i2) {
            super(reactContext);
            this.f15715j = reactContext;
            this.f15716k = c5623j;
            this.f15717l = i;
            this.f15718m = i2;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f15715j.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(this.f15716k.getId(), this.f15717l, this.f15718m);
            }
        }
    }

    public C5623j(ReactContext reactContext) {
        super(reactContext);
        this.f15674n = EnumC5627d.PUSH;
        this.f15675o = EnumC5625b.POP;
        this.f15676p = EnumC5626c.DEFAULT;
        this.f15677q = true;
        this.f15686z = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
    }

    /* renamed from: b */
    private final boolean m24923b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m24923b((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final void m24918g(int i, int i2) {
        Context context = getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        reactContext.runOnNativeModulesQueueThread(new C5629f(reactContext, this, i, i2));
    }

    /* renamed from: a */
    public final void m24924a(int i) {
        C5604d c5604d;
        setImportantForAccessibility(i);
        C5649s headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            c5604d = headerConfig.getToolbar();
        } else {
            c5604d = null;
        }
        if (c5604d != null) {
            c5604d.setImportantForAccessibility(i);
        }
    }

    /* renamed from: c */
    public final Boolean m24922c() {
        return this.f15684x;
    }

    /* renamed from: d */
    public final Boolean m24921d() {
        return this.f15685y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        C9612q.m13917h(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        C9612q.m13917h(container, "container");
    }

    /* renamed from: e */
    public final Boolean m24920e() {
        return this.f15680t;
    }

    /* renamed from: f */
    public final Boolean m24919f() {
        return this.f15681u;
    }

    public final EnumC5624a getActivityState() {
        return this.f15672l;
    }

    public final C5631l<?> getContainer() {
        return this.f15671k;
    }

    public final C5634n getFragment() {
        return this.f15670j;
    }

    public final C5649s getHeaderConfig() {
        View childAt = getChildAt(0);
        if (childAt instanceof C5649s) {
            return (C5649s) childAt;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f15686z;
    }

    public final Integer getNavigationBarColor() {
        return this.f15683w;
    }

    public final EnumC5625b getReplaceAnimation() {
        return this.f15675o;
    }

    public final Integer getScreenOrientation() {
        return this.f15678r;
    }

    public final EnumC5626c getStackAnimation() {
        return this.f15676p;
    }

    public final EnumC5627d getStackPresentation() {
        return this.f15674n;
    }

    public final Integer getStatusBarColor() {
        return this.f15682v;
    }

    public final String getStatusBarStyle() {
        return this.f15679s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            m24918g(i3 - i, i4 - i2);
        }
    }

    public final void setActivityState(EnumC5624a activityState) {
        C9612q.m13917h(activityState, "activityState");
        if (activityState == this.f15672l) {
            return;
        }
        this.f15672l = activityState;
        C5631l<?> c5631l = this.f15671k;
        if (c5631l != null) {
            c5631l.m24903l();
        }
    }

    public final void setContainer(C5631l<?> c5631l) {
        this.f15671k = c5631l;
    }

    public final void setFragment(C5634n c5634n) {
        this.f15670j = c5634n;
    }

    public final void setGestureEnabled(boolean z) {
        this.f15677q = z;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.f15686z = z;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            C5656x.f15810a.m24817d();
        }
        this.f15683w = num;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            C5656x.f15810a.m24805p(this, c5634n.m24875y());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            C5656x.f15810a.m24817d();
        }
        this.f15684x = bool;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            C5656x.f15810a.m24804q(this, c5634n.m24875y());
        }
    }

    public final void setReplaceAnimation(EnumC5625b enumC5625b) {
        C9612q.m13917h(enumC5625b, "<set-?>");
        this.f15675o = enumC5625b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setScreenOrientation(String str) {
        int i;
        if (str == null) {
            this.f15678r = null;
            return;
        }
        C5656x c5656x = C5656x.f15810a;
        c5656x.m24816e();
        switch (str.hashCode()) {
            case -1894896954:
                if (str.equals("portrait_down")) {
                    i = 9;
                    break;
                }
                i = -1;
                break;
            case 96673:
                if (str.equals("all")) {
                    i = 10;
                    break;
                }
                i = -1;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i = 7;
                    break;
                }
                i = -1;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i = 6;
                    break;
                }
                i = -1;
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i = 1;
                    break;
                }
                i = -1;
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i = 8;
                    break;
                }
                i = -1;
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i = 0;
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        this.f15678r = i;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            c5656x.m24803r(this, c5634n.m24875y());
        }
    }

    public final void setStackAnimation(EnumC5626c enumC5626c) {
        C9612q.m13917h(enumC5626c, "<set-?>");
        this.f15676p = enumC5626c;
    }

    public final void setStackPresentation(EnumC5627d enumC5627d) {
        C9612q.m13917h(enumC5627d, "<set-?>");
        this.f15674n = enumC5627d;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f15685y = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            C5656x.f15810a.m24815f();
        }
        this.f15682v = num;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            C5656x.f15810a.m24809l(this, c5634n.m24875y(), c5634n.m24874z());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            C5656x.f15810a.m24815f();
        }
        this.f15680t = bool;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            C5656x.f15810a.m24807n(this, c5634n.m24875y());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            C5656x.f15810a.m24815f();
        }
        this.f15679s = str;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            C5656x.f15810a.m24801t(this, c5634n.m24875y(), c5634n.m24874z());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            C5656x.f15810a.m24815f();
        }
        this.f15681u = bool;
        C5634n c5634n = this.f15670j;
        if (c5634n != null) {
            C5656x.f15810a.m24800u(this, c5634n.m24875y(), c5634n.m24874z());
        }
    }

    public final void setTransitioning(boolean z) {
        if (this.f15673m == z) {
            return;
        }
        this.f15673m = z;
        boolean m24923b = m24923b(this);
        int i = 2;
        if (m24923b && getLayerType() != 2) {
            return;
        }
        super.setLayerType((!z || m24923b) ? 0 : 0, null);
    }
}