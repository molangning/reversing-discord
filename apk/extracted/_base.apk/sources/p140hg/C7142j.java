package p140hg;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KType;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lhg/j;", "", "", "toString", "Lhg/k;", "a", "Lkotlin/reflect/KType;", "b", "", "hashCode", "other", "", "equals", "Lhg/k;", "d", "()Lhg/k;", "variance", "Lkotlin/reflect/KType;", "c", "()Lkotlin/reflect/KType;", "type", "<init>", "(Lhg/k;Lkotlin/reflect/KType;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: hg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7142j {

    /* renamed from: c */
    public static final C7143a f19494c = new C7143a(null);

    /* renamed from: d */
    public static final C7142j f19495d = new C7142j(null, null);

    /* renamed from: a */
    private final EnumC7145k f19496a;

    /* renamed from: b */
    private final KType f19497b;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m14357d2 = {"Lhg/j$a;", "", "Lkotlin/reflect/KType;", "type", "Lhg/j;", "d", "a", "b", "c", "()Lhg/j;", "STAR", "star", "Lhg/j;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: hg.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7143a {
        private C7143a() {
        }

        public /* synthetic */ C7143a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7142j m21381a(KType type) {
            C9612q.m13917h(type, "type");
            return new C7142j(EnumC7145k.IN, type);
        }

        /* renamed from: b */
        public final C7142j m21380b(KType type) {
            C9612q.m13917h(type, "type");
            return new C7142j(EnumC7145k.OUT, type);
        }

        /* renamed from: c */
        public final C7142j m21379c() {
            return C7142j.f19495d;
        }

        /* renamed from: d */
        public final C7142j m21378d(KType type) {
            C9612q.m13917h(type, "type");
            return new C7142j(EnumC7145k.INVARIANT, type);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: hg.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C7144b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19498a;

        static {
            int[] iArr = new int[EnumC7145k.values().length];
            try {
                iArr[EnumC7145k.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7145k.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7145k.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19498a = iArr;
        }
    }

    public C7142j(EnumC7145k enumC7145k, KType kType) {
        boolean z;
        boolean z2;
        String str;
        this.f19496a = enumC7145k;
        this.f19497b = kType;
        if (enumC7145k == null) {
            z = true;
        } else {
            z = false;
        }
        if (kType == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z == z2)) {
            if (enumC7145k == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + enumC7145k + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: a */
    public final EnumC7145k m21385a() {
        return this.f19496a;
    }

    /* renamed from: b */
    public final KType m21384b() {
        return this.f19497b;
    }

    /* renamed from: c */
    public final KType m21383c() {
        return this.f19497b;
    }

    /* renamed from: d */
    public final EnumC7145k m21382d() {
        return this.f19496a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7142j) {
            C7142j c7142j = (C7142j) obj;
            return this.f19496a == c7142j.f19496a && C9612q.m13922c(this.f19497b, c7142j.f19497b);
        }
        return false;
    }

    public int hashCode() {
        EnumC7145k enumC7145k = this.f19496a;
        int hashCode = (enumC7145k == null ? 0 : enumC7145k.hashCode()) * 31;
        KType kType = this.f19497b;
        return hashCode + (kType != null ? kType.hashCode() : 0);
    }

    public String toString() {
        int i;
        EnumC7145k enumC7145k = this.f19496a;
        if (enumC7145k == null) {
            i = -1;
        } else {
            i = C7144b.f19498a[enumC7145k.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + this.f19497b;
                    }
                    throw new C11581q();
                }
                return "in " + this.f19497b;
            }
            return String.valueOf(this.f19497b);
        }
        return "*";
    }
}
