package p420x8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p134ha.InterfaceC7043a;
import p134ha.InterfaceC7046d;
import p134ha.InterfaceC7050h;
import p339s9.C12437a;

/* renamed from: x8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13739c {

    /* renamed from: h */
    private static int f35457h;

    /* renamed from: i */
    private static PendingIntent f35458i;

    /* renamed from: j */
    private static final Executor f35459j = new Executor() { // from class: x8.d0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k */
    private static final Pattern f35460k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f35462b;

    /* renamed from: c */
    private final C13762x f35463c;

    /* renamed from: d */
    private final ScheduledExecutorService f35464d;

    /* renamed from: f */
    private Messenger f35466f;

    /* renamed from: g */
    private C13746h f35467g;

    /* renamed from: a */
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> f35461a = new SimpleArrayMap<>();

    /* renamed from: e */
    private Messenger f35465e = new Messenger(new HandlerC13743e(this, Looper.getMainLooper()));

    public C13739c(Context context) {
        this.f35462b = context;
        this.f35463c = new C13762x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f35464d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static /* synthetic */ Task m1605b(Bundle bundle) {
        if (m1597j(bundle)) {
            return C4713b.m28004e(null);
        }
        return C4713b.m28004e(bundle);
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m1603d(C13739c c13739c, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C13745g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C13746h) {
                        c13739c.f35467g = (C13746h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c13739c.f35466f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            str4 = "Unexpected response action: ".concat(valueOf);
                        } else {
                            str4 = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", str4);
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                        sb2.append("Unexpected response, no error or registration id ");
                        sb2.append(valueOf2);
                        Log.w("Rpc", sb2.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra2.length() != 0) {
                            str3 = "Received InstanceID error ".concat(stringExtra2);
                        } else {
                            str3 = new String("Received InstanceID error ");
                        }
                        Log.d("Rpc", str3);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            c13739c.m1598i(str5, intent2.putExtra("error", str6).getExtras());
                            return;
                        }
                        if (stringExtra2.length() != 0) {
                            str2 = "Unexpected structured response ".concat(stringExtra2);
                        } else {
                            str2 = new String("Unexpected structured response ");
                        }
                        Log.w("Rpc", str2);
                        return;
                    }
                    synchronized (c13739c.f35461a) {
                        for (int i = 0; i < c13739c.f35461a.size(); i++) {
                            c13739c.m1598i(c13739c.f35461a.m39525j(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f35460k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c13739c.m1598i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final Task<Bundle> m1601f(Bundle bundle) {
        final String m1600g = m1600g();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f35461a) {
            this.f35461a.put(m1600g, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f35463c.m1574b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m1599h(this.f35462b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m1600g).length() + 5);
        sb2.append("|ID|");
        sb2.append(m1600g);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f35465e);
        if (this.f35466f != null || this.f35467g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f35466f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f35467g.m1595b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f35464d.schedule(new Runnable() { // from class: x8.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.m28010d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.m28013a().mo27981c(f35459j, new InterfaceC7046d() { // from class: x8.a0
                @Override // p134ha.InterfaceC7046d
                /* renamed from: a */
                public final void mo1614a(Task task) {
                    C13739c.this.m1602e(m1600g, schedule, task);
                }
            });
            return taskCompletionSource.m28013a();
        }
        if (this.f35463c.m1574b() == 2) {
            this.f35462b.sendBroadcast(intent);
        } else {
            this.f35462b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f35464d.schedule(new Runnable() { // from class: x8.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.m28010d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.m28013a().mo27981c(f35459j, new InterfaceC7046d() { // from class: x8.a0
            @Override // p134ha.InterfaceC7046d
            /* renamed from: a */
            public final void mo1614a(Task task) {
                C13739c.this.m1602e(m1600g, schedule2, task);
            }
        });
        return taskCompletionSource.m28013a();
    }

    /* renamed from: g */
    private static synchronized String m1600g() {
        String num;
        synchronized (C13739c.class) {
            int i = f35457h;
            f35457h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m1599h(Context context, Intent intent) {
        synchronized (C13739c.class) {
            if (f35458i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f35458i = C12437a.m5280a(context, 0, intent2, C12437a.f32375a);
            }
            intent.putExtra("app", f35458i);
        }
    }

    /* renamed from: i */
    private final void m1598i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f35461a) {
            TaskCompletionSource<Bundle> remove = this.f35461a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.m28011c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m1597j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Task<Bundle> m1606a(final Bundle bundle) {
        if (this.f35463c.m1575a() < 12000000) {
            if (this.f35463c.m1574b() != 0) {
                return m1601f(bundle).mo27975i(f35459j, new InterfaceC7043a() { // from class: x8.y
                    @Override // p134ha.InterfaceC7043a
                    /* renamed from: a */
                    public final Object mo1573a(Task task) {
                        return C13739c.this.m1604c(bundle, task);
                    }
                });
            }
            return C4713b.m28005d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C13761w.m1581b(this.f35462b).m1579d(1, bundle).mo27976h(f35459j, new InterfaceC7043a() { // from class: x8.z
            @Override // p134ha.InterfaceC7043a
            /* renamed from: a */
            public final Object mo1573a(Task task) {
                if (task.mo27969o()) {
                    return (Bundle) task.mo27973k();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(task.mo27974j());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(valueOf);
                    Log.d("Rpc", sb2.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.mo27974j());
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ Task m1604c(Bundle bundle, Task task) {
        if (!task.mo27969o()) {
            return task;
        }
        if (!m1597j((Bundle) task.mo27973k())) {
            return task;
        }
        return m1601f(bundle).mo27968p(f35459j, new InterfaceC7050h() { // from class: x8.b0
            @Override // p134ha.InterfaceC7050h
            /* renamed from: a */
            public final Task mo1607a(Object obj) {
                return C13739c.m1605b((Bundle) obj);
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ void m1602e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f35461a) {
            this.f35461a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}