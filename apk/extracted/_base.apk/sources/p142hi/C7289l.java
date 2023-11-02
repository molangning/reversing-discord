package p142hi;

import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import th.C12758e;

/* renamed from: hi.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7289l extends AbstractC7219b {

    /* renamed from: d */
    private final InterfaceC11914e f19723d;

    /* renamed from: e */
    private final List<InterfaceC11920f1> f19724e;

    /* renamed from: f */
    private final Collection<AbstractC7264g0> f19725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7289l(InterfaceC11914e interfaceC11914e, List<? extends InterfaceC11920f1> list, Collection<AbstractC7264g0> collection, InterfaceC6821n interfaceC6821n) {
        super(interfaceC6821n);
        if (interfaceC11914e == null) {
            m21056v(0);
        }
        if (list == null) {
            m21056v(1);
        }
        if (collection == null) {
            m21056v(2);
        }
        if (interfaceC6821n == null) {
            m21056v(3);
        }
        this.f19723d = interfaceC11914e;
        this.f19724e = Collections.unmodifiableList(new ArrayList(list));
        this.f19725f = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: v */
    private static /* synthetic */ void m21056v(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p142hi.InterfaceC7265g1
    public List<InterfaceC11920f1> getParameters() {
        List<InterfaceC11920f1> list = this.f19724e;
        if (list == null) {
            m21056v(4);
        }
        return list;
    }

    @Override // p142hi.AbstractC7253g
    /* renamed from: h */
    protected Collection<AbstractC7264g0> mo4458h() {
        Collection<AbstractC7264g0> collection = this.f19725f;
        if (collection == null) {
            m21056v(6);
        }
        return collection;
    }

    @Override // p142hi.AbstractC7253g
    /* renamed from: l */
    protected InterfaceC11912d1 mo4456l() {
        InterfaceC11912d1.C11913a c11913a = InterfaceC11912d1.C11913a.f30912a;
        if (c11913a == null) {
            m21056v(7);
        }
        return c11913a;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: q */
    public boolean mo2787q() {
        return true;
    }

    public String toString() {
        return C12758e.m4099m(this.f19723d).m7447b();
    }

    @Override // p142hi.AbstractC7292m, p142hi.InterfaceC7265g1
    /* renamed from: w */
    public InterfaceC11914e mo2788p() {
        InterfaceC11914e interfaceC11914e = this.f19723d;
        if (interfaceC11914e == null) {
            m21056v(5);
        }
        return interfaceC11914e;
    }
}
