package p164j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* renamed from: j$.util.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8511i {
    /* renamed from: a */
    public static C8510h m17629a(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? C8510h.m17630d(optional.get()) : C8510h.m17633a();
    }

    /* renamed from: b */
    public static C8512j m17628b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C8512j.m17618d(optionalDouble.getAsDouble()) : C8512j.m17621a();
    }

    /* renamed from: c */
    public static C8513k m17627c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C8513k.m17614d(optionalInt.getAsInt()) : C8513k.m17617a();
    }

    /* renamed from: d */
    public static C8514l m17626d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C8514l.m17610d(optionalLong.getAsLong()) : C8514l.m17613a();
    }

    /* renamed from: e */
    public static Optional m17625e(C8510h c8510h) {
        if (c8510h == null) {
            return null;
        }
        return c8510h.m17631c() ? Optional.of(c8510h.m17632b()) : Optional.empty();
    }

    /* renamed from: f */
    public static OptionalDouble m17624f(C8512j c8512j) {
        if (c8512j == null) {
            return null;
        }
        return c8512j.m17619c() ? OptionalDouble.of(c8512j.m17620b()) : OptionalDouble.empty();
    }

    /* renamed from: g */
    public static OptionalInt m17623g(C8513k c8513k) {
        if (c8513k == null) {
            return null;
        }
        return c8513k.m17615c() ? OptionalInt.of(c8513k.m17616b()) : OptionalInt.empty();
    }

    /* renamed from: h */
    public static OptionalLong m17622h(C8514l c8514l) {
        if (c8514l == null) {
            return null;
        }
        return c8514l.m17611c() ? OptionalLong.of(c8514l.m17612b()) : OptionalLong.empty();
    }
}