package com.reactnative.ivpusic.imagepicker;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.reactnative.ivpusic.imagepicker.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5383f {
    /* renamed from: a */
    private static String m25319a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        String str2 = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_data");
                        if (columnIndex > -1) {
                            str2 = query.getString(columnIndex);
                        }
                        if (str2 != null) {
                            String string = query.getString(columnIndex);
                            query.close();
                            return string;
                        }
                        String absolutePath = m25316d(context, query.getString(query.getColumnIndexOrThrow("_display_name")), uri).getAbsolutePath();
                        query.close();
                        return absolutePath;
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
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(19)
    /* renamed from: b */
    public static String m25318b(Context context, Uri uri) {
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (m25317c(uri)) {
                return uri.getLastPathSegment();
            }
            return m25319a(context, uri, null, null);
        } else if (!JSStackTrace.FILE_KEY.equalsIgnoreCase(uri.getScheme())) {
            return null;
        } else {
            return uri.getPath();
        }
    }

    /* renamed from: c */
    private static boolean m25317c(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: d */
    private static File m25316d(Context context, String str, Uri uri) {
        String str2 = context.getCacheDir() + "/react-native-image-crop-picker";
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            while (true) {
                int read = openInputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            openInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}
