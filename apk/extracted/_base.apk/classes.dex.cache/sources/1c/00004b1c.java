package p309r;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import p289q.C11656c;

/* renamed from: r.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12012c extends ConstraintWidget {

    /* renamed from: w0 */
    public ArrayList<ConstraintWidget> f31009w0 = new ArrayList<>();

    /* renamed from: H0 */
    public void mo6612H0() {
        ArrayList<ConstraintWidget> arrayList = this.f31009w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f31009w0.get(i);
            if (constraintWidget instanceof C12012c) {
                ((C12012c) constraintWidget).mo6612H0();
            }
        }
    }

    /* renamed from: I0 */
    public void m6611I0(ConstraintWidget constraintWidget) {
        this.f31009w0.remove(constraintWidget);
        constraintWidget.m39371t0(null);
    }

    /* renamed from: J0 */
    public void m6610J0() {
        this.f31009w0.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: W */
    public void mo6609W() {
        this.f31009w0.clear();
        super.mo6609W();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: X */
    public void mo6608X(C11656c c11656c) {
        super.mo6608X(c11656c);
        int size = this.f31009w0.size();
        for (int i = 0; i < size; i++) {
            this.f31009w0.get(i).mo6608X(c11656c);
        }
    }

    /* renamed from: a */
    public void m6607a(ConstraintWidget constraintWidget) {
        this.f31009w0.add(constraintWidget);
        if (constraintWidget.m39425E() != null) {
            ((C12012c) constraintWidget.m39425E()).m6611I0(constraintWidget);
        }
        constraintWidget.m39371t0(this);
    }
}