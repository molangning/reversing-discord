package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p072e0.C6031b;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1521l {

    /* renamed from: androidx.emoji2.text.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1522a implements InterfaceC1524c {

        /* renamed from: a */
        private final ByteBuffer f3972a;

        C1522a(ByteBuffer byteBuffer) {
            this.f3972a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.C1521l.InterfaceC1524c
        /* renamed from: a */
        public void mo36579a(int i) {
            ByteBuffer byteBuffer = this.f3972a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.C1521l.InterfaceC1524c
        /* renamed from: b */
        public int mo36578b() {
            return this.f3972a.getInt();
        }

        @Override // androidx.emoji2.text.C1521l.InterfaceC1524c
        /* renamed from: c */
        public long mo36577c() {
            return C1521l.m36582c(this.f3972a.getInt());
        }

        @Override // androidx.emoji2.text.C1521l.InterfaceC1524c
        public long getPosition() {
            return this.f3972a.position();
        }

        @Override // androidx.emoji2.text.C1521l.InterfaceC1524c
        public int readUnsignedShort() {
            return C1521l.m36581d(this.f3972a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1523b {

        /* renamed from: a */
        private final long f3973a;

        /* renamed from: b */
        private final long f3974b;

        C1523b(long j, long j2) {
            this.f3973a = j;
            this.f3974b = j2;
        }

        /* renamed from: a */
        long m36580a() {
            return this.f3973a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1524c {
        /* renamed from: a */
        void mo36579a(int i);

        /* renamed from: b */
        int mo36578b();

        /* renamed from: c */
        long mo36577c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static C1523b m36584a(InterfaceC1524c interfaceC1524c) {
        long j;
        interfaceC1524c.mo36579a(4);
        int readUnsignedShort = interfaceC1524c.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            interfaceC1524c.mo36579a(6);
            int i = 0;
            while (true) {
                if (i < readUnsignedShort) {
                    int mo36578b = interfaceC1524c.mo36578b();
                    interfaceC1524c.mo36579a(4);
                    j = interfaceC1524c.mo36577c();
                    interfaceC1524c.mo36579a(4);
                    if (1835365473 == mo36578b) {
                        break;
                    }
                    i++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                interfaceC1524c.mo36579a((int) (j - interfaceC1524c.getPosition()));
                interfaceC1524c.mo36579a(12);
                long mo36577c = interfaceC1524c.mo36577c();
                for (int i2 = 0; i2 < mo36577c; i2++) {
                    int mo36578b2 = interfaceC1524c.mo36578b();
                    long mo36577c2 = interfaceC1524c.mo36577c();
                    long mo36577c3 = interfaceC1524c.mo36577c();
                    if (1164798569 == mo36578b2 || 1701669481 == mo36578b2) {
                        return new C1523b(mo36577c2 + j, mo36577c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6031b m36583b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m36584a(new C1522a(duplicate)).m36580a());
        return C6031b.m23841h(duplicate);
    }

    /* renamed from: c */
    static long m36582c(int i) {
        return i & 4294967295L;
    }

    /* renamed from: d */
    static int m36581d(short s) {
        return s & 65535;
    }
}
