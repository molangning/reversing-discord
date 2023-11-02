package p202kj;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9513o<V> implements InterfaceC9500h<V> {

    /* renamed from: j */
    private final InterfaceC7664p<V> f25239j;

    /* renamed from: k */
    private final Map<V, String> f25240k;

    /* renamed from: l */
    private final int f25241l;

    /* renamed from: m */
    private final boolean f25242m;

    /* renamed from: n */
    private final Locale f25243n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9513o(InterfaceC7664p<V> interfaceC7664p, Map<V, String> map) {
        Map hashMap;
        Class<V> type = interfaceC7664p.getType();
        if (type.isEnum()) {
            if (map.size() >= type.getEnumConstants().length) {
                hashMap = m14445a(type);
            } else {
                throw new IllegalArgumentException("Not enough text resources defined for enum: " + type.getName());
            }
        } else {
            hashMap = new HashMap(map.size());
        }
        hashMap.putAll(map);
        this.f25239j = interfaceC7664p;
        this.f25240k = Collections.unmodifiableMap(hashMap);
        this.f25241l = 0;
        this.f25242m = true;
        this.f25243n = Locale.getDefault();
    }

    /* renamed from: a */
    private static <V, K extends Enum<K>> Map<V, String> m14445a(Class<V> cls) {
        return new EnumMap(cls);
    }

    /* renamed from: b */
    private String m14444b(V v) {
        String str = this.f25240k.get(v);
        if (str == null) {
            return v.toString();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private int m14443i(InterfaceC7662o interfaceC7662o, Appendable appendable) {
        String m14444b = m14444b(interfaceC7662o.mo10212i(this.f25239j));
        appendable.append(m14444b);
        return m14444b.length();
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<V> mo14365c() {
        return this.f25239j;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        if (appendable instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) appendable;
            int length = charSequence.length();
            int m14443i = m14443i(interfaceC7662o, appendable);
            if (set != null) {
                set.add(new C9496g(this.f25239j, length, charSequence.length()));
            }
            return m14443i;
        }
        return m14443i(interfaceC7662o, appendable);
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        int intValue;
        boolean booleanValue;
        Locale locale;
        int m14430f = c9518s.m14430f();
        int length = charSequence.length();
        if (z) {
            intValue = this.f25241l;
        } else {
            intValue = ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue();
        }
        if (intValue > 0) {
            length -= intValue;
        }
        if (m14430f >= length) {
            c9518s.m14425k(m14430f, "Missing chars for: " + this.f25239j.name());
            c9518s.m14422n();
            return;
        }
        if (z) {
            booleanValue = this.f25242m;
        } else {
            booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            locale = this.f25243n;
        } else {
            locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.getDefault());
        }
        int i = length - m14430f;
        for (V v : this.f25240k.keySet()) {
            String m14444b = m14444b(v);
            if (booleanValue) {
                String upperCase = m14444b.toUpperCase(locale);
                int length2 = m14444b.length();
                if (length2 <= i) {
                    int i2 = length2 + m14430f;
                    if (upperCase.equals(charSequence.subSequence(m14430f, i2).toString().toUpperCase(locale))) {
                        abstractC9519t.mo14414J(this.f25239j, v);
                        c9518s.m14424l(i2);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                int length3 = m14444b.length();
                if (length3 <= i) {
                    int i3 = length3 + m14430f;
                    if (m14444b.equals(charSequence.subSequence(m14430f, i3).toString())) {
                        abstractC9519t.mo14414J(this.f25239j, v);
                        c9518s.m14424l(i3);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        c9518s.m14425k(m14430f, "Element value could not be parsed: " + this.f25239j.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9513o)) {
            return false;
        }
        C9513o c9513o = (C9513o) obj;
        if (this.f25239j.equals(c9513o.f25239j) && this.f25240k.equals(c9513o.f25240k)) {
            return true;
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<V> mo14361g(InterfaceC7664p<V> interfaceC7664p) {
        if (this.f25239j == interfaceC7664p) {
            return this;
        }
        return new C9513o(interfaceC7664p, this.f25240k);
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<V> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return new C9513o(this.f25239j, this.f25240k, ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue(), ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue(), (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.getDefault()));
    }

    public int hashCode() {
        return (this.f25239j.hashCode() * 7) + (this.f25240k.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append(C9513o.class.getName());
        sb2.append("[element=");
        sb2.append(this.f25239j.name());
        sb2.append(", resources=");
        sb2.append(this.f25240k);
        sb2.append(']');
        return sb2.toString();
    }

    private C9513o(InterfaceC7664p<V> interfaceC7664p, Map<V, String> map, int i, boolean z, Locale locale) {
        this.f25239j = interfaceC7664p;
        this.f25240k = map;
        this.f25241l = i;
        this.f25242m = z;
        this.f25243n = locale;
    }
}
