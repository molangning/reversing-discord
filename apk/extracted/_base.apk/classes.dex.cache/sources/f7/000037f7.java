package p162ij;

import java.io.Serializable;
import net.time4j.base.C10616c;
import p162ij.AbstractC7654k0;

/* renamed from: ij.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7654k0<U, T extends AbstractC7654k0<U, T>> extends AbstractC7665q<T> implements Comparable<T>, Serializable {
    /* renamed from: J */
    private InterfaceC7659m0<T> m20147J(U u) {
        return mo10478v().m20169P(u);
    }

    @Override // java.lang.Comparable
    /* renamed from: H */
    public abstract int compareTo(T t);

    @Override // p162ij.AbstractC7665q
    /* renamed from: I */
    public abstract C7644h0<U, T> mo10478v();

    /* renamed from: K */
    public T m20146K(long j, U u) {
        return m20145L(C10616c.m11031k(j), u);
    }

    /* renamed from: L */
    public T m20145L(long j, U u) {
        if (j == 0) {
            return (T) mo10477w();
        }
        try {
            return m20147J(u).mo10475b((T) mo10477w(), j);
        } catch (IllegalArgumentException e) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e);
            throw arithmeticException;
        }
    }

    /* renamed from: M */
    public long m20144M(T t, U u) {
        return m20147J(u).mo10476a((T) mo10477w(), t);
    }
}