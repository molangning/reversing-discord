package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import p380v4.C13065e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FetchState {

    /* renamed from: a */
    private final Consumer<C13065e> f10547a;

    /* renamed from: b */
    private final ProducerContext f10548b;

    /* renamed from: c */
    private long f10549c = 0;

    /* renamed from: d */
    private int f10550d;

    /* renamed from: e */
    private BytesRange f10551e;

    public FetchState(Consumer<C13065e> consumer, ProducerContext producerContext) {
        this.f10547a = consumer;
        this.f10548b = producerContext;
    }

    /* renamed from: a */
    public Consumer<C13065e> m30917a() {
        return this.f10547a;
    }

    /* renamed from: b */
    public ProducerContext m30916b() {
        return this.f10548b;
    }

    /* renamed from: c */
    public long m30915c() {
        return this.f10549c;
    }

    /* renamed from: d */
    public InterfaceC3820n0 m30914d() {
        return this.f10548b.mo30854i();
    }

    /* renamed from: e */
    public int m30913e() {
        return this.f10550d;
    }

    /* renamed from: f */
    public BytesRange m30912f() {
        return this.f10551e;
    }

    /* renamed from: g */
    public Uri m30911g() {
        return this.f10548b.mo30851l().getSourceUri();
    }

    /* renamed from: h */
    public void m30910h(long j) {
        this.f10549c = j;
    }

    /* renamed from: i */
    public void m30909i(int i) {
        this.f10550d = i;
    }

    /* renamed from: j */
    public void m30908j(BytesRange bytesRange) {
        this.f10551e = bytesRange;
    }
}