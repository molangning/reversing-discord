package p355ti;

import gg.C6759j;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¨\u0006\r"}, m14357d2 = {"Ljava/util/regex/Matcher;", "", "from", "", "input", "Lkotlin/text/MatchResult;", "e", "f", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "g", "groupIndex", "h", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: ti.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12792e {
    /* renamed from: a */
    public static final /* synthetic */ MatchResult m3913a(Matcher matcher, int i, CharSequence charSequence) {
        return m3909e(matcher, i, charSequence);
    }

    /* renamed from: b */
    public static final /* synthetic */ MatchResult m3912b(Matcher matcher, CharSequence charSequence) {
        return m3908f(matcher, charSequence);
    }

    /* renamed from: e */
    public static final MatchResult m3909e(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C12788d(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: f */
    public static final MatchResult m3908f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C12788d(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: g */
    public static final IntRange m3907g(java.util.regex.MatchResult matchResult) {
        IntRange m21916q;
        m21916q = C6759j.m21916q(matchResult.start(), matchResult.end());
        return m21916q;
    }

    /* renamed from: h */
    public static final IntRange m3906h(java.util.regex.MatchResult matchResult, int i) {
        IntRange m21916q;
        m21916q = C6759j.m21916q(matchResult.start(i), matchResult.end(i));
        return m21916q;
    }
}
