package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1804i {

    /* renamed from: a */
    final InterfaceC1805a f4961a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1805a {
        /* renamed from: a */
        AdapterHelper.C1727b mo35371a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo35370b(AdapterHelper.C1727b c1727b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1804i(InterfaceC1805a interfaceC1805a) {
        this.f4961a = interfaceC1805a;
    }

    /* renamed from: a */
    private int m35377a(List<AdapterHelper.C1727b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4567a == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m35375c(List<AdapterHelper.C1727b> list, int i, AdapterHelper.C1727b c1727b, int i2, AdapterHelper.C1727b c1727b2) {
        int i3;
        int i4 = c1727b.f4570d;
        int i5 = c1727b2.f4568b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = c1727b.f4568b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            c1727b.f4568b = i6 + c1727b2.f4570d;
        }
        int i7 = c1727b2.f4568b;
        if (i7 <= i4) {
            c1727b.f4570d = i4 + c1727b2.f4570d;
        }
        c1727b2.f4568b = i7 + i3;
        list.set(i, c1727b2);
        list.set(i2, c1727b);
    }

    /* renamed from: d */
    private void m35374d(List<AdapterHelper.C1727b> list, int i, int i2) {
        AdapterHelper.C1727b c1727b = list.get(i);
        AdapterHelper.C1727b c1727b2 = list.get(i2);
        int i3 = c1727b2.f4567a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 4) {
                    m35372f(list, i, c1727b, i2, c1727b2);
                    return;
                }
                return;
            }
            m35373e(list, i, c1727b, i2, c1727b2);
            return;
        }
        m35375c(list, i, c1727b, i2, c1727b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35376b(List<AdapterHelper.C1727b> list) {
        while (true) {
            int m35377a = m35377a(list);
            if (m35377a != -1) {
                m35374d(list, m35377a, m35377a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    void m35373e(List<AdapterHelper.C1727b> list, int i, AdapterHelper.C1727b c1727b, int i2, AdapterHelper.C1727b c1727b2) {
        boolean z;
        int i3 = c1727b.f4568b;
        int i4 = c1727b.f4570d;
        boolean z2 = false;
        if (i3 < i4) {
            if (c1727b2.f4568b == i3 && c1727b2.f4570d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (c1727b2.f4568b == i4 + 1 && c1727b2.f4570d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = c1727b2.f4568b;
        if (i4 < i5) {
            c1727b2.f4568b = i5 - 1;
        } else {
            int i6 = c1727b2.f4570d;
            if (i4 < i5 + i6) {
                c1727b2.f4570d = i6 - 1;
                c1727b.f4567a = 2;
                c1727b.f4570d = 1;
                if (c1727b2.f4570d == 0) {
                    list.remove(i2);
                    this.f4961a.mo35370b(c1727b2);
                    return;
                }
                return;
            }
        }
        int i7 = c1727b.f4568b;
        int i8 = c1727b2.f4568b;
        AdapterHelper.C1727b c1727b3 = null;
        if (i7 <= i8) {
            c1727b2.f4568b = i8 + 1;
        } else {
            int i9 = c1727b2.f4570d;
            if (i7 < i8 + i9) {
                c1727b3 = this.f4961a.mo35371a(2, i7 + 1, (i8 + i9) - i7, null);
                c1727b2.f4570d = c1727b.f4568b - c1727b2.f4568b;
            }
        }
        if (z2) {
            list.set(i, c1727b2);
            list.remove(i2);
            this.f4961a.mo35370b(c1727b);
            return;
        }
        if (z) {
            if (c1727b3 != null) {
                int i10 = c1727b.f4568b;
                if (i10 > c1727b3.f4568b) {
                    c1727b.f4568b = i10 - c1727b3.f4570d;
                }
                int i11 = c1727b.f4570d;
                if (i11 > c1727b3.f4568b) {
                    c1727b.f4570d = i11 - c1727b3.f4570d;
                }
            }
            int i12 = c1727b.f4568b;
            if (i12 > c1727b2.f4568b) {
                c1727b.f4568b = i12 - c1727b2.f4570d;
            }
            int i13 = c1727b.f4570d;
            if (i13 > c1727b2.f4568b) {
                c1727b.f4570d = i13 - c1727b2.f4570d;
            }
        } else {
            if (c1727b3 != null) {
                int i14 = c1727b.f4568b;
                if (i14 >= c1727b3.f4568b) {
                    c1727b.f4568b = i14 - c1727b3.f4570d;
                }
                int i15 = c1727b.f4570d;
                if (i15 >= c1727b3.f4568b) {
                    c1727b.f4570d = i15 - c1727b3.f4570d;
                }
            }
            int i16 = c1727b.f4568b;
            if (i16 >= c1727b2.f4568b) {
                c1727b.f4568b = i16 - c1727b2.f4570d;
            }
            int i17 = c1727b.f4570d;
            if (i17 >= c1727b2.f4568b) {
                c1727b.f4570d = i17 - c1727b2.f4570d;
            }
        }
        list.set(i, c1727b2);
        if (c1727b.f4568b != c1727b.f4570d) {
            list.set(i2, c1727b);
        } else {
            list.remove(i2);
        }
        if (c1727b3 != null) {
            list.add(i, c1727b3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m35372f(java.util.List<androidx.recyclerview.widget.AdapterHelper.C1727b> r9, int r10, androidx.recyclerview.widget.AdapterHelper.C1727b r11, int r12, androidx.recyclerview.widget.AdapterHelper.C1727b r13) {
        /*
            r8 = this;
            int r0 = r11.f4570d
            int r1 = r13.f4568b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f4568b = r1
            goto L20
        Ld:
            int r5 = r13.f4570d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f4570d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f4961a
            int r1 = r11.f4568b
            java.lang.Object r5 = r13.f4569c
            androidx.recyclerview.widget.AdapterHelper$b r0 = r0.mo35371a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f4568b
            int r5 = r13.f4568b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f4568b = r5
            goto L41
        L2b:
            int r6 = r13.f4570d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r4 = r8.f4961a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f4569c
            androidx.recyclerview.widget.AdapterHelper$b r4 = r4.mo35371a(r2, r1, r5, r3)
            int r1 = r13.f4570d
            int r1 = r1 - r5
            r13.f4570d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4570d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f4961a
            r11.mo35370b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1804i.m35372f(java.util.List, int, androidx.recyclerview.widget.AdapterHelper$b, int, androidx.recyclerview.widget.AdapterHelper$b):void");
    }
}
