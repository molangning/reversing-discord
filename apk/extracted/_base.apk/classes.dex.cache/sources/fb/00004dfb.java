package tg;

import ai.InterfaceC0194h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7289l;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.AbstractC11930h1;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: tg.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12747y extends AbstractC12700g {

    /* renamed from: r */
    private final EnumC11918f f33080r;

    /* renamed from: s */
    private final boolean f33081s;

    /* renamed from: t */
    private EnumC11915e0 f33082t;

    /* renamed from: u */
    private AbstractC11988u f33083u;

    /* renamed from: v */
    private InterfaceC7265g1 f33084v;

    /* renamed from: w */
    private List<InterfaceC11920f1> f33085w;

    /* renamed from: x */
    private final Collection<AbstractC7264g0> f33086x;

    /* renamed from: y */
    private final InterfaceC6821n f33087y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12747y(InterfaceC11947m interfaceC11947m, EnumC11918f enumC11918f, boolean z, boolean z2, C11638f c11638f, InterfaceC11900a1 interfaceC11900a1, InterfaceC6821n interfaceC6821n) {
        super(interfaceC6821n, interfaceC11947m, c11638f, interfaceC11900a1, z2);
        if (interfaceC11947m == null) {
            m4186E0(0);
        }
        if (enumC11918f == null) {
            m4186E0(1);
        }
        if (c11638f == null) {
            m4186E0(2);
        }
        if (interfaceC11900a1 == null) {
            m4186E0(3);
        }
        if (interfaceC6821n == null) {
            m4186E0(4);
        }
        this.f33086x = new ArrayList();
        this.f33087y = interfaceC6821n;
        this.f33080r = enumC11918f;
        this.f33081s = z;
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m4186E0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: C */
    public InterfaceC11910d mo4187C() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: I0 */
    public boolean mo4185I0() {
        return false;
    }

    /* renamed from: K0 */
    public void m4184K0() {
        this.f33084v = new C7289l(this, this.f33085w, this.f33086x, this.f33087y);
        Iterator<InterfaceC11910d> it = mo4171l().iterator();
        while (it.hasNext()) {
            ((C12698f) it.next()).m4303g1(mo4224p());
        }
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: L0 */
    public Set<InterfaceC11910d> mo4171l() {
        Set<InterfaceC11910d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            m4186E0(13);
        }
        return emptySet;
    }

    /* renamed from: M0 */
    public void m4182M0(EnumC11915e0 enumC11915e0) {
        if (enumC11915e0 == null) {
            m4186E0(6);
        }
        this.f33082t = enumC11915e0;
    }

    /* renamed from: N0 */
    public void m4181N0(List<InterfaceC11920f1> list) {
        if (list == null) {
            m4186E0(14);
        }
        if (this.f33085w == null) {
            this.f33085w = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    /* renamed from: O0 */
    public void m4180O0(AbstractC11988u abstractC11988u) {
        if (abstractC11988u == null) {
            m4186E0(9);
        }
        this.f33083u = abstractC11988u;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: R */
    public AbstractC11930h1<AbstractC7302o0> mo4179R() {
        return null;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Y */
    public boolean mo4177Y() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: c0 */
    public boolean mo4176c0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: g */
    public EnumC11918f mo4175g() {
        EnumC11918f enumC11918f = this.f33080r;
        if (enumC11918f == null) {
            m4186E0(8);
        }
        return enumC11918f;
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        InterfaceC12155g m6037b = InterfaceC12155g.f31603f.m6037b();
        if (m6037b == null) {
            m4186E0(5);
        }
        return m6037b;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u abstractC11988u = this.f33083u;
        if (abstractC11988u == null) {
            m4186E0(10);
        }
        return abstractC11988u;
    }

    @Override // p305qg.InterfaceC11914e
    public boolean isInline() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: j0 */
    public boolean mo4174j0() {
        return false;
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        InterfaceC7265g1 interfaceC7265g1 = this.f33084v;
        if (interfaceC7265g1 == null) {
            m4186E0(11);
        }
        return interfaceC7265g1;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return false;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: l0 */
    public InterfaceC0194h mo4170l0() {
        InterfaceC0194h.C0197b c0197b = InterfaceC0194h.C0197b.f649b;
        if (c0197b == null) {
            m4186E0(18);
        }
        return c0197b;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: m0 */
    public InterfaceC11914e mo4169m0() {
        return null;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11931i
    /* renamed from: q */
    public List<InterfaceC11920f1> mo4168q() {
        List<InterfaceC11920f1> list = this.f33085w;
        if (list == null) {
            m4186E0(15);
        }
        return list;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        EnumC11915e0 enumC11915e0 = this.f33082t;
        if (enumC11915e0 == null) {
            m4186E0(7);
        }
        return enumC11915e0;
    }

    @Override // tg.AbstractC12739t
    /* renamed from: r0 */
    public InterfaceC0194h mo4166r0(AbstractC7592g abstractC7592g) {
        if (abstractC7592g == null) {
            m4186E0(16);
        }
        InterfaceC0194h.C0197b c0197b = InterfaceC0194h.C0197b.f649b;
        if (c0197b == null) {
            m4186E0(17);
        }
        return c0197b;
    }

    public String toString() {
        return AbstractC12706j.m4422r0(this);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: y */
    public Collection<InterfaceC11914e> mo4165y() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4186E0(19);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11931i
    /* renamed from: z */
    public boolean mo4164z() {
        return this.f33081s;
    }
}