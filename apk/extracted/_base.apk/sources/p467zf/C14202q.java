package p467zf;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import si.C12545m;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0006\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0010"}, m14357d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", "c", "Ljava/io/BufferedReader;", "Lkotlin/sequences/Sequence;", "d", "e", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: zf.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14202q {
    /* renamed from: a */
    public static final long m473a(Reader reader, Writer out, int i) {
        C9612q.m13917h(reader, "<this>");
        C9612q.m13917h(out, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m472b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m473a(reader, writer, i);
    }

    /* renamed from: c */
    public static final void m471c(Reader reader, Function1<? super String, Unit> action) {
        BufferedReader bufferedReader;
        C9612q.m13917h(reader, "<this>");
        C9612q.m13917h(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            for (String str : m470d(bufferedReader)) {
                action.invoke(str);
            }
            Unit unit = Unit.f25302a;
            C14180c.m514a(bufferedReader, null);
        } finally {
        }
    }

    /* renamed from: d */
    public static final Sequence<String> m470d(BufferedReader bufferedReader) {
        Sequence<String> m4880d;
        C9612q.m13917h(bufferedReader, "<this>");
        m4880d = C12545m.m4880d(new C14199o(bufferedReader));
        return m4880d;
    }

    /* renamed from: e */
    public static final String m469e(Reader reader) {
        C9612q.m13917h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m472b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C9612q.m13918g(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
