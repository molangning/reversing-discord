package p162ij;

import java.io.Serializable;

/* renamed from: ij.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7643h implements Comparable<C7643h>, Serializable {

    /* renamed from: j */
    public static final C7643h f20944j = new C7643h(0);

    /* renamed from: k */
    public static final C7643h f20945k = new C7643h(1);
    private final long days;

    private C7643h(long j) {
        this.days = j;
    }

    /* renamed from: c */
    public static C7643h m20178c(long j) {
        return j == 0 ? f20944j : j == 1 ? f20945k : new C7643h(j);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C7643h c7643h) {
        long j = this.days;
        long j2 = c7643h.days;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: b */
    public long m20179b() {
        return this.days;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7643h) && this.days == ((C7643h) obj).days) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.days;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.days < 0) {
            sb2.append('-');
        }
        sb2.append('P');
        sb2.append(Math.abs(this.days));
        sb2.append('D');
        return sb2.toString();
    }
}
