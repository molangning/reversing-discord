package p045cj;

import bj.AbstractC2342h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\u0018\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\r8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010)¨\u00061"}, m14357d2 = {"Lcj/w1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lcj/l;", "", "index", "", "", "f", "h", "", ZeroconfModule.KEY_SERVICE_NAME, "c", "e", "", "j", "", "other", "equals", "toString", "hashCode", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "k", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "getAnnotations", "()Ljava/util/List;", "annotations", "d", "()I", "elementsCount", "isInline", "()Z", "Lbj/h;", "g", "()Lbj/h;", "kind", "isNullable", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.w1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2650w1 implements SerialDescriptor, InterfaceC2610l {

    /* renamed from: a */
    private final SerialDescriptor f7131a;

    /* renamed from: b */
    private final String f7132b;

    /* renamed from: c */
    private final Set<String> f7133c;

    public C2650w1(SerialDescriptor original) {
        C9612q.m13917h(original, "original");
        this.f7131a = original;
        this.f7132b = original.mo12682i() + '?';
        this.f7133c = C2616m1.m32848a(original);
    }

    @Override // p045cj.InterfaceC2610l
    /* renamed from: a */
    public Set<String> mo12858a() {
        return this.f7133c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12689b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12688c(String name) {
        C9612q.m13917h(name, "name");
        return this.f7131a.mo12688c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo12687d() {
        return this.f7131a.mo12687d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo12686e(int i) {
        return this.f7131a.mo12686e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2650w1) && C9612q.m13922c(this.f7131a, ((C2650w1) obj).f7131a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo12685f(int i) {
        return this.f7131a.mo12685f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC2342h mo12684g() {
        return this.f7131a.mo12684g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.f7131a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        return this.f7131a.mo12683h(i);
    }

    public int hashCode() {
        return this.f7131a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f7132b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f7131a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo12681j(int i) {
        return this.f7131a.mo12681j(i);
    }

    /* renamed from: k */
    public final SerialDescriptor m32780k() {
        return this.f7131a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7131a);
        sb2.append('?');
        return sb2.toString();
    }
}