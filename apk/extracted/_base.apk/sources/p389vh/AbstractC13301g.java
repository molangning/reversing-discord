package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC13301g<T> {

    /* renamed from: a */
    private final T f34378a;

    public AbstractC13301g(T t) {
        this.f34378a = t;
    }

    /* renamed from: a */
    public abstract AbstractC7264g0 mo2775a(InterfaceC11928h0 interfaceC11928h0);

    /* renamed from: b */
    public T mo2813b() {
        return this.f34378a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T mo2813b = mo2813b();
            AbstractC13301g abstractC13301g = obj instanceof AbstractC13301g ? (AbstractC13301g) obj : null;
            if (!C9612q.m13922c(mo2813b, abstractC13301g != null ? abstractC13301g.mo2813b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T mo2813b = mo2813b();
        if (mo2813b != null) {
            return mo2813b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo2813b());
    }
}
