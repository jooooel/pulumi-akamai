// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationGrayscaleArgs : global::Pulumi.InvokeArgs
    {
        [Input("type")]
        public string? Type { get; set; }

        [Input("typeVar")]
        public string? TypeVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationGrayscaleArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationGrayscaleArgs Empty => new GetImagingPolicyImagePolicyTransformationGrayscaleArgs();
    }
}
