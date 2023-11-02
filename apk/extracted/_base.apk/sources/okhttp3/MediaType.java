package okhttp3;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB/\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lokhttp3/MediaType;", "", "Ljava/nio/charset/Charset;", "defaultValue", "c", "", ZeroconfModule.KEY_SERVICE_NAME, "e", "toString", "other", "", "equals", "", "hashCode", "a", "Ljava/lang/String;", "mediaType", "b", "g", "()Ljava/lang/String;", "type", "subtype", "", "d", "[Ljava/lang/String;", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaType {

    /* renamed from: a */
    private final String f29322a;

    /* renamed from: b */
    private final String f29323b;

    /* renamed from: c */
    private final String f29324c;

    /* renamed from: d */
    private final String[] f29325d;

    /* renamed from: g */
    public static final C11199a f29321g = new C11199a(null);

    /* renamed from: e */
    private static final Pattern f29319e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    private static final Pattern f29320f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, m14357d2 = {"Lokhttp3/MediaType$a;", "", "", "Lokhttp3/MediaType;", "a", "(Ljava/lang/String;)Lokhttp3/MediaType;", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.MediaType$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11199a {
        private C11199a() {
        }

        public /* synthetic */ C11199a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MediaType m8837a(String toMediaType) {
            boolean m13758H;
            boolean m13755s;
            C9612q.m13917h(toMediaType, "$this$toMediaType");
            Matcher matcher = MediaType.f29319e.matcher(toMediaType);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C9612q.m13918g(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C9612q.m13918g(locale, "Locale.US");
                if (group != null) {
                    String lowerCase = group.toLowerCase(locale);
                    C9612q.m13918g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String group2 = matcher.group(2);
                    C9612q.m13918g(group2, "typeSubtype.group(2)");
                    C9612q.m13918g(locale, "Locale.US");
                    if (group2 != null) {
                        String lowerCase2 = group2.toLowerCase(locale);
                        C9612q.m13918g(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        ArrayList arrayList = new ArrayList();
                        Matcher matcher2 = MediaType.f29320f.matcher(toMediaType);
                        int end = matcher.end();
                        while (end < toMediaType.length()) {
                            matcher2.region(end, toMediaType.length());
                            if (matcher2.lookingAt()) {
                                String group3 = matcher2.group(1);
                                if (group3 == null) {
                                    end = matcher2.end();
                                } else {
                                    String group4 = matcher2.group(2);
                                    if (group4 == null) {
                                        group4 = matcher2.group(3);
                                    } else {
                                        m13758H = C9653o.m13758H(group4, "'", false, 2, null);
                                        if (m13758H) {
                                            m13755s = C9653o.m13755s(group4, "'", false, 2, null);
                                            if (m13755s && group4.length() > 2) {
                                                group4 = group4.substring(1, group4.length() - 1);
                                                C9612q.m13918g(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            }
                                        }
                                    }
                                    arrayList.add(group3);
                                    arrayList.add(group4);
                                    end = matcher2.end();
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Parameter is not formatted correctly: \"");
                                String substring = toMediaType.substring(end);
                                C9612q.m13918g(substring, "(this as java.lang.String).substring(startIndex)");
                                sb2.append(substring);
                                sb2.append("\" for: \"");
                                sb2.append(toMediaType);
                                sb2.append('\"');
                                throw new IllegalArgumentException(sb2.toString().toString());
                            }
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        if (array != null) {
                            return new MediaType(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + '\"').toString());
        }

        /* renamed from: b */
        public final MediaType m8836b(String toMediaTypeOrNull) {
            C9612q.m13917h(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return m8837a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.f29322a = str;
        this.f29323b = str2;
        this.f29324c = str3;
        this.f29325d = strArr;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m8841d(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.m8842c(charset);
    }

    /* renamed from: f */
    public static final MediaType m8839f(String str) {
        return f29321g.m8836b(str);
    }

    /* renamed from: c */
    public final Charset m8842c(Charset charset) {
        String m8840e = m8840e("charset");
        if (m8840e != null) {
            try {
                return Charset.forName(m8840e);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    /* JADX WARN: Incorrect condition in loop: B:28:0x002c */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m8840e(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String[] r0 = r5.f29325d
            kotlin.ranges.IntRange r0 = kotlin.collections.C9533b.m14331F(r0)
            r1 = 2
            kotlin.ranges.a r0 = gg.C6757h.m21935o(r0, r1)
            int r1 = r0.m13890a()
            int r2 = r0.m13889e()
            int r0 = r0.m13888h()
            if (r0 < 0) goto L21
            if (r1 > r2) goto L38
            goto L23
        L21:
            if (r1 < r2) goto L38
        L23:
            java.lang.String[] r3 = r5.f29325d
            r3 = r3[r1]
            r4 = 1
            boolean r3 = kotlin.text.C9642f.m13793t(r3, r6, r4)
            if (r3 == 0) goto L34
            java.lang.String[] r6 = r5.f29325d
            int r1 = r1 + r4
            r6 = r6[r1]
            return r6
        L34:
            if (r1 == r2) goto L38
            int r1 = r1 + r0
            goto L23
        L38:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MediaType.m8840e(java.lang.String):java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && C9612q.m13922c(((MediaType) obj).f29322a, this.f29322a);
    }

    /* renamed from: g */
    public final String m8838g() {
        return this.f29323b;
    }

    public int hashCode() {
        return this.f29322a.hashCode();
    }

    public String toString() {
        return this.f29322a;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
