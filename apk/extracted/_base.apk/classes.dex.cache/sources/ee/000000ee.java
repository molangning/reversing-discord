package android.support.p016v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p016v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p342t0.InterfaceC12569b;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0224a();

        /* renamed from: j */
        ResultReceiver f706j;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0224a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0224a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f706j = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f706j.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0225a();

        /* renamed from: j */
        private final Object f707j;

        /* renamed from: k */
        private final Object f708k;

        /* renamed from: l */
        private InterfaceC0231b f709l;

        /* renamed from: m */
        private InterfaceC12569b f710m;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0225a implements Parcelable.Creator<Token> {
            C0225a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public InterfaceC0231b m40877a() {
            InterfaceC0231b interfaceC0231b;
            synchronized (this.f707j) {
                interfaceC0231b = this.f709l;
            }
            return interfaceC0231b;
        }

        /* renamed from: b */
        public void m40876b(InterfaceC0231b interfaceC0231b) {
            synchronized (this.f707j) {
                this.f709l = interfaceC0231b;
            }
        }

        /* renamed from: d */
        public void m40875d(InterfaceC12569b interfaceC12569b) {
            synchronized (this.f707j) {
                this.f710m = interfaceC12569b;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f708k;
            if (obj2 == null) {
                if (token.f708k == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f708k;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f708k;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f708k, i);
        }

        Token(Object obj, InterfaceC0231b interfaceC0231b, InterfaceC12569b interfaceC12569b) {
            this.f707j = new Object();
            this.f708k = obj;
            this.f709l = interfaceC0231b;
            this.f710m = interfaceC12569b;
        }
    }

    /* renamed from: a */
    public static void m40885a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    public static Bundle m40884b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m40885a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0223a();

        /* renamed from: j */
        private final MediaDescriptionCompat f703j;

        /* renamed from: k */
        private final long f704k;

        /* renamed from: l */
        private MediaSession.QueueItem f705l;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0223a implements Parcelable.Creator<QueueItem> {
            C0223a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j != -1) {
                this.f703j = mediaDescriptionCompat;
                this.f704k = j;
                this.f705l = queueItem;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        /* renamed from: a */
        public static QueueItem m40883a(Object obj) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                return new QueueItem(queueItem, MediaDescriptionCompat.m40904a(queueItem.getDescription()), queueItem.getQueueId());
            }
            return null;
        }

        /* renamed from: b */
        public static List<QueueItem> m40882b(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m40883a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f703j + ", Id=" + this.f704k + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f703j.writeToParcel(parcel, i);
            parcel.writeLong(this.f704k);
        }

        QueueItem(Parcel parcel) {
            this.f703j = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f704k = parcel.readLong();
        }
    }
}