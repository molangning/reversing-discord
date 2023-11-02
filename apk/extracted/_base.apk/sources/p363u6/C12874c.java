package p363u6;

import p195k8.C9149a;
import p296q6.C11761t;
import p296q6.InterfaceC11747j;

/* renamed from: u6.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12874c extends C11761t {

    /* renamed from: b */
    private final long f33512b;

    public C12874c(InterfaceC11747j interfaceC11747j, long j) {
        super(interfaceC11747j);
        boolean z;
        if (interfaceC11747j.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f33512b = j;
    }

    @Override // p296q6.C11761t, p296q6.InterfaceC11747j
    public long getLength() {
        return super.getLength() - this.f33512b;
    }

    @Override // p296q6.C11761t, p296q6.InterfaceC11747j
    public long getPosition() {
        return super.getPosition() - this.f33512b;
    }

    @Override // p296q6.C11761t, p296q6.InterfaceC11747j
    /* renamed from: h */
    public long mo3742h() {
        return super.mo3742h() - this.f33512b;
    }
}
