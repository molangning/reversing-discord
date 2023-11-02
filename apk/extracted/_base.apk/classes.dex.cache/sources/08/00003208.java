package p078e6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007a6.C0030a;
import p097f6.C6311a;
import p097f6.InterfaceC6312b;
import p116g6.InterfaceC6553a;
import p130h6.C7021a;
import p347t5.C12588b;
import p381v5.AbstractC13093i;
import p381v5.AbstractC13103o;
import p381v5.C13092h;
import p417x5.InterfaceC13690a;
import p458z5.C14089a;
import p458z5.C14091b;
import p458z5.C14093c;
import p458z5.C14096d;
import p458z5.C14098e;
import p458z5.C14100f;

/* renamed from: e6.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6140m0 implements InterfaceC6117d, InterfaceC6312b, InterfaceC6115c {

    /* renamed from: o */
    private static final C12588b f17401o = C12588b.m4754b("proto");

    /* renamed from: j */
    private final C6158t0 f17402j;

    /* renamed from: k */
    private final InterfaceC6553a f17403k;

    /* renamed from: l */
    private final InterfaceC6553a f17404l;

    /* renamed from: m */
    private final AbstractC6119e f17405m;

    /* renamed from: n */
    private final InterfaceC13690a<String> f17406n;

    /* renamed from: e6.m0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6142b<T, U> {
        U apply(T t);
    }

    /* renamed from: e6.m0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6143c {

        /* renamed from: a */
        final String f17407a;

        /* renamed from: b */
        final String f17408b;

        private C6143c(String str, String str2) {
            this.f17407a = str;
            this.f17408b = str2;
        }
    }

    /* renamed from: e6.m0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6144d<T> {
        /* renamed from: a */
        T mo23412a();
    }

    public C6140m0(InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, AbstractC6119e abstractC6119e, C6158t0 c6158t0, InterfaceC13690a<String> interfaceC13690a) {
        this.f17402j = c6158t0;
        this.f17403k = interfaceC6553a;
        this.f17404l = interfaceC6553a2;
        this.f17405m = abstractC6119e;
        this.f17406n = interfaceC13690a;
    }

    /* renamed from: E0 */
    private C14093c.EnumC14095b m23510E0(int i) {
        C14093c.EnumC14095b enumC14095b = C14093c.EnumC14095b.REASON_UNKNOWN;
        if (i == enumC14095b.getNumber()) {
            return enumC14095b;
        }
        C14093c.EnumC14095b enumC14095b2 = C14093c.EnumC14095b.MESSAGE_TOO_OLD;
        if (i == enumC14095b2.getNumber()) {
            return enumC14095b2;
        }
        C14093c.EnumC14095b enumC14095b3 = C14093c.EnumC14095b.CACHE_FULL;
        if (i == enumC14095b3.getNumber()) {
            return enumC14095b3;
        }
        C14093c.EnumC14095b enumC14095b4 = C14093c.EnumC14095b.PAYLOAD_TOO_BIG;
        if (i == enumC14095b4.getNumber()) {
            return enumC14095b4;
        }
        C14093c.EnumC14095b enumC14095b5 = C14093c.EnumC14095b.MAX_RETRIES_REACHED;
        if (i == enumC14095b5.getNumber()) {
            return enumC14095b5;
        }
        C14093c.EnumC14095b enumC14095b6 = C14093c.EnumC14095b.INVALID_PAYLOD;
        if (i == enumC14095b6.getNumber()) {
            return enumC14095b6;
        }
        C14093c.EnumC14095b enumC14095b7 = C14093c.EnumC14095b.SERVER_ERROR;
        if (i == enumC14095b7.getNumber()) {
            return enumC14095b7;
        }
        C0030a.m41372a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return enumC14095b;
    }

    /* renamed from: F0 */
    private void m23509F0(final SQLiteDatabase sQLiteDatabase) {
        m23438v1(new InterfaceC6144d() { // from class: e6.g0
            @Override // p078e6.C6140m0.InterfaceC6144d
            /* renamed from: a */
            public final Object mo23412a() {
                Object m23489T0;
                m23489T0 = C6140m0.m23489T0(sQLiteDatabase);
                return m23489T0;
            }
        }, new InterfaceC6142b() { // from class: e6.h0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23487U0;
                m23487U0 = C6140m0.m23487U0((Throwable) obj);
                return m23487U0;
            }
        });
    }

    /* renamed from: G0 */
    private long m23508G0(SQLiteDatabase sQLiteDatabase, AbstractC13103o abstractC13103o) {
        Long m23499N0 = m23499N0(sQLiteDatabase, abstractC13103o);
        if (m23499N0 != null) {
            return m23499N0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC13103o.mo3261b());
        contentValues.put("priority", Integer.valueOf(C7021a.m21528a(abstractC13103o.mo3259d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC13103o.mo3260c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC13103o.mo3260c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: J0 */
    private C14091b m23503J0() {
        return C14091b.m690b().m688b(C14098e.m673c().m671b(m23506H0()).m670c(AbstractC6119e.f17385a.mo23546f()).m672a()).m689a();
    }

    /* renamed from: K0 */
    private long m23502K0() {
        return m23504I0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: L0 */
    private long m23501L0() {
        return m23504I0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: M0 */
    private C14100f m23500M0() {
        final long mo22402a = this.f17403k.mo22402a();
        return (C14100f) m23498O0(new InterfaceC6142b() { // from class: e6.c0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                C14100f m23481Y0;
                m23481Y0 = C6140m0.m23481Y0(mo22402a, (SQLiteDatabase) obj);
                return m23481Y0;
            }
        });
    }

    /* renamed from: N0 */
    private Long m23499N0(SQLiteDatabase sQLiteDatabase, AbstractC13103o abstractC13103o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC13103o.mo3261b(), String.valueOf(C7021a.m21528a(abstractC13103o.mo3259d()))));
        if (abstractC13103o.mo3260c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC13103o.mo3260c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m23433y1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new InterfaceC6142b() { // from class: e6.z
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Long m23479Z0;
                m23479Z0 = C6140m0.m23479Z0((Cursor) obj);
                return m23479Z0;
            }
        });
    }

    /* renamed from: P0 */
    private boolean m23496P0() {
        if (m23502K0() * m23501L0() >= this.f17405m.mo23546f()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    private List<AbstractC6135k> m23494Q0(List<AbstractC6135k> list, Map<Long, Set<C6143c>> map) {
        ListIterator<AbstractC6135k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC6135k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo23518c()))) {
                AbstractC13093i.AbstractC13094a m3294l = next.mo23519b().m3294l();
                for (C6143c c6143c : map.get(Long.valueOf(next.mo23518c()))) {
                    m3294l.m3291c(c6143c.f17407a, c6143c.f17408b);
                }
                listIterator.set(AbstractC6135k.m23520a(next.mo23518c(), next.mo23517d(), m3294l.mo3290d()));
            }
        }
        return list;
    }

    /* renamed from: R0 */
    public /* synthetic */ Object m23492R0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo23465i(i, C14093c.EnumC14095b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: S0 */
    public /* synthetic */ Integer m23490S0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m23433y1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC6142b() { // from class: e6.r
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23492R0;
                m23492R0 = C6140m0.this.m23492R0((Cursor) obj);
                return m23492R0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: T0 */
    public static /* synthetic */ Object m23489T0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* renamed from: U0 */
    public static /* synthetic */ Object m23487U0(Throwable th2) {
        throw new C6311a("Timed out while trying to acquire the lock.", th2);
    }

    /* renamed from: V0 */
    public static /* synthetic */ SQLiteDatabase m23485V0(Throwable th2) {
        throw new C6311a("Timed out while trying to open db.", th2);
    }

    /* renamed from: W0 */
    public static /* synthetic */ Long m23484W0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: X0 */
    public static /* synthetic */ C14100f m23483X0(long j, Cursor cursor) {
        cursor.moveToNext();
        return C14100f.m667c().m664c(cursor.getLong(0)).m665b(j).m666a();
    }

    /* renamed from: Y0 */
    public static /* synthetic */ C14100f m23481Y0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (C14100f) m23433y1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC6142b() { // from class: e6.d0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                C14100f m23483X0;
                m23483X0 = C6140m0.m23483X0(j, (Cursor) obj);
                return m23483X0;
            }
        });
    }

    /* renamed from: Z0 */
    public static /* synthetic */ Long m23479Z0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: a1 */
    public /* synthetic */ Boolean m23478a1(AbstractC13103o abstractC13103o, SQLiteDatabase sQLiteDatabase) {
        Long m23499N0 = m23499N0(sQLiteDatabase, abstractC13103o);
        if (m23499N0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m23433y1(m23504I0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m23499N0.toString()}), new InterfaceC6142b() { // from class: e6.y
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: b1 */
    public static /* synthetic */ List m23476b1(SQLiteDatabase sQLiteDatabase) {
        return (List) m23433y1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC6142b() { // from class: e6.j0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                List m23474c1;
                m23474c1 = C6140m0.m23474c1((Cursor) obj);
                return m23474c1;
            }
        });
    }

    /* renamed from: c1 */
    public static /* synthetic */ List m23474c1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC13103o.m3262a().mo3255b(cursor.getString(1)).mo3253d(C7021a.m21527b(cursor.getInt(2))).mo3254c(m23446s1(cursor.getString(3))).mo3256a());
        }
        return arrayList;
    }

    /* renamed from: d1 */
    public /* synthetic */ List m23473d1(AbstractC13103o abstractC13103o, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC6135k> m23450q1 = m23450q1(sQLiteDatabase, abstractC13103o);
        return m23494Q0(m23450q1, m23449r1(sQLiteDatabase, m23450q1));
    }

    /* renamed from: e1 */
    public /* synthetic */ C14089a m23471e1(Map map, C14089a.C14090a c14090a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C14093c.EnumC14095b m23510E0 = m23510E0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C14093c.m685c().m682c(m23510E0).m683b(j).m684a());
        }
        m23443t1(c14090a, map);
        c14090a.m692e(m23500M0());
        c14090a.m693d(m23503J0());
        c14090a.m694c(this.f17406n.get());
        return c14090a.m695b();
    }

    /* renamed from: f1 */
    public /* synthetic */ C14089a m23470f1(String str, final Map map, final C14089a.C14090a c14090a, SQLiteDatabase sQLiteDatabase) {
        return (C14089a) m23433y1(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC6142b() { // from class: e6.b0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                C14089a m23471e1;
                m23471e1 = C6140m0.this.m23471e1(map, c14090a, (Cursor) obj);
                return m23471e1;
            }
        });
    }

    /* renamed from: g1 */
    public /* synthetic */ Object m23469g1(List list, AbstractC13103o abstractC13103o, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            AbstractC13093i.AbstractC13094a mo3283k = AbstractC13093i.m3305a().mo3284j(cursor.getString(1)).mo3285i(cursor.getLong(2)).mo3283k(cursor.getLong(3));
            if (z) {
                mo3283k.mo3286h(new C13092h(m23436w1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo3283k.mo3286h(new C13092h(m23436w1(cursor.getString(4)), m23441u1(j)));
            }
            if (!cursor.isNull(6)) {
                mo3283k.mo3287g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC6135k.m23520a(j, abstractC13103o, mo3283k.mo3290d()));
        }
        return null;
    }

    /* renamed from: h1 */
    public static /* synthetic */ Object m23466h1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C6143c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: i1 */
    public /* synthetic */ Long m23464i1(AbstractC13093i abstractC13093i, AbstractC13103o abstractC13103o, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (m23496P0()) {
            mo23465i(1L, C14093c.EnumC14095b.CACHE_FULL, abstractC13093i.mo3296j());
            return -1L;
        }
        long m23508G0 = m23508G0(sQLiteDatabase, abstractC13103o);
        int mo23547e = this.f17405m.mo23547e();
        byte[] m3307a = abstractC13093i.mo3301e().m3307a();
        if (m3307a.length <= mo23547e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m23508G0));
        contentValues.put("transport_name", abstractC13093i.mo3296j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC13093i.mo3300f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC13093i.mo3295k()));
        contentValues.put("payload_encoding", abstractC13093i.mo3301e().m3306b().m4755a());
        contentValues.put("code", abstractC13093i.mo3302d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = m3307a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(m3307a.length / mo23547e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(m3307a, (i - 1) * mo23547e, Math.min(i * mo23547e, m3307a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC13093i.m3297i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(ZeroconfModule.KEY_SERVICE_NAME, entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: j1 */
    public static /* synthetic */ byte[] m23461j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: k1 */
    public /* synthetic */ Object m23460k1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo23465i(i, C14093c.EnumC14095b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: l1 */
    public /* synthetic */ Object m23459l1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m23433y1(sQLiteDatabase.rawQuery(str2, null), new InterfaceC6142b() { // from class: e6.x
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23460k1;
                m23460k1 = C6140m0.this.m23460k1((Cursor) obj);
                return m23460k1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: m1 */
    public static /* synthetic */ Boolean m23457m1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: n1 */
    public static /* synthetic */ Object m23455n1(String str, C14093c.EnumC14095b enumC14095b, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m23433y1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC14095b.getNumber())}), new InterfaceC6142b() { // from class: e6.v
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Boolean m23457m1;
                m23457m1 = C6140m0.m23457m1((Cursor) obj);
                return m23457m1;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC14095b.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC14095b.getNumber())});
        }
        return null;
    }

    /* renamed from: o1 */
    public static /* synthetic */ Object m23453o1(long j, AbstractC13103o abstractC13103o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC13103o.mo3261b(), String.valueOf(C7021a.m21528a(abstractC13103o.mo3259d()))}) < 1) {
            contentValues.put("backend_name", abstractC13103o.mo3261b());
            contentValues.put("priority", Integer.valueOf(C7021a.m21528a(abstractC13103o.mo3259d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: p1 */
    public /* synthetic */ Object m23452p1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f17403k.mo22402a()).execute();
        return null;
    }

    /* renamed from: q1 */
    private List<AbstractC6135k> m23450q1(SQLiteDatabase sQLiteDatabase, final AbstractC13103o abstractC13103o) {
        final ArrayList arrayList = new ArrayList();
        Long m23499N0 = m23499N0(sQLiteDatabase, abstractC13103o);
        if (m23499N0 == null) {
            return arrayList;
        }
        m23433y1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m23499N0.toString()}, null, null, null, String.valueOf(this.f17405m.mo23548d())), new InterfaceC6142b() { // from class: e6.u
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23469g1;
                m23469g1 = C6140m0.this.m23469g1(arrayList, abstractC13103o, (Cursor) obj);
                return m23469g1;
            }
        });
        return arrayList;
    }

    /* renamed from: r1 */
    private Map<Long, Set<C6143c>> m23449r1(SQLiteDatabase sQLiteDatabase, List<AbstractC6135k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb2.append(list.get(i).mo23518c());
            if (i < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m23433y1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", ZeroconfModule.KEY_SERVICE_NAME, "value"}, sb2.toString(), null, null, null, null), new InterfaceC6142b() { // from class: e6.s
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23466h1;
                m23466h1 = C6140m0.m23466h1(hashMap, (Cursor) obj);
                return m23466h1;
            }
        });
        return hashMap;
    }

    /* renamed from: s1 */
    private static byte[] m23446s1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: t1 */
    private void m23443t1(C14089a.C14090a c14090a, Map<String, List<C14093c>> map) {
        for (Map.Entry<String, List<C14093c>> entry : map.entrySet()) {
            c14090a.m696a(C14096d.m679c().m676c(entry.getKey()).m677b(entry.getValue()).m678a());
        }
    }

    /* renamed from: u1 */
    private byte[] m23441u1(long j) {
        return (byte[]) m23433y1(m23504I0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new InterfaceC6142b() { // from class: e6.a0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                byte[] m23461j1;
                m23461j1 = C6140m0.m23461j1((Cursor) obj);
                return m23461j1;
            }
        });
    }

    /* renamed from: v1 */
    private <T> T m23438v1(InterfaceC6144d<T> interfaceC6144d, InterfaceC6142b<Throwable, T> interfaceC6142b) {
        long mo22402a = this.f17404l.mo22402a();
        while (true) {
            try {
                return interfaceC6144d.mo23412a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f17404l.mo22402a() >= this.f17405m.mo23550b() + mo22402a) {
                    return interfaceC6142b.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: w1 */
    private static C12588b m23436w1(String str) {
        if (str == null) {
            return f17401o;
        }
        return C12588b.m4754b(str);
    }

    /* renamed from: x1 */
    private static String m23434x1(Iterable<AbstractC6135k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC6135k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo23518c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: y1 */
    static <T> T m23433y1(Cursor cursor, InterfaceC6142b<Cursor, T> interfaceC6142b) {
        try {
            return interfaceC6142b.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: H0 */
    long m23506H0() {
        return m23502K0() * m23501L0();
    }

    /* renamed from: I0 */
    SQLiteDatabase m23504I0() {
        final C6158t0 c6158t0 = this.f17402j;
        Objects.requireNonNull(c6158t0);
        return (SQLiteDatabase) m23438v1(new InterfaceC6144d() { // from class: e6.w
            @Override // p078e6.C6140m0.InterfaceC6144d
            /* renamed from: a */
            public final Object mo23412a() {
                return C6158t0.this.getWritableDatabase();
            }
        }, new InterfaceC6142b() { // from class: e6.e0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                SQLiteDatabase m23485V0;
                m23485V0 = C6140m0.m23485V0((Throwable) obj);
                return m23485V0;
            }
        });
    }

    /* renamed from: O0 */
    <T> T m23498O0(InterfaceC6142b<SQLiteDatabase, T> interfaceC6142b) {
        SQLiteDatabase m23504I0 = m23504I0();
        m23504I0.beginTransaction();
        try {
            T apply = interfaceC6142b.apply(m23504I0);
            m23504I0.setTransactionSuccessful();
            return apply;
        } finally {
            m23504I0.endTransaction();
        }
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: P */
    public AbstractC6135k mo23497P(final AbstractC13103o abstractC13103o, final AbstractC13093i abstractC13093i) {
        C0030a.m41371b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC13103o.mo3259d(), abstractC13093i.mo3296j(), abstractC13103o.mo3261b());
        long longValue = ((Long) m23498O0(new InterfaceC6142b() { // from class: e6.l0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Long m23464i1;
                m23464i1 = C6140m0.this.m23464i1(abstractC13093i, abstractC13103o, (SQLiteDatabase) obj);
                return m23464i1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC6135k.m23520a(longValue, abstractC13103o, abstractC13093i);
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: Z */
    public void mo23480Z(Iterable<AbstractC6135k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m23434x1(iterable);
        m23498O0(new InterfaceC6142b() { // from class: e6.q
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23459l1;
                m23459l1 = C6140m0.this.m23459l1(str, r3, (SQLiteDatabase) obj);
                return m23459l1;
            }
        });
    }

    @Override // p097f6.InterfaceC6312b
    /* renamed from: a */
    public <T> T mo22998a(InterfaceC6312b.InterfaceC6313a<T> interfaceC6313a) {
        SQLiteDatabase m23504I0 = m23504I0();
        m23509F0(m23504I0);
        try {
            T execute = interfaceC6313a.execute();
            m23504I0.setTransactionSuccessful();
            return execute;
        } finally {
            m23504I0.endTransaction();
        }
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: c */
    public int mo23475c() {
        final long mo22402a = this.f17403k.mo22402a() - this.f17405m.mo23549c();
        return ((Integer) m23498O0(new InterfaceC6142b() { // from class: e6.i0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Integer m23490S0;
                m23490S0 = C6140m0.this.m23490S0(mo22402a, (SQLiteDatabase) obj);
                return m23490S0;
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17402j.close();
    }

    @Override // p078e6.InterfaceC6115c
    /* renamed from: h */
    public void mo23468h() {
        m23498O0(new InterfaceC6142b() { // from class: e6.o
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23452p1;
                m23452p1 = C6140m0.this.m23452p1((SQLiteDatabase) obj);
                return m23452p1;
            }
        });
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: h0 */
    public Iterable<AbstractC6135k> mo23467h0(final AbstractC13103o abstractC13103o) {
        return (Iterable) m23498O0(new InterfaceC6142b() { // from class: e6.p
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                List m23473d1;
                m23473d1 = C6140m0.this.m23473d1(abstractC13103o, (SQLiteDatabase) obj);
                return m23473d1;
            }
        });
    }

    @Override // p078e6.InterfaceC6115c
    /* renamed from: i */
    public void mo23465i(final long j, final C14093c.EnumC14095b enumC14095b, final String str) {
        m23498O0(new InterfaceC6142b() { // from class: e6.m
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23455n1;
                m23455n1 = C6140m0.m23455n1(str, enumC14095b, j, (SQLiteDatabase) obj);
                return m23455n1;
            }
        });
    }

    @Override // p078e6.InterfaceC6115c
    /* renamed from: j */
    public C14089a mo23463j() {
        final C14089a.C14090a m698e = C14089a.m698e();
        final HashMap hashMap = new HashMap();
        return (C14089a) m23498O0(new InterfaceC6142b() { // from class: e6.t
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                C14089a m23470f1;
                m23470f1 = C6140m0.this.m23470f1(r2, hashMap, m698e, (SQLiteDatabase) obj);
                return m23470f1;
            }
        });
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: n */
    public void mo23456n(Iterable<AbstractC6135k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        m23504I0().compileStatement("DELETE FROM events WHERE _id in " + m23434x1(iterable)).execute();
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: s0 */
    public boolean mo23447s0(final AbstractC13103o abstractC13103o) {
        return ((Boolean) m23498O0(new InterfaceC6142b() { // from class: e6.k0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Boolean m23478a1;
                m23478a1 = C6140m0.this.m23478a1(abstractC13103o, (SQLiteDatabase) obj);
                return m23478a1;
            }
        })).booleanValue();
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: u */
    public void mo23442u(final AbstractC13103o abstractC13103o, final long j) {
        m23498O0(new InterfaceC6142b() { // from class: e6.n
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Object m23453o1;
                m23453o1 = C6140m0.m23453o1(j, abstractC13103o, (SQLiteDatabase) obj);
                return m23453o1;
            }
        });
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: v0 */
    public long mo23439v0(AbstractC13103o abstractC13103o) {
        return ((Long) m23433y1(m23504I0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC13103o.mo3261b(), String.valueOf(C7021a.m21528a(abstractC13103o.mo3259d()))}), new InterfaceC6142b() { // from class: e6.f0
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                Long m23484W0;
                m23484W0 = C6140m0.m23484W0((Cursor) obj);
                return m23484W0;
            }
        })).longValue();
    }

    @Override // p078e6.InterfaceC6117d
    /* renamed from: x */
    public Iterable<AbstractC13103o> mo23435x() {
        return (Iterable) m23498O0(new InterfaceC6142b() { // from class: e6.l
            @Override // p078e6.C6140m0.InterfaceC6142b
            public final Object apply(Object obj) {
                List m23476b1;
                m23476b1 = C6140m0.m23476b1((SQLiteDatabase) obj);
                return m23476b1;
            }
        });
    }
}