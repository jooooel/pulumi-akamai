// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAppendImageBoxImage;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAppendImageCircleImage;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAppendImageTextImage;
import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAppendImageUrlImage;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationAppendImage {
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage> boxImages;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage> circleImages;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage> textImages;
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage> urlImages;

    private GetImagingPolicyImagePolicyTransformationAppendImage() {}
    public List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage> boxImages() {
        return this.boxImages == null ? List.of() : this.boxImages;
    }
    public List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage> circleImages() {
        return this.circleImages == null ? List.of() : this.circleImages;
    }
    public List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage> textImages() {
        return this.textImages == null ? List.of() : this.textImages;
    }
    public List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage> urlImages() {
        return this.urlImages == null ? List.of() : this.urlImages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationAppendImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage> boxImages;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage> circleImages;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage> textImages;
        private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage> urlImages;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationAppendImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boxImages = defaults.boxImages;
    	      this.circleImages = defaults.circleImages;
    	      this.textImages = defaults.textImages;
    	      this.urlImages = defaults.urlImages;
        }

        @CustomType.Setter
        public Builder boxImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage> boxImages) {
            this.boxImages = boxImages;
            return this;
        }
        public Builder boxImages(GetImagingPolicyImagePolicyTransformationAppendImageBoxImage... boxImages) {
            return boxImages(List.of(boxImages));
        }
        @CustomType.Setter
        public Builder circleImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage> circleImages) {
            this.circleImages = circleImages;
            return this;
        }
        public Builder circleImages(GetImagingPolicyImagePolicyTransformationAppendImageCircleImage... circleImages) {
            return circleImages(List.of(circleImages));
        }
        @CustomType.Setter
        public Builder textImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage> textImages) {
            this.textImages = textImages;
            return this;
        }
        public Builder textImages(GetImagingPolicyImagePolicyTransformationAppendImageTextImage... textImages) {
            return textImages(List.of(textImages));
        }
        @CustomType.Setter
        public Builder urlImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage> urlImages) {
            this.urlImages = urlImages;
            return this;
        }
        public Builder urlImages(GetImagingPolicyImagePolicyTransformationAppendImageUrlImage... urlImages) {
            return urlImages(List.of(urlImages));
        }
        public GetImagingPolicyImagePolicyTransformationAppendImage build() {
            final var o = new GetImagingPolicyImagePolicyTransformationAppendImage();
            o.boxImages = boxImages;
            o.circleImages = circleImages;
            o.textImages = textImages;
            o.urlImages = urlImages;
            return o;
        }
    }
}