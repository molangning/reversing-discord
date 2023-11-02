package p467zf;

import java.io.Closeable;
import kotlin.Metadata;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¨\u0006\u0005"}, m14357d2 = {"Ljava/io/Closeable;", "", "cause", "", "a", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: zf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14180c {
    /* renamed from: a */
    public static final void m514a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C11560f.m7637a(th2, th3);
            }
        }
    }
}
