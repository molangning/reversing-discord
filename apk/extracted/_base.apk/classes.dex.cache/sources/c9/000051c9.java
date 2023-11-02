package p418x6;

import p195k8.C9149a;
import p195k8.C9197r;
import p296q6.InterfaceC11732b0;

/* renamed from: x6.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13721p {

    /* renamed from: a */
    public final boolean f35361a;

    /* renamed from: b */
    public final String f35362b;

    /* renamed from: c */
    public final InterfaceC11732b0.C11733a f35363c;

    /* renamed from: d */
    public final int f35364d;

    /* renamed from: e */
    public final byte[] f35365e;

    public C13721p(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9149a.m16452a((bArr2 == null) ^ z2);
        this.f35361a = z;
        this.f35362b = str;
        this.f35364d = i;
        this.f35365e = bArr2;
        this.f35363c = new InterfaceC11732b0.C11733a(m1645a(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m1645a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                C9197r.m16178h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}