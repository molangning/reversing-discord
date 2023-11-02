package p366u9;

import java.util.Arrays;

/* renamed from: u9.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12916l0 extends AbstractC12920n0 {

    /* renamed from: j */
    private final String f33615j;

    public C12916l0(String str) {
        this.f33615j = (String) C12919n.m3674b(str);
    }

    @Override // p366u9.AbstractC12920n0
    /* renamed from: a */
    public final int mo3668a() {
        return 3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(AbstractC12920n0 abstractC12920n0) {
        AbstractC12920n0 abstractC12920n02 = abstractC12920n0;
        abstractC12920n02.mo3668a();
        C12916l0 c12916l0 = (C12916l0) abstractC12920n02;
        if (this.f33615j.length() != c12916l0.f33615j.length()) {
            return this.f33615j.length() - c12916l0.f33615j.length();
        }
        return this.f33615j.compareTo(c12916l0.f33615j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12916l0.class != obj.getClass()) {
            return false;
        }
        return this.f33615j.equals(((C12916l0) obj).f33615j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.f33615j});
    }

    public final String toString() {
        String str = this.f33615j;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }
}