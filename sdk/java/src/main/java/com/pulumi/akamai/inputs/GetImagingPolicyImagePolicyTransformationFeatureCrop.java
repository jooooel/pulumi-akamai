// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationFeatureCrop extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationFeatureCrop Empty = new GetImagingPolicyImagePolicyTransformationFeatureCrop();

    @Import(name="failGravity")
    private @Nullable String failGravity;

    public Optional<String> failGravity() {
        return Optional.ofNullable(this.failGravity);
    }

    @Import(name="failGravityVar")
    private @Nullable String failGravityVar;

    public Optional<String> failGravityVar() {
        return Optional.ofNullable(this.failGravityVar);
    }

    @Import(name="featureRadius")
    private @Nullable String featureRadius;

    public Optional<String> featureRadius() {
        return Optional.ofNullable(this.featureRadius);
    }

    @Import(name="featureRadiusVar")
    private @Nullable String featureRadiusVar;

    public Optional<String> featureRadiusVar() {
        return Optional.ofNullable(this.featureRadiusVar);
    }

    @Import(name="gravity")
    private @Nullable String gravity;

    public Optional<String> gravity() {
        return Optional.ofNullable(this.gravity);
    }

    @Import(name="gravityVar")
    private @Nullable String gravityVar;

    public Optional<String> gravityVar() {
        return Optional.ofNullable(this.gravityVar);
    }

    @Import(name="height")
    private @Nullable String height;

    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }

    @Import(name="heightVar")
    private @Nullable String heightVar;

    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }

    @Import(name="maxFeatures")
    private @Nullable String maxFeatures;

    public Optional<String> maxFeatures() {
        return Optional.ofNullable(this.maxFeatures);
    }

    @Import(name="maxFeaturesVar")
    private @Nullable String maxFeaturesVar;

    public Optional<String> maxFeaturesVar() {
        return Optional.ofNullable(this.maxFeaturesVar);
    }

    @Import(name="minFeatureQuality")
    private @Nullable String minFeatureQuality;

    public Optional<String> minFeatureQuality() {
        return Optional.ofNullable(this.minFeatureQuality);
    }

    @Import(name="minFeatureQualityVar")
    private @Nullable String minFeatureQualityVar;

    public Optional<String> minFeatureQualityVar() {
        return Optional.ofNullable(this.minFeatureQualityVar);
    }

    @Import(name="padding")
    private @Nullable String padding;

    public Optional<String> padding() {
        return Optional.ofNullable(this.padding);
    }

    @Import(name="paddingVar")
    private @Nullable String paddingVar;

    public Optional<String> paddingVar() {
        return Optional.ofNullable(this.paddingVar);
    }

    @Import(name="style")
    private @Nullable String style;

    public Optional<String> style() {
        return Optional.ofNullable(this.style);
    }

    @Import(name="styleVar")
    private @Nullable String styleVar;

    public Optional<String> styleVar() {
        return Optional.ofNullable(this.styleVar);
    }

    @Import(name="width")
    private @Nullable String width;

    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="widthVar")
    private @Nullable String widthVar;

    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    private GetImagingPolicyImagePolicyTransformationFeatureCrop() {}

    private GetImagingPolicyImagePolicyTransformationFeatureCrop(GetImagingPolicyImagePolicyTransformationFeatureCrop $) {
        this.failGravity = $.failGravity;
        this.failGravityVar = $.failGravityVar;
        this.featureRadius = $.featureRadius;
        this.featureRadiusVar = $.featureRadiusVar;
        this.gravity = $.gravity;
        this.gravityVar = $.gravityVar;
        this.height = $.height;
        this.heightVar = $.heightVar;
        this.maxFeatures = $.maxFeatures;
        this.maxFeaturesVar = $.maxFeaturesVar;
        this.minFeatureQuality = $.minFeatureQuality;
        this.minFeatureQualityVar = $.minFeatureQualityVar;
        this.padding = $.padding;
        this.paddingVar = $.paddingVar;
        this.style = $.style;
        this.styleVar = $.styleVar;
        this.width = $.width;
        this.widthVar = $.widthVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationFeatureCrop defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationFeatureCrop $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationFeatureCrop();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationFeatureCrop defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationFeatureCrop(Objects.requireNonNull(defaults));
        }

        public Builder failGravity(@Nullable String failGravity) {
            $.failGravity = failGravity;
            return this;
        }

        public Builder failGravityVar(@Nullable String failGravityVar) {
            $.failGravityVar = failGravityVar;
            return this;
        }

        public Builder featureRadius(@Nullable String featureRadius) {
            $.featureRadius = featureRadius;
            return this;
        }

        public Builder featureRadiusVar(@Nullable String featureRadiusVar) {
            $.featureRadiusVar = featureRadiusVar;
            return this;
        }

        public Builder gravity(@Nullable String gravity) {
            $.gravity = gravity;
            return this;
        }

        public Builder gravityVar(@Nullable String gravityVar) {
            $.gravityVar = gravityVar;
            return this;
        }

        public Builder height(@Nullable String height) {
            $.height = height;
            return this;
        }

        public Builder heightVar(@Nullable String heightVar) {
            $.heightVar = heightVar;
            return this;
        }

        public Builder maxFeatures(@Nullable String maxFeatures) {
            $.maxFeatures = maxFeatures;
            return this;
        }

        public Builder maxFeaturesVar(@Nullable String maxFeaturesVar) {
            $.maxFeaturesVar = maxFeaturesVar;
            return this;
        }

        public Builder minFeatureQuality(@Nullable String minFeatureQuality) {
            $.minFeatureQuality = minFeatureQuality;
            return this;
        }

        public Builder minFeatureQualityVar(@Nullable String minFeatureQualityVar) {
            $.minFeatureQualityVar = minFeatureQualityVar;
            return this;
        }

        public Builder padding(@Nullable String padding) {
            $.padding = padding;
            return this;
        }

        public Builder paddingVar(@Nullable String paddingVar) {
            $.paddingVar = paddingVar;
            return this;
        }

        public Builder style(@Nullable String style) {
            $.style = style;
            return this;
        }

        public Builder styleVar(@Nullable String styleVar) {
            $.styleVar = styleVar;
            return this;
        }

        public Builder width(@Nullable String width) {
            $.width = width;
            return this;
        }

        public Builder widthVar(@Nullable String widthVar) {
            $.widthVar = widthVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationFeatureCrop build() {
            return $;
        }
    }

}