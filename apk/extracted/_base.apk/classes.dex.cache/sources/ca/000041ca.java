package p206l1;

import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6538r;
import p111g1.InterfaceC6521c;
import p188k1.C9044h;
import p223m1.AbstractC10231b;

/* renamed from: l1.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10024q implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26043a;

    /* renamed from: b */
    private final int f26044b;

    /* renamed from: c */
    private final C9044h f26045c;

    /* renamed from: d */
    private final boolean f26046d;

    public C10024q(String str, int i, C9044h c9044h, boolean z) {
        this.f26043a = str;
        this.f26044b = i;
        this.f26045c = c9044h;
        this.f26046d = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6538r(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public String m12540b() {
        return this.f26043a;
    }

    /* renamed from: c */
    public C9044h m12539c() {
        return this.f26045c;
    }

    /* renamed from: d */
    public boolean m12538d() {
        return this.f26046d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f26043a + ", index=" + this.f26044b + '}';
    }
}