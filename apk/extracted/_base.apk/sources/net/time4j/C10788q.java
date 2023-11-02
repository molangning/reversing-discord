package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10788q<T extends AbstractC7665q<T>> implements InterfaceC7670v<T> {

    /* renamed from: j */
    private final char f28161j;

    /* renamed from: k */
    private final boolean f28162k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10788q(char c, boolean z) {
        this.f28161j = c;
        this.f28162k = z;
    }

    @Override // p162ij.InterfaceC7670v
    /* renamed from: a */
    public T apply(T t) {
        if (this.f28161j == '9') {
            return t;
        }
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k0 = C10711g0.f27943L;
        int intValue = ((Integer) t.mo10212i(interfaceC10773k0)).intValue();
        int intValue2 = ((Integer) t.mo10211l(interfaceC10773k0)).intValue();
        char c = this.f28161j;
        int i = 0;
        if (c != '3') {
            if (c == '6') {
                int i2 = (intValue / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                if (this.f28162k) {
                    i = 999;
                }
                return (T) t.mo14420D(interfaceC10773k0, Math.min(intValue2, i2 + i));
            }
            throw new UnsupportedOperationException("Unknown: " + this.f28161j);
        }
        int i3 = (intValue / 1000000) * 1000000;
        if (this.f28162k) {
            i = 999999;
        }
        return (T) t.mo14420D(interfaceC10773k0, Math.min(intValue2, i3 + i));
    }
}
