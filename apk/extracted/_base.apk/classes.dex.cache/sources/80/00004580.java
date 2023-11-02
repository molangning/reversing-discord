package p254o1;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p275p1.AbstractC11368c;

/* renamed from: o1.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10967s {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28752a = AbstractC11368c.C11369a.m8241a("x", "y");

    /* renamed from: o1.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C10968a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28753a;

        static {
            int[] iArr = new int[AbstractC11368c.EnumC11370b.values().length];
            f28753a = iArr;
            try {
                iArr[AbstractC11368c.EnumC11370b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28753a[AbstractC11368c.EnumC11370b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28753a[AbstractC11368c.EnumC11370b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    private static PointF m9457a(AbstractC11368c abstractC11368c, float f) {
        abstractC11368c.mo8221h();
        float mo8214t = (float) abstractC11368c.mo8214t();
        float mo8214t2 = (float) abstractC11368c.mo8214t();
        while (abstractC11368c.mo8228I() != AbstractC11368c.EnumC11370b.END_ARRAY) {
            abstractC11368c.mo8224U();
        }
        abstractC11368c.mo8219j();
        return new PointF(mo8214t * f, mo8214t2 * f);
    }

    /* renamed from: b */
    private static PointF m9456b(AbstractC11368c abstractC11368c, float f) {
        float mo8214t = (float) abstractC11368c.mo8214t();
        float mo8214t2 = (float) abstractC11368c.mo8214t();
        while (abstractC11368c.mo8216q()) {
            abstractC11368c.mo8224U();
        }
        return new PointF(mo8214t * f, mo8214t2 * f);
    }

    /* renamed from: c */
    private static PointF m9455c(AbstractC11368c abstractC11368c, float f) {
        abstractC11368c.mo8220i();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28752a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                } else {
                    f3 = m9451g(abstractC11368c);
                }
            } else {
                f2 = m9451g(abstractC11368c);
            }
        }
        abstractC11368c.mo8217m();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: d */
    public static int m9454d(AbstractC11368c abstractC11368c) {
        abstractC11368c.mo8221h();
        int mo8214t = (int) (abstractC11368c.mo8214t() * 255.0d);
        int mo8214t2 = (int) (abstractC11368c.mo8214t() * 255.0d);
        int mo8214t3 = (int) (abstractC11368c.mo8214t() * 255.0d);
        while (abstractC11368c.mo8216q()) {
            abstractC11368c.mo8224U();
        }
        abstractC11368c.mo8219j();
        return Color.argb(255, mo8214t, mo8214t2, mo8214t3);
    }

    /* renamed from: e */
    public static PointF m9453e(AbstractC11368c abstractC11368c, float f) {
        int i = C10968a.f28753a[abstractC11368c.mo8228I().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m9455c(abstractC11368c, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + abstractC11368c.mo8228I());
            }
            return m9457a(abstractC11368c, f);
        }
        return m9456b(abstractC11368c, f);
    }

    /* renamed from: f */
    public static List<PointF> m9452f(AbstractC11368c abstractC11368c, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC11368c.mo8221h();
        while (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            abstractC11368c.mo8221h();
            arrayList.add(m9453e(abstractC11368c, f));
            abstractC11368c.mo8219j();
        }
        abstractC11368c.mo8219j();
        return arrayList;
    }

    /* renamed from: g */
    public static float m9451g(AbstractC11368c abstractC11368c) {
        AbstractC11368c.EnumC11370b mo8228I = abstractC11368c.mo8228I();
        int i = C10968a.f28753a[mo8228I.ordinal()];
        if (i != 1) {
            if (i == 2) {
                abstractC11368c.mo8221h();
                float mo8214t = (float) abstractC11368c.mo8214t();
                while (abstractC11368c.mo8216q()) {
                    abstractC11368c.mo8224U();
                }
                abstractC11368c.mo8219j();
                return mo8214t;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + mo8228I);
        }
        return (float) abstractC11368c.mo8214t();
    }
}