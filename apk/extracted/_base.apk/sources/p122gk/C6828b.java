package p122gk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p355ti.C12785a;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\b2\u00020\b¨\u0006\n"}, m14357d2 = {"", "", "b", "a", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: gk.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6828b {
    /* renamed from: a */
    public static final byte[] m21853a(String asUtf8ToByteArray) {
        C9612q.m13917h(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(C12785a.f33142b);
        C9612q.m13918g(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m21852b(byte[] toUtf8String) {
        C9612q.m13917h(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, C12785a.f33142b);
    }
}
