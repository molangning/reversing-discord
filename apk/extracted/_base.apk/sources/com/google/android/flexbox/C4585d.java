package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.C1363w;
import androidx.core.widget.C1419c;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.flexbox.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4585d {

    /* renamed from: a */
    private final InterfaceC4582a f12535a;

    /* renamed from: b */
    private boolean[] f12536b;

    /* renamed from: c */
    int[] f12537c;

    /* renamed from: d */
    long[] f12538d;

    /* renamed from: e */
    private long[] f12539e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4587b {

        /* renamed from: a */
        List<C4584c> f12540a;

        /* renamed from: b */
        int f12541b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m28335a() {
            this.f12540a = null;
            this.f12541b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4588c implements Comparable<C4588c> {

        /* renamed from: j */
        int f12542j;

        /* renamed from: k */
        int f12543k;

        private C4588c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C4588c c4588c) {
            int i = this.f12543k;
            int i2 = c4588c.f12543k;
            if (i != i2) {
                return i - i2;
            }
            return this.f12542j - c4588c.f12542j;
        }

        public String toString() {
            return "Order{order=" + this.f12543k + ", index=" + this.f12542j + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4585d(InterfaceC4582a interfaceC4582a) {
        this.f12535a = interfaceC4582a;
    }

    /* renamed from: A */
    private int m28387A(int i, InterfaceC4583b interfaceC4583b, int i2) {
        InterfaceC4582a interfaceC4582a = this.f12535a;
        int mo28415c = interfaceC4582a.mo28415c(i, interfaceC4582a.getPaddingLeft() + this.f12535a.getPaddingRight() + interfaceC4583b.mo28404D() + interfaceC4583b.mo28403K() + i2, interfaceC4583b.getWidth());
        int size = View.MeasureSpec.getSize(mo28415c);
        if (size > interfaceC4583b.mo28392t()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC4583b.mo28392t(), View.MeasureSpec.getMode(mo28415c));
        }
        if (size < interfaceC4583b.mo28398i()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC4583b.mo28398i(), View.MeasureSpec.getMode(mo28415c));
        }
        return mo28415c;
    }

    /* renamed from: B */
    private int m28386B(InterfaceC4583b interfaceC4583b, boolean z) {
        if (z) {
            return interfaceC4583b.mo28405C();
        }
        return interfaceC4583b.mo28403K();
    }

    /* renamed from: C */
    private int m28385C(InterfaceC4583b interfaceC4583b, boolean z) {
        if (z) {
            return interfaceC4583b.mo28403K();
        }
        return interfaceC4583b.mo28405C();
    }

    /* renamed from: D */
    private int m28384D(InterfaceC4583b interfaceC4583b, boolean z) {
        if (z) {
            return interfaceC4583b.mo28397l();
        }
        return interfaceC4583b.mo28404D();
    }

    /* renamed from: E */
    private int m28383E(InterfaceC4583b interfaceC4583b, boolean z) {
        if (z) {
            return interfaceC4583b.mo28404D();
        }
        return interfaceC4583b.mo28397l();
    }

    /* renamed from: F */
    private int m28382F(InterfaceC4583b interfaceC4583b, boolean z) {
        if (z) {
            return interfaceC4583b.getHeight();
        }
        return interfaceC4583b.getWidth();
    }

    /* renamed from: G */
    private int m28381G(InterfaceC4583b interfaceC4583b, boolean z) {
        if (z) {
            return interfaceC4583b.getWidth();
        }
        return interfaceC4583b.getHeight();
    }

    /* renamed from: H */
    private int m28380H(boolean z) {
        if (z) {
            return this.f12535a.getPaddingBottom();
        }
        return this.f12535a.getPaddingEnd();
    }

    /* renamed from: I */
    private int m28379I(boolean z) {
        if (z) {
            return this.f12535a.getPaddingEnd();
        }
        return this.f12535a.getPaddingBottom();
    }

    /* renamed from: J */
    private int m28378J(boolean z) {
        if (z) {
            return this.f12535a.getPaddingTop();
        }
        return this.f12535a.getPaddingStart();
    }

    /* renamed from: K */
    private int m28377K(boolean z) {
        if (z) {
            return this.f12535a.getPaddingStart();
        }
        return this.f12535a.getPaddingTop();
    }

    /* renamed from: L */
    private int m28376L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    private int m28375M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    private boolean m28374N(int i, int i2, C4584c c4584c) {
        return i == i2 - 1 && c4584c.m28389c() != 0;
    }

    /* renamed from: P */
    private boolean m28372P(View view, int i, int i2, int i3, int i4, InterfaceC4583b interfaceC4583b, int i5, int i6, int i7) {
        if (this.f12535a.getFlexWrap() == 0) {
            return false;
        }
        if (interfaceC4583b.mo28393s()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f12535a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int mo28408k = this.f12535a.mo28408k(view, i5, i6);
        if (mo28408k > 0) {
            i4 += mo28408k;
        }
        if (i2 >= i3 + i4) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    private void m28368T(int i, int i2, C4584c c4584c, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = c4584c.f12521e;
        float f = c4584c.f12527k;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i8) {
            float f3 = (i8 - i3) / f;
            c4584c.f12521e = i4 + c4584c.f12522f;
            if (!z) {
                c4584c.f12523g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < c4584c.f12524h) {
                int i11 = c4584c.f12531o + i9;
                View mo28410i = this.f12535a.mo28410i(i11);
                if (mo28410i != null && mo28410i.getVisibility() != 8) {
                    InterfaceC4583b interfaceC4583b = (InterfaceC4583b) mo28410i.getLayoutParams();
                    int flexDirection = this.f12535a.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = mo28410i.getMeasuredHeight();
                        long[] jArr = this.f12539e;
                        if (jArr != null) {
                            measuredHeight = m28338x(jArr[i11]);
                        }
                        int measuredWidth = mo28410i.getMeasuredWidth();
                        long[] jArr2 = this.f12539e;
                        if (jArr2 != null) {
                            measuredWidth = m28337y(jArr2[i11]);
                        }
                        if (!this.f12536b[i11] && interfaceC4583b.mo28399f() > f2) {
                            float mo28399f = measuredHeight - (interfaceC4583b.mo28399f() * f3);
                            if (i9 == c4584c.f12524h - 1) {
                                mo28399f += f4;
                                f4 = f2;
                            }
                            int round = Math.round(mo28399f);
                            if (round < interfaceC4583b.mo28402L()) {
                                round = interfaceC4583b.mo28402L();
                                this.f12536b[i11] = true;
                                c4584c.f12527k -= interfaceC4583b.mo28399f();
                                i5 = i8;
                                i6 = i9;
                                z2 = true;
                            } else {
                                f4 += mo28399f - round;
                                i5 = i8;
                                i6 = i9;
                                double d = f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int m28387A = m28387A(i, interfaceC4583b, c4584c.f12529m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            mo28410i.measure(m28387A, makeMeasureSpec);
                            measuredWidth = mo28410i.getMeasuredWidth();
                            int measuredHeight2 = mo28410i.getMeasuredHeight();
                            m28362Z(i11, m28387A, makeMeasureSpec, mo28410i);
                            this.f12535a.mo28409j(i11, mo28410i);
                            measuredHeight = measuredHeight2;
                        } else {
                            i5 = i8;
                            i6 = i9;
                        }
                        i7 = Math.max(i10, measuredWidth + interfaceC4583b.mo28404D() + interfaceC4583b.mo28403K() + this.f12535a.mo28412g(mo28410i));
                        c4584c.f12521e += measuredHeight + interfaceC4583b.mo28397l() + interfaceC4583b.mo28405C();
                    } else {
                        i5 = i8;
                        int i12 = i9;
                        int measuredWidth2 = mo28410i.getMeasuredWidth();
                        long[] jArr3 = this.f12539e;
                        if (jArr3 != null) {
                            measuredWidth2 = m28337y(jArr3[i11]);
                        }
                        int measuredHeight3 = mo28410i.getMeasuredHeight();
                        long[] jArr4 = this.f12539e;
                        if (jArr4 != null) {
                            measuredHeight3 = m28338x(jArr4[i11]);
                        }
                        if (!this.f12536b[i11] && interfaceC4583b.mo28399f() > 0.0f) {
                            float mo28399f2 = measuredWidth2 - (interfaceC4583b.mo28399f() * f3);
                            i6 = i12;
                            if (i6 == c4584c.f12524h - 1) {
                                mo28399f2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(mo28399f2);
                            if (round2 < interfaceC4583b.mo28398i()) {
                                round2 = interfaceC4583b.mo28398i();
                                this.f12536b[i11] = true;
                                c4584c.f12527k -= interfaceC4583b.mo28399f();
                                z2 = true;
                            } else {
                                f4 += mo28399f2 - round2;
                                double d2 = f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int m28336z = m28336z(i2, interfaceC4583b, c4584c.f12529m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            mo28410i.measure(makeMeasureSpec2, m28336z);
                            int measuredWidth3 = mo28410i.getMeasuredWidth();
                            int measuredHeight4 = mo28410i.getMeasuredHeight();
                            m28362Z(i11, makeMeasureSpec2, m28336z, mo28410i);
                            this.f12535a.mo28409j(i11, mo28410i);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i6 = i12;
                        }
                        int max = Math.max(i10, measuredHeight3 + interfaceC4583b.mo28397l() + interfaceC4583b.mo28405C() + this.f12535a.mo28412g(mo28410i));
                        c4584c.f12521e += measuredWidth2 + interfaceC4583b.mo28404D() + interfaceC4583b.mo28403K();
                        i7 = max;
                    }
                    c4584c.f12523g = Math.max(c4584c.f12523g, i7);
                    i10 = i7;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                i9 = i6 + 1;
                i8 = i5;
                f2 = 0.0f;
            }
            int i13 = i8;
            if (z2 && i13 != c4584c.f12521e) {
                m28368T(i, i2, c4584c, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    private int[] m28367U(int i, List<C4588c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C4588c c4588c : list) {
            int i3 = c4588c.f12542j;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c4588c.f12543k);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    private void m28366V(View view, int i, int i2) {
        int measuredHeight;
        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - interfaceC4583b.mo28404D()) - interfaceC4583b.mo28403K()) - this.f12535a.mo28412g(view), interfaceC4583b.mo28398i()), interfaceC4583b.mo28392t());
        long[] jArr = this.f12539e;
        if (jArr != null) {
            measuredHeight = m28338x(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m28362Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f12535a.mo28409j(i2, view);
    }

    /* renamed from: W */
    private void m28365W(View view, int i, int i2) {
        int measuredWidth;
        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - interfaceC4583b.mo28397l()) - interfaceC4583b.mo28405C()) - this.f12535a.mo28412g(view), interfaceC4583b.mo28402L()), interfaceC4583b.mo28401N());
        long[] jArr = this.f12539e;
        if (jArr != null) {
            measuredWidth = m28337y(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m28362Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f12535a.mo28409j(i2, view);
    }

    /* renamed from: Z */
    private void m28362Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f12538d;
        if (jArr != null) {
            jArr[i] = m28369S(i2, i3);
        }
        long[] jArr2 = this.f12539e;
        if (jArr2 != null) {
            jArr2[i] = m28369S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private void m28361a(List<C4584c> list, C4584c c4584c, int i, int i2) {
        c4584c.f12529m = i2;
        this.f12535a.mo28411h(c4584c);
        c4584c.f12532p = i;
        list.add(c4584c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28353i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.InterfaceC4583b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo28398i()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.mo28398i()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.mo28392t()
            if (r1 <= r3) goto L26
            int r1 = r0.mo28392t()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.mo28402L()
            if (r2 >= r5) goto L32
            int r2 = r0.mo28402L()
            goto L3e
        L32:
            int r5 = r0.mo28401N()
            if (r2 <= r5) goto L3d
            int r2 = r0.mo28401N()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m28362Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f12535a
            r0.mo28409j(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C4585d.m28353i(android.view.View, int):void");
    }

    /* renamed from: k */
    private List<C4584c> m28351k(List<C4584c> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C4584c c4584c = new C4584c();
        c4584c.f12523g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(c4584c);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(c4584c);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private List<C4588c> m28350l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C4588c c4588c = new C4588c();
            c4588c.f12543k = ((InterfaceC4583b) this.f12535a.mo28414e(i2).getLayoutParams()).getOrder();
            c4588c.f12542j = i2;
            arrayList.add(c4588c);
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m28344r(int i) {
        boolean[] zArr = this.f12536b;
        if (zArr == null) {
            this.f12536b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f12536b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: v */
    private void m28340v(CompoundButton compoundButton) {
        int minimumWidth;
        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) compoundButton.getLayoutParams();
        int mo28398i = interfaceC4583b.mo28398i();
        int mo28402L = interfaceC4583b.mo28402L();
        Drawable m36922a = C1419c.m36922a(compoundButton);
        int i = 0;
        if (m36922a == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = m36922a.getMinimumWidth();
        }
        if (m36922a != null) {
            i = m36922a.getMinimumHeight();
        }
        if (mo28398i == -1) {
            mo28398i = minimumWidth;
        }
        interfaceC4583b.mo28406B(mo28398i);
        if (mo28402L == -1) {
            mo28402L = i;
        }
        interfaceC4583b.mo28396m(mo28402L);
    }

    /* renamed from: w */
    private void m28339w(int i, int i2, C4584c c4584c, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = c4584c.f12526j;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = c4584c.f12521e)) {
            float f3 = (i3 - i5) / f;
            c4584c.f12521e = i4 + c4584c.f12522f;
            if (!z) {
                c4584c.f12523g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < c4584c.f12524h) {
                int i11 = c4584c.f12531o + i9;
                View mo28410i = this.f12535a.mo28410i(i11);
                if (mo28410i != null && mo28410i.getVisibility() != 8) {
                    InterfaceC4583b interfaceC4583b = (InterfaceC4583b) mo28410i.getLayoutParams();
                    int flexDirection = this.f12535a.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = mo28410i.getMeasuredHeight();
                        long[] jArr = this.f12539e;
                        if (jArr != null) {
                            measuredHeight = m28338x(jArr[i11]);
                        }
                        int measuredWidth = mo28410i.getMeasuredWidth();
                        long[] jArr2 = this.f12539e;
                        if (jArr2 != null) {
                            measuredWidth = m28337y(jArr2[i11]);
                        }
                        if (!this.f12536b[i11] && interfaceC4583b.mo28395n() > f2) {
                            float mo28395n = measuredHeight + (interfaceC4583b.mo28395n() * f3);
                            if (i9 == c4584c.f12524h - 1) {
                                mo28395n += f4;
                                f4 = f2;
                            }
                            int round = Math.round(mo28395n);
                            if (round > interfaceC4583b.mo28401N()) {
                                round = interfaceC4583b.mo28401N();
                                this.f12536b[i11] = true;
                                c4584c.f12526j -= interfaceC4583b.mo28395n();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += mo28395n - round;
                                i8 = i5;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d2 = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d2 = d3 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int m28387A = m28387A(i, interfaceC4583b, c4584c.f12529m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            mo28410i.measure(m28387A, makeMeasureSpec);
                            measuredWidth = mo28410i.getMeasuredWidth();
                            int measuredHeight2 = mo28410i.getMeasuredHeight();
                            m28362Z(i11, m28387A, makeMeasureSpec, mo28410i);
                            this.f12535a.mo28409j(i11, mo28410i);
                            measuredHeight = measuredHeight2;
                        } else {
                            i8 = i5;
                        }
                        i7 = Math.max(i10, measuredWidth + interfaceC4583b.mo28404D() + interfaceC4583b.mo28403K() + this.f12535a.mo28412g(mo28410i));
                        c4584c.f12521e += measuredHeight + interfaceC4583b.mo28397l() + interfaceC4583b.mo28405C();
                        i6 = i8;
                    } else {
                        int i12 = i5;
                        int measuredWidth2 = mo28410i.getMeasuredWidth();
                        long[] jArr3 = this.f12539e;
                        if (jArr3 != null) {
                            measuredWidth2 = m28337y(jArr3[i11]);
                        }
                        int measuredHeight3 = mo28410i.getMeasuredHeight();
                        long[] jArr4 = this.f12539e;
                        i6 = i12;
                        if (jArr4 != null) {
                            measuredHeight3 = m28338x(jArr4[i11]);
                        }
                        if (!this.f12536b[i11] && interfaceC4583b.mo28395n() > 0.0f) {
                            float mo28395n2 = measuredWidth2 + (interfaceC4583b.mo28395n() * f3);
                            if (i9 == c4584c.f12524h - 1) {
                                mo28395n2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(mo28395n2);
                            if (round2 > interfaceC4583b.mo28392t()) {
                                round2 = interfaceC4583b.mo28392t();
                                this.f12536b[i11] = true;
                                c4584c.f12526j -= interfaceC4583b.mo28395n();
                                z2 = true;
                            } else {
                                f4 += mo28395n2 - round2;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d = d4 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int m28336z = m28336z(i2, interfaceC4583b, c4584c.f12529m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            mo28410i.measure(makeMeasureSpec2, m28336z);
                            int measuredWidth3 = mo28410i.getMeasuredWidth();
                            int measuredHeight4 = mo28410i.getMeasuredHeight();
                            m28362Z(i11, makeMeasureSpec2, m28336z, mo28410i);
                            this.f12535a.mo28409j(i11, mo28410i);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        }
                        int max = Math.max(i10, measuredHeight3 + interfaceC4583b.mo28397l() + interfaceC4583b.mo28405C() + this.f12535a.mo28412g(mo28410i));
                        c4584c.f12521e += measuredWidth2 + interfaceC4583b.mo28404D() + interfaceC4583b.mo28403K();
                        i7 = max;
                    }
                    c4584c.f12523g = Math.max(c4584c.f12523g, i7);
                    i10 = i7;
                } else {
                    i6 = i5;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i13 = i5;
            if (z2 && i13 != c4584c.f12521e) {
                m28339w(i, i2, c4584c, i3, i4, true);
            }
        }
    }

    /* renamed from: z */
    private int m28336z(int i, InterfaceC4583b interfaceC4583b, int i2) {
        InterfaceC4582a interfaceC4582a = this.f12535a;
        int mo28413f = interfaceC4582a.mo28413f(i, interfaceC4582a.getPaddingTop() + this.f12535a.getPaddingBottom() + interfaceC4583b.mo28397l() + interfaceC4583b.mo28405C() + i2, interfaceC4583b.getHeight());
        int size = View.MeasureSpec.getSize(mo28413f);
        if (size > interfaceC4583b.mo28401N()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC4583b.mo28401N(), View.MeasureSpec.getMode(mo28413f));
        }
        if (size < interfaceC4583b.mo28402L()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC4583b.mo28402L(), View.MeasureSpec.getMode(mo28413f));
        }
        return mo28413f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean m28373O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f12535a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View mo28414e = this.f12535a.mo28414e(i);
            if (mo28414e != null && ((InterfaceC4583b) mo28414e.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m28371Q(View view, C4584c c4584c, int i, int i2, int i3, int i4) {
        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) view.getLayoutParams();
        int alignItems = this.f12535a.getAlignItems();
        if (interfaceC4583b.mo28400c() != -1) {
            alignItems = interfaceC4583b.mo28400c();
        }
        int i5 = c4584c.f12523g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.f12535a.getFlexWrap() != 2) {
                        int max = Math.max(c4584c.f12528l - view.getBaseline(), interfaceC4583b.mo28397l());
                        view.layout(i, i2 + max, i3, i4 + max);
                        return;
                    } else {
                        int max2 = Math.max((c4584c.f12528l - view.getMeasuredHeight()) + view.getBaseline(), interfaceC4583b.mo28405C());
                        view.layout(i, i2 - max2, i3, i4 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + interfaceC4583b.mo28397l()) - interfaceC4583b.mo28405C()) / 2;
                    if (this.f12535a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
            } else if (this.f12535a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - interfaceC4583b.mo28405C(), i3, i8 - interfaceC4583b.mo28405C());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + interfaceC4583b.mo28397l(), i3, (i4 - i5) + view.getMeasuredHeight() + interfaceC4583b.mo28397l());
                return;
            }
        }
        if (this.f12535a.getFlexWrap() != 2) {
            view.layout(i, i2 + interfaceC4583b.mo28397l(), i3, i4 + interfaceC4583b.mo28397l());
        } else {
            view.layout(i, i2 - interfaceC4583b.mo28405C(), i3, i4 - interfaceC4583b.mo28405C());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m28370R(View view, C4584c c4584c, boolean z, int i, int i2, int i3, int i4) {
        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) view.getLayoutParams();
        int alignItems = this.f12535a.getAlignItems();
        if (interfaceC4583b.mo28400c() != -1) {
            alignItems = interfaceC4583b.mo28400c();
        }
        int i5 = c4584c.f12523g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C1363w.m37271b(marginLayoutParams)) - C1363w.m37272a(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - interfaceC4583b.mo28403K(), i2, ((i3 + i5) - view.getMeasuredWidth()) - interfaceC4583b.mo28403K(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + interfaceC4583b.mo28404D(), i2, (i3 - i5) + view.getMeasuredWidth() + interfaceC4583b.mo28404D(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + interfaceC4583b.mo28404D(), i2, i3 + interfaceC4583b.mo28404D(), i4);
        } else {
            view.layout(i - interfaceC4583b.mo28403K(), i2, i3 - interfaceC4583b.mo28403K(), i4);
        }
    }

    /* renamed from: S */
    long m28369S(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m28364X() {
        m28363Y(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m28363Y(int i) {
        int i2;
        View mo28410i;
        if (i >= this.f12535a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f12535a.getFlexDirection();
        if (this.f12535a.getAlignItems() == 4) {
            int[] iArr = this.f12537c;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List<C4584c> flexLinesInternal = this.f12535a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i2 < size) {
                C4584c c4584c = flexLinesInternal.get(i2);
                int i3 = c4584c.f12524h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c4584c.f12531o + i4;
                    if (i4 < this.f12535a.getFlexItemCount() && (mo28410i = this.f12535a.mo28410i(i5)) != null && mo28410i.getVisibility() != 8) {
                        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) mo28410i.getLayoutParams();
                        if (interfaceC4583b.mo28400c() == -1 || interfaceC4583b.mo28400c() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                                m28366V(mo28410i, c4584c.f12523g, i5);
                            } else {
                                m28365W(mo28410i, c4584c.f12523g, i5);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (C4584c c4584c2 : this.f12535a.getFlexLinesInternal()) {
            for (Integer num : c4584c2.f12530n) {
                View mo28410i2 = this.f12535a.mo28410i(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                    m28366V(mo28410i2, c4584c2.f12523g, num.intValue());
                } else {
                    m28365W(mo28410i2, c4584c2.f12523g, num.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m28360b(C4587b c4587b, int i, int i2, int i3, int i4, int i5, List<C4584c> list) {
        ArrayList arrayList;
        int i6;
        int i7;
        C4587b c4587b2;
        int i8;
        int i9;
        int i10;
        List<C4584c> list2;
        int i11;
        View view;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i;
        int i23 = i2;
        int i24 = i5;
        boolean mo28407l = this.f12535a.mo28407l();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        c4587b.f12540a = arrayList;
        if (i24 == -1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int m28377K = m28377K(mo28407l);
        int m28379I = m28379I(mo28407l);
        int m28378J = m28378J(mo28407l);
        int m28380H = m28380H(mo28407l);
        C4584c c4584c = new C4584c();
        int i25 = i4;
        c4584c.f12531o = i25;
        int i26 = m28379I + m28377K;
        c4584c.f12521e = i26;
        int flexItemCount = this.f12535a.getFlexItemCount();
        int i27 = i6;
        int i28 = Integer.MIN_VALUE;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            if (i25 < flexItemCount) {
                View mo28410i = this.f12535a.mo28410i(i25);
                if (mo28410i == null) {
                    if (m28374N(i25, flexItemCount, c4584c)) {
                        m28361a(arrayList, c4584c, i25, i29);
                    }
                } else if (mo28410i.getVisibility() == 8) {
                    c4584c.f12525i++;
                    c4584c.f12524h++;
                    if (m28374N(i25, flexItemCount, c4584c)) {
                        m28361a(arrayList, c4584c, i25, i29);
                    }
                } else {
                    if (mo28410i instanceof CompoundButton) {
                        m28340v((CompoundButton) mo28410i);
                    }
                    InterfaceC4583b interfaceC4583b = (InterfaceC4583b) mo28410i.getLayoutParams();
                    int i32 = flexItemCount;
                    if (interfaceC4583b.mo28400c() == 4) {
                        c4584c.f12530n.add(Integer.valueOf(i25));
                    }
                    int m28381G = m28381G(interfaceC4583b, mo28407l);
                    if (interfaceC4583b.mo28394q() != -1.0f && mode == 1073741824) {
                        m28381G = Math.round(size * interfaceC4583b.mo28394q());
                    }
                    if (mo28407l) {
                        int mo28415c = this.f12535a.mo28415c(i22, i26 + m28383E(interfaceC4583b, true) + m28385C(interfaceC4583b, true), m28381G);
                        i8 = size;
                        i9 = mode;
                        int mo28413f = this.f12535a.mo28413f(i23, m28378J + m28380H + m28384D(interfaceC4583b, true) + m28386B(interfaceC4583b, true) + i29, m28382F(interfaceC4583b, true));
                        mo28410i.measure(mo28415c, mo28413f);
                        m28362Z(i25, mo28415c, mo28413f, mo28410i);
                        i10 = mo28415c;
                    } else {
                        i8 = size;
                        i9 = mode;
                        int mo28415c2 = this.f12535a.mo28415c(i23, m28378J + m28380H + m28384D(interfaceC4583b, false) + m28386B(interfaceC4583b, false) + i29, m28382F(interfaceC4583b, false));
                        int mo28413f2 = this.f12535a.mo28413f(i22, m28383E(interfaceC4583b, false) + i26 + m28385C(interfaceC4583b, false), m28381G);
                        mo28410i.measure(mo28415c2, mo28413f2);
                        m28362Z(i25, mo28415c2, mo28413f2, mo28410i);
                        i10 = mo28413f2;
                    }
                    this.f12535a.mo28409j(i25, mo28410i);
                    m28353i(mo28410i, i25);
                    i30 = View.combineMeasuredStates(i30, mo28410i.getMeasuredState());
                    int i33 = i29;
                    int i34 = i26;
                    C4584c c4584c2 = c4584c;
                    int i35 = i25;
                    list2 = arrayList;
                    int i36 = i10;
                    if (m28372P(mo28410i, i9, i8, c4584c.f12521e, m28385C(interfaceC4583b, mo28407l) + m28375M(mo28410i, mo28407l) + m28383E(interfaceC4583b, mo28407l), interfaceC4583b, i35, i31, arrayList.size())) {
                        if (c4584c2.m28389c() > 0) {
                            if (i35 > 0) {
                                i21 = i35 - 1;
                            } else {
                                i21 = 0;
                            }
                            m28361a(list2, c4584c2, i21, i33);
                            i29 = c4584c2.f12523g + i33;
                        } else {
                            i29 = i33;
                        }
                        if (mo28407l) {
                            if (interfaceC4583b.getHeight() == -1) {
                                InterfaceC4582a interfaceC4582a = this.f12535a;
                                i11 = i2;
                                i25 = i35;
                                view = mo28410i;
                                view.measure(i36, interfaceC4582a.mo28413f(i11, interfaceC4582a.getPaddingTop() + this.f12535a.getPaddingBottom() + interfaceC4583b.mo28397l() + interfaceC4583b.mo28405C() + i29, interfaceC4583b.getHeight()));
                                m28353i(view, i25);
                            } else {
                                i11 = i2;
                                view = mo28410i;
                                i25 = i35;
                            }
                        } else {
                            i11 = i2;
                            view = mo28410i;
                            i25 = i35;
                            if (interfaceC4583b.getWidth() == -1) {
                                InterfaceC4582a interfaceC4582a2 = this.f12535a;
                                view.measure(interfaceC4582a2.mo28415c(i11, interfaceC4582a2.getPaddingLeft() + this.f12535a.getPaddingRight() + interfaceC4583b.mo28404D() + interfaceC4583b.mo28403K() + i29, interfaceC4583b.getWidth()), i36);
                                m28353i(view, i25);
                            }
                        }
                        c4584c = new C4584c();
                        i13 = 1;
                        c4584c.f12524h = 1;
                        i12 = i34;
                        c4584c.f12521e = i12;
                        c4584c.f12531o = i25;
                        i15 = Integer.MIN_VALUE;
                        i14 = 0;
                    } else {
                        i11 = i2;
                        view = mo28410i;
                        i25 = i35;
                        c4584c = c4584c2;
                        i12 = i34;
                        i13 = 1;
                        c4584c.f12524h++;
                        i14 = i31 + 1;
                        i29 = i33;
                        i15 = i28;
                    }
                    boolean z = c4584c.f12533q;
                    if (interfaceC4583b.mo28395n() != 0.0f) {
                        i16 = i13;
                    } else {
                        i16 = 0;
                    }
                    c4584c.f12533q = (z ? 1 : 0) | i16;
                    boolean z2 = c4584c.f12534r;
                    if (interfaceC4583b.mo28399f() != 0.0f) {
                        i17 = i13;
                    } else {
                        i17 = 0;
                    }
                    c4584c.f12534r = (z2 ? 1 : 0) | i17;
                    int[] iArr = this.f12537c;
                    if (iArr != null) {
                        iArr[i25] = list2.size();
                    }
                    c4584c.f12521e += m28375M(view, mo28407l) + m28383E(interfaceC4583b, mo28407l) + m28385C(interfaceC4583b, mo28407l);
                    c4584c.f12526j += interfaceC4583b.mo28395n();
                    c4584c.f12527k += interfaceC4583b.mo28399f();
                    this.f12535a.mo28416b(view, i25, i14, c4584c);
                    int max = Math.max(i15, m28376L(view, mo28407l) + m28384D(interfaceC4583b, mo28407l) + m28386B(interfaceC4583b, mo28407l) + this.f12535a.mo28412g(view));
                    c4584c.f12523g = Math.max(c4584c.f12523g, max);
                    if (mo28407l) {
                        if (this.f12535a.getFlexWrap() != 2) {
                            c4584c.f12528l = Math.max(c4584c.f12528l, view.getBaseline() + interfaceC4583b.mo28397l());
                        } else {
                            c4584c.f12528l = Math.max(c4584c.f12528l, (view.getMeasuredHeight() - view.getBaseline()) + interfaceC4583b.mo28405C());
                        }
                    }
                    i18 = i32;
                    if (m28374N(i25, i18, c4584c)) {
                        m28361a(list2, c4584c, i25, i29);
                        i29 += c4584c.f12523g;
                    }
                    i19 = i5;
                    if (i19 != -1 && list2.size() > 0 && list2.get(list2.size() - i13).f12532p >= i19 && i25 >= i19 && i27 == 0) {
                        i29 = -c4584c.m28391a();
                        i20 = i3;
                        i27 = i13;
                    } else {
                        i20 = i3;
                    }
                    if (i29 > i20 && i27 != 0) {
                        c4587b2 = c4587b;
                        i7 = i30;
                        break;
                    }
                    i31 = i14;
                    i28 = max;
                    i25++;
                    i22 = i;
                    flexItemCount = i18;
                    i23 = i11;
                    i26 = i12;
                    arrayList = list2;
                    size = i8;
                    i24 = i19;
                    mode = i9;
                }
                i8 = size;
                i9 = mode;
                i11 = i23;
                i19 = i24;
                list2 = arrayList;
                i12 = i26;
                i18 = flexItemCount;
                i25++;
                i22 = i;
                flexItemCount = i18;
                i23 = i11;
                i26 = i12;
                arrayList = list2;
                size = i8;
                i24 = i19;
                mode = i9;
            } else {
                i7 = i30;
                c4587b2 = c4587b;
                break;
            }
        }
        c4587b2.f12541b = i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m28359c(C4587b c4587b, int i, int i2) {
        m28360b(c4587b, i, i2, ViewDefaults.NUMBER_OF_LINES, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m28358d(C4587b c4587b, int i, int i2, int i3, int i4, List<C4584c> list) {
        m28360b(c4587b, i, i2, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m28357e(C4587b c4587b, int i, int i2, int i3, int i4, List<C4584c> list) {
        m28360b(c4587b, i, i2, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m28356f(C4587b c4587b, int i, int i2) {
        m28360b(c4587b, i2, i, ViewDefaults.NUMBER_OF_LINES, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m28355g(C4587b c4587b, int i, int i2, int i3, int i4, List<C4584c> list) {
        m28360b(c4587b, i2, i, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m28354h(C4587b c4587b, int i, int i2, int i3, int i4, List<C4584c> list) {
        m28360b(c4587b, i2, i, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m28352j(List<C4584c> list, int i) {
        int i2 = this.f12537c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f12537c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f12538d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] m28349m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f12535a.getFlexItemCount();
        return m28367U(flexItemCount, m28350l(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int[] m28348n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f12535a.getFlexItemCount();
        List<C4588c> m28350l = m28350l(flexItemCount);
        C4588c c4588c = new C4588c();
        if (view != null && (layoutParams instanceof InterfaceC4583b)) {
            c4588c.f12543k = ((InterfaceC4583b) layoutParams).getOrder();
        } else {
            c4588c.f12543k = 1;
        }
        if (i != -1 && i != flexItemCount) {
            if (i < this.f12535a.getFlexItemCount()) {
                c4588c.f12542j = i;
                while (i < flexItemCount) {
                    m28350l.get(i).f12542j++;
                    i++;
                }
            } else {
                c4588c.f12542j = flexItemCount;
            }
        } else {
            c4588c.f12542j = flexItemCount;
        }
        m28350l.add(c4588c);
        return m28367U(flexItemCount + 1, m28350l, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m28347o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f12535a.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        }
        List<C4584c> flexLinesInternal = this.f12535a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f12535a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f12523g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f12535a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i5) {
                                    float size2 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f = 0.0f;
                                    while (i6 < size3) {
                                        C4584c c4584c = flexLinesInternal.get(i6);
                                        float f2 = c4584c.f12523g + size2;
                                        if (i6 == flexLinesInternal.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round = Math.round(f2);
                                        f += f2 - round;
                                        if (f > 1.0f) {
                                            round++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round--;
                                            f += 1.0f;
                                        }
                                        c4584c.f12523g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize >= i5) {
                                this.f12535a.setFlexLines(m28351k(flexLinesInternal, i5, sumOfCrossSize));
                                return;
                            } else {
                                int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                C4584c c4584c2 = new C4584c();
                                c4584c2.f12523g = size4;
                                for (C4584c c4584c3 : flexLinesInternal) {
                                    arrayList.add(c4584c2);
                                    arrayList.add(c4584c3);
                                    arrayList.add(c4584c2);
                                }
                                this.f12535a.setFlexLines(arrayList);
                                return;
                            }
                        } else if (sumOfCrossSize < i5) {
                            float size5 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f3 = 0.0f;
                            while (i6 < size6) {
                                arrayList2.add(flexLinesInternal.get(i6));
                                if (i6 != flexLinesInternal.size() - 1) {
                                    C4584c c4584c4 = new C4584c();
                                    if (i6 == flexLinesInternal.size() - 2) {
                                        c4584c4.f12523g = Math.round(f3 + size5);
                                        f3 = 0.0f;
                                    } else {
                                        c4584c4.f12523g = Math.round(size5);
                                    }
                                    int i7 = c4584c4.f12523g;
                                    f3 += size5 - i7;
                                    if (f3 > 1.0f) {
                                        c4584c4.f12523g = i7 + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        c4584c4.f12523g = i7 - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList2.add(c4584c4);
                                }
                                i6++;
                            }
                            this.f12535a.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f12535a.setFlexLines(m28351k(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                int i8 = i5 - sumOfCrossSize;
                C4584c c4584c5 = new C4584c();
                c4584c5.f12523g = i8;
                flexLinesInternal.add(0, c4584c5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m28346p(int i, int i2) {
        m28345q(i, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m28345q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        m28344r(this.f12535a.getFlexItemCount());
        if (i3 >= this.f12535a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f12535a.getFlexDirection();
        int flexDirection2 = this.f12535a.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.f12535a.getLargestMainSize();
            }
            paddingLeft = this.f12535a.getPaddingTop();
            paddingRight = this.f12535a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.f12535a.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f12535a.getPaddingLeft();
            paddingRight = this.f12535a.getPaddingRight();
        }
        int i5 = paddingLeft + paddingRight;
        int[] iArr = this.f12537c;
        if (iArr != null) {
            i4 = iArr[i3];
        } else {
            i4 = 0;
        }
        List<C4584c> flexLinesInternal = this.f12535a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i4 < size2) {
            C4584c c4584c = flexLinesInternal.get(i4);
            int i6 = c4584c.f12521e;
            if (i6 < size && c4584c.f12533q) {
                m28339w(i, i2, c4584c, size, i5, false);
            } else if (i6 > size && c4584c.f12534r) {
                m28368T(i, i2, c4584c, size, i5, false);
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m28343s(int i) {
        int[] iArr = this.f12537c;
        if (iArr == null) {
            this.f12537c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f12537c = Arrays.copyOf(this.f12537c, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m28342t(int i) {
        long[] jArr = this.f12538d;
        if (jArr == null) {
            this.f12538d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f12538d = Arrays.copyOf(this.f12538d, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m28341u(int i) {
        long[] jArr = this.f12539e;
        if (jArr == null) {
            this.f12539e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f12539e = Arrays.copyOf(this.f12539e, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m28338x(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public int m28337y(long j) {
        return (int) j;
    }
}
