package com.facebook.react.animated;

import androidx.core.graphics.C0995a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class InterpolationAnimatedNode extends ValueAnimatedNode {
    private static final String COLOR_OUTPUT_TYPE = "color";
    public static final String EXTRAPOLATE_TYPE_CLAMP = "clamp";
    public static final String EXTRAPOLATE_TYPE_EXTEND = "extend";
    public static final String EXTRAPOLATE_TYPE_IDENTITY = "identity";
    private static final Pattern sNumericPattern = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
    private final String mExtrapolateLeft;
    private final String mExtrapolateRight;
    private final double[] mInputRange;
    private Object mObjectValue;
    private final Object mOutputRange;
    private final OutputType mOutputType;
    private ValueAnimatedNode mParent;
    private final String mPattern;

    /* renamed from: com.facebook.react.animated.InterpolationAnimatedNode$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C39201 {

        /* renamed from: $SwitchMap$com$facebook$react$animated$InterpolationAnimatedNode$OutputType */
        static final /* synthetic */ int[] f10904x942ea9d7;

        static {
            int[] iArr = new int[OutputType.values().length];
            f10904x942ea9d7 = iArr;
            try {
                iArr[OutputType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10904x942ea9d7[OutputType.Color.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10904x942ea9d7[OutputType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private enum OutputType {
        Number,
        Color,
        String
    }

    public InterpolationAnimatedNode(ReadableMap readableMap) {
        this.mInputRange = fromDoubleArray(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        if ("color".equals(readableMap.getString("outputType"))) {
            this.mOutputType = OutputType.Color;
            this.mOutputRange = fromIntArray(array);
            this.mPattern = null;
        } else if (array.getType(0) == ReadableType.String) {
            this.mOutputType = OutputType.String;
            this.mOutputRange = fromStringPattern(array);
            this.mPattern = array.getString(0);
        } else {
            this.mOutputType = OutputType.Number;
            this.mOutputRange = fromDoubleArray(array);
            this.mPattern = null;
        }
        this.mExtrapolateLeft = readableMap.getString("extrapolateLeft");
        this.mExtrapolateRight = readableMap.getString("extrapolateRight");
    }

    private static int findRangeIndex(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    private static double[] fromDoubleArray(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    private static int[] fromIntArray(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        return iArr;
    }

    private static double[][] fromStringPattern(ReadableArray readableArray) {
        int size = readableArray.size();
        double[][] dArr = new double[size];
        Matcher matcher = sNumericPattern.matcher(readableArray.getString(0));
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(Double.valueOf(Double.parseDouble(matcher.group())));
        }
        int size2 = arrayList.size();
        double[] dArr2 = new double[size2];
        for (int i = 0; i < arrayList.size(); i++) {
            dArr2[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        dArr[0] = dArr2;
        for (int i2 = 1; i2 < size; i2++) {
            double[] dArr3 = new double[size2];
            Matcher matcher2 = sNumericPattern.matcher(readableArray.getString(i2));
            for (int i3 = 0; matcher2.find() && i3 < size2; i3++) {
                dArr3[i3] = Double.parseDouble(matcher2.group());
            }
            dArr[i2] = dArr3;
        }
        return dArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r24.equals(com.facebook.react.animated.InterpolationAnimatedNode.EXTRAPOLATE_TYPE_CLAMP) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double interpolate(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
        /*
            r0 = r23
            r1 = r24
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            java.lang.String r3 = "Invalid extrapolation type "
            r4 = 2
            java.lang.String r5 = "clamp"
            r6 = 1
            java.lang.String r7 = "identity"
            r8 = 0
            java.lang.String r9 = "extend"
            r10 = -1
            if (r2 >= 0) goto L5a
            r23.hashCode()
            int r11 = r23.hashCode()
            switch(r11) {
                case -1289044198: goto L32;
                case -135761730: goto L29;
                case 94742715: goto L20;
                default: goto L1e;
            }
        L1e:
            r11 = r10
            goto L3a
        L20:
            boolean r11 = r0.equals(r5)
            if (r11 != 0) goto L27
            goto L1e
        L27:
            r11 = r4
            goto L3a
        L29:
            boolean r11 = r0.equals(r7)
            if (r11 != 0) goto L30
            goto L1e
        L30:
            r11 = r6
            goto L3a
        L32:
            boolean r11 = r0.equals(r9)
            if (r11 != 0) goto L39
            goto L1e
        L39:
            r11 = r8
        L3a:
            switch(r11) {
                case 0: goto L5a;
                case 1: goto L59;
                case 2: goto L57;
                default: goto L3d;
            }
        L3d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "for left extrapolation"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L57:
            r11 = r15
            goto L5b
        L59:
            return r13
        L5a:
            r11 = r13
        L5b:
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 <= 0) goto La4
            r24.hashCode()
            int r0 = r24.hashCode()
            switch(r0) {
                case -1289044198: goto L7b;
                case -135761730: goto L72;
                case 94742715: goto L6b;
                default: goto L69;
            }
        L69:
            r4 = r10
            goto L83
        L6b:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L83
            goto L69
        L72:
            boolean r0 = r1.equals(r7)
            if (r0 != 0) goto L79
            goto L69
        L79:
            r4 = r6
            goto L83
        L7b:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L82
            goto L69
        L82:
            r4 = r8
        L83:
            switch(r4) {
                case 0: goto La4;
                case 1: goto La3;
                case 2: goto La0;
                default: goto L86;
            }
        L86:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "for right extrapolation"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        La0:
            r11 = r17
            goto La4
        La3:
            return r11
        La4:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 != 0) goto La9
            return r19
        La9:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto Lb1
            if (r2 > 0) goto Lb0
            return r19
        Lb0:
            return r21
        Lb1:
            double r0 = r21 - r19
            double r11 = r11 - r15
            double r0 = r0 * r11
            double r2 = r17 - r15
            double r0 = r0 / r2
            double r0 = r19 + r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.InterpolationAnimatedNode.interpolate(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    static int interpolateColor(double d, double[] dArr, int[] iArr) {
        int findRangeIndex = findRangeIndex(d, dArr);
        int i = iArr[findRangeIndex];
        int i2 = findRangeIndex + 1;
        int i3 = iArr[i2];
        if (i == i3) {
            return i;
        }
        double d2 = dArr[findRangeIndex];
        double d3 = dArr[i2];
        if (d2 == d3) {
            if (d <= d2) {
                return i;
            }
            return i3;
        }
        return C0995a.m38185c(i, i3, (float) ((d - d2) / (d3 - d2)));
    }

    static String interpolateString(String str, double d, double[] dArr, double[][] dArr2, String str2, String str3) {
        String num;
        int findRangeIndex = findRangeIndex(d, dArr);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        Matcher matcher = sNumericPattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            double[] dArr3 = dArr2[findRangeIndex];
            if (i >= dArr3.length) {
                break;
            }
            int i2 = findRangeIndex + 1;
            double interpolate = interpolate(d, dArr[findRangeIndex], dArr[i2], dArr3[i], dArr2[i2][i], str2, str3);
            int i3 = (int) interpolate;
            if (i3 != interpolate) {
                num = Double.toString(interpolate);
            } else {
                num = Integer.toString(i3);
            }
            matcher.appendReplacement(stringBuffer, num);
            i++;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode
    public Object getAnimatedObject() {
        return this.mObjectValue;
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void onAttachedToNode(AnimatedNode animatedNode) {
        if (this.mParent == null) {
            if (animatedNode instanceof ValueAnimatedNode) {
                this.mParent = (ValueAnimatedNode) animatedNode;
                return;
            }
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        throw new IllegalStateException("Parent already attached");
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void onDetachedFromNode(AnimatedNode animatedNode) {
        if (animatedNode == this.mParent) {
            this.mParent = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "InterpolationAnimatedNode[" + this.mTag + "] super: " + super.prettyPrint();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        ValueAnimatedNode valueAnimatedNode = this.mParent;
        if (valueAnimatedNode == null) {
            return;
        }
        double value = valueAnimatedNode.getValue();
        int i = C39201.f10904x942ea9d7[this.mOutputType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.mObjectValue = interpolateString(this.mPattern, value, this.mInputRange, (double[][]) this.mOutputRange, this.mExtrapolateLeft, this.mExtrapolateRight);
                    return;
                }
                return;
            }
            this.mObjectValue = Integer.valueOf(interpolateColor(value, this.mInputRange, (int[]) this.mOutputRange));
            return;
        }
        this.mValue = interpolate(value, this.mInputRange, (double[]) this.mOutputRange, this.mExtrapolateLeft, this.mExtrapolateRight);
    }

    static double interpolate(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int findRangeIndex = findRangeIndex(d, dArr);
        int i = findRangeIndex + 1;
        return interpolate(d, dArr[findRangeIndex], dArr[i], dArr2[findRangeIndex], dArr2[i], str, str2);
    }
}
