package kotlin.text;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import p355ti.C12792e;
import si.C12545m;

@Metadata(m14358d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u0011\b\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010 B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001d\u0010#J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ\"\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0012J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\bJ\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0006\u0010\u001a\u001a\u00020\u0019R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006$"}, m14357d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "input", "", "g", "a", "", "startIndex", "Lkotlin/text/MatchResult;", "b", "Lkotlin/sequences/Sequence;", "d", "f", "", "replacement", "h", "Lkotlin/Function1;", ViewProps.TRANSFORM, "i", "limit", "", "j", "toString", "Ljava/util/regex/Pattern;", "k", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "(Ljava/lang/String;)V", "Lti/f;", "option", "(Ljava/lang/String;Lti/f;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class Regex implements Serializable {

    /* renamed from: k */
    public static final C9633a f25372k = new C9633a(null);

    /* renamed from: j */
    private final Pattern f25373j;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, m14357d2 = {"Lkotlin/text/Regex$a;", "", "", "flags", "b", "", "literal", "c", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.Regex$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9633a {
        private C9633a() {
        }

        public /* synthetic */ C9633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int m13862b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        /* renamed from: c */
        public final String m13861c(String literal) {
            C9612q.m13917h(literal, "literal");
            String quote = Pattern.quote(literal);
            C9612q.m13918g(quote, "quote(literal)");
            return quote;
        }
    }

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Lkotlin/text/MatchResult;", "a", "()Lkotlin/text/MatchResult;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.Regex$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9634b extends AbstractC9614s implements Function0<MatchResult> {

        /* renamed from: k */
        final /* synthetic */ CharSequence f25375k;

        /* renamed from: l */
        final /* synthetic */ int f25376l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9634b(CharSequence charSequence, int i) {
            super(0);
            Regex.this = r1;
            this.f25375k = charSequence;
            this.f25376l = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MatchResult invoke() {
            return Regex.this.m13873b(this.f25375k, this.f25376l);
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlin.text.Regex$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C9635c extends C9609n implements Function1<MatchResult, MatchResult> {

        /* renamed from: j */
        public static final C9635c f25377j = new C9635c();

        C9635c() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final MatchResult invoke(MatchResult p0) {
            C9612q.m13917h(p0, "p0");
            return p0.next();
        }
    }

    public Regex(Pattern nativePattern) {
        C9612q.m13917h(nativePattern, "nativePattern");
        this.f25373j = nativePattern;
    }

    /* renamed from: c */
    public static /* synthetic */ MatchResult m13872c(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.m13873b(charSequence, i);
    }

    /* renamed from: e */
    public static /* synthetic */ Sequence m13870e(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.m13871d(charSequence, i);
    }

    /* renamed from: a */
    public final boolean m13874a(CharSequence input) {
        C9612q.m13917h(input, "input");
        return this.f25373j.matcher(input).find();
    }

    /* renamed from: b */
    public final MatchResult m13873b(CharSequence input, int i) {
        MatchResult m3909e;
        C9612q.m13917h(input, "input");
        Matcher matcher = this.f25373j.matcher(input);
        C9612q.m13918g(matcher, "nativePattern.matcher(input)");
        m3909e = C12792e.m3909e(matcher, i, input);
        return m3909e;
    }

    /* renamed from: d */
    public final Sequence<MatchResult> m13871d(CharSequence input, int i) {
        Sequence<MatchResult> m4874j;
        C9612q.m13917h(input, "input");
        if (i >= 0 && i <= input.length()) {
            m4874j = C12545m.m4874j(new C9634b(input, i), C9635c.f25377j);
            return m4874j;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + input.length());
    }

    /* renamed from: f */
    public final MatchResult m13869f(CharSequence input) {
        MatchResult m3908f;
        C9612q.m13917h(input, "input");
        Matcher matcher = this.f25373j.matcher(input);
        C9612q.m13918g(matcher, "nativePattern.matcher(input)");
        m3908f = C12792e.m3908f(matcher, input);
        return m3908f;
    }

    /* renamed from: g */
    public final boolean m13868g(CharSequence input) {
        C9612q.m13917h(input, "input");
        return this.f25373j.matcher(input).matches();
    }

    /* renamed from: h */
    public final String m13867h(CharSequence input, String replacement) {
        C9612q.m13917h(input, "input");
        C9612q.m13917h(replacement, "replacement");
        String replaceAll = this.f25373j.matcher(input).replaceAll(replacement);
        C9612q.m13918g(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: i */
    public final String m13866i(CharSequence input, Function1<? super MatchResult, ? extends CharSequence> transform) {
        C9612q.m13917h(input, "input");
        C9612q.m13917h(transform, "transform");
        int i = 0;
        MatchResult m13872c = m13872c(this, input, 0, 2, null);
        if (m13872c == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, i, m13872c.mo3924c().m13892p().intValue());
            sb2.append(transform.invoke(m13872c));
            i = m13872c.mo3924c().m13893o().intValue() + 1;
            m13872c = m13872c.next();
            if (i >= length) {
                break;
            }
        } while (m13872c != null);
        if (i < length) {
            sb2.append(input, i, length);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "sb.toString()");
        return sb3;
    }

    /* renamed from: j */
    public final List<String> m13865j(CharSequence input, int i) {
        List<String> m14109d;
        C9612q.m13917h(input, "input");
        C9654p.m13687u0(i);
        Matcher matcher = this.f25373j.matcher(input);
        if (i != 1 && matcher.find()) {
            int i2 = 10;
            if (i > 0) {
                i2 = C6759j.m21926g(i, 10);
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = i - 1;
            int i4 = 0;
            do {
                arrayList.add(input.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(input.subSequence(i4, input.length()).toString());
            return arrayList;
        }
        m14109d = C9544i.m14109d(input.toString());
        return m14109d;
    }

    /* renamed from: k */
    public final Pattern m13864k() {
        return this.f25373j;
    }

    public String toString() {
        String pattern = this.f25373j.toString();
        C9612q.m13918g(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C9612q.m13918g(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, p355ti.EnumC12793f r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.f25372k
            int r3 = r3.m3904b()
            int r3 = kotlin.text.Regex.C9633a.m13863a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.C9612q.m13918g(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, ti.f):void");
    }
}