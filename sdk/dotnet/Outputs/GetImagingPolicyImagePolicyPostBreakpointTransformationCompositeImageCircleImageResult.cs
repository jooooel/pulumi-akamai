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
    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageResult
    {
        public readonly string? Color;
        public readonly string? ColorVar;
        public readonly string? Diameter;
        public readonly string? DiameterVar;
        public readonly Outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationResult? Transformation;
        public readonly string? Width;
        public readonly string? WidthVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageResult(
            string? color,

            string? colorVar,

            string? diameter,

            string? diameterVar,

            Outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationResult? transformation,

            string? width,

            string? widthVar)
        {
            Color = color;
            ColorVar = colorVar;
            Diameter = diameter;
            DiameterVar = diameterVar;
            Transformation = transformation;
            Width = width;
            WidthVar = widthVar;
        }
    }
}
