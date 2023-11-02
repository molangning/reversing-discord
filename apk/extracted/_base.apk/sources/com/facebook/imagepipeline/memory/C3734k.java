package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import p004a3.C0015b;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.memory.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C3734k<V> extends C3723c<V> {

    /* renamed from: f */
    private LinkedList<C0015b<V>> f10521f;

    public C3734k(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f10521f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.C3723c
    /* renamed from: a */
    void mo30960a(V v) {
        C0015b<V> poll = this.f10521f.poll();
        if (poll == null) {
            poll = new C0015b<>();
        }
        poll.m41398c(v);
        this.f10507c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.C3723c
    /* renamed from: g */
    public V mo30959g() {
        C0015b<V> c0015b = (C0015b) this.f10507c.poll();
        C13379j.m2677g(c0015b);
        V m41399b = c0015b.m41399b();
        c0015b.m41400a();
        this.f10521f.add(c0015b);
        return m41399b;
    }
}
