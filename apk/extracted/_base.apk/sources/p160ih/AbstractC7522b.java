package p160ih;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kh.C9375b;
import kh.C9386c;
import kh.C9391d;
import kh.C9404g;
import kh.C9412i;
import kh.C9425n;
import kh.C9439q;
import kh.C9450s;
import kh.C9458u;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import mg.C10454a;
import mh.C10458b;
import mh.C10466e;
import mh.C10467f;
import mh.C10468g;
import mh.InterfaceC10463c;
import p070di.AbstractC5969z;
import p070di.EnumC5912b;
import p070di.InterfaceC5929f;
import p160ih.AbstractC7522b.AbstractC7523a;
import p160ih.C7572u;
import p160ih.InterfaceC7564r;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import p270oh.C11110b;
import p270oh.C11122i;
import p305qg.InterfaceC11900a1;
import p326rh.AbstractC12188i;
import p326rh.InterfaceC12210q;
import p449yh.C14027d;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: ih.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC7522b<A, S extends AbstractC7523a<? extends A>> implements InterfaceC5929f<A> {

    /* renamed from: a */
    private final InterfaceC7559p f20777a;

    /* renamed from: ih.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC7523a<A> {
        /* renamed from: a */
        public abstract Map<C7572u, List<A>> mo20495a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ih.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum EnumC7524b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: ih.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C7525c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20782a;

        static {
            int[] iArr = new int[EnumC5912b.values().length];
            try {
                iArr[EnumC5912b.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5912b.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5912b.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20782a = iArr;
        }
    }

    /* renamed from: ih.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7526d implements InterfaceC7564r.InterfaceC7567c {

        /* renamed from: a */
        final /* synthetic */ AbstractC7522b<A, S> f20783a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f20784b;

        C7526d(AbstractC7522b<A, S> abstractC7522b, ArrayList<A> arrayList) {
            this.f20783a = abstractC7522b;
            this.f20784b = arrayList;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7567c
        /* renamed from: a */
        public void mo11509a() {
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7567c
        /* renamed from: c */
        public InterfaceC7564r.InterfaceC7565a mo11508c(C11632b classId, InterfaceC11900a1 source) {
            C9612q.m13917h(classId, "classId");
            C9612q.m13917h(source, "source");
            return this.f20783a.m20498w(classId, source, this.f20784b);
        }
    }

    public AbstractC7522b(InterfaceC7559p kotlinClassFinder) {
        C9612q.m13917h(kotlinClassFinder, "kotlinClassFinder");
        this.f20777a = kotlinClassFinder;
    }

    /* renamed from: l */
    private final int m20508l(AbstractC5969z abstractC5969z, InterfaceC12210q interfaceC12210q) {
        if (interfaceC12210q instanceof C9412i) {
            if (C10467f.m11477g((C9412i) interfaceC12210q)) {
                return 1;
            }
        } else if (interfaceC12210q instanceof C9425n) {
            if (C10467f.m11476h((C9425n) interfaceC12210q)) {
                return 1;
            }
        } else if (interfaceC12210q instanceof C9391d) {
            C9612q.m13919f(abstractC5969z, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            AbstractC5969z.C5970a c5970a = (AbstractC5969z.C5970a) abstractC5969z;
            if (c5970a.m24054g() == C9386c.EnumC9389c.ENUM_CLASS) {
                return 2;
            }
            if (c5970a.m24052i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + interfaceC12210q.getClass());
        }
        return 0;
    }

    /* renamed from: m */
    private final List<A> m20507m(AbstractC5969z abstractC5969z, C7572u c7572u, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> m14104i;
        List<A> m14104i2;
        InterfaceC7564r m20505o = m20505o(abstractC5969z, m20500t(abstractC5969z, z, z2, bool, z3));
        if (m20505o == null) {
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        }
        List<A> list = mo20504p(m20505o).mo20495a().get(c7572u);
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    /* renamed from: n */
    static /* synthetic */ List m20506n(AbstractC7522b abstractC7522b, AbstractC5969z abstractC5969z, C7572u c7572u, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return abstractC7522b.m20507m(abstractC5969z, c7572u, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: s */
    public static /* synthetic */ C7572u m20501s(AbstractC7522b abstractC7522b, InterfaceC12210q interfaceC12210q, InterfaceC10463c interfaceC10463c, C10468g c10468g, EnumC5912b enumC5912b, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                z = false;
            }
            return abstractC7522b.m20502r(interfaceC12210q, interfaceC10463c, c10468g, enumC5912b, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: x */
    private final List<A> m20497x(AbstractC5969z abstractC5969z, C9425n c9425n, EnumC7524b enumC7524b) {
        boolean m13731M;
        List<A> m14104i;
        List<A> m14104i2;
        List<A> m14104i3;
        Boolean mo11488d = C10458b.f27302A.mo11488d(c9425n.m15154b0());
        C9612q.m13918g(mo11488d, "IS_CONST.get(proto.flags)");
        boolean booleanValue = mo11488d.booleanValue();
        boolean m9128f = C11122i.m9128f(c9425n);
        if (enumC7524b == EnumC7524b.PROPERTY) {
            C7572u m20485b = C7530c.m20485b(c9425n, abstractC5969z.m24059b(), abstractC5969z.m24057d(), false, true, false, 40, null);
            if (m20485b == null) {
                m14104i3 = C9545j.m14104i();
                return m14104i3;
            }
            return m20506n(this, abstractC5969z, m20485b, true, false, Boolean.valueOf(booleanValue), m9128f, 8, null);
        }
        C7572u m20485b2 = C7530c.m20485b(c9425n, abstractC5969z.m24059b(), abstractC5969z.m24057d(), true, false, false, 48, null);
        if (m20485b2 == null) {
            m14104i2 = C9545j.m14104i();
            return m14104i2;
        }
        boolean z = false;
        m13731M = C9654p.m13731M(m20485b2.m20394a(), "$delegate", false, 2, null);
        if (enumC7524b == EnumC7524b.DELEGATE_FIELD) {
            z = true;
        }
        if (m13731M != z) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m20507m(abstractC5969z, m20485b2, true, true, Boolean.valueOf(booleanValue), m9128f);
    }

    /* renamed from: z */
    private final InterfaceC7564r m20496z(AbstractC5969z.C5970a c5970a) {
        InterfaceC11900a1 m24058c = c5970a.m24058c();
        C7571t c7571t = m24058c instanceof C7571t ? (C7571t) m24058c : null;
        if (c7571t != null) {
            return c7571t.m20395d();
        }
        return null;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: a */
    public List<A> mo20517a(C9439q proto, InterfaceC10463c nameResolver) {
        int m14093t;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        Object m5818v = proto.m5818v(C10890a.f28550f);
        C9612q.m13918g(m5818v, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C9375b> iterable = (Iterable) m5818v;
        m14093t = C9546k.m14093t(iterable, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b it : iterable) {
            C9612q.m13918g(it, "it");
            arrayList.add(mo20473y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: b */
    public List<A> mo20516b(AbstractC5969z container, InterfaceC12210q callableProto, EnumC5912b kind, int i, C9458u proto) {
        List<A> m14104i;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(callableProto, "callableProto");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(proto, "proto");
        C7572u m20501s = m20501s(this, callableProto, container.m24059b(), container.m24057d(), kind, false, 16, null);
        if (m20501s != null) {
            return m20506n(this, container, C7572u.f20873b.m20389e(m20501s, i + m20508l(container, callableProto)), false, false, null, false, 60, null);
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: d */
    public List<A> mo20515d(AbstractC5969z container, C9425n proto) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        return m20497x(container, proto, EnumC7524b.DELEGATE_FIELD);
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: e */
    public List<A> mo20514e(AbstractC5969z container, C9404g proto) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C7572u.C7573a c7573a = C7572u.f20873b;
        String string = container.m24059b().getString(proto.m15417G());
        String m7470c = ((AbstractC5969z.C5970a) container).m24056e().m7470c();
        C9612q.m13918g(m7470c, "container as ProtoContai…Class).classId.asString()");
        return m20506n(this, container, c7573a.m20393a(string, C11110b.m9144b(m7470c)), false, false, null, false, 60, null);
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: f */
    public List<A> mo20513f(AbstractC5969z container, InterfaceC12210q proto, EnumC5912b kind) {
        List<A> m14104i;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(kind, "kind");
        C7572u m20501s = m20501s(this, proto, container.m24059b(), container.m24057d(), kind, false, 16, null);
        if (m20501s != null) {
            return m20506n(this, container, C7572u.f20873b.m20389e(m20501s, 0), false, false, null, false, 60, null);
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: h */
    public List<A> mo20512h(C9450s proto, InterfaceC10463c nameResolver) {
        int m14093t;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        Object m5818v = proto.m5818v(C10890a.f28552h);
        C9612q.m13918g(m5818v, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C9375b> iterable = (Iterable) m5818v;
        m14093t = C9546k.m14093t(iterable, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9375b it : iterable) {
            C9612q.m13918g(it, "it");
            arrayList.add(mo20473y(it, nameResolver));
        }
        return arrayList;
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: i */
    public List<A> mo20511i(AbstractC5969z container, InterfaceC12210q proto, EnumC5912b kind) {
        List<A> m14104i;
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(kind, "kind");
        if (kind == EnumC5912b.PROPERTY) {
            return m20497x(container, (C9425n) proto, EnumC7524b.PROPERTY);
        }
        C7572u m20501s = m20501s(this, proto, container.m24059b(), container.m24057d(), kind, false, 16, null);
        if (m20501s == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m20506n(this, container, m20501s, false, false, null, false, 60, null);
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: j */
    public List<A> mo20510j(AbstractC5969z container, C9425n proto) {
        C9612q.m13917h(container, "container");
        C9612q.m13917h(proto, "proto");
        return m20497x(container, proto, EnumC7524b.BACKING_FIELD);
    }

    @Override // p070di.InterfaceC5929f
    /* renamed from: k */
    public List<A> mo20509k(AbstractC5969z.C5970a container) {
        C9612q.m13917h(container, "container");
        InterfaceC7564r m20496z = m20496z(container);
        if (m20496z != null) {
            ArrayList arrayList = new ArrayList(1);
            m20496z.mo2853d(new C7526d(this, arrayList), m20503q(m20496z));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.mo24051a()).toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final InterfaceC7564r m20505o(AbstractC5969z container, InterfaceC7564r interfaceC7564r) {
        C9612q.m13917h(container, "container");
        if (interfaceC7564r == null) {
            if (container instanceof AbstractC5969z.C5970a) {
                return m20496z((AbstractC5969z.C5970a) container);
            }
            return null;
        }
        return interfaceC7564r;
    }

    /* renamed from: p */
    protected abstract S mo20504p(InterfaceC7564r interfaceC7564r);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public byte[] m20503q(InterfaceC7564r kotlinClass) {
        C9612q.m13917h(kotlinClass, "kotlinClass");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final C7572u m20502r(InterfaceC12210q proto, InterfaceC10463c nameResolver, C10468g typeTable, EnumC5912b kind, boolean z) {
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        C9612q.m13917h(kind, "kind");
        if (proto instanceof C9391d) {
            C7572u.C7573a c7573a = C7572u.f20873b;
            AbstractC11112d.C11114b m9132b = C11122i.f29099a.m9132b((C9391d) proto, nameResolver, typeTable);
            if (m9132b == null) {
                return null;
            }
            return c7573a.m20392b(m9132b);
        } else if (proto instanceof C9412i) {
            C7572u.C7573a c7573a2 = C7572u.f20873b;
            AbstractC11112d.C11114b m9129e = C11122i.f29099a.m9129e((C9412i) proto, nameResolver, typeTable);
            if (m9129e == null) {
                return null;
            }
            return c7573a2.m20392b(m9129e);
        } else if (!(proto instanceof C9425n)) {
            return null;
        } else {
            AbstractC12188i.C12195f<C9425n, C10890a.C10898d> propertySignature = C10890a.f28548d;
            C9612q.m13918g(propertySignature, "propertySignature");
            C10890a.C10898d c10898d = (C10890a.C10898d) C10466e.m11485a((AbstractC12188i.AbstractC12192d) proto, propertySignature);
            if (c10898d == null) {
                return null;
            }
            int i = C7525c.f20782a[kind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return C7530c.m20486a((C9425n) proto, nameResolver, typeTable, true, true, z);
                } else if (!c10898d.m9675I()) {
                    return null;
                } else {
                    C7572u.C7573a c7573a3 = C7572u.f20873b;
                    C10890a.C10895c m9680D = c10898d.m9680D();
                    C9612q.m13918g(m9680D, "signature.setter");
                    return c7573a3.m20391c(nameResolver, m9680D);
                }
            } else if (!c10898d.m9676H()) {
                return null;
            } else {
                C7572u.C7573a c7573a4 = C7572u.f20873b;
                C10890a.C10895c m9681C = c10898d.m9681C();
                C9612q.m13918g(m9681C, "signature.getter");
                return c7573a4.m20391c(nameResolver, m9681C);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final InterfaceC7564r m20500t(AbstractC5969z container, boolean z, boolean z2, Boolean bool, boolean z3) {
        AbstractC5969z.C5970a m24053h;
        C7550l c7550l;
        C14027d c14027d;
        String m13763C;
        C9612q.m13917h(container, "container");
        if (z) {
            if (bool != null) {
                if (container instanceof AbstractC5969z.C5970a) {
                    AbstractC5969z.C5970a c5970a = (AbstractC5969z.C5970a) container;
                    if (c5970a.m24054g() == C9386c.EnumC9389c.INTERFACE) {
                        InterfaceC7559p interfaceC7559p = this.f20777a;
                        C11632b m7469d = c5970a.m24056e().m7469d(C11638f.m7422f("DefaultImpls"));
                        C9612q.m13918g(m7469d, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return C7563q.m20400b(interfaceC7559p, m7469d);
                    }
                }
                if (bool.booleanValue() && (container instanceof AbstractC5969z.C5971b)) {
                    InterfaceC11900a1 m24058c = container.m24058c();
                    if (m24058c instanceof C7550l) {
                        c7550l = (C7550l) m24058c;
                    } else {
                        c7550l = null;
                    }
                    if (c7550l != null) {
                        c14027d = c7550l.m20438f();
                    } else {
                        c14027d = null;
                    }
                    if (c14027d != null) {
                        InterfaceC7559p interfaceC7559p2 = this.f20777a;
                        String m882f = c14027d.m882f();
                        C9612q.m13918g(m882f, "facadeClassName.internalName");
                        m13763C = C9653o.m13763C(m882f, '/', '.', false, 4, null);
                        C11632b m7460m = C11632b.m7460m(new C11633c(m13763C));
                        C9612q.m13918g(m7460m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return C7563q.m20400b(interfaceC7559p2, m7460m);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
        }
        if (z2 && (container instanceof AbstractC5969z.C5970a)) {
            AbstractC5969z.C5970a c5970a2 = (AbstractC5969z.C5970a) container;
            if (c5970a2.m24054g() == C9386c.EnumC9389c.COMPANION_OBJECT && (m24053h = c5970a2.m24053h()) != null && (m24053h.m24054g() == C9386c.EnumC9389c.CLASS || m24053h.m24054g() == C9386c.EnumC9389c.ENUM_CLASS || (z3 && (m24053h.m24054g() == C9386c.EnumC9389c.INTERFACE || m24053h.m24054g() == C9386c.EnumC9389c.ANNOTATION_CLASS)))) {
                return m20496z(m24053h);
            }
        }
        if (!(container instanceof AbstractC5969z.C5971b) || !(container.m24058c() instanceof C7550l)) {
            return null;
        }
        InterfaceC11900a1 m24058c2 = container.m24058c();
        C9612q.m13919f(m24058c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C7550l c7550l2 = (C7550l) m24058c2;
        InterfaceC7564r m20437g = c7550l2.m20437g();
        if (m20437g == null) {
            return C7563q.m20400b(this.f20777a, c7550l2.m20440d());
        }
        return m20437g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean m20499u(C11632b classId) {
        InterfaceC7564r m20400b;
        C9612q.m13917h(classId, "classId");
        if (classId.m7466g() == null || !C9612q.m13922c(classId.m7463j().m7426b(), "Container") || (m20400b = C7563q.m20400b(this.f20777a, classId)) == null || !C10454a.f27292a.m11510c(m20400b)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    protected abstract InterfaceC7564r.InterfaceC7565a mo20474v(C11632b c11632b, InterfaceC11900a1 interfaceC11900a1, List<A> list);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final InterfaceC7564r.InterfaceC7565a m20498w(C11632b annotationClassId, InterfaceC11900a1 source, List<A> result) {
        C9612q.m13917h(annotationClassId, "annotationClassId");
        C9612q.m13917h(source, "source");
        C9612q.m13917h(result, "result");
        if (C10454a.f27292a.m11511b().contains(annotationClassId)) {
            return null;
        }
        return mo20474v(annotationClassId, source, result);
    }

    /* renamed from: y */
    protected abstract A mo20473y(C9375b c9375b, InterfaceC10463c interfaceC10463c);
}
