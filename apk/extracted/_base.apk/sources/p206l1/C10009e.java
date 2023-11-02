package p206l1;

import android.graphics.Path;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6526h;
import p111g1.InterfaceC6521c;
import p188k1.C9038b;
import p188k1.C9039c;
import p188k1.C9040d;
import p188k1.C9042f;
import p223m1.AbstractC10231b;

/* renamed from: l1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10009e implements InterfaceC10007c {

    /* renamed from: a */
    private final EnumC10011g f25960a;

    /* renamed from: b */
    private final Path.FillType f25961b;

    /* renamed from: c */
    private final C9039c f25962c;

    /* renamed from: d */
    private final C9040d f25963d;

    /* renamed from: e */
    private final C9042f f25964e;

    /* renamed from: f */
    private final C9042f f25965f;

    /* renamed from: g */
    private final String f25966g;

    /* renamed from: h */
    private final C9038b f25967h;

    /* renamed from: i */
    private final C9038b f25968i;

    /* renamed from: j */
    private final boolean f25969j;

    public C10009e(String str, EnumC10011g enumC10011g, Path.FillType fillType, C9039c c9039c, C9040d c9040d, C9042f c9042f, C9042f c9042f2, C9038b c9038b, C9038b c9038b2, boolean z) {
        this.f25960a = enumC10011g;
        this.f25961b = fillType;
        this.f25962c = c9039c;
        this.f25963d = c9040d;
        this.f25964e = c9042f;
        this.f25965f = c9042f2;
        this.f25966g = str;
        this.f25967h = c9038b;
        this.f25968i = c9038b2;
        this.f25969j = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6526h(c6059j0, c6062k, abstractC10231b, this);
    }

    /* renamed from: b */
    public C9042f m12611b() {
        return this.f25965f;
    }

    /* renamed from: c */
    public Path.FillType m12610c() {
        return this.f25961b;
    }

    /* renamed from: d */
    public C9039c m12609d() {
        return this.f25962c;
    }

    /* renamed from: e */
    public EnumC10011g m12608e() {
        return this.f25960a;
    }

    /* renamed from: f */
    public String m12607f() {
        return this.f25966g;
    }

    /* renamed from: g */
    public C9040d m12606g() {
        return this.f25963d;
    }

    /* renamed from: h */
    public C9042f m12605h() {
        return this.f25964e;
    }

    /* renamed from: i */
    public boolean m12604i() {
        return this.f25969j;
    }
}
