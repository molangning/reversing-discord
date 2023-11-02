package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6764c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9612q;
import ph.C11638f;

/* renamed from: wg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13554g extends AbstractC13552f implements InterfaceC6764c {

    /* renamed from: c */
    private final Annotation f34938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13554g(C11638f c11638f, Annotation annotation) {
        super(c11638f, null);
        C9612q.m13917h(annotation, "annotation");
        this.f34938c = annotation;
    }

    @Override // gh.InterfaceC6764c
    /* renamed from: a */
    public InterfaceC6760a mo2228a() {
        return new C13551e(this.f34938c);
    }
}