package dj;

import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0003J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&J\b\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001fH\u0004J\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0004J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0004\b(\u0010)J\u0006\u0010*\u001a\u00020\u001dJ\u0010\u0010,\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\nJ\b\u0010-\u001a\u00020\u0002H\u0016J\u001a\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\nH&J\u0010\u00101\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\nJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0007H&J\u0006\u00105\u001a\u00020\u0007J \u00106\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0005J\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020\u0007J\u0018\u0010;\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0014J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\nJ\b\u0010>\u001a\u00020\u0007H\u0016J\u000e\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0007J\"\u0010C\u001a\u00020'2\u0006\u0010A\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010B\u001a\u00020\u0007J\u0006\u0010E\u001a\u00020DJ\u0006\u0010F\u001a\u00020\nJ\u0006\u0010G\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00028\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bH\u0010-R\u0014\u0010K\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010LR&\u0010U\u001a\u00060Nj\u0002`O8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, m14357d2 = {"Ldj/a;", "", "", "lastPosition", "current", "c", "currentPosition", "", "u", "K", "", "P", "startPosition", "b", "", "source", "startPos", "d", "B", ViewProps.START, "h", "literalSuffix", "", "j", "v", ViewProps.POSITION, "G", "L", "f", "", "m", "", "D", "w", "expected", "n", "o", "O", "expectedToken", "", "z", "(B)Ljava/lang/Void;", "E", "doConsume", "M", "I", "keyToMatch", "isLenient", "l", "F", "endPos", "J", "k", "q", "r", "t", "s", "fromIndex", "toIndex", "e", "allowLenientStrings", "H", "toString", "key", "A", "message", "hint", "x", "", "p", "g", "i", "a", "Ldj/c0;", "Ldj/c0;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "C", "()Ljava/lang/CharSequence;", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC5972a {

    /* renamed from: a */
    protected int f17004a;

    /* renamed from: c */
    private String f17006c;

    /* renamed from: b */
    public final C5978c0 f17005b = new C5978c0();

    /* renamed from: d */
    private StringBuilder f17007d = new StringBuilder();

    /* renamed from: B */
    private final int m24049B(CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        char charAt = charSequence.charAt(i);
        boolean z3 = true;
        if ('0' <= charAt && charAt < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charAt - '0';
        }
        char c = 'a';
        if ('a' <= charAt && charAt < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z3 = false;
            }
            if (!z3) {
                m24019y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new C11568i();
            }
        }
        return (charAt - c) + 10;
    }

    /* renamed from: K */
    private final String m24043K() {
        String str = this.f17006c;
        C9612q.m13920e(str);
        this.f17006c = null;
        return str;
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m24041N(AbstractC5972a abstractC5972a, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return abstractC5972a.m24042M(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    /* renamed from: P */
    private final boolean m24039P() {
        return mo23889C().charAt(this.f17004a - 1) != '\"';
    }

    /* renamed from: b */
    private final int m24037b(int i) {
        int mo23888G = mo23888G(i);
        if (mo23888G != -1) {
            int i2 = mo23888G + 1;
            char charAt = mo23889C().charAt(mo23888G);
            if (charAt == 'u') {
                return m24035d(mo23889C(), i2);
            }
            char m24006b = C5974b.m24006b(charAt);
            if (m24006b != 0) {
                this.f17007d.append(m24006b);
                return i2;
            }
            m24019y(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new C11568i();
        }
        m24019y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: c */
    private final int m24036c(int i, int i2) {
        m24034e(i, i2);
        return m24037b(i2 + 1);
    }

    /* renamed from: d */
    private final int m24035d(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.f17004a = i;
            m24022v();
            if (this.f17004a + 4 < charSequence.length()) {
                return m24035d(charSequence, this.f17004a);
            }
            m24019y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new C11568i();
        }
        this.f17007d.append((char) ((m24049B(charSequence, i) << 12) + (m24049B(charSequence, i + 1) << 8) + (m24049B(charSequence, i + 2) << 4) + m24049B(charSequence, i + 3)));
        return i2;
    }

    /* renamed from: h */
    private final boolean m24032h(int i) {
        int mo23888G = mo23888G(i);
        if (mo23888G < mo23889C().length() && mo23888G != -1) {
            int i2 = mo23888G + 1;
            int charAt = mo23889C().charAt(mo23888G) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    m24030j("rue", i2);
                    return true;
                }
                m24019y(this, "Expected valid boolean literal prefix, but had '" + m24025s() + '\'', 0, null, 6, null);
                throw new C11568i();
            }
            m24030j("alse", i2);
            return false;
        }
        m24019y(this, "EOF", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: j */
    private final void m24030j(String str, int i) {
        if (mo23889C().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (mo23889C().charAt(i + i2) | ' ')) {
                    m24019y(this, "Expected valid boolean literal prefix, but had '" + m24025s() + '\'', 0, null, 6, null);
                    throw new C11568i();
                }
            }
            this.f17004a = i + str.length();
            return;
        }
        m24019y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: u */
    private final String m24023u(int i, int i2) {
        m24034e(i, i2);
        String sb2 = this.f17007d.toString();
        C9612q.m13918g(sb2, "escapedString.toString()");
        this.f17007d.setLength(0);
        return sb2;
    }

    /* renamed from: y */
    public static /* synthetic */ Void m24019y(AbstractC5972a abstractC5972a, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractC5972a.f17004a;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return abstractC5972a.m24020x(str, i, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    /* renamed from: A */
    public final void m24050A(String key) {
        int m13703e0;
        C9612q.m13917h(key, "key");
        m13703e0 = C9654p.m13703e0(m24044J(0, this.f17004a), key, 0, false, 6, null);
        m24020x("Encountered an unknown key '" + key + '\'', m13703e0, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C11568i();
    }

    /* renamed from: C */
    protected abstract CharSequence mo23889C();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean m24048D(char c) {
        return !(((c == '}' || c == ']') || c == ':') || c == ',');
    }

    /* renamed from: E */
    public final byte m24047E() {
        CharSequence mo23889C = mo23889C();
        int i = this.f17004a;
        while (true) {
            int mo23888G = mo23888G(i);
            if (mo23888G != -1) {
                char charAt = mo23889C.charAt(mo23888G);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f17004a = mo23888G;
                    return C5974b.m24007a(charAt);
                }
                i = mo23888G + 1;
            } else {
                this.f17004a = mo23888G;
                return (byte) 10;
            }
        }
    }

    /* renamed from: F */
    public final String m24046F(boolean z) {
        String m24027q;
        byte m24047E = m24047E();
        if (z) {
            if (m24047E != 1 && m24047E != 0) {
                return null;
            }
            m24027q = m24025s();
        } else if (m24047E != 1) {
            return null;
        } else {
            m24027q = m24027q();
        }
        this.f17006c = m24027q;
        return m24027q;
    }

    /* renamed from: G */
    public abstract int mo23888G(int i);

    /* renamed from: H */
    public final void m24045H(boolean z) {
        Object m14044f0;
        Object m14044f02;
        ArrayList arrayList = new ArrayList();
        byte m24047E = m24047E();
        if (m24047E != 8 && m24047E != 6) {
            m24025s();
            return;
        }
        while (true) {
            byte m24047E2 = m24047E();
            boolean z2 = true;
            if (m24047E2 == 1) {
                if (z) {
                    m24025s();
                } else {
                    mo23883k();
                }
            } else {
                if (m24047E2 != 8 && m24047E2 != 6) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Byte.valueOf(m24047E2));
                } else if (m24047E2 == 9) {
                    m14044f02 = C9553r.m14044f0(arrayList);
                    if (((Number) m14044f02).byteValue() == 8) {
                        C9550o.m14087B(arrayList);
                    } else {
                        int i = this.f17004a;
                        throw C5973a0.m24013e(i, "found ] instead of } at path: " + this.f17005b, mo23889C());
                    }
                } else if (m24047E2 == 7) {
                    m14044f0 = C9553r.m14044f0(arrayList);
                    if (((Number) m14044f0).byteValue() == 6) {
                        C9550o.m14087B(arrayList);
                    } else {
                        int i2 = this.f17004a;
                        throw C5973a0.m24013e(i2, "found } instead of ] at path: " + this.f17005b, mo23889C());
                    }
                } else if (m24047E2 == 10) {
                    m24019y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new C11568i();
                }
                mo23881m();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    public abstract int mo23887I();

    /* renamed from: J */
    public String m24044J(int i, int i2) {
        return mo23889C().subSequence(i, i2).toString();
    }

    /* renamed from: L */
    public abstract boolean mo23886L();

    /* renamed from: M */
    public final boolean m24042M(boolean z) {
        int mo23888G = mo23888G(mo23887I());
        int length = mo23889C().length() - mo23888G;
        if (length < 4 || mo23888G == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != mo23889C().charAt(mo23888G + i)) {
                return false;
            }
        }
        if (length > 4 && C5974b.m24007a(mo23889C().charAt(mo23888G + 4)) == 0) {
            return false;
        }
        if (z) {
            this.f17004a = mo23888G + 4;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m24040O(char c) {
        int i = this.f17004a - 1;
        this.f17004a = i;
        if (i >= 0 && c == '\"' && C9612q.m13922c(m24025s(), "null")) {
            m24020x("Expected string literal but 'null' literal was found", this.f17004a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new C11568i();
        } else {
            m24018z(C5974b.m24007a(c));
            throw new C11568i();
        }
    }

    /* renamed from: e */
    protected void m24034e(int i, int i2) {
        this.f17007d.append(mo23889C(), i, i2);
    }

    /* renamed from: f */
    public abstract boolean mo23884f();

    /* renamed from: g */
    public final boolean m24033g() {
        return m24032h(mo23887I());
    }

    /* renamed from: i */
    public final boolean m24031i() {
        boolean z;
        int mo23887I = mo23887I();
        if (mo23887I != mo23889C().length()) {
            if (mo23889C().charAt(mo23887I) == '\"') {
                mo23887I++;
                z = true;
            } else {
                z = false;
            }
            boolean m24032h = m24032h(mo23887I);
            if (z) {
                if (this.f17004a != mo23889C().length()) {
                    if (mo23889C().charAt(this.f17004a) == '\"') {
                        this.f17004a++;
                    } else {
                        m24019y(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new C11568i();
                    }
                } else {
                    m24019y(this, "EOF", 0, null, 6, null);
                    throw new C11568i();
                }
            }
            return m24032h;
        }
        m24019y(this, "EOF", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: k */
    public abstract String mo23883k();

    /* renamed from: l */
    public abstract String mo23882l(String str, boolean z);

    /* renamed from: m */
    public abstract byte mo23881m();

    /* renamed from: n */
    public final byte m24029n(byte b) {
        byte mo23881m = mo23881m();
        if (mo23881m == b) {
            return mo23881m;
        }
        m24018z(b);
        throw new C11568i();
    }

    /* renamed from: o */
    public abstract void mo23880o(char c);

    /* renamed from: p */
    public final long m24028p() {
        boolean z;
        boolean z2;
        int mo23888G = mo23888G(mo23887I());
        if (mo23888G < mo23889C().length() && mo23888G != -1) {
            if (mo23889C().charAt(mo23888G) == '\"') {
                mo23888G++;
                if (mo23888G != mo23889C().length()) {
                    z = true;
                } else {
                    m24019y(this, "EOF", 0, null, 6, null);
                    throw new C11568i();
                }
            } else {
                z = false;
            }
            int i = mo23888G;
            long j = 0;
            boolean z3 = true;
            boolean z4 = false;
            while (z3) {
                char charAt = mo23889C().charAt(i);
                if (charAt == '-') {
                    if (i == mo23888G) {
                        i++;
                        z4 = true;
                    } else {
                        m24019y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new C11568i();
                    }
                } else if (C5974b.m24007a(charAt) != 0) {
                    break;
                } else {
                    i++;
                    if (i != mo23889C().length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i2 = charAt - '0';
                    if (i2 >= 0 && i2 < 10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        j = (j * 10) - i2;
                        if (j > 0) {
                            m24019y(this, "Numeric value overflow", 0, null, 6, null);
                            throw new C11568i();
                        }
                    } else {
                        m24019y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                        throw new C11568i();
                    }
                }
            }
            if (mo23888G != i && (!z4 || mo23888G != i - 1)) {
                if (z) {
                    if (z3) {
                        if (mo23889C().charAt(i) == '\"') {
                            i++;
                        } else {
                            m24019y(this, "Expected closing quotation mark", 0, null, 6, null);
                            throw new C11568i();
                        }
                    } else {
                        m24019y(this, "EOF", 0, null, 6, null);
                        throw new C11568i();
                    }
                }
                this.f17004a = i;
                if (!z4) {
                    if (j != Long.MIN_VALUE) {
                        return -j;
                    }
                    m24019y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new C11568i();
                }
                return j;
            }
            m24019y(this, "Expected numeric literal", 0, null, 6, null);
            throw new C11568i();
        }
        m24019y(this, "EOF", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: q */
    public final String m24027q() {
        if (this.f17006c != null) {
            return m24043K();
        }
        return mo23883k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final String m24026r(CharSequence source, int i, int i2) {
        String m24023u;
        int mo23888G;
        C9612q.m13917h(source, "source");
        char charAt = source.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                mo23888G = mo23888G(m24036c(i, i2));
                if (mo23888G == -1) {
                    m24019y(this, "EOF", mo23888G, null, 4, null);
                    throw new C11568i();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    m24034e(i, i2);
                    mo23888G = mo23888G(i2);
                    if (mo23888G == -1) {
                        m24019y(this, "EOF", mo23888G, null, 4, null);
                        throw new C11568i();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            z = true;
            i = mo23888G;
            i2 = i;
            charAt = source.charAt(i2);
        }
        if (!z) {
            m24023u = m24044J(i, i2);
        } else {
            m24023u = m24023u(i, i2);
        }
        this.f17004a = i2 + 1;
        return m24023u;
    }

    /* renamed from: s */
    public final String m24025s() {
        String m24023u;
        if (this.f17006c != null) {
            return m24043K();
        }
        int mo23887I = mo23887I();
        if (mo23887I < mo23889C().length() && mo23887I != -1) {
            byte m24007a = C5974b.m24007a(mo23889C().charAt(mo23887I));
            if (m24007a == 1) {
                return m24027q();
            }
            if (m24007a == 0) {
                boolean z = false;
                while (C5974b.m24007a(mo23889C().charAt(mo23887I)) == 0) {
                    mo23887I++;
                    if (mo23887I >= mo23889C().length()) {
                        m24034e(this.f17004a, mo23887I);
                        int mo23888G = mo23888G(mo23887I);
                        if (mo23888G == -1) {
                            this.f17004a = mo23887I;
                            return m24023u(0, 0);
                        }
                        mo23887I = mo23888G;
                        z = true;
                    }
                }
                if (!z) {
                    m24023u = m24044J(this.f17004a, mo23887I);
                } else {
                    m24023u = m24023u(this.f17004a, mo23887I);
                }
                this.f17004a = mo23887I;
                return m24023u;
            }
            m24019y(this, "Expected beginning of the string, but got " + mo23889C().charAt(mo23887I), 0, null, 6, null);
            throw new C11568i();
        }
        m24019y(this, "EOF", mo23887I, null, 4, null);
        throw new C11568i();
    }

    /* renamed from: t */
    public final String m24024t() {
        String m24025s = m24025s();
        if (C9612q.m13922c(m24025s, "null") && m24039P()) {
            m24019y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new C11568i();
        }
        return m24025s;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo23889C()) + "', currentPosition=" + this.f17004a + ')';
    }

    /* renamed from: v */
    public void m24022v() {
    }

    /* renamed from: w */
    public final void m24021w() {
        if (mo23881m() == 10) {
            return;
        }
        m24019y(this, "Expected EOF after parsing, but had " + mo23889C().charAt(this.f17004a - 1) + " instead", 0, null, 6, null);
        throw new C11568i();
    }

    /* renamed from: x */
    public final Void m24020x(String message, int i, String hint) {
        boolean z;
        String str;
        C9612q.m13917h(message, "message");
        C9612q.m13917h(hint, "hint");
        if (hint.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C5973a0.m24013e(i, message + " at path: " + this.f17005b.m23973a() + str, mo23889C());
    }

    /* renamed from: z */
    public final Void m24018z(byte b) {
        String str;
        String str2;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.f17004a != mo23889C().length() && this.f17004a > 0) {
            str2 = String.valueOf(mo23889C().charAt(this.f17004a - 1));
        } else {
            str2 = "EOF";
        }
        m24019y(this, "Expected " + str + ", but had '" + str2 + "' instead", this.f17004a - 1, null, 4, null);
        throw new C11568i();
    }
}
