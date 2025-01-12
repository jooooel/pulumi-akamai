// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeArgs;
import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs();

    @Import(name="circleShapes")
    private @Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeArgs>> circleShapes;

    public Optional<Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeArgs>>> circleShapes() {
        return Optional.ofNullable(this.circleShapes);
    }

    @Import(name="pointShapes")
    private @Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs>> pointShapes;

    public Optional<Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs>>> pointShapes() {
        return Optional.ofNullable(this.pointShapes);
    }

    @Import(name="polygonShapes")
    private @Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs>> polygonShapes;

    public Optional<Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs>>> polygonShapes() {
        return Optional.ofNullable(this.polygonShapes);
    }

    @Import(name="rectangleShapes")
    private @Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeArgs>> rectangleShapes;

    public Optional<Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeArgs>>> rectangleShapes() {
        return Optional.ofNullable(this.rectangleShapes);
    }

    @Import(name="unionShapes")
    private @Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeArgs>> unionShapes;

    public Optional<Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeArgs>>> unionShapes() {
        return Optional.ofNullable(this.unionShapes);
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs $) {
        this.circleShapes = $.circleShapes;
        this.pointShapes = $.pointShapes;
        this.polygonShapes = $.polygonShapes;
        this.rectangleShapes = $.rectangleShapes;
        this.unionShapes = $.unionShapes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs(Objects.requireNonNull(defaults));
        }

        public Builder circleShapes(@Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeArgs>> circleShapes) {
            $.circleShapes = circleShapes;
            return this;
        }

        public Builder circleShapes(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeArgs> circleShapes) {
            return circleShapes(Output.of(circleShapes));
        }

        public Builder circleShapes(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeArgs... circleShapes) {
            return circleShapes(List.of(circleShapes));
        }

        public Builder pointShapes(@Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs>> pointShapes) {
            $.pointShapes = pointShapes;
            return this;
        }

        public Builder pointShapes(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs> pointShapes) {
            return pointShapes(Output.of(pointShapes));
        }

        public Builder pointShapes(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs... pointShapes) {
            return pointShapes(List.of(pointShapes));
        }

        public Builder polygonShapes(@Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs>> polygonShapes) {
            $.polygonShapes = polygonShapes;
            return this;
        }

        public Builder polygonShapes(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs> polygonShapes) {
            return polygonShapes(Output.of(polygonShapes));
        }

        public Builder polygonShapes(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs... polygonShapes) {
            return polygonShapes(List.of(polygonShapes));
        }

        public Builder rectangleShapes(@Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeArgs>> rectangleShapes) {
            $.rectangleShapes = rectangleShapes;
            return this;
        }

        public Builder rectangleShapes(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeArgs> rectangleShapes) {
            return rectangleShapes(Output.of(rectangleShapes));
        }

        public Builder rectangleShapes(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeArgs... rectangleShapes) {
            return rectangleShapes(List.of(rectangleShapes));
        }

        public Builder unionShapes(@Nullable Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeArgs>> unionShapes) {
            $.unionShapes = unionShapes;
            return this;
        }

        public Builder unionShapes(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeArgs> unionShapes) {
            return unionShapes(Output.of(unionShapes));
        }

        public Builder unionShapes(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeUnionShapeArgs... unionShapes) {
            return unionShapes(List.of(unionShapes));
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeArgs build() {
            return $;
        }
    }

}
