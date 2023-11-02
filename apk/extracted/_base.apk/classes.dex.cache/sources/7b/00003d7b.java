package p184jj;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: jj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface InterfaceC8983i {

    /* renamed from: a */
    public static final InterfaceC8983i f23619a = new C8984a();

    /* renamed from: jj.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static class C8984a implements InterfaceC8983i {
        C8984a() {
        }

        /* renamed from: g */
        private DecimalFormatSymbols m16886g(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }

        @Override // p184jj.InterfaceC8983i
        /* renamed from: a */
        public Locale[] mo9035a() {
            return DecimalFormatSymbols.getAvailableLocales();
        }

        @Override // p184jj.InterfaceC8983i
        /* renamed from: b */
        public char mo9034b(Locale locale) {
            return m16886g(locale).getDecimalSeparator();
        }

        @Override // p184jj.InterfaceC8983i
        /* renamed from: c */
        public String mo9033c(Locale locale) {
            if (locale.getLanguage().equals("ar")) {
                return "\u200f+";
            }
            return String.valueOf('+');
        }

        @Override // p184jj.InterfaceC8983i
        /* renamed from: d */
        public EnumC8985j mo9032d(Locale locale) {
            return EnumC8985j.f23622j;
        }

        @Override // p184jj.InterfaceC8983i
        /* renamed from: e */
        public String mo9031e(Locale locale) {
            if (locale.getLanguage().equals("ar")) {
                return "\u200f-";
            }
            return String.valueOf(m16886g(locale).getMinusSign());
        }

        @Override // p184jj.InterfaceC8983i
        /* renamed from: f */
        public char mo9030f(Locale locale) {
            return m16886g(locale).getZeroDigit();
        }
    }

    /* renamed from: a */
    Locale[] mo9035a();

    /* renamed from: b */
    char mo9034b(Locale locale);

    /* renamed from: c */
    String mo9033c(Locale locale);

    /* renamed from: d */
    EnumC8985j mo9032d(Locale locale);

    /* renamed from: e */
    String mo9031e(Locale locale);

    /* renamed from: f */
    char mo9030f(Locale locale);
}