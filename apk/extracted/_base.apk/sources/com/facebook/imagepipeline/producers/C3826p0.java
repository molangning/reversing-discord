package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p380v4.C13065e;
import p394w2.C13379j;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3826p0 extends AbstractC3767c0 {

    /* renamed from: c */
    private final ContentResolver f10754c;

    public C3826p0(Executor executor, InterfaceC14080h interfaceC14080h, ContentResolver contentResolver) {
        super(executor, interfaceC14080h);
        this.f10754c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        InputStream openInputStream = this.f10754c.openInputStream(imageRequest.getSourceUri());
        C13379j.m2676h(openInputStream, "ContentResolver returned null InputStream");
        return m30865e(openInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "QualifiedResourceFetchProducer";
    }
}
