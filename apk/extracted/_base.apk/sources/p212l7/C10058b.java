package p212l7;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4559i;
import java.io.InputStream;
import java.util.List;
import p212l7.InterfaceC10057a;

/* renamed from: l7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10058b<T extends InterfaceC10057a<T>> implements C4559i.InterfaceC4560a<T> {

    /* renamed from: a */
    private final C4559i.InterfaceC4560a<? extends T> f26152a;

    /* renamed from: b */
    private final List<C10059c> f26153b;

    public C10058b(C4559i.InterfaceC4560a<? extends T> interfaceC4560a, List<C10059c> list) {
        this.f26152a = interfaceC4560a;
        this.f26153b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.C4559i.InterfaceC4560a
    /* renamed from: b */
    public T mo3724a(Uri uri, InputStream inputStream) {
        T mo3724a = this.f26152a.mo3724a(uri, inputStream);
        List<C10059c> list = this.f26153b;
        if (list != null && !list.isEmpty()) {
            return (T) mo3724a.mo3731a(this.f26153b);
        }
        return mo3724a;
    }
}
