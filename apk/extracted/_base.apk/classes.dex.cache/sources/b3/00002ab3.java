package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p029b9.C2198p;
import p119g9.C6585h;
import p282p8.C11465n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzce extends zzbs implements Closeable {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzcd zzc;
    private final zzfo zzd;
    private final zzfo zze;

    public zzce(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new zzfo(zzC());
        this.zze = new zzfo(zzC());
        this.zzc = new zzcd(this, zzbvVar.zza(), zzae());
    }

    private final long zzad(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzf().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    cursor.close();
                    return j2;
                }
                cursor.close();
                return 0L;
            } catch (SQLiteException e) {
                zzL("Database error", str, e);
                throw e;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e) {
            zzK("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            zzK("Error closing database", e2);
        }
    }

    public final void zzZ(List<Long> list) {
        C2198p.m33985j(list);
        C11465n.m8036d();
        zzW();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hit_id");
        sb2.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = list.get(i);
            if (l != null && l.longValue() != 0) {
                if (i > 0) {
                    sb2.append(",");
                }
                sb2.append(l);
            } else {
                throw new SQLiteException("Invalid hit id");
            }
        }
        sb2.append(")");
        String sb3 = sb2.toString();
        try {
            SQLiteDatabase zzf = zzf();
            zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = zzf.delete("hits2", sb3, null);
            if (delete != list.size()) {
                zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb3);
            }
        } catch (SQLiteException e) {
            zzK("Error deleting hits", e);
            throw e;
        }
    }

    public final int zza() {
        C11465n.m8036d();
        zzW();
        if (!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        zzO("Deleting stale hits (if any)");
        int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().mo22382a() - 2592000000L)});
        zzP("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        C11465n.m8036d();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzL("Database error", "SELECT COUNT(*) FROM hits2", e);
                throw e;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long zzc() {
        C11465n.m8036d();
        zzW();
        return zzad(zzb, null, 0L);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e) {
            zzS("Error opening database", e);
            throw e;
        }
    }

    public final List<zzex> zzj(long j) {
        boolean z;
        boolean z2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33994a(z);
        C11465n.m8036d();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor query = zzf().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (query.moveToFirst()) {
                        do {
                            long j2 = query.getLong(0);
                            long j3 = query.getLong(1);
                            String string = query.getString(2);
                            String string2 = query.getString(3);
                            int i = query.getInt(4);
                            Map<String, String> zzk = zzk(string);
                            if (!TextUtils.isEmpty(string2) && string2.startsWith("http:")) {
                                z2 = false;
                                arrayList.add(new zzex(this, zzk, j3, z2, j2, i, null));
                            }
                            z2 = true;
                            arrayList.add(new zzex(this, zzk, j3, z2, j2, i, null));
                        } while (query.moveToNext());
                        query.close();
                        return arrayList;
                    }
                    query.close();
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = query;
                    zzK("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
    }

    final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                if (str.length() != 0) {
                    str = "?".concat(str);
                } else {
                    str = new String("?");
                }
            }
            return C6585h.m22371a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            zzK("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j) {
        C11465n.m8036d();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        zzP("Deleting hit, id", valueOf);
        zzZ(arrayList);
    }
}