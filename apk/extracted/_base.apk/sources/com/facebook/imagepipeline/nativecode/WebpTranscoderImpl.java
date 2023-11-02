package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import p094f3.C6308c;
import p170j4.C8792b;
import p170j4.C8793c;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WebpTranscoderImpl implements InterfaceC3743i {
    @InterfaceC13370d
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    @InterfaceC13370d
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    @Override // com.facebook.imagepipeline.nativecode.InterfaceC3743i
    /* renamed from: a */
    public void mo30939a(InputStream inputStream, OutputStream outputStream) {
        C3742h.m30940a();
        nativeTranscodeWebpToPng((InputStream) C13379j.m2677g(inputStream), (OutputStream) C13379j.m2677g(outputStream));
    }

    @Override // com.facebook.imagepipeline.nativecode.InterfaceC3743i
    /* renamed from: b */
    public void mo30938b(InputStream inputStream, OutputStream outputStream, int i) {
        C3742h.m30940a();
        nativeTranscodeWebpToJpeg((InputStream) C13379j.m2677g(inputStream), (OutputStream) C13379j.m2677g(outputStream), i);
    }

    @Override // com.facebook.imagepipeline.nativecode.InterfaceC3743i
    /* renamed from: c */
    public boolean mo30937c(C8793c c8793c) {
        if (c8793c == C8792b.f23086f) {
            return true;
        }
        if (c8793c != C8792b.f23087g && c8793c != C8792b.f23088h && c8793c != C8792b.f23089i) {
            if (c8793c == C8792b.f23090j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
        return C6308c.f17812c;
    }
}
