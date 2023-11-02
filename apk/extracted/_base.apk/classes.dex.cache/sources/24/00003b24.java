package p164j$.util.concurrent;

/* renamed from: j$.util.concurrent.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8410y extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom();
    }
}