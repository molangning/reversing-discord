package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.InterfaceC10843w;
import p162ij.AbstractC7626a;
import p162ij.AbstractC7629b;
import p162ij.InterfaceC7634d0;
import p162ij.InterfaceC7652j0;
import p162ij.InterfaceC7656l0;
import p162ij.InterfaceC7671w;
import p184jj.AbstractC9017w;

/* renamed from: net.time4j.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10778n<U extends InterfaceC10843w> extends AbstractC7626a<U> implements Serializable {

    /* renamed from: l */
    private static final char f28127l;

    /* renamed from: m */
    private static final C10778n f28128m;

    /* renamed from: n */
    private static final C10779a<EnumC10686f> f28129n;

    /* renamed from: o */
    private static final C10779a<EnumC10686f> f28130o;

    /* renamed from: p */
    private static final C10779a<EnumC10686f> f28131p;

    /* renamed from: q */
    private static final C10779a<EnumC10686f> f28132q;

    /* renamed from: r */
    private static final C10779a<EnumC10704g> f28133r;

    /* renamed from: s */
    private static final C10779a<EnumC10704g> f28134s;
    private static final long serialVersionUID = -6321211763598951499L;

    /* renamed from: t */
    private static final Comparator<InterfaceC7656l0.C7657a<? extends InterfaceC7671w>> f28135t;

    /* renamed from: u */
    public static InterfaceC7634d0<InterfaceC10843w> f28136u;

    /* renamed from: v */
    public static InterfaceC7634d0<EnumC10686f> f28137v;

    /* renamed from: w */
    public static InterfaceC7634d0<EnumC10704g> f28138w;

    /* renamed from: x */
    private static final InterfaceC7652j0<EnumC10686f, C10778n<EnumC10686f>> f28139x;

    /* renamed from: y */
    private static final InterfaceC7652j0<EnumC10704g, C10778n<EnumC10704g>> f28140y;

    /* renamed from: z */
    private static final InterfaceC7652j0<InterfaceC10839u, C10778n<InterfaceC10839u>> f28141z;

    /* renamed from: j */
    private final transient List<InterfaceC7656l0.C7657a<U>> f28142j;

    /* renamed from: k */
    private final transient boolean f28143k;

    /* renamed from: net.time4j.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10779a<U extends InterfaceC10843w> extends AbstractC9017w<U, C10778n<U>> {
        private C10779a(Class<U> cls, String str) {
            super(cls, str);
        }

        /* renamed from: k */
        public static <U extends InterfaceC10843w> C10779a<U> m10245k(Class<U> cls, String str) {
            return new C10779a<>(cls, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p184jj.AbstractC9017w
        /* renamed from: j */
        public U mo10247f(char c) {
            if (c != 'I') {
                if (c != 'M') {
                    if (c != 'Q') {
                        if (c != 'W') {
                            if (c != 'Y') {
                                if (c != 'f') {
                                    if (c != 'h') {
                                        if (c != 'm') {
                                            if (c != 's') {
                                                switch (c) {
                                                    case 'C':
                                                        return EnumC10686f.f27872k;
                                                    case 'D':
                                                        return EnumC10686f.f27878q;
                                                    case 'E':
                                                        return EnumC10686f.f27873l;
                                                    default:
                                                        throw new IllegalArgumentException("Unsupported pattern symbol: " + c);
                                                }
                                            }
                                            return EnumC10704g.f27926l;
                                        }
                                        return EnumC10704g.f27925k;
                                    }
                                    return EnumC10704g.f27924j;
                                }
                                return EnumC10704g.f27929o;
                            }
                            return EnumC10686f.f27874m;
                        }
                        return EnumC10686f.f27877p;
                    }
                    return EnumC10686f.f27875n;
                }
                return EnumC10686f.f27876o;
            }
            return EnumC10686f.f27871j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10780b<U extends InterfaceC10843w> extends AbstractC7629b<U, C10778n<U>> {
        /* synthetic */ C10780b(InterfaceC10843w[] interfaceC10843wArr, C10776m c10776m) {
            this(interfaceC10843wArr);
        }

        private C10780b(U... uArr) {
            super(uArr.length > 1, uArr);
        }
    }

    static {
        char c;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f28127l = c;
        f28128m = new C10778n();
        f28129n = m10254e(true, false);
        f28130o = m10254e(true, true);
        f28131p = m10254e(false, false);
        f28132q = m10254e(false, true);
        f28133r = m10253f(true);
        f28134s = m10253f(false);
        f28135t = C10783o0.m10243b();
        f28136u = C10783o0.m10238j();
        f28137v = C10783o0.m10240g();
        f28138w = C10783o0.m10239i();
        EnumC10686f enumC10686f = EnumC10686f.f27878q;
        f28139x = m10252g(EnumC10686f.f27874m, EnumC10686f.f27876o, enumC10686f);
        f28140y = m10252g(EnumC10704g.f27924j, EnumC10704g.f27925k, EnumC10704g.f27926l, EnumC10704g.f27929o);
        f28141z = m10252g(EnumC10686f.m10730d(), EnumC10686f.f27877p, enumC10686f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10778n(List<InterfaceC7656l0.C7657a<U>> list, boolean z) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            this.f28142j = Collections.emptyList();
        } else {
            Collections.sort(list, f28135t);
            this.f28142j = Collections.unmodifiableList(list);
        }
        this.f28143k = !isEmpty && z;
    }

    /* renamed from: d */
    private int m10255d() {
        return mo10257a().size();
    }

    /* renamed from: e */
    private static C10779a<EnumC10686f> m10254e(boolean z, boolean z2) {
        String str;
        if (z) {
            if (z2) {
                str = "YYYY-DDD";
            } else {
                str = "YYYY-MM-DD";
            }
        } else if (z2) {
            str = "YYYYDDD";
        } else {
            str = "YYYYMMDD";
        }
        return C10779a.m10245k(EnumC10686f.class, str);
    }

    /* renamed from: f */
    private static C10779a<EnumC10704g> m10253f(boolean z) {
        String str;
        if (z) {
            str = "hh[:mm[:ss[,fffffffff]]]";
        } else {
            str = "hh[mm[ss[,fffffffff]]]";
        }
        return C10779a.m10245k(EnumC10704g.class, str);
    }

    /* renamed from: g */
    public static <U extends InterfaceC10843w> InterfaceC7652j0<U, C10778n<U>> m10252g(U... uArr) {
        return new C10780b(uArr, null);
    }

    /* renamed from: h */
    private boolean m10251h(InterfaceC10843w interfaceC10843w) {
        char mo10005a = interfaceC10843w.mo10005a();
        return mo10005a >= '1' && mo10005a <= '9';
    }

    /* renamed from: j */
    public static <U extends InterfaceC10843w> C10778n<U> m10249j() {
        return f28128m;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ff  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m10248k(int r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10778n.m10248k(int):java.lang.String");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 6);
    }

    @Override // p162ij.InterfaceC7656l0
    /* renamed from: a */
    public List<InterfaceC7656l0.C7657a<U>> mo10257a() {
        return this.f28142j;
    }

    /* renamed from: c */
    public boolean m10256c(InterfaceC10843w interfaceC10843w) {
        if (interfaceC10843w == null) {
            return false;
        }
        boolean m10251h = m10251h(interfaceC10843w);
        int size = this.f28142j.size();
        for (int i = 0; i < size; i++) {
            InterfaceC7656l0.C7657a<U> c7657a = this.f28142j.get(i);
            U m20136b = c7657a.m20136b();
            if (m20136b.equals(interfaceC10843w) || (m10251h && m10251h(m20136b))) {
                if (c7657a.m20137a() <= 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10778n)) {
            return false;
        }
        C10778n c10778n = (C10778n) C10778n.class.cast(obj);
        if (this.f28143k == c10778n.f28143k && mo10257a().equals(c10778n.mo10257a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = mo10257a().hashCode();
        if (this.f28143k) {
            return hashCode ^ hashCode;
        }
        return hashCode;
    }

    /* renamed from: i */
    public boolean m10250i() {
        return this.f28143k;
    }

    public String toString() {
        return m10248k(0);
    }

    private C10778n() {
        this.f28142j = Collections.emptyList();
        this.f28143k = false;
    }
}
