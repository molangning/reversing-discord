package dj;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.C9964g;
import p014aj.C0213a;
import pf.C11549b0;
import pf.C11555d0;
import pf.C11563g0;
import pf.C11593z;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\t¨\u0006\f"}, m14357d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Ljava/util/Set;", "getUnsignedNumberDescriptors$annotations", "()V", "unsignedNumberDescriptors", "", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6010p0 {

    /* renamed from: a */
    private static final Set<SerialDescriptor> f17078a;

    static {
        Set<SerialDescriptor> m14002i;
        m14002i = C9560w.m14002i(C0213a.m40943H(C11549b0.f30055k).getDescriptor(), C0213a.m40942I(C11555d0.f30064k).getDescriptor(), C0213a.m40944G(C11593z.f30104k).getDescriptor(), C0213a.m40941J(C11563g0.f30070k).getDescriptor());
        f17078a = m14002i;
    }

    /* renamed from: a */
    public static final boolean m23895a(SerialDescriptor serialDescriptor) {
        C9612q.m13917h(serialDescriptor, "<this>");
        if (serialDescriptor.isInline() && C9612q.m13922c(serialDescriptor, C9964g.m12725o())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m23894b(SerialDescriptor serialDescriptor) {
        C9612q.m13917h(serialDescriptor, "<this>");
        if (serialDescriptor.isInline() && f17078a.contains(serialDescriptor)) {
            return true;
        }
        return false;
    }
}