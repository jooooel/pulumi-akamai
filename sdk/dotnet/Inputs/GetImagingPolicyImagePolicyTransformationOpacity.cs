// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationOpacityArgs : global::Pulumi.InvokeArgs
    {
        [Input("opacity")]
        public string? Opacity { get; set; }

        [Input("opacityVar")]
        public string? OpacityVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationOpacityArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationOpacityArgs Empty => new GetImagingPolicyImagePolicyTransformationOpacityArgs();
    }
}