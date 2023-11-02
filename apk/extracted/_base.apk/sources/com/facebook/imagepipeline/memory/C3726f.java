package com.facebook.imagepipeline.memory;

import com.facebook.common.references.CloseableReference;
import p004a3.InterfaceC0016c;
import p394w2.C13379j;
import p437y4.C13899v;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p455z2.InterfaceC14074c;

/* renamed from: com.facebook.imagepipeline.memory.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3726f {

    /* renamed from: a */
    private final InterfaceC0016c<byte[]> f10513a;

    /* renamed from: b */
    final C3728b f10514b;

    /* renamed from: com.facebook.imagepipeline.memory.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3727a implements InterfaceC0016c<byte[]> {
        C3727a() {
        }

        @Override // p004a3.InterfaceC0016c
        /* renamed from: a */
        public void release(byte[] bArr) {
            C3726f.this.m30982b(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3728b extends C3729g {
        public C3728b(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0) {
            super(interfaceC14074c, c13905z, interfaceC13875a0);
        }

        @Override // com.facebook.imagepipeline.memory.AbstractC3719b
        /* renamed from: x */
        C3723c<byte[]> mo30980x(int i) {
            return new C3734k(mo30967p(i), this.f10495c.f35784g, 0);
        }
    }

    public C3726f(InterfaceC14074c interfaceC14074c, C13905z c13905z) {
        boolean z;
        if (c13905z.f35784g > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        this.f10514b = new C3728b(interfaceC14074c, c13905z, C13899v.m1266h());
        this.f10513a = new C3727a();
    }

    /* renamed from: a */
    public CloseableReference<byte[]> m30983a(int i) {
        return CloseableReference.m31724U(this.f10514b.get(i), this.f10513a);
    }

    /* renamed from: b */
    public void m30982b(byte[] bArr) {
        this.f10514b.release(bArr);
    }
}
