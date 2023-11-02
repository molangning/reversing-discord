package p308qj;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.base.InterfaceC10614a;
import net.time4j.p249tz.InterfaceC10815m;
import net.time4j.p249tz.InterfaceC10837r;
import net.time4j.p249tz.InterfaceC10838s;
import p288pj.InterfaceC11647c;

/* renamed from: qj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C12008a implements InterfaceC10837r, InterfaceC11647c {

    /* renamed from: a */
    private final String f30997a;

    /* renamed from: b */
    private final String f30998b;

    /* renamed from: c */
    private final Map<String, byte[]> f30999c;

    /* renamed from: d */
    private final Map<String, String> f31000d;

    /* renamed from: e */
    private final C10697f0 f31001e;

    /* renamed from: f */
    private final Map<InterfaceC10614a, Integer> f31002f;

    /* JADX WARN: Removed duplicated region for block: B:194:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C12008a() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p308qj.C12008a.<init>():void");
    }

    /* renamed from: j */
    private static void m6625j(DataInputStream dataInputStream, String str) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        byte readByte6 = dataInputStream.readByte();
        if (readByte == 116 && readByte2 == 122 && readByte3 == 114 && readByte4 == 101 && readByte5 == 112 && readByte6 == 111) {
            return;
        }
        throw new IOException("Invalid tz-repository: " + str);
    }

    /* renamed from: l */
    private static Class<?> m6623l() {
        if (Boolean.getBoolean("test.environment")) {
            try {
                return Class.forName("net.time4j.tz.spi.RepositoryTest");
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
        return C12008a.class;
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    /* renamed from: a */
    public String mo6634a() {
        return this.f30998b;
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    /* renamed from: b */
    public InterfaceC10838s mo6633b() {
        return null;
    }

    @Override // p288pj.InterfaceC11647c
    /* renamed from: c */
    public boolean mo6632c() {
        return !this.f31002f.isEmpty();
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    /* renamed from: d */
    public Map<String, String> mo6631d() {
        return this.f31000d;
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    /* renamed from: f */
    public String mo6629f() {
        return this.f30997a;
    }

    @Override // p288pj.InterfaceC11647c
    /* renamed from: g */
    public Map<InterfaceC10614a, Integer> mo6628g() {
        return Collections.unmodifiableMap(this.f31002f);
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    public String getName() {
        return "TZDB";
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    /* renamed from: h */
    public Set<String> mo6627h() {
        return this.f30999c.keySet();
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    /* renamed from: i */
    public String mo6626i() {
        return "";
    }

    @Override // p288pj.InterfaceC11647c
    /* renamed from: k */
    public C10697f0 mo6630e() {
        return this.f31001e;
    }

    @Override // net.time4j.p249tz.InterfaceC10837r
    public InterfaceC10815m load(String str) {
        try {
            byte[] bArr = this.f30999c.get(str);
            if (bArr != null) {
                return (InterfaceC10815m) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "TZ-REPOSITORY(" + this.f30997a + ")";
    }
}