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

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\u0002)*¨\u0006+"}, m14357d2 = {"Lcj/y0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", ZeroconfModule.KEY_SERVICE_NAME, "c", "", "j", "", "", "f", "h", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKeyDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "getValueDescriptor", "valueDescriptor", "d", "I", "()I", "elementsCount", "Lbj/h;", "g", "()Lbj/h;", "kind", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcj/g0;", "Lcj/q0;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC2657y0 implements SerialDescriptor {

    /* renamed from: a */
    private final String f7143a;

    /* renamed from: b */
    private final SerialDescriptor f7144b;

    /* renamed from: c */
    private final SerialDescriptor f7145c;

    /* renamed from: d */
    private final int f7146d;

    private AbstractC2657y0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f7143a = str;
        this.f7144b = serialDescriptor;
        this.f7145c = serialDescriptor2;
        this.f7146d = 2;
    }

    public /* synthetic */ AbstractC2657y0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo12687d() {
        return this.f7146d;
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
        if (!(obj instanceof AbstractC2657y0)) {
            return false;
        }
        AbstractC2657y0 abstractC2657y0 = (AbstractC2657y0) obj;
        if (C9612q.m13922c(mo12682i(), abstractC2657y0.mo12682i()) && C9612q.m13922c(this.f7144b, abstractC2657y0.f7144b) && C9612q.m13922c(this.f7145c, abstractC2657y0.f7145c)) {
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
        return AbstractC2345i.C2348c.f6457a;
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
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.f7145c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f7144b;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12682i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((mo12682i().hashCode() * 31) + this.f7144b.hashCode()) * 31) + this.f7145c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f7143a;
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
        return mo12682i() + '(' + this.f7144b + ", " + this.f7145c + ')';
    }
}