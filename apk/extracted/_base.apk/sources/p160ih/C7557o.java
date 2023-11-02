package p160ih;

import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import ng.EnumC10876i;
import p160ih.AbstractC7551m;
import p449yh.C14027d;
import p449yh.EnumC14028e;
import pf.C11581q;

/* renamed from: ih.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C7557o implements InterfaceC7556n<AbstractC7551m> {

    /* renamed from: a */
    public static final C7557o f20863a = new C7557o();

    /* renamed from: ih.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C7558a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20864a;

        static {
            int[] iArr = new int[EnumC10876i.values().length];
            try {
                iArr[EnumC10876i.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10876i.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10876i.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10876i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC10876i.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC10876i.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC10876i.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC10876i.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f20864a = iArr;
        }
    }

    private C7557o() {
    }

    @Override // p160ih.InterfaceC7556n
    /* renamed from: g */
    public AbstractC7551m mo20414c(AbstractC7551m possiblyPrimitiveType) {
        C9612q.m13917h(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (possiblyPrimitiveType instanceof AbstractC7551m.C7555d) {
            AbstractC7551m.C7555d c7555d = (AbstractC7551m.C7555d) possiblyPrimitiveType;
            if (c7555d.m20417i() != null) {
                String m882f = C14027d.m885c(c7555d.m20417i().m874g()).m882f();
                C9612q.m13918g(m882f, "byFqNameWithoutInnerClas…apperFqName).internalName");
                return mo20412e(m882f);
            }
            return possiblyPrimitiveType;
        }
        return possiblyPrimitiveType;
    }

    @Override // p160ih.InterfaceC7556n
    /* renamed from: h */
    public AbstractC7551m mo20416a(String representation) {
        EnumC14028e enumC14028e;
        AbstractC7551m c7554c;
        boolean z;
        C9612q.m13917h(representation, "representation");
        representation.length();
        char charAt = representation.charAt(0);
        EnumC14028e[] values = EnumC14028e.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC14028e = values[i];
                if (enumC14028e.m877d().charAt(0) == charAt) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                enumC14028e = null;
                break;
            }
        }
        if (enumC14028e != null) {
            return new AbstractC7551m.C7555d(enumC14028e);
        }
        if (charAt == 'V') {
            return new AbstractC7551m.C7555d(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            c7554c = new AbstractC7551m.C7552a(mo20416a(substring));
        } else {
            if (charAt == 'L') {
                C9654p.m13725P(representation, ';', false, 2, null);
            }
            String substring2 = representation.substring(1, representation.length() - 1);
            C9612q.m13918g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            c7554c = new AbstractC7551m.C7554c(substring2);
        }
        return c7554c;
    }

    @Override // p160ih.InterfaceC7556n
    /* renamed from: i */
    public AbstractC7551m.C7554c mo20412e(String internalName) {
        C9612q.m13917h(internalName, "internalName");
        return new AbstractC7551m.C7554c(internalName);
    }

    @Override // p160ih.InterfaceC7556n
    /* renamed from: j */
    public AbstractC7551m mo20415b(EnumC10876i primitiveType) {
        C9612q.m13917h(primitiveType, "primitiveType");
        switch (C7558a.f20864a[primitiveType.ordinal()]) {
            case 1:
                return AbstractC7551m.f20851a.m20426a();
            case 2:
                return AbstractC7551m.f20851a.m20424c();
            case 3:
                return AbstractC7551m.f20851a.m20425b();
            case 4:
                return AbstractC7551m.f20851a.m20419h();
            case 5:
                return AbstractC7551m.f20851a.m20421f();
            case 6:
                return AbstractC7551m.f20851a.m20422e();
            case 7:
                return AbstractC7551m.f20851a.m20420g();
            case 8:
                return AbstractC7551m.f20851a.m20423d();
            default:
                throw new C11581q();
        }
    }

    @Override // p160ih.InterfaceC7556n
    /* renamed from: k */
    public AbstractC7551m mo20411f() {
        return mo20412e("java/lang/Class");
    }

    @Override // p160ih.InterfaceC7556n
    /* renamed from: l */
    public String mo20413d(AbstractC7551m type) {
        String m877d;
        C9612q.m13917h(type, "type");
        if (type instanceof AbstractC7551m.C7552a) {
            return '[' + mo20413d(((AbstractC7551m.C7552a) type).m20427i());
        } else if (type instanceof AbstractC7551m.C7555d) {
            EnumC14028e m20417i = ((AbstractC7551m.C7555d) type).m20417i();
            if (m20417i == null || (m877d = m20417i.m877d()) == null) {
                return "V";
            }
            return m877d;
        } else if (type instanceof AbstractC7551m.C7554c) {
            return 'L' + ((AbstractC7551m.C7554c) type).m20418i() + ';';
        } else {
            throw new C11581q();
        }
    }
}
