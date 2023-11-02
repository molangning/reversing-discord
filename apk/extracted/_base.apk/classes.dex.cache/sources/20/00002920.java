package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p347t5.C12588b;
import p381v5.InterfaceC13091g;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4354a implements InterfaceC13091g {

    /* renamed from: c */
    static final String f11140c;

    /* renamed from: d */
    static final String f11141d;

    /* renamed from: e */
    private static final String f11142e;

    /* renamed from: f */
    private static final Set<C12588b> f11143f;

    /* renamed from: g */
    public static final C4354a f11144g;

    /* renamed from: h */
    public static final C4354a f11145h;

    /* renamed from: a */
    private final String f11146a;

    /* renamed from: b */
    private final String f11147b;

    static {
        String m29939a = C4360e.m29939a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11140c = m29939a;
        String m29939a2 = C4360e.m29939a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f11141d = m29939a2;
        String m29939a3 = C4360e.m29939a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11142e = m29939a3;
        f11143f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C12588b.m4754b("proto"), C12588b.m4754b("json"))));
        f11144g = new C4354a(m29939a, null);
        f11145h = new C4354a(m29939a2, m29939a3);
    }

    public C4354a(String str, String str2) {
        this.f11146a = str;
        this.f11147b = str2;
    }

    /* renamed from: c */
    public static C4354a m29956c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C4354a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p381v5.InterfaceC13091g
    /* renamed from: a */
    public Set<C12588b> mo3308a() {
        return f11143f;
    }

    /* renamed from: b */
    public byte[] m29957b() {
        String str = this.f11147b;
        if (str == null && this.f11146a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f11146a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String m29955d() {
        return this.f11147b;
    }

    /* renamed from: e */
    public String m29954e() {
        return this.f11146a;
    }

    @Override // p381v5.InterfaceC13090f
    public byte[] getExtras() {
        return m29957b();
    }

    @Override // p381v5.InterfaceC13090f
    public String getName() {
        return "cct";
    }
}