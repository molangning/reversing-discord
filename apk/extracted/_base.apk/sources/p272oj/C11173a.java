package p272oj;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p184jj.AbstractC9006p;
import p184jj.EnumC9001k;
import p184jj.InterfaceC9005o;

/* renamed from: oj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C11173a implements InterfaceC9005o {

    /* renamed from: a */
    private static final Map<String, AbstractC9006p> f29203a;

    /* renamed from: b */
    private static final AbstractC9006p f29204b;

    /* renamed from: c */
    private static final Map<String, AbstractC9006p> f29205c;

    /* renamed from: d */
    private static final AbstractC9006p f29206d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oj.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C11174a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29207a;

        static {
            int[] iArr = new int[EnumC9001k.values().length];
            f29207a = iArr;
            try {
                iArr[EnumC9001k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29207a[EnumC9001k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C11175b extends AbstractC9006p {

        /* renamed from: g */
        private final int f29208g;

        /* synthetic */ C11175b(int i, C11174a c11174a) {
            this(i);
        }

        private C11175b(int i) {
            this.f29208g = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C11176c extends AbstractC9006p {

        /* renamed from: g */
        private final int f29209g;

        /* synthetic */ C11176c(int i, C11174a c11174a) {
            this(i);
        }

        private C11176c(int i) {
            this.f29209g = i;
        }
    }

    static {
        HashMap hashMap = new HashMap(140);
        f29203a = hashMap;
        f29204b = new C11175b(0, null);
        HashMap hashMap2 = new HashMap();
        m9077b(hashMap2, "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt", -1);
        m9077b(hashMap2, "lo ms my nqo root sah ses sg th to vi wo yo zh", -1);
        m9077b(hashMap2, "pt_PT", 0);
        m9077b(hashMap2, "am as bn fa gu hi kn zu", 1);
        m9077b(hashMap2, "ff fr hy kab pt", 1);
        m9077b(hashMap2, "si", 1);
        m9077b(hashMap2, "ak bh guw ln mg nso pa ti wa", 1);
        m9077b(hashMap2, "tzm", 2);
        m9077b(hashMap2, "is", 3);
        m9077b(hashMap2, "mk", 4);
        m9077b(hashMap2, "ceb fil tl", 5);
        m9077b(hashMap2, "lv prg", 6);
        m9077b(hashMap2, "lag ksh", 7);
        m9077b(hashMap2, "iu naq se sma smi smj smn sms", 8);
        m9077b(hashMap2, "shi", 9);
        m9077b(hashMap2, "mo ro", 10);
        m9077b(hashMap2, "bs hr sh sr", 11);
        m9077b(hashMap2, "gd", 12);
        m9077b(hashMap2, "sl", 13);
        m9077b(hashMap2, "he iw", 14);
        m9077b(hashMap2, "cs sk", 15);
        m9077b(hashMap2, "pl", 16);
        m9077b(hashMap2, "be", 17);
        m9077b(hashMap2, "lt", 18);
        m9077b(hashMap2, "mt", 19);
        m9077b(hashMap2, "ru uk", 17);
        m9077b(hashMap2, "br", 20);
        m9077b(hashMap2, "ga", 21);
        m9077b(hashMap2, "gv", 22);
        m9077b(hashMap2, "ar", 23);
        m9077b(hashMap2, "cy", 24);
        m9077b(hashMap2, "dsb hsb", 25);
        m9077b(hashMap2, "kw", 26);
        hashMap.putAll(hashMap2);
        HashMap hashMap3 = new HashMap(140);
        f29205c = hashMap3;
        f29206d = new C11176c(0, null);
        HashMap hashMap4 = new HashMap();
        m9076c(hashMap4, "sv", 1);
        m9076c(hashMap4, "fil fr ga hy lo mo ms ro tl vi", 2);
        m9076c(hashMap4, "hu", 3);
        m9076c(hashMap4, "ne", 4);
        m9076c(hashMap4, "kk", 5);
        m9076c(hashMap4, "it sc scn", 6);
        m9076c(hashMap4, "ka", 7);
        m9076c(hashMap4, "sq", 8);
        m9076c(hashMap4, "en", 9);
        m9076c(hashMap4, "mr", 10);
        m9076c(hashMap4, "ca", 11);
        m9076c(hashMap4, "mk", 12);
        m9076c(hashMap4, "az", 13);
        m9076c(hashMap4, "gu hi", 14);
        m9076c(hashMap4, "as bn", 15);
        m9076c(hashMap4, "cy", 16);
        m9076c(hashMap4, "be", 17);
        m9076c(hashMap4, "uk", 18);
        m9076c(hashMap4, "tk", 19);
        m9076c(hashMap4, "or", 20);
        m9076c(hashMap4, "gd", 21);
        m9076c(hashMap4, "kw", 22);
        hashMap3.putAll(hashMap4);
    }

    /* renamed from: b */
    private static void m9077b(Map<String, AbstractC9006p> map, String str, int i) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new C11175b(i, null));
        }
    }

    /* renamed from: c */
    private static void m9076c(Map<String, AbstractC9006p> map, String str, int i) {
        for (String str2 : str.split(" ")) {
            map.put(str2, new C11176c(i, null));
        }
    }

    @Override // p184jj.InterfaceC9005o
    /* renamed from: a */
    public AbstractC9006p mo9078a(Locale locale, EnumC9001k enumC9001k) {
        Map<String, AbstractC9006p> map;
        AbstractC9006p abstractC9006p;
        AbstractC9006p abstractC9006p2;
        int i = C11174a.f29207a[enumC9001k.ordinal()];
        if (i != 1) {
            if (i == 2) {
                map = f29205c;
                abstractC9006p = f29206d;
            } else {
                throw new UnsupportedOperationException(enumC9001k.name());
            }
        } else {
            map = f29203a;
            abstractC9006p = f29204b;
        }
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            abstractC9006p2 = map.get(locale.getLanguage() + '_' + country);
        } else {
            abstractC9006p2 = null;
        }
        if (abstractC9006p2 == null) {
            abstractC9006p2 = map.get(locale.getLanguage());
        }
        if (abstractC9006p2 == null) {
            return abstractC9006p;
        }
        return abstractC9006p2;
    }
}
