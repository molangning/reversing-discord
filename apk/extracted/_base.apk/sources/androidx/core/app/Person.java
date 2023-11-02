package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Person {

    /* renamed from: a */
    CharSequence f3165a;

    /* renamed from: b */
    IconCompat f3166b;

    /* renamed from: c */
    String f3167c;

    /* renamed from: d */
    String f3168d;

    /* renamed from: e */
    boolean f3169e;

    /* renamed from: f */
    boolean f3170f;

    /* renamed from: androidx.core.app.Person$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0754a {
        /* renamed from: a */
        static Person m38736a(PersistableBundle persistableBundle) {
            return new C0756c().m38727f(persistableBundle.getString(ZeroconfModule.KEY_SERVICE_NAME)).m38726g(persistableBundle.getString("uri")).m38728e(persistableBundle.getString("key")).m38731b(persistableBundle.getBoolean("isBot")).m38729d(persistableBundle.getBoolean("isImportant")).m38732a();
        }

        /* renamed from: b */
        static PersistableBundle m38735b(Person person) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f3165a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString(ZeroconfModule.KEY_SERVICE_NAME, str);
            persistableBundle.putString("uri", person.f3167c);
            persistableBundle.putString("key", person.f3168d);
            persistableBundle.putBoolean("isBot", person.f3169e);
            persistableBundle.putBoolean("isImportant", person.f3170f);
            return persistableBundle;
        }
    }

    /* renamed from: androidx.core.app.Person$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0755b {
        /* renamed from: a */
        static Person m38734a(android.app.Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            C0756c c0756c = new C0756c();
            name = person.getName();
            C0756c m38727f = c0756c.m38727f(name);
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.m38135c(icon2);
            } else {
                iconCompat = null;
            }
            C0756c m38730c = m38727f.m38730c(iconCompat);
            uri = person.getUri();
            C0756c m38726g = m38730c.m38726g(uri);
            key = person.getKey();
            C0756c m38728e = m38726g.m38728e(key);
            isBot = person.isBot();
            C0756c m38731b = m38728e.m38731b(isBot);
            isImportant = person.isImportant();
            return m38731b.m38729d(isImportant).m38732a();
        }

        /* renamed from: b */
        static android.app.Person m38733b(Person person) {
            Person.Builder name;
            Icon icon;
            Person.Builder icon2;
            Person.Builder uri;
            Person.Builder key;
            Person.Builder bot;
            Person.Builder important;
            android.app.Person build;
            name = new Person.Builder().setName(person.m38744f());
            if (person.m38746d() != null) {
                icon = person.m38746d().m38113y();
            } else {
                icon = null;
            }
            icon2 = name.setIcon(icon);
            uri = icon2.setUri(person.m38743g());
            key = uri.setKey(person.m38745e());
            bot = key.setBot(person.m38742h());
            important = bot.setImportant(person.m38741i());
            build = important.build();
            return build;
        }
    }

    /* renamed from: androidx.core.app.Person$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0756c {

        /* renamed from: a */
        CharSequence f3171a;

        /* renamed from: b */
        IconCompat f3172b;

        /* renamed from: c */
        String f3173c;

        /* renamed from: d */
        String f3174d;

        /* renamed from: e */
        boolean f3175e;

        /* renamed from: f */
        boolean f3176f;

        /* renamed from: a */
        public Person m38732a() {
            return new Person(this);
        }

        /* renamed from: b */
        public C0756c m38731b(boolean z) {
            this.f3175e = z;
            return this;
        }

        /* renamed from: c */
        public C0756c m38730c(IconCompat iconCompat) {
            this.f3172b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C0756c m38729d(boolean z) {
            this.f3176f = z;
            return this;
        }

        /* renamed from: e */
        public C0756c m38728e(String str) {
            this.f3174d = str;
            return this;
        }

        /* renamed from: f */
        public C0756c m38727f(CharSequence charSequence) {
            this.f3171a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C0756c m38726g(String str) {
            this.f3173c = str;
            return this;
        }
    }

    Person(C0756c c0756c) {
        this.f3165a = c0756c.f3171a;
        this.f3166b = c0756c.f3172b;
        this.f3167c = c0756c.f3173c;
        this.f3168d = c0756c.f3174d;
        this.f3169e = c0756c.f3175e;
        this.f3170f = c0756c.f3176f;
    }

    /* renamed from: a */
    public static Person m38749a(android.app.Person person) {
        return C0755b.m38734a(person);
    }

    /* renamed from: b */
    public static Person m38748b(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        C0756c m38727f = new C0756c().m38727f(bundle.getCharSequence(ZeroconfModule.KEY_SERVICE_NAME));
        if (bundle2 != null) {
            iconCompat = IconCompat.m38136b(bundle2);
        } else {
            iconCompat = null;
        }
        return m38727f.m38730c(iconCompat).m38726g(bundle.getString("uri")).m38728e(bundle.getString("key")).m38731b(bundle.getBoolean("isBot")).m38729d(bundle.getBoolean("isImportant")).m38732a();
    }

    /* renamed from: c */
    public static Person m38747c(PersistableBundle persistableBundle) {
        return C0754a.m38736a(persistableBundle);
    }

    /* renamed from: d */
    public IconCompat m38746d() {
        return this.f3166b;
    }

    /* renamed from: e */
    public String m38745e() {
        return this.f3168d;
    }

    /* renamed from: f */
    public CharSequence m38744f() {
        return this.f3165a;
    }

    /* renamed from: g */
    public String m38743g() {
        return this.f3167c;
    }

    /* renamed from: h */
    public boolean m38742h() {
        return this.f3169e;
    }

    /* renamed from: i */
    public boolean m38741i() {
        return this.f3170f;
    }

    /* renamed from: j */
    public String m38740j() {
        String str = this.f3167c;
        if (str != null) {
            return str;
        }
        if (this.f3165a != null) {
            return "name:" + ((Object) this.f3165a);
        }
        return "";
    }

    /* renamed from: k */
    public android.app.Person m38739k() {
        return C0755b.m38733b(this);
    }

    /* renamed from: l */
    public Bundle m38738l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(ZeroconfModule.KEY_SERVICE_NAME, this.f3165a);
        IconCompat iconCompat = this.f3166b;
        if (iconCompat != null) {
            bundle = iconCompat.m38114x();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f3167c);
        bundle2.putString("key", this.f3168d);
        bundle2.putBoolean("isBot", this.f3169e);
        bundle2.putBoolean("isImportant", this.f3170f);
        return bundle2;
    }

    /* renamed from: m */
    public PersistableBundle m38737m() {
        return C0754a.m38735b(this);
    }
}
