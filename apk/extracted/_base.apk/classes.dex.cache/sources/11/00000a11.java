package bj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010%R\u0014\u0010*\u001a\u00020'8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m14357d2 = {"Lbj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "", "f", "h", "", ZeroconfModule.KEY_SERVICE_NAME, "c", "e", "", "j", "", "other", "equals", "hashCode", "toString", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "getAnnotations", "()Ljava/util/List;", "annotations", "d", "()I", "elementsCount", "isInline", "()Z", "isNullable", "Lbj/h;", "g", "()Lbj/h;", "kind", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: bj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C2321c implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f6432a;

    /* renamed from: b */
    public final KClass<?> f6433b;

    /* renamed from: c */
    private final String f6434c;

    public C2321c(SerialDescriptor original, KClass<?> kClass) {
        C9612q.m13917h(original, "original");
        C9612q.m13917h(kClass, "kClass");
        this.f6432a = original;
        this.f6433b = kClass;
        this.f6434c = original.mo12682i() + '<' + kClass.mo13883l() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12689b() {
        return this.f6432a.mo12689b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12688c(String name) {
        C9612q.m13917h(name, "name");
        return this.f6432a.mo12688c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo12687d() {
        return this.f6432a.mo12687d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo12686e(int i) {
        return this.f6432a.mo12686e(i);
    }

    public boolean equals(Object obj) {
        C2321c c2321c;
        if (obj instanceof C2321c) {
            c2321c = (C2321c) obj;
        } else {
            c2321c = null;
        }
        if (c2321c == null || !C9612q.m13922c(this.f6432a, c2321c.f6432a) || !C9612q.m13922c(c2321c.f6433b, this.f6433b)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo12685f(int i) {
        return this.f6432a.mo12685f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC2342h mo12684g() {
        return this.f6432a.mo12684g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.f6432a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo12683h(int i) {
        return this.f6432a.mo12683h(i);
    }

    public int hashCode() {
        return (this.f6433b.hashCode() * 31) + mo12682i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo12682i() {
        return this.f6434c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f6432a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo12681j(int i) {
        return this.f6432a.mo12681j(i);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f6433b + ", original: " + this.f6432a + ')';
    }
}