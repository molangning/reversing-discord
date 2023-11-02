package androidx.constraintlayout.solver.widgets;

import p309r.C12011b;
import p329s.C12319b;

/* renamed from: androidx.constraintlayout.solver.widgets.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0660g extends C12011b {

    /* renamed from: y0 */
    private int f2380y0 = 0;

    /* renamed from: z0 */
    private int f2381z0 = 0;

    /* renamed from: A0 */
    private int f2369A0 = 0;

    /* renamed from: B0 */
    private int f2370B0 = 0;

    /* renamed from: C0 */
    private int f2371C0 = 0;

    /* renamed from: D0 */
    private int f2372D0 = 0;

    /* renamed from: E0 */
    private int f2373E0 = 0;

    /* renamed from: F0 */
    private int f2374F0 = 0;

    /* renamed from: G0 */
    private boolean f2375G0 = false;

    /* renamed from: H0 */
    private int f2376H0 = 0;

    /* renamed from: I0 */
    private int f2377I0 = 0;

    /* renamed from: J0 */
    protected C12319b.C12320a f2378J0 = new C12319b.C12320a();

    /* renamed from: K0 */
    C12319b.InterfaceC12321b f2379K0 = null;

    /* renamed from: H0 */
    public void m39296H0() {
        for (int i = 0; i < this.f31008x0; i++) {
            ConstraintWidget constraintWidget = this.f31007w0[i];
            if (constraintWidget != null) {
                constraintWidget.m39383n0(true);
            }
        }
    }

    /* renamed from: I0 */
    public boolean m39295I0() {
        return this.f2375G0;
    }

    @Override // p309r.C12011b, p309r.InterfaceC12010a
    /* renamed from: c */
    public void mo6613c(ConstraintWidgetContainer constraintWidgetContainer) {
        m39296H0();
    }
}
