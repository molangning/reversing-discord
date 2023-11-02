package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, m14357d2 = {"Lcj/c1;", "Lcj/c2;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "e0", "nestedName", "f0", "descriptor", "d0", "parentName", "childName", "c0", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2570c1 extends AbstractC2571c2<String> {
    /* renamed from: c0 */
    protected String m32958c0(String parentName, String childName) {
        boolean z;
        C9612q.m13917h(parentName, "parentName");
        C9612q.m13917h(childName, "childName");
        if (parentName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return parentName + '.' + childName;
        }
        return childName;
    }

    /* renamed from: d0 */
    protected String m32957d0(SerialDescriptor descriptor, int i) {
        C9612q.m13917h(descriptor, "descriptor");
        return descriptor.mo12686e(i);
    }

    @Override // p045cj.AbstractC2571c2
    /* renamed from: e0 */
    public final String mo32938Z(SerialDescriptor serialDescriptor, int i) {
        C9612q.m13917h(serialDescriptor, "<this>");
        return m32955f0(m32957d0(serialDescriptor, i));
    }

    /* renamed from: f0 */
    protected final String m32955f0(String nestedName) {
        C9612q.m13917h(nestedName, "nestedName");
        String m32939Y = m32939Y();
        if (m32939Y == null) {
            m32939Y = "";
        }
        return m32958c0(m32939Y, nestedName);
    }
}