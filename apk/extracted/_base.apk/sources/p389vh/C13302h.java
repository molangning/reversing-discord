package p389vh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9538f;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.EnumC10876i;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13302h {

    /* renamed from: a */
    public static final C13302h f34379a = new C13302h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vh.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13303a extends AbstractC9614s implements Function1<InterfaceC11928h0, AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ AbstractC7264g0 f34380j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13303a(AbstractC7264g0 abstractC7264g0) {
            super(1);
            this.f34380j = abstractC7264g0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11928h0 it) {
            C9612q.m13917h(it, "it");
            return this.f34380j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vh.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13304b extends AbstractC9614s implements Function1<InterfaceC11928h0, AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ EnumC10876i f34381j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13304b(EnumC10876i enumC10876i) {
            super(1);
            this.f34381j = enumC10876i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11928h0 module) {
            C9612q.m13917h(module, "module");
            AbstractC7302o0 m9837O = module.mo4194n().m9837O(this.f34381j);
            C9612q.m13918g(m9837O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return m9837O;
        }
    }

    private C13302h() {
    }

    /* renamed from: b */
    private final C13296b m2819b(List<?> list, EnumC10876i enumC10876i) {
        List<Object> m14075C0;
        m14075C0 = C9553r.m14075C0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m14075C0) {
            AbstractC13301g<?> m2818c = m2818c(obj);
            if (m2818c != null) {
                arrayList.add(m2818c);
            }
        }
        return new C13296b(arrayList, new C13304b(enumC10876i));
    }

    /* renamed from: a */
    public final C13296b m2820a(List<? extends AbstractC13301g<?>> value, AbstractC7264g0 type) {
        C9612q.m13917h(value, "value");
        C9612q.m13917h(type, "type");
        return new C13296b(value, new C13303a(type));
    }

    /* renamed from: c */
    public final AbstractC13301g<?> m2818c(Object obj) {
        List<?> m14193w0;
        List<?> m14203q0;
        List<?> m14202r0;
        List<?> m14204p0;
        List<?> m14199t0;
        List<?> m14201s0;
        List<?> m14195v0;
        List<?> m14205o0;
        if (obj instanceof Byte) {
            return new C13298d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C13328u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C13311m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C13325r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C13299e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C13310l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C13305i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C13297c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C13329v((String) obj);
        }
        if (obj instanceof byte[]) {
            m14205o0 = C9538f.m14205o0((byte[]) obj);
            return m2819b(m14205o0, EnumC10876i.BYTE);
        } else if (obj instanceof short[]) {
            m14195v0 = C9538f.m14195v0((short[]) obj);
            return m2819b(m14195v0, EnumC10876i.SHORT);
        } else if (obj instanceof int[]) {
            m14201s0 = C9538f.m14201s0((int[]) obj);
            return m2819b(m14201s0, EnumC10876i.INT);
        } else if (obj instanceof long[]) {
            m14199t0 = C9538f.m14199t0((long[]) obj);
            return m2819b(m14199t0, EnumC10876i.LONG);
        } else if (obj instanceof char[]) {
            m14204p0 = C9538f.m14204p0((char[]) obj);
            return m2819b(m14204p0, EnumC10876i.CHAR);
        } else if (obj instanceof float[]) {
            m14202r0 = C9538f.m14202r0((float[]) obj);
            return m2819b(m14202r0, EnumC10876i.FLOAT);
        } else if (obj instanceof double[]) {
            m14203q0 = C9538f.m14203q0((double[]) obj);
            return m2819b(m14203q0, EnumC10876i.DOUBLE);
        } else if (obj instanceof boolean[]) {
            m14193w0 = C9538f.m14193w0((boolean[]) obj);
            return m2819b(m14193w0, EnumC10876i.BOOLEAN);
        } else if (obj == null) {
            return new C13326s();
        } else {
            return null;
        }
    }
}
