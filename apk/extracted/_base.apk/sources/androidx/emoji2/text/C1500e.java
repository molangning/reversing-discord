package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C0626b;
import androidx.core.util.C1138f;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1500e {

    /* renamed from: n */
    private static final Object f3903n = new Object();

    /* renamed from: o */
    private static final Object f3904o = new Object();

    /* renamed from: p */
    private static volatile C1500e f3905p;

    /* renamed from: b */
    private final Set<AbstractC1506e> f3907b;

    /* renamed from: e */
    private final C1503b f3910e;

    /* renamed from: f */
    final InterfaceC1508g f3911f;

    /* renamed from: g */
    final boolean f3912g;

    /* renamed from: h */
    final boolean f3913h;

    /* renamed from: i */
    final int[] f3914i;

    /* renamed from: j */
    private final boolean f3915j;

    /* renamed from: k */
    private final int f3916k;

    /* renamed from: l */
    private final int f3917l;

    /* renamed from: m */
    private final InterfaceC1505d f3918m;

    /* renamed from: a */
    private final ReadWriteLock f3906a = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile int f3908c = 3;

    /* renamed from: d */
    private final Handler f3909d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C1501a extends C1503b {

        /* renamed from: b */
        private volatile C1513h f3919b;

        /* renamed from: c */
        private volatile C1525m f3920c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1502a extends AbstractC1509h {
            C1502a() {
            }

            @Override // androidx.emoji2.text.C1500e.AbstractC1509h
            /* renamed from: a */
            public void mo36628a(Throwable th2) {
                C1501a.this.f3922a.m36645m(th2);
            }

            @Override // androidx.emoji2.text.C1500e.AbstractC1509h
            /* renamed from: b */
            public void mo36627b(C1525m c1525m) {
                C1501a.this.m36636d(c1525m);
            }
        }

        C1501a(C1500e c1500e) {
            super(c1500e);
        }

        @Override // androidx.emoji2.text.C1500e.C1503b
        /* renamed from: a */
        void mo36635a() {
            try {
                this.f3922a.f3911f.mo36590a(new C1502a());
            } catch (Throwable th2) {
                this.f3922a.m36645m(th2);
            }
        }

        @Override // androidx.emoji2.text.C1500e.C1503b
        /* renamed from: b */
        CharSequence mo36634b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3919b.m36607h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.C1500e.C1503b
        /* renamed from: c */
        void mo36633c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3920c.m36572e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3922a.f3912g);
        }

        /* renamed from: d */
        void m36636d(C1525m c1525m) {
            if (c1525m == null) {
                this.f3922a.m36645m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3920c = c1525m;
            C1525m c1525m2 = this.f3920c;
            C1510i c1510i = new C1510i();
            InterfaceC1505d interfaceC1505d = this.f3922a.f3918m;
            C1500e c1500e = this.f3922a;
            this.f3919b = new C1513h(c1525m2, c1510i, interfaceC1505d, c1500e.f3913h, c1500e.f3914i);
            this.f3922a.m36644n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1503b {

        /* renamed from: a */
        final C1500e f3922a;

        C1503b(C1500e c1500e) {
            this.f3922a = c1500e;
        }

        /* renamed from: a */
        void mo36635a() {
            throw null;
        }

        /* renamed from: b */
        CharSequence mo36634b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* renamed from: c */
        void mo36633c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1504c {

        /* renamed from: a */
        final InterfaceC1508g f3923a;

        /* renamed from: b */
        boolean f3924b;

        /* renamed from: c */
        boolean f3925c;

        /* renamed from: d */
        int[] f3926d;

        /* renamed from: e */
        Set<AbstractC1506e> f3927e;

        /* renamed from: f */
        boolean f3928f;

        /* renamed from: g */
        int f3929g = -16711936;

        /* renamed from: h */
        int f3930h = 0;

        /* renamed from: i */
        InterfaceC1505d f3931i = new C1499d();

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC1504c(InterfaceC1508g interfaceC1508g) {
            C1138f.m37823g(interfaceC1508g, "metadataLoader cannot be null.");
            this.f3923a = interfaceC1508g;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public final InterfaceC1508g m36632a() {
            return this.f3923a;
        }

        /* renamed from: b */
        public AbstractC1504c m36631b(int i) {
            this.f3930h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1505d {
        /* renamed from: a */
        boolean mo36630a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1506e {
        /* renamed from: a */
        public void mo36629a(Throwable th2) {
        }

        /* renamed from: b */
        public void mo23013b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.e$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RunnableC1507f implements Runnable {

        /* renamed from: j */
        private final List<AbstractC1506e> f3932j;

        /* renamed from: k */
        private final Throwable f3933k;

        /* renamed from: l */
        private final int f3934l;

        RunnableC1507f(AbstractC1506e abstractC1506e, int i) {
            this(Arrays.asList((AbstractC1506e) C1138f.m37823g(abstractC1506e, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3932j.size();
            int i = 0;
            if (this.f3934l != 1) {
                while (i < size) {
                    this.f3932j.get(i).mo36629a(this.f3933k);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f3932j.get(i).mo23013b();
                i++;
            }
        }

        RunnableC1507f(Collection<AbstractC1506e> collection, int i) {
            this(collection, i, null);
        }

        RunnableC1507f(Collection<AbstractC1506e> collection, int i, Throwable th2) {
            C1138f.m37823g(collection, "initCallbacks cannot be null");
            this.f3932j = new ArrayList(collection);
            this.f3934l = i;
            this.f3933k = th2;
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1508g {
        /* renamed from: a */
        void mo36590a(AbstractC1509h abstractC1509h);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1509h {
        /* renamed from: a */
        public abstract void mo36628a(Throwable th2);

        /* renamed from: b */
        public abstract void mo36627b(C1525m c1525m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.e$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1510i {
        C1510i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC1516i m36626a(C1512g c1512g) {
            return new C1529o(c1512g);
        }
    }

    private C1500e(AbstractC1504c abstractC1504c) {
        this.f3912g = abstractC1504c.f3924b;
        this.f3913h = abstractC1504c.f3925c;
        this.f3914i = abstractC1504c.f3926d;
        this.f3915j = abstractC1504c.f3928f;
        this.f3916k = abstractC1504c.f3929g;
        this.f3911f = abstractC1504c.f3923a;
        this.f3917l = abstractC1504c.f3930h;
        this.f3918m = abstractC1504c.f3931i;
        C0626b c0626b = new C0626b();
        this.f3907b = c0626b;
        Set<AbstractC1506e> set = abstractC1504c.f3927e;
        if (set != null && !set.isEmpty()) {
            c0626b.addAll(abstractC1504c.f3927e);
        }
        this.f3910e = new C1501a(this);
        m36646l();
    }

    /* renamed from: b */
    public static C1500e m36656b() {
        C1500e c1500e;
        boolean z;
        synchronized (f3903n) {
            c1500e = f3905p;
            if (c1500e != null) {
                z = true;
            } else {
                z = false;
            }
            C1138f.m37822h(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c1500e;
    }

    /* renamed from: e */
    public static boolean m36653e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C1513h.m36612c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m36652f(Editable editable, int i, KeyEvent keyEvent) {
        return C1513h.m36611d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C1500e m36651g(AbstractC1504c abstractC1504c) {
        C1500e c1500e = f3905p;
        if (c1500e == null) {
            synchronized (f3903n) {
                c1500e = f3905p;
                if (c1500e == null) {
                    c1500e = new C1500e(abstractC1504c);
                    f3905p = c1500e;
                }
            }
        }
        return c1500e;
    }

    /* renamed from: h */
    public static boolean m36650h() {
        return f3905p != null;
    }

    /* renamed from: j */
    private boolean m36648j() {
        return m36654d() == 1;
    }

    /* renamed from: l */
    private void m36646l() {
        this.f3906a.writeLock().lock();
        try {
            if (this.f3917l == 0) {
                this.f3908c = 0;
            }
            this.f3906a.writeLock().unlock();
            if (m36654d() == 0) {
                this.f3910e.mo36635a();
            }
        } catch (Throwable th2) {
            this.f3906a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    public int m36655c() {
        return this.f3916k;
    }

    /* renamed from: d */
    public int m36654d() {
        this.f3906a.readLock().lock();
        try {
            return this.f3908c;
        } finally {
            this.f3906a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean m36649i() {
        return this.f3915j;
    }

    /* renamed from: k */
    public void m36647k() {
        boolean z = true;
        if (this.f3917l != 1) {
            z = false;
        }
        C1138f.m37822h(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m36648j()) {
            return;
        }
        this.f3906a.writeLock().lock();
        try {
            if (this.f3908c == 0) {
                return;
            }
            this.f3908c = 0;
            this.f3906a.writeLock().unlock();
            this.f3910e.mo36635a();
        } finally {
            this.f3906a.writeLock().unlock();
        }
    }

    /* renamed from: m */
    void m36645m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3906a.writeLock().lock();
        try {
            this.f3908c = 2;
            arrayList.addAll(this.f3907b);
            this.f3907b.clear();
            this.f3906a.writeLock().unlock();
            this.f3909d.post(new RunnableC1507f(arrayList, this.f3908c, th2));
        } catch (Throwable th3) {
            this.f3906a.writeLock().unlock();
            throw th3;
        }
    }

    /* renamed from: n */
    void m36644n() {
        ArrayList arrayList = new ArrayList();
        this.f3906a.writeLock().lock();
        try {
            this.f3908c = 1;
            arrayList.addAll(this.f3907b);
            this.f3907b.clear();
            this.f3906a.writeLock().unlock();
            this.f3909d.post(new RunnableC1507f(arrayList, this.f3908c));
        } catch (Throwable th2) {
            this.f3906a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: o */
    public CharSequence m36643o(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return m36642p(charSequence, 0, length);
    }

    /* renamed from: p */
    public CharSequence m36642p(CharSequence charSequence, int i, int i2) {
        return m36641q(charSequence, i, i2, ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: q */
    public CharSequence m36641q(CharSequence charSequence, int i, int i2, int i3) {
        return m36640r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence m36640r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C1138f.m37822h(m36648j(), "Not initialized yet");
        C1138f.m37826d(i, "start cannot be negative");
        C1138f.m37826d(i2, "end cannot be negative");
        C1138f.m37826d(i3, "maxEmojiCount cannot be negative");
        boolean z5 = false;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        C1138f.m37829a(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1138f.m37829a(z2, "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1138f.m37829a(z3, "end should be < than charSequence length");
        if (charSequence.length() != 0 && i != i2) {
            if (i4 != 1) {
                if (i4 != 2) {
                    z5 = this.f3912g;
                }
                z4 = z5;
            } else {
                z4 = true;
            }
            return this.f3910e.mo36634b(charSequence, i, i2, i3, z4);
        }
        return charSequence;
    }

    /* renamed from: s */
    public void m36639s(AbstractC1506e abstractC1506e) {
        C1138f.m37823g(abstractC1506e, "initCallback cannot be null");
        this.f3906a.writeLock().lock();
        try {
            if (this.f3908c != 1 && this.f3908c != 2) {
                this.f3907b.add(abstractC1506e);
            }
            this.f3909d.post(new RunnableC1507f(abstractC1506e, this.f3908c));
        } finally {
            this.f3906a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void m36638t(AbstractC1506e abstractC1506e) {
        C1138f.m37823g(abstractC1506e, "initCallback cannot be null");
        this.f3906a.writeLock().lock();
        try {
            this.f3907b.remove(abstractC1506e);
        } finally {
            this.f3906a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void m36637u(EditorInfo editorInfo) {
        if (m36648j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f3910e.mo36633c(editorInfo);
        }
    }
}
