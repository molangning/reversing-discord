package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import p461z8.AbstractC14127g;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4632j implements AbstractC14127g.InterfaceC14128a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f12726a;

    /* renamed from: b */
    final /* synthetic */ C4636l f12727b;

    public C4632j(C4636l c4636l, BasePendingResult basePendingResult) {
        this.f12727b = c4636l;
        this.f12726a = basePendingResult;
    }

    @Override // p461z8.AbstractC14127g.InterfaceC14128a
    /* renamed from: a */
    public final void mo601a(Status status) {
        Map map;
        map = this.f12727b.f12733a;
        map.remove(this.f12726a);
    }
}