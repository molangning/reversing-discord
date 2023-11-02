package fk;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.Source;
import p122gk.C6838k;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lfk/c;", "Ljava/io/Closeable;", "Lokio/Buffer;", "buffer", "", "a", "close", "j", "Lokio/Buffer;", "deflatedBytes", "Ljava/util/zip/Inflater;", "k", "Ljava/util/zip/Inflater;", "inflater", "Lgk/k;", "l", "Lgk/k;", "inflaterSource", "", "m", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6488c implements Closeable {

    /* renamed from: j */
    private final Buffer f18215j;

    /* renamed from: k */
    private final Inflater f18216k;

    /* renamed from: l */
    private final C6838k f18217l;

    /* renamed from: m */
    private final boolean f18218m;

    public C6488c(boolean z) {
        this.f18218m = z;
        Buffer buffer = new Buffer();
        this.f18215j = buffer;
        Inflater inflater = new Inflater(true);
        this.f18216k = inflater;
        this.f18217l = new C6838k((Source) buffer, inflater);
    }

    /* renamed from: a */
    public final void m22603a(Buffer buffer) {
        boolean z;
        C9612q.m13917h(buffer, "buffer");
        if (this.f18215j.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f18218m) {
                this.f18216k.reset();
            }
            this.f18215j.mo8606O(buffer);
            this.f18215j.writeInt(65535);
            long bytesRead = this.f18216k.getBytesRead() + this.f18215j.size();
            do {
                this.f18217l.m21835a(buffer, Long.MAX_VALUE);
            } while (this.f18216k.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18217l.close();
    }
}
