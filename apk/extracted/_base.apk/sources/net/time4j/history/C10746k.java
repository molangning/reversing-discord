package net.time4j.history;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.C10697f0;
import p162ij.AbstractC7635e;
import p162ij.AbstractC7665q;
import p162ij.C7666r;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;
import p184jj.AbstractC8978d;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9014t;
import p251nj.C10915a;

/* renamed from: net.time4j.history.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C10746k extends AbstractC8978d<EnumC10744j> implements InterfaceC9014t<EnumC10744j> {

    /* renamed from: k */
    private static final Locale f28063k = new Locale("la");
    private static final long serialVersionUID = 5200533417265981438L;
    private final C10736d history;

    /* renamed from: net.time4j.history.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static class C10747a<C extends AbstractC7665q<C>> implements InterfaceC7676z<C, EnumC10744j> {

        /* renamed from: j */
        private final C10736d f28064j;

        C10747a(C10736d c10736d) {
            this.f28064j = c10736d;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(C c) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public EnumC10744j mo9922f(C c) {
            EnumC10744j mo9915o = mo9915o(c);
            if (mo9915o == EnumC10744j.BC) {
                return EnumC10744j.AD;
            }
            return mo9915o;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10744j mo9917l(C c) {
            EnumC10744j mo9915o = mo9915o(c);
            if (mo9915o == EnumC10744j.AD) {
                return EnumC10744j.BC;
            }
            return mo9915o;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10744j mo9915o(C c) {
            try {
                return this.f28064j.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x)).m10383c();
            } catch (IllegalArgumentException e) {
                throw new C7666r(e.getMessage(), e);
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(C c, EnumC10744j enumC10744j) {
            if (enumC10744j == null) {
                return false;
            }
            try {
                if (this.f28064j.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x)).m10383c() != enumC10744j) {
                    return false;
                }
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public C mo9916n(C c, EnumC10744j enumC10744j, boolean z) {
            if (enumC10744j != null) {
                if (this.f28064j.m10416e((C10697f0) c.mo10212i(C10697f0.f27907x)).m10383c() == enumC10744j) {
                    return c;
                }
                throw new IllegalArgumentException(enumC10744j.name());
            }
            throw new IllegalArgumentException("Missing era value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10746k(C10736d c10736d) {
        super("ERA");
        this.history = c10736d;
    }

    private Object readResolve() {
        return this.history.m10412i();
    }

    /* renamed from: w */
    private C9013s m10364w(InterfaceC7633d interfaceC7633d) {
        InterfaceC7631c<EnumC9016v> interfaceC7631c = C8969a.f23566g;
        EnumC9016v enumC9016v = EnumC9016v.WIDE;
        EnumC9016v enumC9016v2 = (EnumC9016v) interfaceC7633d.mo14441b(interfaceC7631c, enumC9016v);
        InterfaceC7631c<Boolean> interfaceC7631c2 = C10915a.f28645c;
        Boolean bool = Boolean.FALSE;
        String str = "w";
        if (((Boolean) interfaceC7633d.mo14441b(interfaceC7631c2, bool)).booleanValue()) {
            C8972b m16915c = C8972b.m16915c("historic", f28063k);
            String[] strArr = new String[1];
            if (enumC9016v2 != enumC9016v) {
                str = "a";
            }
            strArr[0] = str;
            return m16915c.m16904n(this, strArr);
        }
        C8972b m16914d = C8972b.m16914d((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT));
        if (((Boolean) interfaceC7633d.mo14441b(C10915a.f28644b, bool)).booleanValue()) {
            String[] strArr2 = new String[2];
            if (enumC9016v2 != enumC9016v) {
                str = "a";
            }
            strArr2[0] = str;
            strArr2[1] = "alt";
            return m16914d.m16904n(this, strArr2);
        }
        return m16914d.m16916b(enumC9016v2);
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: B */
    public EnumC10744j mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        return (EnumC10744j) m10364w(interfaceC7633d).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        appendable.append(m10364w(interfaceC7633d).m16855f((Enum) interfaceC7662o.mo10212i(this)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return 'G';
    }

    @Override // p162ij.InterfaceC7664p
    public Class<EnumC10744j> getType() {
        return EnumC10744j.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7635e
    /* renamed from: p */
    public <T extends AbstractC7665q<T>> InterfaceC7676z<T, EnumC10744j> mo9901p(C7672x<T> c7672x) {
        if (c7672x.m20107w(C10697f0.f27907x)) {
            return new C10747a(this.history);
        }
        return null;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: q */
    protected boolean mo9900q(AbstractC7635e<?> abstractC7635e) {
        return this.history.equals(((C10746k) abstractC7635e).history);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public EnumC10744j mo9551e() {
        return EnumC10744j.AD;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: y */
    public EnumC10744j mo9554U() {
        return EnumC10744j.BC;
    }
}
