// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationMonoHue extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationMonoHue Empty = new GetImagingPolicyImagePolicyTransformationMonoHue();

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

    private GetImagingPolicyImagePolicyTransformationMonoHue() {}

    private GetImagingPolicyImagePolicyTransformationMonoHue(GetImagingPolicyImagePolicyTransformationMonoHue $) {
        this.hue = $.hue;
        this.hueVar = $.hueVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationMonoHue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationMonoHue $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationMonoHue();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationMonoHue defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationMonoHue(Objects.requireNonNull(defaults));
        }

        public Builder hue(@Nullable String hue) {
            $.hue = hue;
            return this;
        }

        public Builder hueVar(@Nullable String hueVar) {
            $.hueVar = hueVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationMonoHue build() {
            return $;
        }
    }

}