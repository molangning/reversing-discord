package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m14357d2 = {"", "marginPrefix", "g", "newIndent", "e", "f", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9644h extends C9643g {

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
        boolean m13852c;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                m13852c = C9637b.m13852c(str.charAt(i));
                if (!m13852c) {
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

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b9 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m13780d(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.C9612q.m13917h(r15, r0)
            java.util.List r0 = kotlin.text.C9654p.m13700h0(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.C9642f.m13789w(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C9543h.m14124t(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = m13781c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3f
        L57:
            java.lang.Comparable r1 = kotlin.collections.C9543h.m14142j0(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L65
            int r1 = r1.intValue()
            goto L66
        L65:
            r1 = r2
        L66:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            kotlin.jvm.functions.Function1 r15 = m13782b(r15)
            int r3 = kotlin.collections.C9543h.m14141k(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L85:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L96
            kotlin.collections.C9543h.m14126s()
        L96:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9c
            if (r2 != r3) goto La4
        L9c:
            boolean r2 = kotlin.text.C9642f.m13789w(r5)
            if (r2 == 0) goto La4
            r5 = 0
            goto Lb4
        La4:
            java.lang.String r2 = kotlin.text.C9642f.m13818W0(r5, r1)
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r15.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb3
            goto Lb4
        Lb3:
            r5 = r2
        Lb4:
            if (r5 == 0) goto Lb9
            r4.add(r5)
        Lb9:
            r2 = r6
            goto L85
        Lbb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.Appendable r14 = kotlin.collections.C9543h.m14155b0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.C9612q.m13918g(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C9644h.m13780d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b8 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m13779e(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C9644h.m13779e(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
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