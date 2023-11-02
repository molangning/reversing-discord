package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p397w5.AbstractC13400h;
import p397w5.InterfaceC13394d;
import p397w5.InterfaceC13406m;

@Keep
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CctBackendFactory implements InterfaceC13394d {
    @Override // p397w5.InterfaceC13394d
    public InterfaceC13406m create(AbstractC13400h abstractC13400h) {
        return new C4357d(abstractC13400h.mo2644b(), abstractC13400h.mo2641e(), abstractC13400h.mo2642d());
    }
}
