package com.facebook.imagepipeline.nativecode;

import p025b5.InterfaceC2124c;
import p025b5.InterfaceC2125d;
import p170j4.C8792b;
import p170j4.C8793c;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeJpegTranscoderFactory implements InterfaceC2125d {

    /* renamed from: a */
    private final int f10528a;

    /* renamed from: b */
    private final boolean f10529b;

    /* renamed from: c */
    private final boolean f10530c;

    @InterfaceC13370d
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f10528a = i;
        this.f10529b = z;
        this.f10530c = z2;
    }

    @Override // p025b5.InterfaceC2125d
    @InterfaceC13370d
    public InterfaceC2124c createImageTranscoder(C8793c c8793c, boolean z) {
        if (c8793c != C8792b.f23081a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f10528a, this.f10529b, this.f10530c);
    }
}