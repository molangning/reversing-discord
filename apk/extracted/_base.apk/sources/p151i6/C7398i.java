package p151i6;

/* renamed from: i6.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7398i extends Exception {

    /* renamed from: j */
    public final int f19918j;

    public C7398i(int i) {
        super(m20758a(i));
        this.f19918j = i;
    }

    /* renamed from: a */
    private static String m20758a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
