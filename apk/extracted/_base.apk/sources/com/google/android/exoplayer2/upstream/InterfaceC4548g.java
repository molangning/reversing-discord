package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC4548g {

    /* renamed from: com.google.android.exoplayer2.upstream.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4549a {

        /* renamed from: a */
        public final LoadEventInfo f12381a;

        /* renamed from: b */
        public final MediaLoadData f12382b;

        /* renamed from: c */
        public final IOException f12383c;

        /* renamed from: d */
        public final int f12384d;

        public C4549a(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, int i) {
            this.f12381a = loadEventInfo;
            this.f12382b = mediaLoadData;
            this.f12383c = iOException;
            this.f12384d = i;
        }
    }

    /* renamed from: a */
    long mo28631a(C4549a c4549a);

    /* renamed from: b */
    long mo28630b(C4549a c4549a);

    /* renamed from: c */
    int mo28629c(int i);

    /* renamed from: d */
    void mo28628d(long j);
}
