package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.FabricViewStateManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0015\u001a\u00020\u0007H\u0016R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/i;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lcom/facebook/react/uimanager/FabricViewStateManager$HasFabricViewStateManager;", "", "g", "j", "", "f", "Landroid/view/View;", "e", "Lcom/facebook/react/uimanager/FabricViewStateManager;", "getFabricViewStateManager", "Lcom/th3rdwave/safeareacontext/m;", "mode", "setMode", "Lcom/th3rdwave/safeareacontext/k;", "edges", "setEdges", "onAttachedToWindow", "onDetachedFromWindow", "onPreDraw", "Lcom/th3rdwave/safeareacontext/m;", "mMode", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "k", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "mInsets", "l", "Lcom/th3rdwave/safeareacontext/k;", "mEdges", "m", "Landroid/view/View;", "mProviderView", "n", "Lcom/facebook/react/uimanager/FabricViewStateManager;", "mFabricViewStateManager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ViewTreeObserver$OnPreDrawListenerC5675i extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener, FabricViewStateManager.HasFabricViewStateManager {

    /* renamed from: j */
    private EnumC5679m f15843j;

    /* renamed from: k */
    private EdgeInsets f15844k;

    /* renamed from: l */
    private C5677k f15845l;

    /* renamed from: m */
    private View f15846m;

    /* renamed from: n */
    private final FabricViewStateManager f15847n;

    public ViewTreeObserver$OnPreDrawListenerC5675i(Context context) {
        super(context);
        this.f15843j = EnumC5679m.PADDING;
        this.f15847n = new FabricViewStateManager();
    }

    /* renamed from: e */
    private final View m24771e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof SafeAreaProvider) {
                return (View) parent;
            }
        }
        return this;
    }

    /* renamed from: f */
    private final boolean m24770f() {
        EdgeInsets m24775e;
        View view = this.f15846m;
        if (view == null || (m24775e = C5671e.m24775e(view)) == null || C9612q.m13922c(this.f15844k, m24775e)) {
            return false;
        }
        this.f15844k = m24775e;
        m24769g();
        return true;
    }

    /* renamed from: g */
    private final void m24769g() {
        final EdgeInsets edgeInsets = this.f15844k;
        if (edgeInsets != null) {
            C5677k c5677k = this.f15845l;
            if (c5677k == null) {
                EnumC5676j enumC5676j = EnumC5676j.ADDITIVE;
                c5677k = new C5677k(enumC5676j, enumC5676j, enumC5676j, enumC5676j);
            }
            if (this.f15847n.hasStateWrapper()) {
                this.f15847n.setState(new FabricViewStateManager.StateUpdateCallback() { // from class: com.th3rdwave.safeareacontext.f
                    @Override // com.facebook.react.uimanager.FabricViewStateManager.StateUpdateCallback
                    public final WritableMap getStateUpdate() {
                        WritableMap m24768h;
                        m24768h = ViewTreeObserver$OnPreDrawListenerC5675i.m24768h(EdgeInsets.this);
                        return m24768h;
                    }
                });
                return;
            }
            C5678l c5678l = new C5678l(edgeInsets, this.f15843j, c5677k);
            ReactContext m24748a = C5682p.m24748a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) m24748a.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), c5678l);
                m24748a.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserver$OnPreDrawListenerC5675i.m24767i(UIManagerModule.this);
                    }
                });
                m24766j();
            }
        }
    }

    /* renamed from: h */
    public static final WritableMap m24768h(EdgeInsets edgeInsets) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", C5681o.m24751b(edgeInsets));
        return createMap;
    }

    /* renamed from: i */
    public static final void m24767i(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().dispatchViewUpdates(-1);
    }

    /* renamed from: j */
    private final void m24766j() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        long nanoTime = System.nanoTime();
        C5682p.m24748a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.h
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver$OnPreDrawListenerC5675i.m24765k(reentrantLock, ref$BooleanRef, newCondition);
            }
        });
        reentrantLock.lock();
        long j = 0;
        while (!ref$BooleanRef.f25327j && j < 500000000) {
            try {
                try {
                    newCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    ref$BooleanRef.f25327j = true;
                }
                j += System.nanoTime() - nanoTime;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Unit unit = Unit.f25302a;
        reentrantLock.unlock();
        if (j >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    /* renamed from: k */
    public static final void m24765k(ReentrantLock lock, Ref$BooleanRef done, Condition condition) {
        C9612q.m13917h(lock, "$lock");
        C9612q.m13917h(done, "$done");
        lock.lock();
        try {
            if (!done.f25327j) {
                done.f25327j = true;
                condition.signal();
            }
            Unit unit = Unit.f25302a;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.facebook.react.uimanager.FabricViewStateManager.HasFabricViewStateManager
    public FabricViewStateManager getFabricViewStateManager() {
        return this.f15847n;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View m24771e = m24771e();
        this.f15846m = m24771e;
        if (m24771e != null && (viewTreeObserver = m24771e.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        m24770f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f15846m;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f15846m = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean m24770f = m24770f();
        if (m24770f) {
            requestLayout();
        }
        return !m24770f;
    }

    public final void setEdges(C5677k edges) {
        C9612q.m13917h(edges, "edges");
        this.f15845l = edges;
        m24769g();
    }

    public final void setMode(EnumC5679m mode) {
        C9612q.m13917h(mode, "mode");
        this.f15843j = mode;
        m24769g();
    }
}