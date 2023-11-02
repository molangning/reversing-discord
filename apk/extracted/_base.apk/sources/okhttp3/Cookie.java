package okhttp3;

import co.discord.media_engine.C2689b;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.Regex;
import kotlinx.serialization.json.C9977m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p431xj.C13835c;
import sj.C12560a;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0002\f\u0011BQ\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001d\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010#\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006'"}, m14357d2 = {"Lokhttp3/Cookie;", "", "other", "", "equals", "", "hashCode", "", "toString", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "b", "g", "value", "", "c", "J", "expiresAt", "()J", "d", "domain", "path", "Z", "secure", "()Z", "httpOnly", "h", "persistent", "i", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "n", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class Cookie {

    /* renamed from: a */
    private final String f29268a;

    /* renamed from: b */
    private final String f29269b;

    /* renamed from: c */
    private final long f29270c;

    /* renamed from: d */
    private final String f29271d;

    /* renamed from: e */
    private final String f29272e;

    /* renamed from: f */
    private final boolean f29273f;

    /* renamed from: g */
    private final boolean f29274g;

    /* renamed from: h */
    private final boolean f29275h;

    /* renamed from: i */
    private final boolean f29276i;

    /* renamed from: n */
    public static final C11191b f29267n = new C11191b(null);

    /* renamed from: j */
    private static final Pattern f29263j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f29264k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f29265l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f29266m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, m14357d2 = {"Lokhttp3/Cookie$a;", "", "", "domain", "", "hostOnly", "c", ZeroconfModule.KEY_SERVICE_NAME, "d", "value", "e", "b", "Lokhttp3/Cookie;", "a", "Ljava/lang/String;", "", "J", "expiresAt", "path", "f", "Z", "secure", "g", "httpOnly", "h", "persistent", "i", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.Cookie$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11190a {

        /* renamed from: a */
        private String f29277a;

        /* renamed from: b */
        private String f29278b;

        /* renamed from: d */
        private String f29280d;

        /* renamed from: f */
        private boolean f29282f;

        /* renamed from: g */
        private boolean f29283g;

        /* renamed from: h */
        private boolean f29284h;

        /* renamed from: i */
        private boolean f29285i;

        /* renamed from: c */
        private long f29279c = 253402300799999L;

        /* renamed from: e */
        private String f29281e = "/";

        /* renamed from: c */
        private final C11190a m8955c(String str, boolean z) {
            String m4837e = C12560a.m4837e(str);
            if (m4837e != null) {
                this.f29280d = m4837e;
                this.f29285i = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        /* renamed from: a */
        public final Cookie m8957a() {
            String str = this.f29277a;
            if (str != null) {
                String str2 = this.f29278b;
                if (str2 != null) {
                    long j = this.f29279c;
                    String str3 = this.f29280d;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.f29281e, this.f29282f, this.f29283g, this.f29284h, this.f29285i, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        /* renamed from: b */
        public final C11190a m8956b(String domain) {
            C9612q.m13917h(domain, "domain");
            return m8955c(domain, false);
        }

        /* renamed from: d */
        public final C11190a m8954d(String name) {
            CharSequence m13712V0;
            C9612q.m13917h(name, "name");
            m13712V0 = C9654p.m13712V0(name);
            if (C9612q.m13922c(m13712V0.toString(), name)) {
                this.f29277a = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        /* renamed from: e */
        public final C11190a m8953e(String value) {
            CharSequence m13712V0;
            C9612q.m13917h(value, "value");
            m13712V0 = C9654p.m13712V0(value);
            if (C9612q.m13922c(m13712V0.toString(), value)) {
                this.f29278b = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }

    @Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, m14357d2 = {"Lokhttp3/Cookie$b;", "", "", "urlHost", "domain", "", "b", "s", "", "pos", "limit", "", "g", "input", "invert", "a", "h", "f", "Lokhttp3/HttpUrl;", "url", "setCookie", "Lokhttp3/Cookie;", "c", "currentTimeMillis", "d", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", "", "e", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.Cookie$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11191b {
        private C11191b() {
        }

        public /* synthetic */ C11191b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m8952a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: b */
        private final boolean m8951b(String str, String str2) {
            boolean m13755s;
            if (C9612q.m13922c(str, str2)) {
                return true;
            }
            m13755s = C9653o.m13755s(str, str2, false, 2, null);
            if (m13755s && str.charAt((str.length() - str2.length()) - 1) == '.' && !C12562c.m4805f(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        private final String m8947f(String str) {
            boolean m13755s;
            String m13692p0;
            m13755s = C9653o.m13755s(str, ".", false, 2, null);
            if (!m13755s) {
                m13692p0 = C9654p.m13692p0(str, ".");
                String m4837e = C12560a.m4837e(m13692p0);
                if (m4837e != null) {
                    return m4837e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: g */
        private final long m8946g(String str, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int m13708Z;
            int m8952a = m8952a(str, i, i2, false);
            Matcher matcher = Cookie.f29266m.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (m8952a < i2) {
                int m8952a2 = m8952a(str, m8952a + 1, i2, true);
                matcher.region(m8952a, m8952a2);
                if (i4 == -1 && matcher.usePattern(Cookie.f29266m).matches()) {
                    String group = matcher.group(1);
                    C9612q.m13918g(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C9612q.m13918g(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C9612q.m13918g(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.f29265l).matches()) {
                    String group4 = matcher.group(1);
                    C9612q.m13918g(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(Cookie.f29264k).matches()) {
                    String group5 = matcher.group(1);
                    C9612q.m13918g(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C9612q.m13918g(locale, "Locale.US");
                    if (group5 != null) {
                        String lowerCase = group5.toLowerCase(locale);
                        C9612q.m13918g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = Cookie.f29264k.pattern();
                        C9612q.m13918g(pattern, "MONTH_PATTERN.pattern()");
                        m13708Z = C9654p.m13708Z(pattern, lowerCase, 0, false, 6, null);
                        i6 = m13708Z / 4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i3 == -1 && matcher.usePattern(Cookie.f29263j).matches()) {
                    String group6 = matcher.group(1);
                    C9612q.m13918g(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                m8952a = m8952a(str, m8952a2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i6 != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (1 <= i5 && 31 >= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (i4 >= 0 && 23 >= i4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            if (i7 >= 0 && 59 >= i7) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (i8 >= 0 && 59 >= i8) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C12562c.f32613f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: h */
        private final long m8945h(String str) {
            boolean m13758H;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new Regex("-?\\d+").m13868g(str)) {
                    m13758H = C9653o.m13758H(str, "-", false, 2, null);
                    if (m13758H) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* renamed from: c */
        public final Cookie m8950c(HttpUrl url, String setCookie) {
            C9612q.m13917h(url, "url");
            C9612q.m13917h(setCookie, "setCookie");
            return m8949d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
            if (r1 > 253402300799999L) goto L89;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie m8949d(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.C11191b.m8949d(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        /* renamed from: e */
        public final List<Cookie> m8948e(HttpUrl url, Headers headers) {
            List<Cookie> m14104i;
            C9612q.m13917h(url, "url");
            C9612q.m13917h(headers, "headers");
            List<String> m8923p = headers.m8923p("Set-Cookie");
            int size = m8923p.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie m8950c = m8950c(url, m8923p.get(i));
                if (m8950c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m8950c);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                C9612q.m13918g(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f29268a = str;
        this.f29269b = str2;
        this.f29270c = j;
        this.f29271d = str3;
        this.f29272e = str4;
        this.f29273f = z;
        this.f29274g = z2;
        this.f29275h = z3;
        this.f29276i = z4;
    }

    /* renamed from: e */
    public final String m8960e() {
        return this.f29268a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (C9612q.m13922c(cookie.f29268a, this.f29268a) && C9612q.m13922c(cookie.f29269b, this.f29269b) && cookie.f29270c == this.f29270c && C9612q.m13922c(cookie.f29271d, this.f29271d) && C9612q.m13922c(cookie.f29272e, this.f29272e) && cookie.f29273f == this.f29273f && cookie.f29274g == this.f29274g && cookie.f29275h == this.f29275h && cookie.f29276i == this.f29276i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m8959f(boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29268a);
        sb2.append('=');
        sb2.append(this.f29269b);
        if (this.f29275h) {
            if (this.f29270c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C13835c.m1438b(new Date(this.f29270c)));
            }
        }
        if (!this.f29276i) {
            sb2.append("; domain=");
            if (z) {
                sb2.append(".");
            }
            sb2.append(this.f29271d);
        }
        sb2.append("; path=");
        sb2.append(this.f29272e);
        if (this.f29273f) {
            sb2.append("; secure");
        }
        if (this.f29274g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "toString()");
        return sb3;
    }

    /* renamed from: g */
    public final String m8958g() {
        return this.f29269b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f29268a.hashCode()) * 31) + this.f29269b.hashCode()) * 31) + C2689b.m32716a(this.f29270c)) * 31) + this.f29271d.hashCode()) * 31) + this.f29272e.hashCode()) * 31) + C9977m.m12701a(this.f29273f)) * 31) + C9977m.m12701a(this.f29274g)) * 31) + C9977m.m12701a(this.f29275h)) * 31) + C9977m.m12701a(this.f29276i);
    }

    public String toString() {
        return m8959f(false);
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
