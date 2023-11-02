package p407wg;

import gh.InterfaceC6763b0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;
import ph.C11638f;

/* renamed from: wg.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13544b0 extends AbstractC13571p implements InterfaceC6763b0 {

    /* renamed from: a */
    private final AbstractC13581z f34918a;

    /* renamed from: b */
    private final Annotation[] f34919b;

    /* renamed from: c */
    private final String f34920c;

    /* renamed from: d */
    private final boolean f34921d;

    public C13544b0(AbstractC13581z type, Annotation[] reflectAnnotations, String str, boolean z) {
        C9612q.m13917h(type, "type");
        C9612q.m13917h(reflectAnnotations, "reflectAnnotations");
        this.f34918a = type;
        this.f34919b = reflectAnnotations;
        this.f34920c = str;
        this.f34921d = z;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return false;
    }

    @Override // gh.InterfaceC6763b0
    /* renamed from: P */
    public AbstractC13581z getType() {
        return this.f34918a;
    }

    @Override // gh.InterfaceC6763b0
    /* renamed from: a */
    public boolean mo2255a() {
        return this.f34921d;
    }

    @Override // gh.InterfaceC6763b0
    public C11638f getName() {
        String str = this.f34920c;
        if (str != null) {
            return C11638f.m7423e(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C13544b0.class.getName());
        sb2.append(": ");
        sb2.append(mo2255a() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: b */
    public C13551e mo2159b(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        return C13556i.m2227a(this.f34919b, fqName);
    }

    @Override // gh.InterfaceC6766d
    public List<C13551e> getAnnotations() {
        return C13556i.m2226b(this.f34919b);
    }
}
