package p467zf;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lzf/f;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/io/File;", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "segments", "c", "()I", "size", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zf.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14183f {

    /* renamed from: a */
    private final File f36481a;

    /* renamed from: b */
    private final List<File> f36482b;

    /* JADX WARN: Multi-variable type inference failed */
    public C14183f(File root, List<? extends File> segments) {
        C9612q.m13917h(root, "root");
        C9612q.m13917h(segments, "segments");
        this.f36481a = root;
        this.f36482b = segments;
    }

    /* renamed from: a */
    public final File m511a() {
        return this.f36481a;
    }

    /* renamed from: b */
    public final List<File> m510b() {
        return this.f36482b;
    }

    /* renamed from: c */
    public final int m509c() {
        return this.f36482b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14183f) {
            C14183f c14183f = (C14183f) obj;
            return C9612q.m13922c(this.f36481a, c14183f.f36481a) && C9612q.m13922c(this.f36482b, c14183f.f36482b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f36481a.hashCode() * 31) + this.f36482b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f36481a + ", segments=" + this.f36482b + ')';
    }
}