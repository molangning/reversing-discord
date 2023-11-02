package ug;

import kotlin.jvm.internal.C9612q;
import p305qg.AbstractC11963n1;
import p305qg.C11949m1;

/* renamed from: ug.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12970a extends AbstractC11963n1 {

    /* renamed from: c */
    public static final C12970a f33725c = new C12970a();

    private C12970a() {
        super("package", false);
    }

    @Override // p305qg.AbstractC11963n1
    /* renamed from: a */
    public Integer mo3569a(AbstractC11963n1 visibility) {
        C9612q.m13917h(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        if (C11949m1.f30945a.m6691b(visibility)) {
            return 1;
        }
        return -1;
    }

    @Override // p305qg.AbstractC11963n1
    /* renamed from: b */
    public String mo3568b() {
        return "public/*package*/";
    }

    @Override // p305qg.AbstractC11963n1
    /* renamed from: d */
    public AbstractC11963n1 mo3567d() {
        return C11949m1.C11956g.f30954c;
    }
}
