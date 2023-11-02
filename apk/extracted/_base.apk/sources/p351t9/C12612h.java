package p351t9;

/* renamed from: t9.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12612h extends AbstractC12611g {

    /* renamed from: a */
    private final char f32704a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12612h(char c) {
        this.f32704a = c;
    }

    @Override // p351t9.AbstractC12615k
    /* renamed from: a */
    public final boolean mo4717a(char c) {
        return c == this.f32704a;
    }

    public final String toString() {
        int i = this.f32704a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
