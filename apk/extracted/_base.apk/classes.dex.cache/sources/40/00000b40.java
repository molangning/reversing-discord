package p045cj;

import bj.AbstractC2342h;
import bj.C2335f;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "typeParams", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.o1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2624o1 {
    /* renamed from: a */
    public static final int m32831a(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        int i;
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(typeParams, "typeParams");
        int hashCode = (serialDescriptor.mo12682i().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> m33644a = C2335f.m33644a(serialDescriptor);
        Iterator<SerialDescriptor> it = m33644a.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String mo12682i = it.next().mo12682i();
            if (mo12682i != null) {
                i4 = mo12682i.hashCode();
            }
            i3 = i5 + i4;
        }
        for (SerialDescriptor serialDescriptor2 : m33644a) {
            int i6 = i2 * 31;
            AbstractC2342h mo12684g = serialDescriptor2.mo12684g();
            if (mo12684g != null) {
                i = mo12684g.hashCode();
            } else {
                i = 0;
            }
            i2 = i6 + i;
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}