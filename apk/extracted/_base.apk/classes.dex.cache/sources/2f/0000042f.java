package androidx.core.content.p017pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.content.C0958g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p432y.C13847a;

/* renamed from: androidx.core.content.pm.ShortcutInfoCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ShortcutInfoCompat {

    /* renamed from: A */
    int f3249A;

    /* renamed from: a */
    Context f3250a;

    /* renamed from: b */
    String f3251b;

    /* renamed from: c */
    String f3252c;

    /* renamed from: d */
    Intent[] f3253d;

    /* renamed from: e */
    ComponentName f3254e;

    /* renamed from: f */
    CharSequence f3255f;

    /* renamed from: g */
    CharSequence f3256g;

    /* renamed from: h */
    CharSequence f3257h;

    /* renamed from: i */
    IconCompat f3258i;

    /* renamed from: j */
    boolean f3259j;

    /* renamed from: k */
    Person[] f3260k;

    /* renamed from: l */
    Set<String> f3261l;

    /* renamed from: m */
    C0958g f3262m;

    /* renamed from: n */
    boolean f3263n;

    /* renamed from: o */
    int f3264o;

    /* renamed from: p */
    PersistableBundle f3265p;

    /* renamed from: q */
    long f3266q;

    /* renamed from: r */
    UserHandle f3267r;

    /* renamed from: s */
    boolean f3268s;

    /* renamed from: t */
    boolean f3269t;

    /* renamed from: u */
    boolean f3270u;

    /* renamed from: v */
    boolean f3271v;

    /* renamed from: w */
    boolean f3272w;

    /* renamed from: x */
    boolean f3273x = true;

    /* renamed from: y */
    boolean f3274y;

    /* renamed from: z */
    int f3275z;

    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0961a {
        /* renamed from: a */
        static void m38344a(ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    ShortcutInfoCompat() {
    }

    /* renamed from: a */
    private PersistableBundle m38361a() {
        if (this.f3265p == null) {
            this.f3265p = new PersistableBundle();
        }
        Person[] personArr = this.f3260k;
        if (personArr != null && personArr.length > 0) {
            this.f3265p.putInt("extraPersonCount", personArr.length);
            int i = 0;
            while (i < this.f3260k.length) {
                PersistableBundle persistableBundle = this.f3265p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i2 = i + 1;
                sb2.append(i2);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f3260k[i].m38737m());
                i = i2;
            }
        }
        C0958g c0958g = this.f3262m;
        if (c0958g != null) {
            this.f3265p.putString("extraLocusId", c0958g.m38369a());
        }
        this.f3265p.putBoolean("extraLongLived", this.f3263n);
        return this.f3265p;
    }

    /* renamed from: b */
    public static List<ShortcutInfoCompat> m38360b(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo shortcutInfo : list) {
            arrayList.add(new C0962b(context, shortcutInfo).m38343a());
        }
        return arrayList;
    }

    /* renamed from: j */
    static C0958g m38352j(ShortcutInfo shortcutInfo) {
        PersistableBundle extras;
        LocusId locusId;
        LocusId locusId2;
        if (Build.VERSION.SDK_INT >= 29) {
            locusId = shortcutInfo.getLocusId();
            if (locusId == null) {
                return null;
            }
            locusId2 = shortcutInfo.getLocusId();
            return C0958g.m38366d(locusId2);
        }
        extras = shortcutInfo.getExtras();
        return m38351k(extras);
    }

    /* renamed from: k */
    private static C0958g m38351k(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new C0958g(string);
    }

    /* renamed from: m */
    static Person[] m38349m(PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey("extraPersonCount")) {
            int i = persistableBundle.getInt("extraPersonCount");
            Person[] personArr = new Person[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i3 = i2 + 1;
                sb2.append(i3);
                personArr[i2] = Person.m38747c(persistableBundle.getPersistableBundle(sb2.toString()));
                i2 = i3;
            }
            return personArr;
        }
        return null;
    }

    /* renamed from: c */
    public ComponentName m38359c() {
        return this.f3254e;
    }

    /* renamed from: d */
    public Set<String> m38358d() {
        return this.f3261l;
    }

    /* renamed from: e */
    public CharSequence m38357e() {
        return this.f3257h;
    }

    /* renamed from: f */
    public IconCompat m38356f() {
        return this.f3258i;
    }

    /* renamed from: g */
    public String m38355g() {
        return this.f3251b;
    }

    /* renamed from: h */
    public Intent m38354h() {
        Intent[] intentArr = this.f3253d;
        return intentArr[intentArr.length - 1];
    }

    /* renamed from: i */
    public Intent[] m38353i() {
        Intent[] intentArr = this.f3253d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    /* renamed from: l */
    public CharSequence m38350l() {
        return this.f3256g;
    }

    /* renamed from: n */
    public int m38348n() {
        return this.f3264o;
    }

    /* renamed from: o */
    public CharSequence m38347o() {
        return this.f3255f;
    }

    /* renamed from: p */
    public boolean m38346p(int i) {
        return (i & this.f3249A) != 0;
    }

    /* renamed from: q */
    public ShortcutInfo m38345q() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        shortLabel = new ShortcutInfo.Builder(this.f3250a, this.f3251b).setShortLabel(this.f3255f);
        intents = shortLabel.setIntents(this.f3253d);
        IconCompat iconCompat = this.f3258i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m38112z(this.f3250a));
        }
        if (!TextUtils.isEmpty(this.f3256g)) {
            intents.setLongLabel(this.f3256g);
        }
        if (!TextUtils.isEmpty(this.f3257h)) {
            intents.setDisabledMessage(this.f3257h);
        }
        ComponentName componentName = this.f3254e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f3261l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f3264o);
        PersistableBundle persistableBundle = this.f3265p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.f3260k;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.f3260k[i].m38739k();
                }
                intents.setPersons(personArr2);
            }
            C0958g c0958g = this.f3262m;
            if (c0958g != null) {
                intents.setLocusId(c0958g.m38367c());
            }
            intents.setLongLived(this.f3263n);
        } else {
            intents.setExtras(m38361a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C0961a.m38344a(intents, this.f3249A);
        }
        build = intents.build();
        return build;
    }

    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0962b {

        /* renamed from: a */
        private final ShortcutInfoCompat f3276a;

        /* renamed from: b */
        private boolean f3277b;

        /* renamed from: c */
        private Set<String> f3278c;

        /* renamed from: d */
        private Map<String, Map<String, List<String>>> f3279d;

        /* renamed from: e */
        private Uri f3280e;

        public C0962b(Context context, String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f3276a = shortcutInfoCompat;
            shortcutInfoCompat.f3250a = context;
            shortcutInfoCompat.f3251b = str;
        }

        /* renamed from: a */
        public ShortcutInfoCompat m38343a() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.f3276a.f3255f)) {
                ShortcutInfoCompat shortcutInfoCompat = this.f3276a;
                Intent[] intentArr = shortcutInfoCompat.f3253d;
                if (intentArr != null && intentArr.length != 0) {
                    if (this.f3277b) {
                        if (shortcutInfoCompat.f3262m == null) {
                            shortcutInfoCompat.f3262m = new C0958g(shortcutInfoCompat.f3251b);
                        }
                        this.f3276a.f3263n = true;
                    }
                    if (this.f3278c != null) {
                        ShortcutInfoCompat shortcutInfoCompat2 = this.f3276a;
                        if (shortcutInfoCompat2.f3261l == null) {
                            shortcutInfoCompat2.f3261l = new HashSet();
                        }
                        this.f3276a.f3261l.addAll(this.f3278c);
                    }
                    if (this.f3279d != null) {
                        ShortcutInfoCompat shortcutInfoCompat3 = this.f3276a;
                        if (shortcutInfoCompat3.f3265p == null) {
                            shortcutInfoCompat3.f3265p = new PersistableBundle();
                        }
                        for (String str : this.f3279d.keySet()) {
                            Map<String, List<String>> map = this.f3279d.get(str);
                            this.f3276a.f3265p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List<String> list = map.get(str2);
                                PersistableBundle persistableBundle = this.f3276a.f3265p;
                                String str3 = str + "/" + str2;
                                if (list == null) {
                                    strArr = new String[0];
                                } else {
                                    strArr = (String[]) list.toArray(new String[0]);
                                }
                                persistableBundle.putStringArray(str3, strArr);
                            }
                        }
                    }
                    if (this.f3280e != null) {
                        ShortcutInfoCompat shortcutInfoCompat4 = this.f3276a;
                        if (shortcutInfoCompat4.f3265p == null) {
                            shortcutInfoCompat4.f3265p = new PersistableBundle();
                        }
                        this.f3276a.f3265p.putString("extraSliceUri", C13847a.m1402a(this.f3280e));
                    }
                    return this.f3276a;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        /* renamed from: b */
        public C0962b m38342b(ComponentName componentName) {
            this.f3276a.f3254e = componentName;
            return this;
        }

        /* renamed from: c */
        public C0962b m38341c(Set<String> set) {
            this.f3276a.f3261l = set;
            return this;
        }

        /* renamed from: d */
        public C0962b m38340d(CharSequence charSequence) {
            this.f3276a.f3257h = charSequence;
            return this;
        }

        /* renamed from: e */
        public C0962b m38339e(IconCompat iconCompat) {
            this.f3276a.f3258i = iconCompat;
            return this;
        }

        /* renamed from: f */
        public C0962b m38338f(Intent intent) {
            return m38337g(new Intent[]{intent});
        }

        /* renamed from: g */
        public C0962b m38337g(Intent[] intentArr) {
            this.f3276a.f3253d = intentArr;
            return this;
        }

        /* renamed from: h */
        public C0962b m38336h(C0958g c0958g) {
            this.f3276a.f3262m = c0958g;
            return this;
        }

        /* renamed from: i */
        public C0962b m38335i(CharSequence charSequence) {
            this.f3276a.f3256g = charSequence;
            return this;
        }

        /* renamed from: j */
        public C0962b m38334j(boolean z) {
            this.f3276a.f3263n = z;
            return this;
        }

        /* renamed from: k */
        public C0962b m38333k(Person[] personArr) {
            this.f3276a.f3260k = personArr;
            return this;
        }

        /* renamed from: l */
        public C0962b m38332l(int i) {
            this.f3276a.f3264o = i;
            return this;
        }

        /* renamed from: m */
        public C0962b m38331m(CharSequence charSequence) {
            this.f3276a.f3255f = charSequence;
            return this;
        }

        public C0962b(ShortcutInfoCompat shortcutInfoCompat) {
            ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
            this.f3276a = shortcutInfoCompat2;
            shortcutInfoCompat2.f3250a = shortcutInfoCompat.f3250a;
            shortcutInfoCompat2.f3251b = shortcutInfoCompat.f3251b;
            shortcutInfoCompat2.f3252c = shortcutInfoCompat.f3252c;
            Intent[] intentArr = shortcutInfoCompat.f3253d;
            shortcutInfoCompat2.f3253d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            shortcutInfoCompat2.f3254e = shortcutInfoCompat.f3254e;
            shortcutInfoCompat2.f3255f = shortcutInfoCompat.f3255f;
            shortcutInfoCompat2.f3256g = shortcutInfoCompat.f3256g;
            shortcutInfoCompat2.f3257h = shortcutInfoCompat.f3257h;
            shortcutInfoCompat2.f3275z = shortcutInfoCompat.f3275z;
            shortcutInfoCompat2.f3258i = shortcutInfoCompat.f3258i;
            shortcutInfoCompat2.f3259j = shortcutInfoCompat.f3259j;
            shortcutInfoCompat2.f3267r = shortcutInfoCompat.f3267r;
            shortcutInfoCompat2.f3266q = shortcutInfoCompat.f3266q;
            shortcutInfoCompat2.f3268s = shortcutInfoCompat.f3268s;
            shortcutInfoCompat2.f3269t = shortcutInfoCompat.f3269t;
            shortcutInfoCompat2.f3270u = shortcutInfoCompat.f3270u;
            shortcutInfoCompat2.f3271v = shortcutInfoCompat.f3271v;
            shortcutInfoCompat2.f3272w = shortcutInfoCompat.f3272w;
            shortcutInfoCompat2.f3273x = shortcutInfoCompat.f3273x;
            shortcutInfoCompat2.f3262m = shortcutInfoCompat.f3262m;
            shortcutInfoCompat2.f3263n = shortcutInfoCompat.f3263n;
            shortcutInfoCompat2.f3274y = shortcutInfoCompat.f3274y;
            shortcutInfoCompat2.f3264o = shortcutInfoCompat.f3264o;
            Person[] personArr = shortcutInfoCompat.f3260k;
            if (personArr != null) {
                shortcutInfoCompat2.f3260k = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (shortcutInfoCompat.f3261l != null) {
                shortcutInfoCompat2.f3261l = new HashSet(shortcutInfoCompat.f3261l);
            }
            PersistableBundle persistableBundle = shortcutInfoCompat.f3265p;
            if (persistableBundle != null) {
                shortcutInfoCompat2.f3265p = persistableBundle;
            }
            shortcutInfoCompat2.f3249A = shortcutInfoCompat.f3249A;
        }

        public C0962b(Context context, ShortcutInfo shortcutInfo) {
            String id2;
            String str;
            Intent[] intents;
            ComponentName activity;
            CharSequence shortLabel;
            CharSequence longLabel;
            CharSequence disabledMessage;
            boolean isEnabled;
            Set<String> categories;
            PersistableBundle extras;
            UserHandle userHandle;
            long lastChangedTimestamp;
            boolean isDynamic;
            boolean isPinned;
            boolean isDeclaredInManifest;
            boolean isImmutable;
            boolean isEnabled2;
            boolean hasKeyFieldsOnly;
            int rank;
            PersistableBundle extras2;
            boolean isCached;
            int disabledReason;
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f3276a = shortcutInfoCompat;
            shortcutInfoCompat.f3250a = context;
            id2 = shortcutInfo.getId();
            shortcutInfoCompat.f3251b = id2;
            str = shortcutInfo.getPackage();
            shortcutInfoCompat.f3252c = str;
            intents = shortcutInfo.getIntents();
            shortcutInfoCompat.f3253d = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            shortcutInfoCompat.f3254e = activity;
            shortLabel = shortcutInfo.getShortLabel();
            shortcutInfoCompat.f3255f = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            shortcutInfoCompat.f3256g = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            shortcutInfoCompat.f3257h = disabledMessage;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                shortcutInfoCompat.f3275z = disabledReason;
            } else {
                isEnabled = shortcutInfo.isEnabled();
                shortcutInfoCompat.f3275z = isEnabled ? 0 : 3;
            }
            categories = shortcutInfo.getCategories();
            shortcutInfoCompat.f3261l = categories;
            extras = shortcutInfo.getExtras();
            shortcutInfoCompat.f3260k = ShortcutInfoCompat.m38349m(extras);
            userHandle = shortcutInfo.getUserHandle();
            shortcutInfoCompat.f3267r = userHandle;
            lastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            shortcutInfoCompat.f3266q = lastChangedTimestamp;
            if (i >= 30) {
                isCached = shortcutInfo.isCached();
                shortcutInfoCompat.f3268s = isCached;
            }
            isDynamic = shortcutInfo.isDynamic();
            shortcutInfoCompat.f3269t = isDynamic;
            isPinned = shortcutInfo.isPinned();
            shortcutInfoCompat.f3270u = isPinned;
            isDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            shortcutInfoCompat.f3271v = isDeclaredInManifest;
            isImmutable = shortcutInfo.isImmutable();
            shortcutInfoCompat.f3272w = isImmutable;
            isEnabled2 = shortcutInfo.isEnabled();
            shortcutInfoCompat.f3273x = isEnabled2;
            hasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            shortcutInfoCompat.f3274y = hasKeyFieldsOnly;
            shortcutInfoCompat.f3262m = ShortcutInfoCompat.m38352j(shortcutInfo);
            rank = shortcutInfo.getRank();
            shortcutInfoCompat.f3264o = rank;
            extras2 = shortcutInfo.getExtras();
            shortcutInfoCompat.f3265p = extras2;
        }
    }
}