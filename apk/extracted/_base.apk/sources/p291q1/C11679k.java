package p291q1;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p111g1.InterfaceC6529k;
import p167j1.C8779a;
import p167j1.C8784e;
import p206l1.C10021n;

/* renamed from: q1.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11679k {

    /* renamed from: a */
    private static final PointF f30461a = new PointF();

    /* renamed from: a */
    public static PointF m7203a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m7202b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m7201c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: d */
    public static boolean m7200d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: e */
    private static int m7199e(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            return i3 - 1;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m7198f(float f, float f2) {
        return m7197g((int) f, (int) f2);
    }

    /* renamed from: g */
    private static int m7197g(int i, int i2) {
        return i - (i2 * m7199e(i, i2));
    }

    /* renamed from: h */
    public static void m7196h(C10021n c10021n, Path path) {
        path.reset();
        PointF m12553b = c10021n.m12553b();
        path.moveTo(m12553b.x, m12553b.y);
        f30461a.set(m12553b.x, m12553b.y);
        for (int i = 0; i < c10021n.m12554a().size(); i++) {
            C8779a c8779a = c10021n.m12554a().get(i);
            PointF m17275a = c8779a.m17275a();
            PointF m17274b = c8779a.m17274b();
            PointF m17273c = c8779a.m17273c();
            PointF pointF = f30461a;
            if (m17275a.equals(pointF) && m17274b.equals(m17273c)) {
                path.lineTo(m17273c.x, m17273c.y);
            } else {
                path.cubicTo(m17275a.x, m17275a.y, m17274b.x, m17274b.y, m17273c.x, m17273c.y);
            }
            pointF.set(m17273c.x, m17273c.y);
        }
        if (c10021n.m12551d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static float m7195i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: j */
    public static int m7194j(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: k */
    public static void m7193k(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2, InterfaceC6529k interfaceC6529k) {
        if (c8784e.m17257c(interfaceC6529k.getName(), i)) {
            list.add(c8784e2.m17259a(interfaceC6529k.getName()).m17251i(interfaceC6529k));
        }
    }
}
