package p184jj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p162ij.InterfaceC7656l0;

/* renamed from: jj.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public abstract class AbstractC9017w<U, S extends InterfaceC7656l0<U>> {

    /* renamed from: d */
    private static final Object f23670d = new Object();

    /* renamed from: a */
    private final Class<U> f23671a;

    /* renamed from: b */
    private final List<AbstractC9019b<U>> f23672b;

    /* renamed from: c */
    private final String f23673c;

    /* renamed from: jj.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static abstract class AbstractC9019b<U> {

        /* renamed from: a */
        private final int f23674a;

        AbstractC9019b(int i) {
            this.f23674a = i;
        }

        /* renamed from: a */
        abstract int mo16845a();

        /* renamed from: b */
        abstract AbstractC9019b<U> mo16844b(int i);
    }

    /* renamed from: jj.w$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9020c<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final int f23675b;

        /* renamed from: c */
        private final U f23676c;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return this.f23675b;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return new C9020c(i, this.f23675b, this.f23676c);
        }

        private C9020c(int i, int i2, U u) {
            super(i);
            if (i2 >= 1 && i2 <= 9) {
                this.f23675b = i2;
                this.f23676c = u;
                return;
            }
            throw new IllegalArgumentException("Fraction width out of bounds: " + i2);
        }
    }

    /* renamed from: jj.w$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9022e<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final int f23678b;

        /* renamed from: c */
        private final int f23679c;

        /* renamed from: d */
        private final U f23680d;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return this.f23678b;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return new C9022e(i, this.f23678b, this.f23679c, this.f23680d);
        }

        private C9022e(int i, int i2, int i3, U u) {
            super(i);
            if (i2 < 1 || i2 > 18) {
                throw new IllegalArgumentException("Min width out of bounds: " + i2);
            } else if (i3 < i2) {
                throw new IllegalArgumentException("Max width smaller than min width.");
            } else {
                if (i3 > 18) {
                    throw new IllegalArgumentException("Max width out of bounds: " + i3);
                } else if (u != null) {
                    this.f23678b = i2;
                    this.f23679c = i3;
                    this.f23680d = u;
                } else {
                    throw new NullPointerException("Missing unit.");
                }
            }
        }
    }

    /* renamed from: jj.w$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9023f<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final List<AbstractC9019b<U>> f23681b;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return 0;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            ArrayList arrayList = new ArrayList(this.f23681b);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractC9019b abstractC9019b = (AbstractC9019b) arrayList.get(size);
                arrayList.set(size, abstractC9019b.mo16844b(i));
                i += abstractC9019b.mo16845a();
            }
            return new C9023f(arrayList);
        }

        private C9023f(List<AbstractC9019b<U>> list) {
            super(0);
            if (!list.isEmpty()) {
                AbstractC9019b<U> abstractC9019b = list.get(0);
                C9024g c9024g = C9024g.f23682b;
                if (abstractC9019b != c9024g && list.get(list.size() - 1) != c9024g) {
                    this.f23681b = Collections.unmodifiableList(list);
                    return;
                }
                throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
            }
            throw new IllegalArgumentException("Optional section is empty.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.w$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9024g<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        static final C9024g f23682b = new C9024g();

        private C9024g() {
            super(0);
        }

        /* renamed from: c */
        static <U> AbstractC9019b<U> m16846c() {
            return f23682b;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return 0;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return this;
        }
    }

    /* renamed from: jj.w$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9025h<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final C9022e<U> f23683b;

        /* renamed from: c */
        private final AbstractC9019b<U> f23684c;

        /* renamed from: d */
        private final AbstractC9006p f23685d;

        /* renamed from: e */
        private final Map<EnumC9004n, String> f23686e;

        /* renamed from: f */
        private final int f23687f;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return this.f23687f;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return new C9025h(i, this.f23683b, this.f23684c, this.f23685d, this.f23686e, this.f23687f);
        }

        private C9025h(U u, String str, AbstractC9006p abstractC9006p, Map<EnumC9004n, String> map) {
            super(0);
            this.f23683b = new C9022e<>(0, 1, 18, u);
            this.f23684c = new C9021d(str, true);
            this.f23685d = abstractC9006p;
            this.f23686e = map;
            int i = ViewDefaults.NUMBER_OF_LINES;
            for (String str2 : map.values()) {
                if (str2.length() < i) {
                    i = str2.length();
                }
            }
            this.f23687f = i;
        }

        private C9025h(int i, C9022e<U> c9022e, AbstractC9019b<U> abstractC9019b, AbstractC9006p abstractC9006p, Map<EnumC9004n, String> map, int i2) {
            super(i);
            this.f23683b = c9022e;
            this.f23684c = abstractC9019b;
            this.f23685d = abstractC9006p;
            this.f23686e = map;
            this.f23687f = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.w$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9026i<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final char f23688b;

        /* renamed from: c */
        private final char f23689c;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return 1;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return new C9026i(i, this.f23688b, this.f23689c);
        }

        private C9026i(char c, char c2) {
            this(0, c, c2);
        }

        private C9026i(int i, char c, char c2) {
            super(i);
            this.f23688b = c;
            this.f23689c = c2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jj.w$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9027j<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final boolean f23690b;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return this.f23690b ? 1 : 0;
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return new C9027j(i, this.f23690b);
        }

        private C9027j(boolean z) {
            super(0);
            this.f23690b = z;
        }

        private C9027j(int i, boolean z) {
            super(i);
            this.f23690b = z;
        }
    }

    public AbstractC9017w(Class<U> cls, String str) {
        int i;
        if (cls != null) {
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ArrayList());
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == '#') {
                    i3++;
                } else if (m16849g(charAt)) {
                    int i4 = i2 + 1;
                    while (i4 < length && str.charAt(i4) == charAt) {
                        i4++;
                    }
                    m16851d(charAt, i4 - i2, i3, arrayList);
                    i2 = i4 - 1;
                    i3 = 0;
                } else if (i3 <= 0) {
                    if (charAt == '\'') {
                        int i5 = i2 + 1;
                        i = i5;
                        while (i < length) {
                            if (str.charAt(i) == '\'') {
                                int i6 = i + 1;
                                if (i6 >= length || str.charAt(i6) != '\'') {
                                    break;
                                }
                                i = i6;
                            }
                            i++;
                        }
                        if (i < length) {
                            if (i5 == i) {
                                m16854a('\'', arrayList);
                            } else {
                                m16853b(str.substring(i5, i).replace("''", "'"), arrayList);
                            }
                        } else {
                            throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                        }
                    } else if (charAt == '[') {
                        m16847i(arrayList);
                    } else if (charAt == ']') {
                        m16850e(arrayList);
                    } else if (charAt == '.') {
                        m16848h(arrayList).add(new C9026i('.', ','));
                    } else if (charAt == ',') {
                        m16848h(arrayList).add(new C9026i(',', '.'));
                    } else if (charAt == '-') {
                        m16848h(arrayList).add(new C9027j(false));
                    } else if (charAt == '+') {
                        m16848h(arrayList).add(new C9027j(true));
                    } else if (charAt == '{') {
                        int i7 = i2 + 1;
                        i = i7;
                        while (i < length && str.charAt(i) != '}') {
                            i++;
                        }
                        m16852c(str.substring(i7, i), arrayList);
                    } else if (charAt == '|') {
                        m16848h(arrayList).add(C9024g.m16846c());
                    } else {
                        m16854a(charAt, arrayList);
                    }
                    i2 = i;
                } else {
                    throw new IllegalArgumentException("Char # must be followed by unit symbol.");
                }
                i2++;
            }
            if (arrayList.size() <= 1) {
                if (!arrayList.isEmpty()) {
                    List<AbstractC9019b<U>> list = arrayList.get(0);
                    if (!list.isEmpty()) {
                        AbstractC9019b<U> abstractC9019b = list.get(0);
                        C9024g c9024g = C9024g.f23682b;
                        if (abstractC9019b != c9024g && list.get(list.size() - 1) != c9024g) {
                            int size = list.size();
                            int mo16845a = list.get(size - 1).mo16845a();
                            for (int i8 = size - 2; i8 >= 0; i8--) {
                                AbstractC9019b<U> abstractC9019b2 = list.get(i8);
                                if (abstractC9019b2 == C9024g.f23682b) {
                                    mo16845a = 0;
                                } else {
                                    list.set(i8, abstractC9019b2.mo16844b(mo16845a));
                                    mo16845a += abstractC9019b2.mo16845a();
                                }
                            }
                            this.f23671a = cls;
                            this.f23672b = Collections.unmodifiableList(list);
                            this.f23673c = str;
                            return;
                        }
                        throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
                    }
                    throw new IllegalArgumentException("Missing format pattern.");
                }
                throw new IllegalArgumentException("Empty or invalid pattern.");
            }
            throw new IllegalArgumentException("Open square bracket without closing one.");
        }
        throw new NullPointerException("Missing unit type.");
    }

    /* renamed from: a */
    private void m16854a(char c, List<List<AbstractC9019b<U>>> list) {
        m16853b(String.valueOf(c), list);
    }

    /* renamed from: b */
    private void m16853b(String str, List<List<AbstractC9019b<U>>> list) {
        m16848h(list).add(new C9021d(str));
    }

    /* renamed from: c */
    private void m16852c(String str, List<List<AbstractC9019b<U>>> list) {
        Locale locale;
        String[] split = str.split(":");
        if (split.length <= 9 && split.length >= 4) {
            if (split[0].length() == 1) {
                U mo10247f = mo10247f(split[0].charAt(0));
                String[] split2 = split[2].split("-|_");
                String str2 = split2[0];
                if (split2.length > 1) {
                    String str3 = split2[1];
                    if (split2.length > 2) {
                        String str4 = split2[2];
                        if (split2.length <= 3) {
                            locale = new Locale(str2, str3, str4);
                        } else {
                            throw new IllegalArgumentException("Plural information has wrong locale: " + str);
                        }
                    } else {
                        locale = new Locale(str2, str3);
                    }
                } else {
                    locale = new Locale(str2);
                }
                EnumMap enumMap = new EnumMap(EnumC9004n.class);
                AbstractC9006p m16864f = AbstractC9006p.m16864f(locale, EnumC9001k.CARDINALS);
                for (int i = 3; i < split.length; i++) {
                    String[] split3 = split[i].split("=");
                    if (split3.length == 2) {
                        enumMap.put((EnumMap) EnumC9004n.valueOf(split3[0]), (EnumC9004n) split3[1]);
                    } else {
                        throw new IllegalArgumentException("Plural information has wrong format: " + str);
                    }
                }
                if (!enumMap.isEmpty()) {
                    if (enumMap.containsKey(EnumC9004n.OTHER)) {
                        m16848h(list).add(new C9025h(mo10247f, split[1], m16864f, enumMap));
                        return;
                    }
                    throw new IllegalArgumentException("Missing plural category OTHER: " + str);
                }
                throw new IllegalArgumentException("Missing plural forms: " + str);
            }
            throw new IllegalArgumentException("Plural information has wrong symbol: " + str);
        }
        throw new IllegalArgumentException("Plural information has wrong format: " + str);
    }

    /* renamed from: d */
    private void m16851d(char c, int i, int i2, List<List<AbstractC9019b<U>>> list) {
        U mo10247f = mo10247f(c);
        List<AbstractC9019b<U>> list2 = list.get(list.size() - 1);
        if (c == 'f') {
            if (i2 <= 0) {
                list2.add(new C9020c(0, i, mo10247f(c)));
                return;
            }
            throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
        }
        list2.add(new C9022e(0, i, i + i2, mo10247f));
    }

    /* renamed from: e */
    private static <U> void m16850e(List<List<AbstractC9019b<U>>> list) {
        int size = list.size() - 1;
        if (size >= 1) {
            list.get(size - 1).add(new C9023f(list.remove(size)));
            return;
        }
        throw new IllegalArgumentException("Closing square bracket without open one.");
    }

    /* renamed from: g */
    private static boolean m16849g(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: h */
    private static <U> List<AbstractC9019b<U>> m16848h(List<List<AbstractC9019b<U>>> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: i */
    private static <U> void m16847i(List<List<AbstractC9019b<U>>> list) {
        list.add(new ArrayList());
    }

    /* renamed from: f */
    protected abstract U mo10247f(char c);

    /* renamed from: jj.w$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9021d<U> extends AbstractC9019b<U> {

        /* renamed from: b */
        private final String f23677b;

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: a */
        int mo16845a() {
            return this.f23677b.length();
        }

        @Override // p184jj.AbstractC9017w.AbstractC9019b
        /* renamed from: b */
        AbstractC9019b<U> mo16844b(int i) {
            return new C9021d(i, this.f23677b);
        }

        private C9021d(String str) {
            this(str, false);
        }

        private C9021d(String str, boolean z) {
            super(0);
            if (!z && str.isEmpty()) {
                throw new IllegalArgumentException("Literal is empty.");
            }
            this.f23677b = str;
        }

        private C9021d(int i, String str) {
            super(i);
            this.f23677b = str;
        }
    }
}