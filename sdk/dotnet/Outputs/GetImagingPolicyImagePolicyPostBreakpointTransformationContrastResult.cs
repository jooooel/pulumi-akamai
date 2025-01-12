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
    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationContrastResult
    {
        public readonly string? Brightness;
        public readonly string? BrightnessVar;
        public readonly string? Contrast;
        public readonly string? ContrastVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyPostBreakpointTransformationContrastResult(
            string? brightness,

            string? brightnessVar,

            string? contrast,

            string? contrastVar)
        {
            Brightness = brightness;
            BrightnessVar = brightnessVar;
            Contrast = contrast;
            ContrastVar = contrastVar;
        }
    }
}
