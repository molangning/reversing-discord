package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.C1936f;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p216le.C10133a;
import p216le.C10135b;
import p216le.C10137c;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0007J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000bH\u0007J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J\u0019\u0010\u001c\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000bH\u0087\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J \u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 0\u001fH\u0016J$\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u000bH\u0007R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, m14357d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/a;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", ZeroconfModule.KEY_SERVICE_HOST, "Landroid/view/View;", "child", "", "index", "", "addView", "parent", "getChildCount", "getChildAt", "view", "removeView", "removeAllViews", "removeViewAt", "", "needsCustomLayoutForChildren", "value", "setScrollEnabled", "setInitialPage", "setOrientation", "set", "setOverScrollMode", "setLayoutDirection", "", "", "getExportedCustomDirectEventTypeConstants", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", ViewProps.MARGIN, "setPageMargin", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "()V", "Companion", "a", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class PagerViewViewManager extends ViewGroupManager<C5484a> {
    private static final String COMMAND_SET_PAGE = "setPage";
    private static final String COMMAND_SET_PAGE_WITHOUT_ANIMATION = "setPageWithoutAnimation";
    private static final String COMMAND_SET_SCROLL_ENABLED = "setScrollEnabledImperatively";
    public static final C5482a Companion = new C5482a(null);
    private EventDispatcher eventDispatcher;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m14357d2 = {"Lcom/reactnativepagerview/PagerViewViewManager$a;", "", "", "COMMAND_SET_PAGE", "Ljava/lang/String;", "COMMAND_SET_PAGE_WITHOUT_ANIMATION", "COMMAND_SET_SCROLL_ENABLED", "<init>", "()V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.reactnativepagerview.PagerViewViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5482a {
        private C5482a() {
        }

        public /* synthetic */ C5482a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\f"}, m14357d2 = {"com/reactnativepagerview/PagerViewViewManager$b", "Landroidx/viewpager2/widget/f$i;", "", ViewProps.POSITION, "", "positionOffset", "positionOffsetPixels", "", "b", "c", "state", "a", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.reactnativepagerview.PagerViewViewManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5483b extends C1936f.AbstractC1945i {

        /* renamed from: b */
        final /* synthetic */ C5484a f15444b;

        C5483b(C5484a c5484a) {
            this.f15444b = c5484a;
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
        /* renamed from: a */
        public void mo25156a(int i) {
            String str;
            super.mo25156a(i);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        str = "settling";
                    } else {
                        throw new IllegalStateException("Unsupported pageScrollState");
                    }
                } else {
                    str = "dragging";
                }
            } else {
                str = "idle";
            }
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                C9612q.m13900y("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.dispatchEvent(new C10135b(this.f15444b.getId(), str));
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
        /* renamed from: b */
        public void mo25155b(int i, float f, int i2) {
            super.mo25155b(i, f, i2);
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                C9612q.m13900y("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.dispatchEvent(new C10133a(this.f15444b.getId(), i, f));
        }

        @Override // androidx.viewpager2.widget.C1936f.AbstractC1945i
        /* renamed from: c */
        public void mo25154c(int i) {
            super.mo25154c(i);
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                C9612q.m13900y("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.dispatchEvent(new C10137c(this.f15444b.getId(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(C1936f vp, PagerViewViewManager this$0, C5484a host) {
        C9612q.m13917h(vp, "$vp");
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(host, "$host");
        vp.m34936g(new C5483b(host));
        EventDispatcher eventDispatcher = this$0.eventDispatcher;
        if (eventDispatcher == null) {
            C9612q.m13900y("eventDispatcher");
            eventDispatcher = null;
        }
        eventDispatcher.dispatchEvent(new C10137c(host.getId(), vp.getCurrentItem()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> m30468of = MapBuilder.m30468of("topPageScroll", MapBuilder.m30470of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.m30470of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.m30470of("registrationName", "onPageSelected"));
        C9612q.m13918g(m30468of, "of(\n                Page…Name\", \"onPageSelected\"))");
        return m30468of;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return C5490g.f15457a.m25143h();
    }

    @ReactProp(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(C5484a host, int i) {
        C9612q.m13917h(host, "host");
        C5490g.f15457a.m25133r(host, i);
    }

    @ReactProp(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(C5484a host, int i) {
        C9612q.m13917h(host, "host");
        C5490g.f15457a.m25136o(host, i);
    }

    @ReactProp(name = ViewProps.LAYOUT_DIRECTION)
    public final void setLayoutDirection(C5484a host, String value) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(value, "value");
        C5490g.f15457a.m25134q(host, value);
    }

    @ReactProp(name = "orientation")
    public final void setOrientation(C5484a host, String value) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(value, "value");
        C5490g.f15457a.m25132s(host, value);
    }

    @ReactProp(name = "overScrollMode")
    public final void setOverScrollMode(C5484a host, String value) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(value, "value");
        C5490g.f15457a.m25131t(host, value);
    }

    @ReactProp(defaultInt = 0, name = "pageMargin")
    public final void setPageMargin(C5484a host, int i) {
        C9612q.m13917h(host, "host");
        C5490g.f15457a.m25130u(host, i);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(C5484a host, boolean z) {
        C9612q.m13917h(host, "host");
        C5490g.f15457a.m25128w(host, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C5484a createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        final C5484a c5484a = new C5484a(reactContext);
        c5484a.setId(View.generateViewId());
        c5484a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c5484a.setSaveEnabled(false);
        final C1936f c1936f = new C1936f(reactContext);
        c1936f.setAdapter(new C5491h());
        c1936f.setSaveEnabled(false);
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        C9612q.m13920e(nativeModule);
        EventDispatcher eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        C9612q.m13918g(eventDispatcher, "reactContext.getNativeMo…s.java)!!.eventDispatcher");
        this.eventDispatcher = eventDispatcher;
        c1936f.post(new Runnable() { // from class: com.reactnativepagerview.c
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(C1936f.this, this, c5484a);
            }
        });
        c5484a.addView(c1936f);
        return c5484a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r11.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r11.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE_WITHOUT_ANIMATION) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        kotlin.jvm.internal.C9612q.m13920e(r12);
        r12 = r12.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r2.intValue() <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r12 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r12 >= r2.intValue()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        r0.m25137n(r1, r12, kotlin.jvm.internal.C9612q.m13922c(r11, com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE));
        r11 = r9.eventDispatcher;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r11 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        kotlin.jvm.internal.C9612q.m13900y("eventDispatcher");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
        r3.dispatchEvent(new p216le.C10137c(r10.getId(), r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiveCommand(com.reactnativepagerview.C5484a r10, java.lang.String r11, com.facebook.react.bridge.ReadableArray r12) {
        /*
            r9 = this;
            java.lang.String r0 = "root"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            super.receiveCommand(r10, r11, r12)
            com.reactnativepagerview.g r0 = com.reactnativepagerview.C5490g.f15457a
            androidx.viewpager2.widget.f r1 = r0.m25144g(r10)
            p058d5.C5743a.m24583c(r1)
            p058d5.C5743a.m24583c(r12)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.getAdapter()
            r3 = 0
            if (r2 == 0) goto L24
            int r2 = r2.getItemCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L25
        L24:
            r2 = r3
        L25:
            r4 = 1
            r5 = 0
            if (r11 == 0) goto L9a
            int r6 = r11.hashCode()
            r7 = -445763635(0xffffffffe56e2fcd, float:-7.030031E22)
            java.lang.String r8 = "setPage"
            if (r6 == r7) goto L58
            r7 = 1747675147(0x682b680b, float:3.2377757E24)
            if (r6 == r7) goto L45
            r7 = 1984860689(0x764e9211, float:1.0474372E33)
            if (r6 != r7) goto L9a
            boolean r6 = r11.equals(r8)
            if (r6 == 0) goto L9a
            goto L60
        L45:
            java.lang.String r10 = "setScrollEnabledImperatively"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L9a
            kotlin.jvm.internal.C9612q.m13920e(r12)
            boolean r10 = r12.getBoolean(r5)
            r1.setUserInputEnabled(r10)
            goto L99
        L58:
            java.lang.String r6 = "setPageWithoutAnimation"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L9a
        L60:
            kotlin.jvm.internal.C9612q.m13920e(r12)
            int r12 = r12.getInt(r5)
            if (r2 == 0) goto L78
            int r6 = r2.intValue()
            if (r6 <= 0) goto L78
            if (r12 < 0) goto L78
            int r2 = r2.intValue()
            if (r12 >= r2) goto L78
            goto L79
        L78:
            r4 = r5
        L79:
            if (r4 == 0) goto L99
            boolean r11 = kotlin.jvm.internal.C9612q.m13922c(r11, r8)
            r0.m25137n(r1, r12, r11)
            com.facebook.react.uimanager.events.EventDispatcher r11 = r9.eventDispatcher
            if (r11 != 0) goto L8c
            java.lang.String r11 = "eventDispatcher"
            kotlin.jvm.internal.C9612q.m13900y(r11)
            goto L8d
        L8c:
            r3 = r11
        L8d:
            le.c r11 = new le.c
            int r10 = r10.getId()
            r11.<init>(r10, r12)
            r3.dispatchEvent(r11)
        L99:
            return
        L9a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            kotlin.jvm.internal.k0 r12 = kotlin.jvm.internal.C9602k0.f25351a
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r5] = r11
            java.lang.Class<com.reactnativepagerview.PagerViewViewManager> r11 = com.reactnativepagerview.PagerViewViewManager.class
            java.lang.String r11 = r11.getSimpleName()
            r0[r4] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r0, r12)
            java.lang.String r12 = "Unsupported command %d received by %s."
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.lang.String r12 = "format(format, *args)"
            kotlin.jvm.internal.C9612q.m13918g(r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.PagerViewViewManager.receiveCommand(com.reactnativepagerview.a, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(C5484a parent) {
        C9612q.m13917h(parent, "parent");
        C5490g.f15457a.m25140k(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(C5484a parent, View view) {
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(view, "view");
        C5490g.f15457a.m25139l(parent, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C5484a host, View view, int i) {
        C9612q.m13917h(host, "host");
        C5490g.f15457a.m25147d(host, view, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C5484a parent, int i) {
        C9612q.m13917h(parent, "parent");
        return C5490g.f15457a.m25146e(parent, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C5484a parent) {
        C9612q.m13917h(parent, "parent");
        return C5490g.f15457a.m25145f(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C5484a parent, int i) {
        C9612q.m13917h(parent, "parent");
        C5490g.f15457a.m25138m(parent, i);
    }
}
