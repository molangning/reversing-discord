package p206l1;

import android.graphics.PointF;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6533n;
import p111g1.InterfaceC6521c;
import p188k1.C9038b;
import p188k1.InterfaceC9049m;
import p223m1.AbstractC10231b;

/* renamed from: l1.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10016j implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26004a;

    /* renamed from: b */
    private final EnumC10017a f26005b;

    /* renamed from: c */
    private final C9038b f26006c;

    /* renamed from: d */
    private final InterfaceC9049m<PointF, PointF> f26007d;

    /* renamed from: e */
    private final C9038b f26008e;

    /* renamed from: f */
    private final C9038b f26009f;

    /* renamed from: g */
    private final C9038b f26010g;

    /* renamed from: h */
    private final C9038b f26011h;

    /* renamed from: i */
    private final C9038b f26012i;

    /* renamed from: j */
    private final boolean f26013j;

    /* renamed from: k */
    private final boolean f26014k;

    /* renamed from: l1.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10017a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: j */
        private final int f26018j;

        EnumC10017a(int i) {
            this.f26018j = i;
        }

        /* renamed from: b */
        public static EnumC10017a m12567b(int i) {
            EnumC10017a[] values;
            for (EnumC10017a enumC10017a : values()) {
                if (enumC10017a.f26018j == i) {
                    return enumC10017a;
                }
            }
            return null;
        }
    }

    public C10016j(String str, EnumC10017a enumC10017a, C9038b c9038b, InterfaceC9049m<PointF, PointF> interfaceC9049m, C9038b c9038b2, C9038b c9038b3, C9038b c9038b4, C9038b c9038b5, C9038b c9038b6, boolean z, boolean z2) {
        this.f26004a = str;
        this.f26005b = enumC10017a;
        this.f26006c = c9038b;
        this.f26007d = interfaceC9049m;
        this.f26008e = c9038b2;
        this.f26009f = c9038b3;
        this.f26010g = c9038b4;
        this.f26011h = c9038b5;
        this.f26012i = c9038b6;
        this.f26013j = z;
        this.f26014k = z2;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6533n(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public C9038b m12579b() {
        return this.f26009f;
    }

    /* renamed from: c */
    public C9038b m12578c() {
        return this.f26011h;
    }

    /* renamed from: d */
    public String m12577d() {
        return this.f26004a;
    }

    /* renamed from: e */
    public C9038b m12576e() {
        return this.f26010g;
    }

    /* renamed from: f */
    public C9038b m12575f() {
        return this.f26012i;
    }

    /* renamed from: g */
    public C9038b m12574g() {
        return this.f26006c;
    }

    /* renamed from: h */
    public InterfaceC9049m<PointF, PointF> m12573h() {
        return this.f26007d;
    }

    /* renamed from: i */
    public C9038b m12572i() {
        return this.f26008e;
    }

    /* renamed from: j */
    public EnumC10017a m12571j() {
        return this.f26005b;
    }

    /* renamed from: k */
    public boolean m12570k() {
        return this.f26013j;
    }

    /* renamed from: l */
    public boolean m12569l() {
        return this.f26014k;
    }
}
