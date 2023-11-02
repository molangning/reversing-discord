package p164j$.util.function;

import java.util.function.UnaryOperator;
import p164j$.util.function.UnaryOperator;

/* renamed from: j$.util.function.Function */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Function f22553a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f22553a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C8423D ? ((C8423D) function).f22546a : function instanceof UnaryOperator ? UnaryOperator.VivifiedWrapper.convert((java.util.function.UnaryOperator) function) : new VivifiedWrapper(function);
        }

        @Override // p164j$.util.function.Function
        /* renamed from: a */
        public final /* synthetic */ Function mo17686a(Function function) {
            return convert(this.f22553a.andThen(C8423D.m17711a(function)));
        }

        @Override // p164j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f22553a.apply(obj);
        }

        @Override // p164j$.util.function.Function
        /* renamed from: b */
        public final /* synthetic */ Function mo17685b(Function function) {
            return convert(this.f22553a.compose(C8423D.m17711a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22553a;
            }
            return this.f22553a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22553a.hashCode();
        }
    }

    /* renamed from: a */
    Function mo17686a(Function function);

    Object apply(Object obj);

    /* renamed from: b */
    Function mo17685b(Function function);
}
