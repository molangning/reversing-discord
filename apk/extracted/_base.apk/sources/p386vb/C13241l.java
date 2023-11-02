package p386vb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p164j$.time.ZoneOffset;
import p164j$.time.format.DateTimeFormatter;
import p164j$.util.DateRetargetClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vb.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13241l {

    /* renamed from: a */
    private final SharedPreferences f34297a;

    public C13241l(Context context, String str) {
        this.f34297a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m2986a() {
        long j = this.f34297a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f34297a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f34297a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f34297a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m2983d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    private synchronized String m2982e(String str) {
        for (Map.Entry<String, ?> entry : this.f34297a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m2979h(String str) {
        String m2982e = m2982e(str);
        if (m2982e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f34297a.getStringSet(m2982e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f34297a.edit().remove(m2982e).commit();
        } else {
            this.f34297a.edit().putStringSet(m2982e, hashSet).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m2985b() {
        SharedPreferences.Editor edit = this.f34297a.edit();
        for (Map.Entry<String, ?> entry : this.f34297a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<AbstractC13242m> m2984c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f34297a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(AbstractC13242m.m2974a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        m2975l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m2981f(long j, long j2) {
        return m2983d(j).equals(m2983d(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m2980g() {
        String m2983d = m2983d(System.currentTimeMillis());
        this.f34297a.edit().putString("last-used-date", m2983d).commit();
        m2979h(m2983d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean m2978i(long j) {
        return m2977j("fire-global", j);
    }

    /* renamed from: j */
    synchronized boolean m2977j(String str, long j) {
        if (this.f34297a.contains(str)) {
            if (!m2981f(this.f34297a.getLong(str, -1L), j)) {
                this.f34297a.edit().putLong(str, j).commit();
                return true;
            }
            return false;
        }
        this.f34297a.edit().putLong(str, j).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void m2976k(long j, String str) {
        String m2983d = m2983d(j);
        if (this.f34297a.getString("last-used-date", "").equals(m2983d)) {
            return;
        }
        long j2 = this.f34297a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m2986a();
            j2 = this.f34297a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f34297a.getStringSet(str, new HashSet()));
        hashSet.add(m2983d);
        this.f34297a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", m2983d).commit();
    }

    /* renamed from: l */
    synchronized void m2975l(long j) {
        this.f34297a.edit().putLong("fire-global", j).commit();
    }
}
