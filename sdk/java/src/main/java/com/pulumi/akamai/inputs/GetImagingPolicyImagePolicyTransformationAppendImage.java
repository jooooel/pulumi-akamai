// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationAppendImageBoxImage;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationAppendImageCircleImage;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationAppendImageTextImage;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationAppendImageUrlImage;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationAppendImage extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationAppendImage Empty = new GetImagingPolicyImagePolicyTransformationAppendImage();

    @Import(name="boxImages")
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage> boxImages;

    public Optional<List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage>> boxImages() {
        return Optional.ofNullable(this.boxImages);
    }

    @Import(name="circleImages")
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage> circleImages;

    public Optional<List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage>> circleImages() {
        return Optional.ofNullable(this.circleImages);
    }

    @Import(name="textImages")
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage> textImages;

    public Optional<List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage>> textImages() {
        return Optional.ofNullable(this.textImages);
    }

    @Import(name="urlImages")
    private @Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage> urlImages;

    public Optional<List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage>> urlImages() {
        return Optional.ofNullable(this.urlImages);
    }

    private GetImagingPolicyImagePolicyTransformationAppendImage() {}

    private GetImagingPolicyImagePolicyTransformationAppendImage(GetImagingPolicyImagePolicyTransformationAppendImage $) {
        this.boxImages = $.boxImages;
        this.circleImages = $.circleImages;
        this.textImages = $.textImages;
        this.urlImages = $.urlImages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationAppendImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationAppendImage $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationAppendImage();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationAppendImage defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationAppendImage(Objects.requireNonNull(defaults));
        }

        public Builder boxImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageBoxImage> boxImages) {
            $.boxImages = boxImages;
            return this;
        }

        public Builder boxImages(GetImagingPolicyImagePolicyTransformationAppendImageBoxImage... boxImages) {
            return boxImages(List.of(boxImages));
        }

        public Builder circleImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageCircleImage> circleImages) {
            $.circleImages = circleImages;
            return this;
        }

        public Builder circleImages(GetImagingPolicyImagePolicyTransformationAppendImageCircleImage... circleImages) {
            return circleImages(List.of(circleImages));
        }

        public Builder textImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageTextImage> textImages) {
            $.textImages = textImages;
            return this;
        }

        public Builder textImages(GetImagingPolicyImagePolicyTransformationAppendImageTextImage... textImages) {
            return textImages(List.of(textImages));
        }

        public Builder urlImages(@Nullable List<GetImagingPolicyImagePolicyTransformationAppendImageUrlImage> urlImages) {
            $.urlImages = urlImages;
            return this;
        }

        public Builder urlImages(GetImagingPolicyImagePolicyTransformationAppendImageUrlImage... urlImages) {
            return urlImages(List.of(urlImages));
        }

        public GetImagingPolicyImagePolicyTransformationAppendImage build() {
            return $;
        }
    }

}
