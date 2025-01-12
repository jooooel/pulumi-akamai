// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationHsv extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationHsv Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsv();

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

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="valueVar")
    private @Nullable String valueVar;

    public Optional<String> valueVar() {
        return Optional.ofNullable(this.valueVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationHsv() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationHsv(GetImagingPolicyImagePolicyPostBreakpointTransformationHsv $) {
        this.hue = $.hue;
        this.hueVar = $.hueVar;
        this.saturation = $.saturation;
        this.saturationVar = $.saturationVar;
        this.value = $.value;
        this.valueVar = $.valueVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationHsv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationHsv $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsv();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationHsv defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationHsv(Objects.requireNonNull(defaults));
        }

        public Builder hue(@Nullable String hue) {
            $.hue = hue;
            return this;
        }

        public Builder hueVar(@Nullable String hueVar) {
            $.hueVar = hueVar;
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

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public Builder valueVar(@Nullable String valueVar) {
            $.valueVar = valueVar;
            return this;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationHsv build() {
            return $;
        }
    }

}
