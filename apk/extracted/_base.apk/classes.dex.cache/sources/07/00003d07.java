package p174j8;

import java.io.File;

/* renamed from: j8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8868d implements Comparable<C8868d> {

    /* renamed from: j */
    public final String f23245j;

    /* renamed from: k */
    public final long f23246k;

    /* renamed from: l */
    public final long f23247l;

    /* renamed from: m */
    public final boolean f23248m;

    /* renamed from: n */
    public final File f23249n;

    /* renamed from: o */
    public final long f23250o;

    public C8868d(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.f23245j = str;
        this.f23246k = j;
        this.f23247l = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.f23248m = z;
        this.f23249n = file;
        this.f23250o = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C8868d c8868d) {
        if (!this.f23245j.equals(c8868d.f23245j)) {
            return this.f23245j.compareTo(c8868d.f23245j);
        }
        int i = ((this.f23246k - c8868d.f23246k) > 0L ? 1 : ((this.f23246k - c8868d.f23246k) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    public boolean m17144b() {
        return !this.f23248m;
    }

    /* renamed from: c */
    public boolean m17143c() {
        return this.f23247l == -1;
    }

    public String toString() {
        return "[" + this.f23246k + ", " + this.f23247l + "]";
    }
}