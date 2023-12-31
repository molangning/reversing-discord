package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m14357d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "gradient", "Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;", "(Lcom/discord/image/fresco/postprocessors/PostProcessor$Gradient;)V", "process", "", "bitmap", "Landroid/graphics/Bitmap;", "Companion", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class GradientPostprocessor extends BasePostprocessor {
    public static final Companion Companion = new Companion(null);
    private final PostProcessor.Gradient gradient;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m14357d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor$Companion;", "", "()V", "Point", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {

        @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GradientPostprocessor$Companion$Point;", "", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        private static final class Point {

            /* renamed from: x */
            private final float f8830x;

            /* renamed from: y */
            private final float f8831y;

            public Point(float f, float f2) {
                this.f8830x = f;
                this.f8831y = f2;
            }

            public static /* synthetic */ Point copy$default(Point point, float f, float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = point.f8830x;
                }
                if ((i & 2) != 0) {
                    f2 = point.f8831y;
                }
                return point.copy(f, f2);
            }

            public final float component1() {
                return this.f8830x;
            }

            public final float component2() {
                return this.f8831y;
            }

            public final Point copy(float f, float f2) {
                return new Point(f, f2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Point) {
                    Point point = (Point) obj;
                    return Float.compare(this.f8830x, point.f8830x) == 0 && Float.compare(this.f8831y, point.f8831y) == 0;
                }
                return false;
            }

            public final float getX() {
                return this.f8830x;
            }

            public final float getY() {
                return this.f8831y;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.f8830x) * 31) + Float.floatToIntBits(this.f8831y);
            }

            public String toString() {
                float f = this.f8830x;
                float f2 = this.f8831y;
                return "Point(x=" + f + ", y=" + f2 + ")";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostProcessor.Gradient.Direction.values().length];
            try {
                iArr[PostProcessor.Gradient.Direction.LeftToRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostProcessor.Gradient.Direction.RightToLeft.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostProcessor.Gradient.Direction.TopToBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostProcessor.Gradient.Direction.BottomToTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GradientPostprocessor(PostProcessor.Gradient gradient) {
        C9612q.m13917h(gradient, "gradient");
        this.gradient = gradient;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        Pair m7577a;
        C9612q.m13917h(bitmap, "bitmap");
        int i = WhenMappings.$EnumSwitchMapping$0[this.gradient.getDirection().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m7577a = C11591x.m7577a(new Companion.Point(bitmap.getWidth() / 2.0f, bitmap.getHeight()), new Companion.Point(bitmap.getWidth() / 2.0f, 0.0f));
                    } else {
                        throw new C11581q();
                    }
                } else {
                    m7577a = C11591x.m7577a(new Companion.Point(bitmap.getWidth() / 2.0f, 0.0f), new Companion.Point(bitmap.getWidth() / 2.0f, bitmap.getHeight()));
                }
            } else {
                m7577a = C11591x.m7577a(new Companion.Point(bitmap.getWidth(), bitmap.getHeight() / 2.0f), new Companion.Point(0.0f, bitmap.getHeight() / 2.0f));
            }
        } else {
            m7577a = C11591x.m7577a(new Companion.Point(0.0f, bitmap.getHeight() / 2.0f), new Companion.Point(bitmap.getWidth(), bitmap.getHeight() / 2.0f));
        }
        Companion.Point point = (Companion.Point) m7577a.m14351a();
        Companion.Point point2 = (Companion.Point) m7577a.m14350b();
        float height = bitmap.getHeight();
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(point.getX(), point.getY(), point2.getX(), point2.getY(), new int[]{this.gradient.getStartColor(), this.gradient.getEndColor()}, new float[]{this.gradient.getStartPosition(), this.gradient.getEndPosition()}, Shader.TileMode.CLAMP));
        Unit unit = Unit.f25302a;
        new Canvas(bitmap).drawRect(0.0f, 0.0f, bitmap.getWidth(), height, paint);
    }
}