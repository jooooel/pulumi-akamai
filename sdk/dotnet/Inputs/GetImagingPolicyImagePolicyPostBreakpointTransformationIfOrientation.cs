// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs : global::Pulumi.InvokeArgs
    {
        [Input("default")]
        public Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs? Default { get; set; }

        [Input("landscape")]
        public Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs? Landscape { get; set; }

        [Input("portrait")]
        public Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs? Portrait { get; set; }

        [Input("square")]
        public Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs? Square { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs();
    }
}