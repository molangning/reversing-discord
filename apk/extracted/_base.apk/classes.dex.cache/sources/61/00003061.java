package p054d1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* renamed from: d1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC5717a<Params, Result> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC5718a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Object[] f16476j;

        /* renamed from: k */
        final /* synthetic */ Handler f16477k;

        /* renamed from: d1.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC5719a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ Object f16479j;

            RunnableC5719a(Object obj) {
                RunnableC5718a.this = r1;
                this.f16479j = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                AbstractC5717a.this.mo24622c(this.f16479j);
            }
        }

        RunnableC5718a(Object[] objArr, Handler handler) {
            AbstractC5717a.this = r1;
            this.f16476j = objArr;
            this.f16477k = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f16477k.post(new RunnableC5719a(AbstractC5717a.this.mo24624a(this.f16476j)));
        }
    }

    /* renamed from: a */
    protected abstract Result mo24624a(Params[] paramsArr);

    @SafeVarargs
    /* renamed from: b */
    public final AbstractC5717a<Params, Result> m24623b(Params... paramsArr) {
        m24621d();
        Executors.newSingleThreadExecutor().execute(new RunnableC5718a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    /* renamed from: c */
    protected void mo24622c(Result result) {
    }

    /* renamed from: d */
    protected void m24621d() {
    }
}