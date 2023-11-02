package p292q2;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import java.util.List;
import p394w2.C13379j;

/* renamed from: q2.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11691e implements CacheKey {

    /* renamed from: a */
    final List<CacheKey> f30490a;

    public C11691e(List<CacheKey> list) {
        this.f30490a = (List) C13379j.m2677g(list);
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo714a() {
        return this.f30490a.get(0).mo714a();
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo713b(Uri uri) {
        for (int i = 0; i < this.f30490a.size(); i++) {
            if (this.f30490a.get(i).mo713b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo712c() {
        return false;
    }

    /* renamed from: d */
    public List<CacheKey> m7171d() {
        return this.f30490a;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11691e) {
            return this.f30490a.equals(((C11691e) obj).f30490a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.f30490a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f30490a.toString();
    }
}
