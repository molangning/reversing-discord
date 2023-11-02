package com.facebook.hermes.intl;

import p128h4.C6925h;

/* renamed from: com.facebook.hermes.intl.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C3673e {

    /* renamed from: a */
    private CharSequence f10217a;

    /* renamed from: b */
    int f10218b = 0;

    /* renamed from: c */
    int f10219c = -1;

    /* renamed from: com.facebook.hermes.intl.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3674a {

        /* renamed from: a */
        private CharSequence f10220a;

        /* renamed from: b */
        private int f10221b;

        /* renamed from: c */
        private int f10222c;

        C3674a(CharSequence charSequence, int i, int i2) {
            this.f10220a = charSequence;
            this.f10221b = i;
            this.f10222c = i2;
        }

        /* renamed from: a */
        public boolean m31304a() {
            return C6925h.m21664h(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: b */
        public boolean m31303b() {
            return C6925h.m21663i(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: c */
        public boolean m31302c() {
            return C6925h.m21662j(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: d */
        public boolean m31301d() {
            return C6925h.m21661k(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: e */
        public boolean m31300e() {
            return C6925h.m21660l(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: f */
        public boolean m31299f() {
            return C6925h.m21659m(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: g */
        public boolean m31298g() {
            return C6925h.m21658n(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: h */
        public boolean m31297h() {
            return C6925h.m21657o(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: i */
        public boolean m31296i() {
            return C6925h.m21656p(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: j */
        public boolean m31295j() {
            return C6925h.m21655q(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: k */
        public boolean m31294k() {
            return C6925h.m21654r(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: l */
        public boolean m31293l() {
            return C6925h.m21653s(this.f10220a, this.f10221b, this.f10222c);
        }

        /* renamed from: m */
        public String m31292m() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f10221b; i <= this.f10222c; i++) {
                stringBuffer.append(Character.toLowerCase(this.f10220a.charAt(i)));
            }
            return stringBuffer.toString();
        }

        /* renamed from: n */
        public String m31291n() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f10221b; i <= this.f10222c; i++) {
                if (i == this.f10221b) {
                    stringBuffer.append(Character.toUpperCase(this.f10220a.charAt(i)));
                } else {
                    stringBuffer.append(Character.toLowerCase(this.f10220a.charAt(i)));
                }
            }
            return stringBuffer.toString();
        }

        /* renamed from: o */
        public String m31290o() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f10221b; i <= this.f10222c; i++) {
                stringBuffer.append(Character.toUpperCase(this.f10220a.charAt(i)));
            }
            return stringBuffer.toString();
        }

        public String toString() {
            return this.f10220a.subSequence(this.f10221b, this.f10222c + 1).toString();
        }
    }

    /* renamed from: com.facebook.hermes.intl.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3675b extends Exception {
        public C3675b() {
        }
    }

    public C3673e(CharSequence charSequence) {
        this.f10217a = charSequence;
    }

    /* renamed from: b */
    private static boolean m31306b(char c) {
        return c == '-';
    }

    /* renamed from: a */
    public boolean m31307a() {
        return this.f10217a.length() > 0 && this.f10219c < this.f10217a.length() - 1;
    }

    /* renamed from: c */
    public C3674a m31305c() {
        if (m31307a()) {
            int i = this.f10219c;
            if (i >= this.f10218b) {
                if (m31306b(this.f10217a.charAt(i + 1))) {
                    if (this.f10219c + 2 != this.f10217a.length()) {
                        this.f10218b = this.f10219c + 2;
                    } else {
                        throw new C3675b();
                    }
                } else {
                    throw new C3675b();
                }
            }
            this.f10219c = this.f10218b;
            while (this.f10219c < this.f10217a.length() && !m31306b(this.f10217a.charAt(this.f10219c))) {
                this.f10219c++;
            }
            int i2 = this.f10219c;
            int i3 = this.f10218b;
            if (i2 > i3) {
                int i4 = i2 - 1;
                this.f10219c = i4;
                return new C3674a(this.f10217a, i3, i4);
            }
            throw new C3675b();
        }
        throw new C3675b();
    }
}
