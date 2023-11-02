package androidx.core.p018os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C1063j implements InterfaceC1064k {

    /* renamed from: c */
    private static final Locale[] f3399c = new Locale[0];

    /* renamed from: d */
    private static final Locale f3400d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f3401e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f3402f = LocaleListCompat.m38004b("en-Latn");

    /* renamed from: a */
    private final Locale[] f3403a;

    /* renamed from: b */
    private final String f3404b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1063j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3403a = f3399c;
            this.f3404b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m37967c(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f3403a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f3404b = sb2.toString();
    }

    /* renamed from: c */
    static void m37967c(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    /* renamed from: a */
    public String mo37961a() {
        return this.f3404b;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    /* renamed from: b */
    public Object mo37960b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1063j)) {
            return false;
        }
        Locale[] localeArr = ((C1063j) obj).f3403a;
        if (this.f3403a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f3403a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f3403a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f3403a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    public boolean isEmpty() {
        return this.f3403a.length == 0;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    public int size() {
        return this.f3403a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f3403a;
            if (i < localeArr.length) {
                sb2.append(localeArr[i]);
                if (i < this.f3403a.length - 1) {
                    sb2.append(',');
                }
                i++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
