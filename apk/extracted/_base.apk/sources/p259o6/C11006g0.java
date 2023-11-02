package p259o6;

import android.annotation.SuppressLint;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p102fb.C6374d;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p259o6.C11028l;
import p259o6.InterfaceC10993c0;
import p418x6.C13715l;

/* renamed from: o6.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11006g0 implements InterfaceC10993c0 {

    /* renamed from: d */
    public static final InterfaceC10993c0.InterfaceC10997d f28802d = new InterfaceC10993c0.InterfaceC10997d() { // from class: o6.e0
        @Override // p259o6.InterfaceC10993c0.InterfaceC10997d
        /* renamed from: a */
        public final InterfaceC10993c0 mo9398a(UUID uuid) {
            InterfaceC10993c0 m9385x;
            m9385x = C11006g0.m9385x(uuid);
            return m9385x;
        }
    };

    /* renamed from: a */
    private final UUID f28803a;

    /* renamed from: b */
    private final MediaDrm f28804b;

    /* renamed from: c */
    private int f28805c;

    private C11006g0(UUID uuid) {
        C9149a.m16448e(uuid);
        C9149a.m16451b(!C7390b.f19879b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f28803a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m9391r(uuid));
        this.f28804b = mediaDrm;
        this.f28805c = 1;
        if (C7390b.f19881d.equals(uuid) && m9384y()) {
            m9389t(mediaDrm);
        }
    }

    /* renamed from: n */
    private static byte[] m9395n(byte[] bArr) {
        int indexOf;
        C9208y c9208y = new C9208y(bArr);
        int m16081q = c9208y.m16081q();
        short m16079s = c9208y.m16079s();
        short m16079s2 = c9208y.m16079s();
        if (m16079s == 1 && m16079s2 == 1) {
            short m16079s3 = c9208y.m16079s();
            Charset charset = C6374d.f18025e;
            String m16113B = c9208y.m16113B(m16079s3, charset);
            if (m16113B.contains("<LA_URL>")) {
                return bArr;
            }
            if (m16113B.indexOf("</DATA>") == -1) {
                C9197r.m16178h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = m16113B.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + m16113B.substring(indexOf);
            int i = m16081q + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort(m16079s);
            allocate.putShort(m16079s2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        C9197r.m16180f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: o */
    private static byte[] m9394o(UUID uuid, byte[] bArr) {
        if (C7390b.f19880c.equals(uuid)) {
            return C10988a.m9406a(bArr);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m9393p(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p151i6.C7390b.f19882e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = p418x6.C13715l.m1663e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = m9395n(r4)
            byte[] r4 = p418x6.C13715l.m1667a(r0, r4)
        L18:
            int r1 = p195k8.C9191p0.f24171a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = p151i6.C7390b.f19881d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = p195k8.C9191p0.f24173c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p195k8.C9191p0.f24174d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = p418x6.C13715l.m1663e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p259o6.C11006g0.m9393p(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: q */
    private static String m9392q(UUID uuid, String str) {
        if (C9191p0.f24171a < 26 && C7390b.f19880c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
            return "cenc";
        }
        return str;
    }

    /* renamed from: r */
    private static UUID m9391r(UUID uuid) {
        return (C9191p0.f24171a >= 27 || !C7390b.f19880c.equals(uuid)) ? uuid : C7390b.f19879b;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: t */
    private static void m9389t(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: v */
    private static C11028l.C11030b m9387v(UUID uuid, List<C11028l.C11030b> list) {
        boolean z;
        if (!C7390b.f19881d.equals(uuid)) {
            return list.get(0);
        }
        if (C9191p0.f24171a >= 28 && list.size() > 1) {
            C11028l.C11030b c11030b = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C11028l.C11030b c11030b2 = list.get(i2);
                byte[] bArr = (byte[]) C9149a.m16448e(c11030b2.f28894n);
                if (C9191p0.m16257c(c11030b2.f28893m, c11030b.f28893m) && C9191p0.m16257c(c11030b2.f28892l, c11030b.f28892l) && C13715l.m1665c(bArr)) {
                    i += bArr.length;
                } else {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                byte[] bArr2 = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) C9149a.m16448e(list.get(i4).f28894n);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return c11030b.m9312b(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C11028l.C11030b c11030b3 = list.get(i5);
            int m1661g = C13715l.m1661g((byte[]) C9149a.m16448e(c11030b3.f28894n));
            int i6 = C9191p0.f24171a;
            if (i6 < 23 && m1661g == 0) {
                return c11030b3;
            }
            if (i6 >= 23 && m1661g == 1) {
                return c11030b3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m9386w(InterfaceC10993c0.InterfaceC10996c interfaceC10996c, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        interfaceC10996c.mo9332a(this, bArr, i, i2, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ InterfaceC10993c0 m9385x(UUID uuid) {
        try {
            return m9383z(uuid);
        } catch (C11032l0 unused) {
            C9197r.m16183c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C11052z();
        }
    }

    /* renamed from: y */
    private static boolean m9384y() {
        return "ASUS_Z00AD".equals(C9191p0.f24174d);
    }

    /* renamed from: z */
    public static C11006g0 m9383z(UUID uuid) {
        try {
            return new C11006g0(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C11032l0(1, e);
        } catch (Exception e2) {
            throw new C11032l0(2, e2);
        }
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: a */
    public Class<C11000d0> mo9264a() {
        return C11000d0.class;
    }

    @Override // p259o6.InterfaceC10993c0
    public synchronized void acquire() {
        boolean z;
        if (this.f28805c > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f28805c++;
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: b */
    public Map<String, String> mo9263b(byte[] bArr) {
        return this.f28804b.queryKeyStatus(bArr);
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: d */
    public InterfaceC10993c0.C10998e mo9261d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f28804b.getProvisionRequest();
        return new InterfaceC10993c0.C10998e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: e */
    public byte[] mo9260e() {
        return this.f28804b.openSession();
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: f */
    public void mo9259f(byte[] bArr, byte[] bArr2) {
        this.f28804b.restoreKeys(bArr, bArr2);
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: g */
    public void mo9258g(byte[] bArr) {
        this.f28804b.provideProvisionResponse(bArr);
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: h */
    public void mo9257h(final InterfaceC10993c0.InterfaceC10996c interfaceC10996c) {
        MediaDrm.OnEventListener onEventListener;
        MediaDrm mediaDrm = this.f28804b;
        if (interfaceC10996c == null) {
            onEventListener = null;
        } else {
            onEventListener = new MediaDrm.OnEventListener() { // from class: o6.f0
                @Override // android.media.MediaDrm.OnEventListener
                public final void onEvent(MediaDrm mediaDrm2, byte[] bArr, int i, int i2, byte[] bArr2) {
                    C11006g0.this.m9386w(interfaceC10996c, mediaDrm2, bArr, i, i2, bArr2);
                }
            };
        }
        mediaDrm.setOnEventListener(onEventListener);
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: i */
    public void mo9256i(byte[] bArr) {
        this.f28804b.closeSession(bArr);
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: j */
    public byte[] mo9255j(byte[] bArr, byte[] bArr2) {
        if (C7390b.f19880c.equals(this.f28803a)) {
            bArr2 = C10988a.m9405b(bArr2);
        }
        return this.f28804b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: k */
    public InterfaceC10993c0.C10995b mo9254k(byte[] bArr, List<C11028l.C11030b> list, int i, HashMap<String, String> hashMap) {
        C11028l.C11030b c11030b;
        byte[] bArr2;
        String str;
        int i2;
        if (list != null) {
            c11030b = m9387v(this.f28803a, list);
            bArr2 = m9393p(this.f28803a, (byte[]) C9149a.m16448e(c11030b.f28894n));
            str = m9392q(this.f28803a, c11030b.f28893m);
        } else {
            c11030b = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f28804b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] m9394o = m9394o(this.f28803a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && c11030b != null && !TextUtils.isEmpty(c11030b.f28892l)) {
            defaultUrl = c11030b.f28892l;
        }
        if (C9191p0.f24171a >= 23) {
            i2 = keyRequest.getRequestType();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        return new InterfaceC10993c0.C10995b(m9394o, defaultUrl, i2);
    }

    @Override // p259o6.InterfaceC10993c0
    public synchronized void release() {
        int i = this.f28805c - 1;
        this.f28805c = i;
        if (i == 0) {
            this.f28804b.release();
        }
    }

    @Override // p259o6.InterfaceC10993c0
    /* renamed from: s */
    public C11000d0 mo9262c(byte[] bArr) {
        boolean z;
        if (C9191p0.f24171a < 21 && C7390b.f19881d.equals(this.f28803a) && "L3".equals(m9388u("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        return new C11000d0(m9391r(this.f28803a), bArr, z);
    }

    /* renamed from: u */
    public String m9388u(String str) {
        return this.f28804b.getPropertyString(str);
    }
}
