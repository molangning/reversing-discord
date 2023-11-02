package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class RemoteInput {

    /* renamed from: a */
    private final String f3183a;

    /* renamed from: b */
    private final CharSequence f3184b;

    /* renamed from: c */
    private final CharSequence[] f3185c;

    /* renamed from: d */
    private final boolean f3186d;

    /* renamed from: e */
    private final int f3187e;

    /* renamed from: f */
    private final Bundle f3188f;

    /* renamed from: g */
    private final Set<String> f3189g;

    /* renamed from: androidx.core.app.RemoteInput$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0757a {
        /* renamed from: a */
        static void m38713a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static android.app.RemoteInput m38712b(RemoteInput remoteInput) {
            Set<String> m38721e;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.m38716j()).setLabel(remoteInput.m38717i()).setChoices(remoteInput.m38720f()).setAllowFreeFormInput(remoteInput.m38722d()).addExtras(remoteInput.m38718h());
            if (Build.VERSION.SDK_INT >= 26 && (m38721e = remoteInput.m38721e()) != null) {
                for (String str : m38721e) {
                    C0758b.m38706d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C0759c.m38704b(addExtras, remoteInput.m38719g());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        static RemoteInput m38711c(Object obj) {
            Set<String> m38708b;
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            C0760d m38703a = new C0760d(remoteInput.getResultKey()).m38697g(remoteInput.getLabel()).m38699e(remoteInput.getChoices()).m38700d(remoteInput.getAllowFreeFormInput()).m38703a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (m38708b = C0758b.m38708b(remoteInput)) != null) {
                for (String str : m38708b) {
                    m38703a.m38701c(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                m38703a.m38698f(C0759c.m38705a(remoteInput));
            }
            return m38703a.m38702b();
        }

        /* renamed from: d */
        static Bundle m38710d(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0758b {
        /* renamed from: a */
        static void m38709a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.m38725a(remoteInput), intent, map);
        }

        /* renamed from: b */
        static Set<String> m38708b(Object obj) {
            Set<String> allowedDataTypes;
            allowedDataTypes = ((android.app.RemoteInput) obj).getAllowedDataTypes();
            return allowedDataTypes;
        }

        /* renamed from: c */
        static Map<String, Uri> m38707c(Intent intent, String str) {
            Map<String, Uri> dataResultsFromIntent;
            dataResultsFromIntent = android.app.RemoteInput.getDataResultsFromIntent(intent, str);
            return dataResultsFromIntent;
        }

        /* renamed from: d */
        static RemoteInput.Builder m38706d(RemoteInput.Builder builder, String str, boolean z) {
            RemoteInput.Builder allowDataType;
            allowDataType = builder.setAllowDataType(str, z);
            return allowDataType;
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0759c {
        /* renamed from: a */
        static int m38705a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        /* renamed from: b */
        static RemoteInput.Builder m38704b(RemoteInput.Builder builder, int i) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i);
            return editChoicesBeforeSending;
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0760d {

        /* renamed from: a */
        private final String f3190a;

        /* renamed from: d */
        private CharSequence f3193d;

        /* renamed from: e */
        private CharSequence[] f3194e;

        /* renamed from: b */
        private final Set<String> f3191b = new HashSet();

        /* renamed from: c */
        private final Bundle f3192c = new Bundle();

        /* renamed from: f */
        private boolean f3195f = true;

        /* renamed from: g */
        private int f3196g = 0;

        public C0760d(String str) {
            if (str != null) {
                this.f3190a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        /* renamed from: a */
        public C0760d m38703a(Bundle bundle) {
            if (bundle != null) {
                this.f3192c.putAll(bundle);
            }
            return this;
        }

        /* renamed from: b */
        public RemoteInput m38702b() {
            return new RemoteInput(this.f3190a, this.f3193d, this.f3194e, this.f3195f, this.f3196g, this.f3192c, this.f3191b);
        }

        /* renamed from: c */
        public C0760d m38701c(String str, boolean z) {
            if (z) {
                this.f3191b.add(str);
            } else {
                this.f3191b.remove(str);
            }
            return this;
        }

        /* renamed from: d */
        public C0760d m38700d(boolean z) {
            this.f3195f = z;
            return this;
        }

        /* renamed from: e */
        public C0760d m38699e(CharSequence[] charSequenceArr) {
            this.f3194e = charSequenceArr;
            return this;
        }

        /* renamed from: f */
        public C0760d m38698f(int i) {
            this.f3196g = i;
            return this;
        }

        /* renamed from: g */
        public C0760d m38697g(CharSequence charSequence) {
            this.f3193d = charSequence;
            return this;
        }
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f3183a = str;
        this.f3184b = charSequence;
        this.f3185c = charSequenceArr;
        this.f3186d = z;
        this.f3187e = i;
        this.f3188f = bundle;
        this.f3189g = set;
        if (m38719g() == 2 && !m38722d()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    static android.app.RemoteInput m38725a(RemoteInput remoteInput) {
        return C0757a.m38712b(remoteInput);
    }

    /* renamed from: b */
    public static android.app.RemoteInput[] m38724b(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = m38725a(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    /* renamed from: c */
    public static RemoteInput m38723c(android.app.RemoteInput remoteInput) {
        return C0757a.m38711c(remoteInput);
    }

    /* renamed from: k */
    public static Bundle m38715k(Intent intent) {
        return C0757a.m38710d(intent);
    }

    /* renamed from: d */
    public boolean m38722d() {
        return this.f3186d;
    }

    /* renamed from: e */
    public Set<String> m38721e() {
        return this.f3189g;
    }

    /* renamed from: f */
    public CharSequence[] m38720f() {
        return this.f3185c;
    }

    /* renamed from: g */
    public int m38719g() {
        return this.f3187e;
    }

    /* renamed from: h */
    public Bundle m38718h() {
        return this.f3188f;
    }

    /* renamed from: i */
    public CharSequence m38717i() {
        return this.f3184b;
    }

    /* renamed from: j */
    public String m38716j() {
        return this.f3183a;
    }

    /* renamed from: l */
    public boolean m38714l() {
        if (!m38722d() && ((m38720f() == null || m38720f().length == 0) && m38721e() != null && !m38721e().isEmpty())) {
            return true;
        }
        return false;
    }
}