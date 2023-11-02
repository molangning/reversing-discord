package ph;

/* renamed from: ph.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11632b {

    /* renamed from: a */
    private final C11633c f30199a;

    /* renamed from: b */
    private final C11633c f30200b;

    /* renamed from: c */
    private final boolean f30201c;

    public C11632b(C11633c c11633c, C11633c c11633c2, boolean z) {
        if (c11633c == null) {
            m7472a(1);
        }
        if (c11633c2 == null) {
            m7472a(2);
        }
        this.f30199a = c11633c;
        this.f30200b = c11633c2;
        this.f30201c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m7472a(int r10) {
        /*
            r0 = 9
            r1 = 7
            r2 = 6
            r3 = 5
            if (r10 == r3) goto L13
            if (r10 == r2) goto L13
            if (r10 == r1) goto L13
            if (r10 == r0) goto L13
            switch(r10) {
                case 13: goto L13;
                case 14: goto L13;
                case 15: goto L13;
                case 16: goto L13;
                default: goto L10;
            }
        L10:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L15
        L13:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L15:
            r5 = 2
            if (r10 == r3) goto L23
            if (r10 == r2) goto L23
            if (r10 == r1) goto L23
            if (r10 == r0) goto L23
            switch(r10) {
                case 13: goto L23;
                case 14: goto L23;
                case 15: goto L23;
                case 16: goto L23;
                default: goto L21;
            }
        L21:
            r6 = 3
            goto L24
        L23:
            r6 = r5
        L24:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/name/ClassId"
            r8 = 0
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L4d;
                case 4: goto L43;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L3b;
                case 9: goto L40;
                case 10: goto L36;
                case 11: goto L31;
                case 12: goto L31;
                case 13: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                case 16: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.String r9 = "topLevelFqName"
            r6[r8] = r9
            goto L51
        L31:
            java.lang.String r9 = "string"
            r6[r8] = r9
            goto L51
        L36:
            java.lang.String r9 = "segment"
            r6[r8] = r9
            goto L51
        L3b:
            java.lang.String r9 = "name"
            r6[r8] = r9
            goto L51
        L40:
            r6[r8] = r7
            goto L51
        L43:
            java.lang.String r9 = "topLevelName"
            r6[r8] = r9
            goto L51
        L48:
            java.lang.String r9 = "relativeClassName"
            r6[r8] = r9
            goto L51
        L4d:
            java.lang.String r9 = "packageFqName"
            r6[r8] = r9
        L51:
            r8 = 1
            if (r10 == r3) goto L79
            if (r10 == r2) goto L74
            if (r10 == r1) goto L6f
            if (r10 == r0) goto L6a
            switch(r10) {
                case 13: goto L65;
                case 14: goto L65;
                case 15: goto L60;
                case 16: goto L60;
                default: goto L5d;
            }
        L5d:
            r6[r8] = r7
            goto L7d
        L60:
            java.lang.String r7 = "asFqNameString"
            r6[r8] = r7
            goto L7d
        L65:
            java.lang.String r7 = "asString"
            r6[r8] = r7
            goto L7d
        L6a:
            java.lang.String r7 = "asSingleFqName"
            r6[r8] = r7
            goto L7d
        L6f:
            java.lang.String r7 = "getShortClassName"
            r6[r8] = r7
            goto L7d
        L74:
            java.lang.String r7 = "getRelativeClassName"
            r6[r8] = r7
            goto L7d
        L79:
            java.lang.String r7 = "getPackageFqName"
            r6[r8] = r7
        L7d:
            switch(r10) {
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L94;
                case 4: goto L94;
                case 5: goto L98;
                case 6: goto L98;
                case 7: goto L98;
                case 8: goto L8f;
                case 9: goto L98;
                case 10: goto L8a;
                case 11: goto L85;
                case 12: goto L85;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                case 16: goto L98;
                default: goto L80;
            }
        L80:
            java.lang.String r7 = "topLevel"
            r6[r5] = r7
            goto L98
        L85:
            java.lang.String r7 = "fromString"
            r6[r5] = r7
            goto L98
        L8a:
            java.lang.String r7 = "startsWith"
            r6[r5] = r7
            goto L98
        L8f:
            java.lang.String r7 = "createNestedClassId"
            r6[r5] = r7
            goto L98
        L94:
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L98:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto Lad
            if (r10 == r2) goto Lad
            if (r10 == r1) goto Lad
            if (r10 == r0) goto Lad
            switch(r10) {
                case 13: goto Lad;
                case 14: goto Lad;
                case 15: goto Lad;
                case 16: goto Lad;
                default: goto La7;
            }
        La7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto Lb2
        Lad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        Lb2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C11632b.m7472a(int):void");
    }

    /* renamed from: e */
    public static C11632b m7468e(String str) {
        if (str == null) {
            m7472a(11);
        }
        return m7467f(str, false);
    }

    /* renamed from: f */
    public static C11632b m7467f(String str, boolean z) {
        String str2;
        if (str == null) {
            m7472a(12);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new C11632b(new C11633c(str2), new C11633c(str), z);
    }

    /* renamed from: m */
    public static C11632b m7460m(C11633c c11633c) {
        if (c11633c == null) {
            m7472a(0);
        }
        return new C11632b(c11633c.m7455e(), c11633c.m7453g());
    }

    /* renamed from: b */
    public C11633c m7471b() {
        if (this.f30199a.m7456d()) {
            C11633c c11633c = this.f30200b;
            if (c11633c == null) {
                m7472a(9);
            }
            return c11633c;
        }
        return new C11633c(this.f30199a.m7458b() + "." + this.f30200b.m7458b());
    }

    /* renamed from: c */
    public String m7470c() {
        if (this.f30199a.m7456d()) {
            String m7458b = this.f30200b.m7458b();
            if (m7458b == null) {
                m7472a(13);
            }
            return m7458b;
        }
        String str = this.f30199a.m7458b().replace('.', '/') + "/" + this.f30200b.m7458b();
        if (str == null) {
            m7472a(14);
        }
        return str;
    }

    /* renamed from: d */
    public C11632b m7469d(C11638f c11638f) {
        if (c11638f == null) {
            m7472a(8);
        }
        return new C11632b(m7465h(), this.f30200b.m7457c(c11638f), this.f30201c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11632b.class != obj.getClass()) {
            return false;
        }
        C11632b c11632b = (C11632b) obj;
        if (this.f30199a.equals(c11632b.f30199a) && this.f30200b.equals(c11632b.f30200b) && this.f30201c == c11632b.f30201c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C11632b m7466g() {
        C11633c m7455e = this.f30200b.m7455e();
        if (m7455e.m7456d()) {
            return null;
        }
        return new C11632b(m7465h(), m7455e, this.f30201c);
    }

    /* renamed from: h */
    public C11633c m7465h() {
        C11633c c11633c = this.f30199a;
        if (c11633c == null) {
            m7472a(5);
        }
        return c11633c;
    }

    public int hashCode() {
        return (((this.f30199a.hashCode() * 31) + this.f30200b.hashCode()) * 31) + Boolean.valueOf(this.f30201c).hashCode();
    }

    /* renamed from: i */
    public C11633c m7464i() {
        C11633c c11633c = this.f30200b;
        if (c11633c == null) {
            m7472a(6);
        }
        return c11633c;
    }

    /* renamed from: j */
    public C11638f m7463j() {
        C11638f m7453g = this.f30200b.m7453g();
        if (m7453g == null) {
            m7472a(7);
        }
        return m7453g;
    }

    /* renamed from: k */
    public boolean m7462k() {
        return this.f30201c;
    }

    /* renamed from: l */
    public boolean m7461l() {
        return !this.f30200b.m7455e().m7456d();
    }

    public String toString() {
        if (this.f30199a.m7456d()) {
            return "/" + m7470c();
        }
        return m7470c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11632b(C11633c c11633c, C11638f c11638f) {
        this(c11633c, C11633c.m7449k(c11638f), false);
        if (c11633c == null) {
            m7472a(3);
        }
        if (c11638f == null) {
            m7472a(4);
        }
    }
}
