package p032c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.C0946a;
import gg.C6759j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9538f;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11888u;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, m14357d2 = {"Lc/a;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$a;", "", "resultCode", "intent", "f", "<init>", "()V", "a", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
/* renamed from: c.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2372a extends ActivityResultContract<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C2373a f6492a = new C2373a(null);

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m14357d2 = {"Lc/a$a;", "", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
    /* renamed from: c.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2373a {
        private C2373a() {
        }

        public /* synthetic */ C2373a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m33579a(String[] input) {
            C9612q.m13917h(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            C9612q.m13918g(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: d */
    public Intent mo33578a(Context context, String[] input) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(input, "input");
        return f6492a.m33579a(input);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: e */
    public ActivityResultContract.C0273a<Map<String, Boolean>> mo33583b(Context context, String[] input) {
        boolean z;
        int m6758d;
        int m21930c;
        boolean z2;
        Map m6754h;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(input, "input");
        boolean z3 = true;
        if (input.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m6754h = C11889v.m6754h();
            return new ActivityResultContract.C0273a<>(m6754h);
        }
        int length = input.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C0946a.m38403a(context, input[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (z3) {
            m6758d = C11888u.m6758d(input.length);
            m21930c = C6759j.m21930c(m6758d, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
            for (String str : input) {
                Pair m7577a = C11591x.m7577a(str, Boolean.TRUE);
                linkedHashMap.put(m7577a.m14349c(), m7577a.m14348d());
            }
            return new ActivityResultContract.C0273a<>(linkedHashMap);
        }
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: f */
    public Map<String, Boolean> mo33577c(int i, Intent intent) {
        Map<String, Boolean> m6754h;
        List m14253B;
        List m14067J0;
        Map<String, Boolean> m6744r;
        boolean z;
        Map<String, Boolean> m6754h2;
        Map<String, Boolean> m6754h3;
        if (i != -1) {
            m6754h3 = C11889v.m6754h();
            return m6754h3;
        } else if (intent == null) {
            m6754h2 = C11889v.m6754h();
            return m6754h2;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                m14253B = C9538f.m14253B(stringArrayExtra);
                m14067J0 = C9553r.m14067J0(m14253B, arrayList);
                m6744r = C11889v.m6744r(m14067J0);
                return m6744r;
            }
            m6754h = C11889v.m6754h();
            return m6754h;
        }
    }
}
