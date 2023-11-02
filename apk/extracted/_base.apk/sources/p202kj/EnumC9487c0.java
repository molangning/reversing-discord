package p202kj;

import java.util.List;
import java.util.Set;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC9487c0 implements InterfaceC9500h<InterfaceC10808k> {
    INSTANCE;

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<InterfaceC10808k> mo14365c() {
        return EnumC9478b0.TIMEZONE_ID;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        int i;
        if (interfaceC7662o.mo10217d()) {
            if (appendable instanceof CharSequence) {
                i = ((CharSequence) appendable).length();
            } else {
                i = -1;
            }
            String mo10035a = interfaceC7662o.mo10209t().mo10035a();
            appendable.append(mo10035a);
            int length = mo10035a.length();
            if (i != -1 && length > 0 && set != null) {
                set.add(new C9496g(EnumC9478b0.TIMEZONE_ID, i, i + length));
            }
            return length;
        }
        throw new IllegalArgumentException("Cannot extract timezone id from: " + interfaceC7662o);
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        char charAt;
        char charAt2;
        int length = charSequence.length();
        int m14430f = c9518s.m14430f();
        if (m14430f >= length) {
            c9518s.m14425k(m14430f, "Missing timezone name.");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = m14430f;
        while (i < length && (((charAt2 = charSequence.charAt(i)) >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_' || charAt2 == '/'))) {
            sb2.append(charAt2);
            i++;
        }
        if (!Character.isLetter(sb2.charAt(sb2.length() - 1))) {
            sb2.deleteCharAt(sb2.length() - 1);
            i--;
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            c9518s.m14425k(m14430f, "Missing valid timezone id.");
        } else if (sb3.startsWith("Etc/GMT")) {
            c9518s.m14425k(m14430f, "Inverse Etc/GMT-Offsets are not supported, use UTC-Offsets instead.");
        } else if (sb3.equals("Z")) {
            abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, C10835p.f28295t);
            c9518s.m14424l(i);
        } else if (!sb3.equals("UTC") && !sb3.equals("GMT") && !sb3.equals("UT")) {
            List<InterfaceC10808k> m10130u = AbstractC10809l.m10130u("INCLUDE_ALIAS");
            int size = m10130u.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                InterfaceC10808k interfaceC10808k = m10130u.get(i3);
                int compareTo = interfaceC10808k.mo10035a().compareTo(sb3);
                if (compareTo < 0) {
                    i2 = i3 + 1;
                } else if (compareTo > 0) {
                    size = i3 - 1;
                } else {
                    abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_ID, interfaceC10808k);
                    c9518s.m14424l(i);
                    return;
                }
            }
            c9518s.m14425k(m14430f, "Cannot parse to timezone id: " + sb3);
        } else if (length > i && ((charAt = charSequence.charAt(i)) == '+' || charAt == '-')) {
            c9518s.m14424l(i);
            C9492e0.f25145o.mo14363e(charSequence, c9518s, interfaceC7633d, abstractC9519t, z);
        } else {
            abstractC9519t.mo14414J(EnumC9478b0.TIMEZONE_OFFSET, C10835p.f28295t);
            c9518s.m14424l(i);
        }
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<InterfaceC10808k> mo14361g(InterfaceC7664p<InterfaceC10808k> interfaceC7664p) {
        return INSTANCE;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<InterfaceC10808k> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return INSTANCE;
    }
}
