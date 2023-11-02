package p098f7;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: f7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6317c {

    /* renamed from: a */
    private final ByteArrayOutputStream f17828a;

    /* renamed from: b */
    private final DataOutputStream f17829b;

    public C6317c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f17828a = byteArrayOutputStream;
        this.f17829b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m22993b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    private static void m22992c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    /* renamed from: a */
    public byte[] m22994a(C6314a c6314a) {
        this.f17828a.reset();
        try {
            m22993b(this.f17829b, c6314a.f17822j);
            String str = c6314a.f17823k;
            if (str == null) {
                str = "";
            }
            m22993b(this.f17829b, str);
            m22992c(this.f17829b, c6314a.f17824l);
            m22992c(this.f17829b, c6314a.f17825m);
            this.f17829b.write(c6314a.f17826n);
            this.f17829b.flush();
            return this.f17828a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
