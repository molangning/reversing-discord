package p015ak;

import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Sink;
import okio.Source;
import p122gk.C6840m;
import p122gk.C6841n;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u0000 \f2\u00020\u0001:\u0001\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0014"}, m14357d2 = {"Lak/a;", "", "Ljava/io/File;", JSStackTrace.FILE_KEY, "Lokio/Source;", "e", "Lokio/Sink;", "f", "c", "", "h", "", "b", "", "d", "from", "to", "g", "directory", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: ak.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface InterfaceC0214a {

    /* renamed from: b */
    public static final C0215a f670b = new C0215a(null);

    /* renamed from: a */
    public static final InterfaceC0214a f669a = new C0215a.C0216a();

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m14357d2 = {"Lak/a$a;", "", "Lak/a;", "SYSTEM", "Lak/a;", "<init>", "()V", "a", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: ak.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C0215a {

        @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, m14357d2 = {"Lak/a$a$a;", "Lak/a;", "Ljava/io/File;", JSStackTrace.FILE_KEY, "Lokio/Source;", "e", "Lokio/Sink;", "f", "c", "", "h", "", "b", "", "d", "from", "to", "g", "directory", "a", "", "toString", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* renamed from: ak.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        private static final class C0216a implements InterfaceC0214a {
            @Override // p015ak.InterfaceC0214a
            /* renamed from: a */
            public void mo40914a(File directory) {
                C9612q.m13917h(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        C9612q.m13918g(file, "file");
                        if (file.isDirectory()) {
                            mo40914a(file);
                        }
                        if (!file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + directory);
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: b */
            public boolean mo40913b(File file) {
                C9612q.m13917h(file, "file");
                return file.exists();
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: c */
            public Sink mo40912c(File file) {
                C9612q.m13917h(file, "file");
                try {
                    return C6840m.m21832a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C6840m.m21832a(file);
                }
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: d */
            public long mo40911d(File file) {
                C9612q.m13917h(file, "file");
                return file.length();
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: e */
            public Source mo40910e(File file) {
                C9612q.m13917h(file, "file");
                return C6840m.m21822k(file);
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: f */
            public Sink mo40909f(File file) {
                C9612q.m13917h(file, "file");
                try {
                    return C6841n.m21813g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C6841n.m21813g(file, false, 1, null);
                }
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: g */
            public void mo40908g(File from, File to) {
                C9612q.m13917h(from, "from");
                C9612q.m13917h(to, "to");
                mo40907h(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // p015ak.InterfaceC0214a
            /* renamed from: h */
            public void mo40907h(File file) {
                C9612q.m13917h(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0215a() {
        }

        public /* synthetic */ C0215a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    void mo40914a(File file);

    /* renamed from: b */
    boolean mo40913b(File file);

    /* renamed from: c */
    Sink mo40912c(File file);

    /* renamed from: d */
    long mo40911d(File file);

    /* renamed from: e */
    Source mo40910e(File file);

    /* renamed from: f */
    Sink mo40909f(File file);

    /* renamed from: g */
    void mo40908g(File file, File file2);

    /* renamed from: h */
    void mo40907h(File file);
}
