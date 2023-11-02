package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.C10582a0;
import p143hj.C7350c;
import p143hj.EnumC7353e;
import p162ij.InterfaceC7670v;

/* renamed from: net.time4j.calendar.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC10667p {
    MINOR_01_LICHUN_315,
    MAJOR_01_YUSHUI_330,
    MINOR_02_JINGZHE_345,
    MAJOR_02_CHUNFEN_000,
    MINOR_03_QINGMING_015,
    MAJOR_03_GUYU_030,
    MINOR_04_LIXIA_045,
    MAJOR_04_XIAOMAN_060,
    MINOR_05_MANGZHONG_075,
    MAJOR_05_XIAZHI_090,
    MINOR_06_XIAOSHU_105,
    MAJOR_06_DASHU_120,
    MINOR_07_LIQIU_135,
    MAJOR_07_CHUSHU_150,
    MINOR_08_BAILU_165,
    MAJOR_08_QIUFEN_180,
    MINOR_09_HANLU_195,
    MAJOR_09_SHUANGJIANG_210,
    MINOR_10_LIDONG_225,
    MAJOR_10_XIAOXUE_240,
    MINOR_11_DAXUE_255,
    MAJOR_11_DONGZHI_270,
    MINOR_12_XIAOHAN_285,
    MAJOR_12_DAHAN_300;
    

    /* renamed from: H */
    private static final EnumC10667p[] f27818H = values();

    /* renamed from: I */
    private static final String[] f27819I = {"lichun", "yushui", "jingzhe", "chunfen", "qingming", "guyu", "lixia", "xiaoman", "mangzhong", "xiazhi", "xiaoshu", "dashu", "liqiu", "chushu", "bailu", "qiufen", "hanlu", "shuangjiang", "lidong", "xiaoxue", "daxue", "dongzhi", "xiaohan", "dahan"};

    /* renamed from: J */
    private static final String[] f27820J = {"lìchūn", "yǔshuǐ", "jīngzhé", "chūnfēn", "qīngmíng", "gǔyǔ", "lìxià", "xiǎomǎn", "mángzhòng", "xiàzhì", "xiǎoshǔ", "dàshǔ", "lìqiū", "chǔshǔ", "báilù", "qiūfēn", "hánlù", "shuāngjiàng", "lìdōng", "xiǎoxuě", "dàxuě", "dōngzhì", "xiǎohán", "dàhán"};

    /* renamed from: K */
    private static final String[] f27821K = {"立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑", "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* renamed from: L */
    private static final String[] f27822L = {"立春", "雨水", "驚蟄", "春分", "清明", "穀雨", "立夏", "小滿", "芒種", "夏至", "小暑", "大暑", "立秋", "處暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* renamed from: M */
    private static final String[] f27823M = {"입춘", "우수", "경칩", "춘분", "청명", "곡우", "입하", "소만", "망종", "하지", "소서", "대서", "입추", "처서", "백로", "추분", "한로", "상강", "입동", "소설", "대설", "동지", "소한", "대한"};

    /* renamed from: N */
    private static final String[] f27824N = {"Lập xuân", "Vũ thủy", "Kinh trập", "Xuân phân", "Thanh minh", "Cốc vũ", "Lập hạ", "Tiểu mãn", "Mang chủng", "Hạ chí", "Tiểu thử", "Đại thử", "Lập thu", "Xử thử", "Bạch lộ", "Thu phân", "Hàn lộ", "Sương giáng", "Lập đông", "Tiểu tuyết", "Đại tuyết", "Đông chí", "Tiểu hàn", "Đại hàn"};

    /* renamed from: O */
    private static final String[] f27825O = {"立春", "雨水", "啓蟄", "春分", "清明", "穀雨", "立夏", "小満", "芒種", "夏至", "小暑", "大暑", "立秋", "処暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"};

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* renamed from: net.time4j.calendar.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    class C10668a<D> implements InterfaceC7670v<D> {
        C10668a() {
        }

        /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
        @Override // p162ij.InterfaceC7670v
        /* renamed from: a */
        public AbstractC10644f apply(AbstractC10644f abstractC10644f) {
            return EnumC10667p.this.m10795i(abstractC10644f.mo10922Z().mo10629b(EnumC10667p.m10797g(abstractC10644f)));
        }
    }

    /* renamed from: b */
    private C10582a0 m10802b(C10582a0 c10582a0) {
        double m10800d = m10800d();
        double m20888c = C7350c.m20884g(c10582a0).m20888c();
        double m10798f = ((m10798f(m10800d - m10792m(m20888c)) * 365.242189d) / 360.0d) + m20888c;
        double max = Math.max(m20888c, m10798f - 5.0d);
        double d = m10798f + 5.0d;
        while (true) {
            double d2 = (max + d) / 2.0d;
            if (d - max < 1.0E-5d) {
                return C7350c.m20885f(d2).m20883h();
            }
            if (m10798f(m10792m(d2) - m10800d) < 180.0d) {
                d = d2;
            } else {
                max = d2;
            }
        }
    }

    /* renamed from: e */
    private static String[] m10799e(Locale locale) {
        if (locale.getLanguage().equals("zh")) {
            if (locale.getCountry().equals("TW")) {
                return f27822L;
            }
            return f27821K;
        } else if (locale.getLanguage().equals("ko")) {
            return f27823M;
        } else {
            if (locale.getLanguage().equals("vi")) {
                return f27824N;
            }
            if (locale.getLanguage().equals("ja")) {
                return f27825O;
            }
            if (locale.getLanguage().isEmpty()) {
                return f27819I;
            }
            return f27820J;
        }
    }

    /* renamed from: f */
    private static double m10798f(double d) {
        return d - (Math.floor(d / 360.0d) * 360.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static <D extends AbstractC10644f<?, ?>> long m10797g(D d) {
        return d.mo10922Z().m10933q(d.m10921a0(), d.m10910k0().getNumber());
    }

    /* renamed from: h */
    public static EnumC10667p m10796h(C10582a0 c10582a0) {
        return f27818H[(((int) Math.floor(m10792m(C7350c.m20884g(c10582a0).m20888c()) / 15.0d)) + 3) % 24];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static EnumC10667p m10794k(CharSequence charSequence, Locale locale, ParsePosition parsePosition) {
        String[] m10799e = m10799e(locale);
        boolean isEmpty = locale.getLanguage().isEmpty();
        int index = parsePosition.getIndex();
        for (int i = 0; i < m10799e.length; i++) {
            String str = m10799e[i];
            String charSequence2 = charSequence.subSequence(index, Math.min(charSequence.length(), str.length() + index)).toString();
            if ((isEmpty && charSequence2.equalsIgnoreCase(str)) || charSequence2.equals(str)) {
                parsePosition.setIndex(parsePosition.getIndex() + str.length());
                return f27818H[i];
            }
        }
        if (!locale.getLanguage().isEmpty() && m10799e == f27820J) {
            return m10794k(charSequence, Locale.ROOT, parsePosition);
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static double m10792m(double d) {
        return EnumC7353e.f19825m.mo20854f(d, "solar-longitude");
    }

    /* renamed from: c */
    public String m10801c(Locale locale) {
        return m10799e(locale)[ordinal()];
    }

    /* renamed from: d */
    public int m10800d() {
        return ((ordinal() + 21) % 24) * 15;
    }

    /* renamed from: i */
    public <D extends AbstractC10644f<?, D>> D m10795i(D d) {
        AbstractC10642d mo10922Z = d.mo10922Z();
        long mo10920b = d.mo10920b();
        return (D) mo10922Z.mo10629b(m10802b(mo10922Z.m10936n(mo10920b)).m11138x0(mo10922Z.mo10941i(mo10920b)).m10484j0().mo10920b());
    }

    /* renamed from: l */
    public <D extends AbstractC10644f<?, D>> InterfaceC7670v<D> m10793l() {
        return new C10668a();
    }
}
