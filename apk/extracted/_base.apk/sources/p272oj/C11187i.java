package p272oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.EnumC10846x0;
import net.time4j.base.AbstractC10617d;
import p184jj.InterfaceC9029y;

/* renamed from: oj.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C11187i implements InterfaceC9029y {

    /* renamed from: a */
    private final String f29234a;

    /* renamed from: b */
    private final Set<String> f29235b;

    /* renamed from: c */
    private final Map<String, EnumC10846x0> f29236c;

    /* renamed from: d */
    private final Map<String, EnumC10846x0> f29237d;

    /* renamed from: e */
    private final Map<String, EnumC10846x0> f29238e;

    public C11187i() {
        String substring;
        EnumC10846x0 enumC10846x0;
        HashMap hashMap;
        URI mo11023f = AbstractC10617d.m11026c().mo11023f("i18n", C11187i.class, "data/week.data");
        InputStream mo11024e = AbstractC10617d.m11026c().mo11024e(mo11023f, true);
        if (mo11024e == null) {
            try {
                mo11024e = AbstractC10617d.m11026c().m11025d(C11187i.class, "data/week.data", true);
            } catch (IOException unused) {
            }
        }
        if (mo11024e != null) {
            this.f29234a = "@" + mo11023f;
            HashSet hashSet = new HashSet();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(mo11024e, "US-ASCII"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (!readLine.startsWith("#")) {
                                int indexOf = readLine.indexOf(61);
                                int i = 0;
                                String trim = readLine.substring(0, indexOf).trim();
                                String[] split = readLine.substring(indexOf + 1).split(" ");
                                if (trim.equals("minDays-4")) {
                                    int length = split.length;
                                    while (i < length) {
                                        String upperCase = split[i].trim().toUpperCase(Locale.US);
                                        if (!upperCase.isEmpty()) {
                                            hashSet.add(upperCase);
                                        }
                                        i++;
                                    }
                                } else {
                                    if (trim.startsWith("start-")) {
                                        substring = trim.substring(6);
                                        enumC10846x0 = EnumC10846x0.SATURDAY;
                                        hashMap = hashMap3;
                                    } else if (trim.startsWith("end-")) {
                                        substring = trim.substring(4);
                                        enumC10846x0 = EnumC10846x0.SUNDAY;
                                        hashMap = hashMap4;
                                    } else if (trim.startsWith("first-")) {
                                        substring = trim.substring(6);
                                        enumC10846x0 = EnumC10846x0.MONDAY;
                                        hashMap = hashMap2;
                                    } else {
                                        throw new IllegalStateException("Unexpected format: " + this.f29234a);
                                    }
                                    if (substring.equals("sun")) {
                                        enumC10846x0 = EnumC10846x0.SUNDAY;
                                    } else if (substring.equals("sat")) {
                                        enumC10846x0 = EnumC10846x0.SATURDAY;
                                    } else if (substring.equals("fri")) {
                                        enumC10846x0 = EnumC10846x0.FRIDAY;
                                    } else if (substring.equals("thu")) {
                                        enumC10846x0 = EnumC10846x0.THURSDAY;
                                    } else if (substring.equals("wed")) {
                                        enumC10846x0 = EnumC10846x0.WEDNESDAY;
                                    } else if (substring.equals("tue")) {
                                        enumC10846x0 = EnumC10846x0.TUESDAY;
                                    } else if (substring.equals("mon")) {
                                        enumC10846x0 = EnumC10846x0.MONDAY;
                                    }
                                    int length2 = split.length;
                                    while (i < length2) {
                                        String upperCase2 = split[i].trim().toUpperCase(Locale.US);
                                        if (!upperCase2.isEmpty()) {
                                            hashMap.put(upperCase2, enumC10846x0);
                                        }
                                        i++;
                                    }
                                }
                            }
                        } else {
                            this.f29235b = Collections.unmodifiableSet(hashSet);
                            this.f29236c = Collections.unmodifiableMap(hashMap2);
                            this.f29237d = Collections.unmodifiableMap(hashMap3);
                            this.f29238e = Collections.unmodifiableMap(hashMap4);
                            try {
                                mo11024e.close();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace(System.err);
                                return;
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                } catch (Exception e3) {
                    throw new IllegalStateException("Unexpected format: " + this.f29234a, e3);
                }
            } catch (Throwable th2) {
                try {
                    mo11024e.close();
                } catch (IOException e4) {
                    e4.printStackTrace(System.err);
                }
                throw th2;
            }
        } else {
            this.f29234a = "@STATIC";
            this.f29235b = Collections.emptySet();
            this.f29236c = Collections.emptyMap();
            this.f29237d = Collections.emptyMap();
            this.f29238e = Collections.emptyMap();
            PrintStream printStream = System.err;
            printStream.println("Warning: File \"data/week.data\" not found.");
        }
    }

    @Override // p184jj.InterfaceC9029y
    /* renamed from: a */
    public int mo8985a(Locale locale) {
        String country = locale.getCountry();
        EnumC10846x0 enumC10846x0 = EnumC10846x0.SUNDAY;
        if (this.f29238e.containsKey(country)) {
            enumC10846x0 = this.f29238e.get(country);
        }
        return enumC10846x0.m9997b();
    }

    @Override // p184jj.InterfaceC9029y
    /* renamed from: b */
    public int mo8984b(Locale locale) {
        if (this.f29235b.isEmpty()) {
            return new GregorianCalendar(locale).getMinimalDaysInFirstWeek();
        }
        String country = locale.getCountry();
        if ((country.isEmpty() && locale.getLanguage().isEmpty()) || this.f29235b.contains(country)) {
            return 4;
        }
        return 1;
    }

    @Override // p184jj.InterfaceC9029y
    /* renamed from: c */
    public int mo8983c(Locale locale) {
        String country = locale.getCountry();
        EnumC10846x0 enumC10846x0 = EnumC10846x0.SATURDAY;
        if (this.f29237d.containsKey(country)) {
            enumC10846x0 = this.f29237d.get(country);
        }
        return enumC10846x0.m9997b();
    }

    @Override // p184jj.InterfaceC9029y
    /* renamed from: d */
    public int mo8982d(Locale locale) {
        if (this.f29236c.isEmpty()) {
            int firstDayOfWeek = new GregorianCalendar(locale).getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                return 7;
            }
            return firstDayOfWeek - 1;
        }
        String country = locale.getCountry();
        EnumC10846x0 enumC10846x0 = EnumC10846x0.MONDAY;
        if (this.f29236c.containsKey(country)) {
            enumC10846x0 = this.f29236c.get(country);
        }
        return enumC10846x0.m9997b();
    }

    public String toString() {
        return getClass().getName() + this.f29234a;
    }
}
