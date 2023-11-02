package p075e3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import p058d5.C5743a;

/* renamed from: e3.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6104f {

    /* renamed from: a */
    private static final Uri f17364a = Uri.withAppendedPath((Uri) C5743a.m24581e(ContactsContract.AUTHORITY_URI), "display_photo");

    /* renamed from: a */
    public static AssetFileDescriptor m23572a(ContentResolver contentResolver, Uri uri) {
        if (m23563j(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m23571b(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String string = null;
        if (m23563j(uri)) {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
                            string = query.getString(columnIndex);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                    return string;
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (!m23562k(uri)) {
            return null;
        } else {
            return uri.getPath();
        }
    }

    /* renamed from: c */
    public static String m23570c(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: d */
    public static Uri m23569d(File file) {
        return Uri.fromFile(file);
    }

    /* renamed from: e */
    public static Uri m23568e(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: f */
    public static boolean m23567f(Uri uri) {
        return "data".equals(m23570c(uri));
    }

    /* renamed from: g */
    public static boolean m23566g(Uri uri) {
        return "asset".equals(m23570c(uri));
    }

    /* renamed from: h */
    public static boolean m23565h(Uri uri) {
        String uri2 = uri.toString();
        if (!uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m23564i(Uri uri) {
        if (uri.getPath() == null || !m23563j(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith((String) C5743a.m24581e(f17364a.getPath()))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m23563j(Uri uri) {
        return "content".equals(m23570c(uri));
    }

    /* renamed from: k */
    public static boolean m23562k(Uri uri) {
        return JSStackTrace.FILE_KEY.equals(m23570c(uri));
    }

    /* renamed from: l */
    public static boolean m23561l(Uri uri) {
        return "res".equals(m23570c(uri));
    }

    /* renamed from: m */
    public static boolean m23560m(Uri uri) {
        String m23570c = m23570c(uri);
        if (!"https".equals(m23570c) && !"http".equals(m23570c)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m23559n(Uri uri) {
        return "android.resource".equals(m23570c(uri));
    }

    /* renamed from: o */
    public static Uri m23558o(String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    /* renamed from: p */
    public static URL m23557p(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}