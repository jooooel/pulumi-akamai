// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs : global::Pulumi.InvokeArgs
    {
        [Input("center", required: true)]
        public Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs Center { get; set; } = null!;

        [Input("radius")]
        public string? Radius { get; set; }

        [Input("radiusVar")]
        public string? RadiusVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs();
    }
}
