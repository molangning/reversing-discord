package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.C2464c;
import p231m9.EnumC10370c;

/* renamed from: m9.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10405p extends AbstractC10424x {
    public static final Parcelable.Creator<C10405p> CREATOR = new C10429y0();

    /* renamed from: j */
    private final C10415t f27175j;

    /* renamed from: k */
    private final C10420v f27176k;

    /* renamed from: l */
    private final byte[] f27177l;

    /* renamed from: m */
    private final List<C10410r> f27178m;

    /* renamed from: n */
    private final Double f27179n;

    /* renamed from: o */
    private final List<C10408q> f27180o;

    /* renamed from: p */
    private final C10390j f27181p;

    /* renamed from: q */
    private final Integer f27182q;

    /* renamed from: r */
    private final C10426y f27183r;

    /* renamed from: s */
    private final EnumC10370c f27184s;

    /* renamed from: t */
    private final C10374d f27185t;

    /* renamed from: m9.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10406a {

        /* renamed from: a */
        private C10415t f27186a;

        /* renamed from: b */
        private C10420v f27187b;

        /* renamed from: c */
        private byte[] f27188c;

        /* renamed from: d */
        private List<C10410r> f27189d;

        /* renamed from: e */
        private Double f27190e;

        /* renamed from: f */
        private List<C10408q> f27191f;

        /* renamed from: g */
        private C10390j f27192g;

        /* renamed from: h */
        private Integer f27193h;

        /* renamed from: i */
        private C10426y f27194i;

        /* renamed from: j */
        private EnumC10370c f27195j;

        /* renamed from: k */
        private C10374d f27196k;

        /* renamed from: a */
        public final C10405p m11613a() {
            String enumC10370c;
            C10415t c10415t = this.f27186a;
            C10420v c10420v = this.f27187b;
            byte[] bArr = this.f27188c;
            List<C10410r> list = this.f27189d;
            Double d = this.f27190e;
            List<C10408q> list2 = this.f27191f;
            C10390j c10390j = this.f27192g;
            Integer num = this.f27193h;
            C10426y c10426y = this.f27194i;
            EnumC10370c enumC10370c2 = this.f27195j;
            if (enumC10370c2 == null) {
                enumC10370c = null;
            } else {
                enumC10370c = enumC10370c2.toString();
            }
            return new C10405p(c10415t, c10420v, bArr, list, d, list2, c10390j, num, c10426y, enumC10370c, this.f27196k);
        }

        /* renamed from: b */
        public final C10406a m11612b(C10390j c10390j) {
            this.f27192g = c10390j;
            return this;
        }

        /* renamed from: c */
        public final C10406a m11611c(byte[] bArr) {
            this.f27188c = (byte[]) C2198p.m33985j(bArr);
            return this;
        }

        /* renamed from: d */
        public final C10406a m11610d(List<C10408q> list) {
            this.f27191f = list;
            return this;
        }

        /* renamed from: e */
        public final C10406a m11609e(List<C10410r> list) {
            this.f27189d = (List) C2198p.m33985j(list);
            return this;
        }

        /* renamed from: f */
        public final C10406a m11608f(C10415t c10415t) {
            this.f27186a = (C10415t) C2198p.m33985j(c10415t);
            return this;
        }

        /* renamed from: g */
        public final C10406a m11607g(Double d) {
            this.f27190e = d;
            return this;
        }

        /* renamed from: h */
        public final C10406a m11606h(C10420v c10420v) {
            this.f27187b = (C10420v) C2198p.m33985j(c10420v);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10405p(C10415t c10415t, C10420v c10420v, byte[] bArr, List<C10410r> list, Double d, List<C10408q> list2, C10390j c10390j, Integer num, C10426y c10426y, String str, C10374d c10374d) {
        this.f27175j = (C10415t) C2198p.m33985j(c10415t);
        this.f27176k = (C10420v) C2198p.m33985j(c10420v);
        this.f27177l = (byte[]) C2198p.m33985j(bArr);
        this.f27178m = (List) C2198p.m33985j(list);
        this.f27179n = d;
        this.f27180o = list2;
        this.f27181p = c10390j;
        this.f27182q = num;
        this.f27183r = c10426y;
        if (str != null) {
            try {
                this.f27184s = EnumC10370c.m11652a(str);
            } catch (EnumC10370c.C10371a e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f27184s = null;
        }
        this.f27185t = c10374d;
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: A */
    public Integer mo11583A() {
        return this.f27182q;
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: G */
    public Double mo11582G() {
        return this.f27179n;
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: H */
    public C10426y mo11581H() {
        return this.f27183r;
    }

    /* renamed from: J */
    public String m11619J() {
        EnumC10370c enumC10370c = this.f27184s;
        if (enumC10370c == null) {
            return null;
        }
        return enumC10370c.toString();
    }

    /* renamed from: M */
    public C10390j m11618M() {
        return this.f27181p;
    }

    /* renamed from: Q */
    public List<C10408q> m11617Q() {
        return this.f27180o;
    }

    /* renamed from: U */
    public List<C10410r> m11616U() {
        return this.f27178m;
    }

    /* renamed from: V */
    public C10415t m11615V() {
        return this.f27175j;
    }

    /* renamed from: W */
    public C10420v m11614W() {
        return this.f27176k;
    }

    public boolean equals(Object obj) {
        List<C10408q> list;
        List<C10408q> list2;
        if (!(obj instanceof C10405p)) {
            return false;
        }
        C10405p c10405p = (C10405p) obj;
        if (!C2190n.m34004b(this.f27175j, c10405p.f27175j) || !C2190n.m34004b(this.f27176k, c10405p.f27176k) || !Arrays.equals(this.f27177l, c10405p.f27177l) || !C2190n.m34004b(this.f27179n, c10405p.f27179n) || !this.f27178m.containsAll(c10405p.f27178m) || !c10405p.f27178m.containsAll(this.f27178m) || ((((list = this.f27180o) != null || c10405p.f27180o != null) && (list == null || (list2 = c10405p.f27180o) == null || !list.containsAll(list2) || !c10405p.f27180o.containsAll(this.f27180o))) || !C2190n.m34004b(this.f27181p, c10405p.f27181p) || !C2190n.m34004b(this.f27182q, c10405p.f27182q) || !C2190n.m34004b(this.f27183r, c10405p.f27183r) || !C2190n.m34004b(this.f27184s, c10405p.f27184s) || !C2190n.m34004b(this.f27185t, c10405p.f27185t))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f27175j, this.f27176k, Integer.valueOf(Arrays.hashCode(this.f27177l)), this.f27178m, this.f27179n, this.f27180o, this.f27181p, this.f27182q, this.f27183r, this.f27184s, this.f27185t);
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: r */
    public C10374d mo11580r() {
        return this.f27185t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 2, m11615V(), i, false);
        C2464c.m33170n(parcel, 3, m11614W(), i, false);
        C2464c.m33178f(parcel, 4, mo11579z(), false);
        C2464c.m33164t(parcel, 5, m11616U(), false);
        C2464c.m33176h(parcel, 6, mo11582G(), false);
        C2464c.m33164t(parcel, 7, m11617Q(), false);
        C2464c.m33170n(parcel, 8, m11618M(), i, false);
        C2464c.m33172l(parcel, 9, mo11583A(), false);
        C2464c.m33170n(parcel, 10, mo11581H(), i, false);
        C2464c.m33168p(parcel, 11, m11619J(), false);
        C2464c.m33170n(parcel, 12, mo11580r(), i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    @Override // p231m9.AbstractC10424x
    /* renamed from: z */
    public byte[] mo11579z() {
        return this.f27177l;
    }
}
