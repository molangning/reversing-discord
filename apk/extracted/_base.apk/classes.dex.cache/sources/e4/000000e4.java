package android.support.p016v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0218a();

    /* renamed from: j */
    private final String f673j;

    /* renamed from: k */
    private final CharSequence f674k;

    /* renamed from: l */
    private final CharSequence f675l;

    /* renamed from: m */
    private final CharSequence f676m;

    /* renamed from: n */
    private final Bitmap f677n;

    /* renamed from: o */
    private final Uri f678o;

    /* renamed from: p */
    private final Bundle f679p;

    /* renamed from: q */
    private final Uri f680q;

    /* renamed from: r */
    private MediaDescription f681r;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0218a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0218a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m40904a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0219b {

        /* renamed from: a */
        private String f682a;

        /* renamed from: b */
        private CharSequence f683b;

        /* renamed from: c */
        private CharSequence f684c;

        /* renamed from: d */
        private CharSequence f685d;

        /* renamed from: e */
        private Bitmap f686e;

        /* renamed from: f */
        private Uri f687f;

        /* renamed from: g */
        private Bundle f688g;

        /* renamed from: h */
        private Uri f689h;

        /* renamed from: a */
        public MediaDescriptionCompat m40900a() {
            return new MediaDescriptionCompat(this.f682a, this.f683b, this.f684c, this.f685d, this.f686e, this.f687f, this.f688g, this.f689h);
        }

        /* renamed from: b */
        public C0219b m40899b(CharSequence charSequence) {
            this.f685d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0219b m40898c(Bundle bundle) {
            this.f688g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0219b m40897d(Bitmap bitmap) {
            this.f686e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0219b m40896e(Uri uri) {
            this.f687f = uri;
            return this;
        }

        /* renamed from: f */
        public C0219b m40895f(String str) {
            this.f682a = str;
            return this;
        }

        /* renamed from: g */
        public C0219b m40894g(Uri uri) {
            this.f689h = uri;
            return this;
        }

        /* renamed from: h */
        public C0219b m40893h(CharSequence charSequence) {
            this.f684c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0219b m40892i(CharSequence charSequence) {
            this.f683b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f673j = str;
        this.f674k = charSequence;
        this.f675l = charSequence2;
        this.f676m = charSequence3;
        this.f677n = bitmap;
        this.f678o = uri;
        this.f679p = bundle;
        this.f680q = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p016v4.media.MediaDescriptionCompat m40904a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L79
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.m40895f(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.m40892i(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.m40893h(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.m40899b(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.m40897d(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.m40896e(r2)
            android.os.Bundle r2 = r8.getExtras()
            if (r2 == 0) goto L3e
            android.os.Bundle r2 = android.support.p016v4.media.session.MediaSessionCompat.m40884b(r2)
        L3e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L49
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4a
        L49:
            r4 = r0
        L4a:
            if (r4 == 0) goto L62
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L5c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L5c
            goto L63
        L5c:
            r2.remove(r3)
            r2.remove(r5)
        L62:
            r0 = r2
        L63:
            r1.m40898c(r0)
            if (r4 == 0) goto L6c
            r1.m40894g(r4)
            goto L73
        L6c:
            android.net.Uri r0 = r8.getMediaUri()
            r1.m40894g(r0)
        L73:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.m40900a()
            r0.f681r = r8
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p016v4.media.MediaDescriptionCompat.m40904a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m40903b() {
        MediaDescription mediaDescription = this.f681r;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f673j);
            builder.setTitle(this.f674k);
            builder.setSubtitle(this.f675l);
            builder.setDescription(this.f676m);
            builder.setIconBitmap(this.f677n);
            builder.setIconUri(this.f678o);
            builder.setExtras(this.f679p);
            builder.setMediaUri(this.f680q);
            MediaDescription build = builder.build();
            this.f681r = build;
            return build;
        }
        return mediaDescription;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f674k) + ", " + ((Object) this.f675l) + ", " + ((Object) this.f676m);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) m40903b()).writeToParcel(parcel, i);
    }
}