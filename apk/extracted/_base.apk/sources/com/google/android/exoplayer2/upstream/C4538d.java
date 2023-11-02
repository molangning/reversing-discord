package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import p151i6.C7402m;
import p153i8.C7466s;

/* renamed from: com.google.android.exoplayer2.upstream.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4538d implements InterfaceC4548g {

    /* renamed from: a */
    private final int f12368a;

    public C4538d() {
        this(-1);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC4548g
    /* renamed from: a */
    public long mo28631a(InterfaceC4548g.C4549a c4549a) {
        IOException iOException = c4549a.f12383c;
        if (!(iOException instanceof C7402m) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof InterfaceC4540f.C4542b) && !(iOException instanceof C4550h.C4558h)) {
            return Math.min((c4549a.f12384d - 1) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC4548g
    /* renamed from: b */
    public long mo28630b(InterfaceC4548g.C4549a c4549a) {
        IOException iOException = c4549a.f12383c;
        if (!(iOException instanceof InterfaceC4540f.C4546f)) {
            return -9223372036854775807L;
        }
        int i = ((InterfaceC4540f.C4546f) iOException).f12375l;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return -9223372036854775807L;
        }
        return 60000L;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC4548g
    /* renamed from: c */
    public int mo28629c(int i) {
        int i2 = this.f12368a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC4548g
    /* renamed from: d */
    public /* synthetic */ void mo28628d(long j) {
        C7466s.m20616a(this, j);
    }

    public C4538d(int i) {
        this.f12368a = i;
    }
}
