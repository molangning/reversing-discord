package p279p5;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.nio.charset.Charset;
import p279p5.C11434k;

/* renamed from: p5.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11423d implements C11434k.InterfaceC11435a {

    /* renamed from: e */
    private static final Charset f29721e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Handler f29722a;

    /* renamed from: b */
    private final Context f29723b;

    /* renamed from: c */
    private volatile WifiManager.MulticastLock f29724c;

    /* renamed from: d */
    private final int f29725d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11424a implements InterfaceC11431h {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11420a f29726a;

        /* renamed from: b */
        final /* synthetic */ C11434k[] f29727b;

        C11424a(InterfaceC11420a interfaceC11420a, C11434k[] c11434kArr) {
            AbstractC11423d.this = r1;
            this.f29726a = interfaceC11420a;
            this.f29727b = c11434kArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11425b implements InterfaceC11438n {

        /* renamed from: a */
        final /* synthetic */ Runnable f29729a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC11441q f29730b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC11430g[] f29731c;

        C11425b(Runnable runnable, InterfaceC11441q interfaceC11441q, InterfaceC11430g[] interfaceC11430gArr) {
            AbstractC11423d.this = r1;
            this.f29729a = runnable;
            this.f29730b = interfaceC11441q;
            this.f29731c = interfaceC11430gArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11426c implements InterfaceC11437m {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11440p f29733a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC11429f[] f29734b;

        C11426c(InterfaceC11440p interfaceC11440p, InterfaceC11429f[] interfaceC11429fArr) {
            AbstractC11423d.this = r1;
            this.f29733a = interfaceC11440p;
            this.f29734b = interfaceC11429fArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p5.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C11427d implements InterfaceC11436l {

        /* renamed from: a */
        final /* synthetic */ Runnable f29736a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC11439o f29737b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC11430g[] f29738c;

        /* renamed from: d */
        final /* synthetic */ boolean f29739d;

        C11427d(Runnable runnable, InterfaceC11439o interfaceC11439o, InterfaceC11430g[] interfaceC11430gArr, boolean z) {
            AbstractC11423d.this = r1;
            this.f29736a = runnable;
            this.f29737b = interfaceC11439o;
            this.f29738c = interfaceC11430gArr;
            this.f29739d = z;
        }
    }

    public AbstractC11423d(Context context, String str) {
        this(context, str, Looper.getMainLooper());
    }

    /* renamed from: e */
    public static /* synthetic */ void m8077e(InterfaceC11430g[] interfaceC11430gArr) {
        interfaceC11430gArr[0].stop();
    }

    /* renamed from: f */
    public static /* synthetic */ void m8076f(InterfaceC11430g[] interfaceC11430gArr) {
        interfaceC11430gArr[0].stop();
    }

    @Override // p279p5.C11434k.InterfaceC11435a
    /* renamed from: a */
    public void mo8060a() {
        if (this.f29724c == null) {
            Log.wtf("DNSSD", "Multicast lock doesn't exist");
        } else {
            this.f29724c.release();
        }
    }

    /* renamed from: d */
    public InterfaceC11430g m8078d(int i, int i2, String str, String str2, InterfaceC11420a interfaceC11420a) {
        mo8072g();
        C11434k c11434k = new C11434k(this, AbstractC11432i.m8066f(i, i2, str, str2, new C11424a(interfaceC11420a, r0)));
        C11434k[] c11434kArr = {c11434k};
        return c11434k;
    }

    /* renamed from: g */
    public void mo8072g() {
        if (this.f29724c == null) {
            synchronized (this) {
                if (this.f29724c == null) {
                    WifiManager wifiManager = (WifiManager) this.f29723b.getApplicationContext().getSystemService("wifi");
                    if (wifiManager == null) {
                        Log.wtf("DNSSD", "Can't get WIFI Service");
                        return;
                    } else {
                        this.f29724c = wifiManager.createMulticastLock("com.github.druk.dnssd.DNSSD");
                        this.f29724c.setReferenceCounted(true);
                    }
                }
            }
        }
        this.f29724c.acquire();
    }

    /* renamed from: h */
    public InterfaceC11430g m8075h(int i, int i2, String str, int i3, int i4, boolean z, InterfaceC11439o interfaceC11439o) {
        mo8072g();
        Runnable runnable = new Runnable() { // from class: p5.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11423d.m8077e(r1);
            }
        };
        final InterfaceC11430g[] interfaceC11430gArr = {new C11434k(this, AbstractC11432i.m8063i(i, i2, str, i3, i4, new C11427d(runnable, interfaceC11439o, interfaceC11430gArr, z)))};
        if (z) {
            this.f29722a.postDelayed(runnable, this.f29725d);
        }
        return interfaceC11430gArr[0];
    }

    /* renamed from: i */
    public InterfaceC11429f m8074i(int i, int i2, String str, String str2, String str3, String str4, int i3, C11442r c11442r, InterfaceC11440p interfaceC11440p) {
        mo8072g();
        C11433j c11433j = new C11433j(this, AbstractC11432i.m8062j(i, i2, str, str2, str3, str4, i3, c11442r, new C11426c(interfaceC11440p, r1)));
        InterfaceC11429f[] interfaceC11429fArr = {c11433j};
        return c11433j;
    }

    /* renamed from: j */
    public InterfaceC11430g m8073j(int i, int i2, String str, String str2, String str3, InterfaceC11441q interfaceC11441q) {
        mo8072g();
        Runnable runnable = new Runnable() { // from class: p5.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11423d.m8076f(r1);
            }
        };
        final InterfaceC11430g[] interfaceC11430gArr = {new C11434k(this, AbstractC11432i.m8061k(i, i2, str, str2, str3, new C11425b(runnable, interfaceC11441q, interfaceC11430gArr)))};
        this.f29722a.postDelayed(runnable, this.f29725d);
        return interfaceC11430gArr[0];
    }

    AbstractC11423d(Context context, String str, Looper looper) {
        this.f29724c = null;
        this.f29723b = context.getApplicationContext();
        AbstractC11432i.m8064h(str);
        this.f29722a = new Handler(looper);
        this.f29725d = 60000;
    }
}