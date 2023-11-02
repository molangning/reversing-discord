package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import p359u2.C12818a;
import p380v4.C13065e;
import p394w2.C13379j;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3809l extends AbstractC3767c0 {
    public C3809l(InterfaceC14080h interfaceC14080h) {
        super(C12818a.m3873a(), interfaceC14080h);
    }

    /* renamed from: g */
    static byte[] m30724g(String str) {
        C13379j.m2682b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (m30723h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        C13379j.m2677g(decode);
        return decode.getBytes();
    }

    /* renamed from: h */
    static boolean m30723h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: d */
    protected C13065e mo30603d(ImageRequest imageRequest) {
        byte[] m30724g = m30724g(imageRequest.getSourceUri().toString());
        return m30866c(new ByteArrayInputStream(m30724g), m30724g.length);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3767c0
    /* renamed from: f */
    protected String mo30602f() {
        return "DataFetchProducer";
    }
}
