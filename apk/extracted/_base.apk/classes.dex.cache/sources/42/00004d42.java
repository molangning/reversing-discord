package sj;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.util.JSStackTrace;
import gg.C6759j;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.Regex;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import p015ak.InterfaceC0214a;
import p122gk.C6843p;
import p164j$.util.DesugarTimeZone;
import p304qf.AbstractC11883p;
import p304qf.C11889v;
import p328rj.AbstractC12302m;
import p355ti.C12785a;
import p467zf.C14180c;
import p471zj.C14293c;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000\u0096\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\f\"\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0012\u00102\u001a\u000200*\u00020/2\u0006\u00101\u001a\u000200\u001a \u00106\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000104\u001a\n\u00107\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010;\u001a\u00020:*\b\u0012\u0004\u0012\u00020908\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020908*\u00020:\u001a\u0012\u0010=\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010@\u001a\u00020?*\u00020>\u001a\u0015\u0010C\u001a\u00020\u0018*\u00020A2\u0006\u0010B\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010E\u001a\u00020\u0018*\u00020D2\u0006\u0010B\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010F\u001a\u00020\u0000*\u00020\u00182\u0006\u0010B\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010I\u001a\u00020\u0004*\u00020G2\u0006\u0010H\u001a\u00020\u0018\u001a\n\u0010J\u001a\u00020\u0018*\u00020/\u001a\u001a\u0010M\u001a\u00020\b*\u00020K2\u0006\u00103\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u001a\u0010O\u001a\u00020\b*\u00020K2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010L\u001a\u000204\u001a\u0012\u0010R\u001a\u00020\b*\u00020P2\u0006\u0010Q\u001a\u00020/\u001a\u0012\u0010T\u001a\u00020\u0018*\u00020S2\u0006\u0010C\u001a\u00020A\u001a\u0014\u0010U\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010W\u001a\u00020\u0000*\u00020V\u001a\u0012\u0010Y\u001a\u00020\u0000*\u00020\u00062\u0006\u0010X\u001a\u00020\u0000\u001a\u0014\u0010Z\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010X\u001a\u00020\u0018\u001a\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y*\b\u0012\u0004\u0012\u00028\u000008\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y2\u0012\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b]\u0010^\u001a.\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010!*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_\u001a\n\u0010b\u001a\u00020\u0004*\u00020a\u001a\n\u0010c\u001a\u00020\u0004*\u00020P\u001a\u0012\u0010g\u001a\u00020\b*\u00020d2\u0006\u0010f\u001a\u00020e\u001a\n\u0010h\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010i\u001a\u00020\u0006*\u00020\u0018\u001a'\u0010l\u001a\u00020\u0004\"\u0004\b\u0000\u0010)*\b\u0012\u0004\u0012\u00028\u00000j2\u0006\u0010k\u001a\u00028\u0000H\u0000¢\u0006\u0004\bl\u0010m\u001a \u0010r\u001a\u00020q*\u00060nj\u0002`o2\u0010\u0010p\u001a\f\u0012\b\u0012\u00060nj\u0002`o08\"\u0014\u0010u\u001a\u00020s8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010t\"\u0014\u0010w\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010v\"\u0014\u0010z\u001a\u00020x8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010y\"\u0014\u0010}\u001a\u00020{8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010|\"\u0015\u0010\u0080\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u007f\"\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0082\u0001\"\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010\u0085\u0001\"\u0016\u0010\u0088\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0087\u0001\"\u0016\u0010\u008a\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0089\u0001¨\u0006\u008b\u0001"}, m14357d2 = {"", "arrayLength", "offset", "count", "", "i", "", ZeroconfModule.KEY_SERVICE_NAME, "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "K", "", "other", "Ljava/util/Comparator;", "comparator", "B", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "r", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "P", "value", "", "u", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "l", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "w", "y", "V", "delimiters", "n", "", "delimiter", "m", "v", "f", "E", "format", "", "args", "q", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "G", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "F", "", "Lzj/c;", "Lokhttp3/Headers;", "M", "L", "g", "Lrj/m;", "Lrj/m$c;", "e", "", "mask", "b", "", "c", "d", "Lokio/BufferedSink;", "medium", "Y", "H", "Lokio/Source;", "timeUnit", "J", "timeout", "p", "Ljava/net/Socket;", "source", "D", "Lokio/Buffer;", "I", "A", "Lokhttp3/Response;", "s", "defaultValue", "T", "U", "R", "elements", "t", "([Ljava/lang/Object;)Ljava/util/List;", "", "S", "Ljava/io/Closeable;", "j", "k", "Lak/a;", "Ljava/io/File;", JSStackTrace.FILE_KEY, "C", "O", "N", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "X", "", "[B", "EMPTY_BYTE_ARRAY", "Lokhttp3/Headers;", "EMPTY_HEADERS", "Lokhttp3/ResponseBody;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/RequestBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lgk/p;", "Lgk/p;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Z", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: sj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12562c {

    /* renamed from: a */
    public static final byte[] f32608a;

    /* renamed from: b */
    public static final Headers f32609b = Headers.f29295k.m8907h(new String[0]);

    /* renamed from: c */
    public static final ResponseBody f32610c;

    /* renamed from: d */
    public static final RequestBody f32611d;

    /* renamed from: e */
    private static final C6843p f32612e;

    /* renamed from: f */
    public static final TimeZone f32613f;

    /* renamed from: g */
    private static final Regex f32614g;

    /* renamed from: h */
    public static final boolean f32615h;

    /* renamed from: i */
    public static final String f32616i;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lokhttp3/Call;", "it", "Lrj/m;", "a", "(Lokhttp3/Call;)Lrj/m;"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: sj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C12563a implements AbstractC12302m.InterfaceC12305c {

        /* renamed from: a */
        final /* synthetic */ AbstractC12302m f32617a;

        C12563a(AbstractC12302m abstractC12302m) {
            this.f32617a = abstractC12302m;
        }

        @Override // p328rj.AbstractC12302m.InterfaceC12305c
        /* renamed from: a */
        public final AbstractC12302m mo4784a(Call it) {
            C9612q.m13917h(it, "it");
            return this.f32617a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, m14356k = 3, m14355mv = {1, 4, 0})
    /* renamed from: sj.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class ThreadFactoryC12564b implements ThreadFactory {

        /* renamed from: j */
        final /* synthetic */ String f32618j;

        /* renamed from: k */
        final /* synthetic */ boolean f32619k;

        ThreadFactoryC12564b(String str, boolean z) {
            this.f32618j = str;
            this.f32619k = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f32618j);
            thread.setDaemon(this.f32619k);
            return thread;
        }
    }

    static {
        String m13692p0;
        String m13691q0;
        byte[] bArr = new byte[0];
        f32608a = bArr;
        f32610c = ResponseBody.Companion.m8662i(ResponseBody.Companion, bArr, null, 1, null);
        f32611d = RequestBody.Companion.m8711j(RequestBody.Companion, bArr, null, 0, 0, 7, null);
        C6843p.C6844a c6844a = C6843p.f19056m;
        ByteString.C11214a c11214a = ByteString.f29482n;
        f32612e = c6844a.m21796d(c11214a.m8549b("efbbbf"), c11214a.m8549b("feff"), c11214a.m8549b("fffe"), c11214a.m8549b("0000ffff"), c11214a.m8549b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        C9612q.m13920e(timeZone);
        f32613f = timeZone;
        f32614g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f32615h = false;
        String name = OkHttpClient.class.getName();
        C9612q.m13918g(name, "OkHttpClient::class.java.name");
        m13692p0 = C9654p.m13692p0(name, "okhttp3.");
        m13691q0 = C9654p.m13691q0(m13692p0, "Client");
        f32616i = m13691q0;
    }

    /* renamed from: A */
    public static final int m4835A(String indexOfNonWhitespace, int i) {
        C9612q.m13917h(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i < length) {
            char charAt = indexOfNonWhitespace.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return indexOfNonWhitespace.length();
    }

    /* renamed from: B */
    public static final String[] m4834B(String[] intersect, String[] other, Comparator<? super String> comparator) {
        C9612q.m13917h(intersect, "$this$intersect");
        C9612q.m13917h(other, "other");
        C9612q.m13917h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: C */
    public static final boolean m4833C(InterfaceC0214a isCivilized, File file) {
        C9612q.m13917h(isCivilized, "$this$isCivilized");
        C9612q.m13917h(file, "file");
        Sink mo40909f = isCivilized.mo40909f(file);
        try {
            try {
                isCivilized.mo40907h(file);
                C14180c.m514a(mo40909f, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C14180c.m514a(mo40909f, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            Unit unit = Unit.f25302a;
            C14180c.m514a(mo40909f, null);
            isCivilized.mo40907h(file);
            return false;
        }
    }

    /* renamed from: D */
    public static final boolean m4832D(Socket isHealthy, BufferedSource source) {
        C9612q.m13917h(isHealthy, "$this$isHealthy");
        C9612q.m13917h(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z = !source.mo8589g0();
                isHealthy.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th2) {
                isHealthy.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: E */
    public static final boolean m4831E(String name) {
        boolean m13754t;
        boolean m13754t2;
        boolean m13754t3;
        boolean m13754t4;
        C9612q.m13917h(name, "name");
        m13754t = C9653o.m13754t(name, "Authorization", true);
        if (m13754t) {
            return true;
        }
        m13754t2 = C9653o.m13754t(name, "Cookie", true);
        if (m13754t2) {
            return true;
        }
        m13754t3 = C9653o.m13754t(name, "Proxy-Authorization", true);
        if (m13754t3) {
            return true;
        }
        m13754t4 = C9653o.m13754t(name, "Set-Cookie", true);
        if (m13754t4) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static final int m4830F(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: G */
    public static final Charset m4829G(BufferedSource readBomAsCharset, Charset charset) {
        C9612q.m13917h(readBomAsCharset, "$this$readBomAsCharset");
        C9612q.m13917h(charset, "default");
        int mo8598E = readBomAsCharset.mo8598E(f32612e);
        if (mo8598E != -1) {
            if (mo8598E != 0) {
                if (mo8598E != 1) {
                    if (mo8598E != 2) {
                        if (mo8598E != 3) {
                            if (mo8598E == 4) {
                                return C12785a.f33141a.m3928b();
                            }
                            throw new AssertionError();
                        }
                        return C12785a.f33141a.m3929a();
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    C9612q.m13918g(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                C9612q.m13918g(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            C9612q.m13918g(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    /* renamed from: H */
    public static final int m4828H(BufferedSource readMedium) {
        C9612q.m13917h(readMedium, "$this$readMedium");
        return m4809b(readMedium.readByte(), 255) | (m4809b(readMedium.readByte(), 255) << 16) | (m4809b(readMedium.readByte(), 255) << 8);
    }

    /* renamed from: I */
    public static final int m4827I(Buffer skipAll, byte b) {
        C9612q.m13917h(skipAll, "$this$skipAll");
        int i = 0;
        while (!skipAll.mo8589g0() && skipAll.m8645D(0L) == b) {
            i++;
            skipAll.readByte();
        }
        return i;
    }

    /* renamed from: J */
    public static final boolean m4826J(Source skipAll, int i, TimeUnit timeUnit) {
        long j;
        C9612q.m13917h(skipAll, "$this$skipAll");
        C9612q.m13917h(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (skipAll.timeout().mo8540e()) {
            j = skipAll.timeout().mo8541c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        skipAll.timeout().mo8538d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, 8192L) != -1) {
                buffer.m8621j();
            }
            if (j == Long.MAX_VALUE) {
                skipAll.timeout().mo8543a();
            } else {
                skipAll.timeout().mo8538d(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                skipAll.timeout().mo8543a();
            } else {
                skipAll.timeout().mo8538d(nanoTime + j);
            }
            return false;
        } catch (Throwable th2) {
            if (j == Long.MAX_VALUE) {
                skipAll.timeout().mo8543a();
            } else {
                skipAll.timeout().mo8538d(nanoTime + j);
            }
            throw th2;
        }
    }

    /* renamed from: K */
    public static final ThreadFactory m4825K(String name, boolean z) {
        C9612q.m13917h(name, "name");
        return new ThreadFactoryC12564b(name, z);
    }

    /* renamed from: L */
    public static final List<C14293c> m4824L(Headers toHeaderList) {
        IntRange m21916q;
        int m14093t;
        C9612q.m13917h(toHeaderList, "$this$toHeaderList");
        m21916q = C6759j.m21916q(0, toHeaderList.size());
        m14093t = C9546k.m14093t(m21916q, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<Integer> it = m21916q.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11883p) it).nextInt();
            arrayList.add(new C14293c(toHeaderList.m8928e(nextInt), toHeaderList.m8924o(nextInt)));
        }
        return arrayList;
    }

    /* renamed from: M */
    public static final Headers m4823M(List<C14293c> toHeaders) {
        C9612q.m13917h(toHeaders, "$this$toHeaders");
        Headers.C11194a c11194a = new Headers.C11194a();
        for (C14293c c14293c : toHeaders) {
            c11194a.m8920c(c14293c.m228a().m8575D(), c14293c.m227b().m8575D());
        }
        return c11194a.m8919d();
    }

    /* renamed from: N */
    public static final String m4822N(int i) {
        String hexString = Integer.toHexString(i);
        C9612q.m13918g(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    /* renamed from: O */
    public static final String m4821O(long j) {
        String hexString = Long.toHexString(j);
        C9612q.m13918g(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    /* renamed from: P */
    public static final String m4820P(HttpUrl toHostHeader, boolean z) {
        boolean m13731M;
        String m8899h;
        C9612q.m13917h(toHostHeader, "$this$toHostHeader");
        m13731M = C9654p.m13731M(toHostHeader.m8899h(), ":", false, 2, null);
        if (m13731M) {
            m8899h = '[' + toHostHeader.m8899h() + ']';
        } else {
            m8899h = toHostHeader.m8899h();
        }
        if (z || toHostHeader.m8894m() != HttpUrl.f29299l.m8855c(toHostHeader.m8890q())) {
            return m8899h + ':' + toHostHeader.m8894m();
        }
        return m8899h;
    }

    /* renamed from: Q */
    public static /* synthetic */ String m4819Q(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m4820P(httpUrl, z);
    }

    /* renamed from: R */
    public static final <T> List<T> m4818R(List<? extends T> toImmutableList) {
        List m14073E0;
        C9612q.m13917h(toImmutableList, "$this$toImmutableList");
        m14073E0 = C9553r.m14073E0(toImmutableList);
        List<T> unmodifiableList = Collections.unmodifiableList(m14073E0);
        C9612q.m13918g(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: S */
    public static final <K, V> Map<K, V> m4817S(Map<K, ? extends V> toImmutableMap) {
        Map<K, V> m6754h;
        C9612q.m13917h(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            m6754h = C11889v.m6754h();
            return m6754h;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        C9612q.m13918g(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    /* renamed from: T */
    public static final long m4816T(String toLongOrDefault, long j) {
        C9612q.m13917h(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: U */
    public static final int m4815U(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) ViewDefaults.NUMBER_OF_LINES)) {
                    return ViewDefaults.NUMBER_OF_LINES;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: V */
    public static final String m4814V(String trimSubstring, int i, int i2) {
        C9612q.m13917h(trimSubstring, "$this$trimSubstring");
        int m4788w = m4788w(trimSubstring, i, i2);
        String substring = trimSubstring.substring(m4788w, m4786y(trimSubstring, m4788w, i2));
        C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: W */
    public static /* synthetic */ String m4813W(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m4814V(str, i, i2);
    }

    /* renamed from: X */
    public static final Throwable m4812X(Exception withSuppressed, List<? extends Exception> suppressed) {
        C9612q.m13917h(withSuppressed, "$this$withSuppressed");
        C9612q.m13917h(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        for (Exception exc : suppressed) {
            C11560f.m7637a(withSuppressed, exc);
        }
        return withSuppressed;
    }

    /* renamed from: Y */
    public static final void m4811Y(BufferedSink writeMedium, int i) {
        C9612q.m13917h(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i >>> 16) & 255);
        writeMedium.writeByte((i >>> 8) & 255);
        writeMedium.writeByte(i & 255);
    }

    /* renamed from: a */
    public static final <E> void m4810a(List<E> addIfAbsent, E e) {
        C9612q.m13917h(addIfAbsent, "$this$addIfAbsent");
        if (!addIfAbsent.contains(e)) {
            addIfAbsent.add(e);
        }
    }

    /* renamed from: b */
    public static final int m4809b(byte b, int i) {
        return b & i;
    }

    /* renamed from: c */
    public static final int m4808c(short s, int i) {
        return s & i;
    }

    /* renamed from: d */
    public static final long m4807d(int i, long j) {
        return i & j;
    }

    /* renamed from: e */
    public static final AbstractC12302m.InterfaceC12305c m4806e(AbstractC12302m asFactory) {
        C9612q.m13917h(asFactory, "$this$asFactory");
        return new C12563a(asFactory);
    }

    /* renamed from: f */
    public static final boolean m4805f(String canParseAsIpAddress) {
        C9612q.m13917h(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return f32614g.m13868g(canParseAsIpAddress);
    }

    /* renamed from: g */
    public static final boolean m4804g(HttpUrl canReuseConnectionFor, HttpUrl other) {
        C9612q.m13917h(canReuseConnectionFor, "$this$canReuseConnectionFor");
        C9612q.m13917h(other, "other");
        if (C9612q.m13922c(canReuseConnectionFor.m8899h(), other.m8899h()) && canReuseConnectionFor.m8894m() == other.m8894m() && C9612q.m13922c(canReuseConnectionFor.m8890q(), other.m8890q())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final int m4803h(String name, long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(name, "name");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z4 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) ViewDefaults.NUMBER_OF_LINES)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && i > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((name + " too small.").toString());
                }
                throw new IllegalArgumentException((name + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((name + " < 0").toString());
    }

    /* renamed from: i */
    public static final void m4802i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: j */
    public static final void m4801j(Closeable closeQuietly) {
        C9612q.m13917h(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public static final void m4800k(Socket closeQuietly) {
        C9612q.m13917h(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (C9612q.m13922c(e2.getMessage(), "bio == null")) {
                return;
            }
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static final String[] m4799l(String[] concat, String value) {
        int m14239I;
        C9612q.m13917h(concat, "$this$concat");
        C9612q.m13917h(value, "value");
        Object[] copyOf = Arrays.copyOf(concat, concat.length + 1);
        C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) copyOf;
        m14239I = C9538f.m14239I(strArr);
        strArr[m14239I] = value;
        return strArr;
    }

    /* renamed from: m */
    public static final int m4798m(String delimiterOffset, char c, int i, int i2) {
        C9612q.m13917h(delimiterOffset, "$this$delimiterOffset");
        while (i < i2) {
            if (delimiterOffset.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static final int m4797n(String delimiterOffset, String delimiters, int i, int i2) {
        boolean m13733L;
        C9612q.m13917h(delimiterOffset, "$this$delimiterOffset");
        C9612q.m13917h(delimiters, "delimiters");
        while (i < i2) {
            m13733L = C9654p.m13733L(delimiters, delimiterOffset.charAt(i), false, 2, null);
            if (m13733L) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static /* synthetic */ int m4796o(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m4798m(str, c, i, i2);
    }

    /* renamed from: p */
    public static final boolean m4795p(Source discard, int i, TimeUnit timeUnit) {
        C9612q.m13917h(discard, "$this$discard");
        C9612q.m13917h(timeUnit, "timeUnit");
        try {
            return m4826J(discard, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static final String m4794q(String format, Object... args) {
        C9612q.m13917h(format, "format");
        C9612q.m13917h(args, "args");
        C9602k0 c9602k0 = C9602k0.f25351a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        C9612q.m13918g(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    /* renamed from: r */
    public static final boolean m4793r(String[] hasIntersection, String[] strArr, Comparator<? super String> comparator) {
        boolean z;
        boolean z2;
        C9612q.m13917h(hasIntersection, "$this$hasIntersection");
        C9612q.m13917h(comparator, "comparator");
        if (hasIntersection.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr != null) {
            if (strArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final long m4792s(Response headersContentLength) {
        C9612q.m13917h(headersContentLength, "$this$headersContentLength");
        String m8929a = headersContentLength.m8710A().m8929a("Content-Length");
        if (m8929a == null) {
            return -1L;
        }
        return m4816T(m8929a, -1L);
    }

    @SafeVarargs
    /* renamed from: t */
    public static final <T> List<T> m4791t(T... elements) {
        List m14101l;
        C9612q.m13917h(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        m14101l = C9545j.m14101l(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(m14101l);
        C9612q.m13918g(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: u */
    public static final int m4790u(String[] indexOf, String value, Comparator<String> comparator) {
        boolean z;
        C9612q.m13917h(indexOf, "$this$indexOf");
        C9612q.m13917h(value, "value");
        C9612q.m13917h(comparator, "comparator");
        int length = indexOf.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(indexOf[i], value) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static final int m4789v(String indexOfControlOrNonAscii) {
        C9612q.m13917h(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i = 0; i < length; i++) {
            char charAt = indexOfControlOrNonAscii.charAt(i);
            if (C9612q.m13915j(charAt, 31) <= 0 || C9612q.m13915j(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static final int m4788w(String indexOfFirstNonAsciiWhitespace, int i, int i2) {
        C9612q.m13917h(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: x */
    public static /* synthetic */ int m4787x(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m4788w(str, i, i2);
    }

    /* renamed from: y */
    public static final int m4786y(String indexOfLastNonAsciiWhitespace, int i, int i2) {
        C9612q.m13917h(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static /* synthetic */ int m4785z(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m4786y(str, i, i2);
    }
}