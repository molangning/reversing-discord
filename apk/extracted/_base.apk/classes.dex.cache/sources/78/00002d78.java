package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PointerEvents;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    /* renamed from: com.horcrux.svg.RenderableView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5167a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14532a;

        static {
            int[] iArr = new int[EnumC5254z.values().length];
            f14532a = iArr;
            try {
                iArr[EnumC5254z.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14532a[EnumC5254z.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14532a[EnumC5254z.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private static double saturate(double d) {
        double d2 = 0.0d;
        if (d > 0.0d) {
            d2 = 1.0d;
            if (d < 1.0d) {
                return d;
            }
        }
        return d2;
    }

    private void setupPaint(Paint paint, float f, ReadableArray readableArray) {
        double d;
        int i;
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i2 = readableArray.getInt(0);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 && (renderableView = contextElement) != null && (readableArray3 = renderableView.stroke) != null) {
                            setupPaint(paint, f, readableArray3);
                            return;
                        }
                        return;
                    }
                    RenderableView renderableView2 = contextElement;
                    if (renderableView2 != null && (readableArray2 = renderableView2.fill) != null) {
                        setupPaint(paint, f, readableArray2);
                        return;
                    }
                    return;
                }
                paint.setColor(getSvgView().mTintColor);
                return;
            }
            C5201a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
            if (definedBrush != null) {
                definedBrush.m25963i(paint, this.mBox, this.mScale, f);
            }
        } else if (readableArray.size() == 2) {
            if (readableArray.getType(1) == ReadableType.Map) {
                i = ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue();
            } else {
                i = readableArray.getInt(1);
            }
            paint.setColor((Math.round((i >>> 24) * f) << 24) | (i & 16777215));
        } else {
            if (readableArray.size() > 4) {
                d = readableArray.getDouble(4) * f * 255.0d;
            } else {
                d = f * 255.0f;
            }
            paint.setARGB((int) d, (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        boolean z;
        float f2 = f * this.mOpacity;
        boolean z2 = false;
        if (((VirtualView) this).mPath == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Path path = getPath(canvas, paint);
            ((VirtualView) this).mPath = path;
            path.setFillType(this.fillRule);
        }
        if (this.vectorEffect == 1) {
            z2 = true;
        }
        Path path2 = ((VirtualView) this).mPath;
        if (z2) {
            path2 = new Path();
            ((VirtualView) this).mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z || path2 != ((VirtualView) this).mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f2)) {
            if (z) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f2)) {
            if (z) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f2);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.touch.ReactHitSlopView
    public Rect getHitSlopRect() {
        if (((VirtualView) this).mPointerEvents == PointerEvents.BOX_NONE) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (((VirtualView) this).mPath == null || !this.mInvertible || !this.mTransformInvertible || ((VirtualView) this).mPointerEvents == PointerEvents.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(round, round2)) || ((region = this.mStrokeRegion) != null && (region.contains(round, round2) || ((region2 = this.mMarkerRegion) != null && region2.contains(round, round2))))) {
            if (getClipPath() != null && !this.mClipRegion.contains(round, round2)) {
                return -1;
            }
            return getId();
        }
        return -1;
    }

    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && ((VirtualView) this).mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            ((VirtualView) this).mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(((VirtualView) this).mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath != null && this.mClipRegionPath != clipPath) {
            this.mClipRegionPath = clipPath;
            RectF rectF5 = new RectF();
            this.mClipBounds = rectF5;
            clipPath.computeBounds(rectF5, true);
            this.mClipRegion = getRegion(clipPath, this.mClipBounds);
        }
    }

    public void mergeProperties(RenderableView renderableView) {
        ArrayList<String> arrayList;
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList != null && attributeList.size() != 0) {
            this.mOriginProperties = new ArrayList<>();
            if (this.mPropList == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(this.mPropList);
            }
            this.mAttributeList = arrayList;
            int size = attributeList.size();
            for (int i = 0; i < size; i++) {
                try {
                    String str = attributeList.get(i);
                    Field field = getClass().getField(str);
                    Object obj = field.get(renderableView);
                    this.mOriginProperties.add(field.get(this));
                    if (!hasOwnProperty(str)) {
                        this.mAttributeList.add(str);
                        field.set(this, obj);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            this.mLastMergedList = attributeList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void render(Canvas canvas, Paint paint, float f) {
        C5238q c5238q;
        if (this.mMask != null) {
            c5238q = (C5238q) getSvgView().getDefinedMask(this.mMask);
        } else {
            c5238q = null;
        }
        if (c5238q != null) {
            Rect clipBounds = canvas.getClipBounds();
            int height = clipBounds.height();
            int width = clipBounds.width();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Canvas canvas3 = new Canvas(createBitmap);
            Canvas canvas4 = new Canvas(createBitmap3);
            float relativeOnWidth = (float) relativeOnWidth(c5238q.f14814l);
            float relativeOnHeight = (float) relativeOnHeight(c5238q.f14815m);
            canvas3.clipRect(relativeOnWidth, relativeOnHeight, ((float) relativeOnWidth(c5238q.f14816n)) + relativeOnWidth, ((float) relativeOnHeight(c5238q.f14817o)) + relativeOnHeight);
            Paint paint2 = new Paint(1);
            c5238q.draw(canvas3, paint2, 1.0f);
            int i = width * height;
            int[] iArr = new int[i];
            createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i2 = 0;
            while (i2 < i) {
                int i3 = iArr[i2];
                int i4 = i3 & 255;
                iArr[i2] = ((int) ((i3 >>> 24) * saturate((((((i3 >> 16) & 255) * 0.299d) + (((i3 >> 8) & 255) * 0.587d)) + (i4 * 0.144d)) / 255.0d))) << 24;
                i2++;
                i = i;
                paint2 = paint2;
            }
            Paint paint3 = paint2;
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            draw(canvas2, paint, f);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas4.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            canvas4.drawBitmap(createBitmap, 0.0f, 0.0f, paint3);
            canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, paint);
            return;
        }
        draw(canvas, paint, f);
    }

    public void renderMarkers(Canvas canvas, Paint paint, float f) {
        double d;
        C5236p c5236p;
        C5236p c5236p2 = (C5236p) getSvgView().getDefinedMarker(this.mMarkerStart);
        C5236p c5236p3 = (C5236p) getSvgView().getDefinedMarker(this.mMarkerMid);
        C5236p c5236p4 = (C5236p) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<C5241s> arrayList = this.elements;
        if (arrayList != null) {
            if (c5236p2 != null || c5236p3 != null || c5236p4 != null) {
                contextElement = this;
                ArrayList<C5252y> m25653h = C5252y.m25653h(arrayList);
                SVGLength sVGLength = this.strokeWidth;
                if (sVGLength != null) {
                    d = relativeOnOther(sVGLength);
                } else {
                    d = 1.0d;
                }
                float f2 = (float) d;
                this.mMarkerPath = new Path();
                Iterator<C5252y> it = m25653h.iterator();
                while (it.hasNext()) {
                    C5252y next = it.next();
                    int i = C5167a.f14532a[next.f14885a.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                c5236p = null;
                            } else {
                                c5236p = c5236p4;
                            }
                        } else {
                            c5236p = c5236p3;
                        }
                    } else {
                        c5236p = c5236p2;
                    }
                    if (c5236p != null) {
                        c5236p.m25781l(canvas, paint, f, next, f2);
                        this.mMarkerPath.addPath(c5236p.getPath(canvas, paint), c5236p.f14810x);
                    }
                }
                contextElement = null;
            }
        }
    }

    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList != null && this.mOriginProperties != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
                }
                this.mLastMergedList = null;
                this.mOriginProperties = null;
                this.mAttributeList = this.mPropList;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void setFill(Dynamic dynamic) {
        if (dynamic != null && !dynamic.isNull()) {
            ReadableType type = dynamic.getType();
            if (type.equals(ReadableType.Map)) {
                setFill(dynamic.asMap());
                return;
            }
            int i = 0;
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.m30478of(0, Integer.valueOf(dynamic.asInt()));
            } else if (type.equals(ReadableType.Array)) {
                this.fill = dynamic.asArray();
            } else {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = regex.matcher(dynamic.asString());
                while (matcher.find()) {
                    double parseDouble = Double.parseDouble(matcher.group());
                    int i2 = i + 1;
                    if (i < 3) {
                        parseDouble /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(parseDouble);
                    i = i2;
                }
                this.fill = javaOnlyArray;
            }
            invalidate();
            return;
        }
        this.fill = null;
        invalidate();
    }

    public void setFillOpacity(float f) {
        this.fillOpacity = f;
        invalidate();
    }

    public void setFillRule(int i) {
        if (i != 0) {
            if (i != 1) {
                throw new JSApplicationIllegalArgumentException("fillRule " + i + " unrecognized");
            }
        } else {
            this.fillRule = Path.FillType.EVEN_ODD;
        }
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        VirtualViewManager.setRenderableView(i, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) {
        if (dynamic != null && !dynamic.isNull()) {
            if (dynamic.getType().equals(ReadableType.Map)) {
                setStroke(dynamic.asMap());
                return;
            }
            ReadableType type = dynamic.getType();
            int i = 0;
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.m30478of(0, Integer.valueOf(dynamic.asInt()));
            } else if (type.equals(ReadableType.Array)) {
                this.stroke = dynamic.asArray();
            } else {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = regex.matcher(dynamic.asString());
                while (matcher.find()) {
                    double parseDouble = Double.parseDouble(matcher.group());
                    int i2 = i + 1;
                    if (i < 3) {
                        parseDouble /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(parseDouble);
                    i = i2;
                }
                this.stroke = javaOnlyArray;
            }
            invalidate();
            return;
        }
        this.stroke = null;
        invalidate();
    }

    public void setStrokeDasharray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.strokeDasharray = new SVGLength[size];
            for (int i = 0; i < size; i++) {
                this.strokeDasharray[i] = SVGLength.m25998c(readableArray.getDynamic(i));
            }
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f) {
        this.strokeDashoffset = f * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.strokeLinecap = Paint.Cap.SQUARE;
                } else {
                    throw new JSApplicationIllegalArgumentException("strokeLinecap " + i + " unrecognized");
                }
            } else {
                this.strokeLinecap = Paint.Cap.ROUND;
            }
        } else {
            this.strokeLinecap = Paint.Cap.BUTT;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.strokeLinejoin = Paint.Join.BEVEL;
                } else {
                    throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i + " unrecognized");
                }
            } else {
                this.strokeLinejoin = Paint.Join.ROUND;
            }
        } else {
            this.strokeLinejoin = Paint.Join.MITER;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f) {
        this.strokeMiterlimit = f;
        invalidate();
    }

    public void setStrokeOpacity(float f) {
        this.strokeOpacity = f;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = SVGLength.m25998c(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i) {
        this.vectorEffect = i;
        invalidate();
    }

    public boolean setupFillPaint(Paint paint, float f) {
        ReadableArray readableArray = this.fill;
        if (readableArray != null && readableArray.size() > 0) {
            paint.reset();
            paint.setFlags(385);
            paint.setStyle(Paint.Style.FILL);
            setupPaint(paint, f, this.fill);
            return true;
        }
        return false;
    }

    public boolean setupStrokePaint(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double relativeOnOther = relativeOnOther(this.strokeWidth);
        if (relativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr != null) {
            int length = sVGLengthArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) relativeOnOther(this.strokeDasharray[i]);
            }
            paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
            return true;
        }
        return true;
    }

    public void setStrokeWidth(String str) {
        this.strokeWidth = SVGLength.m25996e(str);
        invalidate();
    }

    public void setStrokeWidth(Double d) {
        this.strokeWidth = SVGLength.m25997d(d);
        invalidate();
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.m30478of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.m30478of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.fill = JavaOnlyArray.m30478of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.m30478of(Integer.valueOf(i));
        }
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.m30478of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.m30478of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.stroke = JavaOnlyArray.m30478of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.m30478of(Integer.valueOf(i));
        }
        invalidate();
    }
}