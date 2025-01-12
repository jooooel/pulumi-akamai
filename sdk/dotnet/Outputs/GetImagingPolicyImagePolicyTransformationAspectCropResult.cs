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
    public sealed class GetImagingPolicyImagePolicyTransformationAspectCropResult
    {
        public readonly string? AllowExpansion;
        public readonly string? AllowExpansionVar;
        public readonly string? Height;
        public readonly string? HeightVar;
        public readonly string? Width;
        public readonly string? WidthVar;
        public readonly string? XPosition;
        public readonly string? XPositionVar;
        public readonly string? YPosition;
        public readonly string? YPositionVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyTransformationAspectCropResult(
            string? allowExpansion,

            string? allowExpansionVar,

            string? height,

            string? heightVar,

            string? width,

            string? widthVar,

            string? xPosition,

            string? xPositionVar,

            string? yPosition,

            string? yPositionVar)
        {
            AllowExpansion = allowExpansion;
            AllowExpansionVar = allowExpansionVar;
            Height = height;
            HeightVar = heightVar;
            Width = width;
            WidthVar = widthVar;
            XPosition = xPosition;
            XPositionVar = xPositionVar;
            YPosition = yPosition;
            YPositionVar = yPositionVar;
        }
    }
}
