package p195k8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p195k8.C9162f0;

/* renamed from: k8.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9162f0 {

    /* renamed from: h */
    private static final Comparator<C9164b> f24118h = new Comparator() { // from class: k8.d0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m16409g;
            m16409g = C9162f0.m16409g((C9162f0.C9164b) obj, (C9162f0.C9164b) obj2);
            return m16409g;
        }
    };

    /* renamed from: i */
    private static final Comparator<C9164b> f24119i = new Comparator() { // from class: k8.e0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m16408h;
            m16408h = C9162f0.m16408h((C9162f0.C9164b) obj, (C9162f0.C9164b) obj2);
            return m16408h;
        }
    };

    /* renamed from: a */
    private final int f24120a;

    /* renamed from: e */
    private int f24124e;

    /* renamed from: f */
    private int f24125f;

    /* renamed from: g */
    private int f24126g;

    /* renamed from: c */
    private final C9164b[] f24122c = new C9164b[5];

    /* renamed from: b */
    private final ArrayList<C9164b> f24121b = new ArrayList<>();

    /* renamed from: d */
    private int f24123d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k8.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C9164b {

        /* renamed from: a */
        public int f24127a;

        /* renamed from: b */
        public int f24128b;

        /* renamed from: c */
        public float f24129c;

        private C9164b() {
        }
    }

    public C9162f0(int i) {
        this.f24120a = i;
    }

    /* renamed from: d */
    private void m16412d() {
        if (this.f24123d != 1) {
            Collections.sort(this.f24121b, f24118h);
            this.f24123d = 1;
        }
    }

    /* renamed from: e */
    private void m16411e() {
        if (this.f24123d != 0) {
            Collections.sort(this.f24121b, f24119i);
            this.f24123d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m16409g(C9164b c9164b, C9164b c9164b2) {
        return c9164b.f24127a - c9164b2.f24127a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ int m16408h(C9164b c9164b, C9164b c9164b2) {
        return Float.compare(c9164b.f24129c, c9164b2.f24129c);
    }

    /* renamed from: c */
    public void m16413c(int i, float f) {
        C9164b c9164b;
        m16412d();
        int i2 = this.f24126g;
        if (i2 > 0) {
            C9164b[] c9164bArr = this.f24122c;
            int i3 = i2 - 1;
            this.f24126g = i3;
            c9164b = c9164bArr[i3];
        } else {
            c9164b = new C9164b();
        }
        int i4 = this.f24124e;
        this.f24124e = i4 + 1;
        c9164b.f24127a = i4;
        c9164b.f24128b = i;
        c9164b.f24129c = f;
        this.f24121b.add(c9164b);
        this.f24125f += i;
        while (true) {
            int i5 = this.f24125f;
            int i6 = this.f24120a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C9164b c9164b2 = this.f24121b.get(0);
                int i8 = c9164b2.f24128b;
                if (i8 <= i7) {
                    this.f24125f -= i8;
                    this.f24121b.remove(0);
                    int i9 = this.f24126g;
                    if (i9 < 5) {
                        C9164b[] c9164bArr2 = this.f24122c;
                        this.f24126g = i9 + 1;
                        c9164bArr2[i9] = c9164b2;
                    }
                } else {
                    c9164b2.f24128b = i8 - i7;
                    this.f24125f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public float m16410f(float f) {
        ArrayList<C9164b> arrayList;
        m16411e();
        float f2 = f * this.f24125f;
        int i = 0;
        for (int i2 = 0; i2 < this.f24121b.size(); i2++) {
            C9164b c9164b = this.f24121b.get(i2);
            i += c9164b.f24128b;
            if (i >= f2) {
                return c9164b.f24129c;
            }
        }
        if (this.f24121b.isEmpty()) {
            return Float.NaN;
        }
        return this.f24121b.get(arrayList.size() - 1).f24129c;
    }

    /* renamed from: i */
    public void m16407i() {
        this.f24121b.clear();
        this.f24123d = -1;
        this.f24124e = 0;
        this.f24125f = 0;
    }
}
