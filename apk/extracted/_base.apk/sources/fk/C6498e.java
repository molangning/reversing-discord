package fk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9652n;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import okhttp3.Headers;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0004BG\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, m14357d2 = {"Lfk/e;", "", "", "clientOriginated", "a", "", "toString", "", "hashCode", "other", "equals", "Z", "perMessageDeflate", "b", "Ljava/lang/Integer;", "clientMaxWindowBits", "c", "clientNoContextTakeover", "d", "serverMaxWindowBits", "e", "serverNoContextTakeover", "f", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "g", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6498e {

    /* renamed from: g */
    public static final C6499a f18274g = new C6499a(null);

    /* renamed from: a */
    public final boolean f18275a;

    /* renamed from: b */
    public final Integer f18276b;

    /* renamed from: c */
    public final boolean f18277c;

    /* renamed from: d */
    public final Integer f18278d;

    /* renamed from: e */
    public final boolean f18279e;

    /* renamed from: f */
    public final boolean f18280f;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m14357d2 = {"Lfk/e$a;", "", "Lokhttp3/Headers;", "responseHeaders", "Lfk/e;", "a", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6499a {
        private C6499a() {
        }

        public /* synthetic */ C6499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6498e m22576a(Headers responseHeaders) {
            boolean m13754t;
            boolean m13754t2;
            String str;
            boolean m13754t3;
            boolean m13754t4;
            boolean m13754t5;
            boolean m13754t6;
            Integer m13769m;
            Integer m13769m2;
            C9612q.m13917h(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                m13754t = C9653o.m13754t(responseHeaders.m8928e(i), "Sec-WebSocket-Extensions", true);
                if (m13754t) {
                    String m8924o = responseHeaders.m8924o(i);
                    int i2 = 0;
                    while (i2 < m8924o.length()) {
                        int m4796o = C12562c.m4796o(m8924o, ',', i2, 0, 4, null);
                        int m4798m = C12562c.m4798m(m8924o, ';', i2, m4796o);
                        String m4814V = C12562c.m4814V(m8924o, i2, m4798m);
                        int i3 = m4798m + 1;
                        m13754t2 = C9653o.m13754t(m4814V, "permessage-deflate", true);
                        if (m13754t2) {
                            if (z) {
                                z4 = true;
                            }
                            while (i3 < m4796o) {
                                int m4798m2 = C12562c.m4798m(m8924o, ';', i3, m4796o);
                                int m4798m3 = C12562c.m4798m(m8924o, '=', i3, m4798m2);
                                String m4814V2 = C12562c.m4814V(m8924o, i3, m4798m3);
                                if (m4798m3 < m4798m2) {
                                    str = C9654p.m13690r0(C12562c.m4814V(m8924o, m4798m3 + 1, m4798m2), "\"");
                                } else {
                                    str = null;
                                }
                                int i4 = m4798m2 + 1;
                                m13754t3 = C9653o.m13754t(m4814V2, "client_max_window_bits", true);
                                if (m13754t3) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    if (str != null) {
                                        m13769m2 = C9652n.m13769m(str);
                                        num = m13769m2;
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                        i3 = i4;
                                    }
                                    z4 = true;
                                    i3 = i4;
                                } else {
                                    m13754t4 = C9653o.m13754t(m4814V2, "client_no_context_takeover", true);
                                    if (m13754t4) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (str != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else {
                                        m13754t5 = C9653o.m13754t(m4814V2, "server_max_window_bits", true);
                                        if (m13754t5) {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            if (str != null) {
                                                m13769m = C9652n.m13769m(str);
                                                num2 = m13769m;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                            }
                                            z4 = true;
                                        } else {
                                            m13754t6 = C9653o.m13754t(m4814V2, "server_no_context_takeover", true);
                                            if (m13754t6) {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (str != null) {
                                                    z4 = true;
                                                }
                                                z3 = true;
                                            }
                                            z4 = true;
                                        }
                                    }
                                    i3 = i4;
                                }
                            }
                            i2 = i3;
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new C6498e(z, num, z2, num2, z3, z4);
        }
    }

    public C6498e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public C6498e(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f18275a = z;
        this.f18276b = num;
        this.f18277c = z2;
        this.f18278d = num2;
        this.f18279e = z3;
        this.f18280f = z4;
    }

    /* renamed from: a */
    public final boolean m22577a(boolean z) {
        if (z) {
            return this.f18277c;
        }
        return this.f18279e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6498e) {
                C6498e c6498e = (C6498e) obj;
                return this.f18275a == c6498e.f18275a && C9612q.m13922c(this.f18276b, c6498e.f18276b) && this.f18277c == c6498e.f18277c && C9612q.m13922c(this.f18278d, c6498e.f18278d) && this.f18279e == c6498e.f18279e && this.f18280f == c6498e.f18280f;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.f18275a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.f18276b;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        ?? r2 = this.f18277c;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Integer num2 = this.f18278d;
        int hashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.f18279e;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z2 = this.f18280f;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f18275a + ", clientMaxWindowBits=" + this.f18276b + ", clientNoContextTakeover=" + this.f18277c + ", serverMaxWindowBits=" + this.f18278d + ", serverNoContextTakeover=" + this.f18279e + ", unknownValues=" + this.f18280f + ")";
    }

    public /* synthetic */ C6498e(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
