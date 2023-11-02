package androidx.core.p018os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C1070q implements InterfaceC1064k {

    /* renamed from: a */
    private final LocaleList f3405a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1070q(Object obj) {
        this.f3405a = (LocaleList) obj;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    /* renamed from: a */
    public String mo37961a() {
        String languageTags;
        languageTags = this.f3405a.toLanguageTags();
        return languageTags;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    /* renamed from: b */
    public Object mo37960b() {
        return this.f3405a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f3405a.equals(((InterfaceC1064k) obj).mo37960b());
        return equals;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    public Locale get(int i) {
        Locale locale;
        locale = this.f3405a.get(i);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f3405a.hashCode();
        return hashCode;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f3405a.isEmpty();
        return isEmpty;
    }

    @Override // androidx.core.p018os.InterfaceC1064k
    public int size() {
        int size;
        size = this.f3405a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.f3405a.toString();
        return localeList;
    }
}
