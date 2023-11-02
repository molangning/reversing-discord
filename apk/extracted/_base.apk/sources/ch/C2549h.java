package ch;

import gh.InterfaceC6788y;
import gh.InterfaceC6789z;
import gi.InterfaceC6814h;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p069dh.C5907n;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11947m;
import p327ri.C12242a;

/* renamed from: ch.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2549h implements InterfaceC2553k {

    /* renamed from: a */
    private final C2548g f6986a;

    /* renamed from: b */
    private final InterfaceC11947m f6987b;

    /* renamed from: c */
    private final int f6988c;

    /* renamed from: d */
    private final Map<InterfaceC6788y, Integer> f6989d;

    /* renamed from: e */
    private final InterfaceC6814h<InterfaceC6788y, C5907n> f6990e;

    /* renamed from: ch.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C2550a extends AbstractC9614s implements Function1<InterfaceC6788y, C5907n> {
        C2550a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C5907n invoke(InterfaceC6788y typeParameter) {
            C9612q.m13917h(typeParameter, "typeParameter");
            Integer num = (Integer) C2549h.this.f6989d.get(typeParameter);
            if (num != null) {
                C2549h c2549h = C2549h.this;
                return new C5907n(C2537a.m33053h(C2537a.m33060a(c2549h.f6986a, c2549h), c2549h.f6987b.getAnnotations()), typeParameter, c2549h.f6988c + num.intValue(), c2549h.f6987b);
            }
            return null;
        }
    }

    public C2549h(C2548g c, InterfaceC11947m containingDeclaration, InterfaceC6789z typeParameterOwner, int i) {
        C9612q.m13917h(c, "c");
        C9612q.m13917h(containingDeclaration, "containingDeclaration");
        C9612q.m13917h(typeParameterOwner, "typeParameterOwner");
        this.f6986a = c;
        this.f6987b = containingDeclaration;
        this.f6988c = i;
        this.f6989d = C12242a.m5672d(typeParameterOwner.getTypeParameters());
        this.f6990e = c.m33010e().mo21863g(new C2550a());
    }

    @Override // ch.InterfaceC2553k
    /* renamed from: a */
    public InterfaceC11920f1 mo32999a(InterfaceC6788y javaTypeParameter) {
        C9612q.m13917h(javaTypeParameter, "javaTypeParameter");
        C5907n invoke = this.f6990e.invoke(javaTypeParameter);
        if (invoke == null) {
            return this.f6986a.m33009f().mo32999a(javaTypeParameter);
        }
        return invoke;
    }
}
