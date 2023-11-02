package p128h4;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: h4.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7014z implements InterfaceC6895b<ULocale> {

    /* renamed from: a */
    private ULocale f19204a;

    /* renamed from: b */
    private ULocale.Builder f19205b;

    /* renamed from: c */
    private boolean f19206c;

    private C7014z(ULocale uLocale) {
        this.f19205b = null;
        this.f19206c = false;
        this.f19204a = uLocale;
    }

    /* renamed from: i */
    public static InterfaceC6895b<ULocale> m21543i() {
        ULocale.Category category;
        ULocale uLocale;
        category = ULocale.Category.FORMAT;
        uLocale = ULocale.getDefault(category);
        return new C7014z(uLocale);
    }

    /* renamed from: j */
    public static InterfaceC6895b<ULocale> m21542j(String str) {
        return new C7014z(str);
    }

    /* renamed from: k */
    public static InterfaceC6895b<ULocale> m21541k(ULocale uLocale) {
        return new C7014z(uLocale);
    }

    /* renamed from: l */
    private void m21540l() {
        ULocale build;
        if (this.f19206c) {
            try {
                build = this.f19205b.build();
                this.f19204a = build;
                this.f19206c = false;
            } catch (RuntimeException e) {
                throw new C6947l(e.getMessage());
            }
        }
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: a */
    public HashMap<String, String> mo21551a() {
        Iterator keywords;
        String keywordValue;
        m21540l();
        HashMap<String, String> hashMap = new HashMap<>();
        keywords = this.f19204a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String str = (String) keywords.next();
                String m21593b = C6971p3.m21593b(str);
                keywordValue = this.f19204a.getKeywordValue(str);
                hashMap.put(m21593b, keywordValue);
            }
        }
        return hashMap;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: b */
    public ArrayList<String> mo21550b(String str) {
        String keywordValue;
        m21540l();
        String m21594a = C6971p3.m21594a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        keywordValue = this.f19204a.getKeywordValue(m21594a);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: d */
    public InterfaceC6895b<ULocale> mo21548d() {
        m21540l();
        return new C7014z(this.f19204a);
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: e */
    public String mo21547e() {
        String languageTag;
        languageTag = mo21549c().toLanguageTag();
        return languageTag;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: f */
    public void mo21546f(String str, ArrayList<String> arrayList) {
        ULocale.Builder locale;
        m21540l();
        if (this.f19205b == null) {
            locale = new ULocale.Builder().setLocale(this.f19204a);
            this.f19205b = locale;
        }
        try {
            this.f19205b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f19206c = true;
        } catch (RuntimeException e) {
            throw new C6947l(e.getMessage());
        }
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: g */
    public String mo21545g() {
        String languageTag;
        languageTag = mo21544h().toLanguageTag();
        return languageTag;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: m */
    public ULocale mo21544h() {
        m21540l();
        return this.f19204a;
    }

    @Override // p128h4.InterfaceC6895b
    /* renamed from: n */
    public ULocale mo21549c() {
        ULocale build;
        m21540l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f19204a);
        builder.clearExtensions();
        build = builder.build();
        return build;
    }

    private C7014z(String str) {
        this.f19204a = null;
        this.f19205b = null;
        this.f19206c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f19205b = builder;
        try {
            builder.setLanguageTag(str);
            this.f19206c = true;
        } catch (RuntimeException e) {
            throw new C6947l(e.getMessage());
        }
    }
}
