package p363u6;

import java.util.List;
import p173j7.C8856b;

/* renamed from: u6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12872b {

    /* renamed from: a */
    public final long f33506a;

    /* renamed from: b */
    public final List<C12873a> f33507b;

    /* renamed from: u6.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12873a {

        /* renamed from: a */
        public final String f33508a;

        /* renamed from: b */
        public final String f33509b;

        /* renamed from: c */
        public final long f33510c;

        /* renamed from: d */
        public final long f33511d;

        public C12873a(String str, String str2, long j, long j2) {
            this.f33508a = str;
            this.f33509b = str2;
            this.f33510c = j;
            this.f33511d = j2;
        }
    }

    public C12872b(long j, List<C12873a> list) {
        this.f33506a = j;
        this.f33507b = list;
    }

    /* renamed from: a */
    public C8856b m3743a(long j) {
        long j2;
        if (this.f33507b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f33507b.size() - 1; size >= 0; size--) {
            C12873a c12873a = this.f33507b.get(size);
            boolean equals = "video/mp4".equals(c12873a.f33508a) | z;
            if (size == 0) {
                j3 -= c12873a.f33511d;
                j2 = 0;
            } else {
                j2 = j3 - c12873a.f33510c;
            }
            long j8 = j3;
            j3 = j2;
            if (equals && j3 != j8) {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            } else {
                z = equals;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C8856b(j4, j5, this.f33506a, j6, j7);
    }
}
