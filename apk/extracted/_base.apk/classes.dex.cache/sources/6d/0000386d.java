package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C7831b0;
import io.sentry.C7901e;
import io.sentry.C8125q5;
import io.sentry.C8160s5;
import io.sentry.EnumC7975i5;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8164t2;
import io.sentry.InterfaceC8259w0;
import io.sentry.Scope;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C7981b;
import io.sentry.protocol.EnumC8118z;
import io.sentry.util.C8241w;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* renamed from: io.sentry.android.core.internal.gestures.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class GestureDetector$OnGestureListenerC7745g implements GestureDetector.OnGestureListener {

    /* renamed from: j */
    private final WeakReference<Activity> f21216j;

    /* renamed from: k */
    private final InterfaceC8025n0 f21217k;

    /* renamed from: l */
    private final SentryAndroidOptions f21218l;

    /* renamed from: m */
    private C7981b f21219m = null;

    /* renamed from: n */
    private InterfaceC8259w0 f21220n = null;

    /* renamed from: o */
    private String f21221o = null;

    /* renamed from: p */
    private final C7747b f21222p = new C7747b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.android.core.internal.gestures.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7747b {

        /* renamed from: a */
        private String f21223a;

        /* renamed from: b */
        private C7981b f21224b;

        /* renamed from: c */
        private float f21225c;

        /* renamed from: d */
        private float f21226d;

        private C7747b() {
            this.f21223a = null;
            this.f21225c = 0.0f;
            this.f21226d = 0.0f;
        }

        /* renamed from: i */
        public String m19802i(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.f21225c;
            float y = motionEvent.getY() - this.f21226d;
            if (Math.abs(x) > Math.abs(y)) {
                if (x > 0.0f) {
                    return ViewProps.RIGHT;
                }
                return ViewProps.LEFT;
            } else if (y > 0.0f) {
                return "down";
            } else {
                return "up";
            }
        }

        /* renamed from: j */
        public void m19801j() {
            this.f21224b = null;
            this.f21223a = null;
            this.f21225c = 0.0f;
            this.f21226d = 0.0f;
        }

        /* renamed from: k */
        public void m19800k(C7981b c7981b) {
            this.f21224b = c7981b;
        }
    }

    public GestureDetector$OnGestureListenerC7745g(Activity activity, InterfaceC8025n0 interfaceC8025n0, SentryAndroidOptions sentryAndroidOptions) {
        this.f21216j = new WeakReference<>(activity);
        this.f21217k = interfaceC8025n0;
        this.f21218l = sentryAndroidOptions;
    }

    /* renamed from: e */
    private void m19822e(C7981b c7981b, String str, Map<String, Object> map, MotionEvent motionEvent) {
        if (!this.f21218l.isEnableUserInteractionBreadcrumbs()) {
            return;
        }
        C7831b0 c7831b0 = new C7831b0();
        c7831b0.m19592j("android:motionEvent", motionEvent);
        c7831b0.m19592j("android:view", c7981b.m19101f());
        this.f21217k.mo18266f(C7901e.m19323r(str, c7981b.m19103d(), c7981b.m19106a(), c7981b.m19102e(), map), c7831b0);
    }

    /* renamed from: h */
    private View m19819h(String str) {
        Activity activity = this.f21216j.get();
        if (activity == null) {
            InterfaceC8040o0 logger = this.f21218l.getLogger();
            EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
            logger.mo18135c(enumC8021m4, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            InterfaceC8040o0 logger2 = this.f21218l.getLogger();
            EnumC8021m4 enumC8021m42 = EnumC8021m4.DEBUG;
            logger2.mo18135c(enumC8021m42, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            InterfaceC8040o0 logger3 = this.f21218l.getLogger();
            EnumC8021m4 enumC8021m43 = EnumC8021m4.DEBUG;
            logger3.mo18135c(enumC8021m43, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        return decorView;
    }

    /* renamed from: i */
    private String m19818i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* renamed from: j */
    public /* synthetic */ void m19817j(Scope scope, InterfaceC8259w0 interfaceC8259w0, InterfaceC8259w0 interfaceC8259w02) {
        if (interfaceC8259w02 == null) {
            scope.m20087C(interfaceC8259w0);
        } else {
            this.f21218l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC8259w0.getName());
        }
    }

    /* renamed from: k */
    public /* synthetic */ void m19816k(Scope scope, InterfaceC8259w0 interfaceC8259w0) {
        if (interfaceC8259w0 == this.f21220n) {
            scope.m20076f();
        }
    }

    /* renamed from: o */
    private void m19812o(C7981b c7981b, String str) {
        Activity activity;
        C7981b c7981b2 = this.f21219m;
        if (this.f21218l.isTracingEnabled() && this.f21218l.isEnableUserInteractionTracing()) {
            if (this.f21216j.get() == null) {
                this.f21218l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            String m19105b = c7981b.m19105b();
            if (this.f21220n != null) {
                if (c7981b.equals(c7981b2) && str.equals(this.f21221o) && !this.f21220n.mo17951a()) {
                    this.f21218l.getLogger().mo18135c(EnumC8021m4.DEBUG, "The view with id: " + m19105b + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                    if (this.f21218l.getIdleTimeout() != null) {
                        this.f21220n.mo17937o();
                        return;
                    }
                    return;
                }
                m19811p(EnumC7975i5.OK);
            }
            C8160s5 c8160s5 = new C8160s5();
            c8160s5.m18362p(true);
            c8160s5.m18365m(this.f21218l.getIdleTimeout());
            c8160s5.m19157d(true);
            final InterfaceC8259w0 mo18255q = this.f21217k.mo18255q(new C8125q5(m19818i(activity) + "." + m19105b, EnumC8118z.COMPONENT, "ui.action." + str), c8160s5);
            mo18255q.mo17936p().m19293m("auto.ui.gesture_listener." + c7981b.m19104c());
            this.f21217k.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.internal.gestures.d
                @Override // io.sentry.InterfaceC8164t2
                /* renamed from: a */
                public final void mo18044a(Scope scope) {
                    GestureDetector$OnGestureListenerC7745g.this.m19815l(mo18255q, scope);
                }
            });
            this.f21220n = mo18255q;
            this.f21219m = c7981b;
            this.f21221o = str;
        } else if (!c7981b.equals(c7981b2) || !str.equals(this.f21221o)) {
            C8241w.m18138h(this.f21217k);
            this.f21219m = c7981b;
            this.f21221o = str;
        }
    }

    /* renamed from: f */
    public void m19815l(final Scope scope, final InterfaceC8259w0 interfaceC8259w0) {
        scope.m20082H(new Scope.InterfaceC7681c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.Scope.InterfaceC7681c
            /* renamed from: a */
            public final void mo18033a(InterfaceC8259w0 interfaceC8259w02) {
                GestureDetector$OnGestureListenerC7745g.this.m19817j(scope, interfaceC8259w0, interfaceC8259w02);
            }
        });
    }

    /* renamed from: g */
    public void m19814m(final Scope scope) {
        scope.m20082H(new Scope.InterfaceC7681c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.Scope.InterfaceC7681c
            /* renamed from: a */
            public final void mo18033a(InterfaceC8259w0 interfaceC8259w0) {
                GestureDetector$OnGestureListenerC7745g.this.m19816k(scope, interfaceC8259w0);
            }
        });
    }

    /* renamed from: n */
    public void m19813n(MotionEvent motionEvent) {
        View m19819h = m19819h("onUp");
        C7981b c7981b = this.f21222p.f21224b;
        if (m19819h != null && c7981b != null) {
            if (this.f21222p.f21223a == null) {
                this.f21218l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            m19822e(c7981b, this.f21222p.f21223a, Collections.singletonMap("direction", this.f21222p.m19802i(motionEvent)), motionEvent);
            m19812o(c7981b, this.f21222p.f21223a);
            this.f21222p.m19801j();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f21222p.m19801j();
        this.f21222p.f21225c = motionEvent.getX();
        this.f21222p.f21226d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f21222p.f21223a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View m19819h = m19819h("onScroll");
        if (m19819h != null && motionEvent != null && this.f21222p.f21223a == null) {
            C7981b m19794a = C7752j.m19794a(this.f21218l, m19819h, motionEvent.getX(), motionEvent.getY(), C7981b.EnumC7982a.SCROLLABLE);
            if (m19794a == null) {
                this.f21218l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            InterfaceC8040o0 logger = this.f21218l.getLogger();
            EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
            logger.mo18135c(enumC8021m4, "Scroll target found: " + m19794a.m19105b(), new Object[0]);
            this.f21222p.m19800k(m19794a);
            this.f21222p.f21223a = ViewProps.SCROLL;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View m19819h = m19819h("onSingleTapUp");
        if (m19819h != null && motionEvent != null) {
            C7981b m19794a = C7752j.m19794a(this.f21218l, m19819h, motionEvent.getX(), motionEvent.getY(), C7981b.EnumC7982a.CLICKABLE);
            if (m19794a == null) {
                this.f21218l.getLogger().mo18135c(EnumC8021m4.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            m19822e(m19794a, "click", Collections.emptyMap(), motionEvent);
            m19812o(m19794a, "click");
        }
        return false;
    }

    /* renamed from: p */
    public void m19811p(EnumC7975i5 enumC7975i5) {
        InterfaceC8259w0 interfaceC8259w0 = this.f21220n;
        if (interfaceC8259w0 != null) {
            interfaceC8259w0.mo17942j(enumC7975i5);
        }
        this.f21217k.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                GestureDetector$OnGestureListenerC7745g.this.m19814m(scope);
            }
        });
        this.f21220n = null;
        if (this.f21219m != null) {
            this.f21219m = null;
        }
        this.f21221o = null;
    }
}