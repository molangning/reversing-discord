package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p195k8.C9191p0;
import p229m7.InterfaceC10327o0;

/* renamed from: com.google.android.exoplayer2.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4481t0 extends AbstractC4380a {

    /* renamed from: e */
    private final int f11991e;

    /* renamed from: f */
    private final int f11992f;

    /* renamed from: g */
    private final int[] f11993g;

    /* renamed from: h */
    private final int[] f11994h;

    /* renamed from: i */
    private final Timeline[] f11995i;

    /* renamed from: j */
    private final Object[] f11996j;

    /* renamed from: k */
    private final HashMap<Object, Integer> f11997k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4481t0(Collection<? extends InterfaceC4434o0> collection, InterfaceC10327o0 interfaceC10327o0) {
        super(false, interfaceC10327o0);
        int i = 0;
        int size = collection.size();
        this.f11993g = new int[size];
        this.f11994h = new int[size];
        this.f11995i = new Timeline[size];
        this.f11996j = new Object[size];
        this.f11997k = new HashMap<>();
        int i2 = 0;
        int i3 = 0;
        for (InterfaceC4434o0 interfaceC4434o0 : collection) {
            this.f11995i[i3] = interfaceC4434o0.mo29175b();
            this.f11994h[i3] = i;
            this.f11993g[i3] = i2;
            i += this.f11995i[i3].mo11753p();
            i2 += this.f11995i[i3].mo11756i();
            this.f11996j[i3] = interfaceC4434o0.mo29176a();
            this.f11997k.put(this.f11996j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f11991e = i;
        this.f11992f = i2;
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: A */
    protected int mo28977A(int i) {
        return this.f11994h[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: D */
    protected Timeline mo28976D(int i) {
        return this.f11995i[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public List<Timeline> m28975E() {
        return Arrays.asList(this.f11995i);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public int mo11756i() {
        return this.f11992f;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: p */
    public int mo11753p() {
        return this.f11991e;
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: s */
    protected int mo28974s(Object obj) {
        Integer num = this.f11997k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: t */
    protected int mo28973t(int i) {
        return C9191p0.m16247h(this.f11993g, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: u */
    protected int mo28972u(int i) {
        return C9191p0.m16247h(this.f11994h, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: x */
    protected Object mo28971x(int i) {
        return this.f11996j[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC4380a
    /* renamed from: z */
    protected int mo28970z(int i) {
        return this.f11993g[i];
    }
}
