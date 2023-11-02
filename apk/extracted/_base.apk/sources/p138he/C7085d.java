package p138he;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import ie.EnumC7505a;
import ie.EnumC7506b;

/* renamed from: he.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7085d extends AbstractC7087e {

    /* renamed from: j */
    private final C7086a f19374j;

    /* renamed from: he.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C7086a extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f19375a;

        private C7086a() {
            this.f19375a = false;
        }

        /* renamed from: a */
        public boolean m21446a() {
            return this.f19375a;
        }

        /* renamed from: b */
        public void m21445b(boolean z) {
            this.f19375a = z;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C7085d.this.m21447m();
            }
        }
    }

    public C7085d(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f19374j = new C7086a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: m */
    public void m21447m() {
        NetworkInfo activeNetworkInfo;
        EnumC7506b enumC7506b = EnumC7506b.UNKNOWN;
        EnumC7505a enumC7505a = null;
        boolean z = false;
        try {
            activeNetworkInfo = m21442c().getActiveNetworkInfo();
        } catch (SecurityException unused) {
            enumC7506b = EnumC7506b.UNKNOWN;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 4) {
                        if (type != 9) {
                            if (type != 17) {
                                if (type != 6) {
                                    if (type == 7) {
                                        enumC7506b = EnumC7506b.BLUETOOTH;
                                    }
                                } else {
                                    enumC7506b = EnumC7506b.WIMAX;
                                }
                            } else {
                                enumC7506b = EnumC7506b.VPN;
                            }
                        } else {
                            enumC7506b = EnumC7506b.ETHERNET;
                        }
                    }
                } else {
                    enumC7506b = EnumC7506b.WIFI;
                }
                m21436k(enumC7506b, enumC7505a, z);
            }
            enumC7506b = EnumC7506b.CELLULAR;
            enumC7505a = EnumC7505a.m20556a(activeNetworkInfo);
            m21436k(enumC7506b, enumC7505a, z);
        }
        enumC7506b = EnumC7506b.NONE;
        m21436k(enumC7506b, enumC7505a, z);
    }

    @Override // p138he.AbstractC7087e
    /* renamed from: g */
    public void mo21432g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m21440e().registerReceiver(this.f19374j, intentFilter);
        this.f19374j.m21445b(true);
        m21447m();
    }

    @Override // p138he.AbstractC7087e
    /* renamed from: j */
    public void mo21431j() {
        if (this.f19374j.m21446a()) {
            m21440e().unregisterReceiver(this.f19374j);
            this.f19374j.m21445b(false);
        }
    }
}
