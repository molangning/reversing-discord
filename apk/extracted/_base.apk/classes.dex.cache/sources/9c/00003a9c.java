package p164j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8294h extends AbstractC8287a implements Serializable {

    /* renamed from: a */
    public static final C8294h f22292a = new C8294h();

    private C8294h() {
    }

    /* renamed from: a */
    public static boolean m17898a(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}