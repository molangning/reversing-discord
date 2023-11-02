package p059d6;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p059d6.C5746c;
import p116g6.InterfaceC6553a;
import p347t5.EnumC12590d;

@AutoValue
/* renamed from: d6.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC5751f {

    /* renamed from: d6.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5752a {

        /* renamed from: a */
        private InterfaceC6553a f16540a;

        /* renamed from: b */
        private Map<EnumC12590d, AbstractC5753b> f16541b = new HashMap();

        /* renamed from: a */
        public C5752a m24568a(EnumC12590d enumC12590d, AbstractC5753b abstractC5753b) {
            this.f16541b.put(enumC12590d, abstractC5753b);
            return this;
        }

        /* renamed from: b */
        public AbstractC5751f m24567b() {
            if (this.f16540a != null) {
                if (this.f16541b.keySet().size() >= EnumC12590d.values().length) {
                    Map<EnumC12590d, AbstractC5753b> map = this.f16541b;
                    this.f16541b = new HashMap();
                    return AbstractC5751f.m24575d(this.f16540a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        /* renamed from: c */
        public C5752a m24566c(InterfaceC6553a interfaceC6553a) {
            this.f16540a = interfaceC6553a;
            return this;
        }
    }

    @AutoValue
    /* renamed from: d6.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC5753b {

        @AutoValue.Builder
        /* renamed from: d6.f$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static abstract class AbstractC5754a {
            /* renamed from: a */
            public abstract AbstractC5753b mo24561a();

            /* renamed from: b */
            public abstract AbstractC5754a mo24560b(long j);

            /* renamed from: c */
            public abstract AbstractC5754a mo24559c(Set<EnumC5755c> set);

            /* renamed from: d */
            public abstract AbstractC5754a mo24558d(long j);
        }

        /* renamed from: a */
        public static AbstractC5754a m24565a() {
            return new C5746c.C5748b().mo24559c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo24564b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<EnumC5755c> mo24563c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo24562d();
    }

    /* renamed from: d6.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5755c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m24578a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    /* renamed from: b */
    public static C5752a m24577b() {
        return new C5752a();
    }

    /* renamed from: d */
    static AbstractC5751f m24575d(InterfaceC6553a interfaceC6553a, Map<EnumC12590d, AbstractC5753b> map) {
        return new C5745b(interfaceC6553a, map);
    }

    /* renamed from: f */
    public static AbstractC5751f m24573f(InterfaceC6553a interfaceC6553a) {
        return m24577b().m24568a(EnumC12590d.DEFAULT, AbstractC5753b.m24565a().mo24560b(30000L).mo24558d(86400000L).mo24561a()).m24568a(EnumC12590d.HIGHEST, AbstractC5753b.m24565a().mo24560b(1000L).mo24558d(86400000L).mo24561a()).m24568a(EnumC12590d.VERY_LOW, AbstractC5753b.m24565a().mo24560b(86400000L).mo24558d(86400000L).mo24559c(m24570i(EnumC5755c.NETWORK_UNMETERED, EnumC5755c.DEVICE_IDLE)).mo24561a()).m24566c(interfaceC6553a).m24567b();
    }

    /* renamed from: i */
    private static <T> Set<T> m24570i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m24569j(JobInfo.Builder builder, Set<EnumC5755c> set) {
        if (set.contains(EnumC5755c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC5755c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC5755c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m24576c(JobInfo.Builder builder, EnumC12590d enumC12590d, long j, int i) {
        builder.setMinimumLatency(m24572g(enumC12590d, j, i));
        m24569j(builder, mo24571h().get(enumC12590d).mo24563c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC6553a mo24574e();

    /* renamed from: g */
    public long m24572g(EnumC12590d enumC12590d, long j, int i) {
        long mo22402a = j - mo24574e().mo22402a();
        AbstractC5753b abstractC5753b = mo24571h().get(enumC12590d);
        return Math.min(Math.max(m24578a(i, abstractC5753b.mo24564b()), mo22402a), abstractC5753b.mo24562d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<EnumC12590d, AbstractC5753b> mo24571h();
}
