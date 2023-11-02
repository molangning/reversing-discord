package p045cj;

import bj.AbstractC2325e;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m14357d2 = {"Lcj/t1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "", "index", "", "e", ZeroconfModule.KEY_SERVICE_NAME, "c", "", "j", "h", "", "", "f", "toString", "", "other", "equals", "hashCode", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Lbj/e;", "b", "Lbj/e;", "k", "()Lbj/e;", "kind", "d", "()I", "elementsCount", "<init>", "(Ljava/lang/String;Lbj/e;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.t1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2641t1 implements SerialDescriptor {

    /* renamed from: a */
    private final String f7114a;

    /* renamed from: b */
    private final AbstractC2325e f7115b;

    public C2641t1(String serialName, AbstractC2325e kind) {
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(kind, "kind");
        this.f7114a = serialName;
        this.f7115b = kind;
    }

    /* renamed from: a */
    private final Void m32807a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12689b() {
        return SerialDescriptor.C9927a.m12938c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12688c(String name) {
        C9612q.m13917h(name, "name");
        m32807a();
        throw new C11568i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo12687d() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo12686e(int i) {
        m32807a();
        throw new C11568i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2641t1)) {
            return false;
        }
        C2641t1 c2641t1 = (C2641t1) obj;
        if (C9612q.m13922c(mo12682i(), c2641t1.mo12682i()) && C9612q.m13922c(mo12684g(), c2641t1.mo12684g())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo12685f(int i) {
        m32807a();
        throw new C11568i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C9927a.m12940a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        m32807a();
        throw new C11568i();
    }

    public int hashCode() {
        return mo12682i().hashCode() + (mo12684g().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f7114a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C9927a.m12939b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo12681j(int i) {
        m32807a();
        throw new C11568i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public AbstractC2325e mo12684g() {
        return this.f7115b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo12682i() + ')';
    }
}
