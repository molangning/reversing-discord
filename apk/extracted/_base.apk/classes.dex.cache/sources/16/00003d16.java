package p176ja;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: ja.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8883f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f23269a;

    public C8883f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f23269a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f23269a.set(imageView.getImageMatrix());
        return this.f23269a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}