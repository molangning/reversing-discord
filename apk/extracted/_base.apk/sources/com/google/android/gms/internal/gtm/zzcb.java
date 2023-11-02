package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import p029b9.C2198p;
import p100f9.C6351b;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzcb implements ServiceConnection {
    final /* synthetic */ zzcc zza;
    private volatile boolean zzb;
    private volatile zzey zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcb(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #2 {, blocks: (B:6:0x000f, B:7:0x0012, B:31:0x0080, B:32:0x0083, B:5:0x0008, B:10:0x0015, B:12:0x0021, B:14:0x002b, B:16:0x0033, B:23:0x0047, B:25:0x0050, B:27:0x0064, B:29:0x0068, B:30:0x007e, B:15:0x002e, B:18:0x003b), top: B:43:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            p029b9.C2198p.m33990e(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L14
            com.google.android.gms.internal.gtm.zzcc r3 = r2.zza     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "Service connected with null binder"
            r3.zzJ(r4)     // Catch: java.lang.Throwable -> L44
            r2.notifyAll()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            return
        L14:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            if (r1 == 0) goto L3b
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.zzey     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.gtm.zzey r0 = (com.google.android.gms.internal.gtm.zzey) r0     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            goto L33
        L2e:
            com.google.android.gms.internal.gtm.zzey r0 = new com.google.android.gms.internal.gtm.zzey     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
        L33:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L47
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r4.zzO(r1)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L47
            goto L4e
        L3b:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.zzK(r1, r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            r0 = r3
            goto L4e
        L44:
            r3 = move-exception
            goto L85
        L46:
            r0 = r3
        L47:
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r4.zzJ(r1)     // Catch: java.lang.Throwable -> L44
        L4e:
            if (r0 != 0) goto L64
            f9.b r3 = p100f9.C6351b.m22870b()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L80
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L80
            android.content.Context r4 = r4.zzo()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L80
            com.google.android.gms.internal.gtm.zzcc r0 = r2.zza     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L80
            com.google.android.gms.internal.gtm.zzcb r0 = com.google.android.gms.internal.gtm.zzcc.zza(r0)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L80
            r3.m22869c(r4, r0)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L80
            goto L80
        L64:
            boolean r4 = r2.zzb     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L7e
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r4.zzR(r1)     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.gtm.zzcc r4 = r2.zza     // Catch: java.lang.Throwable -> L44
            p8.n r4 = r4.zzq()     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.gtm.zzbz r1 = new com.google.android.gms.internal.gtm.zzbz     // Catch: java.lang.Throwable -> L44
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L44
            r4.m8035e(r1)     // Catch: java.lang.Throwable -> L44
            goto L80
        L7e:
            r2.zzc = r0     // Catch: java.lang.Throwable -> L44
        L80:
            r2.notifyAll()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            return
        L85:
            r2.notifyAll()     // Catch: java.lang.Throwable -> L89
            throw r3     // Catch: java.lang.Throwable -> L89
        L89:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcb.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2198p.m33990e("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().m8035e(new zzca(this, componentName));
    }

    public final zzey zza() {
        zzcb zzcbVar;
        C11465n.m8036d();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context zzo = this.zza.zzo();
        intent.putExtra("app_package_name", zzo.getPackageName());
        C6351b m22870b = C6351b.m22870b();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            zzcbVar = this.zza.zza;
            boolean m22871a = m22870b.m22871a(zzo, intent, zzcbVar, 129);
            this.zza.zzP("Bind to service requested", Boolean.valueOf(m22871a));
            if (!m22871a) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(zzeu.zzL.zzb().longValue());
            } catch (InterruptedException unused) {
                this.zza.zzR("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzey zzeyVar = this.zzc;
            this.zzc = null;
            if (zzeyVar == null) {
                this.zza.zzJ("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzeyVar;
        }
    }
}
