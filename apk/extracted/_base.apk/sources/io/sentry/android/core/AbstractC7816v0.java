package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.android.core.internal.util.C7763e;

/* renamed from: io.sentry.android.core.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC7816v0 extends ContentProvider {

    /* renamed from: j */
    private final C7763e f21374j = new C7763e();

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.f21374j.m19768a(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.f21374j.m19768a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f21374j.m19768a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f21374j.m19768a(this);
        return 0;
    }
}
