package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import p380v4.C13065e;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3868z extends AbstractC3767c0 {

    /* renamed from: c */
    private final AssetManager f10867c;

    public C3868z(Executor executor, InterfaceC14080h interfaceC14080h, AssetManager assetManager) {
        super(executor, interfaceC14080h);
        this.f10867c = assetManager;
    }

    /* renamed from: g */
    private static String m30601g(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().getPath().substring(1);
    }

    /* renamed from: h */
    private int m30600h(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f10867c.openFd(m30601g(imageRequest));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
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

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        return m30865e(this.f10867c.open(m30601g(imageRequest), 2), m30600h(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "LocalAssetFetchProducer";
    }
}
