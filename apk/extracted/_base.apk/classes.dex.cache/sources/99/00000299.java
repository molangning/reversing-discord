package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0287a;
import androidx.appcompat.view.menu.InterfaceC0410p;
import androidx.core.util.C1134c;
import androidx.core.view.C1365w0;
import p052d.C5706a;
import p071e.C6029a;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0594w extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: r */
    private static final int[] f2052r = {16843505};

    /* renamed from: j */
    private final AppCompatBackgroundHelper f2053j;

    /* renamed from: k */
    private final Context f2054k;

    /* renamed from: l */
    private AbstractView$OnTouchListenerC0574t0 f2055l;

    /* renamed from: m */
    private SpinnerAdapter f2056m;

    /* renamed from: n */
    private final boolean f2057n;

    /* renamed from: o */
    private InterfaceC0608j f2058o;

    /* renamed from: p */
    int f2059p;

    /* renamed from: q */
    final Rect f2060q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0595a extends AbstractView$OnTouchListenerC0574t0 {

        /* renamed from: s */
        final /* synthetic */ C0602h f2061s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0595a(View view, C0602h c0602h) {
            super(view);
            C0594w.this = r1;
            this.f2061s = c0602h;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
        /* renamed from: b */
        public InterfaceC0410p mo39611b() {
            return this.f2061s;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo39610c() {
            if (!C0594w.this.getInternalPopup().isShowing()) {
                C0594w.this.m39612b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0596b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0596b() {
            C0594w.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0594w.this.getInternalPopup().isShowing()) {
                C0594w.this.m39612b();
            }
            ViewTreeObserver viewTreeObserver = C0594w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0597c.m39609a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C0597c {
        /* renamed from: a */
        static void m39609a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0598d {
        /* renamed from: a */
        static int m39608a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        static int m39607b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        static void m39606c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        static void m39605d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0599e {
        /* renamed from: a */
        static void m39604a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!C1134c.m37835a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class DialogInterface$OnClickListenerC0600f implements InterfaceC0608j, DialogInterface.OnClickListener {

        /* renamed from: j */
        DialogInterfaceC0287a f2064j;

        /* renamed from: k */
        private ListAdapter f2065k;

        /* renamed from: l */
        private CharSequence f2066l;

        DialogInterface$OnClickListenerC0600f() {
            C0594w.this = r1;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: a */
        public int mo39597a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: b */
        public void mo39596b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: d */
        public void mo39595d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        public void dismiss() {
            DialogInterfaceC0287a dialogInterfaceC0287a = this.f2064j;
            if (dialogInterfaceC0287a != null) {
                dialogInterfaceC0287a.dismiss();
                this.f2064j = null;
            }
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: e */
        public CharSequence mo39594e() {
            return this.f2066l;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: f */
        public Drawable mo39593f() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: g */
        public void mo39592g(CharSequence charSequence) {
            this.f2066l = charSequence;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: h */
        public void mo39591h(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: i */
        public void mo39590i(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        public boolean isShowing() {
            DialogInterfaceC0287a dialogInterfaceC0287a = this.f2064j;
            if (dialogInterfaceC0287a != null) {
                return dialogInterfaceC0287a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: j */
        public void mo39589j(int i, int i2) {
            if (this.f2065k == null) {
                return;
            }
            DialogInterfaceC0287a.C0288a c0288a = new DialogInterfaceC0287a.C0288a(C0594w.this.getPopupContext());
            CharSequence charSequence = this.f2066l;
            if (charSequence != null) {
                c0288a.setTitle(charSequence);
            }
            DialogInterfaceC0287a create = c0288a.m40720e(this.f2065k, C0594w.this.getSelectedItemPosition(), this).create();
            this.f2064j = create;
            ListView m40726h = create.m40726h();
            C0598d.m39605d(m40726h, i);
            C0598d.m39606c(m40726h, i2);
            this.f2064j.show();
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: k */
        public int mo39588k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: l */
        public void mo39587l(ListAdapter listAdapter) {
            this.f2065k = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0594w.this.setSelection(i);
            if (C0594w.this.getOnItemClickListener() != null) {
                C0594w.this.performItemClick(null, i, this.f2065k.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.w$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0601g implements ListAdapter, SpinnerAdapter {

        /* renamed from: j */
        private SpinnerAdapter f2068j;

        /* renamed from: k */
        private ListAdapter f2069k;

        public C0601g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2068j = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2069k = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    C0599e.m39604a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC0532j1) {
                    InterfaceC0532j1 interfaceC0532j1 = (InterfaceC0532j1) spinnerAdapter;
                    if (interfaceC0532j1.getDropDownViewTheme() == null) {
                        interfaceC0532j1.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2069k;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2069k;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2068j;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0602h extends C0583v0 implements InterfaceC0608j {

        /* renamed from: S */
        private CharSequence f2070S;

        /* renamed from: T */
        ListAdapter f2071T;

        /* renamed from: U */
        private final Rect f2072U;

        /* renamed from: V */
        private int f2073V;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.w$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0603a implements AdapterView.OnItemClickListener {

            /* renamed from: j */
            final /* synthetic */ C0594w f2075j;

            C0603a(C0594w c0594w) {
                C0602h.this = r1;
                this.f2075j = c0594w;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0594w.this.setSelection(i);
                if (C0594w.this.getOnItemClickListener() != null) {
                    C0602h c0602h = C0602h.this;
                    C0594w.this.performItemClick(view, i, c0602h.f2071T.getItemId(i));
                }
                C0602h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$h$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class ViewTreeObserver$OnGlobalLayoutListenerC0604b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC0604b() {
                C0602h.this = r1;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0602h c0602h = C0602h.this;
                if (!c0602h.m39600S(C0594w.this)) {
                    C0602h.this.dismiss();
                    return;
                }
                C0602h.this.m39602Q();
                C0602h.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$h$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0605c implements PopupWindow.OnDismissListener {

            /* renamed from: j */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2078j;

            C0605c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                C0602h.this = r1;
                this.f2078j = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0594w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2078j);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0602h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            C0594w.this = r1;
            this.f2072U = new Rect();
            m39659B(r1);
            m39653H(true);
            m39648M(0);
            m39651J(new C0603a(r1));
        }

        /* renamed from: Q */
        void m39602Q() {
            int i;
            int m39601R;
            Drawable m39642f = m39642f();
            if (m39642f != null) {
                m39642f.getPadding(C0594w.this.f2060q);
                if (C0616y1.m39572b(C0594w.this)) {
                    i = C0594w.this.f2060q.right;
                } else {
                    i = -C0594w.this.f2060q.left;
                }
            } else {
                Rect rect = C0594w.this.f2060q;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C0594w.this.getPaddingLeft();
            int paddingRight = C0594w.this.getPaddingRight();
            int width = C0594w.this.getWidth();
            C0594w c0594w = C0594w.this;
            int i2 = c0594w.f2059p;
            if (i2 == -2) {
                int m39613a = c0594w.m39613a((SpinnerAdapter) this.f2071T, m39642f());
                int i3 = C0594w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0594w.this.f2060q;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (m39613a > i4) {
                    m39613a = i4;
                }
                m39657D(Math.max(m39613a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m39657D((width - paddingLeft) - paddingRight);
            } else {
                m39657D(i2);
            }
            if (C0616y1.m39572b(C0594w.this)) {
                m39601R = i + (((width - paddingRight) - m39629x()) - m39601R());
            } else {
                m39601R = i + paddingLeft + m39601R();
            }
            m39643d(m39601R);
        }

        /* renamed from: R */
        public int m39601R() {
            return this.f2073V;
        }

        /* renamed from: S */
        boolean m39600S(View view) {
            return C1365w0.m37225T(view) && view.getGlobalVisibleRect(this.f2072U);
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: e */
        public CharSequence mo39594e() {
            return this.f2070S;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: g */
        public void mo39592g(CharSequence charSequence) {
            this.f2070S = charSequence;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: i */
        public void mo39590i(int i) {
            this.f2073V = i;
        }

        @Override // androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: j */
        public void mo39589j(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            m39602Q();
            m39654G(2);
            super.show();
            ListView mo39639n = mo39639n();
            mo39639n.setChoiceMode(1);
            C0598d.m39605d(mo39639n, i);
            C0598d.m39606c(mo39639n, i2);
            m39647N(C0594w.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = C0594w.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC0604b viewTreeObserver$OnGlobalLayoutListenerC0604b = new ViewTreeObserver$OnGlobalLayoutListenerC0604b();
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0604b);
                m39652I(new C0605c(viewTreeObserver$OnGlobalLayoutListenerC0604b));
            }
        }

        @Override // androidx.appcompat.widget.C0583v0, androidx.appcompat.widget.C0594w.InterfaceC0608j
        /* renamed from: l */
        public void mo39587l(ListAdapter listAdapter) {
            super.mo39587l(listAdapter);
            this.f2071T = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0606i extends View.BaseSavedState {
        public static final Parcelable.Creator<C0606i> CREATOR = new C0607a();

        /* renamed from: j */
        boolean f2080j;

        /* renamed from: androidx.appcompat.widget.w$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0607a implements Parcelable.Creator<C0606i> {
            C0607a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0606i createFromParcel(Parcel parcel) {
                return new C0606i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C0606i[] newArray(int i) {
                return new C0606i[i];
            }
        }

        C0606i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f2080j ? (byte) 1 : (byte) 0);
        }

        C0606i(Parcel parcel) {
            super(parcel);
            this.f2080j = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0608j {
        /* renamed from: a */
        int mo39597a();

        /* renamed from: b */
        void mo39596b(Drawable drawable);

        /* renamed from: d */
        void mo39595d(int i);

        void dismiss();

        /* renamed from: e */
        CharSequence mo39594e();

        /* renamed from: f */
        Drawable mo39593f();

        /* renamed from: g */
        void mo39592g(CharSequence charSequence);

        /* renamed from: h */
        void mo39591h(int i);

        /* renamed from: i */
        void mo39590i(int i);

        boolean isShowing();

        /* renamed from: j */
        void mo39589j(int i, int i2);

        /* renamed from: k */
        int mo39588k();

        /* renamed from: l */
        void mo39587l(ListAdapter listAdapter);
    }

    public C0594w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16042K);
    }

    /* renamed from: a */
    int m39613a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f2060q);
            Rect rect = this.f2060q;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    void m39612b() {
        this.f2058o.mo39589j(C0598d.m39607b(this), C0598d.m39608a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40227b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            return interfaceC0608j.mo39597a();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            return interfaceC0608j.mo39588k();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f2058o != null) {
            return this.f2059p;
        }
        return super.getDropDownWidth();
    }

    final InterfaceC0608j getInternalPopup() {
        return this.f2058o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            return interfaceC0608j.mo39593f();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2054k;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        return interfaceC0608j != null ? interfaceC0608j.mo39594e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40226c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40225d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null && interfaceC0608j.isShowing()) {
            this.f2058o.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2058o != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m39613a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0606i c0606i = (C0606i) parcelable;
        super.onRestoreInstanceState(c0606i.getSuperState());
        if (c0606i.f2080j && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0596b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C0606i c0606i = new C0606i(super.onSaveInstanceState());
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null && interfaceC0608j.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        c0606i.f2080j = z;
        return c0606i;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0574t0 abstractView$OnTouchListenerC0574t0 = this.f2055l;
        if (abstractView$OnTouchListenerC0574t0 != null && abstractView$OnTouchListenerC0574t0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            if (!interfaceC0608j.isShowing()) {
                m39612b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40223f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40222g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            interfaceC0608j.mo39590i(i);
            this.f2058o.mo39595d(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            interfaceC0608j.mo39591h(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2058o != null) {
            this.f2059p = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            interfaceC0608j.mo39596b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C6029a.m23853b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0608j interfaceC0608j = this.f2058o;
        if (interfaceC0608j != null) {
            interfaceC0608j.mo39592g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40220i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f2053j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40219j(mode);
        }
    }

    public C0594w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2057n) {
            this.f2056m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2058o != null) {
            Context context = this.f2054k;
            if (context == null) {
                context = getContext();
            }
            this.f2058o.mo39587l(new C0601g(spinnerAdapter, context.getTheme()));
        }
    }

    public C0594w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0060, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0594w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0594w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}