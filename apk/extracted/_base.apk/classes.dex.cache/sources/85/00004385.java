package mh;

import java.util.ArrayList;
import java.util.List;
import kh.C9386c;
import kh.C9412i;
import kh.C9425n;
import kh.C9439q;
import kh.C9447r;
import kh.C9450s;
import kh.C9458u;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;

/* renamed from: mh.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10467f {
    /* renamed from: a */
    public static final C9439q m11483a(C9439q c9439q, C10468g typeTable) {
        C9612q.m13917h(c9439q, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9439q.m14996k0()) {
            return c9439q.m15014S();
        }
        if (c9439q.m14995l0()) {
            return typeTable.m11463a(c9439q.m15013T());
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C9439q> m11482b(C9386c c9386c, C10468g typeTable) {
        int m14093t;
        C9612q.m13917h(c9386c, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        List<C9439q> m15551y0 = c9386c.m15551y0();
        if (!(!m15551y0.isEmpty())) {
            m15551y0 = null;
        }
        if (m15551y0 == null) {
            List<Integer> contextReceiverTypeIdList = c9386c.m15553x0();
            C9612q.m13918g(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            m14093t = C9546k.m14093t(contextReceiverTypeIdList, 10);
            m15551y0 = new ArrayList<>(m14093t);
            for (Integer it : contextReceiverTypeIdList) {
                C9612q.m13918g(it, "it");
                m15551y0.add(typeTable.m11463a(it.intValue()));
            }
        }
        return m15551y0;
    }

    /* renamed from: c */
    public static final List<C9439q> m11481c(C9412i c9412i, C10468g typeTable) {
        int m14093t;
        C9612q.m13917h(c9412i, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        List<C9439q> m15320Z = c9412i.m15320Z();
        if (!(!m15320Z.isEmpty())) {
            m15320Z = null;
        }
        if (m15320Z == null) {
            List<Integer> contextReceiverTypeIdList = c9412i.m15321Y();
            C9612q.m13918g(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            m14093t = C9546k.m14093t(contextReceiverTypeIdList, 10);
            m15320Z = new ArrayList<>(m14093t);
            for (Integer it : contextReceiverTypeIdList) {
                C9612q.m13918g(it, "it");
                m15320Z.add(typeTable.m11463a(it.intValue()));
            }
        }
        return m15320Z;
    }

    /* renamed from: d */
    public static final List<C9439q> m11480d(C9425n c9425n, C10468g typeTable) {
        int m14093t;
        C9612q.m13917h(c9425n, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        List<C9439q> m15157Y = c9425n.m15157Y();
        if (!(!m15157Y.isEmpty())) {
            m15157Y = null;
        }
        if (m15157Y == null) {
            List<Integer> contextReceiverTypeIdList = c9425n.m15158X();
            C9612q.m13918g(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            m14093t = C9546k.m14093t(contextReceiverTypeIdList, 10);
            m15157Y = new ArrayList<>(m14093t);
            for (Integer it : contextReceiverTypeIdList) {
                C9612q.m13918g(it, "it");
                m15157Y.add(typeTable.m11463a(it.intValue()));
            }
        }
        return m15157Y;
    }

    /* renamed from: e */
    public static final C9439q m11479e(C9447r c9447r, C10468g typeTable) {
        C9612q.m13917h(c9447r, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9447r.m14897e0()) {
            C9439q expandedType = c9447r.m14907U();
            C9612q.m13918g(expandedType, "expandedType");
            return expandedType;
        } else if (c9447r.m14896f0()) {
            return typeTable.m11463a(c9447r.m14906V());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: f */
    public static final C9439q m11478f(C9439q c9439q, C10468g typeTable) {
        C9612q.m13917h(c9439q, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9439q.m14991p0()) {
            return c9439q.m15004c0();
        }
        if (c9439q.m14990q0()) {
            return typeTable.m11463a(c9439q.m15003d0());
        }
        return null;
    }

    /* renamed from: g */
    public static final boolean m11477g(C9412i c9412i) {
        C9612q.m13917h(c9412i, "<this>");
        if (!c9412i.m15297w0() && !c9412i.m15296x0()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m11476h(C9425n c9425n) {
        C9612q.m13917h(c9425n, "<this>");
        if (!c9425n.m15136t0() && !c9425n.m15135u0()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final C9439q m11475i(C9386c c9386c, C10468g typeTable) {
        C9612q.m13917h(c9386c, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9386c.m15568p1()) {
            return c9386c.m15630K0();
        }
        if (c9386c.m15566q1()) {
            return typeTable.m11463a(c9386c.m15628L0());
        }
        return null;
    }

    /* renamed from: j */
    public static final C9439q m11474j(C9439q c9439q, C10468g typeTable) {
        C9612q.m13917h(c9439q, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9439q.m14988s0()) {
            return c9439q.m15001f0();
        }
        if (c9439q.m14987t0()) {
            return typeTable.m11463a(c9439q.m15000g0());
        }
        return null;
    }

    /* renamed from: k */
    public static final C9439q m11473k(C9412i c9412i, C10468g typeTable) {
        C9612q.m13917h(c9412i, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9412i.m15297w0()) {
            return c9412i.m15313g0();
        }
        if (c9412i.m15296x0()) {
            return typeTable.m11463a(c9412i.m15312h0());
        }
        return null;
    }

    /* renamed from: l */
    public static final C9439q m11472l(C9425n c9425n, C10468g typeTable) {
        C9612q.m13917h(c9425n, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9425n.m15136t0()) {
            return c9425n.m15150f0();
        }
        if (c9425n.m15135u0()) {
            return typeTable.m11463a(c9425n.m15149g0());
        }
        return null;
    }

    /* renamed from: m */
    public static final C9439q m11471m(C9412i c9412i, C10468g typeTable) {
        C9612q.m13917h(c9412i, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9412i.m15295y0()) {
            C9439q returnType = c9412i.m15311i0();
            C9612q.m13918g(returnType, "returnType");
            return returnType;
        } else if (c9412i.m15294z0()) {
            return typeTable.m11463a(c9412i.m15310j0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: n */
    public static final C9439q m11470n(C9425n c9425n, C10468g typeTable) {
        C9612q.m13917h(c9425n, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9425n.m15134v0()) {
            C9439q returnType = c9425n.m15148h0();
            C9612q.m13918g(returnType, "returnType");
            return returnType;
        } else if (c9425n.m15133w0()) {
            return typeTable.m11463a(c9425n.m15147i0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: o */
    public static final List<C9439q> m11469o(C9386c c9386c, C10468g typeTable) {
        int m14093t;
        C9612q.m13917h(c9386c, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        List<C9439q> m15596b1 = c9386c.m15596b1();
        if (!(!m15596b1.isEmpty())) {
            m15596b1 = null;
        }
        if (m15596b1 == null) {
            List<Integer> supertypeIdList = c9386c.m15598a1();
            C9612q.m13918g(supertypeIdList, "supertypeIdList");
            m14093t = C9546k.m14093t(supertypeIdList, 10);
            m15596b1 = new ArrayList<>(m14093t);
            for (Integer it : supertypeIdList) {
                C9612q.m13918g(it, "it");
                m15596b1.add(typeTable.m11463a(it.intValue()));
            }
        }
        return m15596b1;
    }

    /* renamed from: p */
    public static final C9439q m11468p(C9439q.C9441b c9441b, C10468g typeTable) {
        C9612q.m13917h(c9441b, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9441b.m14977C()) {
            return c9441b.m14963z();
        }
        if (c9441b.m14976D()) {
            return typeTable.m11463a(c9441b.m14979A());
        }
        return null;
    }

    /* renamed from: q */
    public static final C9439q m11467q(C9458u c9458u, C10468g typeTable) {
        C9612q.m13917h(c9458u, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9458u.m14776T()) {
            C9439q type = c9458u.m14782N();
            C9612q.m13918g(type, "type");
            return type;
        } else if (c9458u.m14775U()) {
            return typeTable.m11463a(c9458u.m14781O());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: r */
    public static final C9439q m11466r(C9447r c9447r, C10468g typeTable) {
        C9612q.m13917h(c9447r, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9447r.m14893i0()) {
            C9439q underlyingType = c9447r.m14900b0();
            C9612q.m13918g(underlyingType, "underlyingType");
            return underlyingType;
        } else if (c9447r.m14892j0()) {
            return typeTable.m11463a(c9447r.m14899c0());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: s */
    public static final List<C9439q> m11465s(C9450s c9450s, C10468g typeTable) {
        int m14093t;
        C9612q.m13917h(c9450s, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        List<C9439q> m14849T = c9450s.m14849T();
        if (!(!m14849T.isEmpty())) {
            m14849T = null;
        }
        if (m14849T == null) {
            List<Integer> upperBoundIdList = c9450s.m14850S();
            C9612q.m13918g(upperBoundIdList, "upperBoundIdList");
            m14093t = C9546k.m14093t(upperBoundIdList, 10);
            m14849T = new ArrayList<>(m14093t);
            for (Integer it : upperBoundIdList) {
                C9612q.m13918g(it, "it");
                m14849T.add(typeTable.m11463a(it.intValue()));
            }
        }
        return m14849T;
    }

    /* renamed from: t */
    public static final C9439q m11464t(C9458u c9458u, C10468g typeTable) {
        C9612q.m13917h(c9458u, "<this>");
        C9612q.m13917h(typeTable, "typeTable");
        if (c9458u.m14774V()) {
            return c9458u.m14780P();
        }
        if (c9458u.m14773W()) {
            return typeTable.m11463a(c9458u.m14779Q());
        }
        return null;
    }
}