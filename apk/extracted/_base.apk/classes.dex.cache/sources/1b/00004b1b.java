package p309r;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.Arrays;

/* renamed from: r.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12011b extends ConstraintWidget implements InterfaceC12010a {

    /* renamed from: w0 */
    public ConstraintWidget[] f31007w0 = new ConstraintWidget[4];

    /* renamed from: x0 */
    public int f31008x0 = 0;

    @Override // p309r.InterfaceC12010a
    /* renamed from: a */
    public void mo6615a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.f31008x0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f31007w0;
            if (i > constraintWidgetArr.length) {
                this.f31007w0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f31007w0;
            int i2 = this.f31008x0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.f31008x0 = i2 + 1;
        }
    }

    @Override // p309r.InterfaceC12010a
    /* renamed from: b */
    public void mo6614b() {
        this.f31008x0 = 0;
        Arrays.fill(this.f31007w0, (Object) null);
    }

    /* renamed from: c */
    public void mo6613c(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}