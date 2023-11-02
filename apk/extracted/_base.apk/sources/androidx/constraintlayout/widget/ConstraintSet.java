package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0674c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p252o.C10919a;
import p273p.C11362a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ConstraintSet {

    /* renamed from: d */
    private static final int[] f2479d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f2480e;

    /* renamed from: a */
    private HashMap<String, C0670a> f2481a = new HashMap<>();

    /* renamed from: b */
    private boolean f2482b = true;

    /* renamed from: c */
    private HashMap<Integer, C0665a> f2483c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0665a {

        /* renamed from: a */
        int f2484a;

        /* renamed from: b */
        public final C0668d f2485b = new C0668d();

        /* renamed from: c */
        public final C0667c f2486c = new C0667c();

        /* renamed from: d */
        public final C0666b f2487d = new C0666b();

        /* renamed from: e */
        public final C0669e f2488e = new C0669e();

        /* renamed from: f */
        public HashMap<String, C0670a> f2489f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m39262f(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2484a = i;
            C0666b c0666b = this.f2487d;
            c0666b.f2531h = layoutParams.f2417d;
            c0666b.f2533i = layoutParams.f2419e;
            c0666b.f2535j = layoutParams.f2421f;
            c0666b.f2537k = layoutParams.f2423g;
            c0666b.f2538l = layoutParams.f2425h;
            c0666b.f2539m = layoutParams.f2427i;
            c0666b.f2540n = layoutParams.f2429j;
            c0666b.f2541o = layoutParams.f2431k;
            c0666b.f2542p = layoutParams.f2433l;
            c0666b.f2543q = layoutParams.f2441p;
            c0666b.f2544r = layoutParams.f2442q;
            c0666b.f2545s = layoutParams.f2443r;
            c0666b.f2546t = layoutParams.f2444s;
            c0666b.f2547u = layoutParams.f2451z;
            c0666b.f2548v = layoutParams.f2385A;
            c0666b.f2549w = layoutParams.f2386B;
            c0666b.f2550x = layoutParams.f2435m;
            c0666b.f2551y = layoutParams.f2437n;
            c0666b.f2552z = layoutParams.f2439o;
            c0666b.f2491A = layoutParams.f2401Q;
            c0666b.f2492B = layoutParams.f2402R;
            c0666b.f2493C = layoutParams.f2403S;
            c0666b.f2529g = layoutParams.f2415c;
            c0666b.f2525e = layoutParams.f2411a;
            c0666b.f2527f = layoutParams.f2413b;
            c0666b.f2521c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            c0666b.f2523d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            c0666b.f2494D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            c0666b.f2495E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            c0666b.f2496F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            c0666b.f2497G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            c0666b.f2506P = layoutParams.f2390F;
            c0666b.f2507Q = layoutParams.f2389E;
            c0666b.f2509S = layoutParams.f2392H;
            c0666b.f2508R = layoutParams.f2391G;
            c0666b.f2532h0 = layoutParams.f2404T;
            c0666b.f2534i0 = layoutParams.f2405U;
            c0666b.f2510T = layoutParams.f2393I;
            c0666b.f2511U = layoutParams.f2394J;
            c0666b.f2512V = layoutParams.f2397M;
            c0666b.f2513W = layoutParams.f2398N;
            c0666b.f2514X = layoutParams.f2395K;
            c0666b.f2515Y = layoutParams.f2396L;
            c0666b.f2516Z = layoutParams.f2399O;
            c0666b.f2518a0 = layoutParams.f2400P;
            c0666b.f2530g0 = layoutParams.f2406V;
            c0666b.f2501K = layoutParams.f2446u;
            c0666b.f2503M = layoutParams.f2448w;
            c0666b.f2500J = layoutParams.f2445t;
            c0666b.f2502L = layoutParams.f2447v;
            c0666b.f2505O = layoutParams.f2449x;
            c0666b.f2504N = layoutParams.f2450y;
            c0666b.f2498H = layoutParams.getMarginEnd();
            this.f2487d.f2499I = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m39261g(int i, C0674c.C0675a c0675a) {
            m39262f(i, c0675a);
            this.f2485b.f2564d = c0675a.f2607p0;
            C0669e c0669e = this.f2488e;
            c0669e.f2568b = c0675a.f2610s0;
            c0669e.f2569c = c0675a.f2611t0;
            c0669e.f2570d = c0675a.f2612u0;
            c0669e.f2571e = c0675a.f2613v0;
            c0669e.f2572f = c0675a.f2614w0;
            c0669e.f2573g = c0675a.f2615x0;
            c0669e.f2574h = c0675a.f2616y0;
            c0669e.f2575i = c0675a.f2617z0;
            c0669e.f2576j = c0675a.f2605A0;
            c0669e.f2577k = c0675a.f2606B0;
            c0669e.f2579m = c0675a.f2609r0;
            c0669e.f2578l = c0675a.f2608q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m39260h(AbstractC0673b abstractC0673b, int i, C0674c.C0675a c0675a) {
            m39261g(i, c0675a);
            if (abstractC0673b instanceof Barrier) {
                C0666b c0666b = this.f2487d;
                c0666b.f2524d0 = 1;
                Barrier barrier = (Barrier) abstractC0673b;
                c0666b.f2520b0 = barrier.getType();
                this.f2487d.f2526e0 = barrier.getReferencedIds();
                this.f2487d.f2522c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m39264d(ConstraintLayout.LayoutParams layoutParams) {
            C0666b c0666b = this.f2487d;
            layoutParams.f2417d = c0666b.f2531h;
            layoutParams.f2419e = c0666b.f2533i;
            layoutParams.f2421f = c0666b.f2535j;
            layoutParams.f2423g = c0666b.f2537k;
            layoutParams.f2425h = c0666b.f2538l;
            layoutParams.f2427i = c0666b.f2539m;
            layoutParams.f2429j = c0666b.f2540n;
            layoutParams.f2431k = c0666b.f2541o;
            layoutParams.f2433l = c0666b.f2542p;
            layoutParams.f2441p = c0666b.f2543q;
            layoutParams.f2442q = c0666b.f2544r;
            layoutParams.f2443r = c0666b.f2545s;
            layoutParams.f2444s = c0666b.f2546t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = c0666b.f2494D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = c0666b.f2495E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c0666b.f2496F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c0666b.f2497G;
            layoutParams.f2449x = c0666b.f2505O;
            layoutParams.f2450y = c0666b.f2504N;
            layoutParams.f2446u = c0666b.f2501K;
            layoutParams.f2448w = c0666b.f2503M;
            layoutParams.f2451z = c0666b.f2547u;
            layoutParams.f2385A = c0666b.f2548v;
            layoutParams.f2435m = c0666b.f2550x;
            layoutParams.f2437n = c0666b.f2551y;
            layoutParams.f2439o = c0666b.f2552z;
            layoutParams.f2386B = c0666b.f2549w;
            layoutParams.f2401Q = c0666b.f2491A;
            layoutParams.f2402R = c0666b.f2492B;
            layoutParams.f2390F = c0666b.f2506P;
            layoutParams.f2389E = c0666b.f2507Q;
            layoutParams.f2392H = c0666b.f2509S;
            layoutParams.f2391G = c0666b.f2508R;
            layoutParams.f2404T = c0666b.f2532h0;
            layoutParams.f2405U = c0666b.f2534i0;
            layoutParams.f2393I = c0666b.f2510T;
            layoutParams.f2394J = c0666b.f2511U;
            layoutParams.f2397M = c0666b.f2512V;
            layoutParams.f2398N = c0666b.f2513W;
            layoutParams.f2395K = c0666b.f2514X;
            layoutParams.f2396L = c0666b.f2515Y;
            layoutParams.f2399O = c0666b.f2516Z;
            layoutParams.f2400P = c0666b.f2518a0;
            layoutParams.f2403S = c0666b.f2493C;
            layoutParams.f2415c = c0666b.f2529g;
            layoutParams.f2411a = c0666b.f2525e;
            layoutParams.f2413b = c0666b.f2527f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = c0666b.f2521c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = c0666b.f2523d;
            String str = c0666b.f2530g0;
            if (str != null) {
                layoutParams.f2406V = str;
            }
            layoutParams.setMarginStart(c0666b.f2499I);
            layoutParams.setMarginEnd(this.f2487d.f2498H);
            layoutParams.m39292a();
        }

        /* renamed from: e */
        public C0665a clone() {
            C0665a c0665a = new C0665a();
            c0665a.f2487d.m39259a(this.f2487d);
            c0665a.f2486c.m39257a(this.f2486c);
            c0665a.f2485b.m39255a(this.f2485b);
            c0665a.f2488e.m39253a(this.f2488e);
            c0665a.f2484a = this.f2484a;
            return c0665a;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0666b {

        /* renamed from: k0 */
        private static SparseIntArray f2490k0;

        /* renamed from: c */
        public int f2521c;

        /* renamed from: d */
        public int f2523d;

        /* renamed from: e0 */
        public int[] f2526e0;

        /* renamed from: f0 */
        public String f2528f0;

        /* renamed from: g0 */
        public String f2530g0;

        /* renamed from: a */
        public boolean f2517a = false;

        /* renamed from: b */
        public boolean f2519b = false;

        /* renamed from: e */
        public int f2525e = -1;

        /* renamed from: f */
        public int f2527f = -1;

        /* renamed from: g */
        public float f2529g = -1.0f;

        /* renamed from: h */
        public int f2531h = -1;

        /* renamed from: i */
        public int f2533i = -1;

        /* renamed from: j */
        public int f2535j = -1;

        /* renamed from: k */
        public int f2537k = -1;

        /* renamed from: l */
        public int f2538l = -1;

        /* renamed from: m */
        public int f2539m = -1;

        /* renamed from: n */
        public int f2540n = -1;

        /* renamed from: o */
        public int f2541o = -1;

        /* renamed from: p */
        public int f2542p = -1;

        /* renamed from: q */
        public int f2543q = -1;

        /* renamed from: r */
        public int f2544r = -1;

        /* renamed from: s */
        public int f2545s = -1;

        /* renamed from: t */
        public int f2546t = -1;

        /* renamed from: u */
        public float f2547u = 0.5f;

        /* renamed from: v */
        public float f2548v = 0.5f;

        /* renamed from: w */
        public String f2549w = null;

        /* renamed from: x */
        public int f2550x = -1;

        /* renamed from: y */
        public int f2551y = 0;

        /* renamed from: z */
        public float f2552z = 0.0f;

        /* renamed from: A */
        public int f2491A = -1;

        /* renamed from: B */
        public int f2492B = -1;

        /* renamed from: C */
        public int f2493C = -1;

        /* renamed from: D */
        public int f2494D = -1;

        /* renamed from: E */
        public int f2495E = -1;

        /* renamed from: F */
        public int f2496F = -1;

        /* renamed from: G */
        public int f2497G = -1;

        /* renamed from: H */
        public int f2498H = -1;

        /* renamed from: I */
        public int f2499I = -1;

        /* renamed from: J */
        public int f2500J = -1;

        /* renamed from: K */
        public int f2501K = -1;

        /* renamed from: L */
        public int f2502L = -1;

        /* renamed from: M */
        public int f2503M = -1;

        /* renamed from: N */
        public int f2504N = -1;

        /* renamed from: O */
        public int f2505O = -1;

        /* renamed from: P */
        public float f2506P = -1.0f;

        /* renamed from: Q */
        public float f2507Q = -1.0f;

        /* renamed from: R */
        public int f2508R = 0;

        /* renamed from: S */
        public int f2509S = 0;

        /* renamed from: T */
        public int f2510T = 0;

        /* renamed from: U */
        public int f2511U = 0;

        /* renamed from: V */
        public int f2512V = -1;

        /* renamed from: W */
        public int f2513W = -1;

        /* renamed from: X */
        public int f2514X = -1;

        /* renamed from: Y */
        public int f2515Y = -1;

        /* renamed from: Z */
        public float f2516Z = 1.0f;

        /* renamed from: a0 */
        public float f2518a0 = 1.0f;

        /* renamed from: b0 */
        public int f2520b0 = -1;

        /* renamed from: c0 */
        public int f2522c0 = 0;

        /* renamed from: d0 */
        public int f2524d0 = -1;

        /* renamed from: h0 */
        public boolean f2532h0 = false;

        /* renamed from: i0 */
        public boolean f2534i0 = false;

        /* renamed from: j0 */
        public boolean f2536j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2490k0 = sparseIntArray;
            sparseIntArray.append(C0678f.f2649E3, 24);
            f2490k0.append(C0678f.f2655F3, 25);
            f2490k0.append(C0678f.f2667H3, 28);
            f2490k0.append(C0678f.f2673I3, 29);
            f2490k0.append(C0678f.f2703N3, 35);
            f2490k0.append(C0678f.f2697M3, 34);
            f2490k0.append(C0678f.f2880p3, 4);
            f2490k0.append(C0678f.f2874o3, 3);
            f2490k0.append(C0678f.f2862m3, 1);
            f2490k0.append(C0678f.f2733S3, 6);
            f2490k0.append(C0678f.f2739T3, 7);
            f2490k0.append(C0678f.f2922w3, 17);
            f2490k0.append(C0678f.f2928x3, 18);
            f2490k0.append(C0678f.f2934y3, 19);
            f2490k0.append(C0678f.f2762X2, 26);
            f2490k0.append(C0678f.f2679J3, 31);
            f2490k0.append(C0678f.f2685K3, 32);
            f2490k0.append(C0678f.f2916v3, 10);
            f2490k0.append(C0678f.f2910u3, 9);
            f2490k0.append(C0678f.f2757W3, 13);
            f2490k0.append(C0678f.f2775Z3, 16);
            f2490k0.append(C0678f.f2763X3, 14);
            f2490k0.append(C0678f.f2745U3, 11);
            f2490k0.append(C0678f.f2769Y3, 15);
            f2490k0.append(C0678f.f2751V3, 12);
            f2490k0.append(C0678f.f2721Q3, 38);
            f2490k0.append(C0678f.f2637C3, 37);
            f2490k0.append(C0678f.f2631B3, 39);
            f2490k0.append(C0678f.f2715P3, 40);
            f2490k0.append(C0678f.f2625A3, 20);
            f2490k0.append(C0678f.f2709O3, 36);
            f2490k0.append(C0678f.f2904t3, 5);
            f2490k0.append(C0678f.f2643D3, 76);
            f2490k0.append(C0678f.f2691L3, 76);
            f2490k0.append(C0678f.f2661G3, 76);
            f2490k0.append(C0678f.f2868n3, 76);
            f2490k0.append(C0678f.f2856l3, 76);
            f2490k0.append(C0678f.f2781a3, 23);
            f2490k0.append(C0678f.f2795c3, 27);
            f2490k0.append(C0678f.f2809e3, 30);
            f2490k0.append(C0678f.f2816f3, 8);
            f2490k0.append(C0678f.f2788b3, 33);
            f2490k0.append(C0678f.f2802d3, 2);
            f2490k0.append(C0678f.f2768Y2, 22);
            f2490k0.append(C0678f.f2774Z2, 21);
            f2490k0.append(C0678f.f2886q3, 61);
            f2490k0.append(C0678f.f2898s3, 62);
            f2490k0.append(C0678f.f2892r3, 63);
            f2490k0.append(C0678f.f2727R3, 69);
            f2490k0.append(C0678f.f2940z3, 70);
            f2490k0.append(C0678f.f2844j3, 71);
            f2490k0.append(C0678f.f2830h3, 72);
            f2490k0.append(C0678f.f2837i3, 73);
            f2490k0.append(C0678f.f2850k3, 74);
            f2490k0.append(C0678f.f2823g3, 75);
        }

        /* renamed from: a */
        public void m39259a(C0666b c0666b) {
            this.f2517a = c0666b.f2517a;
            this.f2521c = c0666b.f2521c;
            this.f2519b = c0666b.f2519b;
            this.f2523d = c0666b.f2523d;
            this.f2525e = c0666b.f2525e;
            this.f2527f = c0666b.f2527f;
            this.f2529g = c0666b.f2529g;
            this.f2531h = c0666b.f2531h;
            this.f2533i = c0666b.f2533i;
            this.f2535j = c0666b.f2535j;
            this.f2537k = c0666b.f2537k;
            this.f2538l = c0666b.f2538l;
            this.f2539m = c0666b.f2539m;
            this.f2540n = c0666b.f2540n;
            this.f2541o = c0666b.f2541o;
            this.f2542p = c0666b.f2542p;
            this.f2543q = c0666b.f2543q;
            this.f2544r = c0666b.f2544r;
            this.f2545s = c0666b.f2545s;
            this.f2546t = c0666b.f2546t;
            this.f2547u = c0666b.f2547u;
            this.f2548v = c0666b.f2548v;
            this.f2549w = c0666b.f2549w;
            this.f2550x = c0666b.f2550x;
            this.f2551y = c0666b.f2551y;
            this.f2552z = c0666b.f2552z;
            this.f2491A = c0666b.f2491A;
            this.f2492B = c0666b.f2492B;
            this.f2493C = c0666b.f2493C;
            this.f2494D = c0666b.f2494D;
            this.f2495E = c0666b.f2495E;
            this.f2496F = c0666b.f2496F;
            this.f2497G = c0666b.f2497G;
            this.f2498H = c0666b.f2498H;
            this.f2499I = c0666b.f2499I;
            this.f2500J = c0666b.f2500J;
            this.f2501K = c0666b.f2501K;
            this.f2502L = c0666b.f2502L;
            this.f2503M = c0666b.f2503M;
            this.f2504N = c0666b.f2504N;
            this.f2505O = c0666b.f2505O;
            this.f2506P = c0666b.f2506P;
            this.f2507Q = c0666b.f2507Q;
            this.f2508R = c0666b.f2508R;
            this.f2509S = c0666b.f2509S;
            this.f2510T = c0666b.f2510T;
            this.f2511U = c0666b.f2511U;
            this.f2512V = c0666b.f2512V;
            this.f2513W = c0666b.f2513W;
            this.f2514X = c0666b.f2514X;
            this.f2515Y = c0666b.f2515Y;
            this.f2516Z = c0666b.f2516Z;
            this.f2518a0 = c0666b.f2518a0;
            this.f2520b0 = c0666b.f2520b0;
            this.f2522c0 = c0666b.f2522c0;
            this.f2524d0 = c0666b.f2524d0;
            this.f2530g0 = c0666b.f2530g0;
            int[] iArr = c0666b.f2526e0;
            if (iArr != null) {
                this.f2526e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2526e0 = null;
            }
            this.f2528f0 = c0666b.f2528f0;
            this.f2532h0 = c0666b.f2532h0;
            this.f2534i0 = c0666b.f2534i0;
            this.f2536j0 = c0666b.f2536j0;
        }

        /* renamed from: b */
        void m39258b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2756W2);
            this.f2519b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2490k0.get(index);
                if (i2 != 80) {
                    if (i2 != 81) {
                        switch (i2) {
                            case 1:
                                this.f2542p = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2542p);
                                continue;
                            case 2:
                                this.f2497G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2497G);
                                continue;
                            case 3:
                                this.f2541o = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2541o);
                                continue;
                            case 4:
                                this.f2540n = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2540n);
                                continue;
                            case 5:
                                this.f2549w = obtainStyledAttributes.getString(index);
                                continue;
                            case 6:
                                this.f2491A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2491A);
                                continue;
                            case 7:
                                this.f2492B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2492B);
                                continue;
                            case 8:
                                this.f2498H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2498H);
                                continue;
                            case 9:
                                this.f2546t = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2546t);
                                continue;
                            case 10:
                                this.f2545s = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2545s);
                                continue;
                            case 11:
                                this.f2503M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2503M);
                                continue;
                            case 12:
                                this.f2504N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2504N);
                                continue;
                            case 13:
                                this.f2500J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2500J);
                                continue;
                            case 14:
                                this.f2502L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2502L);
                                continue;
                            case 15:
                                this.f2505O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2505O);
                                continue;
                            case 16:
                                this.f2501K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2501K);
                                continue;
                            case 17:
                                this.f2525e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2525e);
                                continue;
                            case 18:
                                this.f2527f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2527f);
                                continue;
                            case 19:
                                this.f2529g = obtainStyledAttributes.getFloat(index, this.f2529g);
                                continue;
                            case 20:
                                this.f2547u = obtainStyledAttributes.getFloat(index, this.f2547u);
                                continue;
                            case 21:
                                this.f2523d = obtainStyledAttributes.getLayoutDimension(index, this.f2523d);
                                continue;
                            case 22:
                                this.f2521c = obtainStyledAttributes.getLayoutDimension(index, this.f2521c);
                                continue;
                            case 23:
                                this.f2494D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2494D);
                                continue;
                            case 24:
                                this.f2531h = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2531h);
                                continue;
                            case 25:
                                this.f2533i = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2533i);
                                continue;
                            case 26:
                                this.f2493C = obtainStyledAttributes.getInt(index, this.f2493C);
                                continue;
                            case 27:
                                this.f2495E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2495E);
                                continue;
                            case 28:
                                this.f2535j = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2535j);
                                continue;
                            case 29:
                                this.f2537k = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2537k);
                                continue;
                            case 30:
                                this.f2499I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2499I);
                                continue;
                            case 31:
                                this.f2543q = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2543q);
                                continue;
                            case 32:
                                this.f2544r = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2544r);
                                continue;
                            case 33:
                                this.f2496F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2496F);
                                continue;
                            case 34:
                                this.f2539m = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2539m);
                                continue;
                            case 35:
                                this.f2538l = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2538l);
                                continue;
                            case 36:
                                this.f2548v = obtainStyledAttributes.getFloat(index, this.f2548v);
                                continue;
                            case 37:
                                this.f2507Q = obtainStyledAttributes.getFloat(index, this.f2507Q);
                                continue;
                            case 38:
                                this.f2506P = obtainStyledAttributes.getFloat(index, this.f2506P);
                                continue;
                            case 39:
                                this.f2508R = obtainStyledAttributes.getInt(index, this.f2508R);
                                continue;
                            case 40:
                                this.f2509S = obtainStyledAttributes.getInt(index, this.f2509S);
                                continue;
                            default:
                                switch (i2) {
                                    case 54:
                                        this.f2510T = obtainStyledAttributes.getInt(index, this.f2510T);
                                        continue;
                                    case 55:
                                        this.f2511U = obtainStyledAttributes.getInt(index, this.f2511U);
                                        continue;
                                    case 56:
                                        this.f2512V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2512V);
                                        continue;
                                    case 57:
                                        this.f2513W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2513W);
                                        continue;
                                    case 58:
                                        this.f2514X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2514X);
                                        continue;
                                    case 59:
                                        this.f2515Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2515Y);
                                        continue;
                                    default:
                                        switch (i2) {
                                            case 61:
                                                this.f2550x = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2550x);
                                                continue;
                                            case 62:
                                                this.f2551y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2551y);
                                                continue;
                                            case 63:
                                                this.f2552z = obtainStyledAttributes.getFloat(index, this.f2552z);
                                                continue;
                                            default:
                                                switch (i2) {
                                                    case 69:
                                                        this.f2516Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                        continue;
                                                    case 70:
                                                        this.f2518a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                        continue;
                                                    case 71:
                                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                        continue;
                                                    case 72:
                                                        this.f2520b0 = obtainStyledAttributes.getInt(index, this.f2520b0);
                                                        continue;
                                                    case 73:
                                                        this.f2522c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2522c0);
                                                        continue;
                                                    case 74:
                                                        this.f2528f0 = obtainStyledAttributes.getString(index);
                                                        continue;
                                                    case 75:
                                                        this.f2536j0 = obtainStyledAttributes.getBoolean(index, this.f2536j0);
                                                        continue;
                                                    case 76:
                                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2490k0.get(index));
                                                        continue;
                                                    case 77:
                                                        this.f2530g0 = obtainStyledAttributes.getString(index);
                                                        continue;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2490k0.get(index));
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                        }
                                }
                        }
                    } else {
                        this.f2534i0 = obtainStyledAttributes.getBoolean(index, this.f2534i0);
                    }
                } else {
                    this.f2532h0 = obtainStyledAttributes.getBoolean(index, this.f2532h0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0667c {

        /* renamed from: h */
        private static SparseIntArray f2553h;

        /* renamed from: a */
        public boolean f2554a = false;

        /* renamed from: b */
        public int f2555b = -1;

        /* renamed from: c */
        public String f2556c = null;

        /* renamed from: d */
        public int f2557d = -1;

        /* renamed from: e */
        public int f2558e = 0;

        /* renamed from: f */
        public float f2559f = Float.NaN;

        /* renamed from: g */
        public float f2560g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2553h = sparseIntArray;
            sparseIntArray.append(C0678f.f2851k4, 1);
            f2553h.append(C0678f.f2863m4, 2);
            f2553h.append(C0678f.f2869n4, 3);
            f2553h.append(C0678f.f2845j4, 4);
            f2553h.append(C0678f.f2838i4, 5);
            f2553h.append(C0678f.f2857l4, 6);
        }

        /* renamed from: a */
        public void m39257a(C0667c c0667c) {
            this.f2554a = c0667c.f2554a;
            this.f2555b = c0667c.f2555b;
            this.f2556c = c0667c.f2556c;
            this.f2557d = c0667c.f2557d;
            this.f2558e = c0667c.f2558e;
            this.f2560g = c0667c.f2560g;
            this.f2559f = c0667c.f2559f;
        }

        /* renamed from: b */
        void m39256b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2831h4);
            this.f2554a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2553h.get(index)) {
                    case 1:
                        this.f2560g = obtainStyledAttributes.getFloat(index, this.f2560g);
                        break;
                    case 2:
                        this.f2557d = obtainStyledAttributes.getInt(index, this.f2557d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2556c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2556c = C10919a.f28659c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2558e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2555b = ConstraintSet.m39269o(obtainStyledAttributes, index, this.f2555b);
                        break;
                    case 6:
                        this.f2559f = obtainStyledAttributes.getFloat(index, this.f2559f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0668d {

        /* renamed from: a */
        public boolean f2561a = false;

        /* renamed from: b */
        public int f2562b = 0;

        /* renamed from: c */
        public int f2563c = 0;

        /* renamed from: d */
        public float f2564d = 1.0f;

        /* renamed from: e */
        public float f2565e = Float.NaN;

        /* renamed from: a */
        public void m39255a(C0668d c0668d) {
            this.f2561a = c0668d.f2561a;
            this.f2562b = c0668d.f2562b;
            this.f2564d = c0668d.f2564d;
            this.f2565e = c0668d.f2565e;
            this.f2563c = c0668d.f2563c;
        }

        /* renamed from: b */
        void m39254b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2923w4);
            this.f2561a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2935y4) {
                    this.f2564d = obtainStyledAttributes.getFloat(index, this.f2564d);
                } else if (index == C0678f.f2929x4) {
                    this.f2562b = obtainStyledAttributes.getInt(index, this.f2562b);
                    this.f2562b = ConstraintSet.f2479d[this.f2562b];
                } else if (index == C0678f.f2626A4) {
                    this.f2563c = obtainStyledAttributes.getInt(index, this.f2563c);
                } else if (index == C0678f.f2941z4) {
                    this.f2565e = obtainStyledAttributes.getFloat(index, this.f2565e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0669e {

        /* renamed from: n */
        private static SparseIntArray f2566n;

        /* renamed from: a */
        public boolean f2567a = false;

        /* renamed from: b */
        public float f2568b = 0.0f;

        /* renamed from: c */
        public float f2569c = 0.0f;

        /* renamed from: d */
        public float f2570d = 0.0f;

        /* renamed from: e */
        public float f2571e = 1.0f;

        /* renamed from: f */
        public float f2572f = 1.0f;

        /* renamed from: g */
        public float f2573g = Float.NaN;

        /* renamed from: h */
        public float f2574h = Float.NaN;

        /* renamed from: i */
        public float f2575i = 0.0f;

        /* renamed from: j */
        public float f2576j = 0.0f;

        /* renamed from: k */
        public float f2577k = 0.0f;

        /* renamed from: l */
        public boolean f2578l = false;

        /* renamed from: m */
        public float f2579m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2566n = sparseIntArray;
            sparseIntArray.append(C0678f.f2746U4, 1);
            f2566n.append(C0678f.f2752V4, 2);
            f2566n.append(C0678f.f2758W4, 3);
            f2566n.append(C0678f.f2734S4, 4);
            f2566n.append(C0678f.f2740T4, 5);
            f2566n.append(C0678f.f2710O4, 6);
            f2566n.append(C0678f.f2716P4, 7);
            f2566n.append(C0678f.f2722Q4, 8);
            f2566n.append(C0678f.f2728R4, 9);
            f2566n.append(C0678f.f2764X4, 10);
            f2566n.append(C0678f.f2770Y4, 11);
        }

        /* renamed from: a */
        public void m39253a(C0669e c0669e) {
            this.f2567a = c0669e.f2567a;
            this.f2568b = c0669e.f2568b;
            this.f2569c = c0669e.f2569c;
            this.f2570d = c0669e.f2570d;
            this.f2571e = c0669e.f2571e;
            this.f2572f = c0669e.f2572f;
            this.f2573g = c0669e.f2573g;
            this.f2574h = c0669e.f2574h;
            this.f2575i = c0669e.f2575i;
            this.f2576j = c0669e.f2576j;
            this.f2577k = c0669e.f2577k;
            this.f2578l = c0669e.f2578l;
            this.f2579m = c0669e.f2579m;
        }

        /* renamed from: b */
        void m39252b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2704N4);
            this.f2567a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2566n.get(index)) {
                    case 1:
                        this.f2568b = obtainStyledAttributes.getFloat(index, this.f2568b);
                        break;
                    case 2:
                        this.f2569c = obtainStyledAttributes.getFloat(index, this.f2569c);
                        break;
                    case 3:
                        this.f2570d = obtainStyledAttributes.getFloat(index, this.f2570d);
                        break;
                    case 4:
                        this.f2571e = obtainStyledAttributes.getFloat(index, this.f2571e);
                        break;
                    case 5:
                        this.f2572f = obtainStyledAttributes.getFloat(index, this.f2572f);
                        break;
                    case 6:
                        this.f2573g = obtainStyledAttributes.getDimension(index, this.f2573g);
                        break;
                    case 7:
                        this.f2574h = obtainStyledAttributes.getDimension(index, this.f2574h);
                        break;
                    case 8:
                        this.f2575i = obtainStyledAttributes.getDimension(index, this.f2575i);
                        break;
                    case 9:
                        this.f2576j = obtainStyledAttributes.getDimension(index, this.f2576j);
                        break;
                    case 10:
                        this.f2577k = obtainStyledAttributes.getDimension(index, this.f2577k);
                        break;
                    case 11:
                        this.f2578l = true;
                        this.f2579m = obtainStyledAttributes.getDimension(index, this.f2579m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2480e = sparseIntArray;
        sparseIntArray.append(C0678f.f2907u0, 25);
        f2480e.append(C0678f.f2913v0, 26);
        f2480e.append(C0678f.f2925x0, 29);
        f2480e.append(C0678f.f2931y0, 30);
        f2480e.append(C0678f.f2646E0, 36);
        f2480e.append(C0678f.f2640D0, 35);
        f2480e.append(C0678f.f2792c0, 4);
        f2480e.append(C0678f.f2785b0, 3);
        f2480e.append(C0678f.f2771Z, 1);
        f2480e.append(C0678f.f2694M0, 6);
        f2480e.append(C0678f.f2700N0, 7);
        f2480e.append(C0678f.f2841j0, 17);
        f2480e.append(C0678f.f2847k0, 18);
        f2480e.append(C0678f.f2853l0, 19);
        f2480e.append(C0678f.f2894s, 27);
        f2480e.append(C0678f.f2937z0, 32);
        f2480e.append(C0678f.f2622A0, 33);
        f2480e.append(C0678f.f2834i0, 10);
        f2480e.append(C0678f.f2827h0, 9);
        f2480e.append(C0678f.f2718Q0, 13);
        f2480e.append(C0678f.f2736T0, 16);
        f2480e.append(C0678f.f2724R0, 14);
        f2480e.append(C0678f.f2706O0, 11);
        f2480e.append(C0678f.f2730S0, 15);
        f2480e.append(C0678f.f2712P0, 12);
        f2480e.append(C0678f.f2664H0, 40);
        f2480e.append(C0678f.f2895s0, 39);
        f2480e.append(C0678f.f2889r0, 41);
        f2480e.append(C0678f.f2658G0, 42);
        f2480e.append(C0678f.f2883q0, 20);
        f2480e.append(C0678f.f2652F0, 37);
        f2480e.append(C0678f.f2820g0, 5);
        f2480e.append(C0678f.f2901t0, 82);
        f2480e.append(C0678f.f2634C0, 82);
        f2480e.append(C0678f.f2919w0, 82);
        f2480e.append(C0678f.f2778a0, 82);
        f2480e.append(C0678f.f2765Y, 82);
        f2480e.append(C0678f.f2924x, 24);
        f2480e.append(C0678f.f2936z, 28);
        f2480e.append(C0678f.f2687L, 31);
        f2480e.append(C0678f.f2693M, 8);
        f2480e.append(C0678f.f2930y, 34);
        f2480e.append(C0678f.f2621A, 2);
        f2480e.append(C0678f.f2912v, 23);
        f2480e.append(C0678f.f2918w, 21);
        f2480e.append(C0678f.f2906u, 22);
        f2480e.append(C0678f.f2627B, 43);
        f2480e.append(C0678f.f2705O, 44);
        f2480e.append(C0678f.f2675J, 45);
        f2480e.append(C0678f.f2681K, 46);
        f2480e.append(C0678f.f2669I, 60);
        f2480e.append(C0678f.f2657G, 47);
        f2480e.append(C0678f.f2663H, 48);
        f2480e.append(C0678f.f2633C, 49);
        f2480e.append(C0678f.f2639D, 50);
        f2480e.append(C0678f.f2645E, 51);
        f2480e.append(C0678f.f2651F, 52);
        f2480e.append(C0678f.f2699N, 53);
        f2480e.append(C0678f.f2670I0, 54);
        f2480e.append(C0678f.f2859m0, 55);
        f2480e.append(C0678f.f2676J0, 56);
        f2480e.append(C0678f.f2865n0, 57);
        f2480e.append(C0678f.f2682K0, 58);
        f2480e.append(C0678f.f2871o0, 59);
        f2480e.append(C0678f.f2799d0, 61);
        f2480e.append(C0678f.f2813f0, 62);
        f2480e.append(C0678f.f2806e0, 63);
        f2480e.append(C0678f.f2711P, 64);
        f2480e.append(C0678f.f2760X0, 65);
        f2480e.append(C0678f.f2747V, 66);
        f2480e.append(C0678f.f2766Y0, 67);
        f2480e.append(C0678f.f2748V0, 79);
        f2480e.append(C0678f.f2900t, 38);
        f2480e.append(C0678f.f2742U0, 68);
        f2480e.append(C0678f.f2688L0, 69);
        f2480e.append(C0678f.f2877p0, 70);
        f2480e.append(C0678f.f2735T, 71);
        f2480e.append(C0678f.f2723R, 72);
        f2480e.append(C0678f.f2729S, 73);
        f2480e.append(C0678f.f2741U, 74);
        f2480e.append(C0678f.f2717Q, 75);
        f2480e.append(C0678f.f2754W0, 76);
        f2480e.append(C0678f.f2628B0, 77);
        f2480e.append(C0678f.f2772Z0, 78);
        f2480e.append(C0678f.f2759X, 80);
        f2480e.append(C0678f.f2753W, 81);
    }

    /* renamed from: j */
    private int[] m39274j(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0677e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: k */
    private C0665a m39273k(Context context, AttributeSet attributeSet) {
        C0665a c0665a = new C0665a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2888r);
        m39268p(context, c0665a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0665a;
    }

    /* renamed from: l */
    private C0665a m39272l(int i) {
        if (!this.f2483c.containsKey(Integer.valueOf(i))) {
            this.f2483c.put(Integer.valueOf(i), new C0665a());
        }
        return this.f2483c.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static int m39269o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: p */
    private void m39268p(Context context, C0665a c0665a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C0678f.f2900t && C0678f.f2687L != index && C0678f.f2693M != index) {
                c0665a.f2486c.f2554a = true;
                c0665a.f2487d.f2519b = true;
                c0665a.f2485b.f2561a = true;
                c0665a.f2488e.f2567a = true;
            }
            switch (f2480e.get(index)) {
                case 1:
                    C0666b c0666b = c0665a.f2487d;
                    c0666b.f2542p = m39269o(typedArray, index, c0666b.f2542p);
                    break;
                case 2:
                    C0666b c0666b2 = c0665a.f2487d;
                    c0666b2.f2497G = typedArray.getDimensionPixelSize(index, c0666b2.f2497G);
                    break;
                case 3:
                    C0666b c0666b3 = c0665a.f2487d;
                    c0666b3.f2541o = m39269o(typedArray, index, c0666b3.f2541o);
                    break;
                case 4:
                    C0666b c0666b4 = c0665a.f2487d;
                    c0666b4.f2540n = m39269o(typedArray, index, c0666b4.f2540n);
                    break;
                case 5:
                    c0665a.f2487d.f2549w = typedArray.getString(index);
                    break;
                case 6:
                    C0666b c0666b5 = c0665a.f2487d;
                    c0666b5.f2491A = typedArray.getDimensionPixelOffset(index, c0666b5.f2491A);
                    break;
                case 7:
                    C0666b c0666b6 = c0665a.f2487d;
                    c0666b6.f2492B = typedArray.getDimensionPixelOffset(index, c0666b6.f2492B);
                    break;
                case 8:
                    C0666b c0666b7 = c0665a.f2487d;
                    c0666b7.f2498H = typedArray.getDimensionPixelSize(index, c0666b7.f2498H);
                    break;
                case 9:
                    C0666b c0666b8 = c0665a.f2487d;
                    c0666b8.f2546t = m39269o(typedArray, index, c0666b8.f2546t);
                    break;
                case 10:
                    C0666b c0666b9 = c0665a.f2487d;
                    c0666b9.f2545s = m39269o(typedArray, index, c0666b9.f2545s);
                    break;
                case 11:
                    C0666b c0666b10 = c0665a.f2487d;
                    c0666b10.f2503M = typedArray.getDimensionPixelSize(index, c0666b10.f2503M);
                    break;
                case 12:
                    C0666b c0666b11 = c0665a.f2487d;
                    c0666b11.f2504N = typedArray.getDimensionPixelSize(index, c0666b11.f2504N);
                    break;
                case 13:
                    C0666b c0666b12 = c0665a.f2487d;
                    c0666b12.f2500J = typedArray.getDimensionPixelSize(index, c0666b12.f2500J);
                    break;
                case 14:
                    C0666b c0666b13 = c0665a.f2487d;
                    c0666b13.f2502L = typedArray.getDimensionPixelSize(index, c0666b13.f2502L);
                    break;
                case 15:
                    C0666b c0666b14 = c0665a.f2487d;
                    c0666b14.f2505O = typedArray.getDimensionPixelSize(index, c0666b14.f2505O);
                    break;
                case 16:
                    C0666b c0666b15 = c0665a.f2487d;
                    c0666b15.f2501K = typedArray.getDimensionPixelSize(index, c0666b15.f2501K);
                    break;
                case 17:
                    C0666b c0666b16 = c0665a.f2487d;
                    c0666b16.f2525e = typedArray.getDimensionPixelOffset(index, c0666b16.f2525e);
                    break;
                case 18:
                    C0666b c0666b17 = c0665a.f2487d;
                    c0666b17.f2527f = typedArray.getDimensionPixelOffset(index, c0666b17.f2527f);
                    break;
                case 19:
                    C0666b c0666b18 = c0665a.f2487d;
                    c0666b18.f2529g = typedArray.getFloat(index, c0666b18.f2529g);
                    break;
                case 20:
                    C0666b c0666b19 = c0665a.f2487d;
                    c0666b19.f2547u = typedArray.getFloat(index, c0666b19.f2547u);
                    break;
                case 21:
                    C0666b c0666b20 = c0665a.f2487d;
                    c0666b20.f2523d = typedArray.getLayoutDimension(index, c0666b20.f2523d);
                    break;
                case 22:
                    C0668d c0668d = c0665a.f2485b;
                    c0668d.f2562b = typedArray.getInt(index, c0668d.f2562b);
                    C0668d c0668d2 = c0665a.f2485b;
                    c0668d2.f2562b = f2479d[c0668d2.f2562b];
                    break;
                case 23:
                    C0666b c0666b21 = c0665a.f2487d;
                    c0666b21.f2521c = typedArray.getLayoutDimension(index, c0666b21.f2521c);
                    break;
                case 24:
                    C0666b c0666b22 = c0665a.f2487d;
                    c0666b22.f2494D = typedArray.getDimensionPixelSize(index, c0666b22.f2494D);
                    break;
                case 25:
                    C0666b c0666b23 = c0665a.f2487d;
                    c0666b23.f2531h = m39269o(typedArray, index, c0666b23.f2531h);
                    break;
                case 26:
                    C0666b c0666b24 = c0665a.f2487d;
                    c0666b24.f2533i = m39269o(typedArray, index, c0666b24.f2533i);
                    break;
                case 27:
                    C0666b c0666b25 = c0665a.f2487d;
                    c0666b25.f2493C = typedArray.getInt(index, c0666b25.f2493C);
                    break;
                case 28:
                    C0666b c0666b26 = c0665a.f2487d;
                    c0666b26.f2495E = typedArray.getDimensionPixelSize(index, c0666b26.f2495E);
                    break;
                case 29:
                    C0666b c0666b27 = c0665a.f2487d;
                    c0666b27.f2535j = m39269o(typedArray, index, c0666b27.f2535j);
                    break;
                case 30:
                    C0666b c0666b28 = c0665a.f2487d;
                    c0666b28.f2537k = m39269o(typedArray, index, c0666b28.f2537k);
                    break;
                case 31:
                    C0666b c0666b29 = c0665a.f2487d;
                    c0666b29.f2499I = typedArray.getDimensionPixelSize(index, c0666b29.f2499I);
                    break;
                case 32:
                    C0666b c0666b30 = c0665a.f2487d;
                    c0666b30.f2543q = m39269o(typedArray, index, c0666b30.f2543q);
                    break;
                case 33:
                    C0666b c0666b31 = c0665a.f2487d;
                    c0666b31.f2544r = m39269o(typedArray, index, c0666b31.f2544r);
                    break;
                case 34:
                    C0666b c0666b32 = c0665a.f2487d;
                    c0666b32.f2496F = typedArray.getDimensionPixelSize(index, c0666b32.f2496F);
                    break;
                case 35:
                    C0666b c0666b33 = c0665a.f2487d;
                    c0666b33.f2539m = m39269o(typedArray, index, c0666b33.f2539m);
                    break;
                case 36:
                    C0666b c0666b34 = c0665a.f2487d;
                    c0666b34.f2538l = m39269o(typedArray, index, c0666b34.f2538l);
                    break;
                case 37:
                    C0666b c0666b35 = c0665a.f2487d;
                    c0666b35.f2548v = typedArray.getFloat(index, c0666b35.f2548v);
                    break;
                case 38:
                    c0665a.f2484a = typedArray.getResourceId(index, c0665a.f2484a);
                    break;
                case 39:
                    C0666b c0666b36 = c0665a.f2487d;
                    c0666b36.f2507Q = typedArray.getFloat(index, c0666b36.f2507Q);
                    break;
                case 40:
                    C0666b c0666b37 = c0665a.f2487d;
                    c0666b37.f2506P = typedArray.getFloat(index, c0666b37.f2506P);
                    break;
                case 41:
                    C0666b c0666b38 = c0665a.f2487d;
                    c0666b38.f2508R = typedArray.getInt(index, c0666b38.f2508R);
                    break;
                case 42:
                    C0666b c0666b39 = c0665a.f2487d;
                    c0666b39.f2509S = typedArray.getInt(index, c0666b39.f2509S);
                    break;
                case 43:
                    C0668d c0668d3 = c0665a.f2485b;
                    c0668d3.f2564d = typedArray.getFloat(index, c0668d3.f2564d);
                    break;
                case 44:
                    C0669e c0669e = c0665a.f2488e;
                    c0669e.f2578l = true;
                    c0669e.f2579m = typedArray.getDimension(index, c0669e.f2579m);
                    break;
                case 45:
                    C0669e c0669e2 = c0665a.f2488e;
                    c0669e2.f2569c = typedArray.getFloat(index, c0669e2.f2569c);
                    break;
                case 46:
                    C0669e c0669e3 = c0665a.f2488e;
                    c0669e3.f2570d = typedArray.getFloat(index, c0669e3.f2570d);
                    break;
                case 47:
                    C0669e c0669e4 = c0665a.f2488e;
                    c0669e4.f2571e = typedArray.getFloat(index, c0669e4.f2571e);
                    break;
                case 48:
                    C0669e c0669e5 = c0665a.f2488e;
                    c0669e5.f2572f = typedArray.getFloat(index, c0669e5.f2572f);
                    break;
                case 49:
                    C0669e c0669e6 = c0665a.f2488e;
                    c0669e6.f2573g = typedArray.getDimension(index, c0669e6.f2573g);
                    break;
                case 50:
                    C0669e c0669e7 = c0665a.f2488e;
                    c0669e7.f2574h = typedArray.getDimension(index, c0669e7.f2574h);
                    break;
                case 51:
                    C0669e c0669e8 = c0665a.f2488e;
                    c0669e8.f2575i = typedArray.getDimension(index, c0669e8.f2575i);
                    break;
                case 52:
                    C0669e c0669e9 = c0665a.f2488e;
                    c0669e9.f2576j = typedArray.getDimension(index, c0669e9.f2576j);
                    break;
                case 53:
                    C0669e c0669e10 = c0665a.f2488e;
                    c0669e10.f2577k = typedArray.getDimension(index, c0669e10.f2577k);
                    break;
                case 54:
                    C0666b c0666b40 = c0665a.f2487d;
                    c0666b40.f2510T = typedArray.getInt(index, c0666b40.f2510T);
                    break;
                case 55:
                    C0666b c0666b41 = c0665a.f2487d;
                    c0666b41.f2511U = typedArray.getInt(index, c0666b41.f2511U);
                    break;
                case 56:
                    C0666b c0666b42 = c0665a.f2487d;
                    c0666b42.f2512V = typedArray.getDimensionPixelSize(index, c0666b42.f2512V);
                    break;
                case 57:
                    C0666b c0666b43 = c0665a.f2487d;
                    c0666b43.f2513W = typedArray.getDimensionPixelSize(index, c0666b43.f2513W);
                    break;
                case 58:
                    C0666b c0666b44 = c0665a.f2487d;
                    c0666b44.f2514X = typedArray.getDimensionPixelSize(index, c0666b44.f2514X);
                    break;
                case 59:
                    C0666b c0666b45 = c0665a.f2487d;
                    c0666b45.f2515Y = typedArray.getDimensionPixelSize(index, c0666b45.f2515Y);
                    break;
                case 60:
                    C0669e c0669e11 = c0665a.f2488e;
                    c0669e11.f2568b = typedArray.getFloat(index, c0669e11.f2568b);
                    break;
                case 61:
                    C0666b c0666b46 = c0665a.f2487d;
                    c0666b46.f2550x = m39269o(typedArray, index, c0666b46.f2550x);
                    break;
                case 62:
                    C0666b c0666b47 = c0665a.f2487d;
                    c0666b47.f2551y = typedArray.getDimensionPixelSize(index, c0666b47.f2551y);
                    break;
                case 63:
                    C0666b c0666b48 = c0665a.f2487d;
                    c0666b48.f2552z = typedArray.getFloat(index, c0666b48.f2552z);
                    break;
                case 64:
                    C0667c c0667c = c0665a.f2486c;
                    c0667c.f2555b = m39269o(typedArray, index, c0667c.f2555b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0665a.f2486c.f2556c = typedArray.getString(index);
                        break;
                    } else {
                        c0665a.f2486c.f2556c = C10919a.f28659c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c0665a.f2486c.f2558e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0667c c0667c2 = c0665a.f2486c;
                    c0667c2.f2560g = typedArray.getFloat(index, c0667c2.f2560g);
                    break;
                case 68:
                    C0668d c0668d4 = c0665a.f2485b;
                    c0668d4.f2565e = typedArray.getFloat(index, c0668d4.f2565e);
                    break;
                case 69:
                    c0665a.f2487d.f2516Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0665a.f2487d.f2518a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0666b c0666b49 = c0665a.f2487d;
                    c0666b49.f2520b0 = typedArray.getInt(index, c0666b49.f2520b0);
                    break;
                case 73:
                    C0666b c0666b50 = c0665a.f2487d;
                    c0666b50.f2522c0 = typedArray.getDimensionPixelSize(index, c0666b50.f2522c0);
                    break;
                case 74:
                    c0665a.f2487d.f2528f0 = typedArray.getString(index);
                    break;
                case 75:
                    C0666b c0666b51 = c0665a.f2487d;
                    c0666b51.f2536j0 = typedArray.getBoolean(index, c0666b51.f2536j0);
                    break;
                case 76:
                    C0667c c0667c3 = c0665a.f2486c;
                    c0667c3.f2557d = typedArray.getInt(index, c0667c3.f2557d);
                    break;
                case 77:
                    c0665a.f2487d.f2530g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0668d c0668d5 = c0665a.f2485b;
                    c0668d5.f2563c = typedArray.getInt(index, c0668d5.f2563c);
                    break;
                case 79:
                    C0667c c0667c4 = c0665a.f2486c;
                    c0667c4.f2559f = typedArray.getFloat(index, c0667c4.f2559f);
                    break;
                case 80:
                    C0666b c0666b52 = c0665a.f2487d;
                    c0666b52.f2532h0 = typedArray.getBoolean(index, c0666b52.f2532h0);
                    break;
                case 81:
                    C0666b c0666b53 = c0665a.f2487d;
                    c0666b53.f2534i0 = typedArray.getBoolean(index, c0666b53.f2534i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2480e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2480e.get(index));
                    break;
            }
        }
    }

    /* renamed from: c */
    public void m39281c(ConstraintLayout constraintLayout) {
        m39280d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m39280d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2483c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.f2483c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C11362a.m8250a(childAt));
            } else if (this.f2482b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f2483c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        C0665a c0665a = this.f2483c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            c0665a.f2487d.f2524d0 = 1;
                        }
                        int i2 = c0665a.f2487d.f2524d0;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(c0665a.f2487d.f2520b0);
                            barrier.setMargin(c0665a.f2487d.f2522c0);
                            barrier.setAllowsGoneWidget(c0665a.f2487d.f2536j0);
                            C0666b c0666b = c0665a.f2487d;
                            int[] iArr = c0666b.f2526e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0666b.f2528f0;
                                if (str != null) {
                                    c0666b.f2526e0 = m39274j(barrier, str);
                                    barrier.setReferencedIds(c0665a.f2487d.f2526e0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.m39292a();
                        c0665a.m39264d(layoutParams);
                        if (z) {
                            C0670a.m39247c(childAt, c0665a.f2489f);
                        }
                        childAt.setLayoutParams(layoutParams);
                        C0668d c0668d = c0665a.f2485b;
                        if (c0668d.f2563c == 0) {
                            childAt.setVisibility(c0668d.f2562b);
                        }
                        childAt.setAlpha(c0665a.f2485b.f2564d);
                        childAt.setRotation(c0665a.f2488e.f2568b);
                        childAt.setRotationX(c0665a.f2488e.f2569c);
                        childAt.setRotationY(c0665a.f2488e.f2570d);
                        childAt.setScaleX(c0665a.f2488e.f2571e);
                        childAt.setScaleY(c0665a.f2488e.f2572f);
                        if (!Float.isNaN(c0665a.f2488e.f2573g)) {
                            childAt.setPivotX(c0665a.f2488e.f2573g);
                        }
                        if (!Float.isNaN(c0665a.f2488e.f2574h)) {
                            childAt.setPivotY(c0665a.f2488e.f2574h);
                        }
                        childAt.setTranslationX(c0665a.f2488e.f2575i);
                        childAt.setTranslationY(c0665a.f2488e.f2576j);
                        childAt.setTranslationZ(c0665a.f2488e.f2577k);
                        C0669e c0669e = c0665a.f2488e;
                        if (c0669e.f2578l) {
                            childAt.setElevation(c0669e.f2579m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0665a c0665a2 = this.f2483c.get(num);
            int i3 = c0665a2.f2487d.f2524d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0666b c0666b2 = c0665a2.f2487d;
                int[] iArr2 = c0666b2.f2526e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = c0666b2.f2528f0;
                    if (str2 != null) {
                        c0666b2.f2526e0 = m39274j(barrier2, str2);
                        barrier2.setReferencedIds(c0665a2.f2487d.f2526e0);
                    }
                }
                barrier2.setType(c0665a2.f2487d.f2520b0);
                barrier2.setMargin(c0665a2.f2487d.f2522c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m39234m();
                c0665a2.m39264d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (c0665a2.f2487d.f2517a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0665a2.m39264d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: e */
    public void m39279e(int i, int i2) {
        if (this.f2483c.containsKey(Integer.valueOf(i))) {
            C0665a c0665a = this.f2483c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0666b c0666b = c0665a.f2487d;
                    c0666b.f2533i = -1;
                    c0666b.f2531h = -1;
                    c0666b.f2494D = -1;
                    c0666b.f2500J = -1;
                    return;
                case 2:
                    C0666b c0666b2 = c0665a.f2487d;
                    c0666b2.f2537k = -1;
                    c0666b2.f2535j = -1;
                    c0666b2.f2495E = -1;
                    c0666b2.f2502L = -1;
                    return;
                case 3:
                    C0666b c0666b3 = c0665a.f2487d;
                    c0666b3.f2539m = -1;
                    c0666b3.f2538l = -1;
                    c0666b3.f2496F = -1;
                    c0666b3.f2501K = -1;
                    return;
                case 4:
                    C0666b c0666b4 = c0665a.f2487d;
                    c0666b4.f2540n = -1;
                    c0666b4.f2541o = -1;
                    c0666b4.f2497G = -1;
                    c0666b4.f2503M = -1;
                    return;
                case 5:
                    c0665a.f2487d.f2542p = -1;
                    return;
                case 6:
                    C0666b c0666b5 = c0665a.f2487d;
                    c0666b5.f2543q = -1;
                    c0666b5.f2544r = -1;
                    c0666b5.f2499I = -1;
                    c0666b5.f2505O = -1;
                    return;
                case 7:
                    C0666b c0666b6 = c0665a.f2487d;
                    c0666b6.f2545s = -1;
                    c0666b6.f2546t = -1;
                    c0666b6.f2498H = -1;
                    c0666b6.f2504N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m39278f(Context context, int i) {
        m39277g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m39277g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2483c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2482b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2483c.containsKey(Integer.valueOf(id2))) {
                this.f2483c.put(Integer.valueOf(id2), new C0665a());
            }
            C0665a c0665a = this.f2483c.get(Integer.valueOf(id2));
            c0665a.f2489f = C0670a.m39249a(this.f2481a, childAt);
            c0665a.m39262f(id2, layoutParams);
            c0665a.f2485b.f2562b = childAt.getVisibility();
            c0665a.f2485b.f2564d = childAt.getAlpha();
            c0665a.f2488e.f2568b = childAt.getRotation();
            c0665a.f2488e.f2569c = childAt.getRotationX();
            c0665a.f2488e.f2570d = childAt.getRotationY();
            c0665a.f2488e.f2571e = childAt.getScaleX();
            c0665a.f2488e.f2572f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0669e c0669e = c0665a.f2488e;
                c0669e.f2573g = pivotX;
                c0669e.f2574h = pivotY;
            }
            c0665a.f2488e.f2575i = childAt.getTranslationX();
            c0665a.f2488e.f2576j = childAt.getTranslationY();
            c0665a.f2488e.f2577k = childAt.getTranslationZ();
            C0669e c0669e2 = c0665a.f2488e;
            if (c0669e2.f2578l) {
                c0669e2.f2579m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                c0665a.f2487d.f2536j0 = barrier.m39294n();
                c0665a.f2487d.f2526e0 = barrier.getReferencedIds();
                c0665a.f2487d.f2520b0 = barrier.getType();
                c0665a.f2487d.f2522c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: h */
    public void m39276h(C0674c c0674c) {
        int childCount = c0674c.getChildCount();
        this.f2483c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c0674c.getChildAt(i);
            C0674c.C0675a c0675a = (C0674c.C0675a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f2482b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2483c.containsKey(Integer.valueOf(id2))) {
                this.f2483c.put(Integer.valueOf(id2), new C0665a());
            }
            C0665a c0665a = this.f2483c.get(Integer.valueOf(id2));
            if (childAt instanceof AbstractC0673b) {
                c0665a.m39260h((AbstractC0673b) childAt, id2, c0675a);
            }
            c0665a.m39261g(id2, c0675a);
        }
    }

    /* renamed from: i */
    public void m39275i(int i, int i2, int i3, float f) {
        C0666b c0666b = m39272l(i).f2487d;
        c0666b.f2550x = i2;
        c0666b.f2551y = i3;
        c0666b.f2552z = f;
    }

    /* renamed from: m */
    public void m39271m(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        C0665a m39273k = m39273k(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            m39273k.f2487d.f2517a = true;
                        }
                        this.f2483c.put(Integer.valueOf(m39273k.f2484a), m39273k);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
        continue;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m39270n(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.m39270n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
