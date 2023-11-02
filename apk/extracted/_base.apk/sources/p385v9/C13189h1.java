package p385v9;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v9.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13189h1 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13189h1(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C13192i1.f34207e;
        atomicBoolean.set(true);
    }
}
