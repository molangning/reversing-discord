package p420x8;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x8.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13757s extends AbstractC13758t<Void> {
    public C13757s(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // p420x8.AbstractC13758t
    /* renamed from: a */
    public final void mo1584a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m1585d(null);
        } else {
            m1586c(new C13759u(4, "Invalid response to one way request", null));
        }
    }

    @Override // p420x8.AbstractC13758t
    /* renamed from: b */
    public final boolean mo1583b() {
        return true;
    }
}