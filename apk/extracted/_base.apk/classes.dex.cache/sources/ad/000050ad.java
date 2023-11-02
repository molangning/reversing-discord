package p401w9;

import java.util.AbstractMap;

/* renamed from: w9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13437c extends AbstractC13436b0 {

    /* renamed from: l */
    final /* synthetic */ C13439d f34672l;

    public C13437c(C13439d c13439d) {
        this.f34672l = c13439d;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f34672l.f34678n;
        C13459t.m2441a(i, i2, "index");
        C13439d c13439d = this.f34672l;
        objArr = c13439d.f34677m;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c13439d.f34677m;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: k */
    public final boolean mo2428k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f34672l.f34678n;
        return i;
    }
}