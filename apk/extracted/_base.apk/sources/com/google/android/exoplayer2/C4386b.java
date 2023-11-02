package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: com.google.android.exoplayer2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4386b {

    /* renamed from: a */
    private final Context f11435a;

    /* renamed from: b */
    private final RunnableC4387a f11436b;

    /* renamed from: c */
    private boolean f11437c;

    /* renamed from: com.google.android.exoplayer2.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class RunnableC4387a extends BroadcastReceiver implements Runnable {

        /* renamed from: j */
        private final InterfaceC4388b f11438j;

        /* renamed from: k */
        private final Handler f11439k;

        public RunnableC4387a(Handler handler, InterfaceC4388b interfaceC4388b) {
            this.f11439k = handler;
            this.f11438j = interfaceC4388b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f11439k.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4386b.this.f11437c) {
                this.f11438j.mo29564b();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4388b {
        /* renamed from: b */
        void mo29564b();
    }

    public C4386b(Context context, Handler handler, InterfaceC4388b interfaceC4388b) {
        this.f11435a = context.getApplicationContext();
        this.f11436b = new RunnableC4387a(handler, interfaceC4388b);
    }

    /* renamed from: b */
    public void m29565b(boolean z) {
        if (z && !this.f11437c) {
            this.f11435a.registerReceiver(this.f11436b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f11437c = true;
        } else if (!z && this.f11437c) {
            this.f11435a.unregisterReceiver(this.f11436b);
            this.f11437c = false;
        }
    }
}
