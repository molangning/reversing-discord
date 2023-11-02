package p206l1;

import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6537q;
import p111g1.InterfaceC6521c;
import p188k1.InterfaceC9049m;
import p223m1.AbstractC10231b;

/* renamed from: l1.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10020m implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26029a;

    /* renamed from: b */
    private final InterfaceC9049m<Float, Float> f26030b;

    public C10020m(String str, InterfaceC9049m<Float, Float> interfaceC9049m) {
        this.f26029a = str;
        this.f26030b = interfaceC9049m;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6537q(c6059j0, abstractC10231b, this);
    }

    /* renamed from: b */
    public InterfaceC9049m<Float, Float> m12556b() {
        return this.f26030b;
    }

    /* renamed from: c */
    public String m12555c() {
        return this.f26029a;
    }
}