package p337s7;

import com.google.android.exoplayer2.upstream.C4559i;
import java.util.List;
import p212l7.C10058b;
import p212l7.C10059c;

/* renamed from: s7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12412e implements InterfaceC12427j {

    /* renamed from: a */
    private final InterfaceC12427j f32248a;

    /* renamed from: b */
    private final List<C10059c> f32249b;

    public C12412e(InterfaceC12427j interfaceC12427j, List<C10059c> list) {
        this.f32248a = interfaceC12427j;
        this.f32249b = list;
    }

    @Override // p337s7.InterfaceC12427j
    /* renamed from: a */
    public C4559i.InterfaceC4560a<AbstractC12423h> mo5299a() {
        return new C10058b(this.f32248a.mo5299a(), this.f32249b);
    }

    @Override // p337s7.InterfaceC12427j
    /* renamed from: b */
    public C4559i.InterfaceC4560a<AbstractC12423h> mo5298b(C12413f c12413f, C12416g c12416g) {
        return new C10058b(this.f32248a.mo5298b(c12413f, c12416g), this.f32249b);
    }
}
