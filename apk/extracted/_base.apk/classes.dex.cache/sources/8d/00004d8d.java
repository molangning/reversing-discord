package p353tb;

import p300qb.C11815b;
import p300qb.C11816c;
import p300qb.InterfaceC11822g;

/* renamed from: tb.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12637i implements InterfaceC11822g {

    /* renamed from: a */
    private boolean f32745a = false;

    /* renamed from: b */
    private boolean f32746b = false;

    /* renamed from: c */
    private C11816c f32747c;

    /* renamed from: d */
    private final C12632f f32748d;

    public C12637i(C12632f c12632f) {
        this.f32748d = c12632f;
    }

    /* renamed from: a */
    private void m4664a() {
        if (!this.f32745a) {
            this.f32745a = true;
            return;
        }
        throw new C11815b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: b */
    public void m4663b(C11816c c11816c, boolean z) {
        this.f32745a = false;
        this.f32747c = c11816c;
        this.f32746b = z;
    }

    @Override // p300qb.InterfaceC11822g
    /* renamed from: d */
    public InterfaceC11822g mo4662d(String str) {
        m4664a();
        this.f32748d.m4689g(this.f32747c, str, this.f32746b);
        return this;
    }

    @Override // p300qb.InterfaceC11822g
    /* renamed from: e */
    public InterfaceC11822g mo4661e(boolean z) {
        m4664a();
        this.f32748d.m4684l(this.f32747c, z, this.f32746b);
        return this;
    }
}