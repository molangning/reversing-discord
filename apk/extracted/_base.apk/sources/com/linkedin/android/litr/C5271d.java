package com.linkedin.android.litr;

import com.linkedin.android.litr.p050io.MediaRange;
import java.util.List;
import p266od.InterfaceC11081a;
import p266od.InterfaceC11082b;

/* renamed from: com.linkedin.android.litr.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5271d {

    /* renamed from: a */
    public final int f14993a;

    /* renamed from: b */
    public final List<InterfaceC11082b> f14994b;

    /* renamed from: c */
    public final List<InterfaceC11081a> f14995c;

    /* renamed from: d */
    public final MediaRange f14996d;

    /* renamed from: e */
    public final boolean f14997e;

    /* renamed from: f */
    public final boolean f14998f;

    /* renamed from: com.linkedin.android.litr.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5273b {

        /* renamed from: a */
        private int f14999a = 100;

        /* renamed from: b */
        private List<InterfaceC11082b> f15000b;

        /* renamed from: c */
        private List<InterfaceC11081a> f15001c;

        /* renamed from: d */
        private MediaRange f15002d;

        /* renamed from: e */
        private boolean f15003e;

        /* renamed from: f */
        private boolean f15004f;

        /* renamed from: a */
        public C5271d m25545a() {
            return new C5271d(this.f14999a, this.f15000b, this.f15001c, this.f15002d, this.f15003e, this.f15004f);
        }
    }

    private C5271d(int i, List<InterfaceC11082b> list, List<InterfaceC11081a> list2, MediaRange mediaRange, boolean z, boolean z2) {
        this.f14993a = i;
        this.f14994b = list;
        this.f14995c = list2;
        this.f14996d = mediaRange == null ? new MediaRange(0L, Long.MAX_VALUE) : mediaRange;
        this.f14997e = z;
        this.f14998f = z2;
    }
}
