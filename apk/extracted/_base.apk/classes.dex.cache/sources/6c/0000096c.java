package p029b9;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b9.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2156c0 extends AbstractDialogInterface$OnClickListenerC2163e0 {

    /* renamed from: j */
    final /* synthetic */ Intent f6085j;

    /* renamed from: k */
    final /* synthetic */ Activity f6086k;

    /* renamed from: l */
    final /* synthetic */ int f6087l;

    public C2156c0(Intent intent, Activity activity, int i) {
        this.f6085j = intent;
        this.f6086k = activity;
        this.f6087l = i;
    }

    @Override // p029b9.AbstractDialogInterface$OnClickListenerC2163e0
    /* renamed from: a */
    public final void mo34051a() {
        Intent intent = this.f6085j;
        if (intent != null) {
            this.f6086k.startActivityForResult(intent, this.f6087l);
        }
    }
}