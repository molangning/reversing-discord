package p260o7;

import p195k8.C9197r;
import p229m7.C10315l0;
import p260o7.InterfaceC11059f;
import p296q6.C11745h;
import p296q6.InterfaceC11732b0;

/* renamed from: o7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11055c implements InterfaceC11059f.InterfaceC11060a {

    /* renamed from: a */
    private final int[] f28923a;

    /* renamed from: b */
    private final C10315l0[] f28924b;

    public C11055c(int[] iArr, C10315l0[] c10315l0Arr) {
        this.f28923a = iArr;
        this.f28924b = c10315l0Arr;
    }

    /* renamed from: a */
    public int[] m9249a() {
        int[] iArr = new int[this.f28924b.length];
        int i = 0;
        while (true) {
            C10315l0[] c10315l0Arr = this.f28924b;
            if (i < c10315l0Arr.length) {
                iArr[i] = c10315l0Arr[i].m11835F();
                i++;
            } else {
                return iArr;
            }
        }
    }

    /* renamed from: b */
    public void m9248b(long j) {
        for (C10315l0 c10315l0 : this.f28924b) {
            c10315l0.m11816Y(j);
        }
    }

    @Override // p260o7.InterfaceC11059f.InterfaceC11060a
    /* renamed from: e */
    public InterfaceC11732b0 mo9238e(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f28923a;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.f28924b[i3];
                }
                i3++;
            } else {
                C9197r.m16183c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new C11745h();
            }
        }
    }
}