package p073e1;

import android.graphics.Rect;
import androidx.collection.C0629d;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p167j1.C8782c;
import p167j1.C8783d;
import p167j1.C8787h;
import p223m1.C10236e;
import p291q1.C11674f;
import p291q1.C11679k;

/* renamed from: e1.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6062k {

    /* renamed from: c */
    private Map<String, List<C10236e>> f17220c;

    /* renamed from: d */
    private Map<String, C6063k0> f17221d;

    /* renamed from: e */
    private Map<String, C8782c> f17222e;

    /* renamed from: f */
    private List<C8787h> f17223f;

    /* renamed from: g */
    private SparseArrayCompat<C8783d> f17224g;

    /* renamed from: h */
    private C0629d<C10236e> f17225h;

    /* renamed from: i */
    private List<C10236e> f17226i;

    /* renamed from: j */
    private Rect f17227j;

    /* renamed from: k */
    private float f17228k;

    /* renamed from: l */
    private float f17229l;

    /* renamed from: m */
    private float f17230m;

    /* renamed from: n */
    private boolean f17231n;

    /* renamed from: a */
    private final C6082t0 f17218a = new C6082t0();

    /* renamed from: b */
    private final HashSet<String> f17219b = new HashSet<>();

    /* renamed from: o */
    private int f17232o = 0;

    /* renamed from: a */
    public void m23676a(String str) {
        C11674f.m7233c(str);
        this.f17219b.add(str);
    }

    /* renamed from: b */
    public Rect m23675b() {
        return this.f17227j;
    }

    /* renamed from: c */
    public SparseArrayCompat<C8783d> m23674c() {
        return this.f17224g;
    }

    /* renamed from: d */
    public float m23673d() {
        return (m23672e() / this.f17230m) * 1000.0f;
    }

    /* renamed from: e */
    public float m23672e() {
        return this.f17229l - this.f17228k;
    }

    /* renamed from: f */
    public float m23671f() {
        return this.f17229l;
    }

    /* renamed from: g */
    public Map<String, C8782c> m23670g() {
        return this.f17222e;
    }

    /* renamed from: h */
    public float m23669h(float f) {
        return C11679k.m7195i(this.f17228k, this.f17229l, f);
    }

    /* renamed from: i */
    public float m23668i() {
        return this.f17230m;
    }

    /* renamed from: j */
    public Map<String, C6063k0> m23667j() {
        return this.f17221d;
    }

    /* renamed from: k */
    public List<C10236e> m23666k() {
        return this.f17226i;
    }

    /* renamed from: l */
    public C8787h m23665l(String str) {
        int size = this.f17223f.size();
        for (int i = 0; i < size; i++) {
            C8787h c8787h = this.f17223f.get(i);
            if (c8787h.m17247a(str)) {
                return c8787h;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int m23664m() {
        return this.f17232o;
    }

    /* renamed from: n */
    public C6082t0 m23663n() {
        return this.f17218a;
    }

    /* renamed from: o */
    public List<C10236e> m23662o(String str) {
        return this.f17220c.get(str);
    }

    /* renamed from: p */
    public float m23661p() {
        return this.f17228k;
    }

    /* renamed from: q */
    public boolean m23660q() {
        return this.f17231n;
    }

    /* renamed from: r */
    public void m23659r(int i) {
        this.f17232o += i;
    }

    /* renamed from: s */
    public void m23658s(Rect rect, float f, float f2, float f3, List<C10236e> list, C0629d<C10236e> c0629d, Map<String, List<C10236e>> map, Map<String, C6063k0> map2, SparseArrayCompat<C8783d> sparseArrayCompat, Map<String, C8782c> map3, List<C8787h> list2) {
        this.f17227j = rect;
        this.f17228k = f;
        this.f17229l = f2;
        this.f17230m = f3;
        this.f17226i = list;
        this.f17225h = c0629d;
        this.f17220c = map;
        this.f17221d = map2;
        this.f17224g = sparseArrayCompat;
        this.f17222e = map3;
        this.f17223f = list2;
    }

    /* renamed from: t */
    public C10236e m23657t(long j) {
        return this.f17225h.m39488g(j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (C10236e c10236e : this.f17226i) {
            sb2.append(c10236e.m12059y("\t"));
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public void m23656u(boolean z) {
        this.f17231n = z;
    }

    /* renamed from: v */
    public void m23655v(boolean z) {
        this.f17218a.m23592b(z);
    }
}
