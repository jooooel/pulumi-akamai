// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationHsvInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("hue")]
        public Input<string>? Hue { get; set; }

        [Input("hueVar")]
        public Input<string>? HueVar { get; set; }

        [Input("saturation")]
        public Input<string>? Saturation { get; set; }

        [Input("saturationVar")]
        public Input<string>? SaturationVar { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        [Input("valueVar")]
        public Input<string>? ValueVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationHsvInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationHsvInputArgs Empty => new GetImagingPolicyImagePolicyTransformationHsvInputArgs();
    }
}