package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1866b0 implements InterfaceC1870c0 {

    /* renamed from: a */
    private final WindowId f5162a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1866b0(View view) {
        this.f5162a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1866b0) && ((C1866b0) obj).f5162a.equals(this.f5162a);
    }

    public int hashCode() {
        return this.f5162a.hashCode();
    }
}
