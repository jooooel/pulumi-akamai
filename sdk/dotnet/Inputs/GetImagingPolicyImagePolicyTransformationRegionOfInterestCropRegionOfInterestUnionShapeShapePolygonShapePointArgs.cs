// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("x")]
        public Input<string>? X { get; set; }

        [Input("xVar")]
        public Input<string>? XVar { get; set; }

        [Input("y")]
        public Input<string>? Y { get; set; }

        [Input("yVar")]
        public Input<string>? YVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs();
    }
}