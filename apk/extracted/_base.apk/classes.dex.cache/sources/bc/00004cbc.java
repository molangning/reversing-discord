package p337s7;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.io.IOException;
import p229m7.InterfaceC10353z;
import p317r7.InterfaceC12084g;

/* renamed from: s7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC12428k {

    /* renamed from: s7.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12429a {
        /* renamed from: a */
        InterfaceC12428k mo5286a(InterfaceC12084g interfaceC12084g, InterfaceC4548g interfaceC4548g, InterfaceC12427j interfaceC12427j);
    }

    /* renamed from: s7.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12430b {
        /* renamed from: e */
        void mo5285e();

        /* renamed from: i */
        boolean mo5284i(Uri uri, long j);
    }

    /* renamed from: s7.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12431c extends IOException {

        /* renamed from: j */
        public final Uri f32370j;

        public C12431c(Uri uri) {
            this.f32370j = uri;
        }
    }

    /* renamed from: s7.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12432d extends IOException {

        /* renamed from: j */
        public final Uri f32371j;

        public C12432d(Uri uri) {
            this.f32371j = uri;
        }
    }

    /* renamed from: s7.k$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12433e {
        /* renamed from: f */
        void mo5283f(C12416g c12416g);
    }

    /* renamed from: a */
    void mo5297a(Uri uri);

    /* renamed from: b */
    long mo5296b();

    /* renamed from: c */
    C12413f mo5295c();

    /* renamed from: d */
    void mo5294d(Uri uri);

    /* renamed from: e */
    void mo5293e(Uri uri, InterfaceC10353z.C10354a c10354a, InterfaceC12433e interfaceC12433e);

    /* renamed from: f */
    boolean mo5292f(Uri uri);

    /* renamed from: g */
    boolean mo5291g();

    /* renamed from: h */
    void mo5290h();

    /* renamed from: i */
    void mo5289i(InterfaceC12430b interfaceC12430b);

    /* renamed from: l */
    C12416g mo5288l(Uri uri, boolean z);

    /* renamed from: m */
    void mo5287m(InterfaceC12430b interfaceC12430b);

    void stop();
}