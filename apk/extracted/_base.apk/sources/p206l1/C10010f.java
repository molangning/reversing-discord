package p206l1;

import java.util.List;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6527i;
import p111g1.InterfaceC6521c;
import p188k1.C9038b;
import p188k1.C9039c;
import p188k1.C9040d;
import p188k1.C9042f;
import p206l1.C10025r;
import p223m1.AbstractC10231b;

/* renamed from: l1.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10010f implements InterfaceC10007c {

    /* renamed from: a */
    private final String f25970a;

    /* renamed from: b */
    private final EnumC10011g f25971b;

    /* renamed from: c */
    private final C9039c f25972c;

    /* renamed from: d */
    private final C9040d f25973d;

    /* renamed from: e */
    private final C9042f f25974e;

    /* renamed from: f */
    private final C9042f f25975f;

    /* renamed from: g */
    private final C9038b f25976g;

    /* renamed from: h */
    private final C10025r.EnumC10027b f25977h;

    /* renamed from: i */
    private final C10025r.EnumC10028c f25978i;

    /* renamed from: j */
    private final float f25979j;

    /* renamed from: k */
    private final List<C9038b> f25980k;

    /* renamed from: l */
    private final C9038b f25981l;

    /* renamed from: m */
    private final boolean f25982m;

    public C10010f(String str, EnumC10011g enumC10011g, C9039c c9039c, C9040d c9040d, C9042f c9042f, C9042f c9042f2, C9038b c9038b, C10025r.EnumC10027b enumC10027b, C10025r.EnumC10028c enumC10028c, float f, List<C9038b> list, C9038b c9038b2, boolean z) {
        this.f25970a = str;
        this.f25971b = enumC10011g;
        this.f25972c = c9039c;
        this.f25973d = c9040d;
        this.f25974e = c9042f;
        this.f25975f = c9042f2;
        this.f25976g = c9038b;
        this.f25977h = enumC10027b;
        this.f25978i = enumC10028c;
        this.f25979j = f;
        this.f25980k = list;
        this.f25981l = c9038b2;
        this.f25982m = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6527i(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public C10025r.EnumC10027b m12603b() {
        return this.f25977h;
    }

    /* renamed from: c */
    public C9038b m12602c() {
        return this.f25981l;
    }

    /* renamed from: d */
    public C9042f m12601d() {
        return this.f25975f;
    }

    /* renamed from: e */
    public C9039c m12600e() {
        return this.f25972c;
    }

    /* renamed from: f */
    public EnumC10011g m12599f() {
        return this.f25971b;
    }

    /* renamed from: g */
    public C10025r.EnumC10028c m12598g() {
        return this.f25978i;
    }

    /* renamed from: h */
    public List<C9038b> m12597h() {
        return this.f25980k;
    }

    /* renamed from: i */
    public float m12596i() {
        return this.f25979j;
    }

    /* renamed from: j */
    public String m12595j() {
        return this.f25970a;
    }

    /* renamed from: k */
    public C9040d m12594k() {
        return this.f25973d;
    }

    /* renamed from: l */
    public C9042f m12593l() {
        return this.f25974e;
    }

    /* renamed from: m */
    public C9038b m12592m() {
        return this.f25976g;
    }

    /* renamed from: n */
    public boolean m12591n() {
        return this.f25982m;
    }
}
