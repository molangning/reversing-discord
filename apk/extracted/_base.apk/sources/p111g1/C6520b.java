package p111g1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p291q1.C11680l;

/* renamed from: g1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6520b {

    /* renamed from: a */
    private final List<C6541u> f18441a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m22457a(C6541u c6541u) {
        this.f18441a.add(c6541u);
    }

    /* renamed from: b */
    public void m22456b(Path path) {
        for (int size = this.f18441a.size() - 1; size >= 0; size--) {
            C11680l.m7191b(path, this.f18441a.get(size));
        }
    }
}
