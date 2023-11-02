package net.time4j.calendar;

import net.time4j.base.C10616c;

/* renamed from: net.time4j.calendar.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10653j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.calendar.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10654a extends AbstractC10653j {

        /* renamed from: a */
        final /* synthetic */ int f27763a;

        C10654a(int i) {
            this.f27763a = i;
        }

        @Override // net.time4j.calendar.AbstractC10653j
        /* renamed from: d */
        public int mo10852d() {
            return C10616c.m11037e(this.f27763a, 2636);
        }
    }

    /* renamed from: a */
    public static AbstractC10653j m10856a(int i) {
        if (i >= 1) {
            return m10855b(C10616c.m11037e(i, -2333));
        }
        throw new IllegalArgumentException("Dangi year must not be smaller than 1: " + i);
    }

    /* renamed from: b */
    public static AbstractC10653j m10855b(int i) {
        return new C10654a(i);
    }

    /* renamed from: c */
    public final int m10854c() {
        return C10616c.m11041a((mo10852d() + 1) - 1, 60) + 1;
    }

    /* renamed from: d */
    public abstract int mo10852d();

    /* renamed from: e */
    public final C10640c m10853e() {
        int i = 60;
        int m11039c = C10616c.m11039c(mo10852d() + 1, 60);
        if (m11039c != 0) {
            i = m11039c;
        }
        return C10640c.m10947o(i);
    }
}
