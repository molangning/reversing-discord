package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface Predicate<T> {

    /* renamed from: org.webrtc.Predicate$-CC */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final /* synthetic */ class CC<T> {
        /* renamed from: a */
        public static Predicate m8389a(final Predicate predicate, final Predicate predicate2) {
            return new Predicate<T>() { // from class: org.webrtc.Predicate.2
                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.m8389a(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate negate() {
                    return CC.m8388b(this);
                }

                @Override // org.webrtc.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo8386or(Predicate predicate3) {
                    return CC.m8387c(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public boolean test(T t) {
                    return predicate.test(t) && predicate2.test(t);
                }
            };
        }

        /* renamed from: b */
        public static Predicate m8388b(final Predicate predicate) {
            return new Predicate<T>() { // from class: org.webrtc.Predicate.3
                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return CC.m8389a(this, predicate2);
                }

                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate negate() {
                    return CC.m8388b(this);
                }

                @Override // org.webrtc.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo8386or(Predicate predicate2) {
                    return CC.m8387c(this, predicate2);
                }

                @Override // org.webrtc.Predicate
                public boolean test(T t) {
                    return !predicate.test(t);
                }
            };
        }

        /* renamed from: c */
        public static Predicate m8387c(final Predicate predicate, final Predicate predicate2) {
            return new Predicate<T>() { // from class: org.webrtc.Predicate.1
                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate and(Predicate predicate3) {
                    return CC.m8389a(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public /* synthetic */ Predicate negate() {
                    return CC.m8388b(this);
                }

                @Override // org.webrtc.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo8386or(Predicate predicate3) {
                    return CC.m8387c(this, predicate3);
                }

                @Override // org.webrtc.Predicate
                public boolean test(T t) {
                    return predicate.test(t) || predicate2.test(t);
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo8386or(Predicate<? super T> predicate);

    boolean test(T t);
}