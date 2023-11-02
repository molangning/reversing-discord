package p456z3;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;

/* renamed from: z3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14084a implements CacheKey {

    /* renamed from: a */
    private final String f36237a;

    /* renamed from: b */
    private final boolean f36238b;

    public C14084a(int i, boolean z) {
        this.f36237a = "anim://" + i;
        this.f36238b = z;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo714a() {
        return this.f36237a;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo713b(Uri uri) {
        return uri.toString().startsWith(this.f36237a);
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo712c() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (!this.f36238b) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f36237a.equals(((C14084a) obj).f36237a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        if (!this.f36238b) {
            return super.hashCode();
        }
        return this.f36237a.hashCode();
    }
}
