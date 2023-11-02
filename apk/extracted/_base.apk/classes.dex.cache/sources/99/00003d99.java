package p184jj;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;

/* renamed from: jj.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9013s {

    /* renamed from: a */
    private final List<String> f23664a;

    public C9013s(String[] strArr) {
        this.f23664a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: a */
    private boolean m16860a(char c, char c2) {
        if (c >= 'a' && c <= 'z') {
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) ((c2 + 'a') - 65);
            }
            if (c != c2) {
                return false;
            }
            return true;
        } else if (c >= 'A' && c <= 'Z') {
            char c3 = (char) ((c + 'a') - 65);
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) ((c2 + 'a') - 65);
            }
            if (c3 != c2) {
                return false;
            }
            return true;
        } else if (Character.toUpperCase(c) != Character.toUpperCase(c2) && Character.toLowerCase(c) != Character.toLowerCase(c2)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private <V extends Enum<V>> V m16856e(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        String str;
        V v;
        boolean z4;
        V[] enumConstants = cls.getEnumConstants();
        int size = this.f23664a.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String str3 = "";
        int i3 = 0;
        V v2 = null;
        int i4 = 0;
        while (i3 < enumConstants.length) {
            boolean isEmpty = str3.isEmpty();
            if (isEmpty) {
                if (i3 >= size) {
                    str3 = enumConstants[i3].name();
                } else {
                    str3 = this.f23664a.get(i3);
                }
            }
            int length2 = str3.length();
            int i5 = index;
            int i6 = 0;
            boolean z5 = true;
            while (z5 && i6 < length2) {
                int i7 = size;
                int i8 = index + i6;
                if (i8 >= length) {
                    str = str2;
                    v = v2;
                    z5 = false;
                } else {
                    char charAt = charSequence.charAt(i8);
                    str = str2;
                    char charAt2 = str3.charAt(i6);
                    if (z3) {
                        v = v2;
                        if (charAt == 160) {
                            charAt = ' ';
                        }
                        if (charAt2 == 160) {
                            charAt2 = ' ';
                        }
                    } else {
                        v = v2;
                    }
                    if (!z ? charAt != charAt2 : charAt != charAt2 && !m16860a(charAt, charAt2)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        i5++;
                    }
                    z5 = z4;
                }
                i6++;
                size = i7;
                str2 = str;
                v2 = v;
            }
            int i9 = size;
            String str4 = str2;
            V v3 = v2;
            if (z3 && isEmpty && length2 == 5 && str3.charAt(4) == '.' && i5 == (i2 = index + 3) && i2 < length && charSequence.charAt(i2) == '.') {
                i3--;
                str3 = ((Object) str3.subSequence(index, i2)) + ".";
            } else {
                if (!z2 && length2 != 1) {
                    if (z5) {
                        parsePosition.setIndex(i5);
                        return enumConstants[i3];
                    }
                } else {
                    int i10 = i5 - index;
                    if (i4 < i10) {
                        v2 = enumConstants[i3];
                        i4 = i10;
                        str3 = str4;
                        i = 1;
                        i3 += i;
                        size = i9;
                        str2 = str4;
                    } else if (i4 == i10) {
                        str3 = str4;
                        i = 1;
                        v2 = null;
                        i3 += i;
                        size = i9;
                        str2 = str4;
                    }
                }
                str3 = str4;
            }
            v2 = v3;
            i = 1;
            i3 += i;
            size = i9;
            str2 = str4;
        }
        V v4 = v2;
        if (v4 == null) {
            parsePosition.setErrorIndex(index);
        } else {
            parsePosition.setIndex(index + i4);
        }
        return v4;
    }

    /* renamed from: b */
    public List<String> m16859b() {
        return this.f23664a;
    }

    /* renamed from: c */
    public <V extends Enum<V>> V m16858c(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, InterfaceC7633d interfaceC7633d) {
        InterfaceC7631c<Boolean> interfaceC7631c = C8969a.f23568i;
        Boolean bool = Boolean.TRUE;
        return (V) m16856e(charSequence, parsePosition, cls, ((Boolean) interfaceC7633d.mo14441b(interfaceC7631c, bool)).booleanValue(), ((Boolean) interfaceC7633d.mo14441b(C8969a.f23569j, Boolean.FALSE)).booleanValue(), ((Boolean) interfaceC7633d.mo14441b(C8969a.f23570k, bool)).booleanValue());
    }

    /* renamed from: d */
    public <V extends Enum<V>> V m16857d(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, EnumC8981g enumC8981g) {
        boolean z;
        boolean z2;
        boolean z3;
        if (enumC8981g == EnumC8981g.STRICT) {
            z2 = false;
        } else if (enumC8981g == EnumC8981g.LAX) {
            z2 = true;
        } else {
            z = false;
            z2 = true;
            z3 = true;
            return (V) m16856e(charSequence, parsePosition, cls, z2, z, z3);
        }
        z = z2;
        z3 = z;
        return (V) m16856e(charSequence, parsePosition, cls, z2, z, z3);
    }

    /* renamed from: f */
    public String m16855f(Enum<?> r3) {
        int ordinal = r3.ordinal();
        if (this.f23664a.size() <= ordinal) {
            return r3.name();
        }
        return this.f23664a.get(ordinal);
    }

    public String toString() {
        int size = this.f23664a.size();
        StringBuilder sb2 = new StringBuilder((size * 16) + 2);
        sb2.append('{');
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (z) {
                z = false;
            } else {
                sb2.append(',');
            }
            sb2.append(this.f23664a.get(i));
        }
        sb2.append('}');
        return sb2.toString();
    }
}