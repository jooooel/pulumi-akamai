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
    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationMirrorResult
    {
        public readonly string? Horizontal;
        public readonly string? HorizontalVar;
        public readonly string? Vertical;
        public readonly string? VerticalVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyPostBreakpointTransformationMirrorResult(
            string? horizontal,

            string? horizontalVar,

            string? vertical,

            string? verticalVar)
        {
            Horizontal = horizontal;
            HorizontalVar = horizontalVar;
            Vertical = vertical;
            VerticalVar = verticalVar;
        }
    }
}