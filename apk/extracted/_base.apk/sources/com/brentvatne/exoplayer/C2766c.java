package com.brentvatne.exoplayer;

import android.content.Context;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import p153i8.C7458o;

/* renamed from: com.brentvatne.exoplayer.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2766c implements InterfaceC2771f {

    /* renamed from: a */
    private final C7458o f7439a;

    public C2766c(Context context) {
        this.f7439a = new C7458o.C7460b(context).m20626a();
    }

    @Override // com.brentvatne.exoplayer.InterfaceC2771f
    /* renamed from: a */
    public InterfaceC4548g mo32413a(int i) {
        return new C4538d(i);
    }

    @Override // com.brentvatne.exoplayer.InterfaceC2771f
    /* renamed from: b */
    public C7458o mo32412b() {
        return this.f7439a;
    }
}
