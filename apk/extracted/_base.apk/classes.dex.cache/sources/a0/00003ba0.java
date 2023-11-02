package p164j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8514l {

    /* renamed from: c */
    private static final C8514l f22632c = new C8514l();

    /* renamed from: a */
    private final boolean f22633a;

    /* renamed from: b */
    private final long f22634b;

    private C8514l() {
        this.f22633a = false;
        this.f22634b = 0L;
    }

    private C8514l(long j) {
        this.f22633a = true;
        this.f22634b = j;
    }

    /* renamed from: a */
    public static C8514l m17613a() {
        return f22632c;
    }

    /* renamed from: d */
    public static C8514l m17610d(long j) {
        return new C8514l(j);
    }

    /* renamed from: b */
    public final long m17612b() {
        if (this.f22633a) {
            return this.f22634b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m17611c() {
        return this.f22633a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8514l) {
            C8514l c8514l = (C8514l) obj;
            boolean z = this.f22633a;
            if (z && c8514l.f22633a) {
                if (this.f22634b == c8514l.f22634b) {
                    return true;
                }
            } else if (z == c8514l.f22633a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22633a) {
            long j = this.f22634b;
            return (int) (j ^ (j >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f22633a ? String.format("OptionalLong[%s]", Long.valueOf(this.f22634b)) : "OptionalLong.empty";
    }
}