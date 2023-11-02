package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.C3575c;
import com.facebook.datasource.C3578e;
import com.facebook.datasource.C3582f;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p006a5.C0025b;
import p114g4.InterfaceC6545b;
import p293q3.C11696a;
import p293q3.InterfaceC11697b;
import p360u3.C12828a;
import p379v3.InterfaceC13060b;
import p394w2.C13375i;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements InterfaceC13060b {

    /* renamed from: p */
    private static final ControllerListener<Object> f9761p = new C3588a();

    /* renamed from: q */
    private static final NullPointerException f9762q = new NullPointerException("No image request was specified!");

    /* renamed from: r */
    private static final AtomicLong f9763r = new AtomicLong();

    /* renamed from: a */
    private final Context f9764a;

    /* renamed from: b */
    private final Set<ControllerListener> f9765b;

    /* renamed from: c */
    private final Set<InterfaceC6545b> f9766c;

    /* renamed from: d */
    private Object f9767d;

    /* renamed from: e */
    private REQUEST f9768e;

    /* renamed from: f */
    private REQUEST f9769f;

    /* renamed from: g */
    private REQUEST[] f9770g;

    /* renamed from: h */
    private boolean f9771h;

    /* renamed from: i */
    private Supplier<DataSource<IMAGE>> f9772i;

    /* renamed from: j */
    private ControllerListener<? super INFO> f9773j;

    /* renamed from: k */
    private boolean f9774k;

    /* renamed from: l */
    private boolean f9775l;

    /* renamed from: m */
    private boolean f9776m;

    /* renamed from: n */
    private String f9777n;

    /* renamed from: o */
    private DraweeController f9778o;

    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C3588a extends C11696a<Object> {
        C3588a() {
        }

        @Override // p293q3.C11696a, com.facebook.drawee.controller.ControllerListener
        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3589b implements Supplier<DataSource<IMAGE>> {

        /* renamed from: a */
        final /* synthetic */ DraweeController f9779a;

        /* renamed from: b */
        final /* synthetic */ String f9780b;

        /* renamed from: c */
        final /* synthetic */ Object f9781c;

        /* renamed from: d */
        final /* synthetic */ Object f9782d;

        /* renamed from: e */
        final /* synthetic */ EnumC3590c f9783e;

        C3589b(DraweeController draweeController, String str, Object obj, Object obj2, EnumC3590c enumC3590c) {
            this.f9779a = draweeController;
            this.f9780b = str;
            this.f9781c = obj;
            this.f9782d = obj2;
            this.f9783e = enumC3590c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public DataSource<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.mo31615i(this.f9779a, this.f9780b, this.f9781c, this.f9782d, this.f9783e);
        }

        public String toString() {
            return C13375i.m2689c(this).m2687b("request", this.f9781c.toString()).toString();
        }
    }

    /* renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3590c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractDraweeControllerBuilder(Context context, Set<ControllerListener> set, Set<InterfaceC6545b> set2) {
        this.f9764a = context;
        this.f9765b = set;
        this.f9766c = set2;
        m31605s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static String m31619e() {
        return String.valueOf(f9763r.getAndIncrement());
    }

    /* renamed from: s */
    private void m31605s() {
        this.f9767d = null;
        this.f9768e = null;
        this.f9769f = null;
        this.f9770g = null;
        this.f9771h = true;
        this.f9773j = null;
        this.f9774k = false;
        this.f9775l = false;
        this.f9778o = null;
        this.f9777n = null;
    }

    /* renamed from: A */
    public BUILDER m31628A(Object obj) {
        this.f9767d = obj;
        return m31606r();
    }

    /* renamed from: B */
    public BUILDER m31627B(String str) {
        this.f9777n = str;
        return m31606r();
    }

    /* renamed from: C */
    public BUILDER m31626C(ControllerListener<? super INFO> controllerListener) {
        this.f9773j = controllerListener;
        return m31606r();
    }

    /* renamed from: D */
    public BUILDER m31625D(REQUEST request) {
        this.f9768e = request;
        return m31606r();
    }

    /* renamed from: E */
    public BUILDER m31624E(REQUEST request) {
        this.f9769f = request;
        return m31606r();
    }

    @Override // p379v3.InterfaceC13060b
    /* renamed from: F */
    public BUILDER mo3373b(DraweeController draweeController) {
        this.f9778o = draweeController;
        return m31606r();
    }

    /* renamed from: G */
    protected void m31622G() {
        boolean z;
        boolean z2 = false;
        if (this.f9770g != null && this.f9768e != null) {
            z = false;
        } else {
            z = true;
        }
        C13379j.m2674j(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f9772i == null || (this.f9770g == null && this.f9768e == null && this.f9769f == null)) {
            z2 = true;
        }
        C13379j.m2674j(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // p379v3.InterfaceC13060b
    /* renamed from: c */
    public AbstractC3591a build() {
        REQUEST request;
        m31622G();
        if (this.f9768e == null && this.f9770g == null && (request = this.f9769f) != null) {
            this.f9768e = request;
            this.f9769f = null;
        }
        return m31620d();
    }

    /* renamed from: d */
    protected AbstractC3591a m31620d() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC3591a mo31601w = mo31601w();
        mo31601w.m31569b0(m31607q());
        mo31601w.m31573X(m31617g());
        m31616h();
        mo31601w.m31571Z(null);
        m31602v(mo31601w);
        m31604t(mo31601w);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return mo31601w;
    }

    /* renamed from: f */
    public Object m31618f() {
        return this.f9767d;
    }

    /* renamed from: g */
    public String m31617g() {
        return this.f9777n;
    }

    /* renamed from: h */
    public InterfaceC11697b m31616h() {
        return null;
    }

    /* renamed from: i */
    protected abstract DataSource<IMAGE> mo31615i(DraweeController draweeController, String str, REQUEST request, Object obj, EnumC3590c enumC3590c);

    /* renamed from: j */
    protected Supplier<DataSource<IMAGE>> m31614j(DraweeController draweeController, String str, REQUEST request) {
        return m31613k(draweeController, str, request, EnumC3590c.FULL_FETCH);
    }

    /* renamed from: k */
    protected Supplier<DataSource<IMAGE>> m31613k(DraweeController draweeController, String str, REQUEST request, EnumC3590c enumC3590c) {
        return new C3589b(draweeController, str, request, m31618f(), enumC3590c);
    }

    /* renamed from: l */
    protected Supplier<DataSource<IMAGE>> m31612l(DraweeController draweeController, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(m31613k(draweeController, str, request, EnumC3590c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(m31614j(draweeController, str, request2));
        }
        return C3578e.m31689b(arrayList);
    }

    /* renamed from: m */
    public REQUEST[] m31611m() {
        return this.f9770g;
    }

    /* renamed from: n */
    public REQUEST m31610n() {
        return this.f9768e;
    }

    /* renamed from: o */
    public REQUEST m31609o() {
        return this.f9769f;
    }

    /* renamed from: p */
    public DraweeController m31608p() {
        return this.f9778o;
    }

    /* renamed from: q */
    public boolean m31607q() {
        return this.f9776m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final BUILDER m31606r() {
        return this;
    }

    /* renamed from: t */
    protected void m31604t(AbstractC3591a abstractC3591a) {
        Set<ControllerListener> set = this.f9765b;
        if (set != null) {
            for (ControllerListener controllerListener : set) {
                abstractC3591a.m31562j(controllerListener);
            }
        }
        Set<InterfaceC6545b> set2 = this.f9766c;
        if (set2 != null) {
            for (InterfaceC6545b interfaceC6545b : set2) {
                abstractC3591a.m31561k(interfaceC6545b);
            }
        }
        ControllerListener<? super INFO> controllerListener2 = this.f9773j;
        if (controllerListener2 != null) {
            abstractC3591a.m31562j(controllerListener2);
        }
        if (this.f9775l) {
            abstractC3591a.m31562j(f9761p);
        }
    }

    /* renamed from: u */
    protected void m31603u(AbstractC3591a abstractC3591a) {
        if (abstractC3591a.m31551u() == null) {
            abstractC3591a.m31570a0(C12828a.m3850c(this.f9764a));
        }
    }

    /* renamed from: v */
    protected void m31602v(AbstractC3591a abstractC3591a) {
        if (!this.f9774k) {
            return;
        }
        abstractC3591a.m31596A().m8192d(this.f9774k);
        m31603u(abstractC3591a);
    }

    /* renamed from: w */
    protected abstract AbstractC3591a mo31601w();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public Supplier<DataSource<IMAGE>> m31600x(DraweeController draweeController, String str) {
        Supplier<DataSource<IMAGE>> supplier;
        Supplier<DataSource<IMAGE>> supplier2 = this.f9772i;
        if (supplier2 != null) {
            return supplier2;
        }
        REQUEST request = this.f9768e;
        if (request != null) {
            supplier = m31614j(draweeController, str, request);
        } else {
            REQUEST[] requestArr = this.f9770g;
            if (requestArr != null) {
                supplier = m31612l(draweeController, str, requestArr, this.f9771h);
            } else {
                supplier = null;
            }
        }
        if (supplier != null && this.f9769f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(supplier);
            arrayList.add(m31614j(draweeController, str, this.f9769f));
            supplier = C3582f.m31674c(arrayList, false);
        }
        if (supplier == null) {
            return C3575c.m31693a(f9762q);
        }
        return supplier;
    }

    /* renamed from: y */
    public BUILDER m31599y() {
        m31605s();
        return m31606r();
    }

    /* renamed from: z */
    public BUILDER m31598z(boolean z) {
        this.f9775l = z;
        return m31606r();
    }
}
