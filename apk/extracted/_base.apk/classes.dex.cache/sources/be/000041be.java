package p206l1;

import p188k1.C9040d;
import p188k1.C9044h;

/* renamed from: l1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10012h {

    /* renamed from: a */
    private final EnumC10013a f25986a;

    /* renamed from: b */
    private final C9044h f25987b;

    /* renamed from: c */
    private final C9040d f25988c;

    /* renamed from: d */
    private final boolean f25989d;

    /* renamed from: l1.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10013a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C10012h(EnumC10013a enumC10013a, C9044h c9044h, C9040d c9040d, boolean z) {
        this.f25986a = enumC10013a;
        this.f25987b = c9044h;
        this.f25988c = c9040d;
        this.f25989d = z;
    }

    /* renamed from: a */
    public EnumC10013a m12589a() {
        return this.f25986a;
    }

    /* renamed from: b */
    public C9044h m12588b() {
        return this.f25987b;
    }

    /* renamed from: c */
    public C9040d m12587c() {
        return this.f25988c;
    }

    /* renamed from: d */
    public boolean m12586d() {
        return this.f25989d;
    }
}