package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p153i8.InterfaceC7451h;
import p153i8.InterfaceC7472x;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DataSource extends InterfaceC7451h {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface Factory {
        DataSource createDataSource();
    }

    /* renamed from: b */
    long mo6322b(C4515a c4515a);

    void close();

    /* renamed from: d */
    Map<String, List<String>> mo6321d();

    /* renamed from: f */
    void mo6320f(InterfaceC7472x interfaceC7472x);

    /* renamed from: m */
    Uri mo6319m();
}