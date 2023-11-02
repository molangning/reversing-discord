package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0946a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* renamed from: j */
    private final ArrayList<Intent> f3198j = new ArrayList<>();

    /* renamed from: k */
    private final Context f3199k;

    /* renamed from: androidx.core.app.TaskStackBuilder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0762a {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context context) {
        this.f3199k = context;
    }

    /* renamed from: h */
    public static TaskStackBuilder m38685h(Context context) {
        return new TaskStackBuilder(context);
    }

    /* renamed from: a */
    public TaskStackBuilder m38688a(Intent intent) {
        this.f3198j.add(intent);
        return this;
    }

    /* renamed from: d */
    public TaskStackBuilder m38687d(Activity activity) {
        Intent intent;
        if (activity instanceof InterfaceC0762a) {
            intent = ((InterfaceC0762a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C0857n.m38555a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f3199k.getPackageManager());
            }
            m38686e(component);
            m38688a(intent);
        }
        return this;
    }

    /* renamed from: e */
    public TaskStackBuilder m38686e(ComponentName componentName) {
        int size = this.f3198j.size();
        try {
            Intent m38554b = C0857n.m38554b(this.f3199k, componentName);
            while (m38554b != null) {
                this.f3198j.add(size, m38554b);
                m38554b = C0857n.m38554b(this.f3199k, m38554b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: i */
    public void m38684i() {
        m38683k(null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3198j.iterator();
    }

    /* renamed from: k */
    public void m38683k(Bundle bundle) {
        if (!this.f3198j.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3198j.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0946a.m38394j(this.f3199k, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3199k.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
