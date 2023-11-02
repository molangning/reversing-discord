package p078e6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: e6.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6158t0 extends SQLiteOpenHelper {

    /* renamed from: l */
    private static final String f17428l = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: m */
    static int f17429m = 5;

    /* renamed from: n */
    private static final InterfaceC6159a f17430n;

    /* renamed from: o */
    private static final InterfaceC6159a f17431o;

    /* renamed from: p */
    private static final InterfaceC6159a f17432p;

    /* renamed from: q */
    private static final InterfaceC6159a f17433q;

    /* renamed from: r */
    private static final InterfaceC6159a f17434r;

    /* renamed from: s */
    private static final List<InterfaceC6159a> f17435s;

    /* renamed from: j */
    private final int f17436j;

    /* renamed from: k */
    private boolean f17437k;

    /* renamed from: e6.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6159a {
        /* renamed from: a */
        void mo23416a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        InterfaceC6159a interfaceC6159a = new InterfaceC6159a() { // from class: e6.o0
            @Override // p078e6.C6158t0.InterfaceC6159a
            /* renamed from: a */
            public final void mo23416a(SQLiteDatabase sQLiteDatabase) {
                C6158t0.m23420q(sQLiteDatabase);
            }
        };
        f17430n = interfaceC6159a;
        InterfaceC6159a interfaceC6159a2 = new InterfaceC6159a() { // from class: e6.p0
            @Override // p078e6.C6158t0.InterfaceC6159a
            /* renamed from: a */
            public final void mo23416a(SQLiteDatabase sQLiteDatabase) {
                C6158t0.m23419s(sQLiteDatabase);
            }
        };
        f17431o = interfaceC6159a2;
        InterfaceC6159a interfaceC6159a3 = new InterfaceC6159a() { // from class: e6.q0
            @Override // p078e6.C6158t0.InterfaceC6159a
            /* renamed from: a */
            public final void mo23416a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f17432p = interfaceC6159a3;
        InterfaceC6159a interfaceC6159a4 = new InterfaceC6159a() { // from class: e6.r0
            @Override // p078e6.C6158t0.InterfaceC6159a
            /* renamed from: a */
            public final void mo23416a(SQLiteDatabase sQLiteDatabase) {
                C6158t0.m23417v(sQLiteDatabase);
            }
        };
        f17433q = interfaceC6159a4;
        InterfaceC6159a interfaceC6159a5 = new InterfaceC6159a() { // from class: e6.s0
            @Override // p078e6.C6158t0.InterfaceC6159a
            /* renamed from: a */
            public final void mo23416a(SQLiteDatabase sQLiteDatabase) {
                C6158t0.m23429A(sQLiteDatabase);
            }
        };
        f17434r = interfaceC6159a5;
        f17435s = Arrays.asList(interfaceC6159a, interfaceC6159a2, interfaceC6159a3, interfaceC6159a4, interfaceC6159a5);
    }

    public C6158t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f17437k = false;
        this.f17436j = i;
    }

    /* renamed from: A */
    public static /* synthetic */ void m23429A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f17428l);
    }

    /* renamed from: D */
    private void m23428D(SQLiteDatabase sQLiteDatabase, int i) {
        m23421o(sQLiteDatabase);
        m23427H(sQLiteDatabase, 0, i);
    }

    /* renamed from: H */
    private void m23427H(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC6159a> list = f17435s;
        if (i2 <= list.size()) {
            while (i < i2) {
                f17435s.get(i).mo23416a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: o */
    private void m23421o(SQLiteDatabase sQLiteDatabase) {
        if (!this.f17437k) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: q */
    public static /* synthetic */ void m23420q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: s */
    public static /* synthetic */ void m23419s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: v */
    public static /* synthetic */ void m23417v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f17437k = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m23428D(sQLiteDatabase, this.f17436j);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m23428D(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m23421o(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m23421o(sQLiteDatabase);
        m23427H(sQLiteDatabase, i, i2);
    }
}