package p161ii;

import ai.InterfaceC0194h;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10200i;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7275i;
import p142hi.InterfaceC7265g1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11947m;
import ph.C11632b;

/* renamed from: ii.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7592g extends AbstractC7275i {

    /* renamed from: ii.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7593a extends AbstractC7592g {

        /* renamed from: a */
        public static final C7593a f20882a = new C7593a();

        private C7593a() {
        }

        @Override // p161ii.AbstractC7592g
        /* renamed from: b */
        public InterfaceC11914e mo20282b(C11632b classId) {
            C9612q.m13917h(classId, "classId");
            return null;
        }

        @Override // p161ii.AbstractC7592g
        /* renamed from: c */
        public <S extends InterfaceC0194h> S mo20281c(InterfaceC11914e classDescriptor, Function0<? extends S> compute) {
            C9612q.m13917h(classDescriptor, "classDescriptor");
            C9612q.m13917h(compute, "compute");
            return compute.invoke();
        }

        @Override // p161ii.AbstractC7592g
        /* renamed from: d */
        public boolean mo20280d(InterfaceC11928h0 moduleDescriptor) {
            C9612q.m13917h(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // p161ii.AbstractC7592g
        /* renamed from: e */
        public boolean mo20279e(InterfaceC7265g1 typeConstructor) {
            C9612q.m13917h(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // p161ii.AbstractC7592g
        /* renamed from: g */
        public Collection<AbstractC7264g0> mo20277g(InterfaceC11914e classDescriptor) {
            C9612q.m13917h(classDescriptor, "classDescriptor");
            Collection<AbstractC7264g0> mo2791m = classDescriptor.mo4173k().mo2791m();
            C9612q.m13918g(mo2791m, "classDescriptor.typeConstructor.supertypes");
            return mo2791m;
        }

        @Override // p142hi.AbstractC7275i
        /* renamed from: h */
        public AbstractC7264g0 mo20283a(InterfaceC10200i type) {
            C9612q.m13917h(type, "type");
            return (AbstractC7264g0) type;
        }

        @Override // p161ii.AbstractC7592g
        /* renamed from: i */
        public InterfaceC11914e mo20278f(InterfaceC11947m descriptor) {
            C9612q.m13917h(descriptor, "descriptor");
            return null;
        }
    }

    /* renamed from: b */
    public abstract InterfaceC11914e mo20282b(C11632b c11632b);

    /* renamed from: c */
    public abstract <S extends InterfaceC0194h> S mo20281c(InterfaceC11914e interfaceC11914e, Function0<? extends S> function0);

    /* renamed from: d */
    public abstract boolean mo20280d(InterfaceC11928h0 interfaceC11928h0);

    /* renamed from: e */
    public abstract boolean mo20279e(InterfaceC7265g1 interfaceC7265g1);

    /* renamed from: f */
    public abstract InterfaceC11927h mo20278f(InterfaceC11947m interfaceC11947m);

    /* renamed from: g */
    public abstract Collection<AbstractC7264g0> mo20277g(InterfaceC11914e interfaceC11914e);

    /* renamed from: h */
    public abstract AbstractC7264g0 mo20276h(InterfaceC10200i interfaceC10200i);
}
