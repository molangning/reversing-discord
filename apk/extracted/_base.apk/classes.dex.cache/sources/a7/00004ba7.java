package p325rg;

import java.util.Map;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11900a1;
import p325rg.InterfaceC12149c;
import p389vh.AbstractC13301g;
import ph.C11633c;
import ph.C11638f;
import sh.AbstractC12485c;

/* renamed from: rg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C12151d implements InterfaceC12149c {

    /* renamed from: a */
    private final AbstractC7264g0 f31583a;

    /* renamed from: b */
    private final Map<C11638f, AbstractC13301g<?>> f31584b;

    /* renamed from: c */
    private final InterfaceC11900a1 f31585c;

    public C12151d(AbstractC7264g0 abstractC7264g0, Map<C11638f, AbstractC13301g<?>> map, InterfaceC11900a1 interfaceC11900a1) {
        if (abstractC7264g0 == null) {
            m6044b(0);
        }
        if (map == null) {
            m6044b(1);
        }
        if (interfaceC11900a1 == null) {
            m6044b(2);
        }
        this.f31583a = abstractC7264g0;
        this.f31584b = map;
        this.f31585c = interfaceC11900a1;
    }

    /* renamed from: b */
    private static /* synthetic */ void m6044b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<?>> mo6032a() {
        Map<C11638f, AbstractC13301g<?>> map = this.f31584b;
        if (map == null) {
            m6044b(4);
        }
        return map;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: e */
    public C11633c mo6030e() {
        return InterfaceC12149c.C12150a.m6045a(this);
    }

    @Override // p325rg.InterfaceC12149c
    public AbstractC7264g0 getType() {
        AbstractC7264g0 abstractC7264g0 = this.f31583a;
        if (abstractC7264g0 == null) {
            m6044b(3);
        }
        return abstractC7264g0;
    }

    @Override // p325rg.InterfaceC12149c
    /* renamed from: j */
    public InterfaceC11900a1 mo6029j() {
        InterfaceC11900a1 interfaceC11900a1 = this.f31585c;
        if (interfaceC11900a1 == null) {
            m6044b(5);
        }
        return interfaceC11900a1;
    }

    public String toString() {
        return AbstractC12485c.f32441g.mo5058r(this, null);
    }
}