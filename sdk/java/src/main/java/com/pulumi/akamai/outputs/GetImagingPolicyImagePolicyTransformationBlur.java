// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationBlur {
    private @Nullable String sigma;
    private @Nullable String sigmaVar;

    private GetImagingPolicyImagePolicyTransformationBlur() {}
    public Optional<String> sigma() {
        return Optional.ofNullable(this.sigma);
    }
    public Optional<String> sigmaVar() {
        return Optional.ofNullable(this.sigmaVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationBlur defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String sigma;
        private @Nullable String sigmaVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationBlur defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sigma = defaults.sigma;
    	      this.sigmaVar = defaults.sigmaVar;
        }

        @CustomType.Setter
        public Builder sigma(@Nullable String sigma) {
            this.sigma = sigma;
            return this;
        }
        @CustomType.Setter
        public Builder sigmaVar(@Nullable String sigmaVar) {
            this.sigmaVar = sigmaVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationBlur build() {
            final var o = new GetImagingPolicyImagePolicyTransformationBlur();
            o.sigma = sigma;
            o.sigmaVar = sigmaVar;
            return o;
        }
    }
}