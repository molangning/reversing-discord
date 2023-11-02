package p072e0;

import java.nio.ByteBuffer;

/* renamed from: e0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6032c {

    /* renamed from: a */
    protected int f17098a;

    /* renamed from: b */
    protected ByteBuffer f17099b;

    /* renamed from: c */
    private int f17100c;

    /* renamed from: d */
    private int f17101d;

    /* renamed from: e */
    AbstractC6033d f17102e = AbstractC6033d.m23831a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m23836a(int i) {
        return i + this.f17099b.getInt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m23835b(int i) {
        if (i < this.f17101d) {
            return this.f17099b.getShort(this.f17100c + i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m23834c(int i, ByteBuffer byteBuffer) {
        this.f17099b = byteBuffer;
        if (byteBuffer != null) {
            this.f17098a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f17100c = i2;
            this.f17101d = this.f17099b.getShort(i2);
            return;
        }
        this.f17098a = 0;
        this.f17100c = 0;
        this.f17101d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public int m23833d(int i) {
        int i2 = i + this.f17098a;
        return i2 + this.f17099b.getInt(i2) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m23832e(int i) {
        int i2 = i + this.f17098a;
        return this.f17099b.getInt(i2 + this.f17099b.getInt(i2));
    }
}
