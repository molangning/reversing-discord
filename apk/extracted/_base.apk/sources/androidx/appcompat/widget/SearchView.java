package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.InterfaceC0358b;
import androidx.core.view.C1365w0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p001a0.AbstractC0004a;
import p020b0.AbstractC1964a;
import p052d.C5706a;
import p052d.C5709d;
import p052d.C5711f;
import p052d.C5712g;
import p052d.C5713h;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SearchView extends C0579u0 implements InterfaceC0358b {

    /* renamed from: y0 */
    static final C0454o f1577y0;

    /* renamed from: A */
    private final View f1578A;

    /* renamed from: B */
    private final View f1579B;

    /* renamed from: C */
    final ImageView f1580C;

    /* renamed from: D */
    final ImageView f1581D;

    /* renamed from: E */
    final ImageView f1582E;

    /* renamed from: F */
    final ImageView f1583F;

    /* renamed from: G */
    private final View f1584G;

    /* renamed from: H */
    private C0457q f1585H;

    /* renamed from: I */
    private Rect f1586I;

    /* renamed from: J */
    private Rect f1587J;

    /* renamed from: K */
    private int[] f1588K;

    /* renamed from: L */
    private int[] f1589L;

    /* renamed from: M */
    private final ImageView f1590M;

    /* renamed from: N */
    private final Drawable f1591N;

    /* renamed from: O */
    private final int f1592O;

    /* renamed from: P */
    private final int f1593P;

    /* renamed from: Q */
    private final Intent f1594Q;

    /* renamed from: R */
    private final Intent f1595R;

    /* renamed from: S */
    private final CharSequence f1596S;

    /* renamed from: T */
    private InterfaceC0452m f1597T;

    /* renamed from: U */
    private InterfaceC0451l f1598U;

    /* renamed from: V */
    View.OnFocusChangeListener f1599V;

    /* renamed from: W */
    private View.OnClickListener f1600W;

    /* renamed from: a0 */
    private boolean f1601a0;

    /* renamed from: b0 */
    private boolean f1602b0;

    /* renamed from: c0 */
    AbstractC0004a f1603c0;

    /* renamed from: d0 */
    private boolean f1604d0;

    /* renamed from: e0 */
    private CharSequence f1605e0;

    /* renamed from: f0 */
    private boolean f1606f0;

    /* renamed from: g0 */
    private boolean f1607g0;

    /* renamed from: h0 */
    private int f1608h0;

    /* renamed from: i0 */
    private boolean f1609i0;

    /* renamed from: j0 */
    private CharSequence f1610j0;

    /* renamed from: k0 */
    private CharSequence f1611k0;

    /* renamed from: l0 */
    private boolean f1612l0;

    /* renamed from: m0 */
    private int f1613m0;

    /* renamed from: n0 */
    SearchableInfo f1614n0;

    /* renamed from: o0 */
    private Bundle f1615o0;

    /* renamed from: p0 */
    private final Runnable f1616p0;

    /* renamed from: q0 */
    private Runnable f1617q0;

    /* renamed from: r0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1618r0;

    /* renamed from: s0 */
    private final View.OnClickListener f1619s0;

    /* renamed from: t0 */
    View.OnKeyListener f1620t0;

    /* renamed from: u0 */
    private final TextView.OnEditorActionListener f1621u0;

    /* renamed from: v0 */
    private final AdapterView.OnItemClickListener f1622v0;

    /* renamed from: w0 */
    private final AdapterView.OnItemSelectedListener f1623w0;

    /* renamed from: x0 */
    private TextWatcher f1624x0;

    /* renamed from: y */
    final SearchAutoComplete f1625y;

    /* renamed from: z */
    private final View f1626z;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class SearchAutoComplete extends C0500d {

        /* renamed from: n */
        private int f1627n;

        /* renamed from: o */
        private SearchView f1628o;

        /* renamed from: p */
        private boolean f1629p;

        /* renamed from: q */
        final Runnable f1630q;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC0439a implements Runnable {
            RunnableC0439a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m40093d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C5706a.f16062p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        /* renamed from: b */
        void m40095b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0450k.m40091b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1577y0.m40088c(this);
        }

        /* renamed from: c */
        boolean m40094c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: d */
        void m40093d() {
            if (this.f1629p) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1629p = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1627n <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0500d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1629p) {
                removeCallbacks(this.f1630q);
                post(this.f1630q);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1628o.m40109X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1628o.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1628o.hasFocus() && getVisibility() == 0) {
                this.f1629p = true;
                if (SearchView.m40122K(getContext())) {
                    m40095b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1629p = false;
                removeCallbacks(this.f1630q);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1629p = false;
                removeCallbacks(this.f1630q);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1629p = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1628o = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1627n = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1630q = new RunnableC0439a();
            this.f1627n = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0440a implements TextWatcher {
        C0440a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m40110W(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC0441b implements Runnable {
        RunnableC0441b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m40103d0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC0442c implements Runnable {
        RunnableC0442c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0004a abstractC0004a = SearchView.this.f1603c0;
            if (abstractC0004a instanceof View$OnClickListenerC0524h1) {
                abstractC0004a.mo39875a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class View$OnFocusChangeListenerC0443d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0443d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1599V;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class View$OnLayoutChangeListenerC0444e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0444e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m40096z();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class View$OnClickListenerC0445f implements View.OnClickListener {
        View$OnClickListenerC0445f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1580C) {
                searchView.m40113T();
            } else if (view == searchView.f1582E) {
                searchView.m40117P();
            } else if (view == searchView.f1581D) {
                searchView.m40112U();
            } else if (view == searchView.f1583F) {
                searchView.m40108Y();
            } else if (view == searchView.f1625y) {
                searchView.m40127F();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class View$OnKeyListenerC0446g implements View.OnKeyListener {
        View$OnKeyListenerC0446g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1614n0 == null) {
                return false;
            }
            if (searchView.f1625y.isPopupShowing() && SearchView.this.f1625y.getListSelection() != -1) {
                return SearchView.this.m40111V(view, i, keyEvent);
            }
            if (SearchView.this.f1625y.m40094c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m40119N(0, null, searchView2.f1625y.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0447h implements TextView.OnEditorActionListener {
        C0447h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m40112U();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0448i implements AdapterView.OnItemClickListener {
        C0448i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m40116Q(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0449j implements AdapterView.OnItemSelectedListener {
        C0449j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m40115R(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0450k {
        /* renamed from: a */
        static void m40092a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        static void m40091b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0451l {
        /* renamed from: a */
        boolean mo24969a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0452m {
        /* renamed from: a */
        boolean mo24935a(String str);

        /* renamed from: b */
        boolean mo24934b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0453n {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0454o {

        /* renamed from: a */
        private Method f1642a;

        /* renamed from: b */
        private Method f1643b;

        /* renamed from: c */
        private Method f1644c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0454o() {
            this.f1642a = null;
            this.f1643b = null;
            this.f1644c = null;
            m40087d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1642a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1643b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1644c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m40087d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        /* renamed from: a */
        void m40090a(AutoCompleteTextView autoCompleteTextView) {
            m40087d();
            Method method = this.f1643b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m40089b(AutoCompleteTextView autoCompleteTextView) {
            m40087d();
            Method method = this.f1642a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m40088c(AutoCompleteTextView autoCompleteTextView) {
            m40087d();
            Method method = this.f1644c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0455p extends AbstractC1964a {
        public static final Parcelable.Creator<C0455p> CREATOR = new C0456a();

        /* renamed from: l */
        boolean f1645l;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0456a implements Parcelable.ClassLoaderCreator<C0455p> {
            C0456a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0455p createFromParcel(Parcel parcel) {
                return new C0455p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0455p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0455p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0455p[] newArray(int i) {
                return new C0455p[i];
            }
        }

        C0455p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1645l + "}";
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1645l));
        }

        public C0455p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1645l = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0457q extends TouchDelegate {

        /* renamed from: a */
        private final View f1646a;

        /* renamed from: b */
        private final Rect f1647b;

        /* renamed from: c */
        private final Rect f1648c;

        /* renamed from: d */
        private final Rect f1649d;

        /* renamed from: e */
        private final int f1650e;

        /* renamed from: f */
        private boolean f1651f;

        public C0457q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1650e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1647b = new Rect();
            this.f1649d = new Rect();
            this.f1648c = new Rect();
            m40083a(rect, rect2);
            this.f1646a = view;
        }

        /* renamed from: a */
        public void m40083a(Rect rect, Rect rect2) {
            this.f1647b.set(rect);
            this.f1649d.set(rect);
            Rect rect3 = this.f1649d;
            int i = this.f1650e;
            rect3.inset(-i, -i);
            this.f1648c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z2 = this.f1651f;
                        this.f1651f = false;
                    }
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f1651f;
                    if (z2 && !this.f1649d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1647b.contains(x, y)) {
                    this.f1651f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.f1648c.contains(x, y)) {
                motionEvent.setLocation(this.f1646a.getWidth() / 2, this.f1646a.getHeight() / 2);
            } else {
                Rect rect = this.f1648c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            }
            return this.f1646a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1577y0 = Build.VERSION.SDK_INT < 29 ? new C0454o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private Intent m40132A(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1611k0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1615o0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1614n0.getSearchActivity());
        return intent;
    }

    /* renamed from: B */
    private Intent m40131B(Cursor cursor, int i, String str) {
        int i2;
        Uri parse;
        String m39867n;
        try {
            String m39867n2 = View$OnClickListenerC0524h1.m39867n(cursor, "suggest_intent_action");
            if (m39867n2 == null) {
                m39867n2 = this.f1614n0.getSuggestIntentAction();
            }
            if (m39867n2 == null) {
                m39867n2 = "android.intent.action.SEARCH";
            }
            String str2 = m39867n2;
            String m39867n3 = View$OnClickListenerC0524h1.m39867n(cursor, "suggest_intent_data");
            if (m39867n3 == null) {
                m39867n3 = this.f1614n0.getSuggestIntentData();
            }
            if (m39867n3 != null && (m39867n = View$OnClickListenerC0524h1.m39867n(cursor, "suggest_intent_data_id")) != null) {
                m39867n3 = m39867n3 + "/" + Uri.encode(m39867n);
            }
            if (m39867n3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(m39867n3);
            }
            return m40132A(str2, parse, View$OnClickListenerC0524h1.m39867n(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0524h1.m39867n(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: C */
    private Intent m40130C(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1615o0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: D */
    private Intent m40129D(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    /* renamed from: E */
    private void m40128E() {
        this.f1625y.dismissDropDown();
    }

    /* renamed from: G */
    private void m40126G(View view, Rect rect) {
        view.getLocationInWindow(this.f1588K);
        getLocationInWindow(this.f1589L);
        int[] iArr = this.f1588K;
        int i = iArr[1];
        int[] iArr2 = this.f1589L;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: H */
    private CharSequence m40125H(CharSequence charSequence) {
        if (this.f1601a0 && this.f1591N != null) {
            int textSize = (int) (this.f1625y.getTextSize() * 1.25d);
            this.f1591N.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1591N), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    /* renamed from: I */
    private boolean m40124I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1614n0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1614n0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1594Q;
        } else if (this.f1614n0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1595R;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    static boolean m40122K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: L */
    private boolean m40121L() {
        return (this.f1604d0 || this.f1609i0) && !m40123J();
    }

    /* renamed from: M */
    private void m40120M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e("SearchView", "Failed launch activity: " + intent, e);
        }
    }

    /* renamed from: O */
    private boolean m40118O(int i, int i2, String str) {
        Cursor mo41404c = this.f1603c0.mo41404c();
        if (mo41404c != null && mo41404c.moveToPosition(i)) {
            m40120M(m40131B(mo41404c, i2, str));
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private void m40107Z() {
        post(this.f1616p0);
    }

    /* renamed from: a0 */
    private void m40106a0(int i) {
        Editable text = this.f1625y.getText();
        Cursor mo41404c = this.f1603c0.mo41404c();
        if (mo41404c == null) {
            return;
        }
        if (mo41404c.moveToPosition(i)) {
            CharSequence convertToString = this.f1603c0.convertToString(mo41404c);
            if (convertToString != null) {
                setQuery(convertToString);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    /* renamed from: c0 */
    private void m40104c0() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1625y.getText());
        int i = 0;
        if (!z2 && (!this.f1601a0 || this.f1612l0)) {
            z = false;
        }
        ImageView imageView = this.f1582E;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1582E.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: e0 */
    private void m40102e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1625y;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m40125H(queryHint));
    }

    /* renamed from: f0 */
    private void m40101f0() {
        this.f1625y.setThreshold(this.f1614n0.getSuggestThreshold());
        this.f1625y.setImeOptions(this.f1614n0.getImeOptions());
        int inputType = this.f1614n0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1614n0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1625y.setInputType(inputType);
        AbstractC0004a abstractC0004a = this.f1603c0;
        if (abstractC0004a != null) {
            abstractC0004a.mo39875a(null);
        }
        if (this.f1614n0.getSuggestAuthority() != null) {
            View$OnClickListenerC0524h1 view$OnClickListenerC0524h1 = new View$OnClickListenerC0524h1(getContext(), this, this.f1614n0, this.f1618r0);
            this.f1603c0 = view$OnClickListenerC0524h1;
            this.f1625y.setAdapter(view$OnClickListenerC0524h1);
            View$OnClickListenerC0524h1 view$OnClickListenerC0524h12 = (View$OnClickListenerC0524h1) this.f1603c0;
            if (this.f1606f0) {
                i = 2;
            }
            view$OnClickListenerC0524h12.m39858w(i);
        }
    }

    /* renamed from: g0 */
    private void m40100g0() {
        int i;
        if (m40121L() && (this.f1581D.getVisibility() == 0 || this.f1583F.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.f1579B.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C5709d.f16088g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C5709d.f16089h);
    }

    /* renamed from: h0 */
    private void m40099h0(boolean z) {
        int i;
        if (this.f1604d0 && m40121L() && hasFocus() && (z || !this.f1609i0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.f1581D.setVisibility(i);
    }

    /* renamed from: i0 */
    private void m40098i0(boolean z) {
        int i;
        int i2;
        this.f1602b0 = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f1625y.getText());
        this.f1580C.setVisibility(i);
        m40099h0(z2);
        View view = this.f1626z;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f1590M.getDrawable() == null || this.f1601a0) {
            i3 = 8;
        }
        this.f1590M.setVisibility(i3);
        m40104c0();
        m40097j0(!z2);
        m40100g0();
    }

    /* renamed from: j0 */
    private void m40097j0(boolean z) {
        int i = 8;
        if (this.f1609i0 && !m40123J() && z) {
            this.f1581D.setVisibility(8);
            i = 0;
        }
        this.f1583F.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.f1625y.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1625y;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    /* renamed from: F */
    void m40127F() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0450k.m40092a(this.f1625y);
            return;
        }
        C0454o c0454o = f1577y0;
        c0454o.m40089b(this.f1625y);
        c0454o.m40090a(this.f1625y);
    }

    /* renamed from: J */
    public boolean m40123J() {
        return this.f1602b0;
    }

    /* renamed from: N */
    void m40119N(int i, String str, String str2) {
        getContext().startActivity(m40132A("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: P */
    void m40117P() {
        if (TextUtils.isEmpty(this.f1625y.getText())) {
            if (this.f1601a0) {
                InterfaceC0451l interfaceC0451l = this.f1598U;
                if (interfaceC0451l == null || !interfaceC0451l.mo24969a()) {
                    clearFocus();
                    m40098i0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f1625y.setText("");
        this.f1625y.requestFocus();
        this.f1625y.setImeVisibility(true);
    }

    /* renamed from: Q */
    boolean m40116Q(int i, int i2, String str) {
        m40118O(i, 0, null);
        this.f1625y.setImeVisibility(false);
        m40128E();
        return true;
    }

    /* renamed from: R */
    boolean m40115R(int i) {
        m40106a0(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public void m40114S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: T */
    void m40113T() {
        m40098i0(false);
        this.f1625y.requestFocus();
        this.f1625y.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1600W;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: U */
    void m40112U() {
        Editable text = this.f1625y.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            InterfaceC0452m interfaceC0452m = this.f1597T;
            if (interfaceC0452m == null || !interfaceC0452m.mo24934b(text.toString())) {
                if (this.f1614n0 != null) {
                    m40119N(0, null, text.toString());
                }
                this.f1625y.setImeVisibility(false);
                m40128E();
            }
        }
    }

    /* renamed from: V */
    boolean m40111V(View view, int i, KeyEvent keyEvent) {
        int length;
        if (this.f1614n0 != null && this.f1603c0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i != 66 && i != 84 && i != 61) {
                if (i != 21 && i != 22) {
                    if (i == 19) {
                        this.f1625y.getListSelection();
                        return false;
                    }
                } else {
                    if (i == 21) {
                        length = 0;
                    } else {
                        length = this.f1625y.length();
                    }
                    this.f1625y.setSelection(length);
                    this.f1625y.setListSelection(0);
                    this.f1625y.clearListSelection();
                    this.f1625y.m40095b();
                    return true;
                }
            } else {
                return m40116Q(this.f1625y.getListSelection(), 0, null);
            }
        }
        return false;
    }

    /* renamed from: W */
    void m40110W(CharSequence charSequence) {
        Editable text = this.f1625y.getText();
        this.f1611k0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m40099h0(z);
        m40097j0(!z);
        m40104c0();
        m40100g0();
        if (this.f1597T != null && !TextUtils.equals(charSequence, this.f1610j0)) {
            this.f1597T.mo24935a(charSequence.toString());
        }
        this.f1610j0 = charSequence.toString();
    }

    /* renamed from: X */
    void m40109X() {
        m40098i0(m40123J());
        m40107Z();
        if (this.f1625y.hasFocus()) {
            m40127F();
        }
    }

    /* renamed from: Y */
    void m40108Y() {
        SearchableInfo searchableInfo = this.f1614n0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m40129D(this.f1594Q, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m40130C(this.f1595R, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: b0 */
    public void m40105b0(CharSequence charSequence, boolean z) {
        this.f1625y.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1625y;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1611k0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m40112U();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1607g0 = true;
        super.clearFocus();
        this.f1625y.clearFocus();
        this.f1625y.setImeVisibility(false);
        this.f1607g0 = false;
    }

    /* renamed from: d0 */
    void m40103d0() {
        int[] iArr;
        if (this.f1625y.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1578A.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1579B.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1625y.getImeOptions();
    }

    public int getInputType() {
        return this.f1625y.getInputType();
    }

    public int getMaxWidth() {
        return this.f1608h0;
    }

    public CharSequence getQuery() {
        return this.f1625y.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1605e0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1614n0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1614n0.getHintId());
            }
            return this.f1596S;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1593P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1592O;
    }

    public AbstractC0004a getSuggestionsAdapter() {
        return this.f1603c0;
    }

    @Override // androidx.appcompat.view.InterfaceC0358b
    public void onActionViewCollapsed() {
        m40105b0("", false);
        clearFocus();
        m40098i0(true);
        this.f1625y.setImeOptions(this.f1613m0);
        this.f1612l0 = false;
    }

    @Override // androidx.appcompat.view.InterfaceC0358b
    public void onActionViewExpanded() {
        if (this.f1612l0) {
            return;
        }
        this.f1612l0 = true;
        int imeOptions = this.f1625y.getImeOptions();
        this.f1613m0 = imeOptions;
        this.f1625y.setImeOptions(imeOptions | 33554432);
        this.f1625y.setText("");
        setIconified(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1616p0);
        post(this.f1617q0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m40126G(this.f1625y, this.f1586I);
            Rect rect = this.f1587J;
            Rect rect2 = this.f1586I;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0457q c0457q = this.f1585H;
            if (c0457q == null) {
                C0457q c0457q2 = new C0457q(this.f1587J, this.f1586I, this.f1625y);
                this.f1585H = c0457q2;
                setTouchDelegate(c0457q2);
                return;
            }
            c0457q.m40083a(this.f1587J, this.f1586I);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (m40123J()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.f1608h0) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.f1608h0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.f1608h0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0455p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0455p c0455p = (C0455p) parcelable;
        super.onRestoreInstanceState(c0455p.m34884a());
        m40098i0(c0455p.f1645l);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0455p c0455p = new C0455p(super.onSaveInstanceState());
        c0455p.f1645l = m40123J();
        return c0455p;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m40107Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f1607g0 || !isFocusable()) {
            return false;
        }
        if (!m40123J()) {
            boolean requestFocus = this.f1625y.requestFocus(i, rect);
            if (requestFocus) {
                m40098i0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1615o0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m40117P();
        } else {
            m40113T();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1601a0 == z) {
            return;
        }
        this.f1601a0 = z;
        m40098i0(z);
        m40102e0();
    }

    public void setImeOptions(int i) {
        this.f1625y.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1625y.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1608h0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0451l interfaceC0451l) {
        this.f1598U = interfaceC0451l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1599V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0452m interfaceC0452m) {
        this.f1597T = interfaceC0452m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1600W = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0453n interfaceC0453n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1605e0 = charSequence;
        m40102e0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f1606f0 = z;
        AbstractC0004a abstractC0004a = this.f1603c0;
        if (abstractC0004a instanceof View$OnClickListenerC0524h1) {
            View$OnClickListenerC0524h1 view$OnClickListenerC0524h1 = (View$OnClickListenerC0524h1) abstractC0004a;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            view$OnClickListenerC0524h1.m39858w(i);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1614n0 = searchableInfo;
        if (searchableInfo != null) {
            m40101f0();
            m40102e0();
        }
        boolean m40124I = m40124I();
        this.f1609i0 = m40124I;
        if (m40124I) {
            this.f1625y.setPrivateImeOptions("nm");
        }
        m40098i0(m40123J());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1604d0 = z;
        m40098i0(m40123J());
    }

    public void setSuggestionsAdapter(AbstractC0004a abstractC0004a) {
        this.f1603c0 = abstractC0004a;
        this.f1625y.setAdapter(abstractC0004a);
    }

    /* renamed from: z */
    void m40096z() {
        int i;
        int i2;
        if (this.f1584G.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1578A.getPaddingLeft();
            Rect rect = new Rect();
            boolean m39572b = C0616y1.m39572b(this);
            if (this.f1601a0) {
                i = resources.getDimensionPixelSize(C5709d.f16086e) + resources.getDimensionPixelSize(C5709d.f16087f);
            } else {
                i = 0;
            }
            this.f1625y.getDropDownBackground().getPadding(rect);
            if (m39572b) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f1625y.setDropDownHorizontalOffset(i2);
            this.f1625y.setDropDownWidth((((this.f1584G.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16040I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1586I = new Rect();
        this.f1587J = new Rect();
        this.f1588K = new int[2];
        this.f1589L = new int[2];
        this.f1616p0 = new RunnableC0441b();
        this.f1617q0 = new RunnableC0442c();
        this.f1618r0 = new WeakHashMap<>();
        View$OnClickListenerC0445f view$OnClickListenerC0445f = new View$OnClickListenerC0445f();
        this.f1619s0 = view$OnClickListenerC0445f;
        this.f1620t0 = new View$OnKeyListenerC0446g();
        C0447h c0447h = new C0447h();
        this.f1621u0 = c0447h;
        C0448i c0448i = new C0448i();
        this.f1622v0 = c0448i;
        C0449j c0449j = new C0449j();
        this.f1623w0 = c0449j;
        this.f1624x0 = new C0440a();
        int[] iArr = C5715j.f16373f2;
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, iArr, i, 0);
        C1365w0.m37189o0(this, context, iArr, attributeSet, m39780v.m39784r(), i, 0);
        LayoutInflater.from(context).inflate(m39780v.m39788n(C5715j.f16423p2, C5712g.f16202r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C5711f.f16146E);
        this.f1625y = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1626z = findViewById(C5711f.f16142A);
        View findViewById = findViewById(C5711f.f16145D);
        this.f1578A = findViewById;
        View findViewById2 = findViewById(C5711f.f16152K);
        this.f1579B = findViewById2;
        ImageView imageView = (ImageView) findViewById(C5711f.f16183y);
        this.f1580C = imageView;
        ImageView imageView2 = (ImageView) findViewById(C5711f.f16143B);
        this.f1581D = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C5711f.f16184z);
        this.f1582E = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C5711f.f16147F);
        this.f1583F = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C5711f.f16144C);
        this.f1590M = imageView5;
        C1365w0.m37177u0(findViewById, m39780v.m39795g(C5715j.f16428q2));
        C1365w0.m37177u0(findViewById2, m39780v.m39795g(C5715j.f16448u2));
        int i2 = C5715j.f16443t2;
        imageView.setImageDrawable(m39780v.m39795g(i2));
        imageView2.setImageDrawable(m39780v.m39795g(C5715j.f16413n2));
        imageView3.setImageDrawable(m39780v.m39795g(C5715j.f16398k2));
        imageView4.setImageDrawable(m39780v.m39795g(C5715j.f16458w2));
        imageView5.setImageDrawable(m39780v.m39795g(i2));
        this.f1591N = m39780v.m39795g(C5715j.f16438s2);
        C0570s1.m39702a(imageView, getResources().getString(C5713h.f16218n));
        this.f1592O = m39780v.m39788n(C5715j.f16453v2, C5712g.f16201q);
        this.f1593P = m39780v.m39788n(C5715j.f16403l2, 0);
        imageView.setOnClickListener(view$OnClickListenerC0445f);
        imageView3.setOnClickListener(view$OnClickListenerC0445f);
        imageView2.setOnClickListener(view$OnClickListenerC0445f);
        imageView4.setOnClickListener(view$OnClickListenerC0445f);
        searchAutoComplete.setOnClickListener(view$OnClickListenerC0445f);
        searchAutoComplete.addTextChangedListener(this.f1624x0);
        searchAutoComplete.setOnEditorActionListener(c0447h);
        searchAutoComplete.setOnItemClickListener(c0448i);
        searchAutoComplete.setOnItemSelectedListener(c0449j);
        searchAutoComplete.setOnKeyListener(this.f1620t0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC0443d());
        setIconifiedByDefault(m39780v.m39801a(C5715j.f16418o2, true));
        int m39796f = m39780v.m39796f(C5715j.f16383h2, -1);
        if (m39796f != -1) {
            setMaxWidth(m39796f);
        }
        this.f1596S = m39780v.m39786p(C5715j.f16408m2);
        this.f1605e0 = m39780v.m39786p(C5715j.f16433r2);
        int m39791k = m39780v.m39791k(C5715j.f16393j2, -1);
        if (m39791k != -1) {
            setImeOptions(m39791k);
        }
        int m39791k2 = m39780v.m39791k(C5715j.f16388i2, -1);
        if (m39791k2 != -1) {
            setInputType(m39791k2);
        }
        setFocusable(m39780v.m39801a(C5715j.f16378g2, true));
        m39780v.m39779w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1594Q = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1595R = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1584G = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0444e());
        }
        m40098i0(this.f1601a0);
        m40102e0();
    }
}
