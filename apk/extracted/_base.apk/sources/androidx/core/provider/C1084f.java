package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.C1024e;
import androidx.core.provider.C1090g;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p236n.C10477a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1084f {

    /* renamed from: a */
    static final C10477a<String, Typeface> f3426a = new C10477a<>(16);

    /* renamed from: b */
    private static final ExecutorService f3427b = C1094h.m37908a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f3428c = new Object();

    /* renamed from: d */
    static final SimpleArrayMap<String, ArrayList<Consumer<C1089e>>> f3429d = new SimpleArrayMap<>();

    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class CallableC1085a implements Callable<C1089e> {

        /* renamed from: j */
        final /* synthetic */ String f3430j;

        /* renamed from: k */
        final /* synthetic */ Context f3431k;

        /* renamed from: l */
        final /* synthetic */ C1083e f3432l;

        /* renamed from: m */
        final /* synthetic */ int f3433m;

        CallableC1085a(String str, Context context, C1083e c1083e, int i) {
            this.f3430j = str;
            this.f3431k = context;
            this.f3432l = c1083e;
            this.f3433m = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1089e call() {
            return C1084f.m37930c(this.f3430j, this.f3431k, this.f3432l, this.f3433m);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1086b implements Consumer<C1089e> {

        /* renamed from: a */
        final /* synthetic */ C1076a f3434a;

        C1086b(C1076a c1076a) {
            this.f3434a = c1076a;
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: a */
        public void accept(C1089e c1089e) {
            if (c1089e == null) {
                c1089e = new C1089e(-3);
            }
            this.f3434a.m37951b(c1089e);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class CallableC1087c implements Callable<C1089e> {

        /* renamed from: j */
        final /* synthetic */ String f3435j;

        /* renamed from: k */
        final /* synthetic */ Context f3436k;

        /* renamed from: l */
        final /* synthetic */ C1083e f3437l;

        /* renamed from: m */
        final /* synthetic */ int f3438m;

        CallableC1087c(String str, Context context, C1083e c1083e, int i) {
            this.f3435j = str;
            this.f3436k = context;
            this.f3437l = c1083e;
            this.f3438m = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1089e call() {
            try {
                return C1084f.m37930c(this.f3435j, this.f3436k, this.f3437l, this.f3438m);
            } catch (Throwable unused) {
                return new C1089e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1088d implements Consumer<C1089e> {

        /* renamed from: a */
        final /* synthetic */ String f3439a;

        C1088d(String str) {
            this.f3439a = str;
        }

        @Override // androidx.core.util.Consumer
        /* renamed from: a */
        public void accept(C1089e c1089e) {
            synchronized (C1084f.f3428c) {
                SimpleArrayMap<String, ArrayList<Consumer<C1089e>>> simpleArrayMap = C1084f.f3429d;
                ArrayList<Consumer<C1089e>> arrayList = simpleArrayMap.get(this.f3439a);
                if (arrayList == null) {
                    return;
                }
                simpleArrayMap.remove(this.f3439a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(c1089e);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m37932a(C1083e c1083e, int i) {
        return c1083e.m37936d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m37931b(C1090g.C1091a c1091a) {
        int i = 1;
        if (c1091a.m37917c() != 0) {
            if (c1091a.m37917c() != 1) {
                return -3;
            }
            return -2;
        }
        C1090g.C1092b[] m37918b = c1091a.m37918b();
        if (m37918b != null && m37918b.length != 0) {
            i = 0;
            for (C1090g.C1092b c1092b : m37918b) {
                int m37915b = c1092b.m37915b();
                if (m37915b != 0) {
                    if (m37915b < 0) {
                        return -3;
                    }
                    return m37915b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C1089e m37930c(String str, Context context, C1083e c1083e, int i) {
        C10477a<String, Typeface> c10477a = f3426a;
        Typeface m11428c = c10477a.m11428c(str);
        if (m11428c != null) {
            return new C1089e(m11428c);
        }
        try {
            C1090g.C1091a m37944e = C1081d.m37944e(context, c1083e, null);
            int m37931b = m37931b(m37944e);
            if (m37931b != 0) {
                return new C1089e(m37931b);
            }
            Typeface m38054b = C1024e.m38054b(context, null, m37944e.m37918b(), i);
            if (m38054b != null) {
                c10477a.m11427d(str, m38054b);
                return new C1089e(m38054b);
            }
            return new C1089e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1089e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m37929d(Context context, C1083e c1083e, int i, Executor executor, C1076a c1076a) {
        String m37932a = m37932a(c1083e, i);
        Typeface m11428c = f3426a.m11428c(m37932a);
        if (m11428c != null) {
            c1076a.m37951b(new C1089e(m11428c));
            return m11428c;
        }
        C1086b c1086b = new C1086b(c1076a);
        synchronized (f3428c) {
            SimpleArrayMap<String, ArrayList<Consumer<C1089e>>> simpleArrayMap = f3429d;
            ArrayList<Consumer<C1089e>> arrayList = simpleArrayMap.get(m37932a);
            if (arrayList != null) {
                arrayList.add(c1086b);
                return null;
            }
            ArrayList<Consumer<C1089e>> arrayList2 = new ArrayList<>();
            arrayList2.add(c1086b);
            simpleArrayMap.put(m37932a, arrayList2);
            CallableC1087c callableC1087c = new CallableC1087c(m37932a, context, c1083e, i);
            if (executor == null) {
                executor = f3427b;
            }
            C1094h.m37907b(executor, callableC1087c, new C1088d(m37932a));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m37928e(Context context, C1083e c1083e, C1076a c1076a, int i, int i2) {
        String m37932a = m37932a(c1083e, i);
        Typeface m11428c = f3426a.m11428c(m37932a);
        if (m11428c != null) {
            c1076a.m37951b(new C1089e(m11428c));
            return m11428c;
        } else if (i2 == -1) {
            C1089e m37930c = m37930c(m37932a, context, c1083e, i);
            c1076a.m37951b(m37930c);
            return m37930c.f3440a;
        } else {
            try {
                C1089e c1089e = (C1089e) C1094h.m37906c(f3427b, new CallableC1085a(m37932a, context, c1083e, i), i2);
                c1076a.m37951b(c1089e);
                return c1089e.f3440a;
            } catch (InterruptedException unused) {
                c1076a.m37951b(new C1089e(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1089e {

        /* renamed from: a */
        final Typeface f3440a;

        /* renamed from: b */
        final int f3441b;

        C1089e(int i) {
            this.f3440a = null;
            this.f3441b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m37923a() {
            return this.f3441b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C1089e(Typeface typeface) {
            this.f3440a = typeface;
            this.f3441b = 0;
        }
    }
}
