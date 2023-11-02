package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p314r4.InterfaceC12055g;
import p380v4.EnumC13066f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ProducerContext {
    /* renamed from: a */
    Object mo30862a();

    /* renamed from: b */
    <E> void mo30861b(String str, E e);

    /* renamed from: c */
    void mo30860c(InterfaceC3817m0 interfaceC3817m0);

    /* renamed from: d */
    InterfaceC12055g mo30859d();

    /* renamed from: e */
    void mo30858e(String str, String str2);

    /* renamed from: f */
    String mo30857f();

    /* renamed from: g */
    void mo30856g(String str);

    Map<String, Object> getExtras();

    String getId();

    /* renamed from: h */
    void mo30855h(EnumC13066f enumC13066f);

    /* renamed from: i */
    InterfaceC3820n0 mo30854i();

    /* renamed from: j */
    boolean mo30853j();

    /* renamed from: k */
    Priority mo30852k();

    /* renamed from: l */
    ImageRequest mo30851l();

    /* renamed from: m */
    void mo30850m(Map<String, ?> map);

    /* renamed from: n */
    boolean mo30849n();

    /* renamed from: o */
    <E> E mo30848o(String str);

    /* renamed from: p */
    ImageRequest.RequestLevel mo30847p();
}
