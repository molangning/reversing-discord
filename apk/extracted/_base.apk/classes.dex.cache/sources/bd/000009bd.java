package bb;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: bb.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2237i implements InterfaceC2228c {

    /* renamed from: a */
    private final float f6280a;

    public C2237i(float f) {
        this.f6280a = f;
    }

    @Override // bb.InterfaceC2228c
    /* renamed from: a */
    public float mo33876a(RectF rectF) {
        return this.f6280a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2237i) && this.f6280a == ((C2237i) obj).f6280a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6280a)});
    }
}