// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationShears {
    private @Nullable String xShear;
    private @Nullable String xShearVar;
    private @Nullable String yShear;
    private @Nullable String yShearVar;

    private GetImagingPolicyImagePolicyTransformationShears() {}
    public Optional<String> xShear() {
        return Optional.ofNullable(this.xShear);
    }
    public Optional<String> xShearVar() {
        return Optional.ofNullable(this.xShearVar);
    }
    public Optional<String> yShear() {
        return Optional.ofNullable(this.yShear);
    }
    public Optional<String> yShearVar() {
        return Optional.ofNullable(this.yShearVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationShears defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String xShear;
        private @Nullable String xShearVar;
        private @Nullable String yShear;
        private @Nullable String yShearVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationShears defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xShear = defaults.xShear;
    	      this.xShearVar = defaults.xShearVar;
    	      this.yShear = defaults.yShear;
    	      this.yShearVar = defaults.yShearVar;
        }

        @CustomType.Setter
        public Builder xShear(@Nullable String xShear) {
            this.xShear = xShear;
            return this;
        }
        @CustomType.Setter
        public Builder xShearVar(@Nullable String xShearVar) {
            this.xShearVar = xShearVar;
            return this;
        }
        @CustomType.Setter
        public Builder yShear(@Nullable String yShear) {
            this.yShear = yShear;
            return this;
        }
        @CustomType.Setter
        public Builder yShearVar(@Nullable String yShearVar) {
            this.yShearVar = yShearVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationShears build() {
            final var o = new GetImagingPolicyImagePolicyTransformationShears();
            o.xShear = xShear;
            o.xShearVar = xShearVar;
            o.yShear = yShear;
            o.yShearVar = yShearVar;
            return o;
        }
    }
}