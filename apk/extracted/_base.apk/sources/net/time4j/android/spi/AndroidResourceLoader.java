package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.base.AbstractC10617d;
import net.time4j.calendar.service.C10676b;
import net.time4j.calendar.service.C10677c;
import net.time4j.p249tz.InterfaceC10837r;
import net.time4j.p249tz.InterfaceC10838s;
import p121gj.InterfaceC6826b;
import p162ij.InterfaceC7667s;
import p184jj.EnumC8979e;
import p184jj.InterfaceC8980f;
import p184jj.InterfaceC8983i;
import p184jj.InterfaceC9005o;
import p184jj.InterfaceC9015u;
import p184jj.InterfaceC9028x;
import p184jj.InterfaceC9029y;
import p220lj.InterfaceC10216c;
import p272oj.C11173a;
import p272oj.C11177b;
import p272oj.C11178c;
import p272oj.C11183f;
import p272oj.C11185h;
import p272oj.C11187i;
import p288pj.InterfaceC11647c;
import p288pj.InterfaceC11650e;
import p308qj.C12008a;
import p308qj.C12009b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class AndroidResourceLoader extends AbstractC10617d {

    /* renamed from: f */
    private static final Map<Class<?>, Iterable<?>> f27662f;

    /* renamed from: g */
    private static final Set<String> f27663g;

    /* renamed from: d */
    private Context f27664d = null;

    /* renamed from: e */
    private List<InterfaceC8980f> f27665e = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10597a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27666a;

        static {
            int[] iArr = new int[EnumC8979e.values().length];
            f27666a = iArr;
            try {
                iArr[EnumC8979e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27666a[EnumC8979e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27666a[EnumC8979e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C10598b implements InterfaceC10216c {
        private C10598b() {
        }

        /* renamed from: a */
        private InterfaceC10216c m11073a() {
            return C10599c.f27668a;
        }

        /* renamed from: b */
        private String m11072b(String str) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb2.append(charAt);
                    while (true) {
                        i++;
                        if (i >= length) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (charAt2 == '\'') {
                            sb2.append(charAt2);
                            int i2 = i + 1;
                            if (i2 < length && str.charAt(i2) == '\'') {
                                i = i2;
                            }
                        }
                        sb2.append(charAt2);
                    }
                } else if (charAt == 'h') {
                    sb2.append('H');
                } else if (charAt != 'a') {
                    sb2.append(charAt);
                }
                i++;
            }
            return sb2.toString();
        }

        @Override // p220lj.InterfaceC10216c
        /* renamed from: f */
        public String mo9064f(EnumC8979e enumC8979e, Locale locale, boolean z) {
            String str;
            boolean z2;
            String str2;
            String mo9064f = m11073a().mo9064f(enumC8979e, locale, z);
            if (Locale.getDefault().equals(locale)) {
                EnumC8979e enumC8979e2 = EnumC8979e.SHORT;
                if (enumC8979e != enumC8979e2) {
                    str = m11073a().mo9059k(enumC8979e2, locale);
                } else {
                    str = mo9064f;
                }
                if (str.indexOf(97) == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean is24HourFormat = DateFormat.is24HourFormat(AndroidResourceLoader.this.f27664d);
                if (is24HourFormat != z2) {
                    if (is24HourFormat) {
                        return m11072b(mo9064f).replace("  ", " ").trim();
                    }
                    if (locale.getLanguage().equals("en")) {
                        str2 = "b";
                    } else {
                        str2 = "B";
                    }
                    int i = C10597a.f27666a[enumC8979e.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return "h:mm " + str2;
                            }
                            return "h:mm:ss " + str2;
                        }
                        return "h:mm:ss " + str2 + " z";
                    }
                    return "h:mm:ss " + str2 + " zzzz";
                }
            }
            return mo9064f;
        }

        @Override // p184jj.InterfaceC8980f
        /* renamed from: i */
        public String mo9061i(EnumC8979e enumC8979e, EnumC8979e enumC8979e2, Locale locale) {
            return m11073a().mo9061i(enumC8979e, enumC8979e2, locale);
        }

        @Override // p184jj.InterfaceC8980f
        /* renamed from: j */
        public String mo9060j(EnumC8979e enumC8979e, Locale locale) {
            return m11073a().mo9060j(enumC8979e, locale);
        }

        @Override // p184jj.InterfaceC8980f
        /* renamed from: k */
        public String mo9059k(EnumC8979e enumC8979e, Locale locale) {
            return mo9064f(enumC8979e, locale, false);
        }

        /* synthetic */ C10598b(AndroidResourceLoader androidResourceLoader, C10597a c10597a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C10599c {

        /* renamed from: a */
        private static final C11178c f27668a;

        /* renamed from: b */
        private static final Iterable<InterfaceC8983i> f27669b;

        /* renamed from: c */
        private static final Iterable<InterfaceC9029y> f27670c;

        /* renamed from: d */
        private static final Iterable<InterfaceC9015u> f27671d;

        static {
            C11178c c11178c = new C11178c();
            f27668a = c11178c;
            f27669b = Collections.singleton(C11183f.f29229d);
            f27670c = Collections.singletonList(new C11187i());
            f27671d = Collections.unmodifiableList(Arrays.asList(c11178c, new C10676b()));
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10600d implements Iterable<InterfaceC7667s> {
        private C10600d() {
        }

        /* synthetic */ C10600d(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC7667s> iterator() {
            return C10608l.f27673b.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10601e implements Iterable<InterfaceC11647c> {
        private C10601e() {
        }

        /* synthetic */ C10601e(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC11647c> iterator() {
            return C10609m.f27676c.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10602f implements Iterable<InterfaceC8983i> {
        private C10602f() {
        }

        /* synthetic */ C10602f(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC8983i> iterator() {
            return C10599c.f27669b.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10603g implements Iterable<InterfaceC9005o> {
        private C10603g() {
        }

        /* synthetic */ C10603g(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC9005o> iterator() {
            return C10608l.f27672a.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10604h implements Iterable<InterfaceC9015u> {
        private C10604h() {
        }

        /* synthetic */ C10604h(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC9015u> iterator() {
            return C10599c.f27671d.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10605i implements Iterable<InterfaceC9029y> {
        private C10605i() {
        }

        /* synthetic */ C10605i(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC9029y> iterator() {
            return C10599c.f27670c.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10606j implements Iterable<InterfaceC10838s> {
        private C10606j() {
        }

        /* synthetic */ C10606j(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC10838s> iterator() {
            return C10609m.f27675b.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10607k implements Iterable<InterfaceC10837r> {
        private C10607k() {
        }

        /* synthetic */ C10607k(C10597a c10597a) {
            this();
        }

        @Override // java.lang.Iterable
        public Iterator<InterfaceC10837r> iterator() {
            return C10609m.f27674a.iterator();
        }
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10608l {

        /* renamed from: a */
        private static final Iterable<InterfaceC9005o> f27672a = Collections.singleton(new C11173a());

        /* renamed from: b */
        private static final Iterable<InterfaceC7667s> f27673b = Arrays.asList(new C11177b(), new C10677c());
    }

    /* renamed from: net.time4j.android.spi.AndroidResourceLoader$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C10609m {

        /* renamed from: a */
        private static final Iterable<InterfaceC10837r> f27674a;

        /* renamed from: b */
        private static final Iterable<InterfaceC10838s> f27675b;

        /* renamed from: c */
        private static final Iterable<InterfaceC11647c> f27676c;

        static {
            InterfaceC11647c interfaceC11647c;
            Set singleton = Collections.singleton(new C12008a());
            f27674a = singleton;
            f27675b = Collections.singleton(new C12009b());
            Iterator it = singleton.iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC10837r interfaceC10837r = (InterfaceC10837r) it.next();
                    if (interfaceC10837r instanceof InterfaceC11647c) {
                        interfaceC11647c = (InterfaceC11647c) InterfaceC11647c.class.cast(interfaceC10837r);
                        break;
                    }
                } else {
                    interfaceC11647c = null;
                    break;
                }
            }
            if (interfaceC11647c == null) {
                f27676c = Collections.emptyList();
            } else {
                f27676c = Collections.singleton(interfaceC11647c);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC9015u.class, new C10604h(null));
        hashMap.put(InterfaceC10837r.class, new C10607k(null));
        hashMap.put(InterfaceC10838s.class, new C10606j(null));
        hashMap.put(InterfaceC11647c.class, new C10601e(null));
        hashMap.put(InterfaceC7667s.class, new C10600d(null));
        hashMap.put(InterfaceC8983i.class, new C10602f(null));
        hashMap.put(InterfaceC9005o.class, new C10603g(null));
        hashMap.put(InterfaceC9028x.class, Collections.singleton(new C11185h()));
        hashMap.put(InterfaceC9029y.class, new C10605i(null));
        hashMap.put(InterfaceC11650e.class, Collections.singleton(new C10610a()));
        f27662f = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add("i18n");
        hashSet.add("calendar");
        hashSet.add("olson");
        hashSet.add("tzdata");
        f27663g = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private static <T> T m11075i(Object obj) {
        return obj;
    }

    @Override // net.time4j.base.AbstractC10617d
    /* renamed from: e */
    public InputStream mo11024e(URI uri, boolean z) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setUseCaches(false);
                return openConnection.getInputStream();
            }
            Context context = this.f27664d;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.AbstractC10617d
    /* renamed from: f */
    public URI mo11023f(String str, Class<?> cls, String str2) {
        try {
            if (f27663g.contains(str)) {
                return new URI("net/time4j/" + str + '/' + str2);
            }
            URL resource = cls.getClassLoader().getResource(str2);
            if (resource != null) {
                return resource.toURI();
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.AbstractC10617d
    /* renamed from: g */
    public <S> Iterable<S> mo11022g(Class<S> cls) {
        Iterable<?> iterable = f27662f.get(cls);
        if (iterable == null) {
            if (cls == InterfaceC8980f.class) {
                iterable = this.f27665e;
            } else {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
        }
        return (Iterable) m11075i(iterable);
    }

    /* renamed from: j */
    public void m11074j(Context context, InterfaceC6826b interfaceC6826b) {
        if (context != null) {
            this.f27664d = context;
            this.f27665e = Collections.singletonList(new C10598b(this, null));
            return;
        }
        throw new NullPointerException("Missing Android-context.");
    }
}
