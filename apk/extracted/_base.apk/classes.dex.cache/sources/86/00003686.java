package p142hi;

import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.properties.InterfaceC9625d;
import kotlin.reflect.KProperty;
import p325rg.InterfaceC12155g;

/* renamed from: hi.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7286k {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f19721a = {C9591f0.m13964g(new C9584c0(C9591f0.m13967d(C7286k.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b */
    private static final InterfaceC9625d f19722b;

    static {
        InterfaceC9625d m9084c = C7226c1.f19622k.m9084c(C9591f0.m13969b(C7278j.class));
        C9612q.m13919f(m9084c, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f19722b = m9084c;
    }

    /* renamed from: a */
    public static final InterfaceC12155g m21059a(C7226c1 c7226c1) {
        InterfaceC12155g m21075e;
        C9612q.m13917h(c7226c1, "<this>");
        C7278j m21058b = m21058b(c7226c1);
        if (m21058b == null || (m21075e = m21058b.m21075e()) == null) {
            return InterfaceC12155g.f31603f.m6037b();
        }
        return m21075e;
    }

    /* renamed from: b */
    public static final C7278j m21058b(C7226c1 c7226c1) {
        C9612q.m13917h(c7226c1, "<this>");
        return (C7278j) f19722b.getValue(c7226c1, f19721a[0]);
    }
}