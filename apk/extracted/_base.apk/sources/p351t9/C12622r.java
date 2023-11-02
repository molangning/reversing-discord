package p351t9;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: t9.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12622r {

    /* renamed from: a */
    private final AbstractC12615k f32716a;

    /* renamed from: b */
    private final boolean f32717b;

    /* renamed from: c */
    private final C12619o f32718c;

    private C12622r(C12619o c12619o, boolean z, AbstractC12615k abstractC12615k, int i, byte[] bArr) {
        this.f32718c = c12619o;
        this.f32717b = z;
        this.f32716a = abstractC12615k;
    }

    /* renamed from: c */
    public static C12622r m4707c(AbstractC12615k abstractC12615k) {
        return new C12622r(new C12619o(abstractC12615k), false, C12614j.f32706b, ViewDefaults.NUMBER_OF_LINES, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final Iterator<String> m4702h(CharSequence charSequence) {
        return new C12618n(this.f32718c, this, charSequence);
    }

    /* renamed from: b */
    public final C12622r m4708b() {
        return new C12622r(this.f32718c, true, this.f32716a, ViewDefaults.NUMBER_OF_LINES, null);
    }

    /* renamed from: d */
    public final Iterable<String> m4706d(CharSequence charSequence) {
        return new C12620p(this, charSequence);
    }

    /* renamed from: f */
    public final List<String> m4704f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> m4702h = m4702h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m4702h.hasNext()) {
            arrayList.add(m4702h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
