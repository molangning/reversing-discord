package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C5623j;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9550o;
import kotlin.collections.C9551p;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9604l0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import p303qe.C11859p;

@Metadata(m14358d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002NOB\u0011\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\u00032\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002J\f\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0003J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0014J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0014J \u0010&\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0014R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00020'j\b\u0012\u0004\u0012\u00020\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\f\u0012\b\u0012\u00060\bR\u00020\u0000008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R \u00104\u001a\f\u0012\b\u0012\u00060\bR\u00020\u0000008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010>R\"\u0010D\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006P"}, m14357d2 = {"Lcom/swmansion/rnscreens/p;", "Lcom/swmansion/rnscreens/l;", "Lcom/swmansion/rnscreens/q;", "", "A", "visibleBottom", "G", "B", "Lcom/swmansion/rnscreens/p$b;", "op", "F", "C", "screenFragment", "z", "Lcom/swmansion/rnscreens/j;", "screen", "y", "Landroid/view/View;", "view", "startViewTransition", "endViewTransition", "E", "", "index", "u", "s", "Lcom/swmansion/rnscreens/n;", "", "k", "p", "m", "removeView", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "child", "", "drawingTime", "drawChild", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "q", "Ljava/util/ArrayList;", "mStack", "", "r", "Ljava/util/Set;", "mDismissed", "", "Ljava/util/List;", "drawingOpPool", "t", "drawingOps", "Lcom/swmansion/rnscreens/q;", "mTopScreen", "v", "Z", "mRemovalTransitionStarted", "w", "isDetachingCurrentScreen", "x", "reverseLastTwoChildren", "I", "previousChildrenCount", "getGoingForward", "()Z", "setGoingForward", "(Z)V", "goingForward", "getTopScreen", "()Lcom/swmansion/rnscreens/j;", "topScreen", "getRootScreen", "rootScreen", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5640p extends C5631l<C5644q> {

    /* renamed from: A */
    public static final C5641a f15745A = new C5641a(null);

    /* renamed from: q */
    private final ArrayList<C5644q> f15746q;

    /* renamed from: r */
    private final Set<C5644q> f15747r;

    /* renamed from: s */
    private final List<C5642b> f15748s;

    /* renamed from: t */
    private List<C5642b> f15749t;

    /* renamed from: u */
    private C5644q f15750u;

    /* renamed from: v */
    private boolean f15751v;

    /* renamed from: w */
    private boolean f15752w;

    /* renamed from: x */
    private boolean f15753x;

    /* renamed from: y */
    private int f15754y;

    /* renamed from: z */
    private boolean f15755z;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\t"}, m14357d2 = {"Lcom/swmansion/rnscreens/p$a;", "", "Lcom/swmansion/rnscreens/q;", "fragment", "", "c", "d", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5641a {
        private C5641a() {
        }

        public /* synthetic */ C5641a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final boolean m24852c(C5644q c5644q) {
            return c5644q.m24881q().getStackPresentation() == C5623j.EnumC5627d.TRANSPARENT_MODAL;
        }

        /* renamed from: d */
        public final boolean m24851d(C5644q c5644q) {
            if (c5644q.m24881q().getStackAnimation() != C5623j.EnumC5626c.SLIDE_FROM_BOTTOM && c5644q.m24881q().getStackAnimation() != C5623j.EnumC5626c.FADE_FROM_BOTTOM && c5644q.m24881q().getStackAnimation() != C5623j.EnumC5626c.DEFAULT) {
                return false;
            }
            return true;
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Lcom/swmansion/rnscreens/p$b;", "", "", "a", "Landroid/graphics/Canvas;", "Landroid/graphics/Canvas;", "b", "()Landroid/graphics/Canvas;", "e", "(Landroid/graphics/Canvas;)V", "canvas", "Landroid/view/View;", "Landroid/view/View;", "c", "()Landroid/view/View;", "f", "(Landroid/view/View;)V", "child", "", "J", "d", "()J", "g", "(J)V", "drawingTime", "<init>", "(Lcom/swmansion/rnscreens/p;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C5642b {

        /* renamed from: a */
        private Canvas f15756a;

        /* renamed from: b */
        private View f15757b;

        /* renamed from: c */
        private long f15758c;

        public C5642b() {
            C5640p.this = r1;
        }

        /* renamed from: a */
        public final void m24850a() {
            C5640p.this.m24866F(this);
            this.f15756a = null;
            this.f15757b = null;
            this.f15758c = 0L;
        }

        /* renamed from: b */
        public final Canvas m24849b() {
            return this.f15756a;
        }

        /* renamed from: c */
        public final View m24848c() {
            return this.f15757b;
        }

        /* renamed from: d */
        public final long m24847d() {
            return this.f15758c;
        }

        /* renamed from: e */
        public final void m24846e(Canvas canvas) {
            this.f15756a = canvas;
        }

        /* renamed from: f */
        public final void m24845f(View view) {
            this.f15757b = view;
        }

        /* renamed from: g */
        public final void m24844g(long j) {
            this.f15758c = j;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.swmansion.rnscreens.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C5643c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15760a;

        static {
            int[] iArr = new int[C5623j.EnumC5626c.values().length];
            try {
                iArr[C5623j.EnumC5626c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C5623j.EnumC5626c.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C5623j.EnumC5626c.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C5623j.EnumC5626c.SLIDE_FROM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C5623j.EnumC5626c.SLIDE_FROM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C5623j.EnumC5626c.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C5623j.EnumC5626c.FADE_FROM_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f15760a = iArr;
        }
    }

    public C5640p(Context context) {
        super(context);
        this.f15746q = new ArrayList<>();
        this.f15747r = new HashSet();
        this.f15748s = new ArrayList();
        this.f15749t = new ArrayList();
    }

    /* renamed from: A */
    private final void m24871A() {
        Context context = getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C11859p(getId()));
        }
    }

    /* renamed from: B */
    private final void m24870B() {
        List<C5642b> list = this.f15749t;
        this.f15749t = new ArrayList();
        for (C5642b c5642b : list) {
            c5642b.m24850a();
            this.f15748s.add(c5642b);
        }
    }

    /* renamed from: C */
    private final C5642b m24869C() {
        Object m14087B;
        if (this.f15748s.isEmpty()) {
            return new C5642b();
        }
        m14087B = C9550o.m14087B(this.f15748s);
        return (C5642b) m14087B;
    }

    /* renamed from: D */
    public static final void m24868D(C5644q c5644q) {
        C5623j m24881q;
        if (c5644q == null || (m24881q = c5644q.m24881q()) == null) {
            return;
        }
        m24881q.bringToFront();
    }

    /* renamed from: F */
    public final void m24866F(C5642b c5642b) {
        Canvas m24849b = c5642b.m24849b();
        C9612q.m13920e(m24849b);
        super.drawChild(m24849b, c5642b.m24848c(), c5642b.m24847d());
    }

    /* renamed from: G */
    private final void m24865G(C5644q c5644q) {
        C5644q c5644q2;
        IntRange m21916q;
        List m14030t0;
        List<C5644q> m14081F;
        if (this.f15720j.size() > 1 && c5644q != null && (c5644q2 = this.f15750u) != null && f15745A.m24852c(c5644q2)) {
            ArrayList<T> arrayList = this.f15720j;
            m21916q = C6759j.m21916q(0, arrayList.size() - 1);
            m14030t0 = C9553r.m14030t0(arrayList, m21916q);
            m14081F = C9551p.m14081F(m14030t0);
            for (C5644q c5644q3 : m14081F) {
                c5644q3.m24881q().m24924a(4);
                if (C9612q.m13922c(c5644q3, c5644q)) {
                    break;
                }
            }
        }
        C5623j topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.m24924a(0);
        }
    }

    /* renamed from: E */
    public final void m24867E() {
        if (!this.f15751v) {
            m24871A();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C9612q.m13917h(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f15749t.size() < this.f15754y) {
            this.f15753x = false;
        }
        this.f15754y = this.f15749t.size();
        if (this.f15753x && this.f15749t.size() >= 2) {
            List<C5642b> list = this.f15749t;
            Collections.swap(list, list.size() - 1, this.f15749t.size() - 2);
        }
        m24870B();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j) {
        C9612q.m13917h(canvas, "canvas");
        C9612q.m13917h(child, "child");
        List<C5642b> list = this.f15749t;
        C5642b m24869C = m24869C();
        m24869C.m24846e(canvas);
        m24869C.m24845f(child);
        m24869C.m24844g(j);
        list.add(m24869C);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        C9612q.m13917h(view, "view");
        super.endViewTransition(view);
        if (this.f15751v) {
            this.f15751v = false;
            m24871A();
        }
    }

    public final boolean getGoingForward() {
        return this.f15755z;
    }

    public final C5623j getRootScreen() {
        boolean m14064L;
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            C5623j m24904j = m24904j(i);
            m14064L = C9553r.m14064L(this.f15747r, m24904j.getFragment());
            if (!m14064L) {
                return m24904j;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    @Override // com.swmansion.rnscreens.C5631l
    public C5623j getTopScreen() {
        C5644q c5644q = this.f15750u;
        if (c5644q != null) {
            return c5644q.m24881q();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.C5631l
    /* renamed from: k */
    public boolean mo24863k(C5634n c5634n) {
        boolean m14064L;
        if (super.mo24863k(c5634n)) {
            m14064L = C9553r.m14064L(this.f15747r, c5634n);
            if (!m14064L) {
                return true;
            }
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.C5631l
    /* renamed from: m */
    protected void mo24862m() {
        for (C5644q c5644q : this.f15746q) {
            c5644q.mo24833r();
        }
    }

    @Override // com.swmansion.rnscreens.C5631l
    /* renamed from: p */
    public void mo24861p() {
        boolean m14064L;
        boolean z;
        C5623j m24881q;
        C5644q c5644q;
        boolean z2;
        boolean z3;
        C5623j m24881q2;
        this.f15752w = false;
        int size = this.f15720j.size() - 1;
        C5623j.EnumC5626c enumC5626c = null;
        final C5644q c5644q2 = null;
        C5644q c5644q3 = null;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = this.f15720j.get(size);
                C9612q.m13918g(obj, "mScreenFragments[i]");
                C5644q c5644q4 = (C5644q) obj;
                if (!this.f15747r.contains(c5644q4)) {
                    if (c5644q2 == null) {
                        c5644q2 = c5644q4;
                    } else {
                        c5644q3 = c5644q4;
                    }
                    if (!f15745A.m24852c(c5644q4)) {
                        break;
                    }
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        m14064L = C9553r.m14064L(this.f15746q, c5644q2);
        boolean z4 = true;
        if (!m14064L) {
            C5644q c5644q5 = this.f15750u;
            if (c5644q5 != null && c5644q2 != null) {
                if (c5644q5 != null && this.f15720j.contains(c5644q5)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c5644q2.m24881q().getReplaceAnimation() == C5623j.EnumC5625b.PUSH) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z2 && !z3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    enumC5626c = c5644q2.m24881q().getStackAnimation();
                } else {
                    C5644q c5644q6 = this.f15750u;
                    if (c5644q6 != null && (m24881q2 = c5644q6.m24881q()) != null) {
                        enumC5626c = m24881q2.getStackAnimation();
                    }
                }
            } else {
                if (c5644q5 == null && c5644q2 != null) {
                    enumC5626c = C5623j.EnumC5626c.NONE;
                    this.f15755z = true;
                }
                z = true;
            }
        } else {
            C5644q c5644q7 = this.f15750u;
            if (c5644q7 != null && !C9612q.m13922c(c5644q7, c5644q2)) {
                C5644q c5644q8 = this.f15750u;
                if (c5644q8 != null && (m24881q = c5644q8.m24881q()) != null) {
                    enumC5626c = m24881q.getStackAnimation();
                }
                z = false;
            }
            z = true;
        }
        FragmentTransaction m24908f = m24908f();
        if (enumC5626c != null) {
            if (z) {
                switch (C5643c.f15760a[enumC5626c.ordinal()]) {
                    case 1:
                        m24908f.m36349q(C5619g.f15647a, C5619g.f15648b);
                        break;
                    case 2:
                        int i2 = C5619g.f15655i;
                        m24908f.m36349q(i2, i2);
                        break;
                    case 3:
                        m24908f.m36349q(C5619g.f15652f, C5619g.f15653g);
                        break;
                    case 4:
                        m24908f.m36349q(C5619g.f15661o, C5619g.f15664r);
                        break;
                    case 5:
                        m24908f.m36349q(C5619g.f15660n, C5619g.f15665s);
                        break;
                    case 6:
                        m24908f.m36349q(C5619g.f15658l, C5619g.f15659m);
                        break;
                    case 7:
                        m24908f.m36349q(C5619g.f15651e, C5619g.f15657k);
                        break;
                }
            } else {
                switch (C5643c.f15760a[enumC5626c.ordinal()]) {
                    case 1:
                        m24908f.m36349q(C5619g.f15649c, C5619g.f15650d);
                        break;
                    case 2:
                        int i3 = C5619g.f15655i;
                        m24908f.m36349q(i3, i3);
                        break;
                    case 3:
                        m24908f.m36349q(C5619g.f15652f, C5619g.f15653g);
                        break;
                    case 4:
                        m24908f.m36349q(C5619g.f15660n, C5619g.f15665s);
                        break;
                    case 5:
                        m24908f.m36349q(C5619g.f15661o, C5619g.f15664r);
                        break;
                    case 6:
                        m24908f.m36349q(C5619g.f15663q, C5619g.f15662p);
                        break;
                    case 7:
                        m24908f.m36349q(C5619g.f15656j, C5619g.f15654h);
                        break;
                }
            }
        }
        this.f15755z = z;
        if (z && c5644q2 != null && f15745A.m24851d(c5644q2) && c5644q3 == null) {
            this.f15752w = true;
        }
        Iterator<C5644q> it = this.f15746q.iterator();
        while (it.hasNext()) {
            C5644q next = it.next();
            if (!this.f15720j.contains(next) || this.f15747r.contains(next)) {
                m24908f.mo36326m(next);
            }
        }
        Iterator it2 = this.f15720j.iterator();
        while (it2.hasNext() && (c5644q = (C5644q) it2.next()) != c5644q3) {
            if (c5644q != c5644q2 && !this.f15747r.contains(c5644q)) {
                m24908f.mo36326m(c5644q);
            }
        }
        if (c5644q3 != null && !c5644q3.isAdded()) {
            Iterator it3 = this.f15720j.iterator();
            while (it3.hasNext()) {
                C5644q c5644q9 = (C5644q) it3.next();
                if (z4) {
                    if (c5644q9 == c5644q3) {
                        z4 = false;
                    }
                }
                if (c5644q9 != null && !c5644q9.isAdded()) {
                    m24908f.m36358b(getId(), c5644q9).m36350p(new Runnable() { // from class: com.swmansion.rnscreens.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5640p.m24868D(C5644q.this);
                        }
                    });
                }
            }
        } else if (c5644q2 != null && !c5644q2.isAdded()) {
            m24908f.m36358b(getId(), c5644q2);
        }
        this.f15750u = c5644q2;
        this.f15746q.clear();
        this.f15746q.addAll(this.f15720j);
        m24865G(c5644q3);
        m24908f.mo36328j();
    }

    @Override // com.swmansion.rnscreens.C5631l, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        C9612q.m13917h(view, "view");
        if (this.f15752w) {
            this.f15752w = false;
            this.f15753x = true;
        }
        super.removeView(view);
    }

    @Override // com.swmansion.rnscreens.C5631l
    /* renamed from: s */
    public void mo24860s() {
        this.f15747r.clear();
        super.mo24860s();
    }

    public final void setGoingForward(boolean z) {
        this.f15755z = z;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        C9612q.m13917h(view, "view");
        super.startViewTransition(view);
        this.f15751v = true;
    }

    @Override // com.swmansion.rnscreens.C5631l
    /* renamed from: u */
    public void mo24859u(int i) {
        Set<C5644q> set = this.f15747r;
        C9604l0.m13941a(set).remove(m24904j(i).getFragment());
        super.mo24859u(i);
    }

    @Override // com.swmansion.rnscreens.C5631l
    /* renamed from: y */
    public C5644q mo24864c(C5623j screen) {
        C9612q.m13917h(screen, "screen");
        return new C5644q(screen);
    }

    /* renamed from: z */
    public final void m24855z(C5644q screenFragment) {
        C9612q.m13917h(screenFragment, "screenFragment");
        this.f15747r.add(screenFragment);
        m24899r();
    }
}