package p468zg;

import bh.C2302e;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p086eh.C6232g;
import p086eh.C6235h;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import si.C12552o;
import th.C12766k;
import th.InterfaceC12759f;

/* renamed from: zg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14241l implements InterfaceC12759f {

    /* renamed from: zg.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C14242a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36633a;

        static {
            int[] iArr = new int[C12766k.C12775i.EnumC12776a.values().length];
            try {
                iArr[C12766k.C12775i.EnumC12776a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f36633a = iArr;
        }
    }

    /* renamed from: zg.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C14243b extends AbstractC9614s implements Function1<InterfaceC11936j1, AbstractC7264g0> {

        /* renamed from: j */
        public static final C14243b f36634j = new C14243b();

        C14243b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11936j1 interfaceC11936j1) {
            return interfaceC11936j1.getType();
        }
    }

    @Override // th.InterfaceC12759f
    /* renamed from: a */
    public InterfaceC12759f.EnumC12760a mo305a() {
        return InterfaceC12759f.EnumC12760a.SUCCESS_ONLY;
    }

    @Override // th.InterfaceC12759f
    /* renamed from: b */
    public InterfaceC12759f.EnumC12761b mo304b(InterfaceC11897a superDescriptor, InterfaceC11897a subDescriptor, InterfaceC11914e interfaceC11914e) {
        List<InterfaceC11920f1> typeParameters;
        C12766k.C12775i.EnumC12776a enumC12776a;
        Sequence m14066K;
        Sequence m4851y;
        Sequence m4870B;
        AbstractC7264g0 abstractC7264g0;
        List m14100m;
        Sequence m4871A;
        boolean z;
        List<InterfaceC11920f1> typeParameters2;
        List<InterfaceC11920f1> m14104i;
        boolean z2;
        C9612q.m13917h(superDescriptor, "superDescriptor");
        C9612q.m13917h(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof C2302e) {
            C2302e c2302e = (C2302e) subDescriptor;
            C9612q.m13918g(c2302e.getTypeParameters(), "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                C12766k.C12775i m4038w = C12766k.m4038w(superDescriptor, subDescriptor);
                if (m4038w != null) {
                    enumC12776a = m4038w.m4024c();
                } else {
                    enumC12776a = null;
                }
                if (enumC12776a != null) {
                    return InterfaceC12759f.EnumC12761b.UNKNOWN;
                }
                List<InterfaceC11936j1> mo4301i = c2302e.mo4301i();
                C9612q.m13918g(mo4301i, "subDescriptor.valueParameters");
                m14066K = C9553r.m14066K(mo4301i);
                m4851y = C12552o.m4851y(m14066K, C14243b.f36634j);
                AbstractC7264g0 returnType = c2302e.getReturnType();
                C9612q.m13920e(returnType);
                m4870B = C12552o.m4870B(m4851y, returnType);
                InterfaceC11997x0 mo4329M = c2302e.mo4329M();
                if (mo4329M != null) {
                    abstractC7264g0 = mo4329M.getType();
                } else {
                    abstractC7264g0 = null;
                }
                m14100m = C9545j.m14100m(abstractC7264g0);
                m4871A = C12552o.m4871A(m4870B, m14100m);
                Iterator it = m4871A.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC7264g0 abstractC7264g02 = (AbstractC7264g0) it.next();
                        if ((!abstractC7264g02.mo3566L0().isEmpty()) && !(abstractC7264g02.mo20916Q0() instanceof C6235h)) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return InterfaceC12759f.EnumC12761b.UNKNOWN;
                }
                InterfaceC11897a mo4225c = superDescriptor.mo4225c(new C6232g(null, 1, null).m21051c());
                if (mo4225c == null) {
                    return InterfaceC12759f.EnumC12761b.UNKNOWN;
                }
                if (mo4225c instanceof InterfaceC12005z0) {
                    InterfaceC12005z0 interfaceC12005z0 = (InterfaceC12005z0) mo4225c;
                    C9612q.m13918g(interfaceC12005z0.getTypeParameters(), "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        InterfaceC11998y.InterfaceC11999a<? extends InterfaceC12005z0> mo4296u = interfaceC12005z0.mo4296u();
                        m14104i = C9545j.m14104i();
                        mo4225c = mo4296u.mo4256o(m14104i).build();
                        C9612q.m13920e(mo4225c);
                    }
                }
                C12766k.C12775i.EnumC12776a m4024c = C12766k.f33113f.m4067F(mo4225c, subDescriptor, false).m4024c();
                C9612q.m13918g(m4024c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (C14242a.f36633a[m4024c.ordinal()] == 1) {
                    return InterfaceC12759f.EnumC12761b.OVERRIDABLE;
                }
                return InterfaceC12759f.EnumC12761b.UNKNOWN;
            }
        }
        return InterfaceC12759f.EnumC12761b.UNKNOWN;
    }
}
