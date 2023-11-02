package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import p340sf.C12466c;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006,"}, m14357d2 = {"Lme/b;", "Lcom/facebook/react/views/view/ReactViewGroup;", "", "d", "c", "", "getFooterDiff", "Landroid/view/View;", "getFooter", "getParentScrollView", "b", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Lme/a;", "j", "Lme/a;", "getAlShadow", "()Lme/a;", "alShadow", "", "k", "Z", "getEnableInstrumentation", "()Z", "setEnableInstrumentation", "(Z)V", "enableInstrumentation", "l", "getDisableAutoLayout", "setDisableAutoLayout", "disableAutoLayout", "", "m", "D", "getPixelDensity", "()D", "setPixelDensity", "(D)V", "pixelDensity", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: me.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10442b extends ReactViewGroup {

    /* renamed from: j */
    private final C10441a f27281j;

    /* renamed from: k */
    private boolean f27282k;

    /* renamed from: l */
    private boolean f27283l;

    /* renamed from: m */
    private double f27284m;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: me.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10443a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m5209d;
            m5209d = C12466c.m5209d(Integer.valueOf(((InterfaceC10444c) t).getIndex()), Integer.valueOf(((InterfaceC10444c) t2).getIndex()));
            return m5209d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10442b(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.f27281j = new C10441a();
        this.f27284m = 1.0d;
    }

    /* renamed from: b */
    private final void m11533b() {
        WritableMap createMap = Arguments.createMap();
        C9612q.m13918g(createMap, "createMap()");
        createMap.putDouble("offsetStart", this.f27281j.m11543d() / this.f27284m);
        createMap.putDouble("offsetEnd", this.f27281j.m11544c() / this.f27284m);
        Context context = getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onBlankAreaEvent", createMap);
    }

    /* renamed from: c */
    private final void m11532c() {
        View view;
        View parentScrollView = getParentScrollView();
        if (!this.f27283l && parentScrollView != null) {
            boolean z = true;
            if (!this.f27281j.m11542e() ? getBottom() > parentScrollView.getHeight() : getRight() > parentScrollView.getWidth()) {
                z = false;
            }
            if (!z) {
                return;
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            View footer = getFooter();
            int footerDiff = getFooterDiff();
            if (footerDiff != 0 && footer != null && view != null) {
                if (this.f27281j.m11542e()) {
                    footer.offsetLeftAndRight(footerDiff);
                    setRight(getRight() + footerDiff);
                    view.setRight(view.getRight() + footerDiff);
                    return;
                }
                footer.offsetTopAndBottom(footerDiff);
                setBottom(getBottom() + footerDiff);
                view.setBottom(view.getBottom() + footerDiff);
            }
        }
    }

    /* renamed from: d */
    private final void m11531d() {
        int top;
        if (getChildCount() > 1 && !this.f27283l) {
            int childCount = getChildCount();
            InterfaceC10444c[] interfaceC10444cArr = new InterfaceC10444c[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof InterfaceC10444c) {
                    interfaceC10444cArr[i] = (InterfaceC10444c) childAt;
                } else {
                    throw new IllegalStateException("CellRendererComponent outer view should always be CellContainer. Learn more here: https://shopify.github.io/flash-list/docs/usage#cellrenderercomponent.");
                }
            }
            if (childCount > 1) {
                C9536e.m14260r(interfaceC10444cArr, new C10443a());
            }
            C10441a c10441a = this.f27281j;
            if (c10441a.m11542e()) {
                top = getLeft();
            } else {
                top = getTop();
            }
            c10441a.m11537j(top);
            this.f27281j.m11546a(interfaceC10444cArr);
        }
    }

    private final View getFooter() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC10444c) && ((InterfaceC10444c) childAt).getIndex() == -1) {
                return childAt;
            }
        }
        return null;
    }

    private final int getFooterDiff() {
        int bottom;
        int bottom2;
        int top;
        if (getChildCount() == 0) {
            this.f27281j.m11538i(0);
        } else if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            C10441a c10441a = this.f27281j;
            if (c10441a.m11542e()) {
                bottom = childAt.getRight();
            } else {
                bottom = childAt.getBottom();
            }
            c10441a.m11538i(bottom);
        }
        if (this.f27281j.m11542e()) {
            bottom2 = getRight();
            top = getLeft();
        } else {
            bottom2 = getBottom();
            top = getTop();
        }
        return this.f27281j.m11541f() - (bottom2 - top);
    }

    private final View getParentScrollView() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof ScrollView) || (parent instanceof HorizontalScrollView)) {
                return (View) parent;
            }
        }
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int height;
        int scrollY;
        int top;
        int bottom;
        m11531d();
        m11532c();
        super.dispatchDraw(canvas);
        View parentScrollView = getParentScrollView();
        if (this.f27282k && parentScrollView != null) {
            if (this.f27281j.m11542e()) {
                height = parentScrollView.getWidth();
            } else {
                height = parentScrollView.getHeight();
            }
            if (this.f27281j.m11542e()) {
                scrollY = parentScrollView.getScrollX();
            } else {
                scrollY = parentScrollView.getScrollY();
            }
            if (this.f27281j.m11542e()) {
                top = getLeft();
            } else {
                top = getTop();
            }
            if (this.f27281j.m11542e()) {
                bottom = getRight();
            } else {
                bottom = getBottom();
            }
            this.f27281j.m11545b(scrollY, Math.max(top - scrollY, 0), Math.max((height + scrollY) - bottom, 0));
            m11533b();
        }
    }

    public final C10441a getAlShadow() {
        return this.f27281j;
    }

    public final boolean getDisableAutoLayout() {
        return this.f27283l;
    }

    public final boolean getEnableInstrumentation() {
        return this.f27282k;
    }

    public final double getPixelDensity() {
        return this.f27284m;
    }

    public final void setDisableAutoLayout(boolean z) {
        this.f27283l = z;
    }

    public final void setEnableInstrumentation(boolean z) {
        this.f27282k = z;
    }

    public final void setPixelDensity(double d) {
        this.f27284m = d;
    }
}