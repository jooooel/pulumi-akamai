// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationCompound {
    private @Nullable List<GetImagingPolicyImagePolicyTransformation> transformations;

    private GetImagingPolicyImagePolicyTransformationCompound() {}
    public List<GetImagingPolicyImagePolicyTransformation> transformations() {
        return this.transformations == null ? List.of() : this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationCompound defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetImagingPolicyImagePolicyTransformation> transformations;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationCompound defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        @CustomType.Setter
        public Builder transformations(@Nullable List<GetImagingPolicyImagePolicyTransformation> transformations) {
            this.transformations = transformations;
            return this;
        }
        public Builder transformations(GetImagingPolicyImagePolicyTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public GetImagingPolicyImagePolicyTransformationCompound build() {
            final var o = new GetImagingPolicyImagePolicyTransformationCompound();
            o.transformations = transformations;
            return o;
        }
    }
}