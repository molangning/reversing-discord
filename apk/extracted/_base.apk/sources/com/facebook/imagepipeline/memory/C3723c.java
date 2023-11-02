package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: com.facebook.imagepipeline.memory.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C3723c<V> {

    /* renamed from: a */
    public final int f10505a;

    /* renamed from: b */
    public final int f10506b;

    /* renamed from: c */
    final Queue f10507c;

    /* renamed from: d */
    private final boolean f10508d;

    /* renamed from: e */
    private int f10509e;

    public C3723c(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2675i(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13379j.m2675i(z3);
        C13379j.m2675i(i3 >= 0);
        this.f10505a = i;
        this.f10506b = i2;
        this.f10507c = new LinkedList();
        this.f10509e = i3;
        this.f10508d = z;
    }

    /* renamed from: a */
    void mo30960a(V v) {
        this.f10507c.add(v);
    }

    /* renamed from: b */
    public void m30996b() {
        boolean z;
        if (this.f10509e > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2675i(z);
        this.f10509e--;
    }

    @Deprecated
    /* renamed from: c */
    public V m30995c() {
        V mo30959g = mo30959g();
        if (mo30959g != null) {
            this.f10509e++;
        }
        return mo30959g;
    }

    /* renamed from: d */
    int m30994d() {
        return this.f10507c.size();
    }

    /* renamed from: e */
    public void m30993e() {
        this.f10509e++;
    }

    /* renamed from: f */
    public boolean m30992f() {
        return this.f10509e + m30994d() > this.f10506b;
    }

    /* renamed from: g */
    public V mo30959g() {
        return (V) this.f10507c.poll();
    }

    /* renamed from: h */
    public void m30991h(V v) {
        C13379j.m2677g(v);
        boolean z = false;
        if (this.f10508d) {
            if (this.f10509e > 0) {
                z = true;
            }
            C13379j.m2675i(z);
            this.f10509e--;
            mo30960a(v);
            return;
        }
        int i = this.f10509e;
        if (i > 0) {
            this.f10509e = i - 1;
            mo30960a(v);
            return;
        }
        C13677a.m1852l("BUCKET", "Tried to release value %s from an empty bucket!", v);
    }
}
