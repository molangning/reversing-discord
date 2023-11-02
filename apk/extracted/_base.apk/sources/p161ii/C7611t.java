package p161ii;

import p142hi.InterfaceC7265g1;

/* renamed from: ii.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C7611t implements InterfaceC7613v {
    /* renamed from: b */
    private static /* synthetic */ void m20243b(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p161ii.InterfaceC7613v
    /* renamed from: a */
    public boolean mo20239a(InterfaceC7265g1 interfaceC7265g1, InterfaceC7265g1 interfaceC7265g12) {
        if (interfaceC7265g1 == null) {
            m20243b(3);
        }
        if (interfaceC7265g12 == null) {
            m20243b(4);
        }
        return interfaceC7265g1.equals(interfaceC7265g12);
    }
}
