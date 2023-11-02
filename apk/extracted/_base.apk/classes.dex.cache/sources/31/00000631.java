package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FocusStrategy {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface BoundsAdapter<T> {
        /* renamed from: a */
        void mo36808a(T t, Rect rect);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface CollectionAdapter<T, V> {
        /* renamed from: a */
        V mo36807a(T t, int i);

        /* renamed from: b */
        int mo36806b(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.customview.widget.FocusStrategy$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1449a<T> implements Comparator<T> {

        /* renamed from: j */
        private final Rect f3793j = new Rect();

        /* renamed from: k */
        private final Rect f3794k = new Rect();

        /* renamed from: l */
        private final boolean f3795l;

        /* renamed from: m */
        private final BoundsAdapter<T> f3796m;

        C1449a(boolean z, BoundsAdapter<T> boundsAdapter) {
            this.f3795l = z;
            this.f3796m = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f3793j;
            Rect rect2 = this.f3794k;
            this.f3796m.mo36808a(t, rect);
            this.f3796m.mo36808a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (!this.f3795l) {
                    return -1;
                }
                return 1;
            } else if (i3 > i4) {
                if (this.f3795l) {
                    return -1;
                }
                return 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (!this.f3795l) {
                        return -1;
                    }
                    return 1;
                } else if (i7 > i8) {
                    if (this.f3795l) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m36823a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m36822b = m36822b(i, rect, rect2);
        if (m36822b(i, rect, rect3) || !m36822b) {
            return false;
        }
        if (m36814j(i, rect, rect3) && i != 17 && i != 66 && m36813k(i, rect, rect2) >= m36811m(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m36822b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static <L, T> T m36821c(L l, CollectionAdapter<L, T> collectionAdapter, BoundsAdapter<T> boundsAdapter, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int mo36806b = collectionAdapter.mo36806b(l);
        Rect rect3 = new Rect();
        T t2 = null;
        for (int i2 = 0; i2 < mo36806b; i2++) {
            T mo36807a = collectionAdapter.mo36807a(l, i2);
            if (mo36807a != t) {
                boundsAdapter.mo36808a(mo36807a, rect3);
                if (m36816h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = mo36807a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m36820d(L l, CollectionAdapter<L, T> collectionAdapter, BoundsAdapter<T> boundsAdapter, T t, int i, boolean z, boolean z2) {
        int mo36806b = collectionAdapter.mo36806b(l);
        ArrayList arrayList = new ArrayList(mo36806b);
        for (int i2 = 0; i2 < mo36806b; i2++) {
            arrayList.add(collectionAdapter.mo36807a(l, i2));
        }
        Collections.sort(arrayList, new C1449a(z, boundsAdapter));
        if (i != 1) {
            if (i == 2) {
                return (T) m36819e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) m36818f(t, arrayList, z2);
    }

    /* renamed from: e */
    private static <T> T m36819e(T t, ArrayList<T> arrayList, boolean z) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t);
        }
        int i = lastIndexOf + 1;
        if (i < size) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    /* renamed from: f */
    private static <T> T m36818f(T t, ArrayList<T> arrayList, boolean z) {
        int indexOf;
        int size = arrayList.size();
        if (t == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t);
        }
        int i = indexOf - 1;
        if (i >= 0) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    /* renamed from: g */
    private static int m36817g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m36816h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m36815i(rect, rect2, i)) {
            return false;
        }
        if (!m36815i(rect, rect3, i) || m36823a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m36823a(i, rect, rect3, rect2) || m36817g(m36813k(i, rect, rect2), m36809o(i, rect, rect2)) >= m36817g(m36813k(i, rect, rect3), m36809o(i, rect, rect3))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m36815i(Rect rect, Rect rect2, int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 < i3 || rect.bottom <= i3) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 > i7 || rect.top >= i7) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 > i9 || rect.left >= i9) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m36814j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        if (rect.bottom <= rect2.top) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    private static int m36813k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m36812l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m36812l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m36811m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m36810n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m36810n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.bottom;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.right;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.top;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.left;
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m36809o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}