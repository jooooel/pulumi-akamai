// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs : global::Pulumi.InvokeArgs
    {
        [Input("sigma")]
        public string? Sigma { get; set; }

        [Input("sigmaVar")]
        public string? SigmaVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs();
    }
}