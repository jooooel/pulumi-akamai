// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs();

    @Import(name="boxImages")
    private @Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>> boxImages;

    public Optional<Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>>> boxImages() {
        return Optional.ofNullable(this.boxImages);
    }

    @Import(name="circleImages")
    private @Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>> circleImages;

    public Optional<Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>>> circleImages() {
        return Optional.ofNullable(this.circleImages);
    }

    @Import(name="textImages")
    private @Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>> textImages;

    public Optional<Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>>> textImages() {
        return Optional.ofNullable(this.textImages);
    }

    @Import(name="urlImages")
    private @Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>> urlImages;

    public Optional<Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>>> urlImages() {
        return Optional.ofNullable(this.urlImages);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs $) {
        this.boxImages = $.boxImages;
        this.circleImages = $.circleImages;
        this.textImages = $.textImages;
        this.urlImages = $.urlImages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder boxImages(@Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>> boxImages) {
            $.boxImages = boxImages;
            return this;
        }

        public Builder boxImages(List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs> boxImages) {
            return boxImages(Output.of(boxImages));
        }

        public Builder boxImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs... boxImages) {
            return boxImages(List.of(boxImages));
        }

        public Builder circleImages(@Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>> circleImages) {
            $.circleImages = circleImages;
            return this;
        }

        public Builder circleImages(List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs> circleImages) {
            return circleImages(Output.of(circleImages));
        }

        public Builder circleImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs... circleImages) {
            return circleImages(List.of(circleImages));
        }

        public Builder textImages(@Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>> textImages) {
            $.textImages = textImages;
            return this;
        }

        public Builder textImages(List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs> textImages) {
            return textImages(Output.of(textImages));
        }

        public Builder textImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs... textImages) {
            return textImages(List.of(textImages));
        }

        public Builder urlImages(@Nullable Output<List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>> urlImages) {
            $.urlImages = urlImages;
            return this;
        }

        public Builder urlImages(List<GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs> urlImages) {
            return urlImages(Output.of(urlImages));
        }

        public Builder urlImages(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs... urlImages) {
            return urlImages(List.of(urlImages));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs build() {
            return $;
        }
    }

}
