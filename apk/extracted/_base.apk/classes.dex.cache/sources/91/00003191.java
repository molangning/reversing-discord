package dj;

import bj.AbstractC2322d;
import bj.AbstractC2325e;
import bj.AbstractC2342h;
import bj.AbstractC2345i;
import bj.C2320b;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import p088ej.AbstractC6257c;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\b"}, m14357d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "Ldj/t0;", "b", "Lej/c;", "module", "a", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6021u0 {
    /* renamed from: a */
    public static final SerialDescriptor m23862a(SerialDescriptor serialDescriptor, AbstractC6257c module) {
        SerialDescriptor m23862a;
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(module, "module");
        if (C9612q.m13922c(serialDescriptor.mo12684g(), AbstractC2342h.C2343a.f6453a)) {
            SerialDescriptor m33646b = C2320b.m33646b(module, serialDescriptor);
            if (m33646b != null && (m23862a = m23862a(m33646b, module)) != null) {
                return m23862a;
            }
            return serialDescriptor;
        } else if (serialDescriptor.isInline()) {
            return m23862a(serialDescriptor.mo12683h(0), module);
        } else {
            return serialDescriptor;
        }
    }

    /* renamed from: b */
    public static final EnumC6018t0 m23861b(Json json, SerialDescriptor desc) {
        C9612q.m13917h(json, "<this>");
        C9612q.m13917h(desc, "desc");
        AbstractC2342h mo12684g = desc.mo12684g();
        if (mo12684g instanceof AbstractC2322d) {
            return EnumC6018t0.POLY_OBJ;
        }
        if (C9612q.m13922c(mo12684g, AbstractC2345i.C2347b.f6456a)) {
            return EnumC6018t0.LIST;
        }
        if (C9612q.m13922c(mo12684g, AbstractC2345i.C2348c.f6457a)) {
            SerialDescriptor m23862a = m23862a(desc.mo12683h(0), json.mo265a());
            AbstractC2342h mo12684g2 = m23862a.mo12684g();
            if (!(mo12684g2 instanceof AbstractC2325e) && !C9612q.m13922c(mo12684g2, AbstractC2342h.C2344b.f6454a)) {
                if (json.m12780e().m12756b()) {
                    return EnumC6018t0.LIST;
                }
                throw C5973a0.m24015c(m23862a);
            }
            return EnumC6018t0.MAP;
        }
        return EnumC6018t0.OBJ;
    }
}