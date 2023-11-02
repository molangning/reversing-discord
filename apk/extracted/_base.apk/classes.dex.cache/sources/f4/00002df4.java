package android.content;

import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, m14357d2 = {"Landroid/content/ContentResolver;", "Landroid/net/Uri;", "uri", "", "a", "react-native-image-picker_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.imagepicker.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ContentResolver {
    /* renamed from: a */
    public static final String m25649a(android.content.ContentResolver contentResolver, Uri uri) {
        C9612q.m13917h(contentResolver, "<this>");
        C9612q.m13917h(uri, "uri");
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            return "";
        }
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        String name = query.getString(columnIndex);
        query.close();
        C9612q.m13918g(name, "name");
        return name;
    }
}