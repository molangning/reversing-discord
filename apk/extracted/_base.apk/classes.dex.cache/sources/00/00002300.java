package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import p314r4.InterfaceC12055g;

/* renamed from: com.facebook.imagepipeline.producers.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3835r0 extends C3770d {
    public C3835r0(ImageRequest imageRequest, ProducerContext producerContext) {
        this(imageRequest, producerContext.getId(), producerContext.mo30857f(), producerContext.mo30854i(), producerContext.mo30862a(), producerContext.mo30847p(), producerContext.mo30849n(), producerContext.mo30853j(), producerContext.mo30852k(), producerContext.mo30859d());
    }

    public C3835r0(ImageRequest imageRequest, String str, InterfaceC3820n0 interfaceC3820n0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, InterfaceC12055g interfaceC12055g) {
        super(imageRequest, str, interfaceC3820n0, obj, requestLevel, z, z2, priority, interfaceC12055g);
    }

    public C3835r0(ImageRequest imageRequest, String str, String str2, InterfaceC3820n0 interfaceC3820n0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, InterfaceC12055g interfaceC12055g) {
        super(imageRequest, str, str2, interfaceC3820n0, obj, requestLevel, z, z2, priority, interfaceC12055g);
    }
}