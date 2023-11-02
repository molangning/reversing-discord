package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import p380v4.C13065e;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3771d0 extends AbstractC3767c0 {
    public C3771d0(Executor executor, InterfaceC14080h interfaceC14080h) {
        super(executor, interfaceC14080h);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        return m30865e(new FileInputStream(imageRequest.getSourceFile().toString()), (int) imageRequest.getSourceFile().length());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "LocalFileFetchProducer";
    }
}
