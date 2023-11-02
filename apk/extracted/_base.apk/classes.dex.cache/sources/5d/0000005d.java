package p010a9;

import p029b9.C2190n;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14111d;

/* renamed from: a9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0093b<O extends C14107a.InterfaceC14111d> {

    /* renamed from: a */
    private final int f435a;

    /* renamed from: b */
    private final C14107a<O> f436b;

    /* renamed from: c */
    private final O f437c;

    /* renamed from: d */
    private final String f438d;

    private C0093b(C14107a<O> c14107a, O o, String str) {
        this.f436b = c14107a;
        this.f437c = o;
        this.f438d = str;
        this.f435a = C2190n.m34003c(c14107a, o, str);
    }

    /* renamed from: a */
    public static <O extends C14107a.InterfaceC14111d> C0093b<O> m41153a(C14107a<O> c14107a, O o, String str) {
        return new C0093b<>(c14107a, o, str);
    }

    /* renamed from: b */
    public final String m41152b() {
        return this.f436b.m653c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0093b)) {
            return false;
        }
        C0093b c0093b = (C0093b) obj;
        if (!C2190n.m34004b(this.f436b, c0093b.f436b) || !C2190n.m34004b(this.f437c, c0093b.f437c) || !C2190n.m34004b(this.f438d, c0093b.f438d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f435a;
    }
}