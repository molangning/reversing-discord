package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1929a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f5333b;

    /* renamed from: a */
    private LinearLayoutManager f5334a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1930a implements Comparator<int[]> {
        C1930a() {
            C1929a.this = r1;
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5333b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C1929a(LinearLayoutManager linearLayoutManager) {
        this.f5334a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m34968a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int m35736U = this.f5334a.m35736U();
        if (m35736U == 0) {
            return true;
        }
        if (this.f5334a.m35806w2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, m35736U, 2);
        for (int i3 = 0; i3 < m35736U; i3++) {
            View m35739T = this.f5334a.m35739T(i3);
            if (m35739T != null) {
                ViewGroup.LayoutParams layoutParams = m35739T.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f5333b;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = m35739T.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = m35739T.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = m35739T.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = m35739T.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C1930a());
        for (int i4 = 1; i4 < m35736U; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        int i7 = i5 - i6;
        if (i6 <= 0 && iArr[m35736U - 1][1] >= i7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m34967b() {
        int m35736U = this.f5334a.m35736U();
        for (int i = 0; i < m35736U; i++) {
            if (m34966c(this.f5334a.m35739T(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m34966c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m34966c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m34965d() {
        if ((!m34968a() || this.f5334a.m35736U() <= 1) && m34967b()) {
            return true;
        }
        return false;
    }
}