package bb;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: bb.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2227b implements InterfaceC2228c {

    /* renamed from: a */
    private final InterfaceC2228c f6227a;

    /* renamed from: b */
    private final float f6228b;

    public C2227b(float f, InterfaceC2228c interfaceC2228c) {
        while (interfaceC2228c instanceof C2227b) {
            interfaceC2228c = ((C2227b) interfaceC2228c).f6227a;
            f += ((C2227b) interfaceC2228c).f6228b;
        }
        this.f6227a = interfaceC2228c;
        this.f6228b = f;
    }

    @Override // bb.InterfaceC2228c
    /* renamed from: a */
    public float mo33876a(RectF rectF) {
        return Math.max(0.0f, this.f6227a.mo33876a(rectF) + this.f6228b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2227b)) {
            return false;
        }
        C2227b c2227b = (C2227b) obj;
        if (this.f6227a.equals(c2227b.f6227a) && this.f6228b == c2227b.f6228b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6227a, Float.valueOf(this.f6228b)});
    }
}
