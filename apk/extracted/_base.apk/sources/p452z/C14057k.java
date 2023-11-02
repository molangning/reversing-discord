package p452z;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: z.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C14057k {

    /* renamed from: a */
    private final InterfaceC14060c f36097a;

    /* renamed from: z.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C14059b implements InterfaceC14060c {

        /* renamed from: a */
        private final Uri f36099a;

        /* renamed from: b */
        private final ClipDescription f36100b;

        /* renamed from: c */
        private final Uri f36101c;

        C14059b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36099a = uri;
            this.f36100b = clipDescription;
            this.f36101c = uri2;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: a */
        public Object mo801a() {
            return null;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: b */
        public Uri mo800b() {
            return this.f36099a;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: c */
        public void mo799c() {
        }

        @Override // p452z.C14057k.InterfaceC14060c
        public ClipDescription getDescription() {
            return this.f36100b;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: k */
        public Uri mo798k() {
            return this.f36101c;
        }
    }

    /* renamed from: z.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private interface InterfaceC14060c {
        /* renamed from: a */
        Object mo801a();

        /* renamed from: b */
        Uri mo800b();

        /* renamed from: c */
        void mo799c();

        ClipDescription getDescription();

        /* renamed from: k */
        Uri mo798k();
    }

    public C14057k(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f36097a = new C14058a(uri, clipDescription, uri2);
        } else {
            this.f36097a = new C14059b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C14057k m802f(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new C14057k(new C14058a(obj));
    }

    /* renamed from: a */
    public Uri m807a() {
        return this.f36097a.mo800b();
    }

    /* renamed from: b */
    public ClipDescription m806b() {
        return this.f36097a.getDescription();
    }

    /* renamed from: c */
    public Uri m805c() {
        return this.f36097a.mo798k();
    }

    /* renamed from: d */
    public void m804d() {
        this.f36097a.mo799c();
    }

    /* renamed from: e */
    public Object m803e() {
        return this.f36097a.mo801a();
    }

    /* renamed from: z.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C14058a implements InterfaceC14060c {

        /* renamed from: a */
        final InputContentInfo f36098a;

        C14058a(Object obj) {
            this.f36098a = (InputContentInfo) obj;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: a */
        public Object mo801a() {
            return this.f36098a;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: b */
        public Uri mo800b() {
            Uri contentUri;
            contentUri = this.f36098a.getContentUri();
            return contentUri;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: c */
        public void mo799c() {
            this.f36098a.requestPermission();
        }

        @Override // p452z.C14057k.InterfaceC14060c
        public ClipDescription getDescription() {
            ClipDescription description;
            description = this.f36098a.getDescription();
            return description;
        }

        @Override // p452z.C14057k.InterfaceC14060c
        /* renamed from: k */
        public Uri mo798k() {
            Uri linkUri;
            linkUri = this.f36098a.getLinkUri();
            return linkUri;
        }

        C14058a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36098a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C14057k(InterfaceC14060c interfaceC14060c) {
        this.f36097a = interfaceC14060c;
    }
}
