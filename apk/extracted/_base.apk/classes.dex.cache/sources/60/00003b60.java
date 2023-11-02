package p164j$.util.function;

import p164j$.util.function.Function;

/* renamed from: j$.util.function.UnaryOperator */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface UnaryOperator<T> extends Function<T, T> {

    /* renamed from: j$.util.function.UnaryOperator$VivifiedWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.UnaryOperator f22578a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.f22578a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return unaryOperator instanceof C8446O0 ? ((C8446O0) unaryOperator).f22569a : new VivifiedWrapper(unaryOperator);
        }

        @Override // p164j$.util.function.Function
        /* renamed from: a */
        public final /* synthetic */ Function mo17686a(Function function) {
            return Function.VivifiedWrapper.convert(this.f22578a.andThen(C8423D.m17711a(function)));
        }

        @Override // p164j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f22578a.apply(obj);
        }

        @Override // p164j$.util.function.Function
        /* renamed from: b */
        public final /* synthetic */ Function mo17685b(Function function) {
            return Function.VivifiedWrapper.convert(this.f22578a.compose(C8423D.m17711a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f22578a;
            }
            return this.f22578a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f22578a.hashCode();
        }
    }
}