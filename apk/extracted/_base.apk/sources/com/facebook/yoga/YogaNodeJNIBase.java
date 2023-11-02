package com.facebook.yoga;

import com.facebook.yoga.YogaNode;
import java.util.ArrayList;
import java.util.List;
import p192k5.InterfaceC9061a;

@InterfaceC9061a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class YogaNodeJNIBase extends YogaNode implements Cloneable {
    @InterfaceC9061a
    private float[] arr;

    /* renamed from: j */
    private YogaNodeJNIBase f11066j;

    /* renamed from: k */
    private List<YogaNodeJNIBase> f11067k;

    /* renamed from: l */
    private YogaMeasureFunction f11068l;

    /* renamed from: m */
    private YogaBaselineFunction f11069m;
    @InterfaceC9061a
    private int mLayoutDirection;

    /* renamed from: n */
    protected long f11070n;

    /* renamed from: o */
    private Object f11071o;

    /* renamed from: p */
    private boolean f11072p;

    /* renamed from: com.facebook.yoga.YogaNodeJNIBase$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C4335a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11073a;

        static {
            int[] iArr = new int[EnumC4341e.values().length];
            f11073a = iArr;
            try {
                iArr[EnumC4341e.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11073a[EnumC4341e.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11073a[EnumC4341e.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11073a[EnumC4341e.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11073a[EnumC4341e.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11073a[EnumC4341e.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f11072p = true;
        if (j != 0) {
            this.f11070n = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    /* renamed from: o0 */
    private void m29996o0(YogaNode yogaNode) {
        Object m29994p0 = m29994p0();
        if (m29994p0 instanceof YogaNode.InterfaceC4334a) {
            ((YogaNode.InterfaceC4334a) m29994p0).m30048a(this, yogaNode);
        }
    }

    /* renamed from: r0 */
    private static YogaValue m29990r0(long j) {
        return new YogaValue(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @InterfaceC9061a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f11067k;
        if (list != null) {
            list.remove(i);
            this.f11067k.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f11066j = this;
            return yogaNodeJNIBase.f11070n;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: A */
    public void mo30047A(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: B */
    public void mo30046B(YogaBaselineFunction yogaBaselineFunction) {
        boolean z;
        this.f11069m = yogaBaselineFunction;
        long j = this.f11070n;
        if (yogaBaselineFunction != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(j, z);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: C */
    public void mo30045C(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: D */
    public void mo30044D(Object obj) {
        this.f11071o = obj;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: E */
    public void mo30043E(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f11070n, yogaDirection.m30053b());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: F */
    public void mo30042F(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f11070n, yogaDisplay.m30052a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: G */
    public void mo30041G(float f) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: H */
    public void mo30040H(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: I */
    public void mo30039I() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: J */
    public void mo30038J(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: K */
    public void mo30037K(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f11070n, yogaFlexDirection.m30051a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: L */
    public void mo30036L(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: M */
    public void mo30035M(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: N */
    public void mo30034N(EnumC4342f enumC4342f, float f) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f11070n, enumC4342f.m29968a(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: O */
    public void mo30033O(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: P */
    public void mo30032P() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: Q */
    public void mo30031Q(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: R */
    public void mo30030R(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f11070n, yogaJustify.m30050a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: S */
    public void mo30029S(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: T */
    public void mo30028T(EnumC4341e enumC4341e) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f11070n, enumC4341e.m29969b());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: U */
    public void mo30027U(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: V */
    public void mo30026V(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: W */
    public void mo30025W(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: X */
    public void mo30024X(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: Y */
    public void mo30023Y(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: Z */
    public void mo30022Z(YogaMeasureFunction yogaMeasureFunction) {
        boolean z;
        this.f11068l = yogaMeasureFunction;
        long j = this.f11070n;
        if (yogaMeasureFunction != null) {
            z = true;
        } else {
            z = false;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j, z);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: a0 */
    public void mo30021a0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: b */
    public void mo30020b(YogaNode yogaNode, int i) {
        if (!(yogaNode instanceof YogaNodeJNIBase)) {
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) yogaNode;
        if (yogaNodeJNIBase.f11066j == null) {
            if (this.f11067k == null) {
                this.f11067k = new ArrayList(4);
            }
            this.f11067k.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f11066j = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f11070n, yogaNodeJNIBase.f11070n, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: b0 */
    public void mo30019b0(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f11070n, f);
    }

    @InterfaceC9061a
    public final float baseline(float f, float f2) {
        return this.f11069m.baseline(this, f, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: c */
    public void mo30018c(float f, float f2) {
        m29996o0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f11067k;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m29996o0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f11070n;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f11070n, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: c0 */
    public void mo30017c0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: d */
    public void mo30016d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: d0 */
    public void mo30015d0(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: e */
    public float mo30014e() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: e0 */
    public void mo30013e0(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f11070n, yogaOverflow.m29981a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: f */
    public YogaValue mo30012f() {
        return m29990r0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f11070n));
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: f0 */
    public void mo30011f0(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: g */
    public YogaDirection mo30010g() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        return YogaDirection.m30054a(i);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: g0 */
    public void mo30009g0(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: h0 */
    public void mo30008h0(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: i0 */
    public void mo30007i0(EnumC4341e enumC4341e, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f11070n, enumC4341e.m29969b(), f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: j */
    public float mo30006j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: j0 */
    public void mo30005j0(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f11070n, yogaPositionType.m29980a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: k */
    public float mo30004k(EnumC4341e enumC4341e) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            float f = fArr[0];
            if ((((int) f) & 2) == 2) {
                if ((((int) f) & 1) != 1) {
                    i = 4;
                }
                int i2 = 10 - i;
                switch (C4335a.f11073a[enumC4341e.ordinal()]) {
                    case 1:
                        return this.arr[i2];
                    case 2:
                        return this.arr[i2 + 1];
                    case 3:
                        return this.arr[i2 + 2];
                    case 4:
                        return this.arr[i2 + 3];
                    case 5:
                        if (mo30010g() == YogaDirection.RTL) {
                            return this.arr[i2 + 2];
                        }
                        return this.arr[i2];
                    case 6:
                        if (mo30010g() == YogaDirection.RTL) {
                            return this.arr[i2];
                        }
                        return this.arr[i2 + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
                }
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: k0 */
    public void mo30003k0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f11070n, f);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: l */
    public float mo30002l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: l0 */
    public void mo30001l0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: m */
    public float mo30000m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: m0 */
    public void mo29999m0(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f11070n, f);
    }

    @InterfaceC9061a
    public final long measure(float f, int i, float f2, int i2) {
        if (mo29988t()) {
            return this.f11068l.measure(this, f, YogaMeasureMode.m30049a(i), f2, YogaMeasureMode.m30049a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: n */
    public float mo29998n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: n0 */
    public void mo29997n0(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f11070n, yogaWrap.m29976a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: p */
    public YogaValue mo29995p(EnumC4341e enumC4341e) {
        return m29990r0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f11070n, enumC4341e.m29969b()));
    }

    /* renamed from: p0 */
    public Object m29994p0() {
        return this.f11071o;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: q */
    public YogaValue mo29993q() {
        return m29990r0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f11070n));
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: q0 */
    public YogaNodeJNIBase mo29986v(int i) {
        List<YogaNodeJNIBase> list = this.f11067k;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.f11066j = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f11070n, remove.f11070n);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: r */
    public boolean mo29991r() {
        float[] fArr = this.arr;
        if (fArr != null) {
            if ((((int) fArr[0]) & 16) != 16) {
                return false;
            }
            return true;
        }
        return this.f11072p;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: s */
    public boolean mo29989s() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: t */
    public boolean mo29988t() {
        return this.f11068l != null;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: u */
    public void mo29987u() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f11072p = false;
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: w */
    public void mo29985w() {
        this.f11068l = null;
        this.f11069m = null;
        this.f11071o = null;
        this.arr = null;
        this.f11072p = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f11070n);
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: x */
    public void mo29984x(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f11070n, yogaAlign.m30055a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: y */
    public void mo29983y(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f11070n, yogaAlign.m30055a());
    }

    @Override // com.facebook.yoga.YogaNode
    /* renamed from: z */
    public void mo29982z(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f11070n, yogaAlign.m30055a());
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase(YogaConfig yogaConfig) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((AbstractC4338b) yogaConfig).f11101a));
    }
}
