package com.facebook.react.shell;

import com.facebook.imagepipeline.core.ImagePipelineConfig;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MainPackageConfig {
    private ImagePipelineConfig mFrescoConfig;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Builder {
        private ImagePipelineConfig mFrescoConfig;

        public MainPackageConfig build() {
            return new MainPackageConfig(this);
        }

        public Builder setFrescoConfig(ImagePipelineConfig imagePipelineConfig) {
            this.mFrescoConfig = imagePipelineConfig;
            return this;
        }
    }

    private MainPackageConfig(Builder builder) {
        this.mFrescoConfig = builder.mFrescoConfig;
    }

    public ImagePipelineConfig getFrescoConfig() {
        return this.mFrescoConfig;
    }
}
