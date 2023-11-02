package bb;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: bb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2226a implements InterfaceC2228c {

    /* renamed from: a */
    private final float f6226a;

    public C2226a(float f) {
        this.f6226a = f;
    }

    @Override // bb.InterfaceC2228c
    /* renamed from: a */
    public float mo33876a(RectF rectF) {
        return this.f6226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2226a) && this.f6226a == ((C2226a) obj).f6226a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6226a)});
    }
}