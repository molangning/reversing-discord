package p420x8;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x8.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13758t<T> {

    /* renamed from: a */
    final int f35493a;

    /* renamed from: b */
    final TaskCompletionSource<T> f35494b = new TaskCompletionSource<>();

    /* renamed from: c */
    final int f35495c;

    /* renamed from: d */
    final Bundle f35496d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13758t(int i, int i2, Bundle bundle) {
        this.f35493a = i;
        this.f35495c = i2;
        this.f35496d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo1584a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo1583b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m1586c(C13759u c13759u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c13759u);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f35494b.m28012b(c13759u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m1585d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f35494b.m28011c(t);
    }

    public final String toString() {
        int i = this.f35495c;
        int i2 = this.f35493a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i);
        sb2.append(" id=");
        sb2.append(i2);
        sb2.append(" oneWay=");
        sb2.append(mo1583b());
        sb2.append("}");
        return sb2.toString();
    }
}
