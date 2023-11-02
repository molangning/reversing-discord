package p142hi;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10195d;
import li.InterfaceC10200i;
import li.InterfaceC10202k;
import li.InterfaceC10205n;
import li.InterfaceC10207p;
import p142hi.C7244f1;

/* renamed from: hi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7224c {

    /* renamed from: a */
    public static final C7224c f19619a = new C7224c();

    private C7224c() {
    }

    /* renamed from: c */
    private final boolean m21210c(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10205n interfaceC10205n) {
        InterfaceC10207p m21139j = c7244f1.m21139j();
        if (m21139j.mo4020A0(interfaceC10202k)) {
            return true;
        }
        if (m21139j.mo3941w0(interfaceC10202k)) {
            return false;
        }
        if (c7244f1.m21135n() && m21139j.mo4000M(interfaceC10202k)) {
            return true;
        }
        return m21139j.mo4019B(m21139j.mo3974g(interfaceC10202k), interfaceC10205n);
    }

    /* renamed from: e */
    private final boolean m21208e(C7244f1 c7244f1, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2) {
        InterfaceC10207p m21139j = c7244f1.m21139j();
        if (C7235f.f19633b) {
            if (!m21139j.mo3978e(interfaceC10202k) && !m21139j.mo4005I(m21139j.mo3974g(interfaceC10202k))) {
                c7244f1.m21137l(interfaceC10202k);
            }
            if (!m21139j.mo3978e(interfaceC10202k2)) {
                c7244f1.m21137l(interfaceC10202k2);
            }
        }
        if (m21139j.mo3941w0(interfaceC10202k2) || m21139j.mo3994S(interfaceC10202k) || m21139j.mo3939x0(interfaceC10202k)) {
            return true;
        }
        if ((interfaceC10202k instanceof InterfaceC10195d) && m21139j.mo4012E0((InterfaceC10195d) interfaceC10202k)) {
            return true;
        }
        C7224c c7224c = f19619a;
        if (c7224c.m21212a(c7244f1, interfaceC10202k, C7244f1.AbstractC7248c.C7250b.f19666a)) {
            return true;
        }
        if (m21139j.mo3994S(interfaceC10202k2) || c7224c.m21212a(c7244f1, interfaceC10202k2, C7244f1.AbstractC7248c.C7252d.f19668a) || m21139j.mo3983b0(interfaceC10202k)) {
            return false;
        }
        return c7224c.m21211b(c7244f1, interfaceC10202k, m21139j.mo3974g(interfaceC10202k2));
    }

    /* renamed from: a */
    public final boolean m21212a(C7244f1 c7244f1, InterfaceC10202k type, C7244f1.AbstractC7248c supertypesPolicy) {
        boolean z;
        String m14046d0;
        C7244f1.AbstractC7248c abstractC7248c;
        boolean z2;
        C9612q.m13917h(c7244f1, "<this>");
        C9612q.m13917h(type, "type");
        C9612q.m13917h(supertypesPolicy, "supertypesPolicy");
        InterfaceC10207p m21139j = c7244f1.m21139j();
        if ((m21139j.mo3983b0(type) && !m21139j.mo3941w0(type)) || m21139j.mo3994S(type)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c7244f1.m21138k();
            ArrayDeque<InterfaceC10202k> m21141h = c7244f1.m21141h();
            C9612q.m13920e(m21141h);
            Set<InterfaceC10202k> m21140i = c7244f1.m21140i();
            C9612q.m13920e(m21140i);
            m21141h.push(type);
            while (!m21141h.isEmpty()) {
                if (m21140i.size() <= 1000) {
                    InterfaceC10202k current = m21141h.pop();
                    C9612q.m13918g(current, "current");
                    if (m21140i.add(current)) {
                        if (m21139j.mo3941w0(current)) {
                            abstractC7248c = C7244f1.AbstractC7248c.C7251c.f19667a;
                        } else {
                            abstractC7248c = supertypesPolicy;
                        }
                        if (!(!C9612q.m13922c(abstractC7248c, C7244f1.AbstractC7248c.C7251c.f19667a))) {
                            abstractC7248c = null;
                        }
                        if (abstractC7248c == null) {
                            continue;
                        } else {
                            InterfaceC10207p m21139j2 = c7244f1.m21139j();
                            for (InterfaceC10200i interfaceC10200i : m21139j2.mo4007H(m21139j2.mo3974g(current))) {
                                InterfaceC10202k mo20291a = abstractC7248c.mo20291a(c7244f1, interfaceC10200i);
                                if ((m21139j.mo3983b0(mo20291a) && !m21139j.mo3941w0(mo20291a)) || m21139j.mo3994S(mo20291a)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    c7244f1.m21143e();
                                } else {
                                    m21141h.add(mo20291a);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(type);
                    sb2.append(". Supertypes = ");
                    m14046d0 = C9553r.m14046d0(m21140i, null, null, null, 0, null, null, 63, null);
                    sb2.append(m14046d0);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            c7244f1.m21143e();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m21211b(C7244f1 state, InterfaceC10202k start, InterfaceC10205n end) {
        String m14046d0;
        C7244f1.AbstractC7248c abstractC7248c;
        C9612q.m13917h(state, "state");
        C9612q.m13917h(start, "start");
        C9612q.m13917h(end, "end");
        InterfaceC10207p m21139j = state.m21139j();
        if (f19619a.m21210c(state, start, end)) {
            return true;
        }
        state.m21138k();
        ArrayDeque<InterfaceC10202k> m21141h = state.m21141h();
        C9612q.m13920e(m21141h);
        Set<InterfaceC10202k> m21140i = state.m21140i();
        C9612q.m13920e(m21140i);
        m21141h.push(start);
        while (!m21141h.isEmpty()) {
            if (m21140i.size() <= 1000) {
                InterfaceC10202k current = m21141h.pop();
                C9612q.m13918g(current, "current");
                if (m21140i.add(current)) {
                    if (m21139j.mo3941w0(current)) {
                        abstractC7248c = C7244f1.AbstractC7248c.C7251c.f19667a;
                    } else {
                        abstractC7248c = C7244f1.AbstractC7248c.C7250b.f19666a;
                    }
                    if (!(!C9612q.m13922c(abstractC7248c, C7244f1.AbstractC7248c.C7251c.f19667a))) {
                        abstractC7248c = null;
                    }
                    if (abstractC7248c == null) {
                        continue;
                    } else {
                        InterfaceC10207p m21139j2 = state.m21139j();
                        for (InterfaceC10200i interfaceC10200i : m21139j2.mo4007H(m21139j2.mo3974g(current))) {
                            InterfaceC10202k mo20291a = abstractC7248c.mo20291a(state, interfaceC10200i);
                            if (f19619a.m21210c(state, mo20291a, end)) {
                                state.m21143e();
                                return true;
                            }
                            m21141h.add(mo20291a);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(start);
                sb2.append(". Supertypes = ");
                m14046d0 = C9553r.m14046d0(m21140i, null, null, null, 0, null, null, 63, null);
                sb2.append(m14046d0);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        state.m21143e();
        return false;
    }

    /* renamed from: d */
    public final boolean m21209d(C7244f1 state, InterfaceC10202k subType, InterfaceC10202k superType) {
        C9612q.m13917h(state, "state");
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        return m21208e(state, subType, superType);
    }
}
