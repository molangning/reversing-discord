package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "", "value", "j", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9650l extends C9649k {
    /* renamed from: j */
    public static StringBuilder m13772j(StringBuilder sb2, String... value) {
        C9612q.m13917h(sb2, "<this>");
        C9612q.m13917h(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }
}