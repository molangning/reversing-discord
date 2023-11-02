package p270oh;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kh.C9386c;
import kh.C9391d;
import kh.C9412i;
import kh.C9419l;
import kh.C9425n;
import kh.C9439q;
import kh.C9458u;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import mh.C10458b;
import mh.C10466e;
import mh.C10467f;
import mh.C10468g;
import mh.InterfaceC10463c;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import p326rh.AbstractC12188i;
import p326rh.C12183g;

/* renamed from: oh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11122i {

    /* renamed from: a */
    public static final C11122i f29099a = new C11122i();

    /* renamed from: b */
    private static final C12183g f29100b;

    static {
        C12183g m5865d = C12183g.m5865d();
        C10890a.m9734a(m5865d);
        C9612q.m13918g(m5865d, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f29100b = m5865d;
    }

    private C11122i() {
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC11112d.C11113a m9130d(C11122i c11122i, C9425n c9425n, InterfaceC10463c interfaceC10463c, C10468g c10468g, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c11122i.m9131c(c9425n, interfaceC10463c, c10468g, z);
    }

    /* renamed from: f */
    public static final boolean m9128f(C9425n proto) {
        C9612q.m13917h(proto, "proto");
        C10458b.C10460b m9143a = C11111c.f29078a.m9143a();
        Object m5818v = proto.m5818v(C10890a.f28549e);
        C9612q.m13918g(m5818v, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean mo11488d = m9143a.mo11488d(((Number) m5818v).intValue());
        C9612q.m13918g(mo11488d, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return mo11488d.booleanValue();
    }

    /* renamed from: g */
    private final String m9127g(C9439q c9439q, InterfaceC10463c interfaceC10463c) {
        if (c9439q.m14994m0()) {
            return C11110b.m9144b(interfaceC10463c.mo9135b(c9439q.m15009X()));
        }
        return null;
    }

    /* renamed from: h */
    public static final Pair<C11117f, C9386c> m9126h(byte[] bytes, String[] strings) {
        C9612q.m13917h(bytes, "bytes");
        C9612q.m13917h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f29099a.m9123k(byteArrayInputStream, strings), C9386c.m15552x1(byteArrayInputStream, f29100b));
    }

    /* renamed from: i */
    public static final Pair<C11117f, C9386c> m9125i(String[] data, String[] strings) {
        C9612q.m13917h(data, "data");
        C9612q.m13917h(strings, "strings");
        byte[] m9147e = C11109a.m9147e(data);
        C9612q.m13918g(m9147e, "decodeBytes(data)");
        return m9126h(m9147e, strings);
    }

    /* renamed from: j */
    public static final Pair<C11117f, C9412i> m9124j(String[] data, String[] strings) {
        C9612q.m13917h(data, "data");
        C9612q.m13917h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C11109a.m9147e(data));
        return new Pair<>(f29099a.m9123k(byteArrayInputStream, strings), C9412i.m15341F0(byteArrayInputStream, f29100b));
    }

    /* renamed from: k */
    private final C11117f m9123k(InputStream inputStream, String[] strArr) {
        C10890a.C10901e m9642E = C10890a.C10901e.m9642E(inputStream, f29100b);
        C9612q.m13918g(m9642E, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C11117f(m9642E, strArr);
    }

    /* renamed from: l */
    public static final Pair<C11117f, C9419l> m9122l(byte[] bytes, String[] strings) {
        C9612q.m13917h(bytes, "bytes");
        C9612q.m13917h(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f29099a.m9123k(byteArrayInputStream, strings), C9419l.m15237e0(byteArrayInputStream, f29100b));
    }

    /* renamed from: m */
    public static final Pair<C11117f, C9419l> m9121m(String[] data, String[] strings) {
        C9612q.m13917h(data, "data");
        C9612q.m13917h(strings, "strings");
        byte[] m9147e = C11109a.m9147e(data);
        C9612q.m13918g(m9147e, "decodeBytes(data)");
        return m9122l(m9147e, strings);
    }

    /* renamed from: a */
    public final C12183g m9133a() {
        return f29100b;
    }

    /* renamed from: b */
    public final AbstractC11112d.C11114b m9132b(C9391d proto, InterfaceC10463c nameResolver, C10468g typeTable) {
        String str;
        int m14093t;
        String m14046d0;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        AbstractC12188i.C12195f<C9391d, C10890a.C10895c> constructorSignature = C10890a.f28545a;
        C9612q.m13918g(constructorSignature, "constructorSignature");
        C10890a.C10895c c10895c = (C10890a.C10895c) C10466e.m11485a(proto, constructorSignature);
        if (c10895c != null && c10895c.m9708A()) {
            str = nameResolver.getString(c10895c.m9696y());
        } else {
            str = "<init>";
        }
        if (c10895c != null && c10895c.m9695z()) {
            m14046d0 = nameResolver.getString(c10895c.m9697x());
        } else {
            List<C9458u> m15501N = proto.m15501N();
            C9612q.m13918g(m15501N, "proto.valueParameterList");
            m14093t = C9546k.m14093t(m15501N, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (C9458u it : m15501N) {
                C11122i c11122i = f29099a;
                C9612q.m13918g(it, "it");
                String m9127g = c11122i.m9127g(C10467f.m11467q(it, typeTable), nameResolver);
                if (m9127g == null) {
                    return null;
                }
                arrayList.add(m9127g);
            }
            m14046d0 = C9553r.m14046d0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        }
        return new AbstractC11112d.C11114b(str, m14046d0);
    }

    /* renamed from: c */
    public final AbstractC11112d.C11113a m9131c(C9425n proto, InterfaceC10463c nameResolver, C10468g typeTable, boolean z) {
        C10890a.C10892b c10892b;
        int m15152d0;
        String m9127g;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        AbstractC12188i.C12195f<C9425n, C10890a.C10898d> propertySignature = C10890a.f28548d;
        C9612q.m13918g(propertySignature, "propertySignature");
        C10890a.C10898d c10898d = (C10890a.C10898d) C10466e.m11485a(proto, propertySignature);
        if (c10898d == null) {
            return null;
        }
        if (c10898d.m9677G()) {
            c10892b = c10898d.m9682B();
        } else {
            c10892b = null;
        }
        if (c10892b == null && z) {
            return null;
        }
        if (c10892b != null && c10892b.m9733A()) {
            m15152d0 = c10892b.m9721y();
        } else {
            m15152d0 = proto.m15152d0();
        }
        if (c10892b != null && c10892b.m9720z()) {
            m9127g = nameResolver.getString(c10892b.m9722x());
        } else {
            m9127g = m9127g(C10467f.m11470n(proto, typeTable), nameResolver);
            if (m9127g == null) {
                return null;
            }
        }
        return new AbstractC11112d.C11113a(nameResolver.getString(m15152d0), m9127g);
    }

    /* renamed from: e */
    public final AbstractC11112d.C11114b m9129e(C9412i proto, InterfaceC10463c nameResolver, C10468g typeTable) {
        int m15315e0;
        List m14100m;
        int m14093t;
        List<C9439q> m14036n0;
        int m14093t2;
        String m14046d0;
        String sb2;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        AbstractC12188i.C12195f<C9412i, C10890a.C10895c> methodSignature = C10890a.f28546b;
        C9612q.m13918g(methodSignature, "methodSignature");
        C10890a.C10895c c10895c = (C10890a.C10895c) C10466e.m11485a(proto, methodSignature);
        if (c10895c != null && c10895c.m9708A()) {
            m15315e0 = c10895c.m9696y();
        } else {
            m15315e0 = proto.m15315e0();
        }
        if (c10895c != null && c10895c.m9695z()) {
            sb2 = nameResolver.getString(c10895c.m9697x());
        } else {
            m14100m = C9545j.m14100m(C10467f.m11473k(proto, typeTable));
            List<C9458u> m15303q0 = proto.m15303q0();
            C9612q.m13918g(m15303q0, "proto.valueParameterList");
            m14093t = C9546k.m14093t(m15303q0, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (C9458u it : m15303q0) {
                C9612q.m13918g(it, "it");
                arrayList.add(C10467f.m11467q(it, typeTable));
            }
            m14036n0 = C9553r.m14036n0(m14100m, arrayList);
            m14093t2 = C9546k.m14093t(m14036n0, 10);
            ArrayList arrayList2 = new ArrayList(m14093t2);
            for (C9439q c9439q : m14036n0) {
                String m9127g = f29099a.m9127g(c9439q, nameResolver);
                if (m9127g == null) {
                    return null;
                }
                arrayList2.add(m9127g);
            }
            String m9127g2 = m9127g(C10467f.m11471m(proto, typeTable), nameResolver);
            if (m9127g2 == null) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            m14046d0 = C9553r.m14046d0(arrayList2, "", "(", ")", 0, null, null, 56, null);
            sb3.append(m14046d0);
            sb3.append(m9127g2);
            sb2 = sb3.toString();
        }
        return new AbstractC11112d.C11114b(nameResolver.getString(m15315e0), sb2);
    }
}