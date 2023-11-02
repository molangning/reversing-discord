package io.sentry.internal.modules;

import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8211a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.sentry.internal.modules.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7985c extends AbstractC7987d {

    /* renamed from: d */
    private final Pattern f21657d;

    /* renamed from: e */
    private final Pattern f21658e;

    /* renamed from: f */
    private final ClassLoader f21659f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.internal.modules.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7986a {

        /* renamed from: a */
        private final String f21660a;

        /* renamed from: b */
        private final String f21661b;

        public C7986a(String str, String str2) {
            this.f21660a = str;
            this.f21661b = str2;
        }
    }

    public C7985c(InterfaceC8040o0 interfaceC8040o0) {
        this(C7985c.class.getClassLoader(), interfaceC8040o0);
    }

    /* renamed from: d */
    private C7986a m19100d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f21658e.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 2) {
            return null;
        }
        return new C7986a(matcher.group(1), matcher.group(2));
    }

    /* renamed from: e */
    private List<C7986a> m19099e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f21659f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                C7986a m19100d = m19100d(m19098f(resources.nextElement()));
                if (m19100d != null) {
                    arrayList.add(m19100d);
                }
            }
        } catch (Throwable th2) {
            this.f21663a.mo18136b(EnumC8021m4.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        return arrayList;
    }

    /* renamed from: f */
    private String m19098f(URL url) {
        Matcher matcher = this.f21657d.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.AbstractC7987d
    /* renamed from: b */
    protected Map<String, String> mo19092b() {
        HashMap hashMap = new HashMap();
        for (C7986a c7986a : m19099e()) {
            hashMap.put(c7986a.f21660a, c7986a.f21661b);
        }
        return hashMap;
    }

    C7985c(ClassLoader classLoader, InterfaceC8040o0 interfaceC8040o0) {
        super(interfaceC8040o0);
        this.f21657d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f21658e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f21659f = C8211a.m18240a(classLoader);
    }
}
