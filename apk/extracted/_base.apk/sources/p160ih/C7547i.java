package p160ih;

import kotlin.jvm.internal.C9612q;
import p070di.C5930g;
import p070di.InterfaceC5931h;
import ph.C11632b;

/* renamed from: ih.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7547i implements InterfaceC5931h {

    /* renamed from: a */
    private final InterfaceC7559p f20841a;

    /* renamed from: b */
    private final C7544h f20842b;

    public C7547i(InterfaceC7559p kotlinClassFinder, C7544h deserializedDescriptorResolver) {
        C9612q.m13917h(kotlinClassFinder, "kotlinClassFinder");
        C9612q.m13917h(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f20841a = kotlinClassFinder;
        this.f20842b = deserializedDescriptorResolver;
    }

    @Override // p070di.InterfaceC5931h
    /* renamed from: a */
    public C5930g mo20442a(C11632b classId) {
        C9612q.m13917h(classId, "classId");
        InterfaceC7564r m20400b = C7563q.m20400b(this.f20841a, classId);
        if (m20400b == null) {
            return null;
        }
        C9612q.m13922c(m20400b.mo2851n(), classId);
        return this.f20842b.m20449i(m20400b);
    }
}
