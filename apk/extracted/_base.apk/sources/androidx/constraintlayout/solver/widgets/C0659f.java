package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p289q.C11657d;

/* renamed from: androidx.constraintlayout.solver.widgets.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0659f {

    /* renamed from: a */
    static boolean[] f2368a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m39298a(ConstraintWidgetContainer constraintWidgetContainer, C11657d c11657d, ConstraintWidget constraintWidget) {
        constraintWidget.f2258j = -1;
        constraintWidget.f2260k = -1;
        ConstraintWidget.EnumC0650b enumC0650b = constraintWidgetContainer.f2226M[0];
        ConstraintWidget.EnumC0650b enumC0650b2 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
        if (enumC0650b != enumC0650b2 && constraintWidget.f2226M[0] == ConstraintWidget.EnumC0650b.MATCH_PARENT) {
            int i = constraintWidget.f2215B.f2347e;
            int m39415N = constraintWidgetContainer.m39415N() - constraintWidget.f2217D.f2347e;
            C0654d c0654d = constraintWidget.f2215B;
            c0654d.f2349g = c11657d.m7300q(c0654d);
            C0654d c0654d2 = constraintWidget.f2217D;
            c0654d2.f2349g = c11657d.m7300q(c0654d2);
            c11657d.m7311f(constraintWidget.f2215B.f2349g, i);
            c11657d.m7311f(constraintWidget.f2217D.f2349g, m39415N);
            constraintWidget.f2258j = 2;
            constraintWidget.m39394h0(i, m39415N);
        }
        if (constraintWidgetContainer.f2226M[1] != enumC0650b2 && constraintWidget.f2226M[1] == ConstraintWidget.EnumC0650b.MATCH_PARENT) {
            int i2 = constraintWidget.f2216C.f2347e;
            int m39372t = constraintWidgetContainer.m39372t() - constraintWidget.f2218E.f2347e;
            C0654d c0654d3 = constraintWidget.f2216C;
            c0654d3.f2349g = c11657d.m7300q(c0654d3);
            C0654d c0654d4 = constraintWidget.f2218E;
            c0654d4.f2349g = c11657d.m7300q(c0654d4);
            c11657d.m7311f(constraintWidget.f2216C.f2349g, i2);
            c11657d.m7311f(constraintWidget.f2218E.f2349g, m39372t);
            if (constraintWidget.f2238Y > 0 || constraintWidget.m39416M() == 8) {
                C0654d c0654d5 = constraintWidget.f2219F;
                c0654d5.f2349g = c11657d.m7300q(c0654d5);
                c11657d.m7311f(constraintWidget.f2219F.f2349g, constraintWidget.f2238Y + i2);
            }
            constraintWidget.f2260k = 2;
            constraintWidget.m39365w0(i2, m39372t);
        }
    }

    /* renamed from: b */
    public static final boolean m39297b(int i, int i2) {
        return (i & i2) == i2;
    }
}
