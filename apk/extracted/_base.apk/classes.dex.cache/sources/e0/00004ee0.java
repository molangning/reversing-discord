package p372uh;

import gi.C6795f;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9538f;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7297n1;
import p142hi.C7233e0;
import p142hi.C7279j0;
import p142hi.C7294m1;
import p142hi.C7312q;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7288k1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;

/* renamed from: uh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12976d {

    /* renamed from: uh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12977a extends AbstractC9614s implements Function0<AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC7288k1 f33734j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12977a(InterfaceC7288k1 interfaceC7288k1) {
            super(0);
            this.f33734j = interfaceC7288k1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7264g0 invoke() {
            AbstractC7264g0 type = this.f33734j.getType();
            C9612q.m13918g(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* renamed from: uh.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12978b extends C7312q {

        /* renamed from: d */
        final /* synthetic */ boolean f33735d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12978b(AbstractC7297n1 abstractC7297n1, boolean z) {
            super(abstractC7297n1);
            this.f33735d = z;
        }

        @Override // p142hi.AbstractC7297n1
        /* renamed from: b */
        public boolean mo3540b() {
            return this.f33735d;
        }

        @Override // p142hi.C7312q, p142hi.AbstractC7297n1
        /* renamed from: e */
        public InterfaceC7288k1 mo3539e(AbstractC7264g0 key) {
            C9612q.m13917h(key, "key");
            InterfaceC7288k1 mo3539e = super.mo3539e(key);
            InterfaceC11920f1 interfaceC11920f1 = null;
            if (mo3539e == null) {
                return null;
            }
            InterfaceC11927h mo2788p = key.mo3564N0().mo2788p();
            if (mo2788p instanceof InterfaceC11920f1) {
                interfaceC11920f1 = (InterfaceC11920f1) mo2788p;
            }
            return C12976d.m3546b(mo3539e, interfaceC11920f1);
        }
    }

    /* renamed from: b */
    public static final InterfaceC7288k1 m3546b(InterfaceC7288k1 interfaceC7288k1, InterfaceC11920f1 interfaceC11920f1) {
        if (interfaceC11920f1 != null && interfaceC7288k1.mo20954b() != EnumC7336w1.INVARIANT) {
            if (interfaceC11920f1.mo4464m() == interfaceC7288k1.mo20954b()) {
                if (interfaceC7288k1.mo20955a()) {
                    InterfaceC6821n NO_LOCKS = C6795f.f19003e;
                    C9612q.m13918g(NO_LOCKS, "NO_LOCKS");
                    return new C7294m1(new C7279j0(NO_LOCKS, new C12977a(interfaceC7288k1)));
                }
                return new C7294m1(interfaceC7288k1.getType());
            }
            return new C7294m1(m3545c(interfaceC7288k1));
        }
        return interfaceC7288k1;
    }

    /* renamed from: c */
    public static final AbstractC7264g0 m3545c(InterfaceC7288k1 typeProjection) {
        C9612q.m13917h(typeProjection, "typeProjection");
        return new C12973a(typeProjection, null, false, null, 14, null);
    }

    /* renamed from: d */
    public static final boolean m3544d(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return abstractC7264g0.mo3564N0() instanceof InterfaceC12974b;
    }

    /* renamed from: e */
    public static final AbstractC7297n1 m3543e(AbstractC7297n1 abstractC7297n1, boolean z) {
        List<Pair> m14236J0;
        int m14093t;
        C9612q.m13917h(abstractC7297n1, "<this>");
        if (abstractC7297n1 instanceof C7233e0) {
            C7233e0 c7233e0 = (C7233e0) abstractC7297n1;
            InterfaceC11920f1[] m21184j = c7233e0.m21184j();
            m14236J0 = C9538f.m14236J0(c7233e0.m21185i(), c7233e0.m21184j());
            m14093t = C9546k.m14093t(m14236J0, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (Pair pair : m14236J0) {
                arrayList.add(m3546b((InterfaceC7288k1) pair.m14349c(), (InterfaceC11920f1) pair.m14348d()));
            }
            return new C7233e0(m21184j, (InterfaceC7288k1[]) arrayList.toArray(new InterfaceC7288k1[0]), z);
        }
        return new C12978b(abstractC7297n1, z);
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC7297n1 m3542f(AbstractC7297n1 abstractC7297n1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m3543e(abstractC7297n1, z);
    }
}