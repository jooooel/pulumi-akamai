// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePointResult
    {
        public readonly string? X;
        public readonly string? XVar;
        public readonly string? Y;
        public readonly string? YVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestPolygonShapePointResult(
            string? x,

            string? xVar,

            string? y,

            string? yVar)
        {
            X = x;
            XVar = xVar;
            Y = y;
            YVar = yVar;
        }
    }
}
