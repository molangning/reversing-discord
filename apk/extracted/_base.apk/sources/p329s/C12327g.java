package p329s;

import p329s.C12325f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12327g extends C12325f {

    /* renamed from: m */
    public int f32151m;

    public C12327g(AbstractC12335m abstractC12335m) {
        super(abstractC12335m);
        if (abstractC12335m instanceof C12330j) {
            this.f32134e = C12325f.EnumC12326a.HORIZONTAL_DIMENSION;
        } else {
            this.f32134e = C12325f.EnumC12326a.VERTICAL_DIMENSION;
        }
    }

    @Override // p329s.C12325f
    /* renamed from: d */
    public void mo5475d(int i) {
        if (this.f32139j) {
            return;
        }
        this.f32139j = true;
        this.f32136g = i;
        for (InterfaceC12323d interfaceC12323d : this.f32140k) {
            interfaceC12323d.mo5465a(interfaceC12323d);
        }
    }
}
