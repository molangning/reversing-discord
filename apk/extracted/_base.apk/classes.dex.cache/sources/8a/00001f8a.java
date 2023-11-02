package com.discord.share.intent;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p467zf.C14180c;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m14357d2 = {"getFileName", "", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "share_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class GetFileNameKt {
    public static final String getFileName(ContentResolver contentResolver, Uri uri) {
        Object m7596b;
        String str;
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        String[] strArr = {"_display_name"};
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(contentResolver.query(uri, strArr, null, null, null));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        String str2 = null;
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        Cursor cursor = (Cursor) m7596b;
        if (cursor != null) {
            try {
                if (!cursor.moveToFirst()) {
                    str = "";
                } else {
                    str = cursor.getString(0);
                }
                C14180c.m514a(cursor, null);
                str2 = str;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    C14180c.m514a(cursor, th3);
                    throw th4;
                }
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}