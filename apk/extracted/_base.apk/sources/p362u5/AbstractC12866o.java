package p362u5;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p362u5.C12854i;

@AutoValue
/* renamed from: u5.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12866o {

    @AutoValue.Builder
    /* renamed from: u5.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC12867a {
        /* renamed from: a */
        public abstract AbstractC12866o mo3760a();

        /* renamed from: b */
        public abstract AbstractC12867a mo3759b(EnumC12868b enumC12868b);

        /* renamed from: c */
        public abstract AbstractC12867a mo3758c(EnumC12869c enumC12869c);
    }

    /* renamed from: u5.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC12868b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: F */
        private static final SparseArray<EnumC12868b> f33446F;

        /* renamed from: j */
        private final int f33464j;

        static {
            EnumC12868b enumC12868b = UNKNOWN_MOBILE_SUBTYPE;
            EnumC12868b enumC12868b2 = GPRS;
            EnumC12868b enumC12868b3 = EDGE;
            EnumC12868b enumC12868b4 = UMTS;
            EnumC12868b enumC12868b5 = CDMA;
            EnumC12868b enumC12868b6 = EVDO_0;
            EnumC12868b enumC12868b7 = EVDO_A;
            EnumC12868b enumC12868b8 = RTT;
            EnumC12868b enumC12868b9 = HSDPA;
            EnumC12868b enumC12868b10 = HSUPA;
            EnumC12868b enumC12868b11 = HSPA;
            EnumC12868b enumC12868b12 = IDEN;
            EnumC12868b enumC12868b13 = EVDO_B;
            EnumC12868b enumC12868b14 = LTE;
            EnumC12868b enumC12868b15 = EHRPD;
            EnumC12868b enumC12868b16 = HSPAP;
            EnumC12868b enumC12868b17 = GSM;
            EnumC12868b enumC12868b18 = TD_SCDMA;
            EnumC12868b enumC12868b19 = IWLAN;
            EnumC12868b enumC12868b20 = LTE_CA;
            SparseArray<EnumC12868b> sparseArray = new SparseArray<>();
            f33446F = sparseArray;
            sparseArray.put(0, enumC12868b);
            sparseArray.put(1, enumC12868b2);
            sparseArray.put(2, enumC12868b3);
            sparseArray.put(3, enumC12868b4);
            sparseArray.put(4, enumC12868b5);
            sparseArray.put(5, enumC12868b6);
            sparseArray.put(6, enumC12868b7);
            sparseArray.put(7, enumC12868b8);
            sparseArray.put(8, enumC12868b9);
            sparseArray.put(9, enumC12868b10);
            sparseArray.put(10, enumC12868b11);
            sparseArray.put(11, enumC12868b12);
            sparseArray.put(12, enumC12868b13);
            sparseArray.put(13, enumC12868b14);
            sparseArray.put(14, enumC12868b15);
            sparseArray.put(15, enumC12868b16);
            sparseArray.put(16, enumC12868b17);
            sparseArray.put(17, enumC12868b18);
            sparseArray.put(18, enumC12868b19);
            sparseArray.put(19, enumC12868b20);
        }

        EnumC12868b(int i) {
            this.f33464j = i;
        }

        /* renamed from: a */
        public static EnumC12868b m3757a(int i) {
            return f33446F.get(i);
        }

        /* renamed from: b */
        public int m3756b() {
            return this.f33464j;
        }
    }

    /* renamed from: u5.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC12869c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: D */
        private static final SparseArray<EnumC12869c> f33468D;

        /* renamed from: j */
        private final int f33486j;

        static {
            EnumC12869c enumC12869c = MOBILE;
            EnumC12869c enumC12869c2 = WIFI;
            EnumC12869c enumC12869c3 = MOBILE_MMS;
            EnumC12869c enumC12869c4 = MOBILE_SUPL;
            EnumC12869c enumC12869c5 = MOBILE_DUN;
            EnumC12869c enumC12869c6 = MOBILE_HIPRI;
            EnumC12869c enumC12869c7 = WIMAX;
            EnumC12869c enumC12869c8 = BLUETOOTH;
            EnumC12869c enumC12869c9 = DUMMY;
            EnumC12869c enumC12869c10 = ETHERNET;
            EnumC12869c enumC12869c11 = MOBILE_FOTA;
            EnumC12869c enumC12869c12 = MOBILE_IMS;
            EnumC12869c enumC12869c13 = MOBILE_CBS;
            EnumC12869c enumC12869c14 = WIFI_P2P;
            EnumC12869c enumC12869c15 = MOBILE_IA;
            EnumC12869c enumC12869c16 = MOBILE_EMERGENCY;
            EnumC12869c enumC12869c17 = PROXY;
            EnumC12869c enumC12869c18 = VPN;
            EnumC12869c enumC12869c19 = NONE;
            SparseArray<EnumC12869c> sparseArray = new SparseArray<>();
            f33468D = sparseArray;
            sparseArray.put(0, enumC12869c);
            sparseArray.put(1, enumC12869c2);
            sparseArray.put(2, enumC12869c3);
            sparseArray.put(3, enumC12869c4);
            sparseArray.put(4, enumC12869c5);
            sparseArray.put(5, enumC12869c6);
            sparseArray.put(6, enumC12869c7);
            sparseArray.put(7, enumC12869c8);
            sparseArray.put(8, enumC12869c9);
            sparseArray.put(9, enumC12869c10);
            sparseArray.put(10, enumC12869c11);
            sparseArray.put(11, enumC12869c12);
            sparseArray.put(12, enumC12869c13);
            sparseArray.put(13, enumC12869c14);
            sparseArray.put(14, enumC12869c15);
            sparseArray.put(15, enumC12869c16);
            sparseArray.put(16, enumC12869c17);
            sparseArray.put(17, enumC12869c18);
            sparseArray.put(-1, enumC12869c19);
        }

        EnumC12869c(int i) {
            this.f33486j = i;
        }

        /* renamed from: a */
        public static EnumC12869c m3755a(int i) {
            return f33468D.get(i);
        }

        /* renamed from: b */
        public int m3754b() {
            return this.f33486j;
        }
    }

    /* renamed from: a */
    public static AbstractC12867a m3763a() {
        return new C12854i.C12856b();
    }

    /* renamed from: b */
    public abstract EnumC12868b mo3762b();

    /* renamed from: c */
    public abstract EnumC12869c mo3761c();
}
