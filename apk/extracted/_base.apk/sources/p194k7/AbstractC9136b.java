package p194k7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p060d7.C5774a;

/* renamed from: k7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9136b implements Metadata.InterfaceC4429b {
    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: R */
    public /* synthetic */ byte[] mo6157R() {
        return C5774a.m24522a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: g */
    public /* synthetic */ Format mo6156g() {
        return C5774a.m24521b(this);
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
