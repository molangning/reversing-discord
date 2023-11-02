package net.time4j.calendar;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.C10697f0;
import net.time4j.C10852z0;
import net.time4j.EnumC10846x0;
import net.time4j.calendar.C10632b;
import net.time4j.calendar.service.C10680f;
import net.time4j.calendar.service.C10681g;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.EnumC10803f;
import p162ij.AbstractC7665q;
import p162ij.C7644h0;
import p162ij.EnumC7661n0;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7653k;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7668t;
import p162ij.InterfaceC7671w;
import p162ij.InterfaceC7676z;
import p184jj.InterfaceC8977c;
import p184jj.InterfaceC8982h;
import p184jj.InterfaceC9014t;

@InterfaceC8977c("dangi")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class KoreanCalendar extends AbstractC10644f<EnumC10629e, KoreanCalendar> implements InterfaceC8982h {

    /* renamed from: A */
    private static final C10670r<KoreanCalendar> f27702A;

    /* renamed from: B */
    public static final InterfaceC10661l<KoreanCalendar> f27703B;

    /* renamed from: C */
    private static final AbstractC10642d<KoreanCalendar> f27704C;

    /* renamed from: D */
    private static final C7644h0<EnumC10629e, KoreanCalendar> f27705D;

    /* renamed from: p */
    private static final int[] f27706p = {4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 4295, 3, 4297, 7, 4300, 6, 4303, 4, 4306, 2, 4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 4363, 2, 4365, 7, 4368, 5, 4371, 3, 4373, 9, 4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 4390, 4, 4392, 9, 4395, 6, 4398, 5, 4401, 2, 4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 4417, 5, 4420, 3, 4422, 7, 4425, 6, 4428, 4, 4431, 2, 4433, 6, 4436, 4, 4439, 3, 4441, 6, 4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 11, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4525, 12, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 3, 4650, 9, 4653, 5, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 3, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 9, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 4, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 7, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 8, 4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4955, 2, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 2, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 6, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 8, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 5, 5153, 4, 5156, 2, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 5177, 7, 5180, 5, 5183, 3, 5185, 8, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 5204, 8, 5207, 6, 5210, 4, 5212, 8, 5215, 7, 5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 5, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 8, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5345, 10, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 1, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 11, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 4, 5633, 9, 5636, 6
    };

    /* renamed from: q */
    public static final InterfaceC7664p<EnumC10655k> f27707q;

    /* renamed from: r */
    public static final InterfaceC7664p<Integer> f27708r;

    /* renamed from: s */
    public static final InterfaceC7664p<Integer> f27709s;
    private static final long serialVersionUID = -4284841131270593971L;

    /* renamed from: t */
    public static final InterfaceC9014t<C10640c> f27710t;

    /* renamed from: u */
    public static final InterfaceC7664p<EnumC10667p> f27711u;

    /* renamed from: v */
    public static final InterfaceC9014t<C10651h> f27712v;

    /* renamed from: w */
    public static final InterfaceC10669q<Integer, KoreanCalendar> f27713w;

    /* renamed from: x */
    public static final InterfaceC10669q<Integer, KoreanCalendar> f27714x;

    /* renamed from: y */
    public static final InterfaceC10669q<Integer, KoreanCalendar> f27715y;

    /* renamed from: z */
    public static final InterfaceC10669q<EnumC10846x0, KoreanCalendar> f27716z;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class SPX implements Externalizable {
        private static final long serialVersionUID = 1;

        /* renamed from: j */
        private transient Object f27717j;

        public SPX() {
        }

        /* renamed from: a */
        private KoreanCalendar m11015a(ObjectInput objectInput) {
            byte readByte = objectInput.readByte();
            byte readByte2 = objectInput.readByte();
            byte readByte3 = objectInput.readByte();
            boolean readBoolean = objectInput.readBoolean();
            byte readByte4 = objectInput.readByte();
            C10651h m10870d = C10651h.m10870d(readByte3);
            if (readBoolean) {
                m10870d = m10870d.m10869e();
            }
            return KoreanCalendar.m11017q0(readByte, readByte2, m10870d, readByte4);
        }

        /* renamed from: b */
        private void m11014b(ObjectOutput objectOutput) {
            AbstractC10644f abstractC10644f = (AbstractC10644f) this.f27717j;
            objectOutput.writeByte(abstractC10644f.m10921a0());
            objectOutput.writeByte(abstractC10644f.m10910k0().getNumber());
            objectOutput.writeByte(abstractC10644f.m10914g0().getNumber());
            objectOutput.writeBoolean(abstractC10644f.m10914g0().m10871c());
            objectOutput.writeByte(abstractC10644f.m10908r());
        }

        private Object readResolve() {
            return this.f27717j;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            if (objectInput.readByte() == 15) {
                this.f27717j = m11015a(objectInput);
                return;
            }
            throw new InvalidObjectException("Unknown calendar type.");
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeByte(15);
            m11014b(objectOutput);
        }

        SPX(Object obj) {
            this.f27717j = obj;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10625a implements InterfaceC7668t<KoreanCalendar, InterfaceC7653k<KoreanCalendar>> {
        C10625a() {
        }

        @Override // p162ij.InterfaceC7668t
        /* renamed from: a */
        public InterfaceC7653k<KoreanCalendar> apply(KoreanCalendar koreanCalendar) {
            return KoreanCalendar.f27704C;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10626b implements InterfaceC7676z<KoreanCalendar, EnumC10655k> {
        private C10626b() {
        }

        /* synthetic */ C10626b(C10625a c10625a) {
            this();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public EnumC10655k mo9922f(KoreanCalendar koreanCalendar) {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public EnumC10655k mo9917l(KoreanCalendar koreanCalendar) {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public EnumC10655k mo9915o(KoreanCalendar koreanCalendar) {
            return EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public boolean mo9920i(KoreanCalendar koreanCalendar, EnumC10655k enumC10655k) {
            return enumC10655k == EnumC10655k.DANGI;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public KoreanCalendar mo9916n(KoreanCalendar koreanCalendar, EnumC10655k enumC10655k, boolean z) {
            if (mo9920i(koreanCalendar, enumC10655k)) {
                return koreanCalendar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + enumC10655k);
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10627c extends AbstractC10631a<KoreanCalendar> {
        C10627c() {
            super(KoreanCalendar.class);
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: d */
        public KoreanCalendar mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
            AbstractC10653j m10855b;
            int mo10218c = abstractC7665q.mo10218c(C10632b.f27731a);
            if (mo10218c == Integer.MIN_VALUE) {
                InterfaceC9014t<C10640c> interfaceC9014t = KoreanCalendar.f27710t;
                if (abstractC7665q.mo10210q(interfaceC9014t)) {
                    InterfaceC7664p<Integer> interfaceC7664p = KoreanCalendar.f27708r;
                    if (abstractC7665q.mo10210q(interfaceC7664p)) {
                        m10855b = ((C10640c) abstractC7665q.mo10212i(interfaceC9014t)).m10948n(abstractC7665q.mo10218c(interfaceC7664p));
                    }
                }
                int mo10218c2 = abstractC7665q.mo10218c(EnumC10655k.DANGI.m10849c());
                if (mo10218c2 != Integer.MIN_VALUE) {
                    m10855b = AbstractC10653j.m10856a(mo10218c2);
                } else {
                    m10855b = null;
                }
            } else {
                m10855b = AbstractC10653j.m10855b(mo10218c);
            }
            if (m10855b == null) {
                abstractC7665q.mo14419F(EnumC7661n0.ERROR_MESSAGE, "Cannot determine East Asian year.");
                return null;
            }
            InterfaceC9014t<C10651h> interfaceC9014t2 = KoreanCalendar.f27712v;
            if (abstractC7665q.mo10210q(interfaceC9014t2)) {
                C10651h c10651h = (C10651h) abstractC7665q.mo10212i(interfaceC9014t2);
                int mo10218c3 = abstractC7665q.mo10218c(KoreanCalendar.f27714x);
                if (mo10218c3 != Integer.MIN_VALUE) {
                    return KoreanCalendar.m11016r0(m10855b, c10651h, mo10218c3);
                }
            } else {
                int mo10218c4 = abstractC7665q.mo10218c(KoreanCalendar.f27715y);
                if (mo10218c4 != Integer.MIN_VALUE && mo10218c4 >= 1) {
                    return (KoreanCalendar) KoreanCalendar.m11016r0(m10855b, C10651h.m10870d(1), 1).m20145L(mo10218c4 - 1, EnumC10629e.DAYS);
                }
            }
            return null;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10628d extends AbstractC10642d<KoreanCalendar> {

        /* renamed from: d */
        private static final List<C10835p> f27718d;

        /* renamed from: e */
        private static final long f27719e;

        /* renamed from: f */
        private static final long f27720f;

        /* renamed from: g */
        private static final long f27721g;

        /* renamed from: h */
        private static final long f27722h;

        static {
            ArrayList arrayList = new ArrayList(5);
            EnumC10803f enumC10803f = EnumC10803f.AHEAD_OF_UTC;
            arrayList.add(C10835p.m10033c(enumC10803f, 126, 58, 0.0d));
            arrayList.add(C10835p.m10021p(enumC10803f, 8, 30));
            arrayList.add(C10835p.m10021p(enumC10803f, 9, 0));
            arrayList.add(C10835p.m10021p(enumC10803f, 8, 30));
            arrayList.add(C10835p.m10021p(enumC10803f, 9, 0));
            f27718d = Collections.unmodifiableList(arrayList);
            f27719e = C10697f0.m10713M0(1908, 4, 1).mo10920b();
            f27720f = C10697f0.m10713M0(1912, 1, 1).mo10920b();
            f27721g = C10697f0.m10713M0(1954, 3, 21).mo10920b();
            f27722h = C10697f0.m10713M0(1961, 8, 10).mo10920b();
        }

        private C10628d() {
        }

        @Override // net.time4j.calendar.AbstractC10642d
        /* renamed from: h */
        int[] mo10942h() {
            return KoreanCalendar.f27706p;
        }

        @Override // net.time4j.calendar.AbstractC10642d
        /* renamed from: i */
        public C10835p mo10941i(long j) {
            if (j < f27719e) {
                return f27718d.get(0);
            }
            if (j < f27720f) {
                return f27718d.get(1);
            }
            if (j < f27721g) {
                return f27718d.get(2);
            }
            if (j < f27722h) {
                return f27718d.get(3);
            }
            return f27718d.get(4);
        }

        @Override // net.time4j.calendar.AbstractC10642d
        /* renamed from: x */
        public KoreanCalendar mo10945e(int i, int i2, C10651h c10651h, int i3, long j) {
            return new KoreanCalendar(i, i2, c10651h, i3, j, null);
        }

        /* synthetic */ C10628d(C10625a c10625a) {
            this();
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public enum EnumC10629e implements InterfaceC7671w {
        CYCLES(1.893415507776E9d),
        YEARS(3.15569251296E7d),
        MONTHS(2551442.8775903997d),
        WEEKS(604800.0d),
        DAYS(86400.0d);
        

        /* renamed from: j */
        private final transient double f27729j;

        EnumC10629e(double d) {
            this.f27729j = d;
        }

        @Override // p162ij.InterfaceC7671w
        public double getLength() {
            return this.f27729j;
        }
    }

    /* renamed from: net.time4j.calendar.KoreanCalendar$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10630f implements InterfaceC7676z<KoreanCalendar, Integer> {
        private C10630f() {
        }

        /* synthetic */ C10630f(C10625a c10625a) {
            this();
        }

        /* renamed from: e */
        private int m11001e(KoreanCalendar koreanCalendar) {
            return ((koreanCalendar.m10921a0() * 60) + koreanCalendar.m10910k0().getNumber()) - 364;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: a */
        public InterfaceC7664p<?> mo9926b(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9925c(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public Integer mo9922f(KoreanCalendar koreanCalendar) {
            return 5332;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public Integer mo9917l(KoreanCalendar koreanCalendar) {
            return 3978;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public Integer mo9915o(KoreanCalendar koreanCalendar) {
            return Integer.valueOf(m11001e(koreanCalendar));
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(KoreanCalendar koreanCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = mo9917l(koreanCalendar).intValue();
            int intValue2 = mo9922f(koreanCalendar).intValue();
            if (num.intValue() < intValue || num.intValue() > intValue2) {
                return false;
            }
            return true;
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: q */
        public KoreanCalendar mo9916n(KoreanCalendar koreanCalendar, Integer num, boolean z) {
            if (num != null) {
                if (mo9920i(koreanCalendar, num)) {
                    return (KoreanCalendar) koreanCalendar.m20145L(num.intValue() - m11001e(koreanCalendar), EnumC10629e.YEARS);
                }
                throw new IllegalArgumentException("Invalid year of era: " + num);
            }
            throw new IllegalArgumentException("Missing year of era.");
        }
    }

    static {
        EnumC10655k enumC10655k = EnumC10655k.DANGI;
        InterfaceC7664p<EnumC10655k> m10851a = enumC10655k.m10851a();
        f27707q = m10851a;
        C10680f c10680f = new C10680f("CYCLE", KoreanCalendar.class, 72, 94, (char) 0, null, null);
        f27708r = c10680f;
        InterfaceC7664p<Integer> m10849c = enumC10655k.m10849c();
        f27709s = m10849c;
        C10643e c10643e = C10643e.f27745j;
        f27710t = c10643e;
        C10652i m10861u = C10652i.m10861u();
        f27711u = m10861u;
        C10650g c10650g = C10650g.f27758j;
        f27712v = c10650g;
        C10680f c10680f2 = new C10680f("MONTH_AS_ORDINAL", KoreanCalendar.class, 1, 12, (char) 0, null, null);
        f27713w = c10680f2;
        C10680f c10680f3 = new C10680f("DAY_OF_MONTH", KoreanCalendar.class, 1, 30, 'd');
        f27714x = c10680f3;
        C10680f c10680f4 = new C10680f("DAY_OF_YEAR", KoreanCalendar.class, 1, 355, 'D');
        f27715y = c10680f4;
        C10681g c10681g = new C10681g(KoreanCalendar.class, m11018p0());
        f27716z = c10681g;
        C10670r<KoreanCalendar> c10670r = new C10670r<>(KoreanCalendar.class, c10680f3, c10681g);
        f27702A = c10670r;
        f27703B = c10670r;
        C10628d c10628d = new C10628d(null);
        f27704C = c10628d;
        C7644h0.C7646b m20167d = C7644h0.C7646b.m20161j(EnumC10629e.class, KoreanCalendar.class, new C10627c(), c10628d).m20167d(m10851a, new C10626b(null)).m20167d(c10680f, AbstractC10644f.m10919b0(c10643e));
        C10630f c10630f = new C10630f(null);
        EnumC10629e enumC10629e = EnumC10629e.YEARS;
        C7644h0.C7646b m20167d2 = m20167d.m20166e(m10849c, c10630f, enumC10629e).m20166e(c10643e, AbstractC10644f.m10909l0(c10650g), enumC10629e).m20167d(m10861u, C10652i.m10861u());
        InterfaceC7676z m10912i0 = AbstractC10644f.m10912i0(c10680f3);
        EnumC10629e enumC10629e2 = EnumC10629e.MONTHS;
        C7644h0.C7646b m20166e = m20167d2.m20166e(c10650g, m10912i0, enumC10629e2).m20166e(c10680f2, AbstractC10644f.m10913h0(c10680f3), enumC10629e2);
        InterfaceC7676z m10918c0 = AbstractC10644f.m10918c0();
        EnumC10629e enumC10629e3 = EnumC10629e.DAYS;
        C7644h0.C7646b m20167d3 = m20166e.m20166e(c10680f3, m10918c0, enumC10629e3).m20166e(c10680f4, AbstractC10644f.m10916e0(), enumC10629e3).m20166e(c10681g, new C10674s(m11018p0(), new C10625a()), enumC10629e3).m20167d(c10670r, C10670r.m10788D(c10670r)).m20167d(C10632b.f27731a, new C10663n(c10628d, c10680f4));
        EnumC10629e enumC10629e4 = EnumC10629e.CYCLES;
        C7644h0.C7646b m20164g = m20167d3.m20164g(enumC10629e4, AbstractC10644f.m10911j0(0), enumC10629e4.getLength(), Collections.singleton(enumC10629e)).m20164g(enumC10629e, AbstractC10644f.m10911j0(1), enumC10629e.getLength(), Collections.singleton(enumC10629e4)).m20164g(enumC10629e2, AbstractC10644f.m10911j0(2), enumC10629e2.getLength(), Collections.emptySet());
        EnumC10629e enumC10629e5 = EnumC10629e.WEEKS;
        f27705D = m20164g.m20164g(enumC10629e5, AbstractC10644f.m10911j0(3), enumC10629e5.getLength(), Collections.singleton(enumC10629e3)).m20164g(enumC10629e3, AbstractC10644f.m10911j0(4), enumC10629e3.getLength(), Collections.singleton(enumC10629e5)).m20165f(new C10632b.C10639g(KoreanCalendar.class, c10680f3, c10680f4, m11018p0())).m20163h();
    }

    /* synthetic */ KoreanCalendar(int i, int i2, C10651h c10651h, int i3, long j, C10625a c10625a) {
        this(i, i2, c10651h, i3, j);
    }

    /* renamed from: p0 */
    public static C10852z0 m11018p0() {
        return C10852z0.m9969j(new Locale("ko", "KR"));
    }

    /* renamed from: q0 */
    static KoreanCalendar m11017q0(int i, int i2, C10651h c10651h, int i3) {
        return new KoreanCalendar(i, i2, c10651h, i3, f27704C.m10930t(i, i2, c10651h, i3));
    }

    /* renamed from: r0 */
    public static KoreanCalendar m11016r0(AbstractC10653j abstractC10653j, C10651h c10651h, int i) {
        return m11017q0(abstractC10653j.m10854c(), abstractC10653j.m10853e().getNumber(), c10651h, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    @Override // p162ij.AbstractC7654k0, p162ij.AbstractC7665q
    /* renamed from: I */
    public C7644h0<EnumC10629e, KoreanCalendar> mo10478v() {
        return f27705D;
    }

    @Override // net.time4j.calendar.AbstractC10644f
    /* renamed from: Z */
    public AbstractC10642d<KoreanCalendar> mo10922Z() {
        return f27704C;
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: o0 */
    public KoreanCalendar mo10477w() {
        return this;
    }

    private KoreanCalendar(int i, int i2, C10651h c10651h, int i3, long j) {
        super(i, i2, c10651h, i3, j);
    }
}