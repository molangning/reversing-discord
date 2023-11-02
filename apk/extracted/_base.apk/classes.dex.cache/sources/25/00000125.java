package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.C0794e;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f789a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f790b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f791c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0266d> f792d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f793e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0265c<?>> f794f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f795g = new HashMap();

    /* renamed from: h */
    final Bundle f796h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0263a<I> extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ String f801a;

        /* renamed from: b */
        final /* synthetic */ ActivityResultContract f802b;

        C0263a(String str, ActivityResultContract activityResultContract) {
            ActivityResultRegistry.this = r1;
            this.f801a = str;
            this.f802b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: b */
        public void mo36537b(I i, C0794e c0794e) {
            Integer num = ActivityResultRegistry.this.f791c.get(this.f801a);
            if (num != null) {
                ActivityResultRegistry.this.f793e.add(this.f801a);
                try {
                    ActivityResultRegistry.this.mo40803f(num.intValue(), this.f802b, i, c0794e);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f793e.remove(this.f801a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f802b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: c */
        public void mo36536c() {
            ActivityResultRegistry.this.m40797l(this.f801a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0264b<I> extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ String f804a;

        /* renamed from: b */
        final /* synthetic */ ActivityResultContract f805b;

        C0264b(String str, ActivityResultContract activityResultContract) {
            ActivityResultRegistry.this = r1;
            this.f804a = str;
            this.f805b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: b */
        public void mo36537b(I i, C0794e c0794e) {
            Integer num = ActivityResultRegistry.this.f791c.get(this.f804a);
            if (num != null) {
                ActivityResultRegistry.this.f793e.add(this.f804a);
                try {
                    ActivityResultRegistry.this.mo40803f(num.intValue(), this.f805b, i, c0794e);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f793e.remove(this.f804a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f805b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: c */
        public void mo36536c() {
            ActivityResultRegistry.this.m40797l(this.f804a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0265c<O> {

        /* renamed from: a */
        final ActivityResultCallback<O> f807a;

        /* renamed from: b */
        final ActivityResultContract<?, O> f808b;

        C0265c(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.f807a = activityResultCallback;
            this.f808b = activityResultContract;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0266d {

        /* renamed from: a */
        final Lifecycle f809a;

        /* renamed from: b */
        private final ArrayList<InterfaceC1695l> f810b = new ArrayList<>();

        C0266d(Lifecycle lifecycle) {
            this.f809a = lifecycle;
        }

        /* renamed from: a */
        void m40796a(InterfaceC1695l interfaceC1695l) {
            this.f809a.mo36125a(interfaceC1695l);
            this.f810b.add(interfaceC1695l);
        }

        /* renamed from: b */
        void m40795b() {
            Iterator<InterfaceC1695l> it = this.f810b.iterator();
            while (it.hasNext()) {
                this.f809a.mo36123c(it.next());
            }
            this.f810b.clear();
        }
    }

    /* renamed from: a */
    private void m40808a(int i, String str) {
        this.f790b.put(Integer.valueOf(i), str);
        this.f791c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private <O> void m40805d(String str, int i, Intent intent, C0265c<O> c0265c) {
        if (c0265c != null && c0265c.f807a != null && this.f793e.contains(str)) {
            c0265c.f807a.mo36369a(c0265c.f808b.mo33577c(i, intent));
            this.f793e.remove(str);
            return;
        }
        this.f795g.remove(str);
        this.f796h.putParcelable(str, new C0267a(i, intent));
    }

    /* renamed from: e */
    private int m40804e() {
        int nextInt = this.f789a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.f790b.containsKey(Integer.valueOf(i))) {
                nextInt = this.f789a.nextInt(2147418112);
            } else {
                return i;
            }
        }
    }

    /* renamed from: k */
    private void m40798k(String str) {
        if (this.f791c.get(str) != null) {
            return;
        }
        m40808a(m40804e(), str);
    }

    /* renamed from: b */
    public final boolean m40807b(int i, int i2, Intent intent) {
        String str = this.f790b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m40805d(str, i2, intent, this.f794f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m40806c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f790b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0265c<?> c0265c = this.f794f.get(str);
        if (c0265c != null && (activityResultCallback = c0265c.f807a) != null) {
            if (this.f793e.remove(str)) {
                activityResultCallback.mo36369a(o);
                return true;
            }
            return true;
        }
        this.f796h.remove(str);
        this.f795g.put(str, o);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo40803f(int i, ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i2, C0794e c0794e);

    /* renamed from: g */
    public final void m40802g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.f793e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.f789a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.f796h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (this.f791c.containsKey(str)) {
                    Integer remove = this.f791c.remove(str);
                    if (!this.f796h.containsKey(str)) {
                        this.f790b.remove(remove);
                    }
                }
                m40808a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    /* renamed from: h */
    public final void m40801h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f791c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f791c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f793e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f796h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f789a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <I, O> ActivityResultLauncher<I> m40800i(String str, ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        m40798k(str);
        this.f794f.put(str, new C0265c<>(activityResultCallback, activityResultContract));
        if (this.f795g.containsKey(str)) {
            Object obj = this.f795g.get(str);
            this.f795g.remove(str);
            activityResultCallback.mo36369a(obj);
        }
        C0267a c0267a = (C0267a) this.f796h.getParcelable(str);
        if (c0267a != null) {
            this.f796h.remove(str);
            activityResultCallback.mo36369a(activityResultContract.mo33577c(c0267a.m40793b(), c0267a.m40794a()));
        }
        return new C0264b(str, activityResultContract);
    }

    /* renamed from: j */
    public final <I, O> ActivityResultLauncher<I> m40799j(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> activityResultContract, final ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.mo36124b().m36132a(Lifecycle.State.STARTED)) {
            m40798k(str);
            C0266d c0266d = this.f792d.get(str);
            if (c0266d == null) {
                c0266d = new C0266d(lifecycle);
            }
            c0266d.m40796a(new InterfaceC1695l() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.InterfaceC1695l
                /* renamed from: a */
                public void mo11423a(LifecycleOwner lifecycleOwner2, Lifecycle.EnumC1651b enumC1651b) {
                    if (Lifecycle.EnumC1651b.ON_START.equals(enumC1651b)) {
                        ActivityResultRegistry.this.f794f.put(str, new C0265c<>(activityResultCallback, activityResultContract));
                        if (ActivityResultRegistry.this.f795g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f795g.get(str);
                            ActivityResultRegistry.this.f795g.remove(str);
                            activityResultCallback.mo36369a(obj);
                        }
                        C0267a c0267a = (C0267a) ActivityResultRegistry.this.f796h.getParcelable(str);
                        if (c0267a != null) {
                            ActivityResultRegistry.this.f796h.remove(str);
                            activityResultCallback.mo36369a(activityResultContract.mo33577c(c0267a.m40793b(), c0267a.m40794a()));
                        }
                    } else if (Lifecycle.EnumC1651b.ON_STOP.equals(enumC1651b)) {
                        ActivityResultRegistry.this.f794f.remove(str);
                    } else if (Lifecycle.EnumC1651b.ON_DESTROY.equals(enumC1651b)) {
                        ActivityResultRegistry.this.m40797l(str);
                    }
                }
            });
            this.f792d.put(str, c0266d);
            return new C0263a(str, activityResultContract);
        }
        throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.mo36124b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: l */
    final void m40797l(String str) {
        Integer remove;
        if (!this.f793e.contains(str) && (remove = this.f791c.remove(str)) != null) {
            this.f790b.remove(remove);
        }
        this.f794f.remove(str);
        if (this.f795g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f795g.get(str));
            this.f795g.remove(str);
        }
        if (this.f796h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f796h.getParcelable(str));
            this.f796h.remove(str);
        }
        C0266d c0266d = this.f792d.get(str);
        if (c0266d != null) {
            c0266d.m40795b();
            this.f792d.remove(str);
        }
    }
}