// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationFeatureCrop {
    private @Nullable String failGravity;
    private @Nullable String failGravityVar;
    private @Nullable String featureRadius;
    private @Nullable String featureRadiusVar;
    private @Nullable String gravity;
    private @Nullable String gravityVar;
    private @Nullable String height;
    private @Nullable String heightVar;
    private @Nullable String maxFeatures;
    private @Nullable String maxFeaturesVar;
    private @Nullable String minFeatureQuality;
    private @Nullable String minFeatureQualityVar;
    private @Nullable String padding;
    private @Nullable String paddingVar;
    private @Nullable String style;
    private @Nullable String styleVar;
    private @Nullable String width;
    private @Nullable String widthVar;

    private GetImagingPolicyImagePolicyTransformationFeatureCrop() {}
    public Optional<String> failGravity() {
        return Optional.ofNullable(this.failGravity);
    }
    public Optional<String> failGravityVar() {
        return Optional.ofNullable(this.failGravityVar);
    }
    public Optional<String> featureRadius() {
        return Optional.ofNullable(this.featureRadius);
    }
    public Optional<String> featureRadiusVar() {
        return Optional.ofNullable(this.featureRadiusVar);
    }
    public Optional<String> gravity() {
        return Optional.ofNullable(this.gravity);
    }
    public Optional<String> gravityVar() {
        return Optional.ofNullable(this.gravityVar);
    }
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }
    public Optional<String> maxFeatures() {
        return Optional.ofNullable(this.maxFeatures);
    }
    public Optional<String> maxFeaturesVar() {
        return Optional.ofNullable(this.maxFeaturesVar);
    }
    public Optional<String> minFeatureQuality() {
        return Optional.ofNullable(this.minFeatureQuality);
    }
    public Optional<String> minFeatureQualityVar() {
        return Optional.ofNullable(this.minFeatureQualityVar);
    }
    public Optional<String> padding() {
        return Optional.ofNullable(this.padding);
    }
    public Optional<String> paddingVar() {
        return Optional.ofNullable(this.paddingVar);
    }
    public Optional<String> style() {
        return Optional.ofNullable(this.style);
    }
    public Optional<String> styleVar() {
        return Optional.ofNullable(this.styleVar);
    }
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }
    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationFeatureCrop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String failGravity;
        private @Nullable String failGravityVar;
        private @Nullable String featureRadius;
        private @Nullable String featureRadiusVar;
        private @Nullable String gravity;
        private @Nullable String gravityVar;
        private @Nullable String height;
        private @Nullable String heightVar;
        private @Nullable String maxFeatures;
        private @Nullable String maxFeaturesVar;
        private @Nullable String minFeatureQuality;
        private @Nullable String minFeatureQualityVar;
        private @Nullable String padding;
        private @Nullable String paddingVar;
        private @Nullable String style;
        private @Nullable String styleVar;
        private @Nullable String width;
        private @Nullable String widthVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationFeatureCrop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failGravity = defaults.failGravity;
    	      this.failGravityVar = defaults.failGravityVar;
    	      this.featureRadius = defaults.featureRadius;
    	      this.featureRadiusVar = defaults.featureRadiusVar;
    	      this.gravity = defaults.gravity;
    	      this.gravityVar = defaults.gravityVar;
    	      this.height = defaults.height;
    	      this.heightVar = defaults.heightVar;
    	      this.maxFeatures = defaults.maxFeatures;
    	      this.maxFeaturesVar = defaults.maxFeaturesVar;
    	      this.minFeatureQuality = defaults.minFeatureQuality;
    	      this.minFeatureQualityVar = defaults.minFeatureQualityVar;
    	      this.padding = defaults.padding;
    	      this.paddingVar = defaults.paddingVar;
    	      this.style = defaults.style;
    	      this.styleVar = defaults.styleVar;
    	      this.width = defaults.width;
    	      this.widthVar = defaults.widthVar;
        }

        @CustomType.Setter
        public Builder failGravity(@Nullable String failGravity) {
            this.failGravity = failGravity;
            return this;
        }
        @CustomType.Setter
        public Builder failGravityVar(@Nullable String failGravityVar) {
            this.failGravityVar = failGravityVar;
            return this;
        }
        @CustomType.Setter
        public Builder featureRadius(@Nullable String featureRadius) {
            this.featureRadius = featureRadius;
            return this;
        }
        @CustomType.Setter
        public Builder featureRadiusVar(@Nullable String featureRadiusVar) {
            this.featureRadiusVar = featureRadiusVar;
            return this;
        }
        @CustomType.Setter
        public Builder gravity(@Nullable String gravity) {
            this.gravity = gravity;
            return this;
        }
        @CustomType.Setter
        public Builder gravityVar(@Nullable String gravityVar) {
            this.gravityVar = gravityVar;
            return this;
        }
        @CustomType.Setter
        public Builder height(@Nullable String height) {
            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder heightVar(@Nullable String heightVar) {
            this.heightVar = heightVar;
            return this;
        }
        @CustomType.Setter
        public Builder maxFeatures(@Nullable String maxFeatures) {
            this.maxFeatures = maxFeatures;
            return this;
        }
        @CustomType.Setter
        public Builder maxFeaturesVar(@Nullable String maxFeaturesVar) {
            this.maxFeaturesVar = maxFeaturesVar;
            return this;
        }
        @CustomType.Setter
        public Builder minFeatureQuality(@Nullable String minFeatureQuality) {
            this.minFeatureQuality = minFeatureQuality;
            return this;
        }
        @CustomType.Setter
        public Builder minFeatureQualityVar(@Nullable String minFeatureQualityVar) {
            this.minFeatureQualityVar = minFeatureQualityVar;
            return this;
        }
        @CustomType.Setter
        public Builder padding(@Nullable String padding) {
            this.padding = padding;
            return this;
        }
        @CustomType.Setter
        public Builder paddingVar(@Nullable String paddingVar) {
            this.paddingVar = paddingVar;
            return this;
        }
        @CustomType.Setter
        public Builder style(@Nullable String style) {
            this.style = style;
            return this;
        }
        @CustomType.Setter
        public Builder styleVar(@Nullable String styleVar) {
            this.styleVar = styleVar;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }
        @CustomType.Setter
        public Builder widthVar(@Nullable String widthVar) {
            this.widthVar = widthVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationFeatureCrop build() {
            final var o = new GetImagingPolicyImagePolicyTransformationFeatureCrop();
            o.failGravity = failGravity;
            o.failGravityVar = failGravityVar;
            o.featureRadius = featureRadius;
            o.featureRadiusVar = featureRadiusVar;
            o.gravity = gravity;
            o.gravityVar = gravityVar;
            o.height = height;
            o.heightVar = heightVar;
            o.maxFeatures = maxFeatures;
            o.maxFeaturesVar = maxFeaturesVar;
            o.minFeatureQuality = minFeatureQuality;
            o.minFeatureQualityVar = minFeatureQualityVar;
            o.padding = padding;
            o.paddingVar = paddingVar;
            o.style = style;
            o.styleVar = styleVar;
            o.width = width;
            o.widthVar = widthVar;
            return o;
        }
    }
}