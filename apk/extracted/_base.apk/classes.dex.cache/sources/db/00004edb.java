package ug;

import kotlin.jvm.internal.C9612q;
import p305qg.AbstractC11963n1;
import p305qg.C11949m1;

/* renamed from: ug.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12971b extends AbstractC11963n1 {

    /* renamed from: c */
    public static final C12971b f33726c = new C12971b();

    private C12971b() {
        super("protected_and_package", true);
    }

    @Override // p305qg.AbstractC11963n1
    /* renamed from: a */
    public Integer mo3569a(AbstractC11963n1 visibility) {
        int i;
        C9612q.m13917h(visibility, "visibility");
        if (C9612q.m13922c(this, visibility)) {
            return 0;
        }
        if (visibility == C11949m1.C11951b.f30949c) {
            return null;
        }
        if (C11949m1.f30945a.m6691b(visibility)) {
            i = 1;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    @Override // p305qg.AbstractC11963n1
    /* renamed from: b */
    public String mo3568b() {
        return "protected/*protected and package*/";
    }

    @Override // p305qg.AbstractC11963n1
    /* renamed from: d */
    public AbstractC11963n1 mo3567d() {
        return C11949m1.C11956g.f30954c;
    }
}