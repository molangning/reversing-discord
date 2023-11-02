package bi;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11914e;

/* renamed from: bi.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C2313e implements InterfaceC2315g, InterfaceC2317i {

    /* renamed from: a */
    private final InterfaceC11914e f6422a;

    /* renamed from: b */
    private final C2313e f6423b;

    /* renamed from: c */
    private final InterfaceC11914e f6424c;

    public C2313e(InterfaceC11914e classDescriptor, C2313e c2313e) {
        C9612q.m13917h(classDescriptor, "classDescriptor");
        this.f6422a = classDescriptor;
        this.f6423b = c2313e == null ? this : c2313e;
        this.f6424c = classDescriptor;
    }

    @Override // bi.InterfaceC2315g
    /* renamed from: c */
    public AbstractC7302o0 getType() {
        AbstractC7302o0 mo4224p = this.f6422a.mo4224p();
        C9612q.m13918g(mo4224p, "classDescriptor.defaultType");
        return mo4224p;
    }

    public boolean equals(Object obj) {
        InterfaceC11914e interfaceC11914e = this.f6422a;
        C2313e c2313e = obj instanceof C2313e ? (C2313e) obj : null;
        return C9612q.m13922c(interfaceC11914e, c2313e != null ? c2313e.f6422a : null);
    }

    public int hashCode() {
        return this.f6422a.hashCode();
    }

    @Override // bi.InterfaceC2317i
    /* renamed from: s */
    public final InterfaceC11914e mo33657s() {
        return this.f6422a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
