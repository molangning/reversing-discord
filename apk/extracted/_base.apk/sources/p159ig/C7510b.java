package p159ig;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Lig/b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/IllegalAccessException;", "cause", "<init>", "(Ljava/lang/IllegalAccessException;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ig.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7510b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7510b(IllegalAccessException cause) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        C9612q.m13917h(cause, "cause");
    }
}
