// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationBackgroundColor {
    private @Nullable String color;
    private @Nullable String colorVar;

    private GetImagingPolicyImagePolicyTransformationBackgroundColor() {}
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    public Optional<String> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationBackgroundColor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String colorVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationBackgroundColor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.colorVar = defaults.colorVar;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {
            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder colorVar(@Nullable String colorVar) {
            this.colorVar = colorVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationBackgroundColor build() {
            final var o = new GetImagingPolicyImagePolicyTransformationBackgroundColor();
            o.color = color;
            o.colorVar = colorVar;
            return o;
        }
    }
}