package kg;

import kotlin.jvm.internal.AbstractC9582b0;
import kotlin.jvm.internal.AbstractC9587e;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.AbstractC9617v;
import kotlin.jvm.internal.AbstractC9621z;
import kotlin.jvm.internal.C9593g0;
import kotlin.jvm.internal.C9605m;
import kotlin.jvm.internal.InterfaceC9603l;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import p140hg.InterfaceC7133e;
import p140hg.InterfaceC7137g;
import p140hg.InterfaceC7139h;
import p181jg.C8940d;

/* renamed from: kg.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9281k0 extends C9593g0 {
    /* renamed from: i */
    private static AbstractC9327p m15950i(AbstractC9587e abstractC9587e) {
        KDeclarationContainer owner = abstractC9587e.getOwner();
        if (owner instanceof AbstractC9327p) {
            return (AbstractC9327p) owner;
        }
        return C9257h.f24325m;
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: a */
    public KFunction mo13961a(C9605m c9605m) {
        return new C9338q(m15950i(c9605m), c9605m.getName(), c9605m.getSignature(), c9605m.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: b */
    public KClass mo13960b(Class cls) {
        return C9225c.m16030a(cls);
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: c */
    public KDeclarationContainer mo13959c(Class cls, String str) {
        return C9225c.m16029b(cls);
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: d */
    public InterfaceC7133e mo13958d(AbstractC9617v abstractC9617v) {
        return new C9346s(m15950i(abstractC9617v), abstractC9617v.getName(), abstractC9617v.getSignature(), abstractC9617v.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: e */
    public InterfaceC7137g mo13957e(AbstractC9621z abstractC9621z) {
        return new C9364x(m15950i(abstractC9621z), abstractC9621z.getName(), abstractC9621z.getSignature(), abstractC9621z.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: f */
    public InterfaceC7139h mo13956f(AbstractC9582b0 abstractC9582b0) {
        return new C9368y(m15950i(abstractC9582b0), abstractC9582b0.getName(), abstractC9582b0.getSignature(), abstractC9582b0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: g */
    public String mo13955g(InterfaceC9603l interfaceC9603l) {
        C9338q m15857c;
        KFunction m17017a = C8940d.m17017a(interfaceC9603l);
        if (m17017a != null && (m15857c = C9336p0.m15857c(m17017a)) != null) {
            return C9292l0.f24366a.m15933e(m15857c.mo15826x());
        }
        return super.mo13955g(interfaceC9603l);
    }

    @Override // kotlin.jvm.internal.C9593g0
    /* renamed from: h */
    public String mo13954h(AbstractC9614s abstractC9614s) {
        return mo13955g(abstractC9614s);
    }
}
