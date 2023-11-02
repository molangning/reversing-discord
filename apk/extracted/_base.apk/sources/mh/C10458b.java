package mh;

import kh.C9386c;
import kh.EnumC9415j;
import kh.EnumC9417k;
import kh.EnumC9471x;
import p326rh.C12196j;

/* renamed from: mh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10458b {

    /* renamed from: A */
    public static final C10460b f27302A;

    /* renamed from: B */
    public static final C10460b f27303B;

    /* renamed from: C */
    public static final C10460b f27304C;

    /* renamed from: D */
    public static final C10460b f27305D;

    /* renamed from: E */
    public static final C10460b f27306E;

    /* renamed from: F */
    public static final C10460b f27307F;

    /* renamed from: G */
    public static final C10460b f27308G;

    /* renamed from: H */
    public static final C10460b f27309H;

    /* renamed from: I */
    public static final C10460b f27310I;

    /* renamed from: J */
    public static final C10460b f27311J;

    /* renamed from: K */
    public static final C10460b f27312K;

    /* renamed from: L */
    public static final C10460b f27313L;

    /* renamed from: M */
    public static final C10460b f27314M;

    /* renamed from: N */
    public static final C10460b f27315N;

    /* renamed from: O */
    public static final C10460b f27316O;

    /* renamed from: a */
    public static final C10460b f27317a;

    /* renamed from: b */
    public static final C10460b f27318b;

    /* renamed from: c */
    public static final C10460b f27319c;

    /* renamed from: d */
    public static final AbstractC10462d<EnumC9471x> f27320d;

    /* renamed from: e */
    public static final AbstractC10462d<EnumC9417k> f27321e;

    /* renamed from: f */
    public static final AbstractC10462d<C9386c.EnumC9389c> f27322f;

    /* renamed from: g */
    public static final C10460b f27323g;

    /* renamed from: h */
    public static final C10460b f27324h;

    /* renamed from: i */
    public static final C10460b f27325i;

    /* renamed from: j */
    public static final C10460b f27326j;

    /* renamed from: k */
    public static final C10460b f27327k;

    /* renamed from: l */
    public static final C10460b f27328l;

    /* renamed from: m */
    public static final C10460b f27329m;

    /* renamed from: n */
    public static final C10460b f27330n;

    /* renamed from: o */
    public static final AbstractC10462d<EnumC9415j> f27331o;

    /* renamed from: p */
    public static final C10460b f27332p;

    /* renamed from: q */
    public static final C10460b f27333q;

    /* renamed from: r */
    public static final C10460b f27334r;

    /* renamed from: s */
    public static final C10460b f27335s;

    /* renamed from: t */
    public static final C10460b f27336t;

    /* renamed from: u */
    public static final C10460b f27337u;

    /* renamed from: v */
    public static final C10460b f27338v;

    /* renamed from: w */
    public static final C10460b f27339w;

    /* renamed from: x */
    public static final C10460b f27340x;

    /* renamed from: y */
    public static final C10460b f27341y;

    /* renamed from: z */
    public static final C10460b f27342z;

    /* renamed from: mh.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10460b extends AbstractC10462d<Boolean> {
        public C10460b(int i) {
            super(i, 1);
        }

        /* renamed from: f */
        private static /* synthetic */ void m11498f(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // mh.C10458b.AbstractC10462d
        /* renamed from: g */
        public Boolean mo11488d(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.f27344a)) != 0);
            if (valueOf == null) {
                m11498f(0);
            }
            return valueOf;
        }

        @Override // mh.C10458b.AbstractC10462d
        /* renamed from: h */
        public int mo11487e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f27344a;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mh.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10461c<E extends C12196j.InterfaceC12197a> extends AbstractC10462d<E> {

        /* renamed from: c */
        private final E[] f27343c;

        public C10461c(int i, E[] eArr) {
            super(i, m11494g(eArr));
            this.f27343c = eArr;
        }

        /* renamed from: f */
        private static /* synthetic */ void m11495f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* renamed from: g */
        private static <E> int m11494g(E[] eArr) {
            if (eArr == null) {
                m11495f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // mh.C10458b.AbstractC10462d
        /* renamed from: h */
        public E mo11488d(int i) {
            E[] eArr;
            int i2 = this.f27344a;
            int i3 = (i & (((1 << this.f27345b) - 1) << i2)) >> i2;
            for (E e : this.f27343c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }

        @Override // mh.C10458b.AbstractC10462d
        /* renamed from: i */
        public int mo11487e(E e) {
            return e.getNumber() << this.f27344a;
        }
    }

    /* renamed from: mh.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC10462d<E> {

        /* renamed from: a */
        public final int f27344a;

        /* renamed from: b */
        public final int f27345b;

        /* JADX WARN: Incorrect types in method signature: <E::Lrh/j$a;>(Lmh/b$d<*>;[TE;)Lmh/b$d<TE;>; */
        /* renamed from: a */
        public static AbstractC10462d m11491a(AbstractC10462d abstractC10462d, C12196j.InterfaceC12197a[] interfaceC12197aArr) {
            return new C10461c(abstractC10462d.f27344a + abstractC10462d.f27345b, interfaceC12197aArr);
        }

        /* renamed from: b */
        public static C10460b m11490b(AbstractC10462d<?> abstractC10462d) {
            return new C10460b(abstractC10462d.f27344a + abstractC10462d.f27345b);
        }

        /* renamed from: c */
        public static C10460b m11489c() {
            return new C10460b(0);
        }

        /* renamed from: d */
        public abstract E mo11488d(int i);

        /* renamed from: e */
        public abstract int mo11487e(E e);

        private AbstractC10462d(int i, int i2) {
            this.f27344a = i;
            this.f27345b = i2;
        }
    }

    static {
        C10460b m11489c = AbstractC10462d.m11489c();
        f27317a = m11489c;
        f27318b = AbstractC10462d.m11490b(m11489c);
        C10460b m11489c2 = AbstractC10462d.m11489c();
        f27319c = m11489c2;
        AbstractC10462d<EnumC9471x> m11491a = AbstractC10462d.m11491a(m11489c2, EnumC9471x.values());
        f27320d = m11491a;
        AbstractC10462d<EnumC9417k> m11491a2 = AbstractC10462d.m11491a(m11491a, EnumC9417k.values());
        f27321e = m11491a2;
        AbstractC10462d<C9386c.EnumC9389c> m11491a3 = AbstractC10462d.m11491a(m11491a2, C9386c.EnumC9389c.values());
        f27322f = m11491a3;
        C10460b m11490b = AbstractC10462d.m11490b(m11491a3);
        f27323g = m11490b;
        C10460b m11490b2 = AbstractC10462d.m11490b(m11490b);
        f27324h = m11490b2;
        C10460b m11490b3 = AbstractC10462d.m11490b(m11490b2);
        f27325i = m11490b3;
        C10460b m11490b4 = AbstractC10462d.m11490b(m11490b3);
        f27326j = m11490b4;
        C10460b m11490b5 = AbstractC10462d.m11490b(m11490b4);
        f27327k = m11490b5;
        f27328l = AbstractC10462d.m11490b(m11490b5);
        C10460b m11490b6 = AbstractC10462d.m11490b(m11491a);
        f27329m = m11490b6;
        f27330n = AbstractC10462d.m11490b(m11490b6);
        AbstractC10462d<EnumC9415j> m11491a4 = AbstractC10462d.m11491a(m11491a2, EnumC9415j.values());
        f27331o = m11491a4;
        C10460b m11490b7 = AbstractC10462d.m11490b(m11491a4);
        f27332p = m11490b7;
        C10460b m11490b8 = AbstractC10462d.m11490b(m11490b7);
        f27333q = m11490b8;
        C10460b m11490b9 = AbstractC10462d.m11490b(m11490b8);
        f27334r = m11490b9;
        C10460b m11490b10 = AbstractC10462d.m11490b(m11490b9);
        f27335s = m11490b10;
        C10460b m11490b11 = AbstractC10462d.m11490b(m11490b10);
        f27336t = m11490b11;
        C10460b m11490b12 = AbstractC10462d.m11490b(m11490b11);
        f27337u = m11490b12;
        C10460b m11490b13 = AbstractC10462d.m11490b(m11490b12);
        f27338v = m11490b13;
        f27339w = AbstractC10462d.m11490b(m11490b13);
        C10460b m11490b14 = AbstractC10462d.m11490b(m11491a4);
        f27340x = m11490b14;
        C10460b m11490b15 = AbstractC10462d.m11490b(m11490b14);
        f27341y = m11490b15;
        C10460b m11490b16 = AbstractC10462d.m11490b(m11490b15);
        f27342z = m11490b16;
        C10460b m11490b17 = AbstractC10462d.m11490b(m11490b16);
        f27302A = m11490b17;
        C10460b m11490b18 = AbstractC10462d.m11490b(m11490b17);
        f27303B = m11490b18;
        C10460b m11490b19 = AbstractC10462d.m11490b(m11490b18);
        f27304C = m11490b19;
        C10460b m11490b20 = AbstractC10462d.m11490b(m11490b19);
        f27305D = m11490b20;
        C10460b m11490b21 = AbstractC10462d.m11490b(m11490b20);
        f27306E = m11490b21;
        f27307F = AbstractC10462d.m11490b(m11490b21);
        C10460b m11490b22 = AbstractC10462d.m11490b(m11489c2);
        f27308G = m11490b22;
        C10460b m11490b23 = AbstractC10462d.m11490b(m11490b22);
        f27309H = m11490b23;
        f27310I = AbstractC10462d.m11490b(m11490b23);
        C10460b m11490b24 = AbstractC10462d.m11490b(m11491a2);
        f27311J = m11490b24;
        C10460b m11490b25 = AbstractC10462d.m11490b(m11490b24);
        f27312K = m11490b25;
        f27313L = AbstractC10462d.m11490b(m11490b25);
        C10460b m11489c3 = AbstractC10462d.m11489c();
        f27314M = m11489c3;
        f27315N = AbstractC10462d.m11490b(m11489c3);
        f27316O = AbstractC10462d.m11489c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m11500a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.C10458b.m11500a(int):void");
    }

    /* renamed from: b */
    public static int m11499b(boolean z, EnumC9471x enumC9471x, EnumC9417k enumC9417k, boolean z2, boolean z3, boolean z4) {
        if (enumC9471x == null) {
            m11500a(10);
        }
        if (enumC9417k == null) {
            m11500a(11);
        }
        return f27319c.mo11487e(Boolean.valueOf(z)) | f27321e.mo11487e(enumC9417k) | f27320d.mo11487e(enumC9471x) | f27311J.mo11487e(Boolean.valueOf(z2)) | f27312K.mo11487e(Boolean.valueOf(z3)) | f27313L.mo11487e(Boolean.valueOf(z4));
    }
}
