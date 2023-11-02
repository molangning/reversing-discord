package p431xj;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import p328rj.EnumC12312p;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m14357d2 = {"Lxj/k;", "", "", "toString", "Lrj/p;", "a", "Lrj/p;", "protocol", "", "b", "I", "code", "c", "Ljava/lang/String;", "message", "<init>", "(Lrj/p;ILjava/lang/String;)V", "d", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: xj.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13845k {

    /* renamed from: d */
    public static final C13846a f35646d = new C13846a(null);

    /* renamed from: a */
    public final EnumC12312p f35647a;

    /* renamed from: b */
    public final int f35648b;

    /* renamed from: c */
    public final String f35649c;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, m14357d2 = {"Lxj/k$a;", "", "", "statusLine", "Lxj/k;", "a", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: xj.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C13846a {
        private C13846a() {
        }

        public /* synthetic */ C13846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13845k m1403a(String statusLine) {
            boolean m13758H;
            boolean m13758H2;
            EnumC12312p enumC12312p;
            int i;
            String str;
            C9612q.m13917h(statusLine, "statusLine");
            m13758H = C9653o.m13758H(statusLine, "HTTP/1.", false, 2, null);
            if (m13758H) {
                i = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt == 0) {
                        enumC12312p = EnumC12312p.HTTP_1_0;
                    } else if (charAt == 1) {
                        enumC12312p = EnumC12312p.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            } else {
                m13758H2 = C9653o.m13758H(statusLine, "ICY ", false, 2, null);
                if (m13758H2) {
                    enumC12312p = EnumC12312p.HTTP_1_0;
                    i = 4;
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            int i2 = i + 3;
            if (statusLine.length() >= i2) {
                try {
                    String substring = statusLine.substring(i, i2);
                    C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i2) {
                        if (statusLine.charAt(i2) == ' ') {
                            str = statusLine.substring(i + 4);
                            C9612q.m13918g(str, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException("Unexpected status line: " + statusLine);
                        }
                    } else {
                        str = "";
                    }
                    return new C13845k(enumC12312p, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
    }

    public C13845k(EnumC12312p protocol, int i, String message) {
        C9612q.m13917h(protocol, "protocol");
        C9612q.m13917h(message, "message");
        this.f35647a = protocol;
        this.f35648b = i;
        this.f35649c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f35647a == EnumC12312p.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f35648b);
        sb2.append(' ');
        sb2.append(this.f35649c);
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
