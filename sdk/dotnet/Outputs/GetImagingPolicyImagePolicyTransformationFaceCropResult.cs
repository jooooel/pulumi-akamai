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
    public sealed class GetImagingPolicyImagePolicyTransformationFaceCropResult
    {
        public readonly string? Algorithm;
        public readonly string? AlgorithmVar;
        public readonly string? Confidence;
        public readonly string? ConfidenceVar;
        public readonly string? FailGravity;
        public readonly string? FailGravityVar;
        public readonly string? Focus;
        public readonly string? FocusVar;
        public readonly string? Gravity;
        public readonly string? GravityVar;
        public readonly string? Height;
        public readonly string? HeightVar;
        public readonly string? Padding;
        public readonly string? PaddingVar;
        public readonly string? Style;
        public readonly string? StyleVar;
        public readonly string? Width;
        public readonly string? WidthVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyTransformationFaceCropResult(
            string? algorithm,

            string? algorithmVar,

            string? confidence,

            string? confidenceVar,

            string? failGravity,

            string? failGravityVar,

            string? focus,

            string? focusVar,

            string? gravity,

            string? gravityVar,

            string? height,

            string? heightVar,

            string? padding,

            string? paddingVar,

            string? style,

            string? styleVar,

            string? width,

            string? widthVar)
        {
            Algorithm = algorithm;
            AlgorithmVar = algorithmVar;
            Confidence = confidence;
            ConfidenceVar = confidenceVar;
            FailGravity = failGravity;
            FailGravityVar = failGravityVar;
            Focus = focus;
            FocusVar = focusVar;
            Gravity = gravity;
            GravityVar = gravityVar;
            Height = height;
            HeightVar = heightVar;
            Padding = padding;
            PaddingVar = paddingVar;
            Style = style;
            StyleVar = styleVar;
            Width = width;
            WidthVar = widthVar;
        }
    }
}