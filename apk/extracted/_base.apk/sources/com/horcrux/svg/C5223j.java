package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5223j {

    /* renamed from: A */
    private double[] f14691A;

    /* renamed from: B */
    private int f14692B;

    /* renamed from: C */
    private int f14693C;

    /* renamed from: D */
    private int f14694D;

    /* renamed from: E */
    private int f14695E;

    /* renamed from: F */
    private int f14696F;

    /* renamed from: G */
    private int f14697G;

    /* renamed from: H */
    private int f14698H;

    /* renamed from: I */
    private int f14699I;

    /* renamed from: J */
    private int f14700J;

    /* renamed from: K */
    private int f14701K;

    /* renamed from: L */
    private int f14702L;

    /* renamed from: M */
    private final float f14703M;

    /* renamed from: N */
    private final float f14704N;

    /* renamed from: O */
    private final float f14705O;

    /* renamed from: a */
    final ArrayList<C5218h> f14706a;

    /* renamed from: b */
    private final ArrayList<SVGLength[]> f14707b;

    /* renamed from: c */
    private final ArrayList<SVGLength[]> f14708c;

    /* renamed from: d */
    private final ArrayList<SVGLength[]> f14709d;

    /* renamed from: e */
    private final ArrayList<SVGLength[]> f14710e;

    /* renamed from: f */
    private final ArrayList<double[]> f14711f;

    /* renamed from: g */
    private final ArrayList<Integer> f14712g;

    /* renamed from: h */
    private final ArrayList<Integer> f14713h;

    /* renamed from: i */
    private final ArrayList<Integer> f14714i;

    /* renamed from: j */
    private final ArrayList<Integer> f14715j;

    /* renamed from: k */
    private final ArrayList<Integer> f14716k;

    /* renamed from: l */
    private final ArrayList<Integer> f14717l;

    /* renamed from: m */
    private final ArrayList<Integer> f14718m;

    /* renamed from: n */
    private final ArrayList<Integer> f14719n;

    /* renamed from: o */
    private final ArrayList<Integer> f14720o;

    /* renamed from: p */
    private final ArrayList<Integer> f14721p;

    /* renamed from: q */
    private double f14722q;

    /* renamed from: r */
    private C5218h f14723r;

    /* renamed from: s */
    private double f14724s;

    /* renamed from: t */
    private double f14725t;

    /* renamed from: u */
    private double f14726u;

    /* renamed from: v */
    private double f14727v;

    /* renamed from: w */
    private SVGLength[] f14728w;

    /* renamed from: x */
    private SVGLength[] f14729x;

    /* renamed from: y */
    private SVGLength[] f14730y;

    /* renamed from: z */
    private SVGLength[] f14731z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5223j(float f, float f2, float f3) {
        ArrayList<C5218h> arrayList = new ArrayList<>();
        this.f14706a = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.f14707b = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.f14708c = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.f14709d = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.f14710e = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.f14711f = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.f14712g = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.f14713h = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.f14714i = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.f14715j = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.f14716k = arrayList11;
        this.f14717l = new ArrayList<>();
        this.f14718m = new ArrayList<>();
        this.f14719n = new ArrayList<>();
        this.f14720o = new ArrayList<>();
        this.f14721p = new ArrayList<>();
        this.f14722q = 12.0d;
        this.f14723r = C5218h.f14642p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.f14728w = sVGLengthArr;
        this.f14729x = new SVGLength[0];
        this.f14730y = new SVGLength[0];
        this.f14731z = new SVGLength[0];
        this.f14691A = new double[]{0.0d};
        this.f14697G = -1;
        this.f14698H = -1;
        this.f14699I = -1;
        this.f14700J = -1;
        this.f14701K = -1;
        this.f14703M = f;
        this.f14704N = f2;
        this.f14705O = f3;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.f14729x);
        arrayList4.add(this.f14730y);
        arrayList5.add(this.f14731z);
        arrayList6.add(this.f14691A);
        arrayList7.add(Integer.valueOf(this.f14697G));
        arrayList8.add(Integer.valueOf(this.f14698H));
        arrayList9.add(Integer.valueOf(this.f14699I));
        arrayList10.add(Integer.valueOf(this.f14700J));
        arrayList11.add(Integer.valueOf(this.f14701K));
        arrayList.add(this.f14723r);
        m25842q();
    }

    /* renamed from: a */
    private double[] m25858a(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).f14534a;
        }
        return dArr;
    }

    /* renamed from: e */
    private SVGLength[] m25854e(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i = 0; i < size; i++) {
            sVGLengthArr[i] = arrayList.get(i);
        }
        return sVGLengthArr;
    }

    /* renamed from: f */
    private C5218h m25853f(C5227l c5227l) {
        if (this.f14702L > 0) {
            return this.f14723r;
        }
        for (C5227l parentTextRoot = c5227l.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            C5218h m25857b = parentTextRoot.m25835d().m25857b();
            if (m25857b != C5218h.f14642p) {
                return m25857b;
            }
        }
        return C5218h.f14642p;
    }

    /* renamed from: h */
    private static void m25851h(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    /* renamed from: q */
    private void m25842q() {
        this.f14717l.add(Integer.valueOf(this.f14692B));
        this.f14718m.add(Integer.valueOf(this.f14693C));
        this.f14719n.add(Integer.valueOf(this.f14694D));
        this.f14720o.add(Integer.valueOf(this.f14695E));
        this.f14721p.add(Integer.valueOf(this.f14696F));
    }

    /* renamed from: r */
    private void m25841r(C5227l c5227l, ReadableMap readableMap) {
        C5218h m25853f = m25853f(c5227l);
        this.f14702L++;
        if (readableMap == null) {
            this.f14706a.add(m25853f);
            return;
        }
        C5218h c5218h = new C5218h(readableMap, m25853f, this.f14703M);
        this.f14722q = c5218h.f14643a;
        this.f14706a.add(c5218h);
        this.f14723r = c5218h;
    }

    /* renamed from: s */
    private void m25840s() {
        this.f14696F = 0;
        this.f14695E = 0;
        this.f14694D = 0;
        this.f14693C = 0;
        this.f14692B = 0;
        this.f14701K = -1;
        this.f14700J = -1;
        this.f14699I = -1;
        this.f14698H = -1;
        this.f14697G = -1;
        this.f14727v = 0.0d;
        this.f14726u = 0.0d;
        this.f14725t = 0.0d;
        this.f14724s = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C5218h m25857b() {
        return this.f14723r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public double m25856c() {
        return this.f14722q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m25855d() {
        return this.f14705O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m25852g() {
        return this.f14704N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public double m25850i() {
        m25851h(this.f14714i, this.f14694D);
        int i = this.f14699I + 1;
        SVGLength[] sVGLengthArr = this.f14730y;
        if (i < sVGLengthArr.length) {
            this.f14699I = i;
            this.f14726u += C5250x.m25663a(sVGLengthArr[i], this.f14704N, 0.0d, this.f14703M, this.f14722q);
        }
        return this.f14726u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public double m25849j() {
        m25851h(this.f14715j, this.f14695E);
        int i = this.f14700J + 1;
        SVGLength[] sVGLengthArr = this.f14731z;
        if (i < sVGLengthArr.length) {
            this.f14700J = i;
            this.f14727v += C5250x.m25663a(sVGLengthArr[i], this.f14705O, 0.0d, this.f14703M, this.f14722q);
        }
        return this.f14727v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public double m25848k() {
        m25851h(this.f14716k, this.f14696F);
        int min = Math.min(this.f14701K + 1, this.f14691A.length - 1);
        this.f14701K = min;
        return this.f14691A[min];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public double m25847l(double d) {
        m25851h(this.f14712g, this.f14692B);
        int i = this.f14697G + 1;
        SVGLength[] sVGLengthArr = this.f14728w;
        if (i < sVGLengthArr.length) {
            this.f14726u = 0.0d;
            this.f14697G = i;
            this.f14724s = C5250x.m25663a(sVGLengthArr[i], this.f14704N, 0.0d, this.f14703M, this.f14722q);
        }
        double d2 = this.f14724s + d;
        this.f14724s = d2;
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public double m25846m() {
        m25851h(this.f14713h, this.f14693C);
        int i = this.f14698H + 1;
        SVGLength[] sVGLengthArr = this.f14729x;
        if (i < sVGLengthArr.length) {
            this.f14727v = 0.0d;
            this.f14698H = i;
            this.f14725t = C5250x.m25663a(sVGLengthArr[i], this.f14705O, 0.0d, this.f14703M, this.f14722q);
        }
        return this.f14725t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m25845n() {
        this.f14706a.remove(this.f14702L);
        this.f14717l.remove(this.f14702L);
        this.f14718m.remove(this.f14702L);
        this.f14719n.remove(this.f14702L);
        this.f14720o.remove(this.f14702L);
        this.f14721p.remove(this.f14702L);
        int i = this.f14702L - 1;
        this.f14702L = i;
        int i2 = this.f14692B;
        int i3 = this.f14693C;
        int i4 = this.f14694D;
        int i5 = this.f14695E;
        int i6 = this.f14696F;
        this.f14723r = this.f14706a.get(i);
        this.f14692B = this.f14717l.get(this.f14702L).intValue();
        this.f14693C = this.f14718m.get(this.f14702L).intValue();
        this.f14694D = this.f14719n.get(this.f14702L).intValue();
        this.f14695E = this.f14720o.get(this.f14702L).intValue();
        this.f14696F = this.f14721p.get(this.f14702L).intValue();
        if (i2 != this.f14692B) {
            this.f14707b.remove(i2);
            this.f14728w = this.f14707b.get(this.f14692B);
            this.f14697G = this.f14712g.get(this.f14692B).intValue();
        }
        if (i3 != this.f14693C) {
            this.f14708c.remove(i3);
            this.f14729x = this.f14708c.get(this.f14693C);
            this.f14698H = this.f14713h.get(this.f14693C).intValue();
        }
        if (i4 != this.f14694D) {
            this.f14709d.remove(i4);
            this.f14730y = this.f14709d.get(this.f14694D);
            this.f14699I = this.f14714i.get(this.f14694D).intValue();
        }
        if (i5 != this.f14695E) {
            this.f14710e.remove(i5);
            this.f14731z = this.f14710e.get(this.f14695E);
            this.f14700J = this.f14715j.get(this.f14695E).intValue();
        }
        if (i6 != this.f14696F) {
            this.f14711f.remove(i6);
            this.f14691A = this.f14711f.get(this.f14696F);
            this.f14701K = this.f14716k.get(this.f14696F).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m25844o(C5227l c5227l, ReadableMap readableMap) {
        m25841r(c5227l, readableMap);
        m25842q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m25843p(boolean z, C5244t0 c5244t0, ReadableMap readableMap, ArrayList<SVGLength> arrayList, ArrayList<SVGLength> arrayList2, ArrayList<SVGLength> arrayList3, ArrayList<SVGLength> arrayList4, ArrayList<SVGLength> arrayList5) {
        if (z) {
            m25840s();
        }
        m25841r(c5244t0, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.f14692B++;
            this.f14697G = -1;
            this.f14712g.add(-1);
            SVGLength[] m25854e = m25854e(arrayList);
            this.f14728w = m25854e;
            this.f14707b.add(m25854e);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.f14693C++;
            this.f14698H = -1;
            this.f14713h.add(-1);
            SVGLength[] m25854e2 = m25854e(arrayList2);
            this.f14729x = m25854e2;
            this.f14708c.add(m25854e2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.f14694D++;
            this.f14699I = -1;
            this.f14714i.add(-1);
            SVGLength[] m25854e3 = m25854e(arrayList3);
            this.f14730y = m25854e3;
            this.f14709d.add(m25854e3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.f14695E++;
            this.f14700J = -1;
            this.f14715j.add(-1);
            SVGLength[] m25854e4 = m25854e(arrayList4);
            this.f14731z = m25854e4;
            this.f14710e.add(m25854e4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.f14696F++;
            this.f14701K = -1;
            this.f14716k.add(-1);
            double[] m25858a = m25858a(arrayList5);
            this.f14691A = m25858a;
            this.f14711f.add(m25858a);
        }
        m25842q();
    }
}
