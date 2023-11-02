package p206l1;

import android.graphics.Path;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6525g;
import p111g1.InterfaceC6521c;
import p188k1.C9037a;
import p188k1.C9040d;
import p223m1.AbstractC10231b;

/* renamed from: l1.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10022o implements InterfaceC10007c {

    /* renamed from: a */
    private final boolean f26034a;

    /* renamed from: b */
    private final Path.FillType f26035b;

    /* renamed from: c */
    private final String f26036c;

    /* renamed from: d */
    private final C9037a f26037d;

    /* renamed from: e */
    private final C9040d f26038e;

    /* renamed from: f */
    private final boolean f26039f;

    public C10022o(String str, boolean z, Path.FillType fillType, C9037a c9037a, C9040d c9040d, boolean z2) {
        this.f26036c = str;
        this.f26034a = z;
        this.f26035b = fillType;
        this.f26037d = c9037a;
        this.f26038e = c9040d;
        this.f26039f = z2;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6525g(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public C9037a m12548b() {
        return this.f26037d;
    }

    /* renamed from: c */
    public Path.FillType m12547c() {
        return this.f26035b;
    }

    /* renamed from: d */
    public String m12546d() {
        return this.f26036c;
    }

    /* renamed from: e */
    public C9040d m12545e() {
        return this.f26038e;
    }

    /* renamed from: f */
    public boolean m12544f() {
        return this.f26039f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f26034a + '}';
    }
}