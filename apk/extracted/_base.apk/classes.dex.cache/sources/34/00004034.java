package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"", "", "k", "(Ljava/lang/String;)Ljava/lang/Double;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9651m extends C9650l {
    /* renamed from: k */
    public static Double m13771k(String str) {
        C9612q.m13917h(str, "<this>");
        try {
            if (!C9641e.f25389b.m13868g(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}