package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.drawable.InterfaceC3626p;
import com.facebook.drawee.drawable.InterfaceC3627q;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import p277p3.C11379c;
import p394w2.C13375i;
import p394w2.C13379j;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DraweeHolder<DH extends DraweeHierarchy> implements InterfaceC3627q {

    /* renamed from: d */
    private DH f10013d;

    /* renamed from: a */
    private boolean f10010a = false;

    /* renamed from: b */
    private boolean f10011b = false;

    /* renamed from: c */
    private boolean f10012c = true;

    /* renamed from: e */
    private DraweeController f10014e = null;

    /* renamed from: f */
    private final C11379c f10015f = C11379c.m8197a();

    public DraweeHolder(DH dh) {
        if (dh != null) {
            m31348p(dh);
        }
    }

    /* renamed from: b */
    private void m31362b() {
        if (this.f10010a) {
            return;
        }
        this.f10015f.m8196b(C11379c.EnumC11380a.ON_ATTACH_CONTROLLER);
        this.f10010a = true;
        DraweeController draweeController = this.f10014e;
        if (draweeController != null && draweeController.mo31385f() != null) {
            this.f10014e.mo31388c();
        }
    }

    /* renamed from: c */
    private void m31361c() {
        if (this.f10011b && this.f10012c) {
            m31362b();
        } else {
            m31359e();
        }
    }

    /* renamed from: d */
    public static <DH extends DraweeHierarchy> DraweeHolder<DH> m31360d(DH dh, Context context) {
        DraweeHolder<DH> draweeHolder = new DraweeHolder<>(dh);
        draweeHolder.m31350n(context);
        return draweeHolder;
    }

    /* renamed from: e */
    private void m31359e() {
        if (!this.f10010a) {
            return;
        }
        this.f10015f.m8196b(C11379c.EnumC11380a.ON_DETACH_CONTROLLER);
        this.f10010a = false;
        if (m31354j()) {
            this.f10014e.mo31386e();
        }
    }

    /* renamed from: q */
    private void m31347q(InterfaceC3627q interfaceC3627q) {
        Drawable m31356h = m31356h();
        if (m31356h instanceof InterfaceC3626p) {
            ((InterfaceC3626p) m31356h).mo4774f(interfaceC3627q);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3627q
    /* renamed from: a */
    public void mo31363a(boolean z) {
        C11379c.EnumC11380a enumC11380a;
        if (this.f10012c == z) {
            return;
        }
        C11379c c11379c = this.f10015f;
        if (z) {
            enumC11380a = C11379c.EnumC11380a.ON_DRAWABLE_SHOW;
        } else {
            enumC11380a = C11379c.EnumC11380a.ON_DRAWABLE_HIDE;
        }
        c11379c.m8196b(enumC11380a);
        this.f10012c = z;
        m31361c();
    }

    /* renamed from: f */
    public DraweeController m31358f() {
        return this.f10014e;
    }

    /* renamed from: g */
    public DH m31357g() {
        return (DH) C13379j.m2677g(this.f10013d);
    }

    /* renamed from: h */
    public Drawable m31356h() {
        DH dh = this.f10013d;
        if (dh == null) {
            return null;
        }
        return dh.mo31384d();
    }

    /* renamed from: i */
    public boolean m31355i() {
        return this.f10013d != null;
    }

    /* renamed from: j */
    public boolean m31354j() {
        DraweeController draweeController = this.f10014e;
        return draweeController != null && draweeController.mo31385f() == this.f10013d;
    }

    /* renamed from: k */
    public void m31353k() {
        this.f10015f.m8196b(C11379c.EnumC11380a.ON_HOLDER_ATTACH);
        this.f10011b = true;
        m31361c();
    }

    /* renamed from: l */
    public void m31352l() {
        this.f10015f.m8196b(C11379c.EnumC11380a.ON_HOLDER_DETACH);
        this.f10011b = false;
        m31361c();
    }

    /* renamed from: m */
    public boolean m31351m(MotionEvent motionEvent) {
        if (!m31354j()) {
            return false;
        }
        return this.f10014e.mo31389a(motionEvent);
    }

    /* renamed from: n */
    public void m31350n(Context context) {
    }

    /* renamed from: o */
    public void m31349o(DraweeController draweeController) {
        boolean z = this.f10010a;
        if (z) {
            m31359e();
        }
        if (m31354j()) {
            this.f10015f.m8196b(C11379c.EnumC11380a.ON_CLEAR_OLD_CONTROLLER);
            this.f10014e.mo31387d(null);
        }
        this.f10014e = draweeController;
        if (draweeController != null) {
            this.f10015f.m8196b(C11379c.EnumC11380a.ON_SET_CONTROLLER);
            this.f10014e.mo31387d(this.f10013d);
        } else {
            this.f10015f.m8196b(C11379c.EnumC11380a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m31362b();
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3627q
    public void onDraw() {
        if (this.f10010a) {
            return;
        }
        C13677a.m1872F(C11379c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f10014e)), toString());
        this.f10011b = true;
        this.f10012c = true;
        m31361c();
    }

    /* renamed from: p */
    public void m31348p(DH dh) {
        boolean z;
        this.f10015f.m8196b(C11379c.EnumC11380a.ON_SET_HIERARCHY);
        boolean m31354j = m31354j();
        m31347q(null);
        DH dh2 = (DH) C13379j.m2677g(dh);
        this.f10013d = dh2;
        Drawable mo31384d = dh2.mo31384d();
        if (mo31384d != null && !mo31384d.isVisible()) {
            z = false;
        } else {
            z = true;
        }
        mo31363a(z);
        m31347q(this);
        if (m31354j) {
            this.f10014e.mo31387d(dh);
        }
    }

    public String toString() {
        return C13375i.m2689c(this).m2686c("controllerAttached", this.f10010a).m2686c("holderAttached", this.f10011b).m2686c("drawableVisible", this.f10012c).m2687b("events", this.f10015f.toString()).toString();
    }
}