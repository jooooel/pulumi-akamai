// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape();

    @Import(name="center", required=true)
    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center;

    public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center() {
        return this.center;
    }

    @Import(name="radius")
    private @Nullable String radius;

    public Optional<String> radius() {
        return Optional.ofNullable(this.radius);
    }

    @Import(name="radiusVar")
    private @Nullable String radiusVar;

    public Optional<String> radiusVar() {
        return Optional.ofNullable(this.radiusVar);
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape $) {
        this.center = $.center;
        this.radius = $.radius;
        this.radiusVar = $.radiusVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape(Objects.requireNonNull(defaults));
        }

        public Builder center(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center) {
            $.center = center;
            return this;
        }

        public Builder radius(@Nullable String radius) {
            $.radius = radius;
            return this;
        }

        public Builder radiusVar(@Nullable String radiusVar) {
            $.radiusVar = radiusVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape build() {
            $.center = Objects.requireNonNull($.center, "expected parameter 'center' to be non-null");
            return $;
        }
    }

}