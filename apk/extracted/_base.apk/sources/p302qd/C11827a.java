package p302qd;

import p266od.C11084d;

/* renamed from: qd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11827a extends C11828b {
    public C11827a() {
        this(null);
    }

    public C11827a(C11084d c11084d) {
        super("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main()\n{\ngl_Position = uMVPMatrix * aPosition;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}", null, c11084d);
    }
}
