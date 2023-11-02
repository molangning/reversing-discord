package p011aa;

import android.bluetooth.BluetoothDevice;

/* renamed from: aa.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0133e {

    /* renamed from: a */
    private String f501a;

    /* renamed from: b */
    private String f502b;

    /* renamed from: c */
    private BluetoothDevice f503c;

    /* renamed from: d */
    private byte[] f504d;

    /* renamed from: a */
    public final C0133e m41120a(BluetoothDevice bluetoothDevice) {
        this.f503c = bluetoothDevice;
        this.f502b = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        this.f504d = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        return this;
    }

    /* renamed from: b */
    public final C0133e m41119b(byte[] bArr) {
        this.f504d = bArr;
        return this;
    }

    /* renamed from: c */
    public final C0133e m41118c(String str) {
        this.f502b = str;
        return this;
    }

    /* renamed from: d */
    public final C0133e m41117d(String str) {
        this.f501a = str;
        return this;
    }

    /* renamed from: e */
    public final C0131c m41116e() {
        return new C0131c(this.f501a, this.f502b, this.f503c, this.f504d, null);
    }
}