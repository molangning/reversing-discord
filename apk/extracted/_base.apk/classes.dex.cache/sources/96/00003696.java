package p142hi;

import java.util.Iterator;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9650l;
import li.InterfaceC10202k;
import li.InterfaceC10203l;
import p325rg.InterfaceC12149c;
import sh.AbstractC12485c;

/* renamed from: hi.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7302o0 extends AbstractC7333v1 implements InterfaceC10202k, InterfaceC10203l {
    public AbstractC7302o0() {
        super(null);
    }

    /* renamed from: U0 */
    public abstract AbstractC7302o0 mo3558U0(boolean z);

    /* renamed from: V0 */
    public abstract AbstractC7302o0 mo3557V0(C7226c1 c7226c1);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<InterfaceC12149c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            C9650l.m13772j(sb2, "[", AbstractC12485c.m5188s(AbstractC12485c.f32444j, it.next(), null, 2, null), "] ");
        }
        sb2.append(mo3564N0());
        if (!mo3566L0().isEmpty()) {
            C9553r.m14048b0(mo3566L0(), sb2, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo3563O0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}