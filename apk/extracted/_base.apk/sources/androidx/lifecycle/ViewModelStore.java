package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ViewModelStore {

    /* renamed from: a */
    private final HashMap<String, AbstractC1681d0> f4487a = new HashMap<>();

    /* renamed from: a */
    public final void m36071a() {
        for (AbstractC1681d0 abstractC1681d0 : this.f4487a.values()) {
            abstractC1681d0.m36046a();
        }
        this.f4487a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC1681d0 m36070b(String str) {
        return this.f4487a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> m36069c() {
        return new HashSet(this.f4487a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m36068d(String str, AbstractC1681d0 abstractC1681d0) {
        AbstractC1681d0 put = this.f4487a.put(str, abstractC1681d0);
        if (put != null) {
            put.mo35975d();
        }
    }
}
