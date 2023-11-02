package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class Lifecycle {

    /* renamed from: a */
    AtomicReference<Object> f4381a = new AtomicReference<>();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m36132a(State state) {
            return compareTo(state) >= 0;
        }
    }

    /* renamed from: androidx.lifecycle.Lifecycle$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C1650a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4388a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4389b;

        static {
            int[] iArr = new int[EnumC1651b.values().length];
            f4389b = iArr;
            try {
                iArr[EnumC1651b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4389b[EnumC1651b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4389b[EnumC1651b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4389b[EnumC1651b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4389b[EnumC1651b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4389b[EnumC1651b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4389b[EnumC1651b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[State.values().length];
            f4388a = iArr2;
            try {
                iArr2[State.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4388a[State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4388a[State.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4388a[State.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4388a[State.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: androidx.lifecycle.Lifecycle$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC1651b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: a */
        public static EnumC1651b m36131a(State state) {
            int i = C1650a.f4388a[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        /* renamed from: c */
        public static EnumC1651b m36129c(State state) {
            int i = C1650a.f4388a[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        return null;
                    }
                    return ON_CREATE;
                }
                return ON_RESUME;
            }
            return ON_START;
        }

        /* renamed from: d */
        public static EnumC1651b m36128d(State state) {
            int i = C1650a.f4388a[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_RESUME;
                }
                return ON_START;
            }
            return ON_CREATE;
        }

        /* renamed from: b */
        public State m36130b() {
            switch (C1650a.f4389b[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo36125a(InterfaceC1698o interfaceC1698o);

    /* renamed from: b */
    public abstract State mo36124b();

    /* renamed from: c */
    public abstract void mo36123c(InterfaceC1698o interfaceC1698o);
}
