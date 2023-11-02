package p080e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p195k8.C9149a;
import p195k8.C9191p0;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: e8.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6185k implements InterfaceC13133f {

    /* renamed from: j */
    private final List<C6174e> f17500j;

    /* renamed from: k */
    private final long[] f17501k;

    /* renamed from: l */
    private final long[] f17502l;

    public C6185k(List<C6174e> list) {
        this.f17500j = Collections.unmodifiableList(new ArrayList(list));
        this.f17501k = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            C6174e c6174e = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f17501k;
            jArr[i2] = c6174e.f17471b;
            jArr[i2 + 1] = c6174e.f17472c;
        }
        long[] jArr2 = this.f17501k;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f17502l = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ int m23322f(C6174e c6174e, C6174e c6174e2) {
        return Long.compare(c6174e.f17471b, c6174e2.f17471b);
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: a */
    public int mo1152a(long j) {
        int m16253e = C9191p0.m16253e(this.f17502l, j, false, false);
        if (m16253e >= this.f17502l.length) {
            return -1;
        }
        return m16253e;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: b */
    public List<C13127b> mo1151b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f17500j.size(); i++) {
            long[] jArr = this.f17501k;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C6174e c6174e = this.f17500j.get(i);
                C13127b c13127b = c6174e.f17470a;
                if (c13127b.f34105d == -3.4028235E38f) {
                    arrayList2.add(c6174e);
                } else {
                    arrayList.add(c13127b);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: e8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m23322f;
                m23322f = C6185k.m23322f((C6174e) obj, (C6174e) obj2);
                return m23322f;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C6174e) arrayList2.get(i3)).f17470a.m3156a().m3148h((-1) - i3, 1).m3155a());
        }
        return arrayList;
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: c */
    public long mo1150c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        if (i >= this.f17502l.length) {
            z2 = false;
        }
        C9149a.m16452a(z2);
        return this.f17502l[i];
    }

    @Override // p383v7.InterfaceC13133f
    /* renamed from: d */
    public int mo1149d() {
        return this.f17502l.length;
    }
}
