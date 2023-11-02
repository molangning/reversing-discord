package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import net.time4j.base.C10616c;
import p162ij.InterfaceC7652j0;
import p162ij.InterfaceC7656l0;
import p288pj.EnumC11651f;

/* renamed from: net.time4j.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10847y<U> implements InterfaceC7656l0<U>, Comparable<C10847y<U>>, Serializable {

    /* renamed from: m */
    private static final C10847y<TimeUnit> f28313m;

    /* renamed from: n */
    private static final C10847y<EnumC10781n0> f28314n;

    /* renamed from: o */
    public static final InterfaceC7652j0<TimeUnit, C10847y<TimeUnit>> f28315o;

    /* renamed from: p */
    public static final InterfaceC7652j0<TimeUnit, C10847y<EnumC10781n0>> f28316p;
    private static final long serialVersionUID = -4150291820807606229L;

    /* renamed from: j */
    private final transient long f28317j;

    /* renamed from: k */
    private final transient int f28318k;

    /* renamed from: l */
    private final transient EnumC11651f f28319l;

    /* renamed from: net.time4j.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10849b<U> implements InterfaceC7652j0<TimeUnit, C10847y<U>> {

        /* renamed from: j */
        private final EnumC11651f f28320j;

        private C10849b(EnumC11651f enumC11651f) {
            this.f28320j = enumC11651f;
        }
    }

    static {
        EnumC11651f enumC11651f = EnumC11651f.POSIX;
        f28313m = new C10847y<>(0L, 0, enumC11651f);
        EnumC11651f enumC11651f2 = EnumC11651f.UTC;
        f28314n = new C10847y<>(0L, 0, enumC11651f2);
        f28315o = new C10849b(enumC11651f);
        f28316p = new C10849b(enumC11651f2);
    }

    private C10847y(long j, int i, EnumC11651f enumC11651f) {
        while (i < 0) {
            i += 1000000000;
            j = C10616c.m11029m(j, 1L);
        }
        while (i >= 1000000000) {
            i -= 1000000000;
            j = C10616c.m11036f(j, 1L);
        }
        if (j < 0 && i > 0) {
            j++;
            i -= 1000000000;
        }
        this.f28317j = j;
        this.f28318k = i;
        this.f28319l = enumC11651f;
    }

    /* renamed from: c */
    private void m9991c(StringBuilder sb2) {
        if (m9987g()) {
            sb2.append('-');
            sb2.append(Math.abs(this.f28317j));
        } else {
            sb2.append(this.f28317j);
        }
        if (this.f28318k != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(Math.abs(this.f28318k));
            for (int length = 9 - valueOf.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(valueOf);
        }
    }

    /* renamed from: h */
    public static C10847y<TimeUnit> m9986h(long j, int i) {
        if (j == 0 && i == 0) {
            return f28313m;
        }
        return new C10847y<>(j, i, EnumC11651f.POSIX);
    }

    /* renamed from: i */
    public static C10847y<EnumC10781n0> m9985i(long j, int i) {
        if (j == 0 && i == 0) {
            return f28314n;
        }
        return new C10847y<>(j, i, EnumC11651f.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 5);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10847y<U> c10847y) {
        if (this.f28319l == c10847y.f28319l) {
            long j = this.f28317j;
            long j2 = c10847y.f28317j;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.f28318k - c10847y.f28318k;
        }
        throw new ClassCastException("Different time scales.");
    }

    /* renamed from: d */
    public int m9990d() {
        int i = this.f28318k;
        return i < 0 ? i + 1000000000 : i;
    }

    /* renamed from: e */
    public EnumC11651f m9989e() {
        return this.f28319l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10847y)) {
            return false;
        }
        C10847y c10847y = (C10847y) obj;
        if (this.f28317j == c10847y.f28317j && this.f28318k == c10847y.f28318k && this.f28319l == c10847y.f28319l) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long m9988f() {
        long j = this.f28317j;
        if (this.f28318k < 0) {
            return j - 1;
        }
        return j;
    }

    /* renamed from: g */
    public boolean m9987g() {
        return this.f28317j < 0 || this.f28318k < 0;
    }

    public int hashCode() {
        long j = this.f28317j;
        return ((((161 + ((int) (j ^ (j >>> 32)))) * 23) + this.f28318k) * 23) + this.f28319l.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        m9991c(sb2);
        sb2.append("s [");
        sb2.append(this.f28319l.name());
        sb2.append(']');
        return sb2.toString();
    }
}
