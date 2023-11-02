package p206l1;

import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6541u;
import p111g1.InterfaceC6521c;
import p188k1.C9038b;
import p223m1.AbstractC10231b;

/* renamed from: l1.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10029s implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26067a;

    /* renamed from: b */
    private final EnumC10030a f26068b;

    /* renamed from: c */
    private final C9038b f26069c;

    /* renamed from: d */
    private final C9038b f26070d;

    /* renamed from: e */
    private final C9038b f26071e;

    /* renamed from: f */
    private final boolean f26072f;

    /* renamed from: l1.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10030a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: b */
        public static EnumC10030a m12515b(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public C10029s(String str, EnumC10030a enumC10030a, C9038b c9038b, C9038b c9038b2, C9038b c9038b3, boolean z) {
        this.f26067a = str;
        this.f26068b = enumC10030a;
        this.f26069c = c9038b;
        this.f26070d = c9038b2;
        this.f26071e = c9038b3;
        this.f26072f = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6541u(abstractC10231b, this);
    }

    /* renamed from: b */
    public C9038b m12522b() {
        return this.f26070d;
    }

    /* renamed from: c */
    public String m12521c() {
        return this.f26067a;
    }

    /* renamed from: d */
    public C9038b m12520d() {
        return this.f26071e;
    }

    /* renamed from: e */
    public C9038b m12519e() {
        return this.f26069c;
    }

    /* renamed from: f */
    public EnumC10030a m12518f() {
        return this.f26068b;
    }

    /* renamed from: g */
    public boolean m12517g() {
        return this.f26072f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f26069c + ", end: " + this.f26070d + ", offset: " + this.f26071e + "}";
    }
}
