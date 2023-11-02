package p142hi;

import java.util.HashSet;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10200i;
import li.InterfaceC10202k;
import li.InterfaceC10205n;
import li.InterfaceC10206o;

/* renamed from: hi.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7344z {
    /* renamed from: a */
    public static final InterfaceC10200i m20904a(InterfaceC7314q1 interfaceC7314q1, InterfaceC10200i inlineClassType) {
        C9612q.m13917h(interfaceC7314q1, "<this>");
        C9612q.m13917h(inlineClassType, "inlineClassType");
        return m20903b(interfaceC7314q1, inlineClassType, new HashSet());
    }

    /* renamed from: b */
    private static final InterfaceC10200i m20903b(InterfaceC7314q1 interfaceC7314q1, InterfaceC10200i interfaceC10200i, HashSet<InterfaceC10205n> hashSet) {
        InterfaceC10200i m20903b;
        boolean z;
        InterfaceC10200i mo3949s0;
        InterfaceC10205n mo3950s = interfaceC7314q1.mo3950s(interfaceC10200i);
        if (!hashSet.add(mo3950s)) {
            return null;
        }
        InterfaceC10206o mo4014D0 = interfaceC7314q1.mo4014D0(mo3950s);
        if (mo4014D0 != null) {
            InterfaceC10200i mo3997P = interfaceC7314q1.mo3997P(mo4014D0);
            m20903b = m20903b(interfaceC7314q1, mo3997P, hashSet);
            if (m20903b == null) {
                return null;
            }
            if (!interfaceC7314q1.mo3960n(interfaceC7314q1.mo3950s(mo3997P)) && (!(mo3997P instanceof InterfaceC10202k) || !interfaceC7314q1.mo3938y((InterfaceC10202k) mo3997P))) {
                z = false;
            } else {
                z = true;
            }
            if ((m20903b instanceof InterfaceC10202k) && interfaceC7314q1.mo3938y((InterfaceC10202k) m20903b) && interfaceC7314q1.mo3942w(interfaceC10200i) && z) {
                mo3949s0 = interfaceC7314q1.mo3949s0(mo3997P);
            } else if (!interfaceC7314q1.mo3942w(m20903b) && interfaceC7314q1.mo3946u(interfaceC10200i)) {
                mo3949s0 = interfaceC7314q1.mo3949s0(m20903b);
            }
            return mo3949s0;
        } else if (interfaceC7314q1.mo3960n(mo3950s)) {
            InterfaceC10200i mo4003J = interfaceC7314q1.mo4003J(interfaceC10200i);
            if (mo4003J == null || (m20903b = m20903b(interfaceC7314q1, mo4003J, hashSet)) == null) {
                return null;
            }
            if (interfaceC7314q1.mo3942w(interfaceC10200i)) {
                if (!interfaceC7314q1.mo3942w(m20903b)) {
                    if (!(m20903b instanceof InterfaceC10202k) || !interfaceC7314q1.mo3938y((InterfaceC10202k) m20903b)) {
                        return interfaceC7314q1.mo3949s0(m20903b);
                    }
                    return interfaceC10200i;
                }
                return interfaceC10200i;
            }
        } else {
            return interfaceC10200i;
        }
        return m20903b;
    }
}
