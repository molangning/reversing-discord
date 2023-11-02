package p397w5;

import android.content.Context;
import p116g6.InterfaceC6553a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13393c extends AbstractC13400h {

    /* renamed from: a */
    private final Context f34473a;

    /* renamed from: b */
    private final InterfaceC6553a f34474b;

    /* renamed from: c */
    private final InterfaceC6553a f34475c;

    /* renamed from: d */
    private final String f34476d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13393c(Context context, InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, String str) {
        if (context != null) {
            this.f34473a = context;
            if (interfaceC6553a != null) {
                this.f34474b = interfaceC6553a;
                if (interfaceC6553a2 != null) {
                    this.f34475c = interfaceC6553a2;
                    if (str != null) {
                        this.f34476d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // p397w5.AbstractC13400h
    /* renamed from: b */
    public Context mo2644b() {
        return this.f34473a;
    }

    @Override // p397w5.AbstractC13400h
    /* renamed from: c */
    public String mo2643c() {
        return this.f34476d;
    }

    @Override // p397w5.AbstractC13400h
    /* renamed from: d */
    public InterfaceC6553a mo2642d() {
        return this.f34475c;
    }

    @Override // p397w5.AbstractC13400h
    /* renamed from: e */
    public InterfaceC6553a mo2641e() {
        return this.f34474b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13400h)) {
            return false;
        }
        AbstractC13400h abstractC13400h = (AbstractC13400h) obj;
        if (this.f34473a.equals(abstractC13400h.mo2644b()) && this.f34474b.equals(abstractC13400h.mo2641e()) && this.f34475c.equals(abstractC13400h.mo2642d()) && this.f34476d.equals(abstractC13400h.mo2643c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f34473a.hashCode() ^ 1000003) * 1000003) ^ this.f34474b.hashCode()) * 1000003) ^ this.f34475c.hashCode()) * 1000003) ^ this.f34476d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f34473a + ", wallClock=" + this.f34474b + ", monotonicClock=" + this.f34475c + ", backendName=" + this.f34476d + "}";
    }
}
