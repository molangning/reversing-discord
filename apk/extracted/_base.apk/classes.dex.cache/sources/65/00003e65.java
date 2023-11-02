package ke;

/* renamed from: ke.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C9217a {
    /* renamed from: a */
    public static /* synthetic */ String m16035a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder sb2 = new StringBuilder();
            if (charSequenceArr.length > 0) {
                sb2.append(charSequenceArr[0]);
                for (int i = 1; i < charSequenceArr.length; i++) {
                    sb2.append(charSequence);
                    sb2.append(charSequenceArr[i]);
                }
            }
            return sb2.toString();
        }
        throw new NullPointerException("delimiter");
    }
}