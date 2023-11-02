package okhttp3;

import cg.InterfaceC2533a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9550o;
import kotlin.jvm.internal.C9581b;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9627a;
import kotlin.ranges.IntRange;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import pf.C11591x;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u0000 \u00172\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0005 B\u0017\b\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0096\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m14357d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", ZeroconfModule.KEY_SERVICE_NAME, "a", "", "index", "e", "o", "", "p", "", "iterator", "Lokhttp3/Headers$a;", "h", "", "other", "", "equals", "hashCode", "toString", "", "k", "", "j", "[Ljava/lang/String;", "namesAndValues", "size", "()I", "<init>", "([Ljava/lang/String;)V", "b", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC2533a {

    /* renamed from: k */
    public static final C11195b f29295k = new C11195b(null);

    /* renamed from: j */
    private final String[] f29296j;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Lokhttp3/Headers$a;", "", "", "line", "b", "(Ljava/lang/String;)Lokhttp3/Headers$a;", ZeroconfModule.KEY_SERVICE_NAME, "value", "a", "c", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$a;", "g", "h", "e", "Lokhttp3/Headers;", "d", "", "Ljava/util/List;", "f", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.Headers$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11194a {

        /* renamed from: a */
        private final List<String> f29297a = new ArrayList(20);

        /* renamed from: a */
        public final C11194a m8922a(String name, String value) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            C11195b c11195b = Headers.f29295k;
            c11195b.m8911d(name);
            c11195b.m8910e(value, name);
            m8920c(name, value);
            return this;
        }

        /* renamed from: b */
        public final C11194a m8921b(String line) {
            int m13709Y;
            C9612q.m13917h(line, "line");
            m13709Y = C9654p.m13709Y(line, ':', 1, false, 4, null);
            if (m13709Y != -1) {
                String substring = line.substring(0, m13709Y);
                C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = line.substring(m13709Y + 1);
                C9612q.m13918g(substring2, "(this as java.lang.String).substring(startIndex)");
                m8920c(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                C9612q.m13918g(substring3, "(this as java.lang.String).substring(startIndex)");
                m8920c("", substring3);
            } else {
                m8920c("", line);
            }
            return this;
        }

        /* renamed from: c */
        public final C11194a m8920c(String name, String value) {
            CharSequence m13712V0;
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            this.f29297a.add(name);
            List<String> list = this.f29297a;
            m13712V0 = C9654p.m13712V0(value);
            list.add(m13712V0.toString());
            return this;
        }

        /* renamed from: d */
        public final Headers m8919d() {
            Object[] array = this.f29297a.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* JADX WARN: Incorrect condition in loop: B:8:0x0036 */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m8918e(java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.C9612q.m13917h(r6, r0)
                java.util.List<java.lang.String> r0 = r5.f29297a
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.a r0 = gg.C6757h.m21938l(r0, r2)
                kotlin.ranges.a r0 = gg.C6757h.m21935o(r0, r1)
                int r1 = r0.m13890a()
                int r2 = r0.m13889e()
                int r0 = r0.m13888h()
                if (r0 < 0) goto L27
                if (r1 > r2) goto L46
                goto L29
            L27:
                if (r1 < r2) goto L46
            L29:
                java.util.List<java.lang.String> r3 = r5.f29297a
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                boolean r3 = kotlin.text.C9642f.m13793t(r6, r3, r4)
                if (r3 == 0) goto L42
                java.util.List<java.lang.String> r6 = r5.f29297a
                int r1 = r1 + r4
                java.lang.Object r6 = r6.get(r1)
                java.lang.String r6 = (java.lang.String) r6
                return r6
            L42:
                if (r1 == r2) goto L46
                int r1 = r1 + r0
                goto L29
            L46:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.C11194a.m8918e(java.lang.String):java.lang.String");
        }

        /* renamed from: f */
        public final List<String> m8917f() {
            return this.f29297a;
        }

        /* renamed from: g */
        public final C11194a m8916g(String name) {
            boolean m13754t;
            C9612q.m13917h(name, "name");
            int i = 0;
            while (i < this.f29297a.size()) {
                m13754t = C9653o.m13754t(name, this.f29297a.get(i), true);
                if (m13754t) {
                    this.f29297a.remove(i);
                    this.f29297a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: h */
        public final C11194a m8915h(String name, String value) {
            C9612q.m13917h(name, "name");
            C9612q.m13917h(value, "value");
            C11195b c11195b = Headers.f29295k;
            c11195b.m8911d(name);
            c11195b.m8910e(value, name);
            m8916g(name);
            m8920c(name, value);
            return this;
        }
    }

    @Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m14357d2 = {"Lokhttp3/Headers$b;", "", "", "", "namesAndValues", ZeroconfModule.KEY_SERVICE_NAME, "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "d", "value", "e", "Lokhttp3/Headers;", "h", "([Ljava/lang/String;)Lokhttp3/Headers;", "", "g", "(Ljava/util/Map;)Lokhttp3/Headers;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.Headers$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11195b {
        private C11195b() {
        }

        public /* synthetic */ C11195b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m8911d(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(C12562c.m4794q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m8910e(String str, String str2) {
            boolean z;
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || '~' < charAt)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C12562c.m4794q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (C12562c.m4831E(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb2.append(str3);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Incorrect condition in loop: B:8:0x0026 */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m8909f(java.lang.String[] r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r6.length
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.a r0 = gg.C6757h.m21938l(r0, r2)
                kotlin.ranges.a r0 = gg.C6757h.m21935o(r0, r1)
                int r1 = r0.m13890a()
                int r2 = r0.m13889e()
                int r0 = r0.m13888h()
                if (r0 < 0) goto L1d
                if (r1 > r2) goto L30
                goto L1f
            L1d:
                if (r1 < r2) goto L30
            L1f:
                r3 = r6[r1]
                r4 = 1
                boolean r3 = kotlin.text.C9642f.m13793t(r7, r3, r4)
                if (r3 == 0) goto L2c
                int r1 = r1 + r4
                r6 = r6[r1]
                return r6
            L2c:
                if (r1 == r2) goto L30
                int r1 = r1 + r0
                goto L1f
            L30:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.C11195b.m8909f(java.lang.String[], java.lang.String):java.lang.String");
        }

        /* renamed from: g */
        public final Headers m8908g(Map<String, String> toHeaders) {
            CharSequence m13712V0;
            CharSequence m13712V02;
            C9612q.m13917h(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    m13712V0 = C9654p.m13712V0(key);
                    String obj = m13712V0.toString();
                    if (value != null) {
                        m13712V02 = C9654p.m13712V0(value);
                        String obj2 = m13712V02.toString();
                        m8911d(obj);
                        m8910e(obj2, obj);
                        strArr[i] = obj;
                        strArr[i + 1] = obj2;
                        i += 2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new Headers(strArr, null);
        }

        /* renamed from: h */
        public final Headers m8907h(String... namesAndValues) {
            boolean z;
            IntRange m14245F;
            C9627a m21918o;
            boolean z2;
            CharSequence m13712V0;
            C9612q.m13917h(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object clone = namesAndValues.clone();
                if (clone != null) {
                    String[] strArr = (String[]) clone;
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        String str = strArr[i];
                        if (str != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (str != null) {
                                m13712V0 = C9654p.m13712V0(str);
                                strArr[i] = m13712V0.toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    m14245F = C9538f.m14245F(strArr);
                    m21918o = C6759j.m21918o(m14245F, 2);
                    int m13890a = m21918o.m13890a();
                    int m13889e = m21918o.m13889e();
                    int m13888h = m21918o.m13888h();
                    if (m13888h < 0 ? m13890a >= m13889e : m13890a <= m13889e) {
                        while (true) {
                            String str2 = strArr[m13890a];
                            String str3 = strArr[m13890a + 1];
                            m8911d(str2);
                            m8910e(str3, str2);
                            if (m13890a == m13889e) {
                                break;
                            }
                            m13890a += m13888h;
                        }
                    }
                    return new Headers(strArr, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private Headers(String[] strArr) {
        this.f29296j = strArr;
    }

    /* renamed from: i */
    public static final Headers m8926i(Map<String, String> map) {
        return f29295k.m8908g(map);
    }

    /* renamed from: a */
    public final String m8929a(String name) {
        C9612q.m13917h(name, "name");
        return f29295k.m8909f(this.f29296j, name);
    }

    /* renamed from: e */
    public final String m8928e(int i) {
        return this.f29296j[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f29296j, ((Headers) obj).f29296j);
    }

    /* renamed from: h */
    public final C11194a m8927h() {
        C11194a c11194a = new C11194a();
        C9550o.m14084z(c11194a.m8917f(), this.f29296j);
        return c11194a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29296j);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = C11591x.m7577a(m8928e(i), m8924o(i));
        }
        return C9581b.m13973a(pairArr);
    }

    /* renamed from: k */
    public final Map<String, List<String>> m8925k() {
        Comparator m13752v;
        m13752v = C9653o.m13752v(C9602k0.f25351a);
        TreeMap treeMap = new TreeMap(m13752v);
        int size = size();
        for (int i = 0; i < size; i++) {
            String m8928e = m8928e(i);
            Locale locale = Locale.US;
            C9612q.m13918g(locale, "Locale.US");
            if (m8928e != null) {
                String lowerCase = m8928e.toLowerCase(locale);
                C9612q.m13918g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                List list = (List) treeMap.get(lowerCase);
                if (list == null) {
                    list = new ArrayList(2);
                    treeMap.put(lowerCase, list);
                }
                list.add(m8924o(i));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return treeMap;
    }

    /* renamed from: o */
    public final String m8924o(int i) {
        return this.f29296j[(i * 2) + 1];
    }

    /* renamed from: p */
    public final List<String> m8923p(String name) {
        List<String> m14104i;
        boolean m13754t;
        C9612q.m13917h(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            m13754t = C9653o.m13754t(name, m8928e(i), true);
            if (m13754t) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m8924o(i));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C9612q.m13918g(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    public final int size() {
        return this.f29296j.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String m8928e = m8928e(i);
            String m8924o = m8924o(i);
            sb2.append(m8928e);
            sb2.append(": ");
            if (C12562c.m4831E(m8928e)) {
                m8924o = "██";
            }
            sb2.append(m8924o);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
