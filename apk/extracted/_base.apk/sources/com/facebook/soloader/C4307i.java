package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.AbstractC4326r;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.soloader.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4307i extends AbstractC4326r {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.soloader.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C4309b extends AbstractC4326r.AbstractC4333g {

        /* renamed from: j */
        private final C4311c[] f10967j;

        /* renamed from: com.facebook.soloader.i$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        private final class C4310a extends AbstractC4326r.AbstractC4331e {

            /* renamed from: j */
            private int f10969j;

            private C4310a() {
            }

            @Override // com.facebook.soloader.AbstractC4326r.AbstractC4331e
            /* renamed from: a */
            public boolean mo30066a() {
                return this.f10969j < C4309b.this.f10967j.length;
            }

            @Override // com.facebook.soloader.AbstractC4326r.AbstractC4331e
            /* renamed from: h */
            public AbstractC4326r.InterfaceC4330d mo30065h() {
                C4311c[] c4311cArr = C4309b.this.f10967j;
                int i = this.f10969j;
                this.f10969j = i + 1;
                C4311c c4311c = c4311cArr[i];
                FileInputStream fileInputStream = new FileInputStream(c4311c.f10971l);
                try {
                    return new AbstractC4326r.C4332f(c4311c, fileInputStream);
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        C4309b(com.facebook.soloader.AbstractC4326r r19) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C4307i.C4309b.<init>(com.facebook.soloader.i, com.facebook.soloader.r):void");
        }

        @Override // com.facebook.soloader.AbstractC4326r.AbstractC4333g
        /* renamed from: a */
        public AbstractC4326r.C4329c mo30062a() {
            return new AbstractC4326r.C4329c(this.f10967j);
        }

        @Override // com.facebook.soloader.AbstractC4326r.AbstractC4333g
        /* renamed from: h */
        public AbstractC4326r.AbstractC4331e mo30061h() {
            return new C4310a();
        }
    }

    /* renamed from: com.facebook.soloader.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C4311c extends AbstractC4326r.C4328b {

        /* renamed from: l */
        final File f10971l;

        C4311c(String str, String str2, File file) {
            super(str, str2);
            this.f10971l = file;
        }
    }

    public C4307i(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.AbstractC4326r
    /* renamed from: t */
    protected AbstractC4326r.AbstractC4333g mo30074t(byte b) {
        return new C4309b(this);
    }
}
