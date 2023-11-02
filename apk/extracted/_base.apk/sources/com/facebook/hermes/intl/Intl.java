package com.facebook.hermes.intl;

import android.icu.lang.UCharacter;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p077e5.InterfaceC6107a;
import p128h4.C6947l;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Intl {
    /* renamed from: a */
    private static List<String> m31329a(List<String> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                if (!str.isEmpty()) {
                    String m31288b = C3676f.m31288b(str);
                    if (!m31288b.isEmpty() && !arrayList.contains(m31288b)) {
                        arrayList.add(m31288b);
                    }
                } else {
                    throw new C6947l("Incorrect locale information provided");
                }
            } else {
                throw new C6947l("Incorrect locale information provided");
            }
        }
        return arrayList;
    }

    @InterfaceC6107a
    public static List<String> getCanonicalLocales(List<String> list) {
        return m31329a(list);
    }

    @InterfaceC6107a
    public static String toLocaleLowerCase(List<String> list, String str) {
        String lowerCase;
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24) {
            lowerCase = UCharacter.toLowerCase((ULocale) C3677g.m31273c((String[]) list.toArray(strArr)).f10225a.mo21544h(), str);
            return lowerCase;
        }
        return str.toLowerCase((Locale) C3677g.m31270f((String[]) list.toArray(strArr)).f10225a.mo21544h());
    }

    @InterfaceC6107a
    public static String toLocaleUpperCase(List<String> list, String str) {
        String upperCase;
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24) {
            upperCase = UCharacter.toUpperCase((ULocale) C3677g.m31273c((String[]) list.toArray(strArr)).f10225a.mo21544h(), str);
            return upperCase;
        }
        return str.toUpperCase((Locale) C3677g.m31270f((String[]) list.toArray(strArr)).f10225a.mo21544h());
    }
}
