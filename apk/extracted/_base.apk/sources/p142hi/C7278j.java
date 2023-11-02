package p142hi;

import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import p325rg.C12160i;
import p325rg.InterfaceC12155g;

/* renamed from: hi.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7278j extends AbstractC7218a1<C7278j> {

    /* renamed from: a */
    private final InterfaceC12155g f19705a;

    public C7278j(InterfaceC12155g annotations) {
        C9612q.m13917h(annotations, "annotations");
        this.f19705a = annotations;
    }

    @Override // p142hi.AbstractC7218a1
    /* renamed from: b */
    public KClass<? extends C7278j> mo21078b() {
        return C9591f0.m13969b(C7278j.class);
    }

    @Override // p142hi.AbstractC7218a1
    /* renamed from: d */
    public C7278j mo21079a(C7278j c7278j) {
        return c7278j == null ? this : new C7278j(C12160i.m6033a(this.f19705a, c7278j.f19705a));
    }

    /* renamed from: e */
    public final InterfaceC12155g m21075e() {
        return this.f19705a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7278j)) {
            return false;
        }
        return C9612q.m13922c(((C7278j) obj).f19705a, this.f19705a);
    }

    @Override // p142hi.AbstractC7218a1
    /* renamed from: f */
    public C7278j mo21077c(C7278j c7278j) {
        if (C9612q.m13922c(c7278j, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f19705a.hashCode();
    }
}
