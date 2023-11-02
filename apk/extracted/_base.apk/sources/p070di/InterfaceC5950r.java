package p070di;

import java.util.List;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;

/* renamed from: di.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC5950r {

    /* renamed from: a */
    public static final InterfaceC5950r f16955a = new C5951a();

    /* renamed from: di.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C5951a implements InterfaceC5950r {
        C5951a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m24083c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p070di.InterfaceC5950r
        /* renamed from: a */
        public void mo2842a(InterfaceC11914e interfaceC11914e, List<String> list) {
            if (interfaceC11914e == null) {
                m24083c(0);
            }
            if (list == null) {
                m24083c(1);
            }
        }

        @Override // p070di.InterfaceC5950r
        /* renamed from: b */
        public void mo2841b(InterfaceC11902b interfaceC11902b) {
            if (interfaceC11902b == null) {
                m24083c(2);
            }
        }
    }

    /* renamed from: a */
    void mo2842a(InterfaceC11914e interfaceC11914e, List<String> list);

    /* renamed from: b */
    void mo2841b(InterfaceC11902b interfaceC11902b);
}
