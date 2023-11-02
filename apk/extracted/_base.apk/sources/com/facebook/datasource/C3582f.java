package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p359u2.C12818a;
import p394w2.C13375i;
import p394w2.C13379j;

/* renamed from: com.facebook.datasource.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3582f<T> implements Supplier<DataSource<T>> {

    /* renamed from: a */
    private final List<Supplier<DataSource<T>>> f9728a;

    /* renamed from: b */
    private final boolean f9729b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3583a extends AbstractC3569a<T> {

        /* renamed from: h */
        private ArrayList<DataSource<T>> f9730h;

        /* renamed from: i */
        private int f9731i;

        /* renamed from: j */
        private int f9732j;

        /* renamed from: k */
        private AtomicInteger f9733k;

        /* renamed from: l */
        private Throwable f9734l;

        /* renamed from: m */
        private Map<String, Object> f9735m;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.datasource.f$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3584a implements InterfaceC3577d<T> {

            /* renamed from: a */
            private int f9737a;

            public C3584a(int i) {
                this.f9737a = i;
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onFailure(DataSource<T> dataSource) {
                C3583a.this.m31666G(this.f9737a, dataSource);
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.mo31663b()) {
                    C3583a.this.m31665H(this.f9737a, dataSource);
                } else if (dataSource.mo31712a()) {
                    C3583a.this.m31666G(this.f9737a, dataSource);
                }
            }

            @Override // com.facebook.datasource.InterfaceC3577d
            public void onProgressUpdate(DataSource<T> dataSource) {
                if (this.f9737a == 0) {
                    C3583a.this.m31698s(dataSource.mo31709e());
                }
            }
        }

        public C3583a() {
            if (!C3582f.this.f9729b) {
                m31672A();
            }
        }

        /* renamed from: A */
        private void m31672A() {
            if (this.f9733k != null) {
                return;
            }
            synchronized (this) {
                if (this.f9733k == null) {
                    this.f9733k = new AtomicInteger(0);
                    int size = C3582f.this.f9728a.size();
                    this.f9732j = size;
                    this.f9731i = size;
                    this.f9730h = new ArrayList<>(size);
                    for (int i = 0; i < size; i++) {
                        DataSource<T> dataSource = (DataSource) ((Supplier) C3582f.this.f9728a.get(i)).get();
                        this.f9730h.add(dataSource);
                        dataSource.mo31710d(new C3584a(i), C12818a.m3873a());
                        if (dataSource.mo31663b()) {
                            break;
                        }
                    }
                }
            }
        }

        /* renamed from: B */
        private synchronized DataSource<T> m31671B(int i) {
            DataSource<T> dataSource;
            ArrayList<DataSource<T>> arrayList = this.f9730h;
            dataSource = null;
            if (arrayList != null && i < arrayList.size()) {
                dataSource = this.f9730h.set(i, null);
            }
            return dataSource;
        }

        /* renamed from: C */
        private synchronized DataSource<T> m31670C(int i) {
            DataSource<T> dataSource;
            ArrayList<DataSource<T>> arrayList = this.f9730h;
            if (arrayList != null && i < arrayList.size()) {
                dataSource = this.f9730h.get(i);
            } else {
                dataSource = null;
            }
            return dataSource;
        }

        /* renamed from: D */
        private synchronized DataSource<T> m31669D() {
            return m31670C(this.f9731i);
        }

        /* renamed from: E */
        private void m31668E() {
            Throwable th2;
            if (this.f9733k.incrementAndGet() == this.f9732j && (th2 = this.f9734l) != null) {
                m31700q(th2, this.f9735m);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[LOOP:0: B:17:0x0020->B:18:0x0022, LOOP_END] */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m31667F(int r3, com.facebook.datasource.DataSource<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f9731i     // Catch: java.lang.Throwable -> L2f
                com.facebook.datasource.DataSource r1 = r2.m31670C(r3)     // Catch: java.lang.Throwable -> L2f
                if (r4 != r1) goto L2d
                int r4 = r2.f9731i     // Catch: java.lang.Throwable -> L2f
                if (r3 != r4) goto Le
                goto L2d
            Le:
                com.facebook.datasource.DataSource r4 = r2.m31669D()     // Catch: java.lang.Throwable -> L2f
                if (r4 == 0) goto L1d
                if (r5 == 0) goto L1b
                int r4 = r2.f9731i     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r4) goto L1b
                goto L1d
            L1b:
                r3 = r0
                goto L1f
            L1d:
                r2.f9731i = r3     // Catch: java.lang.Throwable -> L2f
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            L20:
                if (r0 <= r3) goto L2c
                com.facebook.datasource.DataSource r4 = r2.m31671B(r0)
                r2.m31660z(r4)
                int r0 = r0 + (-1)
                goto L20
            L2c:
                return
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                return
            L2f:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C3582f.C3583a.m31667F(int, com.facebook.datasource.DataSource, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public void m31666G(int i, DataSource<T> dataSource) {
            m31660z(m31664I(i, dataSource));
            if (i == 0) {
                this.f9734l = dataSource.mo31711c();
                this.f9735m = dataSource.getExtras();
            }
            m31668E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public void m31665H(int i, DataSource<T> dataSource) {
            boolean z;
            m31667F(i, dataSource, dataSource.mo31712a());
            if (dataSource == m31669D()) {
                if (i == 0 && dataSource.mo31712a()) {
                    z = true;
                } else {
                    z = false;
                }
                m31696u(null, z, dataSource.getExtras());
            }
            m31668E();
        }

        /* renamed from: I */
        private synchronized DataSource<T> m31664I(int i, DataSource<T> dataSource) {
            if (dataSource == m31669D()) {
                return null;
            }
            if (dataSource == m31670C(i)) {
                return m31671B(i);
            }
            return dataSource;
        }

        /* renamed from: z */
        private void m31660z(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
        /* renamed from: b */
        public synchronized boolean mo31663b() {
            boolean z;
            if (C3582f.this.f9729b) {
                m31672A();
            }
            DataSource<T> m31669D = m31669D();
            if (m31669D != null) {
                if (m31669D.mo31663b()) {
                    z = true;
                }
            }
            z = false;
            return z;
        }

        @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
        public boolean close() {
            if (C3582f.this.f9729b) {
                m31672A();
            }
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                ArrayList<DataSource<T>> arrayList = this.f9730h;
                this.f9730h = null;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        m31660z(arrayList.get(i));
                    }
                    return true;
                }
                return true;
            }
        }

        @Override // com.facebook.datasource.AbstractC3569a, com.facebook.datasource.DataSource
        /* renamed from: g */
        public synchronized T mo31018g() {
            T t;
            if (C3582f.this.f9729b) {
                m31672A();
            }
            DataSource<T> m31669D = m31669D();
            if (m31669D != null) {
                t = m31669D.mo31018g();
            } else {
                t = null;
            }
            return t;
        }
    }

    private C3582f(List<Supplier<DataSource<T>>> list, boolean z) {
        C13379j.m2681c(!list.isEmpty(), "List of suppliers is empty!");
        this.f9728a = list;
        this.f9729b = z;
    }

    /* renamed from: c */
    public static <T> C3582f<T> m31674c(List<Supplier<DataSource<T>>> list, boolean z) {
        return new C3582f<>(list, z);
    }

    @Override // com.facebook.common.internal.Supplier
    /* renamed from: d */
    public DataSource<T> get() {
        return new C3583a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3582f)) {
            return false;
        }
        return C13375i.m2691a(this.f9728a, ((C3582f) obj).f9728a);
    }

    public int hashCode() {
        return this.f9728a.hashCode();
    }

    public String toString() {
        return C13375i.m2689c(this).m2687b("list", this.f9728a).toString();
    }
}
