package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p309r.InterfaceC12010a;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0673b extends View {

    /* renamed from: j */
    protected int[] f2596j;

    /* renamed from: k */
    protected int f2597k;

    /* renamed from: l */
    protected Context f2598l;

    /* renamed from: m */
    protected InterfaceC12010a f2599m;

    /* renamed from: n */
    protected boolean f2600n;

    /* renamed from: o */
    protected String f2601o;

    /* renamed from: p */
    private View[] f2602p;

    /* renamed from: q */
    private HashMap<Integer, String> f2603q;

    public AbstractC0673b(Context context) {
        super(context);
        this.f2596j = new int[32];
        this.f2600n = false;
        this.f2602p = null;
        this.f2603q = new HashMap<>();
        this.f2598l = context;
        mo39229g(null);
    }

    /* renamed from: a */
    private void m39245a(String str) {
        if (str == null || str.length() == 0 || this.f2598l == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int m39240f = m39240f(trim);
        if (m39240f != 0) {
            this.f2603q.put(Integer.valueOf(m39240f), trim);
            m39244b(m39240f);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: b */
    private void m39244b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2597k + 1;
        int[] iArr = this.f2596j;
        if (i2 > iArr.length) {
            this.f2596j = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2596j;
        int i3 = this.f2597k;
        iArr2[i3] = i;
        this.f2597k = i3 + 1;
    }

    /* renamed from: e */
    private int m39241e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f2598l.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    private int m39240f(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m39241e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0677e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f2598l.getResources().getIdentifier(str, "id", this.f2598l.getPackageName());
        }
        return i;
    }

    /* renamed from: c */
    public void m39243c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m39242d((ConstraintLayout) parent);
        }
    }

    /* renamed from: d */
    protected void m39242d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2597k; i++) {
            View viewById = constraintLayout.getViewById(this.f2596j[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo39229g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0678f.f2779a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2860m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2601o = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2596j, this.f2597k);
    }

    /* renamed from: h */
    public void mo39239h(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: i */
    public void mo39238i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void m39237j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m39236k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m39235l(ConstraintLayout constraintLayout) {
        String str;
        int m39241e;
        if (isInEditMode()) {
            setIds(this.f2601o);
        }
        InterfaceC12010a interfaceC12010a = this.f2599m;
        if (interfaceC12010a == null) {
            return;
        }
        interfaceC12010a.mo6614b();
        for (int i = 0; i < this.f2597k; i++) {
            int i2 = this.f2596j[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (m39241e = m39241e(constraintLayout, (str = this.f2603q.get(Integer.valueOf(i2))))) != 0) {
                this.f2596j[i] = m39241e;
                this.f2603q.put(Integer.valueOf(m39241e), str);
                viewById = constraintLayout.getViewById(m39241e);
            }
            if (viewById != null) {
                this.f2599m.mo6615a(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f2599m.mo6613c(constraintLayout.mLayoutWidget);
    }

    /* renamed from: m */
    public void m39234m() {
        if (this.f2599m == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2438n0 = (ConstraintWidget) this.f2599m;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2601o;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2600n) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f2601o = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2597k = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m39245a(str.substring(i));
                return;
            } else {
                m39245a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2601o = null;
        this.f2597k = 0;
        for (int i : iArr) {
            m39244b(i);
        }
    }

    public AbstractC0673b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2596j = new int[32];
        this.f2600n = false;
        this.f2602p = null;
        this.f2603q = new HashMap<>();
        this.f2598l = context;
        mo39229g(attributeSet);
    }
}