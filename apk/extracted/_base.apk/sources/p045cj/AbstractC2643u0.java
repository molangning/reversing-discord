package p045cj;

import bj.AbstractC2342h;
import bj.AbstractC2345i;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9652n;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0005#$%&'¨\u0006("}, m14357d2 = {"Lcj/u0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", ZeroconfModule.KEY_SERVICE_NAME, "c", "", "j", "", "", "f", "h", "", "other", "equals", "hashCode", "toString", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "b", "I", "d", "()I", "elementsCount", "Lbj/h;", "g", "()Lbj/h;", "kind", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcj/d;", "Lcj/e;", "Lcj/i0;", "Lcj/s0;", "Lcj/r1;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2643u0 implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f7118a;

    /* renamed from: b */
    private final int f7119b;

    private AbstractC2643u0(SerialDescriptor serialDescriptor) {
        this.f7118a = serialDescriptor;
        this.f7119b = 1;
    }

    public /* synthetic */ AbstractC2643u0(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12689b() {
        return SerialDescriptor.C9927a.m12938c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12688c(String name) {
        Integer m13769m;
        C9612q.m13917h(name, "name");
        m13769m = C9652n.m13769m(name);
        if (m13769m != null) {
            return m13769m.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo12687d() {
        return this.f7119b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo12686e(int i) {
        return String.valueOf(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2643u0)) {
            return false;
        }
        AbstractC2643u0 abstractC2643u0 = (AbstractC2643u0) obj;
        if (C9612q.m13922c(this.f7118a, abstractC2643u0.f7118a) && C9612q.m13922c(mo12682i(), abstractC2643u0.mo12682i())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo12685f(int i) {
        boolean z;
        List<Annotation> m14104i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12682i() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC2342h mo12684g() {
        return AbstractC2345i.C2347b.f6456a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C9927a.m12940a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f7118a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12682i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f7118a.hashCode() * 31) + mo12682i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C9927a.m12939b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo12681j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12682i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return mo12682i() + '(' + this.f7118a + ')';
    }
}
