package com.facebook.react.views.imagehelper;

import com.facebook.imagepipeline.core.C3712b;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MultiSourceHelper {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class MultiSourceResult {
        private final ImageSource bestResult;
        private final ImageSource bestResultInCache;

        private MultiSourceResult(ImageSource imageSource, ImageSource imageSource2) {
            this.bestResult = imageSource;
            this.bestResultInCache = imageSource2;
        }

        public ImageSource getBestResult() {
            return this.bestResult;
        }

        public ImageSource getBestResultInCache() {
            return this.bestResultInCache;
        }
    }

    public static MultiSourceResult getBestSourceForSize(int i, int i2, List<ImageSource> list) {
        return getBestSourceForSize(i, i2, list, 1.0d);
    }

    public static MultiSourceResult getBestSourceForSize(int i, int i2, List<ImageSource> list, double d) {
        if (list.isEmpty()) {
            return new MultiSourceResult(null, null);
        }
        if (list.size() == 1) {
            return new MultiSourceResult(list.get(0), null);
        }
        if (i > 0 && i2 > 0) {
            ImagePipeline m31045j = C3712b.m31043l().m31045j();
            double d2 = i * i2 * d;
            double d3 = Double.MAX_VALUE;
            double d4 = Double.MAX_VALUE;
            ImageSource imageSource = null;
            ImageSource imageSource2 = null;
            for (ImageSource imageSource3 : list) {
                double abs = Math.abs(1.0d - (imageSource3.getSize() / d2));
                if (abs < d3 && !imageSource3.isForceCached()) {
                    imageSource2 = imageSource3;
                    d3 = abs;
                }
                if (abs < d4 && (m31045j.m31170m(imageSource3.getUri()) || m31045j.m31168o(imageSource3.getUri()))) {
                    imageSource = imageSource3;
                    d4 = abs;
                }
                if (imageSource3.isForceCached()) {
                    d4 = 0.0d;
                    imageSource = imageSource3;
                }
            }
            if (imageSource != null && imageSource2 != null && imageSource.getSource().equals(imageSource2.getSource())) {
                imageSource = null;
            }
            return new MultiSourceResult(imageSource2, imageSource);
        }
        return new MultiSourceResult(null, null);
    }
}