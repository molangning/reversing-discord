package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import p394w2.InterfaceC13370d;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p455z2.InterfaceC14074c;

@TargetApi(27)
@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AshmemMemoryChunkPool extends AbstractC3730h {
    @InterfaceC13370d
    public AshmemMemoryChunkPool(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0) {
        super(interfaceC14074c, c13905z, interfaceC13875a0);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3730h, com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: F */
    public C3718a mo30971g(int i) {
        return new C3718a(i);
    }
}