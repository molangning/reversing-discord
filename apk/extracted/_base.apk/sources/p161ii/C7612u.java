package p161ii;

import p142hi.AbstractC7264g0;

/* renamed from: ii.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7612u {
    /* renamed from: a */
    private static /* synthetic */ void m20242a(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 10) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 7 && i != 10) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static AbstractC7264g0 m20241b(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02) {
        if (abstractC7264g0 == null) {
            m20242a(0);
        }
        if (abstractC7264g02 == null) {
            m20242a(1);
        }
        return m20240c(abstractC7264g0, abstractC7264g02, new C7611t());
    }

    /* renamed from: c */
    public static AbstractC7264g0 m20240c(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, InterfaceC7613v interfaceC7613v) {
        if (abstractC7264g0 == null) {
            m20242a(2);
        }
        if (abstractC7264g02 == null) {
            m20242a(3);
        }
        if (interfaceC7613v == null) {
            m20242a(4);
        }
        return C7625y.m20222d(abstractC7264g0, abstractC7264g02, interfaceC7613v);
    }
}
