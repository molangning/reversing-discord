package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p018os.C1071r;
import androidx.core.util.C1138f;
import androidx.core.view.C1170a;
import androidx.core.view.C1262g2;
import androidx.core.view.C1302n0;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1309o0;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C1195b;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.C1815o;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.ViewInfoStore;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b0.AbstractC1964a;
import p222m0.C10226a;
import p222m0.C10227b;
import p222m0.C10229d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC1309o0 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C1071r.m37959a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C1772i) {
                    ((C1772i) layoutParams).f4816l = true;
                }
                C1071r.m37958b();
            }
        }

        boolean canRestoreState() {
            int i = C1770g.f4812a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C1071r.m37959a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1071r.m37958b();
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends ViewHolder> adapter, ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m35786a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m35785b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m35783d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m35781f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m35784c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m35783d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m35781f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m35780g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m35780g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.m35779h();
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.m35782e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.m35782e(i, i2, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        AdapterDataObservable() {
        }

        /* renamed from: a */
        public boolean m35786a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m35785b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34897a();
            }
        }

        /* renamed from: c */
        public void m35784c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34920e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m35783d(int i, int i2) {
            m35782e(i, i2, null);
        }

        /* renamed from: e */
        public void m35782e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34922c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m35781f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34921d(i, i2);
            }
        }

        /* renamed from: g */
        public void m35780g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34919f(i, i2);
            }
        }

        /* renamed from: h */
        public void m35779h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo35623g();
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AdapterDataObserver {
        /* renamed from: a */
        public void mo34897a() {
        }

        /* renamed from: b */
        public void mo34923b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo34922c(int i, int i2, Object obj) {
            mo34923b(i, i2);
        }

        /* renamed from: d */
        public void mo34921d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo34920e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo34919f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo35623g() {
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class EdgeEffectFactory {
        /* renamed from: a */
        protected EdgeEffect m35778a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private ItemAnimatorListener mListener = null;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public interface ItemAnimatorFinishedListener {
            /* renamed from: a */
            void m35777a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public interface ItemAnimatorListener {
            /* renamed from: a */
            void mo35580a(ViewHolder viewHolder);
        }

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class ItemHolderInfo {

            /* renamed from: a */
            public int f4731a;

            /* renamed from: b */
            public int f4732b;

            /* renamed from: c */
            public int f4733c;

            /* renamed from: d */
            public int f4734d;

            /* renamed from: a */
            public ItemHolderInfo m35776a(ViewHolder viewHolder) {
                return m35775b(viewHolder, 0);
            }

            /* renamed from: b */
            public ItemHolderInfo m35775b(ViewHolder viewHolder, int i) {
                View view = viewHolder.itemView;
                this.f4731a = view.getLeft();
                this.f4732b = view.getTop();
                this.f4733c = view.getRight();
                this.f4734d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int i = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i | FLAG_MOVED;
                }
                return i;
            }
            return i;
        }

        public abstract boolean animateAppearance(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
            return true;
        }

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder, List<Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }

        public final void dispatchAnimationFinished(ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.mo35580a(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).m35777a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean isRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!isRunning) {
                    itemAnimatorFinishedListener.m35777a();
                } else {
                    this.mFinishedListeners.add(itemAnimatorFinishedListener);
                }
            }
            return isRunning;
        }

        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(ViewHolder viewHolder) {
        }

        public void onAnimationStarted(ViewHolder viewHolder) {
        }

        public ItemHolderInfo recordPostLayoutInformation(State state, ViewHolder viewHolder) {
            return obtainHolderInfo().m35776a(viewHolder);
        }

        public ItemHolderInfo recordPreLayoutInformation(State state, ViewHolder viewHolder, int i, List<Object> list) {
            return obtainHolderInfo().m35776a(viewHolder);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        void setListener(ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            getItemOffsets(rect, ((C1772i) view.getLayoutParams()).m35579a(), recyclerView);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class LayoutManager {

        /* renamed from: A */
        private int f4735A;

        /* renamed from: j */
        ChildHelper f4736j;

        /* renamed from: k */
        RecyclerView f4737k;

        /* renamed from: l */
        private final C1815o.InterfaceC1817b f4738l;

        /* renamed from: m */
        private final C1815o.InterfaceC1817b f4739m;

        /* renamed from: n */
        C1815o f4740n;

        /* renamed from: o */
        C1815o f4741o;

        /* renamed from: p */
        SmoothScroller f4742p;

        /* renamed from: q */
        boolean f4743q;

        /* renamed from: r */
        boolean f4744r;

        /* renamed from: s */
        boolean f4745s;

        /* renamed from: t */
        private boolean f4746t;

        /* renamed from: u */
        private boolean f4747u;

        /* renamed from: v */
        int f4748v;

        /* renamed from: w */
        boolean f4749w;

        /* renamed from: x */
        private int f4750x;

        /* renamed from: y */
        private int f4751y;

        /* renamed from: z */
        private int f4752z;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1757a implements C1815o.InterfaceC1817b {
            C1757a() {
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: a */
            public int mo35324a(View view) {
                return LayoutManager.this.m35725b0(view) - ((ViewGroup.MarginLayoutParams) ((C1772i) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: b */
            public int mo35323b() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: c */
            public int mo35322c() {
                return LayoutManager.this.m35687v0() - LayoutManager.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: d */
            public int mo35321d(View view) {
                return LayoutManager.this.m35722e0(view) + ((ViewGroup.MarginLayoutParams) ((C1772i) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            public View getChildAt(int i) {
                return LayoutManager.this.m35739T(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1758b implements C1815o.InterfaceC1817b {
            C1758b() {
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: a */
            public int mo35324a(View view) {
                return LayoutManager.this.m35721f0(view) - ((ViewGroup.MarginLayoutParams) ((C1772i) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: b */
            public int mo35323b() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: c */
            public int mo35322c() {
                return LayoutManager.this.m35719h0() - LayoutManager.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            /* renamed from: d */
            public int mo35321d(View view) {
                return LayoutManager.this.m35727Z(view) + ((ViewGroup.MarginLayoutParams) ((C1772i) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.C1815o.InterfaceC1817b
            public View getChildAt(int i) {
                return LayoutManager.this.m35739T(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public interface InterfaceC1759c {
            /* renamed from: a */
            void mo35677a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C1760d {

            /* renamed from: a */
            public int f4755a;

            /* renamed from: b */
            public int f4756b;

            /* renamed from: c */
            public boolean f4757c;

            /* renamed from: d */
            public boolean f4758d;
        }

        public LayoutManager() {
            C1757a c1757a = new C1757a();
            this.f4738l = c1757a;
            C1758b c1758b = new C1758b();
            this.f4739m = c1758b;
            this.f4740n = new C1815o(c1757a);
            this.f4741o = new C1815o(c1758b);
            this.f4743q = false;
            this.f4744r = false;
            this.f4745s = false;
            this.f4746t = true;
            this.f4747u = true;
        }

        /* renamed from: A0 */
        private boolean m35773A0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int m35687v0 = m35687v0() - getPaddingRight();
            int m35719h0 = m35719h0() - getPaddingBottom();
            Rect rect = this.f4737k.mTempRect;
            m35726a0(focusedChild, rect);
            if (rect.left - i >= m35687v0 || rect.right - i <= paddingLeft || rect.top - i2 >= m35719h0 || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: E0 */
        private static boolean m35766E0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            } else if (size < i) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: E1 */
        private void m35765E1(Recycler recycler, int i, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f4737k.mAdapter.hasStableIds()) {
                m35678z1(i);
                recycler.m35661C(childViewHolderInt);
                return;
            }
            m35760I(i);
            recycler.m35660D(view);
            this.f4737k.mViewInfoStore.m35443k(childViewHolderInt);
        }

        /* renamed from: J */
        private void m35757J(int i, View view) {
            this.f4736j.m35931d(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: V */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m35734V(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.m35734V(int, int, int, int, boolean):int");
        }

        /* renamed from: W */
        private int[] m35733W(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int m35687v0 = m35687v0() - getPaddingRight();
            int m35719h0 = m35719h0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - m35687v0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m35719h0);
            if (m35713k0() == 1) {
                if (max == 0) {
                    max = Math.max(min, i3);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: p0 */
        public static C1760d m35702p0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1760d c1760d = new C1760d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10229d.f26552f, i, i2);
            c1760d.f4755a = obtainStyledAttributes.getInt(C10229d.f26553g, 1);
            c1760d.f4756b = obtainStyledAttributes.getInt(C10229d.f26563q, 1);
            c1760d.f4757c = obtainStyledAttributes.getBoolean(C10229d.f26562p, false);
            c1760d.f4758d = obtainStyledAttributes.getBoolean(C10229d.f26564r, false);
            obtainStyledAttributes.recycle();
            return c1760d;
        }

        /* renamed from: q */
        private void m35701q(View view, int i, boolean z) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.isRemoved()) {
                this.f4737k.mViewInfoStore.m35438p(childViewHolderInt);
            } else {
                this.f4737k.mViewInfoStore.m35452b(childViewHolderInt);
            }
            C1772i c1772i = (C1772i) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.f4737k) {
                    int m35922m = this.f4736j.m35922m(view);
                    if (i == -1) {
                        i = this.f4736j.m35928g();
                    }
                    if (m35922m != -1) {
                        if (m35922m != i) {
                            this.f4737k.mLayout.m35756J0(m35922m, i);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4737k.indexOfChild(view) + this.f4737k.exceptionLabel());
                    }
                } else {
                    this.f4736j.m35934a(view, i, false);
                    c1772i.f4816l = true;
                    SmoothScroller smoothScroller = this.f4742p;
                    if (smoothScroller != null && smoothScroller.isRunning()) {
                        this.f4742p.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f4736j.m35932c(view, i, view.getLayoutParams(), false);
            }
            if (c1772i.f4817m) {
                childViewHolderInt.itemView.invalidate();
                c1772i.f4817m = false;
            }
        }

        /* renamed from: y */
        public static int m35681y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: A */
        public void mo35774A(int i, InterfaceC1759c interfaceC1759c) {
        }

        /* renamed from: A1 */
        public boolean m35772A1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo34918B1(recyclerView, view, rect, z, false);
        }

        /* renamed from: B */
        public int mo28561B(State state) {
            return 0;
        }

        /* renamed from: B0 */
        public final boolean m35771B0() {
            return this.f4747u;
        }

        /* renamed from: B1 */
        public boolean mo34918B1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m35733W = m35733W(view, rect);
            int i = m35733W[0];
            int i2 = m35733W[1];
            if ((z2 && !m35773A0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* renamed from: C */
        public int mo28559C(State state) {
            return 0;
        }

        /* renamed from: C0 */
        public boolean m35770C0(Recycler recycler, State state) {
            return false;
        }

        /* renamed from: C1 */
        public void m35769C1() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: D */
        public int mo28557D(State state) {
            return 0;
        }

        /* renamed from: D0 */
        public boolean m35768D0() {
            return this.f4746t;
        }

        /* renamed from: D1 */
        public void m35767D1() {
            this.f4743q = true;
        }

        /* renamed from: E */
        public int mo28555E(State state) {
            return 0;
        }

        /* renamed from: F */
        public int mo28552F(State state) {
            return 0;
        }

        /* renamed from: F0 */
        public boolean m35764F0() {
            SmoothScroller smoothScroller = this.f4742p;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        /* renamed from: F1 */
        public int mo28551F1(int i, Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: G */
        public int mo28549G(State state) {
            return 0;
        }

        /* renamed from: G0 */
        public boolean m35763G0(View view, boolean z, boolean z2) {
            boolean z3;
            if (this.f4740n.m35330b(view, 24579) && this.f4741o.m35330b(view, 24579)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: G1 */
        public void mo28548G1(int i) {
        }

        /* renamed from: H */
        public void m35762H(Recycler recycler) {
            for (int m35736U = m35736U() - 1; m35736U >= 0; m35736U--) {
                m35765E1(recycler, m35736U, m35739T(m35736U));
            }
        }

        /* renamed from: H0 */
        public void m35761H0(View view, int i, int i2, int i3, int i4) {
            C1772i c1772i = (C1772i) view.getLayoutParams();
            Rect rect = c1772i.f4815k;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1772i).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1772i).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1772i).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1772i).bottomMargin);
        }

        /* renamed from: H1 */
        public int mo28546H1(int i, Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: I */
        public void m35760I(int i) {
            m35757J(i, m35739T(i));
        }

        /* renamed from: I0 */
        public void m35759I0(View view, int i, int i2) {
            C1772i c1772i = (C1772i) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f4737k.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int m35734V = m35734V(m35687v0(), m35685w0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1772i).leftMargin + ((ViewGroup.MarginLayoutParams) c1772i).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c1772i).width, mo28487v());
            int m35734V2 = m35734V(m35719h0(), m35717i0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c1772i).topMargin + ((ViewGroup.MarginLayoutParams) c1772i).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c1772i).height, mo28485w());
            if (m35746O1(view, m35734V, m35734V2, c1772i)) {
                view.measure(m35734V, m35734V2);
            }
        }

        /* renamed from: I1 */
        void m35758I1(RecyclerView recyclerView) {
            m35755J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: J0 */
        public void m35756J0(int i, int i2) {
            View m35739T = m35739T(i);
            if (m35739T != null) {
                m35760I(i);
                m35696s(m35739T, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4737k.toString());
        }

        /* renamed from: J1 */
        void m35755J1(int i, int i2) {
            this.f4752z = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4750x = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f4752z = 0;
            }
            this.f4735A = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4751y = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f4735A = 0;
            }
        }

        /* renamed from: K */
        void m35754K(RecyclerView recyclerView) {
            this.f4744r = true;
            mo28536O0(recyclerView);
        }

        /* renamed from: K0 */
        public void mo35561K0(int i) {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: K1 */
        public void m35753K1(int i, int i2) {
            this.f4737k.setMeasuredDimension(i, i2);
        }

        /* renamed from: L */
        void m35752L(RecyclerView recyclerView, Recycler recycler) {
            this.f4744r = false;
            mo28531Q0(recyclerView, recycler);
        }

        /* renamed from: L0 */
        public void mo35559L0(int i) {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: L1 */
        public void mo35558L1(Rect rect, int i, int i2) {
            m35753K1(m35681y(i, rect.width() + getPaddingLeft() + getPaddingRight(), m35708n0()), m35681y(i2, rect.height() + getPaddingTop() + getPaddingBottom(), m35710m0()));
        }

        /* renamed from: M */
        public View m35751M(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f4736j.m35921n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: M0 */
        public void mo28540M0(Adapter adapter, Adapter adapter2) {
        }

        /* renamed from: M1 */
        void m35750M1(int i, int i2) {
            int m35736U = m35736U();
            if (m35736U == 0) {
                this.f4737k.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m35736U; i7++) {
                View m35739T = m35739T(i7);
                Rect rect = this.f4737k.mTempRect;
                m35726a0(m35739T, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f4737k.mTempRect.set(i6, i4, i3, i5);
            mo35558L1(this.f4737k.mTempRect, i, i2);
        }

        /* renamed from: N */
        public View mo35749N(int i) {
            int m35736U = m35736U();
            for (int i2 = 0; i2 < m35736U; i2++) {
                View m35739T = m35739T(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(m35739T);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f4737k.mState.m35608e() || !childViewHolderInt.isRemoved())) {
                    return m35739T;
                }
            }
            return null;
        }

        /* renamed from: N0 */
        public boolean m35748N0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: N1 */
        void m35747N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4737k = null;
                this.f4736j = null;
                this.f4752z = 0;
                this.f4735A = 0;
            } else {
                this.f4737k = recyclerView;
                this.f4736j = recyclerView.mChildHelper;
                this.f4752z = recyclerView.getWidth();
                this.f4735A = recyclerView.getHeight();
            }
            this.f4750x = 1073741824;
            this.f4751y = 1073741824;
        }

        /* renamed from: O */
        public abstract C1772i mo28537O();

        /* renamed from: O0 */
        public void mo28536O0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O1 */
        public boolean m35746O1(View view, int i, int i2, C1772i c1772i) {
            if (!view.isLayoutRequested() && this.f4746t && m35766E0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1772i).width) && m35766E0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1772i).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: P */
        public C1772i mo28533P(Context context, AttributeSet attributeSet) {
            return new C1772i(context, attributeSet);
        }

        @Deprecated
        /* renamed from: P0 */
        public void m35745P0(RecyclerView recyclerView) {
        }

        /* renamed from: P1 */
        boolean mo35744P1() {
            return false;
        }

        /* renamed from: Q */
        public C1772i mo35552Q(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1772i) {
                return new C1772i((C1772i) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C1772i((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C1772i(layoutParams);
        }

        /* renamed from: Q0 */
        public void mo28531Q0(RecyclerView recyclerView, Recycler recycler) {
            m35745P0(recyclerView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q1 */
        public boolean m35743Q1(View view, int i, int i2, C1772i c1772i) {
            if (this.f4746t && m35766E0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1772i).width) && m35766E0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1772i).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: R */
        public int m35742R() {
            return -1;
        }

        /* renamed from: R0 */
        public View mo35550R0(View view, int i, Recycler recycler, State state) {
            return null;
        }

        /* renamed from: R1 */
        public void mo27232R1(RecyclerView recyclerView, State state, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: S */
        public int m35741S(View view) {
            return ((C1772i) view.getLayoutParams()).f4815k.bottom;
        }

        /* renamed from: S0 */
        public void mo35548S0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4737k;
            m35738T0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* renamed from: S1 */
        public void m35740S1(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.f4742p;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.f4742p.stop();
            }
            this.f4742p = smoothScroller;
            smoothScroller.start(this.f4737k, this);
        }

        /* renamed from: T */
        public View m35739T(int i) {
            ChildHelper childHelper = this.f4736j;
            if (childHelper != null) {
                return childHelper.m35929f(i);
            }
            return null;
        }

        /* renamed from: T0 */
        public void m35738T0(Recycler recycler, State state, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4737k.canScrollVertically(-1) && !this.f4737k.canScrollHorizontally(-1) && !this.f4737k.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.f4737k.mAdapter;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        /* renamed from: T1 */
        void m35737T1() {
            SmoothScroller smoothScroller = this.f4742p;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        /* renamed from: U */
        public int m35736U() {
            ChildHelper childHelper = this.f4736j;
            if (childHelper != null) {
                return childHelper.m35928g();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U0 */
        public void m35735U0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.f4737k;
            mo34917V0(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        /* renamed from: U1 */
        public boolean mo35545U1() {
            return false;
        }

        /* renamed from: V0 */
        public void mo34917V0(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f4737k.canScrollVertically(-1) || this.f4737k.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.m37603a(8192);
                accessibilityNodeInfoCompat.m37638D0(true);
            }
            if (this.f4737k.canScrollVertically(1) || this.f4737k.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.m37603a(ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                accessibilityNodeInfoCompat.m37638D0(true);
            }
            accessibilityNodeInfoCompat.m37586i0(AccessibilityNodeInfoCompat.C1180c.m37545b(mo35698r0(recycler, state), mo35729Y(recycler, state), m35770C0(recycler, state), m35695s0(recycler, state)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: W0 */
        public void m35732W0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f4736j.m35921n(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f4737k;
                mo35730X0(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
            }
        }

        /* renamed from: X */
        public boolean m35731X() {
            RecyclerView recyclerView = this.f4737k;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* renamed from: X0 */
        public void mo35730X0(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: Y */
        public int mo35729Y(Recycler recycler, State state) {
            return -1;
        }

        /* renamed from: Y0 */
        public View m35728Y0(View view, int i) {
            return null;
        }

        /* renamed from: Z */
        public int m35727Z(View view) {
            return view.getBottom() + m35741S(view);
        }

        /* renamed from: Z0 */
        public void mo28519Z0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a0 */
        public void m35726a0(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: a1 */
        public void mo35533a1(RecyclerView recyclerView) {
        }

        /* renamed from: b0 */
        public int m35725b0(View view) {
            return view.getLeft() - m35712l0(view);
        }

        /* renamed from: b1 */
        public void mo28515b1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: c0 */
        public int m35724c0(View view) {
            Rect rect = ((C1772i) view.getLayoutParams()).f4815k;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: c1 */
        public void mo28513c1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d0 */
        public int m35723d0(View view) {
            Rect rect = ((C1772i) view.getLayoutParams()).f4815k;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: d1 */
        public void mo28511d1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: e0 */
        public int m35722e0(View view) {
            return view.getRight() + m35700q0(view);
        }

        /* renamed from: e1 */
        public void mo28509e1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo28511d1(recyclerView, i, i2);
        }

        /* renamed from: f0 */
        public int m35721f0(View view) {
            return view.getTop() - m35692t0(view);
        }

        /* renamed from: f1 */
        public void mo28507f1(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: g0 */
        public View m35720g0() {
            View focusedChild;
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4736j.m35921n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g1 */
        public void mo28505g1(State state) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return C1365w0.m37250F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return C1365w0.m37248G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public int m35719h0() {
            return this.f4735A;
        }

        /* renamed from: h1 */
        public void m35718h1(Recycler recycler, State state, int i, int i2) {
            this.f4737k.defaultOnMeasure(i, i2);
        }

        /* renamed from: i0 */
        public int m35717i0() {
            return this.f4751y;
        }

        @Deprecated
        /* renamed from: i1 */
        public boolean m35716i1(RecyclerView recyclerView, View view, View view2) {
            return m35764F0() || recyclerView.isComputingLayout();
        }

        /* renamed from: j0 */
        public int m35715j0() {
            Adapter adapter;
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: j1 */
        public boolean m35714j1(RecyclerView recyclerView, State state, View view, View view2) {
            return m35716i1(recyclerView, view, view2);
        }

        /* renamed from: k0 */
        public int m35713k0() {
            return C1365w0.m37258B(this.f4737k);
        }

        /* renamed from: k1 */
        public void mo28500k1(Parcelable parcelable) {
        }

        /* renamed from: l0 */
        public int m35712l0(View view) {
            return ((C1772i) view.getLayoutParams()).f4815k.left;
        }

        /* renamed from: l1 */
        public Parcelable mo28498l1() {
            return null;
        }

        /* renamed from: m */
        public void m35711m(View view) {
            m35709n(view, -1);
        }

        /* renamed from: m0 */
        public int m35710m0() {
            return C1365w0.m37256C(this.f4737k);
        }

        /* renamed from: m1 */
        public void mo35519m1(int i) {
        }

        /* renamed from: n */
        public void m35709n(View view, int i) {
            m35701q(view, i, true);
        }

        /* renamed from: n0 */
        public int m35708n0() {
            return C1365w0.m37254D(this.f4737k);
        }

        /* renamed from: n1 */
        void m35707n1(SmoothScroller smoothScroller) {
            if (this.f4742p == smoothScroller) {
                this.f4742p = null;
            }
        }

        /* renamed from: o */
        public void m35706o(View view) {
            m35703p(view, -1);
        }

        /* renamed from: o0 */
        public int m35705o0(View view) {
            return ((C1772i) view.getLayoutParams()).m35579a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o1 */
        public boolean m35704o1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4737k;
            return mo34916p1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* renamed from: p */
        public void m35703p(View view, int i) {
            m35701q(view, i, false);
        }

        /* renamed from: p1 */
        public boolean mo34916p1(Recycler recycler, State state, int i, Bundle bundle) {
            int i2;
            int m35687v0;
            int i3;
            int i4;
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView == null) {
                return false;
            }
            if (i != 4096) {
                if (i != 8192) {
                    i4 = 0;
                    i3 = 0;
                } else {
                    if (recyclerView.canScrollVertically(-1)) {
                        i2 = -((m35719h0() - getPaddingTop()) - getPaddingBottom());
                    } else {
                        i2 = 0;
                    }
                    if (this.f4737k.canScrollHorizontally(-1)) {
                        m35687v0 = -((m35687v0() - getPaddingLeft()) - getPaddingRight());
                        i3 = i2;
                        i4 = m35687v0;
                    }
                    i3 = i2;
                    i4 = 0;
                }
            } else {
                if (recyclerView.canScrollVertically(1)) {
                    i2 = (m35719h0() - getPaddingTop()) - getPaddingBottom();
                } else {
                    i2 = 0;
                }
                if (this.f4737k.canScrollHorizontally(1)) {
                    m35687v0 = (m35687v0() - getPaddingLeft()) - getPaddingRight();
                    i3 = i2;
                    i4 = m35687v0;
                }
                i3 = i2;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f4737k.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: q0 */
        public int m35700q0(View view) {
            return ((C1772i) view.getLayoutParams()).f4815k.right;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q1 */
        public boolean m35699q1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4737k;
            return m35697r1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: r */
        public void mo35513r(String str) {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: r0 */
        public int mo35698r0(Recycler recycler, State state) {
            return -1;
        }

        /* renamed from: r1 */
        public boolean m35697r1(Recycler recycler, State state, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: s */
        public void m35696s(View view, int i) {
            m35693t(view, i, (C1772i) view.getLayoutParams());
        }

        /* renamed from: s0 */
        public int m35695s0(Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: s1 */
        public void m35694s1() {
            for (int m35736U = m35736U() - 1; m35736U >= 0; m35736U--) {
                this.f4736j.m35918q(m35736U);
            }
        }

        /* renamed from: t */
        public void m35693t(View view, int i, C1772i c1772i) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f4737k.mViewInfoStore.m35452b(childViewHolderInt);
            } else {
                this.f4737k.mViewInfoStore.m35438p(childViewHolderInt);
            }
            this.f4736j.m35932c(view, i, c1772i, childViewHolderInt.isRemoved());
        }

        /* renamed from: t0 */
        public int m35692t0(View view) {
            return ((C1772i) view.getLayoutParams()).f4815k.top;
        }

        /* renamed from: t1 */
        public void m35691t1(Recycler recycler) {
            for (int m35736U = m35736U() - 1; m35736U >= 0; m35736U--) {
                if (!RecyclerView.getChildViewHolderInt(m35739T(m35736U)).shouldIgnore()) {
                    m35684w1(m35736U, recycler);
                }
            }
        }

        /* renamed from: u */
        public void m35690u(View view, Rect rect) {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: u0 */
        public void m35689u0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1772i) view.getLayoutParams()).f4815k;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4737k != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4737k.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: u1 */
        void m35688u1(Recycler recycler) {
            int m35641j = recycler.m35641j();
            for (int i = m35641j - 1; i >= 0; i--) {
                View m35637n = recycler.m35637n(i);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(m35637n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f4737k.removeDetachedView(m35637n, false);
                    }
                    ItemAnimator itemAnimator = this.f4737k.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    recycler.m35626y(m35637n);
                }
            }
            recycler.m35646e();
            if (m35641j > 0) {
                this.f4737k.invalidate();
            }
        }

        /* renamed from: v */
        public boolean mo28487v() {
            return false;
        }

        /* renamed from: v0 */
        public int m35687v0() {
            return this.f4752z;
        }

        /* renamed from: v1 */
        public void m35686v1(View view, Recycler recycler) {
            m35679y1(view);
            recycler.m35662B(view);
        }

        /* renamed from: w */
        public boolean mo28485w() {
            return false;
        }

        /* renamed from: w0 */
        public int m35685w0() {
            return this.f4750x;
        }

        /* renamed from: w1 */
        public void m35684w1(int i, Recycler recycler) {
            View m35739T = m35739T(i);
            m35678z1(i);
            recycler.m35662B(m35739T);
        }

        /* renamed from: x */
        public boolean mo28483x(C1772i c1772i) {
            return c1772i != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x0 */
        public boolean m35683x0() {
            int m35736U = m35736U();
            for (int i = 0; i < m35736U; i++) {
                ViewGroup.LayoutParams layoutParams = m35739T(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: x1 */
        public boolean m35682x1(Runnable runnable) {
            RecyclerView recyclerView = this.f4737k;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: y0 */
        public boolean m35680y0() {
            return this.f4744r;
        }

        /* renamed from: y1 */
        public void m35679y1(View view) {
            this.f4736j.m35919p(view);
        }

        /* renamed from: z */
        public void mo35504z(int i, int i2, State state, InterfaceC1759c interfaceC1759c) {
        }

        /* renamed from: z0 */
        public boolean mo28480z0() {
            return this.f4745s;
        }

        /* renamed from: z1 */
        public void m35678z1(int i) {
            if (m35739T(i) != null) {
                this.f4736j.m35918q(i);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class OnFlingListener {
        /* renamed from: a */
        public abstract boolean mo35340a(int i, int i2);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RecycledViewPool {

        /* renamed from: a */
        SparseArray<C1761a> f4759a = new SparseArray<>();

        /* renamed from: b */
        private int f4760b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$RecycledViewPool$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C1761a {

            /* renamed from: a */
            final ArrayList<ViewHolder> f4761a = new ArrayList<>();

            /* renamed from: b */
            int f4762b = 5;

            /* renamed from: c */
            long f4763c = 0;

            /* renamed from: d */
            long f4764d = 0;

            C1761a() {
            }
        }

        /* renamed from: g */
        private C1761a m35670g(int i) {
            C1761a c1761a = this.f4759a.get(i);
            if (c1761a == null) {
                C1761a c1761a2 = new C1761a();
                this.f4759a.put(i, c1761a2);
                return c1761a2;
            }
            return c1761a;
        }

        /* renamed from: a */
        void m35676a() {
            this.f4760b++;
        }

        /* renamed from: b */
        public void m35675b() {
            for (int i = 0; i < this.f4759a.size(); i++) {
                this.f4759a.valueAt(i).f4761a.clear();
            }
        }

        /* renamed from: c */
        void m35674c() {
            this.f4760b--;
        }

        /* renamed from: d */
        void m35673d(int i, long j) {
            C1761a m35670g = m35670g(i);
            m35670g.f4764d = m35667j(m35670g.f4764d, j);
        }

        /* renamed from: e */
        void m35672e(int i, long j) {
            C1761a m35670g = m35670g(i);
            m35670g.f4763c = m35667j(m35670g.f4763c, j);
        }

        /* renamed from: f */
        public ViewHolder m35671f(int i) {
            C1761a c1761a = this.f4759a.get(i);
            if (c1761a != null && !c1761a.f4761a.isEmpty()) {
                ArrayList<ViewHolder> arrayList = c1761a.f4761a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                        return arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: h */
        void m35669h(Adapter adapter, Adapter adapter2, boolean z) {
            if (adapter != null) {
                m35674c();
            }
            if (!z && this.f4760b == 0) {
                m35675b();
            }
            if (adapter2 != null) {
                m35676a();
            }
        }

        /* renamed from: i */
        public void m35668i(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = m35670g(itemViewType).f4761a;
            if (this.f4759a.get(itemViewType).f4762b <= arrayList.size()) {
                return;
            }
            viewHolder.resetInternal();
            arrayList.add(viewHolder);
        }

        /* renamed from: j */
        long m35667j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        public void m35666k(int i, int i2) {
            C1761a m35670g = m35670g(i);
            m35670g.f4762b = i2;
            ArrayList<ViewHolder> arrayList = m35670g.f4761a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: l */
        boolean m35665l(int i, long j, long j2) {
            long j3 = m35670g(i).f4764d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: m */
        boolean m35664m(int i, long j, long j2) {
            long j3 = m35670g(i).f4763c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class Recycler {

        /* renamed from: a */
        final ArrayList<ViewHolder> f4765a;

        /* renamed from: b */
        ArrayList<ViewHolder> f4766b;

        /* renamed from: c */
        final ArrayList<ViewHolder> f4767c;

        /* renamed from: d */
        private final List<ViewHolder> f4768d;

        /* renamed from: e */
        private int f4769e;

        /* renamed from: f */
        int f4770f;

        /* renamed from: g */
        RecycledViewPool f4771g;

        /* renamed from: h */
        private ViewCacheExtension f4772h;

        public Recycler() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.f4765a = arrayList;
            this.f4766b = null;
            this.f4767c = new ArrayList<>();
            this.f4768d = Collections.unmodifiableList(arrayList);
            this.f4769e = 2;
            this.f4770f = 2;
        }

        /* renamed from: H */
        private boolean m35656H(ViewHolder viewHolder, int i, int i2, long j) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.f4771g.m35665l(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i);
            this.f4771g.m35673d(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m35649b(viewHolder);
            if (RecyclerView.this.mState.m35608e()) {
                viewHolder.mPreLayoutPosition = i2;
                return true;
            }
            return true;
        }

        /* renamed from: b */
        private void m35649b(ViewHolder viewHolder) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = viewHolder.itemView;
                if (C1365w0.m37168z(view) == 0) {
                    C1365w0.m37259A0(view, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
                if (recyclerViewAccessibilityDelegate == null) {
                    return;
                }
                C1170a m35575a = recyclerViewAccessibilityDelegate.m35575a();
                if (m35575a instanceof RecyclerViewAccessibilityDelegate.C1773a) {
                    ((RecyclerViewAccessibilityDelegate.C1773a) m35575a).m35572b(view);
                }
                C1365w0.m37185q0(view, m35575a);
            }
        }

        /* renamed from: q */
        private void m35634q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m35634q((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        /* renamed from: r */
        private void m35633r(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                m35634q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m35663A(int i) {
            m35650a(this.f4767c.get(i), true);
            this.f4767c.remove(i);
        }

        /* renamed from: B */
        public void m35662B(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m35661C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        /* renamed from: C */
        void m35661C(ViewHolder viewHolder) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (!viewHolder.isScrap() && viewHolder.itemView.getParent() == null) {
                if (!viewHolder.isTmpDetached()) {
                    if (!viewHolder.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                        Adapter adapter = RecyclerView.this.mAdapter;
                        if (adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !viewHolder.isRecyclable()) {
                            z4 = false;
                        } else {
                            if (this.f4770f > 0 && !viewHolder.hasAnyOfTheFlags(526)) {
                                int size = this.f4767c.size();
                                if (size >= this.f4770f && size > 0) {
                                    m35663A(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m35894d(viewHolder.mPosition)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.m35894d(this.f4767c.get(i).mPosition)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.f4767c.add(size, viewHolder);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                m35650a(viewHolder, true);
                            } else {
                                z4 = false;
                            }
                            z3 = z2;
                        }
                        RecyclerView.this.mViewInfoStore.m35437q(viewHolder);
                        if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(viewHolder.isScrap());
            sb2.append(" isAttached:");
            if (viewHolder.itemView.getParent() != null) {
                z3 = true;
            }
            sb2.append(z3);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* renamed from: D */
        void m35660D(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f4766b == null) {
                    this.f4766b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f4766b.add(childViewHolderInt);
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f4765a.add(childViewHolderInt);
            }
        }

        /* renamed from: E */
        void m35659E(RecycledViewPool recycledViewPool) {
            RecycledViewPool recycledViewPool2 = this.f4771g;
            if (recycledViewPool2 != null) {
                recycledViewPool2.m35674c();
            }
            this.f4771g = recycledViewPool;
            if (recycledViewPool != null && RecyclerView.this.getAdapter() != null) {
                this.f4771g.m35676a();
            }
        }

        /* renamed from: F */
        void m35658F(ViewCacheExtension viewCacheExtension) {
            this.f4772h = viewCacheExtension;
        }

        /* renamed from: G */
        public void m35657G(int i) {
            this.f4769e = i;
            m35653K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.ViewHolder m35655I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Recycler.m35655I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        /* renamed from: J */
        void m35654J(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f4766b.remove(viewHolder);
            } else {
                this.f4765a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K */
        public void m35653K() {
            int i;
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            if (layoutManager != null) {
                i = layoutManager.f4748v;
            } else {
                i = 0;
            }
            this.f4770f = this.f4769e + i;
            for (int size = this.f4767c.size() - 1; size >= 0 && this.f4767c.size() > this.f4770f; size--) {
                m35663A(size);
            }
        }

        /* renamed from: L */
        boolean m35652L(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.mState.m35608e();
            }
            int i = viewHolder.mPosition;
            if (i >= 0 && i < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.m35608e() && RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && viewHolder.getItemId() != RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: M */
        void m35651M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4767c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4767c.get(size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i4) {
                    viewHolder.addFlags(2);
                    m35663A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m35650a(ViewHolder viewHolder, boolean z) {
            C1170a c1170a;
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                C1170a m35575a = recyclerViewAccessibilityDelegate.m35575a();
                if (m35575a instanceof RecyclerViewAccessibilityDelegate.C1773a) {
                    c1170a = ((RecyclerViewAccessibilityDelegate.C1773a) m35575a).m35573a(view);
                } else {
                    c1170a = null;
                }
                C1365w0.m37185q0(view, c1170a);
            }
            if (z) {
                m35644g(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            m35642i().m35668i(viewHolder);
        }

        /* renamed from: c */
        public void m35648c() {
            this.f4765a.clear();
            m35625z();
        }

        /* renamed from: d */
        void m35647d() {
            int size = this.f4767c.size();
            for (int i = 0; i < size; i++) {
                this.f4767c.get(i).clearOldPosition();
            }
            int size2 = this.f4765a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4765a.get(i2).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.f4766b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4766b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        void m35646e() {
            this.f4765a.clear();
            ArrayList<ViewHolder> arrayList = this.f4766b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m35645f(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.m35611b()) {
                if (!RecyclerView.this.mState.m35608e()) {
                    return i;
                }
                return RecyclerView.this.mAdapterHelper.m35949m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.m35611b() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: g */
        void m35644g(ViewHolder viewHolder) {
            RecyclerListener recyclerListener = RecyclerView.this.mRecyclerListener;
            if (recyclerListener != null) {
                recyclerListener.m35624a(viewHolder);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.mRecyclerListeners.get(i).m35624a(viewHolder);
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m35437q(viewHolder);
            }
        }

        /* renamed from: h */
        ViewHolder m35643h(int i) {
            int size;
            int m35949m;
            ArrayList<ViewHolder> arrayList = this.f4766b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ViewHolder viewHolder = this.f4766b.get(i2);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m35949m = RecyclerView.this.mAdapterHelper.m35949m(i)) > 0 && m35949m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m35949m);
                    for (int i3 = 0; i3 < size; i3++) {
                        ViewHolder viewHolder2 = this.f4766b.get(i3);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        RecycledViewPool m35642i() {
            if (this.f4771g == null) {
                this.f4771g = new RecycledViewPool();
            }
            return this.f4771g;
        }

        /* renamed from: j */
        int m35641j() {
            return this.f4765a.size();
        }

        /* renamed from: k */
        public List<ViewHolder> m35640k() {
            return this.f4768d;
        }

        /* renamed from: l */
        ViewHolder m35639l(long j, int i, boolean z) {
            for (int size = this.f4765a.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4765a.get(size);
                if (viewHolder.getItemId() == j && !viewHolder.wasReturnedFromScrap()) {
                    if (i == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.mState.m35608e()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    } else if (!z) {
                        this.f4765a.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        m35626y(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.f4767c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = this.f4767c.get(size2);
                if (viewHolder2.getItemId() == j && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.f4767c.remove(size2);
                        }
                        return viewHolder2;
                    } else if (!z) {
                        m35663A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        ViewHolder m35638m(int i, boolean z) {
            View m35930e;
            int size = this.f4765a.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = this.f4765a.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i && !viewHolder.isInvalid() && (RecyclerView.this.mState.f4790h || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z && (m35930e = RecyclerView.this.mChildHelper.m35930e(i)) != null) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(m35930e);
                RecyclerView.this.mChildHelper.m35916s(m35930e);
                int m35922m = RecyclerView.this.mChildHelper.m35922m(m35930e);
                if (m35922m != -1) {
                    RecyclerView.this.mChildHelper.m35931d(m35922m);
                    m35660D(m35930e);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f4767c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ViewHolder viewHolder2 = this.f4767c.get(i3);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f4767c.remove(i3);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        /* renamed from: n */
        View m35637n(int i) {
            return this.f4765a.get(i).itemView;
        }

        /* renamed from: o */
        public View m35636o(int i) {
            return m35635p(i, false);
        }

        /* renamed from: p */
        View m35635p(int i, boolean z) {
            return m35655I(i, z, RecyclerView.FOREVER_NS).itemView;
        }

        /* renamed from: s */
        void m35632s() {
            int size = this.f4767c.size();
            for (int i = 0; i < size; i++) {
                C1772i c1772i = (C1772i) this.f4767c.get(i).itemView.getLayoutParams();
                if (c1772i != null) {
                    c1772i.f4816l = true;
                }
            }
        }

        /* renamed from: t */
        void m35631t() {
            int size = this.f4767c.size();
            for (int i = 0; i < size; i++) {
                ViewHolder viewHolder = this.f4767c.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter == null || !adapter.hasStableIds()) {
                m35625z();
            }
        }

        /* renamed from: u */
        void m35630u(int i, int i2) {
            int size = this.f4767c.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewHolder viewHolder = this.f4767c.get(i3);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    viewHolder.offsetPosition(i2, false);
                }
            }
        }

        /* renamed from: v */
        void m35629v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f4767c.size();
            for (int i7 = 0; i7 < size; i7++) {
                ViewHolder viewHolder = this.f4767c.get(i7);
                if (viewHolder != null && (i6 = viewHolder.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        viewHolder.offsetPosition(i2 - i, false);
                    } else {
                        viewHolder.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m35628w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4767c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4767c.get(size);
                if (viewHolder != null) {
                    int i4 = viewHolder.mPosition;
                    if (i4 >= i3) {
                        viewHolder.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        viewHolder.addFlags(8);
                        m35663A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m35627x(Adapter adapter, Adapter adapter2, boolean z) {
            m35648c();
            m35642i().m35669h(adapter, adapter2, z);
        }

        /* renamed from: y */
        void m35626y(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m35661C(childViewHolderInt);
        }

        /* renamed from: z */
        void m35625z() {
            for (int size = this.f4767c.size() - 1; size >= 0; size--) {
                m35663A(size);
            }
            this.f4767c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m35896b();
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface RecyclerListener {
        /* renamed from: a */
        void m35624a(ViewHolder viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RecyclerViewDataObserver extends AdapterDataObserver {
        RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo34897a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f4789g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.m35946p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo34922c(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35944r(i, i2, obj)) {
                m35622h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo34921d(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35943s(i, i2)) {
                m35622h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo34920e(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35942t(i, i2, i3)) {
                m35622h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo34919f(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35941u(i, i2)) {
                m35622h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: g */
        public void mo35623g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (adapter = recyclerView.mAdapter) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: h */
        void m35622h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C1365w0.m37201i0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final Action mRecyclingAction = new Action(0, 0);

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class Action {

            /* renamed from: a */
            private int f4776a;

            /* renamed from: b */
            private int f4777b;

            /* renamed from: c */
            private int f4778c;

            /* renamed from: d */
            private int f4779d;

            /* renamed from: e */
            private Interpolator f4780e;

            /* renamed from: f */
            private boolean f4781f;

            /* renamed from: g */
            private int f4782g;

            public Action(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m35613e() {
                if (this.f4780e != null && this.f4778c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4778c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }

            /* renamed from: a */
            boolean m35617a() {
                return this.f4779d >= 0;
            }

            /* renamed from: b */
            public void m35616b(int i) {
                this.f4779d = i;
            }

            /* renamed from: c */
            void m35615c(RecyclerView recyclerView) {
                int i = this.f4779d;
                if (i >= 0) {
                    this.f4779d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f4781f = false;
                } else if (this.f4781f) {
                    m35613e();
                    recyclerView.mViewFlinger.m35600e(this.f4776a, this.f4777b, this.f4778c, this.f4780e);
                    int i2 = this.f4782g + 1;
                    this.f4782g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4781f = false;
                } else {
                    this.f4782g = 0;
                }
            }

            /* renamed from: d */
            public void m35614d(int i, int i2, int i3, Interpolator interpolator) {
                this.f4776a = i;
                this.f4777b = i2;
                this.f4778c = i3;
                this.f4780e = interpolator;
                this.f4781f = true;
            }

            public Action(int i, int i2, int i3, Interpolator interpolator) {
                this.f4779d = -1;
                this.f4781f = false;
                this.f4782g = 0;
                this.f4776a = i;
                this.f4777b = i2;
                this.f4778c = i3;
                this.f4780e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SmoothScroller$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public interface InterfaceC1763a {
            /* renamed from: a */
            PointF mo28517a(int i);
        }

        public PointF computeScrollVectorForPosition(int i) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof InterfaceC1763a) {
                return ((InterfaceC1763a) layoutManager).mo28517a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1763a.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.mo35749N(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.m35736U();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m35615c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean m35617a = this.mRecyclingAction.m35617a();
                this.mRecyclingAction.m35615c(recyclerView);
                if (m35617a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m35601d();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i, int i2, State state, Action action);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, State state, Action action);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.mViewFlinger.m35599f();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i = this.mTargetPosition;
            if (i != -1) {
                recyclerView.mState.f4783a = i;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.mViewFlinger.m35601d();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void stop() {
            if (!this.mRunning) {
                return;
            }
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f4783a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.m35707n1(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class State {

        /* renamed from: b */
        private SparseArray<Object> f4784b;

        /* renamed from: m */
        int f4795m;

        /* renamed from: n */
        long f4796n;

        /* renamed from: o */
        int f4797o;

        /* renamed from: p */
        int f4798p;

        /* renamed from: q */
        int f4799q;

        /* renamed from: a */
        int f4783a = -1;

        /* renamed from: c */
        int f4785c = 0;

        /* renamed from: d */
        int f4786d = 0;

        /* renamed from: e */
        int f4787e = 1;

        /* renamed from: f */
        int f4788f = 0;

        /* renamed from: g */
        boolean f4789g = false;

        /* renamed from: h */
        boolean f4790h = false;

        /* renamed from: i */
        boolean f4791i = false;

        /* renamed from: j */
        boolean f4792j = false;

        /* renamed from: k */
        boolean f4793k = false;

        /* renamed from: l */
        boolean f4794l = false;

        /* renamed from: a */
        void m35612a(int i) {
            if ((this.f4787e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4787e));
        }

        /* renamed from: b */
        public int m35611b() {
            if (this.f4790h) {
                return this.f4785c - this.f4786d;
            }
            return this.f4788f;
        }

        /* renamed from: c */
        public int m35610c() {
            return this.f4783a;
        }

        /* renamed from: d */
        public boolean m35609d() {
            return this.f4783a != -1;
        }

        /* renamed from: e */
        public boolean m35608e() {
            return this.f4790h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m35607f(Adapter adapter) {
            this.f4787e = 1;
            this.f4788f = adapter.getItemCount();
            this.f4790h = false;
            this.f4791i = false;
            this.f4792j = false;
        }

        /* renamed from: g */
        public boolean m35606g() {
            return this.f4794l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4783a + ", mData=" + this.f4784b + ", mItemCount=" + this.f4788f + ", mIsMeasuring=" + this.f4792j + ", mPreviousLayoutItemCount=" + this.f4785c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4786d + ", mStructureChanged=" + this.f4789g + ", mInPreLayout=" + this.f4790h + ", mRunSimpleAnimations=" + this.f4793k + ", mRunPredictiveAnimations=" + this.f4794l + '}';
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class ViewCacheExtension {
        /* renamed from: a */
        public abstract View m35605a(Recycler recycler, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class ViewFlinger implements Runnable {

        /* renamed from: j */
        private int f4800j;

        /* renamed from: k */
        private int f4801k;

        /* renamed from: l */
        OverScroller f4802l;

        /* renamed from: m */
        Interpolator f4803m;

        /* renamed from: n */
        private boolean f4804n;

        /* renamed from: o */
        private boolean f4805o;

        ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f4803m = interpolator;
            this.f4804n = false;
            this.f4805o = false;
            this.f4802l = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m35604a(int i, int i2) {
            boolean z;
            int height;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: c */
        private void m35602c() {
            RecyclerView.this.removeCallbacks(this);
            C1365w0.m37201i0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void m35603b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4801k = 0;
            this.f4800j = 0;
            Interpolator interpolator = this.f4803m;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f4803m = interpolator2;
                this.f4802l = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4802l.fling(0, 0, i, i2, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES);
            m35601d();
        }

        /* renamed from: d */
        void m35601d() {
            if (this.f4804n) {
                this.f4805o = true;
            } else {
                m35602c();
            }
        }

        /* renamed from: e */
        public void m35600e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m35604a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f4803m != interpolator) {
                this.f4803m = interpolator;
                this.f4802l = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4801k = 0;
            this.f4800j = 0;
            RecyclerView.this.setScrollState(2);
            this.f4802l.startScroll(0, 0, i, i2, i4);
            m35601d();
        }

        /* renamed from: f */
        public void m35599f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4802l.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m35599f();
                return;
            }
            this.f4805o = false;
            this.f4804n = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f4802l;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f4800j;
                int i5 = currY - this.f4801k;
                this.f4800j = currX;
                this.f4801k = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    SmoothScroller smoothScroller = recyclerView4.mLayout.f4742p;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int m35611b = RecyclerView.this.mState.m35611b();
                        if (m35611b == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= m35611b) {
                            smoothScroller.setTargetPosition(m35611b - 1);
                            smoothScroller.onAnimation(i2, i);
                        } else {
                            smoothScroller.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i6 == 0) || (!z2 && i7 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                SmoothScroller smoothScroller2 = RecyclerView.this.mLayout.f4742p;
                if (smoothScroller2 != null && smoothScroller2.isPendingInitialRun()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m35896b();
                    }
                } else {
                    m35601d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView7.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.m35901f(recyclerView7, i2, i);
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.mLayout.f4742p;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.f4804n = false;
            if (this.f4805o) {
                m35602c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C1365w0.m37227R(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0 && !C1365w0.m37227R(this.itemView)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C1772i) this.itemView.getLayoutParams()).f4816l = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C1365w0.m37168z(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.m35654J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1764a implements Runnable {
        RunnableC1764a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1765b implements Runnable {
        RunnableC1765b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class animationInterpolatorC1766c implements Interpolator {
        animationInterpolatorC1766c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1767d implements ViewInfoStore.ProcessCallback {
        C1767d() {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: a */
        public void mo35436a(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: b */
        public void mo35435b(ViewHolder viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m35686v1(viewHolder.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: c */
        public void mo35434c(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.mRecycler.m35654J(viewHolder);
            RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: d */
        public void mo35433d(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            viewHolder.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1768e implements ChildHelper.InterfaceC1729b {
        C1768e() {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: a */
        public void mo35598a(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: b */
        public ViewHolder mo35597b(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: c */
        public void mo35596c(int i) {
            ViewHolder childViewHolderInt;
            View childAt = getChildAt(i);
            if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: d */
        public void mo35595d(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: e */
        public void mo35594e() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: f */
        public int mo35593f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: g */
        public void mo35592g(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        public View getChildAt(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: h */
        public void mo35591h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.InterfaceC1729b
        /* renamed from: i */
        public void mo35590i(View view, int i, ViewGroup.LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1769f implements AdapterHelper.InterfaceC1726a {
        C1769f() {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: a */
        public void mo35589a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: b */
        public void mo35588b(AdapterHelper.C1727b c1727b) {
            m35581i(c1727b);
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: c */
        public void mo35587c(AdapterHelper.C1727b c1727b) {
            m35581i(c1727b);
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: d */
        public void mo35586d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: e */
        public void mo35585e(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: f */
        public ViewHolder mo35584f(int i) {
            ViewHolder findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.m35921n(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: g */
        public void mo35583g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.InterfaceC1726a
        /* renamed from: h */
        public void mo35582h(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f4786d += i2;
        }

        /* renamed from: i */
        void m35581i(AdapterHelper.C1727b c1727b) {
            int i = c1727b.f4567a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.mLayout.mo28515b1(recyclerView, c1727b.f4568b, c1727b.f4570d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.mo28509e1(recyclerView2, c1727b.f4568b, c1727b.f4570d, c1727b.f4569c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo28513c1(recyclerView3, c1727b.f4568b, c1727b.f4570d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.mLayout.mo28519Z0(recyclerView4, c1727b.f4568b, c1727b.f4570d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C1770g {

        /* renamed from: a */
        static final /* synthetic */ int[] f4812a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f4812a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4812a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C1771h implements ItemAnimator.ItemAnimatorListener {
        C1771h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        /* renamed from: a */
        public void mo35580a(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(viewHolder.itemView) && viewHolder.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new animationInterpolatorC1766c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        boolean z;
        View view = viewHolder.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.mRecycler.m35654J(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.m35932c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m35933b(view, true);
        } else {
            this.mChildHelper.m35924k(view);
        }
    }

    private void animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.m35654J(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(LayoutManager.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(ItemAnimator.FLAG_MOVED);
            C1195b.m37533b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.m35612a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4792j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m35448f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        state.f4791i = (state.f4793k && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.f4790h = state.f4794l;
        state.f4788f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4793k) {
            int m35928g = this.mChildHelper.m35928g();
            for (int i = 0; i < m35928g; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35929f(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m35449e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f4791i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m35451c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4794l) {
            saveOldPositions();
            State state2 = this.mState;
            boolean z2 = state2.f4789g;
            state2.f4789g = false;
            this.mLayout.mo28507f1(this.mRecycler, state2);
            this.mState.f4789g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.m35928g(); i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m35929f(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m35445i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    ItemAnimator.ItemHolderInfo recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.m35453a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f4787e = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m35612a(6);
        this.mAdapterHelper.m35952j();
        this.mState.f4788f = this.mAdapter.getItemCount();
        this.mState.f4786d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f4775l;
            if (parcelable != null) {
                this.mLayout.mo28500k1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.f4790h = false;
        this.mLayout.mo28507f1(this.mRecycler, state);
        State state2 = this.mState;
        state2.f4789g = false;
        if (state2.f4793k && this.mItemAnimator != null) {
            z = true;
        } else {
            z = false;
        }
        state2.f4793k = z;
        state2.f4787e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m35612a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.f4787e = 1;
        if (state.f4793k) {
            for (int m35928g = this.mChildHelper.m35928g() - 1; m35928g >= 0; m35928g--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35929f(m35928g));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.ItemHolderInfo recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    ViewHolder m35447g = this.mViewInfoStore.m35447g(changedHolderKey);
                    if (m35447g != null && !m35447g.shouldIgnore()) {
                        boolean m35446h = this.mViewInfoStore.m35446h(m35447g);
                        boolean m35446h2 = this.mViewInfoStore.m35446h(childViewHolderInt);
                        if (m35446h && m35447g == childViewHolderInt) {
                            this.mViewInfoStore.m35450d(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            ItemAnimator.ItemHolderInfo m35440n = this.mViewInfoStore.m35440n(m35447g);
                            this.mViewInfoStore.m35450d(childViewHolderInt, recordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo m35441m = this.mViewInfoStore.m35441m(childViewHolderInt);
                            if (m35440n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, m35447g);
                            } else {
                                animateChange(m35447g, childViewHolderInt, m35440n, m35441m, m35446h, m35446h2);
                            }
                        }
                    } else {
                        this.mViewInfoStore.m35450d(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            this.mViewInfoStore.m35439o(this.mViewInfoProcessCallback);
        }
        this.mLayout.m35688u1(this.mRecycler);
        State state2 = this.mState;
        state2.f4785c = state2.f4788f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        state2.f4793k = false;
        state2.f4794l = false;
        this.mLayout.f4743q = false;
        ArrayList<ViewHolder> arrayList = this.mRecycler.f4766b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.f4749w) {
            layoutManager.f4748v = 0;
            layoutManager.f4749w = false;
            this.mRecycler.m35653K();
        }
        this.mLayout.mo28505g1(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m35448f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int m35928g = this.mChildHelper.m35928g();
        if (m35928g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = ViewDefaults.NUMBER_OF_LINES;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m35928g; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35929f(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        ViewHolder findViewHolderForAdapterPosition;
        State state = this.mState;
        int i = state.f4795m;
        if (i == -1) {
            i = 0;
        }
        int m35611b = state.m35611b();
        for (int i2 = i; i2 < m35611b; i2++) {
            ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(m35611b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C1772i) view.getLayoutParams()).f4814j;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C1772i c1772i = (C1772i) view.getLayoutParams();
        Rect rect2 = c1772i.f4815k;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1772i).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1772i).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1772i).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1772i).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int m35928g = this.mChildHelper.m35928g();
        for (int i = 0; i < m35928g; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35929f(i));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter != null && adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int m35928g = this.mChildHelper.m35928g();
        for (int i = 0; i < m35928g; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35929f(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C1365w0.m37260A(this) == 0) {
            C1365w0.m37257B0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new C1768e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        if (this.mLayout.m35713k0() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                if (c <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
                        } else if (i3 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i3 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c <= 0 && (c != 0 || i3 * i2 <= 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c >= 0 && (c != 0 || i3 * i2 >= 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int[] iArr = this.mReusableIntPair;
            int i8 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean mo28487v = layoutManager.mo28487v();
            boolean mo28485w = this.mLayout.mo28485w();
            if (mo28485w) {
                i4 = mo28487v | 2;
            } else {
                i4 = mo28487v;
            }
            startNestedScroll(i4, i3);
            if (mo28487v != 0) {
                i5 = i;
            } else {
                i5 = 0;
            }
            if (mo28485w) {
                i6 = i2;
            } else {
                i6 = 0;
            }
            if (dispatchNestedPreScroll(i5, i6, this.mReusableIntPair, this.mScrollOffset, i3)) {
                int[] iArr2 = this.mReusableIntPair;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            if (mo28487v != 0) {
                i7 = i;
            } else {
                i7 = 0;
            }
            if (mo28485w) {
                i8 = i2;
            }
            scrollByInternal(i7, i8, motionEvent, i3);
            GapWorker gapWorker = this.mGapWorker;
            if (gapWorker != null && (i != 0 || i2 != 0)) {
                gapWorker.m35901f(this, i, i2);
            }
            stopNestedScroll(i3);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo35545U1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m35937y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo35533a1(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m35939w();
        } else {
            this.mAdapterHelper.m35952j();
        }
        boolean z4 = false;
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z = false;
        } else {
            z = true;
        }
        State state = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z3 = this.mDataSetHasChangedAfterLayout) || z || this.mLayout.f4743q) && (!z3 || this.mAdapter.hasStableIds()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        state.f4793k = z2;
        State state2 = this.mState;
        if (state2.f4793k && z && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z4 = true;
        }
        state2.f4794l = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C1422d.m36911c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C1422d.m36911c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C1422d.m36911c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C1422d.m36911c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.C1365w0.m37203h0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        ViewHolder viewHolder;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.m35928g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.m35921n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.f4796n != -1 && this.mAdapter.hasStableIds()) {
                    viewHolder = findViewHolderForItemId(this.mState.f4796n);
                } else {
                    viewHolder = null;
                }
                if (viewHolder != null && !this.mChildHelper.m35921n(viewHolder.itemView) && viewHolder.itemView.hasFocusable()) {
                    view = viewHolder.itemView;
                } else if (this.mChildHelper.m35928g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f4797o;
                    if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1365w0.m37203h0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1772i) {
            C1772i c1772i = (C1772i) layoutParams;
            if (!c1772i.f4816l) {
                Rect rect = c1772i.f4815k;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        LayoutManager layoutManager = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        layoutManager.mo34918B1(this, view, rect3, z2, z);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.f4796n = -1L;
        state.f4795m = -1;
        state.f4797o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j;
        int absoluteAdapterPosition;
        ViewHolder viewHolder = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            viewHolder = findContainingViewHolder(view);
        }
        if (viewHolder == null) {
            resetFocusInfo();
            return;
        }
        State state = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j = viewHolder.getItemId();
        } else {
            j = -1;
        }
        state.f4796n = j;
        State state2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (viewHolder.isRemoved()) {
            absoluteAdapterPosition = viewHolder.mOldPosition;
        } else {
            absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        }
        state2.f4795m = absoluteAdapterPosition;
        this.mState.f4797o = getDeepestFocusedViewWithId(viewHolder.itemView);
    }

    private void setAdapterInternal(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m35937y();
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo28540M0(adapter3, this.mAdapter);
        }
        this.mRecycler.m35627x(adapter3, this.mAdapter, z);
        this.mState.f4789g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m35599f();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.m35737T1();
        }
    }

    void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C1365w0.m37203h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.m35748N0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(ItemDecoration itemDecoration, int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35513r("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(RecyclerListener recyclerListener) {
        boolean z;
        if (recyclerListener != null) {
            z = true;
        } else {
            z = false;
        }
        C1138f.m37829a(z, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    void animateAppearance(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null && !itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1772i) && this.mLayout.mo28483x((C1772i) layoutParams);
    }

    void clearOldPositions() {
        int m35925j = this.mChildHelper.m35925j();
        for (int i = 0; i < m35925j; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m35647d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.mo28487v()) {
            return 0;
        }
        return this.mLayout.mo28561B(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.mo28487v()) {
            return 0;
        }
        return this.mLayout.mo28559C(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.mo28487v()) {
            return 0;
        }
        return this.mLayout.mo28557D(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.mo28485w()) {
            return 0;
        }
        return this.mLayout.mo28555E(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.mo28485w()) {
            return 0;
        }
        return this.mLayout.mo28552F(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.mo28485w()) {
            return 0;
        }
        return this.mLayout.mo28549G(this.mState);
    }

    void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1365w0.m37203h0(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.m35946p()) {
                return;
            }
            if (this.mAdapterHelper.m35947o(4) && !this.mAdapterHelper.m35947o(11)) {
                C1071r.m37959a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m35939w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m35953i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C1071r.m37958b();
                return;
            } else if (this.mAdapterHelper.m35946p()) {
                C1071r.m37959a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C1071r.m37958b();
                return;
            } else {
                return;
            }
        }
        C1071r.m37959a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        C1071r.m37958b();
    }

    void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(LayoutManager.m35681y(i, getPaddingLeft() + getPaddingRight(), C1365w0.m37254D(this)), LayoutManager.m35681y(i2, getPaddingTop() + getPaddingBottom(), C1365w0.m37256C(this)));
    }

    void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchLayout() {
        boolean z;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f4792j = false;
            if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
                z = true;
            } else {
                z = false;
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f4787e == 1) {
                dispatchLayoutStep1();
                this.mLayout.m35758I1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.m35945q() && !z && this.mLayout.m35687v0() == getWidth() && this.mLayout.m35719h0() == getHeight()) {
                this.mLayout.m35758I1(this);
            } else {
                this.mLayout.m35758I1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m37770a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m37769b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m37768c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m37765f(i, i2, i3, i4, iArr);
    }

    void dispatchOnScrollStateChanged(int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35519m1(i);
        }
        onScrollStateChanged(i);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                C1365w0.m37259A0(viewHolder.itemView, i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z5 = z;
        }
        if (z5) {
            C1365w0.m37203h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect m35778a = this.mEdgeEffectFactory.m35778a(this, 3);
        this.mBottomGlow = m35778a;
        if (this.mClipToPadding) {
            m35778a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m35778a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect m35778a = this.mEdgeEffectFactory.m35778a(this, 0);
        this.mLeftGlow = m35778a;
        if (this.mClipToPadding) {
            m35778a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m35778a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect m35778a = this.mEdgeEffectFactory.m35778a(this, 2);
        this.mRightGlow = m35778a;
        if (this.mClipToPadding) {
            m35778a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m35778a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect m35778a = this.mEdgeEffectFactory.m35778a(this, 1);
        this.mTopGlow = m35778a;
        if (this.mClipToPadding) {
            m35778a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m35778a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f4802l;
            state.f4798p = overScroller.getFinalX() - overScroller.getCurrX();
            state.f4799q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        state.f4798p = 0;
        state.f4799q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int m35928g = this.mChildHelper.m35928g() - 1; m35928g >= 0; m35928g--) {
            View m35929f = this.mChildHelper.m35929f(m35928g);
            float translationX = m35929f.getTranslationX();
            float translationY = m35929f.getTranslationY();
            if (f >= m35929f.getLeft() + translationX && f <= m35929f.getRight() + translationX && f2 >= m35929f.getTop() + translationY && f2 <= m35929f.getBottom() + translationY) {
                return m35929f;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public ViewHolder findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m35925j = this.mChildHelper.m35925j();
        for (int i2 = 0; i2 < m35925j; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (this.mChildHelper.m35921n(childViewHolderInt.itemView)) {
                    viewHolder = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int m35925j = this.mChildHelper.m35925j();
            for (int i = 0; i < m35925j; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (this.mChildHelper.m35921n(childViewHolderInt.itemView)) {
                        viewHolder = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        boolean z;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            int mo28487v = layoutManager.mo28487v();
            boolean mo28485w = this.mLayout.mo28485w();
            if (mo28487v == 0 || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!mo28485w || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            float f2 = i2;
            if (!dispatchNestedPreFling(f, f2)) {
                if (mo28487v == 0 && !mo28485w) {
                    z = false;
                } else {
                    z = true;
                }
                dispatchNestedFling(f, f2, z);
                OnFlingListener onFlingListener = this.mOnFlingListener;
                if (onFlingListener != null && onFlingListener.mo35340a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (mo28485w) {
                        mo28487v = (mo28487v == true ? 1 : 0) | 2;
                    }
                    startNestedScroll(mo28487v, 1);
                    int i3 = this.mMaxFlingVelocity;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.mMaxFlingVelocity;
                    this.mViewFlinger.m35603b(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View m35728Y0 = this.mLayout.m35728Y0(view, i);
        if (m35728Y0 != null) {
            return m35728Y0;
        }
        boolean z5 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z = true;
        } else {
            z = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z && (i == 2 || i == 1)) {
            if (this.mLayout.mo28485w()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.mo28487v()) {
                if (this.mLayout.m35713k0() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo35550R0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo35550R0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            requestChildOnScreen(view2, null);
            return view;
        } else if (!isPreferredNextFocus(view, view2, i)) {
            return super.focusSearch(view, i);
        } else {
            return view2;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.mo28537O();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.mo28533P(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (!viewHolder.hasAnyOfTheFlags(524) && viewHolder.isBound()) {
            return this.mAdapterHelper.m35957e(viewHolder.mPosition);
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.m35742R();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return childDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
    }

    public long getChildItemId(View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        C1772i c1772i = (C1772i) view.getLayoutParams();
        if (!c1772i.f4816l) {
            return c1772i.f4815k;
        }
        if (this.mState.m35608e() && (c1772i.m35578b() || c1772i.m35576e())) {
            return c1772i.f4815k;
        }
        Rect rect = c1772i.f4815k;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1772i.f4816l = false;
        return rect;
    }

    public ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.m35642i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m37760k();
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.m35946p()) {
            return false;
        }
        return true;
    }

    void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new C1769f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1795d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C10227b.f26540a), resources.getDimensionPixelSize(C10227b.f26542c), resources.getDimensionPixelOffset(C10227b.f26541b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35513r("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m37758m();
    }

    void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.mo28548G1(i);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int m35925j = this.mChildHelper.m35925j();
        for (int i = 0; i < m35925j; i++) {
            ((C1772i) this.mChildHelper.m35926i(i).getLayoutParams()).f4816l = true;
        }
        this.mRecycler.m35632s();
    }

    void markKnownViewsInvalid() {
        int m35925j = this.mChildHelper.m35925j();
        for (int i = 0; i < m35925j; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m35631t();
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int m35928g = this.mChildHelper.m35928g();
        for (int i2 = 0; i2 < m35928g; i2++) {
            this.mChildHelper.m35929f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int m35928g = this.mChildHelper.m35928g();
        for (int i2 = 0; i2 < m35928g; i2++) {
            this.mChildHelper.m35929f(i2).offsetTopAndBottom(i);
        }
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
        int m35925j = this.mChildHelper.m35925j();
        for (int i3 = 0; i3 < m35925j; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f4789g = true;
            }
        }
        this.mRecycler.m35630u(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m35925j = this.mChildHelper.m35925j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m35925j; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f4789g = true;
            }
        }
        this.mRecycler.m35629v(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m35925j = this.mChildHelper.m35925j();
        for (int i4 = 0; i4 < m35925j; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f4789g = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f4789g = true;
                }
            }
        }
        this.mRecycler.m35628w(i, i2, z);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.mLayout
            if (r1 == 0) goto L1e
            r1.m35754K(r5)
        L1e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> r0 = androidx.recyclerview.widget.GapWorker.f4615n
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.GapWorker r1 = (androidx.recyclerview.widget.GapWorker) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.GapWorker r1 = new androidx.recyclerview.widget.GapWorker
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.C1365w0.m37176v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.GapWorker r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4619l = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.GapWorker r0 = r5.mGapWorker
            r0.m35906a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.m35752L(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m35444j();
        if (ALLOW_THREAD_GAP_WORK && (gapWorker = this.mGapWorker) != null) {
            gapWorker.m35897j(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.mo28485w()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.mo28487v()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.mo28485w()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.mo28487v()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean mo28487v = layoutManager.mo28487v();
        boolean mo28485w = this.mLayout.mo28485w();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x;
                            this.mInitialTouchX = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y;
                            this.mInitialTouchY = y;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i = x2 - this.mInitialTouchX;
                        int i2 = y2 - this.mInitialTouchY;
                        if (mo28487v && Math.abs(i) > this.mTouchSlop) {
                            this.mLastTouchX = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (mo28485w && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchY = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = mo28487v;
            if (mo28485w) {
                i3 = (mo28487v ? 1 : 0) | 2;
            }
            startNestedScroll(i3, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1071r.m37959a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C1071r.m37958b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.mo28480z0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.m35718h1(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.f4787e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.m35755J1(i, i2);
                this.mState.f4792j = true;
                dispatchLayoutStep2();
                this.mLayout.m35750M1(i, i2);
                if (this.mLayout.mo35744P1()) {
                    this.mLayout.m35755J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f4792j = true;
                    dispatchLayoutStep2();
                    this.mLayout.m35750M1(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.m35718h1(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                State state = this.mState;
                if (state.f4794l) {
                    state.f4790h = true;
                } else {
                    this.mAdapterHelper.m35952j();
                    this.mState.f4790h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f4794l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.mAdapter;
            if (adapter != null) {
                this.mState.f4788f = adapter.getItemCount();
            } else {
                this.mState.f4788f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.m35718h1(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f4790h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.m34884a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m35621b(savedState2);
        } else {
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                savedState.f4775l = layoutManager.mo28498l1();
            } else {
                savedState.f4775l = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C1365w0.m37201i0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.f4791i && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.m35451c(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.m35449e(viewHolder, itemHolderInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.m35691t1(this.mRecycler);
            this.mLayout.m35688u1(this.mRecycler);
        }
        this.mRecycler.m35648c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m35917r = this.mChildHelper.m35917r(view);
        if (m35917r) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m35654J(childViewHolderInt);
            this.mRecycler.m35661C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!m35917r);
        return m35917r;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(ItemDecoration itemDecoration) {
        boolean z;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35513r("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    void repositionShadowingViews() {
        ViewHolder viewHolder;
        int m35928g = this.mChildHelper.m35928g();
        for (int i = 0; i < m35928g; i++) {
            View m35929f = this.mChildHelper.m35929f(i);
            ViewHolder childViewHolder = getChildViewHolder(m35929f);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = m35929f.getLeft();
                int top = m35929f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.m35714j1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.m35772A1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void saveOldPositions() {
        int m35925j = this.mChildHelper.m35925j();
        for (int i = 0; i < m35925j; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35926i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean mo28487v = layoutManager.mo28487v();
            boolean mo28485w = this.mLayout.mo28485w();
            if (mo28487v || mo28485w) {
                if (!mo28487v) {
                    i = 0;
                }
                if (!mo28485w) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null, 0);
            }
        }
    }

    boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        if (i10 == 0 && i12 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C1302n0.m37373a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z || i5 != 0 || i4 != 0) {
            return true;
        }
        return false;
    }

    void scrollStep(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1071r.m37959a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            i3 = this.mLayout.mo28551F1(i, this.mRecycler, this.mState);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.mLayout.mo28546H1(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        C1071r.m37958b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        layoutManager.mo28548G1(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        C1365w0.m37185q0(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ChildDrawingOrderCallback childDrawingOrderCallback) {
        boolean z;
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        if (childDrawingOrderCallback != null) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        C1365w0.m37259A0(viewHolder.itemView, i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(EdgeEffectFactory edgeEffectFactory) {
        C1138f.m37824f(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m35657G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.m35691t1(this.mRecycler);
            this.mLayout.m35688u1(this.mRecycler);
            this.mRecycler.m35648c();
            if (this.mIsAttached) {
                this.mLayout.m35752L(this, this.mRecycler);
            }
            this.mLayout.m35747N1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m35648c();
        }
        this.mChildHelper.m35920o();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f4737k == null) {
                layoutManager.m35747N1(this);
                if (this.mIsAttached) {
                    this.mLayout.m35754K(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f4737k.exceptionLabel());
            }
        }
        this.mRecycler.m35653K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m37757n(z);
    }

    public void setOnFlingListener(OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        this.mRecycler.m35659E(recycledViewPool);
    }

    @Deprecated
    public void setRecyclerListener(RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
        this.mRecycler.m35658F(viewCacheExtension);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = C1195b.m37534a(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.mo27232R1(this, this.mState, i);
        }
    }

    void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m37755p(i);
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m37753r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int m35925j = this.mChildHelper.m35925j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m35925j; i5++) {
            View m35926i = this.mChildHelper.m35926i(i5);
            ViewHolder childViewHolderInt = getChildViewHolderInt(m35926i);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i3 = childViewHolderInt.mPosition) >= i && i3 < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C1772i) m35926i.getLayoutParams()).f4816l = true;
            }
        }
        this.mRecycler.m35651M(i, i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10226a.f26539a);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m37767d(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m37764g(i, i2, i3, i4, iArr, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.m35925j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.m35926i(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m35921n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m37759l(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m37754q(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m37752s(i);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class SavedState extends AbstractC1964a {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1762a();

        /* renamed from: l */
        Parcelable f4775l;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1762a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1762a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4775l = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m35621b(SavedState savedState) {
            this.f4775l = savedState.f4775l;
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4775l, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new RunnableC1764a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new EdgeEffectFactory();
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1771h();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1765b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1767d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C1262g2.m37449b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C1262g2.m37447d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C1365w0.m37168z(this) == 0) {
            C1365w0.m37259A0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = C10229d.f26552f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C1365w0.m37189o0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C10229d.f26561o);
        if (obtainStyledAttributes.getInt(C10229d.f26555i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C10229d.f26554h, true);
        boolean z = obtainStyledAttributes.getBoolean(C10229d.f26556j, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C10229d.f26559m), obtainStyledAttributes.getDrawable(C10229d.f26560n), (StateListDrawable) obtainStyledAttributes.getDrawable(C10229d.f26557k), obtainStyledAttributes.getDrawable(C10229d.f26558l));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C1365w0.m37189o0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m37766e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1772i extends ViewGroup.MarginLayoutParams {

        /* renamed from: j */
        ViewHolder f4814j;

        /* renamed from: k */
        final Rect f4815k;

        /* renamed from: l */
        boolean f4816l;

        /* renamed from: m */
        boolean f4817m;

        public C1772i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4815k = new Rect();
            this.f4816l = true;
            this.f4817m = false;
        }

        /* renamed from: a */
        public int m35579a() {
            return this.f4814j.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m35578b() {
            return this.f4814j.isUpdated();
        }

        /* renamed from: d */
        public boolean m35577d() {
            return this.f4814j.isRemoved();
        }

        /* renamed from: e */
        public boolean m35576e() {
            return this.f4814j.isInvalid();
        }

        public C1772i(int i, int i2) {
            super(i, i2);
            this.f4815k = new Rect();
            this.f4816l = true;
            this.f4817m = false;
        }

        public C1772i(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4815k = new Rect();
            this.f4816l = true;
            this.f4817m = false;
        }

        public C1772i(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4815k = new Rect();
            this.f4816l = true;
            this.f4817m = false;
        }

        public C1772i(C1772i c1772i) {
            super((ViewGroup.LayoutParams) c1772i);
            this.f4815k = new Rect();
            this.f4816l = true;
            this.f4817m = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.mo35552Q(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!layoutManager.mo28487v()) {
                i = 0;
            }
            if (!this.mLayout.mo28485w()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (i3 == Integer.MIN_VALUE || i3 > 0) {
                if (z) {
                    int i4 = i != 0 ? 1 : 0;
                    if (i2 != 0) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                }
                this.mViewFlinger.m35600e(i, i2, i3, interpolator);
                return;
            }
            scrollBy(i, i2);
        }
    }

    public void addItemDecoration(ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }
}
