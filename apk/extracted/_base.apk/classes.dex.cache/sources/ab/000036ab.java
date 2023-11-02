package p142hi;

import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p161ii.AbstractC7592g;

/* renamed from: hi.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7323t0 extends AbstractC7291l1 {

    /* renamed from: a */
    private final AbstractC7264g0 f19761a;

    public C7323t0(AbstractC10870h kotlinBuiltIns) {
        C9612q.m13917h(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC7302o0 m9842I = kotlinBuiltIns.m9842I();
        C9612q.m13918g(m9842I, "kotlinBuiltIns.nullableAnyType");
        this.f19761a = m9842I;
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: a */
    public boolean mo20955a() {
        return true;
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: b */
    public EnumC7336w1 mo20954b() {
        return EnumC7336w1.OUT_VARIANCE;
    }

    @Override // p142hi.InterfaceC7288k1
    public AbstractC7264g0 getType() {
        return this.f19761a;
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: o */
    public InterfaceC7288k1 mo20951o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}