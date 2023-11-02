package p254o1;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.C9046j;
import p188k1.C9047k;
import p188k1.C9048l;
import p206l1.C10005a;
import p206l1.InterfaceC10007c;
import p223m1.C10236e;
import p275p1.AbstractC11368c;
import p291q1.C11680l;
import p311r1.C12020a;

/* renamed from: o1.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10971v {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28759a = AbstractC11368c.C11369a.m8241a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28760b = AbstractC11368c.C11369a.m8241a("d", "a");

    /* renamed from: c */
    private static final AbstractC11368c.C11369a f28761c = AbstractC11368c.C11369a.m8241a("ty", "nm");

    /* renamed from: o1.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C10972a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28762a;

        static {
            int[] iArr = new int[C10236e.EnumC10238b.values().length];
            f28762a = iArr;
            try {
                iArr[C10236e.EnumC10238b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28762a[C10236e.EnumC10238b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static C10236e m9440a(C6062k c6062k) {
        Rect m23675b = c6062k.m23675b();
        return new C10236e(Collections.emptyList(), c6062k, "__container", -1L, C10236e.EnumC10237a.PRE_COMP, -1L, null, Collections.emptyList(), new C9048l(), 0, 0, 0, 0.0f, 0.0f, m23675b.width(), m23675b.height(), null, null, Collections.emptyList(), C10236e.EnumC10238b.NONE, null, false, null, null);
    }

    /* renamed from: b */
    public static C10236e m9439b(AbstractC11368c abstractC11368c, C6062k c6062k) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        C10236e.EnumC10238b enumC10238b = C10236e.EnumC10238b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        abstractC11368c.mo8220i();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        C10236e.EnumC10238b enumC10238b2 = enumC10238b;
        C10236e.EnumC10237a enumC10237a = null;
        String str = null;
        C9048l c9048l = null;
        C9046j c9046j = null;
        C9047k c9047k = null;
        C9038b c9038b = null;
        C10005a c10005a = null;
        C10953j c10953j = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        long j2 = -1;
        float f6 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f7 = 0.0f;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28759a)) {
                case 0:
                    str2 = abstractC11368c.mo8234D();
                    break;
                case 1:
                    j = abstractC11368c.mo8212v();
                    break;
                case 2:
                    str = abstractC11368c.mo8234D();
                    break;
                case 3:
                    int mo8212v = abstractC11368c.mo8212v();
                    enumC10237a = C10236e.EnumC10237a.UNKNOWN;
                    if (mo8212v >= enumC10237a.ordinal()) {
                        break;
                    } else {
                        enumC10237a = C10236e.EnumC10237a.values()[mo8212v];
                        break;
                    }
                case 4:
                    j2 = abstractC11368c.mo8212v();
                    break;
                case 5:
                    i = (int) (abstractC11368c.mo8212v() * C11680l.m7188e());
                    break;
                case 6:
                    i2 = (int) (abstractC11368c.mo8212v() * C11680l.m7188e());
                    break;
                case 7:
                    i3 = Color.parseColor(abstractC11368c.mo8234D());
                    break;
                case 8:
                    c9048l = C10939c.m9505g(abstractC11368c, c6062k);
                    break;
                case 9:
                    int mo8212v2 = abstractC11368c.mo8212v();
                    if (mo8212v2 >= C10236e.EnumC10238b.values().length) {
                        c6062k.m23676a("Unsupported matte type: " + mo8212v2);
                        break;
                    } else {
                        enumC10238b2 = C10236e.EnumC10238b.values()[mo8212v2];
                        int i4 = C10972a.f28762a[enumC10238b2.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                c6062k.m23676a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            c6062k.m23676a("Unsupported matte type: Luma");
                        }
                        c6062k.m23659r(1);
                        break;
                    }
                case 10:
                    abstractC11368c.mo8221h();
                    while (abstractC11368c.mo8216q()) {
                        arrayList3.add(C10974x.m9432a(abstractC11368c, c6062k));
                    }
                    c6062k.m23659r(arrayList3.size());
                    abstractC11368c.mo8219j();
                    break;
                case 11:
                    abstractC11368c.mo8221h();
                    while (abstractC11368c.mo8216q()) {
                        InterfaceC10007c m9484a = C10949h.m9484a(abstractC11368c, c6062k);
                        if (m9484a != null) {
                            arrayList4.add(m9484a);
                        }
                    }
                    abstractC11368c.mo8219j();
                    break;
                case 12:
                    abstractC11368c.mo8220i();
                    while (abstractC11368c.mo8216q()) {
                        int mo8226R = abstractC11368c.mo8226R(f28760b);
                        if (mo8226R != 0) {
                            if (mo8226R != 1) {
                                abstractC11368c.mo8225S();
                                abstractC11368c.mo8224U();
                            } else {
                                abstractC11368c.mo8221h();
                                if (abstractC11368c.mo8216q()) {
                                    c9047k = C10937b.m9514a(abstractC11368c, c6062k);
                                }
                                while (abstractC11368c.mo8216q()) {
                                    abstractC11368c.mo8224U();
                                }
                                abstractC11368c.mo8219j();
                            }
                        } else {
                            c9046j = C10941d.m9500d(abstractC11368c, c6062k);
                        }
                    }
                    abstractC11368c.mo8217m();
                    break;
                case 13:
                    abstractC11368c.mo8221h();
                    ArrayList arrayList5 = new ArrayList();
                    while (abstractC11368c.mo8216q()) {
                        abstractC11368c.mo8220i();
                        while (abstractC11368c.mo8216q()) {
                            int mo8226R2 = abstractC11368c.mo8226R(f28761c);
                            if (mo8226R2 != 0) {
                                if (mo8226R2 != 1) {
                                    abstractC11368c.mo8225S();
                                    abstractC11368c.mo8224U();
                                } else {
                                    arrayList5.add(abstractC11368c.mo8234D());
                                }
                            } else {
                                int mo8212v3 = abstractC11368c.mo8212v();
                                if (mo8212v3 == 29) {
                                    c10005a = C10943e.m9490b(abstractC11368c, c6062k);
                                } else if (mo8212v3 == 25) {
                                    c10953j = new C10955k().m9473b(abstractC11368c, c6062k);
                                }
                            }
                        }
                        abstractC11368c.mo8217m();
                    }
                    abstractC11368c.mo8219j();
                    c6062k.m23676a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f6 = (float) abstractC11368c.mo8214t();
                    break;
                case 15:
                    f2 = (float) abstractC11368c.mo8214t();
                    break;
                case 16:
                    f3 = (float) (abstractC11368c.mo8214t() * C11680l.m7188e());
                    break;
                case 17:
                    f4 = (float) (abstractC11368c.mo8214t() * C11680l.m7188e());
                    break;
                case 18:
                    f7 = (float) abstractC11368c.mo8214t();
                    break;
                case 19:
                    f5 = (float) abstractC11368c.mo8214t();
                    break;
                case 20:
                    c9038b = C10941d.m9498f(abstractC11368c, c6062k, false);
                    break;
                case 21:
                    str3 = abstractC11368c.mo8234D();
                    break;
                case 22:
                    z = abstractC11368c.mo8215s();
                    break;
                default:
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    break;
            }
        }
        abstractC11368c.mo8217m();
        ArrayList arrayList6 = new ArrayList();
        if (f7 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C12020a(c6062k, valueOf, valueOf, null, 0.0f, Float.valueOf(f7)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f5 <= f) {
            f5 = c6062k.m23671f();
        }
        arrayList2.add(new C12020a(c6062k, valueOf2, valueOf2, null, f7, Float.valueOf(f5)));
        arrayList2.add(new C12020a(c6062k, valueOf, valueOf, null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            c6062k.m23676a("Convert your Illustrator layers to shape layers.");
        }
        return new C10236e(arrayList4, c6062k, str2, j, enumC10237a, j2, str, arrayList, c9048l, i, i2, i3, f6, f2, f3, f4, c9046j, c9047k, arrayList2, enumC10238b2, c9038b, z, c10005a, c10953j);
    }
}