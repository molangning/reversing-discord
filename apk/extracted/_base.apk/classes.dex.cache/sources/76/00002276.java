package com.facebook.imagepipeline.memory;

import p394w2.InterfaceC13370d;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p455z2.InterfaceC14074c;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeMemoryChunkPool extends AbstractC3730h {
    @InterfaceC13370d
    public NativeMemoryChunkPool(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0) {
        super(interfaceC14074c, c13905z, interfaceC13875a0);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3730h, com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: F */
    public NativeMemoryChunk mo30971g(int i) {
        return new NativeMemoryChunk(i);
    }
}