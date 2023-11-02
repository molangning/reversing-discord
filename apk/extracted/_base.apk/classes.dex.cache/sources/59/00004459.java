package net.time4j.calendar.service;

import java.util.Locale;
import p162ij.InterfaceC7675y;
import p184jj.C8972b;
import p184jj.EnumC8979e;
import p272oj.C11180e;

/* renamed from: net.time4j.calendar.service.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10675a {
    /* renamed from: a */
    public static String m10765a(String str, InterfaceC7675y interfaceC7675y, Locale locale) {
        EnumC8979e m16890b = EnumC8979e.m16890b(interfaceC7675y.mo16891a());
        if (str.equals("iso8601")) {
            return C8972b.m16900r(m16890b, locale);
        }
        String str2 = "F(" + Character.toLowerCase(m16890b.name().charAt(0)) + ')';
        C11180e m10762j = C10676b.m10762j(str, locale);
        if (!m10762j.m9046b(str2)) {
            m10762j = C10676b.m10762j("generic", locale);
        }
        return m10762j.m9042f(str2);
    }
}