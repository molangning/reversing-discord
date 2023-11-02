package p010a9;

import androidx.collection.C0624a;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
import p441y8.C13930a;
import p461z8.C14119c;

/* renamed from: a9.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0104g0 {

    /* renamed from: a */
    private final C0624a<C0093b<?>, C13930a> f462a;

    /* renamed from: b */
    private final C0624a<C0093b<?>, String> f463b;

    /* renamed from: c */
    private final TaskCompletionSource<Map<C0093b<?>, String>> f464c;

    /* renamed from: d */
    private int f465d;

    /* renamed from: e */
    private boolean f466e;

    /* renamed from: a */
    public final Set<C0093b<?>> m41138a() {
        return this.f462a.keySet();
    }

    /* renamed from: b */
    public final void m41137b(C0093b<?> c0093b, C13930a c13930a, String str) {
        this.f462a.put(c0093b, c13930a);
        this.f463b.put(c0093b, str);
        this.f465d--;
        if (!c13930a.m1146H()) {
            this.f466e = true;
        }
        if (this.f465d == 0) {
            if (this.f466e) {
                this.f464c.m28012b(new C14119c(this.f462a));
                return;
            }
            this.f464c.m28011c(this.f463b);
        }
    }
}
