package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.List;
import p359u2.C12818a;
import p394w2.C13375i;
import p394w2.C13379j;

/* renamed from: com.facebook.datasource.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3578e<T> implements Supplier<DataSource<T>> {

    /* renamed from: a */
    private final List<Supplier<DataSource<T>>> f9722a;

    /* renamed from: com.facebook.datasource.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3580b extends AbstractC3569a<T> {

        /* renamed from: h */
        private int f9723h = 0;

        /* renamed from: i */
        private DataSource<T> f9724i = null;

        /* renamed from: j */
        private DataSource<T> f9725j = null;

        /* renamed from: com.facebook.datasource.e$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3581a implements InterfaceC3577d<T> {
            private C3581a() {
                C3580b.this = r1;
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onFailure(DataSource<T> dataSource) {
                C3580b.this.m31683E(dataSource);
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.mo31663b()) {
                    C3580b.this.m31682F(dataSource);
                } else if (dataSource.mo31712a()) {
                    C3580b.this.m31683E(dataSource);
                }
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onProgressUpdate(DataSource<T> dataSource) {
                C3580b.this.m31698s(Math.max(C3580b.this.mo31709e(), dataSource.mo31709e()));
            }
        }

        public C3580b() {
            C3578e.this = r2;
            if (!m31680H()) {
                mo31659p(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: A */
        private void m31687A(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        /* renamed from: B */
        private synchronized DataSource<T> m31686B() {
            return this.f9725j;
        }

        /* renamed from: C */
        private synchronized Supplier<DataSource<T>> m31685C() {
            if (!m31705k() && this.f9723h < C3578e.this.f9722a.size()) {
                List list = C3578e.this.f9722a;
                int i = this.f9723h;
                this.f9723h = i + 1;
                return (Supplier) list.get(i);
            }
            return null;
        }

        /* renamed from: D */
        private void m31684D(DataSource<T> dataSource, boolean z) {
            DataSource<T> dataSource2;
            synchronized (this) {
                if (dataSource == this.f9724i && dataSource != (dataSource2 = this.f9725j)) {
                    if (dataSource2 != null && !z) {
                        dataSource2 = null;
                        m31687A(dataSource2);
                    }
                    this.f9725j = dataSource;
                    m31687A(dataSource2);
                }
            }
        }

        /* renamed from: E */
        public void m31683E(DataSource<T> dataSource) {
            if (!m31677z(dataSource)) {
                return;
            }
            if (dataSource != m31686B()) {
                m31687A(dataSource);
            }
            if (!m31680H()) {
                m31700q(dataSource.mo31711c(), dataSource.getExtras());
            }
        }

        /* renamed from: F */
        public void m31682F(DataSource<T> dataSource) {
            m31684D(dataSource, dataSource.mo31712a());
            if (dataSource == m31686B()) {
                m31696u(null, dataSource.mo31712a(), dataSource.getExtras());
            }
        }

        /* renamed from: G */
        private synchronized boolean m31681G(DataSource<T> dataSource) {
            if (m31705k()) {
                return false;
            }
            this.f9724i = dataSource;
            return true;
        }

        /* renamed from: H */
        private boolean m31680H() {
            DataSource<T> dataSource;
            Supplier<DataSource<T>> m31685C = m31685C();
            if (m31685C != null) {
                dataSource = m31685C.get();
            } else {
                dataSource = null;
            }
            if (m31681G(dataSource) && dataSource != null) {
                dataSource.mo31710d(new C3581a(), C12818a.m3873a());
                return true;
            }
            m31687A(dataSource);
            return false;
        }

        /* renamed from: z */
        private synchronized boolean m31677z(DataSource<T> dataSource) {
            if (!m31705k() && dataSource == this.f9724i) {
                this.f9724i = null;
                return true;
            }
            return false;
        }

        @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
        /* renamed from: b */
        public synchronized boolean mo31663b() {
            boolean z;
            DataSource<T> m31686B = m31686B();
            if (m31686B != null) {
                if (m31686B.mo31663b()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.f9724i;
                this.f9724i = null;
                DataSource<T> dataSource2 = this.f9725j;
                this.f9725j = null;
                m31687A(dataSource2);
                m31687A(dataSource);
                return true;
            }
        }

        @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
        /* renamed from: g */
        public synchronized T mo31018g() {
            T t;
            DataSource<T> m31686B = m31686B();
            if (m31686B != null) {
                t = m31686B.mo31018g();
            } else {
                t = null;
            }
            return t;
        }
    }

    private C3578e(List<Supplier<DataSource<T>>> list) {
        C13379j.m2681c(!list.isEmpty(), "List of suppliers is empty!");
        this.f9722a = list;
    }

    /* renamed from: b */
    public static <T> C3578e<T> m31689b(List<Supplier<DataSource<T>>> list) {
        return new C3578e<>(list);
    }

    @Override // com.facebook.common.internal.Supplier
    /* renamed from: c */
    public DataSource<T> get() {
        return new C3580b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3578e)) {
            return false;
        }
        return C13375i.m2691a(this.f9722a, ((C3578e) obj).f9722a);
    }

    public int hashCode() {
        return this.f9722a.hashCode();
    }

    public String toString() {
        return C13375i.m2689c(this).m2687b("list", this.f9722a).toString();
    }
}