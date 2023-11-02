package p443ya;

import android.graphics.Typeface;

/* renamed from: ya.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13954a extends AbstractC13962f {

    /* renamed from: a */
    private final Typeface f35912a;

    /* renamed from: b */
    private final InterfaceC13955a f35913b;

    /* renamed from: c */
    private boolean f35914c;

    /* renamed from: ya.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC13955a {
        /* renamed from: a */
        void mo1095a(Typeface typeface);
    }

    public C13954a(InterfaceC13955a interfaceC13955a, Typeface typeface) {
        this.f35912a = typeface;
        this.f35913b = interfaceC13955a;
    }

    /* renamed from: d */
    private void m1096d(Typeface typeface) {
        if (!this.f35914c) {
            this.f35913b.mo1095a(typeface);
        }
    }

    @Override // p443ya.AbstractC13962f
    /* renamed from: a */
    public void mo1062a(int i) {
        m1096d(this.f35912a);
    }

    @Override // p443ya.AbstractC13962f
    /* renamed from: b */
    public void mo1061b(Typeface typeface, boolean z) {
        m1096d(typeface);
    }

    /* renamed from: c */
    public void m1097c() {
        this.f35914c = true;
    }
}
