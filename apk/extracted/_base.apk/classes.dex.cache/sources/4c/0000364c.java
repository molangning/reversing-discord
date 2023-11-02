package p142hi;

import kotlin.jvm.internal.C9612q;
import li.InterfaceC10198g;
import li.InterfaceC10200i;
import li.InterfaceC10202k;
import li.InterfaceC10204m;
import li.InterfaceC10207p;

/* renamed from: hi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7228d {

    /* renamed from: a */
    public static final C7228d f19624a = new C7228d();

    private C7228d() {
    }

    /* renamed from: a */
    private final boolean m21196a(InterfaceC10207p interfaceC10207p, InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2) {
        boolean z;
        boolean z2;
        if (interfaceC10207p.mo3981c0(interfaceC10202k) == interfaceC10207p.mo3981c0(interfaceC10202k2) && interfaceC10207p.mo3941w0(interfaceC10202k) == interfaceC10207p.mo3941w0(interfaceC10202k2)) {
            if (interfaceC10207p.mo3973g0(interfaceC10202k) == null) {
                z = true;
            } else {
                z = false;
            }
            if (interfaceC10207p.mo3973g0(interfaceC10202k2) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2 && interfaceC10207p.mo4019B(interfaceC10207p.mo3974g(interfaceC10202k), interfaceC10207p.mo3974g(interfaceC10202k2))) {
                if (interfaceC10207p.mo3951r0(interfaceC10202k, interfaceC10202k2)) {
                    return true;
                }
                int mo3981c0 = interfaceC10207p.mo3981c0(interfaceC10202k);
                for (int i = 0; i < mo3981c0; i++) {
                    InterfaceC10204m mo3953q0 = interfaceC10207p.mo3953q0(interfaceC10202k, i);
                    InterfaceC10204m mo3953q02 = interfaceC10207p.mo3953q0(interfaceC10202k2, i);
                    if (interfaceC10207p.mo3971h0(mo3953q0) != interfaceC10207p.mo3971h0(mo3953q02)) {
                        return false;
                    }
                    if (!interfaceC10207p.mo3971h0(mo3953q0) && (interfaceC10207p.mo3977e0(mo3953q0) != interfaceC10207p.mo3977e0(mo3953q02) || !m21194c(interfaceC10207p, interfaceC10207p.mo3958o(mo3953q0), interfaceC10207p.mo3958o(mo3953q02)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m21194c(InterfaceC10207p interfaceC10207p, InterfaceC10200i interfaceC10200i, InterfaceC10200i interfaceC10200i2) {
        if (interfaceC10200i == interfaceC10200i2) {
            return true;
        }
        InterfaceC10202k mo3986a = interfaceC10207p.mo3986a(interfaceC10200i);
        InterfaceC10202k mo3986a2 = interfaceC10207p.mo3986a(interfaceC10200i2);
        if (mo3986a != null && mo3986a2 != null) {
            return m21196a(interfaceC10207p, mo3986a, mo3986a2);
        }
        InterfaceC10198g mo4002K = interfaceC10207p.mo4002K(interfaceC10200i);
        InterfaceC10198g mo4002K2 = interfaceC10207p.mo4002K(interfaceC10200i2);
        if (mo4002K == null || mo4002K2 == null) {
            return false;
        }
        if (m21196a(interfaceC10207p, interfaceC10207p.mo3984b(mo4002K), interfaceC10207p.mo3984b(mo4002K2)) && m21196a(interfaceC10207p, interfaceC10207p.mo3982c(mo4002K), interfaceC10207p.mo3982c(mo4002K2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m21195b(InterfaceC10207p context, InterfaceC10200i a, InterfaceC10200i b) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        return m21194c(context, a, b);
    }
}