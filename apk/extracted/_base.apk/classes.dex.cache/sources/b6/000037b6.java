package p161ii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import li.EnumC10193b;
import li.InterfaceC10200i;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7266h;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7226c1;
import p142hi.C7239f0;
import p142hi.C7267h0;
import p142hi.C7320s1;
import p142hi.C7329u1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p234mi.C10472a;
import p372uh.C12975c;
import p389vh.C13319p;
import pf.C11581q;

/* renamed from: ii.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7589f extends AbstractC7266h {

    /* renamed from: ii.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7590a extends AbstractC7589f {

        /* renamed from: a */
        public static final C7590a f20881a = new C7590a();

        private C7590a() {
        }
    }

    /* renamed from: ii.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C7591b extends C9605m implements Function1<InterfaceC10200i, AbstractC7333v1> {
        C7591b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final AbstractC7333v1 invoke(InterfaceC10200i p0) {
            C9612q.m13917h(p0, "p0");
            return ((AbstractC7589f) this.receiver).mo20287a(p0);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final KDeclarationContainer getOwner() {
            return C9591f0.m13969b(AbstractC7589f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9587e
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    /* renamed from: c */
    private final AbstractC7302o0 m20285c(AbstractC7302o0 abstractC7302o0) {
        int m14093t;
        int m14093t2;
        List m14104i;
        int m14093t3;
        AbstractC7264g0 type;
        InterfaceC7265g1 mo3564N0 = abstractC7302o0.mo3564N0();
        boolean z = true;
        boolean z2 = false;
        C7239f0 c7239f0 = null;
        r5 = null;
        AbstractC7333v1 abstractC7333v1 = null;
        AbstractC7264g0 abstractC7264g0 = null;
        if (mo3564N0 instanceof C12975c) {
            C12975c c12975c = (C12975c) mo3564N0;
            InterfaceC7288k1 mo3552b = c12975c.mo3552b();
            if (mo3552b.mo20954b() != EnumC7336w1.IN_VARIANCE) {
                z = false;
            }
            if (!z) {
                mo3552b = null;
            }
            if (mo3552b != null && (type = mo3552b.getType()) != null) {
                abstractC7333v1 = type.mo20916Q0();
            }
            AbstractC7333v1 abstractC7333v12 = abstractC7333v1;
            if (c12975c.m3550d() == null) {
                InterfaceC7288k1 mo3552b2 = c12975c.mo3552b();
                Collection<AbstractC7264g0> mo2791m = c12975c.mo2791m();
                m14093t3 = C9546k.m14093t(mo2791m, 10);
                ArrayList arrayList = new ArrayList(m14093t3);
                for (AbstractC7264g0 abstractC7264g02 : mo2791m) {
                    arrayList.add(abstractC7264g02.mo20916Q0());
                }
                c12975c.m3548f(new C7596j(mo3552b2, arrayList, null, 4, null));
            }
            EnumC10193b enumC10193b = EnumC10193b.FOR_SUBTYPING;
            C7596j m3550d = c12975c.m3550d();
            C9612q.m13920e(m3550d);
            return new C7595i(enumC10193b, m3550d, abstractC7333v12, abstractC7302o0.mo3565M0(), abstractC7302o0.mo3563O0(), false, 32, null);
        } else if (mo3564N0 instanceof C13319p) {
            Collection<AbstractC7264g0> mo2791m2 = ((C13319p) mo3564N0).mo2791m();
            m14093t2 = C9546k.m14093t(mo2791m2, 10);
            ArrayList arrayList2 = new ArrayList(m14093t2);
            for (AbstractC7264g0 abstractC7264g03 : mo2791m2) {
                AbstractC7264g0 m20979p = C7320s1.m20979p(abstractC7264g03, abstractC7302o0.mo3563O0());
                C9612q.m13918g(m20979p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(m20979p);
            }
            C7239f0 c7239f02 = new C7239f0(arrayList2);
            C7226c1 mo3565M0 = abstractC7302o0.mo3565M0();
            m14104i = C9545j.m14104i();
            return C7267h0.m21097k(mo3565M0, c7239f02, m14104i, false, abstractC7302o0.mo3553o());
        } else if ((mo3564N0 instanceof C7239f0) && abstractC7302o0.mo3563O0()) {
            C7239f0 c7239f03 = (C7239f0) mo3564N0;
            Collection<AbstractC7264g0> mo2791m3 = c7239f03.mo2791m();
            m14093t = C9546k.m14093t(mo2791m3, 10);
            ArrayList arrayList3 = new ArrayList(m14093t);
            for (AbstractC7264g0 abstractC7264g04 : mo2791m3) {
                arrayList3.add(C10472a.m11437u(abstractC7264g04));
                z2 = true;
            }
            if (z2) {
                AbstractC7264g0 m21155e = c7239f03.m21155e();
                if (m21155e != null) {
                    abstractC7264g0 = C10472a.m11437u(m21155e);
                }
                c7239f0 = new C7239f0(arrayList3).m21151i(abstractC7264g0);
            }
            if (c7239f0 != null) {
                c7239f03 = c7239f0;
            }
            return c7239f03.m21156d();
        } else {
            return abstractC7302o0;
        }
    }

    @Override // p142hi.AbstractC7266h
    /* renamed from: b */
    public AbstractC7333v1 mo20287a(InterfaceC10200i type) {
        AbstractC7333v1 m21104d;
        C9612q.m13917h(type, "type");
        if (type instanceof AbstractC7264g0) {
            AbstractC7333v1 mo20916Q0 = ((AbstractC7264g0) type).mo20916Q0();
            if (mo20916Q0 instanceof AbstractC7302o0) {
                m21104d = m20285c((AbstractC7302o0) mo20916Q0);
            } else if (mo20916Q0 instanceof AbstractC7217a0) {
                AbstractC7217a0 abstractC7217a0 = (AbstractC7217a0) mo20916Q0;
                AbstractC7302o0 m20285c = m20285c(abstractC7217a0.m21218V0());
                AbstractC7302o0 m20285c2 = m20285c(abstractC7217a0.m21217W0());
                if (m20285c == abstractC7217a0.m21218V0() && m20285c2 == abstractC7217a0.m21217W0()) {
                    m21104d = mo20916Q0;
                } else {
                    m21104d = C7267h0.m21104d(m20285c, m20285c2);
                }
            } else {
                throw new C11581q();
            }
            return C7329u1.m20947c(m21104d, mo20916Q0, new C7591b(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}