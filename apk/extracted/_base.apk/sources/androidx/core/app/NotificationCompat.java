package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.Person;
import androidx.core.content.C0946a;
import androidx.core.content.C0958g;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C1100a;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p356u.C12807b;
import p356u.C12808c;
import p356u.C12809d;
import p356u.C12810e;
import p356u.C12812g;
import p356u.C12813h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class NotificationCompat {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class Action {

        /* renamed from: a */
        final Bundle f3024a;

        /* renamed from: b */
        private IconCompat f3025b;

        /* renamed from: c */
        private final RemoteInput[] f3026c;

        /* renamed from: d */
        private final RemoteInput[] f3027d;

        /* renamed from: e */
        private boolean f3028e;

        /* renamed from: f */
        boolean f3029f;

        /* renamed from: g */
        private final int f3030g;

        /* renamed from: h */
        private final boolean f3031h;
        @Deprecated

        /* renamed from: i */
        public int f3032i;

        /* renamed from: j */
        public CharSequence f3033j;

        /* renamed from: k */
        public PendingIntent f3034k;

        /* renamed from: l */
        private boolean f3035l;

        /* renamed from: androidx.core.app.NotificationCompat$Action$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class C0699a {

            /* renamed from: a */
            private final IconCompat f3036a;

            /* renamed from: b */
            private final CharSequence f3037b;

            /* renamed from: c */
            private final PendingIntent f3038c;

            /* renamed from: d */
            private boolean f3039d;

            /* renamed from: e */
            private final Bundle f3040e;

            /* renamed from: f */
            private ArrayList<RemoteInput> f3041f;

            /* renamed from: g */
            private int f3042g;

            /* renamed from: h */
            private boolean f3043h;

            /* renamed from: i */
            private boolean f3044i;

            /* renamed from: j */
            private boolean f3045j;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$Action$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0700a {
                /* renamed from: a */
                static android.app.RemoteInput[] m39028a(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$Action$a$b */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0701b {
                /* renamed from: a */
                static Icon m39027a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$Action$a$c */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0702c {
                /* renamed from: a */
                static boolean m39026a(Notification.Action action) {
                    boolean allowGeneratedReplies;
                    allowGeneratedReplies = action.getAllowGeneratedReplies();
                    return allowGeneratedReplies;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$Action$a$d */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0703d {
                /* renamed from: a */
                static int m39025a(Notification.Action action) {
                    int semanticAction;
                    semanticAction = action.getSemanticAction();
                    return semanticAction;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$Action$a$e */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0704e {
                /* renamed from: a */
                static boolean m39024a(Notification.Action action) {
                    boolean isContextual;
                    isContextual = action.isContextual();
                    return isContextual;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$Action$a$f */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0705f {
                /* renamed from: a */
                static boolean m39023a(Notification.Action action) {
                    boolean isAuthenticationRequired;
                    isAuthenticationRequired = action.isAuthenticationRequired();
                    return isAuthenticationRequired;
                }
            }

            public C0699a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* renamed from: c */
            private void m39035c() {
                if (!this.f3044i || this.f3038c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            /* renamed from: d */
            public static C0699a m39034d(Notification.Action action) {
                C0699a c0699a;
                if (C0701b.m39027a(action) != null) {
                    c0699a = new C0699a(IconCompat.m38134d(C0701b.m39027a(action)), action.title, action.actionIntent);
                } else {
                    c0699a = new C0699a(action.icon, action.title, action.actionIntent);
                }
                android.app.RemoteInput[] m39028a = C0700a.m39028a(action);
                if (m39028a != null && m39028a.length != 0) {
                    for (android.app.RemoteInput remoteInput : m39028a) {
                        c0699a.m39037a(RemoteInput.m38723c(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    c0699a.f3039d = C0702c.m39026a(action);
                }
                if (i >= 28) {
                    c0699a.m39030h(C0703d.m39025a(action));
                }
                if (i >= 29) {
                    c0699a.m39031g(C0704e.m39024a(action));
                }
                if (i >= 31) {
                    c0699a.m39032f(C0705f.m39023a(action));
                }
                return c0699a;
            }

            /* renamed from: a */
            public C0699a m39037a(RemoteInput remoteInput) {
                if (this.f3041f == null) {
                    this.f3041f = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.f3041f.add(remoteInput);
                }
                return this;
            }

            /* renamed from: b */
            public Action m39036b() {
                RemoteInput[] remoteInputArr;
                m39035c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.f3041f;
                if (arrayList3 != null) {
                    Iterator<RemoteInput> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RemoteInput next = it.next();
                        if (next.m38714l()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                RemoteInput[] remoteInputArr2 = null;
                if (arrayList.isEmpty()) {
                    remoteInputArr = null;
                } else {
                    remoteInputArr = (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    remoteInputArr2 = (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]);
                }
                return new Action(this.f3036a, this.f3037b, this.f3038c, this.f3040e, remoteInputArr2, remoteInputArr, this.f3039d, this.f3042g, this.f3043h, this.f3044i, this.f3045j);
            }

            /* renamed from: e */
            public C0699a m39033e(boolean z) {
                this.f3039d = z;
                return this;
            }

            /* renamed from: f */
            public C0699a m39032f(boolean z) {
                this.f3045j = z;
                return this;
            }

            /* renamed from: g */
            public C0699a m39031g(boolean z) {
                this.f3044i = z;
                return this;
            }

            /* renamed from: h */
            public C0699a m39030h(int i) {
                this.f3042g = i;
                return this;
            }

            /* renamed from: i */
            public C0699a m39029i(boolean z) {
                this.f3043h = z;
                return this;
            }

            public C0699a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m38125m(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0699a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f3039d = true;
                this.f3043h = true;
                this.f3036a = iconCompat;
                this.f3037b = Builder.m38968q(charSequence);
                this.f3038c = pendingIntent;
                this.f3040e = bundle;
                this.f3041f = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
                this.f3039d = z;
                this.f3042g = i;
                this.f3043h = z2;
                this.f3044i = z3;
                this.f3045j = z4;
            }
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m38125m(null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m39047a() {
            return this.f3034k;
        }

        /* renamed from: b */
        public boolean m39046b() {
            return this.f3028e;
        }

        /* renamed from: c */
        public Bundle m39045c() {
            return this.f3024a;
        }

        /* renamed from: d */
        public IconCompat m39044d() {
            int i;
            if (this.f3025b == null && (i = this.f3032i) != 0) {
                this.f3025b = IconCompat.m38125m(null, "", i);
            }
            return this.f3025b;
        }

        /* renamed from: e */
        public RemoteInput[] m39043e() {
            return this.f3026c;
        }

        /* renamed from: f */
        public int m39042f() {
            return this.f3030g;
        }

        /* renamed from: g */
        public boolean m39041g() {
            return this.f3029f;
        }

        /* renamed from: h */
        public CharSequence m39040h() {
            return this.f3033j;
        }

        /* renamed from: i */
        public boolean m39039i() {
            return this.f3035l;
        }

        /* renamed from: j */
        public boolean m39038j() {
            return this.f3031h;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.m38125m(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f3029f = true;
            this.f3025b = iconCompat;
            if (iconCompat != null && iconCompat.m38120r() == 2) {
                this.f3032i = iconCompat.m38123o();
            }
            this.f3033j = Builder.m38968q(charSequence);
            this.f3034k = pendingIntent;
            this.f3024a = bundle == null ? new Bundle() : bundle;
            this.f3026c = remoteInputArr;
            this.f3027d = remoteInputArr2;
            this.f3028e = z;
            this.f3030g = i;
            this.f3029f = z2;
            this.f3031h = z3;
            this.f3035l = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0716b {
        /* renamed from: a */
        static boolean m38916a(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        /* renamed from: b */
        static CharSequence[] m38915b(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        /* renamed from: c */
        static Bundle m38914c(Notification.Action action) {
            return action.getExtras();
        }

        /* renamed from: d */
        static Bundle m38913d(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        /* renamed from: e */
        static String m38912e(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: f */
        static CharSequence m38911f(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        /* renamed from: g */
        static android.app.RemoteInput[] m38910g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        /* renamed from: h */
        static String m38909h(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        /* renamed from: i */
        static String m38908i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0717c {
        /* renamed from: a */
        static int m38907a(Notification notification) {
            int badgeIconType;
            badgeIconType = notification.getBadgeIconType();
            return badgeIconType;
        }

        /* renamed from: b */
        static String m38906b(Notification notification) {
            String channelId;
            channelId = notification.getChannelId();
            return channelId;
        }

        /* renamed from: c */
        static int m38905c(Notification notification) {
            int groupAlertBehavior;
            groupAlertBehavior = notification.getGroupAlertBehavior();
            return groupAlertBehavior;
        }

        /* renamed from: d */
        static CharSequence m38904d(Notification notification) {
            CharSequence settingsText;
            settingsText = notification.getSettingsText();
            return settingsText;
        }

        /* renamed from: e */
        static String m38903e(Notification notification) {
            String shortcutId;
            shortcutId = notification.getShortcutId();
            return shortcutId;
        }

        /* renamed from: f */
        static long m38902f(Notification notification) {
            long timeoutAfter;
            timeoutAfter = notification.getTimeoutAfter();
            return timeoutAfter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0718d {
        /* renamed from: a */
        static boolean m38901a(Notification notification) {
            boolean allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
            return allowSystemGeneratedContextualActions;
        }

        /* renamed from: b */
        static Notification.BubbleMetadata m38900b(Notification notification) {
            Notification.BubbleMetadata bubbleMetadata;
            bubbleMetadata = notification.getBubbleMetadata();
            return bubbleMetadata;
        }

        /* renamed from: c */
        static int m38899c(android.app.RemoteInput remoteInput) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        /* renamed from: d */
        static LocusId m38898d(Notification notification) {
            LocusId locusId;
            locusId = notification.getLocusId();
            return locusId;
        }

        /* renamed from: e */
        static boolean m38897e(Notification.Action action) {
            boolean isContextual;
            isContextual = action.isContextual();
            return isContextual;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0719e extends AbstractC0743k {

        /* renamed from: e */
        private IconCompat f3107e;

        /* renamed from: f */
        private IconCompat f3108f;

        /* renamed from: g */
        private boolean f3109g;

        /* renamed from: h */
        private CharSequence f3110h;

        /* renamed from: i */
        private boolean f3111i;

        /* renamed from: androidx.core.app.NotificationCompat$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        private static class C0720a {
            /* renamed from: a */
            static Notification.BigPictureStyle m38892a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            /* renamed from: b */
            static Notification.BigPictureStyle m38891b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigPictureStyle m38890c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static void m38889d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: e */
            static void m38888e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$e$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        private static class C0721b {
            /* renamed from: a */
            static void m38887a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$e$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        private static class C0722c {
            /* renamed from: a */
            static void m38886a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            static void m38885b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            static void m38884c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* renamed from: A */
        public static IconCompat m38896A(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            if (parcelable != null) {
                return m38895x(parcelable);
            }
            return m38895x(bundle.getParcelable("android.pictureIcon"));
        }

        /* renamed from: x */
        private static IconCompat m38895x(Parcelable parcelable) {
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    return IconCompat.m38135c((Icon) parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.m38129i((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: b */
        public void mo38816b(InterfaceC0864o interfaceC0864o) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle m38890c = C0720a.m38890c(C0720a.m38891b(interfaceC0864o.mo38470a()), this.f3139b);
            IconCompat iconCompat = this.f3107e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (interfaceC0864o instanceof C0921x2) {
                        context = ((C0921x2) interfaceC0864o).m38465f();
                    } else {
                        context = null;
                    }
                    C0722c.m38886a(m38890c, this.f3107e.m38112z(context));
                } else if (iconCompat.m38120r() == 1) {
                    m38890c = C0720a.m38892a(m38890c, this.f3107e.m38124n());
                }
            }
            if (this.f3109g) {
                if (this.f3108f == null) {
                    C0720a.m38889d(m38890c, null);
                } else {
                    if (interfaceC0864o instanceof C0921x2) {
                        context2 = ((C0921x2) interfaceC0864o).m38465f();
                    }
                    C0721b.m38887a(m38890c, this.f3108f.m38112z(context2));
                }
            }
            if (this.f3141d) {
                C0720a.m38888e(m38890c, this.f3140c);
            }
            if (i >= 31) {
                C0722c.m38884c(m38890c, this.f3111i);
                C0722c.m38885b(m38890c, this.f3110h);
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: f */
        protected void mo38812f(Bundle bundle) {
            super.mo38812f(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.pictureIcon");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: q */
        protected String mo38801q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: v */
        protected void mo38796v(Bundle bundle) {
            super.mo38796v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f3108f = m38895x(bundle.getParcelable("android.largeIcon.big"));
                this.f3109g = true;
            }
            this.f3107e = m38896A(bundle);
            this.f3111i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        /* renamed from: y */
        public C0719e m38894y(Bitmap bitmap) {
            IconCompat m38129i;
            if (bitmap == null) {
                m38129i = null;
            } else {
                m38129i = IconCompat.m38129i(bitmap);
            }
            this.f3108f = m38129i;
            this.f3109g = true;
            return this;
        }

        /* renamed from: z */
        public C0719e m38893z(Bitmap bitmap) {
            this.f3107e = bitmap == null ? null : IconCompat.m38129i(bitmap);
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0723f extends AbstractC0743k {

        /* renamed from: e */
        private CharSequence f3112e;

        /* renamed from: androidx.core.app.NotificationCompat$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0724a {
            /* renamed from: a */
            static Notification.BigTextStyle m38882a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            static Notification.BigTextStyle m38881b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigTextStyle m38880c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static Notification.BigTextStyle m38879d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: a */
        public void mo38817a(Bundle bundle) {
            super.mo38817a(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: b */
        public void mo38816b(InterfaceC0864o interfaceC0864o) {
            Notification.BigTextStyle m38882a = C0724a.m38882a(C0724a.m38880c(C0724a.m38881b(interfaceC0864o.mo38470a()), this.f3139b), this.f3112e);
            if (this.f3141d) {
                C0724a.m38879d(m38882a, this.f3140c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: f */
        protected void mo38812f(Bundle bundle) {
            super.mo38812f(bundle);
            bundle.remove("android.bigText");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: q */
        protected String mo38801q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: v */
        protected void mo38796v(Bundle bundle) {
            super.mo38796v(bundle);
            this.f3112e = bundle.getCharSequence("android.bigText");
        }

        /* renamed from: x */
        public C0723f m38883x(CharSequence charSequence) {
            this.f3112e = Builder.m38968q(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0725g {

        /* renamed from: a */
        private PendingIntent f3113a;

        /* renamed from: b */
        private PendingIntent f3114b;

        /* renamed from: c */
        private IconCompat f3115c;

        /* renamed from: d */
        private int f3116d;

        /* renamed from: e */
        private int f3117e;

        /* renamed from: f */
        private int f3118f;

        /* renamed from: g */
        private String f3119g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.NotificationCompat$g$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0726a {
            /* renamed from: a */
            static C0725g m38867a(Notification.BubbleMetadata bubbleMetadata) {
                PendingIntent intent;
                PendingIntent intent2;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                if (bubbleMetadata == null) {
                    return null;
                }
                intent = bubbleMetadata.getIntent();
                if (intent == null) {
                    return null;
                }
                intent2 = bubbleMetadata.getIntent();
                icon = bubbleMetadata.getIcon();
                C0728c c0728c = new C0728c(intent2, IconCompat.m38135c(icon));
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                C0728c m38862b = c0728c.m38862b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                C0728c m38861c = m38862b.m38861c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                C0728c m38857g = m38861c.m38857g(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    m38857g.m38860d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    m38857g.m38859e(desiredHeightResId2);
                }
                return m38857g.m38863a();
            }

            /* renamed from: b */
            static Notification.BubbleMetadata m38866b(C0725g c0725g) {
                Notification.BubbleMetadata.Builder icon;
                Notification.BubbleMetadata.Builder intent;
                Notification.BubbleMetadata.Builder deleteIntent;
                Notification.BubbleMetadata.Builder autoExpandBubble;
                Notification.BubbleMetadata.Builder suppressNotification;
                Notification.BubbleMetadata build;
                if (c0725g == null || c0725g.m38872g() == null) {
                    return null;
                }
                icon = new Notification.BubbleMetadata.Builder().setIcon(c0725g.m38873f().m38113y());
                intent = icon.setIntent(c0725g.m38872g());
                deleteIntent = intent.setDeleteIntent(c0725g.m38876c());
                autoExpandBubble = deleteIntent.setAutoExpandBubble(c0725g.m38877b());
                suppressNotification = autoExpandBubble.setSuppressNotification(c0725g.m38870i());
                if (c0725g.m38875d() != 0) {
                    suppressNotification.setDesiredHeight(c0725g.m38875d());
                }
                if (c0725g.m38874e() != 0) {
                    suppressNotification.setDesiredHeightResId(c0725g.m38874e());
                }
                build = suppressNotification.build();
                return build;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.NotificationCompat$g$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0727b {
            /* renamed from: a */
            static C0725g m38865a(Notification.BubbleMetadata bubbleMetadata) {
                String shortcutId;
                C0728c c0728c;
                PendingIntent intent;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                String shortcutId2;
                if (bubbleMetadata == null) {
                    return null;
                }
                shortcutId = bubbleMetadata.getShortcutId();
                if (shortcutId != null) {
                    shortcutId2 = bubbleMetadata.getShortcutId();
                    c0728c = new C0728c(shortcutId2);
                } else {
                    intent = bubbleMetadata.getIntent();
                    icon = bubbleMetadata.getIcon();
                    c0728c = new C0728c(intent, IconCompat.m38135c(icon));
                }
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                C0728c m38862b = c0728c.m38862b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                C0728c m38861c = m38862b.m38861c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                m38861c.m38857g(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    c0728c.m38860d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    c0728c.m38859e(desiredHeightResId2);
                }
                return c0728c.m38863a();
            }

            /* renamed from: b */
            static Notification.BubbleMetadata m38864b(C0725g c0725g) {
                Notification.BubbleMetadata.Builder builder;
                Notification.BubbleMetadata.Builder deleteIntent;
                Notification.BubbleMetadata.Builder autoExpandBubble;
                Notification.BubbleMetadata build;
                if (c0725g == null) {
                    return null;
                }
                if (c0725g.m38871h() != null) {
                    builder = new Notification.BubbleMetadata.Builder(c0725g.m38871h());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(c0725g.m38872g(), c0725g.m38873f().m38113y());
                }
                deleteIntent = builder.setDeleteIntent(c0725g.m38876c());
                autoExpandBubble = deleteIntent.setAutoExpandBubble(c0725g.m38877b());
                autoExpandBubble.setSuppressNotification(c0725g.m38870i());
                if (c0725g.m38875d() != 0) {
                    builder.setDesiredHeight(c0725g.m38875d());
                }
                if (c0725g.m38874e() != 0) {
                    builder.setDesiredHeightResId(c0725g.m38874e());
                }
                build = builder.build();
                return build;
            }
        }

        /* renamed from: a */
        public static C0725g m38878a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0727b.m38865a(bubbleMetadata);
            }
            if (i != 29) {
                return null;
            }
            return C0726a.m38867a(bubbleMetadata);
        }

        /* renamed from: k */
        public static Notification.BubbleMetadata m38868k(C0725g c0725g) {
            if (c0725g == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0727b.m38864b(c0725g);
            }
            if (i != 29) {
                return null;
            }
            return C0726a.m38866b(c0725g);
        }

        /* renamed from: b */
        public boolean m38877b() {
            return (this.f3118f & 1) != 0;
        }

        /* renamed from: c */
        public PendingIntent m38876c() {
            return this.f3114b;
        }

        /* renamed from: d */
        public int m38875d() {
            return this.f3116d;
        }

        /* renamed from: e */
        public int m38874e() {
            return this.f3117e;
        }

        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: f */
        public IconCompat m38873f() {
            return this.f3115c;
        }

        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: g */
        public PendingIntent m38872g() {
            return this.f3113a;
        }

        /* renamed from: h */
        public String m38871h() {
            return this.f3119g;
        }

        /* renamed from: i */
        public boolean m38870i() {
            return (this.f3118f & 2) != 0;
        }

        /* renamed from: j */
        public void m38869j(int i) {
            this.f3118f = i;
        }

        private C0725g(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.f3113a = pendingIntent;
            this.f3115c = iconCompat;
            this.f3116d = i;
            this.f3117e = i2;
            this.f3114b = pendingIntent2;
            this.f3118f = i3;
            this.f3119g = str;
        }

        /* renamed from: androidx.core.app.NotificationCompat$g$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class C0728c {

            /* renamed from: a */
            private PendingIntent f3120a;

            /* renamed from: b */
            private IconCompat f3121b;

            /* renamed from: c */
            private int f3122c;

            /* renamed from: d */
            private int f3123d;

            /* renamed from: e */
            private int f3124e;

            /* renamed from: f */
            private PendingIntent f3125f;

            /* renamed from: g */
            private String f3126g;

            public C0728c(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f3126g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            /* renamed from: f */
            private C0728c m38858f(int i, boolean z) {
                if (z) {
                    this.f3124e = i | this.f3124e;
                } else {
                    this.f3124e = (~i) & this.f3124e;
                }
                return this;
            }

            @SuppressLint({"SyntheticAccessor"})
            /* renamed from: a */
            public C0725g m38863a() {
                String str = this.f3126g;
                if (str == null && this.f3120a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f3121b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                C0725g c0725g = new C0725g(this.f3120a, this.f3125f, this.f3121b, this.f3122c, this.f3123d, this.f3124e, str);
                c0725g.m38869j(this.f3124e);
                return c0725g;
            }

            /* renamed from: b */
            public C0728c m38862b(boolean z) {
                m38858f(1, z);
                return this;
            }

            /* renamed from: c */
            public C0728c m38861c(PendingIntent pendingIntent) {
                this.f3125f = pendingIntent;
                return this;
            }

            /* renamed from: d */
            public C0728c m38860d(int i) {
                this.f3122c = Math.max(i, 0);
                this.f3123d = 0;
                return this;
            }

            /* renamed from: e */
            public C0728c m38859e(int i) {
                this.f3123d = i;
                this.f3122c = 0;
                return this;
            }

            /* renamed from: g */
            public C0728c m38857g(boolean z) {
                m38858f(2, z);
                return this;
            }

            public C0728c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f3120a = pendingIntent;
                    this.f3121b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0729h extends AbstractC0743k {

        /* renamed from: e */
        private int f3127e;

        /* renamed from: f */
        private Person f3128f;

        /* renamed from: g */
        private PendingIntent f3129g;

        /* renamed from: h */
        private PendingIntent f3130h;

        /* renamed from: i */
        private PendingIntent f3131i;

        /* renamed from: j */
        private boolean f3132j;

        /* renamed from: k */
        private Integer f3133k;

        /* renamed from: l */
        private Integer f3134l;

        /* renamed from: m */
        private IconCompat f3135m;

        /* renamed from: n */
        private CharSequence f3136n;

        /* renamed from: androidx.core.app.NotificationCompat$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0730a {
            /* renamed from: a */
            static void m38849a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$h$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0731b {
            /* renamed from: a */
            static Notification.Builder m38848a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            /* renamed from: b */
            static Notification.Action.Builder m38847b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            /* renamed from: c */
            static Notification.Action.Builder m38846c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            /* renamed from: d */
            static Notification.Action m38845d(Notification.Action.Builder builder) {
                return builder.build();
            }

            /* renamed from: e */
            static Notification.Action.Builder m38844e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$h$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0732c {
            /* renamed from: a */
            static Notification.Builder m38843a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            /* renamed from: b */
            static Notification.Builder m38842b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$h$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0733d {
            /* renamed from: a */
            static Notification.Action.Builder m38841a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            /* renamed from: b */
            static void m38840b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$h$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0734e {
            /* renamed from: a */
            static Notification.Builder m38839a(Notification.Builder builder) {
                Notification.Builder actions;
                actions = builder.setActions(new Notification.Action[0]);
                return actions;
            }

            /* renamed from: b */
            static Notification.Action.Builder m38838b(Notification.Action.Builder builder, boolean z) {
                Notification.Action.Builder allowGeneratedReplies;
                allowGeneratedReplies = builder.setAllowGeneratedReplies(z);
                return allowGeneratedReplies;
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$h$f */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0735f {
            /* renamed from: a */
            static Notification.Builder m38837a(Notification.Builder builder, android.app.Person person) {
                Notification.Builder addPerson;
                addPerson = builder.addPerson(person);
                return addPerson;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$h$g */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0736g {
            /* renamed from: a */
            static Notification.CallStyle m38836a(android.app.Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                Notification.CallStyle forIncomingCall;
                forIncomingCall = Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
                return forIncomingCall;
            }

            /* renamed from: b */
            static Notification.CallStyle m38835b(android.app.Person person, PendingIntent pendingIntent) {
                Notification.CallStyle forOngoingCall;
                forOngoingCall = Notification.CallStyle.forOngoingCall(person, pendingIntent);
                return forOngoingCall;
            }

            /* renamed from: c */
            static Notification.CallStyle m38834c(android.app.Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                Notification.CallStyle forScreeningCall;
                forScreeningCall = Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
                return forScreeningCall;
            }

            /* renamed from: d */
            static Notification.CallStyle m38833d(Notification.CallStyle callStyle, int i) {
                Notification.CallStyle answerButtonColorHint;
                answerButtonColorHint = callStyle.setAnswerButtonColorHint(i);
                return answerButtonColorHint;
            }

            /* renamed from: e */
            static Notification.Action.Builder m38832e(Notification.Action.Builder builder, boolean z) {
                Notification.Action.Builder authenticationRequired;
                authenticationRequired = builder.setAuthenticationRequired(z);
                return authenticationRequired;
            }

            /* renamed from: f */
            static Notification.CallStyle m38831f(Notification.CallStyle callStyle, int i) {
                Notification.CallStyle declineButtonColorHint;
                declineButtonColorHint = callStyle.setDeclineButtonColorHint(i);
                return declineButtonColorHint;
            }

            /* renamed from: g */
            static Notification.CallStyle m38830g(Notification.CallStyle callStyle, boolean z) {
                Notification.CallStyle isVideo;
                isVideo = callStyle.setIsVideo(z);
                return isVideo;
            }

            /* renamed from: h */
            static Notification.CallStyle m38829h(Notification.CallStyle callStyle, Icon icon) {
                Notification.CallStyle verificationIcon;
                verificationIcon = callStyle.setVerificationIcon(icon);
                return verificationIcon;
            }

            /* renamed from: i */
            static Notification.CallStyle m38828i(Notification.CallStyle callStyle, CharSequence charSequence) {
                Notification.CallStyle verificationText;
                verificationText = callStyle.setVerificationText(charSequence);
                return verificationText;
            }
        }

        /* renamed from: A */
        private boolean m38856A(Action action) {
            return action != null && action.m39045c().getBoolean("key_action_priority");
        }

        /* renamed from: B */
        private Action m38855B(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C0946a.m38401c(this.f3138a.f3070a, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f3138a.f3070a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action m39036b = new Action.C0699a(IconCompat.m38126l(this.f3138a.f3070a, i), spannableStringBuilder, pendingIntent).m39036b();
            m39036b.m39045c().putBoolean("key_action_priority", true);
            return m39036b;
        }

        /* renamed from: C */
        private Action m38854C() {
            int i;
            int i2;
            int i3 = C12809d.f33194b;
            int i4 = C12809d.f33193a;
            PendingIntent pendingIntent = this.f3129g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.f3132j;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (z) {
                i2 = C12813h.f33265b;
            } else {
                i2 = C12813h.f33264a;
            }
            return m38855B(i, i2, this.f3133k, C12807b.f33180a, pendingIntent);
        }

        /* renamed from: D */
        private Action m38853D() {
            int i = C12809d.f33195c;
            PendingIntent pendingIntent = this.f3130h;
            if (pendingIntent == null) {
                return m38855B(i, C12813h.f33267d, this.f3134l, C12807b.f33181b, this.f3131i);
            }
            return m38855B(i, C12813h.f33266c, this.f3134l, C12807b.f33181b, pendingIntent);
        }

        /* renamed from: x */
        private static Notification.Action m38852x(Action action) {
            Icon m38113y;
            Bundle bundle;
            int i = Build.VERSION.SDK_INT;
            IconCompat m39044d = action.m39044d();
            if (m39044d == null) {
                m38113y = null;
            } else {
                m38113y = m39044d.m38113y();
            }
            Notification.Action.Builder m38841a = C0733d.m38841a(m38113y, action.m39040h(), action.m39047a());
            if (action.m39045c() != null) {
                bundle = new Bundle(action.m39045c());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.m39046b());
            if (i >= 24) {
                C0734e.m38838b(m38841a, action.m39046b());
            }
            if (i >= 31) {
                C0736g.m38832e(m38841a, action.m39039i());
            }
            C0731b.m38847b(m38841a, bundle);
            RemoteInput[] m39043e = action.m39043e();
            if (m39043e != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.m38724b(m39043e)) {
                    C0731b.m38846c(m38841a, remoteInput);
                }
            }
            return C0731b.m38845d(m38841a);
        }

        /* renamed from: z */
        private String m38850z() {
            int i = this.f3127e;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.f3138a.f3070a.getResources().getString(C12813h.f33270g);
                }
                return this.f3138a.f3070a.getResources().getString(C12813h.f33269f);
            }
            return this.f3138a.f3070a.getResources().getString(C12813h.f33268e);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: a */
        public void mo38817a(Bundle bundle) {
            super.mo38817a(bundle);
            bundle.putInt("android.callType", this.f3127e);
            bundle.putBoolean("android.callIsVideo", this.f3132j);
            Person person = this.f3128f;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", person.m38739k());
                } else {
                    bundle.putParcelable("android.callPersonCompat", person.m38738l());
                }
            }
            IconCompat iconCompat = this.f3135m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", iconCompat.m38112z(this.f3138a.f3070a));
            }
            bundle.putCharSequence("android.verificationText", this.f3136n);
            bundle.putParcelable("android.answerIntent", this.f3129g);
            bundle.putParcelable("android.declineIntent", this.f3130h);
            bundle.putParcelable("android.hangUpIntent", this.f3131i);
            Integer num = this.f3133k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f3134l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: b */
        public void mo38816b(InterfaceC0864o interfaceC0864o) {
            CharSequence charSequence;
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence2 = null;
            r2 = null;
            Notification.CallStyle m38836a = null;
            charSequence2 = null;
            if (i >= 31) {
                int i2 = this.f3127e;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (Log.isLoggable("NotifCompat", 3)) {
                                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f3127e));
                            }
                        } else {
                            m38836a = C0736g.m38834c(this.f3128f.m38739k(), this.f3131i, this.f3129g);
                        }
                    } else {
                        m38836a = C0736g.m38835b(this.f3128f.m38739k(), this.f3131i);
                    }
                } else {
                    m38836a = C0736g.m38836a(this.f3128f.m38739k(), this.f3130h, this.f3129g);
                }
                if (m38836a != null) {
                    C0734e.m38839a(interfaceC0864o.mo38470a());
                    C0730a.m38849a(m38836a, interfaceC0864o.mo38470a());
                    Integer num = this.f3133k;
                    if (num != null) {
                        C0736g.m38833d(m38836a, num.intValue());
                    }
                    Integer num2 = this.f3134l;
                    if (num2 != null) {
                        C0736g.m38831f(m38836a, num2.intValue());
                    }
                    C0736g.m38828i(m38836a, this.f3136n);
                    IconCompat iconCompat = this.f3135m;
                    if (iconCompat != null) {
                        C0736g.m38829h(m38836a, iconCompat.m38112z(this.f3138a.f3070a));
                    }
                    C0736g.m38830g(m38836a, this.f3132j);
                    return;
                }
                return;
            }
            Notification.Builder mo38470a = interfaceC0864o.mo38470a();
            Person person = this.f3128f;
            if (person != null) {
                charSequence = person.m38744f();
            } else {
                charSequence = null;
            }
            mo38470a.setContentTitle(charSequence);
            Bundle bundle = this.f3138a.f3050E;
            if (bundle != null && bundle.containsKey("android.text")) {
                charSequence2 = this.f3138a.f3050E.getCharSequence("android.text");
            }
            if (charSequence2 == null) {
                charSequence2 = m38850z();
            }
            mo38470a.setContentText(charSequence2);
            Person person2 = this.f3128f;
            if (person2 != null) {
                if (person2.m38746d() != null) {
                    C0733d.m38840b(mo38470a, this.f3128f.m38746d().m38112z(this.f3138a.f3070a));
                }
                if (i >= 28) {
                    C0735f.m38837a(mo38470a, this.f3128f.m38739k());
                } else {
                    C0732c.m38843a(mo38470a, this.f3128f.m38743g());
                }
            }
            ArrayList<Action> m38851y = m38851y();
            if (i >= 24) {
                C0734e.m38839a(mo38470a);
            }
            for (Action action : m38851y) {
                C0731b.m38848a(mo38470a, m38852x(action));
            }
            C0732c.m38842b(mo38470a, "call");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: q */
        protected String mo38801q() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: v */
        protected void mo38796v(Bundle bundle) {
            Integer num;
            super.mo38796v(bundle);
            this.f3127e = bundle.getInt("android.callType");
            this.f3132j = bundle.getBoolean("android.callIsVideo");
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
                this.f3128f = Person.m38749a((android.app.Person) bundle.getParcelable("android.callPerson"));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.f3128f = Person.m38748b(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.f3135m = IconCompat.m38135c((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.f3135m = IconCompat.m38136b(bundle.getBundle("android.verificationIconCompat"));
            }
            this.f3136n = bundle.getCharSequence("android.verificationText");
            this.f3129g = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.f3130h = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f3131i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            Integer num2 = null;
            if (bundle.containsKey("android.answerColor")) {
                num = Integer.valueOf(bundle.getInt("android.answerColor"));
            } else {
                num = null;
            }
            this.f3133k = num;
            if (bundle.containsKey("android.declineColor")) {
                num2 = Integer.valueOf(bundle.getInt("android.declineColor"));
            }
            this.f3134l = num2;
        }

        /* renamed from: y */
        public ArrayList<Action> m38851y() {
            Action m38853D = m38853D();
            Action m38854C = m38854C();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(m38853D);
            ArrayList<Action> arrayList2 = this.f3138a.f3071b;
            int i = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.m39038j()) {
                        arrayList.add(action);
                    } else if (!m38856A(action) && i > 1) {
                        arrayList.add(action);
                        i--;
                    }
                    if (m38854C != null && i == 1) {
                        arrayList.add(m38854C);
                        i--;
                    }
                }
            }
            if (m38854C != null && i >= 1) {
                arrayList.add(m38854C);
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0737i extends AbstractC0743k {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0738a {
            /* renamed from: a */
            static void m38824a(RemoteViews remoteViews, int i, CharSequence charSequence) {
                remoteViews.setContentDescription(i, charSequence);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$i$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0739b {
            /* renamed from: a */
            static Notification.Builder m38823a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$i$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0740c {
            /* renamed from: a */
            static Notification.DecoratedCustomViewStyle m38822a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        /* renamed from: x */
        private RemoteViews m38827x(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews m38815c = m38815c(true, C12812g.f33263c, false);
            m38815c.removeAllViews(C12810e.f33208L);
            List<Action> m38825z = m38825z(this.f3138a.f3071b);
            if (z && m38825z != null && (min = Math.min(m38825z.size(), 3)) > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    m38815c.addView(C12810e.f33208L, m38826y(m38825z.get(i2)));
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                i = 8;
            }
            m38815c.setViewVisibility(C12810e.f33208L, i);
            m38815c.setViewVisibility(C12810e.f33205I, i);
            m38814d(m38815c, remoteViews);
            return m38815c;
        }

        /* renamed from: y */
        private RemoteViews m38826y(Action action) {
            boolean z;
            int i;
            if (action.f3034k == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.f3138a.f3070a.getPackageName();
            if (z) {
                i = C12812g.f33262b;
            } else {
                i = C12812g.f33261a;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat m39044d = action.m39044d();
            if (m39044d != null) {
                remoteViews.setImageViewBitmap(C12810e.f33206J, m38805m(m39044d, C12807b.f33182c));
            }
            remoteViews.setTextViewText(C12810e.f33207K, action.f3033j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C12810e.f33204H, action.f3034k);
            }
            C0738a.m38824a(remoteViews, C12810e.f33204H, action.f3033j);
            return remoteViews;
        }

        /* renamed from: z */
        private static List<Action> m38825z(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.m39038j()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: b */
        public void mo38816b(InterfaceC0864o interfaceC0864o) {
            if (Build.VERSION.SDK_INT >= 24) {
                C0739b.m38823a(interfaceC0864o.mo38470a(), C0740c.m38822a());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: q */
        protected String mo38801q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: s */
        public RemoteViews mo38799s(InterfaceC0864o interfaceC0864o) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews m38980i = this.f3138a.m38980i();
            if (m38980i == null) {
                m38980i = this.f3138a.m38976k();
            }
            if (m38980i == null) {
                return null;
            }
            return m38827x(m38980i, true);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: t */
        public RemoteViews mo38798t(InterfaceC0864o interfaceC0864o) {
            if (Build.VERSION.SDK_INT >= 24 || this.f3138a.m38976k() == null) {
                return null;
            }
            return m38827x(this.f3138a.m38976k(), false);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: u */
        public RemoteViews mo38797u(InterfaceC0864o interfaceC0864o) {
            RemoteViews m38976k;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews m38971n = this.f3138a.m38971n();
            if (m38971n != null) {
                m38976k = m38971n;
            } else {
                m38976k = this.f3138a.m38976k();
            }
            if (m38971n == null) {
                return null;
            }
            return m38827x(m38976k, true);
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0741j extends AbstractC0743k {

        /* renamed from: e */
        private ArrayList<CharSequence> f3137e = new ArrayList<>();

        /* renamed from: androidx.core.app.NotificationCompat$j$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0742a {
            /* renamed from: a */
            static Notification.InboxStyle m38821a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            /* renamed from: b */
            static Notification.InboxStyle m38820b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            /* renamed from: c */
            static Notification.InboxStyle m38819c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static Notification.InboxStyle m38818d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: b */
        public void mo38816b(InterfaceC0864o interfaceC0864o) {
            Notification.InboxStyle m38819c = C0742a.m38819c(C0742a.m38820b(interfaceC0864o.mo38470a()), this.f3139b);
            if (this.f3141d) {
                C0742a.m38818d(m38819c, this.f3140c);
            }
            Iterator<CharSequence> it = this.f3137e.iterator();
            while (it.hasNext()) {
                C0742a.m38821a(m38819c, it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: f */
        protected void mo38812f(Bundle bundle) {
            super.mo38812f(bundle);
            bundle.remove("android.textLines");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: q */
        protected String mo38801q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: v */
        protected void mo38796v(Bundle bundle) {
            super.mo38796v(bundle);
            this.f3137e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f3137e, bundle.getCharSequenceArray("android.textLines"));
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC0743k {

        /* renamed from: a */
        protected Builder f3138a;

        /* renamed from: b */
        CharSequence f3139b;

        /* renamed from: c */
        CharSequence f3140c;

        /* renamed from: d */
        boolean f3141d = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$k$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0744a {
            /* renamed from: a */
            static void m38794a(RemoteViews remoteViews, int i, int i2, float f) {
                remoteViews.setTextViewTextSize(i, i2, f);
            }

            /* renamed from: b */
            static void m38793b(RemoteViews remoteViews, int i, int i2, int i3, int i4, int i5) {
                remoteViews.setViewPadding(i, i2, i3, i4, i5);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$k$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0745b {
            /* renamed from: a */
            static void m38792a(RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }

        /* renamed from: e */
        private int m38813e() {
            Resources resources = this.f3138a.f3070a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C12808c.f33191i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C12808c.f33192j);
            float m38811g = (m38811g(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - m38811g) * dimensionPixelSize) + (m38811g * dimensionPixelSize2));
        }

        /* renamed from: g */
        private static float m38811g(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        /* renamed from: h */
        static AbstractC0743k m38810h(String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 714386739:
                        if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C0737i();
                    case 1:
                        return new C0719e();
                    case 2:
                        return new C0729h();
                    case 3:
                        return new C0741j();
                    case 4:
                        return new C0723f();
                    case 5:
                        return new MessagingStyle();
                    default:
                        return null;
                }
            }
            return null;
        }

        /* renamed from: i */
        private static AbstractC0743k m38809i(String str) {
            if (str == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new C0719e();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new C0723f();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new C0741j();
            }
            if (i >= 24) {
                if (str.equals(Notification.MessagingStyle.class.getName())) {
                    return new MessagingStyle();
                }
                if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    return new C0737i();
                }
            }
            return null;
        }

        /* renamed from: j */
        static AbstractC0743k m38808j(Bundle bundle) {
            AbstractC0743k m38810h = m38810h(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (m38810h != null) {
                return m38810h;
            }
            if (!bundle.containsKey("android.selfDisplayName") && !bundle.containsKey("android.messagingStyleUser")) {
                if (!bundle.containsKey("android.picture") && !bundle.containsKey("android.pictureIcon")) {
                    if (bundle.containsKey("android.bigText")) {
                        return new C0723f();
                    }
                    if (bundle.containsKey("android.textLines")) {
                        return new C0741j();
                    }
                    if (bundle.containsKey("android.callType")) {
                        return new C0729h();
                    }
                    return m38809i(bundle.getString("android.template"));
                }
                return new C0719e();
            }
            return new MessagingStyle();
        }

        /* renamed from: k */
        static AbstractC0743k m38807k(Bundle bundle) {
            AbstractC0743k m38808j = m38808j(bundle);
            if (m38808j == null) {
                return null;
            }
            try {
                m38808j.mo38796v(bundle);
                return m38808j;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: l */
        private Bitmap m38806l(int i, int i2, int i3) {
            return m38804n(IconCompat.m38126l(this.f3138a.f3070a, i), i2, i3);
        }

        /* renamed from: n */
        private Bitmap m38804n(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable m38117u = iconCompat.m38117u(this.f3138a.f3070a);
            if (i2 == 0) {
                i3 = m38117u.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = m38117u.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            m38117u.setBounds(0, 0, i3, i2);
            if (i != 0) {
                m38117u.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            m38117u.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: o */
        private Bitmap m38803o(int i, int i2, int i3, int i4) {
            int i5 = C12809d.f33196d;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap m38806l = m38806l(i5, i4, i2);
            Canvas canvas = new Canvas(m38806l);
            Drawable mutate = this.f3138a.f3070a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return m38806l;
        }

        /* renamed from: p */
        public static AbstractC0743k m38802p(Notification notification) {
            Bundle m39063k = NotificationCompat.m39063k(notification);
            if (m39063k == null) {
                return null;
            }
            return m38807k(m39063k);
        }

        /* renamed from: r */
        private void m38800r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C12810e.f33244k0, 8);
            remoteViews.setViewVisibility(C12810e.f33240i0, 8);
            remoteViews.setViewVisibility(C12810e.f33238h0, 8);
        }

        /* renamed from: a */
        public void mo38817a(Bundle bundle) {
            if (this.f3141d) {
                bundle.putCharSequence("android.summaryText", this.f3140c);
            }
            CharSequence charSequence = this.f3139b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo38801q = mo38801q();
            if (mo38801q != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo38801q);
            }
        }

        /* renamed from: b */
        public abstract void mo38816b(InterfaceC0864o interfaceC0864o);

        /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0193  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews m38815c(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.AbstractC0743k.m38815c(boolean, int, boolean):android.widget.RemoteViews");
        }

        /* renamed from: d */
        public void m38814d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m38800r(remoteViews);
            int i = C12810e.f33214R;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            C0744a.m38793b(remoteViews, C12810e.f33215S, 0, m38813e(), 0, 0);
        }

        /* renamed from: f */
        protected void mo38812f(Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        /* renamed from: m */
        Bitmap m38805m(IconCompat iconCompat, int i) {
            return m38804n(iconCompat, i, 0);
        }

        /* renamed from: q */
        protected abstract String mo38801q();

        /* renamed from: s */
        public RemoteViews mo38799s(InterfaceC0864o interfaceC0864o) {
            return null;
        }

        /* renamed from: t */
        public RemoteViews mo38798t(InterfaceC0864o interfaceC0864o) {
            return null;
        }

        /* renamed from: u */
        public RemoteViews mo38797u(InterfaceC0864o interfaceC0864o) {
            return null;
        }

        /* renamed from: v */
        protected void mo38796v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f3140c = bundle.getCharSequence("android.summaryText");
                this.f3141d = true;
            }
            this.f3139b = bundle.getCharSequence("android.title.big");
        }

        /* renamed from: w */
        public void m38795w(Builder builder) {
            if (this.f3138a != builder) {
                this.f3138a = builder;
                if (builder != null) {
                    builder.m38987e0(this);
                }
            }
        }
    }

    /* renamed from: A */
    public static int m39075A(Notification notification) {
        return notification.visibility;
    }

    /* renamed from: B */
    public static boolean m39074B(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* renamed from: a */
    public static boolean m39073a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0718d.m38901a(notification);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m39072b(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    /* renamed from: c */
    public static int m39071c(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0717c.m38907a(notification);
        }
        return 0;
    }

    /* renamed from: d */
    public static C0725g m39070d(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0725g.m38878a(C0718d.m38900b(notification));
        }
        return null;
    }

    /* renamed from: e */
    public static String m39069e(Notification notification) {
        return notification.category;
    }

    /* renamed from: f */
    public static String m39068f(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0717c.m38906b(notification);
        }
        return null;
    }

    /* renamed from: g */
    public static int m39067g(Notification notification) {
        return notification.color;
    }

    /* renamed from: h */
    public static CharSequence m39066h(Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    /* renamed from: i */
    public static CharSequence m39065i(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    /* renamed from: j */
    public static CharSequence m39064j(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    /* renamed from: k */
    public static Bundle m39063k(Notification notification) {
        return notification.extras;
    }

    /* renamed from: l */
    public static String m39062l(Notification notification) {
        return C0716b.m38912e(notification);
    }

    /* renamed from: m */
    static boolean m39061m(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    /* renamed from: n */
    public static List<Action> m39060n(Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < bundle2.size(); i++) {
                arrayList.add(C0868o3.m38536c(bundle2.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static boolean m39059o(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    /* renamed from: p */
    public static C0958g m39058p(Notification notification) {
        LocusId m38898d;
        if (Build.VERSION.SDK_INT < 29 || (m38898d = C0718d.m38898d(notification)) == null) {
            return null;
        }
        return C0958g.m38366d(m38898d);
    }

    /* renamed from: q */
    public static boolean m39057q(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    /* renamed from: r */
    public static boolean m39056r(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    /* renamed from: s */
    public static Notification m39055s(Notification notification) {
        return notification.publicVersion;
    }

    /* renamed from: t */
    public static CharSequence m39054t(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0717c.m38904d(notification);
        }
        return null;
    }

    /* renamed from: u */
    public static String m39053u(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0717c.m38903e(notification);
        }
        return null;
    }

    /* renamed from: v */
    public static boolean m39052v(Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    /* renamed from: w */
    public static String m39051w(Notification notification) {
        return C0716b.m38908i(notification);
    }

    /* renamed from: x */
    public static CharSequence m39050x(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    /* renamed from: y */
    public static long m39049y(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0717c.m38902f(notification);
        }
        return 0L;
    }

    /* renamed from: z */
    public static boolean m39048z(Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class MessagingStyle extends AbstractC0743k {

        /* renamed from: e */
        private final List<C0712e> f3096e = new ArrayList();

        /* renamed from: f */
        private final List<C0712e> f3097f = new ArrayList();

        /* renamed from: g */
        private Person f3098g;

        /* renamed from: h */
        private CharSequence f3099h;

        /* renamed from: i */
        private Boolean f3100i;

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0708a {
            /* renamed from: a */
            static Notification.BigTextStyle m38941a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            static Notification.BigTextStyle m38940b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigTextStyle m38939c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static void m38938d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0709b {
            /* renamed from: a */
            static Notification.MessagingStyle m38937a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                Notification.MessagingStyle addMessage;
                addMessage = messagingStyle.addMessage(message);
                return addMessage;
            }

            /* renamed from: b */
            static Notification.MessagingStyle m38936b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            /* renamed from: c */
            static Notification.MessagingStyle m38935c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                Notification.MessagingStyle conversationTitle;
                conversationTitle = messagingStyle.setConversationTitle(charSequence);
                return conversationTitle;
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0710c {
            /* renamed from: a */
            static Notification.MessagingStyle m38934a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                Notification.MessagingStyle addHistoricMessage;
                addHistoricMessage = messagingStyle.addHistoricMessage(message);
                return addHistoricMessage;
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0711d {
            /* renamed from: a */
            static Notification.MessagingStyle m38933a(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            /* renamed from: b */
            static Notification.MessagingStyle m38932b(Notification.MessagingStyle messagingStyle, boolean z) {
                Notification.MessagingStyle groupConversation;
                groupConversation = messagingStyle.setGroupConversation(z);
                return groupConversation;
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$e */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static final class C0712e {

            /* renamed from: a */
            private final CharSequence f3101a;

            /* renamed from: b */
            private final long f3102b;

            /* renamed from: c */
            private final Person f3103c;

            /* renamed from: d */
            private Bundle f3104d = new Bundle();

            /* renamed from: e */
            private String f3105e;

            /* renamed from: f */
            private Uri f3106f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$e$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0713a {
                /* renamed from: a */
                static Notification.MessagingStyle.Message m38919a(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                /* renamed from: b */
                static Notification.MessagingStyle.Message m38918b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    Notification.MessagingStyle.Message data;
                    data = message.setData(str, uri);
                    return data;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.NotificationCompat$MessagingStyle$e$b */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            public static class C0714b {
                /* renamed from: a */
                static Notification.MessagingStyle.Message m38917a(CharSequence charSequence, long j, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public C0712e(CharSequence charSequence, long j, Person person) {
                this.f3101a = charSequence;
                this.f3102b = j;
                this.f3103c = person;
            }

            /* renamed from: a */
            static Bundle[] m38931a(List<C0712e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m38920l();
                }
                return bundleArr;
            }

            /* renamed from: e */
            static C0712e m38927e(Bundle bundle) {
                Person person;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            person = Person.m38748b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            person = Person.m38749a((android.app.Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            person = new Person.C0756c().m38727f(bundle.getCharSequence("sender")).m38732a();
                        } else {
                            person = null;
                        }
                        C0712e c0712e = new C0712e(bundle.getCharSequence("text"), bundle.getLong("time"), person);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            c0712e.m38922j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            c0712e.m38928d().putAll(bundle.getBundle("extras"));
                        }
                        return c0712e;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: f */
            static List<C0712e> m38926f(Parcelable[] parcelableArr) {
                C0712e m38927e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (m38927e = m38927e((Bundle) parcelable)) != null) {
                        arrayList.add(m38927e);
                    }
                }
                return arrayList;
            }

            /* renamed from: l */
            private Bundle m38920l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3101a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f3102b);
                Person person = this.f3103c;
                if (person != null) {
                    bundle.putCharSequence("sender", person.m38744f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f3103c.m38739k());
                    } else {
                        bundle.putBundle("person", this.f3103c.m38738l());
                    }
                }
                String str = this.f3105e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f3106f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f3104d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* renamed from: b */
            public String m38930b() {
                return this.f3105e;
            }

            /* renamed from: c */
            public Uri m38929c() {
                return this.f3106f;
            }

            /* renamed from: d */
            public Bundle m38928d() {
                return this.f3104d;
            }

            /* renamed from: g */
            public Person m38925g() {
                return this.f3103c;
            }

            /* renamed from: h */
            public CharSequence m38924h() {
                return this.f3101a;
            }

            /* renamed from: i */
            public long m38923i() {
                return this.f3102b;
            }

            /* renamed from: j */
            public C0712e m38922j(String str, Uri uri) {
                this.f3105e = str;
                this.f3106f = uri;
                return this;
            }

            /* renamed from: k */
            Notification.MessagingStyle.Message m38921k() {
                Notification.MessagingStyle.Message m38919a;
                Person m38925g = m38925g();
                CharSequence charSequence = null;
                android.app.Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence m38924h = m38924h();
                    long m38923i = m38923i();
                    if (m38925g != null) {
                        person = m38925g.m38739k();
                    }
                    m38919a = C0714b.m38917a(m38924h, m38923i, person);
                } else {
                    CharSequence m38924h2 = m38924h();
                    long m38923i2 = m38923i();
                    if (m38925g != null) {
                        charSequence = m38925g.m38744f();
                    }
                    m38919a = C0713a.m38919a(m38924h2, m38923i2, charSequence);
                }
                if (m38930b() != null) {
                    C0713a.m38918b(m38919a, m38930b(), m38929c());
                }
                return m38919a;
            }
        }

        MessagingStyle() {
        }

        /* renamed from: A */
        private C0712e m38952A() {
            List<C0712e> list;
            for (int size = this.f3096e.size() - 1; size >= 0; size--) {
                C0712e c0712e = this.f3096e.get(size);
                if (c0712e.m38925g() != null && !TextUtils.isEmpty(c0712e.m38925g().m38744f())) {
                    return c0712e;
                }
            }
            if (!this.f3096e.isEmpty()) {
                return this.f3096e.get(list.size() - 1);
            }
            return null;
        }

        /* renamed from: C */
        private boolean m38950C() {
            for (int size = this.f3096e.size() - 1; size >= 0; size--) {
                C0712e c0712e = this.f3096e.get(size);
                if (c0712e.m38925g() != null && c0712e.m38925g().m38744f() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: E */
        private TextAppearanceSpan m38948E(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        /* renamed from: F */
        private CharSequence m38947F(C0712e c0712e) {
            CharSequence m38744f;
            C1100a m37892c = C1100a.m37892c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (c0712e.m38925g() == null) {
                m38744f = "";
            } else {
                m38744f = c0712e.m38925g().m38744f();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(m38744f)) {
                m38744f = this.f3098g.m38744f();
                if (this.f3138a.m38978j() != 0) {
                    i = this.f3138a.m38978j();
                }
            }
            CharSequence m37887h = m37892c.m37887h(m38744f);
            spannableStringBuilder.append(m37887h);
            spannableStringBuilder.setSpan(m38948E(i), spannableStringBuilder.length() - m37887h.length(), spannableStringBuilder.length(), 33);
            if (c0712e.m38924h() != null) {
                charSequence = c0712e.m38924h();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(m37892c.m37887h(charSequence));
            return spannableStringBuilder;
        }

        /* renamed from: z */
        public static MessagingStyle m38942z(Notification notification) {
            AbstractC0743k m38802p = AbstractC0743k.m38802p(notification);
            if (m38802p instanceof MessagingStyle) {
                return (MessagingStyle) m38802p;
            }
            return null;
        }

        /* renamed from: B */
        public List<C0712e> m38951B() {
            return this.f3096e;
        }

        /* renamed from: D */
        public boolean m38949D() {
            Builder builder = this.f3138a;
            if (builder != null && builder.f3070a.getApplicationInfo().targetSdkVersion < 28 && this.f3100i == null) {
                if (this.f3099h == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f3100i;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        /* renamed from: G */
        public MessagingStyle m38946G(CharSequence charSequence) {
            this.f3099h = charSequence;
            return this;
        }

        /* renamed from: H */
        public MessagingStyle m38945H(boolean z) {
            this.f3100i = Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: a */
        public void mo38817a(Bundle bundle) {
            super.mo38817a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f3098g.m38744f());
            bundle.putBundle("android.messagingStyleUser", this.f3098g.m38738l());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f3099h);
            if (this.f3099h != null && this.f3100i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f3099h);
            }
            if (!this.f3096e.isEmpty()) {
                bundle.putParcelableArray("android.messages", C0712e.m38931a(this.f3096e));
            }
            if (!this.f3097f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", C0712e.m38931a(this.f3097f));
            }
            Boolean bool = this.f3100i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: b */
        public void mo38816b(InterfaceC0864o interfaceC0864o) {
            boolean z;
            CharSequence m38924h;
            CharSequence m38924h2;
            Notification.MessagingStyle m38936b;
            m38945H(m38949D());
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (i >= 28) {
                    m38936b = C0711d.m38933a(this.f3098g.m38739k());
                } else {
                    m38936b = C0709b.m38936b(this.f3098g.m38744f());
                }
                for (C0712e c0712e : this.f3096e) {
                    C0709b.m38937a(m38936b, c0712e.m38921k());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (C0712e c0712e2 : this.f3097f) {
                        C0710c.m38934a(m38936b, c0712e2.m38921k());
                    }
                }
                if (this.f3100i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    C0709b.m38935c(m38936b, this.f3099h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    C0711d.m38932b(m38936b, this.f3100i.booleanValue());
                }
                C0708a.m38938d(m38936b, interfaceC0864o.mo38470a());
                return;
            }
            C0712e m38952A = m38952A();
            if (this.f3099h != null && this.f3100i.booleanValue()) {
                interfaceC0864o.mo38470a().setContentTitle(this.f3099h);
            } else if (m38952A != null) {
                interfaceC0864o.mo38470a().setContentTitle("");
                if (m38952A.m38925g() != null) {
                    interfaceC0864o.mo38470a().setContentTitle(m38952A.m38925g().m38744f());
                }
            }
            if (m38952A != null) {
                Notification.Builder mo38470a = interfaceC0864o.mo38470a();
                if (this.f3099h != null) {
                    m38924h2 = m38947F(m38952A);
                } else {
                    m38924h2 = m38952A.m38924h();
                }
                mo38470a.setContentText(m38924h2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f3099h == null && !m38950C()) {
                z = false;
            } else {
                z = true;
            }
            for (int size = this.f3096e.size() - 1; size >= 0; size--) {
                C0712e c0712e3 = this.f3096e.get(size);
                if (z) {
                    m38924h = m38947F(c0712e3);
                } else {
                    m38924h = c0712e3.m38924h();
                }
                if (size != this.f3096e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                spannableStringBuilder.insert(0, m38924h);
            }
            C0708a.m38941a(C0708a.m38939c(C0708a.m38940b(interfaceC0864o.mo38470a()), null), spannableStringBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: f */
        protected void mo38812f(Bundle bundle) {
            super.mo38812f(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: q */
        protected String mo38801q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.NotificationCompat.AbstractC0743k
        /* renamed from: v */
        protected void mo38796v(Bundle bundle) {
            super.mo38796v(bundle);
            this.f3096e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f3098g = Person.m38748b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f3098g = new Person.C0756c().m38727f(bundle.getString("android.selfDisplayName")).m38732a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f3099h = charSequence;
            if (charSequence == null) {
                this.f3099h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f3096e.addAll(C0712e.m38926f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f3097f.addAll(C0712e.m38926f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f3100i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        /* renamed from: x */
        public MessagingStyle m38944x(C0712e c0712e) {
            if (c0712e != null) {
                this.f3096e.add(c0712e);
                if (this.f3096e.size() > 25) {
                    this.f3096e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: y */
        public MessagingStyle m38943y(CharSequence charSequence, long j, Person person) {
            m38944x(new C0712e(charSequence, j, person));
            return this;
        }

        public MessagingStyle(Person person) {
            if (!TextUtils.isEmpty(person.m38744f())) {
                this.f3098g = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class Builder {

        /* renamed from: A */
        boolean f3046A;

        /* renamed from: B */
        boolean f3047B;

        /* renamed from: C */
        boolean f3048C;

        /* renamed from: D */
        String f3049D;

        /* renamed from: E */
        Bundle f3050E;

        /* renamed from: F */
        int f3051F;

        /* renamed from: G */
        int f3052G;

        /* renamed from: H */
        Notification f3053H;

        /* renamed from: I */
        RemoteViews f3054I;

        /* renamed from: J */
        RemoteViews f3055J;

        /* renamed from: K */
        RemoteViews f3056K;

        /* renamed from: L */
        String f3057L;

        /* renamed from: M */
        int f3058M;

        /* renamed from: N */
        String f3059N;

        /* renamed from: O */
        C0958g f3060O;

        /* renamed from: P */
        long f3061P;

        /* renamed from: Q */
        int f3062Q;

        /* renamed from: R */
        int f3063R;

        /* renamed from: S */
        boolean f3064S;

        /* renamed from: T */
        C0725g f3065T;

        /* renamed from: U */
        Notification f3066U;

        /* renamed from: V */
        boolean f3067V;

        /* renamed from: W */
        Object f3068W;
        @Deprecated

        /* renamed from: X */
        public ArrayList<String> f3069X;

        /* renamed from: a */
        public Context f3070a;

        /* renamed from: b */
        public ArrayList<Action> f3071b;

        /* renamed from: c */
        public ArrayList<Person> f3072c;

        /* renamed from: d */
        ArrayList<Action> f3073d;

        /* renamed from: e */
        CharSequence f3074e;

        /* renamed from: f */
        CharSequence f3075f;

        /* renamed from: g */
        PendingIntent f3076g;

        /* renamed from: h */
        PendingIntent f3077h;

        /* renamed from: i */
        RemoteViews f3078i;

        /* renamed from: j */
        Bitmap f3079j;

        /* renamed from: k */
        CharSequence f3080k;

        /* renamed from: l */
        int f3081l;

        /* renamed from: m */
        int f3082m;

        /* renamed from: n */
        boolean f3083n;

        /* renamed from: o */
        boolean f3084o;

        /* renamed from: p */
        boolean f3085p;

        /* renamed from: q */
        AbstractC0743k f3086q;

        /* renamed from: r */
        CharSequence f3087r;

        /* renamed from: s */
        CharSequence f3088s;

        /* renamed from: t */
        CharSequence[] f3089t;

        /* renamed from: u */
        int f3090u;

        /* renamed from: v */
        int f3091v;

        /* renamed from: w */
        boolean f3092w;

        /* renamed from: x */
        String f3093x;

        /* renamed from: y */
        boolean f3094y;

        /* renamed from: z */
        String f3095z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.NotificationCompat$Builder$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0706a {
            /* renamed from: a */
            static AudioAttributes m38958a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            static AudioAttributes.Builder m38957b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            static AudioAttributes.Builder m38956c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            /* renamed from: d */
            static AudioAttributes.Builder m38955d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            /* renamed from: e */
            static AudioAttributes.Builder m38954e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        /* renamed from: androidx.core.app.NotificationCompat$Builder$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0707b {
            /* renamed from: a */
            static Icon m38953a(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        public Builder(Context context, Notification notification) {
            this(context, NotificationCompat.m39068f(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            AbstractC0743k m38802p = AbstractC0743k.m38802p(notification);
            m39018E(NotificationCompat.m39064j(notification)).m39019D(NotificationCompat.m39065i(notification)).m39021B(NotificationCompat.m39066h(notification)).m38985f0(NotificationCompat.m39050x(notification)).m39001V(NotificationCompat.m39054t(notification)).m38987e0(m38802p).m39020C(notification.contentIntent).m39013J(NotificationCompat.m39062l(notification)).m39012K(NotificationCompat.m39074B(notification)).m39008O(NotificationCompat.m39058p(notification)).m38973l0(notification.when).m38999X(NotificationCompat.m39052v(notification)).m38979i0(NotificationCompat.m39048z(notification)).m38965t(NotificationCompat.m39072b(notification)).m39005R(NotificationCompat.m39056r(notification)).m39006Q(NotificationCompat.m39057q(notification)).m39009N(NotificationCompat.m39059o(notification)).m39011L(notification.largeIcon).m38964u(NotificationCompat.m39071c(notification)).m38962w(NotificationCompat.m39069e(notification)).m38963v(NotificationCompat.m39070d(notification)).m39007P(notification.number).m38983g0(notification.tickerText).m39020C(notification.contentIntent).m39016G(notification.deleteIntent).m39014I(notification.fullScreenIntent, NotificationCompat.m39061m(notification)).m38989d0(notification.sound, notification.audioStreamType).m38977j0(notification.vibrate).m39010M(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).m39017F(notification.defaults).m39004S(notification.priority).m38959z(NotificationCompat.m39067g(notification)).m38975k0(NotificationCompat.m39075A(notification)).m39002U(NotificationCompat.m39055s(notification)).m38993b0(NotificationCompat.m39051w(notification)).m38981h0(NotificationCompat.m39049y(notification)).m39000W(NotificationCompat.m39053u(notification)).m39003T(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).m38966s(NotificationCompat.m39073a(notification)).m38995a0(notification.icon, notification.iconLevel).m38992c(m38972m(notification, m38802p));
            this.f3068W = C0707b.m38953a(notification);
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    m38994b(Action.C0699a.m39034d(action).m39036b());
                }
            }
            List<Action> m39060n = NotificationCompat.m39060n(notification);
            if (!m39060n.isEmpty()) {
                for (Action action2 : m39060n) {
                    m38990d(action2);
                }
            }
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    m38986f(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list")) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    m38988e(Person.m38749a((android.app.Person) it.next()));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey("android.chronometerCountDown")) {
                m38960y(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (i < 26 || !bundle.containsKey("android.colorized")) {
                return;
            }
            m39022A(bundle.getBoolean("android.colorized"));
        }

        /* renamed from: H */
        private void m39015H(int i, boolean z) {
            if (z) {
                Notification notification = this.f3066U;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f3066U;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: m */
        private static Bundle m38972m(Notification notification, AbstractC0743k abstractC0743k) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (abstractC0743k != null) {
                abstractC0743k.mo38812f(bundle);
            }
            return bundle;
        }

        /* renamed from: q */
        protected static CharSequence m38968q(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: r */
        private Bitmap m38967r(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f3070a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C12808c.f33184b);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C12808c.f33183a);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        /* renamed from: A */
        public Builder m39022A(boolean z) {
            this.f3047B = z;
            this.f3048C = true;
            return this;
        }

        /* renamed from: B */
        public Builder m39021B(CharSequence charSequence) {
            this.f3080k = m38968q(charSequence);
            return this;
        }

        /* renamed from: C */
        public Builder m39020C(PendingIntent pendingIntent) {
            this.f3076g = pendingIntent;
            return this;
        }

        /* renamed from: D */
        public Builder m39019D(CharSequence charSequence) {
            this.f3075f = m38968q(charSequence);
            return this;
        }

        /* renamed from: E */
        public Builder m39018E(CharSequence charSequence) {
            this.f3074e = m38968q(charSequence);
            return this;
        }

        /* renamed from: F */
        public Builder m39017F(int i) {
            Notification notification = this.f3066U;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: G */
        public Builder m39016G(PendingIntent pendingIntent) {
            this.f3066U.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: I */
        public Builder m39014I(PendingIntent pendingIntent, boolean z) {
            this.f3077h = pendingIntent;
            m39015H(128, z);
            return this;
        }

        /* renamed from: J */
        public Builder m39013J(String str) {
            this.f3093x = str;
            return this;
        }

        /* renamed from: K */
        public Builder m39012K(boolean z) {
            this.f3094y = z;
            return this;
        }

        /* renamed from: L */
        public Builder m39011L(Bitmap bitmap) {
            this.f3079j = m38967r(bitmap);
            return this;
        }

        /* renamed from: M */
        public Builder m39010M(int i, int i2, int i3) {
            int i4;
            Notification notification = this.f3066U;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 != 0 && i3 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        /* renamed from: N */
        public Builder m39009N(boolean z) {
            this.f3046A = z;
            return this;
        }

        /* renamed from: O */
        public Builder m39008O(C0958g c0958g) {
            this.f3060O = c0958g;
            return this;
        }

        /* renamed from: P */
        public Builder m39007P(int i) {
            this.f3081l = i;
            return this;
        }

        /* renamed from: Q */
        public Builder m39006Q(boolean z) {
            m39015H(2, z);
            return this;
        }

        /* renamed from: R */
        public Builder m39005R(boolean z) {
            m39015H(8, z);
            return this;
        }

        /* renamed from: S */
        public Builder m39004S(int i) {
            this.f3082m = i;
            return this;
        }

        /* renamed from: T */
        public Builder m39003T(int i, int i2, boolean z) {
            this.f3090u = i;
            this.f3091v = i2;
            this.f3092w = z;
            return this;
        }

        /* renamed from: U */
        public Builder m39002U(Notification notification) {
            this.f3053H = notification;
            return this;
        }

        /* renamed from: V */
        public Builder m39001V(CharSequence charSequence) {
            this.f3088s = m38968q(charSequence);
            return this;
        }

        /* renamed from: W */
        public Builder m39000W(String str) {
            this.f3059N = str;
            return this;
        }

        /* renamed from: X */
        public Builder m38999X(boolean z) {
            this.f3083n = z;
            return this;
        }

        /* renamed from: Y */
        public Builder m38998Y(boolean z) {
            this.f3067V = z;
            return this;
        }

        /* renamed from: Z */
        public Builder m38997Z(int i) {
            this.f3066U.icon = i;
            return this;
        }

        /* renamed from: a */
        public Builder m38996a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3071b.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a0 */
        public Builder m38995a0(int i, int i2) {
            Notification notification = this.f3066U;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        /* renamed from: b */
        public Builder m38994b(Action action) {
            if (action != null) {
                this.f3071b.add(action);
            }
            return this;
        }

        /* renamed from: b0 */
        public Builder m38993b0(String str) {
            this.f3095z = str;
            return this;
        }

        /* renamed from: c */
        public Builder m38992c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f3050E;
                if (bundle2 == null) {
                    this.f3050E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: c0 */
        public Builder m38991c0(Uri uri) {
            Notification notification = this.f3066U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder m38954e = C0706a.m38954e(C0706a.m38956c(C0706a.m38957b(), 4), 5);
            this.f3066U.audioAttributes = C0706a.m38958a(m38954e);
            return this;
        }

        /* renamed from: d */
        public Builder m38990d(Action action) {
            if (action != null) {
                this.f3073d.add(action);
            }
            return this;
        }

        /* renamed from: d0 */
        public Builder m38989d0(Uri uri, int i) {
            Notification notification = this.f3066U;
            notification.sound = uri;
            notification.audioStreamType = i;
            AudioAttributes.Builder m38955d = C0706a.m38955d(C0706a.m38956c(C0706a.m38957b(), 4), i);
            this.f3066U.audioAttributes = C0706a.m38958a(m38955d);
            return this;
        }

        /* renamed from: e */
        public Builder m38988e(Person person) {
            if (person != null) {
                this.f3072c.add(person);
            }
            return this;
        }

        /* renamed from: e0 */
        public Builder m38987e0(AbstractC0743k abstractC0743k) {
            if (this.f3086q != abstractC0743k) {
                this.f3086q = abstractC0743k;
                if (abstractC0743k != null) {
                    abstractC0743k.m38795w(this);
                }
            }
            return this;
        }

        @Deprecated
        /* renamed from: f */
        public Builder m38986f(String str) {
            if (str != null && !str.isEmpty()) {
                this.f3069X.add(str);
            }
            return this;
        }

        /* renamed from: f0 */
        public Builder m38985f0(CharSequence charSequence) {
            this.f3087r = m38968q(charSequence);
            return this;
        }

        /* renamed from: g */
        public Notification m38984g() {
            return new C0921x2(this).m38468c();
        }

        /* renamed from: g0 */
        public Builder m38983g0(CharSequence charSequence) {
            this.f3066U.tickerText = m38968q(charSequence);
            return this;
        }

        /* renamed from: h */
        public Builder m38982h() {
            this.f3071b.clear();
            return this;
        }

        /* renamed from: h0 */
        public Builder m38981h0(long j) {
            this.f3061P = j;
            return this;
        }

        /* renamed from: i */
        public RemoteViews m38980i() {
            return this.f3055J;
        }

        /* renamed from: i0 */
        public Builder m38979i0(boolean z) {
            this.f3084o = z;
            return this;
        }

        /* renamed from: j */
        public int m38978j() {
            return this.f3051F;
        }

        /* renamed from: j0 */
        public Builder m38977j0(long[] jArr) {
            this.f3066U.vibrate = jArr;
            return this;
        }

        /* renamed from: k */
        public RemoteViews m38976k() {
            return this.f3054I;
        }

        /* renamed from: k0 */
        public Builder m38975k0(int i) {
            this.f3052G = i;
            return this;
        }

        /* renamed from: l */
        public Bundle m38974l() {
            if (this.f3050E == null) {
                this.f3050E = new Bundle();
            }
            return this.f3050E;
        }

        /* renamed from: l0 */
        public Builder m38973l0(long j) {
            this.f3066U.when = j;
            return this;
        }

        /* renamed from: n */
        public RemoteViews m38971n() {
            return this.f3056K;
        }

        /* renamed from: o */
        public int m38970o() {
            return this.f3082m;
        }

        /* renamed from: p */
        public long m38969p() {
            if (this.f3083n) {
                return this.f3066U.when;
            }
            return 0L;
        }

        /* renamed from: s */
        public Builder m38966s(boolean z) {
            this.f3064S = z;
            return this;
        }

        /* renamed from: t */
        public Builder m38965t(boolean z) {
            m39015H(16, z);
            return this;
        }

        /* renamed from: u */
        public Builder m38964u(int i) {
            this.f3058M = i;
            return this;
        }

        /* renamed from: v */
        public Builder m38963v(C0725g c0725g) {
            this.f3065T = c0725g;
            return this;
        }

        /* renamed from: w */
        public Builder m38962w(String str) {
            this.f3049D = str;
            return this;
        }

        /* renamed from: x */
        public Builder m38961x(String str) {
            this.f3057L = str;
            return this;
        }

        /* renamed from: y */
        public Builder m38960y(boolean z) {
            this.f3085p = z;
            m38974l().putBoolean("android.chronometerCountDown", z);
            return this;
        }

        /* renamed from: z */
        public Builder m38959z(int i) {
            this.f3051F = i;
            return this;
        }

        public Builder(Context context, String str) {
            this.f3071b = new ArrayList<>();
            this.f3072c = new ArrayList<>();
            this.f3073d = new ArrayList<>();
            this.f3083n = true;
            this.f3046A = false;
            this.f3051F = 0;
            this.f3052G = 0;
            this.f3058M = 0;
            this.f3062Q = 0;
            this.f3063R = 0;
            Notification notification = new Notification();
            this.f3066U = notification;
            this.f3070a = context;
            this.f3057L = str;
            notification.when = System.currentTimeMillis();
            this.f3066U.audioStreamType = -1;
            this.f3082m = 0;
            this.f3069X = new ArrayList<>();
            this.f3064S = true;
        }

        @Deprecated
        public Builder(Context context) {
            this(context, (String) null);
        }
    }
}
