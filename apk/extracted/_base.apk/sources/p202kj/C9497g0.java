package p202kj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.p249tz.InterfaceC10808k;

/* renamed from: kj.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C9497g0 {

    /* renamed from: a */
    private final C9499b f25168a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kj.g0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9499b {

        /* renamed from: a */
        private final char f25169a;

        /* renamed from: b */
        private final C9499b f25170b;

        /* renamed from: c */
        private final C9499b f25171c;

        /* renamed from: d */
        private final C9499b f25172d;

        /* renamed from: e */
        private final List<InterfaceC10808k> f25173e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public C9499b m14520j(InterfaceC10808k interfaceC10808k) {
            ArrayList arrayList = new ArrayList();
            List<InterfaceC10808k> list = this.f25173e;
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(interfaceC10808k);
            return new C9499b(this.f25169a, this.f25170b, this.f25171c, this.f25172d, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public C9499b m14519k(C9499b c9499b) {
            return new C9499b(this.f25169a, c9499b, this.f25171c, this.f25172d, this.f25173e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public C9499b m14518l(C9499b c9499b) {
            return new C9499b(this.f25169a, this.f25170b, c9499b, this.f25172d, this.f25173e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public C9499b m14517m(C9499b c9499b) {
            return new C9499b(this.f25169a, this.f25170b, this.f25171c, c9499b, this.f25173e);
        }

        private C9499b(char c) {
            this(c, null, null, null, null);
        }

        private C9499b(char c, C9499b c9499b, C9499b c9499b2, C9499b c9499b3, List<InterfaceC10808k> list) {
            this.f25169a = c;
            this.f25170b = c9499b;
            this.f25171c = c9499b2;
            this.f25172d = c9499b3;
            this.f25173e = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9497g0(C9499b c9499b) {
        this.f25168a = c9499b;
    }

    /* renamed from: a */
    private void m14535a(C9499b c9499b, StringBuilder sb2, List<String> list) {
        if (c9499b == null) {
            return;
        }
        m14535a(c9499b.f25170b, sb2, list);
        if (c9499b.f25173e != null) {
            list.add(sb2.toString() + c9499b.f25169a);
        }
        C9499b c9499b2 = c9499b.f25171c;
        sb2.append(c9499b.f25169a);
        m14535a(c9499b2, sb2, list);
        sb2.deleteCharAt(sb2.length() - 1);
        m14535a(c9499b.f25172d, sb2, list);
    }

    /* renamed from: c */
    private static C9499b m14533c(C9499b c9499b, String str, int i) {
        if (c9499b == null) {
            return null;
        }
        char charAt = str.charAt(i);
        if (charAt < c9499b.f25169a) {
            return m14533c(c9499b.f25170b, str, i);
        }
        if (charAt > c9499b.f25169a) {
            return m14533c(c9499b.f25172d, str, i);
        }
        if (i < str.length() - 1) {
            return m14533c(c9499b.f25171c, str, i + 1);
        }
        return c9499b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C9499b m14532d(C9499b c9499b, String str, InterfaceC10808k interfaceC10808k) {
        if (!str.isEmpty()) {
            if (interfaceC10808k != null) {
                return m14531e(c9499b, str, interfaceC10808k, 0);
            }
            throw new NullPointerException("Missing timezone id.");
        }
        throw new IllegalArgumentException("Empty key cannot be inserted.");
    }

    /* renamed from: e */
    private static C9499b m14531e(C9499b c9499b, String str, InterfaceC10808k interfaceC10808k, int i) {
        char charAt = str.charAt(i);
        if (c9499b == null) {
            c9499b = new C9499b(charAt);
        }
        if (charAt < c9499b.f25169a) {
            return c9499b.m14519k(m14531e(c9499b.f25170b, str, interfaceC10808k, i));
        }
        if (charAt > c9499b.f25169a) {
            return c9499b.m14517m(m14531e(c9499b.f25172d, str, interfaceC10808k, i));
        }
        if (i < str.length() - 1) {
            return c9499b.m14518l(m14531e(c9499b.f25171c, str, interfaceC10808k, i + 1));
        }
        return c9499b.m14520j(interfaceC10808k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List<InterfaceC10808k> m14534b(String str) {
        if (str.isEmpty()) {
            return Collections.emptyList();
        }
        C9499b m14533c = m14533c(this.f25168a, str, 0);
        if (m14533c == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(m14533c.f25173e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m14530f(CharSequence charSequence, int i) {
        C9499b c9499b = this.f25168a;
        int length = charSequence.length();
        int i2 = i;
        int i3 = i2;
        while (c9499b != null && i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < c9499b.f25169a) {
                c9499b = c9499b.f25170b;
            } else if (charAt > c9499b.f25169a) {
                c9499b = c9499b.f25172d;
            } else {
                i2++;
                if (c9499b.f25173e != null) {
                    i3 = i2;
                }
                c9499b = c9499b.f25171c;
            }
        }
        if (i >= i3) {
            return "";
        }
        return charSequence.subSequence(i, i3).toString();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        m14535a(this.f25168a, new StringBuilder(), arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("count=");
        sb2.append(arrayList.size());
        sb2.append(",labels={");
        for (String str : arrayList) {
            sb2.append(str);
            sb2.append("=>");
            sb2.append(m14534b(str));
            sb2.append(',');
        }
        sb2.deleteCharAt(sb2.length() - 1).append('}');
        return sb2.toString();
    }
}
