package p162ij;

import net.time4j.p249tz.InterfaceC10808k;

/* renamed from: ij.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7638f0 {

    /* renamed from: a */
    public static final AbstractC7638f0 f20937a = m20200a(0);

    /* renamed from: b */
    public static final AbstractC7638f0 f20938b = m20200a(-21600);

    /* renamed from: c */
    public static final AbstractC7638f0 f20939c = m20200a(21600);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C7640b extends AbstractC7638f0 {

        /* renamed from: d */
        private final int f20940d;

        @Override // p162ij.AbstractC7638f0
        /* renamed from: b */
        public int mo20199b(InterfaceC7641g interfaceC7641g, InterfaceC10808k interfaceC10808k) {
            return this.f20940d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7640b) && this.f20940d == ((C7640b) obj).f20940d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f20940d;
        }

        public String toString() {
            return "FixedStartOfDay[" + this.f20940d + "]";
        }

        private C7640b(int i) {
            this.f20940d = i;
        }
    }

    protected AbstractC7638f0() {
    }

    /* renamed from: a */
    private static AbstractC7638f0 m20200a(int i) {
        return new C7640b(i);
    }

    /* renamed from: b */
    public abstract int mo20199b(InterfaceC7641g interfaceC7641g, InterfaceC10808k interfaceC10808k);
}
