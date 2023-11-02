package p102fb;

/* renamed from: fb.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6369c implements InterfaceC6379i<Character> {

    /* renamed from: fb.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static abstract class AbstractC6370a extends AbstractC6369c {
        AbstractC6370a() {
        }

        @Override // p102fb.InterfaceC6379i
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.m22851b(ch2);
        }
    }

    /* renamed from: fb.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6371b extends AbstractC6370a {

        /* renamed from: a */
        private final char f18018a;

        C6371b(char c) {
            this.f18018a = c;
        }

        @Override // p102fb.AbstractC6369c
        /* renamed from: e */
        public boolean mo22846e(char c) {
            return c == this.f18018a;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC6369c.m22848g(this.f18018a) + "')";
        }
    }

    /* renamed from: fb.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static abstract class AbstractC6372c extends AbstractC6370a {

        /* renamed from: a */
        private final String f18019a;

        AbstractC6372c(String str) {
            this.f18019a = (String) C6378h.m22834j(str);
        }

        public final String toString() {
            return this.f18019a;
        }
    }

    /* renamed from: fb.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6373d extends AbstractC6372c {

        /* renamed from: b */
        static final C6373d f18020b = new C6373d();

        private C6373d() {
            super("CharMatcher.none()");
        }

        @Override // p102fb.AbstractC6369c
        /* renamed from: c */
        public int mo22847c(CharSequence charSequence, int i) {
            C6378h.m22832l(i, charSequence.length());
            return -1;
        }

        @Override // p102fb.AbstractC6369c
        /* renamed from: e */
        public boolean mo22846e(char c) {
            return false;
        }
    }

    protected AbstractC6369c() {
    }

    /* renamed from: d */
    public static AbstractC6369c m22850d(char c) {
        return new C6371b(c);
    }

    /* renamed from: f */
    public static AbstractC6369c m22849f() {
        return C6373d.f18020b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static String m22848g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean m22851b(Character ch2) {
        return mo22846e(ch2.charValue());
    }

    /* renamed from: c */
    public int mo22847c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C6378h.m22832l(i, length);
        while (i < length) {
            if (mo22846e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo22846e(char c);
}
