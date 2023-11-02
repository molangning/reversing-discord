package tg;

import bi.C2318j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p142hi.AbstractC7264g0;
import p142hi.C7307p1;
import p142hi.EnumC7336w1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11971r0;
import p305qg.InterfaceC11997x0;
import p325rg.InterfaceC12155g;
import ph.C11640h;

/* renamed from: tg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12684c extends AbstractC12706j implements InterfaceC11997x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12684c(InterfaceC12155g interfaceC12155g) {
        super(interfaceC12155g, C11640h.f30225i);
        if (interfaceC12155g == null) {
            m4532g0(0);
        }
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4532g0(int i) {
        String str;
        int i2;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: E0 */
    public InterfaceC11971r0 mo4221a() {
        return this;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: I */
    public InterfaceC11997x0 mo4332I() {
        return null;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: M */
    public InterfaceC11997x0 mo4329M() {
        return null;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: d */
    public Collection<? extends InterfaceC11897a> mo4310d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m4532g0(6);
        }
        return emptySet;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4382m(this, d);
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: f0 */
    public boolean mo4307f0() {
        return false;
    }

    @Override // p305qg.InterfaceC11897a
    public AbstractC7264g0 getReturnType() {
        return getType();
    }

    @Override // p305qg.InterfaceC11933i1
    public AbstractC7264g0 getType() {
        AbstractC7264g0 type = getValue().getType();
        if (type == null) {
            m4532g0(4);
        }
        return type;
    }

    @Override // p305qg.InterfaceC11897a
    public List<InterfaceC11920f1> getTypeParameters() {
        List<InterfaceC11920f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4532g0(3);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u abstractC11988u = C11974t.f30971f;
        if (abstractC11988u == null) {
            m4532g0(7);
        }
        return abstractC11988u;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: i */
    public List<InterfaceC11936j1> mo4301i() {
        List<InterfaceC11936j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4532g0(5);
        }
        return emptyList;
    }

    @Override // p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        InterfaceC11900a1 interfaceC11900a1 = InterfaceC11900a1.f30901a;
        if (interfaceC11900a1 == null) {
            m4532g0(9);
        }
        return interfaceC11900a1;
    }

    @Override // p305qg.InterfaceC11909c1
    /* renamed from: c */
    public InterfaceC11897a mo4225c(C7307p1 c7307p1) {
        AbstractC7264g0 m21018p;
        if (c7307p1 == null) {
            m4532g0(1);
        }
        if (c7307p1.m21023k()) {
            return this;
        }
        if (mo4163b() instanceof InterfaceC11914e) {
            m21018p = c7307p1.m21018p(getType(), EnumC7336w1.OUT_VARIANCE);
        } else {
            m21018p = c7307p1.m21018p(getType(), EnumC7336w1.INVARIANT);
        }
        if (m21018p == null) {
            return null;
        }
        return m21018p == getType() ? this : new C12699f0(mo4163b(), new C2318j(m21018p), getAnnotations());
    }
}