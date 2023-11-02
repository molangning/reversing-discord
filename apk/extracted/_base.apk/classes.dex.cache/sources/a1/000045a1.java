package p259o6;

import java.util.UUID;
import p195k8.C9191p0;

/* renamed from: o6.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11000d0 implements InterfaceC10991b0 {

    /* renamed from: d */
    public static final boolean f28795d;

    /* renamed from: a */
    public final UUID f28796a;

    /* renamed from: b */
    public final byte[] f28797b;

    /* renamed from: c */
    public final boolean f28798c;

    static {
        boolean z;
        if ("Amazon".equals(C9191p0.f24173c)) {
            String str = C9191p0.f24174d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f28795d = z;
            }
        }
        z = false;
        f28795d = z;
    }

    public C11000d0(UUID uuid, byte[] bArr, boolean z) {
        this.f28796a = uuid;
        this.f28797b = bArr;
        this.f28798c = z;
    }
}