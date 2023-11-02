package kotlin.text;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9543h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m14357d2 = {"", "marginPrefix", "g", "newIndent", "e", "f", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9644h extends C9643g {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9645a extends AbstractC9614s implements Function1<String, String> {

        /* renamed from: j */
        public static final C9645a f25390j = new C9645a();

        C9645a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String line) {
            C9612q.m13917h(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.text.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9646b extends AbstractC9614s implements Function1<String, String> {

        /* renamed from: j */
        final /* synthetic */ String f25391j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9646b(String str) {
            super(1);
            this.f25391j = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(String line) {
            C9612q.m13917h(line, "line");
            return this.f25391j + line;
        }
    }

    /* renamed from: b */
    private static final Function1<String, String> m13782b(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C9645a.f25390j;
        }
        return new C9646b(str);
    }

    /* renamed from: c */
    private static final int m13781c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!C9636a.m13857c(str.charAt(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    /* renamed from: d */
    public static final String m13780d(String str, String newIndent) {
        int i;
        String invoke;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(newIndent, "newIndent");
        List<String> m13700h0 = C9654p.m13700h0(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : m13700h0) {
            if (!C9642f.m13789w((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C9543h.m14124t(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(Integer.valueOf(m13781c(str2)));
        }
        Integer num = (Integer) C9543h.m14142j0(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (newIndent.length() * m13700h0.size());
        Function1<String, String> m13782b = m13782b(newIndent);
        int m14141k = C9543h.m14141k(m13700h0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m13700h0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9543h.m14126s();
            }
            String str3 = (String) obj2;
            if ((i2 == 0 || i2 == m14141k) && C9642f.m13789w(str3)) {
                str3 = null;
            } else {
                String m13818W0 = C9642f.m13818W0(str3, i);
                if (m13818W0 != null && (invoke = m13782b.invoke(m13818W0)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        String sb2 = ((StringBuilder) C9543h.m14155b0(arrayList3, new StringBuilder(length), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 124, null)).toString();
        C9612q.m13918g(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static final String m13779e(String str, String newIndent, String marginPrefix) {
        int i;
        String invoke;
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(newIndent, "newIndent");
        C9612q.m13917h(marginPrefix, "marginPrefix");
        if (!C9642f.m13789w(marginPrefix)) {
            List<String> m13700h0 = C9654p.m13700h0(str);
            int length = str.length() + (newIndent.length() * m13700h0.size());
            Function1<String, String> m13782b = m13782b(newIndent);
            int m14141k = C9543h.m14141k(m13700h0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : m13700h0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C9543h.m14126s();
                }
                String str2 = (String) obj;
                String str3 = null;
                if ((i2 == 0 || i2 == m14141k) && C9642f.m13789w(str2)) {
                    str2 = null;
                } else {
                    int length2 = str2.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            if (!C9636a.m13857c(str2.charAt(i4))) {
                                i = i4;
                                break;
                            }
                            i4++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C9642f.m13836G(str2, marginPrefix, i, false, 4, null)) {
                            C9612q.m13919f(str2, "null cannot be cast to non-null type java.lang.String");
                            str3 = str2.substring(i5 + marginPrefix.length());
                            C9612q.m13918g(str3, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str3 != null && (invoke = m13782b.invoke(str3)) != null) {
                        str2 = invoke;
                    }
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                i2 = i3;
            }
            String sb2 = ((StringBuilder) C9543h.m14155b0(arrayList, new StringBuilder(length), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 124, null)).toString();
            C9612q.m13918g(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m13778f(String str) {
        C9612q.m13917h(str, "<this>");
        return m13780d(str, "");
    }

    /* renamed from: g */
    public static final String m13777g(String str, String marginPrefix) {
        C9612q.m13917h(str, "<this>");
        C9612q.m13917h(marginPrefix, "marginPrefix");
        return m13779e(str, "", marginPrefix);
    }

    /* renamed from: h */
    public static /* synthetic */ String m13776h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m13777g(str, str2);
    }
}
