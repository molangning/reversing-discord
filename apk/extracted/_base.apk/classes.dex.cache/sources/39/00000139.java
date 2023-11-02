package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0579u0;
import androidx.core.view.C1365w0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p052d.C5706a;
import p052d.C5711f;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f823A;

    /* renamed from: C */
    private Drawable f825C;

    /* renamed from: D */
    private ImageView f826D;

    /* renamed from: E */
    private TextView f827E;

    /* renamed from: F */
    private TextView f828F;

    /* renamed from: G */
    private View f829G;

    /* renamed from: H */
    ListAdapter f830H;

    /* renamed from: J */
    private int f832J;

    /* renamed from: K */
    private int f833K;

    /* renamed from: L */
    int f834L;

    /* renamed from: M */
    int f835M;

    /* renamed from: N */
    int f836N;

    /* renamed from: O */
    int f837O;

    /* renamed from: P */
    private boolean f838P;

    /* renamed from: R */
    Handler f840R;

    /* renamed from: a */
    private final Context f842a;

    /* renamed from: b */
    final DialogC0335p f843b;

    /* renamed from: c */
    private final Window f844c;

    /* renamed from: d */
    private final int f845d;

    /* renamed from: e */
    private CharSequence f846e;

    /* renamed from: f */
    private CharSequence f847f;

    /* renamed from: g */
    ListView f848g;

    /* renamed from: h */
    private View f849h;

    /* renamed from: i */
    private int f850i;

    /* renamed from: j */
    private int f851j;

    /* renamed from: k */
    private int f852k;

    /* renamed from: l */
    private int f853l;

    /* renamed from: m */
    private int f854m;

    /* renamed from: o */
    Button f856o;

    /* renamed from: p */
    private CharSequence f857p;

    /* renamed from: q */
    Message f858q;

    /* renamed from: r */
    private Drawable f859r;

    /* renamed from: s */
    Button f860s;

    /* renamed from: t */
    private CharSequence f861t;

    /* renamed from: u */
    Message f862u;

    /* renamed from: v */
    private Drawable f863v;

    /* renamed from: w */
    Button f864w;

    /* renamed from: x */
    private CharSequence f865x;

    /* renamed from: y */
    Message f866y;

    /* renamed from: z */
    private Drawable f867z;

    /* renamed from: n */
    private boolean f855n = false;

    /* renamed from: B */
    private int f824B = 0;

    /* renamed from: I */
    int f831I = -1;

    /* renamed from: Q */
    private int f839Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f841S = new View$OnClickListenerC0277a();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: j */
        private final int f868j;

        /* renamed from: k */
        private final int f869k;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16358c2);
            this.f869k = obtainStyledAttributes.getDimensionPixelOffset(C5715j.f16363d2, -1);
            this.f868j = obtainStyledAttributes.getDimensionPixelOffset(C5715j.f16368e2, -1);
        }

        /* renamed from: a */
        public void m40749a(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f868j;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f869k;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC0277a implements View.OnClickListener {
        View$OnClickListenerC0277a() {
            AlertController.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f856o && (message4 = alertController.f858q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f860s && (message3 = alertController.f862u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f864w && (message2 = alertController.f866y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f840R.obtainMessage(1, alertController2.f843b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0278b {

        /* renamed from: A */
        public int f871A;

        /* renamed from: B */
        public int f872B;

        /* renamed from: C */
        public int f873C;

        /* renamed from: D */
        public int f874D;

        /* renamed from: F */
        public boolean[] f876F;

        /* renamed from: G */
        public boolean f877G;

        /* renamed from: H */
        public boolean f878H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f880J;

        /* renamed from: K */
        public Cursor f881K;

        /* renamed from: L */
        public String f882L;

        /* renamed from: M */
        public String f883M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f884N;

        /* renamed from: a */
        public final Context f886a;

        /* renamed from: b */
        public final LayoutInflater f887b;

        /* renamed from: d */
        public Drawable f889d;

        /* renamed from: f */
        public CharSequence f891f;

        /* renamed from: g */
        public View f892g;

        /* renamed from: h */
        public CharSequence f893h;

        /* renamed from: i */
        public CharSequence f894i;

        /* renamed from: j */
        public Drawable f895j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f896k;

        /* renamed from: l */
        public CharSequence f897l;

        /* renamed from: m */
        public Drawable f898m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f899n;

        /* renamed from: o */
        public CharSequence f900o;

        /* renamed from: p */
        public Drawable f901p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f902q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f904s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f905t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f906u;

        /* renamed from: v */
        public CharSequence[] f907v;

        /* renamed from: w */
        public ListAdapter f908w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f909x;

        /* renamed from: y */
        public int f910y;

        /* renamed from: z */
        public View f911z;

        /* renamed from: c */
        public int f888c = 0;

        /* renamed from: e */
        public int f890e = 0;

        /* renamed from: E */
        public boolean f875E = false;

        /* renamed from: I */
        public int f879I = -1;

        /* renamed from: O */
        public boolean f885O = true;

        /* renamed from: r */
        public boolean f903r = true;

        /* renamed from: androidx.appcompat.app.AlertController$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0279a extends ArrayAdapter<CharSequence> {

            /* renamed from: j */
            final /* synthetic */ RecycleListView f912j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0279a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                C0278b.this = r1;
                this.f912j = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0278b.this.f876F;
                if (zArr != null && zArr[i]) {
                    this.f912j.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0280b extends CursorAdapter {

            /* renamed from: j */
            private final int f914j;

            /* renamed from: k */
            private final int f915k;

            /* renamed from: l */
            final /* synthetic */ RecycleListView f916l;

            /* renamed from: m */
            final /* synthetic */ AlertController f917m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0280b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                C0278b.this = r1;
                this.f916l = recycleListView;
                this.f917m = alertController;
                Cursor cursor2 = getCursor();
                this.f914j = cursor2.getColumnIndexOrThrow(r1.f882L);
                this.f915k = cursor2.getColumnIndexOrThrow(r1.f883M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f914j));
                RecycleListView recycleListView = this.f916l;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f915k) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0278b.this.f887b.inflate(this.f917m.f835M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0281c implements AdapterView.OnItemClickListener {

            /* renamed from: j */
            final /* synthetic */ AlertController f919j;

            C0281c(AlertController alertController) {
                C0278b.this = r1;
                this.f919j = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0278b.this.f909x.onClick(this.f919j.f843b, i);
                if (!C0278b.this.f878H) {
                    this.f919j.f843b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0282d implements AdapterView.OnItemClickListener {

            /* renamed from: j */
            final /* synthetic */ RecycleListView f921j;

            /* renamed from: k */
            final /* synthetic */ AlertController f922k;

            C0282d(RecycleListView recycleListView, AlertController alertController) {
                C0278b.this = r1;
                this.f921j = recycleListView;
                this.f922k = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0278b.this.f876F;
                if (zArr != null) {
                    zArr[i] = this.f921j.isItemChecked(i);
                }
                C0278b.this.f880J.onClick(this.f922k.f843b, i, this.f921j.isItemChecked(i));
            }
        }

        public C0278b(Context context) {
            this.f886a = context;
            this.f887b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m40747b(AlertController alertController) {
            int i;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f887b.inflate(alertController.f834L, (ViewGroup) null);
            if (this.f877G) {
                if (this.f881K == null) {
                    listAdapter = new C0279a(this.f886a, alertController.f835M, 16908308, this.f907v, recycleListView);
                } else {
                    listAdapter = new C0280b(this.f886a, this.f881K, false, recycleListView, alertController);
                }
            } else {
                if (this.f878H) {
                    i = alertController.f836N;
                } else {
                    i = alertController.f837O;
                }
                int i2 = i;
                if (this.f881K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f886a, i2, this.f881K, new String[]{this.f882L}, new int[]{16908308});
                } else {
                    listAdapter = this.f908w;
                    if (listAdapter == null) {
                        listAdapter = new C0284d(this.f886a, i2, 16908308, this.f907v);
                    }
                }
            }
            alertController.f830H = listAdapter;
            alertController.f831I = this.f879I;
            if (this.f909x != null) {
                recycleListView.setOnItemClickListener(new C0281c(alertController));
            } else if (this.f880J != null) {
                recycleListView.setOnItemClickListener(new C0282d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f884N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f878H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f877G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f848g = recycleListView;
        }

        /* renamed from: a */
        public void m40748a(AlertController alertController) {
            View view = this.f892g;
            if (view != null) {
                alertController.m40764k(view);
            } else {
                CharSequence charSequence = this.f891f;
                if (charSequence != null) {
                    alertController.m40759p(charSequence);
                }
                Drawable drawable = this.f889d;
                if (drawable != null) {
                    alertController.m40762m(drawable);
                }
                int i = this.f888c;
                if (i != 0) {
                    alertController.m40763l(i);
                }
                int i2 = this.f890e;
                if (i2 != 0) {
                    alertController.m40763l(alertController.m40772c(i2));
                }
            }
            CharSequence charSequence2 = this.f893h;
            if (charSequence2 != null) {
                alertController.m40761n(charSequence2);
            }
            CharSequence charSequence3 = this.f894i;
            if (charSequence3 != null || this.f895j != null) {
                alertController.m40765j(-1, charSequence3, this.f896k, null, this.f895j);
            }
            CharSequence charSequence4 = this.f897l;
            if (charSequence4 != null || this.f898m != null) {
                alertController.m40765j(-2, charSequence4, this.f899n, null, this.f898m);
            }
            CharSequence charSequence5 = this.f900o;
            if (charSequence5 != null || this.f901p != null) {
                alertController.m40765j(-3, charSequence5, this.f902q, null, this.f901p);
            }
            if (this.f907v != null || this.f881K != null || this.f908w != null) {
                m40747b(alertController);
            }
            View view2 = this.f911z;
            if (view2 != null) {
                if (this.f875E) {
                    alertController.m40756s(view2, this.f871A, this.f872B, this.f873C, this.f874D);
                    return;
                } else {
                    alertController.m40757r(view2);
                    return;
                }
            }
            int i3 = this.f910y;
            if (i3 != 0) {
                alertController.m40758q(i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class HandlerC0283c extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f924a;

        public HandlerC0283c(DialogInterface dialogInterface) {
            this.f924a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != -3 && i != -2 && i != -1) {
                if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f924a.get(), message.what);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0284d extends ArrayAdapter<CharSequence> {
        public C0284d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0335p dialogC0335p, Window window) {
        this.f842a = context;
        this.f843b = dialogC0335p;
        this.f844c = window;
        this.f840R = new HandlerC0283c(dialogC0335p);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C5715j.f16248F, C5706a.f16060n, 0);
        this.f832J = obtainStyledAttributes.getResourceId(C5715j.f16253G, 0);
        this.f833K = obtainStyledAttributes.getResourceId(C5715j.f16263I, 0);
        this.f834L = obtainStyledAttributes.getResourceId(C5715j.f16273K, 0);
        this.f835M = obtainStyledAttributes.getResourceId(C5715j.f16278L, 0);
        this.f836N = obtainStyledAttributes.getResourceId(C5715j.f16288N, 0);
        this.f837O = obtainStyledAttributes.getResourceId(C5715j.f16268J, 0);
        this.f838P = obtainStyledAttributes.getBoolean(C5715j.f16283M, true);
        this.f845d = obtainStyledAttributes.getDimensionPixelSize(C5715j.f16258H, 0);
        obtainStyledAttributes.recycle();
        dialogC0335p.m40565g(1);
    }

    /* renamed from: a */
    static boolean m40774a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m40774a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m40773b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    private ViewGroup m40767h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: i */
    private int m40766i() {
        int i = this.f833K;
        if (i == 0) {
            return this.f832J;
        }
        if (this.f839Q == 1) {
            return i;
        }
        return this.f832J;
    }

    /* renamed from: o */
    private void m40760o(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f844c.findViewById(C5711f.f16181w);
        View findViewById2 = this.f844c.findViewById(C5711f.f16180v);
        C1365w0.m37245H0(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: t */
    private void m40755t(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f856o = button;
        button.setOnClickListener(this.f841S);
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f857p) && this.f859r == null) {
            this.f856o.setVisibility(8);
            z = false;
        } else {
            this.f856o.setText(this.f857p);
            Drawable drawable = this.f859r;
            if (drawable != null) {
                int i = this.f845d;
                drawable.setBounds(0, 0, i, i);
                this.f856o.setCompoundDrawables(this.f859r, null, null, null);
            }
            this.f856o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f860s = button2;
        button2.setOnClickListener(this.f841S);
        if (TextUtils.isEmpty(this.f861t) && this.f863v == null) {
            this.f860s.setVisibility(8);
        } else {
            this.f860s.setText(this.f861t);
            Drawable drawable2 = this.f863v;
            if (drawable2 != null) {
                int i2 = this.f845d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f860s.setCompoundDrawables(this.f863v, null, null, null);
            }
            this.f860s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f864w = button3;
        button3.setOnClickListener(this.f841S);
        if (TextUtils.isEmpty(this.f865x) && this.f867z == null) {
            this.f864w.setVisibility(8);
        } else {
            this.f864w.setText(this.f865x);
            Drawable drawable3 = this.f867z;
            if (drawable3 != null) {
                int i3 = this.f845d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f864w.setCompoundDrawables(this.f867z, null, null, null);
            }
            this.f864w.setVisibility(0);
            z |= true;
        }
        if (m40750y(this.f842a)) {
            if (z) {
                m40773b(this.f856o);
            } else if (z) {
                m40773b(this.f860s);
            } else if (z) {
                m40773b(this.f864w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: u */
    private void m40754u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f844c.findViewById(C5711f.f16182x);
        this.f823A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f823A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f828F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f847f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f823A.removeView(this.f828F);
        if (this.f848g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f823A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f823A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f848g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    private void m40753v(ViewGroup viewGroup) {
        View view = this.f849h;
        boolean z = false;
        if (view == null) {
            if (this.f850i != 0) {
                view = LayoutInflater.from(this.f842a).inflate(this.f850i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m40774a(view)) {
            this.f844c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f844c.findViewById(C5711f.f16173o);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f855n) {
                frameLayout.setPadding(this.f851j, this.f852k, this.f853l, this.f854m);
            }
            if (this.f848g != null) {
                ((LinearLayout.LayoutParams) ((C0579u0.C0580a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m40752w(ViewGroup viewGroup) {
        if (this.f829G != null) {
            viewGroup.addView(this.f829G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f844c.findViewById(C5711f.f16157P).setVisibility(8);
            return;
        }
        this.f826D = (ImageView) this.f844c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f846e)) && this.f838P) {
            TextView textView = (TextView) this.f844c.findViewById(C5711f.f16169k);
            this.f827E = textView;
            textView.setText(this.f846e);
            int i = this.f824B;
            if (i != 0) {
                this.f826D.setImageResource(i);
                return;
            }
            Drawable drawable = this.f825C;
            if (drawable != null) {
                this.f826D.setImageDrawable(drawable);
                return;
            }
            this.f827E.setPadding(this.f826D.getPaddingLeft(), this.f826D.getPaddingTop(), this.f826D.getPaddingRight(), this.f826D.getPaddingBottom());
            this.f826D.setVisibility(8);
            return;
        }
        this.f844c.findViewById(C5711f.f16157P).setVisibility(8);
        this.f826D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private void m40751x() {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f844c.findViewById(C5711f.f16179u);
        int i = C5711f.f16158Q;
        View findViewById5 = findViewById4.findViewById(i);
        int i2 = C5711f.f16172n;
        View findViewById6 = findViewById4.findViewById(i2);
        int i3 = C5711f.f16170l;
        View findViewById7 = findViewById4.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(C5711f.f16174p);
        m40753v(viewGroup);
        View findViewById8 = viewGroup.findViewById(i);
        View findViewById9 = viewGroup.findViewById(i2);
        View findViewById10 = viewGroup.findViewById(i3);
        ViewGroup m40767h = m40767h(findViewById8, findViewById5);
        ViewGroup m40767h2 = m40767h(findViewById9, findViewById6);
        ViewGroup m40767h3 = m40767h(findViewById10, findViewById7);
        m40754u(m40767h2);
        m40755t(m40767h3);
        m40752w(m40767h);
        int i4 = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (m40767h != null && m40767h.getVisibility() != 8) {
            z2 = 1;
        } else {
            z2 = false;
        }
        if (m40767h3 != null && m40767h3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && m40767h2 != null && (findViewById3 = m40767h2.findViewById(C5711f.f16153L)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f823A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f847f == null && this.f848g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = m40767h.findViewById(C5711f.f16156O);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (m40767h2 != null && (findViewById = m40767h2.findViewById(C5711f.f16154M)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f848g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m40749a(z2, z3);
        }
        if (!z) {
            View view = this.f848g;
            if (view == null) {
                view = this.f823A;
            }
            if (view != null) {
                if (z3) {
                    i4 = 2;
                }
                m40760o(m40767h2, view, z2 | i4, 3);
            }
        }
        ListView listView2 = this.f848g;
        if (listView2 != null && (listAdapter = this.f830H) != null) {
            listView2.setAdapter(listAdapter);
            int i5 = this.f831I;
            if (i5 > -1) {
                listView2.setItemChecked(i5, true);
                listView2.setSelection(i5);
            }
        }
    }

    /* renamed from: y */
    private static boolean m40750y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5706a.f16059m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m40772c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f842a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m40771d() {
        return this.f848g;
    }

    /* renamed from: e */
    public void m40770e() {
        this.f843b.setContentView(m40766i());
        m40751x();
    }

    /* renamed from: f */
    public boolean m40769f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f823A;
        return nestedScrollView != null && nestedScrollView.m36981m(keyEvent);
    }

    /* renamed from: g */
    public boolean m40768g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f823A;
        return nestedScrollView != null && nestedScrollView.m36981m(keyEvent);
    }

    /* renamed from: j */
    public void m40765j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f840R.obtainMessage(i, onClickListener);
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.f857p = charSequence;
                    this.f858q = message;
                    this.f859r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f861t = charSequence;
            this.f862u = message;
            this.f863v = drawable;
            return;
        }
        this.f865x = charSequence;
        this.f866y = message;
        this.f867z = drawable;
    }

    /* renamed from: k */
    public void m40764k(View view) {
        this.f829G = view;
    }

    /* renamed from: l */
    public void m40763l(int i) {
        this.f825C = null;
        this.f824B = i;
        ImageView imageView = this.f826D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f826D.setImageResource(this.f824B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: m */
    public void m40762m(Drawable drawable) {
        this.f825C = drawable;
        this.f824B = 0;
        ImageView imageView = this.f826D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f826D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: n */
    public void m40761n(CharSequence charSequence) {
        this.f847f = charSequence;
        TextView textView = this.f828F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public void m40759p(CharSequence charSequence) {
        this.f846e = charSequence;
        TextView textView = this.f827E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m40758q(int i) {
        this.f849h = null;
        this.f850i = i;
        this.f855n = false;
    }

    /* renamed from: r */
    public void m40757r(View view) {
        this.f849h = view;
        this.f850i = 0;
        this.f855n = false;
    }

    /* renamed from: s */
    public void m40756s(View view, int i, int i2, int i3, int i4) {
        this.f849h = view;
        this.f850i = 0;
        this.f855n = true;
        this.f851j = i;
        this.f852k = i2;
        this.f853l = i3;
        this.f854m = i4;
    }
}