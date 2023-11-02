package p029b9;

import android.content.Intent;
import p010a9.InterfaceC0101f;

/* renamed from: b9.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2160d0 extends AbstractDialogInterface$OnClickListenerC2163e0 {

    /* renamed from: j */
    final /* synthetic */ Intent f6105j;

    /* renamed from: k */
    final /* synthetic */ InterfaceC0101f f6106k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2160d0(Intent intent, InterfaceC0101f interfaceC0101f, int i) {
        this.f6105j = intent;
        this.f6106k = interfaceC0101f;
    }

    @Override // p029b9.AbstractDialogInterface$OnClickListenerC2163e0
    /* renamed from: a */
    public final void mo34051a() {
        Intent intent = this.f6105j;
        if (intent != null) {
            this.f6106k.startActivityForResult(intent, 2);
        }
    }
}
