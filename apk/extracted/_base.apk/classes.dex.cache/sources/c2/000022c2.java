package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import p380v4.C13065e;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3773e0 extends AbstractC3767c0 {

    /* renamed from: c */
    private final Resources f10601c;

    public C3773e0(Executor executor, InterfaceC14080h interfaceC14080h, Resources resources) {
        super(executor, interfaceC14080h);
        this.f10601c = resources;
    }

    /* renamed from: g */
    private int m30837g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f10601c.openRawResourceFd(m30836h(imageRequest));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: h */
    private static int m30836h(ImageRequest imageRequest) {
        return Integer.parseInt(imageRequest.getSourceUri().getPath().substring(1));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        return m30865e(this.f10601c.openRawResource(m30836h(imageRequest)), m30837g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "LocalResourceFetchProducer";
    }
}