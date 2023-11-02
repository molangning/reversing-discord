package kotlin.text;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9536e;
import kotlin.collections.C9538f;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.C9627a;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import p304qf.AbstractC11883p;
import pf.C11591x;
import si.C12552o;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0007\u001a\"\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0000\u001a\u0012\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000\u001a\u0012\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000\u001a\u001a\u0010\u001d\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000\u001a\u0012\u0010\u001e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0000\u001a4\u0010$\u001a\u00020\"*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0000\u001a\u001c\u0010&\u001a\u00020\"*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001c\u0010'\u001a\u00020\"*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001c\u0010(\u001a\u00020\"*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001c\u0010)\u001a\u00020\"*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u0010,\u001a\u00020\u0002*\u00020\u00002\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u0010-\u001a\u00020\u0002*\u00020\u00002\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a=\u0010/\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b/\u00100\u001aG\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u000103*\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"H\u0002¢\u0006\u0004\b4\u00105\u001a&\u00106\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u00108\u001a\u00020\u0002*\u00020\u00002\u0006\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u00109\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a&\u0010:\u001a\u00020\u0002*\u00020\u00002\u0006\u00107\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"\u001a\u001f\u0010;\u001a\u00020\"*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"H\u0086\u0002\u001a\u001f\u0010<\u001a\u00020\"*\u00020\u00002\u0006\u0010%\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"H\u0086\u0002\u001a?\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0?*\u00020\u00002\u0006\u0010=\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\b@\u0010A\u001aG\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0?*\u00020\u00002\u000e\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070B2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010D\u001a\u0010\u0010F\u001a\u00020E2\u0006\u0010>\u001a\u00020\u0002H\u0000\u001a?\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070?*\u00020\u00002\u0012\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070B\"\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002¢\u0006\u0004\bG\u0010H\u001a?\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00002\u0012\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070B\"\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010K\u001a0\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00002\n\u0010=\u001a\u00020*\"\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\u0002\u001a1\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\bM\u0010N\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070?*\u00020\u0000\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u0000\"\u0015\u0010S\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0015\u0010V\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, m14357d2 = {"", "V0", "", "length", "", "padChar", "i0", "", "j0", "Lkotlin/ranges/IntRange;", "range", "G0", "delimiter", "missingDelimiterValue", "N0", "O0", "H0", "I0", "R0", "S0", "L0", "startIndex", "endIndex", "replacement", "t0", "prefix", "p0", "suffix", "q0", "s0", "r0", "thisOffset", "other", "otherOffset", "", "ignoreCase", "o0", "char", "C0", "N", "D0", "O", "", "chars", "a0", "f0", "last", "W", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "R", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "U", "string", "V", "b0", "c0", "K", "J", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "k0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "l0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "u0", "A0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "", "w0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "v0", "x0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "g0", "h0", "S", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "T", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9654p extends C9653o {

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9655a extends AbstractC9614s implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: j */
        final /* synthetic */ char[] f25392j;

        /* renamed from: k */
        final /* synthetic */ boolean f25393k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9655a(char[] cArr, boolean z) {
            super(2);
            this.f25392j = cArr;
            this.f25393k = z;
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> m13681a(CharSequence $receiver, int i) {
            C9612q.m13917h($receiver, "$this$$receiver");
            int m13707a0 = C9654p.m13707a0($receiver, this.f25392j, i, this.f25393k);
            if (m13707a0 < 0) {
                return null;
            }
            return C11591x.m7577a(Integer.valueOf(m13707a0), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m13681a(charSequence, num.intValue());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9656b extends AbstractC9614s implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: j */
        final /* synthetic */ List<String> f25394j;

        /* renamed from: k */
        final /* synthetic */ boolean f25395k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9656b(List<String> list, boolean z) {
            super(2);
            this.f25394j = list;
            this.f25395k = z;
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> m13680a(CharSequence $receiver, int i) {
            C9612q.m13917h($receiver, "$this$$receiver");
            Pair m13721R = C9654p.m13721R($receiver, this.f25394j, i, this.f25395k, false);
            if (m13721R != null) {
                return C11591x.m7577a(m13721R.m14349c(), Integer.valueOf(((String) m13721R.m14348d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m13680a(charSequence, num.intValue());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lkotlin/ranges/IntRange;", "it", "", "a", "(Lkotlin/ranges/IntRange;)Ljava/lang/String;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9657c extends AbstractC9614s implements Function1<IntRange, String> {

        /* renamed from: j */
        final /* synthetic */ CharSequence f25396j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9657c(CharSequence charSequence) {
            super(1);
            this.f25396j = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(IntRange it) {
            C9612q.m13917h(it, "it");
            return C9654p.m13741G0(this.f25396j, it);
        }
    }

    /* renamed from: A0 */
    public static final Sequence<String> m13747A0(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        Sequence<String> m4851y;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(delimiters, "delimiters");
        m4851y = C12552o.m4851y(m13694n0(charSequence, delimiters, 0, z, i, 2, null), new C9657c(charSequence));
        return m4851y;
    }

    /* renamed from: B0 */
    public static /* synthetic */ Sequence m13746B0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m13747A0(charSequence, strArr, z, i);
    }

    /* renamed from: C0 */
    public static final boolean m13745C0(CharSequence charSequence, char c, boolean z) {
        C9612q.m13917h(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C9638c.m13849f(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: D0 */
    public static final boolean m13744D0(CharSequence charSequence, CharSequence prefix, boolean z) {
        boolean m13758H;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(prefix, "prefix");
        if (!z && (charSequence instanceof String) && (prefix instanceof String)) {
            m13758H = C9653o.m13758H((String) charSequence, (String) prefix, false, 2, null);
            return m13758H;
        }
        return m13693o0(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    /* renamed from: E0 */
    public static /* synthetic */ boolean m13743E0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13745C0(charSequence, c, z);
    }

    /* renamed from: F0 */
    public static /* synthetic */ boolean m13742F0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13744D0(charSequence, charSequence2, z);
    }

    /* renamed from: G0 */
    public static final String m13741G0(CharSequence charSequence, IntRange range) {
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(range, "range");
        return charSequence.subSequence(range.m13892p().intValue(), range.m13893o().intValue() + 1).toString();
    }

    /* renamed from: H0 */
    public static final String m13740H0(String str, char c, String missingDelimiterValue) {
        int m13709Y;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13709Y = m13709Y(str, c, 0, false, 6, null);
        if (m13709Y != -1) {
            String substring = str.substring(m13709Y + 1, str.length());
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: I0 */
    public static String m13738I0(String str, String delimiter, String missingDelimiterValue) {
        int m13708Z;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(delimiter, "delimiter");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13708Z = m13708Z(str, delimiter, 0, false, 6, null);
        if (m13708Z != -1) {
            String substring = str.substring(m13708Z + delimiter.length(), str.length());
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: J */
    public static final boolean m13737J(CharSequence charSequence, char c, boolean z) {
        int m13709Y;
        C9612q.m13917h(charSequence, "<this>");
        m13709Y = m13709Y(charSequence, c, 0, z, 2, null);
        if (m13709Y >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J0 */
    public static /* synthetic */ String m13736J0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m13740H0(str, c, str2);
    }

    /* renamed from: K */
    public static final boolean m13735K(CharSequence charSequence, CharSequence other, boolean z) {
        int m13708Z;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(other, "other");
        if (other instanceof String) {
            m13708Z = m13708Z(charSequence, (String) other, 0, z, 2, null);
            if (m13708Z >= 0) {
                return true;
            }
        } else if (m13710X(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public static /* synthetic */ String m13734K0(String str, String str2, String str3, int i, Object obj) {
        String m13738I0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        m13738I0 = m13738I0(str, str2, str3);
        return m13738I0;
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m13733L(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13737J(charSequence, c, z);
    }

    /* renamed from: L0 */
    public static String m13732L0(String str, char c, String missingDelimiterValue) {
        int m13704d0;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13704d0 = m13704d0(str, c, 0, false, 6, null);
        if (m13704d0 != -1) {
            String substring = str.substring(m13704d0 + 1, str.length());
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m13731M(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13735K(charSequence, charSequence2, z);
    }

    /* renamed from: M0 */
    public static /* synthetic */ String m13730M0(String str, char c, String str2, int i, Object obj) {
        String m13732L0;
        if ((i & 2) != 0) {
            str2 = str;
        }
        m13732L0 = m13732L0(str, c, str2);
        return m13732L0;
    }

    /* renamed from: N */
    public static final boolean m13729N(CharSequence charSequence, char c, boolean z) {
        int m13717T;
        C9612q.m13917h(charSequence, "<this>");
        if (charSequence.length() > 0) {
            m13717T = m13717T(charSequence);
            if (C9638c.m13849f(charSequence.charAt(m13717T), c, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N0 */
    public static final String m13728N0(String str, char c, String missingDelimiterValue) {
        int m13709Y;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13709Y = m13709Y(str, c, 0, false, 6, null);
        if (m13709Y != -1) {
            String substring = str.substring(0, m13709Y);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: O */
    public static final boolean m13727O(CharSequence charSequence, CharSequence suffix, boolean z) {
        boolean m13755s;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(suffix, "suffix");
        if (!z && (charSequence instanceof String) && (suffix instanceof String)) {
            m13755s = C9653o.m13755s((String) charSequence, (String) suffix, false, 2, null);
            return m13755s;
        }
        return m13693o0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
    }

    /* renamed from: O0 */
    public static final String m13726O0(String str, String delimiter, String missingDelimiterValue) {
        int m13708Z;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(delimiter, "delimiter");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13708Z = m13708Z(str, delimiter, 0, false, 6, null);
        if (m13708Z != -1) {
            String substring = str.substring(0, m13708Z);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: P */
    public static /* synthetic */ boolean m13725P(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13729N(charSequence, c, z);
    }

    /* renamed from: P0 */
    public static /* synthetic */ String m13724P0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m13728N0(str, c, str2);
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m13723Q(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m13727O(charSequence, charSequence2, z);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ String m13722Q0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m13726O0(str, str2, str3);
    }

    /* renamed from: R */
    public static final Pair<Integer, String> m13721R(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int m13717T;
        int m21926g;
        C9627a m21921l;
        Object obj;
        Object obj2;
        boolean m13750x;
        int m21930c;
        Object m14034p0;
        int m13703e0;
        if (!z && collection.size() == 1) {
            m14034p0 = C9553r.m14034p0(collection);
            String str = (String) m14034p0;
            if (!z2) {
                m13703e0 = m13708Z(charSequence, str, i, false, 4, null);
            } else {
                m13703e0 = m13703e0(charSequence, str, i, false, 4, null);
            }
            if (m13703e0 < 0) {
                return null;
            }
            return C11591x.m7577a(Integer.valueOf(m13703e0), str);
        }
        if (!z2) {
            m21930c = C6759j.m21930c(i, 0);
            m21921l = new IntRange(m21930c, charSequence.length());
        } else {
            m13717T = m13717T(charSequence);
            m21926g = C6759j.m21926g(i, m13717T);
            m21921l = C6759j.m21921l(m21926g, 0);
        }
        if (charSequence instanceof String) {
            int m13890a = m21921l.m13890a();
            int m13889e = m21921l.m13889e();
            int m13888h = m21921l.m13888h();
            if ((m13888h > 0 && m13890a <= m13889e) || (m13888h < 0 && m13889e <= m13890a)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            m13750x = C9653o.m13750x(str2, 0, (String) charSequence, m13890a, str2.length(), z);
                            if (m13750x) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return C11591x.m7577a(Integer.valueOf(m13890a), str3);
                    }
                    if (m13890a == m13889e) {
                        break;
                    }
                    m13890a += m13888h;
                }
            }
        } else {
            int m13890a2 = m21921l.m13890a();
            int m13889e2 = m21921l.m13889e();
            int m13888h2 = m21921l.m13888h();
            if ((m13888h2 > 0 && m13890a2 <= m13889e2) || (m13888h2 < 0 && m13889e2 <= m13890a2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (m13693o0(str4, 0, charSequence, m13890a2, str4.length(), z)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return C11591x.m7577a(Integer.valueOf(m13890a2), str5);
                    }
                    if (m13890a2 == m13889e2) {
                        break;
                    }
                    m13890a2 += m13888h2;
                }
            }
        }
        return null;
    }

    /* renamed from: R0 */
    public static final String m13720R0(String str, char c, String missingDelimiterValue) {
        int m13704d0;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13704d0 = m13704d0(str, c, 0, false, 6, null);
        if (m13704d0 != -1) {
            String substring = str.substring(0, m13704d0);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: S */
    public static IntRange m13719S(CharSequence charSequence) {
        C9612q.m13917h(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    /* renamed from: S0 */
    public static String m13718S0(String str, String delimiter, String missingDelimiterValue) {
        int m13703e0;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(delimiter, "delimiter");
        C9612q.m13917h(missingDelimiterValue, "missingDelimiterValue");
        m13703e0 = m13703e0(str, delimiter, 0, false, 6, null);
        if (m13703e0 != -1) {
            String substring = str.substring(0, m13703e0);
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    /* renamed from: T */
    public static int m13717T(CharSequence charSequence) {
        C9612q.m13917h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: T0 */
    public static /* synthetic */ String m13716T0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m13720R0(str, c, str2);
    }

    /* renamed from: U */
    public static final int m13715U(CharSequence charSequence, char c, int i, boolean z) {
        C9612q.m13917h(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m13707a0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: U0 */
    public static /* synthetic */ String m13714U0(String str, String str2, String str3, int i, Object obj) {
        String m13718S0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        m13718S0 = m13718S0(str, str2, str3);
        return m13718S0;
    }

    /* renamed from: V */
    public static final int m13713V(CharSequence charSequence, String string, int i, boolean z) {
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        return m13710X(charSequence, string, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: V0 */
    public static CharSequence m13712V0(CharSequence charSequence) {
        int i;
        boolean m13852c;
        C9612q.m13917h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            m13852c = C9637b.m13852c(charSequence.charAt(i));
            if (!z) {
                if (!m13852c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!m13852c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: W */
    private static final int m13711W(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int m13717T;
        int m21926g;
        int m21930c;
        C9627a m21921l;
        boolean m13750x;
        int m21930c2;
        int m21926g2;
        if (!z2) {
            m21930c2 = C6759j.m21930c(i, 0);
            m21926g2 = C6759j.m21926g(i2, charSequence.length());
            m21921l = new IntRange(m21930c2, m21926g2);
        } else {
            m13717T = m13717T(charSequence);
            m21926g = C6759j.m21926g(i, m13717T);
            m21930c = C6759j.m21930c(i2, 0);
            m21921l = C6759j.m21921l(m21926g, m21930c);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m13890a = m21921l.m13890a();
            int m13889e = m21921l.m13889e();
            int m13888h = m21921l.m13888h();
            if ((m13888h <= 0 || m13890a > m13889e) && (m13888h >= 0 || m13889e > m13890a)) {
                return -1;
            }
            while (true) {
                m13750x = C9653o.m13750x((String) charSequence2, 0, (String) charSequence, m13890a, charSequence2.length(), z);
                if (m13750x) {
                    return m13890a;
                }
                if (m13890a != m13889e) {
                    m13890a += m13888h;
                } else {
                    return -1;
                }
            }
        } else {
            int m13890a2 = m21921l.m13890a();
            int m13889e2 = m21921l.m13889e();
            int m13888h2 = m21921l.m13888h();
            if ((m13888h2 > 0 && m13890a2 <= m13889e2) || (m13888h2 < 0 && m13889e2 <= m13890a2)) {
                while (!m13693o0(charSequence2, 0, charSequence, m13890a2, charSequence2.length(), z)) {
                    if (m13890a2 != m13889e2) {
                        m13890a2 += m13888h2;
                    } else {
                        return -1;
                    }
                }
                return m13890a2;
            }
            return -1;
        }
    }

    /* renamed from: X */
    static /* synthetic */ int m13710X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m13711W(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: Y */
    public static /* synthetic */ int m13709Y(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13715U(charSequence, c, i, z);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m13708Z(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13713V(charSequence, str, i, z);
    }

    /* renamed from: a0 */
    public static final int m13707a0(CharSequence charSequence, char[] chars, int i, boolean z) {
        int m21930c;
        int m13717T;
        boolean z2;
        char m14213g0;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            m14213g0 = C9538f.m14213g0(chars);
            return ((String) charSequence).indexOf(m14213g0, i);
        }
        m21930c = C6759j.m21930c(i, 0);
        m13717T = m13717T(charSequence);
        AbstractC11883p it = new IntRange(m21930c, m13717T).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (C9638c.m13849f(chars[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    continue;
                    break;
                }
            }
            if (z2) {
                return nextInt;
            }
        }
        return -1;
    }

    /* renamed from: b0 */
    public static final int m13706b0(CharSequence charSequence, char c, int i, boolean z) {
        C9612q.m13917h(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m13702f0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: c0 */
    public static final int m13705c0(CharSequence charSequence, String string, int i, boolean z) {
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i);
        }
        return m13711W(charSequence, string, i, 0, z, true);
    }

    /* renamed from: d0 */
    public static /* synthetic */ int m13704d0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m13717T(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13706b0(charSequence, c, i, z);
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m13703e0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m13717T(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m13705c0(charSequence, str, i, z);
    }

    /* renamed from: f0 */
    public static final int m13702f0(CharSequence charSequence, char[] chars, int i, boolean z) {
        int m13717T;
        int m21926g;
        char m14213g0;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            m14213g0 = C9538f.m14213g0(chars);
            return ((String) charSequence).lastIndexOf(m14213g0, i);
        }
        m13717T = m13717T(charSequence);
        for (m21926g = C6759j.m21926g(i, m13717T); -1 < m21926g; m21926g--) {
            char charAt = charSequence.charAt(m21926g);
            int length = chars.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C9638c.m13849f(chars[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m21926g;
            }
        }
        return -1;
    }

    /* renamed from: g0 */
    public static final Sequence<String> m13701g0(CharSequence charSequence) {
        C9612q.m13917h(charSequence, "<this>");
        return m13746B0(charSequence, new String[]{"\r\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r"}, false, 0, 6, null);
    }

    /* renamed from: h0 */
    public static final List<String> m13700h0(CharSequence charSequence) {
        List<String> m4867E;
        C9612q.m13917h(charSequence, "<this>");
        m4867E = C12552o.m4867E(m13701g0(charSequence));
        return m4867E;
    }

    /* renamed from: i0 */
    public static final CharSequence m13699i0(CharSequence charSequence, int i, char c) {
        C9612q.m13917h(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i);
            AbstractC11883p it = new IntRange(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb2.append(c);
            }
            sb2.append(charSequence);
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
    }

    /* renamed from: j0 */
    public static String m13698j0(String str, int i, char c) {
        C9612q.m13917h(str, "<this>");
        return m13699i0(str, i, c).toString();
    }

    /* renamed from: k0 */
    private static final Sequence<IntRange> m13697k0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m13687u0(i2);
        return new C9639d(charSequence, i, i2, new C9655a(cArr, z));
    }

    /* renamed from: l0 */
    private static final Sequence<IntRange> m13696l0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List m14274d;
        m13687u0(i2);
        m14274d = C9536e.m14274d(strArr);
        return new C9639d(charSequence, i, i2, new C9656b(m14274d, z));
    }

    /* renamed from: m0 */
    static /* synthetic */ Sequence m13695m0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m13697k0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: n0 */
    static /* synthetic */ Sequence m13694n0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m13696l0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: o0 */
    public static final boolean m13693o0(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C9638c.m13849f(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p0 */
    public static String m13692p0(String str, CharSequence prefix) {
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(prefix, "prefix");
        if (m13742F0(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            C9612q.m13918g(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: q0 */
    public static String m13691q0(String str, CharSequence suffix) {
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(suffix, "suffix");
        if (m13723Q(str, suffix, false, 2, null)) {
            String substring = str.substring(0, str.length() - suffix.length());
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: r0 */
    public static String m13690r0(String str, CharSequence delimiter) {
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(delimiter, "delimiter");
        return m13689s0(str, delimiter, delimiter);
    }

    /* renamed from: s0 */
    public static final String m13689s0(String str, CharSequence prefix, CharSequence suffix) {
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(suffix, "suffix");
        if (str.length() >= prefix.length() + suffix.length() && m13742F0(str, prefix, false, 2, null) && m13723Q(str, suffix, false, 2, null)) {
            String substring = str.substring(prefix.length(), str.length() - suffix.length());
            C9612q.m13918g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: t0 */
    public static CharSequence m13688t0(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(replacement, "replacement");
        if (i2 >= i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i);
            C9612q.m13918g(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(replacement);
            sb2.append(charSequence, i2, charSequence.length());
            C9612q.m13918g(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: u0 */
    public static final void m13687u0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    /* renamed from: v0 */
    public static final List<String> m13686v0(CharSequence charSequence, char[] delimiters, boolean z, int i) {
        Iterable<IntRange> m4864l;
        int m14093t;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m13684x0(charSequence, String.valueOf(delimiters[0]), z, i);
        }
        m4864l = C12552o.m4864l(m13695m0(charSequence, delimiters, 0, z, i, 2, null));
        m14093t = C9546k.m14093t(m4864l, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (IntRange intRange : m4864l) {
            arrayList.add(m13741G0(charSequence, intRange));
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public static final List<String> m13685w0(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        Iterable<IntRange> m4864l;
        int m14093t;
        C9612q.m13917h(charSequence, "<this>");
        C9612q.m13917h(delimiters, "delimiters");
        boolean z2 = true;
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m13684x0(charSequence, str, z, i);
            }
        }
        m4864l = C12552o.m4864l(m13694n0(charSequence, delimiters, 0, z, i, 2, null));
        m14093t = C9546k.m14093t(m4864l, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (IntRange intRange : m4864l) {
            arrayList.add(m13741G0(charSequence, intRange));
        }
        return arrayList;
    }

    /* renamed from: x0 */
    private static final List<String> m13684x0(CharSequence charSequence, String str, boolean z, int i) {
        List<String> m14109d;
        boolean z2;
        m13687u0(i);
        int i2 = 0;
        int m13713V = m13713V(charSequence, str, 0, z);
        if (m13713V != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2) {
                i3 = C6759j.m21926g(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, m13713V).toString());
                i2 = str.length() + m13713V;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                m13713V = m13713V(charSequence, str, i2, z);
            } while (m13713V != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        m14109d = C9544i.m14109d(charSequence.toString());
        return m14109d;
    }

    /* renamed from: y0 */
    public static /* synthetic */ List m13683y0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m13686v0(charSequence, cArr, z, i);
    }

    /* renamed from: z0 */
    public static /* synthetic */ List m13682z0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m13685w0(charSequence, strArr, z, i);
    }
}