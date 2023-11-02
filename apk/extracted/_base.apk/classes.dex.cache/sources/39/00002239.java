package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p128h4.C6962o;
import p128h4.C7014z;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3677g {

    /* renamed from: com.facebook.hermes.intl.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3678a {

        /* renamed from: a */
        public InterfaceC6895b<?> f10225a;

        /* renamed from: b */
        public HashMap<String, String> f10226b = new HashMap<>();
    }

    /* renamed from: a */
    public static String m31275a(String[] strArr, String str) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int lastIndexOf = str.lastIndexOf("-");
            if (lastIndexOf < 0) {
                return "";
            }
            if (lastIndexOf >= 2 && str.charAt(lastIndexOf - 2) == '-') {
                lastIndexOf -= 2;
            }
            str = str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: b */
    public static ULocale m31274b(InterfaceC6895b<?> interfaceC6895b) {
        ULocale[] availableLocales;
        ULocale acceptLanguage;
        availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {(ULocale) interfaceC6895b.mo21549c()};
        boolean[] zArr = new boolean[1];
        acceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (!zArr[0] && acceptLanguage != null) {
            return acceptLanguage;
        }
        return null;
    }

    /* renamed from: c */
    public static C3678a m31273c(String[] strArr) {
        C3678a c3678a = new C3678a();
        for (String str : strArr) {
            InterfaceC6895b m21603b = C6962o.m21603b(str);
            ULocale m31274b = m31274b(m21603b);
            if (m31274b != null) {
                c3678a.f10225a = C7014z.m21541k(m31274b);
                c3678a.f10226b = m21603b.mo21551a();
                return c3678a;
            }
        }
        c3678a.f10225a = C7014z.m21543i();
        return c3678a;
    }

    /* renamed from: d */
    public static String[] m31272d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (m31274b(C6962o.m21603b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static String[] m31271e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: f */
    public static C3678a m31270f(String[] strArr) {
        return m31269g(strArr, m31271e());
    }

    /* renamed from: g */
    public static C3678a m31269g(String[] strArr, String[] strArr2) {
        C3678a c3678a = new C3678a();
        for (String str : strArr) {
            InterfaceC6895b m21603b = C6962o.m21603b(str);
            String m31275a = m31275a(strArr2, m21603b.mo21547e());
            if (!m31275a.isEmpty()) {
                c3678a.f10225a = C6962o.m21603b(m31275a);
                c3678a.f10226b = m21603b.mo21551a();
                return c3678a;
            }
        }
        c3678a.f10225a = C6962o.m21604a();
        return c3678a;
    }

    /* renamed from: h */
    public static String[] m31268h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] m31271e = m31271e();
        for (String str : strArr) {
            String m31275a = m31275a(m31271e, C6962o.m21603b(str).mo21547e());
            if (m31275a != null && !m31275a.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}