package io.sentry;

import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: io.sentry.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7962i1 {

    /* renamed from: a */
    private final ArrayList<InterfaceC7965c> f21635a = new ArrayList<>();

    /* renamed from: io.sentry.i1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C7963a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21636a;

        static {
            int[] iArr = new int[EnumC8255b.values().length];
            f21636a = iArr;
            try {
                iArr[EnumC8255b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21636a[EnumC8255b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21636a[EnumC8255b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21636a[EnumC8255b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21636a[EnumC8255b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21636a[EnumC8255b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21636a[EnumC8255b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21636a[EnumC8255b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21636a[EnumC8255b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21636a[EnumC8255b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: io.sentry.i1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7964b {
        /* renamed from: a */
        Object mo19131a();
    }

    /* renamed from: io.sentry.i1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7965c {
        Object getValue();
    }

    /* renamed from: io.sentry.i1$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7968f implements InterfaceC7965c {

        /* renamed from: a */
        final String f21639a;

        C7968f(String str) {
            this.f21639a = str;
        }

        @Override // io.sentry.C7962i1.InterfaceC7965c
        public Object getValue() {
            return this.f21639a;
        }
    }

    /* renamed from: io.sentry.i1$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7969g implements InterfaceC7965c {

        /* renamed from: a */
        final Object f21640a;

        C7969g(Object obj) {
            this.f21640a = obj;
        }

        @Override // io.sentry.C7962i1.InterfaceC7965c
        public Object getValue() {
            return this.f21640a;
        }
    }

    /* renamed from: f */
    private InterfaceC7965c m19143f() {
        if (this.f21635a.isEmpty()) {
            return null;
        }
        ArrayList<InterfaceC7965c> arrayList = this.f21635a;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: g */
    private boolean m19142g() {
        if (m19140i()) {
            return true;
        }
        InterfaceC7965c m19143f = m19143f();
        m19133p();
        if (m19143f() instanceof C7968f) {
            C7968f c7968f = (C7968f) m19143f();
            m19133p();
            C7967e c7967e = (C7967e) m19143f();
            if (c7968f != null && m19143f != null && c7967e != null) {
                c7967e.f21638a.put(c7968f.f21639a, m19143f.getValue());
                return false;
            }
            return false;
        } else if (m19143f() instanceof C7966d) {
            C7966d c7966d = (C7966d) m19143f();
            if (m19143f != null && c7966d != null) {
                c7966d.f21637a.add(m19143f.getValue());
                return false;
            }
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    private boolean m19141h(InterfaceC7964b interfaceC7964b) {
        Object mo19131a = interfaceC7964b.mo19131a();
        if (m19143f() == null && mo19131a != null) {
            m19132q(new C7969g(mo19131a));
            return true;
        } else if (m19143f() instanceof C7968f) {
            m19133p();
            ((C7967e) m19143f()).f21638a.put(((C7968f) m19143f()).f21639a, mo19131a);
            return false;
        } else if (m19143f() instanceof C7966d) {
            ((C7966d) m19143f()).f21637a.add(mo19131a);
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    private boolean m19140i() {
        return this.f21635a.size() == 1;
    }

    /* renamed from: l */
    public static /* synthetic */ Object m19137l(C7993j1 c7993j1) {
        return Boolean.valueOf(c7993j1.m18113D());
    }

    /* renamed from: m */
    public static /* synthetic */ Object m19136m() {
        return null;
    }

    /* renamed from: n */
    public Object m19138k(C7993j1 c7993j1) {
        try {
            try {
                return Integer.valueOf(c7993j1.m18107I());
            } catch (Exception unused) {
                return Long.valueOf(c7993j1.m18106Q());
            }
        } catch (Exception unused2) {
            return Double.valueOf(c7993j1.m18108H());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: o */
    private void m19134o(final C7993j1 c7993j1) {
        boolean z;
        switch (C7963a.f21636a[c7993j1.m18098e0().ordinal()]) {
            case 1:
                c7993j1.m18100a();
                m19132q(new C7966d(null));
                z = false;
                break;
            case 2:
                c7993j1.m18092o();
                z = m19142g();
                break;
            case 3:
                c7993j1.m18097h();
                m19132q(new C7967e(null));
                z = false;
                break;
            case 4:
                c7993j1.m18091q();
                z = m19142g();
                break;
            case 5:
                m19132q(new C7968f(c7993j1.m18105R()));
                z = false;
                break;
            case 6:
                z = m19141h(new InterfaceC7964b() { // from class: io.sentry.e1
                    @Override // io.sentry.C7962i1.InterfaceC7964b
                    /* renamed from: a */
                    public final Object mo19131a() {
                        Object m18101Y;
                        m18101Y = C7993j1.this.m18101Y();
                        return m18101Y;
                    }
                });
                break;
            case 7:
                z = m19141h(new InterfaceC7964b() { // from class: io.sentry.f1
                    @Override // io.sentry.C7962i1.InterfaceC7964b
                    /* renamed from: a */
                    public final Object mo19131a() {
                        Object m19138k;
                        m19138k = C7962i1.this.m19138k(c7993j1);
                        return m19138k;
                    }
                });
                break;
            case 8:
                z = m19141h(new InterfaceC7964b() { // from class: io.sentry.g1
                    @Override // io.sentry.C7962i1.InterfaceC7964b
                    /* renamed from: a */
                    public final Object mo19131a() {
                        Object m19137l;
                        m19137l = C7962i1.m19137l(C7993j1.this);
                        return m19137l;
                    }
                });
                break;
            case 9:
                c7993j1.m18103U();
                z = m19141h(new InterfaceC7964b() { // from class: io.sentry.h1
                    @Override // io.sentry.C7962i1.InterfaceC7964b
                    /* renamed from: a */
                    public final Object mo19131a() {
                        Object m19136m;
                        m19136m = C7962i1.m19136m();
                        return m19136m;
                    }
                });
                break;
            case 10:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            m19134o(c7993j1);
        }
    }

    /* renamed from: p */
    private void m19133p() {
        if (this.f21635a.isEmpty()) {
            return;
        }
        ArrayList<InterfaceC7965c> arrayList = this.f21635a;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: q */
    private void m19132q(InterfaceC7965c interfaceC7965c) {
        this.f21635a.add(interfaceC7965c);
    }

    /* renamed from: e */
    public Object m19144e(C7993j1 c7993j1) {
        m19134o(c7993j1);
        InterfaceC7965c m19143f = m19143f();
        if (m19143f != null) {
            return m19143f.getValue();
        }
        return null;
    }

    /* renamed from: io.sentry.i1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7966d implements InterfaceC7965c {

        /* renamed from: a */
        final ArrayList<Object> f21637a;

        private C7966d() {
            this.f21637a = new ArrayList<>();
        }

        @Override // io.sentry.C7962i1.InterfaceC7965c
        public Object getValue() {
            return this.f21637a;
        }

        /* synthetic */ C7966d(C7963a c7963a) {
            this();
        }
    }

    /* renamed from: io.sentry.i1$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7967e implements InterfaceC7965c {

        /* renamed from: a */
        final HashMap<String, Object> f21638a;

        private C7967e() {
            this.f21638a = new HashMap<>();
        }

        @Override // io.sentry.C7962i1.InterfaceC7965c
        public Object getValue() {
            return this.f21638a;
        }

        /* synthetic */ C7967e(C7963a c7963a) {
            this();
        }
    }
}