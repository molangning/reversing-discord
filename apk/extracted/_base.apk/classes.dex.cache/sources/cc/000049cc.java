package p291q1;

import androidx.core.p018os.C1071r;

/* renamed from: q1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11676h {

    /* renamed from: a */
    private final String[] f30444a = new String[5];

    /* renamed from: b */
    private final long[] f30445b = new long[5];

    /* renamed from: c */
    private int f30446c = 0;

    /* renamed from: d */
    private int f30447d = 0;

    /* renamed from: a */
    public void m7231a(String str) {
        int i = this.f30446c;
        if (i == 5) {
            this.f30447d++;
            return;
        }
        this.f30444a[i] = str;
        this.f30445b[i] = System.nanoTime();
        C1071r.m37959a(str);
        this.f30446c++;
    }

    /* renamed from: b */
    public float m7230b(String str) {
        int i = this.f30447d;
        if (i > 0) {
            this.f30447d = i - 1;
            return 0.0f;
        }
        int i2 = this.f30446c - 1;
        this.f30446c = i2;
        if (i2 != -1) {
            if (str.equals(this.f30444a[i2])) {
                C1071r.m37958b();
                return ((float) (System.nanoTime() - this.f30445b[this.f30446c])) / 1000000.0f;
            }
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f30444a[this.f30446c] + ".");
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }
}