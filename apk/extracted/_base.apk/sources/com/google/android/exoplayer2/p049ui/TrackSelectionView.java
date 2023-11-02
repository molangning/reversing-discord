package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p099f8.AbstractC6341j;
import p099f8.C6325f;
import p118g8.C6567c;
import p118g8.C6574j;
import p118g8.C6575k;
import p118g8.InterfaceC6577m;
import p195k8.C9149a;
import p229m7.C10344s0;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: j */
    private final int f12144j;

    /* renamed from: k */
    private final LayoutInflater f12145k;

    /* renamed from: l */
    private final CheckedTextView f12146l;

    /* renamed from: m */
    private final CheckedTextView f12147m;

    /* renamed from: n */
    private final View$OnClickListenerC4495b f12148n;

    /* renamed from: o */
    private final SparseArray<C6325f.C6332f> f12149o;

    /* renamed from: p */
    private boolean f12150p;

    /* renamed from: q */
    private boolean f12151q;

    /* renamed from: r */
    private InterfaceC6577m f12152r;

    /* renamed from: s */
    private CheckedTextView[][] f12153s;

    /* renamed from: t */
    private AbstractC6341j.C6342a f12154t;

    /* renamed from: u */
    private int f12155u;

    /* renamed from: v */
    private TrackGroupArray f12156v;

    /* renamed from: w */
    private boolean f12157w;

    /* renamed from: x */
    private Comparator<C4496c> f12158x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC4495b implements View.OnClickListener {
        private View$OnClickListenerC4495b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m28833d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4496c {

        /* renamed from: a */
        public final int f12160a;

        /* renamed from: b */
        public final int f12161b;

        /* renamed from: c */
        public final Format f12162c;

        public C4496c(int i, int i2, Format format) {
            this.f12160a = i;
            this.f12161b = i2;
            this.f12162c = format;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private static int[] m28835b(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    /* renamed from: c */
    private static int[] m28834c(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m28833d(View view) {
        if (view == this.f12146l) {
            m28831f();
        } else if (view == this.f12147m) {
            m28832e();
        } else {
            m28830g(view);
        }
        m28827j();
    }

    /* renamed from: e */
    private void m28832e() {
        this.f12157w = false;
        this.f12149o.clear();
    }

    /* renamed from: f */
    private void m28831f() {
        this.f12157w = true;
        this.f12149o.clear();
    }

    /* renamed from: g */
    private void m28830g(View view) {
        boolean z;
        this.f12157w = false;
        C4496c c4496c = (C4496c) C9149a.m16448e(view.getTag());
        int i = c4496c.f12160a;
        int i2 = c4496c.f12161b;
        C6325f.C6332f c6332f = this.f12149o.get(i);
        C9149a.m16448e(this.f12154t);
        if (c6332f == null) {
            if (!this.f12151q && this.f12149o.size() > 0) {
                this.f12149o.clear();
            }
            this.f12149o.put(i, new C6325f.C6332f(i, i2));
            return;
        }
        int i3 = c6332f.f17939l;
        int[] iArr = c6332f.f17938k;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean m28829h = m28829h(i);
        if (!m28829h && !m28828i()) {
            z = false;
        } else {
            z = true;
        }
        if (isChecked && z) {
            if (i3 == 1) {
                this.f12149o.remove(i);
            } else {
                this.f12149o.put(i, new C6325f.C6332f(i, m28834c(iArr, i2)));
            }
        } else if (!isChecked) {
            if (m28829h) {
                this.f12149o.put(i, new C6325f.C6332f(i, m28835b(iArr, i2)));
            } else {
                this.f12149o.put(i, new C6325f.C6332f(i, i2));
            }
        }
    }

    @RequiresNonNull({"mappedTrackInfo"})
    /* renamed from: h */
    private boolean m28829h(int i) {
        if (!this.f12150p || this.f12156v.m29144a(i).f27056j <= 1 || this.f12154t.m22897a(this.f12155u, i, false) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m28828i() {
        return this.f12151q && this.f12156v.f11764j > 1;
    }

    /* renamed from: j */
    private void m28827j() {
        boolean z;
        this.f12146l.setChecked(this.f12157w);
        CheckedTextView checkedTextView = this.f12147m;
        if (!this.f12157w && this.f12149o.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        checkedTextView.setChecked(z);
        for (int i = 0; i < this.f12153s.length; i++) {
            C6325f.C6332f c6332f = this.f12149o.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f12153s[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c6332f != null) {
                        this.f12153s[i][i2].setChecked(c6332f.m22921a(((C4496c) C9149a.m16448e(checkedTextViewArr[i2].getTag())).f12161b));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: k */
    private void m28826k() {
        int i;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f12154t == null) {
            this.f12146l.setEnabled(false);
            this.f12147m.setEnabled(false);
            return;
        }
        this.f12146l.setEnabled(true);
        this.f12147m.setEnabled(true);
        TrackGroupArray m22893e = this.f12154t.m22893e(this.f12155u);
        this.f12156v = m22893e;
        this.f12153s = new CheckedTextView[m22893e.f11764j];
        boolean m28828i = m28828i();
        int i2 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f12156v;
            if (i2 < trackGroupArray.f11764j) {
                C10344s0 m29144a = trackGroupArray.m29144a(i2);
                boolean m28829h = m28829h(i2);
                CheckedTextView[][] checkedTextViewArr = this.f12153s;
                int i3 = m29144a.f27056j;
                checkedTextViewArr[i2] = new CheckedTextView[i3];
                C4496c[] c4496cArr = new C4496c[i3];
                for (int i4 = 0; i4 < m29144a.f27056j; i4++) {
                    c4496cArr[i4] = new C4496c(i2, i4, m29144a.m11721a(i4));
                }
                Comparator<C4496c> comparator = this.f12158x;
                if (comparator != null) {
                    Arrays.sort(c4496cArr, comparator);
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    if (i5 == 0) {
                        addView(this.f12145k.inflate(C6574j.f18641a, (ViewGroup) this, false));
                    }
                    if (!m28829h && !m28828i) {
                        i = 17367055;
                    } else {
                        i = 17367056;
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f12145k.inflate(i, (ViewGroup) this, false);
                    checkedTextView.setBackgroundResource(this.f12144j);
                    checkedTextView.setText(this.f12152r.mo22388a(c4496cArr[i5].f12162c));
                    checkedTextView.setTag(c4496cArr[i5]);
                    if (this.f12154t.m22892f(this.f12155u, i2, i5) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.f12148n);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f12153s[i2][i5] = checkedTextView;
                    addView(checkedTextView);
                }
                i2++;
            } else {
                m28827j();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f12157w;
    }

    public List<C6325f.C6332f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f12149o.size());
        for (int i = 0; i < this.f12149o.size(); i++) {
            arrayList.add(this.f12149o.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f12150p != z) {
            this.f12150p = z;
            m28826k();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f12151q != z) {
            this.f12151q = z;
            if (!z && this.f12149o.size() > 1) {
                for (int size = this.f12149o.size() - 1; size > 0; size--) {
                    this.f12149o.remove(size);
                }
            }
            m28826k();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f12146l.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC6577m interfaceC6577m) {
        this.f12152r = (InterfaceC6577m) C9149a.m16448e(interfaceC6577m);
        m28826k();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f12149o = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f12144j = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f12145k = from;
        View$OnClickListenerC4495b view$OnClickListenerC4495b = new View$OnClickListenerC4495b();
        this.f12148n = view$OnClickListenerC4495b;
        this.f12152r = new C6567c(getResources());
        this.f12156v = TrackGroupArray.f11763m;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f12146l = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C6575k.f18660q);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(view$OnClickListenerC4495b);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C6574j.f18641a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f12147m = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C6575k.f18659p);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(view$OnClickListenerC4495b);
        addView(checkedTextView2);
    }
}
