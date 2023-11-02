package p159ig;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kg.C9245e0;
import kg.C9258h0;
import kg.InterfaceC9322n;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KType;
import p140hg.C7142j;
import p140hg.EnumC7145k;
import p140hg.InterfaceC7130c;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7291l1;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7294m1;
import p142hi.C7327u0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import pf.C11581q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007\u001a.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, m14357d2 = {"Lhg/c;", "", "Lhg/j;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/KType;", "b", "Lhi/c1;", "attributes", "Lhi/g1;", "typeConstructor", "Lhi/o0;", "a", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ig.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7511c {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: ig.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C7512a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20759a;

        static {
            int[] iArr = new int[EnumC7145k.values().length];
            try {
                iArr[EnumC7145k.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7145k.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7145k.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20759a = iArr;
        }
    }

    /* renamed from: a */
    private static final AbstractC7302o0 m20533a(C7226c1 c7226c1, InterfaceC7265g1 interfaceC7265g1, List<C7142j> list, boolean z) {
        int m14093t;
        AbstractC7264g0 abstractC7264g0;
        int i;
        AbstractC7291l1 c7327u0;
        List<InterfaceC11920f1> parameters = interfaceC7265g1.getParameters();
        C9612q.m13918g(parameters, "typeConstructor.parameters");
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9545j.m14094s();
            }
            C7142j c7142j = (C7142j) obj;
            C9245e0 c9245e0 = (C9245e0) c7142j.m21383c();
            if (c9245e0 != null) {
                abstractC7264g0 = c9245e0.m15999o();
            } else {
                abstractC7264g0 = null;
            }
            EnumC7145k m21382d = c7142j.m21382d();
            if (m21382d == null) {
                i = -1;
            } else {
                i = C7512a.f20759a[m21382d.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            EnumC7336w1 enumC7336w1 = EnumC7336w1.OUT_VARIANCE;
                            C9612q.m13920e(abstractC7264g0);
                            c7327u0 = new C7294m1(enumC7336w1, abstractC7264g0);
                        } else {
                            throw new C11581q();
                        }
                    } else {
                        EnumC7336w1 enumC7336w12 = EnumC7336w1.IN_VARIANCE;
                        C9612q.m13920e(abstractC7264g0);
                        c7327u0 = new C7294m1(enumC7336w12, abstractC7264g0);
                    }
                } else {
                    EnumC7336w1 enumC7336w13 = EnumC7336w1.INVARIANT;
                    C9612q.m13920e(abstractC7264g0);
                    c7327u0 = new C7294m1(enumC7336w13, abstractC7264g0);
                }
            } else {
                InterfaceC11920f1 interfaceC11920f1 = parameters.get(i2);
                C9612q.m13918g(interfaceC11920f1, "parameters[index]");
                c7327u0 = new C7327u0(interfaceC11920f1);
            }
            arrayList.add(c7327u0);
            i2 = i3;
        }
        return C7267h0.m21098j(c7226c1, interfaceC7265g1, arrayList, z, null, 16, null);
    }

    /* renamed from: b */
    public static final KType m20532b(InterfaceC7130c interfaceC7130c, List<C7142j> arguments, boolean z, List<? extends Annotation> annotations) {
        InterfaceC9322n interfaceC9322n;
        InterfaceC11927h descriptor;
        C7226c1 m21197h;
        C9612q.m13917h(interfaceC7130c, "<this>");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(annotations, "annotations");
        if (interfaceC7130c instanceof InterfaceC9322n) {
            interfaceC9322n = (InterfaceC9322n) interfaceC7130c;
        } else {
            interfaceC9322n = null;
        }
        if (interfaceC9322n != null && (descriptor = interfaceC9322n.getDescriptor()) != null) {
            InterfaceC7265g1 mo4173k = descriptor.mo4173k();
            C9612q.m13918g(mo4173k, "descriptor.typeConstructor");
            List<InterfaceC11920f1> parameters = mo4173k.getParameters();
            C9612q.m13918g(parameters, "typeConstructor.parameters");
            if (parameters.size() == arguments.size()) {
                if (annotations.isEmpty()) {
                    m21197h = C7226c1.f19622k.m21197h();
                } else {
                    m21197h = C7226c1.f19622k.m21197h();
                }
                return new C9245e0(m20533a(m21197h, mo4173k, arguments, z), null, 2, null);
            }
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        throw new C9258h0("Cannot create type for an unsupported classifier: " + interfaceC7130c + " (" + interfaceC7130c.getClass() + ')');
    }
}