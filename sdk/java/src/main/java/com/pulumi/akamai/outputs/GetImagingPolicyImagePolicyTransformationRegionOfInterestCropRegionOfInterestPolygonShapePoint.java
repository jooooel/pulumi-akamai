// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePoint {
    private @Nullable String x;
    private @Nullable String xVar;
    private @Nullable String y;
    private @Nullable String yVar;

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePoint() {}
    public Optional<String> x() {
        return Optional.ofNullable(this.x);
    }
    public Optional<String> xVar() {
        return Optional.ofNullable(this.xVar);
    }
    public Optional<String> y() {
        return Optional.ofNullable(this.y);
    }
    public Optional<String> yVar() {
        return Optional.ofNullable(this.yVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String x;
        private @Nullable String xVar;
        private @Nullable String y;
        private @Nullable String yVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.xVar = defaults.xVar;
    	      this.y = defaults.y;
    	      this.yVar = defaults.yVar;
        }

        @CustomType.Setter
        public Builder x(@Nullable String x) {
            this.x = x;
            return this;
        }
        @CustomType.Setter
        public Builder xVar(@Nullable String xVar) {
            this.xVar = xVar;
            return this;
        }
        @CustomType.Setter
        public Builder y(@Nullable String y) {
            this.y = y;
            return this;
        }
        @CustomType.Setter
        public Builder yVar(@Nullable String yVar) {
            this.yVar = yVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePoint build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePoint();
            _resultValue.x = x;
            _resultValue.xVar = xVar;
            _resultValue.y = y;
            _resultValue.yVar = yVar;
            return _resultValue;
        }
    }
}
