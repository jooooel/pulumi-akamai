// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationMaxColorInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("colors")]
        public Input<string>? Colors { get; set; }

        [Input("colorsVar")]
        public Input<string>? ColorsVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationMaxColorInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationMaxColorInputArgs Empty => new GetImagingPolicyImagePolicyTransformationMaxColorInputArgs();
    }
}