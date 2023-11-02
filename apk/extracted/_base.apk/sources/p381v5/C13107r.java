package p381v5;

import p347t5.AbstractC12589c;
import p347t5.C12588b;
import p347t5.InterfaceC12591e;
import p347t5.InterfaceC12592f;
import p347t5.InterfaceC12594h;

/* renamed from: v5.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13107r<T> implements InterfaceC12592f<T> {

    /* renamed from: a */
    private final AbstractC13103o f33946a;

    /* renamed from: b */
    private final String f33947b;

    /* renamed from: c */
    private final C12588b f33948c;

    /* renamed from: d */
    private final InterfaceC12591e<T, byte[]> f33949d;

    /* renamed from: e */
    private final InterfaceC13108s f33950e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13107r(AbstractC13103o abstractC13103o, String str, C12588b c12588b, InterfaceC12591e<T, byte[]> interfaceC12591e, InterfaceC13108s interfaceC13108s) {
        this.f33946a = abstractC13103o;
        this.f33947b = str;
        this.f33948c = c12588b;
        this.f33949d = interfaceC12591e;
        this.f33950e = interfaceC13108s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m3248c(Exception exc) {
    }

    @Override // p347t5.InterfaceC12592f
    /* renamed from: a */
    public void mo3250a(AbstractC12589c<T> abstractC12589c) {
        m3247d(abstractC12589c, new InterfaceC12594h() { // from class: v5.q
            @Override // p347t5.InterfaceC12594h
            /* renamed from: a */
            public final void mo3251a(Exception exc) {
                C13107r.m3248c(exc);
            }
        });
    }

    /* renamed from: d */
    public void m3247d(AbstractC12589c<T> abstractC12589c, InterfaceC12594h interfaceC12594h) {
        this.f33950e.mo3246a(AbstractC13101n.m3275a().mo3264e(this.f33946a).mo3266c(abstractC12589c).mo3263f(this.f33947b).mo3265d(this.f33949d).mo3267b(this.f33948c).mo3268a(), interfaceC12594h);
    }
}
