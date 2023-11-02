package p305qg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qg.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum EnumC11915e0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    

    /* renamed from: j */
    public static final C11916a f30913j = new C11916a(null);

    /* renamed from: qg.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C11916a {
        private C11916a() {
        }

        public /* synthetic */ C11916a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC11915e0 m6722a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return EnumC11915e0.SEALED;
            }
            if (z2) {
                return EnumC11915e0.ABSTRACT;
            }
            if (z3) {
                return EnumC11915e0.OPEN;
            }
            return EnumC11915e0.FINAL;
        }
    }
}
