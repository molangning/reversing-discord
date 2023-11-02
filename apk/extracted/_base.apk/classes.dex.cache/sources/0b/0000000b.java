package p003a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: a2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0011a extends BroadcastReceiver {

    /* renamed from: a */
    private final Context f16a;

    /* renamed from: b */
    private InterfaceC0012b f17b = InterfaceC0012b.f18a;

    public C0011a(Context context) {
        this.f16a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m41402a() {
        this.f17b = InterfaceC0012b.f18a;
        try {
            this.f16a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void m41401b(InterfaceC0012b interfaceC0012b) {
        this.f17b = interfaceC0012b;
        this.f16a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f17b.mo32357b();
        }
    }
}