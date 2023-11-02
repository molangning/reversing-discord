package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p314r4.InterfaceC12055g;
import p380v4.EnumC13066f;
import p394w2.C13373g;

/* renamed from: com.facebook.imagepipeline.producers.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3770d implements ProducerContext {

    /* renamed from: o */
    public static final Set<String> f10586o = C13373g.m2693d("id", "uri_source");

    /* renamed from: a */
    private final ImageRequest f10587a;

    /* renamed from: b */
    private final String f10588b;

    /* renamed from: c */
    private final String f10589c;

    /* renamed from: d */
    private final InterfaceC3820n0 f10590d;

    /* renamed from: e */
    private final Object f10591e;

    /* renamed from: f */
    private final ImageRequest.RequestLevel f10592f;

    /* renamed from: g */
    private final Map<String, Object> f10593g;

    /* renamed from: h */
    private boolean f10594h;

    /* renamed from: i */
    private Priority f10595i;

    /* renamed from: j */
    private boolean f10596j;

    /* renamed from: k */
    private boolean f10597k;

    /* renamed from: l */
    private final List<InterfaceC3817m0> f10598l;

    /* renamed from: m */
    private final InterfaceC12055g f10599m;

    /* renamed from: n */
    private EnumC13066f f10600n;

    public C3770d(ImageRequest imageRequest, String str, InterfaceC3820n0 interfaceC3820n0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, InterfaceC12055g interfaceC12055g) {
        this(imageRequest, str, null, interfaceC3820n0, obj, requestLevel, z, z2, priority, interfaceC12055g);
    }

    /* renamed from: q */
    public static void m30846q(List<InterfaceC3817m0> list) {
        if (list == null) {
            return;
        }
        for (InterfaceC3817m0 interfaceC3817m0 : list) {
            interfaceC3817m0.mo30638b();
        }
    }

    /* renamed from: r */
    public static void m30845r(List<InterfaceC3817m0> list) {
        if (list == null) {
            return;
        }
        for (InterfaceC3817m0 interfaceC3817m0 : list) {
            interfaceC3817m0.mo30662a();
        }
    }

    /* renamed from: s */
    public static void m30844s(List<InterfaceC3817m0> list) {
        if (list == null) {
            return;
        }
        for (InterfaceC3817m0 interfaceC3817m0 : list) {
            interfaceC3817m0.mo30695d();
        }
    }

    /* renamed from: t */
    public static void m30843t(List<InterfaceC3817m0> list) {
        if (list == null) {
            return;
        }
        for (InterfaceC3817m0 interfaceC3817m0 : list) {
            interfaceC3817m0.mo30696c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: a */
    public Object mo30862a() {
        return this.f10591e;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: b */
    public void mo30861b(String str, Object obj) {
        if (f10586o.contains(str)) {
            return;
        }
        this.f10593g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: c */
    public void mo30860c(InterfaceC3817m0 interfaceC3817m0) {
        boolean z;
        synchronized (this) {
            this.f10598l.add(interfaceC3817m0);
            z = this.f10597k;
        }
        if (z) {
            interfaceC3817m0.mo30638b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: d */
    public InterfaceC12055g mo30859d() {
        return this.f10599m;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: e */
    public void mo30858e(String str, String str2) {
        this.f10593g.put("origin", str);
        this.f10593g.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: f */
    public String mo30857f() {
        return this.f10589c;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: g */
    public void mo30856g(String str) {
        mo30858e(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public Map<String, Object> getExtras() {
        return this.f10593g;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public String getId() {
        return this.f10588b;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: h */
    public void mo30855h(EnumC13066f enumC13066f) {
        this.f10600n = enumC13066f;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: i */
    public InterfaceC3820n0 mo30854i() {
        return this.f10590d;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: j */
    public synchronized boolean mo30853j() {
        return this.f10596j;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: k */
    public synchronized Priority mo30852k() {
        return this.f10595i;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: l */
    public ImageRequest mo30851l() {
        return this.f10587a;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: m */
    public void mo30850m(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            mo30861b(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: n */
    public synchronized boolean mo30849n() {
        return this.f10594h;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: o */
    public <T> T mo30848o(String str) {
        return (T) this.f10593g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    /* renamed from: p */
    public ImageRequest.RequestLevel mo30847p() {
        return this.f10592f;
    }

    /* renamed from: u */
    public void m30842u() {
        m30846q(m30841v());
    }

    /* renamed from: v */
    public synchronized List<InterfaceC3817m0> m30841v() {
        if (this.f10597k) {
            return null;
        }
        this.f10597k = true;
        return new ArrayList(this.f10598l);
    }

    /* renamed from: w */
    public synchronized List<InterfaceC3817m0> m30840w(boolean z) {
        if (z == this.f10596j) {
            return null;
        }
        this.f10596j = z;
        return new ArrayList(this.f10598l);
    }

    /* renamed from: x */
    public synchronized List<InterfaceC3817m0> m30839x(boolean z) {
        if (z == this.f10594h) {
            return null;
        }
        this.f10594h = z;
        return new ArrayList(this.f10598l);
    }

    /* renamed from: y */
    public synchronized List<InterfaceC3817m0> m30838y(Priority priority) {
        if (priority == this.f10595i) {
            return null;
        }
        this.f10595i = priority;
        return new ArrayList(this.f10598l);
    }

    public C3770d(ImageRequest imageRequest, String str, String str2, InterfaceC3820n0 interfaceC3820n0, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, InterfaceC12055g interfaceC12055g) {
        this.f10600n = EnumC13066f.NOT_SET;
        this.f10587a = imageRequest;
        this.f10588b = str;
        HashMap hashMap = new HashMap();
        this.f10593g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", imageRequest == null ? "null-request" : imageRequest.getSourceUri());
        this.f10589c = str2;
        this.f10590d = interfaceC3820n0;
        this.f10591e = obj;
        this.f10592f = requestLevel;
        this.f10594h = z;
        this.f10595i = priority;
        this.f10596j = z2;
        this.f10597k = false;
        this.f10598l = new ArrayList();
        this.f10599m = interfaceC12055g;
    }
}