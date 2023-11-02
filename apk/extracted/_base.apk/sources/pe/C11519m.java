package pe;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.textinput.ReactEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0004 !\"#B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006$"}, m14357d2 = {"Lpe/m;", "Lpe/d;", "", "k0", "", "shouldActivateOnStart", "M0", "disallowInterruption", "L0", "handler", "C0", "B0", "f0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "d0", "g0", "L", "Z", "<set-?>", "M", "K0", "()Z", "Lpe/m$d;", "N", "Lpe/m$d;", "hook", "<init>", "()V", "O", "b", "c", "d", "e", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11519m extends C11504d<C11519m> {

    /* renamed from: O */
    public static final C11521b f29933O = new C11521b(null);

    /* renamed from: P */
    private static final C11520a f29934P = new C11520a();

    /* renamed from: L */
    private boolean f29935L;

    /* renamed from: M */
    private boolean f29936M;

    /* renamed from: N */
    private InterfaceC11523d f29937N = f29934P;

    @Metadata(m14358d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m14357d2 = {"pe/m$a", "Lpe/m$d;", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11520a implements InterfaceC11523d {
        C11520a() {
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: a */
        public boolean mo7804a() {
            return InterfaceC11523d.C11524a.m7807d(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: b */
        public boolean mo7803b() {
            return InterfaceC11523d.C11524a.m7805f(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: c */
        public boolean mo7802c() {
            return InterfaceC11523d.C11524a.m7809b(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: d */
        public boolean mo7801d(C11504d<?> c11504d) {
            return InterfaceC11523d.C11524a.m7806e(this, c11504d);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: e */
        public void mo7800e(MotionEvent motionEvent) {
            InterfaceC11523d.C11524a.m7808c(this, motionEvent);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: f */
        public void mo7799f(MotionEvent motionEvent) {
            InterfaceC11523d.C11524a.m7810a(this, motionEvent);
        }
    }

    @Metadata(m14358d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0006*\u0001\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m14357d2 = {"Lpe/m$b;", "", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "b", "pe/m$a", "defaultHook", "Lpe/m$a;", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11521b {
        private C11521b() {
        }

        public /* synthetic */ C11521b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m7811b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    @Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m14357d2 = {"Lpe/m$c;", "Lpe/m$d;", "Landroid/view/MotionEvent;", "event", "", "f", "Lpe/d;", "handler", "", "d", "b", "e", "a", "Lpe/m;", "j", "Lpe/m;", "Lcom/facebook/react/views/textinput/ReactEditText;", "k", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "", "l", "F", "startX", "m", "startY", "", "n", "I", "touchSlopSquared", "<init>", "(Lpe/m;Lcom/facebook/react/views/textinput/ReactEditText;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C11522c implements InterfaceC11523d {

        /* renamed from: j */
        private final C11519m f29938j;

        /* renamed from: k */
        private final ReactEditText f29939k;

        /* renamed from: l */
        private float f29940l;

        /* renamed from: m */
        private float f29941m;

        /* renamed from: n */
        private int f29942n;

        public C11522c(C11519m handler, ReactEditText editText) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(editText, "editText");
            this.f29938j = handler;
            this.f29939k = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.f29942n = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: a */
        public boolean mo7804a() {
            return true;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: b */
        public boolean mo7803b() {
            return true;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: c */
        public boolean mo7802c() {
            return InterfaceC11523d.C11524a.m7809b(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: d */
        public boolean mo7801d(C11504d<?> handler) {
            C9612q.m13917h(handler, "handler");
            if (handler.m7942P() > 0 && !(handler instanceof C11519m)) {
                return true;
            }
            return false;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: e */
        public void mo7800e(MotionEvent event) {
            C9612q.m13917h(event, "event");
            this.f29938j.m7920i();
            this.f29939k.onTouchEvent(event);
            this.f29940l = event.getX();
            this.f29941m = event.getY();
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: f */
        public void mo7799f(MotionEvent event) {
            C9612q.m13917h(event, "event");
            if (((event.getX() - this.f29940l) * (event.getX() - this.f29940l)) + ((event.getY() - this.f29941m) * (event.getY() - this.f29941m)) < this.f29942n) {
                this.f29939k.requestFocusFromJS();
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m14357d2 = {"Lpe/m$d;", "", "", "c", "Landroid/view/MotionEvent;", "event", "", "f", "Lpe/d;", "handler", "d", "b", "e", "a", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.m$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11523d {

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: pe.m$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C11524a {
            /* renamed from: a */
            public static void m7810a(InterfaceC11523d interfaceC11523d, MotionEvent event) {
                C9612q.m13917h(event, "event");
            }

            /* renamed from: b */
            public static boolean m7809b(InterfaceC11523d interfaceC11523d) {
                return true;
            }

            /* renamed from: c */
            public static void m7808c(InterfaceC11523d interfaceC11523d, MotionEvent event) {
                C9612q.m13917h(event, "event");
            }

            /* renamed from: d */
            public static boolean m7807d(InterfaceC11523d interfaceC11523d) {
                return false;
            }

            /* renamed from: e */
            public static boolean m7806e(InterfaceC11523d interfaceC11523d, C11504d<?> handler) {
                C9612q.m13917h(handler, "handler");
                return false;
            }

            /* renamed from: f */
            public static boolean m7805f(InterfaceC11523d interfaceC11523d) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo7804a();

        /* renamed from: b */
        boolean mo7803b();

        /* renamed from: c */
        boolean mo7802c();

        /* renamed from: d */
        boolean mo7801d(C11504d<?> c11504d);

        /* renamed from: e */
        void mo7800e(MotionEvent motionEvent);

        /* renamed from: f */
        void mo7799f(MotionEvent motionEvent);
    }

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lpe/m$e;", "Lpe/m$d;", "", "b", "Landroid/view/MotionEvent;", "event", "", "e", "Lpe/m;", "j", "Lpe/m;", "handler", "Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;", "k", "Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;", "swipeRefreshLayout", "<init>", "(Lpe/m;Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pe.m$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C11525e implements InterfaceC11523d {

        /* renamed from: j */
        private final C11519m f29943j;

        /* renamed from: k */
        private final ReactSwipeRefreshLayout f29944k;

        public C11525e(C11519m handler, ReactSwipeRefreshLayout swipeRefreshLayout) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(swipeRefreshLayout, "swipeRefreshLayout");
            this.f29943j = handler;
            this.f29944k = swipeRefreshLayout;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: a */
        public boolean mo7804a() {
            return InterfaceC11523d.C11524a.m7807d(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: b */
        public boolean mo7803b() {
            return true;
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: c */
        public boolean mo7802c() {
            return InterfaceC11523d.C11524a.m7809b(this);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: d */
        public boolean mo7801d(C11504d<?> c11504d) {
            return InterfaceC11523d.C11524a.m7806e(this, c11504d);
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: e */
        public void mo7800e(MotionEvent event) {
            ScrollView scrollView;
            ArrayList<C11504d<?>> m7855n;
            C9612q.m13917h(event, "event");
            View childAt = this.f29944k.getChildAt(0);
            C11504d c11504d = null;
            if (childAt instanceof ScrollView) {
                scrollView = (ScrollView) childAt;
            } else {
                scrollView = null;
            }
            if (scrollView == null) {
                return;
            }
            C11510g m7945M = this.f29943j.m7945M();
            if (m7945M != null && (m7855n = m7945M.m7855n(scrollView)) != null) {
                Iterator<T> it = m7855n.iterator();
                while (it.hasNext()) {
                    c11504d = (C11504d) it.next();
                    if (c11504d instanceof C11519m) {
                        if (c11504d == null) {
                            return;
                        }
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (c11504d == null && c11504d.m7943O() == 4 && scrollView.getScrollY() > 0) {
                this.f29943j.m7963B();
            }
        }

        @Override // pe.C11519m.InterfaceC11523d
        /* renamed from: f */
        public void mo7799f(MotionEvent motionEvent) {
            InterfaceC11523d.C11524a.m7810a(this, motionEvent);
        }
    }

    public C11519m() {
        m7892y0(true);
    }

    @Override // pe.C11504d
    /* renamed from: B0 */
    public boolean mo7818B0(C11504d<?> handler) {
        C9612q.m13917h(handler, "handler");
        return !this.f29936M;
    }

    @Override // pe.C11504d
    /* renamed from: C0 */
    public boolean mo7817C0(C11504d<?> handler) {
        C9612q.m13917h(handler, "handler");
        if (super.mo7817C0(handler) || this.f29937N.mo7801d(handler)) {
            return true;
        }
        if ((handler instanceof C11519m) && handler.m7943O() == 4 && ((C11519m) handler).f29936M) {
            return false;
        }
        boolean z = !this.f29936M;
        int m7943O = handler.m7943O();
        if ((m7943O() != 4 || m7943O != 4 || !z) && m7943O() == 4 && z && (!this.f29937N.mo7804a() || handler.m7942P() > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public final boolean m7816K0() {
        return this.f29936M;
    }

    /* renamed from: L0 */
    public final C11519m m7815L0(boolean z) {
        this.f29936M = z;
        return this;
    }

    /* renamed from: M0 */
    public final C11519m m7814M0(boolean z) {
        this.f29935L = z;
        return this;
    }

    @Override // pe.C11504d
    /* renamed from: d0 */
    protected void mo7715d0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        View m7939S = m7939S();
        C9612q.m13920e(m7939S);
        m7939S.onTouchEvent(obtain);
    }

    @Override // pe.C11504d
    /* renamed from: e0 */
    protected void mo7714e0(MotionEvent event, MotionEvent sourceEvent) {
        C9612q.m13917h(event, "event");
        C9612q.m13917h(sourceEvent, "sourceEvent");
        View m7939S = m7939S();
        C9612q.m13920e(m7939S);
        if (event.getActionMasked() == 1) {
            m7939S.onTouchEvent(event);
            if ((m7943O() == 0 || m7943O() == 2) && m7939S.isPressed()) {
                m7920i();
            }
            m7891z();
            this.f29937N.mo7799f(event);
        } else if (m7943O() != 0 && m7943O() != 2) {
            if (m7943O() == 4) {
                m7939S.onTouchEvent(event);
            }
        } else if (this.f29935L) {
            f29933O.m7811b(m7939S, event);
            m7939S.onTouchEvent(event);
            m7920i();
        } else if (f29933O.m7811b(m7939S, event)) {
            m7939S.onTouchEvent(event);
            m7920i();
        } else if (this.f29937N.mo7803b()) {
            this.f29937N.mo7800e(event);
        } else if (m7943O() != 2) {
            if (this.f29937N.mo7802c()) {
                m7913n();
            } else {
                m7911o();
            }
        }
    }

    @Override // pe.C11504d
    /* renamed from: f0 */
    protected void mo7813f0() {
        View m7939S = m7939S();
        if (m7939S instanceof InterfaceC11523d) {
            this.f29937N = (InterfaceC11523d) m7939S;
        } else if (m7939S instanceof ReactEditText) {
            this.f29937N = new C11522c(this, (ReactEditText) m7939S);
        } else if (m7939S instanceof ReactSwipeRefreshLayout) {
            this.f29937N = new C11525e(this, (ReactSwipeRefreshLayout) m7939S);
        }
    }

    @Override // pe.C11504d
    /* renamed from: g0 */
    protected void mo7713g0() {
        this.f29937N = f29934P;
    }

    @Override // pe.C11504d
    /* renamed from: k0 */
    public void mo7711k0() {
        super.mo7711k0();
        this.f29935L = false;
        this.f29936M = false;
    }
}
