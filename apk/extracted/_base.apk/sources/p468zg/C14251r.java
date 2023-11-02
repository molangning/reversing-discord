package p468zg;

import java.util.Collection;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p141hh.C7169i;
import p141hh.EnumC7168h;

/* renamed from: zg.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14251r {

    /* renamed from: a */
    private final C7169i f36642a;

    /* renamed from: b */
    private final Collection<EnumC14207b> f36643b;

    /* renamed from: c */
    private final boolean f36644c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14251r(C7169i nullabilityQualifier, Collection<? extends EnumC14207b> qualifierApplicabilityTypes, boolean z) {
        C9612q.m13917h(nullabilityQualifier, "nullabilityQualifier");
        C9612q.m13917h(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f36642a = nullabilityQualifier;
        this.f36643b = qualifierApplicabilityTypes;
        this.f36644c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C14251r m320b(C14251r c14251r, C7169i c7169i, Collection collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c7169i = c14251r.f36642a;
        }
        if ((i & 2) != 0) {
            collection = c14251r.f36643b;
        }
        if ((i & 4) != 0) {
            z = c14251r.f36644c;
        }
        return c14251r.m321a(c7169i, collection, z);
    }

    /* renamed from: a */
    public final C14251r m321a(C7169i nullabilityQualifier, Collection<? extends EnumC14207b> qualifierApplicabilityTypes, boolean z) {
        C9612q.m13917h(nullabilityQualifier, "nullabilityQualifier");
        C9612q.m13917h(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new C14251r(nullabilityQualifier, qualifierApplicabilityTypes, z);
    }

    /* renamed from: c */
    public final boolean m319c() {
        return this.f36644c;
    }

    /* renamed from: d */
    public final C7169i m318d() {
        return this.f36642a;
    }

    /* renamed from: e */
    public final Collection<EnumC14207b> m317e() {
        return this.f36643b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14251r) {
            C14251r c14251r = (C14251r) obj;
            return C9612q.m13922c(this.f36642a, c14251r.f36642a) && C9612q.m13922c(this.f36643b, c14251r.f36643b) && this.f36644c == c14251r.f36644c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f36642a.hashCode() * 31) + this.f36643b.hashCode()) * 31;
        boolean z = this.f36644c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f36642a + ", qualifierApplicabilityTypes=" + this.f36643b + ", definitelyNotNull=" + this.f36644c + ')';
    }

    public /* synthetic */ C14251r(C7169i c7169i, Collection collection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7169i, collection, (i & 4) != 0 ? c7169i.m21321c() == EnumC7168h.NOT_NULL : z);
    }
}
