package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;
import p385v9.C13218v0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Message extends AbstractC2461a implements ReflectedParcelable {
    public static final Parcelable.Creator<Message> CREATOR = new C4671a();

    /* renamed from: p */
    private static final C13218v0[] f12807p = {C13218v0.f34268m};

    /* renamed from: j */
    final int f12808j;

    /* renamed from: k */
    private final byte[] f12809k;

    /* renamed from: l */
    private final String f12810l;

    /* renamed from: m */
    private final String f12811m;
    @Deprecated

    /* renamed from: n */
    final C13218v0[] f12812n;

    /* renamed from: o */
    private final long f12813o;

    public Message(int i, byte[] bArr, String str, String str2, C13218v0[] c13218v0Arr, long j) {
        this.f12808j = i;
        this.f12810l = (String) C2198p.m33985j(str2);
        this.f12811m = str == null ? "" : str;
        this.f12813o = j;
        C2198p.m33985j(bArr);
        int length = bArr.length;
        C2198p.m33992c(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.f12809k = bArr;
        this.f12812n = (c13218v0Arr == null || c13218v0Arr.length == 0) ? f12807p : c13218v0Arr;
        C2198p.m33992c(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    /* renamed from: A */
    public String m28055A() {
        return this.f12810l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        if (TextUtils.equals(this.f12811m, message.f12811m) && TextUtils.equals(this.f12810l, message.f12810l) && Arrays.equals(this.f12809k, message.f12809k) && this.f12813o == message.f12813o) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f12811m, this.f12810l, Integer.valueOf(Arrays.hashCode(this.f12809k)), Long.valueOf(this.f12813o));
    }

    /* renamed from: r */
    public byte[] m28054r() {
        return this.f12809k;
    }

    public String toString() {
        String str = this.f12811m;
        String str2 = this.f12810l;
        byte[] bArr = this.f12809k;
        int length = bArr == null ? 0 : bArr.length;
        return "Message{namespace='" + str + "', type='" + str2 + "', content=[" + length + " bytes]}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33178f(parcel, 1, m28054r(), false);
        C2464c.m33168p(parcel, 2, m28055A(), false);
        C2464c.m33168p(parcel, 3, m28053z(), false);
        C2464c.m33165s(parcel, 4, this.f12812n, i, false);
        C2464c.m33171m(parcel, 5, this.f12813o);
        C2464c.m33174j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f12808j);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public String m28053z() {
        return this.f12811m;
    }

    public Message(byte[] bArr) {
        this(bArr, "", "", f12807p, 0L);
    }

    public Message(byte[] bArr, String str, String str2, C13218v0[] c13218v0Arr, long j) {
        this(2, bArr, str, str2, c13218v0Arr, 0L);
    }
}