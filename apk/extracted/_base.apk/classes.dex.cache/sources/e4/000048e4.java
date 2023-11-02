package p280p6;

import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import okhttp3.CacheControl;
import okhttp3.Call;
import p153i8.InterfaceC7472x;

@Deprecated
/* renamed from: p6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11444b extends InterfaceC4540f.AbstractC4541a {

    /* renamed from: b */
    private final Call.Factory f29765b;

    /* renamed from: c */
    private final String f29766c;

    /* renamed from: d */
    private final InterfaceC7472x f29767d;

    /* renamed from: e */
    private final CacheControl f29768e;

    public C11444b(Call.Factory factory, String str, InterfaceC7472x interfaceC7472x) {
        this(factory, str, interfaceC7472x, null);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC4540f.AbstractC4541a
    /* renamed from: c */
    public C11443a mo8047a(InterfaceC4540f.C4547g c4547g) {
        C11443a c11443a = new C11443a(this.f29765b, this.f29766c, this.f29768e, c4547g);
        InterfaceC7472x interfaceC7472x = this.f29767d;
        if (interfaceC7472x != null) {
            c11443a.mo6320f(interfaceC7472x);
        }
        return c11443a;
    }

    public C11444b(Call.Factory factory, String str, InterfaceC7472x interfaceC7472x, CacheControl cacheControl) {
        this.f29765b = factory;
        this.f29766c = str;
        this.f29767d = interfaceC7472x;
        this.f29768e = cacheControl;
    }
}