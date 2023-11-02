package com.facebook.react.uimanager;

import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.AbstractC4344h;
import com.facebook.yoga.C4340d;
import com.facebook.yoga.EnumC4341e;
import com.facebook.yoga.EnumC4342f;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import p058d5.C5743a;

@ReactPropertyHolder
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    private static final YogaConfig sYogaConfig = ReactYogaConfigProvider.get();
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private ReactShadowNodeImpl mLayoutParent;
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;
    private ReactShadowNodeImpl mNativeParent;
    private final float[] mPadding;
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private ThemedReactContext mThemedContext;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private YogaNode mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final Spacing mDefaultPadding = new Spacing(0.0f);

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (!isVirtual()) {
            YogaNode acquire = YogaNodePool.get().acquire();
            acquire = acquire == null ? AbstractC4344h.m29965a(sYogaConfig) : acquire;
            this.mYogaNode = acquire;
            acquire.mo30044D(this);
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHierarchyInfoWithIndentation(sb2, i + 1);
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        NativeKind nativeKind = getNativeKind();
        if (nativeKind == NativeKind.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind != NativeKind.LEAF) {
            return 1;
        }
        return this.mTotalNativeChildren + 1;
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (getNativeKind() != NativeKind.PARENT) {
            for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i;
                if (parent.getNativeKind() == NativeKind.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updatePadding() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb6
            if (r0 == 0) goto L62
            r2 = 2
            if (r0 == r2) goto L62
            r2 = 4
            if (r0 == r2) goto L62
            r2 = 5
            if (r0 != r2) goto L11
            goto L62
        L11:
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 != r2) goto L18
            goto L33
        L18:
            float[] r1 = r4.mPadding
            r1 = r1[r0]
            boolean r1 = com.facebook.yoga.C4340d.m29971a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.e r2 = com.facebook.yoga.EnumC4341e.m29970a(r0)
            com.facebook.react.uimanager.Spacing r3 = r4.mDefaultPadding
            float r3 = r3.getRaw(r0)
            r1.mo30011f0(r2, r3)
            goto Lb2
        L33:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.C4340d.m29971a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.C4340d.m29971a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.C4340d.m29971a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.e r2 = com.facebook.yoga.EnumC4341e.m29970a(r0)
            com.facebook.react.uimanager.Spacing r3 = r4.mDefaultPadding
            float r3 = r3.getRaw(r0)
            r1.mo30011f0(r2, r3)
            goto Lb2
        L62:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.C4340d.m29971a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.C4340d.m29971a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.C4340d.m29971a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.e r2 = com.facebook.yoga.EnumC4341e.m29970a(r0)
            com.facebook.react.uimanager.Spacing r3 = r4.mDefaultPadding
            float r3 = r3.getRaw(r0)
            r1.mo30011f0(r2, r3)
            goto Lb2
        L91:
            boolean[] r1 = r4.mPaddingIsPercent
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.e r2 = com.facebook.yoga.EnumC4341e.m29970a(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.mo30009g0(r2, r3)
            goto Lb2
        La5:
            com.facebook.yoga.YogaNode r1 = r4.mYogaNode
            com.facebook.yoga.e r2 = com.facebook.yoga.EnumC4341e.m29970a(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.mo30011f0(r2, r3)
        Lb2:
            int r0 = r0 + 1
            goto L1
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ReactShadowNodeImpl.updatePadding():void");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.mo30016d();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f3 = f + layoutX;
            int round = Math.round(f3);
            float f4 = f2 + layoutY;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + getLayoutWidth());
            int round4 = Math.round(f4 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i = round3 - round;
            int i2 = round4 - round2;
            z = (round5 == this.mScreenX && round6 == this.mScreenY && i == this.mScreenWidth && i2 == this.mScreenHeight) ? true : true;
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i;
            this.mScreenHeight = i2;
            if (z) {
                if (nativeViewHierarchyOptimizer != null) {
                    nativeViewHierarchyOptimizer.handleUpdateLayout(this);
                } else {
                    uIViewOperationQueue.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
                }
            }
        }
        return z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.mo29985w();
            YogaNodePool.get().release(this.mYogaNode);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public float getFlex() {
        return this.mYogaNode.mo30014e();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        getHierarchyInfoWithIndentation(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.mo30010g();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutHeight() {
        return this.mYogaNode.mo30006j();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutWidth() {
        return this.mYogaNode.mo30002l();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutX() {
        return this.mYogaNode.mo30000m();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutY() {
        return this.mYogaNode.mo29998n();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public NativeKind getNativeKind() {
        if (!isVirtual() && !isLayoutOnly()) {
            if (hoistNativeChildren()) {
                return NativeKind.LEAF;
            }
            return NativeKind.PARENT;
        }
        return NativeKind.NONE;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getPadding(int i) {
        return this.mYogaNode.mo30004k(EnumC4341e.m29970a(i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getRootTag() {
        boolean z;
        if (this.mRootTag != 0) {
            z = true;
        } else {
            z = false;
        }
        C5743a.m24585a(z);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.mo30012f();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStylePadding(int i) {
        return this.mYogaNode.mo29995p(EnumC4341e.m29970a(i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.mo29993q();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ThemedReactContext getThemedContext() {
        return (ThemedReactContext) C5743a.m24583c(this.mThemedContext);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final String getViewClass() {
        return (String) C5743a.m24583c(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasNewLayout() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.mo29991r();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isDirty() {
        YogaNode yogaNode = this.mYogaNode;
        return yogaNode != null && yogaNode.mo29989s();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isMeasureDefined() {
        return this.mYogaNode.mo29988t();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markLayoutSeen() {
        YogaNode yogaNode = this.mYogaNode;
        if (yogaNode != null) {
            yogaNode.mo29987u();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        ReactShadowNodeImpl parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void removeAllNativeChildren() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.mo29986v(childCount);
            }
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            childAt.mParent = null;
            i += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ((ArrayList) C5743a.m24583c(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= i;
        updateNativeChildrenCountInParent(-i);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.mo29984x(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.mo29983y(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.mo29982z(yogaAlign);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.mo30046B(yogaBaselineFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBorder(int i, float f) {
        this.mYogaNode.mo30045C(EnumC4341e.m29970a(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGap(float f) {
        this.mYogaNode.mo30034N(EnumC4342f.COLUMN, f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.set(i, f);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.mo30042F(yogaDisplay);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlex(float f) {
        this.mYogaNode.mo30041G(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasis(float f) {
        this.mYogaNode.mo30040H(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisAuto() {
        this.mYogaNode.mo30039I();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisPercent(float f) {
        this.mYogaNode.mo30038J(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.mo30037K(yogaFlexDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexGrow(float f) {
        this.mYogaNode.mo30036L(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexShrink(float f) {
        this.mYogaNode.mo30035M(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.mo29997n0(yogaWrap);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGap(float f) {
        this.mYogaNode.mo30034N(EnumC4342f.ALL, f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setIsLayoutOnly(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (getParent() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C5743a.m24584b(z2, "Must remove from no opt parent first");
        if (this.mNativeParent == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C5743a.m24584b(z3, "Must remove from native parent first");
        if (getNativeChildCount() != 0) {
            z4 = false;
        }
        C5743a.m24584b(z4, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.mo30030R(yogaJustify);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.mo30043E(yogaDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMargin(int i, float f) {
        this.mYogaNode.mo30029S(EnumC4341e.m29970a(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginAuto(int i) {
        this.mYogaNode.mo30028T(EnumC4341e.m29970a(i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginPercent(int i, float f) {
        this.mYogaNode.mo30027U(EnumC4341e.m29970a(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mYogaNode.mo30022Z(yogaMeasureFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureSpecs(int i, int i2) {
        this.mWidthMeasureSpec = Integer.valueOf(i);
        this.mHeightMeasureSpec = Integer.valueOf(i2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.mo30013e0(yogaOverflow);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !C4340d.m29971a(f);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPosition(int i, float f) {
        this.mYogaNode.mo30008h0(EnumC4341e.m29970a(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionPercent(int i, float f) {
        this.mYogaNode.mo30007i0(EnumC4341e.m29970a(i), f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.mo30005j0(yogaPositionType);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setRootTag(int i) {
        this.mRootTag = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGap(float f) {
        this.mYogaNode.mo30034N(EnumC4342f.ROW, f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleAspectRatio(float f) {
        this.mYogaNode.mo30047A(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeight(float f) {
        this.mYogaNode.mo30033O(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightAuto() {
        this.mYogaNode.mo30032P();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightPercent(float f) {
        this.mYogaNode.mo30031Q(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeight(float f) {
        this.mYogaNode.mo30026V(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.mo30025W(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidth(float f) {
        this.mYogaNode.mo30024X(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.mo30023Y(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeight(float f) {
        this.mYogaNode.mo30021a0(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.mo30019b0(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidth(float f) {
        this.mYogaNode.mo30017c0(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.mo30015d0(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidth(float f) {
        this.mYogaNode.mo30003k0(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthAuto() {
        this.mYogaNode.mo30001l0();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthPercent(float f) {
        this.mYogaNode.mo29999m0(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            YogaNode yogaNode = reactShadowNodeImpl.mYogaNode;
            if (yogaNode != null) {
                this.mYogaNode.mo30020b(yogaNode, i);
            } else {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImpl.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        C5743a.m24585a(getNativeKind() == NativeKind.PARENT);
        C5743a.m24585a(reactShadowNodeImpl.getNativeKind() != NativeKind.NONE);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout(float f, float f2) {
        this.mYogaNode.mo30018c(f, f2);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getChildAt(int i) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getLayoutParent() {
        ReactShadowNodeImpl reactShadowNodeImpl = this.mLayoutParent;
        return reactShadowNodeImpl != null ? reactShadowNodeImpl : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            ReactShadowNodeImpl childAt = getChildAt(i);
            if (reactShadowNodeImpl == childAt) {
                z = true;
                break;
            }
            i2 += childAt.getTotalNativeNodeContributionToParent();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        C5743a.m24583c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public ReactShadowNodeImpl removeChildAt(int i) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            ReactShadowNodeImpl remove = arrayList.remove(i);
            remove.mParent = null;
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.mo29986v(i);
            }
            markUpdated();
            int totalNativeNodeContributionToParent = remove.getTotalNativeNodeContributionToParent();
            this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
            updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl removeNativeChildAt(int i) {
        C5743a.m24583c(this.mNativeChildren);
        ReactShadowNodeImpl remove = this.mNativeChildren.remove(i);
        remove.mNativeParent = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setLayoutParent(ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mLayoutParent = reactShadowNodeImpl;
    }
}
