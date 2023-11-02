package p292q2;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import p394w2.C13379j;

/* renamed from: q2.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11694h implements CacheKey {

    /* renamed from: a */
    final String f30493a;

    /* renamed from: b */
    final boolean f30494b;

    public C11694h(String str) {
        this(str, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo714a() {
        return this.f30493a;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo713b(Uri uri) {
        return this.f30493a.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo712c() {
        return this.f30494b;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11694h) {
            return this.f30493a.equals(((C11694h) obj).f30493a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.f30493a.hashCode();
    }

    public String toString() {
        return this.f30493a;
    }

    public C11694h(String str, boolean z) {
        this.f30493a = (String) C13379j.m2677g(str);
        this.f30494b = z;
    }
}
