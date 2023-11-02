package p254o1;

import android.graphics.Rect;
import androidx.collection.C0629d;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p073e1.C6062k;
import p073e1.C6063k0;
import p167j1.C8782c;
import p167j1.C8783d;
import p167j1.C8787h;
import p223m1.C10236e;
import p275p1.AbstractC11368c;
import p291q1.C11674f;
import p291q1.C11680l;

/* renamed from: o1.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10973w {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28763a = AbstractC11368c.C11369a.m8241a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static AbstractC11368c.C11369a f28764b = AbstractC11368c.C11369a.m8241a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final AbstractC11368c.C11369a f28765c = AbstractC11368c.C11369a.m8241a("list");

    /* renamed from: d */
    private static final AbstractC11368c.C11369a f28766d = AbstractC11368c.C11369a.m8241a("cm", "tm", "dr");

    /* renamed from: a */
    public static C6062k m9438a(AbstractC11368c abstractC11368c) {
        HashMap hashMap;
        ArrayList arrayList;
        AbstractC11368c abstractC11368c2 = abstractC11368c;
        float m7188e = C11680l.m7188e();
        C0629d<C10236e> c0629d = new C0629d<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<C8783d> sparseArrayCompat = new SparseArrayCompat<>();
        C6062k c6062k = new C6062k();
        abstractC11368c.mo8220i();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c2.mo8226R(f28763a)) {
                case 0:
                    i = abstractC11368c.mo8212v();
                    continue;
                    abstractC11368c2 = abstractC11368c;
                case 1:
                    i2 = abstractC11368c.mo8212v();
                    continue;
                    abstractC11368c2 = abstractC11368c;
                case 2:
                    f = (float) abstractC11368c.mo8214t();
                    continue;
                    abstractC11368c2 = abstractC11368c;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) abstractC11368c.mo8214t()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) abstractC11368c.mo8214t();
                    break;
                case 5:
                    String[] split = abstractC11368c.mo8234D().split("\\.");
                    if (!C11680l.m7183j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c6062k.m23676a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m9434e(abstractC11368c2, c6062k, arrayList2, c0629d);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    m9437b(abstractC11368c2, c6062k, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    m9435d(abstractC11368c2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    m9436c(abstractC11368c2, c6062k, sparseArrayCompat);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    m9433f(abstractC11368c2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            abstractC11368c2 = abstractC11368c;
        }
        c6062k.m23658s(new Rect(0, 0, (int) (i * m7188e), (int) (i2 * m7188e)), f, f2, f3, arrayList2, c0629d, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return c6062k;
    }

    /* renamed from: b */
    private static void m9437b(AbstractC11368c abstractC11368c, C6062k c6062k, Map<String, List<C10236e>> map, Map<String, C6063k0> map2) {
        abstractC11368c.mo8221h();
        while (abstractC11368c.mo8216q()) {
            ArrayList arrayList = new ArrayList();
            C0629d c0629d = new C0629d();
            abstractC11368c.mo8220i();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (abstractC11368c.mo8216q()) {
                int mo8226R = abstractC11368c.mo8226R(f28764b);
                if (mo8226R != 0) {
                    if (mo8226R != 1) {
                        if (mo8226R != 2) {
                            if (mo8226R != 3) {
                                if (mo8226R != 4) {
                                    if (mo8226R != 5) {
                                        abstractC11368c.mo8225S();
                                        abstractC11368c.mo8224U();
                                    } else {
                                        str3 = abstractC11368c.mo8234D();
                                    }
                                } else {
                                    str2 = abstractC11368c.mo8234D();
                                }
                            } else {
                                i2 = abstractC11368c.mo8212v();
                            }
                        } else {
                            i = abstractC11368c.mo8212v();
                        }
                    } else {
                        abstractC11368c.mo8221h();
                        while (abstractC11368c.mo8216q()) {
                            C10236e m9439b = C10971v.m9439b(abstractC11368c, c6062k);
                            c0629d.m39484m(m9439b.m12080d(), m9439b);
                            arrayList.add(m9439b);
                        }
                        abstractC11368c.mo8219j();
                    }
                } else {
                    str = abstractC11368c.mo8234D();
                }
            }
            abstractC11368c.mo8217m();
            if (str2 != null) {
                C6063k0 c6063k0 = new C6063k0(i, i2, str, str2, str3);
                map2.put(c6063k0.m23651d(), c6063k0);
            } else {
                map.put(str, arrayList);
            }
        }
        abstractC11368c.mo8219j();
    }

    /* renamed from: c */
    private static void m9436c(AbstractC11368c abstractC11368c, C6062k c6062k, SparseArrayCompat<C8783d> sparseArrayCompat) {
        abstractC11368c.mo8221h();
        while (abstractC11368c.mo8216q()) {
            C8783d m9469a = C10959m.m9469a(abstractC11368c, c6062k);
            sparseArrayCompat.m39512l(m9469a.hashCode(), m9469a);
        }
        abstractC11368c.mo8219j();
    }

    /* renamed from: d */
    private static void m9435d(AbstractC11368c abstractC11368c, Map<String, C8782c> map) {
        abstractC11368c.mo8220i();
        while (abstractC11368c.mo8216q()) {
            if (abstractC11368c.mo8226R(f28765c) != 0) {
                abstractC11368c.mo8225S();
                abstractC11368c.mo8224U();
            } else {
                abstractC11368c.mo8221h();
                while (abstractC11368c.mo8216q()) {
                    C8782c m9467a = C10961n.m9467a(abstractC11368c);
                    map.put(m9467a.m17266b(), m9467a);
                }
                abstractC11368c.mo8219j();
            }
        }
        abstractC11368c.mo8217m();
    }

    /* renamed from: e */
    private static void m9434e(AbstractC11368c abstractC11368c, C6062k c6062k, List<C10236e> list, C0629d<C10236e> c0629d) {
        abstractC11368c.mo8221h();
        int i = 0;
        while (abstractC11368c.mo8216q()) {
            C10236e m9439b = C10971v.m9439b(abstractC11368c, c6062k);
            if (m9439b.m12078f() == C10236e.EnumC10237a.IMAGE) {
                i++;
            }
            list.add(m9439b);
            c0629d.m39484m(m9439b.m12080d(), m9439b);
            if (i > 4) {
                C11674f.m7233c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC11368c.mo8219j();
    }

    /* renamed from: f */
    private static void m9433f(AbstractC11368c abstractC11368c, List<C8787h> list) {
        abstractC11368c.mo8221h();
        while (abstractC11368c.mo8216q()) {
            abstractC11368c.mo8220i();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (abstractC11368c.mo8216q()) {
                int mo8226R = abstractC11368c.mo8226R(f28766d);
                if (mo8226R != 0) {
                    if (mo8226R != 1) {
                        if (mo8226R != 2) {
                            abstractC11368c.mo8225S();
                            abstractC11368c.mo8224U();
                        } else {
                            f2 = (float) abstractC11368c.mo8214t();
                        }
                    } else {
                        f = (float) abstractC11368c.mo8214t();
                    }
                } else {
                    str = abstractC11368c.mo8234D();
                }
            }
            abstractC11368c.mo8217m();
            list.add(new C8787h(str, f, f2));
        }
        abstractC11368c.mo8219j();
    }
}
