package kg;

import fi.C6474j;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kg.AbstractC9231c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p142hi.C7320s1;
import p218lg.AbstractC10155f;
import p270oh.C11122i;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import th.C12758e;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m14357d2 = {"Lkg/c0$a;", "", "isGetter", "Llg/e;", "b", "Lqg/u0;", "g", "", "f", "(Lkg/c0$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kg.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9243d0 {
    /* JADX WARN: Removed duplicated region for block: B:206:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0118  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p218lg.InterfaceC10153e<?> m16007b(kg.AbstractC9231c0.AbstractC9232a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.C9243d0.m16007b(kg.c0$a, boolean):lg.e");
    }

    /* renamed from: c */
    private static final AbstractC10155f<Field> m16006c(AbstractC9231c0.AbstractC9232a<?, ?> abstractC9232a, boolean z, Field field) {
        AbstractC10155f<Field> c10170c;
        if (!m16002g(abstractC9232a.mo15769B().mo15826x()) && Modifier.isStatic(field.getModifiers())) {
            if (m16005d(abstractC9232a)) {
                if (z) {
                    if (abstractC9232a.mo15825z()) {
                        return new AbstractC10155f.AbstractC10161f.C10163b(field);
                    }
                    return new AbstractC10155f.AbstractC10161f.C10165d(field);
                } else if (abstractC9232a.mo15825z()) {
                    c10170c = new AbstractC10155f.AbstractC10167g.C10169b(field, m16004e(abstractC9232a));
                } else {
                    c10170c = new AbstractC10155f.AbstractC10167g.C10171d(field, m16004e(abstractC9232a));
                }
            } else if (z) {
                return new AbstractC10155f.AbstractC10161f.C10166e(field);
            } else {
                c10170c = new AbstractC10155f.AbstractC10167g.C10172e(field, m16004e(abstractC9232a));
            }
        } else if (z) {
            if (abstractC9232a.mo15825z()) {
                c10170c = new AbstractC10155f.AbstractC10161f.C10162a(field, m16003f(abstractC9232a));
            } else {
                return new AbstractC10155f.AbstractC10161f.C10164c(field);
            }
        } else if (abstractC9232a.mo15825z()) {
            c10170c = new AbstractC10155f.AbstractC10167g.C10168a(field, m16004e(abstractC9232a), m16003f(abstractC9232a));
        } else {
            c10170c = new AbstractC10155f.AbstractC10167g.C10170c(field, m16004e(abstractC9232a));
        }
        return c10170c;
    }

    /* renamed from: d */
    private static final boolean m16005d(AbstractC9231c0.AbstractC9232a<?, ?> abstractC9232a) {
        return abstractC9232a.mo15769B().mo15826x().getAnnotations().mo6023q(C9336p0.m15850j());
    }

    /* renamed from: e */
    private static final boolean m16004e(AbstractC9231c0.AbstractC9232a<?, ?> abstractC9232a) {
        return !C7320s1.m20983l(abstractC9232a.mo15769B().mo15826x().getType());
    }

    /* renamed from: f */
    public static final Object m16003f(AbstractC9231c0.AbstractC9232a<?, ?> abstractC9232a) {
        C9612q.m13917h(abstractC9232a, "<this>");
        return abstractC9232a.mo15769B().m16022B();
    }

    /* renamed from: g */
    private static final boolean m16002g(InterfaceC11989u0 interfaceC11989u0) {
        InterfaceC11947m containingDeclaration = interfaceC11989u0.mo4163b();
        C9612q.m13918g(containingDeclaration, "containingDeclaration");
        if (!C12758e.m4088x(containingDeclaration)) {
            return false;
        }
        InterfaceC11947m mo4163b = containingDeclaration.mo4163b();
        if ((C12758e.m4122C(mo4163b) || C12758e.m4092t(mo4163b)) && (!(interfaceC11989u0 instanceof C6474j) || !C11122i.m9128f(((C6474j) interfaceC11989u0).mo22653e0()))) {
            return false;
        }
        return true;
    }
}