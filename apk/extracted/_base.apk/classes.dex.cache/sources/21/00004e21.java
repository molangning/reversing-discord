package p355ti;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, m14357d2 = {"Lti/a;", "", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ti.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12785a {

    /* renamed from: a */
    public static final C12785a f33141a = new C12785a();

    /* renamed from: b */
    public static final Charset f33142b;

    /* renamed from: c */
    public static final Charset f33143c;

    /* renamed from: d */
    public static final Charset f33144d;

    /* renamed from: e */
    public static final Charset f33145e;

    /* renamed from: f */
    public static final Charset f33146f;

    /* renamed from: g */
    public static final Charset f33147g;

    /* renamed from: h */
    private static volatile Charset f33148h;

    /* renamed from: i */
    private static volatile Charset f33149i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C9612q.m13918g(forName, "forName(\"UTF-8\")");
        f33142b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C9612q.m13918g(forName2, "forName(\"UTF-16\")");
        f33143c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C9612q.m13918g(forName3, "forName(\"UTF-16BE\")");
        f33144d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C9612q.m13918g(forName4, "forName(\"UTF-16LE\")");
        f33145e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C9612q.m13918g(forName5, "forName(\"US-ASCII\")");
        f33146f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C9612q.m13918g(forName6, "forName(\"ISO-8859-1\")");
        f33147g = forName6;
    }

    private C12785a() {
    }

    /* renamed from: a */
    public final Charset m3929a() {
        Charset charset = f33149i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            C9612q.m13918g(forName, "forName(\"UTF-32BE\")");
            f33149i = forName;
            return forName;
        }
        return charset;
    }

    /* renamed from: b */
    public final Charset m3928b() {
        Charset charset = f33148h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            C9612q.m13918g(forName, "forName(\"UTF-32LE\")");
            f33148h = forName;
            return forName;
        }
        return charset;
    }
}