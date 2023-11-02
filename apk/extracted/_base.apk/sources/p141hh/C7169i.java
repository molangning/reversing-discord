package p141hh;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7169i {

    /* renamed from: a */
    private final EnumC7168h f19544a;

    /* renamed from: b */
    private final boolean f19545b;

    public C7169i(EnumC7168h qualifier, boolean z) {
        C9612q.m13917h(qualifier, "qualifier");
        this.f19544a = qualifier;
        this.f19545b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C7169i m21322b(C7169i c7169i, EnumC7168h enumC7168h, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC7168h = c7169i.f19544a;
        }
        if ((i & 2) != 0) {
            z = c7169i.f19545b;
        }
        return c7169i.m21323a(enumC7168h, z);
    }

    /* renamed from: a */
    public final C7169i m21323a(EnumC7168h qualifier, boolean z) {
        C9612q.m13917h(qualifier, "qualifier");
        return new C7169i(qualifier, z);
    }

    /* renamed from: c */
    public final EnumC7168h m21321c() {
        return this.f19544a;
    }

    /* renamed from: d */
    public final boolean m21320d() {
        return this.f19545b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7169i) {
            C7169i c7169i = (C7169i) obj;
            return this.f19544a == c7169i.f19544a && this.f19545b == c7169i.f19545b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f19544a.hashCode() * 31;
        boolean z = this.f19545b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f19544a + ", isForWarningOnly=" + this.f19545b + ')';
    }

    public /* synthetic */ C7169i(EnumC7168h enumC7168h, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC7168h, (i & 2) != 0 ? false : z);
    }
}
