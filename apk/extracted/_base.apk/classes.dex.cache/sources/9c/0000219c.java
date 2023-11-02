package com.facebook.drawee.controller;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.datasource.AbstractC3574b;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a5.C0025b;
import p095f4.C6309a;
import p114g4.C6548d;
import p114g4.InterfaceC6545b;
import p277p3.AbstractC11375a;
import p277p3.C11379c;
import p277p3.C11381d;
import p293q3.C11696a;
import p293q3.C11698c;
import p293q3.InterfaceC11697b;
import p360u3.C12828a;
import p379v3.InterfaceC13059a;
import p394w2.C13372f;
import p394w2.C13375i;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: com.facebook.drawee.controller.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3591a<T, INFO> implements DraweeController, AbstractC11375a.InterfaceC11376a, C12828a.InterfaceC12829a {

    /* renamed from: v */
    private static final Map<String, Object> f9789v = C13372f.m2695of("component_tag", "drawee");

    /* renamed from: w */
    private static final Map<String, Object> f9790w = C13372f.m2694of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: x */
    private static final Class<?> f9791x = AbstractC3591a.class;

    /* renamed from: b */
    private final AbstractC11375a f9793b;

    /* renamed from: c */
    private final Executor f9794c;

    /* renamed from: d */
    private C11381d f9795d;

    /* renamed from: e */
    private C12828a f9796e;

    /* renamed from: f */
    protected ControllerListener<INFO> f9797f;

    /* renamed from: h */
    private InterfaceC13059a f9799h;

    /* renamed from: i */
    private Drawable f9800i;

    /* renamed from: j */
    private String f9801j;

    /* renamed from: k */
    private Object f9802k;

    /* renamed from: l */
    private boolean f9803l;

    /* renamed from: m */
    private boolean f9804m;

    /* renamed from: n */
    private boolean f9805n;

    /* renamed from: o */
    private boolean f9806o;

    /* renamed from: p */
    private boolean f9807p;

    /* renamed from: q */
    private String f9808q;

    /* renamed from: r */
    private DataSource<T> f9809r;

    /* renamed from: s */
    private T f9810s;

    /* renamed from: u */
    protected Drawable f9812u;

    /* renamed from: a */
    private final C11379c f9792a = C11379c.m8197a();

    /* renamed from: g */
    protected C6548d<INFO> f9798g = new C6548d<>();

    /* renamed from: t */
    private boolean f9811t = true;

    /* renamed from: com.facebook.drawee.controller.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3592a extends AbstractC3574b<T> {

        /* renamed from: a */
        final /* synthetic */ String f9813a;

        /* renamed from: b */
        final /* synthetic */ boolean f9814b;

        C3592a(String str, boolean z) {
            AbstractC3591a.this = r1;
            this.f9813a = str;
            this.f9814b = z;
        }

        @Override // com.facebook.datasource.AbstractC3574b
        public void onFailureImpl(DataSource<T> dataSource) {
            AbstractC3591a.this.m31587J(this.f9813a, dataSource, dataSource.mo31711c(), true);
        }

        @Override // com.facebook.datasource.AbstractC3574b
        public void onNewResultImpl(DataSource<T> dataSource) {
            boolean mo31712a = dataSource.mo31712a();
            boolean mo31708f = dataSource.mo31708f();
            float mo31709e = dataSource.mo31709e();
            T mo31018g = dataSource.mo31018g();
            if (mo31018g != null) {
                AbstractC3591a.this.m31585L(this.f9813a, dataSource, mo31018g, mo31709e, mo31712a, this.f9814b, mo31708f);
            } else if (mo31712a) {
                AbstractC3591a.this.m31587J(this.f9813a, dataSource, new NullPointerException(), true);
            }
        }

        @Override // com.facebook.datasource.AbstractC3574b, com.facebook.datasource.InterfaceC3577d
        public void onProgressUpdate(DataSource<T> dataSource) {
            boolean mo31712a = dataSource.mo31712a();
            AbstractC3591a.this.m31584M(this.f9813a, dataSource, dataSource.mo31709e(), mo31712a);
        }
    }

    /* renamed from: com.facebook.drawee.controller.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3593b<INFO> extends C11698c<INFO> {
        private C3593b() {
        }

        /* renamed from: d */
        public static <INFO> C3593b<INFO> m31545d(ControllerListener<? super INFO> controllerListener, ControllerListener<? super INFO> controllerListener2) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("AbstractDraweeController#createInternal");
            }
            C3593b<INFO> c3593b = new C3593b<>();
            c3593b.m7157a(controllerListener);
            c3593b.m7157a(controllerListener2);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return c3593b;
        }
    }

    public AbstractC3591a(AbstractC11375a abstractC11375a, Executor executor, String str, Object obj) {
        this.f9793b = abstractC11375a;
        this.f9794c = executor;
        m31595B(str, obj);
    }

    /* renamed from: B */
    private synchronized void m31595B(String str, Object obj) {
        AbstractC11375a abstractC11375a;
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractDraweeController#init");
        }
        this.f9792a.m8196b(C11379c.EnumC11380a.ON_INIT_CONTROLLER);
        if (!this.f9811t && (abstractC11375a = this.f9793b) != null) {
            abstractC11375a.mo8204a(this);
        }
        this.f9803l = false;
        this.f9805n = false;
        m31582O();
        this.f9807p = false;
        C11381d c11381d = this.f9795d;
        if (c11381d != null) {
            c11381d.m8195a();
        }
        C12828a c12828a = this.f9796e;
        if (c12828a != null) {
            c12828a.m3852a();
            this.f9796e.m3847f(this);
        }
        ControllerListener<INFO> controllerListener = this.f9797f;
        if (controllerListener instanceof C3593b) {
            ((C3593b) controllerListener).m7156b();
        } else {
            this.f9797f = null;
        }
        InterfaceC13059a interfaceC13059a = this.f9799h;
        if (interfaceC13059a != null) {
            interfaceC13059a.reset();
            this.f9799h.mo3375f(null);
            this.f9799h = null;
        }
        this.f9800i = null;
        if (C13677a.m1842v(2)) {
            C13677a.m1838z(f9791x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f9801j, str);
        }
        this.f9801j = str;
        this.f9802k = obj;
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: D */
    private boolean m31593D(String str, DataSource<T> dataSource) {
        if (dataSource == null && this.f9809r == null) {
            return true;
        }
        if (str.equals(this.f9801j) && dataSource == this.f9809r && this.f9804m) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private void m31592E(String str, Throwable th2) {
        if (C13677a.m1842v(2)) {
            C13677a.m1877A(f9791x, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f9801j, str, th2);
        }
    }

    /* renamed from: F */
    private void m31591F(String str, T t) {
        if (C13677a.m1842v(2)) {
            C13677a.m1876B(f9791x, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f9801j, str, m31549w(t), Integer.valueOf(mo31548x(t)));
        }
    }

    /* renamed from: G */
    private InterfaceC6545b.C6546a m31590G(DataSource<T> dataSource, INFO info, Uri uri) {
        Map<String, Object> extras;
        if (dataSource == null) {
            extras = null;
        } else {
            extras = dataSource.getExtras();
        }
        return m31589H(extras, mo31588I(info), uri);
    }

    /* renamed from: H */
    private InterfaceC6545b.C6546a m31589H(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointF;
        InterfaceC13059a interfaceC13059a = this.f9799h;
        if (interfaceC13059a instanceof GenericDraweeHierarchy) {
            str = String.valueOf(((GenericDraweeHierarchy) interfaceC13059a).m31473m());
            pointF = ((GenericDraweeHierarchy) this.f9799h).m31474l();
        } else {
            str = null;
            pointF = null;
        }
        return C6309a.m22999a(f9789v, f9790w, map, m31552t(), str, pointF, map2, m31557o(), uri);
    }

    /* renamed from: J */
    public void m31587J(String str, DataSource<T> dataSource, Throwable th2, boolean z) {
        C11379c.EnumC11380a enumC11380a;
        Drawable drawable;
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractDraweeController#onFailureInternal");
        }
        if (!m31593D(str, dataSource)) {
            m31592E("ignore_old_datasource @ onFailure", th2);
            dataSource.close();
            if (C0025b.m41375d()) {
                C0025b.m41377b();
                return;
            }
            return;
        }
        C11379c c11379c = this.f9792a;
        if (z) {
            enumC11380a = C11379c.EnumC11380a.ON_DATASOURCE_FAILURE;
        } else {
            enumC11380a = C11379c.EnumC11380a.ON_DATASOURCE_FAILURE_INT;
        }
        c11379c.m8196b(enumC11380a);
        if (z) {
            m31592E("final_failed @ onFailure", th2);
            this.f9809r = null;
            this.f9806o = true;
            if (this.f9807p && (drawable = this.f9812u) != null) {
                this.f9799h.mo3376e(drawable, 1.0f, true);
            } else if (m31567d0()) {
                this.f9799h.mo3379a(th2);
            } else {
                this.f9799h.mo3378b(th2);
            }
            m31579R(th2, dataSource);
        } else {
            m31592E("intermediate_failed @ onFailure", th2);
            m31578S(th2);
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: L */
    public void m31585L(String str, DataSource<T> dataSource, T t, float f, boolean z, boolean z2, boolean z3) {
        C11379c.EnumC11380a enumC11380a;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m31593D(str, dataSource)) {
                m31591F("ignore_old_datasource @ onNewResult", t);
                mo31581P(t);
                dataSource.close();
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                    return;
                }
                return;
            }
            C11379c c11379c = this.f9792a;
            if (z) {
                enumC11380a = C11379c.EnumC11380a.ON_DATASOURCE_RESULT;
            } else {
                enumC11380a = C11379c.EnumC11380a.ON_DATASOURCE_RESULT_INT;
            }
            c11379c.m8196b(enumC11380a);
            try {
                Drawable mo31560l = mo31560l(t);
                T t2 = this.f9810s;
                Drawable drawable = this.f9812u;
                this.f9810s = t;
                this.f9812u = mo31560l;
                if (z) {
                    m31591F("set_final_result @ onNewResult", t);
                    this.f9809r = null;
                    this.f9799h.mo3376e(mo31560l, 1.0f, z2);
                    m31574W(str, t, dataSource);
                } else if (z3) {
                    m31591F("set_temporary_result @ onNewResult", t);
                    this.f9799h.mo3376e(mo31560l, 1.0f, z2);
                    m31574W(str, t, dataSource);
                } else {
                    m31591F("set_intermediate_result @ onNewResult", t);
                    this.f9799h.mo3376e(mo31560l, f, z2);
                    m31577T(str, t);
                }
                if (drawable != null && drawable != mo31560l) {
                    mo31583N(drawable);
                }
                if (t2 != null && t2 != t) {
                    m31591F("release_previous_result @ onNewResult", t2);
                    mo31581P(t2);
                }
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            } catch (Exception e) {
                m31591F("drawable_failed @ onNewResult", t);
                mo31581P(t);
                m31587J(str, dataSource, e, z);
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            }
        } catch (Throwable th2) {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            throw th2;
        }
    }

    /* renamed from: M */
    public void m31584M(String str, DataSource<T> dataSource, float f, boolean z) {
        if (!m31593D(str, dataSource)) {
            m31592E("ignore_old_datasource @ onProgress", null);
            dataSource.close();
        } else if (!z) {
            this.f9799h.mo3377c(f, false);
        }
    }

    /* renamed from: O */
    private void m31582O() {
        Map<String, Object> map;
        boolean z = this.f9804m;
        this.f9804m = false;
        this.f9806o = false;
        DataSource<T> dataSource = this.f9809r;
        Map<String, Object> map2 = null;
        if (dataSource != null) {
            map = dataSource.getExtras();
            this.f9809r.close();
            this.f9809r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f9812u;
        if (drawable != null) {
            mo31583N(drawable);
        }
        if (this.f9808q != null) {
            this.f9808q = null;
        }
        this.f9812u = null;
        T t = this.f9810s;
        if (t != null) {
            Map<String, Object> mo31588I = mo31588I(mo31547y(t));
            m31591F("release", this.f9810s);
            mo31581P(this.f9810s);
            this.f9810s = null;
            map2 = mo31588I;
        }
        if (z) {
            m31576U(map, map2);
        }
    }

    /* renamed from: R */
    private void m31579R(Throwable th2, DataSource<T> dataSource) {
        InterfaceC6545b.C6546a m31590G = m31590G(dataSource, null, null);
        m31556p().onFailure(this.f9801j, th2);
        m31555q().mo9422i(this.f9801j, th2, m31590G);
    }

    /* renamed from: S */
    private void m31578S(Throwable th2) {
        m31556p().onIntermediateImageFailed(this.f9801j, th2);
        m31555q().mo22420a(this.f9801j);
    }

    /* renamed from: T */
    private void m31577T(String str, T t) {
        INFO mo31547y = mo31547y(t);
        m31556p().onIntermediateImageSet(str, mo31547y);
        m31555q().onIntermediateImageSet(str, mo31547y);
    }

    /* renamed from: U */
    private void m31576U(Map<String, Object> map, Map<String, Object> map2) {
        m31556p().onRelease(this.f9801j);
        m31555q().mo9420m(this.f9801j, m31589H(map, map2, null));
    }

    /* renamed from: W */
    private void m31574W(String str, T t, DataSource<T> dataSource) {
        INFO mo31547y = mo31547y(t);
        m31556p().onFinalImageSet(str, mo31547y, m31559m());
        m31555q().mo9423h(str, mo31547y, m31590G(dataSource, mo31547y, null));
    }

    /* renamed from: d0 */
    private boolean m31567d0() {
        C11381d c11381d;
        return this.f9806o && (c11381d = this.f9795d) != null && c11381d.m8191e();
    }

    /* renamed from: t */
    private Rect m31552t() {
        InterfaceC13059a interfaceC13059a = this.f9799h;
        if (interfaceC13059a == null) {
            return null;
        }
        return interfaceC13059a.getBounds();
    }

    /* renamed from: A */
    public C11381d m31596A() {
        if (this.f9795d == null) {
            this.f9795d = new C11381d();
        }
        return this.f9795d;
    }

    /* renamed from: C */
    public void m31594C(String str, Object obj) {
        m31595B(str, obj);
        this.f9811t = false;
    }

    /* renamed from: I */
    public abstract Map<String, Object> mo31588I(INFO info);

    /* renamed from: K */
    public void mo31586K(String str, T t) {
    }

    /* renamed from: N */
    protected abstract void mo31583N(Drawable drawable);

    /* renamed from: P */
    protected abstract void mo31581P(T t);

    /* renamed from: Q */
    public void m31580Q(InterfaceC6545b<INFO> interfaceC6545b) {
        this.f9798g.m22417s(interfaceC6545b);
    }

    /* renamed from: V */
    protected void m31575V(DataSource<T> dataSource, INFO info) {
        m31556p().onSubmit(this.f9801j, this.f9802k);
        m31555q().mo9421j(this.f9801j, this.f9802k, m31590G(dataSource, info, mo31546z()));
    }

    /* renamed from: X */
    public void m31573X(String str) {
        this.f9808q = str;
    }

    /* renamed from: Y */
    public void m31572Y(Drawable drawable) {
        this.f9800i = drawable;
        InterfaceC13059a interfaceC13059a = this.f9799h;
        if (interfaceC13059a != null) {
            interfaceC13059a.mo3375f(drawable);
        }
    }

    /* renamed from: Z */
    public void m31571Z(InterfaceC11697b interfaceC11697b) {
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: a */
    public boolean mo31389a(MotionEvent motionEvent) {
        if (C13677a.m1842v(2)) {
            C13677a.m1838z(f9791x, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f9801j, motionEvent);
        }
        C12828a c12828a = this.f9796e;
        if (c12828a == null) {
            return false;
        }
        if (!c12828a.m3851b() && !m31568c0()) {
            return false;
        }
        this.f9796e.m3849d(motionEvent);
        return true;
    }

    /* renamed from: a0 */
    public void m31570a0(C12828a c12828a) {
        this.f9796e = c12828a;
        if (c12828a != null) {
            c12828a.m3847f(this);
        }
    }

    @Override // p360u3.C12828a.InterfaceC12829a
    /* renamed from: b */
    public boolean mo3846b() {
        if (C13677a.m1842v(2)) {
            C13677a.m1839y(f9791x, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f9801j);
        }
        if (m31567d0()) {
            this.f9795d.m8194b();
            this.f9799h.reset();
            m31566e0();
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public void m31569b0(boolean z) {
        this.f9807p = z;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: c */
    public void mo31388c() {
        String str;
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractDraweeController#onAttach");
        }
        if (C13677a.m1842v(2)) {
            Class<?> cls = f9791x;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f9801j;
            if (this.f9804m) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            C13677a.m1838z(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.f9792a.m8196b(C11379c.EnumC11380a.ON_ATTACH_CONTROLLER);
        C13379j.m2677g(this.f9799h);
        this.f9793b.mo8204a(this);
        this.f9803l = true;
        if (!this.f9804m) {
            m31566e0();
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: c0 */
    protected boolean m31568c0() {
        return m31567d0();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: d */
    public void mo31387d(DraweeHierarchy draweeHierarchy) {
        C11379c.EnumC11380a enumC11380a;
        if (C13677a.m1842v(2)) {
            C13677a.m1838z(f9791x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f9801j, draweeHierarchy);
        }
        C11379c c11379c = this.f9792a;
        if (draweeHierarchy != null) {
            enumC11380a = C11379c.EnumC11380a.ON_SET_HIERARCHY;
        } else {
            enumC11380a = C11379c.EnumC11380a.ON_CLEAR_HIERARCHY;
        }
        c11379c.m8196b(enumC11380a);
        if (this.f9804m) {
            this.f9793b.mo8204a(this);
            release();
        }
        InterfaceC13059a interfaceC13059a = this.f9799h;
        if (interfaceC13059a != null) {
            interfaceC13059a.mo3375f(null);
            this.f9799h = null;
        }
        if (draweeHierarchy != null) {
            C13379j.m2682b(Boolean.valueOf(draweeHierarchy instanceof InterfaceC13059a));
            InterfaceC13059a interfaceC13059a2 = (InterfaceC13059a) draweeHierarchy;
            this.f9799h = interfaceC13059a2;
            interfaceC13059a2.mo3375f(this.f9800i);
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: e */
    public void mo31386e() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractDraweeController#onDetach");
        }
        if (C13677a.m1842v(2)) {
            C13677a.m1839y(f9791x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f9801j);
        }
        this.f9792a.m8196b(C11379c.EnumC11380a.ON_DETACH_CONTROLLER);
        this.f9803l = false;
        this.f9793b.mo8203d(this);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: e0 */
    protected void m31566e0() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractDraweeController#submitRequest");
        }
        T mo31558n = mo31558n();
        if (mo31558n != null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("AbstractDraweeController#submitRequest->cache");
            }
            this.f9809r = null;
            this.f9804m = true;
            this.f9806o = false;
            this.f9792a.m8196b(C11379c.EnumC11380a.ON_SUBMIT_CACHE_HIT);
            m31575V(this.f9809r, mo31547y(mo31558n));
            mo31586K(this.f9801j, mo31558n);
            m31585L(this.f9801j, this.f9809r, mo31558n, 1.0f, true, true, true);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            if (C0025b.m41375d()) {
                C0025b.m41377b();
                return;
            }
            return;
        }
        this.f9792a.m8196b(C11379c.EnumC11380a.ON_DATASOURCE_SUBMIT);
        this.f9799h.mo3377c(0.0f, true);
        this.f9804m = true;
        this.f9806o = false;
        DataSource<T> mo31553s = mo31553s();
        this.f9809r = mo31553s;
        m31575V(mo31553s, null);
        if (C13677a.m1842v(2)) {
            C13677a.m1838z(f9791x, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f9801j, Integer.valueOf(System.identityHashCode(this.f9809r)));
        }
        this.f9809r.mo31710d(new C3592a(this.f9801j, this.f9809r.mo31663b()), this.f9794c);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    /* renamed from: f */
    public DraweeHierarchy mo31385f() {
        return this.f9799h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void m31562j(ControllerListener<? super INFO> controllerListener) {
        C13379j.m2677g(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.f9797f;
        if (controllerListener2 instanceof C3593b) {
            ((C3593b) controllerListener2).m7157a(controllerListener);
        } else if (controllerListener2 != null) {
            this.f9797f = C3593b.m31545d(controllerListener2, controllerListener);
        } else {
            this.f9797f = controllerListener;
        }
    }

    /* renamed from: k */
    public void m31561k(InterfaceC6545b<INFO> interfaceC6545b) {
        this.f9798g.m22419o(interfaceC6545b);
    }

    /* renamed from: l */
    protected abstract Drawable mo31560l(T t);

    /* renamed from: m */
    public Animatable m31559m() {
        Drawable drawable = this.f9812u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* renamed from: n */
    protected T mo31558n() {
        return null;
    }

    /* renamed from: o */
    public Object m31557o() {
        return this.f9802k;
    }

    /* renamed from: p */
    protected ControllerListener<INFO> m31556p() {
        ControllerListener<INFO> controllerListener = this.f9797f;
        if (controllerListener == null) {
            return C11696a.m7158a();
        }
        return controllerListener;
    }

    /* renamed from: q */
    protected InterfaceC6545b<INFO> m31555q() {
        return this.f9798g;
    }

    /* renamed from: r */
    public Drawable m31554r() {
        return this.f9800i;
    }

    @Override // p277p3.AbstractC11375a.InterfaceC11376a
    public void release() {
        this.f9792a.m8196b(C11379c.EnumC11380a.ON_RELEASE_CONTROLLER);
        C11381d c11381d = this.f9795d;
        if (c11381d != null) {
            c11381d.m8193c();
        }
        C12828a c12828a = this.f9796e;
        if (c12828a != null) {
            c12828a.m3848e();
        }
        InterfaceC13059a interfaceC13059a = this.f9799h;
        if (interfaceC13059a != null) {
            interfaceC13059a.reset();
        }
        m31582O();
    }

    /* renamed from: s */
    protected abstract DataSource<T> mo31553s();

    public String toString() {
        return C13375i.m2689c(this).m2686c("isAttached", this.f9803l).m2686c("isRequestSubmitted", this.f9804m).m2686c("hasFetchFailed", this.f9806o).m2688a("fetchedImage", mo31548x(this.f9810s)).m2687b("events", this.f9792a.toString()).toString();
    }

    /* renamed from: u */
    public C12828a m31551u() {
        return this.f9796e;
    }

    /* renamed from: v */
    public String m31550v() {
        return this.f9801j;
    }

    /* renamed from: w */
    protected String m31549w(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* renamed from: x */
    protected int mo31548x(T t) {
        return System.identityHashCode(t);
    }

    /* renamed from: y */
    protected abstract INFO mo31547y(T t);

    /* renamed from: z */
    protected Uri mo31546z() {
        return null;
    }
}