package pf;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import wf.C13537b;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¨\u0006\u0006"}, m14357d2 = {"", "", "b", "exception", "", "a", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/ExceptionsKt")
/* renamed from: pf.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11560f {
    /* renamed from: a */
    public static void m7637a(Throwable th2, Throwable exception) {
        C9612q.m13917h(th2, "<this>");
        C9612q.m13917h(exception, "exception");
        if (th2 != exception) {
            C13537b.f34906a.mo1520a(th2, exception);
        }
    }

    /* renamed from: b */
    public static String m7636b(Throwable th2) {
        C9612q.m13917h(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C9612q.m13918g(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}