// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationHsl extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationHsl Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsl();

    @Import(name="hue")
    private @Nullable String hue;

    public Optional<String> hue() {
        return Optional.ofNullable(this.hue);
    }

    @Import(name="hueVar")
    private @Nullable String hueVar;

    public Optional<String> hueVar() {
        return Optional.ofNullable(this.hueVar);
    }

    @Import(name="lightness")
    private @Nullable String lightness;

    public Optional<String> lightness() {
        return Optional.ofNullable(this.lightness);
    }

    @Import(name="lightnessVar")
    private @Nullable String lightnessVar;

    public Optional<String> lightnessVar() {
        return Optional.ofNullable(this.lightnessVar);
    }

    @Import(name="saturation")
    private @Nullable String saturation;

    public Optional<String> saturation() {
        return Optional.ofNullable(this.saturation);
    }

    @Import(name="saturationVar")
    private @Nullable String saturationVar;

    public Optional<String> saturationVar() {
        return Optional.ofNullable(this.saturationVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationHsl() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationHsl(GetImagingPolicyImagePolicyPostBreakpointTransformationHsl $) {
        this.hue = $.hue;
        this.hueVar = $.hueVar;
        this.lightness = $.lightness;
        this.lightnessVar = $.lightnessVar;
        this.saturation = $.saturation;
        this.saturationVar = $.saturationVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationHsl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationHsl $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsl();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationHsl defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsl(Objects.requireNonNull(defaults));
        }

        public Builder hue(@Nullable String hue) {
            $.hue = hue;
            return this;
        }

        public Builder hueVar(@Nullable String hueVar) {
            $.hueVar = hueVar;
            return this;
        }

        public Builder lightness(@Nullable String lightness) {
            $.lightness = lightness;
            return this;
        }

        public Builder lightnessVar(@Nullable String lightnessVar) {
            $.lightnessVar = lightnessVar;
            return this;
        }

        public Builder saturation(@Nullable String saturation) {
            $.saturation = saturation;
            return this;
        }

        public Builder saturationVar(@Nullable String saturationVar) {
            $.saturationVar = saturationVar;
            return this;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationHsl build() {
            return $;
        }
    }

}