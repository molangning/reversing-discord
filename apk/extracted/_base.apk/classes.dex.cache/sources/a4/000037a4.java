package p160ih;

import fi.EnumC6448e;
import fi.InterfaceC6449f;
import kotlin.jvm.internal.C9612q;
import p070di.C5954t;
import p270oh.C11115e;
import p305qg.InterfaceC11905b1;

/* renamed from: ih.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7571t implements InterfaceC6449f {

    /* renamed from: b */
    private final InterfaceC7564r f20869b;

    /* renamed from: c */
    private final C5954t<C11115e> f20870c;

    /* renamed from: d */
    private final boolean f20871d;

    /* renamed from: e */
    private final EnumC6448e f20872e;

    public C7571t(InterfaceC7564r binaryClass, C5954t<C11115e> c5954t, boolean z, EnumC6448e abiStability) {
        C9612q.m13917h(binaryClass, "binaryClass");
        C9612q.m13917h(abiStability, "abiStability");
        this.f20869b = binaryClass;
        this.f20870c = c5954t;
        this.f20871d = z;
        this.f20872e = abiStability;
    }

    @Override // fi.InterfaceC6449f
    /* renamed from: a */
    public String mo20396a() {
        return "Class '" + this.f20869b.mo2851n().m7471b().m7458b() + '\'';
    }

    @Override // p305qg.InterfaceC11900a1
    /* renamed from: b */
    public InterfaceC11905b1 mo2835b() {
        InterfaceC11905b1 NO_SOURCE_FILE = InterfaceC11905b1.f30908a;
        C9612q.m13918g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    /* renamed from: d */
    public final InterfaceC7564r m20395d() {
        return this.f20869b;
    }

    public String toString() {
        return C7571t.class.getSimpleName() + ": " + this.f20869b;
    }
}