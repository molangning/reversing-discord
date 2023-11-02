package p181jg;

import java.util.Iterator;
import java.util.List;
import kg.C9245e0;
import kg.C9258h0;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import p140hg.InterfaceC7130c;
import p140hg.InterfaceC7141i;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m14357d2 = {"Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "b", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "jvmErasure", "Lhg/c;", "a", "(Lhg/c;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: jg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C8938b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final KClass<?> m17025a(InterfaceC7130c interfaceC7130c) {
        InterfaceC11914e interfaceC11914e;
        KClass<?> m17024b;
        Object m14054V;
        boolean z;
        C9612q.m13917h(interfaceC7130c, "<this>");
        if (interfaceC7130c instanceof KClass) {
            return (KClass) interfaceC7130c;
        }
        if (interfaceC7130c instanceof InterfaceC7141i) {
            List<KType> upperBounds = ((InterfaceC7141i) interfaceC7130c).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                interfaceC11914e = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                KType kType = (KType) next;
                C9612q.m13919f(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                InterfaceC11927h mo2788p = ((C9245e0) kType).m15999o().mo3564N0().mo2788p();
                if (mo2788p instanceof InterfaceC11914e) {
                    interfaceC11914e = (InterfaceC11914e) mo2788p;
                }
                if (interfaceC11914e != null && interfaceC11914e.mo4175g() != EnumC11918f.INTERFACE && interfaceC11914e.mo4175g() != EnumC11918f.ANNOTATION_CLASS) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    interfaceC11914e = next;
                    break;
                }
            }
            KType kType2 = (KType) interfaceC11914e;
            if (kType2 == null) {
                m14054V = C9553r.m14054V(upperBounds);
                kType2 = (KType) m14054V;
            }
            if (kType2 == null || (m17024b = m17024b(kType2)) == null) {
                return C9591f0.m13969b(Object.class);
            }
            return m17024b;
        }
        throw new C9258h0("Cannot calculate JVM erasure for type: " + interfaceC7130c);
    }

    /* renamed from: b */
    public static final KClass<?> m17024b(KType kType) {
        KClass<?> m17025a;
        C9612q.m13917h(kType, "<this>");
        InterfaceC7130c mo13879j = kType.mo13879j();
        if (mo13879j != null && (m17025a = m17025a(mo13879j)) != null) {
            return m17025a;
        }
        throw new C9258h0("Cannot calculate JVM erasure for type: " + kType);
    }
}
