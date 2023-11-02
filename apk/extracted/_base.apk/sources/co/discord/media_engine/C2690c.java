package co.discord.media_engine;

/* renamed from: co.discord.media_engine.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final /* synthetic */ class C2690c {
    /* renamed from: a */
    public static /* synthetic */ int m32715a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
