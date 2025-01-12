// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformation;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage();

    @Import(name="color")
    private @Nullable String color;

    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }

    @Import(name="colorVar")
    private @Nullable String colorVar;

    public Optional<String> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }

    @Import(name="height")
    private @Nullable String height;

    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }

    @Import(name="heightVar")
    private @Nullable String heightVar;

    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }

    @Import(name="transformation")
    private @Nullable GetImagingPolicyImagePolicyPostBreakpointTransformation transformation;

    public Optional<GetImagingPolicyImagePolicyPostBreakpointTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    @Import(name="width")
    private @Nullable String width;

    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="widthVar")
    private @Nullable String widthVar;

    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage $) {
        this.color = $.color;
        this.colorVar = $.colorVar;
        this.height = $.height;
        this.heightVar = $.heightVar;
        this.transformation = $.transformation;
        this.width = $.width;
        this.widthVar = $.widthVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage(Objects.requireNonNull(defaults));
        }

        public Builder color(@Nullable String color) {
            $.color = color;
            return this;
        }

        public Builder colorVar(@Nullable String colorVar) {
            $.colorVar = colorVar;
            return this;
        }

        public Builder height(@Nullable String height) {
            $.height = height;
            return this;
        }

        public Builder heightVar(@Nullable String heightVar) {
            $.heightVar = heightVar;
            return this;
        }

        public Builder transformation(@Nullable GetImagingPolicyImagePolicyPostBreakpointTransformation transformation) {
            $.transformation = transformation;
            return this;
        }

        public Builder width(@Nullable String width) {
            $.width = width;
            return this;
        }

        public Builder widthVar(@Nullable String widthVar) {
            $.widthVar = widthVar;
            return this;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImage build() {
            return $;
        }
    }

}
