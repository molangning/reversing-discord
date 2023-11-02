package net.time4j.p249tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: net.time4j.tz.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10836q implements Comparable<C10836q>, Serializable {
    private static final long serialVersionUID = 4594838367057225304L;
    private final int dst;
    private final long posix;
    private final int previous;
    private final int total;

    public C10836q(long j, int i, int i2, int i3) {
        this.posix = j;
        this.previous = i;
        this.total = i2;
        this.dst = i3;
        m10015b(i);
        m10015b(i2);
        m10016a(i3);
    }

    /* renamed from: a */
    private static void m10016a(int i) {
        if (i != Integer.MAX_VALUE) {
            m10015b(i);
        }
    }

    /* renamed from: b */
    private static void m10015b(int i) {
        if (i < -64800 || i > 64800) {
            throw new IllegalArgumentException("Offset out of range: " + i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            m10015b(this.previous);
            m10015b(this.total);
            m10016a(this.dst);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException(e.getMessage());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C10836q c10836q) {
        long j = this.posix - c10836q.posix;
        if (j == 0) {
            j = this.previous - c10836q.previous;
            if (j == 0) {
                j = this.total - c10836q.total;
                if (j == 0) {
                    j = m10013d() - c10836q.m10013d();
                    if (j == 0) {
                        return 0;
                    }
                }
            }
        }
        if (j < 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: d */
    public int m10013d() {
        int i = this.dst;
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    /* renamed from: e */
    public long m10012e() {
        return this.posix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10836q)) {
            return false;
        }
        C10836q c10836q = (C10836q) obj;
        if (this.posix == c10836q.posix && this.previous == c10836q.previous && this.total == c10836q.total && m10013d() == c10836q.m10013d()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m10011f() {
        return this.previous;
    }

    /* renamed from: g */
    public int m10010g() {
        return this.total - this.previous;
    }

    /* renamed from: h */
    public int m10009h() {
        return this.total - m10013d();
    }

    public int hashCode() {
        long j = this.posix;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: i */
    public int m10008i() {
        return this.total;
    }

    /* renamed from: k */
    public boolean m10007k() {
        return this.total > this.previous;
    }

    /* renamed from: l */
    public boolean m10006l() {
        return this.total < this.previous;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[POSIX=");
        sb2.append(this.posix);
        sb2.append(", previous-offset=");
        sb2.append(this.previous);
        sb2.append(", total-offset=");
        sb2.append(this.total);
        sb2.append(", dst-offset=");
        sb2.append(m10013d());
        sb2.append(']');
        return sb2.toString();
    }
}