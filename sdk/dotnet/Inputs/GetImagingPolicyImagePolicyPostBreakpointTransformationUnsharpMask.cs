// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("gain")]
        public string? Gain { get; set; }

        [Input("gainVar")]
        public string? GainVar { get; set; }

        [Input("sigma")]
        public string? Sigma { get; set; }

        [Input("sigmaVar")]
        public string? SigmaVar { get; set; }

        [Input("threshold")]
        public string? Threshold { get; set; }

        [Input("thresholdVar")]
        public string? ThresholdVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs();
    }
}
