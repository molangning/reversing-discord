package dj;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import pf.C11568i;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u001a\u0010\u0018\u001a\u00020\u000f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Ldj/q0;", "Ldj/a;", "", ViewProps.POSITION, "G", "", "m", "", "L", "f", "I", "", "expected", "", "o", "", "k", "keyToMatch", "isLenient", "l", "e", "Ljava/lang/String;", "Q", "()Ljava/lang/String;", "source", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6012q0 extends AbstractC5972a {

    /* renamed from: e */
    private final String f17080e;

    public C6012q0(String source) {
        C9612q.m13917h(source, "source");
        this.f17080e = source;
    }

    @Override // dj.AbstractC5972a
    /* renamed from: G */
    public int mo23888G(int i) {
        if (i < mo23889C().length()) {
            return i;
        }
        return -1;
    }

    @Override // dj.AbstractC5972a
    /* renamed from: I */
    public int mo23887I() {
        char charAt;
        int i = this.f17004a;
        if (i == -1) {
            return i;
        }
        while (i < mo23889C().length() && ((charAt = mo23889C().charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.f17004a = i;
        return i;
    }

    @Override // dj.AbstractC5972a
    /* renamed from: L */
    public boolean mo23886L() {
        int mo23887I = mo23887I();
        if (mo23887I == mo23889C().length() || mo23887I == -1 || mo23889C().charAt(mo23887I) != ',') {
            return false;
        }
        this.f17004a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dj.AbstractC5972a
    /* renamed from: Q */
    public String mo23889C() {
        return this.f17080e;
    }

    @Override // dj.AbstractC5972a
    /* renamed from: f */
    public boolean mo23884f() {
        int i = this.f17004a;
        if (i == -1) {
            return false;
        }
        while (i < mo23889C().length()) {
            char charAt = mo23889C().charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f17004a = i;
                return m24048D(charAt);
            }
            i++;
        }
        this.f17004a = i;
        return false;
    }

    @Override // dj.AbstractC5972a
    /* renamed from: k */
    public String mo23883k() {
        int m13709Y;
        mo23880o('\"');
        int i = this.f17004a;
        m13709Y = C9654p.m13709Y(mo23889C(), '\"', i, false, 4, null);
        if (m13709Y != -1) {
            for (int i2 = i; i2 < m13709Y; i2++) {
                if (mo23889C().charAt(i2) == '\\') {
                    return m24026r(mo23889C(), this.f17004a, i2);
                }
            }
            this.f17004a = m13709Y + 1;
            String substring = mo23889C().substring(i, m13709Y);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        m24018z((byte) 1);
        throw new C11568i();
    }

    @Override // dj.AbstractC5972a
    /* renamed from: l */
    public String mo23882l(String keyToMatch, boolean z) {
        String m24024t;
        String m24024t2;
        C9612q.m13917h(keyToMatch, "keyToMatch");
        int i = this.f17004a;
        try {
            if (mo23881m() != 6) {
                return null;
            }
            if (z) {
                m24024t = mo23883k();
            } else {
                m24024t = m24024t();
            }
            if (!C9612q.m13922c(m24024t, keyToMatch)) {
                return null;
            }
            if (mo23881m() != 5) {
                return null;
            }
            if (z) {
                m24024t2 = m24027q();
            } else {
                m24024t2 = m24024t();
            }
            return m24024t2;
        } finally {
            this.f17004a = i;
        }
    }

    @Override // dj.AbstractC5972a
    /* renamed from: m */
    public byte mo23881m() {
        byte m24007a;
        String mo23889C = mo23889C();
        do {
            int i = this.f17004a;
            if (i != -1 && i < mo23889C.length()) {
                int i2 = this.f17004a;
                this.f17004a = i2 + 1;
                m24007a = C5974b.m24007a(mo23889C.charAt(i2));
            } else {
                return (byte) 10;
            }
        } while (m24007a == 3);
        return m24007a;
    }

    @Override // dj.AbstractC5972a
    /* renamed from: o */
    public void mo23880o(char c) {
        if (this.f17004a == -1) {
            m24040O(c);
        }
        String mo23889C = mo23889C();
        while (this.f17004a < mo23889C.length()) {
            int i = this.f17004a;
            this.f17004a = i + 1;
            char charAt = mo23889C.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c) {
                    return;
                }
                m24040O(c);
            }
        }
        m24040O(c);
    }
}
