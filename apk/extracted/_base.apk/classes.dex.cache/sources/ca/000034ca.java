package p122gk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"Lokio/Source;", "Lokio/BufferedSource;", "c", "Lokio/Sink;", "Lokio/BufferedSink;", "b", "a", "()Lokio/Sink;", "okio"}, m14356k = 5, m14355mv = {1, 4, 0}, m14352xs = "okio/Okio")
/* renamed from: gk.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final /* synthetic */ class C6842o {
    /* renamed from: a */
    public static final Sink m21809a() {
        return new C6830d();
    }

    /* renamed from: b */
    public static final BufferedSink m21808b(Sink buffer) {
        C9612q.m13917h(buffer, "$this$buffer");
        return new C6847s(buffer);
    }

    /* renamed from: c */
    public static final BufferedSource m21807c(Source buffer) {
        C9612q.m13917h(buffer, "$this$buffer");
        return new C6849t(buffer);
    }
}