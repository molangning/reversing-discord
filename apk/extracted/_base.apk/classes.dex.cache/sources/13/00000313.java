package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a */
    private final C0695b f2997a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.FrameMetricsAggregator$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0693a extends C0695b {

        /* renamed from: e */
        private static HandlerThread f2998e;

        /* renamed from: f */
        private static Handler f2999f;

        /* renamed from: a */
        int f3000a;

        /* renamed from: b */
        SparseIntArray[] f3001b = new SparseIntArray[9];

        /* renamed from: c */
        private final ArrayList<WeakReference<Activity>> f3002c = new ArrayList<>();

        /* renamed from: d */
        Window.OnFrameMetricsAvailableListener f3003d = new Window$OnFrameMetricsAvailableListenerC0694a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC0694a implements Window.OnFrameMetricsAvailableListener {
            Window$OnFrameMetricsAvailableListenerC0694a() {
                C0693a.this = r1;
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                long metric;
                long metric2;
                long metric3;
                long metric4;
                long metric5;
                long metric6;
                long metric7;
                long metric8;
                long metric9;
                C0693a c0693a = C0693a.this;
                if ((c0693a.f3000a & 1) != 0) {
                    SparseIntArray sparseIntArray = c0693a.f3001b[0];
                    metric9 = frameMetrics.getMetric(8);
                    c0693a.m39126f(sparseIntArray, metric9);
                }
                C0693a c0693a2 = C0693a.this;
                if ((c0693a2.f3000a & 2) != 0) {
                    SparseIntArray sparseIntArray2 = c0693a2.f3001b[1];
                    metric8 = frameMetrics.getMetric(1);
                    c0693a2.m39126f(sparseIntArray2, metric8);
                }
                C0693a c0693a3 = C0693a.this;
                if ((c0693a3.f3000a & 4) != 0) {
                    SparseIntArray sparseIntArray3 = c0693a3.f3001b[2];
                    metric7 = frameMetrics.getMetric(3);
                    c0693a3.m39126f(sparseIntArray3, metric7);
                }
                C0693a c0693a4 = C0693a.this;
                if ((c0693a4.f3000a & 8) != 0) {
                    SparseIntArray sparseIntArray4 = c0693a4.f3001b[3];
                    metric6 = frameMetrics.getMetric(4);
                    c0693a4.m39126f(sparseIntArray4, metric6);
                }
                C0693a c0693a5 = C0693a.this;
                if ((c0693a5.f3000a & 16) != 0) {
                    SparseIntArray sparseIntArray5 = c0693a5.f3001b[4];
                    metric5 = frameMetrics.getMetric(5);
                    c0693a5.m39126f(sparseIntArray5, metric5);
                }
                C0693a c0693a6 = C0693a.this;
                if ((c0693a6.f3000a & 64) != 0) {
                    SparseIntArray sparseIntArray6 = c0693a6.f3001b[6];
                    metric4 = frameMetrics.getMetric(7);
                    c0693a6.m39126f(sparseIntArray6, metric4);
                }
                C0693a c0693a7 = C0693a.this;
                if ((c0693a7.f3000a & 32) != 0) {
                    SparseIntArray sparseIntArray7 = c0693a7.f3001b[5];
                    metric3 = frameMetrics.getMetric(6);
                    c0693a7.m39126f(sparseIntArray7, metric3);
                }
                C0693a c0693a8 = C0693a.this;
                if ((c0693a8.f3000a & 128) != 0) {
                    SparseIntArray sparseIntArray8 = c0693a8.f3001b[7];
                    metric2 = frameMetrics.getMetric(0);
                    c0693a8.m39126f(sparseIntArray8, metric2);
                }
                C0693a c0693a9 = C0693a.this;
                if ((c0693a9.f3000a & 256) != 0) {
                    SparseIntArray sparseIntArray9 = c0693a9.f3001b[8];
                    metric = frameMetrics.getMetric(2);
                    c0693a9.m39126f(sparseIntArray9, metric);
                }
            }
        }

        C0693a(int i) {
            this.f3000a = i;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0695b
        /* renamed from: a */
        public void mo39125a(Activity activity) {
            if (f2998e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f2998e = handlerThread;
                handlerThread.start();
                f2999f = new Handler(f2998e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f3001b;
                if (sparseIntArrayArr[i] == null && (this.f3000a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3003d, f2999f);
            this.f3002c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0695b
        /* renamed from: b */
        public SparseIntArray[] mo39124b() {
            return this.f3001b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0695b
        /* renamed from: c */
        public SparseIntArray[] mo39123c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f3002c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f3002c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3003d);
            return this.f3001b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0695b
        /* renamed from: d */
        public SparseIntArray[] mo39122d() {
            SparseIntArray[] sparseIntArrayArr = this.f3001b;
            this.f3001b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0695b
        /* renamed from: e */
        public SparseIntArray[] mo39121e() {
            for (int size = this.f3002c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f3002c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3003d);
                    this.f3002c.remove(size);
                }
            }
            return this.f3001b;
        }

        /* renamed from: f */
        void m39126f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.FrameMetricsAggregator$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0695b {
        C0695b() {
        }

        /* renamed from: a */
        public void mo39125a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo39124b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo39123c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo39122d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo39121e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    /* renamed from: a */
    public void m39131a(Activity activity) {
        this.f2997a.mo39125a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m39130b() {
        return this.f2997a.mo39124b();
    }

    /* renamed from: c */
    public SparseIntArray[] m39129c(Activity activity) {
        return this.f2997a.mo39123c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m39128d() {
        return this.f2997a.mo39122d();
    }

    /* renamed from: e */
    public SparseIntArray[] m39127e() {
        return this.f2997a.mo39121e();
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2997a = new C0693a(i);
        } else {
            this.f2997a = new C0695b();
        }
    }
}