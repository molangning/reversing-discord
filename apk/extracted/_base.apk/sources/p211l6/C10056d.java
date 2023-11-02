package p211l6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import p195k8.C9191p0;

/* renamed from: l6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10056d {
    /* renamed from: a */
    private static String[] m12478a(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    /* renamed from: b */
    public static int m12477b(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (!C9191p0.m16278R0(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", m12478a(i, str), null, null, null);
            if (query.getCount() == 0) {
                query.close();
                return -1;
            }
            query.moveToNext();
            int i2 = query.getInt(0);
            query.close();
            return i2;
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }

    /* renamed from: c */
    public static void m12476c(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (!C9191p0.m16278R0(sQLiteDatabase, "ExoPlayerVersions")) {
                return;
            }
            sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", m12478a(i, str));
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }

    /* renamed from: d */
    public static void m12475d(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }
}
