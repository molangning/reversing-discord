package p120gc;

import java.util.Iterator;
import java.util.Set;
import p247nb.C10533d;
import p247nb.C10558q;
import p247nb.InterfaceC10538e;
import p247nb.InterfaceC10544h;

/* renamed from: gc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6720c implements InterfaceC6727i {

    /* renamed from: a */
    private final String f18934a;

    /* renamed from: b */
    private final C6721d f18935b;

    C6720c(Set<AbstractC6723f> set, C6721d c6721d) {
        this.f18934a = m22039e(set);
        this.f18935b = c6721d;
    }

    /* renamed from: c */
    public static C10533d<InterfaceC6727i> m22041c() {
        return C10533d.m11308c(InterfaceC6727i.class).m11293b(C10558q.m11232k(AbstractC6723f.class)).m11290e(new InterfaceC10544h() { // from class: gc.b
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                InterfaceC6727i m22040d;
                m22040d = C6720c.m22040d(interfaceC10538e);
                return m22040d;
            }
        }).m11291d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC6727i m22040d(InterfaceC10538e interfaceC10538e) {
        return new C6720c(interfaceC10538e.mo11276c(AbstractC6723f.class), C6721d.m22038a());
    }

    /* renamed from: e */
    private static String m22039e(Set<AbstractC6723f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC6723f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC6723f next = it.next();
            sb2.append(next.mo22034b());
            sb2.append('/');
            sb2.append(next.mo22033c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p120gc.InterfaceC6727i
    /* renamed from: a */
    public String mo22028a() {
        if (this.f18935b.m22037b().isEmpty()) {
            return this.f18934a;
        }
        return this.f18934a + ' ' + m22039e(this.f18935b.m22037b());
    }
}
