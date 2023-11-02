package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p195k8.C9149a;
import p211l6.C10053a;
import p211l6.C10056d;
import p211l6.InterfaceC10054b;

/* renamed from: com.google.android.exoplayer2.upstream.cache.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4530f {

    /* renamed from: c */
    private static final String[] f12337c = {ZeroconfModule.KEY_SERVICE_NAME, "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final InterfaceC10054b f12338a;

    /* renamed from: b */
    private String f12339b;

    public C4530f(InterfaceC10054b interfaceC10054b) {
        this.f12338a = interfaceC10054b;
    }

    /* renamed from: a */
    private static void m28704a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    /* renamed from: c */
    private Cursor m28702c() {
        C9149a.m16448e(this.f12339b);
        return this.f12338a.getReadableDatabase().query(this.f12339b, f12337c, null, null, null, null, null);
    }

    /* renamed from: d */
    private static String m28701d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    /* renamed from: b */
    public Map<String, C4529e> m28703b() {
        try {
            Cursor m28702c = m28702c();
            HashMap hashMap = new HashMap(m28702c.getCount());
            while (m28702c.moveToNext()) {
                hashMap.put(m28702c.getString(0), new C4529e(m28702c.getLong(1), m28702c.getLong(2)));
            }
            m28702c.close();
            return hashMap;
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }

    /* renamed from: e */
    public void m28700e(long j) {
        try {
            String hexString = Long.toHexString(j);
            this.f12339b = m28701d(hexString);
            if (C10056d.m12477b(this.f12338a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f12338a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C10056d.m12475d(writableDatabase, 2, hexString, 1);
                m28704a(writableDatabase, this.f12339b);
                writableDatabase.execSQL("CREATE TABLE " + this.f12339b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }

    /* renamed from: f */
    public void m28699f(String str) {
        C9149a.m16448e(this.f12339b);
        try {
            this.f12338a.getWritableDatabase().delete(this.f12339b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }

    /* renamed from: g */
    public void m28698g(Set<String> set) {
        C9149a.m16448e(this.f12339b);
        try {
            SQLiteDatabase writableDatabase = this.f12338a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.f12339b, "name = ?", new String[]{it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }

    /* renamed from: h */
    public void m28697h(String str, long j, long j2) {
        C9149a.m16448e(this.f12339b);
        try {
            SQLiteDatabase writableDatabase = this.f12338a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(ZeroconfModule.KEY_SERVICE_NAME, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f12339b, null, contentValues);
        } catch (SQLException e) {
            throw new C10053a(e);
        }
    }
}