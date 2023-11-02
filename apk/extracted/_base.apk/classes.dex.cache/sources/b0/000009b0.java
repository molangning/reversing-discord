package p029b9;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: b9.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2224z0<TListener> {

    /* renamed from: a */
    private TListener f6223a;

    /* renamed from: b */
    private boolean f6224b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC2150c f6225c;

    public AbstractC2224z0(AbstractC2150c abstractC2150c, TListener tlistener) {
        this.f6225c = abstractC2150c;
        this.f6223a = tlistener;
    }

    /* renamed from: a */
    protected abstract void mo33950a(TListener tlistener);

    /* renamed from: b */
    public abstract void mo33949b();

    /* renamed from: c */
    public final void m33948c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f6223a;
            if (this.f6224b) {
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo33950a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f6224b = true;
        }
        m33946e();
    }

    /* renamed from: d */
    public final void m33947d() {
        synchronized (this) {
            this.f6223a = null;
        }
    }

    /* renamed from: e */
    public final void m33946e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m33947d();
        arrayList = this.f6225c.f6055A;
        synchronized (arrayList) {
            arrayList2 = this.f6225c.f6055A;
            arrayList2.remove(this);
        }
    }
}