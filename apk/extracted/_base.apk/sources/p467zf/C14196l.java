package p467zf;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p355ti.C12785a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m14357d2 = {"Ljava/io/File;", "Ljava/nio/charset/Charset;", "charset", "", "c", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/io/FilesKt")
/* renamed from: zf.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14196l extends C14195k {
    /* renamed from: c */
    public static final String m488c(File file, Charset charset) {
        C9612q.m13917h(file, "<this>");
        C9612q.m13917h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m469e = C14202q.m469e(inputStreamReader);
            C14180c.m514a(inputStreamReader, null);
            return m469e;
        } finally {
        }
    }

    /* renamed from: d */
    public static /* synthetic */ String m487d(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C12785a.f33142b;
        }
        return m488c(file, charset);
    }
}
