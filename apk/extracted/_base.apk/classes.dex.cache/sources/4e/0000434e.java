package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.C2464c;

/* renamed from: m9.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10412s extends AbstractC10424x {
    public static final Parcelable.Creator<C10412s> CREATOR = new C10373c1();

    /* renamed from: j */
    private final byte[] f27203j;

    /* renamed from: k */
    private final Double f27204k;

    /* renamed from: l */
    private final String f27205l;

    /* renamed from: m */
    private final List<C10408q> f27206m;

    /* renamed from: n */
    private final Integer f27207n;

    /* renamed from: o */
    private final C10426y f27208o;

    /* renamed from: p */
    private final EnumC10384g0 f27209p;

    /* renamed from: q */
    private final C10374d f27210q;

    /* renamed from: m9.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10413a {

        /* renamed from: a */
        private byte[] f27211a;

        /* renamed from: b */
        private Double f27212b;

        /* renamed from: c */
        private String f27213c;

        /* renamed from: d */
        private List<C10408q> f27214d;

        /* renamed from: e */
        private Integer f27215e;

        /* renamed from: f */
        private C10426y f27216f;

        /* renamed from: g */
        private C10374d f27217g;

        /* renamed from: a */
        public final C10412s m11597a() {
            return new C10412s(this.f27211a, this.f27212b, this.f27213c, this.f27214d, this.f27215e, this.f27216f, null, this.f27217g);
        }

        /* renamed from: b */
        public final C10413a m11596b(List<C10408q> list) {
            this.f27214d = list;
            return this;
        }

        /* renamed from: c */
        public final C10413a m11595c(byte[] bArr) {
            this.f27211a = (byte[]) C2198p.m33985j(bArr);
            return this;
        }

        /* renamed from: d */
        public final C10413a m11594d(String str) {
            this.f27213c = (String) C2198p.m33985j(str);
            return this;
        }

        /* renamed from: e */
        public final C10413a m11593e(Double d) {
            this.f27212b = d;
            return this;
        }
    }

    public C10412s(byte[] bArr, Double d, String str, List<C10408q> list, Integer num, C10426y c10426y, String str2, C10374d c10374d) {
        this.f27203j = (byte[]) C2198p.m33985j(bArr);
        this.f27204k = d;
        this.f27205l = (String) C2198p.m33985j(str);
        this.f27206m = list;
        this.f27207n = num;
        this.f27208o = c10426y;
        if (str2 != null) {
            try {
                this.f27209p = EnumC10384g0.m11639a(str2);
            } catch (C10387h0 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f27209p = null;
        }
        this.f27210q = c10374d;
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: A */
    public Integer mo11583A() {
        return this.f27207n;
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: G */
    public Double mo11582G() {
        return this.f27204k;
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: H */
    public C10426y mo11581H() {
        return this.f27208o;
    }

    /* renamed from: J */
    public List<C10408q> m11599J() {
        return this.f27206m;
    }

    /* renamed from: M */
    public String m11598M() {
        return this.f27205l;
    }

    public boolean equals(Object obj) {
        List<C10408q> list;
        List<C10408q> list2;
        if (!(obj instanceof C10412s)) {
            return false;
        }
        C10412s c10412s = (C10412s) obj;
        if (!Arrays.equals(this.f27203j, c10412s.f27203j) || !C2190n.m34004b(this.f27204k, c10412s.f27204k) || !C2190n.m34004b(this.f27205l, c10412s.f27205l) || ((((list = this.f27206m) != null || c10412s.f27206m != null) && (list == null || (list2 = c10412s.f27206m) == null || !list.containsAll(list2) || !c10412s.f27206m.containsAll(this.f27206m))) || !C2190n.m34004b(this.f27207n, c10412s.f27207n) || !C2190n.m34004b(this.f27208o, c10412s.f27208o) || !C2190n.m34004b(this.f27209p, c10412s.f27209p) || !C2190n.m34004b(this.f27210q, c10412s.f27210q))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(Integer.valueOf(Arrays.hashCode(this.f27203j)), this.f27204k, this.f27205l, this.f27206m, this.f27207n, this.f27208o, this.f27209p, this.f27210q);
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: r */
    public C10374d mo11580r() {
        return this.f27210q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String enumC10384g0;
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33178f(parcel, 2, mo11579z(), false);
        C2464c.m33176h(parcel, 3, mo11582G(), false);
        C2464c.m33168p(parcel, 4, m11598M(), false);
        C2464c.m33164t(parcel, 5, m11599J(), false);
        C2464c.m33172l(parcel, 6, mo11583A(), false);
        C2464c.m33170n(parcel, 7, mo11581H(), i, false);
        EnumC10384g0 enumC10384g02 = this.f27209p;
        if (enumC10384g02 == null) {
            enumC10384g0 = null;
        } else {
            enumC10384g0 = enumC10384g02.toString();
        }
        C2464c.m33168p(parcel, 8, enumC10384g0, false);
        C2464c.m33170n(parcel, 9, mo11580r(), i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: z */
    public byte[] mo11579z() {
        return this.f27203j;
    }
}