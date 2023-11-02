package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.C1138f;
import androidx.core.util.InterfaceC1139g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ContentInfoCompat {

    /* renamed from: a */
    private final InterfaceC1146f f3512a;

    /* renamed from: androidx.core.view.ContentInfoCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1143c {
        /* renamed from: a */
        void mo37797a(Uri uri);

        /* renamed from: b */
        void mo37796b(ClipData clipData);

        ContentInfoCompat build();

        /* renamed from: c */
        void mo37795c(int i);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1145e implements InterfaceC1146f {

        /* renamed from: a */
        private final ContentInfo f3520a;

        C1145e(ContentInfo contentInfo) {
            this.f3520a = (ContentInfo) C1138f.m37824f(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f3520a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: j */
        public int mo37794j() {
            int source;
            source = this.f3520a.getSource();
            return source;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: k */
        public Uri mo37793k() {
            Uri linkUri;
            linkUri = this.f3520a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: l */
        public ContentInfo mo37792l() {
            return this.f3520a;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: m */
        public ClipData mo37791m() {
            ClipData clip;
            clip = this.f3520a.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: n */
        public int mo37790n() {
            int flags;
            flags = this.f3520a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3520a + "}";
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1146f {
        Bundle getExtras();

        /* renamed from: j */
        int mo37794j();

        /* renamed from: k */
        Uri mo37793k();

        /* renamed from: l */
        ContentInfo mo37792l();

        /* renamed from: m */
        ClipData mo37791m();

        /* renamed from: n */
        int mo37790n();
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C1147g implements InterfaceC1146f {

        /* renamed from: a */
        private final ClipData f3521a;

        /* renamed from: b */
        private final int f3522b;

        /* renamed from: c */
        private final int f3523c;

        /* renamed from: d */
        private final Uri f3524d;

        /* renamed from: e */
        private final Bundle f3525e;

        C1147g(C1144d c1144d) {
            this.f3521a = (ClipData) C1138f.m37824f(c1144d.f3515a);
            this.f3522b = C1138f.m37828b(c1144d.f3516b, 0, 5, "source");
            this.f3523c = C1138f.m37825e(c1144d.f3517c, 1);
            this.f3524d = c1144d.f3518d;
            this.f3525e = c1144d.f3519e;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        public Bundle getExtras() {
            return this.f3525e;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: j */
        public int mo37794j() {
            return this.f3522b;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: k */
        public Uri mo37793k() {
            return this.f3524d;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: l */
        public ContentInfo mo37792l() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: m */
        public ClipData mo37791m() {
            return this.f3521a;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1146f
        /* renamed from: n */
        public int mo37790n() {
            return this.f3523c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3521a.getDescription());
            sb2.append(", source=");
            sb2.append(ContentInfoCompat.m37805j(this.f3522b));
            sb2.append(", flags=");
            sb2.append(ContentInfoCompat.m37813b(this.f3523c));
            String str2 = "";
            if (this.f3524d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f3524d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f3525e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    ContentInfoCompat(InterfaceC1146f interfaceC1146f) {
        this.f3512a = interfaceC1146f;
    }

    /* renamed from: a */
    static ClipData m37814a(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    /* renamed from: b */
    static String m37813b(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    /* renamed from: h */
    static Pair<ClipData, ClipData> m37807h(ClipData clipData, InterfaceC1139g<ClipData.Item> interfaceC1139g) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (interfaceC1139g.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(m37814a(clipData.getDescription(), arrayList), m37814a(clipData.getDescription(), arrayList2));
    }

    /* renamed from: j */
    static String m37805j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: l */
    public static ContentInfoCompat m37803l(ContentInfo contentInfo) {
        return new ContentInfoCompat(new C1145e(contentInfo));
    }

    /* renamed from: c */
    public ClipData m37812c() {
        return this.f3512a.mo37791m();
    }

    /* renamed from: d */
    public Bundle m37811d() {
        return this.f3512a.getExtras();
    }

    /* renamed from: e */
    public int m37810e() {
        return this.f3512a.mo37790n();
    }

    /* renamed from: f */
    public Uri m37809f() {
        return this.f3512a.mo37793k();
    }

    /* renamed from: g */
    public int m37808g() {
        return this.f3512a.mo37794j();
    }

    /* renamed from: i */
    public Pair<ContentInfoCompat, ContentInfoCompat> m37806i(InterfaceC1139g<ClipData.Item> interfaceC1139g) {
        ContentInfoCompat contentInfoCompat;
        ClipData mo37791m = this.f3512a.mo37791m();
        ContentInfoCompat contentInfoCompat2 = null;
        if (mo37791m.getItemCount() == 1) {
            boolean test = interfaceC1139g.test(mo37791m.getItemAt(0));
            if (test) {
                contentInfoCompat = this;
            } else {
                contentInfoCompat = null;
            }
            if (!test) {
                contentInfoCompat2 = this;
            }
            return Pair.create(contentInfoCompat, contentInfoCompat2);
        }
        Pair<ClipData, ClipData> m37807h = m37807h(mo37791m, interfaceC1139g);
        if (m37807h.first == null) {
            return Pair.create(null, this);
        }
        if (m37807h.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new C1141a(this).m37801b((ClipData) m37807h.first).m37802a(), new C1141a(this).m37801b((ClipData) m37807h.second).m37802a());
    }

    /* renamed from: k */
    public ContentInfo m37804k() {
        ContentInfo mo37792l = this.f3512a.mo37792l();
        Objects.requireNonNull(mo37792l);
        return mo37792l;
    }

    public String toString() {
        return this.f3512a.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.ContentInfoCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1142b implements InterfaceC1143c {

        /* renamed from: a */
        private final ContentInfo.Builder f3514a;

        C1142b(ClipData clipData, int i) {
            this.f3514a = new ContentInfo.Builder(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        /* renamed from: a */
        public void mo37797a(Uri uri) {
            this.f3514a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        /* renamed from: b */
        public void mo37796b(ClipData clipData) {
            this.f3514a.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        public ContentInfoCompat build() {
            ContentInfo build;
            build = this.f3514a.build();
            return new ContentInfoCompat(new C1145e(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        /* renamed from: c */
        public void mo37795c(int i) {
            this.f3514a.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        public void setExtras(Bundle bundle) {
            this.f3514a.setExtras(bundle);
        }

        C1142b(ContentInfoCompat contentInfoCompat) {
            this.f3514a = new ContentInfo.Builder(contentInfoCompat.m37804k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.ContentInfoCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1144d implements InterfaceC1143c {

        /* renamed from: a */
        ClipData f3515a;

        /* renamed from: b */
        int f3516b;

        /* renamed from: c */
        int f3517c;

        /* renamed from: d */
        Uri f3518d;

        /* renamed from: e */
        Bundle f3519e;

        C1144d(ClipData clipData, int i) {
            this.f3515a = clipData;
            this.f3516b = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        /* renamed from: a */
        public void mo37797a(Uri uri) {
            this.f3518d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        /* renamed from: b */
        public void mo37796b(ClipData clipData) {
            this.f3515a = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new C1147g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        /* renamed from: c */
        public void mo37795c(int i) {
            this.f3517c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC1143c
        public void setExtras(Bundle bundle) {
            this.f3519e = bundle;
        }

        C1144d(ContentInfoCompat contentInfoCompat) {
            this.f3515a = contentInfoCompat.m37812c();
            this.f3516b = contentInfoCompat.m37808g();
            this.f3517c = contentInfoCompat.m37810e();
            this.f3518d = contentInfoCompat.m37809f();
            this.f3519e = contentInfoCompat.m37811d();
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1141a {

        /* renamed from: a */
        private final InterfaceC1143c f3513a;

        public C1141a(ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3513a = new C1142b(contentInfoCompat);
            } else {
                this.f3513a = new C1144d(contentInfoCompat);
            }
        }

        /* renamed from: a */
        public ContentInfoCompat m37802a() {
            return this.f3513a.build();
        }

        /* renamed from: b */
        public C1141a m37801b(ClipData clipData) {
            this.f3513a.mo37796b(clipData);
            return this;
        }

        /* renamed from: c */
        public C1141a m37800c(Bundle bundle) {
            this.f3513a.setExtras(bundle);
            return this;
        }

        /* renamed from: d */
        public C1141a m37799d(int i) {
            this.f3513a.mo37795c(i);
            return this;
        }

        /* renamed from: e */
        public C1141a m37798e(Uri uri) {
            this.f3513a.mo37797a(uri);
            return this;
        }

        public C1141a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3513a = new C1142b(clipData, i);
            } else {
                this.f3513a = new C1144d(clipData, i);
            }
        }
    }
}