// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor();

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

    @Import(name="feather")
    private @Nullable String feather;

    public Optional<String> feather() {
        return Optional.ofNullable(this.feather);
    }

    @Import(name="featherVar")
    private @Nullable String featherVar;

    public Optional<String> featherVar() {
        return Optional.ofNullable(this.featherVar);
    }

    @Import(name="tolerance")
    private @Nullable String tolerance;

    public Optional<String> tolerance() {
        return Optional.ofNullable(this.tolerance);
    }

    @Import(name="toleranceVar")
    private @Nullable String toleranceVar;

    public Optional<String> toleranceVar() {
        return Optional.ofNullable(this.toleranceVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor(GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor $) {
        this.color = $.color;
        this.colorVar = $.colorVar;
        this.feather = $.feather;
        this.featherVar = $.featherVar;
        this.tolerance = $.tolerance;
        this.toleranceVar = $.toleranceVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor(Objects.requireNonNull(defaults));
        }

        public Builder color(@Nullable String color) {
            $.color = color;
            return this;
        }

        public Builder colorVar(@Nullable String colorVar) {
            $.colorVar = colorVar;
            return this;
        }

        public Builder feather(@Nullable String feather) {
            $.feather = feather;
            return this;
        }

        public Builder featherVar(@Nullable String featherVar) {
            $.featherVar = featherVar;
            return this;
        }

        public Builder tolerance(@Nullable String tolerance) {
            $.tolerance = tolerance;
            return this;
        }

        public Builder toleranceVar(@Nullable String toleranceVar) {
            $.toleranceVar = toleranceVar;
            return this;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColor build() {
            return $;
        }
    }

}