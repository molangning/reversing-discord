package p470zi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u001f\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m14357d2 = {"Lzi/a;", "Lzi/g;", "", "", "j", "Ljava/util/List;", "a", "()Ljava/util/List;", "missingFields", "message", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14270a extends C14278g {

    /* renamed from: j */
    private final List<String> f36677j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14270a(List<String> missingFields, String str, Throwable th2) {
        super(str, th2);
        C9612q.m13917h(missingFields, "missingFields");
        this.f36677j = missingFields;
    }

    /* renamed from: a */
    public final List<String> m272a() {
        return this.f36677j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C14270a(java.util.List<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "missingFields"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = "serialName"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field '"
            r0.append(r1)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "' is required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but it was missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L55
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "', but they were missing"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L55:
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p470zi.C14270a.<init>(java.util.List, java.lang.String):void");
    }
}
