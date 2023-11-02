package p355ti;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import p304qf.AbstractC11861a;
import p304qf.AbstractC11866c;
import si.C12552o;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001f¨\u0006#"}, m14357d2 = {"Lti/d;", "Lkotlin/text/MatchResult;", "next", "Ljava/util/regex/Matcher;", "a", "Ljava/util/regex/Matcher;", "matcher", "", "b", "Ljava/lang/CharSequence;", "input", "Lti/c;", "c", "Lti/c;", "d", "()Lti/c;", "groups", "", "", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ti.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12788d implements MatchResult {

    /* renamed from: a */
    private final Matcher f33152a;

    /* renamed from: b */
    private final CharSequence f33153b;

    /* renamed from: c */
    private final InterfaceC12787c f33154c;

    /* renamed from: d */
    private List<String> f33155d;

    @Metadata(m14358d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m14357d2 = {"ti/d$a", "Lqf/c;", "", "", "index", "h", "a", "()I", "size", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: ti.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12789a extends AbstractC11866c<String> {
        C12789a() {
        }

        @Override // p304qf.AbstractC11861a
        /* renamed from: a */
        public int mo3916a() {
            return C12788d.this.m3921f().groupCount() + 1;
        }

        @Override // p304qf.AbstractC11861a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m3920e((String) obj);
            }
            return false;
        }

        /* renamed from: e */
        public /* bridge */ boolean m3920e(String str) {
            return super.contains(str);
        }

        @Override // p304qf.AbstractC11866c, java.util.List
        /* renamed from: h */
        public String get(int i) {
            String group = C12788d.this.m3921f().group(i);
            return group == null ? "" : group;
        }

        /* renamed from: i */
        public /* bridge */ int m3918i(String str) {
            return super.indexOf(str);
        }

        @Override // p304qf.AbstractC11866c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m3918i((String) obj);
            }
            return -1;
        }

        /* renamed from: k */
        public /* bridge */ int m3917k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // p304qf.AbstractC11866c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m3917k((String) obj);
            }
            return -1;
        }
    }

    @Metadata(m14358d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H\u0096\u0002J\u0013\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0096\u0002R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m14357d2 = {"ti/d$b", "", "Lqf/a;", "Lti/b;", "", "isEmpty", "", "iterator", "", "index", "get", "a", "()I", "size", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: ti.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12790b extends AbstractC11861a<C12786b> implements InterfaceC12787c {

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "it", "Lti/b;", "a", "(I)Lti/b;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: ti.d$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        static final class C12791a extends AbstractC9614s implements Function1<Integer, C12786b> {
            C12791a() {
                super(1);
            }

            /* renamed from: a */
            public final C12786b m3914a(int i) {
                return C12790b.this.get(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C12786b invoke(Integer num) {
                return m3914a(num.intValue());
            }
        }

        C12790b() {
        }

        @Override // p304qf.AbstractC11861a
        /* renamed from: a */
        public int mo3916a() {
            return C12788d.this.m3921f().groupCount() + 1;
        }

        @Override // p304qf.AbstractC11861a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C12786b) {
                return m3915e((C12786b) obj);
            }
            return false;
        }

        /* renamed from: e */
        public /* bridge */ boolean m3915e(C12786b c12786b) {
            return super.contains(c12786b);
        }

        @Override // p355ti.InterfaceC12787c
        public C12786b get(int i) {
            IntRange m3906h;
            m3906h = C12792e.m3906h(C12788d.this.m3921f(), i);
            if (m3906h.m13892p().intValue() >= 0) {
                String group = C12788d.this.m3921f().group(i);
                C9612q.m13918g(group, "matchResult.group(index)");
                return new C12786b(group, m3906h);
            }
            return null;
        }

        @Override // p304qf.AbstractC11861a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<C12786b> iterator() {
            IntRange m14103j;
            Sequence m14066K;
            Sequence m4851y;
            m14103j = C9545j.m14103j(this);
            m14066K = C9553r.m14066K(m14103j);
            m4851y = C12552o.m4851y(m14066K, new C12791a());
            return m4851y.iterator();
        }
    }

    public C12788d(Matcher matcher, CharSequence input) {
        C9612q.m13917h(matcher, "matcher");
        C9612q.m13917h(input, "input");
        this.f33152a = matcher;
        this.f33153b = input;
        this.f33154c = new C12790b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final java.util.regex.MatchResult m3921f() {
        return this.f33152a;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: a */
    public MatchResult.C9632b mo3926a() {
        return MatchResult.C9631a.m13876a(this);
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: b */
    public List<String> mo3925b() {
        if (this.f33155d == null) {
            this.f33155d = new C12789a();
        }
        List<String> list = this.f33155d;
        C9612q.m13920e(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: c */
    public IntRange mo3924c() {
        IntRange m3907g;
        m3907g = C12792e.m3907g(m3921f());
        return m3907g;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: d */
    public InterfaceC12787c mo3923d() {
        return this.f33154c;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String group = m3921f().group();
        C9612q.m13918g(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int i;
        MatchResult m3909e;
        int end = m3921f().end();
        if (m3921f().end() == m3921f().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= this.f33153b.length()) {
            Matcher matcher = this.f33152a.pattern().matcher(this.f33153b);
            C9612q.m13918g(matcher, "matcher.pattern().matcher(input)");
            m3909e = C12792e.m3909e(matcher, i2, this.f33153b);
            return m3909e;
        }
        return null;
    }
}
