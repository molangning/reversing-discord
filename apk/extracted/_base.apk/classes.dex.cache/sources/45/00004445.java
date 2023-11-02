package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.C10697f0;
import net.time4j.EnumC10686f;
import net.time4j.InterfaceC10684e;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7649i;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;
import p184jj.AbstractC8978d;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9014t;

/* renamed from: net.time4j.calendar.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10655k implements InterfaceC7649i {
    DANGI;
    

    /* renamed from: j */
    private final transient InterfaceC7664p<EnumC10655k> f27766j = new C10657b();

    /* renamed from: k */
    private final transient InterfaceC7664p<Integer> f27767k = new C10660e();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10657b extends AbstractC8978d<EnumC10655k> implements InterfaceC9014t<EnumC10655k> {
        private static final long serialVersionUID = -5179188137244162427L;

        private Object readResolve() {
            return EnumC10655k.DANGI.m10851a();
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return true;
        }

        @Override // p184jj.InterfaceC9014t
        /* renamed from: Q */
        public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
            appendable.append(EnumC10655k.DANGI.m10850b((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT), (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE)));
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
        public Class<EnumC10655k> getType() {
            return EnumC10655k.class;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <T extends AbstractC7665q<T>> InterfaceC7676z<T, EnumC10655k> mo9901p(C7672x<T> c7672x) {
            if (!c7672x.m20107w(C10697f0.f27907x)) {
                return null;
            }
            return new C10658c();
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: v */
        protected boolean mo9550v() {
            return true;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: w */
        public EnumC10655k mo9551e() {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: x */
        public EnumC10655k mo9554U() {
            return EnumC10655k.DANGI;
        }

        @Override // p184jj.InterfaceC9014t
        /* renamed from: y */
        public EnumC10655k mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
            Locale locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
            boolean booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23569j, Boolean.FALSE)).booleanValue();
            int index = parsePosition.getIndex();
            EnumC10655k enumC10655k = EnumC10655k.DANGI;
            String m10850b = enumC10655k.m10850b(locale, (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE));
            int max = Math.max(Math.min(m10850b.length() + index, charSequence.length()), index);
            if (max > index) {
                String charSequence2 = charSequence.subSequence(index, max).toString();
                if (booleanValue) {
                    m10850b = m10850b.toLowerCase(locale);
                    charSequence2 = charSequence2.toLowerCase(locale);
                }
                if (m10850b.equals(charSequence2) || (booleanValue2 && m10850b.startsWith(charSequence2))) {
                    parsePosition.setIndex(max);
                    return enumC10655k;
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        private C10657b() {
            super("ERA");
        }
    }

    /* renamed from: net.time4j.calendar.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10658c implements InterfaceC7676z<AbstractC7665q<?>, EnumC10655k> {
        private C10658c() {
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(AbstractC7665q<?> abstractC7665q) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(AbstractC7665q<?> abstractC7665q) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public EnumC10655k mo9922f(AbstractC7665q<?> abstractC7665q) {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10655k mo9917l(AbstractC7665q<?> abstractC7665q) {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10655k mo9915o(AbstractC7665q<?> abstractC7665q) {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(AbstractC7665q<?> abstractC7665q, EnumC10655k enumC10655k) {
            return enumC10655k == EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public AbstractC7665q<?> mo9916n(AbstractC7665q<?> abstractC7665q, EnumC10655k enumC10655k, boolean z) {
            if (mo9920i(abstractC7665q, enumC10655k)) {
                return abstractC7665q;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + enumC10655k);
        }
    }

    /* renamed from: net.time4j.calendar.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10659d implements InterfaceC7676z<AbstractC7665q<?>, Integer> {
        private C10659d() {
        }

        /* renamed from: e */
        private int m10836e(AbstractC7665q<?> abstractC7665q) {
            return ((C10697f0) abstractC7665q.mo10212i(C10697f0.f27907x)).mo10482o() + 2333;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(AbstractC7665q<?> abstractC7665q) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(AbstractC7665q<?> abstractC7665q) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Integer mo9922f(AbstractC7665q<?> abstractC7665q) {
            return 1000002332;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9917l(AbstractC7665q<?> abstractC7665q) {
            return -999997666;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9915o(AbstractC7665q<?> abstractC7665q) {
            return Integer.valueOf(m10836e(abstractC7665q));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(AbstractC7665q<?> abstractC7665q, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = mo9917l(abstractC7665q).intValue();
            int intValue2 = mo9922f(abstractC7665q).intValue();
            if (num.intValue() < intValue || num.intValue() > intValue2) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [ij.q, ij.q<?>] */
        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public AbstractC7665q<?> mo9916n(AbstractC7665q<?> abstractC7665q, Integer num, boolean z) {
            if (num != null) {
                if (mo9920i(abstractC7665q, num)) {
                    int m10836e = m10836e(abstractC7665q);
                    InterfaceC10684e interfaceC10684e = C10697f0.f27907x;
                    return abstractC7665q.mo14419F(interfaceC10684e, (C10697f0) ((C10697f0) abstractC7665q.mo10212i(interfaceC10684e)).m20145L(num.intValue() - m10836e, EnumC10686f.f27874m));
                }
                throw new IllegalArgumentException("Invalid year of era: " + num);
            }
            throw new IllegalArgumentException("Missing year of era.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.calendar.k$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10660e extends AbstractC8978d<Integer> {
        private static final long serialVersionUID = -7864513245908399367L;

        private Object readResolve() {
            return EnumC10655k.DANGI.m10849c();
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: M */
        public boolean mo9555M() {
            return true;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: V */
        public boolean mo9553V() {
            return false;
        }

        @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
        /* renamed from: a */
        public char mo9552a() {
            return 'y';
        }

        @Override // p162ij.InterfaceC7664p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: p */
        public <T extends AbstractC7665q<T>> InterfaceC7676z<T, Integer> mo9901p(C7672x<T> c7672x) {
            if (!c7672x.m20107w(C10697f0.f27907x)) {
                return null;
            }
            return new C10659d();
        }

        @Override // p162ij.AbstractC7635e
        /* renamed from: v */
        protected boolean mo9550v() {
            return true;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: w */
        public Integer mo9551e() {
            return 5332;
        }

        @Override // p162ij.InterfaceC7664p
        /* renamed from: x */
        public Integer mo9554U() {
            return 3978;
        }

        private C10660e() {
            super("YEAR_OF_ERA");
        }
    }

    EnumC10655k() {
    }

    /* renamed from: a */
    public InterfaceC7664p<EnumC10655k> m10851a() {
        return this.f27766j;
    }

    /* renamed from: b */
    public String m10850b(Locale locale, EnumC9016v enumC9016v) {
        return C8972b.m16915c("dangi", locale).m16916b(enumC9016v).m16855f(this);
    }

    /* renamed from: c */
    public InterfaceC7664p<Integer> m10849c() {
        return this.f27767k;
    }
}