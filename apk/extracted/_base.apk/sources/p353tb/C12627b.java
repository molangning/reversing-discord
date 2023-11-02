package p353tb;

import java.io.OutputStream;

/* renamed from: tb.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12627b extends OutputStream {

    /* renamed from: j */
    private long f32723j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m4696a() {
        return this.f32723j;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f32723j++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f32723j += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f32723j += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
