package p162ij;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* renamed from: ij.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC7656l0<U> {

    /* renamed from: ij.l0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7657a<U> implements Serializable {
        private static final long serialVersionUID = 1564804888291509484L;
        private final long amount;
        private final U unit;

        private C7657a(long j, U u) {
            if (u != null) {
                if (j >= 0) {
                    this.amount = j;
                    this.unit = u;
                    return;
                }
                throw new IllegalArgumentException("Temporal amount must be positive or zero: " + j);
            }
            throw new NullPointerException("Missing chronological unit.");
        }

        /* renamed from: c */
        public static <U> C7657a<U> m20135c(long j, U u) {
            return new C7657a<>(j, u);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            if (this.unit != null && this.amount >= 0) {
                return;
            }
            throw new InvalidObjectException("Inconsistent state.");
        }

        /* renamed from: a */
        public long m20137a() {
            return this.amount;
        }

        /* renamed from: b */
        public U m20136b() {
            return this.unit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7657a)) {
                return false;
            }
            C7657a c7657a = (C7657a) C7657a.class.cast(obj);
            if (this.amount == c7657a.amount && this.unit.equals(c7657a.unit)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.amount;
            return (this.unit.hashCode() * 29) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(this.amount);
            sb2.append('{');
            sb2.append(this.unit);
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    List<C7657a<U>> mo10257a();
}
