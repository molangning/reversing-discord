package sg;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC12005z0;
import ph.C11638f;

/* renamed from: sg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC12471a {

    /* renamed from: sg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12472a implements InterfaceC12471a {

        /* renamed from: a */
        public static final C12472a f32421a = new C12472a();

        private C12472a() {
        }

        @Override // sg.InterfaceC12471a
        /* renamed from: a */
        public Collection<InterfaceC11910d> mo5204a(InterfaceC11914e classDescriptor) {
            List m14104i;
            C9612q.m13917h(classDescriptor, "classDescriptor");
            m14104i = C9545j.m14104i();
            return m14104i;
        }

        @Override // sg.InterfaceC12471a
        /* renamed from: b */
        public Collection<AbstractC7264g0> mo5203b(InterfaceC11914e classDescriptor) {
            List m14104i;
            C9612q.m13917h(classDescriptor, "classDescriptor");
            m14104i = C9545j.m14104i();
            return m14104i;
        }

        @Override // sg.InterfaceC12471a
        /* renamed from: c */
        public Collection<C11638f> mo5202c(InterfaceC11914e classDescriptor) {
            List m14104i;
            C9612q.m13917h(classDescriptor, "classDescriptor");
            m14104i = C9545j.m14104i();
            return m14104i;
        }

        @Override // sg.InterfaceC12471a
        /* renamed from: d */
        public Collection<InterfaceC12005z0> mo5201d(C11638f name, InterfaceC11914e classDescriptor) {
            List m14104i;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(classDescriptor, "classDescriptor");
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    /* renamed from: a */
    Collection<InterfaceC11910d> mo5204a(InterfaceC11914e interfaceC11914e);

    /* renamed from: b */
    Collection<AbstractC7264g0> mo5203b(InterfaceC11914e interfaceC11914e);

    /* renamed from: c */
    Collection<C11638f> mo5202c(InterfaceC11914e interfaceC11914e);

    /* renamed from: d */
    Collection<InterfaceC12005z0> mo5201d(C11638f c11638f, InterfaceC11914e interfaceC11914e);
}