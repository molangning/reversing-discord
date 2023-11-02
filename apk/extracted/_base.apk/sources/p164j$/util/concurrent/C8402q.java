package p164j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8402q {

    /* renamed from: a */
    C8398m[] f22505a;

    /* renamed from: b */
    C8398m f22506b = null;

    /* renamed from: c */
    C8401p f22507c;

    /* renamed from: d */
    C8401p f22508d;

    /* renamed from: e */
    int f22509e;

    /* renamed from: f */
    int f22510f;

    /* renamed from: g */
    int f22511g;

    /* renamed from: h */
    final int f22512h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8402q(C8398m[] c8398mArr, int i, int i2, int i3) {
        this.f22505a = c8398mArr;
        this.f22512h = i;
        this.f22509e = i2;
        this.f22510f = i2;
        this.f22511g = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final C8398m m17738e() {
        C8398m[] c8398mArr;
        int length;
        int i;
        C8401p c8401p;
        C8398m c8398m = this.f22506b;
        if (c8398m != null) {
            c8398m = c8398m.f22500d;
        }
        while (c8398m == null) {
            if (this.f22510f >= this.f22511g || (c8398mArr = this.f22505a) == null || (length = c8398mArr.length) <= (i = this.f22509e) || i < 0) {
                this.f22506b = null;
                return null;
            }
            C8398m tabAt = ConcurrentHashMap.tabAt(c8398mArr, i);
            if (tabAt == null || tabAt.f22497a >= 0) {
                c8398m = tabAt;
            } else if (tabAt instanceof C8393h) {
                this.f22505a = ((C8393h) tabAt).f22490e;
                C8401p c8401p2 = this.f22508d;
                if (c8401p2 != null) {
                    this.f22508d = c8401p2.f22504d;
                } else {
                    c8401p2 = new C8401p();
                }
                c8401p2.f22503c = c8398mArr;
                c8401p2.f22501a = length;
                c8401p2.f22502b = i;
                c8401p2.f22504d = this.f22507c;
                this.f22507c = c8401p2;
                c8398m = null;
            } else {
                c8398m = tabAt instanceof C8403r ? ((C8403r) tabAt).f22516f : null;
            }
            if (this.f22507c != null) {
                while (true) {
                    c8401p = this.f22507c;
                    if (c8401p == null) {
                        break;
                    }
                    int i2 = this.f22509e;
                    int i3 = c8401p.f22501a;
                    int i4 = i2 + i3;
                    this.f22509e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f22509e = c8401p.f22502b;
                    this.f22505a = c8401p.f22503c;
                    c8401p.f22503c = null;
                    C8401p c8401p3 = c8401p.f22504d;
                    c8401p.f22504d = this.f22508d;
                    this.f22507c = c8401p3;
                    this.f22508d = c8401p;
                    length = i3;
                }
                if (c8401p == null) {
                    int i5 = this.f22509e + this.f22512h;
                    this.f22509e = i5;
                    if (i5 >= length) {
                        int i6 = this.f22510f + 1;
                        this.f22510f = i6;
                        this.f22509e = i6;
                    }
                }
            } else {
                int i7 = i + this.f22512h;
                this.f22509e = i7;
                if (i7 >= length) {
                    int i8 = this.f22510f + 1;
                    this.f22510f = i8;
                    this.f22509e = i8;
                }
            }
        }
        this.f22506b = c8398m;
        return c8398m;
    }
}
