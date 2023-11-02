package p351t9;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: t9.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12620p implements Iterable<String> {

    /* renamed from: j */
    final /* synthetic */ CharSequence f32709j;

    /* renamed from: k */
    final /* synthetic */ C12622r f32710k;

    public C12620p(C12622r c12622r, CharSequence charSequence) {
        this.f32710k = c12622r;
        this.f32709j = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> m4702h;
        m4702h = this.f32710k.m4702h(this.f32709j);
        return m4702h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(C12616l.m4715a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(C12616l.m4715a(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}